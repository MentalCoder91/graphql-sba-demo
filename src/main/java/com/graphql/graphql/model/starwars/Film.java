package com.graphql.graphql.model.starwars;

import com.fasterxml.jackson.annotation.JsonTypeInfo;

import java.util.List;

/**
 * A single film.
 */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NONE
)
public class Film implements Node {
  private FilmCharactersConnection characterConnection;

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  private String created;

  /**
   * The name of the director of this film.
   */
  private String director;

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  private String edited;

  /**
   * The episode number of this film.
   */
  private Integer episodeID;

  /**
   * The ID of an object
   */
  private String id;

  /**
   * The opening paragraphs at the beginning of this film.
   */
  private String openingCrawl;

  private FilmPlanetsConnection planetConnection;

  /**
   * The name(s) of the producer(s) of this film.
   */
  private List<String> producers;

  /**
   * The ISO 8601 date format of film release at original creator country.
   */
  private String releaseDate;

  private FilmSpeciesConnection speciesConnection;

  private FilmStarshipsConnection starshipConnection;

  /**
   * The title of this film.
   */
  private String title;

  private FilmVehiclesConnection vehicleConnection;

  public Film() {
  }

  public Film(FilmCharactersConnection characterConnection, String created, String director,
      String edited, Integer episodeID, String id, String openingCrawl,
      FilmPlanetsConnection planetConnection, List<String> producers, String releaseDate,
      FilmSpeciesConnection speciesConnection, FilmStarshipsConnection starshipConnection,
      String title, FilmVehiclesConnection vehicleConnection) {
    this.characterConnection = characterConnection;
    this.created = created;
    this.director = director;
    this.edited = edited;
    this.episodeID = episodeID;
    this.id = id;
    this.openingCrawl = openingCrawl;
    this.planetConnection = planetConnection;
    this.producers = producers;
    this.releaseDate = releaseDate;
    this.speciesConnection = speciesConnection;
    this.starshipConnection = starshipConnection;
    this.title = title;
    this.vehicleConnection = vehicleConnection;
  }

  public FilmCharactersConnection getCharacterConnection() {
    return characterConnection;
  }

  public void setCharacterConnection(FilmCharactersConnection characterConnection) {
    this.characterConnection = characterConnection;
  }

  /**
   * The ISO 8601 date format of the time that this resource was created.
   */
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  /**
   * The name of the director of this film.
   */
  public String getDirector() {
    return director;
  }

  public void setDirector(String director) {
    this.director = director;
  }

  /**
   * The ISO 8601 date format of the time that this resource was edited.
   */
  public String getEdited() {
    return edited;
  }

  public void setEdited(String edited) {
    this.edited = edited;
  }

  /**
   * The episode number of this film.
   */
  public Integer getEpisodeID() {
    return episodeID;
  }

  public void setEpisodeID(Integer episodeID) {
    this.episodeID = episodeID;
  }

  /**
   * The ID of an object
   */
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * The opening paragraphs at the beginning of this film.
   */
  public String getOpeningCrawl() {
    return openingCrawl;
  }

  public void setOpeningCrawl(String openingCrawl) {
    this.openingCrawl = openingCrawl;
  }

  public FilmPlanetsConnection getPlanetConnection() {
    return planetConnection;
  }

  public void setPlanetConnection(FilmPlanetsConnection planetConnection) {
    this.planetConnection = planetConnection;
  }

  /**
   * The name(s) of the producer(s) of this film.
   */
  public List<String> getProducers() {
    return producers;
  }

  public void setProducers(List<String> producers) {
    this.producers = producers;
  }

  /**
   * The ISO 8601 date format of film release at original creator country.
   */
  public String getReleaseDate() {
    return releaseDate;
  }

  public void setReleaseDate(String releaseDate) {
    this.releaseDate = releaseDate;
  }

  public FilmSpeciesConnection getSpeciesConnection() {
    return speciesConnection;
  }

  public void setSpeciesConnection(FilmSpeciesConnection speciesConnection) {
    this.speciesConnection = speciesConnection;
  }

  public FilmStarshipsConnection getStarshipConnection() {
    return starshipConnection;
  }

  public void setStarshipConnection(FilmStarshipsConnection starshipConnection) {
    this.starshipConnection = starshipConnection;
  }

  /**
   * The title of this film.
   */
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public FilmVehiclesConnection getVehicleConnection() {
    return vehicleConnection;
  }

  public void setVehicleConnection(FilmVehiclesConnection vehicleConnection) {
    this.vehicleConnection = vehicleConnection;
  }

  @Override
  public String toString() {
    return "Film{" + "characterConnection='" + characterConnection + "'," +"created='" + created + "'," +"director='" + director + "'," +"edited='" + edited + "'," +"episodeID='" + episodeID + "'," +"id='" + id + "'," +"openingCrawl='" + openingCrawl + "'," +"planetConnection='" + planetConnection + "'," +"producers='" + producers + "'," +"releaseDate='" + releaseDate + "'," +"speciesConnection='" + speciesConnection + "'," +"starshipConnection='" + starshipConnection + "'," +"title='" + title + "'," +"vehicleConnection='" + vehicleConnection + "'" +"}";
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Film that = (Film) o;
        return java.util.Objects.equals(characterConnection, that.characterConnection) &&
                            java.util.Objects.equals(created, that.created) &&
                            java.util.Objects.equals(director, that.director) &&
                            java.util.Objects.equals(edited, that.edited) &&
                            java.util.Objects.equals(episodeID, that.episodeID) &&
                            java.util.Objects.equals(id, that.id) &&
                            java.util.Objects.equals(openingCrawl, that.openingCrawl) &&
                            java.util.Objects.equals(planetConnection, that.planetConnection) &&
                            java.util.Objects.equals(producers, that.producers) &&
                            java.util.Objects.equals(releaseDate, that.releaseDate) &&
                            java.util.Objects.equals(speciesConnection, that.speciesConnection) &&
                            java.util.Objects.equals(starshipConnection, that.starshipConnection) &&
                            java.util.Objects.equals(title, that.title) &&
                            java.util.Objects.equals(vehicleConnection, that.vehicleConnection);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(characterConnection, created, director, edited, episodeID, id, openingCrawl, planetConnection, producers, releaseDate, speciesConnection, starshipConnection, title, vehicleConnection);
  }

  public static Film.Builder newBuilder() {
    return new Builder();
  }

  public static class Builder {
    private FilmCharactersConnection characterConnection;

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    private String created;

    /**
     * The name of the director of this film.
     */
    private String director;

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    private String edited;

    /**
     * The episode number of this film.
     */
    private Integer episodeID;

    /**
     * The ID of an object
     */
    private String id;

    /**
     * The opening paragraphs at the beginning of this film.
     */
    private String openingCrawl;

    private FilmPlanetsConnection planetConnection;

    /**
     * The name(s) of the producer(s) of this film.
     */
    private List<String> producers;

    /**
     * The ISO 8601 date format of film release at original creator country.
     */
    private String releaseDate;

    private FilmSpeciesConnection speciesConnection;

    private FilmStarshipsConnection starshipConnection;

    /**
     * The title of this film.
     */
    private String title;

    private FilmVehiclesConnection vehicleConnection;

    public Film build() {
                  Film result = new Film();
                      result.characterConnection = this.characterConnection;
          result.created = this.created;
          result.director = this.director;
          result.edited = this.edited;
          result.episodeID = this.episodeID;
          result.id = this.id;
          result.openingCrawl = this.openingCrawl;
          result.planetConnection = this.planetConnection;
          result.producers = this.producers;
          result.releaseDate = this.releaseDate;
          result.speciesConnection = this.speciesConnection;
          result.starshipConnection = this.starshipConnection;
          result.title = this.title;
          result.vehicleConnection = this.vehicleConnection;
                      return result;
    }

    public Film.Builder characterConnection(
        FilmCharactersConnection characterConnection) {
      this.characterConnection = characterConnection;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was created.
     */
    public Film.Builder created(String created) {
      this.created = created;
      return this;
    }

    /**
     * The name of the director of this film.
     */
    public Film.Builder director(String director) {
      this.director = director;
      return this;
    }

    /**
     * The ISO 8601 date format of the time that this resource was edited.
     */
    public Film.Builder edited(String edited) {
      this.edited = edited;
      return this;
    }

    /**
     * The episode number of this film.
     */
    public Film.Builder episodeID(Integer episodeID) {
      this.episodeID = episodeID;
      return this;
    }

    /**
     * The ID of an object
     */
    public Film.Builder id(String id) {
      this.id = id;
      return this;
    }

    /**
     * The opening paragraphs at the beginning of this film.
     */
    public Film.Builder openingCrawl(String openingCrawl) {
      this.openingCrawl = openingCrawl;
      return this;
    }

    public Film.Builder planetConnection(
        FilmPlanetsConnection planetConnection) {
      this.planetConnection = planetConnection;
      return this;
    }

    /**
     * The name(s) of the producer(s) of this film.
     */
    public Film.Builder producers(List<String> producers) {
      this.producers = producers;
      return this;
    }

    /**
     * The ISO 8601 date format of film release at original creator country.
     */
    public Film.Builder releaseDate(String releaseDate) {
      this.releaseDate = releaseDate;
      return this;
    }

    public Film.Builder speciesConnection(
        FilmSpeciesConnection speciesConnection) {
      this.speciesConnection = speciesConnection;
      return this;
    }

    public Film.Builder starshipConnection(
        FilmStarshipsConnection starshipConnection) {
      this.starshipConnection = starshipConnection;
      return this;
    }

    /**
     * The title of this film.
     */
    public Film.Builder title(String title) {
      this.title = title;
      return this;
    }

    public Film.Builder vehicleConnection(
        FilmVehiclesConnection vehicleConnection) {
      this.vehicleConnection = vehicleConnection;
      return this;
    }
  }
}
