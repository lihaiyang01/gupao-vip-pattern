package com.gupao.vip.pattern.prototype.bean;

import java.io.Serializable;

/**
 * 课程名称
 */
public class Student implements Serializable {

    private static final long serialVersionUID = -7672831170848536819L;

    private String name;

    private String sex;

    private Integer age;

    private String weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}
