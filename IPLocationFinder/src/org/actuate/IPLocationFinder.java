/**
 * 
 */
package org.actuate;

import net.webservicex.GeoIP;
import net.webservicex.GeoIPService;
import net.webservicex.GeoIPServiceSoap;

/**
 * @author user
 *
 */
public class IPLocationFinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getCountryName("127.0.01");
	}
	
	public static void getCountryName(String ipAddress) {
		GeoIPService geoIPservice = new GeoIPService();
		GeoIPServiceSoap geoIPServiceSoap = geoIPservice.getGeoIPServiceSoap();
		GeoIP geoIP = geoIPServiceSoap.getGeoIP(ipAddress);
		System.out.println(geoIP.getCountryName());
	}
}
