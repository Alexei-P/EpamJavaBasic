package by.epam.tr.lesson10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyXMLparser {
	private List<String> result = new ArrayList<String>();

	public static StringBuilder readFromFile(String fileDir) {
		Scanner sc = new Scanner(System.in);
		/*
		 * if (sc.hasNextLine()){ fileDir = sc.nextLine(); }
		 */

		File file = new File(fileDir);
		try {
			sc = new Scanner(file);
		} catch (FileNotFoundException e) {
			System.out.println("There is no such file");
			e.printStackTrace();
		}

		StringBuilder sb = new StringBuilder("");
		String temp;
		while (sc.hasNextLine()) {
			temp = sc.nextLine();
			sb.append(temp);
		}
		return sb;
	}

	public void xmlParser(StringBuilder sb) {
		Pattern p1 = Pattern.compile("(</?((?!/?).*?)>)|((.+?)(?=<|$))");
		Matcher m1 = p1.matcher(sb);
		String temp1;
		while (m1.find()) {
			temp1 = m1.group(2);
			if (temp1 != null) {
				temp1 = temp1.trim();
				if (!temp1.isEmpty()) {
					result.add(temp1);
				}
			}
			temp1 = m1.group(3);
			if (temp1 != null) {
				temp1 = temp1.trim();
				if (!temp1.isEmpty()) {
					result.add(temp1);
				}
			}
		}

	}

	public void showResult() {
		int i = 1;
		for (String str : result) {
			System.out.println(i + " " + str);
			i++;
		}
	}

}
