package day12.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MusicBand {
    private String name;
    private List<String> nameMembers;
    private int yearOfFoundation;

    public MusicBand() {
        this.nameMembers = new ArrayList<>();
    }


    public MusicBand(List<String> nameMembers, int yearOfFoundation, String name) {
        this.nameMembers = nameMembers;
        this.yearOfFoundation = yearOfFoundation;
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNameMembers() {
        return nameMembers;
    }

    public void setNameMembers(List<String> nameMembers) {
        this.nameMembers = nameMembers;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public static void transferMembers(MusicBand v, MusicBand k) {
        for (String nM : v.getNameMembers()) {
            k.getNameMembers().add(nM);
        }
        v.getNameMembers().clear();
    }


    public List<String> getMembers() {
        List<String> nM = this.nameMembers;
        return nM;
    }

    public void printMembers() {
        System.out.println(this.nameMembers);
    }

    @Override
    public String toString() {
        return "MusicBand {" +
                "name='" + name + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                '}';
    }
}
