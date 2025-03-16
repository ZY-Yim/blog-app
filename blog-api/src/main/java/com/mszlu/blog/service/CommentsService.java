package com.mszlu.blog.service;
import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.params.CommentParam;

/**
 * @author yanzhiyu
 * @date 2025/3/15
 */
public interface CommentsService {

    Result commentsByArticleId(Long articleId);

    Result comment(CommentParam commentParam);
}
