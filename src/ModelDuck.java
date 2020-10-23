class ModelDuck extends Duck {

    ModelDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyNoWay();
    }

    @Override
    void display() {
        System.out.println("ModelDuck.display()");
    }
}