package shu.java.csky.impl;

import org.springframework.stereotype.Service;
import shu.java.csky.CommentService;
import shu.java.csky.dao.CommentMapper;
import shu.java.csky.dao.UserMapper;
import shu.java.csky.entity.User;
import shu.java.csky.vo.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: Silence
 * @date: 2022/2/18 9:21
 * @description:
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Resource
    private CommentMapper commentMapper;
    @Resource
    private UserMapper userMapper;

    @Override
    public ResultVO getCommentByArticleId(String articleId) {
        List<CommentVo> commentVos = commentMapper.getAllByArticleId(articleId);
        List<CommentReturn> commentReturnList = new ArrayList<>();
        for (CommentVo commentVo : commentVos) {
            User uParent = userMapper.selectById(commentVo.getUserId()); //  获取每一层评论(父评论)
            CommentReturn commentReturn = new CommentReturn();
            commentReturn.setCommentParent(new CommentAtom(uParent, null, commentVo.getPraiseNum(), commentVo.getCreateTime(), commentVo.getContent()));
            List<CommentAtom> childrenList = new ArrayList<>();
            for (CommentVo vo : commentVo.getCommentVos()) {
                User uCommentor = userMapper.selectById(vo.getUserId()); // 获取每一层父评论下的子评论的评论者
                User uBecommentor = userMapper.selectById(vo.getReplyCommentId()); // 获取每一层父评论下的子评论的被评论者
                CommentAtom commentAtom = new CommentAtom(uCommentor, uBecommentor, vo.getPraiseNum(), vo.getCreateTime(), vo.getContent());
                childrenList.add(commentAtom);
            }
            commentReturn.setCommentChildrenList(childrenList);
            commentReturnList.add(commentReturn);
        }
        System.out.println(commentReturnList);
        return new ResultVO(ResStatus.OK, "评论查询成功", commentReturnList);
    }

}
