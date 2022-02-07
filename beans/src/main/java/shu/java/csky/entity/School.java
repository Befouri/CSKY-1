package shu.java.csky.entity;

import javax.persistence.*;

public class School {
    /**
     * id
     */
    @Id
    private Integer sid;

    /**
     * 学校名
     */
    private String sname;

    /**
     * 链接专业表的id
     */
    private Integer csid;

    /**
     * 链接导师id
     */
    private Integer tid;

    /**
     * 链接帖子id
     */
    private Integer aid;

    /**
     * 招生简章
     */
    private String recruitment;

    /**
     * 获取id
     *
     * @return sid - id
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * 设置id
     *
     * @param sid id
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * 获取学校名
     *
     * @return sname - 学校名
     */
    public String getSname() {
        return sname;
    }

    /**
     * 设置学校名
     *
     * @param sname 学校名
     */
    public void setSname(String sname) {
        this.sname = sname;
    }

    /**
     * 获取链接专业表的id
     *
     * @return csid - 链接专业表的id
     */
    public Integer getCsid() {
        return csid;
    }

    /**
     * 设置链接专业表的id
     *
     * @param csid 链接专业表的id
     */
    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    /**
     * 获取链接导师id
     *
     * @return tid - 链接导师id
     */
    public Integer getTid() {
        return tid;
    }

    /**
     * 设置链接导师id
     *
     * @param tid 链接导师id
     */
    public void setTid(Integer tid) {
        this.tid = tid;
    }

    /**
     * 获取链接帖子id
     *
     * @return aid - 链接帖子id
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置链接帖子id
     *
     * @param aid 链接帖子id
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取招生简章
     *
     * @return recruitment - 招生简章
     */
    public String getRecruitment() {
        return recruitment;
    }

    /**
     * 设置招生简章
     *
     * @param recruitment 招生简章
     */
    public void setRecruitment(String recruitment) {
        this.recruitment = recruitment;
    }
}