package br.com.impacta.palindromo;

public class Palindromo {

    public boolean isPalindromo(String phrase) {
        if (phrase.length() % 2 == 1){
            return false;
        }
        return true;
    }
    
}
