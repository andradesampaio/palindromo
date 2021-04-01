package br.com.impacta.palindromo;

public class Palindromo {

    public boolean isPalindromo(String phrase) {
        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll("[^a-zA-Z0-9]+","");

        String reversed = new StringBuilder(phrase).reverse().toString();
        return reversed.equals(phrase);
    }
    
    public static void main(String args[]){
        Palindromo pl = new Palindromo();
        boolean result = pl.isPalindromo("Able was I, ere I saw Elba");
        System.out.println(result);
    }

}
