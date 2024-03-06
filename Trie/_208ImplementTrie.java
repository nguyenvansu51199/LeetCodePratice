package Trie;

public class _208ImplementTrie {
  /**
   * TrieNode
   */
  public class TrieNode {
    private static final int SIZE = 26;
    private TrieNode[] children = new TrieNode[SIZE];
    public boolean isWord = false;
  }

  private TrieNode root = new TrieNode();

  public void insert(TrieNode parent, int curIndex, String word) {
    if (curIndex < word.length()) {
      int childIndex = word.charAt(curIndex) - 'a';
      if (parent.children[childIndex] == null) {
        parent.children[childIndex] = new TrieNode();
      }

      if (curIndex == word.length() - 1) {
        parent.children[childIndex].isWord = true;
      } else {
        insert(parent.children[childIndex], curIndex + 1, word);
      }
    }
  }

  public void insert(String word) {
    insert(root, 0, word);
  }

  public boolean searchWord(TrieNode parent, int curIndex, String word) {
    if (curIndex < word.length()) {
      int childIndex = word.charAt(curIndex) - 'a';
      if (parent.children[childIndex] == null) {
        return false;
      }
      if (curIndex == word.length() - 1) {
        if (parent.children[childIndex].isWord == true) {
          return true;
        } else {
          return false;
        }
      }
      return searchWord(parent.children[childIndex], curIndex + 1, word);
    }
    return false;
  }

  public boolean search(String word) {
    return searchWord(root, 0, word);
  }

  public boolean searhPrefix(TrieNode parent, int curIndex, String prefix) {
    if (curIndex < prefix.length()) {
      int childIndex = prefix.charAt(curIndex) - 'a';
      if (parent.children[childIndex] == null) {
        return false;
      }
      if (curIndex == prefix.length() - 1) {
        return true;
      }
      return searhPrefix(parent.children[childIndex], curIndex + 1, prefix);
    }
    return false;
  }

  public boolean startsWith(String prefix) {
    return searhPrefix(root, 0, prefix);
  }
}
