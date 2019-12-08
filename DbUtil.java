package top.hiai.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 * @author www.hiai.top
 */
public class DbUtil {
	private String dbUrl="jdbc:mysql://localhost:3306/db_courseSelect";
	private String dbUserName="root";
	private String dbPassword="123456";
	private String jdbcName="com.mysql.jdbc.Driver";
	/**
	 * 获取数据库连接
	 * @return
	 * @throws Exception
	 */
public Connection getCon() throws Exception{
	Class.forName(jdbcName);
	Connection con=DriverManager.getConnection(dbUrl,dbUserName,dbPassword);
	return con;
}
public void closeCon(Connection con) throws Exception{
	if(con!=null){
		
		con.close();
	}
}
public static void main(String[] args) {
	DbUtil dbUtil=new DbUtil();
	try {
		dbUtil.getCon();
		System.out.println("数据库连接成功!");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
