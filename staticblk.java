import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class staticblk {

static int B = 0;
static int H = 0;
static boolean flag = true;

static Scanner s = new Scanner(System.in);
static{
    B = s.nextInt();
    H = s.nextInt();
    if(B <= 0 || H <= 0){
        flag = false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }   
}
/*Alternate Solution
static Scanner input = new Scanner(System.in);
static boolean flag = true;
static int B = input.nextInt();
static int H = input.nextInt();

static{
    try{
        if(B <= 0 || H <= 0){
            flag = false;
            throw new Exception("Breadth and height must be positive");
        }
    }catch(Exception e){
        System.out.println(e);
    }

}*/
public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class
