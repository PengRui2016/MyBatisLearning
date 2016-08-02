package com.imooc.service;

import java.util.ArrayList;
import java.util.List;

import com.imooc.bean.Command_Content;
import com.imooc.dao.CommandContentDao;
import com.imooc.dao.MessageDao;

/**
 * @author Mr_PR 维护相关的业务
 */
public class MaintainService {

	/**
	 * 删除一条记录
	 * 
	 * @param id
	 */
	public void deleteOne(String id) {
		if (id != null && !"".equals(id.trim())) {
			MessageDao messageDao = new MessageDao();
			messageDao.deleteOne(Integer.valueOf(id));
		}
	}

	/**
	 * 批量删除记录
	 * 
	 * @param idListStr
	 */
	public void deleteBatch(String[] ids) {
		List<Integer> idList = new ArrayList<Integer>();
		for (String id : ids) {
			idList.add(Integer.valueOf(id));
		}
		MessageDao messageDao = new MessageDao();
		messageDao.deleteBatch(idList);
	}

	public void insertContentBatch(String[] contents, String[] commandids) {
		List<Command_Content> list = new ArrayList<Command_Content>();
		if (contents != null && commandids != null
				&& contents.length > 0 && commandids.length > 0) {
			for (int i = 0; i < contents.length; i++) {
				Command_Content content = new Command_Content();
				content.setContent(contents[i]);
				content.setCommand_id(Integer.valueOf(commandids[i]));
				list.add(content);
			}
			CommandContentDao commandContentDao = new CommandContentDao();
			commandContentDao.insertBatch(list);
		}
	}
}
