package shu.java.csky.entity;

import javax.persistence.*;

public class Articles {
    /**
     * id
     */
    @Id
    private Integer id;

    /**
     * 与主表链接的aid
     */
    private Integer aid;

    /**
     * 帖子标题
     */
    private String title;

    /**
     * 内容
     */
    private String content;

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
     * 获取与主表链接的aid
     *
     * @return aid - 与主表链接的aid
     */
    public Integer getAid() {
        return aid;
    }

    /**
     * 设置与主表链接的aid
     *
     * @param aid 与主表链接的aid
     */
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    /**
     * 获取帖子标题
     *
     * @return title - 帖子标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置帖子标题
     *
     * @param title 帖子标题
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }
}