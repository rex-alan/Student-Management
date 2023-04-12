import java.util.*;

public class Course {

    String name,duration;
    int fees;

    ArrayList<String> topics = new ArrayList<>(); // is same as ArrayList<String> topics = new ArrayList<String>();

    public void add_topics(String t){
        topics.add(t);
    }

    public void add_five_topics(String a,String b,String c,String d,String e){
        topics.addAll(Arrays.asList(a,b,c,d,e));
    }

    Course(){}

    Course(String Name,int Fees, String Duration){
        name = Name;
        fees = Fees;
        duration = Duration;
    }

    @Override
    public String toString(){
        String display = "";
        display =  "Course Name : " + name +"\nFee : " + fees +"\nDuration : " + duration;
        display+= "\nTopics Covered : \n";
        for(int i=0 ;i<topics.size();i++){
            int n = i;
            display += ++n +". "+ topics.get(i) + "\n";
        }
        return display +"\n";
    }

}
