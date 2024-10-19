package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussjingxiaoshangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussjingxiaoshangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussjingxiaoshangView;


/**
 * 经销商评论表
 *
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
public interface DiscussjingxiaoshangService extends IService<DiscussjingxiaoshangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussjingxiaoshangVO> selectListVO(Wrapper<DiscussjingxiaoshangEntity> wrapper);
   	
   	DiscussjingxiaoshangVO selectVO(@Param("ew") Wrapper<DiscussjingxiaoshangEntity> wrapper);
   	
   	List<DiscussjingxiaoshangView> selectListView(Wrapper<DiscussjingxiaoshangEntity> wrapper);
   	
   	DiscussjingxiaoshangView selectView(@Param("ew") Wrapper<DiscussjingxiaoshangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussjingxiaoshangEntity> wrapper);
   	
}

