package oop.md.demo;

public class Movies {
    private long id;
    private String genre;
    private String title;
    private int year;
    private String country;
    private String staringRole;


    public Movies(long id, String genre, String title, int year, String country, String staringRole) {
        this.id=id;
        this.genre=genre;
        this.title=title;
        this.year=year;
        this.country=country;
        this.staringRole=staringRole;

    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public int getYear() {
        return year;

    }
    public void setYear(int Year) {
        this.year= year;
    }
    public String getCountry() {
        return country;

    }
    public void setCountry(String country) {
        this.country = country;
    }

    public String getStaringRole() {
        return staringRole;
    }
    public void setStaringRole(String staringRole) {
        this.staringRole = staringRole;
    }
    @Override
    public String toString() {
        return "Movies{" +
                "id=" + id +
                ", genre='" + genre + '\'' +
                ", title='" + title + '\'' +
                ", year='" + year + '\'' +
                ", country='" + country + '\'' +
                ", staringRole='" + staringRole + '\'' +
                '}';
    }
}



