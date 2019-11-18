public class Classroom {

    public static void main(String[] args) {
        Wilder Person1 = new Wilder("Hans");
        Person1.setPresent (true);

        Wilder Person2 = new Wilder("Heinz");
        Person2.setPresent (false);

        Wilder Person3 = new Wilder("Horst");
        Person3.setPresent (true);

        Wilder Person4 = new Wilder("Hubert");
        Person4.setPresent (false);

        System.out.println(Person1.whoAmI());
        System.out.println(Person2.whoAmI());
        System.out.println(Person3.whoAmI());
        System.out.println(Person4.whoAmI());
    }

}