package com.virtualdent.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.virtualdent.entity.Mark;
import com.virtualdent.repository.MarkRepository;

@Service
@Transactional
public class MarkServiceImpl implements MarkService {

	@Autowired
	private MarkRepository markRepo;
	
	@Override
	public List<Mark> getMarks() {
		List<Mark>marks=markRepo.findAll();
		Collections.reverse(marks);
		return marks;
	}

	@Override
	public Mark getMark(Integer id) {
		return markRepo.findById(id).get();
	}

	@Override
	public void saveMark(Mark mark) {
		markRepo.save(mark);
	}

	@Override
	public void deleteMark(Integer id) {
		markRepo.deleteById(id);
	}
}