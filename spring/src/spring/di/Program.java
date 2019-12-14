package spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;

public class Program {

	public static void main(String[] args) {
		
		/* 스프링에게 지시하는 방법으로 코드를 변경
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExampleConsole();
		console.setExam(exam);
		*/
		
		
		/*
		 ApplicationContext 종류
		 ClassPathXmlApplicationContext => class에서 지정
		 FileSystemXmlApplicationContext => C드리아브나 D 드라이브 파일시스템
		 XmlWebApplicationContext => Web에서 지정 
		 AnnotationConfigApplicationContext => Annotation 사용해서 지정한다
		 */
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/di/setting.xml");
		//ExamConsole console = (ExamConsole)context.getBean("console");
		ExamConsole console= context.getBean(ExamConsole.class);
		console.print();
		
	}

}
