public class ReadTextMain {

    public static void main(String[] args) {

        System.out.println(countText());
        System.out.println(countLineText());
        System.out.println(stop());
    }

    public static int countText(){
        ReadText text = new ReadText();
        String count= text.readText();

        int indexOfStop =count.indexOf("stop");

        return indexOfStop;
    }
    public static int countLineText(){
        ReadText text = new ReadText();
        String count= text.readText();
        int totalLinesWithoutStop= 0;
        int numberOfLines = count.split("  ").length;
        if (count.contains("stop")) {
            totalLinesWithoutStop= numberOfLines -1;
        } else{

            return numberOfLines;
        }

        return totalLinesWithoutStop;

    }
    public static boolean stop (){
        ReadText text = new ReadText();
        String count= text.readText();

        if (count.contains("stop")) {
            return true;
        } else{
            return false;
        }
    }
}
