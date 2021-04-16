package pl.pjatk.zuzcib;

import org.springframework.stereotype.Component;

@Component
public class SecondComponent {
    public SecondComponent() {
        System.out.println("Second");
    }

    public void helloFromSecond() {
        System.out.println("Second - method");
    }
}
