package com.driver;

public class Main {
    public static void main(String[] args){
        Product p=new Product();
        System.out.println(p.product(3,5));;
        System.out.println(p.product(3,5,8));;
        System.out.println(p.product(3.4,5.0));;
    }
    static class Product{
        public int x;
        public int y;
        public int z;
        public Double a;
        public Double b;

      public int product(int x,int y){
          return x+y;
      }
      public int product(int x,int y,int z){
          return x+y+z;
      }
      public double product(double a,double b){
          return a+b;
      }
    }

}