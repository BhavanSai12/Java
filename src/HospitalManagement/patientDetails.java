package HospitalManagement;

import java.util.Scanner;

public class patientDetails {
    private static void getName(String patientName){
        System.out.println("Patient Name: "+patientName);
    }
    public static void getDob(String patientDob){
        System.out.println("Date Of Birth : "+patientDob);
    }
    public static void getSex(String sex){
        System.out.println("Sex : "+sex);
    }public static void getMobile(String mobile){
        System.out.println("Mobile : "+mobile);
    }public static void getEmail(String email){
        System.out.println("Email : "+email);
    }
    public static void getNationality(String nationality){
        System.out.println("Nationality : "+nationality);
    }
    public static void getPlace(String place){
        System.out.println("Place : "+place);
    }
    public static void getAddress(String address){
        System.out.println("Address : "+address);
    }




    public static void main(String[]args){
        //Scanner sc=new Scanner(System.in);
        String patientName="Bhavan Sai";
        String patientDob="12-10-1994";//Dob Ki datatype telusukovali
        String sex="Male";
        String blood="O+";
        String mobile = "9700587104";//mobile number ki ye datatype evali
        String email= "bhavansai@gmail.com";
        String nationality="India";
        String place="Rajahmundry";
        String address="121-3-124,Lic Layout,Katheru ,Rajahmundry-533101,Andhra Pradesh.";
        getName(patientName);
        getDob(patientDob);
        getSex(sex);
        getMobile(mobile);
        getEmail(email);
        getPlace(place);
        getAddress(address);
        getNationality(nationality);


    }
}
