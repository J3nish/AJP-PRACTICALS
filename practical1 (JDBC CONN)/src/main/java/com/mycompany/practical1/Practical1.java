/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.practical1;

import java.io.*;
import java.sql.*;
import java.util.*;
/**
 *
 * @author Meet
 */
public class Practical1 {

    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "");
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter Username : ");
            String name = sc.nextLine();
            System.out.print("Enter Password : ");
            String password = sc.nextLine();
            
            String query = "select * from login where username = ? and password = ?";
            
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();
            
            if(rs.next())
            {
                System.out.println("Login Successfull!");
            }else{
                System.out.println("Cant login, Invalid Credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
