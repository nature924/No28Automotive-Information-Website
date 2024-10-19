package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiagefenleiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiagefenleiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiagefenleiView;


/**
 * 价格分类
 *
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
public interface JiagefenleiService extends IService<JiagefenleiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiagefenleiVO> selectListVO(Wrapper<JiagefenleiEntity> wrapper);
   	
   	JiagefenleiVO selectVO(@Param("ew") Wrapper<JiagefenleiEntity> wrapper);
   	
   	List<JiagefenleiView> selectListView(Wrapper<JiagefenleiEntity> wrapper);
   	
   	JiagefenleiView selectView(@Param("ew") Wrapper<JiagefenleiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiagefenleiEntity> wrapper);
   	
}

