package cn.sh.ideal.model;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.math.BigDecimal;
import java.util.Date;

public class SmeData {

    private String id;
    private String form_id;
    private String property_id;
    private Date cerate_date;
    private Date update_date;
    private String creator1;
    private String updator1;
    private BigDecimal current_month;
    private BigDecimal current_year;
    private BigDecimal pre_month;
    private BigDecimal pre_year;
    private String value;
    private String is_full_input;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getForm_id() {
        return form_id;
    }

    public void setForm_id(String form_id) {
        this.form_id = form_id;
    }

    public String getProperty_id() {
        return property_id;
    }

    public void setProperty_id(String property_id) {
        this.property_id = property_id;
    }

    public Date getCerate_date() {
        return cerate_date;
    }

    public void setCerate_date(Date cerate_date) {
        this.cerate_date = cerate_date;
    }

    public Date getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(Date update_date) {
        this.update_date = update_date;
    }

    public String getCreator1() {
        return creator1;
    }

    public void setCreator1(String creator1) {
        this.creator1 = creator1;
    }

    public String getUpdator1() {
        return updator1;
    }

    public void setUpdator1(String updator1) {
        this.updator1 = updator1;
    }

    public BigDecimal getCurrent_month() {
        return current_month;
    }

    public void setCurrent_month(BigDecimal current_month) {
        this.current_month = current_month;
    }

    public BigDecimal getCurrent_year() {
        return current_year;
    }

    public void setCurrent_year(BigDecimal current_year) {
        this.current_year = current_year;
    }

    public BigDecimal getPre_month() {
        return pre_month;
    }

    public void setPre_month(BigDecimal pre_month) {
        this.pre_month = pre_month;
    }

    public BigDecimal getPre_year() {
        return pre_year;
    }

    public void setPre_year(BigDecimal pre_year) {
        this.pre_year = pre_year;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getIs_full_input() {
        return is_full_input;
    }

    public void setIs_full_input(String is_full_input) {
        this.is_full_input = is_full_input;
    }

    public boolean equals(Object obj) {
        return EqualsBuilder.reflectionEquals(
                this, obj);
    }

    public int hashCode() {
        return HashCodeBuilder
                .reflectionHashCode(this);
    }

    public String toString() {
        return ToStringBuilder.reflectionToString(
                this, ToStringStyle.MULTI_LINE_STYLE);
    }
}
