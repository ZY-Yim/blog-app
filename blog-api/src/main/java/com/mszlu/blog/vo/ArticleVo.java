package com.mszlu.blog.vo;

import lombok.Data;

import java.util.List;

/**
 * @author yanzhiyu
 */
@Data
public class ArticleVo {
    //一定要记得加 要不然 会出现精度损失
    //@JsonSerialize(using = ToStringSerializer.class)
    private String id;

    private String title;

    private String summary;

    private Integer commentCounts;

    private Integer viewCounts;

    private Integer weight;
    /**
     * 创建时间
     */
    private String createDate;

    private String author;

    private ArticleBodyVo body;

    private List<TagVo> tags;

    private CategoryVo category;

}
