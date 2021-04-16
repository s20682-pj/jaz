package pl.pjatk.zuzcib;

public class NewClass {
    private final String name;

    public NewClass(String name){
        this.name=name;
        System.out.println("zjazd2");
    }

    public String getName() {
        return name;
    }
    public void printMe(){
        System.out.println("Value from new class");
    }


}
