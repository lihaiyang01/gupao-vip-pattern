package com.gupao.vip.pattern.delegate;

/**
 * @author: oceanLi
 * @date: 2019/3/16 0016 11:57
 * @description:
 */
public class Boss {

    public void command(String command, Leader leader) {
        leader.doing(command);
    }
}
