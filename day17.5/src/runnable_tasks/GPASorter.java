package runnable_tasks;
import static utils.CollectionUtils.sortStudentsByGPA;
import static utils.IOUtils.storeStudentDetails;

import java.util.ArrayList;

import com.app.core.Student;
public class GPASorter implements Runnable {
	private ArrayList<Student> list;
	private String fileName; 
	public GPASorter(ArrayList<Student> list, String fileName) {
		super();
		this.list = list;
		this.fileName = fileName;
	}
	@Override
	public void run() {
		// thrd name strted
		System.out.println(Thread.currentThread().getName() + " strted ");
		try {
			//HM & file Name will be passed by main thread
			//HM ---> sort ---save
			storeStudentDetails(sortStudentsByGPA(list), fileName);
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " exc " + e);
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " over ");


	}

}
