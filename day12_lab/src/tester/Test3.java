package tester;

/*
 * 2. Display sum of product prices of a specific category.
I/P category name
o/p sum of prices
 */
import static utils.CollectionUtils.populateData;

import java.util.List;
import java.util.Scanner;

import com.app.core.Category;
import com.app.core.Product;
public class Test3 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in)) {
		List<Product> productList = populateData();
		System.out.println("Original list ");
		productList.forEach(p->System.out.println(p));
		//filter method doesn't exist with List
		//List<Product> ---> Stream<Product>
		System.out.println("Enter category name");
		//display prices of products from a specific category
		Category selectedCategory=Category.valueOf(sc.next().toUpperCase());
		System.out.println("Filtered list");
		 productList.stream().//List --> Stream 
		 filter(p->p.getProductCatgeory().equals(selectedCategory)).//stream of products filtered by category
		 forEach(p->System.out.println(p.getPrice()));//display prices of filtered products
		 //sum of prices of products from the specified category.
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
