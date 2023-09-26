## Урок 3. Некоторые стандартные интерфейсы Java и примеры их использования
# Создайте несколько экземпляров Pharmacy, причем, чтобы среди них было хотя бы два экземпляра с полностью идентичными значениями полей.

# Сделать так, чтобы после выполнения кода ниже, в сете result были только уникальные лекарства.
# Set<Pharmacy> result = new HashSet<>(множество из нескольких лекарств);
# System.out.println(result.size()); // тут вывод должен быть равен количеству УНИКАЛЬНЫХ экземпляров Pharmacy! (подсказка почитать про методы equals и hashCode)

# Переписать compareTo так, чтобы если power лекарств равны, сравнение шло еще и по названиям компонентов лекарства
