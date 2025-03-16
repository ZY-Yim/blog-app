package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * @author yanzhiyu
 * @date 2025/3/15
 */
@Data
public class ArticleTag {

    private Long id;

    private Long articleId;

    private Long tagId;
}
