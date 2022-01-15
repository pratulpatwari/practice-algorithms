package dev.pratul;

import java.io.UnsupportedEncodingException;
import java.util.Base64;

public class Base64Encoder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String base64encodedString = null;
		try {
			base64encodedString = Base64.getEncoder().encodeToString(
			        "pratul_patwari@yahoo.com:Newuser@123".getBytes("utf-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	         System.out.println("Base64 Encoded String (Basic) :" + base64encodedString);
	}

}
