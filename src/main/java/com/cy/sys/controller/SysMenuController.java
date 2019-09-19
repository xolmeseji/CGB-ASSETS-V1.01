package com.cy.sys.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cy.common.vo.JsonResult;
import com.cy.sys.service.SysMenuService;

@RequestMapping("/menu/")
@RestController
public class SysMenuController {
	@Autowired
	private SysMenuService sysMenuService;
	
	@GetMapping("doFindObjects")
	public JsonResult doFindObjects() {
		return new JsonResult(sysMenuService.findObjects());
	}
}
