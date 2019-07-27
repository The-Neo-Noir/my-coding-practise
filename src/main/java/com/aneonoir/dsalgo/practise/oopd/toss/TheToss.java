package com.aneonoir.dsalgo.practise.oopd.toss;

import java.util.Random;

import static org.junit.Assert.assertEquals;

enum Weather {
    CLEAR, CLOUDY
}

enum DayOrNight {
    DAY, NIGHT
}

/**
 *
 */
public class TheToss {
    public static void main(String[] args) {

        Umpare u = new Umpare(args[0], args[1]);
        Team team = u.toss();
        System.out.println(team + " wins toss and " + team.decision());

        assertEquals(Weather.CLEAR, Weather.valueOf("CLEAR"));

    }

}

class Umpare {

    private final DayOrNight currentDay;
    private Weather currentWeather;

    public Umpare(String weather, String dayornight) {
        currentWeather = Weather.valueOf(weather.toUpperCase());
        currentDay = DayOrNight.valueOf(dayornight.toUpperCase());
    }

    Team toss() {
        Random r = new Random(1);
        int i = r.nextInt(1);
        if (i == 0) {
            return new Lengaburu(currentWeather, currentDay);
        } else {
            return new Enchai(currentWeather, currentDay);
        }
    }
}

abstract class Team {

    private final Weather weather;
    private final DayOrNight dayOrNight;

    Team(Weather weather, DayOrNight dayOrNight) {
        this.weather = weather;
        this.dayOrNight = dayOrNight;
    }

    public Weather getTodaysWeather() {
        return weather;
    }

    public DayOrNight getDayOrNight() {
        return dayOrNight;
    }

    abstract String decision();
}

class Lengaburu extends Team {

    Lengaburu(Weather weather, DayOrNight dayOrNight) {
        super(weather, dayOrNight);
    }

    String decision() {
        if (getTodaysWeather() == Weather.CLEAR && getDayOrNight() == DayOrNight.DAY) {
            return "bats";
        } else if (getTodaysWeather() == Weather.CLOUDY && getDayOrNight() == DayOrNight.NIGHT) {
            return "bowls";
        } else {
            return "bats";
        }

    }

    public String toString() {
        return "Lengaburu";
    }
}

class Enchai extends Team {
    Enchai(Weather weather, DayOrNight dayOrNight) {
        super(weather, dayOrNight);
    }

    String decision() {
        if (getTodaysWeather() == Weather.CLEAR && getDayOrNight() == DayOrNight.DAY) {
            return "bowls";
        } else if (getTodaysWeather() == Weather.CLOUDY && getDayOrNight() == DayOrNight.NIGHT) {
            return "bats";
        } else {
            return "bats";
        }
    }

    @Override
    public String toString() {
        return "Enchai";
    }
}