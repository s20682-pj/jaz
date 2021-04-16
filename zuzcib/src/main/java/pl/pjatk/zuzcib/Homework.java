package pl.pjatk.zuzcib;

public class Homework {
    private String value;
    public Homework(String value) {
        this.value = value;
        printValue();
    }
    public String getValue() {
        return value;
    }

    void printValue(){
        System.out.println("This is " + value);
    }
}
