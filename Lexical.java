// DO NOT EDIT
// Generated by JFlex 1.8.2 http://jflex.de/
// source: lexcicalAnalyser.jflex

import java.util.Vector;


// See https://github.com/jflex-de/jflex/issues/222
@SuppressWarnings("FallThrough")
class Lexical {

  /** This character denotes the end of file. */
  public static final int YYEOF = -1;

  /** Initial size of the lookahead buffer. */
  private static final int ZZ_BUFFERSIZE = 16384;

  // Lexical states.
  public static final int YYINITIAL = 0;
  public static final int MULTI_COMMENT = 2;
  public static final int SINGLE_COMMENT = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = {
     0,  0,  1,  1,  2, 2
  };

  /**
   * Top-level table for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_TOP = zzUnpackcmap_top();

  private static final String ZZ_CMAP_TOP_PACKED_0 =
    "\1\0\37\u0100\1\u0200\267\u0100\10\u0300\u1020\u0100";

  private static int [] zzUnpackcmap_top() {
    int [] result = new int[4352];
    int offset = 0;
    offset = zzUnpackcmap_top(ZZ_CMAP_TOP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_top(String packed, int offset, int [] result) {
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
   * Second-level tables for translating characters to character classes
   */
  private static final int [] ZZ_CMAP_BLOCKS = zzUnpackcmap_blocks();

  private static final String ZZ_CMAP_BLOCKS_PACKED_0 =
    "\10\0\2\1\1\2\2\3\1\4\22\0\1\5\1\6"+
    "\1\7\2\0\1\10\1\11\1\12\2\13\1\14\1\15"+
    "\1\0\1\16\1\17\1\20\12\21\1\0\1\13\1\22"+
    "\1\23\1\22\2\0\22\24\1\25\7\24\1\13\1\26"+
    "\1\13\1\0\1\27\1\0\1\30\1\31\1\32\1\33"+
    "\1\34\1\35\1\36\1\37\1\40\1\24\1\41\1\42"+
    "\1\24\1\43\1\44\1\45\1\24\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\3\24\1\13\1\54\1\13\7\0"+
    "\1\3\u01a2\0\2\3\326\0\u0100\3";

  private static int [] zzUnpackcmap_blocks() {
    int [] result = new int[1024];
    int offset = 0;
    offset = zzUnpackcmap_blocks(ZZ_CMAP_BLOCKS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackcmap_blocks(String packed, int offset, int [] result) {
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
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\2\1\1\4\2\1\1\5"+
    "\3\4\1\6\1\4\17\7\1\1\2\2\2\10\1\0"+
    "\1\6\2\0\1\11\1\12\1\6\2\0\12\7\1\13"+
    "\11\7\3\0\1\14\2\0\23\7\1\14\2\0\1\14"+
    "\2\0\5\7\1\13\1\0\5\7\3\0\4\7\1\0"+
    "\1\7\1\15\6\7\3\0\1\7\1\13\2\0\1\16"+
    "\2\0\1\7\1\16\2\0\1\16\2\0\1\7\3\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[146];
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
    "\0\0\0\55\0\132\0\207\0\207\0\207\0\264\0\341"+
    "\0\207\0\u010e\0\u013b\0\207\0\u0168\0\u0195\0\u01c2\0\u01ef"+
    "\0\264\0\u021c\0\u0249\0\u0276\0\u02a3\0\u02d0\0\u02fd\0\u032a"+
    "\0\u0357\0\u0384\0\u03b1\0\u03de\0\u040b\0\u0438\0\u0465\0\u0492"+
    "\0\u04bf\0\u04ec\0\u0519\0\207\0\u0546\0\341\0\207\0\u0573"+
    "\0\u05a0\0\207\0\207\0\u05cd\0\u05fa\0\u0627\0\u0654\0\u0681"+
    "\0\u06ae\0\u06db\0\u0708\0\u0735\0\u0762\0\u078f\0\u07bc\0\u07e9"+
    "\0\u021c\0\u0816\0\u0843\0\u0870\0\u089d\0\u08ca\0\u08f7\0\u0924"+
    "\0\u0951\0\u097e\0\u09ab\0\u09d8\0\u0a05\0\u0a32\0\u0a5f\0\u0a8c"+
    "\0\u0ab9\0\u0ae6\0\u0b13\0\u0b40\0\u0b6d\0\u0b9a\0\u0bc7\0\u0bf4"+
    "\0\u0c21\0\u0c4e\0\u0c7b\0\u0ca8\0\u0cd5\0\u0d02\0\u0d2f\0\u0d5c"+
    "\0\u0d89\0\u0db6\0\u0de3\0\207\0\u0e10\0\u0e3d\0\u0e6a\0\u0e97"+
    "\0\u0ec4\0\u0ef1\0\u0f1e\0\u0f4b\0\u0f78\0\u0fa5\0\u0fd2\0\u0fff"+
    "\0\u102c\0\u1059\0\u1086\0\u10b3\0\u10e0\0\u110d\0\u113a\0\u1167"+
    "\0\u1194\0\u11c1\0\u11ee\0\u121b\0\u1248\0\u1275\0\u12a2\0\u12cf"+
    "\0\u12fc\0\u1329\0\u1356\0\u1383\0\u13b0\0\u13dd\0\u140a\0\u1437"+
    "\0\u1464\0\207\0\u1491\0\u14be\0\u14eb\0\u1518\0\u1545\0\u1572"+
    "\0\207\0\u159f\0\u15cc\0\u15f9\0\u1626\0\u1653\0\u1680\0\u16ad"+
    "\0\u16da\0\u1707";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[146];
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
    "\1\4\2\5\1\6\2\5\1\7\1\10\1\11\1\12"+
    "\1\13\1\14\1\11\1\15\1\16\1\14\1\17\1\20"+
    "\2\21\1\22\1\23\2\4\1\22\1\24\1\25\1\26"+
    "\1\27\1\30\2\22\1\31\1\22\1\32\2\22\1\33"+
    "\1\34\1\35\1\36\1\22\1\37\1\40\1\41\3\5"+
    "\1\6\1\42\7\5\1\43\42\5\1\44\1\6\1\45"+
    "\50\5\100\0\1\11\31\0\2\46\1\0\1\46\1\0"+
    "\2\46\1\47\16\46\1\50\26\46\11\0\1\11\67\0"+
    "\2\51\2\0\24\51\16\0\1\11\55\0\1\11\52\0"+
    "\1\52\3\0\1\53\53\0\1\54\1\0\1\20\34\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\25\22\2\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\21\22\1\57\3\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\15\22\1\60\1\22\1\61\5\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\10\22\1\62\4\22\1\63\7\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\5\22"+
    "\1\64\7\22\1\65\7\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\13\22\1\66"+
    "\11\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\13\22\1\67\1\22\1\70\7\22"+
    "\2\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\6\22\1\71\5\22\1\72\10\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\15\22\1\73\7\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\17\22\1\74"+
    "\2\22\1\75\2\22\2\0\2\55\2\0\1\55\13\0"+
    "\1\22\1\0\1\56\2\22\1\0\5\22\1\76\17\22"+
    "\2\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\21\22\1\77\3\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\10\22"+
    "\1\100\14\22\2\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\15\22\1\101\7\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\10\22\1\102\14\22\55\0\1\11\2\0\1\5"+
    "\72\0\1\44\36\0\1\44\53\0\2\103\1\0\2\103"+
    "\1\0\1\46\57\0\1\47\63\0\1\54\34\0\2\55"+
    "\2\0\1\55\15\0\1\56\32\0\2\56\2\0\1\56"+
    "\1\0\1\104\2\0\1\105\6\0\1\106\13\0\1\107"+
    "\12\0\1\110\5\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\17\22\1\111\5\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\15\22\1\112\7\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\5\22\1\113"+
    "\17\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\1\22\1\114\23\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\14\22\1\115\10\22\2\0\2\55\2\0\1\55\13\0"+
    "\1\22\1\0\1\56\2\22\1\0\6\22\1\116\16\22"+
    "\2\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\22\22\1\117\2\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\20\22"+
    "\1\120\4\22\2\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\15\22\1\121\7\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\17\22\1\71\5\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\21\22\1\122"+
    "\3\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\14\22\1\123\10\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\11\22\1\124\3\22\1\125\7\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\2\22"+
    "\1\126\22\22\2\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\21\22\1\127\3\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\1\22\1\130\23\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\5\22\1\131"+
    "\17\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\11\22\1\132\13\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\11\22\1\133\13\22\2\0\2\103\1\0\2\103\20\0"+
    "\1\46\26\0\2\104\1\0\1\104\1\0\2\104\1\134"+
    "\16\104\1\135\26\104\24\0\2\136\2\0\24\136\20\0"+
    "\1\137\1\0\1\106\63\0\1\140\72\0\1\141\7\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\11\22\1\73\13\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\13\22\1\142"+
    "\11\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\1\22\1\143\23\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\17\22\1\122\5\22\2\0\2\55\2\0\1\55\13\0"+
    "\1\22\1\0\1\56\2\22\1\0\21\22\1\144\3\22"+
    "\2\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\1\22\1\145\23\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\2\22"+
    "\1\146\22\22\2\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\5\22\1\147\17\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\1\22\1\72\23\22\2\0\2\150\2\0\1\150"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\25\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\7\22\1\122\15\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\23\22\1\151"+
    "\1\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\21\22\1\152\3\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\13\22\1\153\11\22\2\0\2\55\2\0\1\55\13\0"+
    "\1\22\1\0\1\56\2\22\1\0\22\22\1\154\2\22"+
    "\2\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\21\22\1\153\3\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\14\22"+
    "\1\71\10\22\2\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\4\22\1\122\20\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\13\22\1\155\11\22\2\0\2\156\1\0\2\156"+
    "\1\0\1\104\57\0\1\134\63\0\1\137\75\0\1\157"+
    "\63\0\1\160\4\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\5\22\1\161\17\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\12\22\1\71\12\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\11\22\1\162"+
    "\13\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\22\22\1\163\2\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\13\22\1\164\11\22\2\0\2\55\2\0\1\165\13\0"+
    "\1\22\1\0\1\56\2\22\1\0\11\22\1\166\13\22"+
    "\2\0\2\150\2\0\1\150\15\0\1\56\2\167\2\0"+
    "\24\167\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\1\22\1\170\23\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\5\22\1\171\17\22\2\0\2\55\2\0\1\55\13\0"+
    "\1\22\1\0\1\56\2\22\1\0\11\22\1\172\13\22"+
    "\2\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\17\22\1\131\5\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\5\22"+
    "\1\71\17\22\2\0\2\156\1\0\2\156\20\0\1\104"+
    "\75\0\1\160\41\0\1\134\21\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\1\22\1\173"+
    "\23\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\14\22\1\174\10\22\2\0\2\55"+
    "\2\0\1\55\13\0\1\22\1\0\1\56\2\22\1\0"+
    "\13\22\1\175\11\22\2\0\2\55\2\0\1\55\13\0"+
    "\1\22\1\0\1\56\2\22\1\0\5\22\1\122\17\22"+
    "\2\0\2\55\2\0\1\55\15\0\1\56\14\0\1\176"+
    "\15\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\6\22\1\71\16\22\2\0\2\177\2\0"+
    "\1\177\13\0\1\167\1\0\1\200\2\167\1\0\25\167"+
    "\2\0\2\55\2\0\1\55\13\0\1\22\1\0\1\56"+
    "\2\22\1\0\21\22\1\155\3\22\2\0\2\55\2\0"+
    "\1\55\13\0\1\22\1\0\1\56\2\22\1\0\3\22"+
    "\1\201\21\22\2\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\3\22\1\71\21\22\2\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\14\22\1\122\10\22\2\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\22\22\1\155"+
    "\2\22\2\0\2\55\2\0\1\55\13\0\1\22\1\0"+
    "\1\56\2\22\1\0\21\22\1\71\3\22\36\0\1\202"+
    "\20\0\2\177\2\0\1\177\15\0\1\200\32\0\2\200"+
    "\2\0\1\200\1\0\1\203\2\0\1\204\6\0\1\205"+
    "\13\0\1\206\12\0\1\207\5\0\2\55\2\0\1\55"+
    "\13\0\1\22\1\0\1\56\2\22\1\0\21\22\1\210"+
    "\3\22\1\0\2\203\1\0\1\203\1\0\2\203\1\211"+
    "\16\203\1\212\26\203\24\0\2\213\2\0\24\213\20\0"+
    "\1\214\1\0\1\205\63\0\1\215\72\0\1\216\7\0"+
    "\2\55\2\0\1\55\13\0\1\22\1\0\1\56\2\22"+
    "\1\0\5\22\1\217\17\22\2\0\2\220\1\0\2\220"+
    "\1\0\1\203\57\0\1\211\63\0\1\214\75\0\1\221"+
    "\63\0\1\222\4\0\2\55\2\0\1\55\13\0\1\22"+
    "\1\0\1\56\2\22\1\0\4\22\1\71\20\22\2\0"+
    "\2\220\1\0\2\220\20\0\1\203\75\0\1\222\41\0"+
    "\1\211\20\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[5940];
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


  /** Error code for "Unknown internal scanner error". */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  /** Error code for "could not match input". */
  private static final int ZZ_NO_MATCH = 1;
  /** Error code for "pushback value was too large". */
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /**
   * Error messages for {@link #ZZ_UNKNOWN_ERROR}, {@link #ZZ_NO_MATCH}, and
   * {@link #ZZ_PUSHBACK_2BIG} respectively.
   */
  private static final String ZZ_ERROR_MSG[] = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state {@code aState}
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\3\11\2\1\1\11\2\1\1\11\27\1\1\11"+
    "\1\1\1\0\1\11\2\0\2\11\1\1\2\0\24\1"+
    "\3\0\1\1\2\0\23\1\1\11\2\0\1\1\2\0"+
    "\6\1\1\0\5\1\3\0\4\1\1\0\10\1\3\0"+
    "\1\1\1\11\2\0\1\1\2\0\1\1\1\11\2\0"+
    "\1\1\2\0\1\1\3\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[146];
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

  /** Input device. */
  private java.io.Reader zzReader;

  /** Current state of the DFA. */
  private int zzState;

  /** Current lexical state. */
  private int zzLexicalState = YYINITIAL;

  /**
   * This buffer contains the current text to be matched and is the source of the {@link #yytext()}
   * string.
   */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** Text position at the last accepting state. */
  private int zzMarkedPos;

  /** Current text position in the buffer. */
  private int zzCurrentPos;

  /** Marks the beginning of the {@link #yytext()} string in the buffer. */
  private int zzStartRead;

  /** Marks the last character in the buffer, that has been read from input. */
  private int zzEndRead;

  /**
   * Whether the scanner is at the end of file.
   * @see #yyatEOF
   */
  private boolean zzAtEOF;

  /**
   * The number of occupied positions in {@link #zzBuffer} beyond {@link #zzEndRead}.
   *
   * <p>When a lead/high surrogate has been read from the input stream into the final
   * {@link #zzBuffer} position, this will have a value of 1; otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;

  /** Number of newlines encountered up to the start of the matched text. */
  private int yyline;

  /** Number of characters from the last newline up to the start of the matched text. */
  private int yycolumn;

  /** Number of characters up to the start of the matched text. */
  @SuppressWarnings("unused")
  private long yychar;

  /** Whether the scanner is currently at the beginning of a line. */
  @SuppressWarnings("unused")
  private boolean zzAtBOL = true;

  /** Whether the user-EOF-code has already been executed. */
  private boolean zzEOFDone;

  /* user code: */
    int counter = 0;
    Vector<Token> table = new Vector<Token>();

    public int getToken(String name , Vector<Token> allTokens){
        for(Token t : allTokens){
            if(t.Name.equals(name)){
                return t.ID;
            }
        }
        return 0;
    }


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexical(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Translates raw input code points to DFA table row
   */
  private static int zzCMap(int input) {
    int offset = input & 255;
    return offset == input ? ZZ_CMAP_BLOCKS[offset] : ZZ_CMAP_BLOCKS[ZZ_CMAP_TOP[input >> 8] | offset];
  }

  /**
   * Refills the input buffer.
   *
   * @return {@code false} iff there was new input.
   * @exception java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead - zzStartRead);

      /* translate stored positions */
      zzEndRead -= zzStartRead;
      zzCurrentPos -= zzStartRead;
      zzMarkedPos -= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length * 2];
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
      throw new java.io.IOException(
          "Reader returned 0 characters. See JFlex examples/zero-reader for a workaround.");
    }
    if (numRead > 0) {
      zzEndRead += numRead;
      if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
        if (numRead == requested) { // We requested too few chars to encode a full Unicode character
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        } else {                    // There is room in the buffer for at least one more char
          int c = zzReader.read();  // Expecting to read a paired low surrogate char
          if (c == -1) {
            return true;
          } else {
            zzBuffer[zzEndRead++] = (char)c;
          }
        }
      }
      /* potentially more input available */
      return false;
    }

    /* numRead < 0 ==> end of stream */
    return true;
  }


  /**
   * Closes the input reader.
   *
   * @throws java.io.IOException if the reader could not be closed.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true; // indicate end of file
    zzEndRead = zzStartRead; // invalidate buffer

    if (zzReader != null) {
      zzReader.close();
    }
  }


  /**
   * Resets the scanner to read from a new input stream.
   *
   * <p>Does not close the old reader.
   *
   * <p>All internal variables are reset, the old input stream <b>cannot</b> be reused (internal
   * buffer is discarded and lost). Lexical state is set to {@code ZZ_INITIAL}.
   *
   * <p>Internal scan buffer is resized down to its initial length, if it has grown.
   *
   * @param reader The new input stream.
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzEOFDone = false;
    yyResetPosition();
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE) {
      zzBuffer = new char[ZZ_BUFFERSIZE];
    }
  }

  /**
   * Resets the input position.
   */
  private final void yyResetPosition() {
      zzAtBOL  = true;
      zzAtEOF  = false;
      zzCurrentPos = 0;
      zzMarkedPos = 0;
      zzStartRead = 0;
      zzEndRead = 0;
      zzFinalHighSurrogate = 0;
      yyline = 0;
      yycolumn = 0;
      yychar = 0L;
  }


  /**
   * Returns whether the scanner has reached the end of the reader it reads from.
   *
   * @return whether the scanner has reached EOF.
   */
  public final boolean yyatEOF() {
    return zzAtEOF;
  }


  /**
   * Returns the current lexical state.
   *
   * @return the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state.
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   *
   * @return the matched text.
   */
  public final String yytext() {
    return new String(zzBuffer, zzStartRead, zzMarkedPos-zzStartRead);
  }


  /**
   * Returns the character at the given position from the matched text.
   *
   * <p>It is equivalent to {@code yytext().charAt(pos)}, but faster.
   *
   * @param position the position of the character to fetch. A value from 0 to {@code yylength()-1}.
   *
   * @return the character at {@code position}.
   */
  public final char yycharat(int position) {
    return zzBuffer[zzStartRead + position];
  }


  /**
   * How many characters were matched.
   *
   * @return the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
   *
   * <p>In a well-formed scanner (no or only correct usage of {@code yypushback(int)} and a
   * match-all fallback rule) this method will only be called with things that
   * "Can't Possibly Happen".
   *
   * <p>If this method is called, something is seriously wrong (e.g. a JFlex bug producing a faulty
   * scanner etc.).
   *
   * <p>Usual syntax/scanner level error handling should be done in error fallback rules.
   *
   * @param errorCode the code of the error message to display.
   */
  private static void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    } catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * <p>They will be read again by then next call of the scanning method.
   *
   * @param number the number of characters to be read again. This number must not be greater than
   *     {@link #yylength()}.
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    System.out.println("**********************************");
    for(Token tt : table){
        System.out.println("ID is " + tt.ID + " | Name is "+ tt.Name + " | Value is " + tt.Value +" | with Type "+ tt.Type);
    }
    }
  }




  /**
   * Resumes scanning until the next regular expression is matched, the end of input is encountered
   * or an I/O-Error occurs.
   *
   * @return the next token.
   * @exception java.io.IOException if any I/O-Error occurs.
   */
  public int yylex() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char[] zzBufferL = zzBuffer;

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
        // peek one character ahead if it is
        // (if we have counted one line too much)
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
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMap(zzInput) ];
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
        return YYEOF;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1:
            { System.out.println(yytext() + " : "+ TokenType.UNDEFINED);
            }
            // fall through
          case 15: break;
          case 2:
            { 
            }
            // fall through
          case 16: break;
          case 3:
            { System.out.print(yytext());
            }
            // fall through
          case 17: break;
          case 4:
            { System.out.println(yytext() + " : "+ TokenType.OPERATOR);
            }
            // fall through
          case 18: break;
          case 5:
            { System.out.println(yytext() + " : "+ TokenType.DELIMITER);
            }
            // fall through
          case 19: break;
          case 6:
            { System.out.println(yytext() + " : "+ TokenType.LITERAL);
            }
            // fall through
          case 20: break;
          case 7:
            { String temp = yytext();

        if(getToken(temp,table)==0){
            table.add(new Token(++counter , temp , "N/A" , "N/A"));
        }
        
        System.out.println(temp + " : " + TokenType.IDENTIFIER);
            }
            // fall through
          case 21: break;
          case 8:
            { yybegin(YYINITIAL);
            }
            // fall through
          case 22: break;
          case 9:
            { yybegin(MULTI_COMMENT);
            }
            // fall through
          case 23: break;
          case 10:
            { yybegin(SINGLE_COMMENT);
            }
            // fall through
          case 24: break;
          case 11:
            { System.out.println(yytext() + " : "+ TokenType.KEYWORD);
            }
            // fall through
          case 25: break;
          case 12:
            { String temp = yytext();
        
        String name_ = temp.substring(0,temp.indexOf("=")); 
        name_ = name_.replaceAll("\\s", "");

        String value_ = temp.substring(temp.indexOf("=")+1,temp.length());
        value_ = value_.replaceFirst("\\s*", "");

        if(getToken(name_,table)==0){
            table.add(new Token(++counter , name_ , "N/A" , value_));
        }
        else{
            table.elementAt(getToken(name_,table)-1).Value = value_;
        }
        
        System.out.println(name_ + " : "+ TokenType.IDENTIFIER);
        System.out.println("=" + " : "+ TokenType.OPERATOR);
        System.out.println(value_ + " : "+ TokenType.LITERAL);
            }
            // fall through
          case 26: break;
          case 13:
            { String temp = yytext();
        
        String type_ = temp.substring(0, temp.indexOf(" "));
        temp = temp.substring(temp.indexOf(" "), temp.length());

        temp = temp.replaceAll("\\s", "");

        String name_ = temp.substring(0,temp.length()); 

        if(getToken(name_,table)==0){
            table.add(new Token(++counter , name_ , type_ , "N/A" ));
        }
        else{
            table.elementAt(getToken(name_,table)-1).Type = type_;
        }

        System.out.println(type_ + " : "+ TokenType.KEYWORD);
        System.out.println(name_ + " : "+ TokenType.IDENTIFIER);
            }
            // fall through
          case 27: break;
          case 14:
            { String temp = yytext();
        
        String type_ = temp.substring(0, temp.indexOf(" "));
       
        temp = temp.substring(temp.indexOf(" "), temp.length());

        String name_ = temp.substring(0,temp.indexOf("="));
        name_ = name_.replaceAll("\\s", "");

        String value_ = temp.substring(temp.indexOf("=")+1,temp.length());
        value_ = value_.replaceFirst("\\s*", "");

        if(getToken(name_,table)==0){
            table.add(new Token(++counter , name_ , type_ , value_));
        }
        else{
            table.elementAt(getToken(name_,table)-1).Value = value_;
        }

        System.out.println(type_ + " : "+ TokenType.KEYWORD);
        System.out.println(name_ + " : "+ TokenType.IDENTIFIER);
        System.out.println("=" + " : "+ TokenType.OPERATOR);
        System.out.println(value_ + " : "+ TokenType.LITERAL);
            }
            // fall through
          case 28: break;
          default:
            zzScanError(ZZ_NO_MATCH);
        }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This is a standalone scanner, it will print any unmatched
   * text to System.out unchanged.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String[] argv) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexical [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          // Side-effect: is encodingName valid?
          java.nio.charset.Charset.forName(encodingName);
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexical scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexical(reader);
          while ( !scanner.zzAtEOF ) scanner.yylex();
        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}
