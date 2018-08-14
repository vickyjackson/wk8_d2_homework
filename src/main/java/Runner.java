import db.DBFolder;
import db.DBHelper;
import db.DBOwner;
import models.File;
import models.Folder;
import models.Owner;

import java.util.List;

public class Runner {

    public static void main(String[] args){
        Owner owner1 = new Owner("Vicky", "cats-are-good");
        DBHelper.save(owner1);

        Folder folder1 = new Folder("cat gifs", owner1);
        DBHelper.save(folder1);

        File file1 = new File("cat1", ".gif", 2.5, folder1);
        DBHelper.save(file1);

        List<File> filesInFolder = DBFolder.getFilesInFolder(folder1);
        List<Folder> foldersOfOwner = DBOwner.getFoldersOfOwner(owner1);
    }
}
