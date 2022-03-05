
public class CD implements Packable{
    private String cdName;
    private String artist;
    private int year;
    private double weight = 0.1;
    
    public CD(String artist, String name, int year){
        this.artist = artist;
        this.cdName = name;
        this.year = year;
    }
    
    public CD(String artist, String name){
        this.artist = artist;
        this.cdName = name;
        this.year = 0;
    }
    
    @Override
    public double weight(){
        return this.weight;
    }
    
    @Override
    public String toString() {
        return this.artist + ": " + this.cdName + " (" + this.year + ")";
    }
}
