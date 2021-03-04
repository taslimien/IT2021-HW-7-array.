package arrayAndArrayList;

import java.util.ArrayList;

public class ArrayListHomeWork {

	public static void main(String[] args) {
		System.out.println("Welcome to my ArrayList program!! ");
		
		String[] mobile = new String[4];
		mobile[0] = "Apple";
		mobile[1] = "Samsung";
		mobile[2] = "LG";
		mobile[3] = "Nokia";
			System.out.println(mobile[1]);
		
		ArrayList mobilelist = new ArrayList();
		mobilelist.add("Apple");
		mobilelist.add("Samsung");
		mobilelist.add("LG");
		mobilelist.add("Nokia");
			System.out.println(mobilelist);
		

	}

}
