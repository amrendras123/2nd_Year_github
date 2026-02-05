class Count{
    public static void main(String[] args) {
        int n=8;
        System.out.println(dice(n));
    }
    public static int dice(int n){
      if(n==0){
        return 1;
      }
      if(n<0){
        return 0;
      }
      int f1=  dice(n-1);
       int f2= dice(n-2);
       int f3= dice(n-3);
        int f4=dice(n-4);
        int f5=dice(n-5);
       int f6= dice(n-6);

       return f1+f2+f3+f4+f5+f6;

    }
}