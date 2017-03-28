class BicycleDemo {
    public static void main(String[] args){

	Bicycle bike1 = new Bicycle();
	Bicycle bike2 = new Bicycle();


	// invoke methods on our bycicles

	bike1.changeCadence(5);
	bike1.speedUp(10);
	bike1.changeGear(2);
	bike1.printStates();


	bike2.changeCadence(10);
	bike2.speedUp(20);
	bike2.changeGear(2);
	bike2.printStates();
	
    }
}
