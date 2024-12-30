import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(432,"paras","p2.bankoti@samsung.com"));
        empList.add(new Employee(245,"rajat","rj.u@samsungg.com"));
        empList.add(new Employee(764,"rahul","rahul.raj@samsungg.com"));
        empList.add(new Employee(211,"aman","a.aman@samsungg.com"));

        System.out.println("Name ascending order");
        Collections.sort(empList,new NameComparator());

        empList.forEach((Employee e) ->{
            System.out.println(e.getName() + " " + e.getEmail()  + " " + e.getId());
        });
        System.out.println("Id ascending order");

        Collections.sort(empList,new IdComparator());

        empList.forEach((Employee e) ->{
            System.out.println( e.getId()+" "+ e.getName() + " " + e.getEmail() );
        });

        System.out.println("Enailid ascending order");

        Collections.sort(empList,new EmailComparator());

        empList.forEach((Employee e) ->{
            System.out.println(e.getName() + " " + e.getEmail()  + " " + e.getId());
        });

        System.out.println("================= Functional interface Lambda expression ===================");

        System.out.println("Descending email id");

        Collections.sort(empList,((Employee e1,Employee e2)-> e2.getEmail().compareTo(e1.getEmail())));
        empList.forEach((Employee e) ->{
            System.out.println(e.getEmail() + " " + e.getName()  + " " + e.getId());
        });

        System.out.println("Descending id");

        Collections.sort(empList, ((Employee e1,Employee e2) -> Integer.compare(e2.getId(), e1.getId())));
        empList.forEach((Employee e) ->{
            System.out.println(e.getId() + " " + e.getName()  + " " + e.getEmail());
        });

        System.out.println("Descending by name");

        Collections.sort(empList ,((Employee e1,Employee e2) -> e2.getName().compareTo(e1.getName())));
        empList.forEach((Employee e) ->{
            System.out.println(e.getName() + " " + e.getId()  + " " + e.getEmail());
        });

    }
}