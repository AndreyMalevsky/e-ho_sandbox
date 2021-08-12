package spring.applicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        //компонент спринг контекст
        //обращается к application context и помещает туда бины
        //файл обязательно должен лежать в папке resources (classpath java)
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

/*
        Стоит отметить, что сейсчас этот пример кажется слишком сложным, вручную создать объект было бы намного проще.
        Но когда приложение разрастается - это становится удобно.
*/
    }
}
