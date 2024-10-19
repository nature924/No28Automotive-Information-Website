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


import com.dao.DiscussjingxiaoshangDao;
import com.entity.DiscussjingxiaoshangEntity;
import com.service.DiscussjingxiaoshangService;
import com.entity.vo.DiscussjingxiaoshangVO;
import com.entity.view.DiscussjingxiaoshangView;

@Service("discussjingxiaoshangService")
public class DiscussjingxiaoshangServiceImpl extends ServiceImpl<DiscussjingxiaoshangDao, DiscussjingxiaoshangEntity> implements DiscussjingxiaoshangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussjingxiaoshangEntity> page = this.selectPage(
                new Query<DiscussjingxiaoshangEntity>(params).getPage(),
                new EntityWrapper<DiscussjingxiaoshangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussjingxiaoshangEntity> wrapper) {
		  Page<DiscussjingxiaoshangView> page =new Query<DiscussjingxiaoshangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussjingxiaoshangVO> selectListVO(Wrapper<DiscussjingxiaoshangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussjingxiaoshangVO selectVO(Wrapper<DiscussjingxiaoshangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussjingxiaoshangView> selectListView(Wrapper<DiscussjingxiaoshangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussjingxiaoshangView selectView(Wrapper<DiscussjingxiaoshangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
