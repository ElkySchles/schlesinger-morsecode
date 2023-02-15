package weiss.morsecode;

import java.util.Arrays;

public class MorseCode {
    private String[] words;

    //The array stores all morse code from [0]-[25]
    private String[] morseCode = {"*_", "_***", "_*_*", "_**", "*", "**_*", "__*",
            "****", "**", "*___", "_*_", "*_**", "__", "_*", "___", "*__*", "__*_",
            "*_*", "***", "_", "**_", "***_", "*__", "_**_", "_*__", "__**"};
    private String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j",
            "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};


    public String toMorseCode(final String message) {
        //space between letters is 3 dots
        //space between words is 7 dots
        StringBuilder finalString = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {

            switch (message.charAt(i)) {

                case ' ' -> finalString.append("       ");
                case 'a' -> finalString.append(morseCode[0]).append("   ");
                case 'b' -> finalString.append(morseCode[1]).append("   ");
                case 'c' -> finalString.append(morseCode[2]).append("   ");
                case 'd' -> finalString.append(morseCode[3]).append("   ");
                case 'e' -> finalString.append(morseCode[4]).append("   ");
                case 'f' -> finalString.append(morseCode[5]).append("   ");
                case 'g' -> finalString.append(morseCode[6]).append("   ");
                case 'h' -> finalString.append(morseCode[7]).append("   ");
                case 'i' -> finalString.append(morseCode[8]).append("   ");
                case 'j' -> finalString.append(morseCode[9]).append("   ");
                case 'k' -> finalString.append(morseCode[10]).append("   ");
                case 'l' -> finalString.append(morseCode[11]).append("   ");
                case 'm' -> finalString.append(morseCode[12]).append("   ");
                case 'n' -> finalString.append(morseCode[13]).append("   ");
                case 'o' -> finalString.append(morseCode[14]).append("   ");
                case 'p' -> finalString.append(morseCode[15]).append("   ");
                case 'q' -> finalString.append(morseCode[16]).append("   ");
                case 'r' -> finalString.append(morseCode[17]).append("   ");
                case 's' -> finalString.append(morseCode[18]).append("   ");
                case 't' -> finalString.append(morseCode[19]).append("   ");
                case 'u' -> finalString.append(morseCode[20]).append("   ");
                case 'v' -> finalString.append(morseCode[21]).append("   ");
                case 'w' -> finalString.append(morseCode[22]).append("   ");
                case 'x' -> finalString.append(morseCode[23]).append("   ");
                case 'y' -> finalString.append(morseCode[24]).append("   ");
                case 'z' -> finalString.append(morseCode[25]).append("   ");
                default -> {
                    return "null";
                }
            }
            /*
            if (message.charAt(i) == ' ') {
                finalString.append("       ");
            }
            if (message.charAt(i) == 'a') {
                finalString.append(morseCode[0] + finalString.append("   "));
            }
            if (message.charAt(i) == 'b') {
                finalString.append(morseCode[1] + finalString.append("   "));
            }
            if (message.charAt(i) == 'c') {
                finalString.append(morseCode[2] + finalString.append("   "));
            }
            if (message.charAt(i) == 'd') {
                finalString.append(morseCode[3] + finalString.append("   "));
            }
            if (message.charAt(i) == 'e') {
                finalString.append(morseCode[4] + finalString.append("   "));
            }
            if (message.charAt(i) == 'f') {
                finalString.append(morseCode[5] + finalString.append("   "));
            }
            if (message.charAt(i) == 'g') {
                finalString.append(morseCode[6] + finalString.append("   "));
            }
            if (message.charAt(i) == 'h') {
                finalString.append(morseCode[7] + finalString.append("   "));
            }
            if (message.charAt(i) == 'i') {
                finalString.append(morseCode[8] + finalString.append("   "));
            }
            if (message.charAt(i) == 'j') {
                finalString.append(morseCode[9] + finalString.append("   "));
            }
            if (message.charAt(i) == 'k') {
                finalString.append(morseCode[10] + finalString.append("   "));
            }
            if (message.charAt(i) == 'l') {
                finalString.append(morseCode[11] + finalString.append("   "));
            }
            if (message.charAt(i) == 'm') {
                finalString.append(morseCode[12] + finalString.append("   "));
            }
            if (message.charAt(i) == 'n') {
                finalString.append(morseCode[13] + finalString.append("   "));
            }
            if (message.charAt(i) == 'o') {
                finalString.append(morseCode[14] + finalString.append("   "));
            }
            if (message.charAt(i) == 'p') {
                finalString.append(morseCode[15] + finalString.append("   "));
            }
            if (message.charAt(i) == 'q') {
                finalString.append(morseCode[16] + finalString.append("   "));
            }
            if (message.charAt(i) == 'r') {
                finalString.append(morseCode[17] + finalString.append("   "));
            }
            if (message.charAt(i) == 's') {
                finalString.append(morseCode[18] + finalString.append("   "));
            }
            if (message.charAt(i) == 't') {
                finalString.append(morseCode[19] + finalString.append("   "));
            }
            if (message.charAt(i) == 'u') {
                finalString.append(morseCode[20] + finalString.append("   "));
            }
            if (message.charAt(i) == 'v') {
                finalString.append(morseCode[21] + finalString.append("   "));
            }
            if (message.charAt(i) == 'w') {
                finalString.append(morseCode[22] + finalString.append("   "));
            }
            if (message.charAt(i) == 'x') {
                finalString.append(morseCode[23] + finalString.append("   "));
            }
            if (message.charAt(i) == 'y') {
                finalString.append(morseCode[24] + finalString.append("   "));
            }
            if (message.charAt(i) == 'z') {
                finalString.append(morseCode[25] + finalString.append("   "));
            }*/


        }
        return finalString.toString();
    }

    public String toMessage(final String morseCodeMessage) {
        StringBuilder finalMessage = new StringBuilder();
        String change = morseCodeMessage.trim();
        String[] words = change.split(" {3}");
        for(String word:words){
            for(String letter:word.split(" ")){
                for(int x=0; x< morseCode.length; x++){
                    if(letter.equals(morseCode[x])){
                        finalMessage.append(alphabet[x]);
                    }
                }
                finalMessage.append(" ");
            }
        }
        return finalMessage.toString();
    }
}

