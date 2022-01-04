public class WordCounter {
    int rad = 0;
    int getNumberOfCharacter;
    int getNumberOfCharacterNoStop;

    public boolean containsStop(String text) {

        if (text.contains("stop")) {
            System.out.println("Text contains stop :true");
            return true;
        } else {
            return false;
        }
    }

    public int getNumberCharacter(String text) {
        if (text.contains("stop") == false) {
            return getNumberOfCharacterNoStop += text.length();
        } else {
            getNumberOfCharacter = text.indexOf("stop") + getNumberOfCharacterNoStop;
            System.out.println("Numbers of characters to word stop are " + getNumberOfCharacter);
            return getNumberOfCharacter;

        }
    }

    public Integer getNumberRad(String text) {
        if (text != null) {
            if (text.contains("stop")) {
                System.out.println("Numbers of roads in the text without word stop " + rad);
                return rad;

            } else
                return ++rad;
        } else return 0;

    }
}


