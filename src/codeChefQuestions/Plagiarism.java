package codeChefQuestions;

import java.util.*;

public class Plagiarism {
    public static void main(String[] ayn) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();
            long k = sc.nextLong();
            long a[] = new long[(int) k];
            int count=0;
            for (int i = 0; i < k; i++) {
                long x = sc.nextLong();
                if(x <=n){
                    a[i] = sc.nextLong();
                    count++;
            }

            }
           long d[] =new long[(int)n+100];
            Set<Long> set = new HashSet<>();

            for(int i=0;i<count;i++){
                d[(int)a[i]]++;
                if(d[(int)a[i]] >1){
                    set.add(d[(int)a[i]]);
                }

            }
            int size = set.size();
            System.out.print(size+" ");
            for(Long e:set){
                System.out.print(e+" ");
            }

//           for(Long i:d){
//               System.out.print(i+" ");
//           }
            System.out.println();
//            HashMap<Long, Long> map = new HashMap<>();
//            for(int i=0;i<k;i++){
//                if(a[i] <= n){
//                    if(map.containsKey(a[i])){
//                        map.put(a[i], map.getOrDefault(a[i],0L)+1);
//                    }else{
//                        map.put(a[i], 1L);
//                    }
//                }
//            }
////            TreeMap<Long, Long> sorted = new TreeMap<>();
////            sorted.putAll(map);
//            int count=0;
////            ArrayList<Long> list = new ArrayList<>();
//            PriorityQueue<Long> q= new PriorityQueue<>();
//            for (Map.Entry<Long, Long> entry : map.entrySet()){
//                long num = entry.getValue();
//
//                if(num >1L){
//                    count++;
//                    q.add(entry.getKey());
//                }
//            }
//            System.out.print(count +" ");
//            while(!q.isEmpty()){
//                System.out.print(q.poll()+" ");
//            }
//            System.out.println();
//        }
        }
    }
}
