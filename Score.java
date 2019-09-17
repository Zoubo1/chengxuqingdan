import java.util.Scanner;
public class Score {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner kb = new Scanner(System.in);
		 
		  //Declare variables
		  double score;String grade = " ";
		 score = kb.nextDouble();
		 while(score>100 || score<0) {
			 System.out.println("The scoer is invaild");
			 System.out.println("Enter the student's score: ");
			 score = kb.nextDouble();
		 }
		//get the grade for the given score
		if(score>=90){
		     grade="A";
		}
		else if (score>=80){
			   grade="B";
		}
		else if (score>=70){
			   grade="C";
		}
		else if (score>=60){
			   grade="D";
		}
		else{
			   grade="E";
		}
		System.out.println(grade);
	}

}
