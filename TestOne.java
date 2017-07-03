public class TestOne {
  public static void main(String[] args){
    String myString = "Hello";
    int number = myString.length();
    //method length() returns a value - of type int
    System.out.println(number);
    //method equals returns true or false
    boolean mynumber = myString.equals("Hi");
    System.out.println(mynumber);
    //method compare strings and ignore case sensetivity
    boolean newNumber = myString.equalsIgnoreCase("hello");
    System.out.println(newNumber);
    String myStringLowCase = myString.toLowerCase();
    System.out.println(myStringLowCase);
    String myStringToUpperCase = myStringLowCase.toUpperCase();
    System.out.println(myStringToUpperCase);
    String mySecondString = " Hello Mary! ";
    //trim() deleted white spaces
    String mySecondStringTrim = mySecondString.trim();
    System.out.println(mySecondStringTrim);
    //char charAt() - return the position(index) of a char at String (0,1,2,3 ...)
    char myChar = myString.charAt(1);
    System.out.println(myChar);
    //substring(Start)- Start - index of char from which substring begins
    String mySubstring = myString.substring(1);
    System.out.println(mySubstring);
    //substring (Start, End);
    String mySubstringnew = myString.substring(1, 3);
    System.out.println(mySubstringnew);
    String myNewString = "Hi Mary!";
    //indexOf return int
    System.out.println(myNewString.indexOf("Mary"));
    String myNewStringTwo = "Mary, Mary quite contrary";
    System.out.println(myNewStringTwo.indexOf("Mary", 1));
    String test = "abcdefg";
    System.out.println(test.length());
    String test1 = "abcdefg";
    System.out.println(test1.substring(3));
    String tes = "WHY ARE YOU SHOUTING?";
    System.out.println(tes.toLowerCase());
  }
}
