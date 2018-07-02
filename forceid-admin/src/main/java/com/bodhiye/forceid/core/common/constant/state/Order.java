package com.bodhiye.forceid.core.common.constant.state;

/**
 * 数据库排序
 *
 * @author bodhiye
 * @Date 2018年5月31日20:48:41
 */
public enum Order {

    ASC("asc"), DESC("desc");

    private String des;

    Order(String des) {
        this.des = des;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
