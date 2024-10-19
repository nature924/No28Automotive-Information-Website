package com.dao;

import com.entity.DiscussjingxiaoshangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussjingxiaoshangVO;
import com.entity.view.DiscussjingxiaoshangView;


/**
 * 经销商评论表
 * 
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
public interface DiscussjingxiaoshangDao extends BaseMapper<DiscussjingxiaoshangEntity> {
	
	List<DiscussjingxiaoshangVO> selectListVO(@Param("ew") Wrapper<DiscussjingxiaoshangEntity> wrapper);
	
	DiscussjingxiaoshangVO selectVO(@Param("ew") Wrapper<DiscussjingxiaoshangEntity> wrapper);
	
	List<DiscussjingxiaoshangView> selectListView(@Param("ew") Wrapper<DiscussjingxiaoshangEntity> wrapper);

	List<DiscussjingxiaoshangView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussjingxiaoshangEntity> wrapper);
	
	DiscussjingxiaoshangView selectView(@Param("ew") Wrapper<DiscussjingxiaoshangEntity> wrapper);
	
}
