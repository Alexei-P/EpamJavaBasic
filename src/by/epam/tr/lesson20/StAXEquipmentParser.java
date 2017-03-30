package by.epam.tr.lesson20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class StAXEquipmentParser {
	public static void main(String[] args) {
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		try {
			InputStream is = new FileInputStream("src/by/epam/tr/lesson19/equipment.xml");
			XMLStreamReader reader = inputFactory.createXMLStreamReader(is);
			List<Equipment> eqList = process(reader);

			for (Equipment eq : eqList) {
				System.out.println(eq);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static List<Equipment> process(XMLStreamReader reader) throws XMLStreamException {
		List<Equipment> list = new ArrayList<Equipment>();
		Equipment equipment = null;
		EquipmentTagName etn = null;
		while (reader.hasNext()) {
			int type = reader.next();
			switch (type) {
			case XMLStreamConstants.START_ELEMENT:
				etn = EquipmentTagName.getEquipmentTagName(reader.getLocalName());
				switch (etn) {
				case EQUIPMENT:
					equipment = new Equipment();
					break;
				}
				break;
			case XMLStreamConstants.CHARACTERS:
				String text = reader.getText().trim();
				if (text.isEmpty())
					break;
				switch (etn){
				case ID:
					equipment.setId(Integer.parseInt(text));
					break;
				case NAME:
					equipment.setName(text);
					break;
				case COST:
					equipment.setCost(Double.parseDouble(text));
					break;
				case PRICE:
					equipment.setPrice(Double.parseDouble(text));
					break;
				}
				break;
			case XMLStreamConstants.END_ELEMENT:
				etn = EquipmentTagName.getEquipmentTagName(reader.getLocalName());
				switch(etn){
				case EQUIPMENT:
					list.add(equipment);
				}
			}
		}
		return list;
	}
}
