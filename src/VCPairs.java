public class VCPairs {

    private int count = 0;

    public int countVcPairs(String input) {

        for (int i = 1; i < input.length(); i++) {
            if (Character.toString(input.charAt(i)).matches("[aeiou]") &&
                    !Character.toString(input.charAt(i - 1)).matches("[aeiou]")) {
                count++;
            }
        }
        return count;
    }
}
