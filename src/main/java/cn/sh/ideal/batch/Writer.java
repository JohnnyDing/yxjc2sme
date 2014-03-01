package cn.sh.ideal.batch;

import cn.sh.ideal.mapper.SmeMapper;
import cn.sh.ideal.model.SmeData;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Component("writer")
public class Writer implements ItemWriter<List<SmeData>> {

    private static Log log = LogFactory.getLog(Writer.class);

    @Autowired
    private SmeMapper smeDao;

    private ArrayList SmeDatas;

    @Override
    public void write(List<? extends List<SmeData>> items) throws Exception {
        //log.info("Reading data list: " + ((List)items.get(0)).size());
        for(SmeData smeData : items.get(0)){
            smeData.setId(smeDao.getNewId());
            log.info("Wirting data: " + smeData);
            smeDao.saveOMS_form_property(smeData);
        }
        //Iterator<SmeData> ite = (Iterator<SmeData>) smeDatas.iterator();
        /*while(ite.hasNext()){
            log.info("Wirting doc: " + ite.next());
            //smeData = ite.next();
            //smeData.setId(smeDao.getNewId());
            ///smeDao.saveOMS_form_property(smeData);
        }*/
    }
}
