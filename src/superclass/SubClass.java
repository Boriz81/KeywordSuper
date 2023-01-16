package superclass;

public class SubClass extends SuperClass {
    protected int field;
    public SubClass() {
        this.field = 30; // инициализирует поле field класса SubClass
        field = 30; // тоже
        super.field = 20; // инициализирует поле field класса SuperClass
    }

    public void printSubValue() {
        super.printBaseValue();
        System.out.println(field);
    }

}
