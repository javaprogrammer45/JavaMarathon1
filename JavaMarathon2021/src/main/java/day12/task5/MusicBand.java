package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class MusicBand {
    private String name;
    private List<MusicArtist> nameMembers;
    private int yearOfFoundation;


    public MusicBand(String name, List<MusicArtist> nameMembers, int yearOfFoundation) {
        this.name = name;
        this.nameMembers = nameMembers;
        this.yearOfFoundation = yearOfFoundation;

    }

    public List<MusicArtist> getNameMembers() {
        return nameMembers;
    }

    public void setNameMembers(List<MusicArtist> nameMembers) {
        this.nameMembers = nameMembers;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public static void transferMembers(MusicBand v, MusicBand k) {
        for (MusicArtist nM : v.getNameMembers()) {
            k.getNameMembers().add(nM);
        }
        v.getNameMembers().clear();

    }

    public void printMembers() {
        System.out.println(getNameMembers());
    }


    @Override
    public String toString() {
        return "MusicBand{" +
                "name='" + name + '\'' +
                ", nameMembers=" + nameMembers +
                ", yearOfFoundation=" + yearOfFoundation +
                '}';
    }
}
