package com.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.commons.lang3.tuple.MutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class Util {
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
