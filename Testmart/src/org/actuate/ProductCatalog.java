package org.actuate;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.actuate.business.ProductServiceImpl;
import org.actuate.model.Product;
@WebService(endpointInterface="org.actuate.ProductCatalogContract",portName="TestMartCatalogPort",serviceName="TestMartCatalogService")
public class ProductCatalog implements ProductCatalogContract {

		
		ProductServiceImpl productServiceImpl = new ProductServiceImpl();
		
		/* (non-Javadoc)
		 * @see org.actuate.ProductCatalogContract#getProductCategories()
		 */
		@Override
		@WebMethod(action="fetch_Categories", operationName="fetchCategories")
		public List<String> getProductCategories(){
			return productServiceImpl.getProductCategories();
		}
		
		/* (non-Javadoc)
		 * @see org.actuate.ProductCatalogContract#getProducts(java.lang.String)
		 */
		@Override
		@WebMethod(action="fetch_products", operationName="fetchProducts")
		public List<String> getProducts(String category){
			return productServiceImpl.getProduct(category);
		}
		
		/* (non-Javadoc)
		 * @see org.actuate.ProductCatalogContract#addProduct(java.lang.String, java.lang.String)
		 */
		@Override
		@WebMethod(action="add_product", operationName="insertProduct")
		public boolean addProduct(String category, String product) {
			return productServiceImpl.addProduct(category, product);
		}
		
		/* (non-Javadoc)
		 * @see org.actuate.ProductCatalogContract#getProductList(java.lang.String)
		 */
		@Override
		@WebMethod(action="fetch_productsList", operationName="fetchProductsList")
		public List<Product> getProductList(String category){
			return productServiceImpl.getProductList(category);
		}
}
