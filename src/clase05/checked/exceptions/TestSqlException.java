package clase05.checked.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSqlException {

	public static void main(String[] args) {
		
		String rutaBaseDatos = "jdbc:mysql://localhost:3306/db";
        String usuario = "root";
        String password = "1234";
        
        try {
        	
        	// https://www.mysql.com/products/connector/
            Connection conexion = DriverManager.getConnection(rutaBaseDatos, usuario, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }

	}

}
