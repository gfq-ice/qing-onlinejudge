package com.yupi.qingoj.judege.codesandbox.impl;

import com.yupi.qingoj.judege.codesandbox.CodeSandbox;
import com.yupi.qingoj.judege.codesandbox.model.ExecuteCodeRequest;
import com.yupi.qingoj.judege.codesandbox.model.ExecuteCodeResponse;

/**
 * 第三方代码沙箱(调用网上现成的)
 */
public class ThirdPartyCodeSandbox implements CodeSandbox {
    @Override
    public ExecuteCodeResponse executeCode(ExecuteCodeRequest executeCodeRequest) {
        System.out.println("第三方代码沙箱");
        return null;
    }
}
