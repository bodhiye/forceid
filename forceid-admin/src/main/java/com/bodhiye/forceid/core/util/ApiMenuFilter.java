package com.bodhiye.forceid.core.util;

import com.bodhiye.forceid.config.properties.ForceidProperties;
import com.bodhiye.forceid.core.common.constant.Const;
import com.bodhiye.forceid.core.node.MenuNode;
import com.bodhiye.forceid.core.common.constant.Const;
import com.bodhiye.forceid.config.properties.ForceidProperties;
import com.bodhiye.forceid.core.node.MenuNode;

import java.util.ArrayList;
import java.util.List;

/**
 * api接口文档显示过滤
 *
 * @author bodhiye
 * @Date 2018-08-17 16:55
 */
public class ApiMenuFilter extends MenuNode {

    public static List<MenuNode> build(List<MenuNode> nodes) {

        //如果关闭了接口文档,则不显示接口文档菜单
        ForceidProperties forceidProperties = SpringContextHolder.getBean(ForceidProperties.class);
        if (!forceidProperties.getSwaggerOpen()) {
            List<MenuNode> menuNodesCopy = new ArrayList<>();
            for (MenuNode menuNode : nodes) {
                if (Const.API_MENU_NAME.equals(menuNode.getName())) {
                    continue;
                } else {
                    menuNodesCopy.add(menuNode);
                }
            }
            nodes = menuNodesCopy;
        }

        return nodes;
    }
}
