package shu.java.csky.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author: Silence
 * @date: 2022/2/17 23:27
 * @description: 返回给前端的评论对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class CommentReturn {
    /**
     * 每一楼的父评论
     */
    private CommentAtom commentParent;

    /**
     * 每一楼的子评论
     */
    private List<CommentAtom> commentChildrenList;

}
