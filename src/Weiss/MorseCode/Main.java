package weiss.morsecode;

public class Main {
    public static void main(String[] args){
        MorseCode code = new MorseCode();

        System.out.println(code.toMorseCode("all"));

        System.out.print(code.toMessage("_   ****   **   ***        **   ***       _*_*   ___   ___   *_**"));
    }
}
