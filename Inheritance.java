
import java.util.*;

class Carrer{

    String name;
    void carrer(){
        name = "Coder";
        System.out.println(name);
    }
}

class ChildCarrer extends Carrer{

    @Override
    void carrer(){
        name =  "Doctor";
        System.out.println(name);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        ChildCarrer ch =  new ChildCarrer();

        ch.carrer();
    }
}
