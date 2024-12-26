import java.util.Scanner;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        Patient patient =  new Patient("Alejandra", "alejandra@gmail.com2");
        System.out.println(patient.name);
        System.out.println(patient.email);

        patient.weight = 60.5; 
        patient.height = 1.65;

        System.out.println(patient.weight);
        System.out.println(patient.height);

    //    Doctor myDoctor = new Doctor();
    //    myDoctor.name= "Alejandro Rodriguez";
    //    myDoctor.showName();
    //    myDoctor.showId();

    //    Doctor myDoctorAnn = new Doctor(); 
    //    myDoctor.showId();

    //    showMenu();
    }
}
