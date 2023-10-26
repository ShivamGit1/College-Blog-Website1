/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacyjava.AccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
  
/**
 *
 * @author Dikshant
 */
public class AgentSellin_AccessLayer {
    Connection Con =null;
    Statement St =null;
    ResultSet Rs=null;
  
    public void update(int newQty, int Medid)
    {
         try {
                     Con=DriverManager.getConnection("jdbc:derby://localhost:1527/pharmadb","User1","User1");
                       
                     String UpdateQuery="UPDATE User1.MEDICINETBL set MEDQTY ="+newQty+"where MEDID ="+Medid+"";
                       
                    Statement Add=Con.createStatement();
                    Add.executeUpdate(UpdateQuery);
               
                   // JOptionPane.showMessageDialog(this, "Medicine Updated Successfully");
                 
                   } 
                   catch (SQLException e)
                   {
                       e.printStackTrace();
                   }
    }
}
