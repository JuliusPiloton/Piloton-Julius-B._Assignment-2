/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, PHP, Ruby, 
C#, OCaml, VB, Perl, Swift, Prolog, Javascript, Pascal, HTML, CSS, JS
Code, Compile, Run and Debug online from anywhere in world.

**************************************************************************/
import java.util.Scanner;
 
public class Main{

 
 public static void main(String[] args) {
     
  Scanner in = new Scanner(System.in);
 
  //input
  System.out.println("Enter your First Integer: ");
  int num1 = in.nextInt();
  System.out.println("Enter your Second Integer: ");
  int num2 = in.nextInt();
  
  //solutions
  int sum = num1 + num2;
  int dif = num1 - num2;
  int prod = num1 * num2;
  int qou = num1 / num2;
  
  //printout of answers
  
  System.out.print("The sum of the two numbers is ");
  System.out.println(sum);
  
   System.out.print("The difference of the two numbers is ");
  System.out.println(dif);
  
  System.out.print("The product of the two numbers is ");
  System.out.println(prod);
 
  System.out.print("The qoutient of the two numbers is ");
  System.out.println(qou);
 }
 
}