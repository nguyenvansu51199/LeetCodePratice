package Trie;

public class _208ImplementTrieV {
  public class TrieNode {
    private TrieNode[] children = new TrieNode[26];
    private boolean isWord = false;
  }

  TrieNode root = new TrieNode();

  public void insert(String word) {
    int curIndex = 0;
    TrieNode parent = root;

    while (curIndex < word.length()) {
      int childIndex = word.charAt(curIndex) - 'a';
      if (parent.children[childIndex] == null) {
        parent.children[childIndex] = new TrieNode();
      }
      if (curIndex == word.length() - 1) {
        parent.children[childIndex].isWord = true;
      }
      parent = parent.children[childIndex];
      curIndex++;
    }
  }

  public boolean search(String word) {
    int curIndex = 0;
    TrieNode parent = root;

    while (curIndex < word.length()) {
      int childIndex = word.charAt(curIndex) - 'a';
      if (parent.children[childIndex] == null) {
        return false;
      }
      if (curIndex == word.length() - 1 && parent.children[childIndex].isWord == true) {
        return true;
      }
      parent = parent.children[childIndex];
      curIndex++;
    }

    return false;
  }

  public boolean startsWith(String prefix) {
    int curIndex = 0;
    TrieNode parent = root;

    while (curIndex < prefix.length()) {
      int childIndex = prefix.charAt(curIndex) - 'a';
      if (parent.children[childIndex] == null) {
        return false;
      }
      if (curIndex == prefix.length() - 1) {
        return true;
      }
      parent = parent.children[childIndex];
      curIndex++;
    }

    return false;
  }
}
