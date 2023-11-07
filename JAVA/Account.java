public class Account {
    private int id;
    private String stdName, phoneNumber, grade;
    private int age;

    public Account(int id, String stdName, int age, String phoneNumber, String grade){
        this.id = id;
        this.stdName = stdName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.grade = grade;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String stdName){
        this.stdName = stdName;
    }
    public String getName(){
        return stdName;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void setPhone(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhone(){
        return phoneNumber;
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return grade;
    }
}
