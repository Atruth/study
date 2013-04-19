/**
 * 
 */
package com.alibaba.biz.provider.impl;

import com.alibaba.biz.provider.HelloWorldService;

/**
 * @author wb-zhouxiang
 * 
 */
public class HelloWorldServiceImpl implements HelloWorldService {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.alibaba.biz.provider.HelloWorldService#getYourWorld()
	 */
	@Override
	public String getYourWorld() {
		// TODO Auto-generated method stub
		return System.getenv("JAVA_HOME");
		
	}

}
