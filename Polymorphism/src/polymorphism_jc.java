package polymorphism;

public class Polymorphism_jc extends Polymorphism_student{   //child class
    Polymorphism_jc (String name){
        super(name);
    }
    void kapoy(){
        System.out.println(name + " Gikapoy nas iyang laypppp!");
    }    
    public void cutekaayo(){
        System.out.println("Sige rag pangapi si  " + name);
    }
}
