# Parser

## ParserTree
![](https://github.com/YINNNER/ComplieLab/blob/master/Calculator/CalculatorParserTree.png)

## Rules
* EXP —> TERM + EXP | TERM - EXP | TERM
* TERM —> FACTOR * TERM | factor/TERM | FACTOR
* FACTOR—> DIGIT ｜(EXP)
* DIGIT -> (0|1|2|3|4|5|6|7|8|9)
