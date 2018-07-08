//Tests the MVC pattern
public class Test {

	public static void main(String[] args) {
		
		CustomerModel m1 = new CustomerModel();
		CustomerView v1 = new CustomerView();
		CustomerController c1 = new CustomerController(m1, v1);
		
		c1.setNewCus("1ED4", "Tim", "Burt");
		
		c1.getCusInfo();		
	}

}
