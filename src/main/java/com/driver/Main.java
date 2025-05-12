package com.driver;

public class Main {
    public static void main(String[] args){
        Product p=new Product();
        int ans=p.product(3,5);
        int ans1=p.product(3,5,8);
        double ans3=p.product(3.4,5.0);
    }
   public static class Product{


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