package model;

public class Gif {

    private Integer id;
    private String name;
    private String username;
    private Boolean favorite;

    public Gif (Integer id, String name, String username, Boolean favorite){
        this.id = id;
        this.name = name;
        this.username = username;
        this.favorite = favorite;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}
