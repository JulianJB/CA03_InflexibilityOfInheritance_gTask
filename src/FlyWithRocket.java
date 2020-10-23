class FlyWithRocket implements FlyBehavior {

    FlyWithRocket() {
        System.out.print(" with a " + this.getClass().getName() + ": ");
    }

    public void fly() {
        System.out.println("<<FlyWithRocket.fly(): flying>>");
    }
}