import java.util.Arrays;
import java.util.Scanner;

public class Driver {
	
	public static double getAverageRecordLength(Record[] records) {
		
		double sum = 0.0;
		
		for(Record i: records) {
				sum += i.getRecordLength();
			}
			
		return sum/(double)records.length;
				
		}
	
	public static double getAverageRecordRanking(Record[] records) {
		
		double sum = 0.0;
		
		for(Record i: records) {
				sum += i.getRecordRanking();
			}
			
		return sum/(double)records.length;
				
		}
	
	public static void printRecord(Record[] records, String recordTitle) {
		for(Record i: records) {
			if(i.getRecordTitle().equalsIgnoreCase(recordTitle)) {
			
				System.out.println("\nID: " + i.getID() + " " +
									"\nTitle: " + i.getRecordTitle() +
									"\nSinger: " + i.getSingerName() +
									"\nRecord Length: " + i.getRecordLength() +
									"\nRecord Ranking: " + i.getRecordRanking());
			}
		}
	 
	}

	public static int findRecord(Record[] records, String recordTitle) {
		
		int a = 0;
		
		for(Record i: records) {
			if(i.getRecordTitle().equalsIgnoreCase(recordTitle)) {
				return a;
			}
			
			a++;
		}
	 
		return -1;
	 
	}
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Record[] records = new Record[7];
		
		Record rec1 = new Record(Record.setID(), "First Song", "A Singer", 3.10, 1.0);
		Record rec2 = new Record(Record.setID(), "Second Song", "B Singer", 4.10, 2.0);
		Record rec3 = new Record(Record.setID(), "Third Song", "C Singer", 2.10, 3.0);
		Record rec4 = new Record(Record.setID(), "Fourth Song", "D Singer", 1.10, 4.0);
		Record rec5 = new Record(Record.setID(), "Fifth Song", "E Singer", 2.10, 5.0);
		Record rec6 = new Record(Record.setID(), "Sixth Song", "F Singer", 6.10, 6.0);
		Record rec7 = new Record(Record.setID(), "Seventh Song", "G Singer", 1.10, 7.0);
		
		records[0] = rec1;
		records[1] = rec2;
		records[2] = rec3;
		records[3] = rec4;
		records[4] = rec5;
		records[5] = rec6;
		records[6] = rec7;

		System.out.print("Enter the title of the song: ");
		String record = input.nextLine();
		System.out.println("Index: " + findRecord(records, record));
		
		printRecord(records, record);
		System.out.println("\nThe average record length is " + getAverageRecordLength(records));
		System.out.println("The average record ranking is " + getAverageRecordRanking(records));
		
	}

}
