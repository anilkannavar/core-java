package com.xworkz.reservior.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.cj.protocol.Resultset;
import com.xworkz.reservior.dto.DamInfo;

public class DamInfoRepositoryImple implements DamInfoRepository{

	@Override
	public void insert(DamInfo damInfo) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/reservior";
		String username="root";
		String password="Xworkzodc@123";
		String insertQuery="insert into Dam values(?,?,?,?)";
		
		try {
			Connection connection= DriverManager.getConnection(jdbc, username, password);
		PreparedStatement preparedStatement	=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1, damInfo.getId());
		preparedStatement.setString(2, damInfo.getPlace());
		preparedStatement.setString(3, damInfo.getState());
		preparedStatement.setInt(4,damInfo.getHeight());
		preparedStatement.execute();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void update(String place, String state,int height) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/reservior";
		String username="root";
		String password="Xworkzodc@123";
		String updateQuery="update dam set state=?,place=? where height=?";
		
		try {
			Connection connection= DriverManager.getConnection(jdbc, username, password);
		PreparedStatement preparedStatement	=connection.prepareStatement(updateQuery);
		preparedStatement.setString(1,state);
		preparedStatement.setString(2,place);
		preparedStatement.setInt(3,height);
		preparedStatement.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public DamInfo select(String place) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/reservior";
		String username="root";
		String password="Xworkzodc@123";
		
		String selectQuery="select * from dam where place=?";
		ResultSet resultset=null;
        DamInfo damInfo=new DamInfo();
        
		try {
		Connection connection=DriverManager.getConnection(jdbc, username, password);
		PreparedStatement preparedStatement=connection.prepareStatement(selectQuery);
		preparedStatement.setString(1, place);
		resultset=preparedStatement.executeQuery();
        if (resultset.next()) {
        damInfo=new DamInfo();
        	System.out.println(resultset.getString("place"));
        	System.out.println(resultset.getString("state"));
        	System.out.println(resultset.getString("id"));
        	System.out.println(resultset.getString("height"));

        	damInfo.setPlace(resultset.getString("place"));
        	damInfo.setPlace(resultset.getString("state"));
        	damInfo.setPlace(resultset.getString("id"));
        	damInfo.setPlace(resultset.getString("height"));
        }
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return damInfo;
	}

}
