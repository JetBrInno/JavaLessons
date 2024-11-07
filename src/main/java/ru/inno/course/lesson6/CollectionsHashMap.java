package ru.inno.course.lesson6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import ru.inno.course.lesson5.justclasses.Human;

public class CollectionsHashMap {

    public static void main(String[] args) {

        Map<String, String> world = new HashMap<>();
        world.put("Россия","98797897987");
        world.put("США","9789789789797");
        world.put("Великобритания", "97897897897897");
        System.out.println(world);
        System.out.println(world.get("Россия"));

//        List<String> worldList = new ArrayList<>();
//        worldList.add("89987978978");
//        worldList.add("789789789");
//        worldList.add("97897897");
//        System.out.println(worldList);
//        System.out.println(worldList.get(0));

        Map<String, Human> humans = new HashMap<>();
        humans.put("Джон", new Human("Джон", 30));
        humans.put("Алекс", new Human("Алекс", 22));
        System.out.println(humans);


    }

}
