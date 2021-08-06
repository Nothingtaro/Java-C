using System;

namespace TestConsoleApp
{
    public class Program
    {
        static void Main(string[] args)
        {
          // Console.WriteLine("Hello World!");
          // demo3();
          int Fact = factorial(4);
          System.Console.WriteLine(Fact);
        }

        public static void demo1() {
          int total = 0;
          for (int i = 0; i < 10; i++)
          {
              total += i;
          }
          System.Console.WriteLine("total sum = " + total);
        }

        public static void demo2() {
          string userName;
          System.Console.WriteLine("Enter your name: ");
          userName = Console.ReadLine();
          Console.WriteLine("Username is: " + userName);
        }

        public static void demo3() {
          int total = 0;
          int[] nums = {19, 3, 4, 5, 6, 7, 43, 6, 78, 1};
          int min = nums[0];
          int max = nums[0];
          for (int i = 0; i < nums.Length; i++)
          {
              total += nums[i];

              if (nums[i] < min) {
                min = nums[i];
              }

              if (nums[i] > max) {
                max = nums[i];
              }
          }

          System.Console.WriteLine("total sum = " + total);
          System.Console.WriteLine("minimum number = " + min);
          System.Console.WriteLine("maximum number = " + max);
        }

      public static int factorial(int n) {
        if (n == 0 || n == 1) {
          return 1;
        } else {
          return n*factorial(n-1);
        }
        return n;
      }
    
    }
}
