class Solution {
    public boolean isPalindrome(int x) {
        String sx = Integer.toString(x);
        if(sx.length()%2==0){
            for(int i = 0; i< sx.length(); i++){
                if(sx.charAt(i) != sx.charAt(sx.length()-1-i)){
                    return false;
                }
            }
            return true;
        }else{
            for(int i = 0; i< sx.length()-1; i++){
                if(sx.charAt(i) != sx.charAt(sx.length()-1-i)){
                    return false;
                }
            }
            return true;
        }
    }
}