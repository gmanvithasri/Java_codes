import java.util.HashMap;

class TrieNode {
    HashMap<Character, TrieNode> children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new HashMap<>();
        isEndOfWord = false;
    }
}

public class Trie {
    private final TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into the Trie
    public void insert(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            current.children.putIfAbsent(ch, new TrieNode());
            current = current.children.get(ch);
        }

        current.isEndOfWord = true;
    }

    // Search for a word in the Trie
    public boolean search(String word) {
        TrieNode current = root;

        for (char ch : word.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }

        return current.isEndOfWord;
    }

    // Check if there is any word in the Trie that starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode current = root;

        for (char ch : prefix.toCharArray()) {
            if (!current.children.containsKey(ch)) {
                return false;
            }
            current = current.children.get(ch);
        }

        return true;
    }

    public static void main(String[] args) {
        Trie trie = new Trie();

        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");
        trie.insert("ball");

        System.out.println("Search for 'apple': " + trie.search("apple")); // true
        System.out.println("Search for 'app': " + trie.search("app"));   // true
        System.out.println("Search for 'bat': " + trie.search("bat"));   // true
        System.out.println("Search for 'batman': " + trie.search("batman")); // false

        System.out.println("Starts with 'ap': " + trie.startsWith("ap")); // true
        System.out.println("Starts with 'ba': " + trie.startsWith("ba")); // true
        System.out.println("Starts with 'cat': " + trie.startsWith("cat")); // false
    }
}
