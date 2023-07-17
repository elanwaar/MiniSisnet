package XML;




import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


public class readXML {
	
	

    public static void main(String[] args) {}
    
    public static String insertQuery(String table){
    	
    	String insertQuery="";
    	
    	if(table == "client") {
    		
    		try {
                Element insertElement = (Element) getRootElement().getElementsByTagName("insert").item(0);
                insertQuery = insertElement.getElementsByTagName("client").item(0).getTextContent();
                
            } catch (Exception e) {
                e.printStackTrace();
            }
    	}
    	
    	Element insertElement = (Element) getRootElement().getElementsByTagName("insert").item(0);
        insertQuery = insertElement.getElementsByTagName(table).item(0).getTextContent();
        
    	
    	return insertQuery;
    }
    
    public static String selectAllQuery(String table) {
    	
    	String selectAllQuery="";
    	try {
    		
    		Element selectElement = (Element) getRootElement().getElementsByTagName("select").item(0);
    		selectAllQuery = selectElement.getElementsByTagName(table).item(0).getTextContent();
    		
    	} catch (Exception e) {
    		// TODO: handle exception
    	}
    	return selectAllQuery;
    }
    
    public static String selectByIdQuery(String table) {
    	
    	String selectByIdQuery="";
    	
    	try {
    		Element selectElement = (Element) getRootElement().getElementsByTagName("select").item(1);
    		selectByIdQuery = selectElement.getElementsByTagName(table).item(0).getTextContent();
    	} catch (Exception e) {
    		// TODO: handle exception
    	}
    	
    	return selectByIdQuery;
    }
    
    public static String updateQuery(String table) {
    	 
    	String updateQuery="";
    	try {
    		Element updateElement = (Element) getRootElement().getElementsByTagName("update").item(0);
    		updateQuery = updateElement.getElementsByTagName(table).item(0).getTextContent();
    	} catch (Exception e) {
    		// TODO: handle exception
    	}
    	
    	return updateQuery;
    }
    
    public static String deleteQuery(String table) {
    	String deleteQuery = "";
    	
				Element deleteElement = (Element) getRootElement().getElementsByTagName("delete").item(0);
				deleteQuery = deleteElement.getElementsByTagName(table).item(0).getTextContent();
				
			
    	return deleteQuery;
    }
    
    private static Element getRootElement() {
    	Element root; 
    	root = null;
    	try {
    		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        	DocumentBuilder builder;
			builder = factory.newDocumentBuilder();
			Document document = builder.parse("C:\\mini_sisnet_workspace\\demo\\src\\main\\java\\XML\\fileXML.xml");
	    	root = (Element) document.getElementsByTagName("queries").item(0);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return root;
    	
    }

}
