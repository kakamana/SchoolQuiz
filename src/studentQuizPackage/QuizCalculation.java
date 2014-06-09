package studentQuizPackage;

public class QuizCalculation {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
			Quiz quizGrades = new Quiz(11);
		    
		    
		    try {
		    	
		    	quizGrades.put("Students", "Quiz1","Quiz2","Quiz3","Quiz4");
		    	quizGrades.put("Fatima", "10","9","3","7");
		    	quizGrades.put("Ahlam", "2","7","8","8");
		    	quizGrades.put("Eiman", "5","9","10","7");
		    	quizGrades.put("Suad", "7","8","4","10");
		    	quizGrades.put("Lamia", "8","9","8","9");
		    	quizGrades.put("Samera", "5","4","7","6");
		    	quizGrades.put("Alia", "3","5","7","7");
		    	quizGrades.put("Wedad", "9","4","8","5");
		    	quizGrades.put("Huwida", "6","8","5","4");
		    	quizGrades.put("Sanaa", "4","5","3","8");
		    	
		    } catch (ArrayIndexOutOfBoundsException e) {
		      System.out.println("Too many objects!");
		    }
		    
		    System.out.println("\t\t    CIT-225");
		    System.out.println("\t\t    Class List");
		    System.out.println("\t\t    Spring 2013");
		    
		    System.out.println(quizGrades);	
		    System.out.println();
		    System.out.println("\t\t    Summary Report");
		    System.out.println("\t\tQ1\t\tQ2\t\tQ3\t\tQ4");		    
		    System.out.println(quizGrades.CalculateMin());
		    System.out.println(quizGrades.CalculateMax());
		    System.out.println(quizGrades.CalculateAvg());
		    System.out.println(quizGrades.CalculateStanding());
	}
	
	
	
	
	
	
	
	

}
