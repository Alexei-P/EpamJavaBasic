package by.epam.tr.lesson12;

import by.epam.tr.lesson12.FinancialPosting.DC;
import by.epam.tr.lesson12.FinancialPosting.FinancialItem;

public class TestClass {

	public static void main(String[] args) {
		FinancialPosting fp = new FinancialPosting();
		FinancialPosting.FinancialItem item = new FinancialPosting().new FinancialItem(DC.DEBIT, 20, 100.00);
		FinancialPosting.FinancialItem item2 = new FinancialPosting().new FinancialItem(DC.CREDIT, 10, 100.00);
		fp.addFinancialItem(item);
		try {
			Thread.currentThread().sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		fp.addFinancialItem(item2);
		
		System.out.println(FinancialPosting.ChangeHistory.changeJournal);
	}

}
