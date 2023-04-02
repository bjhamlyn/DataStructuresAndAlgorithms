public class Loops {
   
    public static void main(String[] args) {
        System.out.println(IsEven(2023));
        System.out.println(countVowels("BRANDON HAMLYN"));
        
    }
    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean IsEven(int number){
        // int remainder = number%2;
        // if(remainder == 0)
        //     return true;
        // else
        //     return false;
            return number%2 == 0;
        
    }
}
