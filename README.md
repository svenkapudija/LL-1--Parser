LL(1) Parser
============

Solution for the third lab at "Introduction to Theoretical Computer Science" course - LL(1) parser for grammar

    S -> aAB | bBA
    A -> bC | a
    B -> ccSbc | ϵ
    C -> AA

Example 1
------

Input

    aa

Output

    SAB
    YES
    
Example 2
------

Input

    bccaabcbaa

Output

    SBSABACAA
    YES
    
Example 3
------

Input

    bbaab

Output

    SBACAA
    NO
    
Output format is simply all the processed symbols and `YES/NO` which indicates if the input sequence is in the language
or not.
If input sequence is not a part of the language, program immidatelly returns (as soon as it recognize)
with `NO` as the last line.

    
Bad practice alert
------
All classes are in the same (default) package because assignment told so (probably because of tests they would run afterwards to test the solution).
