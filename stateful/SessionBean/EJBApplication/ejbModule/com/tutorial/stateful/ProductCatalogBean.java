package com.tutorial.stateful;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateful;

/**
 * Session Bean implementation class ProductCatalogBean
 */
@Stateful
@LocalBean
public class ProductCatalogBean implements ProductCatalogBeanRemote {

	List<String> products;
    /**
     * Default constructor. 
     */
    public ProductCatalogBean() {
        // TODO Auto-generated constructor stub
    	products = new ArrayList<String>();
    }
    
    public void addProduct(String productName) {
		products.add(productName);
	}
    
    public List<String> getProducts() {
    	return products;
    }

}
