package com.tutorial.stateless;

import javax.ejb.Remote;

@Remote
public interface AdditionSessionBeanRemote {
	int add(int a,int b);  
}
