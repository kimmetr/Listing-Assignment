package com.company;

public class Listing implements Comparable<Listing> {
    private String name;
    private int age;

    public Listing() {
        this.name = " ";
        this.age = 0;
    }

    public Listing(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + ", " + age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Listing listing) {
        return 0;
    }
}

