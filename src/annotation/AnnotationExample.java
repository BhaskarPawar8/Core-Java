package annotation;

import java.lang.reflect.Method;

public class AnnotationExample {

    public static void main(String[] args) throws NoSuchMethodException {

        Class<MyClass> clazz = MyClass.class;

        Method method = clazz.getMethod("anotherMethod");

        MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);

        if(myAnnotation != null){
            String value = myAnnotation.value();
            System.out.println("Value: "+ value);
        }

    }

}
