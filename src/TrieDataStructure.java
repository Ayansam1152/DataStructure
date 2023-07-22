import java.util.*;

public class TrieDataStructure {

    static class TriNode{
        TriNode[] children = new TriNode[26];
        boolean isEnd = false;
    }


    class Trie{
        TriNode root;

        Trie(){
            root = new TriNode();
        }

        public void insert(String words){
            TriNode node = root;
            for(int i=0;i<words.length();i++){
                char c = words.charAt(i);
                if(node.children[c-'a']== null){
                    node.children[c-'a'] = new TriNode();
                }
                node = node.children[c-'a'];
            }
            node.isEnd = true;
        }
        public boolean search(String words){
            TriNode node = root;
            for(int i=0;i<words.length();i++){
                char c = words.charAt(i);
                if(node.children[c-'a']== null){
                    return false;
                }
                node = node.children[c-'a'];
            }
            return node.isEnd;
        }

        public boolean startWith(String prefix){
            TriNode node = root;
            for(int i=0;i<prefix.length();i++){
                char c = prefix.charAt(i);
                if(node.children[c-'a']== null){
                    return false;
                }
                node = node.children[c-'a'];
            }
            return true;
        }

    }

   static TriNode root = new TriNode();

    public static void addToTrie(String s[]){
        for(String word: s){
            TriNode node = root;
            for(int i=0;i<word.length();i++){
                char c = word.charAt(i);
                if(node.children[c-'a'] == null){
                    node.children[c-'a'] =  new TriNode();
                }
                node = node.children[c-'a'];
            }
            node.isEnd = true;
        }
    }
    // this is leetcode function for solution
    static boolean flag[][];
    public static List<String> findWords(char[][] board, String[] words) {
        flag = new boolean[board.length][board[0].length];
        Set<String> result= new HashSet<>();
        addToTrie(words);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(root.children[board[i][j] - 'a'] != null){
                    search(board, i, j, root, "", result);
                }
            }
        }
        return new LinkedList<>(result);
    }

    public static void search(char[][] board, int i, int j, TriNode node, String word, Set<String> result){
        if( i < 0 || i >= board.length || j < 0 || j >= board[0].length || node.children[board[i][j] -'a'] == null || flag[i][j]){
            return;
        }

        flag[i][j] = true;
        node = node.children[board[i][j] -'a'];
        if(node.isEnd){
            result.add(word+board[i][j]);
        }

        search(board,i-1,j,node,word+board[i][j],result);
        search(board,i+1,j,node,word+board[i][j],result);
        search(board,i,j-1,node,word+board[i][j],result);
        search(board,i,j+1,node,word+board[i][j],result);
        flag[i][j] = false;
    }

    public static void main(String[] ayn){
//        char[][] board = {
//                {'o','a','a','n'},
//                {'e','t','a','e'},
//                {'i','h','k','r'},
//                {'i','f','l','v'}};
//        String[] words = {"oath","pea","eat","rain"};
        char [][]board = {{'a'}};
        String [] words ={"ab"};
        System.out.println(findWords(board,words));
    }
}
