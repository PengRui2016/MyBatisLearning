package com.imooc.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.imooc.service.MaintainService;

@SuppressWarnings("serial")
public class InsertServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		//设置页面编码
		req.setCharacterEncoding("UTF-8");
		//取值
		String[] contents = req.getParameterValues("content");
		String[] commandids = req.getParameterValues("commandid");
		//插入
		MaintainService maintainService = new MaintainService();
		maintainService.insertContentBatch(contents, commandids);
		
		req.getRequestDispatcher("/WEB-INF/jsp/back/insertcontent.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doGet(req, resp);
	}

}
