/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacyjava.ServiceLayer;
import pharmacyjava.AccessLayer.Sellin_AccessLayer;

/**
 *
 * @author Dikshant
 */
public class AgentSellin_ServiceLayer {
    public void update(int oldQty,int nqty,int Medid)
    {
         int newQty=oldQty-nqty;
        
            Sellin_AccessLayer sa=new Sellin_AccessLayer();
            sa.update(newQty, Medid); 
            
    }
}
