import campus.academics.Faculty;

public class CampusApp {

	public static void main(String[] args) {
		
		Faculty[] faculties = new Faculty[5];
		faculties[0] = new Faculty("f1",30,"Add1",101,"CompSc",30000);
		faculties[1] = new Faculty("f2",35,"Add2",102,"Chem",35000);
		faculties[2] = new Faculty("f3",40,"Add3",103,"Phy",15000);
		faculties[3] = new Faculty("f4",45,"Add4",104,"Eng",45000);
		faculties[4] = new Faculty("f5",55,"Add5",105,"Bio",75000);
		
	    double totSal = 0.0;
        for(Faculty f : faculties) {
        	totSal += f.getSalary();
        }
        
        System.out.println("Total Salaries of all faculties is " + totSal);

	}

}
