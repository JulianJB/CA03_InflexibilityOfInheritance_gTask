class Quack implements QuackBehavior {
	
	Quack() {
			System.out.println("\t with a "+this.getClass().getName());
	}

	@Override
	public void quack() {
		System.out.println("<<Quack.quack(): quack>>");
	}
}