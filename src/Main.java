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
