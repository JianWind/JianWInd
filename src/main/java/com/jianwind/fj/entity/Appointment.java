package com.jianwind.fj.entity;

import java.util.Date;

/**
 * 棰勭害鍥句功瀹炰綋
 */
public class Appointment {

	private long bookId;// 鍥句功ID

	private long studentId;// 瀛﹀彿

	private Date appointTime;// 棰勭害鏃堕棿

	// 澶氬涓�鐨勫鍚堝睘鎬�
	private Book book;// 鍥句功瀹炰綋

	public Appointment() {
	}

	public Appointment(long bookId, long studentId, Date appointTime) {
		this.bookId = bookId;
		this.studentId = studentId;
		this.appointTime = appointTime;
	}

	public Appointment(long bookId, long studentId, Date appointTime, Book book) {
		this.bookId = bookId;
		this.studentId = studentId;
		this.appointTime = appointTime;
		this.book = book;
	}

	public long getBookId() {
		return bookId;
	}

	public void setBookId(long bookId) {
		this.bookId = bookId;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public Date getAppointTime() {
		return appointTime;
	}

	public void setAppointTime(Date appointTime) {
		this.appointTime = appointTime;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Appointment [bookId=" + bookId + ", studentId=" + studentId + ", appointTime=" + appointTime + "]";
	}

}
