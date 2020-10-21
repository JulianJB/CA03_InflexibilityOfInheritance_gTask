class QuackDisabled implements QuackBehavior {

	QuackDisabled(){
		System.out.println("\t with a " + this.getClass().getName());
	}

	@Override
	public void quack() {
		System.out.println("<<QuackDisabled.quack(): Silence>>");
	}
}