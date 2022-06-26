package ar.com.codoacodo.connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class AdministradorDeConexiones {
		public static Connection getConnection() {
			String url = "jdbc:mysql://127.0.0.1:3306/codo-a-codo?serverTimeZone=UTC&userSSL=false";
			String username = "root";
			String password = "root";
			String driverName = "com.mysql.cj.jdbc.Driver";
		
				//control de errores
				Connection con = null;
				try {
					Class.forName(driverName);//carga en memoria el driver
					con = DriverManager.getConnection(url,username,password);
			}	catch(Exception e) {
				e.printStackTrace();
			}
				return con;
		}
		public static void main(String[] args) {
			Connection con = AdministradorDeConexiones.getConnection(); //f5me meto adentro de este metodo
			if (con!=null) {
				System.out.println ("La conexión se pudo establecer");
			}
			else {
				System.err.println ("Conexión fallida");
				
			}
		}
}
	