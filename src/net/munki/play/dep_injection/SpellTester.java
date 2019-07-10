package net.munki.play.dep_injection;

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
