package com.cy.common.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.common.vo.JsonResult;

/**
 * @ControllerAdvice 使用此注解描述的类为一个全局异常处理类
 */

import lombok.extern.slf4j.Slf4j;
@ControllerAdvice
@Slf4j
public class GlobalExceptionHandler {
	//private Logger log=
	//LoggerFactory.getLogger(GlobalExceptionHandler.class);
	/**
	 * @ExceptionHandler 注解描述的方法为一个异常处理方法
	 * @param e
	 * @return
	 */
	@ExceptionHandler(RuntimeException.class)
	@ResponseBody
	public JsonResult doHandleRuntimeException(
			RuntimeException e) {
		log.error(e.getMessage());
		e.printStackTrace();

		return new JsonResult(e);
	}
}




