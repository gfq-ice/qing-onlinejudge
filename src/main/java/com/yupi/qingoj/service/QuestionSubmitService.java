package com.yupi.qingoj.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yupi.qingoj.model.dto.post.PostQueryRequest;
import com.yupi.qingoj.model.dto.question.QuestionQueryRequest;
import com.yupi.qingoj.model.dto.questionsubmit.QuestionSubmitAddRequest;
import com.yupi.qingoj.model.dto.questionsubmit.QuestionSubmitQueryRequest;
import com.yupi.qingoj.model.entity.Post;
import com.yupi.qingoj.model.entity.Question;
import com.yupi.qingoj.model.entity.QuestionSubmit;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.qingoj.model.entity.User;
import com.yupi.qingoj.model.vo.PostVO;
import com.yupi.qingoj.model.vo.QuestionSubmitVO;
import com.yupi.qingoj.model.vo.QuestionVO;

import javax.servlet.http.HttpServletRequest;

/**
* @author LENOVO
* @description 针对表【question_submit(题目提交)】的数据库操作Service
* @createDate 2024-07-14 21:21:39
*/
public interface QuestionSubmitService extends IService<QuestionSubmit> {
    /**
     * 题目提交
     *
     * @param questionSubmitAddRequest  题目提交信息
     * @param loginUser
     * @return
     */
    long doQuestionSubmit(QuestionSubmitAddRequest questionSubmitAddRequest, User loginUser);

    /**
     * 获取查询条件
     *
     * @param questionSubmitQueryRequest
     * @return
     */
    QueryWrapper<QuestionSubmit> getQueryWrapper(QuestionSubmitQueryRequest questionSubmitQueryRequest);

    /**
     * 获取题目封装
     *
     * @param questionSubmit
     * @param loginUser
     * @return
     */
    QuestionSubmitVO getQuestionSubmitVO(QuestionSubmit questionSubmit, User loginUser);

    /**
     * 分页获取题目封装
     *
     * @param questionSubmitPage
     * @param loginUser
     * @return
     */
    Page<QuestionSubmitVO> getQuestionSubmitVOPage(Page<QuestionSubmit> questionSubmitPage, User loginUser);
}
