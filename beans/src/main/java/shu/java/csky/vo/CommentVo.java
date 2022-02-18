package shu.java.csky.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * @author: Silence
 * @date: 2022/2/17 14:11
 * @description: 子查询时Comment映射对象
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Component
public class CommentVo {
    private Integer id;

    private String userId;

    private String userName;

    private String articleId;

    private String articleTitle;

    private String parentCommentId;

    private String parentCommentUserId;

    private String replyCommentId;

    private String replyCommentUserId;

    private Integer commentLevel;

    private String content;

    private Integer status;

    private Integer praiseNum;

    private Integer topStatus;

    private Date createTime;

    private List<CommentVo> commentVos;
}
