package day12.task3;

public class MusicBand {
   private String name;
    private int yearOfFoundation;

    public MusicBand (String name, int yearOfFoundation) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    @Override
    public String toString() {
        return "MusicBand {" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                '}';
    }
}
