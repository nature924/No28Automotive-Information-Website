package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussqichexinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussqichexinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussqichexinxiView;


/**
 * 汽车信息评论表
 *
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
public interface DiscussqichexinxiService extends IService<DiscussqichexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussqichexinxiVO> selectListVO(Wrapper<DiscussqichexinxiEntity> wrapper);
   	
   	DiscussqichexinxiVO selectVO(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
   	
   	List<DiscussqichexinxiView> selectListView(Wrapper<DiscussqichexinxiEntity> wrapper);
   	
   	DiscussqichexinxiView selectView(@Param("ew") Wrapper<DiscussqichexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussqichexinxiEntity> wrapper);
   	
}

