package polymorphism;

public class Main {
    public static void main(String[] args){
        Polymorphism_student my_student = new Polymorphism_student("Ering");
        Polymorphism_Cath my_Cath = new Polymorphism_Cath ("Gwapa kaayo");
        Polymorphism_jc my_jc = new Polymorphism_jc ("wowex");
        
        my_student.kaon();
        my_Cath.tulog();
        my_jc.kapoy();
        
        System.out.println("---------------------------------------");
        
        my_student.hatdog();
        my_Cath.gwapakaayo();
        my_jc.cutekaayo();
    }
}
