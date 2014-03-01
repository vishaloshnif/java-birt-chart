
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Random;



public class MedicalDaoMock {
	
	private String fName[]={"John","Ramesh","Shashikant","Niket","Rohit","Neha"};
	private String lName[]={"Smith","Verma","Vaishnav","malviya","Jain","Sharma"}; 

  public List<ReportData> getReportValues(String date) {
    // Ignore the date and always return the data
    // A real implementation would of course use the date object
    List<ReportData> history = new ArrayList<ReportData>();
    // We fake the values, we will return fake value for 01.01.2009 -
    // 31.01.2009
  
    for (int i = 1; i <= 31; i++) {
      Calendar day = Calendar.getInstance();
      day.set(Calendar.HOUR, 0);
      day.set(Calendar.MINUTE, 0);
      day.set(Calendar.SECOND, 0);
      day.set(Calendar.MILLISECOND, 0);
      day.set(Calendar.YEAR, 2009);
      day.set(Calendar.MONTH, 0);
      day.set(Calendar.DAY_OF_MONTH, i);
      ReportData data = new ReportData();
      int j=(int)(Math.random()*6);
      data.setfName(fName[j]);
      data.setlName(lName[j]);
      
      data.setDob(day.getTime());
      data.setAge(Math.abs(new Random().nextInt()%70));
      data.setGender("Male");
      data.setAddress("E-57 Shiv Velly Bikaner-India");
      data.setpatient_Created(day.getTime());
      history.add(data);
    }
    return history;
  }
} 