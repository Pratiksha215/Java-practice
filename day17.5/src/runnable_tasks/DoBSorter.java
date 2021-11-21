package runnable_tasks;
import static utils.CollectionUtils.sortStudentsByDoB;
import static utils.IOUtils.storeStudentDetails;

import java.util.ArrayList;

import com.app.core.Student;
public class DoBSorter implements Runnable {
	private ArrayList<Student> list;
	private String fileName; 
	public DoBSorter(ArrayList<Student> list, String fileName) {
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
			storeStudentDetails(sortStudentsByDoB(list), fileName);
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " exc " + e);
			e.printStackTrace();
		}

		System.out.println(Thread.currentThread().getName() + " over ");


	}

}
