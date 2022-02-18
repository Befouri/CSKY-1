package shu.java.csky;

import shu.java.csky.vo.ResultVO;

/**
 * @author: Silence
 * @date: 2022/2/18 9:21
 * @description:
 */
public interface CommentService {
    /**
     * 根据文章的Id，获取文章的评论
     *
     * @param articleId 文章的Id
     * @return
     */
    ResultVO getCommentByArticleId(String articleId);
}
