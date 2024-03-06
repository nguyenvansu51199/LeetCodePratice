package Trie;

public class _677MapSumPairsTrie {
  public class TrieNode {
    TrieNode[] child = new TrieNode[26];
    int value = 0;

    TrieNode() {
    };

  }

  TrieNode root = new TrieNode();

  public void insertTrieNode(TrieNode parent, int curIndex, String key, int val) {
    if (curIndex < key.length()) {
      int childIndex = key.charAt(curIndex) - 'a';
      if (parent.child[childIndex] == null) {
        parent.child[childIndex] = new TrieNode();
      } else {
        if (curIndex == key.length() - 1) {
          parent.child[childIndex].value = val;
        }
        insertTrieNode(parent.child[childIndex], curIndex + 1, key, val);
      }
    }
  }

  public void insert(String key, int val) {
    insertTrieNode(root, 0, key, val);
  }

  int total = 0;

  public int searchPrefix(TrieNode parent, int curIndex, String prefix) {

    while (curIndex < prefix.length()) {
      int childIndex = prefix.charAt(curIndex) - 'a';
      if (parent.child[childIndex] == null) {
        return 0;
      }

      if (curIndex == prefix.length() - 1) {
        total += process(parent.child[childIndex]);
      }
      parent = parent.child[childIndex];
      curIndex = curIndex + 1;
    }

    return total;
  }

  int sums = 0;

  public int process(TrieNode cur) {

    for (int i = 0; i < 26; i++) {
      int val = cur.value;
      if (val != 0) {
        process(cur.child[i]);
      }
      sums += val;
    }
    return sums;
  }

  public int sum(String prefix) {

    return searchPrefix(root, 0, prefix);
  }
}
