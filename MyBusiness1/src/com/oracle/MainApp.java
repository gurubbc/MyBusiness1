package com.oracle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext; 
public class MainApp { 
	public static void main(String[] args) { 
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		Customer cust = (Customer) context.getBean("customer"); 
		System.out.println(cust.getCustomerName()); 

		
		Product costlyProduct=findCostliestProduct(cust.getProducts());
		System.out.println(costlyProduct.getProductName()+" and "+costlyProduct.getProductPrice());
	}

	public static Product findCostliestProduct(List<Product> prods)
	{
		double max=0.0;
		Product prodTemp;
		for (Product prod:prods)
		{
			if (prod.getProductPrice()>max)
			{
				max=prod.getProductPrice();
				prodTemp=prod;
			}
		}
		return prodTemp;
	}
	
	public static Product findCheapestProduct(List<Product> prods)
	{
		// write your logic
		return null;
	}

}
