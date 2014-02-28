yxjc2sme
========

安装 SQLServer 驱动包到 Maven 仓库

	mvn deploy:deploy-file \
	-DgroupId=com.microsoft \
	-DartifactId=sqlserver \
	-Dversion=2008 \
	-Dpackaging=jar \
	-Dfile=sqljdbc4.jar \
	-Durl=http://10.4.247.93:9090/nexus/content/repositories/thirdparty \
	-DrepositoryId=thirdparty

在 sme 数据库中执行 resources 下的 t_Data.sql，使用以下 sql 验证数据（47044条纪录）。
> 把 yxjc 中的数据临时导入到 sme 中。

	select count(*) from t_Data_copy
	
	