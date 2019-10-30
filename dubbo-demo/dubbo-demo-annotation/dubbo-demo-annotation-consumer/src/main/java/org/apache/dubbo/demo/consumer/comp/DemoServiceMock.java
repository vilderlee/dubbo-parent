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
public class DemoServiceMock implements DemoService {


    @Override public String sayHello(String name) {
        return "Error!!!!!!!!!!!!!!!!!!!!!!!!!!!!";
    }
}
