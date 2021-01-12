package com.github.lab.spring;

import com.github.lab.LabApplicationTests;
import com.github.lab.service.ITestService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhaojiejun
 * @date 2021/1/7 9:06 下午
 **/
public class BeanDefinitionTest extends LabApplicationTests {
    @Autowired
    private ITestService iTestService;

    @Test
    void test_01() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(BeanDefinitionTest.class);
        boolean containsBean = annotationConfigApplicationContext.containsBean("testServiceImpl");
        System.out.println("单元测试中bean是否存在" + containsBean);
        iTestService.say();
    }
}
