class MuteQuack implements QuackBehavior {

    MuteQuack() {
        System.out.println("\t with a " + this.getClass().getName());
    }

    @Override
    public void quack() {
        System.out.println("<<MuteQuack.quack(): can't quack>>");
    }
}