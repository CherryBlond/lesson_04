package ru.geekbrains.javaone.lessons;

public class Employee {
    static int Count = 0;

    String FullName;
    String Position;
    String PhoneNumber;
    int Salary;
    int Age;
    int id;

    Employee(String FullName, String Position, String PhoneNumber, int Salary, int Age) {
        this.FullName = FullName;
        this.Position = Position;
        this.PhoneNumber = PhoneNumber;
        this.Salary = Salary;
        this.Age = Age;
        Count ++;
        this.id = Count;


    }


    public String getName() {
        return FullName;
    }

    public String getPosition() {
        return Position;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public int getSalary() {
        return Salary;
    }

    public int getAge() {
        return Age;
    }

    public void print() {
        System.out.println(FullName + " " + Position);

    }
    public void raiseSalary (int mount) {
        this.Salary = this.Salary + mount;
    }

}

