/**
 * 
 */
package com.alibaba.biz.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.ibatis.SqlMapClientTemplate;

import com.alibaba.biz.dao.SimpleDAO;
import com.alibaba.biz.structure.to.ItemResultTO;

/**
 * @author wb-zhouxiang
 * 
 */
public class SimpleDAOImpl extends BaseDAO implements SimpleDAO {

	@SuppressWarnings("unchecked")
	@Override
	public List<ItemResultTO> getSimpleItemList() {
		// TODO Auto-generated method stub
		SqlMapClientTemplate sqlMapClientTemplate = getSqlMapClientTemplate();
		List<ItemResultTO> resultList = new ArrayList<ItemResultTO>();
		resultList = sqlMapClientTemplate
				.queryForList("SimpltDAO.queryComInfor");
		return resultList;
	}

}
