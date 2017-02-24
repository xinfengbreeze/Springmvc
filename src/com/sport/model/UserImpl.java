package com.sport.model;

/**
 * User: kaifeng.yuan
 * Date: 2/22/17.
 */
public class UserImpl implements User{
    public int id;
    public String name;
    public String password;
    public int age;
    public String job;

    @Override
    public String getName() {
        return name;
    }
    @Override
    public void setName(String name) {
        this.name = name;
    }
    @Override
    public int getAge() {
        return age;
    }
    @Override
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String getJob() {
        return job;
    }
    @Override
    public void setJob(String job) {
        this.job = job;
    }
    @Override
    public String getPassword() {
        return password;
    }
    @Override
    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserImpl{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
