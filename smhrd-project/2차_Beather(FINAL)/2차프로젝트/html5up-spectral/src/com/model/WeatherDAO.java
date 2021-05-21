package com.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class WeatherDAO {
	PreparedStatement psmt = null;
	Connection conn = null;
	ResultSet rs = null;
	int cnt = 0;
	ArrayList<WeatherDTO> weatherlist = null;
	WeatherDTO dto = null;

	public void conn() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String db_url = "jdbc:oracle:thin:@localhost:1521:xe";
			String db_id = "hr";
			String db_pw = "hr";
			conn = DriverManager.getConnection(db_url, db_id, db_pw);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public void close() {
		try {
			if (rs != null) {
				rs.close();
			}
			if (psmt != null) {
				psmt.close();
			}
			if (conn != null) {
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public ArrayList<WeatherDTO> selectAllWeather() {
		weatherlist = new ArrayList<WeatherDTO>();
		conn();

		try {
			String sql = "SELECT * FROM WEATHER";
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while (rs.next()) {
				int index_num = rs.getInt(1);
				String location = rs.getString(2);
				String day = rs.getString(3);
				String temp = rs.getString(4);
				String humidity = rs.getString(5);
				String rainprob = rs.getString(6);
				String sky = rs.getString(7);

				WeatherDTO dto = new WeatherDTO(index_num, location, day, temp, humidity, rainprob,sky);
				weatherlist.add(dto);
			}
			

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			close();
		}

		return weatherlist;
	}

}
