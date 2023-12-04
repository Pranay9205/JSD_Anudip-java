//Multiple Inheritanve example by assuming real world entity.
//first parent
interface Animal {
    void eat();
}

// second parent with different characteristics
interface dog {
    // access navigation
    void bark();
}

// third parent with diff charachteristics
interface labrodor extends dog {
    // access navigation
    void black();
}
// child class, mixup with inherit both properties-

class Animals implements dog, labrodor {
    void makeCall() {
        System.out.println("Making a phone call");
    }

    // simple function
    public void takePhoto() {
        System.out.println("Taking a photo with the smartphone camera");
    }

    // simple function
    public void navigate() {
        System.out.println("Navigating with the smartphone GPS");
    }
}