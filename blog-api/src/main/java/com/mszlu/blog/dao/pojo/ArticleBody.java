package com.mszlu.blog.dao.pojo;

import lombok.Data;

/**
 * @author yanzhiyu
 * @date 2025/3/15
 */
@Data
public class ArticleBody {

    private Long id;
    private String content;
    private String contentHtml;
    private Long articleId;
}