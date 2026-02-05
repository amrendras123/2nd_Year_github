class PI{
    public static void main(String[] args) {
        
        int n=5;
        pi(n);
    }
    public static void pi(int n){
        if(n==0){
            return ;
        }
        pi(n-1);
        System.out.println(n);

    }
}