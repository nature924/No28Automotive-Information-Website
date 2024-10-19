package com.entity.vo;

import com.entity.JingxiaoshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 经销商
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
public class JingxiaoshangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 汽车品牌
	 */
	
	private String qichepinpai;
		
	/**
	 * 门店图片
	 */
	
	private String mendiantupian;
		
	/**
	 * 门店位置
	 */
	
	private String mendianweizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 经营范围
	 */
	
	private String jingyingfanwei;
		
	/**
	 * 门店介绍
	 */
	
	private String mendianjieshao;
				
	
	/**
	 * 设置：汽车品牌
	 */
	 
	public void setQichepinpai(String qichepinpai) {
		this.qichepinpai = qichepinpai;
	}
	
	/**
	 * 获取：汽车品牌
	 */
	public String getQichepinpai() {
		return qichepinpai;
	}
				
	
	/**
	 * 设置：门店图片
	 */
	 
	public void setMendiantupian(String mendiantupian) {
		this.mendiantupian = mendiantupian;
	}
	
	/**
	 * 获取：门店图片
	 */
	public String getMendiantupian() {
		return mendiantupian;
	}
				
	
	/**
	 * 设置：门店位置
	 */
	 
	public void setMendianweizhi(String mendianweizhi) {
		this.mendianweizhi = mendianweizhi;
	}
	
	/**
	 * 获取：门店位置
	 */
	public String getMendianweizhi() {
		return mendianweizhi;
	}
				
	
	/**
	 * 设置：联系电话
	 */
	 
	public void setLianxidianhua(String lianxidianhua) {
		this.lianxidianhua = lianxidianhua;
	}
	
	/**
	 * 获取：联系电话
	 */
	public String getLianxidianhua() {
		return lianxidianhua;
	}
				
	
	/**
	 * 设置：经营范围
	 */
	 
	public void setJingyingfanwei(String jingyingfanwei) {
		this.jingyingfanwei = jingyingfanwei;
	}
	
	/**
	 * 获取：经营范围
	 */
	public String getJingyingfanwei() {
		return jingyingfanwei;
	}
				
	
	/**
	 * 设置：门店介绍
	 */
	 
	public void setMendianjieshao(String mendianjieshao) {
		this.mendianjieshao = mendianjieshao;
	}
	
	/**
	 * 获取：门店介绍
	 */
	public String getMendianjieshao() {
		return mendianjieshao;
	}
			
}
