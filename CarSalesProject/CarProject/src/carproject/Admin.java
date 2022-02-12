/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carproject;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author hp
 */
public class Admin extends User{
    public String adminUsername;
    public String pass;
    
  
    
    public Admin(){
        adminUsername ="admin";
        pass="1234a";
    }
    
  @Override
    public void display(JTextField t1 , JTextField t2)
    {
        outer:  for (int i=0 ; i<super.password.size(); i++){
           for (int j=0;j<super.password.size();j++){
          if(t1.getText().equals(adminUsername) && t2.getText().equals(pass)){
          Adminn a = new Adminn();
          a.setVisible(true);
          break outer;
        }
          
          else if(t1.getText().equals(super.username.get(j)) && t2.getText().equals(super.password.get(j))){
          super.display(t1, t2);
          break outer;
         }
          
          
           }
        if(!t1.getText().equals(adminUsername) && !t2.getText().equals(pass) && !t1.getText().equals(super.username.get(i)) && !t2.getText().equals(super.password.get(i)))
        JOptionPane.showMessageDialog( null , "Failed Log In! \nThe Username or the password that you've entered is incorrect\n" , "Alert",JOptionPane.ERROR_MESSAGE);
         break;
        }
      }
}
