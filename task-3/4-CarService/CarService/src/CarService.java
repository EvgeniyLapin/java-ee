import com.senla.dao.GarageDao;
import com.senla.dao.MasterDao;
import com.senla.dao.OrderDao;
import com.senla.model.Garage;
import com.senla.model.Master;
import com.senla.model.Order;
import com.senla.service.GarageService;
import com.senla.service.MasterService;
import com.senla.service.OrderService;

public class CarService {

	public static void main(String[] args) {
		
		OrderDao orderDao = new OrderDao();
		MasterDao masterDao = new MasterDao();
		GarageDao garageDao = new GarageDao();
		OrderService orderService = new OrderService();
		MasterService masterService = new MasterService();
		GarageService garageService = new GarageService();
		
		System.out.println("stock");
		orderDao.newDisplay();//show orders
		
		orderService.addTime();//change time
		System.out.println("after time offset");
		orderDao.newDisplay();
				
		orderService.orderAd();//add new order
		orderService.removeOrder();//remove order
		masterService.addMaster();//add new master
		masterService.removeMaster();//remove master
		garageService.addPlace();//add new place
		garageService.removePlace();//remove place
		orderService.closeOrder();//close order
		orderService.cancelOrder();//cancel order
		
		//after operations
		System.out.println("new");
		orderDao.newDisplay();
		
		//show place
		for(Garage c : garageDao.displayAll()) {
			System.out.println("id: " + c.getIdPlace() + "  " +  c.getPlace());
		}
		
		
		//show list of closed orders
		for(Order c : orderDao.displayClosed()) {
			System.out.print("id: " + c.getId() + "; ");
			System.out.print("Type: " + c.getOrderType() + "; ");
			System.out.println(c.getTime() + "  days ");
			
		}
		//show list of canceled orders
		for(Order c : orderDao.displayCanceled()) {
			System.out.print("id: " + c.getId() + "; ");
			System.out.print("Type: " + c.getOrderType() + "; ");
			System.out.println(c.getTime() + "  days ");
			
		}
		//show list of masters
		for(Master c : masterDao.displayAll()) {
			
			System.out.println("Master: " + c.getName());
			
			
		}
		
       

}
}
