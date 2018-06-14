package Class1;

public class Personne {

    protected String firstName;
    protected String lastName;
    protected int age;
    protected String address;
    protected String gender;

    public Personne(String fName, String lName, int age, String mAddress, String sex) {
        setFirstName(fName);
        setLastName(lName);
        setBirth(age);
        setAdress(mAddress);
        setGender(sex);
    }

    public void setFirstName(String param) {
        firstName = param;
    }

    public void setLastName(String param) {
        lastName = param;
    }

    public void setBirth(int param) {
        age = param;
    }

    public void setAdress(String param) {
        address = param;
    }

    public void setGender(String param) {
        gender = param;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirth() {
        return age;
    }

    public String getAdress() {
        return address;
    }

    public String getGender() {
        return gender;
    }

    public boolean isStudent() {
        return false;
    }
}
