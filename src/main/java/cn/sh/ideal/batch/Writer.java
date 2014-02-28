package cn.sh.ideal.batch;

import cn.sh.ideal.mapper.SmeMapper;
import cn.sh.ideal.model.SmeData;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("writer")
public class Writer implements ItemWriter<SmeData> {

    private static Log log = LogFactory.getLog(Writer.class);

    @Autowired
    private SmeMapper smeDao;

    @Override
    public void write(List<? extends SmeData> smeDatas) throws Exception {
        //SmeData smeData  = smeDatas.get(0);
        log.info("Wirting doc: " + smeDatas);
        //smeDao.saveOMS_form_property(smeData);
    }
}
