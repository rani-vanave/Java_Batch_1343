package method;

public class Main {
	

	public static void main(String[] args) {
		
	
		Company company=new Company();
		Department department=company.getDepartment();
		Employee employee=department.getEmployee();
		Project project=employee.getproject();
		
		String projectName =project.getProjectName();
		System.out.println("Project Name : " + projectName);
	}	
	}