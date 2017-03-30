package by.epam.tr.lesson20;

public enum EquipmentTagName {
	ASSORTMENT, EQUIPMENT, ID, NAME, COST, PRICE;
	
	public static EquipmentTagName getEquipmentTagName(String eq){
		switch (eq){
		case "assortment":
			return ASSORTMENT;
		case "equipment":
			return EQUIPMENT;
		case "id":
			return ID;
		case "name":
			return NAME;
		case "cost":
			return COST;
		case "price":
			return PRICE;
		default:
			throw new EnumConstantNotPresentException(EquipmentTagName.class, eq);	
		}
	}
}
