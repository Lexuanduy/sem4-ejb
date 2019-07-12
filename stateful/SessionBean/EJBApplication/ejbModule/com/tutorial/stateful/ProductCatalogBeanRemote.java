package com.tutorial.stateful;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface ProductCatalogBeanRemote {
	void addProduct(String productName);
	List<String> getProducts();
}
