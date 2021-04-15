package com.github.lab.aop;

import com.github.lab.context.RequestHolder;
import com.github.lab.dto.ResultDTO;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author zhaojiejun
 * @date 2021/4/14 10:02 下午
 **/
@Component
@Aspect
@Slf4j
@Order(2)
public class BizErrorAspect {
    /**
     * 切面点
     */
    private final String POINT_CUT = "execution(* com.github.lab.service..*.*(..))";

    @Pointcut(POINT_CUT)
    private void pointcut() {
    }


    @Around(value = POINT_CUT)
    public Object aroundApi(ProceedingJoinPoint proceedingJoinPoint) {
        log.info("环绕通知的目标方法名：" + proceedingJoinPoint.getSignature().getName());
        try {
            Long id = RequestHolder.getId();
            if (id == 3) {
                return ResultDTO.unSuccess("A001", "不能为2");
            }
            return proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return null;
    }


}
