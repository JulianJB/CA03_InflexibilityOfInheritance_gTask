class FlyDisabled implements FlyBehavior {
	
	FlyDisabled() {
		System.out.println("\t with a " + this.getClass().getName());
	}

	@Override
	public void fly() {
		System.out.println("<<FlyDisabled.fly(): no fly>>");
	}
}