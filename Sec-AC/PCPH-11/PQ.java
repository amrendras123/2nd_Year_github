import java.util.ArrayList;

public class PQ {
    
    ArrayList<Integer> list=new ArrayList<>();

    public void add(int val){
        list.add(val);
        upheapify(list.size()-1);
    }
    public void upheapify(int ci){
        int pi=(ci-1)/2;
        if(list.get(pi)>list.get(ci)){
            swap(pi,ci);
            upheapify(pi);
        }
    }
    public void swap(int i,int j){
        int pi=list.get(i);
        int ci=list.get(j);

        list.set(i,ci);
        list.set(j,pi);

    }
    public int size(){
        return list.size();
    }
    public int getMin(){
        return list.get(0);
    }
}
