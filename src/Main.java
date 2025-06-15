import java.util.Date;
import java.util.Scanner;

import model.Doctor;
import model.Patient;
import model.User;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("Anahi Salgado", "Anahilsalagado54@gmail.com", "Pediatrics");
        myDoctor.addAvailableAppointment(new Date(),"4pm");
        myDoctor.addAvailableAppointment(new Date(),"10am");
        myDoctor.addAvailableAppointment(new Date(),"1pm");
       
        
         for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() + " " + availableAppointment.getTime());
        } 

        //System.out.println(myDoctor.name);
        //System.out.println(myDoctor.speciality);
      
        /*Patient patient =  new Patient("Alejandra Muller", "alejandra@gmail.com", "always alive Street 123");
        patient.setPhoneNumber("1789897509");
        patient.setBirthday("17-oct-1992");
        patient.setWeight(95);
        patient.setHeight(1.85);
        patient.setBlood("+A");
        System.out.println(patient); */

        User user = new Doctor("Anahi Salgado", "Anahilsalagado54@gmail.com", "Pediatrics");
        user.showDataUser();

        User user2 = new Patient("Anahi Salgado", "Anahilsalagado54@gmail.com", "Pediatrics");
        user2.showDataUser();

        //Patient patient2 = new Patient("Anahi", "anahi@mail.com");

        //System.out.println(patient.getName());
        /*System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("Manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());*/ 

         
        
    //    Doctor myDoctor = new Doctor();
    //    myDoctor.name= "Alejandro Rodriguez";
    //    myDoctor.showName();
    //    myDoctor.showId();

    //    Doctor myDoctorAnn = new Doctor(); 
    //    myDoctor.showId();

    //    showMenu();
    }
}
