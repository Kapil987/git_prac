package calculator;
import java.util.*;
//import java.io.*;
public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a ,b,res ;
		String ch;
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("enter + or - or / or *");
		ch=sc.next();
		switch(ch)
		{
		case "+":
			res=a+b;
			System.out.println("addition of "+a+ " and " +b+ " is "+ res);
			break;
		case "-":
			res=a-b;
			System.out.println("subtraction of "+a+ " and " +b+ " is "+ res);
			break;
		case "/":
			res=a/b;
			System.out.println("Division of "+a+ " and "+b+ " is "+ res);
			break;
		case "*":
			res=a*b;
			System.out.println("Multiplication of "+a+ " and "+b+ " is "+ res);
			break;
		default:
			System.out.println("you have choosen wrong option");

		}
		sc.close();

	}

}
