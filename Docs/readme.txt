9/11/2026
James Keck

How to run
1. cd into src using the command "cd src"
2. cd into main using the command "cd main"
3. cd into java using the command "cd java"
4. compile the code using the command "javac Main.java"
5. run the program using the command "java Main"
6. You will be given a section of the sonnet and then a blank.
type the word you think goes in the blank. Remember, punctuation
and capitalization matters. Take it into account in your answer.
7. The program will keep giving you new prompts until you either
get three correct or three incorrect.

Description
This program selects a random word from a sonnet and then prints,
the sonnet up to that word, replacing the word with a blank.
The program then prompts the user to fill in the blank with the
correct next word and reports if you got the word correct or not.
Capitalization and punctuation matter for the answers.
This process repeats until you have got either 3 prompts correct or
three prompts incorrect. The program then prints the results of
your answers.
The sonnet is written as following:

Shall I compare thee to a summer’s day?
Thou art more lovely and more temperate:
Rough winds do shake the darling buds of May,
And summer’s lease hath all too short a date;
Sometime too hot the eye of heaven shines,
And often is his gold complexion dimm’d;
And every fair from fair sometime declines,
By chance or nature’s changing course untrimm'd;
But thy eternal summer shall not fade,
Nor lose possession of that fair thou ow’st;
Nor shall death brag thou wander’st in his shade,
When in eternal lines to time thou grow’st:
   So long as men can breathe or eyes can see,
   So long lives this, and this gives life to thee.


pseudocode
let sonnet be a string containing the sonnet
let sonnetSplit be an array of strings with the words of the sonnet split into each index
let lines be an array of strings with the lines of the sonnet split into each index
let correct be an int that is 0
let incorrect be an in that is 0

while correct is less than 3 and incorrect is less than 3
    let randomIndex be an int that is a random number between 0 and the length of sonnetSplit
    let wordCount be an int that is 0
    let foundBlank be a boolean that is false
    for every line in lines
        let words be an array of strings with each word in this line split into each index
        for every word in words
            if wordCount is equal to randomIndex
             print 5 underscores
            foundBlank is true
            stop the current loop

            print word and a space
            wordCount is wordCount + 1
        print an empty line
        if foundBlank is true
            stop the current loop
    print Please fill in the blank with the next word.
    let guess be a string with the users next input

    if guess is equal to sonnetSplit at randomIndex
        print Correct!
        correct is correct + 1
    otherwise
        print Incorrect! The correct answer was [the correct answer]
        incorrect is incorrect + 1
    print a blank line
if correct is greater than 2
    print You got three correct! Good Job!
otherwise
    print You got three incorrect. Please try again.
