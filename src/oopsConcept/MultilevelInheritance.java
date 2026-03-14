package oopsConcept;

//Multi Level inheritance : A sub class inherits properties and behaviors from another sub class which is also
//acts as a super class for other classes like forming a chain.

class Vehicle {
    Vehicle() {
        System.out.println("This is a Vehicle");
    }
}
class FourWheeler extends Vehicle {
    FourWheeler() {
        System.out.println("4 Wheeler Vehicles");
    }
}
class Car extends FourWheeler {
    Car() {
        System.out.println("This 4 Wheeler Vehicle is a Car");
    }
}

   

public class MultilevelInheritance {

	public static void main(String[] args) {
        Car obj = new Car(); // Triggers all constructors in order
    }
}
