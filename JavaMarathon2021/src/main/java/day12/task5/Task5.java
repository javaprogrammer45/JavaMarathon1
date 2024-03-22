package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> fff= new ArrayList<>();
        fff.add(new MusicArtist("Sergey", 56));
        fff.add(new MusicArtist("Andrey", 56));
        fff.add(new MusicArtist("Bob", 56));
        fff.add(new MusicArtist("Nikolay", 56));
        fff.add(new MusicArtist("Alexey", 56));


MusicBand band1 = new MusicBand("Name1", fff, 2023);

        List<MusicArtist> ddd= new ArrayList<>();
        ddd.add(new MusicArtist("Sergey", 56));
        ddd.add(new MusicArtist("Andrey", 56));
        ddd.add(new MusicArtist("Bob", 56));
        ddd.add(new MusicArtist("Nikolay", 56));
        ddd.add(new MusicArtist("Alexey", 56));


        MusicBand band2 = new MusicBand("Name2", ddd, 2024);

        band1.printMembers();
        band2.printMembers();


        MusicBand.transferMembers(band1,band2);

        band1.printMembers();
        band2.printMembers();
    }
}
