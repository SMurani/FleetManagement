package fleetmanagement.vehicle.action;

import fleetmanagement.vehicle.bean.VehicleBeanI;
import fleetmanagement.vehicle.model.Vehicle;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class VehicleAction
 */
@SuppressWarnings("serial")
@WebServlet("/vehicle")
public class VehicleAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@EJB
	private VehicleBeanI vehicleBean;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter resp = response.getWriter();
		List<Vehicle> vehicles = vehicleBean.list();

		resp.println("<div class=\"text-right\">");
		resp.println("<a class=\"btn btn-success\"  onclick=\"vehicle.add()\">Add</a>");
		resp.println("</div>");

		for(Vehicle vehicle : vehicles){
			resp.println("<hr>");
			resp.println("<div class=\"row\">");
			resp.println("<div class=\"col-md-12\">");
			resp.println("RegNo:  "+vehicle.getRegNo()+" <button class=\"btn btn-small btn-danger pull-right glyphicon glyphicons-bin\">  delete</button>"+"<br>");
			resp.println("Vehicle Model  "+vehicle .getVehicleModel()+"<br>");
			resp.println("Aquisition Date:  "+vehicle .getAcuisitionDate()+"<br>");
			resp.println("Capacity:  "+vehicle.getCapacity()+"<br>");

			resp.println("</div>");
			resp.println("</div>");
		}
	}




	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}


}
