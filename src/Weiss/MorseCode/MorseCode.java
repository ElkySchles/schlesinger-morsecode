package Weiss.MorseCode;

public class MorseCode {

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
            if (message.charAt(i) == ' ') {
                finalString.append("       ");
            }
            if (message.charAt(i) == 'a') {
                finalString.append(morseCode[0] + "   ");
            }
            if (message.charAt(i) == 'b') {
                finalString.append(morseCode[1] + "   ");
            }
            if (message.charAt(i) == 'c') {
                finalString.append(morseCode[2] + "   ");
            }
            if (message.charAt(i) == 'd') {
                finalString.append(morseCode[3] + "   ");
            }
            if (message.charAt(i) == 'e') {
                finalString.append(morseCode[4] + "   ");
            }
            if (message.charAt(i) == 'f') {
                finalString.append(morseCode[5] + "   ");
            }
            if (message.charAt(i) == 'g') {
                finalString.append(morseCode[6] + "   ");
            }
            if (message.charAt(i) == 'h') {
                finalString.append(morseCode[7] + "   ");
            }
            if (message.charAt(i) == 'i') {
                finalString.append(morseCode[8] + "   ");
            }
            if (message.charAt(i) == 'j') {
                finalString.append(morseCode[9] + "   ");
            }
            if (message.charAt(i) == 'k') {
                finalString.append(morseCode[10] + "   ");
            }
            if (message.charAt(i) == 'l') {
                finalString.append(morseCode[11] + "   ");
            }
            if (message.charAt(i) == 'm') {
                finalString.append(morseCode[12] + "   ");
            }
            if (message.charAt(i) == 'n') {
                finalString.append(morseCode[13] + "   ");
            }
            if (message.charAt(i) == 'o') {
                finalString.append(morseCode[14] + "   ");
            }
            if (message.charAt(i) == 'p') {
                finalString.append(morseCode[15] + "   ");
            }
            if (message.charAt(i) == 'q') {
                finalString.append(morseCode[16] + "   ");
            }
            if (message.charAt(i) == 'r') {
                finalString.append(morseCode[17] + "   ");
            }
            if (message.charAt(i) == 's') {
                finalString.append(morseCode[18] + "   ");
            }
            if (message.charAt(i) == 't') {
                finalString.append(morseCode[19] + "   ");
            }
            if (message.charAt(i) == 'u') {
                finalString.append(morseCode[20] + "   ");
            }
            if (message.charAt(i) == 'v') {
                finalString.append(morseCode[21] + "   ");
            }
            if (message.charAt(i) == 'w') {
                finalString.append(morseCode[22] + "   ");
            }
            if (message.charAt(i) == 'x') {
                finalString.append(morseCode[23] + "   ");
            }
            if (message.charAt(i) == 'y') {
                finalString.append(morseCode[24] + "   ");
            }
            if (message.charAt(i) == 'z') {
                finalString.append(morseCode[25] + "   ");
            }


        }
        return finalString.toString();
    }

    public String toMessage(final String morseCodeMessage) {
        String finalMessage = "";
        String change = morseCodeMessage.trim();
        String[] words = change.split(" {3}");
        for(String word:words){
            for(String letter:word.split(" ")){
                for(int x=0; x< morseCode.length; x++){
                    if(letter.equals(morseCode[x])){
                        finalMessage = finalMessage + alphabet[x];
                    }
                }
                finalMessage+=" ";
            }
        }
        return finalMessage;
    }
}

