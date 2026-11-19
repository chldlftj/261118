public class Main {
    public static void main() {
        Barista barista = new Barista(3000, 1);
        //Barista barista = new Barista(2000, 100);

        Customer customer1 = new Customer("일서",10000, false);
        customer1.order(barista, "아메리카노");

        System.out.println("---");

        customer1.order(barista, "아메리카노");

    }
}