public class Patient extends User {
        private String birthday; 
        private double weight;
        private double height;
        private String blood; 
   
       Patient(String name, String email, String address) {
        super(name, email, address);
        }

    public String getBirthday() {
        return birthday;
    }
    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

        
    public String getweight(){
        return this.weight + " Kg.";
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
    @Override
    public String toString() {
        return super.toString() + "\n Age: " + birthday + "\n Weight: " + getweight()+ "\n Height: "+ getHeight()+"\n Blood: "+blood;
    }
}

