package ym;

public class ShowCurrentTime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long totalMilliseconds=System.currentTimeMillis();
		long totalSeconds=totalSeconds/1000;
		long currentSecond=totalSeconds % 60;
		long totalMilnutes =totalSeconds / 60;
		long currentMinute = totalMinutes % 60 ;
		long  totalHours = totalMinutes / 60;
		long currentHour = totalHours / 24;
		System.out.println("Current time is"+currentHour+":"+currentMinute+":"+currentSecond+"GMT");
	}

}
 