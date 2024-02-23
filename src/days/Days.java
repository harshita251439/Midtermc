/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package days;

interface Day {
    void printName();
}

class Monday implements Day {
    @Override
    public void printName() {
        System.out.println("Monday");
    }
}

class Tuesday implements Day {
    @Override
    public void printName() {
        System.out.println("Tuesday");
    }
}

class Wednesday implements Day {
    @Override
    public void printName() {
        System.out.println("Wednesday");
    }
}

class Thursday implements Day {
    @Override
    public void printName() {
        System.out.println("Thursday");
    }
}

class Friday implements Day {
    @Override
    public void printName() {
        System.out.println("Friday");
    }
}

class Saturday implements Day {
    @Override
    public void printName() {
        System.out.println("Saturday");
    }
}

class Sunday implements Day {
    @Override
    public void printName() {
        System.out.println("Sunday");
    }
}

public class Days {
    public static void main(String[] args) {
        System.out.println("All the days' names:");
        Day[] days = {new Monday(), new Tuesday(), new Wednesday(), new Thursday(), new Friday(), new Saturday(), new Sunday()};
        for (Day day : days) {
            day.printName();
        }
    }
}
