package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class Logic {
    private List<String> words;


    public List<String> getWords() {
        return words;
    }

    public void setWords(List<String> words) {
        this.words = words;
    }

    public Logic(FileInput f) {
        this.words = f.wordList;
    }

    public void solve(Letters l){
        for(Iterator<String> it = words.iterator(); it.hasNext();){
            String s = it.next();
            for(int i=0; i<l.getLetterList().size()-1;i++){
                if(l.getLetterList().get(i) != '-' && s.charAt(i)!=l.getLetterList().get(i)){
                    it.remove();
                    break;
                }
            }
        }

        for(Iterator<String> it = words.iterator(); it.hasNext();){
            String s = it.next();
            for(char c : l.getVagrantList()){
                if(!s.contains(String.valueOf(c))){
                    it.remove();
                    break;
                }
            }
        }

        for(Iterator<String> it = words.iterator(); it.hasNext();){
            String s = it.next();
            for(char c : l.getRemovedList()){
                if(s.contains(String.valueOf(c))){
                    it.remove();
                    break;
                }
            }
        }

        for(Iterator<String> it = words.iterator(); it.hasNext();){
            String s = it.next();
            for(int i=0; i<l.getComplementList().size()-1;i++){
                if(l.getComplementList().get(i) != '-' && s.charAt(i)==l.getComplementList().get(i)){
                    it.remove();
                    break;
                }
            }
        }
    }
}
