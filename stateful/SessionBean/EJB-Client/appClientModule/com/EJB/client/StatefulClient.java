package com.EJB.client;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.ejb.*;
import com.tutorial.stateful.ProductCatalogBeanRemote;

public class StatefulClient {
	@EJB
	private static ProductCatalogBeanRemote productCatalogBean;
	
	public static void main(String[] args) {
		List PList = new ArrayList();
		productCatalogBean.addProduct("Laptop");
		productCatalogBean.addProduct("Cellphone");
		productCatalogBean.addProduct("Personal Digital Assistant");
		
		productCatalogBean.getProducts();
		Iterator itr = PList.iterator();
		while (itr.hasNext()) {
			String str = (String) itr.next();
			System.out.print(str + "\n");
		}
		System.out.println();
	}
}
