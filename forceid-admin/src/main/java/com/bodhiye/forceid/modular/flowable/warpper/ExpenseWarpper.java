package com.bodhiye.forceid.modular.flowable.warpper;

import com.bodhiye.forceid.core.common.constant.state.ExpenseState;
import com.bodhiye.forceid.core.common.constant.state.ExpenseState;
import com.bodhiye.forceid.core.base.warpper.BaseControllerWarpper;

import java.util.Map;

/**
 * 报销列表的包装
 *
 * @author bodhiye
 * @Date 2018年5月4日21:56:06
 */
public class ExpenseWarpper extends BaseControllerWarpper {

    public ExpenseWarpper(Object list) {
        super(list);
    }

    @Override
    public void warpTheMap(Map<String, Object> map) {
        Integer state = (Integer) map.get("state");
        map.put("stateName", ExpenseState.valueOf(state));
    }

}
