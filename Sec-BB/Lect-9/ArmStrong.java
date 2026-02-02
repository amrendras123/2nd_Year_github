class ArmStrong{
    public static void main(String[] args) {
        
        int n=407;
        amSt(n);

    }
    public static void amSt(int n){
        int dig=0;
        int temp=n;
        while(temp!=0){
            dig++;
            temp/=10;
        }
        int sum=0;
        temp=n;
        while(temp!=0){
            int rem=temp%10;
            sum+=(int)Math.pow(rem,dig);
            temp=temp/10;
        }
        if(n==sum){
            System.out.println("ArmStrong number");
        }else{
            System.out.println("Not a armstrong number");
        }
    }
}