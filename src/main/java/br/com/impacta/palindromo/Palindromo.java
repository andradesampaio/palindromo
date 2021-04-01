package br.com.impacta.palindromo;

public class Palindromo {

    public boolean isPalindromo(String phrase) {
        phrase = phrase.toLowerCase();

        String reversed = new StringBuilder(phrase).reverse().toString();
        return reversed.equals(phrase);
    }
    
    public static void main(String args[]){
        Palindromo pl = new Palindromo();
        pl.isPalindromo("Rotador");
    }

}
