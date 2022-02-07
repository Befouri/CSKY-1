package shu.java.csky.entity;

import javax.persistence.*;

public class Cs {
    /**
     * csid
     */
    @Id
    private Integer csid;

    /**
     * 学院代码
     */
    private String collegecode;

    /**
     * 学院名称
     */
    private String collegename;

    /**
     * 专业代码
     */
    private String professioncode;

    /**
     * 专业名称
     */
    private String professionname;

    /**
     * 学习方式
     */
    private String studyway;

    /**
     * 学位类型
     */
    private String degreetype;

    /**
     * 学校id
     */
    private Integer schoolid;

    /**
     * 官网文件链接
     */
    @Column(name = "articleURL")
    private String articleurl;

    /**
     * 政治分数
     */
    private String politic;

    /**
     * 英语分数
     */
    private String english;

    /**
     * 专业课1分数
     */
    @Column(name = "professional_subject1")
    private String professionalSubject1;

    /**
     * 专业课2分数
     */
    @Column(name = "professional_subject2")
    private String professionalSubject2;

    /**
     * 总分
     */
    private String total;

    /**
     * 获取csid
     *
     * @return csid - csid
     */
    public Integer getCsid() {
        return csid;
    }

    /**
     * 设置csid
     *
     * @param csid csid
     */
    public void setCsid(Integer csid) {
        this.csid = csid;
    }

    /**
     * 获取学院代码
     *
     * @return collegecode - 学院代码
     */
    public String getCollegecode() {
        return collegecode;
    }

    /**
     * 设置学院代码
     *
     * @param collegecode 学院代码
     */
    public void setCollegecode(String collegecode) {
        this.collegecode = collegecode;
    }

    /**
     * 获取学院名称
     *
     * @return collegename - 学院名称
     */
    public String getCollegename() {
        return collegename;
    }

    /**
     * 设置学院名称
     *
     * @param collegename 学院名称
     */
    public void setCollegename(String collegename) {
        this.collegename = collegename;
    }

    /**
     * 获取专业代码
     *
     * @return professioncode - 专业代码
     */
    public String getProfessioncode() {
        return professioncode;
    }

    /**
     * 设置专业代码
     *
     * @param professioncode 专业代码
     */
    public void setProfessioncode(String professioncode) {
        this.professioncode = professioncode;
    }

    /**
     * 获取专业名称
     *
     * @return professionname - 专业名称
     */
    public String getProfessionname() {
        return professionname;
    }

    /**
     * 设置专业名称
     *
     * @param professionname 专业名称
     */
    public void setProfessionname(String professionname) {
        this.professionname = professionname;
    }

    /**
     * 获取学习方式
     *
     * @return studyway - 学习方式
     */
    public String getStudyway() {
        return studyway;
    }

    /**
     * 设置学习方式
     *
     * @param studyway 学习方式
     */
    public void setStudyway(String studyway) {
        this.studyway = studyway;
    }

    /**
     * 获取学位类型
     *
     * @return degreetype - 学位类型
     */
    public String getDegreetype() {
        return degreetype;
    }

    /**
     * 设置学位类型
     *
     * @param degreetype 学位类型
     */
    public void setDegreetype(String degreetype) {
        this.degreetype = degreetype;
    }

    /**
     * 获取学校id
     *
     * @return schoolid - 学校id
     */
    public Integer getSchoolid() {
        return schoolid;
    }

    /**
     * 设置学校id
     *
     * @param schoolid 学校id
     */
    public void setSchoolid(Integer schoolid) {
        this.schoolid = schoolid;
    }

    /**
     * 获取官网文件链接
     *
     * @return articleURL - 官网文件链接
     */
    public String getArticleurl() {
        return articleurl;
    }

    /**
     * 设置官网文件链接
     *
     * @param articleurl 官网文件链接
     */
    public void setArticleurl(String articleurl) {
        this.articleurl = articleurl;
    }

    /**
     * 获取政治分数
     *
     * @return politic - 政治分数
     */
    public String getPolitic() {
        return politic;
    }

    /**
     * 设置政治分数
     *
     * @param politic 政治分数
     */
    public void setPolitic(String politic) {
        this.politic = politic;
    }

    /**
     * 获取英语分数
     *
     * @return english - 英语分数
     */
    public String getEnglish() {
        return english;
    }

    /**
     * 设置英语分数
     *
     * @param english 英语分数
     */
    public void setEnglish(String english) {
        this.english = english;
    }

    /**
     * 获取专业课1分数
     *
     * @return professional_subject1 - 专业课1分数
     */
    public String getProfessionalSubject1() {
        return professionalSubject1;
    }

    /**
     * 设置专业课1分数
     *
     * @param professionalSubject1 专业课1分数
     */
    public void setProfessionalSubject1(String professionalSubject1) {
        this.professionalSubject1 = professionalSubject1;
    }

    /**
     * 获取专业课2分数
     *
     * @return professional_subject2 - 专业课2分数
     */
    public String getProfessionalSubject2() {
        return professionalSubject2;
    }

    /**
     * 设置专业课2分数
     *
     * @param professionalSubject2 专业课2分数
     */
    public void setProfessionalSubject2(String professionalSubject2) {
        this.professionalSubject2 = professionalSubject2;
    }

    /**
     * 获取总分
     *
     * @return total - 总分
     */
    public String getTotal() {
        return total;
    }

    /**
     * 设置总分
     *
     * @param total 总分
     */
    public void setTotal(String total) {
        this.total = total;
    }
}