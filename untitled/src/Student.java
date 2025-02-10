public class Student {
    private int id;
    private String name;
    private String surname;
    private double gpa;
    public Student(){

    }
    public Student(int id,String name,String surname,double gpa){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gpa = gpa;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setGpa(double gpa){
        this.gpa = gpa;
    }
    public int gerId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public double gpa(){
        return gpa;
    }
}
