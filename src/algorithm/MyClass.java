package algorithm;

public class MyClass {
    static void myStaticMethod(){
        System.out.println("a static method");
    }



    public void myStat2(){
        System.out.println("metoda publica");
    }




    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would compile an error

        MyClass obj=new MyClass();
        obj.myStat2();
    }
}
