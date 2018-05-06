/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.munki.play.dep_injection;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Warren
 */
public class SpellChecker {
    private final Lexicon dictionary;
    
    public SpellChecker(Lexicon dictionary) {
        this.dictionary = Objects.requireNonNull(dictionary);
    }
    
    public boolean isValid(String word) {
        return true;
    }
    
    public List<String> suggestions(String typo){
        return new ArrayList<>();
    }
    
}

