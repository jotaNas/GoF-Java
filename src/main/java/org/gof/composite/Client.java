package org.gof.composite;

import org.gof.composite.folder.domain.FileSystemItem;
import org.gof.composite.folder.domain.Folder;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Client {

    public static FileSystemItem createCompositeFromFile(File file) {
        if(!file.isDirectory()) return new org.gof.composite.folder.domain.File(file.getName());
        List<FileSystemItem> childs = new ArrayList<>();
        File[] files = file.listFiles();
        for(File javaFile: files) {
            childs.add(createCompositeFromFile(javaFile));
        }
        return new Folder(file.getName(), childs);
    }

    public static void main(String[] args) {
        FileSystemItem file1 = new org.gof.composite.folder.domain.File("File1.txt");
        FileSystemItem file2 = new org.gof.composite.folder.domain.File("File2.txt");
        FileSystemItem file3 = new org.gof.composite.folder.domain.File("File3.txt");
        FileSystemItem file4 = new org.gof.composite.folder.domain.File("File4.txt");
        FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
        FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
        FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));

        folder.print("");

        System.out.println("------------");

        String dir = System.getProperty("user.dir");
        FileSystemItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
        fromDisk.print(">");
    }
}

