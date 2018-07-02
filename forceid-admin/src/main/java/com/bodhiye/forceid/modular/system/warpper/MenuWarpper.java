package com.bodhiye.forceid.modular.system.warpper;

import com.bodhiye.forceid.core.common.constant.factory.ConstantFactory;
import com.bodhiye.forceid.core.common.constant.state.IsMenu;
import com.bodhiye.forceid.core.common.constant.factory.ConstantFactory;
import com.bodhiye.forceid.core.common.constant.state.IsMenu;
import com.bodhiye.forceid.core.base.warpper.BaseControllerWarpper;

import java.util.List;
import java.util.Map;

/**
 * 菜单列表的包装类
 *
 * @author bodhiye
 * @Date 2018年5月19日15:07:29
 */
public class MenuWarpper extends BaseControllerWarpper {

    public MenuWarpper(List<Map<String, Object>> list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        map.put("statusName", ConstantFactory.me().getMenuStatusName((Integer) map.get("status")));
        map.put("isMenuName", IsMenu.valueOf((Integer) map.get("ismenu")));
    }

}
