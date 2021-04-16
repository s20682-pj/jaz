package pl.pjatk.zuzcib;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class ThirdComponent {

/*    public ThirdComponent(ApplicationContext applicationContext) {
        FirstComponent firstComponent = applicationContext.getBean("firstComponent",FirstComponent.class);
        SecondComponent secondComponent = applicationContext.getBean("secondComponent",SecondComponent.class);
        secondComponent.helloFromSecond();
        System.out.println("Third");

        SimpleClass myFirstsimpleClass = applicationContext.getBean("simpleClass",SimpleClass.class);
        SimpleClass mySecondsimpleClass = applicationContext.getBean("mySecondsimpleClass",SimpleClass.class);

        System.out.println(myFirstsimpleClass.getName());
        System.out.println(mySecondsimpleClass.getName());
    }*/

    public ThirdComponent(
            FirstComponent firstComponent,
            SecondComponent secondComponent,
            SimpleClass simpleClass,
            SimpleClass mySecondsimpleClass)
    {
        secondComponent.helloFromSecond();
        System.out.println("Third");
        System.out.println(simpleClass.getName());
        System.out.println(mySecondsimpleClass.getName());
    }
}
