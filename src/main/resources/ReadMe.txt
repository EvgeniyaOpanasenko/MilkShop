Current project is a sort of shop, which can be easily used both for goods and services purpose.
The main idea is to get flexible structure.
Kind of a practice to use as much design patterns as possible

Used technologies :
    backend:
        spring:
         boot,
         data,
         security

    design patterns:
         strategy => to achieve architecture for both goods and services purpose.
                     Only need to extend proper interface

         observer => to notify admin about new order. Send mail and sms
                  => TODO notify user about order detais

         decorator => to perform basket details with no concrete class created
                      Create abstract Item and exten it by Basket and BasketDecorators
                      which are going to cover Basket and autosum total price while executing Application
                      less inheritance more weak dependencies

