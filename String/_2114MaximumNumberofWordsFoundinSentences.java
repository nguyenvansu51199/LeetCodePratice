package String;

public class _2114MaximumNumberofWordsFoundinSentences {
  public int mostWordsFound(String[] sentences) {
    int max = 0;
    for (int i = 0; i < sentences.length; i++) {
      String str = sentences[i];
      String[] arr = str.split(" ");
      int len = arr.length;

      if (len > max) {
        max = len;
      }
    }

    return max;
  }

  public static void main(String[] args) {

  }
}
