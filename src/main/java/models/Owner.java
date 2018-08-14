package models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "owners")
public class Owner {

    private int id;
    private String name;
    private String username;
    private List<Folder> folders;

    public Owner(){

    }

    public Owner(String name, String username){
        this.name = name;
        this.username = username;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    @OneToMany( mappedBy = "owner", fetch = FetchType.LAZY )
    @Column(name = "folders")
    public List<Folder> getFolders() {
        return folders;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setFolders(List<Folder> folders) {
        this.folders = folders;
    }
}
