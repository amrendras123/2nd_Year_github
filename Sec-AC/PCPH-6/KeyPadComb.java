import java.util.ArrayList;
import java.util.List;

public class KeyPadComb {

     static String[] map={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public List<String> letterCombinations(String q) {
        List<String> ans=new ArrayList<>();
        let(q,"",ans);
        return ans;  
    }
    public void let(String q,String str,List<String> ans){
        if(q.length()==0){
            System.out.println(str);
            ans.add(str);
            return;
        }
        char ch=q.charAt(0);//2
        int idx=ch-'0';
        String ss=map[idx];//abc
        for(int i=0;i<ss.length();i++){
        let(q.substring(1),str+ss.charAt(i),ans);
        }
    }
}