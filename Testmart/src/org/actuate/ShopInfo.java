package org.actuate;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import org.actuate.exception.InvalidInputException;

@WebService
@SOAPBinding(style=Style.RPC)
public class ShopInfo {

		@WebMethod
		@WebResult(partName="lookupOutput")
		public String	getProperty(@WebParam(partName="lookupInput") String property) throws InvalidInputException {
			String response = null;
			
			if("shopName".equals(property)) {
				response = "Testmart"; 
			}else if("since".equals(property)){
				response="since 2012";
			}else {
				throw new InvalidInputException("Invalid Input", property+" is not a valid input");
			}
			return response;
		}
}
