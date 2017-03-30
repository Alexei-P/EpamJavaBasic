package by.epam.tr.lesson21;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMEquipmentParser {
	public static void main(String[] args) throws SAXException, IOException {
		DOMParser parser = new DOMParser();
		parser.parse("src/by/epam/tr/lesson19/equipment.xml");
		Document document = parser.getDocument();

		Element root = document.getDocumentElement();

		List<Equipment> equipmentList = new ArrayList<Equipment>();

		NodeList equipmentNodes = root.getElementsByTagName("equipment");

		Equipment equipment = null;
		for (int i = 0; i < equipmentNodes.getLength(); i++) {
			equipment = new Equipment();
			Element equipmentElement = (Element) equipmentNodes.item(i);
			
			equipment.setId(Integer.parseInt(getSingleChild(equipmentElement, "id").getTextContent().trim()));
			equipment.setName(getSingleChild(equipmentElement,"name").getTextContent().trim());
			equipment.setCost(Double.parseDouble((getSingleChild(equipmentElement,"cost").
					getTextContent().trim())));
			equipment.setPrice(Double.parseDouble((getSingleChild(equipmentElement,"price").
					getTextContent().trim())));
			equipmentList.add(equipment);
		}

		for(Equipment eq: equipmentList){
			System.out.println(eq);
		}
	}

	private static Element getSingleChild(Element element, String tagName){
		NodeList list = element.getElementsByTagName(tagName);
		Element child = (Element) list.item(0);
		return child;
	}
}
