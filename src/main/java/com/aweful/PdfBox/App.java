package com.aweful.PdfBox;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        PDDocument document = new PDDocument();
        for(int i=0; i<10; i++){
        	PDPage my_page = new PDPage();
        	document.addPage(my_page);
        }
        document.save("C:\\Users\\amcdonald\\Desktop\\myDoc.pdf");
        System.out.println("PDF Created");
        document.close();
    }
}
