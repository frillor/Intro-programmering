public class CountWordText {

    public int countWordText() {
        ReadText text = new ReadText();
        String count = text.readText();
        int indexOfStop = count.indexOf("stop");
        return indexOfStop;
    }
}
