package model;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
 private String speciality;

ArrayList<AvailableAppointment> availableAppointments = new ArrayList<>();
public void addAvailableAppointment(Date date, String time){
    availableAppointments.add(new Doctor.AvailableAppointment(date,time));
 }

 public ArrayList<AvailableAppointment> getAvailableAppointments(){
    return availableAppointments;
 }

 @Override
    public String toString() {
        return super.toString() + "\nSpeciality: " + speciality + "\nAvailable: " + availableAppointments.toString();
    }



public static class AvailableAppointment{
    private int id;
    private Date date; 
    private String time;

  public AvailableAppointment(Date date, String time) {
        this.date = date; 
        this.time = time; 
    }
    
    public int getId() {
        return id; 
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
 }

   public Doctor(String name, String email, String speciality) {
        super(name, email, speciality);
        System.out.println("The assigned doctor is:  " + name + "  Speciality: " +speciality); 
        this.speciality = speciality;
    }
    
    public String getSpeciality(){
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

     @Override 
    public void showDataUser() { 
        System.out.println("Hospital Employee: Red Cross");
        System.out.println("Deparment: Oncologia.");
    }

}
