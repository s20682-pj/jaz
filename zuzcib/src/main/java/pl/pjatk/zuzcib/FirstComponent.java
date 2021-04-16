package pl.pjatk.zuzcib;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FirstComponent {
/*

    public FirstComponent(
            SecondComponent secondComponent,
            NewClass newClass,
            List<String> defaultData,
            List<String> reverseData,
            List<NewClass> newClassList)
    {
        System.out.println("First");
        secondComponent.helloFromSecond();
        newClass.printMe();
        System.out.println(defaultData);
        System.out.println(reverseData);
        System.out.println(newClassList);
    }

    public void helloFromFirst() {
        System.out.println("First - method");
    }*/

    public FirstComponent(@Value("${my.custom.property}")String valueFromProperties,
                          @Value("${my.custom.random:default}")String randomValue) {
        System.out.println(valueFromProperties);
        System.out.println(randomValue);
    }
}
