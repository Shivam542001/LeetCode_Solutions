class Solution {
    public boolean strongPasswordCheckerII(String password) {
        boolean upr=false, lwr=false, dig=false, special=false;

        if(password.length()<8)
            return false;

        for(int i=0;i<password.length();i++){
            char ch = password.charAt(i);
            if(ch>='A' && ch<='Z')
                upr = true;
            if(ch>='a' && ch<='z')
                lwr = true;
            if(ch>='0' && ch<='9')
                dig = true;
            if("!@#$%^&*()-+".contains(ch+""))
                special = true;
            if(i<password.length()-2 && ch==password.charAt(i+1))
                return false;
        }

        if(upr && lwr && dig && special)
            return true;
        return false;
    }
}