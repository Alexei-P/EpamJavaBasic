package by.epam.tr.lesson10;

public class TestClass {

	public static void main(String[] args) {
		//System.out.println(MyXMLparser.readFromFile("C:/Users/Alexei_Parkhomchyk/Desktop/EpamJavaBasic/toParse.txt"));
		StringBuilder sb = MyXMLparser.readFromFile("C:/Users/Alexei_Parkhomchyk/Desktop/EpamJavaBasic/toParse.xml");
		MyXMLparser parser = new MyXMLparser();
		parser.xmlParser(sb);
		System.out.println("________________________________________________");
		parser.showResult();
	}

}
