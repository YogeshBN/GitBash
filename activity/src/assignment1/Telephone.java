package assignment1;
import java.util.*;  
class Tele {    
String name;  
int number;  
public Tele(String name,int number ) {

    this.name = name;  
    this.number = number;  
     
}  
}  
public class Telephone{  
public static void main(String[] args) {  
    HashSet<Tele> set=new HashSet<Tele>();  
    
    Tele b1=new Tele("Ramesh",43765453);
    Tele b2=new Tele("Gokul",34765245);
    Tele b3=new Tele("Raja",54584454);
    Tele b4=new Tele("kamlesh",98744535);
    Tele b5=new Tele("Yogi",64564556);
   
    set.add(b1);  
    set.add(b2);  
    set.add(b3);
    set.add(b4);
    set.add(b5);
     
    for(Tele b:set){  
    System.out.println(b.name+" "+b.number);  
    }  
}  
}