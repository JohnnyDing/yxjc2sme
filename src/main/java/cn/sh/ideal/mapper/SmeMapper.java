package cn.sh.ideal.mapper;

import cn.sh.ideal.model.OmsForm;
import cn.sh.ideal.model.SmeData;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.mapping.StatementType;
import org.springframework.stereotype.Repository;

@Repository("smeDao")
public interface SmeMapper {

    @Select("select newid()")
    String getNewId();

    @Insert("insert into oms_form_property(id,form_id,property_id,current_month,current_year,pre_month,pre_year,value) "+
            "values (#{id},#{form_id},#{property_id},#{current_month},#{current_year},#{pre_month},#{pre_year},#{value})")
    Long saveOMS_form_property(SmeData data);

    @Insert("insert into oms_form(id, org_id, period) values (#{id}, #{org_id}, #{period})")
    Long saveOMS_form(OmsForm omsForm);

    @Select("select GUID from PLATFORM_ENTERPRISE_INFO where ORG_CODE = #{org_code}")
    String getOrgId(String org_code);
}
