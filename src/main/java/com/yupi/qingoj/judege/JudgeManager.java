package com.yupi.qingoj.judege;

import com.yupi.qingoj.judege.strategy.DefaultJudgeStrategy;
import com.yupi.qingoj.judege.strategy.JavaLanguageJudgeStrategy;
import com.yupi.qingoj.judege.strategy.JudgeContext;
import com.yupi.qingoj.judege.strategy.JudgeStrategy;
import com.yupi.qingoj.judege.codesandbox.model.JudgeInfo;
import com.yupi.qingoj.model.entity.QuestionSubmit;
import org.springframework.stereotype.Service;

/**
 * 判题管理（简化调用）
 */
@Service
public class JudgeManager {

    /**
     * 执行判题
     *
     * @param judgeContext
     * @return
     */
    JudgeInfo doJudge(JudgeContext judgeContext) {
        QuestionSubmit questionSubmit = judgeContext.getQuestionSubmit();
        String language = questionSubmit.getLanguage();
        JudgeStrategy judgeStrategy = new DefaultJudgeStrategy();
        if ("java".equals(language)) {
            judgeStrategy = new JavaLanguageJudgeStrategy();
        }
        return judgeStrategy.doJudge(judgeContext);
    }

}
