package com.jianwind.fj.service;

import java.util.List;

import com.jianwind.fj.dto.AppointExecution;
import com.jianwind.fj.entity.Book;

/**
 * 涓氬姟鎺ュ彛锛氱珯鍦�"浣跨敤鑰�"瑙掑害璁捐鎺ュ彛 涓変釜鏂归潰锛氭柟娉曞畾涔夌矑搴︼紝鍙傛暟锛岃繑鍥炵被鍨嬶紙return 绫诲瀷/寮傚父锛�
 */
public interface BookService {

	/**
	 * 鏌ヨ涓�鏈浘涔�
	 * 
	 * @param bookId
	 * @return
	 */
	Book getById(long bookId);

	/**
	 * 鏌ヨ鎵�鏈夊浘涔�
	 * 
	 * @return
	 */
	List<Book> getList();

	/**
	 * 棰勭害鍥句功
	 * 
	 * @param bookId
	 * @param studentId
	 * @return
	 */
	AppointExecution appoint(long bookId, long studentId);

}
