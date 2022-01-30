class Solution {
    public String gcdOfStrings(String str1, String str2) {
        //if(str2 == 0)
            //  return str1;
         // return gcdOfStrings(str2,str1%str2);
        if (str1.length() < str2.length()) {
            return gcdOfStrings(str2, str1);
        }

        if (str1.startsWith(str2)) {
            String  pre = str1.substring(str2.length());

            if (pre.isEmpty()) {
                return str2;
            }
            return gcdOfStrings(str2, pre);
        }
        return "";
    }
}