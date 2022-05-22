package codingbat.string2;

/*
Return true if the given string contains an appearance of "xyz" where the xyz is not directly preceeded by a period (.).
So "xxyz" counts but "x.xyz" does not.

xyzThere("abcxyz") → true
xyzThere("abc.xyz") → false
xyzThere("xyz.abc") → true
* */

public class XYZThere {
    public static void main(String[] args) {
        System.out.println(xyzThere("abc.xyz"));
        System.out.println(xyzThere("abcxysa"));
    }

    public static boolean xyzThere(String str) {

        if (str.length() < 3)
            return false;
        
        for(int i=0; i<str.length()-2; i++){
            boolean xyz = str.substring(i, i + 3).equals("xyz");
            if (xyz && i == 0){
               return true;
           } else if (xyz && str.charAt(i-1) !='.') {
               return true;
           }
        }
        return false;
    }
}
