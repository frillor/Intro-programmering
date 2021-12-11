public class CountLineText {

    public int countLineText() {
        ReadText text = new ReadText();
        String count = text.readText();
        int totalLinesWithoutStop = 0;
        int numberOfLines = count.split("  ").length;
        if (count.contains("stop")) {
            totalLinesWithoutStop = numberOfLines - 1;
        } else {

            return numberOfLines;
        }

        return totalLinesWithoutStop;

    }
}
