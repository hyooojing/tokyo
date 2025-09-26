package day5;

public class StudentMain {

	public static void main(String[] args) {
		
		PatientDAO dao = new PatientDAO();
		StudentService studentService = new StudentService(dao);
		StudentController controller = new StudentController(studentService);
		
		controller.run();

	}

}
