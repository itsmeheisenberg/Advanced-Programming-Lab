public class Main {
    public static void main(String[] args) {
        Duck duck = new GID();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println();

        duck = new WD();
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();
        System.out.println();

        Flyable flyable = new HF();
        duck.setFlyable(flyable);
        Quackable quackable = new LQ();
        duck.setQuackable(quackable);
        duck.display();
        duck.swim();
        duck.performFly();
        duck.performQuack();

    }
}