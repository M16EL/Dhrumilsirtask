package Sir_na_task;

public class Pojo1 {

	public static void main(String[] args) {
		Pojo p = new Pojo();
		p.setId(1);
		p.setName("Meet");
		p.setAddress("Ahmedabad");
		p.setPhone_no(635660);
		p.setPincode(382330);
		
		System.out.println("ID: " + p.getId());
		System.out.println("Name: " + p.getName());
		System.out.println("Address: " + p.getAddress());
		System.out.println("PhoneNo: " + p.getPhone_no());
		System.out.println("Pincode: " + p.getPincode());
		
		System.out.println("ADDITION========>:");
		Addition a = new Addition();
		System.out.println(a.Add());
		System.out.println("SUBTRACTION========>:");
		Subtraction s = new Subtraction();
		System.out.println(s.Sub());
		System.out.println("MULTIPLICATION========>:");
		Multiplication m = new Multiplication();
		System.out.println(m.Mul());
		System.out.println("DIVISION========>");
		Division d = new Division();
		System.out.println(d.Div());

	}

}
