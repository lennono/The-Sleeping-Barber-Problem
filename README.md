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

![alt text](https://www.google.ie/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&cad=rja&uact=8&ved=2ahUKEwj-saiZ1_zbAhVCecAKHWxUBm8QjRx6BAgBEAU&url=http%3A%2F%2Feit77.blogspot.com%2F2013%2F08%2Fproducer-consumer-and-sleeping-barbe.html&psig=AOvVaw2YtxOBCdLIAbQUOCAy63Ty&ust=1530492549240163)


A sleeping barber implementation done in java, making use of Semaphores.

Specs on this implementation:
- A waiting room with 15 seats 
- 3 babers
- Endless stream of customers, arriving 1 at a time after one another 

Threads are used in a FIFO manner.


