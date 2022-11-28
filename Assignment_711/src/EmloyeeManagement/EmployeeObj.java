package EmloyeeManagement;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
//class EmployeeOperations implements Serializable{
//	
//	
//	void updateEmployee(int id, Employee employee) {
//		Iterator<Employee> itr = EmpList.iterator();
//		boolean idFound = false;
//		while (itr.hasNext()) {
//			Employee emp = itr.next();
//			if (emp.getEmpId() == id) {
//				idFound = true;
//				emp.setEmpId(employee.getEmpId());
//				emp.setEmpName(employee.getEmpName());
//				emp.setEmpDesignation(employee.getEmpDesignation());
//				emp.setEmpSalary(employee.getEmpSalary());
//
//			}
//		}
//	}
//	void deleteEmployee(int id) {
//		Iterator<Employee> itr = EmpList.iterator();
//		boolean idFound = false;
//		while (itr.hasNext()) {
//			idFound = true;
//			Employee emp = itr.next();
//			if (emp.getEmpId() == id) {
//				EmpList.remove(emp);
//			}
//		}
//	}
//
//	
//}

public class EmployeeObj {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeService Empservice=new EmployeeService();
		Employee employee1=new Employee();
		Employee employee=new Employee();
		employee1=new Employee(10, "Nani", 12000, "front-end");
		Employee employee2=new Employee(11, "hhwllow", 12500, "Back end");
		EmployeeService.AddNewEmployee(employee);
		EmployeeService.AddNewEmployee(employee2);
		EmployeeService.AddNewEmployee(employee1);
		
		FileOutputStream outStream1 = new FileOutputStream("C:\\Users\\kbhav\\Desktop\\tmp\\EmpFile.txt");
		ObjectOutputStream out1 = new ObjectOutputStream(outStream1);
		out1.writeObject(Empservice);
		out1.flush();
		System.out.println("serialized successfully");

		FileInputStream inStream1 = new FileInputStream("C:\\\\Users\\\\kbhav\\\\Desktop\\\\tmp\\\\EmpFile.txt");
		ObjectInputStream in1 = new ObjectInputStream(inStream1);
		EmployeeService emp=(EmployeeService)in1.readObject();
		System.out.println("deserialized successfully\n");
		Scanner sc=new Scanner(System.in);
		String choice="y";
		do {
		System.out.println("----choose your option----");
		System.out.println("1-Get All Employees");
		System.out.println("2-Get Employee By ID");
		System.out.println("3-Add New EMployee");
		System.out.println("4-Update Existing Employee");
		System.out.println("5-Delete Existing Employee");
		System.out.print("enter choice:");
		int n=sc.nextInt();
		switch(n) {
		case 1:
			System.out.println("___Getting All Employee Details__");
			employee.displayObjects();
			break;
		case 2:
			System.out.println("__getting Employee By ID:__");
			System.out.print("Enter id:");
			int id=sc.nextInt();
			emp.getEmployeeById(id);
			
			break;
			
		case 3:
			System.out.println("___Adding New EMployee___");
			emp.AddNewEmployee(employee);
			
			System.out.println("Employee details added...");
			
			break;
		case 4:
			System.out.println("___Update Exisitng EMployee___");
			employee=new Employee();
			System.out.print("Enter id:");
			int id1=sc.nextInt();
			employee.setEmpName(sc.nextLine());
			sc.nextLine();
			System.out.println("Enter  Designation : ");
			employee.setEmpDesignation(sc.nextLine());
			System.out.println("Enter salary");
			employee.setEmpSalary(sc.nextDouble());
			sc.nextLine();
			emp.updateEmployee(id1, employee);
			
			break;
		case 5:
			System.out.println("___Delete Existing EMployee___");
			
			break;
		default:
			System.out.println("Invalid choice");
			break;
			
		}
		sc.nextLine();
		System.out.print("\ndo you wish to continue?  : ");
		choice=sc.nextLine();
		}while(choice.equals("y")||choice.equals("Y") ||choice.equals("yes")||choice.equals("Yes")||choice.equals("YES"));	
	}
		
	}

