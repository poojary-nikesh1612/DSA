package Strings.BasicAndEasy;

public class ReverseAWord {
    public static String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        int i=s.length()-1;

        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }
            if(i<0)break;
            int j=i;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }


            if(!ans.isEmpty()){
                ans.append(' ');
            }
            ans.append(s.substring(i+1,j+1));
        }

        return ans.toString();
    }

    public static void main(String[]args){
        System.out.println("\""+reverseWords("  hello world  ")+"\"");
    }
}
