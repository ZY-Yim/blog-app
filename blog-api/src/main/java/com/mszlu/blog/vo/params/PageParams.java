package com.mszlu.blog.vo.params;

import lombok.Data;

/**
 * @author yanzhiyu
 */
@Data
public class PageParams {

    private int page = 1;

    private int pageSize = 10;
}
