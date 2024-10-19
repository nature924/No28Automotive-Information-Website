package com.entity.view;

import com.entity.JiagefenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 价格分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
@TableName("jiagefenlei")
public class JiagefenleiView  extends JiagefenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JiagefenleiView(){
	}
 
 	public JiagefenleiView(JiagefenleiEntity jiagefenleiEntity){
 	try {
			BeanUtils.copyProperties(this, jiagefenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
