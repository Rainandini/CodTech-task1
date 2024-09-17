import java.util.*;
 
class passwordChecker{
    public static void main(String[] args) {
        System.out.println("Check your password strength");

        System.out.println("Enter Your PassWord: ");
        Scanner sc = new Scanner(System.in);

        String pass = sc.nextLine();

        String result = passStrengthChecker(pass);
        System.out.println(result);

    }
    public static String passStrengthChecker(String pass) {
        boolean containsLowerCase = false;
        boolean containsUpperCase = false;
        boolean containsDigit = false;
        String  Strength;
        boolean minLength = false;
        boolean containSpecialCharacter = false;
        char[] ch= pass.toCharArray();
        String SpecialCharacter = "!@#$%^&*+-=|./?_,{}[]():;,.<>,";
        for(int i=0; i<pass.length();i++){
           if(Character.isLowerCase(ch[i])){
               containsLowerCase = true;
           }
           if(Character.isUpperCase(ch[i])){
            containsUpperCase = true;
           }
           if(SpecialCharacter.contains(String.valueOf(ch[i]))){
             containSpecialCharacter = true;
           }
           if(Character.isDigit(ch[i])){
            containsDigit = true;
           }
        }
        if(pass.length() >= 8){
            minLength = true;
        }
      if(containsLowerCase && containsUpperCase && containsDigit && containSpecialCharacter && minLength){
        Strength = "Strong";
      }
      else if(minLength && (containsLowerCase && containsUpperCase) ||( containSpecialCharacter && containsDigit)){
        Strength = "Medium";
      }
      else{
        Strength = "Weak";
      }
       return Strength;
    }
}