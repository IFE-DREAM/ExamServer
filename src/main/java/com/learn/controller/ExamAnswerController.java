package com.learn.controller;

import com.learn.dto.ExamAnswerDTO;
import com.learn.service.ExamAnswerService;
import com.learn.utils.ResultModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ExamAnswerController {

    @Autowired
    private ExamAnswerService examAnswerService;

    @PutMapping("/examAnswers") // 查询课程列表并进行选课
    public ResultModel findAll(ExamAnswerDTO examAnswerDTO){
        return examAnswerService.saveAnswer(examAnswerDTO);
    }


}

