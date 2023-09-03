import java.util.*;
public class Main {
   public static void main(String[] args) {
        Member memeber1 = new Member("Akshay", 1, 10000);
        System.out.println(memeber1.getName() + " added succefully");
        Event event1 = new Event(1, "BBD", new Date(), "iphone 14");
        System.out.println(event1.getEventName() + " with prize " + event1.getPrize() + " added successfully");
        Register registration1 = new Register(memeber1, event1);
        
   }
}
