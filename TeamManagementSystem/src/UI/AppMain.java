package UI;

import java.sql.SQLException;
import java.util.Scanner;

import service.IPLService;

public class AppMain {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		String s;
		System.out.println("IPL Management System");
		System.out.println("1.List the IPL");
		System.out.println("2.Insert the IPL");
		System.out.println("3.Update the IPL");
		System.out.println("4.Delete the IPL");
		do
		{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice");
		int choice=sc.nextInt();
		IPLService service=new IPLService();
		switch(choice)
		{
			case 1:
				service.findAll();
				break;
			case 2:
				service.insertNew();
				break;
			case 3:
				service.updateIPL();
				break;
			case 4:
				service.DeleteIPL();
				break;
		}
		System.out.println("do u want to continue");
		s=sc.next();
		}
		while(s.equals("yes"));

	}

}
