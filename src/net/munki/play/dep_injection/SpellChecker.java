package net.munki.play.dep_injection;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;

public class SpellChecker {
    @SuppressWarnings("unused")
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

