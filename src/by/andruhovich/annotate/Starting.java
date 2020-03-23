package by.andruhovich.annotate;

/*
    Придумать и написать собственную аннотацию @Version, которая бует хранить информацию о версии класса сервиса (поле обязательное)
MyService и кодовое название версии (поле не обязательное) - (например номер версии = 7.1, а кодовое название версии = Nougat).
    Класс MyService должен иметь переменные c private модификаторами, конструктор по умолчанию, get и set методы, переопределенные
методы equals и hashcode, а так же private метод (private thisClassInfo), который будет просто печатать данные о самом классе
(данные любые на ваш выбор), в котором он определен.
    Написать программу, которая будет анализировать присутствие аннотации над классом MyService и если она присутствует - создавать
экземпляр этого класса, задавать значения его полям и вызывать метод thisClassInfo (использовать возможности пакета reflection).
 */

public class Starting {
    public static void main(String[] args) {
        Class clas = null;
        try {
            clas = Class.forName("by.andruhovich.annotate.Service");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if(!clas.isAnnotationPresent(Version.class)){
            System.err.println("no annotation");
        } else {
            System.out.println("class annotated, annotation info: " + clas.getAnnotation(Version.class));
            Service service = new Service();
            service.setAnyInt(7788);
            service.setAnyString("Call to us, an we will toss you)");
            System.out.println(service.toString());
        }
    }
}
