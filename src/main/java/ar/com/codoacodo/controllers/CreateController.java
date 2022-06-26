package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*HERENCIA*/
	//Create controller es hijo de:
public class CreateController extends HttpServlet{

	@Override
	protected void doPost (HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recibe los datos del front
		
		// en req recibe los datos que manda el form html
		// clave=valor
		
		// va a pedir una conexión (AdministradorDeConexion.getConection()
		// inset en la db >SQL: INSERT INTO...
		String nombre = req.getParameter("nombre");		
		String precio = req.getParameter("precio"); // convertir en float parseFloat
		String fechaCreacion = ""; // Se lo damos nosotrxs
		String imagen = req.getParameter("imagen");
		String codigo = req.getParameter("codigo");
		
		// pedir una Conexión: AdministradorDeConexion.getConection()
		Connection con = AdministradorDeConexiones.getConnection();
		if (con != null) {
			//inset en la db >SQL: INSERT INTO...
			String sql = "INSERT INTO PRODUCTO (nombre, precio, fecha_creacion, imagen, codigo)";
			sql += "VALUES ('"+nombre+"', '"+precio+"',CURDATE(),'"+imagen+"','"+codigo+"')";
		}
	}
}


	 