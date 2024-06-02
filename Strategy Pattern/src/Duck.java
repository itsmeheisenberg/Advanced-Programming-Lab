public abstract class Duck {
    Flyable flyable;
    Quackable quackable;

    public void swim() {
        System.out.println("All ducks swim.");
    }

    abstract void display();

    void setFlyable(Flyable flyable) {
        this.flyable = flyable;
    }

    void setQuackable(Quackable quackable) {
        this.quackable = quackable;
    }

    public void performFly() {
        flyable.fly();
    }

    public void performQuack() {
        quackable.quack();
    }
}
