import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class VCPairsTest {
    @Test
    void shouldReturnZeroWhenThereAreNoVowelsInTheString() {
        VCPairs vcPairs = new VCPairs();
        String input = "t";
        Assertions.assertEquals(0, vcPairs.countVcPairs(input, input.length()));
    }

    @Test
    void shouldReturnOneWhenThereIsAConsonantFollowedByAVowel() {
        VCPairs vcPairs = new VCPairs();
        String input = "to";
        Assertions.assertEquals(1, vcPairs.countVcPairs(input, input.length()));
    }

    @Test
    void shouldReturnTwoAsCountWhenThereAreTwoVCPairs() {
        VCPairs vcPairs = new VCPairs();
        String input = "toto";
        Assertions.assertEquals(2, vcPairs.countVcPairs(input, input.length()));
    }

    @Test
    void shouldReturnZeroAsCountWhenThereAreNoVCPairs() {
        VCPairs vcPairs = new VCPairs();
        String input = "ae";
        Assertions.assertEquals(0, vcPairs.countVcPairs(input, input.length()));
    }

}