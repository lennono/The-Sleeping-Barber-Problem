# The-Sleeping-Barber-Problem
A barber shop has two doors, an entrance and an exit.
Inside, barbers spend all their lives serving customers, one at a time.
When there are none in the shop, the barbers sleep in their chair.

If a customer arrives and find the barbers asleep: 
- he awakens a barber 
- and procceds to sit in the barber's chair and sleeps while hair is being cut. 

If a customer arrives and the barber is busy cutting hair, 
- the customer goes to sleep in the waiting room. 

When the barber finishes cutting a customer’s hair 
- he awakens the customer and holds the exit door open for him. 

If there are waiting customers, 
- he awakens one and waits for the customer to sit in the barber’s chair, 
- otherwise he sleeps.



![alt text](http://1.bp.blogspot.com/-11LLqwNuV6o/UhjhcUEvIDI/AAAAAAAAAEM/n-xjhP_Rr1w/s200/2-35.png)




## Specs on this implementation:
- A waiting room with 15 seats 
- 3 babers
- Endless stream of customers, arriving 1 at a time after one another 

Threads are used in a FIFO manner.


