import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

class first{
    /*
    // Addtion of two number 
    public static void main(String args[]){
        int a = 45;
        int b = 99;
        int c = a+b;
        System.out.println(c);

    }*/


    /*
    // Addtio of two number without using + oprator
    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        int c = a-(-b);
        System.out.println(c);
    }*/


    /*
    //substraction of two number without using - oprator
    public static void main(String[] args) {
        int a = 8;
        int b = 6;
        int c = a+(~b+1);
        System.out.println(c);
    }*/

    /*
    //Addtion of two floting point number
    public static void main(String[] args) {
        float a = 10.5f;
        float b = 20.8f;
        float c = a+b;
        System.out.println(c);
    }*/

    /*
    //Compute quotient and remainder
    public static void main(String[] args) {
        int divident = 36, divisor = 6;
        int quotient = divident/divisor;
        int remainder= divident%divisor;
        System.out.println("Quotient : " +quotient);
        System.out.println("Remainder : " +remainder);
    }*/


    /*
    //find the asciivalue
    public static void main(String[] args) {
        char ch = 'A';
        int ascii = (int)ch;
        System.out.println("The Asciivalue of " +ch+ " is: " +ascii);
    }*/

/*
    //if you want to print the asci value of multiple char
    public static void main(String[] args) {
        String str = "Hello";
        for(int i = 0 ; i < str.length() ; i++){
            char ch = str.charAt(i);
            int ascii =(int)ch;
            System.out.println("The ascii value of : " + ch + " is " + ascii);
        }
    }*/

    /*
    //check number is even or odd
    public static void main(String[] args) {
        int num = 25;
        if(num%2==0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }*/


    /*
    //check number is positive and negative
    public static void main(String[] args) {
        int num = 25;
        if(num>=0){
            System.out.println("positive");
        }else if(num<=0){
            System.out.println("negative");
        }
    }*/


    /*
    //find the largest number amoung three 
    public static void main(String[] args) {
        double n1 = 25, n2 = 20, n3 = 15;
        if(n1 >= n2 && n2 >=n3)
            System.out.println(n1+ " is a largest number");
        else if(n2 <= n1 && n2 >=n3)
            System.out.println(n2+ " is a largest number");
        else
            System.out.println(n3+ " is lagest number ");
    }*/


/*//using math.max
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 50;
        int num3 = 30;
        
        int max = findMax(num1,num2,num3);
        System.out.println("The maximum number is :" +max);
    }
    public static int findMax(int a, int b, int c){
        return Math.max(a, Math.max(b,c));
    }
*/

/*
//find the math.min 
public static void main(String[] args) {
    int num1 = 10;
    int num2 = 50;
    int num3 = 30;
    
    int max = findMin(num1,num2,num3);
    System.out.println("The maximum number is :" +max);
}
public static int findMin(int a, int b, int c){
    return Math.min(a, Math.min(b,c));
}*/


/*
//java program to concatenate a two string
public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Java";
    System.out.println(str1.concat(str2));
}*/

/*
// reverse a string

    public static void main(String[] args) {
        String s = "hello";
        String reversed = new StringBuilder(s).reverse().toString();
        System.out.println(reversed);  // Output: "olleh"
    }
*/
                        //OR
/*
    public static String reverseString(String s) {
        char[] arr = s.toCharArray();
        int start = 0, end = arr.length - 1;
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return new String(arr);
    }

    public static void main(String[] args) {
        String s = "hello";
        String reversed = reverseString(s);
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reversed);
    }
*/


/*
// how to compare two string
public static void main(String[] args) {
    String str1 = "Hello";
    String Str2 = "java";
    System.out.println(str1.equals(Str2));
}
*/


/*
//find the dublicate char in string

public static void main(String args[]) {
    String str = "beautiful beach";
    char[] carray = str.toCharArray();
    System.out.println("The string is:" + str);
    System.out.print("Duplicate Characters in above string are: ");
    for (int i = 0; i < str.length(); i++) {
       for (int j = i + 1; j < str.length(); j++) {
          if (carray[i] == carray[j]) {
             System.out.print(carray[j] + " ");
             break;
          }
       }
    }
 }*/

/*
 // how to create a object in java

    void show() {
        System.out.println("Hello how u r");
    }
 public static void main(String[] args) {
    first objFirst = new first();
    objFirst.show();
 }
*/ 
/*
//how to comapare a two object in java
public static void main(String[] args) {
    first obj1 = new first();
    first obj2 = new first();

    if (obj1 == obj2) {
        System.out.println("Both references point to the same object.");
    } else {
        System.out.println("References point to different objects.");
    }
}
*/  

/*
 //How to generate random number
     public static void main(String args[])   
      {   
        System.out.println("1st Random Number: " + Math.random());   
        System.out.println("2nd Random Number: " + Math.random());  
        System.out.println("3rd Random Number: " + Math.random());   
        System.out.println("4th Random Number: " + Math.random());   
     }*/



//How to print array in java
/*
public static void main(String[] args) {
    int [] arr = {1,2,3,4,5,6};
    
    for(int i = 0; i < arr.length; i++){
        System.out.println(arr[i]+ " ");
    }
} */


/*
public static void main(String[] args) {
    int[] arr = {1, 2, 3, 4, 5};

    for (int num : arr) {
        System.out.print(num + " ");
    }
}*/


/*
  public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(arr));
    }
*/



//how to compare two array in java

/*
public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {1,2,3,4,5,6};

    boolean isEqual = Arrays.equals(arr1,arr2);
    System.out.println("Array are equal: " +isEqual);
}*/


/*
//For multi-dimensional
public static void main(String[] args) {
    int arr1[][] = {{1,2,3,4,5},{11,12,13,14,15}};
    int arr2[][] = {{1,2,3,4,5,6},{21,22,23,24,25}};

    boolean isEqual = Arrays.deepEquals(arr1,arr2);
    System.out.println("Array are equal: " +isEqual);
}*/




// print the smallest element in given array
/*
public static void main(String[] args) {
    int arr[] = {6, 5, 2, 4, 8, 7, 9};
    Arrays.sort(arr);
    int smallest = arr[0];
    System.out.println("The smallest element is: " + smallest);
}
*/


//Print the second smallest element in array
   /* public static void main(String[] args) {
        int arr[] = {2, 5, 8, 7, 4, 6, 9};
        Arrays.sort(arr);
        int smallest = arr[0];
        int secondSmallest = Integer.MAX_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != smallest) {
                secondSmallest = arr[i];
                break;
            }
        }
        
        if (secondSmallest == Integer.MAX_VALUE) {
            System.out.println("There is no second smallest element.");
        } else {
            System.out.println("The second smallest element is: " + secondSmallest);
        }
    }*/







//Print the largest element in array
/*
public static void main(String[] args) {
    int arr[] = {6, 5, 2, 4, 8, 7, 9};
    Arrays.sort(arr);
    int largest = arr[arr.length - 1];
    
    System.out.println("The largest element is: " + largest);
}
*/


//Print the second largest element in array
/*
    public static void main(String[] args) {
        int arr[] = {5, 8, 7, 9, 6, 4, 3, 1};
        Arrays.sort(arr);
        int largest = arr[arr.length - 1];
        int secondLargest = Integer.MIN_VALUE;

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != largest) {
                secondLargest = arr[i];
                break;
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondLargest);
        }
    }*/



    // check whether the an alphabet is vowel or consonant
    /*public static void main(String[] args) {
        char ch ='z';
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch+ " is vowel ");
        }else{
            System.out.println(ch+ " is not vowel ");
        }

    }
*/


//using switch satement

/*public static void main(String[] args) {
    char ch ='x';
    switch (ch) {
        case 'a':
        case 'e':
        case 'i':
        case 'o':
        case 'u':
            System.out.println(ch+ " is vowel");
            break;
    
        default:
            System.out.println(ch+ " is not vowel");
    }
}*/




// check wether the year is leap year or not

/*public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a year:");
    int year =scanner.nextInt();

    boolean isleapYear = (year %4 == 0 && year % 100 !=0) || (year % 400 == 0);

    if(isleapYear){
        System.out.println(year+ " is leap year ");
    }else{
        System.out.println(year+ " is not leap year ");
    }
}

*/



//check wether a number is prime or not
//using for loop
/*public static void main(String[] args) {
    int num = 27;
    boolean flag = false;
    for (int i = 2; i<=num/2; i++){
        if(num % i == 0){
            flag = true;
            break;
        }
    }
    if(!flag)
    System.out.println(num+ " is a prime number ");
    else
    System.out.println(num+ " is not a prime number ");
}
*/

//using while loop
/*public static void main(String[] args) {
    int num = 30, i = 2;
    boolean flag=false;
    while (i<num/2) {
        if(num % i == 0){
            flag = true;
            break;
        }
        i++;
    }
        if(!flag)
            System.out.println(num+ " is a prime number ");
            else
            System.out.println(num+ " is not prime number ");
        
    }
*/


//Display the fibonacci series
//using for loop 

/*public static void main(String[] args) {
    int n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("Fibonacci series till " + n + " termas: ");
    for(int i = 1; i <= n; i++){
        System.out.print(firstTerm + ",");

        int nextTerm = firstTerm + secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
    }
}

*/

//using while loop

/*public static void main(String[] args) {
    int i =1,  n = 10, firstTerm = 0, secondTerm = 1;
    System.out.println("The Fibonacci Series " + n + " term:");

    while(firstTerm <= n){
        System.out.print(firstTerm+ ", ");

        int nextTerm = firstTerm+secondTerm;
        firstTerm = secondTerm;
        secondTerm = nextTerm;
        i++;
    }
}
*/


//using recurction

/*public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter the number ");
    int n = scanner.nextInt();
    System.out.println("Fibonacci sequence " + n + " is ");

    for(int i=0; i < n; i++){
        System.out.print(fibonacci(i)+ " ");
    }
    scanner.close();
}
public static int fibonacci(int n){
    if(n <= 1){
        return n;
    }else{
        return fibonacci(n-1) + fibonacci(n-2);
    }
}
*/


//reverse a nuber using for loop

/*public static void main(String[] args) {
    int num = 123456789, reverse = 0;
    for(;num != 0; num /=10){ //the ; indicate that the initilzation part is empty
        int digit =num % 10;
        reverse = reverse * 10 + digit;
    }
    System.out.println("Reverse number: " + reverse);
}*/


// check palindrom

//check string is palindrom 

/*public static void main(String[] args) {
    String str = "madam", reverseStr ="";
    int StringLength = str.length();

    for(int i = (StringLength - 1); i >=0; i--){
        reverseStr = reverseStr + str.charAt(i);
    }
    if(str.toLowerCase().equals(reverseStr.toLowerCase())){
        System.out.println(str+ " is a Palindrom String.");
    }
    else{
        System.out.println(str+ " is not a Palindrom String");
    }
}*/


//number is palindrom or not

/*public static void main(String[] args) {
    int num = 123321, reversenum =0, remainder;
    int OriginalNum = num;

    while(num != 0){
        remainder = num % 10;
        reversenum = reversenum * 10 + remainder;
        num /= 10;
    }
        if(OriginalNum == reversenum){
            System.out.println(OriginalNum + " is palindrom");
        }
        else{
            System.out.println(OriginalNum + " is not palindrom ");
        }
    }
*/

//check number is armstrong or not

/*public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    System.out.println("Enter a number: ");
    int num = scanner.nextInt();
    int originalnum,remainder,result =0;
    originalnum = num;
     
    while (originalnum !=0) {
        remainder = originalnum % 10;
        result += Math.pow(remainder, 3);
        originalnum /= 10;
    }
    if (result == num)
        System.out.println(num+ " is a Armstrong number");
    else
        System.out.println(num+ " is not a Armstrong number");
        scanner.close();
}
*/



//sum of natural number

/*public static void main(String[] args) {
    int num = 100, sum = 0;
    for(int i = 1; i <= num; i++){
        sum = sum+i;
    }
    System.out.println("Sum = " +sum);
}
*/


//find the factorial of number
//using for loop
/*public static void main(String[] args) {
    int num = 10;
    long factorial = 1;
    for(int i = 1; i <= num; i++){
        factorial =factorial * i;
    }
    System.out.println("Factorial of " +num+ " is: " +factorial);
}*/

//using while loop

/*public static void main(String[] args) {
    int num = 100, i = 1;
    long factorial = 1;
    while(i <= num){
        factorial = factorial * i;
        i++;
    }
    System.out.println("Factorial of " + num + " is: " + factorial);
}
*/


//calculate a power of number
//using for loop

/*public static void main(String[] args) {
    int base = 3, exponent = 4;
    long result = 1;
    for(; exponent != 0; exponent--){
        result = result * base;
    }
    System.out.println("Answer = " +result);
}*/

//using pow() function
/*public static void main(String[] args) {
    int base =3, exponent = 4;
    double result = Math.pow(base, exponent);
    System.out.println("Answer = " + result);
}
*/


//Program to remove all white spaces

/*public static void main(String[] args) {
    String sentence = " pr a tik ";
    sentence = sentence.replaceAll("\\s", "");
    System.out.println(sentence);
}
*/


// convert chat to int 
/*public static void main(String[] args) {
    char a ='5';
    char b = 'c';

    int num1 = a;
    int num2 = b;

    System.out.println(num1);
    System.out.println(num2);
}*/

//int to char 
/*public static void main(String[] args) {
    int num1 =87;
    int num2 =75;

    char a = (char)num1;
    char b = (char)num2;

    System.out.println(a);
    System.out.println(b);
}

*/


// Patterns :

/*public static void main(String[] args) {
    int row  = 5;
    for( int i = row; i >= 1; i--){
        for(int j = 1; j <= i; j++){
            System.out.print(" * ");
        }
        System.out.println();
    }
}

*/

/*public static void main(String[] args) {
    for(int i=1; i<=1000; i++){
        if(i % 100 ==0){
            continue;
        }
        System.out.println(i);
    }
}*/


    



}





// swap number without using a temp variable and operator

// public class demo {
//  public static void main(String[] args) {
//    int a = 9;
//    int b = 5;

//    a = a^b;
//    b = a^b;
//    a = a^b;

//    System.out.println("a:"+a);
//    System.out.println("b:"+b);
//  }
// }


//find the minimum and amximum nuber in array

// class demo{
//   public static void main(String[] args) {
//     int arr[]={1,5,3,2,4,8,7,9,5,4,8,0};
//     int max = arr[0];
//     int min = arr[0];
//     for(int i = 0; i<arr.length; i++)
//     {
//       if (arr[i]>max) {
//         max = arr[i];
//       }
//       if(arr[i]<min){
//         min = arr[i];
//       }
//     }
//     System.out.println("maximum element:"+max);
//     System.out.println("minimum element:"+min);
//   }
// }


// //sort an array without using Arrays.sort()

// import java.util.Arrays;
// class demo{
//   public static void main(String[] args) {
//     int arr[] = {1,2,8,4,7,9,6,5,3};
//     int temp;
//     for(int i = 0; i<arr.length; i++){
//       for(int j=i+1; j<arr.length; j++){
//         if(arr[i]>arr[j])
//         {
//           temp=arr[i];
//           arr[i]=arr[j];
//           arr[j]= temp;
//         }
//       }
//     }
//      System.out.println(Arrays.toString(arr));
//   }
// }

//string reverse

// class demo{
//   public static void main(String[] args) {
//     String temp="";
//     String s ="java";
//     for(int i=s.length()-1; i>=0; i--){
//       char c = s.charAt(i);
//       temp= temp+c;
     
//     }
//     System.out.println("Reverse string is:"+temp);
//   }
// }


//write a java program to count a string

// class demo{
//   public static void main(String[] args) {
//     String s="Hello guys";
//     int count=0;
//     for(int i=0;i<s.length();i++){
//       if (s.charAt(i)!=' ') {
//         count++;
        
//       }
//     }
//     System.out.println(count);
//   }
// }


class MissingNumber {
    public static void main(String[] args) {
      int[] arr = {1, 2, 4, 5, 6}; // Array with missing number (in this case, 3)
      int n = arr.length + 1;  // As one number is missing, the array length is n-1
  
      // Calculate the sum of first n natural numbers
      int totalSum = n * (n + 1) / 2;
  
      // Calculate the sum of the elements in the array
      int arraySum = 0;
      for (int i = 0; i < arr.length; i++) {
        arraySum += arr[i];
      }
  
      // The missing number is the difference between the two sums
      int missingNumber = totalSum - arraySum;
  
      System.out.println("The missing number is: " + missingNumber);
    }
  }
  