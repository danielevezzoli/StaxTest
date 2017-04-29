package it.unibs.ing.ieee.staxtest;

import java.io.FileNotFoundException;

import javax.xml.stream.XMLStreamException;

public class DriverMain {

	public static void main(String[] args) {
		StaxHandler stax = new StaxHandler();
		
		try {
			stax.parseXml("input.xml");
		} catch (FileNotFoundException | XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(stax.toString());
		
	}

}

