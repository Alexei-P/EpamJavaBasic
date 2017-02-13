package by.epam.tr.lesson4.task3;
import by.epam.tr.lesson4.task3.Student;

public class Group {
	Student[] studArr;
	
	public static void main(String[] args){
		Student[] studArr = new Student[5];
		Student st1 = new Student("Alexei", 9, 9, 10, 10);
		Student st2 = new Student("Andrei", 9, 2, 10, 10);
		Student st3 = new Student("Ivan", 9, 9, 10, 9);
		Student st4 = new Student("Petr", 9, 9, 2, 2);
		Student st5 = new Student("John", 6, 9, 10, 9);
		
		studArr[0] = st1;
		studArr[1] = st2;
		studArr[2] = st3;
		studArr[3] = st4;
		studArr[4] = st5;
		
		Group group = new Group(studArr);
		
		
		System.out.println(group.getExcellent());
		System.out.println(group.getGroupAverage());
		System.out.println(group.getStudHas2());
		
	}
	
	public Group(Student[] studArr){
		this.studArr = studArr;
	}
	
	public double getGroupAverage(){
		double temp=0;
		for (int i=0; i<studArr.length; i++){
			temp += studArr[i].getAvarageMark();
		}
		return temp/studArr.length;
	}
	
	public int getExcellent(){
		int countOfExc=0;
		for (int i=0; i<studArr.length; i++){
			if (studArr[i].getExam1Mark()>8 && studArr[i].getExam2Mark()>8 
					&& studArr[i].getExam3Mark()>8 && studArr[i].getExam4Mark()>8){
				countOfExc++;
			}
		}
		return countOfExc;
	}
	
	public int getStudHas2(){
		int countOf2=0;
		for (int i=0; i<studArr.length; i++){
			if (studArr[i].getExam1Mark()==2 || studArr[i].getExam2Mark()==2 
					|| studArr[i].getExam3Mark()==2 || studArr[i].getExam4Mark()==2){
				countOf2++;
			}
		}
		return countOf2;
	}
}
