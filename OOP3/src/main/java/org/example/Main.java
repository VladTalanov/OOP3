package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Создаем и добавляем в сет элементы с одинаковыми компанентами
        Set<Component> result = new HashSet<>();
        result.add(new Component("Вода", "5", 15));
        result.add(new Component("Вода", "5", 15));
        result.add(new Component("Азитрон", "2", 6));
        System.out.println(result + "\n");

        // Создаем список компонентов
        List<Component> componentsDog1 = List.of(
                new Azitron("Азитрон", "4", 6),
                new Water("Вода", "20", 10));
        List<Component> componentsDog2 = List.of(
                new Azitron("Азитрон","4",6),
                new Penicillin("Пенициллин", "16", 6));
        List<Component> componentsDog3 = List.of(
                new Water("Вода", "20", 10),
                new Azitron("Азитрон", "10", 12));
        List<Component> componentsDog4 = List.of(
                new Water("Вода", "20", 1),
                new Penicillin("Пенициллин", "18", 12));
        List<Component> componentsDog5 = List.of(
                new Water("Вода", "10", 12),
                new Azitron("Азитрон", "8", 12));

        // Создаем лекарства для собак из разных компонентов
        DogPharmacy Pharmacy1 = new DogPharmacy(componentsDog1);
        DogPharmacy Pharmacy2 = new DogPharmacy(componentsDog2);
        DogPharmacy Pharmacy3 = new DogPharmacy(componentsDog3);
        DogPharmacy Pharmacy4 = new DogPharmacy(componentsDog4);
        DogPharmacy Pharmacy5 = new DogPharmacy(componentsDog5);

        // Создаем список лекарств
        List<DogPharmacy> Pharmacy = new ArrayList<>();
        Pharmacy.add(Pharmacy1);
        Pharmacy.add(Pharmacy2);
        Pharmacy.add(Pharmacy3);
        Pharmacy.add(Pharmacy4);
        Pharmacy.add(Pharmacy5);
        System.out.println(Pharmacy);

        // Сортируем список лекарств для кошек по возрастанию силы
        Collections.sort(Pharmacy);
        System.out.println(Pharmacy);
    }
}