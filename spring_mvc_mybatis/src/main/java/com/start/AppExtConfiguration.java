package com.start;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * Spring 事件监听器
 */
@Component
public class AppExtConfiguration implements ApplicationListener<ContextRefreshedEvent> {

    /**
     * 在 Spring 完成容器初始化，可以查询到 Spring 容器中 立即加载的 Bean实例
     * @param event
     */
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        if (event.getApplicationContext().getParent() == null) {

        }
    }
}


