class Trie {

    /** Initialize your data structure here. */
    TrieNode root;
    public Trie() {
        root = new TrieNode();
    }

    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(!node.conatinsKey(c)){
                node.put(c, new TrieNode());
            }
            node = node.get(c);
        }
        node.setEnd();
    }

    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode node = root;
        for(int i=0;i<word.length();i++){
            char c = word.charAt(i);
            if(!node.conatinsKey(c)){
                return false;
            }
            node = node.get(c);
        }
        return node.isEnd();
    }

    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for(int i=0;i<prefix.length();i++){
            char c = prefix.charAt(i);
            if(!node.conatinsKey(c)){
                return false;
            }
            node = node.get(c);
        }
        return true;
    }

    class TrieNode{
        private TrieNode[] root;
        private boolean isEnd;

        TrieNode(){
            root  = new TrieNode[26];
        }

        private boolean conatinsKey(char c){
            return root[c-'a'] != null;
        }

        private TrieNode get(char c){
            return root[c-'a'];
        }

        private void put(char c, TrieNode node){
            root[c-'a'] = node;
        }

        private void setEnd(){
            isEnd = true;
        }

        private boolean isEnd(){
            return isEnd;
        }
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */