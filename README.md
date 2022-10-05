# ChargeAccount.java
An old Java project for my Fundamentals of Programming I class in Spring 2020

This old project is called ChargeAccount.java
It was completed on April 5, 2020 as a homework assignment

In this project, the project is meant to prepare a monthly charge account statement of a credit card.

The requirements comes from the assignment as follows:

Write a program to prepare the monthly charge account statement for a customer of CS CARD International, a credit card 
company. The program should take as input the previous balance on the account and the total amount of additional charges 
during the month. The program should then compute the interest for the month, the total new balance (the previous balance 
plus additional charges plus interest), and the minimum payment due. Assume the interest is 0 if the previous balance was 0 
but if the previous balance was greater than 0 the interest is 2% of the total owed (previous balance plus additional charges). 

Assume the minimum payment is as follows: 
new balance         for a new balance less than $50 
$50.00            for a new balance between $50 and $300 (inclusive) 
20% of the new balance   for a new balance over $300 

So if the new balance is $38.00 then the person must pay the whole $38.00; if the balance is $128 then the person must pay 
$50; if the balance is $350 the minimum payment is $70 (20% of 350). The program should print the charge account 
statement in the format below. Print the actual dollar amounts in each place using currency format from the NumberFormat 
class—see Listing 3.4 of the text for an example that uses this class. 

CS CARD International Statement 
=============================== 
Previous Balance: $ 
Additional Charges: $ 
Interest: $ 
New Balance: $ 
Minimum Payment: $ 


