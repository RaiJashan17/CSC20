/** @author jraiAuthor: Professor Mukarram and Jashan Rai 
 * @version 1.0
 */

package CarMain; //Calls package where the program is located

import java.util.Calendar; // Imports calendar features used in the program
// Creates the class car that stoes color, model, and year
public class Car {
    private String color,model;
    private int year;
    public Car() {
        this.color = this.model = "";
        this.year = -1;
    }
/*@param Takes the model, color, and year for future reference.
 * // @throws exception if year is 0000
 */
    public Car(String model, String color, int year) {
        this.model=model;
        this.color=color;
        this.year=year;
    }
// @return color of the car
    public String getColor() { return this.color; }
// @return model of the car
    public String getModel() { return this.model; }
// @return year of the car
    public int getYear() { return this.year; }
// @param Takes the color of the car and changes it
    public void setColor(String color) { this.color=color; }
// @param Takes the model of the car and changes it
    public void setModel(String model) { this.model=model; }
// @param Takes the year of the car and changes it
    public void setYear(int year) { this.year=year; }
// No parameters, calculates age of car and prints it
    public String ageOfCar() {
        Calendar cal = Calendar.getInstance();
        int ageOfCar = cal.get(Calendar.YEAR) - this.year;
        return "This car is "+ageOfCar+" years old.";
    }
// No parameters, prints the model, year, and color of the car
    public String toString() {
        return "Model: "+this.model+" Color: "+this.color+" Year: "+this.year;
    }
}