package shu.java.csky.impl;

import org.springframework.stereotype.Service;
import shu.java.csky.ArticleService;
import shu.java.csky.dao.ArticlesMapper;
import shu.java.csky.entity.Articles;
import shu.java.csky.vo.*;

import javax.annotation.Resource;

/**
 * @author: Silence
 * @date: 2022/2/17 13:20
 * @description:
 */

@Service
public class ArticleServiceImpl implements ArticleService {
    @Resource
    ArticlesMapper articlesMapper;

    @Override
    public ResultVO getArticleById(String articleId) {
        Articles articles = articlesMapper.selectById(articleId);
        return new ResultVO(ResStatus.OK, "文章查询成功", articles);
    }
}