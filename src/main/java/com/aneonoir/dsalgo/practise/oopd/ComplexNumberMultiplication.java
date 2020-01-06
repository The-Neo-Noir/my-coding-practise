package com.aneonoir.dsalgo.practise.oopd;

/**
 * link: https://leetcode.com/problems/complex-number-multiplication/
 *
 * todo: make a video cribbing about others code.
 *
 * tag: oop, string.
 */
public class ComplexNumberMultiplication {


    public String complexNumberMultiply(String a, String b) {
        return  stringToComplex(a).multiply(stringToComplex(b)).toString();
    }
    private Complex stringToComplex(String str){
        int real =  Integer.parseInt(str.substring(0,str.indexOf("+")));
        int imag= Integer.parseInt(str.substring(str.indexOf("+")+1,str.indexOf("i")));
        Complex x= new Complex(real,imag);
        System.out.println(x);
        return x;
    }
    class Complex{
        int real;
        int imaginary;
        Complex( int real, int imaginary){
            this.real=real;
            this.imaginary= imaginary;
        }
        public Complex multiply( Complex operand){
            int real1 = this.real*operand.real; // a*c
            int real2= this.imaginary* operand.imaginary * -1;
            int real=real1+real2;

            int imag1= this.imaginary*operand.real;
            int imag2= this.real*operand.imaginary;
            int img= imag1+imag2;
            return new Complex(real,img);
        }
        public String toString(){
            return real+"+"+imaginary+"i";
        }
    }
}
