package com.cy.sys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.common.exception.ServiceException;
import com.cy.sys.dao.SysMenuDao;
import com.cy.sys.entity.SysMenu;
import com.cy.sys.service.SysMenuService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SysMenuServiceImpl implements SysMenuService{

	@Autowired
	private SysMenuDao sysMenuDao;
	@Override
	public List<SysMenu> findObjects() {
		List<SysMenu> list = sysMenuDao.findObjects();
		if(list == null || list.size() == 0) {
			log.error("菜单查询出错");
			throw new ServiceException("没有找到记录");
		}
		return list;
	}

}
