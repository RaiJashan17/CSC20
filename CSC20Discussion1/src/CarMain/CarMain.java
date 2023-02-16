package CarMain;
public class CarMain {
    public static void main(String[] args) {
        //Creates car 1 and 2 by calling custom constructor found in file Car.java
    	Car car1 = new Car("Honda","Black",2020);

        System.out.println(car1.toString() +"\n"+car1.ageOfCar()+"\n");

        // TODO (Optional)
        // Create another Car object named car2 and input your own values :)
        // And then output its values like I did in line 5
        // This is completely optional
        Car car2= new Car ("Toyota", "Red", 1997);
        System.out.println(car2.toString() +"\n"+car2.ageOfCar()+"\n");
    }
}
