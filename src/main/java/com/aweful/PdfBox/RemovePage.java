package com.aweful.PdfBox;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;

public class RemovePage {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		PDDocument document = new PDDocument();
		
		File file = new File("C:\\Users\\amcdonald\\Desktop\\myDoc.pdf");
		PDDocument doc = document.load(file);
		
		int noOfPages = doc.getNumberOfPages();
		System.out.println(noOfPages);
		
		doc.removePage(3);
		
		int newNoOfPages = doc.getNumberOfPages();
		
		System.out.println("pages removed and there are " + newNoOfPages + " pages left");
		
		doc.save("C:\\Users\\amcdonald\\Desktop\\myDoc.pdf");
		
		document.close();

	}

}
