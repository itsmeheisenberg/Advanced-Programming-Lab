class RD extends Duck {
    RD() {
        flyable = new NF();
        quackable = new Squeak();
    }

    public void display() {
        System.out.println("Rubber Duck");
    }
}