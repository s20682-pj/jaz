package pl.pjatk.zuzcib;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class ConfigurationTwo {
    @Bean
    @ConditionalOnProperty(name = "homework", havingValue = "true")
    public Homework homeworkString(){
        return new Homework("Homework");
    }

    @Bean
    public NewClass newClass(){
        return new NewClass("New class here, zjazd2");
    }

    @Bean
    public List<String> defaultData(){
        return List.of("aaa","bbb","ccc","ddd","eee");
    }

    @Bean
    public List<String> reverseData(){
        return List.of("eee","ddd","ccc","bbb","aaa");
    }

    @Bean
    public List<NewClass> newClassList(NewClass newClass){
        return List.of(newClass);
    }


}
