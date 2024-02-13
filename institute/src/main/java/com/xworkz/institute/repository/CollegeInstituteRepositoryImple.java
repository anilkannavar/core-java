package com.xworkz.institute.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.institute.dto.CollegeInstituteDto;

public class CollegeInstituteRepositoryImple implements CollegeInstituteRepository{

	@Override
	public void add(CollegeInstituteDto collegeInstituteDto) {

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String jdbc="jdbc:mysql://localhost:3306/institute";
		String username="root";
		String password="Xworkzodc@123";
		
		String insertQuery="insert into college values(?,?,?,?,?)";
		
		
		try {
		Connection connection=	DriverManager.getConnection(jdbc, username, password);
		PreparedStatement preparedStatement=connection.prepareStatement(insertQuery);
		preparedStatement.setInt(1,collegeInstituteDto.getId());
		preparedStatement.setString(2, collegeInstituteDto.getName());
		preparedStatement.setString(3, collegeInstituteDto.getAddress());
		preparedStatement.setInt(4, collegeInstituteDto.getCode());
		preparedStatement.setString(5, collegeInstituteDto.getLocation());
		preparedStatement.execute();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
