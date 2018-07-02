package com.bodhiye.forceid.core.base.tips;

/**
 * 返回给前台的成功提示
 *
 * @author bodhiye
 * @Date 2018年5月12日 下午5:05:22
 */
public class SuccessTip extends Tip {
	
	public SuccessTip(){
		super.code = 200;
		super.message = "操作成功";
	}
}
