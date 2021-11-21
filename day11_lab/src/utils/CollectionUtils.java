package utils;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import com.customer.Customer;
import static java.time.LocalDate.*;
import static com.customer.custType.*;

public class CollectionUtils {
	public static ArrayList<Customer> populateList(){
		ArrayList<Customer> l1=new ArrayList<>();
		l1.add(new Customer("Jyoti", "user1", "jyoti@gmail.com", parse("2020-02-09"), 2000.0, SILVER));
		l1.add(new Customer("Vedanti", "user2", "vedanti@gmail.com", parse("2017-06-23"), 3450.0, GOLD));
		l1.add(new Customer("Kajol", "user3", "kajol@gmail.com", parse("2019-12-29"), 9000.0, PLATINUM));
		l1.add(new Customer("Nibha", "user4", "nibha@gmail.com", parse("2021-07-16"), 2400.0, SILVER));

		return l1;
	}
	public static Map<String, Customer> populateMap(List<Customer> custlist){
		//1. create empty Hashmap
		HashMap<String, Customer> hm=new HashMap<>();
		//populate the hashmap
		for(Customer c: custlist)
			hm.put(c.getEmail(), c);
		return hm;//collections util returns populated map to the caller method.
	}
	

}
