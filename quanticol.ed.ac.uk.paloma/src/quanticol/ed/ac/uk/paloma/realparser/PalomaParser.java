/* Generated By:JavaCC: Do not edit this line. PalomaParser.java */
package quanticol.ed.ac.uk.paloma.realparser;

import quanticol.ed.ac.uk.paloma.framework.GlobalManager;
import quanticol.ed.ac.uk.paloma.framework.Agent;
import quanticol.ed.ac.uk.paloma.model.ExpEvaluator;
import quanticol.ed.ac.uk.paloma.model.State;
import quanticol.ed.ac.uk.paloma.model.action.*;
import quanticol.ed.ac.uk.paloma.utality.Utality;

/*package realparser;

import framework.GlobalManager;
import framework.Agent;
import model.ExpEvaluator;
import model.State;
import model.action.*;
import utality.Utality;*/


public class PalomaParser implements PalomaParserConstants {

    public PalomaParser() {
        this(new java.io.StringReader(""));
    }

    public void parseFromString( String modelDef ) throws ParseException, TokenMgrError, NumberFormatException {
        this.ReInit(new java.io.StringReader(modelDef));
        this.Start();
    }

    public void parseFromFile( String filename ) throws ParseException, TokenMgrError, NumberFormatException {
        try { this.ReInit(new java.io.FileReader(filename)); }
        catch(java.io.IOException e) {throw new ParseException("Error while opening file " + filename + ": " + e); }
        this.Start();
    }

/***********************************************
GRAMMAR RULES
***********************************************/
  final public void Start() throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token t;
    boolean states = false, agents = false, sub = false, comp = false, cont = false;
    jj_consume_token(SECTION_PARAM);
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case KEYWORD_PARAM:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      Param();
    }
    jj_consume_token(SECTION_STATES);
                 states = true;
    label_2:
    while (true) {
      State();
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case IDENTIFIER:
        ;
        break;
      default:
        jj_la1[1] = jj_gen;
        break label_2;
      }
    }
    jj_consume_token(SECTION_AGENTS);
     agents = true;
    Agent();
      if (!states && !agents)
        {if (true) throw new ParseException("Some model sections are missing");}
    jj_consume_token(0);
  }

  final public void Param() throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token t1,t2;
    State st;
    jj_consume_token(KEYWORD_PARAM);
    t1 = jj_consume_token(IDENTIFIER);
    jj_consume_token(ASSIGN);
    t2 = jj_consume_token(MATH_EXPR);
    jj_consume_token(EOL);
        double value = ExpEvaluator.evalParamExp(t2.image);
        if(value == Utality.ERROR_NUM) {
            {if (true) throw new ParseException("line " + t2.beginLine + " colum " + t2.beginColumn +": "+t1.image +" not correctly defined!");}
        }
        if(!GlobalManager.getParamManager().isParamExist(t1.image)) {
            GlobalManager.getParamManager().addParam(t1.image, value);
        }
  }

  final public void State() throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token t,x,y;
    State st;
    t = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    jj_consume_token(COMMA);
    y = jj_consume_token(MATH_PARAM);
    jj_consume_token(RR);
     st = new State(t.image, Integer.parseInt(x.image), Integer.parseInt(y.image));
    jj_consume_token(DEFINE);
    Action(st);
    label_3:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        ;
        break;
      default:
        jj_la1[2] = jj_gen;
        break label_3;
      }
      jj_consume_token(PLUS);
      Action(st);
    }
    jj_consume_token(EOL);
        GlobalManager.getStateManager().putState(st);
  }

  final public void Action(State st) throws ParseException, NumberFormatException, RuntimeException, ParseException {
    int type = Action.ACTION_TYPE_SpNoMsg;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LR:
    case QUEST:
    case EXCL:
      if (jj_2_1(2)) {
        SpNoMsgAction(st);
      } else if (jj_2_2(2)) {
        SpBrAction(st);
      } else if (jj_2_3(2)) {
        SpUnAction(st);
      } else if (jj_2_4(2)) {
        InBrAction(st);
      } else if (jj_2_5(2)) {
        InUnAction(st);
      } else {
        jj_consume_token(-1);
        throw new ParseException();
      }
      break;
    default:
      jj_la1[3] = jj_gen;
      ;
    }
  }

  final public void SpNoMsgAction(State st) throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token name, rate=null, nextState, x, y;
    String strName = null;
    boolean paramRate = false;
    jj_consume_token(LR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      name = jj_consume_token(IDENTIFIER);
         strName = name.image;
      break;
    default:
      jj_la1[4] = jj_gen;
      ;
    }
    jj_consume_token(COMMA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_PARAM:
      rate = jj_consume_token(MATH_PARAM);
      break;
    default:
      jj_la1[5] = jj_gen;
      ;
    }
    jj_consume_token(RR);
    jj_consume_token(DOT);
    nextState = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    jj_consume_token(COMMA);
    y = jj_consume_token(MATH_PARAM);
    jj_consume_token(RR);
        double actionRate = ExpEvaluator.evalParamExp(rate.image);
        if(actionRate == Utality.ERROR_NUM || actionRate < 0) {
            {if (true) throw new ParseException("line " + rate.beginLine + " colum " + rate.beginColumn +": "+rate.image +" not correctly defined!");}
        }

        SpNoMsgAction ac = new SpNoMsgAction(strName, actionRate, State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)));
        st.addAction(ac);
        if(GlobalManager.getOrphanMap().get(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image))) == null) {
            GlobalManager.getOrphanMap().put(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)),-1);
        }
  }

  final public void SpBrAction(State st) throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token name, rate=null, nextState, x, y, range=null;
    String strName = null;
    boolean paramRate = false;
    jj_consume_token(EXCL);
    jj_consume_token(LR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      name = jj_consume_token(IDENTIFIER);
         strName = name.image;
      break;
    default:
      jj_la1[6] = jj_gen;
      ;
    }
    jj_consume_token(COMMA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_PARAM:
      rate = jj_consume_token(MATH_PARAM);
      break;
    default:
      jj_la1[7] = jj_gen;
      ;
    }
    jj_consume_token(RR);
    jj_consume_token(AT);
    jj_consume_token(KEYWORD_RNG);
    jj_consume_token(LBRAC);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_EXPR:
      range = jj_consume_token(MATH_EXPR);
      break;
    default:
      jj_la1[8] = jj_gen;
      ;
    }
    jj_consume_token(RBRAC);
    jj_consume_token(DOT);
    nextState = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    jj_consume_token(COMMA);
    y = jj_consume_token(MATH_PARAM);
    jj_consume_token(RR);
        double actionRate = ExpEvaluator.evalParamExp(rate.image);
        if(actionRate == Utality.ERROR_NUM || actionRate < 0) {
            {if (true) throw new ParseException("line " + rate.beginLine + " colum " + rate.beginColumn +": "+rate.image +" not correctly defined!");}
        }
        SpBrAction ac = new SpBrAction(strName, actionRate, range.image, State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)));
        st.addAction(ac);
        if(GlobalManager.getOrphanMap().get(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image))) == null) {
            GlobalManager.getOrphanMap().put(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)),-1);
        }
  }

  final public void SpUnAction(State st) throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token name, rate=null, nextState, x, y, range=null;
    String strName = null;
    boolean paramRate = false;
    jj_consume_token(EXCL);
    jj_consume_token(EXCL);
    jj_consume_token(LR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      name = jj_consume_token(IDENTIFIER);
         strName = name.image;
      break;
    default:
      jj_la1[9] = jj_gen;
      ;
    }
    jj_consume_token(COMMA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_PARAM:
      rate = jj_consume_token(MATH_PARAM);
      break;
    default:
      jj_la1[10] = jj_gen;
      ;
    }
    jj_consume_token(RR);
    jj_consume_token(AT);
    jj_consume_token(KEYWORD_RNG);
    jj_consume_token(LBRAC);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_EXPR:
      range = jj_consume_token(MATH_EXPR);
      break;
    default:
      jj_la1[11] = jj_gen;
      ;
    }
    jj_consume_token(RBRAC);
    jj_consume_token(DOT);
    nextState = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    jj_consume_token(COMMA);
    y = jj_consume_token(MATH_PARAM);
    jj_consume_token(RR);
        double actionRate = ExpEvaluator.evalParamExp(rate.image);
        if(actionRate == Utality.ERROR_NUM || actionRate < 0) {
            {if (true) throw new ParseException("line " + rate.beginLine + " colum " + rate.beginColumn +": "+rate.image +" not correctly defined!");}
        }
        SpUnAction ac = new SpUnAction(strName, actionRate, range.image, State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)));
        st.addAction(ac);
        if(GlobalManager.getOrphanMap().get(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image))) == null) {
            GlobalManager.getOrphanMap().put(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)),-1);
        }
  }

  final public void InUnAction(State st) throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token name, rate=null, nextState, x, y, pri=null;
    String strName = null;
    boolean paramRate = false;
    jj_consume_token(QUEST);
    jj_consume_token(QUEST);
    jj_consume_token(LR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      name = jj_consume_token(IDENTIFIER);
         strName = name.image;
      break;
    default:
      jj_la1[12] = jj_gen;
      ;
    }
    jj_consume_token(COMMA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_PARAM:
      rate = jj_consume_token(MATH_PARAM);
      break;
    default:
      jj_la1[13] = jj_gen;
      ;
    }
    jj_consume_token(RR);
    jj_consume_token(AT);
    jj_consume_token(KEYWORD_WT);
    jj_consume_token(LBRAC);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_EXPR:
      pri = jj_consume_token(MATH_EXPR);
      break;
    default:
      jj_la1[14] = jj_gen;
      ;
    }
    jj_consume_token(RBRAC);
    jj_consume_token(DOT);
    nextState = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    jj_consume_token(COMMA);
    y = jj_consume_token(MATH_PARAM);
    jj_consume_token(RR);
        double actionRate = ExpEvaluator.evalParamExp(rate.image);
        if(actionRate == Utality.ERROR_NUM || actionRate < 0) {
            {if (true) throw new ParseException("line " + rate.beginLine + " colum " + rate.beginColumn +": "+rate.image +" not correctly defined!");}
        }
        InUnAction ac = new InUnAction(strName, actionRate, pri.image, State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)));
        st.addAction(ac);
        if(GlobalManager.getOrphanMap().get(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image))) == null) {
            GlobalManager.getOrphanMap().put(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)),-1);
        }
  }

  final public void InBrAction(State st) throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token name, rate=null, nextState, x, y, pr=null;
    String strName = null;
    boolean paramRate = false;
    jj_consume_token(QUEST);
    jj_consume_token(LR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IDENTIFIER:
      name = jj_consume_token(IDENTIFIER);
         strName = name.image;
      break;
    default:
      jj_la1[15] = jj_gen;
      ;
    }
    jj_consume_token(COMMA);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_PARAM:
      rate = jj_consume_token(MATH_PARAM);
      break;
    default:
      jj_la1[16] = jj_gen;
      ;
    }
    jj_consume_token(RR);
    jj_consume_token(AT);
    jj_consume_token(KEYWORD_PR);
    jj_consume_token(LBRAC);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case MATH_EXPR:
      pr = jj_consume_token(MATH_EXPR);
      break;
    default:
      jj_la1[17] = jj_gen;
      ;
    }
    jj_consume_token(RBRAC);
    jj_consume_token(DOT);
    nextState = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    jj_consume_token(COMMA);
    y = jj_consume_token(MATH_PARAM);
    jj_consume_token(RR);
        double actionRate = ExpEvaluator.evalParamExp(rate.image);
        if(actionRate == Utality.ERROR_NUM || actionRate < 0) {
            {if (true) throw new ParseException("line " + rate.beginLine + " colum " + rate.beginColumn +": "+rate.image +" not correctly defined!");}
        }
        InBrAction ac = new InBrAction(strName, actionRate, pr.image, State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)));
        st.addAction(ac);
        if(GlobalManager.getOrphanMap().get(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image))) == null) {
            GlobalManager.getOrphanMap().put(State.genStateID(nextState.image, Integer.parseInt(x.image), Integer.parseInt(y.image)),-1);
        }
  }

  final public void Agent() throws ParseException, NumberFormatException, RuntimeException, ParseException {
    AtomAgent();
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PARALLEL:
        ;
        break;
      default:
        jj_la1[18] = jj_gen;
        break label_4;
      }
      jj_consume_token(PARALLEL);
      AtomAgent();
    }
        for(String orphan: GlobalManager.getOrphanMap().keySet()) {
            if(GlobalManager.getStateManager().getState(orphan) == null) {
                int index = orphan.indexOf("(");
                String name = orphan.substring(0,index);
                String loc = orphan.substring(index);
                loc = loc.substring(1,loc.indexOf(")"));
                String[] xy = loc.split(",");
                String x = xy[0]; String y = xy[1];
                State st = new State(name, Integer.parseInt(x), Integer.parseInt(y));
                GlobalManager.getStateManager().putState(st);
            }
        }
  }

  final public void AtomAgent() throws ParseException, NumberFormatException, RuntimeException, ParseException {
    Token t,x,y,t2=null;
    State st;
    int num = 1;
    t = jj_consume_token(IDENTIFIER);
    jj_consume_token(LR);
    x = jj_consume_token(INT);
    jj_consume_token(COMMA);
    y = jj_consume_token(MATH_PARAM);
    jj_consume_token(RR);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case LSQ:
      jj_consume_token(LSQ);
      t2 = jj_consume_token(INT);
      jj_consume_token(RSQ);
      break;
    default:
      jj_la1[19] = jj_gen;
      ;
    }
        if(t2 != null) {
                num = Integer.parseInt(t2.image);
        }

        Agent ag = new Agent(State.genStateID(t.image, Integer.parseInt(x.image), Integer.parseInt(y.image)), num);
        GlobalManager.addAgent(ag);
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_2_2(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_2(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(1, xla); }
  }

  private boolean jj_2_3(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_3(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(2, xla); }
  }

  private boolean jj_2_4(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_4(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(3, xla); }
  }

  private boolean jj_2_5(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_5(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(4, xla); }
  }

  private boolean jj_3_4() {
    if (jj_3R_8()) return true;
    return false;
  }

  private boolean jj_3_3() {
    if (jj_3R_7()) return true;
    return false;
  }

  private boolean jj_3R_10() {
    if (jj_scan_token(IDENTIFIER)) return true;
    return false;
  }

  private boolean jj_3_2() {
    if (jj_3R_6()) return true;
    return false;
  }

  private boolean jj_3_1() {
    if (jj_3R_5()) return true;
    return false;
  }

  private boolean jj_3R_5() {
    if (jj_scan_token(LR)) return true;
    Token xsp;
    xsp = jj_scanpos;
    if (jj_3R_10()) jj_scanpos = xsp;
    if (jj_scan_token(COMMA)) return true;
    return false;
  }

  private boolean jj_3R_6() {
    if (jj_scan_token(EXCL)) return true;
    if (jj_scan_token(LR)) return true;
    return false;
  }

  private boolean jj_3R_9() {
    if (jj_scan_token(QUEST)) return true;
    if (jj_scan_token(QUEST)) return true;
    return false;
  }

  private boolean jj_3R_8() {
    if (jj_scan_token(QUEST)) return true;
    if (jj_scan_token(LR)) return true;
    return false;
  }

  private boolean jj_3_5() {
    if (jj_3R_9()) return true;
    return false;
  }

  private boolean jj_3R_7() {
    if (jj_scan_token(EXCL)) return true;
    if (jj_scan_token(EXCL)) return true;
    return false;
  }

  /** Generated Token Manager. */
  public PalomaParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  private int jj_gen;
  final private int[] jj_la1 = new int[20];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x10000,0x0,0x200000,0x20000000,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x0,0x8000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x0,0x1000,0x0,0x6,0x1000,0x80000,0x1000,0x80000,0x2000,0x1000,0x80000,0x2000,0x1000,0x80000,0x2000,0x1000,0x80000,0x2000,0x200,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[5];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public PalomaParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public PalomaParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new PalomaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public PalomaParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new PalomaParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public PalomaParser(PalomaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(PalomaParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 20; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      jj_entries_loop: for (java.util.Iterator<?> it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              continue jj_entries_loop;
            }
          }
          jj_expentries.add(jj_expentry);
          break jj_entries_loop;
        }
      }
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[54];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 20; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 54; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  final public void enable_tracing() {
  }

  /** Disable tracing. */
  final public void disable_tracing() {
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 5; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
            case 1: jj_3_2(); break;
            case 2: jj_3_3(); break;
            case 3: jj_3_4(); break;
            case 4: jj_3_5(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
