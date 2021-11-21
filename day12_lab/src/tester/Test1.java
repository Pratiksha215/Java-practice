package tester;
/*
 * 0. Write a Tester 
get populated list of products . Display names of all products.
(Hint : Use forEach method on a Product list)

 */
import static utils.CollectionUtils.populateData;
public class Test1 {

	public static void main(String[] args) {
		System.out.println("All product names : ");
		populateData().forEach(p->System.out.println(p.getName()));

	}

}
