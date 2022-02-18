package shu.java.csky.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;
import shu.java.csky.entity.User;

import java.util.Date;

/**
 * @author: Silence
 * @date: 2022/2/17 23:06
 * @description: 返回给前端的评论对象
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Component
public class CommentAtom {
    /**
     * 评论者
     */
    private User commentor;
    /**
     * 被评论者
     */
    private User beCommentor;
    /**
     * 点赞数
     */
    private Integer praiseNum;
    /**
     * 创建时间
     */
    private Date createTime;
    /**
     * 评论内容
     */
    private String content;
}
