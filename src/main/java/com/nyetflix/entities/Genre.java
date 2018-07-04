package com.nyetflix.entities;

import org.springframework.data.annotation.Id;

/**
 * Created by Steven on 4/07/2018.
 */
public class Genre {



    @Id
    public String genreId;

    public String genreName;

    public Genre() {}

    public String getGenreId() {
        return genreId;
    }

    public void setGenreId(String genreId) {
        this.genreId = genreId;
    }

    public String getGenreName() {
        return genreName;
    }

    public void setGenreName(String genreName) {
        this.genreName = genreName;
    }

}
