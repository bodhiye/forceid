package com.bodhiye.forceid.modular.system.warpper;

import com.bodhiye.forceid.core.common.constant.factory.ConstantFactory;
import com.bodhiye.forceid.core.common.constant.factory.ConstantFactory;
import com.bodhiye.forceid.core.base.warpper.BaseControllerWarpper;

import java.util.Map;

/**
 * 部门列表的包装
 *
 * @author bodhiye
 * @Date 2018年5月25日 18:10:31
 */
public class NoticeWrapper extends BaseControllerWarpper {

    public NoticeWrapper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        Integer creater = (Integer) map.get("creater");
        map.put("createrName", ConstantFactory.me().getUserNameById(creater));
    }

}
