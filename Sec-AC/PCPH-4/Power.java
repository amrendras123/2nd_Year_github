class Power{
    public static void main(String[] args) {
        
        int n=2;
        int x=5;
        System.out.println(pow(x,n));
    }
    public static int pow(int x, int n){
        if(n==0){//bc
            return 1;
        }
        int sp=pow(x, n-1);//sp

        return x*sp;//self
    }
}