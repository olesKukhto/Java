package com.company;

public enum Months {
    APRIL(Seasons.SPRING, 30), MARCH(Seasons.SPRING, 31), MAY(Seasons.SPRING, 31),
    JANUARY(Seasons.WINTER, 31), FEBRUARY(Seasons.WINTER, 29), DECEMBER(Seasons.WINTER, 31),
    JULY(Seasons.SUMMER, 30), JUNE(Seasons.SUMMER, 31), AUGUST(Seasons.SUMMER, 30),
    SEPTEMBER(Seasons.AUTUMN, 30), OCTOBER(Seasons.AUTUMN, 31), NOVEMBER(Seasons.AUTUMN, 30);
    int day;
    Seasons seasons;

    Months(Seasons seasons, int day) {
        this.seasons = seasons;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public Seasons getSeasons() {
        return seasons;
    }
}
