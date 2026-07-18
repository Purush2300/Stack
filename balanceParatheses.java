class Gen{
     char[]ch=new char[10]; 
        int top=-1;
    public boolean  PUSH(char c){
       
      

         if(c=='('||c=='{'||c=='['){
           top=top+1;
           ch[top]=c;
         return true;
        }
        else if(top==-1){
            return false;
            
        }

        char f=ch[top];
        top=top-1;
        if(c==')' && f=='(' ||c=='}' && f=='{'||c==']' && f=='['){
            return true;
        }
       
       

      return false;
    }
      public boolean isEmpty(){
            return top == -1;
        }
}



public class balanceParatheses {
 public static void main(String[] args) {
      boolean b=true;
     String s="()";
    Gen g=new Gen();
    for(int i=0;i<s.length();i++){
        char c=s.charAt(i);
        boolean result = g.PUSH(c);

       if (result == false) {
         b = false;
         break;
        }
    }
  if(b && g.isEmpty()){
    System.out.println(true);
  }
  else{
    System.out.println(false);
  }
 }   
}
