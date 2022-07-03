#Jets Project

## Description

A user will be prompted with a menu printed to the console with options depending on integer input 0-8 read by a scanner. The user will be able to access an ArrayList of five predetermined Jet objects by typing "0" into the console, while "1" will print the fly method found in all classes extending the abstract Jet class, "2" will print off the stats of the Jet with the highest speed field, "3" will do the same as "2" but for the range field, "4" will initiate and print the loadUp method and stats found in all Cargo Jet subclasses implementing the Loading Interface , "5" will do the same for the Engaging Interface implemented by all Fighter Jet subclasses, "6" will allow the user to add a Jet object with new fields and newly defined type to the ArrayList displayed in "0" option, "7" will allow the user to delete a Jet from said ArrayList, and "8" will allow the user to quit the application, printing "Goodbye" into the console.

## Tech Used

An initial abstract class, Jet, with fields, getters/setters, the object, "Jet," and , the method fly(). Interfaces Loading and Engaging were created each with a void. Subclasses Passenger, Fighter, and Cargo were created and extended the Jet class; also, Fighter and Cargo implemented the interfaces Engaging and Loading, respectively. An Airfield class was created containing a try/catch block utilizing a buffered reader and line split to parse a text file to an ArrayList. Virtually every method for the app menu options contains either a for or for each loop and rely heavily of List methods.

## Lessons Learned# JetsProject

The two biggest lessons I learned in this project were how much I can simplify my thinking and do away with a lot of word-problem type mathematical formulas and just used List methods for a desired output. I am no where near beginning to be proficient in this, and I can see now how badly this is hindering me.
The second lesson I learned was from constantly tripping up on little things: especially calling a method inside of a sysout that was already printing something. I would get stuck trying to reword the sysout for about 15-20 min each time before the TA would point out the error. I won't be making that mistake again. 