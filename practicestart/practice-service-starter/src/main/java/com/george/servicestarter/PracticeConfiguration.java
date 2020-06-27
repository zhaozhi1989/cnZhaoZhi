package com.george.servicestarter;

import com.george.add.service.impl.AddServiceImpl;
import com.george.api.service.AddService;
import com.george.api.service.MinusService;
import com.george.api.service.MinusServiceSupportNegativeImpl;
import com.george.minus.service.impl.MinusServiceNotSupportNegativeImpl;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author zhaozhi
 * @description 服务配置类
 * @since 2020/6/20
 */
@Configuration
public class PracticeConfiguration {

    @Bean
    public AddService createAddService() {
        System.out.println("addService 已创建");
        return new AddServiceImpl();
    }

    /**
     * 如果配置了george.supportnegative=true
     * 就实例化MinusServiceSupportNegativeImpl
     *
     * @return
     */
    @Bean
    @ConditionalOnProperty(prefix = "george", name = "supportnegative", havingValue = "true")
    public MinusService createSupportMinusService() {
        System.out.println("MinusService 减法服务支持返回结果为负数");
        return new MinusServiceSupportNegativeImpl();
    }

    /**
     * 如果没有配置了george.supportnegative=true
     * 就不会实例化MinusServiceSupportNegativeImpl
     * 这里的条件是如果没有MinusService类型的Bean，就在此实例化一个
     *
     * @return
     */
    @Bean
    @ConditionalOnMissingBean(MinusService.class)
    public MinusService createNoSupportMinusService() {
        System.out.println("MinusService 减法服务不支持返回结果为负数");
        return new MinusServiceNotSupportNegativeImpl();
    }
}
