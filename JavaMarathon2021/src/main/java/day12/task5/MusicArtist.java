package day12.task5;

import day12.task3.MusicBand;

import java.util.ArrayList;
import java.util.List;

public class MusicArtist extends MusicBand {
    private String name;

    private int age;



    public MusicArtist(String name, int age){
        this.name=name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MusicArtist{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
