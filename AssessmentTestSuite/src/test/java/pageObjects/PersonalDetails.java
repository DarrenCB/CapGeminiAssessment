package pageObjects;

public class PersonalDetails {
    private String Name;
    private String Salary;
    private String Hours;
    private String Days;

    public PersonalDetails(String name, String salary, String hours, String days) {
        this.Name = name;
        this.Salary = salary;
        this.Hours = hours;
        this.Days = days;
    }


    public String getName() {
        return Name;
    }

    public String getSalary() {
        return Salary;
    }

    public String getHours() {
        return Hours;
    }

    public String getDays() {
        return Days;
    }



}