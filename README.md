yxjc2sme
========
##导出企业基本信息
1、执行以下数据库脚本，之后可以使用已有工具导出 excel 表格。
> 完成之后可以使用已有程序导入 sme 数据库相关表。

	SELECT
	a.userid as '组织机构代码',
	a.companyname as '机构名称',
	--a.qxid,
	c.qxname+'区' as '所在行政区划',
	--a.hyid,
	d.hyname as '所属行业',
	--a.zczb as '注册资本',
	a.zcaddress as '注册地址',
	a.zcpostcode as '邮政编码',
	a.lxaddress as '联系地址',
	--a.companytype,
	e.typename as '企业注册类型',
	a.fzrname as '法定代表人',
	a.tbrname as '联系人',
	a.tbrmobile+', '+a.tbrtel as '联系方式',
	a.tbrfax as '传真',
	tbremail as '邮箱'
	FROM t_UserDetail a
	left join (select id,qxname from t_Qx) c on c.id = a.qxid
	left join (select id,hyname from t_Hy) d on d.id = a.hyid
	left join (select id,typename from t_CompanyType) e on e.id = a.companytype
	WHERE a.userid in (select userid from t_User)
	and a.hyid is not null


##迁移填报数据
在执行以下步骤之前，请先确保 t_UserDetail 的数据已经通过 excel 文件导入到 platform_enterprise_info 表，因为这里会根据这张表的 org_code 找到企业的 GUID，对 oms_form 的 org_id 字段进行写入。

1、安装 SQLServer 驱动包到 Maven 仓库

	mvn deploy:deploy-file \
	-DgroupId=com.microsoft \
	-DartifactId=sqlserver \
	-Dversion=2008 \
	-Dpackaging=jar \
	-Dfile=sqljdbc4.jar \
	-Durl=http://10.4.247.93:9090/nexus/content/repositories/thirdparty \
	-DrepositoryId=thirdparty

2、在 sme 数据库中执行 test/resources 下的 t_Data.sql，使用以下 sql 验证数据（47044条纪录）。
> 把 yxjc 中的数据临时导入到 sme 中。

	select count(*) from t_Data_copy
	
3、执行 test/resources 下的 schema-drop-sqlserver.sql 和 schema-sqlserver.sql
> 生成 Spring-Batch 数据库脚本

4、数据库连接池相关的配置在 global.properties
> 根据实际环境修改参数

5、执行 mvn package

6、运行 SmeImporterTest 单元测试，执行数据迁移过程。





	
	