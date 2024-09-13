package clase05.checked.exceptions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestSqlException {

	public static void main(String[] args) {
		
		String rutaBaseDatos = "jdbc:mysql://localhost:3307/dbLP2";
        String usuario = "root";
        String password = "";
        
        try {
        	
        	// https://www.mysql.com/products/connector/
            Connection conexion = DriverManager.getConnection(rutaBaseDatos, usuario, password);
            System.out.println("Falla por aca 1");
        } catch (SQLException e) {
        	System.out.println("Falla por aca 2");
            e.printStackTrace();
        }

	}

}
