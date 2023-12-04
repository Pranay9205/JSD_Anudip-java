//parent class
class Human {
    //property of parent class
    String name;
    String surname;
    int age;
    double height;
    double weight;
    String addr;

}
//child one
class Student extends Human{
    //property of child
    String educ = "10th";
    String school = "XYZ School";
    int passoutYear = 2022;
    long phone = 987654321;

    //printing child proeprty
    void show(){
        System.out.println("-------------- Students ------------------- ");
        System.out.println(educ +" "+ school +" "+passoutYear +" "+phone);
        //printing parent property
        System.out.println(name +" "+ surname  +" "+ age  +" "+  height  +" "+  weight  +" "+
                addr);

        System.out.println("--------------------------------- ");
    }
}
// child  of parent student
class CollegeStudent extends Student{
    String dept = "Mech";
    String email = "zzz@gmail.com";
    String college = "aaaaaaa";

    void show(){
        System.out.println("--------------College Student ------------------- ");
        System.out.println(dept +" "+ email + " "+ college); //printing child proeprty
        System.out.println(educ +" "+passoutYear +" "+phone); //printing parent property
        System.out.println(name +" "+ surname  +" "+ age); //printing grand parent property


        System.out.println("--------------------------------- ");
    }
}
//child two
class Teacher extends Human{
    //property of child teacher
    String degree = "MCA";
    int noOfExp = 3;
    String compName = "Anudip";
    String profile = "IT Trainer";

    //printing child property
    void show(){
        System.out.println("--------------- Teacher ------------------ ");
        System.out.println(degree +" "+noOfExp +" "+ compName +" "+ profile);
        System.out.println(name +" "+ surname  +" "+ age  +" "+  height  +" "+  weight  +" "+
                addr);

        System.out.println("--------------------------------- ");
    }}
//main class
class inhertianceEg{

    public static void main(String args[]){
        Student s = new Student(); //child one object creation
        //assigning values to parent property with object s
        s.name = "ram";
        s.surname = "kumar";
        s.age = 20;
        s.height = 5.5;
        s.weight =  55.4;
        s.addr = "mumbai";

        s.show(); //invoke child one method with s

        CollegeStudent cs = new CollegeStudent(); //sub child object
        cs.educ = "symech";
        cs.passoutYear = 2024;
        cs.phone = 876543210;
        cs.name = "rahul";
        cs.surname = "kumaarr";
        cs.age = 23;

        cs.show();


        Teacher t = new Teacher(); //child two object creation

        //assigning values to parent property with object t
        t.name = "sam";
        t.surname = "david";
        t.age = 35;
        t.height = 5.9;
        t.weight =  59.4;
        t.addr = "mumbai";

        t.show(); //invoke child two method with t
    }
