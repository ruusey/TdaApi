package com.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.Properties;

import javax.xml.parsers.ParserConfigurationException;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.InvalidPasswordException;
import org.fit.pdfdom.PDFDomTree;

public class Util {
	public static void main(String[] args) {
		try {
			generateHTMLFromPDF("C:/temp/ial.pdf");
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	public static void generateHTMLFromPDF(String filename) throws InvalidPasswordException, IOException, ParserConfigurationException {
	    PDDocument pdf = PDDocument.load(new File(filename));
	    Writer output = new PrintWriter("C:/temp/pdf.html", "utf-8");
	    new PDFDomTree().writeText(pdf, output);
	     
	    output.close();
	}
	public static Pair<String,String> loadApiCredentials(String path) {
		try (InputStream input = new FileInputStream("C:/temp/backendless.properties")) {

            Properties prop = new Properties();

            // load a properties file
            prop.load(input);
            return new MutablePair<>(prop.getProperty("appId"),prop.getProperty("apiKey"));
           

        } catch (IOException ex) {
            ex.printStackTrace();
        }
		return null;
	}
}
