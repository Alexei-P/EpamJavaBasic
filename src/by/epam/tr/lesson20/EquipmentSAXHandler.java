package by.epam.tr.lesson20;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.helpers.DefaultHandler;

public class EquipmentSAXHandler extends DefaultHandler {
	private List<Equipment> equipmentList = new ArrayList<Equipment>();
	private Equipment equipment;
	private StringBuilder sb;

	public List<Equipment> getEqupimentList() {
		return equipmentList;
	}

	public void startDocument() throws SAXException {
		System.out.println("Parsing started");
	}

	public void endDocument() throws SAXException {
		System.out.println("Parsing ended");
	}

	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		System.out.println("startElement -> " + "uri: " + uri + ", localName: " + localName + ", qName: " + qName);

		sb = new StringBuilder();
		if (qName.equals("equipment")) {
			equipment = new Equipment();
			//equipment.setId(Integer.parseInt(attributes.getValue("id")));
		}
	}

	public void characters(char[] buffer, int start, int length) {
		sb.append(buffer, start, length);
	}

	public void endElement(String uri, String localName, String qName) throws SAXException {
		EquipmentTagName tagName = EquipmentTagName.valueOf(qName.toUpperCase());
		switch (tagName) {
		case ID:
			equipment.setId(Integer.parseInt(sb.toString()));
		case NAME:
			equipment.setName(sb.toString());
			break;
		case COST:
			equipment.setCost(Double.parseDouble(sb.toString()));
			break;
		case PRICE:
			equipment.setPrice(Double.parseDouble(sb.toString()));
			break;
		case EQUIPMENT:
			equipmentList.add(equipment);
			equipment = null;
			break;
		}

	}

	public void warning(SAXParseException exception) {
		System.err.println("WARNING: line " + exception.getLineNumber() + ": " + exception.getMessage());
	}

	public void error(SAXParseException exception) {
		System.err.println("ERROR: line " + exception.getLineNumber() + ": " + exception.getMessage());
	}

	public void fatalError(SAXParseException exception) throws SAXException {
		System.err.println("FATAL: line " + exception.getLineNumber() + ": " + exception.getMessage());
		throw (exception);
	}
}
