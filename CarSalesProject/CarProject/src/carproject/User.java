/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import java.util.ArrayList;
import javax.swing.JTextField;



public class User {
   ArrayList<String> username=new ArrayList<>();
   ArrayList<String> password=new ArrayList<>();
    
    
    public User(){
        
        username.add("amany");
        username.add("sarah");
        username.add("salsabil");
        username.add("shimaa");
        username.add("safaa");
        username.add("maryam");
        
        password.add("123a");
        password.add("123b");
        password.add("123c");
        password.add("123d");
        password.add("123e");
        password.add("123f");

    }
    
    
    
    public void display(JTextField t1 , JTextField t2)
    {
        Userr u = new Userr();
        u.setVisible(true);
    }
}
