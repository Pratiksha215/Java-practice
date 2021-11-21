package runnable_tasks;
import static utils.CollectionUtils.sortStudentsByDoB;
import static utils.IOUtils.storeStudentDetails;
import java.util.HashMap;

import com.app.core.Student;
public class DoBSorter implements Runnable {
	private HashMap<Integer, Student> map;
	private String fileName;
	public DoBSorter(HashMap<Integer, Student> map, String fileName) {
		super();
		this.map = map;
		this.fileName = fileName;
	}
	@Override
	public void run() {
		// thrd name strted
		System.out.println(Thread.currentThread().getName() + " strted ");
		try {
			//HM & file Name will be passed by main thread
			//HM ---> sort ---save
			storeStudentDetails(sortStudentsByDoB(map), fileName);
		} catch (Exception e) {
			System.out.println("err in thrd " + Thread.currentThread().getName() + " exc " + e);
		}

		System.out.println(Thread.currentThread().getName() + " over ");


	}

}
