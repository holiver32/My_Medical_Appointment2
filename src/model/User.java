package model;
public abstract class User {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phoneNumber;


    public User(String name, String email, String address) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


 public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

     public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 10){
            System.out.println("The telephon number must be 10 digits");
        }else if(phoneNumber.length() == 10){
            this.phoneNumber = phoneNumber;
        }
    } 

     @Override
    public String toString() {
        return "User: " + name + " Email: "+email+
                "\nAddreess: "+address+". Phone: "+phoneNumber;
    }

    public abstract void showDataUser();

 }