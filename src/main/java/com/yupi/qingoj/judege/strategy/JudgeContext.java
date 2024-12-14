package com.yupi.qingoj.judege.strategy;

import com.yupi.qingoj.model.dto.question.JudgeCase;
import com.yupi.qingoj.judege.codesandbox.model.JudgeInfo;
import com.yupi.qingoj.model.entity.Question;
import com.yupi.qingoj.model.entity.QuestionSubmit;
import lombok.Data;

import java.util.List;

/**
 * 上下文(用于定义策略中要传递的参数)
 */

@Data
public class JudgeContext {

    private JudgeInfo judgeInfo;

    private List<String> inputList;

    private List<String> outputList;

    private List<JudgeCase> judgeCaseList;

    private Question question;

    private QuestionSubmit questionSubmit;

}

