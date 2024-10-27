public class PalindromeNumber9 {
  
  public boolean isPalindrome(int x){
    if(x < 0) return false;
    int reverse = 0;
    int copy = x;
    
    while(copy > 0){
      int digit = copy % 10;
      reverse = reverse * 10 + digit;
      copy /= 10;
    }
    return reverse == x;
  }
  public static void main(String[] args){
    PalindromeNumber9 palindromeNumber9Instance = new PalindromeNumber9();
    int palindromeVar = 3443443;
    int palindromeVarTwo = 3443553;
    int palindromeVarThree = 121;

    System.out.println(palindromeNumber9Instance.isPalindrome(palindromeVar));
    System.out.println(palindromeNumber9Instance.isPalindrome(palindromeVarTwo));
    System.out.println(palindromeNumber9Instance.isPalindrome(palindromeVarThree));
  }
}
