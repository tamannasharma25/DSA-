public class ShortestPal {
    public static void main(String[] args){
        String s1="aacecaa";
        System.out.print(shortestPalindrome(s1));
    }
    static String shortestPalindrome(String s){
        if(s==null||s.length()==0){
            return s;
         }
        String t=s+"#"+ new StringBuilder(s).reverse().toString();
        int[] lps=lps(t);
        int pallen=lps[t.length()-1];
        String rem=s.substring(pallen);
        String pre=new StringBuilder(rem).reverse().toString();
        return pre+s;
    }
    private static int[] lps(String s){
        int n=s.length();
        int []lps=new int[n];
        int j=0;
        for(int i=1;i<n;i++){
            while (j>0&&s.charAt(i)==s.charAt(j)){
                j=lps[j-1];

            }
            if(s.charAt(i)==s.charAt(j)){
                j++;
                lps[i]=j;
            }
        }
        return lps;
    }

}