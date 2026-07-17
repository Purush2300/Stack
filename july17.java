
public class july17 {
    public static void main(String[] args) {
        // String s="  sky in  blue";
        // String[]s1=s.split("\\s+");
        // String ans="";
        // for(int i=s1.length-1;i>=0;i--){
        //     ans+=s1[i];
        //     if(i!=0){
        //         ans+=" ";
        //     }
        // }
        // System.out.println(ans);
        // HashMap<Character,Character> map1=new HashMap<>();
        //   HashMap<Character,Character> map2=new HashMap<>();
        // String s1="ab";
        // String s2="aa";
        // for(int i=0;i<s1.length();i++){
        //     char c1=s1.charAt(i);
        //     char c2=s2.charAt(i);
        //     if(map1.containsKey(c1)){
        //         if(map1.get(c1)!=c2){
        //             System.out.println(false+"->map1");
        //             return ;
        //         }
        //     }
        //     else{
        //         map1.put(c1, c2);
        //     }


        //     if(map2.containsKey(c2)){
        //         if(map2.get(c2)!=c1){
        //             System.out.println(false+"->map2");
        //             return;
        //         }
        //     }
        //     else{
        //         map2.put(c2, c1);
        //     }




        // }
        // System.out.println(true);

        String s1="dusty";
        String s2="study";
        // HashMap<Character,Integer> map1=new HashMap<>();
        // for(int i=0;i<s1.length();i++){
        //     char c=s1.charAt(i);
        //     map1.put(c, map1.getOrDefault(c, 0)+1);
        // }

        // for(int i=0;i<s1.length();i++){
        //     char c=s2.charAt(i);
        //     if(!map1.containsKey(c)){
               

        //    System.out.println(false);
        //    return;
        //     }
        //     map1.put(c, map1.get(c)-1);
        //     if(map1.get(c)==0){
        //         map1.remove(c);
        //     }
        // }
        // System.out.println(map1.isEmpty());
        String s="aa";
        System.out.println(s.substring(0,2));

        int l=0;
        String finalsun="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalindrom(sub)){
                    int sublen=sub.length();
                    if(sublen>l){
                        l=sublen;
                        finalsun=sub;
                    }

                }
            }
        }

System.out.println(l);
System.out.println(finalsun);
        
    }
    public static boolean isPalindrom(String s){

        int i=0;
        int j=s.length()-1;
        while(i<=j){

            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }


            return true;
        }
}
