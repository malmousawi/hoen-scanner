package com.skyscanner;

import com.fasterxml.jackson.annotation.JsonProperty;

public class SearchResult {
    @JsonProperty
    private String city;

    @JsonProperty
    private String title;

    @JsonProperty
    private String kind;

    // Default constructor for Jackson
    public SearchResult() { }

    // Constructor to initialize city, title, and kind
    public SearchResult(String city, String title, String kind) {
        this.city = city;
        this.title = title;
        this.kind = kind;
    }

    // Getter for city
    public String getCity() {
        return city;
    }

    // Getter for title
    public String getTitle() {
        return title;
    }

    // Getter for kind
    public String getKind() {
        return kind;
    }
}
