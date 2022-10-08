public class Employee extends  Person{


    private String type;
    public Employee(String fname, String lname,String type) {
        super(fname, lname);
        this.type =type;
    }

    public void representEmployee(){
        System.out.println("Hello my name is "+this.firstname+" "+ this.lastname);
    }

}
