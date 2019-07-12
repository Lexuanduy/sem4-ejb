/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package module3client1;

import Beans.AdditionBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author LG
 */
public class Main {
    @EJB
    private static AdditionBeanRemote additionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Result: " + additionBean.addition(4, 2));
    }
    
}
