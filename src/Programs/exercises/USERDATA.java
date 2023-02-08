package Programs.exercises;

public class USERDATA {
    static void getName(String name){
        System.out.println("Name Of Candidate: "+name);
    }
    static void getAge(int age){
        System.out.println("Age: "+age);
    }
    static void getGender(String gender){
        System.out.println("Gender: "+gender);
    }
    static void getEmail(String email){
        System.out.println("Email: "+email);
    }
    static void getPhone(double phone){
        System.out.println("Phone: "+phone);
    }
    public static void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter The Details");   //get error like break point
//        String name=sc.nextLine();
//        int age=sc.nextInt();
//        String gender=sc.nextLine();
//        String email=sc.nextLine();
//        double phone=sc.nextDouble();
        String name= "Bhavan Sai";
        int age=28;
        String gender="Male";
        String email="bhavansai123@gmail.com";

        getName(name);
        getAge(age);
        getGender(gender);
        getEmail(email);
//        getPhone(phone);
//        System.out.println(name);

    }
}
