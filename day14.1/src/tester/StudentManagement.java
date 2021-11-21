package tester;

import static com.app.core.Subject.valueOf;
import static java.time.LocalDate.parse;
import static utils.CollectionUtils.populateMap;
import static utils.IOUtils.saveStudentDetails;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

import com.app.core.Student;
import com.app.core.StudentHandlingException;
import com.app.core.Subject;

public class StudentManagement {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			// get populated map from utils
			HashMap<Integer, Student> map = populateMap();
			boolean exit = false;
			while (!exit) {
				System.out.println("Menu 1. Admit Student 2.Cancel Admission\n"
						+ "3. Display names of all students enrolled in specific subject\r\n"
						+ "I/P subject 4.  Display names of all students with age > 22 & enrolled in specific subject"
						+ "5 . Change GPA 6 Exit");
				System.out.println("Choose Option");
				try {
					switch (sc.nextInt()) {
					case 1:
						System.out.println("Enter student details rollNo,  name,  dob,  currentSubject,  gpa)");
						int rollNo = sc.nextInt();
						if (map.containsKey(rollNo))
							throw new StudentHandlingException("Dup roll no!!!!!");
						map.put(rollNo, new Student(rollNo, sc.next(), parse(sc.next()),
								valueOf(sc.next().toUpperCase()), sc.nextDouble()));
						System.out.println("Student admission successful....");
						break;

					case 2:
						System.out.println("Enter roll no to cancel admission");
						Student s = map.remove(sc.nextInt());
						if (s == null)
							throw new StudentHandlingException("Invalid roll no!!!!!");
						System.out.println(s.getName() + " cancelled admission");

						break;
					case 3: System.out.println("Enter current subject");
					//convert string --> enum
					Subject curntSubject=valueOf(sc.next().toUpperCase());
					//searching by value based 
					System.out.println("Names of students with subject "+curntSubject);
					for(Student s1 : map.values())
						if(s1.getCurrentSubject().equals(curntSubject))
							System.out.println(s1.getName());
					//OR 
					map.values().stream()//Collection -->Stream<Student>
					.filter(s1 -> s1.getCurrentSubject().equals(curntSubject))//filtered strm of students : subject
					.forEach(s1->System.out.println(s1.getName()));		
					
						
						break;
					case 4: //Display names of all students with age > 22 & enrolled in specific subject
						System.out.println("Enter current subject");
						curntSubject=valueOf(sc.next().toUpperCase());
						//searching by value based 
						System.out.println("Names of students with subject"+curntSubject+" n age > 22 ");
						for(Student s1 : map.values())
							if(s1.getCurrentSubject().equals(curntSubject) && s1.computeAge() > 22)
								System.out.println(s1.getName());
						//OR
						map.values().stream() //Stream<Student>
						.filter(s1->s1.getCurrentSubject().equals(curntSubject))
						.filter(s1 -> s1.computeAge()>22)
						.forEach(s1->System.out.println(s1.getName()));
			
				
						break;
					case 5: System.out.println("Enter roll no dob to update GPA");
					s=map.get(sc.nextInt());
					if (s == null)
						throw new StudentHandlingException("Invalid roll no!!!!!!");
					LocalDate dob=parse(sc.next());//accepting dob from user
					if(s.getDob().equals(dob))
					{
						System.out.println("Enter new GPA");
						s.setGpa(sc.nextDouble());
					}
					else 
						throw new StudentHandlingException("Invalid DoB!!!!!");
						break;
					case 6:
						exit = true;
						//Tester has to call IoUtil's save method for saving student details
						System.out.println("Enter file Name to store details");
						saveStudentDetails(map, sc.next());
						break;
					}
				} catch (Exception e) {
					System.out.println("Error " + e);
					System.out.println("Pls retry....");
				}
				sc.nextLine();// to read pending tokens form the sc's buffer
			}

		}

	}

}
