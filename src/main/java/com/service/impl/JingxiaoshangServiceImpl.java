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


import com.dao.JingxiaoshangDao;
import com.entity.JingxiaoshangEntity;
import com.service.JingxiaoshangService;
import com.entity.vo.JingxiaoshangVO;
import com.entity.view.JingxiaoshangView;

@Service("jingxiaoshangService")
public class JingxiaoshangServiceImpl extends ServiceImpl<JingxiaoshangDao, JingxiaoshangEntity> implements JingxiaoshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JingxiaoshangEntity> page = this.selectPage(
                new Query<JingxiaoshangEntity>(params).getPage(),
                new EntityWrapper<JingxiaoshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JingxiaoshangEntity> wrapper) {
		  Page<JingxiaoshangView> page =new Query<JingxiaoshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JingxiaoshangVO> selectListVO(Wrapper<JingxiaoshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JingxiaoshangVO selectVO(Wrapper<JingxiaoshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JingxiaoshangView> selectListView(Wrapper<JingxiaoshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JingxiaoshangView selectView(Wrapper<JingxiaoshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
