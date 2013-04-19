/**
 * 
 */
package com.alibaba.biz.dao;

import java.util.List;

import com.alibaba.biz.structure.to.ItemResultTO;

/**
 * @author wb-zhouxiang
 * 
 */
public interface SimpleDAO {
	List<ItemResultTO> getSimpleItemList();
}
