package com.cg.day2assignment;
class Calculator{
	public void add(int a,int b) {
		int ans=a+b;
		System.out.println("addition of num="+ans);
	}
     public void sub(int a,int b) {
    	 int ans=a-b;
 		System.out.println("subtraction of num="+ans);
	 }
      public void mul(int a,int b) {
    	  int ans=a*b;
  		System.out.println("multiplication of num="+ans);
      }
      public void div(int a,int b) {
    	  int ans=a/b;
  		System.out.println("division of num="+ans);
      }
    }
class Scicalculator extends Calculator{
	public void square(int a) {
		 int ans=a*a;
	  		System.out.println("square of num="+ans);
	}
	public void cube(int a) {
		 int ans=a*a*a;
	  		System.out.println("cube of num="+ans);
	}
	public void power(int a,int power) {
		int ans=1;
		for(int i=0;i<power;i++) {
			ans=ans*a;
		}
	  		System.out.println("power of num="+ans);
	}
	public void fact(int a) {
		 int ans=1;
		 for(int i=1;i<=a;i++)
		 {
			 ans=ans*i;
		 }
	  		System.out.println("factorial of num="+ans);
	}
	
}
public class Que9clac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calculator c=new Scicalculator();
		c.add(1, 2);
		c.sub(3, 2);
		c.mul(2, 3);
        c.div(4, 2);
		c.cube(3);
		c.square(3);
		c.fact(4);
	
	}

}
