package com.sanjula.oop.java.overnight_3;

import java.util.List;

public class DVD extends LibraryItem {

    private Producer producer;
    private List<Actor> actors;
    private List<Languages> languages;
    private List<Subtitles> subtitles;

    public DVD(String isbn, String title, String sector,
               String edition, String volume,
               DateTime publicationDate,
               DateTime dateBorrowed,
               Reader currentReader,
               Producer producer,
               List<Actor> actors,
               List<Languages> languages,
               List<Subtitles> subtitles) {
        super(isbn, title, sector, edition, volume,
                publicationDate, dateBorrowed, currentReader);
        this.producer = producer;
        this.actors = actors;
        this.languages = languages;
        this.subtitles = subtitles;
    }

    public Producer getProducer() {
        return producer;
    }

    public void setProducer(Producer producer) {
        this.producer = producer;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    public List<Languages> getLanguages() {
        return languages;
    }

    public void setLanguages(List<Languages> languages) {
        this.languages = languages;
    }

    public List<Subtitles> getSubtitles() {
        return subtitles;
    }

    public void setSubtitles(List<Subtitles> subtitles) {
        this.subtitles = subtitles;
    }
}
