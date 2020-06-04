
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BirdDatabase birdList = new BirdDatabase();
        System.out.println("Type 'add' for adding a bird to the database \nType 'observation' for adding an observation " +
                "\nType 'show' for showing the bird and the amount of observations" +
                "\nType 'statistics' for all the birds and the observation count in the database");


        while (true) {
            String command = scanner.nextLine().toLowerCase(); // PUT THIS IN THE WHILE LOOP
            //OR ELSE WHEN YOU TYPE SOMETHING ELSE THAN THE COMMANDS THE PROGRAM DOESNT RESPOND.
                 //creates a new bird object and adds the bird to the bird database
                if (command.equals("add")) {
                    System.out.print("Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Latin name: ");
                    String latinName = scanner.nextLine();
                    birdList.addBird(new Bird(name, latinName));
                }
                //counts the observations of the bird that was inputted by the user and saves it in the database
                if (command.equals("observation")) {
                    System.out.print("What was observed? ");
                    String name = scanner.nextLine();
                    birdList.addObservation(name);
                }
                //shows the user the name of the bird and the amount observations
                if (command.equals("show")) {
                    System.out.print("What? ");
                    String name = scanner.nextLine();
                    System.out.println(birdList.showBird(name));
                }
                //shows the statistics
                if (command.equals("statistics")) {
                    birdList.printStatistics();
                }
                if(command.equals("quit")){
                    break;
                }
        }

    }
}
