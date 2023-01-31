package tugas11;
public class PersonHanif {
    protected String name,address,phoneNumber,email;
    
    public PersonHanif(String name,String address,String phoneNumber,String email){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    
    @Override
    public String toString(){
        return"PersonHanif{"+"name="+name+",address="+address+",phoneNumber="+phoneNumber+",email="+email+'}';
    }
}

class Students extends PersonHanif{
    private final String status;
    
    public Students(String status,String name,String address,String phoneNumber, String email){
        super(name,address,phoneNumber,email);
        this.status = status;
    }
    @Override
    public String toString(){
        return"\nStudents{"+"name="+name+",address="+address+",phoneNumber="+phoneNumber+",email="+email+",status="+status+'}';
    }
}

class Employee extends PersonHanif{
    protected String office,salary,dateHired;
    
    public Employee(String office,String salary,String dateHired,String name,String address,String phoneNumber,String email){
        super(name,address,phoneNumber,email);
        this.office=office;
        this.salary=salary;
        this.dateHired=dateHired;
    }
    @Override
    public String toString(){
        return"\nEmployee{"+"name="+name+",address="+address+",phoneNumber="+phoneNumber+",email="+email+",office="+office+",salary="+salary+",dateHired="+dateHired+'}';
    }
}

class Faculty extends Employee{
    private String officeHours, rank;
    public Faculty(String officeHours,String rank,String office,String salary,String dateHired,String name,String address,String phoneNumber,String email){
        super(office,salary,dateHired,name,address,phoneNumber,email);
        this.officeHours=officeHours;
        this.rank=rank;
    }
    @Override
    public String toString(){
        return"\nFaculty{"+"name="+name+",address="+address+",phoneNumber="+phoneNumber+",email="+email+",office="+office+",salary="+salary+",dateHired="+dateHired+",officeHours="+officeHours+",rank="+rank+'}';
    }
}

class Staff extends Employee{
    private String title;
    public Staff(String title,String office,String salary,String dateHired,String name,String address,String phoneNumber,String email){
        super(office,salary,dateHired,name,address,phoneNumber,email);
        this.title=title;
    }
    @Override
    public String toString(){
        return"\nStaff{"+"name="+name+",address="+address+",phoneNumber="+phoneNumber+",email="+email+",office="+office+",salary="+salary+",dateHired="+dateHired+",title="+title+'}';
    }
}