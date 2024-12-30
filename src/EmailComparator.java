import java.util.Comparator;

public class EmailComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return o1.getEmail().compareTo(o2.getEmail());
    }
}
