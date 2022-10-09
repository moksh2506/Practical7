package com.company;
import java.util.*;

class AccountOwner {
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    int we;
    double inc;
    Boolean czs;
    static void Practical7_3() {
        System.out.println("************* Welcome *************");
        System.out.println("--> For Job Apply Fill the Form <--");
    }
    void info() {
        System.out.println("Enter Your Name : ");
        name = sc.next();
        System.out.println("Enter Your Age : ");
        age = sc.nextInt();
        System.out.println("Enter Your Monthly Income : ");
        inc = sc.nextDouble();
        System.out.println("Enter Your Work Experince (In Years): ");
        we = sc.nextInt();
        System.out.println("What is Your CitizenShip? (For Indian true Otherwise false) :- ");
        czs = sc.nextBoolean();
    }
    void check() {
        if (age >= 21 && age <= 60) {
            System.out.println("Your Age is : " + age);
        } else if (inc >= 15000) {
            System.out.println("Your Monthly Income is : " + inc);
        } else if (we >= 1) {
            System.out.println("Your Work Experience is : " + we);
        } else if (czs == true) {
            System.out.println("You Are A Lucky Indian Citizenship ......");
        }
    }
}

public class pr7_3 {
    public static void main(String[] args) {
        int count = 0;
        ArrayList a = new ArrayList<>();
        ArrayList<AccountOwner> personHolder = new
                ArrayList<AccountOwner>();
        AccountOwner.Practical7_3();
        for (int i = 1; i <= 2; i++) {
            personHolder.add(new AccountOwner());
        }
        for (AccountOwner p : personHolder) {
            p.info();
            p.check();
            if (p.age >= 21 && p.age <= 60 && p.inc >= 15000 && p.we >= 1 &&
                    p.czs == true) {
                System.out.println("------- You are Eligible ------");
                System.out.println("Your Name is : " + p.name);
                count++;
                a.add(p.name);
            } else {
                System.out.println(":( You Are Not Eligible :(");
            }
        }
        System.out.println("The Number of Eligible Candidates : " + count);
        System.out.println("The Number of Not Eligible Candidates : " + (2 -
                count));
        System.out.println("All Eligible Candidates Are : " + a);

        System.out.println("This Form is Created by 21CE099 :):):)");
    }
}
