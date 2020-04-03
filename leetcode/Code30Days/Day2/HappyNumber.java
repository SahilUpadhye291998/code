package leetcode.Code30Days.Day2;

import java.util.HashSet;

class HappyNumber{
  public static void main(String[] args){
    int input = 7;
    HashSet<Integer> set = new HashSet<Integer>();

    if(input == 1){
      System.out.println("OK Found");
	    return;
    }
    set.add(input);

    while(true){
      int sum = addNumber(input);
      input = sum;

      if(sum==1){
        System.out.println("OK Found"); return;
      }

      if(set.contains(input)){
        System.out.println("Found input");
        break;
      }

      set.add(input);

    }
    System.out.println("Not Found");



  }
  public static int addNumber(int number){

    int sum = 0;

    while(number!=0){
      sum += (number%10) * (number%10);
      number/=10;
    }

    return sum;

  }
}

  /**
   * 1 + 81 = 82
   * 64 + 4 = 68
   * 36 + 64 = 100
   * 1 + 0 + 0 = 1 hence happy number
   */

  /**
   * 1 + 64 = 65
   * 36 + 25 = 61
   * 36 + 1 = 37
   * 9 + 49 = 58
   * 25 + 64 = 89
   * 64 + 81 = 145
   * 1 + 16 +25 = 42
   * 16 + 4 = 20
   * 4 + 0 = 4
   * 16 + 0 = 16
   * 1 + 36 = 37
   */

  /**
   * 1 + 9 = 10
   * 1 + 0 = 1
   *
   *
   *
   */
