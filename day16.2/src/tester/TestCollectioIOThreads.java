package tester;
import static java.lang.Thread.currentThread;
import static utils.CollectionUtils.populateMap;

import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DoBSorter;
import runnable_tasks.GPASorter;

public class TestCollectioIOThreads {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file names");
			String fileName1=sc.nextLine();
			String fileName2=sc.nextLine();
			//get populated map from CollectionUtils
			HashMap<Integer, Student> studentMap = populateMap();
			//create tasks , attach these tasks to threads , start thrds
			Thread t1=new Thread(new GPASorter(studentMap, fileName1));//t1 : NEW
			Thread t2=new Thread(new DoBSorter(studentMap, fileName2));//t2 : NEW
			t1.start();
			t2.start();
			//ensure no orphan thrds.
			System.out.println("Waiting for child thrds to complete exec");
			t1.join();
			t2.join();
			System.out.println("main over....");
			
			
			
		}catch (Exception e) {
			System.out.println("err in "+currentThread().getName()+" exc "+e);
		}

	}

}
