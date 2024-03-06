package Trie;

import java.util.List;

public class _648ReplaceWordss {
  public class TrieNode {
    private TrieNode[] children = new TrieNode[26];
    private boolean isWord = false;
  }

  TrieNode root = new TrieNode();

  public void insertToArrays(TrieNode parent, int curIndex, String str) {
    if (curIndex < str.length()) {
      int childIndex = str.charAt(curIndex) - 'a';
      if (parent.children[childIndex] == null) {
        parent.children[childIndex] = new TrieNode();
      }
      if (curIndex == str.length() - 1) {
        parent.children[childIndex].isWord = true;
      }

      insertToArrays(parent.children[childIndex], curIndex + 1, str);
    }
  }

  public String process(TrieNode parent, int curIndex, String str) {
    int childIndex = str.charAt(curIndex) - 'a';
    if (parent.children[childIndex] == null || curIndex == str.length()) {
      return str;
    } else {
      if (parent.children[childIndex].isWord == true) {
        return str.substring(0, curIndex + 1);
      } else {
        return process(parent.children[childIndex], curIndex + 1, str);
      }
    }
  }

  public String replaceWords(List<String> dictionary, String sentence) {
    for (String str : dictionary) {
      insertToArrays(root, 0, str);
    }

    StringBuilder sb = new StringBuilder();
    String[] stringArray = sentence.split(" ");
    for (int i = 0; i < stringArray.length; i++) {
      String word = stringArray[i];
      if (i == 0) {
        sb.append(process(root, 0, word));
      } else {
        sb.append(" " + process(root, 0, word));
      }
    }

    return sb.toString();
  }
}
