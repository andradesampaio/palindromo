package br.com.impacta.palindromo;

public class Palindromo {

    public boolean isPalindromo(String phrase) {
        String reversed = new StringBuilder(phrase).reverse().toString();
        return reversed.equals(phrase);
    }
    
    public static void main(String args[]){
        Palindromo pl = new Palindromo();
        pl.isPalindromo("abba");
    }

}
