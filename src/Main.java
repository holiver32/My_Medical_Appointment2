import java.util.Date;
import java.util.Scanner;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");
        
        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        }


        System.out.println();

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);

        Patient patient =  new Patient("Alejandra", "alejandra@gmail.com2");
        Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        // patient.setPhoneNumber("123456789");
        
    //    Doctor myDoctor = new Doctor();
    //    myDoctor.name= "Alejandro Rodriguez";
    //    myDoctor.showName();
    //    myDoctor.showId();

    //    Doctor myDoctorAnn = new Doctor(); 
    //    myDoctor.showId();

    //    showMenu();
    }
}
