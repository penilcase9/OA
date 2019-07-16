package com.jv.web.aop;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class WebLogAspect {

    @Before("execution(* com.jv.web.service..*.*(..))")
    public void log(){
        //logger.info("before method log done"+ AopContext.currentProxy().getClass());
        log.info("before method log done");
    }
}
