package hw;

public class PatientMain {

	public static void main(String[] args) {
		
		PatientDAO dao = new PatientDAO();
		PatientService patientService = new PatientService(dao);
		PatientController controller = new PatientController(patientService);
		
		controller.run();

	}

}
