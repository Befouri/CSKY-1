package shu.java.csky.entity;

import javax.persistence.*;

public class Teachers {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 链接导师id
     */
    private Integer tid;

    /**
     * 导师姓名
     */
    private String tname;

    /**
     * 导师主页
     */
    @Column(name = "tURL")
    private String turl;

    private String tphonenumber;

    private String tfax;

    private String temail;

    private String studydir;

    /**
     * 教育简历
     */
    private String eduresume;

    /**
     * 专业履历
     */
    private String proresume;

    /**
     * 获取id
     *
     * @return id - id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置id
     *
     * @param id id
     */
    public void setId(Integer id) {
        this.id = id;
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
     * 获取导师姓名
     *
     * @return tname - 导师姓名
     */
    public String getTname() {
        return tname;
    }

    /**
     * 设置导师姓名
     *
     * @param tname 导师姓名
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * 获取导师主页
     *
     * @return tURL - 导师主页
     */
    public String getTurl() {
        return turl;
    }

    /**
     * 设置导师主页
     *
     * @param turl 导师主页
     */
    public void setTurl(String turl) {
        this.turl = turl;
    }

    /**
     * @return tphonenumber
     */
    public String getTphonenumber() {
        return tphonenumber;
    }

    /**
     * @param tphonenumber
     */
    public void setTphonenumber(String tphonenumber) {
        this.tphonenumber = tphonenumber;
    }

    /**
     * @return tfax
     */
    public String getTfax() {
        return tfax;
    }

    /**
     * @param tfax
     */
    public void setTfax(String tfax) {
        this.tfax = tfax;
    }

    /**
     * @return temail
     */
    public String getTemail() {
        return temail;
    }

    /**
     * @param temail
     */
    public void setTemail(String temail) {
        this.temail = temail;
    }

    /**
     * @return studydir
     */
    public String getStudydir() {
        return studydir;
    }

    /**
     * @param studydir
     */
    public void setStudydir(String studydir) {
        this.studydir = studydir;
    }

    /**
     * 获取教育简历
     *
     * @return eduresume - 教育简历
     */
    public String getEduresume() {
        return eduresume;
    }

    /**
     * 设置教育简历
     *
     * @param eduresume 教育简历
     */
    public void setEduresume(String eduresume) {
        this.eduresume = eduresume;
    }

    /**
     * 获取专业履历
     *
     * @return proresume - 专业履历
     */
    public String getProresume() {
        return proresume;
    }

    /**
     * 设置专业履历
     *
     * @param proresume 专业履历
     */
    public void setProresume(String proresume) {
        this.proresume = proresume;
    }
}