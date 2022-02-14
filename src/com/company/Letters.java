package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Letters {
    private List<Character> letterList;
    private List<Character> vagrantLetters;
    private List<Character> removedLetters;
    private List<Character> complementLetters;

    public Letters() {
        this.letterList = Arrays.asList('-', '-', '-', '-', '-');
        this.vagrantLetters = new ArrayList<Character>();
        this.removedLetters = new ArrayList<Character>();
        this.complementLetters = Arrays.asList('-', '-', '-', '-', '-');
    }

    public List<Character> getLetterList() {
        return letterList;
    }
    public List<Character> getVagrantList(){
        return vagrantLetters;
    }
    public List<Character> getRemovedList(){
        return removedLetters;
    }
    public List<Character> getComplementList(){
        return complementLetters;
    }

    public void setLetter(int index, char c){
        letterList.set(index, c);
    }

    public void addLetter(char c){
        if(vagrantLetters.indexOf(c)==-1) {
            vagrantLetters.add(c);
        }
    }
    public void removeLetter(int index, char c){
        if(letterList.contains(c)){
            complementLetters.set(index, c);
        }
        else {
            removedLetters.add(c);
        }
    }
}
