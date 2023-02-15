package weiss.morsecode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {
    @Test
    public void toMorseCode() {
        //given
        MorseCode code = new MorseCode();
        //when
        String message = code.toMorseCode("all");
        //then
        assertEquals("*_   *_**   *_**   ", message);
        //"_   ****   **   ***          **   ***          _*_*   ___   ___   *_**   "
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

 