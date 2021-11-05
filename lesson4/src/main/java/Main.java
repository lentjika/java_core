public class Main {
    public static void main(String[] args) {
        ExecuteExtensions.ExecuteAndCatch(() -> {
            String[] array = {"a", "a", "b", "b", "b", "c", "c", "c", "c", "d", "a", "a", "b", "b", "b", "c", "c", "c", "c", "d"};
            var info = Duplicates.processDuplicates(array);
            info.forEach((s, integer) -> {
                System.out.println(String.format("Слово %s встречается %d раз", s, integer));
            });
        });

        ExecuteExtensions.ExecuteAndCatch(() -> {
            PhoneBook phoneBook = new PhoneBook();
            phoneBook.add("vasya", "322");
            phoneBook.add("vasya", "1337");
            phoneBook.add("vasya", "1337");
            phoneBook.add("petya", "12");
            phoneBook.add("petya", "47");
            var phones = phoneBook.get("vasya");
            phones.forEach(s -> {
                System.out.println(String.format("Для Васи есть телефон %s", s));
            });
        });
    }
}
