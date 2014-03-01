

import java.util.Date;


public class ReportData {
  private Date dob;
  private String fName;
  private String lName;
  private int Age;
  private String Gender;
  private String Address;
  private Date patient_Created;
 
  public Date getDob() {
    return dob;
   
  }

  public void setDob(Date dob) {
    this.dob = dob;
  }

  public String getfName() {
	  
    return fName;
  }

  public void setfName(String fName) {
    this.fName =fName;
  }

  public String getlName() {
    return lName;
  }

  public void setlName(String lName) {
    this.lName = lName;
  }

  public int getAge() {
    return Age;
  }

  public void setAge(int Age) {
    this.Age = Age;
  }

  public String getGender() {
    return Gender;
  }

  public void setGender(String Gender) {
    this.Gender =Gender;
  }

  public String getAddress() {
    return Address;
  }

  public void setAddress(String Address) {
    this.Address = Address;
  }
  public void setpatient_Created(Date patient_Created)
  {
	  this.patient_Created=patient_Created;
  }
  public Date getpatient_Created()
  {
	 return patient_Created;
  }

} 