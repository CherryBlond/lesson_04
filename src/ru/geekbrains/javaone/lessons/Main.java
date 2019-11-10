package ru.geekbrains.javaone.lessons;

public class Main {

    public static void main(String[] args) {


        Employee[] empArray = new Employee[5];
        empArray [0]=new Employee("Ivanov Ivan","director","89161547684",120000,48);
        empArray [1]=new Employee("Sidorov Petr","manager","89151547684",97000,41);
        empArray [2]=new Employee("Petrov Nikolay","manager","89161598454",90000,29);
        empArray [3] = new Employee ("Kulikova Olga", "engenier", "89161547600", 50000, 30);
        empArray [4] = new Employee ("Novikiva Irina", "engenier", "89150547684", 50000, 35);


        for (int i=0; i < empArray.length; i++)
            System.out.println(empArray[i].id + " " + empArray[i].getName() + " " + empArray[i].getPosition());


        for (int i=0; i < empArray.length; i++)
            if (empArray[i].Age > 40) empArray[i].print();

        for (int i=0; i < empArray.length; i++)
            if (empArray[i].Age > 45) empArray[i].raiseSalary(5000);


    }

}
