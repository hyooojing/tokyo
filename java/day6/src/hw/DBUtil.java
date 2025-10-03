package hw;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBUtil {
	public static final String URL = "jdbc:oracle:thin:@//localhost:1521/FREEPDB1";
	public static final String USER = "tokyo"; // 계정
	public static final String PW = "1234"; // 비번

	public static Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			return DriverManager.getConnection(URL, USER, PW);

		} catch (Exception e) {
			System.out.println("DB 연결 실패: " + e.getMessage());
		}
		return null;
	}
}
