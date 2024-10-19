package com.dao;

import com.entity.JiagefenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiagefenleiVO;
import com.entity.view.JiagefenleiView;


/**
 * 价格分类
 * 
 * @author 
 * @email 
 * @date 2021-05-16 08:45:35
 */
public interface JiagefenleiDao extends BaseMapper<JiagefenleiEntity> {
	
	List<JiagefenleiVO> selectListVO(@Param("ew") Wrapper<JiagefenleiEntity> wrapper);
	
	JiagefenleiVO selectVO(@Param("ew") Wrapper<JiagefenleiEntity> wrapper);
	
	List<JiagefenleiView> selectListView(@Param("ew") Wrapper<JiagefenleiEntity> wrapper);

	List<JiagefenleiView> selectListView(Pagination page,@Param("ew") Wrapper<JiagefenleiEntity> wrapper);
	
	JiagefenleiView selectView(@Param("ew") Wrapper<JiagefenleiEntity> wrapper);
	
}
