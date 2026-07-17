import java.util.*;

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
        HashMap<Character,Character> map1=new HashMap<>();
          HashMap<Character,Character> map2=new HashMap<>();
        String s1="ab";
        String s2="aa";
        for(int i=0;i<s1.length();i++){
            char c1=s1.charAt(i);
            char c2=s2.charAt(i);
            if(map1.containsKey(c1)){
                if(map1.get(c1)!=c2){
                    System.out.println(false+"->map1");
                    return ;
                }
            }
            else{
                map1.put(c1, c2);
            }


            if(map2.containsKey(c2)){
                if(map2.get(c2)!=c1){
                    System.out.println(false+"->map2");
                    return;
                }
            }
            else{
                map2.put(c2, c1);
            }




        }
        System.out.println(true);
    }
}
