/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai9_EmployeeManager;


import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author NGOC TY
 */
public class Manage {
    ArrayList<OfficialEmployee> officialList=new ArrayList<>();
    ArrayList<ParttimeEmployee> parttimeList=new ArrayList<>();
    
    public void readFileOfficialEmployee() throws UnsupportedEncodingException{
        try {
             Scanner scan=new Scanner(Paths.get("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai9_EmployeeManager\\OfficialEmployee.txt"),"UTF-8");
            while(scan.hasNextLine()){
                OfficialEmployee oe=new OfficialEmployee();
                oe.employeeID=scan.nextInt();
                oe.salary=scan.nextFloat();
                String s=scan.nextLine().trim();
                StringTokenizer token=new StringTokenizer(s,",");
                oe.employeeName=token.nextToken();
                oe.address=token.nextToken();
                oe.phoneNumber=token.nextToken();
                oe.gender=token.nextToken();
                oe.birthday=token.nextToken();
                officialList.add(oe);
            }
            scan.close();
        } catch (IOException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
       
        
    }
    public void writeFileOfficialEmloyee() throws UnsupportedEncodingException, IOException{
        try {
            FileOutputStream fos=new FileOutputStream("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai9_EmployeeManager\\OfficialEmployee.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw=new BufferedWriter(osw);
            for(OfficialEmployee o: officialList){
                bw.write(o.employeeID+" ");
                bw.write(o.salary+" ");
                bw.write(o.employeeName+",");
                bw.write(o.address+",");
                bw.write(o.phoneNumber+",");
                bw.write(o.gender+",");
                bw.write(o.birthday+"\n");
            }
            bw.close();
            osw.close();
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void readFileParttimeEmployee(){
        try {
            Scanner scan=new Scanner(Paths.get("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai9_EmployeeManager\\ParttimeEmployee.txt"),"UTF-8");
            while(scan.hasNextLine()){
                ParttimeEmployee pe=new ParttimeEmployee();
                pe.employeeID=scan.nextInt();
                pe.salary=scan.nextFloat();
                String s=scan.nextLine().trim();
                StringTokenizer token=new StringTokenizer(s,",");
                pe.employeeName=token.nextToken();
                pe.address=token.nextToken();
                pe.phoneNumber=token.nextToken();
                pe.gender=token.nextToken();
                pe.birthday=token.nextToken();
                parttimeList.add(pe);
            }
            scan.close();
        } catch (IOException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void writeFileParttimeEmployee() throws UnsupportedEncodingException, IOException{
        try {
            FileOutputStream fos=new FileOutputStream("D:\\NetBean\\Java\\JavaApplication6\\src\\Bai9_EmployeeManager\\ParttimeEmployee.txt");
            OutputStreamWriter osw=new OutputStreamWriter(fos,"UTF-8");
            BufferedWriter bw=new BufferedWriter(osw);
            for(ParttimeEmployee p: parttimeList){
                bw.write(p.employeeID+" ");
                bw.write(p.salary+" ");
                bw.write(p.employeeName+",");
                bw.write(p.address+",");
                bw.write(p.phoneNumber+",");
                bw.write(p.gender+",");
                bw.write(p.birthday+"\n");
            }
            bw.close();
            osw.close();
            fos.close();
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Manage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
