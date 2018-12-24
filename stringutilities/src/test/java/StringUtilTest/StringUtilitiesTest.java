package StringUtilTest;

import StringUtil.StringUtilities;
import org.junit.Assert;
import org.junit.Test;

public class StringUtilitiesTest {

        @Test
        public void capitalizeFirstLetterTest() {
            // Given
            String input = "over the hills and far away";
            String expected = "Over The Hills And Far Away";

            // When
            String actual = StringUtilities.capitalizeFirstLetter(input);

            // Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void reverseStringTest() {
            // Given
            String input = "over the hills and far away";
            String expected = "yawa raf dna sllih eht revo";

            // When
            String actual = StringUtilities.reverseWholeString(input);

            // Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void reverseWordsTest() {
            // Given
            String input = "over the hills and far away";
            String expected = "revo eht sllih dna raf yawa";

            // When
            String actual = StringUtilities.reverseWords(input);

            // Then
            Assert.assertEquals(expected, actual);
        }


        @Test
        public void reverseThenCapitalizeTest() {
            // Given
            String input = "over the hills and far away";
            String expected = "Yawa Raf Dna Sllih Eht Revo";

            // When
            String actual = StringUtilities.reverseThenCapitalize(input);

            // Then
            Assert.assertEquals(expected, actual);
        }


        @Test
        public void removeFirstAndLastCharacterTest() {
            // Given
            String input = "over the hills and far away";
            String expected = "ver the hills and far awa";

            // When
            String actual = StringUtilities.removeFirstAndLastCharacter(input);

            // Then
            Assert.assertEquals(expected, actual);
        }

        @Test
        public void invertCasingTest() {
            // Given
            String input = "OVer thE HiLLs and Far awaY";
            String expected = "ovER THe hIllS AND fAR AWAy";

            // When
            String actual = StringUtilities.invertCasing(input);

            // Then
            Assert.assertEquals(expected, actual);
        }

    @Test
    public void alphaStringTest1() {
        // Given
        String alphaString = "Over the hills and far away";

        // When
        boolean expected = StringUtilities.isAlphaString(alphaString);

        // Then
        Assert.assertTrue(expected);
    }

    @Test
    public void alphaStringTest2() {
        // Given
        String alphaString = "1234";

        // When
        boolean expected = StringUtilities.isAlphaString(alphaString);

        // Then
        Assert.assertFalse(expected);
    }

    @Test
    public void numericStringTest1(){
       //Given
        String numericString = "12345";

        //When
        boolean expected = StringUtilities.isNumericString(numericString);

        //Then
        Assert.assertTrue(expected);
    }

    @Test
    public void numericStringTest2(){
      //Given
      String numericString = "abcdefg";

      //When
        boolean expected = StringUtilities.isNumericString(numericString);

      //Then
      Assert.assertFalse(expected);
    }

    @Test
    public void specialCharactersTest1(){
      //Given
      String specialCharacters = ".//;,'";

      //When
        boolean expected = StringUtilities.isSpecialCharacterString(specialCharacters);

      //Then
      Assert.assertTrue(expected);
    }

    @Test
    public void specialCharactersTest2(){
        //Given
        String specialCharacters = "./abc.'";

        //When
        boolean expected = StringUtilities.isSpecialCharacterString(specialCharacters);

        //Then
        Assert.assertFalse(expected);
    }


}
