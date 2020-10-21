class RedHeadDuck extends Duck {
 
	RedHeadDuck() {
		quackBehavior = new Quack();			// quackBehavior attribute is inherited
		flyBehavior = new FlyWithWings();			// flyBehavior attribute is inherited
	}

	@Override
	void display() {
		System.out.println("RedHeadDuck shows its feathers");
	}
}