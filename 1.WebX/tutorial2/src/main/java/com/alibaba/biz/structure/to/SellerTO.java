/**
 * 
 */
package com.alibaba.biz.structure.to;

import java.io.Serializable;

/**
 * @author wb-zhouxiang
 * 
 */
public class SellerTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 11555L;

	private Long sellerId;
	private String email;
	private String wangwang;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWangwang() {
		return wangwang;
	}

	public void setWangwang(String wangwang) {
		this.wangwang = wangwang;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

}
