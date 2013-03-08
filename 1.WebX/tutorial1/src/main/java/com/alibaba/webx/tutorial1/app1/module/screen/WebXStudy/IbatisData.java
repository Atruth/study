/**
 * 
 */
package com.alibaba.webx.tutorial1.app1.module.screen.WebXStudy;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.biz.manager.SimpleManager;
import com.alibaba.biz.structure.to.ItemResultTO;
import com.alibaba.citrus.turbine.Context;

/**
 * @author wb-zhouxiang
 * 
 */
public class IbatisData {

	@Resource
	private SimpleManager simpleManager;

	public void execute(Context context) {
		List<ItemResultTO> list = simpleManager.getSimpleItemList();
		context.put("list", list);
	}
}
