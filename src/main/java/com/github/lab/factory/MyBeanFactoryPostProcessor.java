package com.github.lab.factory;

import com.github.lab.service.ITestService;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * @author zhaojiejun
 * @date 2021/1/9 9:13 下午
 **/
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        ITestService iTestService = configurableListableBeanFactory.getBean(ITestService.class);
        boolean iTestService1 = configurableListableBeanFactory.containsBean("testServiceImpl");
        System.out.println(iTestService1);
        boolean iTestService2 = configurableListableBeanFactory.containsBean("test2ServiceImpl");
        System.out.println(iTestService2);
        System.out.println("提前初始化");
    }
}
