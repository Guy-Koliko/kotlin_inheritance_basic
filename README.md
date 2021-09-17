# Inheritance Basic and Abstract Class in Kotlin

* ### Question
  * What is an inheritance
  * ### Answer
  * Every home belongs to a FAMILY, so FAMILY becomes a concept in every Home (SUPERCLASS). 
    * An inheritance is the process whereby a generic property<br> is transfer from a parent to a child.<br> That is to say "You inherited your surname from your Dad."<br>Your Dad is now a parent, you are a child of your Dad, for <br> someone to be officially accepted as a child of your Dad<br> that person must legally inherent the surname of your Dad as well.
    * When you give birth, your child will also inherit your surname,<br> we know for sure that the surname is not originally yours but <br> but your child can inherit it from you. In this way you have become a parent to your child, and for that matter has the right to inherit what you have inherited from your Dad.
    * ### NOTE:
       * Although your Dad knows you, he has no idea of the <br> children you are going to give birth to. He has no idea if they <br> will be male or female. Your Dad is a male so the name given to him is a male name, yet you were able to inherit it as well as your children. <br> Since your Dad cannot determine the gender of his grandchildren,<br>he makes his name a general name.<br> General means the name can be inherited by all his grandchildren.<br> In kotlin and all OOP we say "your Dad's name is abstract".
       * To represent this whole idea in code, your, FAMILY becomes a class,<br> In every Family we have Dad and Mum, since Family is a generic term, and we can't also determine the names of every Mum and Dad, we make them abstract(general) so that the respective families will determine their names.<br> Dad and Mum now becomes method of the FAMILY class.
    
    * KEYNOTE:
      * Don't assign value to methods and values of an abstract superclass in Kotlin.
      * Assign values to subclasses that inherit from the superclass, whatever you input in the subclass becomes the behavior of only that class.

### Example code.
* Dwelling
  * SquareCabin
  * RoundHut 
    * RoundTower

In the example code we have Dwelling as the Superclass, SquareCabin & RoundHut are children of Dwelling and RoundTower is a child to RoundHut