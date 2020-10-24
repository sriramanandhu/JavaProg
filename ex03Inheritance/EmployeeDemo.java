// Ex. No.: 3	Date:16/10/2020 - Inheritance
// Develop a java application with Employee class with Emp_name, Emp_id, Address, Mail_id,
// Mobile_no as members. Inherit the classes, Programmer, Assistant Professor, Associate
// Professor and Professor from employee class. Add Basic Pay (BP) as the member of all the
// inherited classes with 97% of BP as DA, 10 % of BP as HRA, 12% of BP as PF, 0.1% of BP
// for staff club fund. Generate pay slips for the employees with their gross and net salary.

import java.io.*;
import java.util.*;

public class EmployeeDemo {
    public static void main(String[] args) {
        Programmer p1 = new Programmer();
        p1.getProgrammer();
        p1.calcSalary();
        p1.showBill();

        Professor prof = new Professor();
        prof.getProfessor();
        prof.calcSalary();
        prof.showBill();

        AssistantProfessor ap = new AssistantProfessor();
        ap.getAssistantProfessor();
        ap.calcSalary();
        ap.showBill();

        AssociateProfessor asp = new AssociateProfessor();
        asp.getAssociateProfessor();
        asp.calcSalary();
        asp.showBill();
    }
}

class Employee {
    String emp_name, address, mail_id;
    int emp_id;
    long mobile_no;
    double bpay;

    void getEmployee() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        emp_name = scan.nextLine();
        System.out.print("Enter Employee ID: ");
        emp_id = scan.nextInt();
        System.out.print("Enter Employee Address: ");
        address = scan.next();
        System.out.print("Enter Employee Mail ID: ");
        mail_id = scan.next();
        System.out.print("Enter Employee Mobile Number: ");
        mobile_no = scan.nextLong();
    }

    void showEmployee() {
        System.out.println("\n\t\tSalary slip\n");
        System.out.print("Employee Name  : " + emp_name);
        System.out.println("\t\tEmployee id : " + emp_id);
        System.out.println("Address  : " + address);
        System.out.print("Mail id  : " + mail_id);
        System.out.println("\tMobile No :" + mobile_no);
    }
}

class Programmer extends Employee {
    double da, hra, pf, clubfund, grossSalary, netSalary;

    void getProgrammer() {
        super.getEmployee();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Programmer Basic Pay: ");
        bpay =scan.nextDouble();
    }

    void calcSalary() {
        da = bpay*0.97;
        hra = bpay*0.1;
        pf = bpay*0.12;
        clubfund = bpay*0.001;
        grossSalary = bpay + da + hra + pf + clubfund;
        netSalary = grossSalary - pf - clubfund;
    }

    void showBill() {
        super.showEmployee();
        System.out.println("Designation: Programmer");
        System.out.printf("Basic Pay : %.2f\n", bpay);
        System.out.printf("DA  : %.2f\n", da);
        System.out.printf("HRA : %.2f\n", hra);
        System.out.printf("PF  : %.2f\n", pf);
        System.out.printf("Club Fund : %.2f\n", clubfund);
        System.out.printf("Gross Salary : %.2f\n", grossSalary);
        System.out.printf("Net Salary   : %.2f\n", netSalary);
    }
}

class Professor extends Employee {
    double da, hra, pf, clubfund, grossSalary, netSalary;

    void getProfessor() {
        super.getEmployee();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Professor Basic Pay: ");
        bpay =scan.nextDouble();
    }

    void calcSalary() {
        da = bpay*0.97;
        hra = bpay*0.1;
        pf = bpay*0.12;
        clubfund = bpay*0.001;
        grossSalary = bpay + da + hra + pf + clubfund;
        netSalary = grossSalary - pf - clubfund;
    }

    void showBill() {
        super.showEmployee();
        System.out.println("Designation: Professor");
        System.out.printf("Basic Pay : %.2f\n", bpay);
        System.out.printf("DA  : %.2f\n", da);
        System.out.printf("HRA : %.2f\n", hra);
        System.out.printf("PF  : %.2f\n", pf);
        System.out.printf("Club Fund : %.2f\n", clubfund);
        System.out.printf("Gross Salary : %.2f\n", grossSalary);
        System.out.printf("Net Salary   : %.2f\n", netSalary);
    }
}

class AssociateProfessor extends Employee {
    double da, hra, pf, clubfund, grossSalary, netSalary;

    void getAssociateProfessor() {
        super.getEmployee();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Associate Professor Basic Pay: ");
        bpay =scan.nextDouble();
    }

    void calcSalary() {
        da = bpay*0.97;
        hra = bpay*0.1;
        pf = bpay*0.12;
        clubfund = bpay*0.001;
        grossSalary = bpay + da + hra + pf + clubfund;
        netSalary = grossSalary - pf - clubfund;
    }

    void showBill() {
        super.showEmployee();
        System.out.println("Designation: Associate Professor");
        System.out.printf("Basic Pay : %.2f\n", bpay);
        System.out.printf("DA  : %.2f\n", da);
        System.out.printf("HRA : %.2f\n", hra);
        System.out.printf("PF  : %.2f\n", pf);
        System.out.printf("Club Fund : %.2f\n", clubfund);
        System.out.printf("Gross Salary : %.2f\n", grossSalary);
        System.out.printf("Net Salary   : %.2f\n", netSalary);
    }
}

class AssistantProfessor extends Employee {
    double da, hra, pf, clubfund, grossSalary, netSalary;

    void getAssistantProfessor() {
        super.getEmployee();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Assistant Professor Basic Pay: ");
        bpay =scan.nextDouble();
    }

    void calcSalary() {
        da = bpay*0.97;
        hra = bpay*0.1;
        pf = bpay*0.12;
        clubfund = bpay*0.001;
        grossSalary = bpay + da + hra + pf + clubfund;
        netSalary = grossSalary - pf - clubfund;
    }

    void showBill() {
        super.showEmployee();
        System.out.println("Designation: Assistant Professor");
        System.out.printf("Basic Pay : %.2f\n", bpay);
        System.out.printf("DA  : %.2f\n", da);
        System.out.printf("HRA : %.2f\n", hra);
        System.out.printf("PF  : %.2f\n", pf);
        System.out.printf("Club Fund : %.2f\n", clubfund);
        System.out.printf("Gross Salary : %.2f\n", grossSalary);
        System.out.printf("Net Salary   : %.2f\n", netSalary);
    }
}
