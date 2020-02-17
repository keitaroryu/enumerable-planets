package org.launchcode.enumerableplanets.data;

public enum Planets {

    MERCURY("Mercury", 88),
    VENUS("Venus", 225),
    EARTH("Earth", 365),
    MARS("Mars", 687),
    JUPITER("Jupiter", 4333),
    SATURN("Saturn", 10759),
    URANUS("Uranus", 30687),
    NEPTUNE("Neptune", 60200);

    private final String planetName;
    private final int yearLength;

    Planets(String planetName, int yearLength) {
        this.planetName = planetName;
        this.yearLength = yearLength;
    }

    public String getPlanetName() {
        return planetName;
    }

    public int getYearLength() {
        return yearLength;
    }
}
