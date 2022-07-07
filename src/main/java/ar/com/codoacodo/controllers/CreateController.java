package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Statement;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*HERENCIA*/
	//Create controller es hijo de:
@WebServlet("/CreateController")
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
		
			// pedir una Conexion: AdministradorDeConexion.getConection()
			Connection con = AdministradorDeConexiones.getConnection();
			if(con != null) { 
				// insert en la db > SQL: INSERT INTO....
				String sql = "INSERT INTO PRODUCTO (nombre, precio,fecha_creacion,imagen,codigo) ";
				sql += "VALUES('"+nombre+"',"+precio+",CURRENT_DATE(),'"+imagen+"','"+codigo+"')";
				
				//control de errores
				try {
					Statement st = con.createStatement();			
					st.execute(sql);
					
					//cierre de conexion
					con.close();
					
					//getServletContext().getRequestDispatcher("/api/ListadoController").forward(req, resp);
					
					resp.sendRedirect(req.getContextPath()+"/api/ListadoController");
				}catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	
	}


	 