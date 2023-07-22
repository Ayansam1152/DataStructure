import java.util.*;

public class f_ipl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];

        for(int i=0;i<n;i++){
            s[i] = sc.nextLine();
            sc.next();
        }

        System.out.println(Arrays.toString(s));
        List<IPL> ipl = new ArrayList<>();
        ipl.add(new IPL("MI",0,0));
        ipl.add(new IPL("CSK",0,0));
        ipl.add(new IPL("RCB",0,0));
        ipl.add(new IPL("RR",0,0));
        ipl.add(new IPL("SRH",0,0));
        ipl.add(new IPL("DC",0,0));
        ipl.add(new IPL("PKBS",0,0));
        ipl.add(new IPL("KKR",0,0));
        HashMap<String, Integer> map = new HashMap<>();
        map.put("MI", 0);
        map.put("CSK", 1);
        map.put("RCB", 2);
        map.put("RR", 3);
        map.put("SRH",4 );
        map.put("DC",5);
        map.put("PKBS", 6);
        map.put("KKR", 7);

        for(int i=0;i<n;i++){
            String[] a = s[i].split("\\s");
            System.out.println(Arrays.toString(a)+" ");
            String ftname = a[0].substring(1), stname = a[3];
            String fs = score(a[1]), ss = score(a[4]);


            if(Integer.parseInt(fs) > Integer.parseInt(ss)){
                int diff = Integer.parseInt(fs)-  Integer.parseInt(ss);
                double frr = diff*0.05;
                int fpoint = 2;
                double srr = -frr;
                int pos = map.get(ftname);
                IPL t = ipl.get(pos);
                t.point += fpoint;
                t.nrr += frr;
                ipl.add(pos,t);
                int spos = map.get(stname);
                IPL st = ipl.get(spos);
                st.nrr+= srr;
                ipl.add(spos,st);
            }else if(Integer.parseInt(fs) < Integer.parseInt(ss)){
                String z = a[5].substring(0,a[5].length()-1);
                double ftball = Integer.parseInt(ss)/Integer.parseInt(z)*1.0;
                int projScore = (int)ftball*120;
                double srr = (projScore-Integer.parseInt(fs))*0.05;
                int spos = map.get(stname);
                IPL st = ipl.get(spos);
                st.nrr+= srr;
                st.point+=2;
                ipl.add(spos,st);

                int pos = map.get(ftname);
                double frr = -srr;
                IPL t = ipl.get(pos);
                t.nrr+= frr;
                ipl.add(pos,t);

            }else{
                int fpoint = 1;
                int pos = map.get(ftname);
                IPL t = ipl.get(pos);
                t.point += fpoint;
                ipl.add(pos,t);
                int spos = map.get(stname);
                IPL st = ipl.get(spos);
               st.point+=1;
                ipl.add(spos,st);

            }
        }

        for(int i=0;i<ipl.size();i++){
            System.out.println(ipl.get(i).name+" "+ipl.get(i).point);
        }
    }

    public static String score(String s){
        int j =0;
        String fs = "";
        while(s.charAt(j) != '/'){
            fs+= s.charAt(j);
            j++;
        }
        return fs;
    }

    static class IPL{
        String name;
        int point;
        double nrr;

        public  IPL(String name, int point, double nrr){
            this.name = name;
            this.point = point;
            this.nrr = nrr;
        }


    }

    class SortByPointThenNrr implements Comparator<IPL>{

        @Override
        public int compare(IPL o1, IPL o2) {
            if(o1.point == o2.point){
                return (int)(o1.nrr - o2.nrr);
            }else{
                return o1.point - o2.point;
            }
        }
    }
}
