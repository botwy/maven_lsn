import java.util.Arrays;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Arrays.asList("1","2","3")
                .stream()
                .forEach(System.out::println);

       /* Stream.of(1,2,3)
                .filter()
                .map()*/
//Последняя должна быть терминальная операция
        //Тагир Валеев
//характеристика suzzy size, некоторые убирают характ-ки стрима и замедляется
        //Java microbeach marker Шипинев
        //Странности стрим апи
        //Время так нельзя
        //Автобоксинг
        //Головач Стримы
        //Куксенко Стримы

    }
}
/*
@FunctionalInterface
public  interface MyMethod {

}
*/
