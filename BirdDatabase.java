import java.util.ArrayList;


public class BirdDatabase {
   private ArrayList<Bird> Database;

   public BirdDatabase(){
       this.Database = new ArrayList<Bird>();
   }

   public void addBird(Bird bird ){ //adds the object bird to the arraylist database
       Database.add(bird);
   }

   public void addObservation(String name) { //adds the observation.
       for (Bird bird : Database){ // for each bird, if the user types (String name) equals the bird's name. the observationcount increments by 1.
           if(bird.getName().equals(name)){
               bird.setObservationCount();
           }
       }
   }
   public String showBird(String name){
       for (Bird bird : Database){ //method goes through the database, if the String name equals the birds name, it returns the birds information
           if (bird.getName().equals(name)){
               return bird.toString();
           }
       }
       return "Is not a bird!";
   }

   public void printStatistics(){ //prints out all the birds
       for (Bird birds: Database){
           System.out.println(birds);
       }
   }



}
