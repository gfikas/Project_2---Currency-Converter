package com.example.model;
import java.util.*;
import java.net.*;
import java.io.*;

public class Converter {
	public String getExchangeRate(String from, String amount, String to) {
		String answer = "NULL";
		try {
			URL convert = new URL("http://www.google.com/ig/calculator?hl=en&q="+ amount + from + "=?" + to);
			BufferedReader in = new BufferedReader(new InputStreamReader(convert.openStream()));
			answer = in.readLine();
			in.close();
		}
		catch (MalformedURLException mue) {
			System.exit(1);
		}	
		catch (IOException ioe) {
			System.exit(1);
		}
		return(answer);
	}
}
