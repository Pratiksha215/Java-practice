package tester;
/*
 * 1. Remove all expired products from the list
(expiry is 12 months from manufacture date)
 */
import static utils.CollectionUtils.populateData;

import java.util.List;

import com.app.core.Product;
public class Test2 {

	public static void main(String[] args) {
		List<Product> list = populateData();
		System.out.println("Original list ");
		list.forEach(p->System.out.println(p));
		list.removeIf(p-> p.isExpired());
		System.out.println("Product list after removing expired products");
		list.forEach(p->System.out.println(p));

	}

}
