package pageObjects;

public class PersonalDetails {
    private String Name;
    private String Salary;
    private String Hours;
    private String Days;
    private String address;
    private String city;
    private String state;
    private String postcode;
    private String phoneNumber;
    private String aliasName;

    public PersonalDetails(String name, String salary, String hours, String days, String address, String city, String state, String postcode, String phoneNumber, String aliasName) {
        this.Name = name;
        this.Salary = salary;
        this.Hours = hours;
        this.Days = days;
        this.address = address;
        this.city = city;
        this.state = state;
        this.postcode = postcode;
        this.phoneNumber = phoneNumber;
        this.aliasName = aliasName;
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

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getPostcode() {
        return postcode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAliasName() {
        return aliasName;
    }


}