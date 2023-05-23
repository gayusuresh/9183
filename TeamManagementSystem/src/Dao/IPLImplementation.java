package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.IPL;

public class IPLImplementation implements IPLDao
{

	@Override
	public List<IPL> findAll() throws ClassNotFoundException, SQLException
	{
		
		ArrayList <IPL>list=new ArrayList<IPL>();
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9183batch","root","root");//connection steps
        PreparedStatement statement=con.prepareStatement("select * from ipl");
        ResultSet rs=statement.executeQuery();
        while(rs.next())
        {
        	IPL i=new IPL();
        	i.setTeamid(rs.getInt(1));
        	i.setTname(rs.getString(2));
        	i.setCity(rs.getString(3));
        	i.setState(rs.getString(4));
        	 list.add(i);
        }
       
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public IPL insertNew(IPL i) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9183batch","root","root");//connection steps
        PreparedStatement statement=con.prepareStatement("insert into ipl values(?,?,?,?)");
        statement.setInt(1, i.getTeamid());
        statement.setString(2, i.getTname());
        statement.setString(3, i.getCity());
        statement.setString(4, i.getState());
        statement.executeUpdate();
		return i;
	}
	
	public IPL updateNew(IPL i)throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9183batch","root","root");//connection steps
        PreparedStatement statement=con.prepareStatement("update ipl set teamname=?,city =?,state=? where teamid=?");
       
        statement.setString(1, i.getTname());
        statement.setString(2, i.getCity());
        statement.setString(3, i.getState());
        statement.setInt(4, i.getTeamid());
        statement.executeUpdate();
		return i;
	}
	public IPL DeleteIPL(IPL i)throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");//load the driver
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/9183batch","root","root");//connection steps
        PreparedStatement statement=con.prepareStatement("delete from ipl where teamid=?");
       
       
        statement.setInt(1, i.getTeamid());
        statement.executeUpdate();
		return i;
	}

	


}
