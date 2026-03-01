package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {

    JButton add_Employee, add_Room, add_Driver, logout ,back;
    admin(){

        add_Employee = new JButton("ADD EMPLOYEE");
        add_Employee.setBounds(250,230,200,30);
        add_Employee.setForeground(Color.BLACK);
        add_Employee.setFont(new Font("Tahoma" , Font.BOLD,15));
        add_Employee.addActionListener(this);
        add(add_Employee);

        add_Room = new JButton("ADD ROOM");
        add_Room.setBounds(250,380,200,30);
        add_Room.setForeground(Color.BLACK);
        add_Room.setFont(new Font("Tahoma" , Font.BOLD,15));
        add_Room.addActionListener(this);
        add(add_Room);


        add_Driver = new JButton("ADD DRIVERS");
        add_Driver.setBounds(250,530,200,30);
        add_Driver.setForeground(Color.BLACK);
        add_Driver.setFont(new Font("Tahoma" , Font.BOLD,15));
        add_Driver.addActionListener(this);
        add(add_Driver);

        logout = new JButton("LOGOUT");
        logout.setBounds(10,700,110,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFont(new Font("Tahoma" , Font.BOLD,15));
        logout.addActionListener(this);
        add(logout);


        back= new JButton("BACK");
        back.setBounds(110,700,110,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Tahoma" , Font.BOLD,15));
        back.addActionListener(this);
        add(back);





        getContentPane().setBackground(new Color(3,45,48));
        setLayout(null);
        setSize(1950, 1090);
        setVisible(true);
    }

    public static void main(String[] args) {
        new admin();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource() == add_Employee){
            new AddEmployee();
            setVisible(false);
        }else if(e.getSource()== add_Room){
            new AddRoom();
        } else if(e.getSource() == add_Driver){
            new addDriver();
            setVisible(false);
        }else if(e.getSource() == logout){
            new Login();
            setVisible(false);
        }else if(e.getSource() == back){
            new DashBoard();
            setVisible(false);
        }

    }
}
