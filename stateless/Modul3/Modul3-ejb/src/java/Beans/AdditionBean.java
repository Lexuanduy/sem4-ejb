/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import javax.ejb.Stateless;

/**
 *
 * @author LG
 */
@Stateless
public class AdditionBean implements AdditionBeanRemote {

    @Override
    public int addition(int a, int b) {
        return a + b;
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
