public class Patient {
        int id;
        public String name; 
        public String email; 
        private String address;
        private String phoneNumber;
        private String birthday; 
        private double weight;
        private double height;
        private String blood; 
   
       Patient(String name, String email) {
           this.name = name; 
           this.email = email;
       } 
       public String getweight(){
        return this.weight + "Kg. ";
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
        if (phoneNumber.length() > 8) {
            System.out.println("El número telefonico debe ser de 8  digitos maximo.");
        }else if (phoneNumber.length() == 8){ 
            this.phoneNumber = phoneNumber;
        }
    }
    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public String getBlood() {
        return blood;
    }
    public void setBlood(String blood) {
        this.blood = blood;
    }
  
}

