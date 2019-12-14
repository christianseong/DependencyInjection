package spring.di.ui;

import spring.di.entity.Exam;

public class GridExampleConsole implements ExamConsole {

	private Exam exam;
	
	public GridExampleConsole() {
		// TODO Auto-generated constructor stub
	}
	public GridExampleConsole(Exam exam) {
		this.exam = exam;
	}


	@Override
	public void print() {
		System.out.println("____________________");
		System.out.println("|  total  |   avg  |");
		System.out.println("|_________|________|");
		 System.out.printf("|  %3d    |  %3.3f |\n",exam.total(),exam.avg());
		System.out.println("|_________|________|");
		
	}


	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}

}
 