package service;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import Dao.IPLImplementation;
import model.IPL;

public class IPLService
{
	public void findAll() throws ClassNotFoundException, SQLException
	{
	List<IPL>list=	new IPLImplementation().findAll();
	for(IPL i:list)
	{
		System.out.println(i);
	}
	}
	public void insertNew() throws ClassNotFoundException, SQLException
	{
		IPL i=new IPL();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int teamid=sc.nextInt();
	System.out.println("enter the teamname");
	String teamname=sc.next();
	System.out.println("enter the city");
	String  city=sc.next();
	System.out.println("enter the state");
	String  state=sc.next();
	i.setTeamid(teamid);
	i.setTname(teamname);
	i.setCity(city);
	i.setState(state);
	new IPLImplementation().insertNew(i);
	}
	public void updateIPL() throws ClassNotFoundException, SQLException
	{
		IPL i=new IPL();
	Scanner sc=new Scanner(System.in);
	
	System.out.println("enter the teamname");
	String teamname=sc.next();
	System.out.println("enter the city");
	String  city=sc.next();
	System.out.println("enter the state");
	String  state=sc.next();
	System.out.println("enter the id");
	int teamid=sc.nextInt();
	
	i.setTname(teamname);
	i.setCity(city);
	i.setState(state);
	i.setTeamid(teamid);
	new IPLImplementation().updateNew(i);
	}
	public void DeleteIPL() throws ClassNotFoundException, SQLException
	{
		IPL i=new IPL();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the id");
	int teamid=sc.nextInt();
	
	i.setTeamid(teamid);
	
	new IPLImplementation().DeleteIPL(i);
	}
}
