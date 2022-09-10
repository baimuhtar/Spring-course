package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


// @Component
@Scope("prototype")
public class Dog implements Pet {
    private String name;

    public Dog() {
        System.out.println("Dog bean is created");
    }

    @Override
    public void say() {
        System.out.println("Bow-Wow");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 1. У данных методов access modifier может быть любым
    // 2. У данных методов return type может быть любым. Но из-за того,
    //    что возвращаемое значение мы никак не можем использовать, чаще всего return type - это void
    // 3. Называться эти методы могут как угодно
    // 4. В данных методах не должно быть параметров

    @PostConstruct
    protected void init() {
        System.out.println("Class Dog: init method");
    }

   @PreDestroy
    private void destroy() {
        System.out.println("Class Dog: destroy method");
    }
}
