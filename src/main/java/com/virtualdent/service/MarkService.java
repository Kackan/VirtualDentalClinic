package com.virtualdent.service;

import java.util.List;

import com.virtualdent.entity.Mark;

public interface MarkService{
	
	public List<Mark>getMarks();
	
	public Mark getMark(Integer id);
	
	public void saveMark(Mark mark);
	
	public void deleteMark(Integer id);

}
