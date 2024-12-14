package com.yupi.qingoj.judege.codesandbox;

import com.yupi.qingoj.judege.codesandbox.model.ExecuteCodeRequest;
import com.yupi.qingoj.judege.codesandbox.model.ExecuteCodeResponse;

public interface CodeSandbox {
    /**
     * 执行代码
     * @param executeCodeRequest
     * @return
     */
    ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest);
}
