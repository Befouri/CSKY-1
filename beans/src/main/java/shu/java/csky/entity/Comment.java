package shu.java.csky.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 文章评论表
 *
 * @TableName comment
 */
@TableName(value = "comment")
@Data
public class Comment implements Serializable {
    /**
     * 评论id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 评论人userId
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 评论人名称
     */
    @TableField(value = "user_name")
    private String userName;

    /**
     * 评论的文章id
     */
    @TableField(value = "article_id")
    private String articleId;

    /**
     * 评论的文章标题
     */
    @TableField(value = "article_title")
    private String articleTitle;

    /**
     * 父评论id
     */
    @TableField(value = "parent_comment_id")
    private String parentCommentId;

    /**
     * 父评论的用户id
     */
    @TableField(value = "parent_comment_user_id")
    private String parentCommentUserId;

    /**
     * 被回复的评论id
     */
    @TableField(value = "reply_comment_id")
    private String replyCommentId;

    /**
     * 被回复的评论用户id
     */
    @TableField(value = "reply_comment_user_id")
    private String replyCommentUserId;

    /**
     * 评论等级[ 1 一级评论 默认 ，2 二级评论]
     */
    @TableField(value = "comment_level")
    private Integer commentLevel;

    /**
     * 评论的内容
     */
    @TableField(value = "content")
    private String content;

    /**
     * 状态 (1 有效，0 逻辑删除)
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 点赞数
     */
    @TableField(value = "praise_num")
    private Integer praiseNum;

    /**
     * 置顶状态[ 1 置顶，0 不置顶 默认 ]
     */
    @TableField(value = "top_status")
    private Integer topStatus;

    /**
     * 创建时间
     */
    @TableField(value = "create_time")
    private Date createTime;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Comment other = (Comment) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
                && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
                && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
                && (this.getArticleId() == null ? other.getArticleId() == null : this.getArticleId().equals(other.getArticleId()))
                && (this.getArticleTitle() == null ? other.getArticleTitle() == null : this.getArticleTitle().equals(other.getArticleTitle()))
                && (this.getParentCommentId() == null ? other.getParentCommentId() == null : this.getParentCommentId().equals(other.getParentCommentId()))
                && (this.getParentCommentUserId() == null ? other.getParentCommentUserId() == null : this.getParentCommentUserId().equals(other.getParentCommentUserId()))
                && (this.getReplyCommentId() == null ? other.getReplyCommentId() == null : this.getReplyCommentId().equals(other.getReplyCommentId()))
                && (this.getReplyCommentUserId() == null ? other.getReplyCommentUserId() == null : this.getReplyCommentUserId().equals(other.getReplyCommentUserId()))
                && (this.getCommentLevel() == null ? other.getCommentLevel() == null : this.getCommentLevel().equals(other.getCommentLevel()))
                && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
                && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
                && (this.getPraiseNum() == null ? other.getPraiseNum() == null : this.getPraiseNum().equals(other.getPraiseNum()))
                && (this.getTopStatus() == null ? other.getTopStatus() == null : this.getTopStatus().equals(other.getTopStatus()))
                && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getArticleId() == null) ? 0 : getArticleId().hashCode());
        result = prime * result + ((getArticleTitle() == null) ? 0 : getArticleTitle().hashCode());
        result = prime * result + ((getParentCommentId() == null) ? 0 : getParentCommentId().hashCode());
        result = prime * result + ((getParentCommentUserId() == null) ? 0 : getParentCommentUserId().hashCode());
        result = prime * result + ((getReplyCommentId() == null) ? 0 : getReplyCommentId().hashCode());
        result = prime * result + ((getReplyCommentUserId() == null) ? 0 : getReplyCommentUserId().hashCode());
        result = prime * result + ((getCommentLevel() == null) ? 0 : getCommentLevel().hashCode());
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getPraiseNum() == null) ? 0 : getPraiseNum().hashCode());
        result = prime * result + ((getTopStatus() == null) ? 0 : getTopStatus().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", articleId=").append(articleId);
        sb.append(", articleTitle=").append(articleTitle);
        sb.append(", parentCommentId=").append(parentCommentId);
        sb.append(", parentCommentUserId=").append(parentCommentUserId);
        sb.append(", replyCommentId=").append(replyCommentId);
        sb.append(", replyCommentUserId=").append(replyCommentUserId);
        sb.append(", commentLevel=").append(commentLevel);
        sb.append(", content=").append(content);
        sb.append(", status=").append(status);
        sb.append(", praiseNum=").append(praiseNum);
        sb.append(", topStatus=").append(topStatus);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}