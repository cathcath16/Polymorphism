package polymorphism;

public class Polymorphism_Cath extends Polymorphism_student{ //child class
    Polymorphism_Cath(String name){
        super(name);
    }
    void tulog(){
        System.out.println(name + " Gikapoy nas iyang laypppp!");
    }
    public void gwapakaayo(){
        System.out.println("Sige rag pangapi si " + name);
    }
    
}
