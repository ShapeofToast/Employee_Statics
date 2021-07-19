public class Employee {
    private String idNum;
    private String name;
    private String section;
    private float salary;

    public Employee(String idNum,String name,String section,float salary) {
        this.idNum = idNum;
        this.name = name;
        this.section = section;
        this.salary = salary;
    }

    public void setidNum(String idNum) {
        this.idNum = idNum;
    }
    public String getidNum(){
        return this.idNum;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public void setSection(String section) {
        this.section = section;
    }
    public String getSection(){
        return this.section;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
    public float getSalary(){
        return this.salary;
    }

    public boolean equals(Employee other) {
        if(this.idNum.equals(other.getidNum()))
            return true;
        else
            return false;
    }

    public String toString(){
        return this.idNum+"\t"+this.name+"\t"+this.salary+"\t"+this.section+"\n";
    }
}
