// David Smith
// Code from "http://www.tutorialspoint.com/javaexamples/data_intopost.htm" was used as a reference

import java.util.Scanner;

public class InfixToPostfix {
	
   private Stack stack; //creates a stack
   private String input; //string that will hold input from the user
   private String output = ""; //string that will hold the converted function, but is empty for now
   
   public InfixToPostfix(String in) { //constructor for the InfixToPostFix class
	   
      input = in; //sets input to the string taken when the constructor is called
      int stackSize = input.length(); //sets the stackSize var to the length of the inputed string
      stack = new Stack(stackSize); //creates a stack the size of the inputed string
   }
   
   public String convert() { //method that sorts the char of a string from infix to postfix notation
     
	   for (int j = 0; j < input.length(); j++) { //will run through the for loop for each char in the input
		   
         Character ch = input.charAt(j); //holds a char (from the input string) that is being evaluated in the current iteration of the for loop
         
         if (ch.equals('+')||ch.equals('-')) //if the char = + or -, then the 'hasOperator' runs
        	 hasOperator(ch, 1);
         
         else if (ch.equals('*')||ch.equals('/')) //if the char = * or /, then the 'hasOperator' runs
        	 hasOperator(ch, 2);

         else if (ch.equals('(')) //if the char = (, then the stack is pushed
        	 stack.push(ch);

         else if (ch.equals(')')) //if the char = ), then the 'hasCloeParenthesis' method runs
        	 hasCloseParenthesis(ch);
  
         else //if the char is not an operator or a parenthesis, then it adds it to the output
        	 output = output + ch;  
      }
      
      while (!stack.isEmpty()) { //makes sure the stack is not empty
         output = output + stack.pop(); //adds the next char to the output
      }
     
      return output; //returns the string in postfix notation
   }
   
   public void hasOperator(char ch, int type1) {
      
	   while (!stack.isEmpty()) { //makes sure the stack is not empty
         char top = stack.pop(); //takes in the top element from the stack
         
         if (top == '(') { //if the top is = (
            stack.push(top); //the stack is pushed and the loop is broken
            break;
         }
         
         else {
            int type2; //test to see which type of operator is at the top (+ and - = 1, * and / = 2)
            if (top == '+' || top == '-')//if + or - then type2 = 1
            	type2 = 1;
            
            else //if * or / then type2 = 2
            	type2 = 2;
           
            if (type2 < type1) { //if ch is * or / and the top is + or -
               stack.push(top); //the stack is pushed and the loop is broken
               break;
            }
		    
            else //if the top and ch are the same type, or the top is * or / and ch is + or -
            output = output + top; //the top is added to the output
         }
      }
	   
      stack.push(ch); //the stack is then pushed
   }
   
   public void hasCloseParenthesis(char ch){ 
      
	   while (!stack.isEmpty()) { //makes sure the stack is not empty
         
		 Character top = stack.pop(); //takes the top element from the stack
         
		 if (top.equals('(')) //if the top is = (
        	 break; //the loop is broken and nothing happens
         
         else //if the top is not = (
        	 output = output + top; //the top is added to the output
      }
   }

  class Stack { //class that will create a stack using an array
      
	  private int maxSize; //will hold the maximum size for the stack
      private char[] stack; //array that will hold the elements of the stack
      private int top; //will keep track of the top element in the stack
      
      public Stack(int max) { //constructor for the stack that takes in what the max size will be
         maxSize = max; //sets the max size
         stack = new char[maxSize]; //sets the size of the array to the max size
         top = -1; //sets the top element
      }
      
      public void push(char j) { //method that will push the stack
         stack[++top] = j;
      }
      
      public char pop() { //method that will 'pop' the top element off and return it
         return stack[top--];
      }
      
      public char peek() { //method that will 'peek' and say what the top element is, but not remove it
         return stack[top];
      }
      
      public boolean isEmpty() { //will tell if the stack is empty or not
         return (top == -1);
     }
      
   }

   public static void main(String[] args){
	   
      Scanner scan = new Scanner(System.in); //scanner that takes in user input
      System.out.println("Enter 4 functions in infix notation: "); //asks for 4 functions in infix
	  String input1 = scan.next(); //gets the 4 functions from the user
	  String input2 = scan.next();
	  String input3 = scan.next();
	  String input4 = scan.next();
	  
      String output1, output2, output3, output4; //strings to hold output from the infix to postfix conversion 
      
      InfixToPostfix trans1 = new InfixToPostfix(input1); //takes input from user, converts it to post fix, and sets results to outputs
      output1 = trans1.convert();
      InfixToPostfix trans2 = new InfixToPostfix(input2);
      output2 = trans2.convert(); 
      InfixToPostfix trans3 = new InfixToPostfix(input3);
      output3 = trans3.convert(); 
      InfixToPostfix trans4 = new InfixToPostfix(input4);
      output4 = trans4.convert(); 
      
      System.out.println("Postfix notation for the 1st function is: " + output1 + '\n'); //prints results
      System.out.println("Postfix notation for the 2nd function is: " + output2 + '\n');
      System.out.println("Postfix notation for the 3rd function is: " + output3 + '\n');
      System.out.println("Postfix notation for the 4th function is: " + output4 + '\n');
      
   }
}