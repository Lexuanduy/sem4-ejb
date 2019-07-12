package com.EJB.client;

import javax.ejb.EJB;

import com.tutorial.stateless.AdditionSessionBeanRemote;

public class StatelessClient {
	@EJB
	private static AdditionSessionBeanRemote remote;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    System.out.println(remote.add(32,32));
	}

}
