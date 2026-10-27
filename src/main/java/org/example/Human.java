package org.example;

public class Human {
    private String name;

    public boolean isCute() {
        return isCute;
    }

    public void setCute(boolean cute) {
        isCute = cute;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    private boolean isCute;

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isCute=" + isCute +
                '}';
    }
}
