package com.taobao.ju.test.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.taobao.ju.test.MavenPlugin;

public class MavenPluginImpl implements MavenPlugin {
	@Autowired
	private String environment;

	public String getEnvironmentInfor() {
		return environment;
	}

}
