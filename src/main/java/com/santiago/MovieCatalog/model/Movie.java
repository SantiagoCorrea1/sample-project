package com.santiago.MovieCatalog.model;

import jakarta.persistence.*;


@Entity
@Table(name = "tbl_movies")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column (name = "mov_name", nullable = false, length = 50)
    private String name;

    @Column (name = "mov_pg", nullable = false, length = 15)
    private String pg;

    @Column (name = "mov_genre", nullable = false, length = 150)
    private String genre;

    @Column (name = "mov_status", nullable = false, length = 20)
    private String status;

    public Movie (){

    }

    public Movie(long id, String name, String pg, String genre, String status) {
        this.id = id;
        this.name = name;
        this.pg = pg;
        this.genre = genre;
        this.status = status;
    }

    public Movie(String name, String pg, String genre, String status) {
        this.name = name;
        this.pg = pg;
        this.genre = genre;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPg() {
        return pg;
    }

    public void setPg(String pg) {
        this.pg = pg;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pg='" + pg + '\'' +
                ", genre='" + genre + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
