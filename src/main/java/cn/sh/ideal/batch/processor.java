package cn.sh.ideal.batch;

import cn.sh.ideal.mapper.SmeMapper;
import cn.sh.ideal.model.OmsForm;
import cn.sh.ideal.model.SmeData;
import cn.sh.ideal.model.YxjcData;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("processor")
public class Processor implements ItemProcessor<YxjcData, List<SmeData>> {

    private static Log log = LogFactory.getLog(Processor.class);

    @Autowired
    private SmeMapper smeDao;

    private List<SmeData> smeDataList = new ArrayList<SmeData>();
    private SmeData smeData = new SmeData();
    private OmsForm omsForm = new OmsForm();
    private Long formId;

    @Override
    public List<SmeData> process(YxjcData yxjcData) throws Exception {
        //借用 Creator1 传递组织机构 ID
        //smeData.setCreator1(yxjcData.getUserid());
        //借用 Updator1 传递报表期
        //smeData.setUpdator1(yxjcData.getBbq());

        log.info("源数据：" + yxjcData);
        omsForm.setOrg_id(smeDao.getOrgId(yxjcData.getUserid()));
        omsForm.setPeriod(yxjcData.getBbq());
        formId = smeDao.saveOMS_form(omsForm);
        smeData.setForm_id(formId.toString());

        //销售收入
        smeData.setCurrent_month(yxjcData.getA11());
        smeData.setCurrent_year(yxjcData.getA12());
        smeData.setPre_month(yxjcData.getA13());
        smeData.setPre_year(yxjcData.getA14());
        smeData.setProperty_id("89DFD8B9-285F-4542-B792-C1FCA715E94D");
        smeDataList.add(smeData);

        //利润总额
        smeData.setCurrent_month(yxjcData.getB11());
        smeData.setCurrent_year(yxjcData.getB12());
        smeData.setPre_month(yxjcData.getB13());
        smeData.setPre_year(yxjcData.getB14());
        smeData.setProperty_id("9BB54F2F-9251-40AF-904B-73941FC67FA4");
        smeDataList.add(smeData);

        //从业人员数量
        smeData.setCurrent_month(yxjcData.getC11());
        smeData.setCurrent_year(yxjcData.getC12());
        smeData.setPre_month(yxjcData.getC13());
        smeData.setPre_year(yxjcData.getC14());
        smeData.setProperty_id("9B1A98C9-0D5F-4939-87E6-62257A4BB3A4");
        smeDataList.add(smeData);

        //出口交货值
        smeData.setCurrent_month(yxjcData.getD11());
        smeData.setCurrent_year(yxjcData.getD12());
        smeData.setPre_month(yxjcData.getD13());
        smeData.setPre_year(yxjcData.getD14());
        smeData.setProperty_id("098A309B-A8D1-4B4C-A866-3C06658CAB55");
        smeDataList.add(smeData);

        //流动资产
        smeData.setCurrent_month(yxjcData.getE11());
        smeData.setCurrent_year(yxjcData.getE12());
        smeData.setPre_month(yxjcData.getE13());
        smeData.setPre_year(yxjcData.getE14());
        smeData.setProperty_id("F58810A3-9DCF-4488-9F55-B10CA368E663");
        smeDataList.add(smeData);

        //应收帐款
        smeData.setCurrent_month(yxjcData.getF11());
        smeData.setCurrent_year(yxjcData.getF12());
        smeData.setPre_month(yxjcData.getF13());
        smeData.setPre_year(yxjcData.getF14());
        smeData.setProperty_id("8CD92620-C8B5-48B5-89A2-5F17EABE06B5");
        smeDataList.add(smeData);

        //产成品
        smeData.setCurrent_month(yxjcData.getG11());
        smeData.setCurrent_year(yxjcData.getG12());
        smeData.setPre_month(yxjcData.getG13());
        smeData.setPre_year(yxjcData.getG14());
        smeData.setProperty_id("16810CC6-92A6-4B28-93E0-2BB5AEC11E0A");
        smeDataList.add(smeData);

        //资产总计
        smeData.setCurrent_month(yxjcData.getH11());
        smeData.setCurrent_year(yxjcData.getH12());
        smeData.setPre_month(yxjcData.getH13());
        smeData.setPre_year(yxjcData.getH14());
        smeData.setProperty_id("D5DC41D1-1AE3-48A6-A722-41C86ADDA626");
        smeDataList.add(smeData);

        //负债总计
        smeData.setCurrent_month(yxjcData.getI11());
        smeData.setCurrent_year(yxjcData.getI12());
        smeData.setPre_month(yxjcData.getI13());
        smeData.setPre_year(yxjcData.getI14());
        smeData.setProperty_id("5CB456CF-E390-4ADA-BF33-25D952D1C9CB");
        smeDataList.add(smeData);

        //新增订单
        smeData.setCurrent_month(yxjcData.getJ11());
        smeData.setCurrent_year(yxjcData.getJ12());
        smeData.setPre_month(yxjcData.getJ13());
        smeData.setPre_year(yxjcData.getJ14());
        smeData.setProperty_id("C23312D9-9AB0-442B-B713-E0F2F30E9507");
        smeDataList.add(smeData);

        //应交税金
        smeData.setCurrent_month(yxjcData.getK11());
        smeData.setCurrent_year(yxjcData.getK12());
        smeData.setPre_month(yxjcData.getK13());
        smeData.setPre_year(yxjcData.getK14());
        smeData.setProperty_id("6B6E0619-1DFC-403E-A9A5-E240F4A16D23");
        smeDataList.add(smeData);

        //所有者权益
        smeData.setCurrent_month(yxjcData.getL11());
        smeData.setCurrent_year(yxjcData.getL12());
        smeData.setPre_month(yxjcData.getL13());
        smeData.setPre_year(yxjcData.getL14());
        smeData.setProperty_id("DEB57FEA-EB26-46ED-A706-F901E6D613F0");
        smeDataList.add(smeData);

        //企业税收
        smeData.setCurrent_month(yxjcData.getM11());
        smeData.setCurrent_year(yxjcData.getM12());
        smeData.setPre_month(yxjcData.getM13());
        smeData.setPre_year(yxjcData.getM14());
        smeData.setProperty_id("B2DC445B-256D-4B60-968F-BD7349F8326C");
        smeDataList.add(smeData);

        //开工率
        smeData.setCurrent_month(yxjcData.getN11());
        smeData.setCurrent_year(yxjcData.getN12());
        smeData.setPre_month(yxjcData.getN13());
        smeData.setPre_year(yxjcData.getN14());
        smeData.setProperty_id("2A42A084-AC94-4245-9E67-9BB756B0A5FA");
        smeDataList.add(smeData);

        //资金缺口额
        smeData.setCurrent_month(yxjcData.getO11());
        smeData.setCurrent_year(yxjcData.getO12());
        smeData.setPre_month(yxjcData.getO13());
        smeData.setPre_year(yxjcData.getO14());
        smeData.setProperty_id("C7891C86-1FDD-4DD2-BC44-A4AD86FAC2E7");
        smeDataList.add(smeData);

        //主要产品价格波动定量
        smeData.setCurrent_month(yxjcData.getP11());
        smeData.setCurrent_year(yxjcData.getP12());
        smeData.setPre_month(yxjcData.getP13());
        smeData.setPre_year(yxjcData.getP14());
        smeData.setProperty_id("5C275A96-5D5A-4C25-81A5-70294F1921FF");
        smeDataList.add(smeData);

        //主要原材料价格波动
        smeData.setCurrent_month(yxjcData.getQ11());
        smeData.setCurrent_year(yxjcData.getQ12());
        smeData.setPre_month(yxjcData.getQ13());
        smeData.setPre_year(yxjcData.getQ14());
        smeData.setProperty_id("CC2666C9-914B-4A62-BB6C-1098A82FFD1B");
        smeDataList.add(smeData);

        //主要产品价格波动定性
        if(yxjcData.getR() != null && yxjcData.getR().intValue() == 0)
            smeData.setValue("cp");
        else if(yxjcData.getR() != null && yxjcData.getR().intValue() == 1)
            smeData.setValue("ss");
        else if(yxjcData.getR() != null && yxjcData.getR().intValue() == -1)
            smeData.setValue("xj");
        smeData.setProperty_id("09446194-D860-46AB-A981-B1FD347FB2D8");
        smeDataList.add(smeData);

        //主要成本价格波动定性
        if(yxjcData.getS() != null && yxjcData.getS().intValue() == 0)
            smeData.setValue("cp");
        else if(yxjcData.getS() != null && yxjcData.getS().intValue() == 1)
            smeData.setValue("ss");
        else if(yxjcData.getS() != null && yxjcData.getS().intValue() == -1)
            smeData.setValue("xj");
        smeData.setProperty_id("5C8C7EDC-4A25-46DD-9F67-6EFA6B596515");
        smeDataList.add(smeData);

        //新增订单金额
        if(yxjcData.getT() != null && yxjcData.getT().intValue() == 0)
            smeData.setValue("cp");
        else if(yxjcData.getT() != null && yxjcData.getT().intValue() == 1)
            smeData.setValue("ss");
        else if(yxjcData.getT() != null && yxjcData.getT().intValue() == -1)
            smeData.setValue("xj");
        smeData.setProperty_id("7684E617-A422-4580-A9AA-722C87C52F80");
        smeDataList.add(smeData);

        //对下个月公司经营状况的预判
        if(yxjcData.getU() != null && yxjcData.getU().intValue() == 0)
            smeData.setValue("cp");
        else if(yxjcData.getU() != null && yxjcData.getU().intValue() == 1)
            smeData.setValue("ss");
        else if(yxjcData.getU() != null && yxjcData.getU().intValue() == -1)
            smeData.setValue("xj");
        smeData.setProperty_id("B7213138-5F5C-466E-A78A-CA9EBD962459");
        smeDataList.add(smeData);

        return smeDataList;
    }
}
