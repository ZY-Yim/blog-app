package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * @author yanzhiyu
 * @date 2025/3/15
 */
@Data
public class Comment {

    private Long id;

    private String content;

    private Long createDate;

    private Long articleId;

    private Long authorId;

    private Long parentId;

    private Long toUid;

    private Integer level;
}
