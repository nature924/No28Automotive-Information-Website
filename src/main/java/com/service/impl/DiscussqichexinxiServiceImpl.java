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


import com.dao.DiscussqichexinxiDao;
import com.entity.DiscussqichexinxiEntity;
import com.service.DiscussqichexinxiService;
import com.entity.vo.DiscussqichexinxiVO;
import com.entity.view.DiscussqichexinxiView;

@Service("discussqichexinxiService")
public class DiscussqichexinxiServiceImpl extends ServiceImpl<DiscussqichexinxiDao, DiscussqichexinxiEntity> implements DiscussqichexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussqichexinxiEntity> page = this.selectPage(
                new Query<DiscussqichexinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussqichexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussqichexinxiEntity> wrapper) {
		  Page<DiscussqichexinxiView> page =new Query<DiscussqichexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussqichexinxiVO> selectListVO(Wrapper<DiscussqichexinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussqichexinxiVO selectVO(Wrapper<DiscussqichexinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussqichexinxiView> selectListView(Wrapper<DiscussqichexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussqichexinxiView selectView(Wrapper<DiscussqichexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
