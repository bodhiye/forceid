package com.bodhiye.forceid.modular.system.warpper;

import com.bodhiye.forceid.core.common.constant.factory.ConstantFactory;
import com.bodhiye.forceid.modular.system.model.Dict;
import com.bodhiye.forceid.core.common.constant.factory.ConstantFactory;
import com.bodhiye.forceid.modular.system.model.Dict;
import com.bodhiye.forceid.core.base.warpper.BaseControllerWarpper;
import com.bodhiye.forceid.core.util.ToolUtil;

import java.util.List;
import java.util.Map;

/**
 * 字典列表的包装
 *
 * @author bodhiye
 * @Date 2018年5月25日 18:10:31
 */
public class DictWarpper extends BaseControllerWarpper {

    public DictWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        StringBuffer detail = new StringBuffer();
        Integer id = (Integer) map.get("id");
        List<Dict> dicts = ConstantFactory.me().findInDict(id);
        if(dicts != null){
            for (Dict dict : dicts) {
                detail.append(dict.getNum() + ":" +dict.getName() + ",");
            }
            map.put("detail", ToolUtil.removeSuffix(detail.toString(),","));
        }
    }

}
