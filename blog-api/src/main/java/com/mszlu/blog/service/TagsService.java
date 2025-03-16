package com.mszlu.blog.service;

import com.mszlu.blog.vo.Result;
import com.mszlu.blog.vo.TagVo;

import java.util.List;

/**
 * @author yanzhiyu
 */
public interface TagsService {


    List<TagVo> findTagsByArticleId(Long id);


    Result hot(int limit);

    Result findAll();

    Result findAllDetail();

    Result findDetailById(Long id);
}
