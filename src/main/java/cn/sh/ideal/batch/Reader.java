package cn.sh.ideal.batch;

import cn.sh.ideal.model.YxjcData;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("reader")
public class Reader implements ItemReader<YxjcData> {

    private static Log log = LogFactory.getLog(Reader.class);

    private YxjcData yxjcData;

    @Autowired
    private ItemReader<YxjcData> itemReader;

    @Override
    public YxjcData read() throws Exception {
        //long start=System.currentTimeMillis();
        yxjcData = itemReader.read();
        //long end=System.currentTimeMillis();
        //log.info("------------------------------------------------------------------");
        //log.info("yxjcData: " + yxjcData);
        //log.info("查询时间："+(end-start));

        return yxjcData;
    }
}
