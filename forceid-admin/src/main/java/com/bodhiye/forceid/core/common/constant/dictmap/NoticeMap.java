package com.bodhiye.forceid.core.common.constant.dictmap;

import com.bodhiye.forceid.core.common.constant.dictmap.base.AbstractDictMap;

/**
 * 通知的映射
 *
 * @author bodhiye
 * @Date 2018-05-06 15:01
 */
public class NoticeMap extends AbstractDictMap {

    @Override
    public void init() {
        put("title", "标题");
        put("content", "内容");
    }

    @Override
    protected void initBeWrapped() {
    }
}
