package com.entity.view;

import com.entity.JingxiaoshangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 经销商
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
@TableName("jingxiaoshang")
public class JingxiaoshangView  extends JingxiaoshangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JingxiaoshangView(){
	}
 
 	public JingxiaoshangView(JingxiaoshangEntity jingxiaoshangEntity){
 	try {
			BeanUtils.copyProperties(this, jingxiaoshangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
