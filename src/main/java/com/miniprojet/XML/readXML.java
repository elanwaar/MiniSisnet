package com.miniprojet.XML;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Timestamp;

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

import org.w3c.dom.Element;

import org.w3c.dom.NodeList;

import com.miniprojet.sisnet.DAO.connection_base_donnees;




public class readXML {

    public static void main(String[] args) {

        

    }
    public static String insertQuery() {
    	String insertQuery="";
    	try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("src/main/java/com/miniprojet/xml/fileXML.xml");
            
            Element root = (Element) document.getElementsByTagName("queries").item(0);
            insertQuery = root.getElementsByTagName("insert").item(0).getTextContent();
          
        } catch (Exception e) {
            e.printStackTrace();
        }
    	return insertQuery;
    }

}
