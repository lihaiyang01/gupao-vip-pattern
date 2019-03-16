package com.gupao.vip.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:58
 * @description:
 */
public class EmployeeA implements IEmployee {

    public void doing(String command) {
        System.out.println("我是员工A，我现在正在做事：");
        System.out.println(command);
    }
}
