class FlyWithWings implements FlyBehavior {
	
	FlyWithWings() {
		System.out.println("\t with a " + this.getClass().getName());
	}

	@Override
	public void fly() {
		System.out.println("<<FlyWithWings.fly(): flying>>");
	}
}