/**
 * 
 */
package com.alibaba.biz.structure.to;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author wb-zhouxiang
 * 
 */
public class ItemResultTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 11555L;

	private Long juId;
	private String picUrl;
	private String title;
	private Long price;
	private Long activityPrice;
	private Date gmtCreate;
	private String email;
	private String wangwang;
	private List<SellerTO> sellerTOs = new ArrayList<SellerTO>(1);

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

	public Long getJuId() {
		return juId;
	}

	public void setJuId(Long juId) {
		this.juId = juId;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Long getPrice() {
		return price;
	}

	public void setPrice(Long price) {
		this.price = price;
	}

	public Long getActivityPrice() {
		return activityPrice;
	}

	public void setActivityPrice(Long activityPrice) {
		this.activityPrice = activityPrice;
	}

	public Date getGmtCreate() {
		return gmtCreate;
	}

	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public List<SellerTO> getSellerTOs() {
		return sellerTOs;
	}

	public void setSellerTOs(List<SellerTO> sellerTOs) {
		this.sellerTOs = sellerTOs;
	}

}
