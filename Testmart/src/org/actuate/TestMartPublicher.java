/**
 * 
 */
package org.actuate;

import javax.xml.ws.Endpoint;

/**
 * @author user
 *
 */
public class TestMartPublicher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Endpoint.publish("http://localhost:1234/ProductCatalog", new ProductCatalog());
	}

}
