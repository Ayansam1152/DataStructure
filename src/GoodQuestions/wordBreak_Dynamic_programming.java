package GoodQuestions;


import java.util.*;

public class wordBreak_Dynamic_programming {
    public static class Trie{
        boolean  isEnd = false;
        Trie[] children = new Trie[26];

        Trie() { }

        Trie(List<String> dict){
            dict.forEach(this::addToTrie);
        }
        public void addToTrie(String s){
           Trie node = this;
           for(char c : s.toCharArray()){
               if(node.children[c-'a'] == null){
                   node.children[c-'a'] = new Trie();
               }
               node = node.children[c-'a'];
           }

           node.isEnd = true;
        }
    }

//    public static boolean wordBreakTrie(String s, List<String> wordDict){
//        return search(s,0, new Trie(wordDict),new boolean[s.length()+1]);
//
//    }


    public static List<String> wordBreakTrie(String s, List<String> wordDict,List<String> ans){
         search(s,0, new Trie(wordDict),new boolean[s.length()+1], ans);
         return ans;
    }

    public static boolean search(String s,int start, Trie root, boolean[] visited, List<String> ans){
        if(start == s.length()) return true;

        Trie cur = root;
        for(int i=start;i<s.length();i++){
            cur = cur.children[s.charAt(i)-'a'];

            if(cur == null)  break;

            if(cur.isEnd && !visited[i]){
                visited[i] = true;
                ans.add(s.substring(start,i+1)+" ");
                if(search(s, i+1, root, visited, ans)) {

                    return true;
                }
                visited[i] = false;

            }
        }
        return false;
    }

    public static void main(String[] ayn){
        List<String> list =new ArrayList<>();
        List<String> ans =new ArrayList<>();
        list.add("apple");
        list.add("pen");
        list.add("applepen");
        list.add("pine");

        list.add("pineapple");

        System.out.println(wordBreakTrie("pineapplepenapple",list, ans));
    }
    //It is a dp Method hmm good but i have another
    public static boolean wordBreak(String s, List<String> wordDict){
        Set<String> set = new HashSet<>();
        for(int i=0;i<wordDict.size();i++){
            set.add(wordDict.get(i));
        }
        boolean[] dp = new boolean[s.length()+1];
        dp[0] = true;
        for(int i=1;i<=s.length();i++){
            for(int j=0;j<i;j++){
                if(dp[j] && set.contains(s.substring(j,i))){
                    dp[i] = true;
                    break;
                }
            }
        }

        return dp[s.length()];
    }
}
