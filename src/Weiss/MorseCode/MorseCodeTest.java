package Weiss.MorseCode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
    @Test
    public void toMorseCode() {
        //given
        MorseCode code = new MorseCode();
        //when
        String message = code.toMorseCode("this is cool");
        //then
        assertEquals("_   ****   **   ***          **   ***          _*_*   ___   ___   *_**   ", message);
    }
    @Test
    public void toMessage() {
        //given
        MorseCode code = new MorseCode();
        //when
        String message = code.toMessage("_   ****   **   ***          **   ***          _*_*   ___   ___   *_**");
        //then
        assertEquals("t h i s    i s    c o o l", message);
    }

}

 