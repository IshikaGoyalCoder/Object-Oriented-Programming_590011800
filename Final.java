class A{
    static final int variable1 = 10;
}

class B{
    final int variable;
    B(){
        variable = 20;
    }
}
public class Final {
    public static void main (String[] args){
        A a= new A();
        B b = new B();

        // a.variable1 = 35;
        // b.variable=30;

        System.out.println(A.variable1);
        System.out.println(b.variable);
    }
}

