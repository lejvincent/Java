package Class;

public class Personne {

    protected String name;
    protected String sex;
    protected int age;

    public void setName(String param) {
        name = param;
    }

    public void setSex(String param) {
        sex = param;
    }

    public void setAge(int param) {
        age = param;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

}
