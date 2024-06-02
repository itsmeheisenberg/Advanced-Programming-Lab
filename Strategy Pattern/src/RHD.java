class RHD extends Duck {
    RHD() {
        flyable = new HF();
        quackable = new LQ();
    }

    public void display() {
        System.out.println("Red Head Duck");
    }
}