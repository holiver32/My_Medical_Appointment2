import java.util.Scanner;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient =  new Patient("Alejandra", "alejandra@gmail.com2");
        patient.setWeight(54.6);
        System.out.println(patient.getweight());

        patient.setPhoneNumber("123456789");
        
    //    Doctor myDoctor = new Doctor();
    //    myDoctor.name= "Alejandro Rodriguez";
    //    myDoctor.showName();
    //    myDoctor.showId();

    //    Doctor myDoctorAnn = new Doctor(); 
    //    myDoctor.showId();

    //    showMenu();
    }
}
