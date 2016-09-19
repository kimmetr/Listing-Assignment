package com.company;

public class DataStructure<E> {
    public E[] data;
    private int size = 100;
    private int next = 0;

    public DataStructure() {
        data = (E[]) new Object[this.size];
    }

    public DataStructure(int size) {
        this.size = size;
        data = (E[]) new Object[this.size];
    }

    public void addElt(E object) {
        data[next] = object;
        next++;
    }

    public void showAllListings() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i].toString());
        }
    }
}
