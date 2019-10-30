package org.apache.dubbo.demo.consumer.comp;

import org.apache.dubbo.demo.DemoService;

/**
 * 类说明:
 *
 * <pre>
 * Modify Information:
 * Author        Date          Description
 * ============ ============= ============================
 * VilderLee    2019/10/30      Create this file
 * </pre>
 */
public class DemoServiceStub implements DemoService {

    private DemoService demoService;

    public DemoServiceStub(DemoService demoService) {
        this.demoService = demoService;
    }

    @Override public String sayHello(String name) {
        if (name.equals("vilderlee")){
            return "你好，李潮！";
        }else {
            return demoService.sayHello(name);
        }
    }
}
