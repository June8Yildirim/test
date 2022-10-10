public class Test{
    public static void main(String[]args){
        System.out.println("Hello this is main project for enterance");
//        Student s1  = new Student("hasan","yildiz",12,"7a");
//        System.out.println( s1.getGrade());
        Person s2 = new Student("cuneyt","Yiliri",33,"12A");
//        Employee e1 = new Employee("ozgur","yasar",34,"full-time");
        Person e2 = new Employee("hasn","12",55,"part-type");

        System.out.println( e2.getFirstname());
        System.out.println(s2);
    }
}
