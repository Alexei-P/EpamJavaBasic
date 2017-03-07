package by.epam.tr.lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

public class FinancialPosting {
	private ArrayList<FinancialItem> posting = new ArrayList<FinancialItem>();

	public void addFinancialItem(FinancialItem fi) {
		if (posting.size() <= FinancialItem.maxQ) {
			posting.add(fi);
			ChangeHistory.addToPostingJournal(new Date());
		}
	}

	public void deleteFinancialItem(FinancialItem fi) {
		posting.remove(fi);
	}

	class FinancialItem {
		DC dc;
		int account;
		double amount;
		private static final int maxQ = 100;

		FinancialItem(DC dc, int account, double amount) {
			this.dc = dc;
			this.account = account;
			this.amount = amount;
		}

		public DC getDc() {
			return dc;
		}

		public void setDc(DC dc) {
			this.dc = dc;
		}

		public int getAccount() {
			return account;
		}

		public void setAccount(int account) {
			this.account = account;
		}

		public double getAmount() {
			return amount;
		}

		public void setAmount(double amount) {
			this.amount = amount;
		}

	}

	static class ChangeHistory {
		static Date lastChange;
		static ArrayList<Date> changeJournal = new ArrayList<Date>();
		static void addToPostingJournal(Date postingDate){
			changeJournal.add(postingDate);
		}
	}

	enum DC {
		DEBIT, CREDIT;
	}
	
	public void sortByAmount(){
		Collections.sort(posting, new Comparator<FinancialItem>(){
			@Override
			public int compare(FinancialItem o1, FinancialItem o2) {
				// TODO Auto-generated method stub
				if (o1.getAmount()-o2.getAmount()<0) return -1;
				else if(o1.getAmount()-o2.getAmount()>0) return 1;
				else return 0;
			}
			
		});
	}
}
