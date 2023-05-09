import java.util.Arrays;

public class Farm {
    private String adres;
    private String ownerName;

    private Cow cowse[];
    private Sheep sheep[];
    private Horse horse[];


    public Farm() {
    }

    public Farm(String adres, String ownerName, Cow[] cowse, Sheep[] sheep, Horse[] horse) {
        this.adres = adres;

        this.ownerName = ownerName;
        this.cowse = cowse;
        this.sheep = sheep;
        this.horse = horse;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }


    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public Cow[] getCowse() {
        return cowse;
    }

    public void setCowse(Cow[] cowse) {
        this.cowse = cowse;
    }

    public Sheep[] getSheep() {
        return sheep;
    }

    public void setSheep(Sheep[] sheep) {
        this.sheep = sheep;
    }

    public Horse[] getHorse() {
        return horse;
    }

    public void setHorse(Horse[] horse) {
        this.horse = horse;
    }

    @Override
    public String toString() {
        return "Farm{" +
                "adres: " + adres + "\n" +
                "ownerName: " + ownerName + "\n" +
                "cowse: " + Arrays.toString(cowse) + "\n"+
                "sheep: " + Arrays.toString(sheep) +"\n"+
                "horse: " + Arrays.toString(horse) +"\n\n\n" ;
    }
}

