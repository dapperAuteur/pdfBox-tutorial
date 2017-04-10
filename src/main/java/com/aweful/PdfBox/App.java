package com.aweful.PdfBox;

import java.io.IOException;

import org.apache.pdfbox.pdmodel.PDDocument;

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
        document.save("C:\\Users\\amcdonald\\Desktop\\myDoc.pdf");
        System.out.println("PDF Created");
        document.close();
    }
}
