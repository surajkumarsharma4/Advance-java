package com.jsp.school;

import java.io.Serializable;

public class School implements Serializable{
	private String boardName;	
	private int room;
	private int teacher;
	
	public School(String boardName, int room, int teacher) {
		super();
		this.boardName = boardName;
		this.room = room;
		this.teacher = teacher;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public int getRoom() {
		return room;
	}
	public void setRoom(int room) {
		this.room = room;
	}
	public int getTeacher() {
		return teacher;
	}
	public void setTeacher(int teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "School [boardName=" + boardName + ", room=" + room + ", teacher=" + teacher + "]";
	}
	
}
