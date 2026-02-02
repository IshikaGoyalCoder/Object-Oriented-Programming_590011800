// 10. WAP to print a value by using keywords super and this . 

class Parent {
    int a = 10;
}

class Child extends Parent {
    int a = 20;

    void show() {
        System.out.println("Value using this = " + this.a);
        System.out.println("Value using super = " + super.a);
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
    }
}
