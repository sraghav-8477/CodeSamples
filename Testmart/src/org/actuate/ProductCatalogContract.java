package org.actuate;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.actuate.model.Product;

@WebService(name="TestMartCatalog", targetNamespace="http://www.testmart.com")
public interface ProductCatalogContract {

	@WebMethod
	List<String> getProductCategories();
	
	@WebMethod
	List<String> getProducts(String category);

	@WebMethod
	boolean addProduct(String category, String product);
	
	@WebMethod
	@WebResult(name="Product")
	List<Product> getProductList(String category);

}