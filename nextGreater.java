public class nextGreater {
    public static void main(String[] args) {
        int[]num1={2,4};
        int[]num2={1,2,3,4};
        int[]res=next(num1,num2);
        for(int i=0;i<res.length;i++){
System.out.println(res[i]+" ");
        }
    }

    private static int[] next(int[] num1, int[] num2) {
        int[]r=new int[num1.length];
        int s=0;
        for(int i=0;i<num1.length;i++){
            for(int j=0;j<num2.length-1;j++){
                if(num1[i]==num2[j]){
                    if (j==num2.length-1){
                        r[s++]=-1;
                    }
                   else if(num2[j+1]>num1[i]){
                        r[s++]=num2[j+1];
                    }
                    
                }
            }
        }

        return r;
    }
}
