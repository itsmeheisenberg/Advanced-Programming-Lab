class WD extends Duck {
    WD() {
        flyable = new NF();
        quackable = new MQ();
    }

    public void display() {
        System.out.println("Wooden Duck");
    }
}