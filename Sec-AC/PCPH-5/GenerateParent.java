import java.util.ArrayList;
import java.util.List;

public class GenerateParent {
    public static void main(String[] args) {
        int n=3;
        List<String> ll=new ArrayList<>();
        par(3,0,0,"",ll);
    }
    public static void par(int n, int op,int cl, String ans,List<String> ll){
        
        if(op==n&&cl==n){
            System.out.println(ans);
            ll.add(ans);
        }
        if(op<n){
            par(n, op+1, cl, ans+"(", ll);
        }
        if(op>cl){
            par(n, op, cl+1, ans+")", ll);
        }
    }
}
