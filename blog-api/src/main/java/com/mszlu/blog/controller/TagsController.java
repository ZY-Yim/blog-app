package com.mszlu.blog.controller;

import com.mszlu.blog.service.TagsService;
import com.mszlu.blog.vo.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yanzhiyu
 */
@RestController
@RequestMapping("tags")
public class TagsController {

    @Autowired
    private TagsService tagsService;

    @GetMapping("/hot")
    public Result listHotTags() {
        int limit = 6;
        return tagsService.hot(limit);
    }

    @GetMapping
    public Result findAll(){
        return tagsService.findAll();
    }

    @GetMapping("detail")
    public Result findAllDetail(){
        return tagsService.findAllDetail();
    }

    @GetMapping("detail/{id}")
    public Result findDetailById(@PathVariable("id") Long id){
        return tagsService.findDetailById(id);
    }
}
