/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9_EmployeeManager;

import java.util.Scanner;

/**
 *
 * @author NGOC TY
 */
public class Employee {
    protected int employeeID=0;
    protected String employeeName=null;
    protected String address=null;
    protected String phoneNumber=null;
    protected String gender=null;
    protected String birthday=null;
    protected float salary=0;
    
    public void input(){
        Scanner scan=new Scanner(System.in);
        System.out.println("EmployeeID: ");
        employeeID=scan.nextInt();
        System.out.println("EmployeeName: ");
        scan.nextLine();
        employeeName=scan.nextLine();
        System.out.println("Address: ");
        address=scan.nextLine();
        System.out.println("PhoneNumber: ");
        phoneNumber=scan.nextLine();
        System.out.println("Gender: ");
        gender=scan.nextLine();
        System.out.println("Birthday: ");
        birthday=scan.nextLine();
        System.out.println("Salary: ");
        salary=scan.nextFloat();
    }
    public void output(){
        System.out.println("EmployeeID: "+employeeID);
        System.out.println("EmployeeName: "+employeeName);
        System.out.println("Address: "+address);
        System.out.println("PhoneNumber: "+phoneNumber);
        System.out.println("Gender: "+gender);
        System.out.println("Birthday: "+birthday);
        System.out.println("Salary: "+salary);
                
    }
}
