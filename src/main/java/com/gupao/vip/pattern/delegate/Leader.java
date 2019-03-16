package com.gupao.vip.pattern.delegate;

import java.util.HashMap;
import java.util.Map;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:58
 * @description:
 */
public class Leader implements IEmployee {

    private static Map<String, IEmployee> map = new HashMap<String, IEmployee>();

    static {
        map.put("端茶", new EmployeeA());
        map.put("倒水", new EmployeeB());
    }

    public void doing(String command) {
        System.out.println("BOSS让我做事: " + command);
        map.get(command).doing(command);
    }
}
