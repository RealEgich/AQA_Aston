package Lesson_4;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee("Егор Кравченко", "AQA", "egich008@gmail.com", "+375442889889", 1000, 26);
        employee.printEmployee();

        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Иванов Иван Иванович", "seller", "egich001@gmail.com", "+375442889881", 1000, 25);
        employees[1] = new Employee("Александров Александр Александрович", "seller", "egich002@gmail.com", "+375442889882", 1200, 24);
        employees[2] = new Employee("Павлов Павел Павлович", "seller", "egich003@gmail.com", "+375442889883", 1400, 27);
        employees[3] = new Employee("Семёнов Семен Семенович", "seller", "egich004@gmail.com", "+375442889884", 1600, 28);
        employees[4] = new Employee("Викторов Виктор Викторович", "seller", "egich005@gmail.com", "+375442889885", 1800, 29);
        employees[1].printEmployee();

        Park.Attraction attraction = new Park().new Attraction("Mix", "10 a.m - 9 p.m", 7);
        System.out.println(attraction);


    }
}
