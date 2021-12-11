public class WordStopText {

    public boolean stop() {
        ReadText text = new ReadText();
        String count = text.readText();
        if (count.contains("stop")) {
            return true;
        } else {
            return false;
        }
    }
}
