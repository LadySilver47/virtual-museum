package tetrad.virtualmuseum.DAO;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "tblImage")
public class Image {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "imageid")
    private String imageID;

    @Column(name = "title")
    private String title;

    @Column(name = "place_of_origin")
    private String placeOfOrigin;
    @Column(name = "artist_display")
    private String artistDisplay;


    @OneToOne(cascade = CascadeType.ALL, mappedBy = "image")
    private Thumbnail thumbnail;

    @JsonIgnore
    @ManyToOne()
    @JoinColumn(name = "gallery_id")
    private Gallery gallery;


    public Image() {
    }

    public Image(String imageID, String title, String placeOfOrigin, String artistDisplay, Gallery gallery, Thumbnail thumbnail) {
        this.imageID = imageID;
        this.title = title;
        this.placeOfOrigin = placeOfOrigin;
        this.artistDisplay = artistDisplay;
        this.gallery = gallery;
        this.thumbnail = thumbnail;
    }

    public Image(Long id, String imageID, String title, String placeOfOrigin, String artistDisplay, Thumbnail thumbnail, Gallery gallery) {
        this.id = id;
        this.imageID = imageID;
        this.title = title;
        this.placeOfOrigin = placeOfOrigin;
        this.artistDisplay = artistDisplay;
        this.thumbnail = thumbnail;
        this.gallery = gallery;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImageID() {
        return imageID;
    }

    public void setImageID(String imageID) {
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlaceOfOrigin() {
        return placeOfOrigin;
    }

    public void setPlaceOfOrigin(String placeOfOrigin) {
        this.placeOfOrigin = placeOfOrigin;
    }

    public String getArtistDisplay() {
        return artistDisplay;
    }

    public void setArtistDisplay(String artistDisplay) {
        this.artistDisplay = artistDisplay;
    }

    public Thumbnail getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(Thumbnail thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Gallery getGallery() {
        return gallery;
    }

    public void setGallery(Gallery gallery) {
        this.gallery = gallery;
    }
}
