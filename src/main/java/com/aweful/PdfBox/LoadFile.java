package com.aweful.PdfBox;

import java.io.File;
import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

public class LoadFile {
	
	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\Users\\amcdonald\\Desktop\\myDoc.pdf");
		PDDocument doc = PDDocument.load(file);
		
		System.out.println("PDF Loaded");
		
		doc.addPage(new PDPage());
		
		doc.save("C:\\Users\\amcdonald\\Desktop\\myDoc.pdf");
		
		doc.close();
	}
	

}
