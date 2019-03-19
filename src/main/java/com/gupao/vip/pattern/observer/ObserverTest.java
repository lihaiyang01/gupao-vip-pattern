package com.gupao.vip.pattern.observer;

import com.google.common.eventbus.EventBus;

import java.util.Date;

public class ObserverTest {

    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Teacher teacher = new Teacher("tom");
        Question question = new Question("oceanli", "观察者模式的使用用途", new Date());
        eventBus.register(teacher);
        eventBus.post(question);
    }

}
