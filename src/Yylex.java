/* The following code was generated by JFlex 1.7.0 */

import java_cup.runtime.*;
import java.io.*;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>ALexico.jflex</tt>
 */
class Yylex implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\62\1\64\1\35\1\36\1\36\1\35\16\62\4\0\1\55\1\15"+
    "\1\40\1\0\1\61\1\26\1\10\1\34\1\30\1\31\1\24\1\22"+
    "\1\52\1\23\1\60\1\25\12\56\1\51\1\27\1\14\1\13\1\12"+
    "\2\0\32\54\1\47\1\0\1\50\1\0\1\61\1\0\1\21\1\46"+
    "\1\45\1\43\1\5\1\6\1\54\1\2\1\3\2\54\1\4\1\54"+
    "\1\44\1\42\1\53\1\54\1\17\1\7\1\16\1\20\1\41\1\1"+
    "\3\54\1\32\1\11\1\33\1\0\6\62\1\37\32\62\2\0\4\61"+
    "\4\0\1\61\2\0\1\62\7\0\1\61\4\0\1\61\5\0\27\61"+
    "\1\0\37\61\1\0\u01ca\61\4\0\14\61\16\0\5\61\7\0\1\61"+
    "\1\0\1\61\21\0\160\62\5\61\1\0\2\61\2\0\4\61\10\0"+
    "\1\61\1\0\3\61\1\0\1\61\1\0\24\61\1\0\123\61\1\0"+
    "\213\61\1\0\5\62\2\0\236\61\11\0\46\61\2\0\1\61\7\0"+
    "\47\61\7\0\1\61\1\0\55\62\1\0\1\62\1\0\2\62\1\0"+
    "\2\62\1\0\1\62\10\0\33\61\5\0\3\61\15\0\5\62\6\0"+
    "\1\61\4\0\13\62\5\0\53\61\25\62\12\63\4\0\2\61\1\62"+
    "\143\61\1\0\1\61\10\62\1\0\6\62\2\61\2\62\1\0\4\62"+
    "\2\61\12\63\3\61\2\0\1\61\17\0\1\62\1\61\1\62\36\61"+
    "\33\62\2\0\131\61\13\62\1\61\16\0\12\63\41\61\11\62\2\61"+
    "\4\0\1\61\5\0\26\61\4\62\1\61\11\62\1\61\3\62\1\61"+
    "\5\62\22\0\31\61\3\62\104\0\1\61\1\0\13\61\67\0\33\62"+
    "\1\0\4\62\66\61\3\62\1\61\22\62\1\61\7\62\12\61\2\62"+
    "\2\0\12\63\1\0\7\61\1\0\7\61\1\0\3\62\1\0\10\61"+
    "\2\0\2\61\2\0\26\61\1\0\7\61\1\0\1\61\3\0\4\61"+
    "\2\0\1\62\1\61\7\62\2\0\2\62\2\0\3\62\1\61\10\0"+
    "\1\62\4\0\2\61\1\0\3\61\2\62\2\0\12\63\4\61\7\0"+
    "\1\61\5\0\3\62\1\0\6\61\4\0\2\61\2\0\26\61\1\0"+
    "\7\61\1\0\2\61\1\0\2\61\1\0\2\61\2\0\1\62\1\0"+
    "\5\62\4\0\2\62\2\0\3\62\3\0\1\62\7\0\4\61\1\0"+
    "\1\61\7\0\12\63\2\62\3\61\1\62\13\0\3\62\1\0\11\61"+
    "\1\0\3\61\1\0\26\61\1\0\7\61\1\0\2\61\1\0\5\61"+
    "\2\0\1\62\1\61\10\62\1\0\3\62\1\0\3\62\2\0\1\61"+
    "\17\0\2\61\2\62\2\0\12\63\1\0\1\61\17\0\3\62\1\0"+
    "\10\61\2\0\2\61\2\0\26\61\1\0\7\61\1\0\2\61\1\0"+
    "\5\61\2\0\1\62\1\61\7\62\2\0\2\62\2\0\3\62\10\0"+
    "\2\62\4\0\2\61\1\0\3\61\2\62\2\0\12\63\1\0\1\61"+
    "\20\0\1\62\1\61\1\0\6\61\3\0\3\61\1\0\4\61\3\0"+
    "\2\61\1\0\1\61\1\0\2\61\3\0\2\61\3\0\3\61\3\0"+
    "\14\61\4\0\5\62\3\0\3\62\1\0\4\62\2\0\1\61\6\0"+
    "\1\62\16\0\12\63\11\0\1\61\7\0\3\62\1\0\10\61\1\0"+
    "\3\61\1\0\27\61\1\0\12\61\1\0\5\61\3\0\1\61\7\62"+
    "\1\0\3\62\1\0\4\62\7\0\2\62\1\0\2\61\6\0\2\61"+
    "\2\62\2\0\12\63\22\0\2\62\1\0\10\61\1\0\3\61\1\0"+
    "\27\61\1\0\12\61\1\0\5\61\2\0\1\62\1\61\7\62\1\0"+
    "\3\62\1\0\4\62\7\0\2\62\7\0\1\61\1\0\2\61\2\62"+
    "\2\0\12\63\1\0\2\61\17\0\2\62\1\0\10\61\1\0\3\61"+
    "\1\0\51\61\2\0\1\61\7\62\1\0\3\62\1\0\4\62\1\61"+
    "\10\0\1\62\10\0\2\61\2\62\2\0\12\63\12\0\6\61\2\0"+
    "\2\62\1\0\22\61\3\0\30\61\1\0\11\61\1\0\1\61\2\0"+
    "\7\61\3\0\1\62\4\0\6\62\1\0\1\62\1\0\10\62\6\0"+
    "\12\57\2\0\2\62\15\0\60\61\1\62\2\61\7\62\4\0\10\61"+
    "\10\62\1\0\12\63\47\0\2\61\1\0\1\61\2\0\2\61\1\0"+
    "\1\61\2\0\1\61\6\0\4\61\1\0\7\61\1\0\3\61\1\0"+
    "\1\61\1\0\1\61\2\0\2\61\1\0\4\61\1\62\2\61\6\62"+
    "\1\0\2\62\1\61\2\0\5\61\1\0\1\61\1\0\6\62\2\0"+
    "\12\63\2\0\4\61\40\0\1\61\27\0\2\62\6\0\12\63\13\0"+
    "\1\62\1\0\1\62\1\0\1\62\4\0\2\62\10\61\1\0\44\61"+
    "\4\0\24\62\1\0\2\62\5\61\13\62\1\0\44\62\11\0\1\62"+
    "\71\0\53\61\24\62\1\61\12\63\6\0\6\61\4\62\4\61\3\62"+
    "\1\61\3\62\2\61\7\62\3\61\4\62\15\61\14\62\1\61\1\62"+
    "\12\63\4\62\2\0\46\61\1\0\1\61\5\0\1\61\2\0\53\61"+
    "\1\0\u014d\61\1\0\4\61\2\0\7\61\1\0\1\61\1\0\4\61"+
    "\2\0\51\61\1\0\4\61\2\0\41\61\1\0\4\61\2\0\7\61"+
    "\1\0\1\61\1\0\4\61\2\0\17\61\1\0\71\61\1\0\4\61"+
    "\2\0\103\61\2\0\3\62\40\0\20\61\20\0\125\61\14\0\u026c\61"+
    "\2\0\21\61\1\0\32\61\5\0\113\61\3\0\3\61\17\0\15\61"+
    "\1\0\4\61\3\62\13\0\22\61\3\62\13\0\22\61\2\62\14\0"+
    "\15\61\1\0\3\61\1\0\2\62\14\0\64\61\40\62\3\0\1\61"+
    "\3\0\2\61\1\62\2\0\12\63\41\0\3\62\2\0\12\63\6\0"+
    "\130\61\10\0\51\61\1\62\1\61\5\0\106\61\12\0\35\61\3\0"+
    "\14\62\4\0\14\62\12\0\12\63\36\61\2\0\5\61\13\0\54\61"+
    "\4\0\21\62\7\61\2\62\6\0\12\63\46\0\27\61\5\62\4\0"+
    "\65\61\12\62\1\0\35\62\2\0\1\62\12\63\6\0\12\63\15\0"+
    "\1\61\130\0\5\62\57\61\21\62\7\61\4\0\12\63\21\0\11\62"+
    "\14\0\3\62\36\61\15\62\2\61\12\63\54\61\16\62\14\0\44\61"+
    "\24\62\10\0\12\63\3\0\3\61\12\63\44\61\122\0\3\62\1\0"+
    "\25\62\4\61\1\62\4\61\3\62\2\61\11\0\300\61\47\62\25\0"+
    "\4\62\u0116\61\2\0\6\61\2\0\46\61\2\0\6\61\2\0\10\61"+
    "\1\0\1\61\1\0\1\61\1\0\1\61\1\0\37\61\2\0\65\61"+
    "\1\0\7\61\1\0\1\61\3\0\3\61\1\0\7\61\3\0\4\61"+
    "\2\0\6\61\4\0\15\61\5\0\3\61\1\0\7\61\16\0\5\62"+
    "\30\0\1\36\1\36\5\62\20\0\2\61\23\0\1\61\13\0\5\62"+
    "\5\0\6\62\1\0\1\61\15\0\1\61\20\0\15\61\3\0\33\61"+
    "\25\0\15\62\4\0\1\62\3\0\14\62\21\0\1\61\4\0\1\61"+
    "\2\0\12\61\1\0\1\61\3\0\5\61\6\0\1\61\1\0\1\61"+
    "\1\0\1\61\1\0\4\61\1\0\13\61\2\0\4\61\5\0\5\61"+
    "\4\0\1\61\21\0\51\61\u0a77\0\57\61\1\0\57\61\1\0\205\61"+
    "\6\0\4\61\3\62\2\61\14\0\46\61\1\0\1\61\5\0\1\61"+
    "\2\0\70\61\7\0\1\61\17\0\1\62\27\61\11\0\7\61\1\0"+
    "\7\61\1\0\7\61\1\0\7\61\1\0\7\61\1\0\7\61\1\0"+
    "\7\61\1\0\7\61\1\0\40\62\57\0\1\61\u01d5\0\3\61\31\0"+
    "\11\61\6\62\1\0\5\61\2\0\5\61\4\0\126\61\2\0\2\62"+
    "\2\0\3\61\1\0\132\61\1\0\4\61\5\0\51\61\3\0\136\61"+
    "\21\0\33\61\65\0\20\61\u0200\0\u19b6\61\112\0\u51cd\61\63\0\u048d\61"+
    "\103\0\56\61\2\0\u010d\61\3\0\20\61\12\63\2\61\24\0\57\61"+
    "\1\62\4\0\12\62\1\0\31\61\7\0\1\62\120\61\2\62\45\0"+
    "\11\61\2\0\147\61\2\0\4\61\1\0\4\61\14\0\13\61\115\0"+
    "\12\61\1\62\3\61\1\62\4\61\1\62\27\61\5\62\20\0\1\61"+
    "\7\0\64\61\14\0\2\62\62\61\21\62\13\0\12\63\6\0\22\62"+
    "\6\61\3\0\1\61\4\0\12\63\34\61\10\62\2\0\27\61\15\62"+
    "\14\0\35\61\3\0\4\62\57\61\16\62\16\0\1\61\12\63\26\0"+
    "\12\57\6\0\51\61\16\62\11\0\3\61\1\62\10\61\2\62\2\0"+
    "\12\63\6\0\27\61\3\0\1\61\1\62\4\0\60\61\1\62\1\61"+
    "\3\62\2\61\2\62\5\61\2\62\1\61\1\62\1\61\30\0\3\61"+
    "\2\0\13\61\5\62\2\0\3\61\2\62\12\0\6\61\2\0\6\61"+
    "\2\0\6\61\11\0\7\61\1\0\7\61\221\0\43\61\10\62\1\0"+
    "\2\62\2\0\12\63\6\0\u2ba4\61\14\0\27\61\4\0\61\61\u2104\0"+
    "\u016e\61\2\0\152\61\46\0\7\61\14\0\5\61\5\0\1\61\1\62"+
    "\12\61\1\0\15\61\1\0\5\61\1\0\1\61\1\0\2\61\1\0"+
    "\2\61\1\0\154\61\41\0\u016b\61\22\0\100\61\2\0\66\61\50\0"+
    "\15\61\3\0\20\62\20\0\7\62\14\0\2\61\30\0\3\61\31\0"+
    "\1\61\6\0\5\61\1\0\207\61\2\0\1\62\4\0\1\61\13\0"+
    "\12\63\7\0\32\61\4\0\1\61\1\0\32\61\13\0\131\61\3\0"+
    "\6\61\2\0\6\61\2\0\6\61\2\0\3\61\3\0\2\61\3\0"+
    "\2\61\22\0\3\62\4\0\14\61\1\0\32\61\1\0\23\61\1\0"+
    "\2\61\1\0\17\61\2\0\16\61\42\0\173\61\105\0\65\61\210\0"+
    "\1\62\202\0\35\61\3\0\61\61\57\0\37\61\21\0\33\61\65\0"+
    "\36\61\2\0\44\61\4\0\10\61\1\0\5\61\52\0\236\61\2\0"+
    "\12\63\u0356\0\6\61\2\0\1\61\1\0\54\61\1\0\2\61\3\0"+
    "\1\61\2\0\27\61\252\0\26\61\12\0\32\61\106\0\70\61\6\0"+
    "\2\61\100\0\1\61\3\62\1\0\2\62\5\0\4\62\4\61\1\0"+
    "\3\61\1\0\33\61\4\0\3\62\4\0\1\62\40\0\35\61\203\0"+
    "\66\61\12\0\26\61\12\0\23\61\215\0\111\61\u03b7\0\3\62\65\61"+
    "\17\62\37\0\12\63\20\0\3\62\55\61\13\62\2\0\1\62\22\0"+
    "\31\61\7\0\12\63\6\0\3\62\44\61\16\62\1\0\12\63\100\0"+
    "\3\62\60\61\16\62\4\61\13\0\12\63\u0116\0\12\57\u0156\0\12\57"+
    "\166\0\12\57\u0176\0\12\57\46\0\53\61\15\62\10\0\12\63\146\0"+
    "\12\57\u01a6\0\12\57\u0366\0\12\57\u03a6\0\u036f\61\221\0\143\61\u0b9d\0"+
    "\u042f\61\u33d1\0\u0239\61\47\0\12\57\346\0\12\57\u03a6\0\105\61\13\0"+
    "\1\61\56\62\20\0\4\62\15\61\u4060\0\2\61\u2163\0\5\62\3\0"+
    "\26\62\2\0\7\62\36\0\4\62\224\0\3\62\u01bb\0\125\61\1\0"+
    "\107\61\1\0\2\61\2\0\1\61\2\0\2\61\2\0\4\61\1\0"+
    "\14\61\1\0\1\61\1\0\7\61\1\0\101\61\1\0\4\61\2\0"+
    "\10\61\1\0\7\61\1\0\34\61\1\0\4\61\1\0\5\61\1\0"+
    "\1\61\3\0\7\61\1\0\u0154\61\2\0\31\61\1\0\31\61\1\0"+
    "\37\61\1\0\31\61\1\0\37\61\1\0\31\61\1\0\37\61\1\0"+
    "\31\61\1\0\37\61\1\0\31\61\1\0\10\61\2\0\62\63\u1150\0"+
    "\12\57\u04a6\0\4\61\1\0\33\61\1\0\2\61\1\0\1\61\2\0"+
    "\1\61\1\0\12\61\1\0\4\61\1\0\1\61\1\0\1\61\6\0"+
    "\1\61\4\0\1\61\1\0\1\61\1\0\1\61\1\0\3\61\1\0"+
    "\2\61\1\0\1\61\2\0\1\61\1\0\1\61\1\0\1\61\1\0"+
    "\1\61\1\0\1\61\1\0\2\61\1\0\1\61\2\0\4\61\1\0"+
    "\7\61\1\0\4\61\1\0\4\61\1\0\1\61\1\0\12\61\1\0"+
    "\21\61\5\0\3\61\1\0\5\61\1\0\21\61\u1144\0\ua6d7\61\51\0"+
    "\u1035\61\13\0\336\61\u3fe2\0\u021e\61\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u05ee\0"+
    "\1\62\36\0\140\62\200\0\360\62\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\5\2\2\1\1\3\1\4\1\5\1\1"+
    "\2\2\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\17\1\1\1\20\1\1\3\2\1\21"+
    "\1\22\1\23\1\24\1\2\1\25\1\2\1\26\3\2"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\2\2\1\35"+
    "\2\0\1\36\4\2\1\0\1\2\1\37\5\2\1\40"+
    "\4\2\1\41\1\2\1\42\1\2\1\43\1\2\1\44"+
    "\1\45\1\46\1\47\1\50\1\2\1\51\1\52\1\2"+
    "\1\53\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[88];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\65\0\152\0\237\0\324\0\u0109\0\u013e\0\u0173"+
    "\0\u01a8\0\u01dd\0\u0212\0\u0247\0\u027c\0\u02b1\0\u02e6\0\65"+
    "\0\65\0\65\0\u031b\0\65\0\65\0\65\0\65\0\65"+
    "\0\65\0\u0350\0\u0385\0\u03ba\0\u03ef\0\u0424\0\u0459\0\65"+
    "\0\65\0\65\0\65\0\u048e\0\u04c3\0\u04f8\0\237\0\u052d"+
    "\0\u0562\0\u0597\0\65\0\65\0\65\0\65\0\65\0\65"+
    "\0\u05cc\0\u0601\0\u0636\0\u066b\0\u03ba\0\u03ba\0\u06a0\0\u06d5"+
    "\0\u070a\0\u073f\0\u0774\0\u07a9\0\237\0\u07de\0\u0813\0\u0848"+
    "\0\u087d\0\u08b2\0\65\0\u08e7\0\u091c\0\u0951\0\u0986\0\u0774"+
    "\0\u09bb\0\237\0\u09f0\0\237\0\u0a25\0\237\0\237\0\237"+
    "\0\237\0\237\0\u0a5a\0\237\0\237\0\u0a8f\0\237\0\237";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[88];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\2\1\3\1\4\1\5\1\4\1\6\1\7\1\4"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\2\4\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\2\0\1\34\1\35"+
    "\3\4\1\36\1\37\1\40\1\41\1\42\1\43\1\44"+
    "\1\4\1\33\2\45\1\2\1\4\1\2\1\45\1\33"+
    "\66\0\1\4\1\46\5\4\6\0\4\4\15\0\1\4"+
    "\1\0\6\4\4\0\2\4\1\0\1\4\2\0\3\4"+
    "\2\0\7\4\6\0\4\4\15\0\1\4\1\0\6\4"+
    "\4\0\2\4\1\0\1\4\2\0\3\4\2\0\5\4"+
    "\1\47\1\4\6\0\4\4\15\0\1\4\1\0\3\4"+
    "\1\50\2\4\4\0\2\4\1\0\1\4\2\0\3\4"+
    "\2\0\3\4\1\51\3\4\6\0\4\4\15\0\1\4"+
    "\1\0\6\4\4\0\2\4\1\0\1\4\2\0\3\4"+
    "\2\0\7\4\6\0\3\4\1\52\15\0\1\4\1\0"+
    "\6\4\4\0\2\4\1\0\1\4\2\0\3\4\11\0"+
    "\1\53\65\0\1\54\66\0\1\55\64\0\1\56\64\0"+
    "\1\57\64\0\1\60\52\0\7\4\6\0\1\4\1\61"+
    "\2\4\15\0\1\4\1\0\6\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\2\0\4\4\1\62\2\4\6\0"+
    "\4\4\15\0\1\4\1\0\6\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\26\0\1\63\37\0\35\64\3\0"+
    "\25\64\35\0\1\33\17\0\1\33\6\0\1\33\35\65"+
    "\3\0\1\66\24\65\1\0\7\4\6\0\4\4\15\0"+
    "\1\4\1\0\1\4\1\67\4\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\2\0\1\4\1\70\5\4\6\0"+
    "\4\4\15\0\1\4\1\0\6\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\2\0\7\4\6\0\4\4\15\0"+
    "\1\4\1\0\1\4\1\71\4\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\2\0\7\4\6\0\1\4\1\72"+
    "\2\4\15\0\1\4\1\0\6\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\57\0\2\45\1\73\2\0\1\45"+
    "\2\0\2\4\1\74\4\4\6\0\4\4\15\0\1\4"+
    "\1\0\6\4\4\0\2\4\1\0\1\4\2\0\3\4"+
    "\2\0\7\4\6\0\1\75\3\4\15\0\1\4\1\0"+
    "\6\4\4\0\2\4\1\0\1\4\2\0\3\4\2\0"+
    "\6\4\1\76\6\0\4\4\15\0\1\4\1\0\6\4"+
    "\4\0\2\4\1\0\1\4\2\0\3\4\2\0\3\4"+
    "\1\77\3\4\6\0\4\4\15\0\1\4\1\0\6\4"+
    "\4\0\2\4\1\0\1\4\2\0\3\4\2\0\7\4"+
    "\6\0\2\4\1\100\1\4\15\0\1\4\1\0\6\4"+
    "\4\0\2\4\1\0\1\4\2\0\3\4\2\0\7\4"+
    "\6\0\1\101\2\4\1\102\15\0\1\4\1\0\6\4"+
    "\4\0\2\4\1\0\1\4\2\0\3\4\2\0\7\63"+
    "\6\0\4\63\17\0\6\63\4\0\4\63\42\0\1\103"+
    "\31\0\2\4\1\104\4\4\6\0\4\4\15\0\1\4"+
    "\1\0\6\4\4\0\2\4\1\0\1\4\2\0\3\4"+
    "\2\0\7\4\6\0\3\4\1\105\15\0\1\4\1\0"+
    "\6\4\4\0\2\4\1\0\1\4\2\0\3\4\2\0"+
    "\7\4\6\0\4\4\15\0\1\4\1\0\1\4\1\106"+
    "\4\4\4\0\2\4\1\0\1\4\2\0\3\4\2\0"+
    "\2\4\1\107\4\4\6\0\4\4\15\0\1\4\1\0"+
    "\6\4\4\0\2\4\1\0\1\4\2\0\3\4\57\0"+
    "\2\110\3\0\1\110\2\0\3\4\1\111\3\4\6\0"+
    "\4\4\15\0\1\4\1\0\6\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\2\0\4\4\1\112\2\4\6\0"+
    "\4\4\15\0\1\4\1\0\6\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\2\0\6\4\1\113\6\0\4\4"+
    "\15\0\1\4\1\0\6\4\4\0\2\4\1\0\1\4"+
    "\2\0\3\4\2\0\4\4\1\114\2\4\6\0\4\4"+
    "\15\0\1\4\1\0\6\4\4\0\2\4\1\0\1\4"+
    "\2\0\3\4\2\0\7\4\6\0\2\4\1\115\1\4"+
    "\15\0\1\4\1\0\6\4\4\0\2\4\1\0\1\4"+
    "\2\0\3\4\2\0\3\4\1\116\3\4\6\0\4\4"+
    "\15\0\1\4\1\0\2\4\1\117\3\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\7\4\6\0\4\4"+
    "\15\0\1\4\1\0\2\4\1\120\3\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\7\4\6\0\1\4"+
    "\1\121\2\4\15\0\1\4\1\0\6\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\3\4\1\122\3\4"+
    "\6\0\4\4\15\0\1\4\1\0\6\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\7\4\6\0\4\4"+
    "\15\0\1\4\1\0\3\4\1\123\2\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\4\4\1\124\2\4"+
    "\6\0\4\4\15\0\1\4\1\0\6\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\4\4\1\125\2\4"+
    "\6\0\4\4\15\0\1\4\1\0\6\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\7\4\6\0\1\4"+
    "\1\126\2\4\15\0\1\4\1\0\6\4\4\0\2\4"+
    "\1\0\1\4\2\0\3\4\2\0\7\4\6\0\1\127"+
    "\3\4\15\0\1\4\1\0\6\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\2\0\7\4\6\0\4\4\15\0"+
    "\1\4\1\0\3\4\1\130\2\4\4\0\2\4\1\0"+
    "\1\4\2\0\3\4\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2756];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\1\11\15\1\3\11\1\1\6\11\6\1\4\11"+
    "\7\1\6\11\3\1\2\0\5\1\1\0\7\1\1\11"+
    "\25\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[88];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true iff the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true iff the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /* user code: */
 private TablaSimbolos tabla;
 public Yylex(Reader in, TablaSimbolos t){
 this(in);
 this.tabla = t;
 }
 public TablaSimbolos getTabla(){
 	return tabla;
 }
 public int linea(){return yyline+1;}
 public int columna(){ return yycolumn+1;}
 private static int etiquetaActual=0;
 private String nuevaEtiqueta(){
 	return "etiqJF_"+(++etiquetaActual);
 }
 


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Yylex(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2910) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;
    int numRead = zzReader.read(zzBuffer, zzEndRead, requested);

    /* not supposed to occur according to specification of java.io.Reader */
    if (numRead == 0) {
      throw new java.io.IOException("Reader returned 0 characters. See JFlex examples for workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      /* If numRead == requested, we might have requested to few chars to
         encode a full Unicode character. We assume that a Reader would
         otherwise never return half characters. */
      if (numRead == requested) {
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      int zzCh;
      int zzCharCount;
      for (zzCurrentPosL = zzStartRead  ;
           zzCurrentPosL < zzMarkedPosL ;
           zzCurrentPosL += zzCharCount ) {
        zzCh = Character.codePointAt(zzBufferL, zzCurrentPosL, zzMarkedPosL);
        zzCharCount = Character.charCount(zzCh);
        switch (zzCh) {
        case '\u000B':  // fall through
        case '\u000C':  // fall through
        case '\u0085':  // fall through
        case '\u2028':  // fall through
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn += zzCharCount;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
            zzDoEOF();
          { return new java_cup.runtime.Symbol(sym.EOF); }
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { System.out.println("Error en l�xico."+yytext()+"-");
            } 
            // fall through
          case 45: break;
          case 2: 
            { Simbolo s;
	s=new Simbolo(yytext(),null);
		return new Symbol(sym.ID,s);
            } 
            // fall through
          case 46: break;
          case 3: 
            { return new Symbol(sym.BIGGER);
            } 
            // fall through
          case 47: break;
          case 4: 
            { return new Symbol(sym.ASIG);
            } 
            // fall through
          case 48: break;
          case 5: 
            { return new Symbol(sym.SMALLER);
            } 
            // fall through
          case 49: break;
          case 6: 
            { return new Symbol(sym.MAS);
            } 
            // fall through
          case 50: break;
          case 7: 
            { return new Symbol(sym.MENOS);
            } 
            // fall through
          case 51: break;
          case 8: 
            { return new Symbol(sym.MULT);
            } 
            // fall through
          case 52: break;
          case 9: 
            { return new Symbol(sym.DIV);
            } 
            // fall through
          case 53: break;
          case 10: 
            { return new Symbol(sym.MOD);
            } 
            // fall through
          case 54: break;
          case 11: 
            { return new Symbol(sym.PTOYCOMA);
            } 
            // fall through
          case 55: break;
          case 12: 
            { return new Symbol(sym.ABREPAR);
            } 
            // fall through
          case 56: break;
          case 13: 
            { return new Symbol(sym.CIERRAPAR);
            } 
            // fall through
          case 57: break;
          case 14: 
            { return new Symbol(sym.ABRELLAVE);
            } 
            // fall through
          case 58: break;
          case 15: 
            { return new Symbol(sym.CIERRALLAVE);
            } 
            // fall through
          case 59: break;
          case 16: 
            { ;
            } 
            // fall through
          case 60: break;
          case 17: 
            { return new Symbol(sym.ABRECOR);
            } 
            // fall through
          case 61: break;
          case 18: 
            { return new Symbol(sym.CIERRACOR);
            } 
            // fall through
          case 62: break;
          case 19: 
            { return new Symbol(sym.DOSPUNTOS);
            } 
            // fall through
          case 63: break;
          case 20: 
            { return new Symbol(sym.COMA);
            } 
            // fall through
          case 64: break;
          case 21: 
            { return new Symbol(sym.NUM, new Integer(yytext()));
            } 
            // fall through
          case 65: break;
          case 22: 
            { return new Symbol(sym.IF);
            } 
            // fall through
          case 66: break;
          case 23: 
            { return new Symbol(sym.AND);
            } 
            // fall through
          case 67: break;
          case 24: 
            { return new Symbol(sym.OR);
            } 
            // fall through
          case 68: break;
          case 25: 
            { return new Symbol(sym.BIGGER_EQUAL);
            } 
            // fall through
          case 69: break;
          case 26: 
            { return new Symbol(sym.EQUAL);
            } 
            // fall through
          case 70: break;
          case 27: 
            { return new Symbol(sym.SMALLER_EQUAL);
            } 
            // fall through
          case 71: break;
          case 28: 
            { return new Symbol(sym.NOT_EQUAL);
            } 
            // fall through
          case 72: break;
          case 29: 
            { return new Symbol(sym.COMENTARIO, new String(yytext()));
            } 
            // fall through
          case 73: break;
          case 30: 
            { return new Symbol(sym.TEXTO, new String(yytext()));
            } 
            // fall through
          case 74: break;
          case 31: 
            { return new Symbol(sym.INTEGER);
            } 
            // fall through
          case 75: break;
          case 32: 
            { return new Symbol(sym.CARACTER, new String(yytext()));
            } 
            // fall through
          case 76: break;
          case 33: 
            { return new Symbol(sym.NUMREAL, new Float(yytext()));
            } 
            // fall through
          case 77: break;
          case 34: 
            { return new Symbol(sym.ELSE);
            } 
            // fall through
          case 78: break;
          case 35: 
            { return new Symbol(sym.TRUE);
            } 
            // fall through
          case 79: break;
          case 36: 
            { return new Symbol(sym.REAL);
            } 
            // fall through
          case 80: break;
          case 37: 
            { return new Symbol(sym.READ);
            } 
            // fall through
          case 81: break;
          case 38: 
            { return new Symbol(sym.VOID);
            } 
            // fall through
          case 82: break;
          case 39: 
            { return new Symbol(sym.CHAR);
            } 
            // fall through
          case 83: break;
          case 40: 
            { return new Symbol(sym.BOOLEAN);
            } 
            // fall through
          case 84: break;
          case 41: 
            { return new Symbol(sym.WHILE);
            } 
            // fall through
          case 85: break;
          case 42: 
            { return new Symbol(sym.FALSE);
            } 
            // fall through
          case 86: break;
          case 43: 
            { return new Symbol(sym.PRINT);
            } 
            // fall through
          case 87: break;
          case 44: 
            { return new Symbol(sym.RETURN);
            } 
            // fall through
          case 88: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }


}
