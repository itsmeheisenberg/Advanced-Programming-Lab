public class BillGenerate {
    public static void main(String[] args) {
        Offering offering = new Coffee();
        offering = new Rum(offering);
        System.out.println(offering.getName());
        System.out.println("Rs. "+offering.getPrice());

        Offering offering2 = new IceCream();
        offering2 = new Gin(offering2);
        offering2 = new Soda(offering2);
        System.out.println(offering2.getName());
        System.out.println("Rs. "+offering2.getPrice());

    }
}
