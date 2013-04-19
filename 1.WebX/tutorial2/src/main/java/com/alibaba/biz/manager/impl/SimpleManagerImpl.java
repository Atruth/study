/**
 * 
 */
package com.alibaba.biz.manager.impl;

import java.util.List;

import javax.annotation.Resource;

import com.alibaba.biz.dao.SimpleDAO;
import com.alibaba.biz.manager.SimpleManager;
import com.alibaba.biz.structure.to.ItemResultTO;

/**
 * @author wb-zhouxiang
 * 
 */
public class SimpleManagerImpl implements SimpleManager {

	@Resource
	private SimpleDAO simpleDAO;

	@Override
	public List<ItemResultTO> getSimpleItemList() {
		// TODO Auto-generated method stub
		return simpleDAO.getSimpleItemList();
	}

}
