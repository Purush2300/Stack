class stackImplementation{
    static int top=-1;

    static int []st=new int[10];
    public void push(int x){
        top=top+1;
        st[top]=x;
    }
    public int Top(){
        return st[top];
    }
    public  int POP(){
        top=top-1;
        return st[top];
    }
    public int SIZE(){
        return top+1;
    }

    


}










public class First {
    public static void main(String[] args) {
        stackImplementation st=new stackImplementation();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.Top());
        System.out.println(st.SIZE());
        System.out.println(st.POP());
        System.out.println(st.Top());


    }
}
