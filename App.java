import java.util.*;
import java.security.cert.PKIXBuilderParameters;
import java.text.SimpleDateFormat;

public class App {
    public static void main(String[] args) throws Exception {

        //NAME OF STUDENTS
        // PrintNames();

        //TOTAL NUMBER OF STUDENTS
        // StudentStrength();

        //STUDENTS PAYS FULL FEE
        // CompletsPayment();

        //STUDENTS HAVING PENDING FEE
        // PendingPayment();
        
        //STUDENT DETAILS
        // StudentDetails(104);
        // StudentDetails(102);

        //PASSED OUT STUDENTS
        // Passedout_Students();

        //ONGOING STUDENTS
        // Ongoing_Students();

        //DAYS ABSENT
        // daysabsent(103);

        //DAYS ABSENT AS LIST
        // ArrayList<Date> absent_list = daysabsent_list(104);
        // System.out.println(absent_list); 
        
        //TOPICS ABSENT
        // Map<String,Date> topic_absent_dict = topicsabsent(104);
        // System.out.println(topic_absent_dict);


    }



    //ADDING STUDENT DETAILS
    static Student Student1()throws Exception {

        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();

        //STUDENT 1
        Student s1 = new Student();
        s1.s_id = 101;
        s1.name = "Rex Alan";
        s1.phno = "9054125687";
        s1.mail = "rexalan4455@gmail.com";
        s1.address = "No 10, Mariyam Nagar, Palakarai";
        s1.highest_qualification = "M.Sc";
        s1.collegename = "St.Joseph's college";
        s1.city = "Tiruchy";
        s1.passedout = false;

        //COURSE ENROLLED 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Create a date formatter with the input date format
        Date utildate = formatter.parse("01-01-2023"); // Parse the input date string and create a Date object
        java.sql.Date s1_course_date = new java.sql.Date(utildate.getTime());
        s1.add_course_enrolled(c1.name, s1_course_date);

        //t1
        //TOPICS COVERED
        Date s1_t1 = formatter.parse("31-01-2023");
        java.sql.Date s1_t1_covered = new java.sql.Date(s1_t1.getTime());
        s1.add_topics_covered("Programming Fundamentals", s1_t1_covered);
        //t2
        Date s1_t2 = formatter.parse("15-02-2023");
        java.sql.Date s1_t2_covered = new java.sql.Date(s1_t2.getTime());
        s1.add_topics_covered("C Programming", s1_t2_covered);
        //t3
        Date s1_t3 = formatter.parse("28-02-2023");
        java.sql.Date s1_t3_covered = new java.sql.Date(s1_t3.getTime());
        s1.add_topics_covered("Arrays and Strings", s1_t3_covered);

        //FEES PAID
        int s1_totalfee = c1.fees;
        s1.total_fee = s1_totalfee;
        int s1_instalment1 = 16000;
        int s1_installment2 = 0;
        int s1_installment3 = 0;
        int s1_installment4 = 0;
        Date s1_f1 = formatter.parse("10-01-2023");
        java.sql.Date s1_f1_paid = new java.sql.Date(s1_f1.getTime());
        s1.add_fees_paid(s1_f1_paid,s1_instalment1);

        //BALANCE FEE
        int s1_balancefee = s1_totalfee - (s1_instalment1 + s1_installment2 + s1_installment3 + s1_installment4);
        s1.balance_fee = s1_balancefee;        

        //ATTENDANCE 
        //DAY - 1
        Date s1_a1 = formatter.parse("31-01-2023");
        java.sql.Date s1_a1_att = new java.sql.Date(s1_a1.getTime());
        s1.add_attendance(s1_a1_att, "P");

        //DAY - 2
        Date s1_a2 = formatter.parse("01-02-2023");
        java.sql.Date s1_a2_att = new java.sql.Date(s1_a2.getTime());
        s1.add_attendance(s1_a2_att, "P");

        //DAY - 3
        Date s1_a3 = formatter.parse("15-02-2023");
        java.sql.Date s1_a3_att = new java.sql.Date(s1_a3.getTime());
        s1.add_attendance(s1_a3_att, "P");

        //DAY - 4
        Date s1_a4 = formatter.parse("16-02-2023");
        java.sql.Date s1_a4_att = new java.sql.Date(s1_a4.getTime());
        s1.add_attendance(s1_a4_att, "A");

        //DAY - 5
        Date s1_a5 = formatter.parse("28-02-2023");
        java.sql.Date s1_a5_att = new java.sql.Date(s1_a5.getTime());
        s1.add_attendance(s1_a5_att, "A");

        return s1;
    }

    static Student Student2() throws Exception{

        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();        

        Student s2 = new Student("Alan","9856244632", "alanhnag99@gmail.com","7G Rainbow Colony, Chennai", "B.sc", "Bishop Hebber", "Tiruchirappalli",true);
        s2.s_id = 102;

        //COURSE ENROLLED 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Create a date formatter with the input date format
        Date s2_course_enrolled = formatter.parse("01-01-2023"); // Parse the input date string and create a Date object
        java.sql.Date s2_course_date = new java.sql.Date(s2_course_enrolled.getTime());
        s2.add_course_enrolled(c2.name, s2_course_date);

        //t1
        //TOPICS COVERED
        Date s2_t1 = formatter.parse("31-01-2023");
        java.sql.Date s2_t1_covered = new java.sql.Date(s2_t1.getTime());
        s2.add_topics_covered("Graph and Tree Based Data Structures", s2_t1_covered);
        //t2
        Date s2_t2 = formatter.parse("15-02-2023");
        java.sql.Date s2_t2_covered = new java.sql.Date(s2_t2.getTime());
        s2.add_topics_covered("BFS and DFS", s2_t2_covered);
        //t3
        Date s2_t3 = formatter.parse("28-02-2023");
        java.sql.Date s2_t3_covered = new java.sql.Date(s2_t3.getTime());
        s2.add_topics_covered("Shortest Path Algorithm, Minimum Spanning Tree, All Pairs Shortest Path", s2_t3_covered);

        //FEES PAID
        int s2_totalfee = c2.fees;
        s2.total_fee = s2_totalfee;
        int s2_instalment1 = 10000;
        int s2_instalment2 = 0;
        int s2_instalment3 = 0;
        int s2_instalment4 = 0;
        Date s2_f1 = formatter.parse("10-01-2023");
        java.sql.Date s2_f1_paid = new java.sql.Date(s2_f1.getTime());
        s2.add_fees_paid(s2_f1_paid,s2_instalment1);

        //BALANCE FEE
        int s2_balancefee = s2_totalfee - (s2_instalment1 + s2_instalment2 + s2_instalment3 + s2_instalment4);
        s2.balance_fee = s2_balancefee;  
        
        //ATTENDANCE 
        //DAY - 1
        Date s2_a1 = formatter.parse("31-01-2023");
        java.sql.Date s2_a1_att = new java.sql.Date(s2_a1.getTime());
        s2.add_attendance(s2_a1_att, "P");

        //DAY - 2
        Date s2_a2 = formatter.parse("02-02-2023");
        java.sql.Date s2_a2_att = new java.sql.Date(s2_a2.getTime());
        s2.add_attendance(s2_a2_att, "P");

        //DAY - 3
        Date s2_a3 = formatter.parse("15-02-2023");
        java.sql.Date s2_a3_att = new java.sql.Date(s2_a3.getTime());
        s2.add_attendance(s2_a3_att, "A");

        //DAY - 4
        Date s2_a4 = formatter.parse("16-02-2023");
        java.sql.Date s2_a4_att = new java.sql.Date(s2_a4.getTime());
        s2.add_attendance(s2_a4_att, "P");

        //DAY - 5
        Date s2_a5 = formatter.parse("28-02-2023");
        java.sql.Date s2_a5_att = new java.sql.Date(s2_a5.getTime());
        s2.add_attendance(s2_a5_att, "P");

        return s2;
    }

    static Student Student3()throws Exception{
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5(); 

        Student s3 = new Student("Adharsh","75896541236", "adharshrv777@gmail.com","7, North Steet, Karaikal", "M.Sc", "St.Joseph's", "Karaikal",false );
        s3.s_id = 103;

        //COURSE ENROLLED 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Create a date formatter with the input date format
        Date s3_course_enrolled = formatter.parse("01-02-2023"); // Parse the input date string and create a Date object
        java.sql.Date s3_course_date = new java.sql.Date(s3_course_enrolled.getTime());
        s3.add_course_enrolled(c3.name, s3_course_date);

        //t1
        //TOPICS COVERED
        Date s3_t1 = formatter.parse("01-03-2023");
        java.sql.Date s3_t1_covered = new java.sql.Date(s3_t1.getTime());
        s3.add_topics_covered("Maths for compettitive Programming", s3_t1_covered);
        //t2
        Date s3_t2 = formatter.parse("01-04-2023");
        java.sql.Date s3_t2_covered = new java.sql.Date(s3_t2.getTime());
        s3.add_topics_covered("Searching Algorithms", s3_t2_covered);
        //t3
        Date s3_t3 = formatter.parse("25-04-2023");
        java.sql.Date s3_t3_covered = new java.sql.Date(s3_t3.getTime());
        s3.add_topics_covered("Sorting Algorithm", s3_t3_covered);

        //FEES PAID
        int s3_totalfee = c3.fees;
        s3.total_fee = s3_totalfee;
        int s3_instalment1 = 8000;
        Date s3_f1 = formatter.parse("10-02-2023");
        java.sql.Date s3_f1_paid = new java.sql.Date(s3_f1.getTime());
        s3.add_fees_paid(s3_f1_paid,s3_instalment1);

        int s3_instalment2 = 5000;
        Date s3_f2 = formatter.parse("02-03-2023");
        java.sql.Date s3_f2_paid = new java.sql.Date(s3_f2.getTime());
        s3.add_fees_paid(s3_f2_paid, s3_instalment2);

        int s3_instalment3 = 0;
        int s3_instalment4 = 0;

        //BALANCE FEE
        int s2_balancefee = s3_totalfee - (s3_instalment1 + s3_instalment2 + s3_instalment3 + s3_instalment4);
        s3.balance_fee = s2_balancefee;  
        

        //ATTENDANCE 
        //DAY - 1
        Date s3_a1 = formatter.parse("01-03-2023");
        java.sql.Date s3_a1_att = new java.sql.Date(s3_a1.getTime());
        s3.add_attendance(s3_a1_att, "P");

        //DAY - 2
        Date s3_a2 = formatter.parse("02-03-2023");
        java.sql.Date s3_a2_att = new java.sql.Date(s3_a2.getTime());
        s3.add_attendance(s3_a2_att, "P");

        //DAY - 3
        Date s3_a3 = formatter.parse("01-04-2023");
        java.sql.Date s3_a3_att = new java.sql.Date(s3_a3.getTime());
        s3.add_attendance(s3_a3_att, "P");

        //DAY - 4
        Date s3_a4 = formatter.parse("02-04-2023");
        java.sql.Date s3_a4_att = new java.sql.Date(s3_a4.getTime());
        s3.add_attendance(s3_a4_att, "P");

        //DAY - 5
        Date s3_a5 = formatter.parse("25-04-2023");
        java.sql.Date s3_a5_att = new java.sql.Date(s3_a5.getTime());
        s3.add_attendance(s3_a5_att, "P");

        return s3;

    }

    static Student Student4()throws Exception{
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5(); 

        Student s4 = new Student("Starjan","8489651236", "davidstarjan777@gmail.com","7, Sholinganallur, Chennai", "M.Sc", "St.Joseph's", "Chennai",false );
        s4.s_id = 104;

        //COURSE ENROLLED 
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy"); // Create a date formatter with the input date format
        Date s4_course_enrolled = formatter.parse("15-11-2022"); // Parse the input date string and create a Date object
        java.sql.Date s4_course_date = new java.sql.Date(s4_course_enrolled.getTime());
        s4.add_course_enrolled(c4   .name, s4_course_date);

        //t1
        //TOPICS COVERED
        Date s4_t1 = formatter.parse("25-11-2022");
        java.sql.Date s4_t1_covered = new java.sql.Date(s4_t1.getTime());
        s4.add_topics_covered("User Experience Design Fundamentals", s4_t1_covered);
        //t2
        Date s4_t2 = formatter.parse("10-12-2022");
        java.sql.Date s4_t2_covered = new java.sql.Date(s4_t2.getTime());
        s4.add_topics_covered("Adobe Experience Design (XD) Fundamentals", s4_t2_covered);
        //t3
        Date s4_t3 = formatter.parse("20-12-2022");
        java.sql.Date s4_t3_covered = new java.sql.Date(s4_t3.getTime());
        s4.add_topics_covered("Java 9 Basics", s4_t3_covered);
        //t4
        Date s4_t4 = formatter.parse("30-12-2022");
        java.sql.Date s4_t4_covered = new java.sql.Date(s4_t4.getTime());
        s4.add_topics_covered("Android Studio Fundamentals", s4_t4_covered);
        //t5
        Date s4_t5 = formatter.parse("14-01-2023");
        java.sql.Date s4_t5_covered = new java.sql.Date(s4_t5.getTime());
        s4.add_topics_covered("JVM and Java", s4_t5_covered);
        //t6
        Date s4_t6 = formatter.parse("05-02-2023");
        java.sql.Date s4_t6_covered = new java.sql.Date(s4_t6.getTime());
        s4.add_topics_covered("Foundations of Object Oriented Programming", s4_t6_covered);
        //t7
        Date s4_t7 = formatter.parse("10-03-2023");
        java.sql.Date s4_t7_covered = new java.sql.Date(s4_t7.getTime());
        s4.add_topics_covered("Using Data Structures in Java", s4_t7_covered);
        //t8
        Date s4_t8 = formatter.parse("30-03-2023");
        java.sql.Date s4_t8_covered = new java.sql.Date(s4_t8.getTime());
        s4.add_topics_covered("Learning Lambda", s4_t8_covered);
        //t9
        Date s4_t9 = formatter.parse("15-04-2023");
        java.sql.Date s4_t9_covered = new java.sql.Date(s4_t9.getTime());
        s4.add_topics_covered("RDBMS and SQLite Fundamentals", s4_t9_covered);
        //t10
        Date s4_t10 = formatter.parse("30-04-2023");
        java.sql.Date s4_t10_covered = new java.sql.Date(s4_t10.getTime());
        s4.add_topics_covered(".Unit Testing using JUnit", s4_t10_covered);

        //FEES PAID
        int s4_totalfee = c4.fees;
        s4.total_fee = s4_totalfee;
        int s4_instalment1= 5000;
        Date s4_f1 = formatter.parse("30-11-2022");
        java.sql.Date s4_f1_paid = new java.sql.Date(s4_f1.getTime());
        s4.add_fees_paid(s4_f1_paid,s4_instalment1);

        int s4_instalment2 = 5000;
        Date s4_f2 = formatter.parse("02-01-2023");
        java.sql.Date s4_f2_paid = new java.sql.Date(s4_f2.getTime());
        s4.add_fees_paid(s4_f2_paid, s4_instalment2);

        int s4_instalment3 = 5000;
        Date s4_f3 = formatter.parse("15-02-2023");
        java.sql.Date s4_f3_paid = new java.sql.Date(s4_f3.getTime());
        s4.add_fees_paid(s4_f3_paid, s4_instalment3);

        int s4_instalment4 = 0;

        //BALANCE FEE
        int s2_balancefee = s4_totalfee - (s4_instalment1 + s4_instalment2 + s4_instalment3 + s4_instalment4);
        s4.balance_fee = s2_balancefee;

        //ATTENDANCE 
        //DAY - 1
        Date s4_a1 = formatter.parse("25-11-2022");
        java.sql.Date s4_a1_att = new java.sql.Date(s4_a1.getTime());
        s4.add_attendance(s4_a1_att, "P");

        //DAY - 2
        Date s4_a2 = formatter.parse("10-12-2022");
        java.sql.Date s4_a2_att = new java.sql.Date(s4_a2.getTime());
        s4.add_attendance(s4_a2_att, "P");

        //DAY - 3
        Date s4_a3 = formatter.parse("20-12-2022");
        java.sql.Date s4_a3_att = new java.sql.Date(s4_a3.getTime());
        s4.add_attendance(s4_a3_att, "A");

        //DAY - 4
        Date s4_a4 = formatter.parse("30-12-2022");
        java.sql.Date s4_a4_att = new java.sql.Date(s4_a4.getTime());
        s4.add_attendance(s4_a4_att, "P");

        //DAY - 5
        Date s4_a5 = formatter.parse("14-01-2023");
        java.sql.Date s4_a5_att = new java.sql.Date(s4_a5.getTime());
        s4.add_attendance(s4_a5_att, "A");

        //DAY - 6
        Date s4_a6 = formatter.parse("05-02-2023");
        java.sql.Date s4_a6_att = new java.sql.Date(s4_a6.getTime());
        s4.add_attendance(s4_a6_att, "P");

        //DAY - 7
        Date s4_a7 = formatter.parse("10-03-2023");
        java.sql.Date s4_a7_att = new java.sql.Date(s4_a7.getTime());
        s4.add_attendance(s4_a7_att, "A");

        //DAY - 8
        Date s4_s8 = formatter.parse("30-03-2023");
        java.sql.Date s4_a8_att = new java.sql.Date(s4_s8.getTime());
        s4.add_attendance(s4_a8_att, "P");

        //DAY - 9
        Date s4_a9 = formatter.parse("15-04-2023");
        java.sql.Date s4_a9_att = new java.sql.Date(s4_a9.getTime());
        s4.add_attendance(s4_a9_att, "A");

        //DAY - 10
        Date s4_a10 = formatter.parse("30-04-2023");
        java.sql.Date s4_a10_att = new java.sql.Date(s4_a10.getTime());
        s4.add_attendance(s4_a10_att, "P");

        return s4;

    }

    // MY FUNCTIONS
    static void PrintNames() throws Exception
    {
        //INITIALIZING COURSES
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();
        
        //ADDING COURSES IN COURSES REPO
        CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);

        //INITIALIZING STUDENTS
        Student s1 = Student1();
        Student s2 = Student2();
        Student s3 = Student3();
        Student s4 = Student4();

        //ADDING STUDENT IN STUDENTS REPO
        StudRepo sr = new StudRepo();
        sr.AddStudent(s1);
        sr.AddStudent(s2);
        sr.AddStudent(s3);
        sr.AddStudent(s4);

        for(int i=0; i<sr.Students.size();i++){
            int j = i;
            op( ++j + ". " + sr.Students.get(i).name);
        }
    }
    static void StudentStrength()throws Exception{
        //INITIALIZING COURSES
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();
        
        //ADDING COURSES IN COURSES REPO
        CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);

        //INITIALIZING STUDENTS
        Student s1 = Student1();
        Student s2 = Student2();
        Student s3 = Student3();
        Student s4 = Student4();

        //ADDING STUDENT IN STUDENTS REPO
        StudRepo sr = new StudRepo();
        sr.AddStudent(s1);
        sr.AddStudent(s2);
        sr.AddStudent(s3);
        sr.AddStudent(s4);

        op(sr.Students.size());

    }
    static void CompletsPayment()throws Exception{
        //INITIALIZING COURSES
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();
        
        //ADDING COURSES IN COURSES REPO
        CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);

        //INITIALIZING STUDENTS
        Student s1 = Student1();
        Student s2 = Student2();
        Student s3 = Student3();
        Student s4 = Student4();

        //ADDING STUDENT IN STUDENTS REPO
        StudRepo sr = new StudRepo();
        sr.AddStudent(s1);
        sr.AddStudent(s2);
        sr.AddStudent(s3);
        sr.AddStudent(s4);

        for(int i=0 ;i<sr.Students.size();i++){
            if(sr.Students.get(i).balance_fee == 0){
                op(sr.Students.get(i).name);
            }
        }
    }
    static void PendingPayment()throws Exception{

         //INITIALIZING COURSES
         Course c1 = course1();
         Course c2 = course2();
         Course c3 = course3();
         Course c4 = course4();
         Course c5 = course5();
         
         //ADDING COURSES IN COURSES REPO
         CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);
 
         //INITIALIZING STUDENTS
         Student s1 = Student1();
         Student s2 = Student2();
         Student s3 = Student3();
         Student s4 = Student4();
 
         //ADDING STUDENT IN STUDENTS REPO
         StudRepo sr = new StudRepo();
         sr.AddStudent(s1);
         sr.AddStudent(s2);
         sr.AddStudent(s3);
         sr.AddStudent(s4);

         for(int i=0 ;i<sr.Students.size();i++){
            if(sr.Students.get(i).balance_fee > 0){
                op(sr.Students.get(i).name + " => Balance : " + sr.Students.get(i).balance_fee );
            }
        }
    }
    static void StudentDetails(int id) throws Exception{
        //INITIALIZING COURSES
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();
        
        //ADDING COURSES IN COURSES REPO
        CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);

        //INITIALIZING STUDENTS
        Student s1 = Student1();
        Student s2 = Student2();
        Student s3 = Student3();
        Student s4 = Student4();

        //ADDING STUDENT IN STUDENTS REPO
        StudRepo sr = new StudRepo();
        sr.AddStudent(s1);
        sr.AddStudent(s2);
        sr.AddStudent(s3);
        sr.AddStudent(s4);

        int count = 0;
        for(int i = 0; i<sr.Students.size(); i++){
            if(sr.Students.get(i).s_id == id){
                op(sr.Students.get(i));
                count ++;
            }
        }
        if(count == 0) op("Enter a valid Student ID");
    }
    static void Passedout_Students()throws Exception{
        //INITIALIZING COURSES
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();
        
        //ADDING COURSES IN COURSES REPO
        CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);

        //INITIALIZING STUDENTS
        Student s1 = Student1();
        Student s2 = Student2();
        Student s3 = Student3();
        Student s4 = Student4();

        //ADDING STUDENT IN STUDENTS REPO
        StudRepo sr = new StudRepo();
        sr.AddStudent(s1);
        sr.AddStudent(s2);
        sr.AddStudent(s3);
        sr.AddStudent(s4);

        int count = 0;
        for(int i=0; i<sr.Students.size(); i++){
            if(sr.Students.get(i).passedout == true) {
                op(sr.Students.get(i).s_id + "  "+ sr.Students.get(i).name);
                count++;
            }            
        }
        op("No.of Passed out students : " + count);
    }
    static void Ongoing_Students() throws Exception{
            //INITIALIZING COURSES
            Course c1 = course1();
            Course c2 = course2();
            Course c3 = course3();
            Course c4 = course4();
            Course c5 = course5();
            
            //ADDING COURSES IN COURSES REPO
            CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);
    
            //INITIALIZING STUDENTS
            Student s1 = Student1();
            Student s2 = Student2();
            Student s3 = Student3();
            Student s4 = Student4();
    
            //ADDING STUDENT IN STUDENTS REPO
            StudRepo sr = new StudRepo();
            sr.AddStudent(s1);
            sr.AddStudent(s2);
            sr.AddStudent(s3);
            sr.AddStudent(s4);
    
            int count = 0;
            for(int i=0; i<sr.Students.size(); i++){
                if(sr.Students.get(i).passedout == false) {
                    op(sr.Students.get(i).s_id + "  "+ sr.Students.get(i).name);
                    count++;
                }            
            }
            op("No.of Ongoing students : " + count);
        }
    static void daysabsent(int n) throws Exception{
         //INITIALIZING COURSES
         Course c1 = course1();
         Course c2 = course2();
         Course c3 = course3();
         Course c4 = course4();
         Course c5 = course5();
         
         //ADDING COURSES IN COURSES REPO
         CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);
 
         //INITIALIZING STUDENTS
         Student s1 = Student1();
         Student s2 = Student2();
         Student s3 = Student3();
         Student s4 = Student4();
 
         //ADDING STUDENT IN STUDENTS REPO
         StudRepo sr = new StudRepo();
         sr.AddStudent(s1);
         sr.AddStudent(s2);
         sr.AddStudent(s3);
         sr.AddStudent(s4);

        int count = 0;
        for(int i=0; i<sr.Students.size(); i++){
            if(sr.Students.get(i).s_id == n){
                for(Map.Entry<java.sql.Date, String> AT : sr.Students.get(i).attendance.entrySet()){
                    if(AT.getValue() == "A"){
                        op("Date : " + AT.getKey() + " Status : " + AT.getValue());
                            count++;
                    }
                }
            }
        }
        op("Total No.of days absent : " + count);
    }
    static ArrayList<Date> daysabsent_list(int n) throws Exception{
        //INITIALIZING COURSES
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();
        
        //ADDING COURSES IN COURSES REPO
        CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);

        //INITIALIZING STUDENTS
        Student s1 = Student1();
        Student s2 = Student2();
        Student s3 = Student3();
        Student s4 = Student4();

        //ADDING STUDENT IN STUDENTS REPO
        StudRepo sr = new StudRepo();
        sr.AddStudent(s1);
        sr.AddStudent(s2);
        sr.AddStudent(s3);
        sr.AddStudent(s4);

        ArrayList<Date> absentlist = new ArrayList<>(); 

        for(int i=0; i<sr.Students.size(); i++){
            if(sr.Students.get(i).s_id == n){
                for(Map.Entry<java.sql.Date,String> AT : sr.Students.get(i).attendance.entrySet()){
                    if(AT.getValue() == "A"){
                        absentlist.add(AT.getKey());
                    }
                }
            }
        }
        return absentlist;
    }
    static Map<String,Date> topicsabsent(int n)throws Exception{
        //INITIALIZING COURSES
        Course c1 = course1();
        Course c2 = course2();
        Course c3 = course3();
        Course c4 = course4();
        Course c5 = course5();
        
        //ADDING COURSES IN COURSES REPO
        CourseRepo cr1 = new CourseRepo(c1,c2,c3,c4,c5);

        //INITIALIZING STUDENTS
        Student s1 = Student1();
        Student s2 = Student2();
        Student s3 = Student3();
        Student s4 = Student4();

        //ADDING STUDENT IN STUDENTS REPO
        StudRepo sr = new StudRepo();
        sr.AddStudent(s1);
        sr.AddStudent(s2);
        sr.AddStudent(s3);
        sr.AddStudent(s4);

        ArrayList<Date> absent_list = daysabsent_list(104);
        
        Map<String,Date> topics_covered = new HashMap<>();
        for(int i=0; i<sr.Students.size(); i++){
            if(sr.Students.get(i).s_id == n){
                for(int k = 0; k< absent_list.size(); k++){
                    for(Map.Entry<String,java.sql.Date> TC : sr.Students.get(i).topics_covered.entrySet()){
                        if(absent_list.get(k).compareTo(TC.getValue()) == 0 ){
                            topics_covered.put(TC.getKey(),TC.getValue());
                        }
                    }
                }       
            }
        } 
        return topics_covered;
    }



    //ADDING COURSES
    static Course course1(){
        //COURSES AND TOPICS (C1)
        Course c1 = new Course( "Fundamentels of Programming and Problem Solving : Basic", 16000, "4 Months");
        c1.add_five_topics("Programming Fundamentals","C Programming","Arrays and Strings","Collection Classes","Object Oriented Programming");
        c1.add_five_topics("Exception Handling and Debugging Fundamentals","Git and GitHub for Programmers", "Mathematics for Programmers", "Unit Testing", "Data Modelling, Normalization, RDBMS, SQL Fundamentals, Stored Procedures and Triggers");
        c1.add_five_topics("Search Algorithms","Sorting Algorithms", "Recursion and Recursive Algorithms", "Programming Techniques: Two Pointers, Sliding Window, Bit Manipulation Techniques", "Basic Data Structure Implementation: Array List, Linked List, Stack, Queue, Deque");
        c1.add_topics("DFA and State Machines");
        c1.add_topics("Logging and Build Tools");
        c1.add_topics("GUI App Development: JavaFX for Java and Win Forms/WPF for C#");
        return c1;
    }

    static Course course2(){
        //COURCES AND TOPICS (C2)
        Course c2 = new Course("Fundamentels of Programming and problem Solving : Advanced", 24000, "6 Months");
        c2.add_five_topics("Graph and Tree Based Data Structures", "BFS and DFS", "Shortest Path Algorithm, Minimum Spanning Tree, All Pairs Shortest Path ", "Algorithmic Techniques: Greedy Approach, Divide and Conquer, Backtracking and Dynamic Programming", "Web Development Fundamentals : Client Server Model, Request Response Cycle, Cookies and Sessions, Web APIs");
        c2.add_five_topics("Multi-Threading, Async Programming Model", "System Design Concepts and Design Patterns", "SOLID Principles for OO Design", "Defensive Coding and Refactoring", "Secure Coding Practices");
        return c2;
    }

    static Course course3(){
        //COURSES AND TOPICS (C3)
        Course c3 = new Course("Competitive Programming : Advanced", 20000, "6 Months");
        c3.add_five_topics("Mathematics for competitive programming", "Searching Algorithm", "Sorting Algorithm", "Algorithimic Techniques", "Graph transversal algorithm");
        c3.add_topics("Data Structures");
        return c3;
    }

    static Course course4(){
        //COURSES AND TOPICS (C4)        
        Course c4 = new Course("Android Mobile Development : Java",15000,"70 Hours");
        c4.add_five_topics("User Experience Design Fundamentals", "Adobe Experience Design (XD) Fundamentals", "Java 9 Basics", "Android Studio Fundamentals", "JVM and Java");
        c4.add_five_topics("Foundations of Object Oriented Programming", "Learning Lambda", "RDBMS and SQLite Fundamentals", "Using Data Structures in Java", "Unit Testing using JUnit");
        c4.add_five_topics("Android App Development: Fundamentals", "Android: Designing UI", "Android: Navigation and Events", "Android: Local Data Storage using SQLite", "Android: RESTful Web Services");
        c4.add_five_topics("Android: Animations", "Android: Google Maps API", "Java Design Patterns for Android Development", "Deploying and Monitoring Apps in the Google Play Store", "Capstone Project (3 Projects)");
        return c4;
    }

    static Course course5(){
         //COURSES AND TOPICS (C5)        
         Course c5 = new Course("Data Science and Machine Learnig Fundamentals",12000,"75 Hours");
         c5.add_five_topics("Introduction to Data Science and Machine Learning", "Python Basics", "Python Data Structures", "Advanced Python", "NumPy");
         c5.add_five_topics("Pandas", "Data Visualization using MatPlotLib", "Statistics Fundamentals", "Data Analytics: An Overview", "Machine Learning Fundamentals");
         c5.add_five_topics("Supervised Learning", "Unsupervised Learning", "Recommender Systems", "Classification Models", "Regression Models");
         c5.add_five_topics("Natural Language Processing Fundamentals", "Ensemble and Advanced Machine Learning Techniques", "Introduction to Deep Learning using TensorFlow", "Deep Learning using Keras", "Capstone Project");
         return c5;
    }
 

    public static void op(String message){
        System.out.println(message);
    }
    public static void op(int message){
        System.out.println(message);
    }
    public static void op(float message){
        System.out.println(message);
    }
    public static void op(Boolean message){
        System.out.println(message);
    }
    public static void op(Character message){
        System.out.println(message);
    }
    public static void op(Student message){
        System.out.println(message);
    }
    public static void op(Map<String,Date> message){
        System.out.println(message);
    }
}
