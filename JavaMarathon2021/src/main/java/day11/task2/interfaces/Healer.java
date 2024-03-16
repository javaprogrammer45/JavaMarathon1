package day11.task2.interfaces;

import day11.task2.Hero;

public interface Healer {
    void healHimself();

    void healTeammate(Hero hero);
}
