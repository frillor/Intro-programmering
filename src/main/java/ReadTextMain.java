public class ReadTextMain {

    public static void main(String[] args) {
         CountWordText text = new CountWordText();
         CountLineText CountText = new CountLineText();
         WordStopText stopWord = new WordStopText();

         System.out.println(text.countWordText());
         System.out.println(CountText.countLineText());
         System.out.println(stopWord.stop());
    }
}
