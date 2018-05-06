/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.munki.play.dep_injection;

/**
 *
 * @author Warren
 */
public class SpellTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lexicon lexicon = new Lexicon();
        SpellChecker spellChecker = new SpellChecker(lexicon);
        System.out.println("Is valid : " + spellChecker.isValid("word"));
        System.out.println("Suggestions : " + spellChecker.suggestions("word"));
    }
    
}
