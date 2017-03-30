package by.epam.tr.lesson20;

import java.io.IOException;
import java.util.List;

import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SAXDemo {
	
	public static void main(String[] args) throws SAXException, IOException{
		XMLReader reader = XMLReaderFactory.createXMLReader();
		EquipmentSAXHandler handler = new EquipmentSAXHandler();
		reader.setContentHandler(handler);
		reader.parse(new InputSource("src/by/epam/tr/lesson19/equipment.xml"));
		
		reader.setFeature("http://xml.org/sax/features/validation", true);
		
		reader.setFeature("http://xml.org/sax/features/namespaces", true);
		
		reader.setFeature("http://xml.org/sax/features/string-interning", true);
		
		reader.setFeature("http://apache.org/xml/features/validation/schema",
				false);
		
		List<Equipment> eqList = handler.getEqupimentList();
		
		for (Equipment eq: eqList){
			System.out.println(eq);
		}
	}
}
