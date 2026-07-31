/*
import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
float f=s.nextFloat();
short S=s.nextShort();
double d=s.nextDouble();
char ch=s.next().charAt(0);
System.out.print("int :"+i+"\n"+"float :"+f+"\n"+"short :"+S+"\n"+"double :"+d+"\n"+"char :"+ch);

}}
_________________________________________________________________________________________________________
class Main{
public static void main(String[] args){
int a =-3;
System.out.println(a>>>2);
System.out.println(0b1110);
}}
_____________________________________________________________________________________

class Main{
public static void main(String[] args){
for (int i =0;i<2;i++){
System.out.print(i);
}
}
}
_______________________________________________________________________________

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if (i>=500){
System.out.println("Yes");
}
else{
System.out.print("No");}
}
}

_________________________________________________________________________________________


import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if (i%2==0)
System.out.print("EVEN");
else
System.out.print("ODD");
}
}

_______________________________________________________________________________



import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if ((i&1)==0)
System.out.print("0dd");
else
System.out.print("even");
}
}

_______________________________________________________________________________


import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if ((i%400==0)||(i%4==0) && (i%100!=0))
System.out.print("Leap");
else
System.out.print("not");
}
}

_______________________________________________________________________________

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int max=a>b?(a>c?a:c):(b>c?b:c);
System.out.print(max);
}
}
_______________________________________________________________________________


import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();

int max=(a>b)?(a>c)?(a>d?a:d):(c>d?c:d):(b>c)?(b>d?b:d):(c>d?c:d);
System.out.print(max);
}
}

_______________________________________________________________________________
//WAP to print sum of First N odd numbers ?
import java.util.Scanner;
public  class Main {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        int A = M.nextInt();
        int i = 1;
        int Sum = 0;
        while (i < 2 * A) {
                Sum = Sum + i;
                i=i+2;
        }
        System.out.println(Sum);
    }
}




_______________________________________________________________________________
//WAP to print all the Factors of the given number ?

import java.util.Scanner;
public  class Main{
    public static void main(String[] args){
        Scanner M=new Scanner(System.in);
        int A=M.nextInt();
        int i=1;
        while(i<=A){
             if(A%i==0){
                   System.out.println(i);
                   }
            i++;
        }
    }
}
_______________________________________________________________________________

//write a program to print the factorial the given number?
import java.util.Scanner;
public  class Main{
public static void main(String[] args){
Scanner M=new Scanner(System.in);
int F=M.nextInt();
int m=1;
int i = 1;
while(i<=F){
m=m*i;
i++;
}
System.out.println(m);
}
}
__

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
float f=s.nextFloat();
short S=s.nextShort();
double d=s.nextDouble();
char ch=s.next().charAt(0);
System.out.print("int :"+i+"\n"+"float :"+f+"\n"+"short :"+S+"\n"+"double :"+d+"\n"+"char :"+ch);

}}
_________________________________________________________________________________________________________
class Main{
public static void main(String[] args){
int a =-3;
System.out.println(a>>>2);
System.out.println(0b1110);
}}
_____________________________________________________________________________________

class Main{
public static void main(String[] args){
for (int i =0;i<2;i++){
System.out.print(i);
}
}
}
_______________________________________________________________________________

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if (i>=500){
System.out.println("Yes");
}
else{
System.out.print("No");}
}
}

_________________________________________________________________________________________


import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if (i%2==0)
System.out.print("EVEN");
else
System.out.print("ODD");
}
}

_______________________________________________________________________________



import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if ((i&1)==0)
System.out.print("0dd");
else
System.out.print("even");
}
}

_______________________________________________________________________________


import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int i=s.nextInt();
if ((i%400==0)||(i%4==0) && (i%100!=0))
System.out.print("Leap");
else
System.out.print("not");
}
}

_______________________________________________________________________________

import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int max=a>b?(a>c?a:c):(b>c?b:c);
System.out.print(max);
}
}
_______________________________________________________________________________


import java.util.Scanner;
class Main{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
int a=s.nextInt();
int b=s.nextInt();
int c=s.nextInt();
int d=s.nextInt();

int max=(a>b)?(a>c)?(a>d?a:d):(c>d?c:d):(b>c)?(b>d?b:d):(c>d?c:d);
System.out.print(max);
}
}

_______________________________________________________________________________
//WAP to print sum of First N odd numbers ?
import java.util.Scanner;
public  class Main {
    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        int A = M.nextInt();
        int i = 1;
        int Sum = 0;
        while (i < 2 * A) {
                Sum = Sum + i;
                i=i+2;
        }
        System.out.println(Sum);
    }
}




_______________________________________________________________________________
//WAP to print all the Factors of the given number ?

import java.util.Scanner;
public  class Main{
    public static void main(String[] args){
        Scanner M=new Scanner(System.in);
        int A=M.nextInt();
        int i=1;
        while(i<=A){
             if(A%i==0){
                   System.out.println(i);
                   }
            i++;
        }
    }
}
_______________________________________________________________________________

//write a program to print the factorial the given number?
import java.util.Scanner;
public  class Main{
public static void main(String[] args){
Scanner M=new Scanner(System.in);
int F=M.nextInt();
int m=1;
int i = 1;
while(i<=F){
m=m*i;
i++;
}
System.out.println(m);
}
}
_______________________________________________________________________________

//WAP to check the given Number is prime or not?
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        int A = M.nextInt();
        int i = 1;
        int c = 0;
        while (i <= A) {
            if (A % i == 0) {
                c = c + 1;
            }
            i++;
        }
        if (c == 2) {
            System.out.println("it is a Prime Number = " + A);
        } else {
            System.out.println("it is not a Prime number");
        }
    }
}
__________________________________________________________________

//WAP to check the given Number is prime or not?
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner M = new Scanner(System.in);
        int A = M.nextInt();
        int i = 1;
        int c = 0;
        while (i <= A) {
            if (A % i == 0) {
                c = c + 1;
            }
            i++;
        }
        if (c == 2) {
            System.out.println("it is a Prime Number = " + A);
        } else {
            System.out.println("it is not a Prime number");
        }
    }
}


---------------------------------------------------------------------------------------------------------------- 
import java.util.Scanner;
import java.lang.System;
class Main{
    public static void main(String[] args) {
        int a = 123;
        int b = 738;
        int c = 368;
        Scanner input = new Scanner(System.in);
        int r1, r2, r3;
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        boolean setflag = false;
        for (int i = 0; i < 3; i++) {
            r1 = a % 10;
            for (int j = 0; j < 3; j++) {
                r2 = b % 10;
                if (r1 == r2) {
                    setflag = true;
                }
                b = b / 10;
            }
            if (setflag){
                for(int k = 0; k < 3; k++) {
                    r3 = c % 10;
                    if(r1 == r3){
                        System.out.println(r3);
                        System.exit(0);
                    }
                    c = c / 10;
                }
            }
            a=a/10;
        }
    }
}




---------------------------------------------------------------------------------------------------------------- 

class Main{
public static void main(String [] a){
String s1="kprit";
String s2="kprit";
String s3=new String("kprit");
String s4=new String("kprit");
if(s1==s2){
System.out.println("they are same");
}
if (s3==s4){
System.out.println("they are same");
}
}
}
---------------------------------------------------------------------------------------------------------------- 


class Main{
public static void main(String [] a){
String s1="kprit";
String s2="kprit";
String s3=new String("kprit");
String s4=new String("kprit");
if(s1.equals(s2)){
System.out.println("they are same");
}
if (s3==s4){
System.out.println("they are same");
}
}
}
---------------------------------------------------------------------------------------------------------------- 

class Main{
public static void main(String [] a){
String s1="kprit";
s1=s1.concat("college");
System.out.println(s1);

}
}

---------------------------------------------------------------------------------------------------------------- 
class Main{
public static void main(String [] a){
String s1="kprit";
System.out.println(s1.length());

}
}

---------------------------------------------------------------------------------------------------------------- 

class Main{
public static void main(String [] a){
String s1="kprit ";
String s2="KPRIT";
System.out.println(s1.length());
System.out.println(s1.charAt(2));
System.out.println(s1.concat(s2));
System.out.println(s1.equals(s2));
System.out.println(s1.equalsIgnoreCase(s2));
System.out.println(s2.toLowerCase());
System.out.println("C".compareTo("A"));
System.out.println(s1.trim());
System.out.println(s2.substring(0,3));
System.out.println(s1.replace('p','*'));
String s3="hello world";
System.out.println(s3.contains("wo"));
System.out.println(s3.startsWith("he"));
System.out.println(s3.endsWith("lg"));
System.out.println(s3.indexOf('o'));
System.out.println("".isEmpty());
String arr[]=s3.split(" ");
for (String i:arr)
System.out.println(i);
String s4=String.join("-","java","python","c");
System.out.println(s4);
String s5=String.valueOf(100);
System.out.print(s5);


}
}

----------------------------------------------------------------------------
//WAP to string to charArray & again reverse it .
import java.util.Scanner;
class Main{
public static void main(String[] a){
Scanner n=new Scanner(System.in);
String s=n.nextLine();
char arr[]=s.toCharArray();
for(char i:arr)
System.out.println(i);
String r=new String(arr);
System.out.println("\n"+r);
}
}
---------------------------------------------------------------------------------------------------------------- 


//WAP to print each charecter in the String using for each loop .

import java.util.Scanner;
class Main{
public static void main(String[] a){
Scanner n=new Scanner(System.in);
String s=n.nextLine();
for (int i=0;i<s.length();i++){
System.out.println(s.charAt(i));
}
}
}
----------------------------------------------------------------------------------- 
//WAP to print length of the String with out using length() method
import java.util.Scanner;
class Main{
public static void main(String[] a){
Scanner n=new Scanner(System.in);
String m=n.nextLine();
char arr[]=m.toCharArray();
int len=0;
for(char i:arr)
len++;
System.out.println(len);
}
}
--------------------------------------------------------------------------------- 


//WAP to check wether the given num is palindrom or not?


import java.util.Scanner;
class Main{
public static void main(String[] a){
Scanner n=new Scanner(System.in);
String m=n.nextLine();
String b="";
for (int i =m.length()-1;i>=0;i--)
{
 b=b+m.charAt(i);
}
if(m.equals(b)){

System.out.println("It is an palindrome String : "+b);
}
else 
{
System.out.println("it is  not a palindrome string");
}
}
}
-------------------------------------------------------------------------------- 
// WAP to count the number of consonents &vovewls in the String?

import java.util.Scanner;
class Main{
public static void main(String[] a){
Scanner n=new Scanner(System.in);
String m=n.nextLine();
int c=0;
int v=0;
char b[]=m.toCharArray();
for (char i:b){
if(Character.isLetter(i)){
if ("aeiou".indexOf(i)!=-1)
{
v++;
}
else{
c++;
}
}
}
System.out.println("vowels="+v);
System.out.println("Consonents="+c);
}
}

-------------------------------------------------------------------------------- 

//WAP to compare the two strings weather they are equal or not with out using "equals " and "compareTo"

import java.util.Scanner;
class Main{
public static void main(String[] as){
Scanner s=new Scanner(System.in);
String a=s.nextLine();
String b=s.nextLine();
boolean f=true;
if (a.length()!=b.length()){
System.out.println("they are  not same");
}
else{
char s1[]=a.toCharArray();
char s2[]=b.toCharArray();
for(int i =0;i<s1.length;i++){
if(s1[i]!=s2[i]){
f=false;
break;
}
}
if(f)
System.out.print("they are same");
else 
System.out.println("they are not same");
}
}
}

----------------------------------------------------------------------------
//WAP to remove the white space characters in the string?

import java.util.Scanner;
class Main{
public static void main(String[] ass)
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
a=a.replace(" ","");
System.out.println(a);
}
}

-------------------------------------------------------------
//WAP to remove numbers in the String?

import java.util.Scanner;
class Main{
public static void main(String[] ass)
{
Scanner s=new Scanner(System.in);
String a=s.nextLine();
a=a.replaceAll("\\d","");
System.out.println(a);
}
}


-------------------------------------------------------------

public class Main{
int a=10;
public static void main(String[] aa){
System.out.println(a);
}
static {
System.out.println(a);
}
}


-------------------------------------------------------------

class Main{
    public static void main(String[] args){
        int a[]={1,2,3,4};
        for(int i = 0;i<a.length/2;i++){
            int temp = a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+"  ");
        }
    }
}


 

class Main {

    public static void main(String[] args) {
        System.out.println("ho");
    }
}


counting num of digits in the range of num .do not count if a digit is encountered twice in the num?

import java.util.*;
class Main {
public static void main(String[] args) {
Scanner a = new Scanner(System.in);
int f = a.nextInt();
int r = a.nextInt();
int c = 0;
for (int i = f; i <=r; i++) {
int arr[] = new int[10];
int t = i;
while (t !=0) {
 int re = t% 10;
arr[re]++;
 if(arr[re]>1){
 break;
  }
 t=t/10;
 }
if(t==0){
c++;
}
}
System.out.println(c);
}
}


alice climbs 2 staris at a time ,he goes N houes in which he as climb up output should be no of houes he can climb up .
import java.util.*;
class Main{
public static void main(String[] ar){
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int arr[]=new int[n];
int c=0;
for(int i =0;i<n;i++){
arr[i]=sc.nextInt();
}
for(int i=0;i<n;i++){
if(arr[i]%3==0){
c++;
}
}
System.out.println(c);
}
}
---------------------------------------------------------------------------------------------------------------
Given n non negative integers representing an elevation map where the width of each bar is 1,compute how muvh water it can trap after raining .
1-
input height =[0,1,0,2,1,0,1,3,2,1,2,1]
output =6.
2-
input : height=[4,2,0,3,2,5]
output=9.



---------------------------------------------------------------------------------------------------------------

u r working on a financial analyzing tool which represents the daily stock price of company over a time .each element in an integer array A of size N
represents the closing price of the stock for a particular day.ur task is to find and return an integer value representing the total number of days where the stock price decreaed .indicating negative growth.
input 1-an Integer array A containing the closing price of the Stock.
input 2-an int value N representing the Size of the array.
output - 
return sn integer value representing the total number of days which the stock
price decreased ,indicating negative growth .
1-
input 1={3,5,6,-7,9,10,-12}
input 2=7


import java.util.*;
class Main{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int n=a.nextInt();
int arr[]=new int[n];
int c=0;
for(int i=0;i<n;i++){
arr[i]=a.nextInt();
}
for(int i : arr){
if(i<0){
c++;
}
}
System.out.println(c);
}
}
--------------------------------------------
replacing "0" with "1" in the given integer 
import java.util.*;
class Main{
public static void main(String[] args){
Scanner a=new Scanner(System.in);

long num=a.nextLong();
int t=1;
int c=0;
int i=0;
long res=0;
while(num!=0){
long rem=num%10;
if(rem==0){
rem=1;
}
res=(t*rem)+res;
t*=10;
num/=10;
}
System.out.println(res);
}
}

  -------------------------------------------
distributing choclates 

import java.util.*;
class Main{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
int n=a.nextInt();
int arr[]=new int[n];
for(int i =0;i<n;i++){
arr[i]=a.nextInt();
}
int c=arr.length;
if(arr[0]>arr[1]){
c++;
}
if(arr[arr.length-1]>arr[arr.length-2]){
c++;
}
for(int i=1;i<arr.length-1;i++){
if(arr[i]>arr[i+1] && arr [i]>arr[i-1]){
c+=2;
}
else if(arr[i]>arr[i-1]){
c++;
}
else if(arr[i]>arr[i+1]){
c++;
}
}
System.out.println(c);
}
}

--------------------------------------------------------------------------

import java.util.*;
class Main{
public static void main(String[]  args){
Scanner a=new Scanner(System.in);
int n=a.nextInt();
int arr[]=new int[n];
for(int i =0;i<arr.length;i++){
arr[i]=a.nextInt();
}
int ans=0;
for(int i =0;i<arr.length;i++){
ans=ans^arr[i];
}
System.out.println(ans);
}
}
-----------------------------------------

-------------------------------------
SINGLY LINKED LIST 
-------------------------------------

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
Node head;
Node temp;

 // Method to insert a new node at the beginning
public void insert(int data) {
Node newNode = new Node(data);
newNode.next = null; // Point new node to current head
if(head == null){
head=newNode;   
temp=newNode;  // Update head to be the new node
}
else{
temp.next=newNode;
temp=newNode;
}
}
public void insertionAtBeggining(int data){
Node newNode=new Node(data);
newNode.next=head;
head=newNode;
}


    // Method to print the list
    public void printList() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();

        // Adding elements
        list.insert(30);
        list.insert(20);
        list.insert(10);
list.insertionAtBeggining(40);

        // Printing the list: 10 -> 20 -> 30 -> null
        System.out.print("Linked List: ");
        list.printList();
    }
}
  
-------------------------------------------------------------------------------------------------------------------

-------------------------------------
DOUBLY LINKED LIST 
-------------------------------------


import java.util.*;

class Node {

    int data;
    Node next;
    Node prev;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoubelyLinkedList {

    Node head;
    Node temp;
    Node tail;
    // Method to insert a new node at the beginning

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = null; // Point new node to current head
        if (head == null) {
            head = newNode;
            temp = newNode;  // Update head to be the new node
            tail = newNode;
        } else {
            temp.next = newNode;
            newNode.prev = tail;
            temp = tail = newNode;
        }
    }

    public void insertionAtBeggining(int data) {
        Node newNode = new Node(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    public void insertMiddle(int data, int pos) {
        temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.prev = temp;
        newNode.next = temp.next;
        temp.next.prev = newNode;
        temp.next = newNode;
    }

    // Method to print the list
    public void printList() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        DoubelyLinkedList list = new DoubelyLinkedList();

        // Adding elements
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.insertionAtBeggining(40);
        list.insert(50);
        list.printList();
        int pos = a.nextInt();
        list.insertMiddle(60, pos);

        System.out.print("Double Linked List: ");
        list.printList();
    }
}

------------------------------------------------------------
REVERSE OF DOUBLE LINKED LIST 
------------------------------------------------------------

import java.util.*;
class Node {
    int data;
    Node next;
Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
this.prev=null;
    }
}

class DoubelyLinkedList {
Node head;
Node temp;
Node tail;
public void insert(int data) {
Node newNode = new Node(data);
if(head == null){
head=newNode;   
temp=newNode; 
tail=newNode;
}
else{
temp.next=newNode;
newNode.prev=tail;
temp=tail=newNode;
}
}
public void insertionAtBeggining(int data){
Node newNode=new Node(data);
head.prev=newNode;
newNode.next=head;
head=newNode;
}

    public void printList() {
        while (tail != null) {
            System.out.print(tail.data + " --> ");
            tail = tail.prev;
        }
        System.out.println("null");
    }
}

public class Main {
    public static void main(String[] args) {
Scanner a=new Scanner(System.in);
        DoubelyLinkedList list = new DoubelyLinkedList();

        list.insert(30);
        list.insert(20);
        list.insert(10);
list.insertionAtBeggining(40);
list.insert(50);

        System.out.print("Double Linked List: ");
        list.printList();
    }
}


 
 
-------------------------------------
CIRCULAR LINKED LIST 
-------------------------------------

import java.util.*;

class Node {

    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class CircularLinkedList {

    Node head;
    Node temp;
    Node tail;
    // Method to insert a new node at the beginning

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = null; // Point new node to current head
        if (head == null) {
            head = temp = tail = newNode;

        } else {
            temp.next = newNode;
            newNode.next = head;
            temp = tail = newNode;
        }
    }

    public void insertionAtBeggining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void insertMiddle(int data, int pos) {
        temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
        temp = tail;
    }

    // Method to print the list
    public void printList() {
        temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println(temp.data);

    }
}

public class Main {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        CircularLinkedList list = new CircularLinkedList();

        // Adding elements
        list.insert(30);
        list.insert(20);
        list.insert(10);
        list.insertionAtBeggining(40);
        list.insert(50);
        list.printList();
        list.insertMiddle(60, 4);
        list.insert(34);

        System.out.print("Circular Linked List: ");
        list.printList();
    }
}
 


-------------------------------------
CIRCULAR DOUBLE LINKED LIST 
-------------------------------------


class Node {

    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class Main {

    Node head, tail, left, temp, newNode;

    void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = temp = newNode;
        } else {
            temp.next = newNode;
            newNode.prev = temp;
            temp = tail = newNode;
            head.prev = temp;
            temp.next = head;

        }
    }

    void insertAtBeggining(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        newNode.prev = temp;
        temp.next = newNode;
        head = newNode;
    }

    void insertAtmiddle(int b, int pos) {
        Node newNode = new Node(b);
        temp = head;
        for (int i = 1; i <= pos; i++) {
            left = temp;
            temp = temp.next;
        }
        left.next = newNode;
        newNode.next = temp;
        temp.prev = newNode;
        newNode.prev = left;
    }

    void deleteAtbegging() {
        head = head.next;
        head.prev = tail;
        tail.next = head;
    }

    void deleteAtEnd() {
        tail = tail.prev;
        tail.next = head;
        head.prev = tail;
    }

    void deleteInMiddle(int pos) {
        for (int i = 1; i <= pos; i++) {
            temp = temp.next;
        }
        temp.prev.next = temp.next;
        temp.next.prev = temp.prev;
    }

    void Display() {
        temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        Main cll = new Main();
        cll.insert(22);
        cll.insert(33);
        cll.insertAtBeggining(44);
        cll.insert(32);
        cll.Display();
        System.out.println("");
        cll.insertAtBeggining(43);
        cll.insertAtmiddle(23, 4);
        cll.Display();
        System.out.println("");
        cll.deleteAtbegging();
        cll.Display();
        System.out.println("");
        cll.deleteAtEnd();
        cll.Display();
        System.out.println("");
        cll.deleteInMiddle(4);
        cll.Display();

    }
}

WAP to add the given num's and store them in the Linked list

 */
import java.util.*;

class Node {

    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {

    Node head;
    Node temp;

    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = null;
        if (head == null) {
            head = newNode;
            temp = newNode;
        } else {
            temp.next = newNode;
            temp = newNode;
        }
    }

    public void printList() {
        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

}

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SinglyLinkedList list = new SinglyLinkedList();
        int a = sc.nextInt();
        while (a > 0) {
            list.insert(a % 10);
            a /= 10;
        }
        System.out.print("Linked List: ");
        list.printList();
    }
}
