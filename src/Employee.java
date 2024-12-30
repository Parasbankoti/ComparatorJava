public class Employee {
    private String name;
    private Integer id;
    private String email;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    Employee(Integer id, String name, String email){
        this.id=id;
        this.name=name;
        this.email=email;
    }
}
