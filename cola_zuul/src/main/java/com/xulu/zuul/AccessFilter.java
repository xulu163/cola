package com.xulu.zuul;

import com.netflix.zuul.ZuulFilter;

/**
 * @author xulu
 * @date 2018/8/16
 * @link https://github.com/xulu163
 */
public class AccessFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return null;
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return false;
    }

    @Override
    public Object run() {
        return null;
    }
}
