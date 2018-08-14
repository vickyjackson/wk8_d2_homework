package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    private int id;
    private String title;
    private List<File> files;
    private Owner owner;

    public Folder() {

    }

    public Folder(String title, Owner owner) {
        this.title = title;
        this.owner = owner;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    @OneToMany( mappedBy = "folder", fetch = FetchType.LAZY )
    @Column(name = "files")
    public List<File> getFiles() {
        return files;
    }

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    public Owner getOwner() {
        return owner;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
