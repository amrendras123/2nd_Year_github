public class Long_Pressed_Name {

      public boolean isLongPressedName(String n, String t) {
        
        if(n.length()>t.length()){
            return false;
        }
        int i=0;
        int j=0;
        while(i<n.length()&&j<t.length()){
            if(n.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else if(i>0&&t.charAt(j)==n.charAt(i-1)){
                j++;
            }else{
                return false;
            }
        }
        while(j<t.length()){
            if(t.charAt(j)!=n.charAt(i-1)){
                return false;
            }
            j++;
        }
        return i==n.length()&&j==t.length();
    }
}