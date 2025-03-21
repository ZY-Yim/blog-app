package com.mszlu.blog.vo.params;

import lombok.Data;

/**
 * @author yanzhiyu
 * @date 2025/3/15
 */
@Data
public class CommentParam {

    private Long articleId;

    private String content;

    private Long parent;

    private Long toUserId;
}
