package com.careerdevs.moviefactory;

public class Movie {
    // Fields: title (String), director (String), runtimeInMin (float), hasBeenReleased (boolean)
    public String title;
    public String director;
    public float runTimeInMin;
    public boolean hasBeenReleased;

    public Movie (String title, String director, float runTimeInMin, boolean hasBeenReleased) {
        this.title = title;
        this.director = director;
        this.runTimeInMin = runTimeInMin;
        this.hasBeenReleased = hasBeenReleased;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title: '" + title + '\'' +
                ", director: '" + director + '\'' +
                ", runTimeInMin: " + runTimeInMin +
                ", hasBeenReleased: " + hasBeenReleased +
                '}';
    }
}
