package th.co.cdgs;

public class Grade {

	public String grade(int score) {
		String grade = "";
		if(score <= 49) {
			grade =  "F";
		}else if(score >= 50 && score <= 59) {
			grade =  "D";
		}else if(score >= 60 && score <= 69) {
			grade =  "C";
		}else if(score >= 70 && score <= 79) {
			grade =  "B";
		}else if(score >= 80 && score <= 100) {
			grade =  "A";
		}
		return grade;
		
	}

}
