package shu.java.csky;

import shu.java.csky.vo.ResultVO;

/**
 * @author: Silence
 * @date: 2022/2/17 13:18
 * @description:
 */
public interface ArticleService {
    /**
     * 根据文章的Id，获取文章
     *
     * @param articleId 文章的Id
     * @return
     */
    ResultVO getArticleById(String articleId);

}
