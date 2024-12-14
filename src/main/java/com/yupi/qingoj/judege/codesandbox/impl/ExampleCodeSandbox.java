package com.yupi.qingoj.judege.codesandbox.impl;

import com.yupi.qingoj.judege.codesandbox.CodeSandbox;
import com.yupi.qingoj.judege.codesandbox.model.ExecuteCodeRequest;
import com.yupi.qingoj.judege.codesandbox.model.ExecuteCodeResponse;
import com.yupi.qingoj.judege.codesandbox.model.JudgeInfo;
import com.yupi.qingoj.model.enums.JudgeInfoMessageEnum;
import com.yupi.qingoj.model.enums.QuestionSubmitStatusEnum;

import java.util.List;

/**
 * 示例代码沙箱
 */
public class ExampleCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        List<String> inputList = executeCodeRequest.getInputList();
        ExecuteCodeResponse executeCodeResponse = new ExecuteCodeResponse();
        executeCodeResponse.setOutputList(inputList);
        executeCodeResponse.setMessage("测试执行成功");
        executeCodeResponse.setStatus(QuestionSubmitStatusEnum.SUCCEED.getValue());
        JudgeInfo judgeInfo = new JudgeInfo();
        judgeInfo.setMessage(JudgeInfoMessageEnum.ACCEPTED.getText());
        judgeInfo.setMemory(100L);
        judgeInfo.setTime(100L);
        executeCodeResponse.setJudgeInfo(judgeInfo);
        return executeCodeResponse;
    }
}

