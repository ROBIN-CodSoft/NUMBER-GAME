import java.io.*;
import java.util.*;
class Number
{
public static void main(String arg[])
{
System.out.println("\n\n**************NUMBER_GAME**************\n\n");
int start,last,random_number,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the maximum attempt in which you finished the Game:");
i=sc.nextInt();
while(i==0)
{
System.out.println("Enter the maximum attempt in which you finished the Game:");
i=sc.nextInt();
}
System.out.println("\nEnter the starting number of range from 1:");
start=sc.nextInt();

while(start==0)
{
System.out.println("\nEnter the starting number of range from 1:");
start=sc.nextInt();
}
System.out.println("\nEnter the last number of range:");
last=sc.nextInt();
while(last==0)
{
System.out.println("\nEnter the last number of range:");
last=sc.nextInt();
}

//Random is a anynomous class
Random r=new Random();//Create a object Of Random class
random_number=r.nextInt((last-start)+1)+start;
System.out.println("\nYou have "+ i +"attempts to complete the Game\n");

while(i>=1)
{
System.out.println("Enter the Guess number");
int User_guess=sc.nextInt();

if(User_guess==random_number)
{
System.out.println("\nUser Score according to the number of Attempts\n");
System.out.println("Your Score is"+20*i);

System.out.println("You Win the Game");
break;
}
else if(User_guess != random_number)
{
i--;
System.out.println("\nYou have reamaining only "+i+"attempts\n");

if(i==0)
{
System.out.println("Your Score is"+20*i);
System.out.println("You Loose The Game");
}
else if(User_guess > random_number)
{
System.out.println("Your guess number is too High");
}
else if(User_guess < random_number)
{
System.out.println("Your guess number is too Low");
}
}
}
}
}
