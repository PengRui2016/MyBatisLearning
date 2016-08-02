package com.imooc.service;

import java.util.List;

import com.imooc.bean.Message;
import com.imooc.dao.MessageDao;

/**
 * @author Mr_PR
 * 消息列表相关的业务
 */
public class ListService {

	public List<Message> queryMessageList(String command, String description){
		MessageDao messageDao = new MessageDao();
		return messageDao.queryMessageList(command, description);
	}
}
