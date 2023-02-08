package Encapsulation;
class amazonDetails{
    private String name;
    private long phoneNumber;
    private String email;
    private String password;
    public amazonDetails(){

    }
    public amazonDetails(String name,long phoneNumber,String email,String password){
        super();
        this.name=name;
        this.phoneNumber=phoneNumber;
        this.email=email;
        this.password=password;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "amazonDetails{" +
                "name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
public class AmazonFields {
    public static void main(String[] args) {
        amazonDetails name = new amazonDetails("Bhavan", 9900581700L, "bhavan@gmail.com", "bhavan@1210");
        amazonDetails name1 = new amazonDetails();
        name1.setName("Stupid");
        name1.setPhoneNumber(7799899602L);
        name1.setEmail("stupid@gmail.com");
        name1.setPassword("Stupid@1210");
        System.out.println(name);
        System.out.println(name1);
    }
}
