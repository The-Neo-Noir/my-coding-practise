package com.aneonoir.dsalgo.practise.oopd;

class Book {
    String title;

    void setTitle(String s) {

    }
}
//Write MyBook class here
class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title = s;
    }

}
