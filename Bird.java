public class Bird {
    private String name;
    private String latinName;
    private int observationCount;

    public Bird(String name, String latinName) {
        this.name = name;
        this.latinName = latinName;
    }

    public String getName(){
        return name;
    }

    public void setObservationCount(){
        this.observationCount++;
        }

    public String toString(){
        return name + "(" + latinName + "): " + this.observationCount + " observations";
    }
}
