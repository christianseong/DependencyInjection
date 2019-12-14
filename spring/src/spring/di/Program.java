package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExampleConsole();
		console.setExam(exam);
		*/
		
		
		/*
		 ApplicationContext ����
		 ClassPathXmlApplicationContext => class���� ����
		 FileSystemXmlApplicationContext => C�帮�ƺ곪 D ����̺� ���Ͻý���
		 XmlWebApplicationContext => Web���� ���� 
		 AnnotationConfigApplicationContext => Annotation ����ؼ� �����Ѵ�
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		//ExamConsole console = (ExamConsole)context.getBean("console");
		ExamConsole console= context.getBean(ExamConsole.class);
		console.print();
		
	}

}
