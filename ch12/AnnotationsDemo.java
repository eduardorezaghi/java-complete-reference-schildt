package ch12;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface Animal {
    String name();
    int age();
}

class Dog {
    @Animal(name = "Fido", age = 5)
    public void metadata() {
        try {
            
            Dog dog = new Dog();
            Class<?> dogGeneric = dog.getClass();
            Method method = dogGeneric.getMethod("metadata");
            Annotation[] annotations = method.getAnnotations();

            for (Annotation annotation : annotations) {
                String ann = String.format("Annotation: %s", annotation);
                System.out.println(ann);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class AnnotationsDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.metadata();
    }
}
