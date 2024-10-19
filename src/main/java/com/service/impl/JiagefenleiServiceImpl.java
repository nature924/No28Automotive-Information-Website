package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiagefenleiDao;
import com.entity.JiagefenleiEntity;
import com.service.JiagefenleiService;
import com.entity.vo.JiagefenleiVO;
import com.entity.view.JiagefenleiView;

@Service("jiagefenleiService")
public class JiagefenleiServiceImpl extends ServiceImpl<JiagefenleiDao, JiagefenleiEntity> implements JiagefenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiagefenleiEntity> page = this.selectPage(
                new Query<JiagefenleiEntity>(params).getPage(),
                new EntityWrapper<JiagefenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiagefenleiEntity> wrapper) {
		  Page<JiagefenleiView> page =new Query<JiagefenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiagefenleiVO> selectListVO(Wrapper<JiagefenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiagefenleiVO selectVO(Wrapper<JiagefenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiagefenleiView> selectListView(Wrapper<JiagefenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiagefenleiView selectView(Wrapper<JiagefenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
