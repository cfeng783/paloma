/* Generated By:JavaCC: Do not edit this line. PalomaParserConstants.java */
package quanticol.ed.ac.uk.paloma.realparser;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface PalomaParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int INTEGER = 7;
  /** RegularExpression Id. */
  int FLOAT = 8;
  /** RegularExpression Id. */
  int FLOAT_SCIENTIFIC = 9;
  /** RegularExpression Id. */
  int EXPONENT = 10;
  /** RegularExpression Id. */
  int LETTER = 11;
  /** RegularExpression Id. */
  int DIGIT = 12;
  /** RegularExpression Id. */
  int SECTION_STATES = 13;
  /** RegularExpression Id. */
  int SECTION_PARAM = 14;
  /** RegularExpression Id. */
  int SECTION_AGENTS = 15;
  /** RegularExpression Id. */
  int KEYWORD_PARAM = 16;
  /** RegularExpression Id. */
  int KEYWORD_RNG = 17;
  /** RegularExpression Id. */
  int KEYWORD_WT = 18;
  /** RegularExpression Id. */
  int KEYWORD_PR = 19;
  /** RegularExpression Id. */
  int EOL = 20;
  /** RegularExpression Id. */
  int PLUS = 21;
  /** RegularExpression Id. */
  int DOT = 22;
  /** RegularExpression Id. */
  int SEMICOLON = 23;
  /** RegularExpression Id. */
  int DOLLAR = 24;
  /** RegularExpression Id. */
  int DEFINE = 25;
  /** RegularExpression Id. */
  int ASSIGN = 26;
  /** RegularExpression Id. */
  int LSQ = 27;
  /** RegularExpression Id. */
  int RSQ = 28;
  /** RegularExpression Id. */
  int LR = 29;
  /** RegularExpression Id. */
  int RR = 30;
  /** RegularExpression Id. */
  int QUO = 31;
  /** RegularExpression Id. */
  int SQUO = 32;
  /** RegularExpression Id. */
  int QUEST = 33;
  /** RegularExpression Id. */
  int EXCL = 34;
  /** RegularExpression Id. */
  int AT = 35;
  /** RegularExpression Id. */
  int LBRAC = 36;
  /** RegularExpression Id. */
  int RBRAC = 37;
  /** RegularExpression Id. */
  int COMMA = 38;
  /** RegularExpression Id. */
  int LANG = 39;
  /** RegularExpression Id. */
  int RANG = 40;
  /** RegularExpression Id. */
  int PARALLEL = 41;
  /** RegularExpression Id. */
  int INT = 42;
  /** RegularExpression Id. */
  int DOUBLE = 43;
  /** RegularExpression Id. */
  int IDENTIFIER = 44;
  /** RegularExpression Id. */
  int MATH_EXPR = 45;
  /** RegularExpression Id. */
  int SPACE = 46;
  /** RegularExpression Id. */
  int M_AND = 47;
  /** RegularExpression Id. */
  int M_OR = 48;
  /** RegularExpression Id. */
  int M_LINER = 49;
  /** RegularExpression Id. */
  int M_LINEN = 50;
  /** RegularExpression Id. */
  int MATH_PARAM = 51;
  /** RegularExpression Id. */
  int SYMBOL = 52;
  /** RegularExpression Id. */
  int PARAM_SYMBOL = 53;

  /** Lexical state. */
  int DEFAULT = 0;
  /** Lexical state. */
  int RESET = 1;
  /** Lexical state. */
  int ID = 2;
  /** Lexical state. */
  int MATH = 3;
  /** Lexical state. */
  int SIMPLE_MATH = 4;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "\" \"",
    "\"\\t\"",
    "\"\\n\"",
    "\"\\r\"",
    "<token of kind 5>",
    "<token of kind 6>",
    "<INTEGER>",
    "<FLOAT>",
    "<FLOAT_SCIENTIFIC>",
    "<EXPONENT>",
    "<LETTER>",
    "<DIGIT>",
    "\"#states\"",
    "\"#params\"",
    "\"#agents\"",
    "\"param\"",
    "\"IR\"",
    "\"Wt\"",
    "\"Pr\"",
    "\";\"",
    "\"+\"",
    "\".\"",
    "\":\"",
    "\"$\"",
    "\":=\"",
    "\"=\"",
    "\"[\"",
    "\"]\"",
    "\"(\"",
    "\")\"",
    "\"\\\"\"",
    "\"\\\'\"",
    "\"?\"",
    "\"!\"",
    "\"@\"",
    "\"{\"",
    "\"}\"",
    "\",\"",
    "\"<\"",
    "\">\"",
    "\"||\"",
    "<INT>",
    "<DOUBLE>",
    "<IDENTIFIER>",
    "<MATH_EXPR>",
    "<SPACE>",
    "\"&&\"",
    "\"|\"",
    "\"\\r\"",
    "\"\\n\"",
    "<MATH_PARAM>",
    "<SYMBOL>",
    "<PARAM_SYMBOL>",
  };

}