/* The following code was generated by JFlex 1.7.0 */

package com.grupo2.tpteo1grupo2;
import java_cup.runtime.*;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.List;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>./Ejemplo.flex</tt>
 */
public class Lexico implements java_cup.runtime.Scanner {

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
    "\11\0\1\3\1\2\1\0\1\3\1\1\22\0\1\3\1\24\1\27"+
    "\3\0\1\13\1\0\1\15\1\16\1\35\1\33\1\26\1\34\1\7"+
    "\1\36\1\10\1\12\10\5\1\56\1\23\1\32\1\31\1\30\1\25"+
    "\1\0\1\53\1\4\1\57\1\47\1\43\1\40\1\54\1\42\1\37"+
    "\2\4\1\45\1\60\1\44\1\51\1\55\1\4\1\52\1\46\1\41"+
    "\2\4\1\50\3\4\1\21\1\0\1\22\1\0\1\6\1\0\1\4"+
    "\1\11\30\4\1\17\1\14\1\20\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uff92\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\1\1\4\2\1"+
    "\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\1\15\1\16\1\1\1\17\1\20\1\21\1\22\1\23"+
    "\1\24\1\25\11\3\1\1\1\26\1\0\1\27\1\0"+
    "\1\30\1\31\1\32\1\0\1\33\13\3\1\34\1\0"+
    "\1\35\1\0\13\3\1\36\2\0\7\3\1\37\6\3"+
    "\2\0\1\3\1\40\1\41\6\3\1\42\1\43\2\3"+
    "\1\0\1\3\1\44\3\3\1\45\1\3\1\46\1\3"+
    "\1\0\1\47\5\3\1\0\1\3\1\50\1\3\2\0"+
    "\2\3\2\0\2\3\24\0\1\51\1\52\4\0\1\53"+
    "\1\54";

  private static int [] zzUnpackAction() {
    int [] result = new int[162];
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
    "\0\0\0\61\0\142\0\61\0\223\0\304\0\365\0\u0126"+
    "\0\u0157\0\u0188\0\61\0\61\0\61\0\61\0\61\0\61"+
    "\0\61\0\61\0\61\0\61\0\u01b9\0\u01ea\0\61\0\u021b"+
    "\0\61\0\61\0\61\0\u024c\0\u027d\0\u02ae\0\u02df\0\u0310"+
    "\0\u0341\0\u0372\0\u03a3\0\u03d4\0\u0405\0\u0436\0\365\0\u0467"+
    "\0\61\0\u01b9\0\61\0\61\0\61\0\u0498\0\223\0\u04c9"+
    "\0\u04fa\0\u052b\0\u055c\0\u058d\0\u05be\0\u05ef\0\u0620\0\u0651"+
    "\0\u0682\0\u06b3\0\61\0\u06e4\0\u0467\0\u0715\0\u0746\0\u0777"+
    "\0\u07a8\0\u07d9\0\u080a\0\u083b\0\u086c\0\u089d\0\u08ce\0\u08ff"+
    "\0\u0930\0\61\0\u0961\0\u0992\0\u09c3\0\u09f4\0\u0a25\0\u0a56"+
    "\0\u0a87\0\u0ab8\0\u0ae9\0\223\0\u0b1a\0\u0b4b\0\u0b7c\0\u0bad"+
    "\0\u0bde\0\u0c0f\0\u0c40\0\u0c71\0\u0ca2\0\223\0\223\0\u0cd3"+
    "\0\u0d04\0\u0d35\0\u0d66\0\u0d97\0\u0dc8\0\223\0\223\0\u0df9"+
    "\0\u0e2a\0\u0e5b\0\u0e8c\0\223\0\u0ebd\0\u0eee\0\u0f1f\0\223"+
    "\0\u0f50\0\223\0\u0f81\0\u0fb2\0\223\0\u0fe3\0\u1014\0\u1045"+
    "\0\u1076\0\u10a7\0\u10d8\0\u1109\0\223\0\u113a\0\u116b\0\u119c"+
    "\0\u11cd\0\u11fe\0\u122f\0\u1260\0\u1291\0\u12c2\0\u12f3\0\u1324"+
    "\0\u1355\0\u1386\0\u13b7\0\u13e8\0\u1419\0\u144a\0\u147b\0\u14ac"+
    "\0\u14dd\0\u150e\0\u153f\0\u1570\0\u15a1\0\u15d2\0\u1603\0\u1634"+
    "\0\u1665\0\u1696\0\61\0\61\0\u16c7\0\u16f8\0\u1729\0\u175a"+
    "\0\61\0\61";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[162];
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
    "\1\2\1\3\2\4\1\5\1\6\1\2\1\7\1\10"+
    "\1\5\1\6\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\5\1\40\2\5\1\41\1\42\1\43\1\44"+
    "\3\5\1\45\1\46\2\5\63\0\1\4\62\0\3\5"+
    "\1\0\3\5\24\0\17\5\1\0\2\5\5\0\1\6"+
    "\1\0\1\47\1\6\1\0\1\6\53\0\1\47\2\0"+
    "\1\47\1\0\1\47\53\0\1\6\1\0\1\47\1\6"+
    "\1\50\1\6\61\0\1\51\61\0\1\51\44\0\1\52"+
    "\2\0\24\52\1\53\31\52\31\0\1\54\60\0\1\55"+
    "\65\0\1\56\26\0\3\5\1\0\3\5\24\0\1\5"+
    "\1\57\3\5\1\60\11\5\1\0\2\5\4\0\3\5"+
    "\1\0\3\5\24\0\6\5\1\61\10\5\1\0\2\5"+
    "\4\0\3\5\1\0\3\5\24\0\3\5\1\62\13\5"+
    "\1\0\2\5\4\0\3\5\1\0\3\5\24\0\5\5"+
    "\1\63\1\64\10\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\2\5\1\65\14\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\4\5\1\66\12\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\3\5\1\67"+
    "\7\5\1\70\3\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\16\5\1\71\1\0\2\5\4\0\3\5"+
    "\1\0\3\5\24\0\13\5\1\72\3\5\1\0\2\5"+
    "\31\0\1\73\24\0\1\74\12\0\1\75\1\0\1\75"+
    "\103\0\1\76\27\0\3\5\1\0\3\5\24\0\2\5"+
    "\1\77\14\5\1\0\2\5\4\0\3\5\1\0\3\5"+
    "\24\0\12\5\1\100\4\5\1\0\2\5\4\0\3\5"+
    "\1\0\3\5\24\0\4\5\1\101\12\5\1\0\2\5"+
    "\4\0\3\5\1\0\3\5\24\0\10\5\1\102\6\5"+
    "\1\0\2\5\4\0\3\5\1\0\3\5\24\0\7\5"+
    "\1\103\7\5\1\0\2\5\4\0\3\5\1\0\3\5"+
    "\24\0\13\5\1\104\3\5\1\0\2\5\4\0\3\5"+
    "\1\0\3\5\24\0\17\5\1\0\1\105\1\5\4\0"+
    "\3\5\1\0\3\5\24\0\1\106\16\5\1\0\2\5"+
    "\4\0\3\5\1\0\3\5\24\0\1\107\16\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\6\5\1\110"+
    "\10\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\12\5\1\111\4\5\1\0\2\5\31\0\1\112\30\0"+
    "\5\76\2\0\3\76\2\0\12\76\6\0\1\113\1\114"+
    "\17\76\1\0\2\76\4\0\3\5\1\0\3\5\24\0"+
    "\4\5\1\115\12\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\14\5\1\116\2\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\5\5\1\57\11\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\1\117\1\120"+
    "\6\5\1\121\1\122\4\5\1\123\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\4\5\1\124\12\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\1\125\16\5"+
    "\1\0\2\5\4\0\3\5\1\0\3\5\24\0\6\5"+
    "\1\126\10\5\1\0\2\5\4\0\3\5\1\0\3\5"+
    "\24\0\6\5\1\127\10\5\1\0\2\5\4\0\3\5"+
    "\1\0\3\5\24\0\2\5\1\130\14\5\1\0\2\5"+
    "\4\0\3\5\1\0\3\5\24\0\1\131\16\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\15\5\1\132"+
    "\1\5\1\0\2\5\36\0\1\133\60\0\1\134\26\0"+
    "\3\5\1\0\3\5\24\0\15\5\1\135\1\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\2\5\1\136"+
    "\14\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\1\5\1\137\15\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\12\5\1\140\4\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\4\5\1\141\12\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\3\5\1\142"+
    "\13\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\13\5\1\143\3\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\5\5\1\144\11\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\14\5\1\145\2\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\4\5\1\146"+
    "\12\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\4\5\1\147\12\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\7\5\1\150\7\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\13\5\1\151\3\5\1\0"+
    "\2\5\36\0\1\4\57\0\1\152\27\0\3\5\1\0"+
    "\3\5\24\0\4\5\1\153\12\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\13\5\1\154\3\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\17\5\1\0"+
    "\1\155\1\5\4\0\3\5\1\0\3\5\24\0\1\156"+
    "\16\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\12\5\1\157\4\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\15\5\1\160\1\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\13\5\1\161\3\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\2\5\1\162"+
    "\14\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\14\5\1\163\2\5\1\0\2\5\1\0\5\152\2\0"+
    "\3\152\2\0\12\152\6\0\1\164\1\0\17\152\1\0"+
    "\2\152\4\0\3\5\1\0\3\5\24\0\13\5\1\165"+
    "\3\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\6\5\1\166\10\5\1\0\2\5\4\0\3\5\1\0"+
    "\3\5\24\0\6\5\1\167\10\5\1\0\2\5\4\0"+
    "\3\5\1\0\3\5\24\0\15\5\1\170\1\5\1\0"+
    "\2\5\4\0\3\5\1\0\3\5\24\0\4\5\1\171"+
    "\12\5\1\0\2\5\4\0\3\5\1\0\3\5\24\0"+
    "\17\5\1\0\1\5\1\172\36\0\1\173\26\0\3\5"+
    "\1\0\3\5\24\0\14\5\1\174\2\5\1\0\2\5"+
    "\4\0\3\5\1\0\3\5\24\0\4\5\1\175\12\5"+
    "\1\0\2\5\4\0\3\5\1\0\3\5\24\0\13\5"+
    "\1\176\3\5\1\0\2\5\4\0\3\5\1\177\3\5"+
    "\24\0\17\5\1\0\2\5\4\0\3\5\1\200\3\5"+
    "\24\0\17\5\1\0\2\5\36\0\1\76\26\0\3\5"+
    "\1\0\3\5\24\0\13\5\1\201\3\5\1\0\2\5"+
    "\4\0\3\5\1\0\3\5\24\0\14\5\1\202\2\5"+
    "\1\0\2\5\46\0\1\203\60\0\1\204\16\0\3\5"+
    "\1\0\3\5\24\0\4\5\1\205\12\5\1\0\2\5"+
    "\4\0\3\5\1\0\3\5\24\0\17\5\1\0\1\5"+
    "\1\206\43\0\1\207\60\0\1\210\21\0\3\5\1\211"+
    "\3\5\24\0\17\5\1\0\2\5\4\0\3\5\1\212"+
    "\3\5\24\0\17\5\1\0\2\5\57\0\1\213\60\0"+
    "\1\214\47\0\1\215\60\0\1\216\53\0\1\217\60\0"+
    "\1\220\62\0\1\221\60\0\1\222\54\0\1\223\60\0"+
    "\1\224\100\0\1\225\60\0\1\226\52\0\1\227\60\0"+
    "\1\230\50\0\1\231\60\0\1\232\63\0\1\233\60\0"+
    "\1\234\53\0\1\235\60\0\1\236\72\0\1\237\60\0"+
    "\1\240\53\0\1\241\60\0\1\242\14\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[6027];
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
    "\1\0\1\11\1\1\1\11\6\1\12\11\2\1\1\11"+
    "\1\1\3\11\14\1\1\0\1\11\1\0\3\11\1\0"+
    "\14\1\1\11\1\0\1\1\1\0\13\1\1\11\2\0"+
    "\16\1\2\0\15\1\1\0\11\1\1\0\6\1\1\0"+
    "\3\1\2\0\2\1\2\0\2\1\24\0\2\11\4\0"+
    "\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[162];
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
    private String resultados;
    private Resultado resultado;
    private final Utils utils = new Utils();
    String nombreArchivo;

    int MAX_CONST_INT = 1000;    // Ejemplo de límite máximo para CONST_INT
    double MAX_CONST_REAL = 1000.0; // Ejemplo de límite máximo para CONST_REAL

    public static void guardarEnArchivo(String contenido, String nombreArchivo) {
      try (FileWriter escritor = new FileWriter(nombreArchivo)) {
        escritor.write(contenido);
      } catch (IOException e) {
      }
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexico(java.io.Reader in) {
      resultados = "";
    nombreArchivo = "output.txt";
    resultado = Resultado.getInstance();
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
    while (i < 164) {
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
        resultado.setContenido(resultados);
    guardarEnArchivo(resultado.getContenido(), nombreArchivo);
    SymbolTableGenerator prueba = new SymbolTableGenerator();
    String outputFilePath = "tabla_de_simbolos.csv";
    List<SymbolTableGenerator.Symbol> symbols = prueba.parseFile(nombreArchivo);
    prueba.saveToCSV(symbols, outputFilePath);
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

      yychar+= zzMarkedPosL-zzStartRead;

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
            { resultados = ""; this.utils.mostrarBadToken(); throw new RuntimeException();
            } 
            // fall through
          case 45: break;
          case 2: 
            { 
            } 
            // fall through
          case 46: break;
          case 3: 
            { resultados += "Token ID encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ID, yytext());
            } 
            // fall through
          case 47: break;
          case 4: 
            { int valor = Integer.parseInt(yytext());
    if (valor > MAX_CONST_INT) {
        resultados = ""; this.utils.mostrarIntLimit(); throw new RuntimeException();
    } else {
        resultados += "Token CONST_INT encontrado, Lexema: " + yytext() + "\n";
        return new Symbol(sym.CONST_INT, yytext());
    }
            } 
            // fall through
          case 48: break;
          case 5: 
            { resultados += "Token ABRIR_PARENTESIS encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ABRIR_PARENTESIS, yytext());
            } 
            // fall through
          case 49: break;
          case 6: 
            { resultados += "Token CERRAR_PARENTESIS encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.CERRAR_PARENTESIS, yytext());
            } 
            // fall through
          case 50: break;
          case 7: 
            { resultados += "Token ABRIR_LLAVE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ABRIR_LLAVE, yytext());
            } 
            // fall through
          case 51: break;
          case 8: 
            { resultados += "Token CERRAR_LLAVE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.CERRAR_LLAVE, yytext());
            } 
            // fall through
          case 52: break;
          case 9: 
            { resultados += "Token ABRIR_CORCHETE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ABRIR_CORCHETE, yytext());
            } 
            // fall through
          case 53: break;
          case 10: 
            { resultados += "Token CERRAR_CORCHETE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.CERRAR_CORCHETE, yytext());
            } 
            // fall through
          case 54: break;
          case 11: 
            { resultados += "Token PUNTO_Y_COMA encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.PUNTO_Y_COMA, yytext());
            } 
            // fall through
          case 55: break;
          case 12: 
            { resultados += "Token ADMIRACION encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ADMIRACION, yytext());
            } 
            // fall through
          case 56: break;
          case 13: 
            { resultados += "Token INTERROGACION encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.INTERROGACION, yytext());
            } 
            // fall through
          case 57: break;
          case 14: 
            { resultados += "Token COMA encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.COMA, yytext());
            } 
            // fall through
          case 58: break;
          case 15: 
            { resultados += "Token OP_MAYOR encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_MAYOR, yytext());
            } 
            // fall through
          case 59: break;
          case 16: 
            { resultados += "Token OP_IGUAL encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_IGUAL, yytext());
            } 
            // fall through
          case 60: break;
          case 17: 
            { resultados += "Token OP_MENOR encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_MENOR, yytext());
            } 
            // fall through
          case 61: break;
          case 18: 
            { resultados += "Token OP_SUMA encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_SUMA, yytext());
            } 
            // fall through
          case 62: break;
          case 19: 
            { resultados += "Token OP_RESTA encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_RESTA, yytext());
            } 
            // fall through
          case 63: break;
          case 20: 
            { resultados += "Token OP_MULT encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_MULT, yytext());
            } 
            // fall through
          case 64: break;
          case 21: 
            { resultados += "Token OP_DIV encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_DIV, yytext());
            } 
            // fall through
          case 65: break;
          case 22: 
            { double valor = Double.parseDouble(yytext());
    if (valor > MAX_CONST_REAL) {
        resultados = ""; this.utils.mostrarRealLimit(); throw new RuntimeException();
    } else {
        resultados += "Token CONST_REAL encontrado, Lexema: " + yytext() + "\n";
        return new Symbol(sym.CONST_REAL, yytext());
    }
            } 
            // fall through
          case 66: break;
          case 23: 
            { resultados += "Token CON_LOGICO encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.CON_LOGICO, yytext());
            } 
            // fall through
          case 67: break;
          case 24: 
            { String valor = yytext();
    // Remueve las comillas para contar solo los caracteres internos
    valor = valor.substring(1, valor.length() - 1);

    if (valor.length() > 30) {
        resultados = ""; this.utils.mostrarStringLimit(); throw new RuntimeException();
    } else {
        resultados += "Token CONST_STRING encontrado, Lexema: " + yytext() + "\n";
        return new Symbol(sym.CONST_STRING, yytext());
    }
            } 
            // fall through
          case 68: break;
          case 25: 
            { resultados += "Token OP_MAYOR_IGUAL encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_MAYOR_IGUAL, yytext());
            } 
            // fall through
          case 69: break;
          case 26: 
            { resultados += "Token OP_MENOR_IGUAL encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OP_MENOR_IGUAL, yytext());
            } 
            // fall through
          case 70: break;
          case 27: 
            { resultados += "Token IF encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.IF, yytext());
            } 
            // fall through
          case 71: break;
          case 28: 
            { resultados += "Token DECLARATION encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.DECLARATION, yytext());
            } 
            // fall through
          case 72: break;
          case 29: 
            { resultados += "Token CONST_B encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.CONST_B, yytext());
            } 
            // fall through
          case 73: break;
          case 30: 
            { resultados += "Token ASIGN encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ASIGN, yytext());
            } 
            // fall through
          case 74: break;
          case 31: 
            { resultados += "Token ELSE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ELSE, yytext());
            } 
            // fall through
          case 75: break;
          case 32: 
            { resultados += "Token FLOAT encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.FLOAT, yytext());
            } 
            // fall through
          case 76: break;
          case 33: 
            { resultados += "Token ENDIF encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ENDIF, yytext());
            } 
            // fall through
          case 77: break;
          case 34: 
            { resultados += "Token WHILE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.WHILE, yytext());
            } 
            // fall through
          case 78: break;
          case 35: 
            { resultados += "Token WRITE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.WRITE, yytext());
            } 
            // fall through
          case 79: break;
          case 36: 
            { resultados += "Token ENDFOR encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ENDFOR, yytext());
            } 
            // fall through
          case 80: break;
          case 37: 
            { resultados += "Token STRING encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.STRING, yytext());
            } 
            // fall through
          case 81: break;
          case 38: 
            { resultados += "Token OPLIST encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.OPLIST, yytext());
            } 
            // fall through
          case 82: break;
          case 39: 
            { resultados += "Token INTEGER encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.INTEGER, yytext());
            } 
            // fall through
          case 83: break;
          case 40: 
            { resultados += "Token ENDWHILE encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ENDWHILE, yytext());
            } 
            // fall through
          case 84: break;
          case 41: 
            { resultados += "Token DECLARE.SECTION encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.DECLARE_SECTION, yytext());
            } 
            // fall through
          case 85: break;
          case 42: 
            { resultados += "Token PROGRAM.SECTION encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.PROGRAM_SECTION, yytext());
            } 
            // fall through
          case 86: break;
          case 43: 
            { resultados += "Token ENDDECLARE.SECTION encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ENDDECLARE_SECTION, yytext());
            } 
            // fall through
          case 87: break;
          case 44: 
            { resultados += "Token ENDPROGRAM.SECTION encontrado, Lexema " + yytext() + "\n"; return new Symbol(sym.ENDPROGRAM_SECTION, yytext());
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
