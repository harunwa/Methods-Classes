import java.awt.*;

public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    private static void shoppingTrolleyDemo() {
    }

    public static void rectangleDemo(){
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");

        // 1. Create a new rectangle object
        Rectangle rectangle = new Rectangle(5,10);

        // 2. Calculate the rectangle's area and store it in a variable
        int area = rectangle.getArea();
        System.out.println("The rectangle has an area of " + area);

        // 3. Check if your rectangle is actually a square
        boolean isRectangle = rectangle.isRectangle();
        System.out.println("Object is a square (true/false): " + isRectangle);
    }

    public static void computerDemo() {
        System.out.println("----------");
        System.out.println("Running computer tasks...");

        // 1. Create a new computer object
        Computer computer;
        computer = new Computer(1,"Toshiba");

        // 2. Use a getter to find out how much storage the computer has
        int currentStorage = computer.getCurrentStorage();
        System.out.println("Computer has " + currentStorage + "GB storage");

        // 3. Add more storage to the computer
        computer.updateStorage(50);
        int newStorage = computer.getCurrentStorage();
        System.out.println("Computer now has " + newStorage + "GB storage");

        // 4. Use a setter to update the computer's printer property
//        <CALL YOUR METHOD HERE>
        // Write a getter and use it below to check that the setter worked
        String currentPrinter = "HP";
        computer.setPrinter(currentPrinter);
        System.out.println("Computer currently has a " + computer.getPrinter() + " printer connected.");

        // 5. Write a method to print a message.
        System.out.println(computer.printMsg());

    }}
