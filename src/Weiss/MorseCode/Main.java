package Weiss.MorseCode;

public class Main {
    public static void main(String[] args){
        MorseCode code = new MorseCode();

        System.out.println(code.toMorseCode("this is cool"));

        System.out.print(code.toMessage("_   ****   **   ***        **   ***       _*_*   ___   ___   *_**"));
    }
}
