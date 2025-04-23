package com.bookGap.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.web.access.AccessDeniedHandler;

public class UserDeniedHandler implements AccessDeniedHandler {

	@Override
	public void handle(HttpServletRequest request, HttpServletResponse response,
			AccessDeniedException accessDeniedException) throws IOException, ServletException {
		//authority 값이 일치하지 않는 경로(권한이 없는 경로) 접근시 호출
		System.out.println("권한 없음");
		
		response.sendRedirect(request.getContextPath()); //메인페이지 이동
	}
}