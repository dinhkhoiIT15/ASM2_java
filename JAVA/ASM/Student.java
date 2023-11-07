package ASM;

public class Student {
    public String stuName;
    public String stuClass;
    public int mark;

    public Student(String stuName, String stuClass, int mark){
        this.stuName = stuName;
        this.stuClass = stuClass;
        this.mark = mark;
    }

    public void setStuName(String stuName){
        this.stuName = stuName;
    }
    public String getStuName(){
        return stuName;
    }

    public void setStuClass(String stuClass){
        this.stuClass = stuClass;
    }
    public String getStuClass(){
        return stuClass;
    }

    public void setMark(int mark){
        this.mark = mark;
    }
    public double getMark(){
        return mark;
    }

    @Override
    public String toString() {
        return "Student name: " + stuName + ", Student class: " + stuClass + ", Mark: " + mark;
    }
}
