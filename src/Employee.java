public class Employee {

    private String name;
    private String surname;
    private String lastname;

    private int department;
    private int salary;
    private int id;
    private static int Counter;



    // Конструктор
    public Employee(String name, String surname, String lastname, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.department = department;
        this.salary = salary;
        this.id = Counter++;

    }

    // Геттеры
    public String getName() {
        return this.name;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getSurname() {
        return this.surname;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }



    //Сететтеры
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    //вывод
    @Override
    public String toString() {
        return "id: " + id + " Имя " + this.name + " Фамилия " + this.surname + " Отчество " + this.lastname + " Отдел: " + this.department + " Зарплата : " + this.salary;

    }




    public static void main(String[] args) {

        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 30200);
        employee[1] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 30200);
        employee[2] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 30200);
        employee[3] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 3010);
        employee[4] = new Employee("Ivan", "Ivanov", "Ivanovich", 1, 30000);


        for (Employee print : employee) {
            System.out.println(print);
        };


    }


    public static int count(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
        return sum;
    }




}