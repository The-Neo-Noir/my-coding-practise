package com.aneonoir.dsalgo.practise.oopd;

class Printer<T> {
    public void printArray(T[] data) {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i]);
        }
    }

}

