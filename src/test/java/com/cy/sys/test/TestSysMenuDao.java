package com.cy.sys.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.cy.sys.dao.SysMenuDao;
import com.cy.sys.entity.SysMenu;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSysMenuDao {
	@Autowired
	private SysMenuDao sysMenuDao;
	@Test
	public void testFindObjects() {
		List<SysMenu> list = sysMenuDao.findObjects();
		for (SysMenu sysMenu : list) {
			System.out.println(sysMenu);
		}
	}
}
