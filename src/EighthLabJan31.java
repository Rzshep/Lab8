import java.util.Scanner;

public class EighthLabJan31 {

	public static void main(String[] args) {
		System.out.println("Welcome to the Batting Average Calculator!");
		
		
		Scanner scan = new Scanner(System.in);
		
		String choice = "y";
		
		float counter1 = 0;
		float counter2 = 0;
		float counter3 = 0;
		float counter4 = 0;
		
		while (choice.equalsIgnoreCase("y")) {
		
		System.out.println();
		
		
		int atBatInt = Validator.getInt(scan, "Enter number of times at-bat: ", 1, 1000); // calls Class Validator
		
		
		
		int[] atBatArray = new int[atBatInt];
		
		
		System.out.println();
		System.out.println("0=out, 1=single, 2=double, 3=triple, 4=home run");
		int sum = 0;
		
		for (int i=0; i < atBatArray.length; i++) 
		{ 
			
			atBatArray[i] = i;
			System.out.println("Result for at-bat " + i + ": ");
			int basesEarnedInt = Validator.getInt(scan, "Enter bases earned: ", 0, 4);
			int[] basesEarnedArray = new int[basesEarnedInt];
			sum = sum + basesEarnedInt;
			
			}  double slug = sum/atBatArray.length;
			System.out.println("Slugging percentage is: " + slug);
			System.out.println();
			
		for (int i=0; i < atBatArray.length; i++) {
			  switch(atBatArray[i]) {
		        case 1:
				counter1++;
		            break;
		        case 2:
		            counter2++;
		            break;
		        case 3:
		            counter3++;
		            break;
		        case 4:
		        		counter4++;
		        		break;
		            
		        default:
		            break;
		        } 
		} float battingAvg = (counter1 + counter2 + counter3 + counter4)/atBatArray.length;
			System.out.println("Batting average is: " + battingAvg);
			
			System.out.println("Another batter? (y/n): ");
			choice = scan.nextLine();
	} 
			System.out.println("Goodbye!");
}
	
}