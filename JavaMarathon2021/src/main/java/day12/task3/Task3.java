package day12.task3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("A", 1998);
        MusicBand musicBand2 = new MusicBand("B", 2001);
        MusicBand musicBand3 = new MusicBand("C", 2002);
        MusicBand musicBand4 = new MusicBand("D", 2003);
        MusicBand musicBand5 = new MusicBand("H", 2004);
        MusicBand musicBand6 = new MusicBand("U", 2005);
        MusicBand musicBand7 = new MusicBand("P", 2006);
        MusicBand musicBand8 = new MusicBand("W", 2007);
        MusicBand musicBand9 = new MusicBand("Q", 2008);
        MusicBand musicBand10 = new MusicBand("I", 2009);


        List<MusicBand> musicBandList = new ArrayList<>();

        musicBandList.add(musicBand1);
        musicBandList.add(musicBand2);
        musicBandList.add(musicBand3);
        musicBandList.add(musicBand4);
        musicBandList.add(musicBand5);
        musicBandList.add(musicBand6);
        musicBandList.add(musicBand7);
        musicBandList.add(musicBand8);
        musicBandList.add(musicBand9);
        musicBandList.add(musicBand10);

        Collections.shuffle(musicBandList);
        System.out.println(musicBandList.toString());
        System.out.println(groupsAfter2000(musicBandList).toString());

    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        List<MusicBand> nMB = new ArrayList<>();
        for (MusicBand b : bands) {
            if (b.getYearOfFoundation() > 2000) {
                nMB.add(b);
            }
        }
        return nMB;
    }
}

