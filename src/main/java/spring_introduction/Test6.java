package spring_introduction;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test6 {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

//        Pet cat1 = context.getBean("catBean", Pet.class);
//        Pet cat2 = context.getBean("catBean", Pet.class);
//      cat.say();

        Person person1 = context.getBean("personBean", Person.class);
        System.out.println(person1.getSurname());
        System.out.println(person1.getAge());
//        Person person2 = context.getBean("personBean", Person.class);
//        System.out.println(person1 == person2);
//      person.callYourPet();

        context.close();
    }
}
