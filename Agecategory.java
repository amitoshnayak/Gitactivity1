package com.acc.lkm.JavaDay1;
import java.util.*;
import java.io.*;
import java.lang.*;

public class Agecategory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int age;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the age");
       age=sc.nextInt();
       switch(age) {
       case 1:
    	   if(age<13)
    	   System.out.println("Child");
    	   break;
       case 2:
    	   if(age>=13&&age<20)
    	   System.out.println("Teenager");
    	   break;
       case 3:
    	   if(age>=20&&age<65)
    	   System.out.println("Adult");
    	   break;
        
       }
	}

}
