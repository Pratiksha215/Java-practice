package tester;
import static java.lang.Thread.currentThread;
import static utils.CollectionUtils.populateList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;

import runnable_tasks.DoBSorter;
import runnable_tasks.GPASorter;

public class TestCollectionIOThreads {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.println("Enter file names");
			String fileName1=sc.nextLine();
			String fileName2=sc.nextLine();
			//get populated list from CollectionUtils
			ArrayList<Student> list = populateList();
			//create tasks , attach these tasks to threads , start thrds
			Thread t1=new Thread(new GPASorter(list, fileName1));//t1 : NEW
			Thread t2=new Thread(new DoBSorter(list, fileName2));//t2 : NEW
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
