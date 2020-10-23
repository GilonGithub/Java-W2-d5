
public class Record {
	
	private int id;
	private String recordTitle;
	private String singerName;
	private double recordLength;
	private double recordRanking;

public Record(int id, String recordTitle, String singerName, double recordLength, double recordRanking) {
	
	this.id = id;
	this.recordTitle = recordTitle;
	this.singerName = singerName;
	this.recordLength = recordLength;
	this.recordRanking = recordRanking;
}

public static int setID() {
	return (int)(Math.random() * 9900) + 100;
}

public void setRecordTitle(String recordTitle) {
	this.recordTitle = recordTitle;
}

public void setSingerName(String singerName) {
	this.singerName = singerName;
}

public void setRecordLength(double recordLength) {
	this.recordLength = recordLength;
}

public void setRecordRanking(double recordRanking) {
	this.recordRanking = recordRanking;
}

public int getID() {
	return id;
}

public String getRecordTitle() {
	return recordTitle;
}

public String getSingerName() {
	return singerName;
}

public double getRecordLength() {
	return recordLength;
}

public double getRecordRanking() {
	return recordRanking;
}
}
