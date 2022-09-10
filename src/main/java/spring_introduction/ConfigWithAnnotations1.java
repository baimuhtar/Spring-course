package spring_introduction;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations1 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
// Если к аннтоации @Component не прописать bean id, то бину будет назначен дефолтный id,
// который получается из имени класса заменяя его первую заглавную букву на прописную.

//        Cat myCat = context.getBean("cat",Cat.class);
//        myCat.say();

        Person person = context.getBean("personBean", Person.class);

        person.callYourPet();

        System.out.println(person.getSurname());
        System.out.println(person.getAge());


        context.close();
    }
}
