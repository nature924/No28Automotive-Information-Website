package com.entity.view;

import com.entity.DiscussjingxiaoshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 经销商评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
@TableName("discussjingxiaoshang")
public class DiscussjingxiaoshangView  extends DiscussjingxiaoshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussjingxiaoshangView(){
	}
 
 	public DiscussjingxiaoshangView(DiscussjingxiaoshangEntity discussjingxiaoshangEntity){
 	try {
			BeanUtils.copyProperties(this, discussjingxiaoshangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
