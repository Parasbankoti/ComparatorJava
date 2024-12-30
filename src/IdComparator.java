import java.util.Comparator;

public class IdComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getId(), o2.getId());

//        if(o1.getId() < o2.getId())
//            return -1;
//        else if (o1.getId() > o2.getId())
//            return 1;
//        return 0;
    }
}
