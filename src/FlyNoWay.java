class FlyNoWay implements FlyBehavior {

    FlyNoWay() {
        System.out.println("\t with a " + this.getClass().getName());
    }

    @Override
    public void fly() {
        System.out.println("<<FlyNoWay.fly(): can't fly>>");
    }
}