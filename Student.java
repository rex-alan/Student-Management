import java.sql.Date;
import java.util.*;

class Student {
    String name,phno,mail,address,highest_qualification,collegename,city;
    Boolean passedout;
    int s_id,total_fee,balance_fee;

    Map<String,Date> course_enrolled = new HashMap<String,Date>();
    public void add_course_enrolled(String course_name, Date date){
        course_enrolled.put(course_name, date);
    }

    Map<Date,String> attendance = new HashMap<>();
    public void add_attendance(Date date, String status){
        attendance.put(date, status);
    }

    Map<String,Date> topics_covered = new HashMap<>();
    public void add_topics_covered(String topics, Date date){
        topics_covered.put(topics, date);
    }

    Map<Date,Integer> fees_paid = new HashMap<>();
    public void add_fees_paid(Date date, int fee){
        fees_paid.put(date,fee);
    }

    //Default Constructor
    Student(){}

    //Parameterised Constructor
    Student(String Name,String Phone,String Mail,String Address,String Qualification,String College,String City, Boolean Passedout){
        name = Name;
        phno = Phone;
        mail = Mail;
        address = Address;
        highest_qualification = Qualification;
        collegename = College;
        city = City;
        passedout = Passedout;

    }

    @Override
    public String toString(){
        String display = "------------ STUDENT BASIC DETIALS -------------\n";
        display += "Name : " + name + "\nID: " + s_id + "\nPhone No : " + phno +"\nMail ID : " + mail +"\nAddress : " + address + "\nHighest Qualification : " + highest_qualification + "\nCollege Name : " + collegename + "\nCity : " + city + "\nPassed Out : " + passedout +"\n";

        display += "\n-------------- COURSE DETAILS -----------------\n";        
        for(Map.Entry<String, Date> CE : course_enrolled.entrySet())
        {
            display += "Course Taken : "+CE.getKey()+ " \nEnrolled on : "+ CE.getValue() +"\n";
        }

        display += "\n---------------- TOPICS COVERED ------------------\n";
        for(Map.Entry<String,Date> TC : topics_covered.entrySet()){
            display += "Topic : " + TC.getKey() + " || Covered Date : " + TC.getValue() + "\n";
        }

        display += "\n------------Attendance------------\n";
        for(Map.Entry<Date,String> AT : attendance.entrySet()){
            display += "Date : " + AT.getKey() + " || Status : " + AT.getValue() + "\n";
        }

        display += "\n------------ Fee Details -------------\n";
        display += "Total fee : "+total_fee + "\n";
        for(Map.Entry<Date,Integer> FD : fees_paid.entrySet()){
            display += "Amount Paid : " + FD.getValue() + " || Date : " + FD.getKey() + "\n";
        }
        display += "Balance fee : " + balance_fee +"\n";
        return display;
    }
    
}