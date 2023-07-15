package com.learn.mapper;

import com.learn.vo.FinExamDetailVO;

import java.util.List;

public interface FinExamDetailMapper {

    List<FinExamDetailVO> findAll(int id);

}
