package cn.sh.ideal.mapper;

import cn.sh.ideal.model.YxjcData;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("yxjcDao")
public interface YxjcMapper {

    @Select("select * from t_Data_copy")
    List<YxjcData> getData();
}
