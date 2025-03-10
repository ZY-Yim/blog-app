package com.mszlu.blog.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mszlu.blog.dao.pojo.Tag;

import java.util.List;

/**
 * @author yanzhiyu
 */
public interface TagMapper extends BaseMapper<Tag> {
    /**
     * 根据文章id查询标签列表
     *
     * @param articleId 文章id
     * @return 标签列表
     */
    List<Tag> findTagsByArticleId(Long articleId);

    /**
     * 查询最热的标签，前n条
     *
     * @param limit
     * @return
     */
    List<Long> findHotTagIds(int limit);


    List<Tag> findTagsByTagIds(List<Long> tagIds);
}