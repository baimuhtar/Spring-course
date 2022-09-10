package spring_introduction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

// @Component("personBean")
public class Person {
    //    @Autowired
//    @Qualifier("catBean")
    private Pet pet;
    // @Value("Baitanatov")
      @Value("${person.surname}")
    private String surname;
    //    @Value("25")
      @Value("${person.age}")
    private int age;

    // @Autowired можно использовать на конструкторе, сеттере или поле. Можно выбрать любой вариант. Функция будет одинакова.
    // Процесс вндрения зависимостекй при использования @Autowired
    // 1. Сканирование пакета, поиск классов с аннотацией @Component
    // 2. При наличии аннотации @Autowired начинается поиск подходящего по типу бина

//    @Autowired
//    public Person(@Qualifier("catBean") Pet pet) { // Для конструтора нужно ставить перед параметрами
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }

    public Person(Pet pet) { // Для конструтора нужно ставить перед параметрами
        System.out.println("Person bean is created");
        this.pet = pet;
    }

//    public Person() {
//        System.out.println("Person bean is created");
//    }


    // Pet -> setPet
//       @Autowired
//       @Qualifier("dog")
    public void setPet(Pet pet) { // название метода может быть любым, не обязательно сеттер
        System.out.println("Class Person: set Pet!");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public void callYourPet() {
        System.out.println("Hello my lovely Pet!");
        pet.say();
    }


}
