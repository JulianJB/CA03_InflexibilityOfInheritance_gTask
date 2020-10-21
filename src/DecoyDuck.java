// Add a constructor to set up the
// DecoyDuck's flyBehaviour and quackBehaviour
// in an appropriate way 
class DecoyDuck extends Duck {
	
	DecoyDuck() {
		//quackBehavior = new QuackDisabled();
		//flyBehavior = new FlyDisabled();
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	void display() {
		System.out.println("DecoyDuck.display()");
	}
}