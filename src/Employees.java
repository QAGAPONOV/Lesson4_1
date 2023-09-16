public class Employees {
    private int id;
    private String name;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }
    public Employees(int id, String name, String position, String email, String phone, int salary, int age) {
        this.id = id;
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    public void printInfo() {
        System.out.println("id "+id+"name "+name+"position "+position+"email "+email+"phone "+phone+"salary "+salary+"age "+age);
    }
}