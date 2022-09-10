package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("Мы берем книгу из UniLibrary: ");
    }

    String returnBook(){
        System.out.println("Мы возвращаем книгу в UniLibrary");
        return "ok";
    }
    public void getMagazine(){
        System.out.println("Мы берем журнал из UniLibrary");
    }
}
