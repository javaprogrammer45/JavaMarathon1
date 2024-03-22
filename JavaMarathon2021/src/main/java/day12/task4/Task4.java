package day12.task4;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void main(String[] args) {
        List<String> membersG1 = new ArrayList<>();
        membersG1.add("Sam Sam");
        membersG1.add("Sim Sim");
        membersG1.add("Som Som");
        membersG1.add("Sym Sym");

        MusicBand fff =new MusicBand(membersG1, 2019, "Spring");

        List<String> membersG2 = new ArrayList<>();
        membersG2.add("Sam Sam");
        membersG2.add("Sim Sim");
        membersG2.add("Som Som");
        membersG2.add("Sym Sym");

        MusicBand ggg =new MusicBand(membersG2, 2019, "Spring");

        fff.getMembers();
        ggg.getMembers();
        MusicBand.transferMembers(fff, ggg);
        fff.printMembers();
        ggg.printMembers();
    }
}
