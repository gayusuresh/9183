package Dao;

import java.sql.SQLException;
import java.util.List;

import model.IPL;

public interface IPLDao 
{
	public List<IPL>findAll() throws ClassNotFoundException, SQLException;
	public IPL insertNew(IPL i) throws ClassNotFoundException, SQLException;
	public IPL updateNew(IPL i) throws ClassNotFoundException, SQLException;
	public IPL DeleteIPL(IPL i) throws ClassNotFoundException, SQLException;


}
