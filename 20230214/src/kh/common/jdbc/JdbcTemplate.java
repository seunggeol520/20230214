package kh.common.jdbc;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import kh.common.jdbc.JdbcTemplate;

public class JdbcTemplate {
	
	public static Connection getConnection() {
		Connection conn = null;
		Properties prop = new Properties();
		
		try {
			URL url = JdbcTemplate.class.getResource("./");
			String currentPath = url.getPath();
			String filePath = currentPath + "driver.properties";
//			url:    file:/C:/workspace/java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/20230203_myWeb/WEB-INF/classes/first/common/
//			currentPath: /C:/workspace/java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/20230203_myWeb/WEB-INF/classes/first/common/
			
			//C:\\workspace\\java\\20230203_myWeb\\src\\first\\common\\driver.properties
			prop.load(new BufferedReader(new FileReader(new File(filePath))));
			String lhDriver = prop.getProperty("lh.driver");
			String lhUrl = prop.getProperty("lh.url");
			String lhId = prop.getProperty("lh.username");
			String lhPw = prop.getProperty("lh.password");
			
			Class.forName(lhDriver);
			conn = DriverManager.getConnection(lhUrl, lhId, lhPw);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) {
				System.out.println("성공!");
			} else {
				System.out.println("실패!");
			}
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void close(Statement stmt) {
		try {
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}  catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// commit
	
	public static void commit(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.commit();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// rollback
	
	public static void rollback(Connection conn) {
		try {
			if(conn != null && !conn.isClosed()) {
				conn.rollback();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
