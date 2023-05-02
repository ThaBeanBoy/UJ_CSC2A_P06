# UJ CSC2A Practical 4

## Table of Content

## Additional information

This has some similarities with the last practical, but this time, we only dealing with Planets & SpaceShips. 
I think this practical had 2 main objectives:
- Use the Visitor Design Pattern.
- Work with the canvas & Graphics Context.

This time around, our lecturer is Mr. D Ogwok.

## UML

Admittedly, I didn't spend alot of time working on the UML, I enjoyed the long holiday too much lol :). But enough jokes,
I actually struggles with the inheritance, This time we were inheriting from classes in the javafx library. I just improvised
& thought of a quick solution on the spot, I am not sure if this is the correct way to design the UML

![UML](./docs/UML.png)

## Visitor Design Pattern & Interfaces

**NB: I am still a student, I still have a limited understanding of design patterns, so my explanation could be bad.**

This is how I view the visitor design pattern. There are 2 types of objects, the:
- Visitor
- Visitable

The visitable has a method that accepts the Visitor. It's the Visitor's job to properly identify who it is visiting, & 
perform the appropriate actions based on who it is visiting. 

I'm still having a hard time wrapping my mind around it all. On one hand, I thought a abstract base class could have a 
`draw` method, but the 

### Application of Visitor Design Pattern

### Interfaces