package com.entity.vo;

import com.entity.QichexinxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 汽车信息
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
public class QichexinxiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 车辆型号
	 */
	
	private String cheliangxinghao;
		
	/**
	 * 汽车品牌
	 */
	
	private String qichepinpai;
		
	/**
	 * 价格分类
	 */
	
	private String jiagefenlei;
		
	/**
	 * 车辆图片
	 */
	
	private String cheliangtupian;
		
	/**
	 * 车辆分类
	 */
	
	private String cheliangfenlei;
		
	/**
	 * 门店名称
	 */
	
	private String mendianmingcheng;
		
	/**
	 * 门店地址
	 */
	
	private String mendiandizhi;
		
	/**
	 * 联系电话
	 */
	
	private String lianxidianhua;
		
	/**
	 * 车辆售价
	 */
	
	private Integer cheliangshoujia;
		
	/**
	 * 车辆库存
	 */
	
	private Integer cheliangkucun;
		
	/**
	 * 车辆介绍
	 */
	
	private String cheliangjieshao;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
				
	
	/**
	 * 设置：车辆型号
	 */
	 
	public void setCheliangxinghao(String cheliangxinghao) {
		this.cheliangxinghao = cheliangxinghao;
	}
	
	/**
	 * 获取：车辆型号
	 */
	public String getCheliangxinghao() {
		return cheliangxinghao;
	}
				
	
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
	 * 设置：价格分类
	 */
	 
	public void setJiagefenlei(String jiagefenlei) {
		this.jiagefenlei = jiagefenlei;
	}
	
	/**
	 * 获取：价格分类
	 */
	public String getJiagefenlei() {
		return jiagefenlei;
	}
				
	
	/**
	 * 设置：车辆图片
	 */
	 
	public void setCheliangtupian(String cheliangtupian) {
		this.cheliangtupian = cheliangtupian;
	}
	
	/**
	 * 获取：车辆图片
	 */
	public String getCheliangtupian() {
		return cheliangtupian;
	}
				
	
	/**
	 * 设置：车辆分类
	 */
	 
	public void setCheliangfenlei(String cheliangfenlei) {
		this.cheliangfenlei = cheliangfenlei;
	}
	
	/**
	 * 获取：车辆分类
	 */
	public String getCheliangfenlei() {
		return cheliangfenlei;
	}
				
	
	/**
	 * 设置：门店名称
	 */
	 
	public void setMendianmingcheng(String mendianmingcheng) {
		this.mendianmingcheng = mendianmingcheng;
	}
	
	/**
	 * 获取：门店名称
	 */
	public String getMendianmingcheng() {
		return mendianmingcheng;
	}
				
	
	/**
	 * 设置：门店地址
	 */
	 
	public void setMendiandizhi(String mendiandizhi) {
		this.mendiandizhi = mendiandizhi;
	}
	
	/**
	 * 获取：门店地址
	 */
	public String getMendiandizhi() {
		return mendiandizhi;
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
	 * 设置：车辆售价
	 */
	 
	public void setCheliangshoujia(Integer cheliangshoujia) {
		this.cheliangshoujia = cheliangshoujia;
	}
	
	/**
	 * 获取：车辆售价
	 */
	public Integer getCheliangshoujia() {
		return cheliangshoujia;
	}
				
	
	/**
	 * 设置：车辆库存
	 */
	 
	public void setCheliangkucun(Integer cheliangkucun) {
		this.cheliangkucun = cheliangkucun;
	}
	
	/**
	 * 获取：车辆库存
	 */
	public Integer getCheliangkucun() {
		return cheliangkucun;
	}
				
	
	/**
	 * 设置：车辆介绍
	 */
	 
	public void setCheliangjieshao(String cheliangjieshao) {
		this.cheliangjieshao = cheliangjieshao;
	}
	
	/**
	 * 获取：车辆介绍
	 */
	public String getCheliangjieshao() {
		return cheliangjieshao;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
			
}
