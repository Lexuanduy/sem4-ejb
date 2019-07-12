package com.tutorial.stateless;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class AdditionSessionBean
 */
@Stateless
public class AdditionSessionBean implements AdditionSessionBeanRemote {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
