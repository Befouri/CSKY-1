package shu.java.csky.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import shu.java.csky.ArticleService;
import shu.java.csky.vo.ResultVO;

/**
 * @author: Silence
 * @date: 2022/2/17 13:16
 * @description:
 */

@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    ArticleService articleService;

    @GetMapping("/{id}")
    public ResultVO getArticleById(@PathVariable String id) {
        return articleService.getArticleById(id);
    }

}
