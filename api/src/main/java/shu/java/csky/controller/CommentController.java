package shu.java.csky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shu.java.csky.CommentService;
import shu.java.csky.vo.ResultVO;

/**
 * @author: Silence
 * @date: 2022/2/18 10:25
 * @description:
 */

@RestController
@RequestMapping("/comment")
public class CommentController {
    @Autowired
    private CommentService commentService;

    @GetMapping("/{id}")
    public ResultVO getCommentByArticleId(@PathVariable String id) {
        return commentService.getCommentByArticleId(id);
    }
}
