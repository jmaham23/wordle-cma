package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.module.FindException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileInput {
    public List<String> wordList;
    FileInput() {
        try {
            wordList = Files.readAllLines(new File("/Users/jmaha/Documents/wordle-answers-alphabetical.txt").toPath(), Charset.defaultCharset() );
        }
        catch(IOException e){
            System.out.println("scan issue");
        }
    }
}
