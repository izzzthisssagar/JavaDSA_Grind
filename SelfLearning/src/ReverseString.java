public class ReverseString {



    static String reverseString(String str){
        StringBuilder reverse= new StringBuilder();
        int len=str.length();
        for(int i=len-1;i>=0;i--)
        {
            char temp=str.charAt(i);
            reverse.append(temp);

        }
        return reverse.toString();
    }

    static void main(String[] args) {
        String str="abcdefg";
        System.out.println(reverseString(str));
    }
}
