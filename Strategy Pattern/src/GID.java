class GID extends Duck {
    GID() {
        flyable = new HF();
        quackable = new LQ();
    }

    public void display() {
        System.out.println("Great Indian Duck");
    }
}