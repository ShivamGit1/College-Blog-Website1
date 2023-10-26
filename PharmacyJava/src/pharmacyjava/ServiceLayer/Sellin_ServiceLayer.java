/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pharmacyjava.ServiceLayer;
import pharmacyjava.AccessLayer.AgentSellin_AccessLayer;


public class Sellin_ServiceLayer {
    public void update(int oldQty,int nqty,int Medid)
    {
        int newQty=oldQty-nqty;
        AgentSellin_AccessLayer sa=new AgentSellin_AccessLayer();
        sa.update(newQty, Medid);       
    }
}
