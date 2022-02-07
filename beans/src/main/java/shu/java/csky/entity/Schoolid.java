package shu.java.csky.entity;

import javax.persistence.Column;

public class Schoolid {
    /**
     * 网页中学校对应的id
     */
    @Column(name = "idOfURL")
    private String idofurl;

    /**
     * 学校名称
     */
    private String name;

    /**
     * 获取网页中学校对应的id
     *
     * @return idOfURL - 网页中学校对应的id
     */
    public String getIdofurl() {
        return idofurl;
    }

    /**
     * 设置网页中学校对应的id
     *
     * @param idofurl 网页中学校对应的id
     */
    public void setIdofurl(String idofurl) {
        this.idofurl = idofurl;
    }

    /**
     * 获取学校名称
     *
     * @return name - 学校名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置学校名称
     *
     * @param name 学校名称
     */
    public void setName(String name) {
        this.name = name;
    }
}