package pl.pjatk.zuzcib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ComponentConfig {

    @Bean
    public SimpleClass simpleClass(){
        return new SimpleClass("from bean simpleclass");
    }

    @Bean
    public SimpleClass mySecondsimpleClass(){
        return new SimpleClass("from bean secondsimpleclass");
    }
}
