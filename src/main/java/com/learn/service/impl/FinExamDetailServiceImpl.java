package com.learn.service.impl;

import com.learn.mapper.FinExamDetailMapper;
import com.learn.service.FinExamDetailService;
import com.learn.utils.ResultModel;
import com.learn.vo.FinExamDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinExamDetailServiceImpl implements FinExamDetailService {
    @Autowired
    FinExamDetailMapper finExamDetailMapper;


    @Override
    public ResultModel<List<FinExamDetailVO>> findAll(int id) {
        ResultModel<List<FinExamDetailVO>> resultModel = new ResultModel<>();
        List<FinExamDetailVO> finExamDetailList = finExamDetailMapper.findAll(id);

        if(finExamDetailList.isEmpty()){
            resultModel.setCode(404);
            resultModel.setMsg("进入试卷详情失败");
        }else{
            resultModel.setCode(200);
            resultModel.setMsg("进入试卷详情成功");
            resultModel.setData(finExamDetailList);
        }
        return resultModel;
    }
}
