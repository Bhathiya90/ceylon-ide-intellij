// $ANTLR 3.4 /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g 2013-10-19 16:02:20
 package com.redhat.ceylon.compiler.typechecker.parser;
import com.redhat.ceylon.compiler.typechecker.tree.Node;
import static com.redhat.ceylon.compiler.typechecker.tree.CustomTree.*;
import static com.redhat.ceylon.compiler.typechecker.tree.CustomTree.Package;

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class CeylonParser extends Parser {
    public static final String[] tokenNames = new String[] {
            "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ABSTRACTED_TYPE", "ADD_SPECIFY", "AIDENTIFIER", "ALIAS", "AND_OP", "AND_SPECIFY", "ASSEMBLY", "ASSERT", "ASSIGN", "ASTRING_LITERAL", "AVERBATIM_STRING", "BACKTICK", "BREAK", "BinaryDigit", "BinaryDigits", "CASE_CLAUSE", "CASE_TYPES", "CATCH_CLAUSE", "CHAR_LITERAL", "CLASS_DEFINITION", "COMMA", "COMPARE_OP", "COMPILER_ANNOTATION", "COMPLEMENT_OP", "COMPLEMENT_SPECIFY", "COMPUTE", "CONTINUE", "CharPart", "DECREMENT_OP", "DIFFERENCE_OP", "DIVIDE_SPECIFY", "DYNAMIC", "Digit", "Digits", "ELLIPSIS", "ELSE_CLAUSE", "ENTRY_OP", "EQUAL_OP", "EXISTS", "EXTENDS", "EscapeSequence", "Exponent", "FINALLY_CLAUSE", "FLOAT_LITERAL", "FOR_CLAUSE", "FUNCTION_MODIFIER", "FractionalMagnitude", "HexDigit", "HexDigits", "IDENTICAL_OP", "IF_CLAUSE", "IMPORT", "INCREMENT_OP", "INTERFACE_DEFINITION", "INTERSECTION_OP", "INTERSECT_SPECIFY", "IN_OP", "IS_OP", "IdentifierPart", "IdentifierStart", "LARGER_OP", "LARGE_AS_OP", "LBRACE", "LBRACKET", "LIDENTIFIER", "LINE_COMMENT", "LIdentifierPrefix", "LPAREN", "Letter", "MEMBER_OP", "MODULE", "MULTIPLY_SPECIFY", "MULTI_COMMENT", "Magnitude", "NATURAL_LITERAL", "NONEMPTY", "NOT_EQUAL_OP", "NOT_OP", "OBJECT_DEFINITION", "OPTIONAL", "OR_OP", "OR_SPECIFY", "OUT", "OUTER", "PACKAGE", "PIDENTIFIER", "POWER_OP", "PRODUCT_OP", "QUOTIENT_OP", "RANGE_OP", "RBRACE", "RBRACKET", "REMAINDER_OP", "REMAINDER_SPECIFY", "RETURN", "RPAREN", "SAFE_MEMBER_OP", "SATISFIES", "SCALE_OP", "SEGMENT_OP", "SEMICOLON", "SMALLER_OP", "SMALL_AS_OP", "SPECIFY", "SPREAD_OP", "STRING_END", "STRING_LITERAL", "STRING_MID", "STRING_START", "SUBTRACT_SPECIFY", "SUM_OP", "SUPER", "SWITCH_CLAUSE", "StringPart", "THEN_CLAUSE", "THIS", "THROW", "TRY_CLAUSE", "TYPE_CONSTRAINT", "UIDENTIFIER", "UIdentifierPrefix", "UNION_OP", "UNION_SPECIFY", "VALUE_MODIFIER", "VERBATIM_STRING", "VOID_MODIFIER", "WHILE_CLAUSE", "WS"
    };

    public static final int EOF=-1;
    public static final int ABSTRACTED_TYPE=4;
    public static final int ADD_SPECIFY=5;
    public static final int AIDENTIFIER=6;
    public static final int ALIAS=7;
    public static final int AND_OP=8;
    public static final int AND_SPECIFY=9;
    public static final int ASSEMBLY=10;
    public static final int ASSERT=11;
    public static final int ASSIGN=12;
    public static final int ASTRING_LITERAL=13;
    public static final int AVERBATIM_STRING=14;
    public static final int BACKTICK=15;
    public static final int BREAK=16;
    public static final int BinaryDigit=17;
    public static final int BinaryDigits=18;
    public static final int CASE_CLAUSE=19;
    public static final int CASE_TYPES=20;
    public static final int CATCH_CLAUSE=21;
    public static final int CHAR_LITERAL=22;
    public static final int CLASS_DEFINITION=23;
    public static final int COMMA=24;
    public static final int COMPARE_OP=25;
    public static final int COMPILER_ANNOTATION=26;
    public static final int COMPLEMENT_OP=27;
    public static final int COMPLEMENT_SPECIFY=28;
    public static final int COMPUTE=29;
    public static final int CONTINUE=30;
    public static final int CharPart=31;
    public static final int DECREMENT_OP=32;
    public static final int DIFFERENCE_OP=33;
    public static final int DIVIDE_SPECIFY=34;
    public static final int DYNAMIC=35;
    public static final int Digit=36;
    public static final int Digits=37;
    public static final int ELLIPSIS=38;
    public static final int ELSE_CLAUSE=39;
    public static final int ENTRY_OP=40;
    public static final int EQUAL_OP=41;
    public static final int EXISTS=42;
    public static final int EXTENDS=43;
    public static final int EscapeSequence=44;
    public static final int Exponent=45;
    public static final int FINALLY_CLAUSE=46;
    public static final int FLOAT_LITERAL=47;
    public static final int FOR_CLAUSE=48;
    public static final int FUNCTION_MODIFIER=49;
    public static final int FractionalMagnitude=50;
    public static final int HexDigit=51;
    public static final int HexDigits=52;
    public static final int IDENTICAL_OP=53;
    public static final int IF_CLAUSE=54;
    public static final int IMPORT=55;
    public static final int INCREMENT_OP=56;
    public static final int INTERFACE_DEFINITION=57;
    public static final int INTERSECTION_OP=58;
    public static final int INTERSECT_SPECIFY=59;
    public static final int IN_OP=60;
    public static final int IS_OP=61;
    public static final int IdentifierPart=62;
    public static final int IdentifierStart=63;
    public static final int LARGER_OP=64;
    public static final int LARGE_AS_OP=65;
    public static final int LBRACE=66;
    public static final int LBRACKET=67;
    public static final int LIDENTIFIER=68;
    public static final int LINE_COMMENT=69;
    public static final int LIdentifierPrefix=70;
    public static final int LPAREN=71;
    public static final int Letter=72;
    public static final int MEMBER_OP=73;
    public static final int MODULE=74;
    public static final int MULTIPLY_SPECIFY=75;
    public static final int MULTI_COMMENT=76;
    public static final int Magnitude=77;
    public static final int NATURAL_LITERAL=78;
    public static final int NONEMPTY=79;
    public static final int NOT_EQUAL_OP=80;
    public static final int NOT_OP=81;
    public static final int OBJECT_DEFINITION=82;
    public static final int OPTIONAL=83;
    public static final int OR_OP=84;
    public static final int OR_SPECIFY=85;
    public static final int OUT=86;
    public static final int OUTER=87;
    public static final int PACKAGE=88;
    public static final int PIDENTIFIER=89;
    public static final int POWER_OP=90;
    public static final int PRODUCT_OP=91;
    public static final int QUOTIENT_OP=92;
    public static final int RANGE_OP=93;
    public static final int RBRACE=94;
    public static final int RBRACKET=95;
    public static final int REMAINDER_OP=96;
    public static final int REMAINDER_SPECIFY=97;
    public static final int RETURN=98;
    public static final int RPAREN=99;
    public static final int SAFE_MEMBER_OP=100;
    public static final int SATISFIES=101;
    public static final int SCALE_OP=102;
    public static final int SEGMENT_OP=103;
    public static final int SEMICOLON=104;
    public static final int SMALLER_OP=105;
    public static final int SMALL_AS_OP=106;
    public static final int SPECIFY=107;
    public static final int SPREAD_OP=108;
    public static final int STRING_END=109;
    public static final int STRING_LITERAL=110;
    public static final int STRING_MID=111;
    public static final int STRING_START=112;
    public static final int SUBTRACT_SPECIFY=113;
    public static final int SUM_OP=114;
    public static final int SUPER=115;
    public static final int SWITCH_CLAUSE=116;
    public static final int StringPart=117;
    public static final int THEN_CLAUSE=118;
    public static final int THIS=119;
    public static final int THROW=120;
    public static final int TRY_CLAUSE=121;
    public static final int TYPE_CONSTRAINT=122;
    public static final int UIDENTIFIER=123;
    public static final int UIdentifierPrefix=124;
    public static final int UNION_OP=125;
    public static final int UNION_SPECIFY=126;
    public static final int VALUE_MODIFIER=127;
    public static final int VERBATIM_STRING=128;
    public static final int VOID_MODIFIER=129;
    public static final int WHILE_CLAUSE=130;
    public static final int WS=131;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public CeylonParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public CeylonParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
        this.state.ruleMemo = new HashMap[239+1];
         

    }

    public String[] getTokenNames() { return CeylonParser.tokenNames; }
    public String getGrammarFileName() { return "/Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g"; }


        private java.util.List<ParseError> errors 
                = new java.util.ArrayList<ParseError>();
        @Override public void displayRecognitionError(String[] tn,
                RecognitionException re) {
            errors.add(new ParseError(this, re, tn));
        }
        public void displayRecognitionError(String[] tn, RecognitionException re, int code) {
            errors.add(new ParseError(this, re, tn, code));
        }
        public java.util.List<ParseError> getErrors() {
            return errors;
        }
        int expecting=-1;



    // $ANTLR start "compilationUnit"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:41:1: compilationUnit returns [CompilationUnit compilationUnit] : (ca1= compilerAnnotations SEMICOLON )? ( importDeclaration | ( compilerAnnotations annotations MODULE )=> moduleDescriptor | ( compilerAnnotations annotations PACKAGE )=> packageDescriptor |ca2= compilerAnnotations declaration )* EOF ;
    public CompilationUnit compilationUnit() throws RecognitionException {
        CompilationUnit compilationUnit = null;


        List<CompilerAnnotation> ca1 =null;

        List<CompilerAnnotation> ca2 =null;

        Import importDeclaration1 =null;

        ModuleDescriptor moduleDescriptor2 =null;

        PackageDescriptor packageDescriptor3 =null;

        Declaration declaration4 =null;


         compilationUnit = new CompilationUnit(null);
                     ImportList importList = new ImportList(null);
                     compilationUnit.setImportList(importList); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:45:5: ( (ca1= compilerAnnotations SEMICOLON )? ( importDeclaration | ( compilerAnnotations annotations MODULE )=> moduleDescriptor | ( compilerAnnotations annotations PACKAGE )=> packageDescriptor |ca2= compilerAnnotations declaration )* EOF )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:45:7: (ca1= compilerAnnotations SEMICOLON )? ( importDeclaration | ( compilerAnnotations annotations MODULE )=> moduleDescriptor | ( compilerAnnotations annotations PACKAGE )=> packageDescriptor |ca2= compilerAnnotations declaration )* EOF
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:45:7: (ca1= compilerAnnotations SEMICOLON )?
            int alt1=2;
            alt1 = dfa1.predict(input);
            switch (alt1) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:46:9: ca1= compilerAnnotations SEMICOLON
                    {
                    pushFollow(FOLLOW_compilerAnnotations_in_compilationUnit86);
                    ca1=compilerAnnotations();

                    state._fsp--;
                    if (state.failed) return compilationUnit;

                    match(input,SEMICOLON,FOLLOW_SEMICOLON_in_compilationUnit96); if (state.failed) return compilationUnit;

                    if ( state.backtracking==0 ) { compilationUnit.getCompilerAnnotations().addAll(ca1); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:50:7: ( importDeclaration | ( compilerAnnotations annotations MODULE )=> moduleDescriptor | ( compilerAnnotations annotations PACKAGE )=> packageDescriptor |ca2= compilerAnnotations declaration )*
            loop2:
            do {
                int alt2=5;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==IMPORT) ) {
                    alt2=1;
                }
                else if ( (LA2_0==COMPILER_ANNOTATION) ) {
                    int LA2_3 = input.LA(2);

                    if ( (synpred1_Ceylon()) ) {
                        alt2=2;
                    }
                    else if ( (synpred2_Ceylon()) ) {
                        alt2=3;
                    }
                    else if ( (true) ) {
                        alt2=4;
                    }


                }
                else if ( (LA2_0==STRING_LITERAL) ) {
                    int LA2_4 = input.LA(2);

                    if ( (synpred1_Ceylon()) ) {
                        alt2=2;
                    }
                    else if ( (synpred2_Ceylon()) ) {
                        alt2=3;
                    }
                    else if ( (true) ) {
                        alt2=4;
                    }


                }
                else if ( (LA2_0==VERBATIM_STRING) ) {
                    int LA2_5 = input.LA(2);

                    if ( (synpred1_Ceylon()) ) {
                        alt2=2;
                    }
                    else if ( (synpred2_Ceylon()) ) {
                        alt2=3;
                    }
                    else if ( (true) ) {
                        alt2=4;
                    }


                }
                else if ( (LA2_0==LIDENTIFIER) ) {
                    int LA2_6 = input.LA(2);

                    if ( (synpred1_Ceylon()) ) {
                        alt2=2;
                    }
                    else if ( (synpred2_Ceylon()) ) {
                        alt2=3;
                    }
                    else if ( (true) ) {
                        alt2=4;
                    }


                }
                else if ( (LA2_0==MODULE) && (synpred1_Ceylon())) {
                    alt2=2;
                }
                else if ( (LA2_0==PACKAGE) && (synpred2_Ceylon())) {
                    alt2=3;
                }
                else if ( (LA2_0==ALIAS||LA2_0==ASSIGN||LA2_0==CLASS_DEFINITION||LA2_0==DYNAMIC||LA2_0==FUNCTION_MODIFIER||LA2_0==INTERFACE_DEFINITION||(LA2_0 >= LBRACE && LA2_0 <= LBRACKET)||LA2_0==OBJECT_DEFINITION||LA2_0==SMALLER_OP||LA2_0==UIDENTIFIER||LA2_0==VALUE_MODIFIER||LA2_0==VOID_MODIFIER) ) {
                    alt2=4;
                }


                switch (alt2) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:51:9: importDeclaration
            	    {
            	    pushFollow(FOLLOW_importDeclaration_in_compilationUnit134);
            	    importDeclaration1=importDeclaration();

            	    state._fsp--;
            	    if (state.failed) return compilationUnit;

            	    if ( state.backtracking==0 ) { importList.addImport(importDeclaration1); }

            	    }
            	    break;
            	case 2 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:54:9: ( compilerAnnotations annotations MODULE )=> moduleDescriptor
            	    {
            	    pushFollow(FOLLOW_moduleDescriptor_in_compilationUnit180);
            	    moduleDescriptor2=moduleDescriptor();

            	    state._fsp--;
            	    if (state.failed) return compilationUnit;

            	    if ( state.backtracking==0 ) { compilationUnit.addModuleDescriptor(moduleDescriptor2); }

            	    }
            	    break;
            	case 3 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:58:9: ( compilerAnnotations annotations PACKAGE )=> packageDescriptor
            	    {
            	    pushFollow(FOLLOW_packageDescriptor_in_compilationUnit226);
            	    packageDescriptor3=packageDescriptor();

            	    state._fsp--;
            	    if (state.failed) return compilationUnit;

            	    if ( state.backtracking==0 ) { compilationUnit.addPackageDescriptor(packageDescriptor3); }

            	    }
            	    break;
            	case 4 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:62:9: ca2= compilerAnnotations declaration
            	    {
            	    pushFollow(FOLLOW_compilerAnnotations_in_compilationUnit256);
            	    ca2=compilerAnnotations();

            	    state._fsp--;
            	    if (state.failed) return compilationUnit;

            	    pushFollow(FOLLOW_declaration_in_compilationUnit258);
            	    declaration4=declaration();

            	    state._fsp--;
            	    if (state.failed) return compilationUnit;

            	    if ( state.backtracking==0 ) { if (declaration4!=null)
            	                  compilationUnit.addDeclaration(declaration4); 
            	              if (declaration4!=null)
            	                  declaration4.getCompilerAnnotations().addAll(ca2); }

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            match(input,EOF,FOLLOW_EOF_in_compilationUnit286); if (state.failed) return compilationUnit;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return compilationUnit;
    }
    // $ANTLR end "compilationUnit"



    // $ANTLR start "moduleDescriptor"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:71:1: moduleDescriptor returns [ModuleDescriptor moduleDescriptor] : compilerAnnotations annotations MODULE packagePath ( CHAR_LITERAL | STRING_LITERAL ) importModuleList ;
    public ModuleDescriptor moduleDescriptor() throws RecognitionException {
        ModuleDescriptor moduleDescriptor = null;


        Token MODULE5=null;
        Token CHAR_LITERAL9=null;
        Token STRING_LITERAL10=null;
        AnnotationList annotations6 =null;

        List<CompilerAnnotation> compilerAnnotations7 =null;

        ImportPath packagePath8 =null;

        ImportModuleList importModuleList11 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:72:5: ( compilerAnnotations annotations MODULE packagePath ( CHAR_LITERAL | STRING_LITERAL ) importModuleList )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:72:7: compilerAnnotations annotations MODULE packagePath ( CHAR_LITERAL | STRING_LITERAL ) importModuleList
            {
            pushFollow(FOLLOW_compilerAnnotations_in_moduleDescriptor307);
            compilerAnnotations7=compilerAnnotations();

            state._fsp--;
            if (state.failed) return moduleDescriptor;

            pushFollow(FOLLOW_annotations_in_moduleDescriptor309);
            annotations6=annotations();

            state._fsp--;
            if (state.failed) return moduleDescriptor;

            MODULE5=(Token)match(input,MODULE,FOLLOW_MODULE_in_moduleDescriptor317); if (state.failed) return moduleDescriptor;

            if ( state.backtracking==0 ) { moduleDescriptor = new ModuleDescriptor(MODULE5); 
                    moduleDescriptor.setAnnotationList(annotations6);
                    moduleDescriptor.getCompilerAnnotations().addAll(compilerAnnotations7); }

            pushFollow(FOLLOW_packagePath_in_moduleDescriptor334);
            packagePath8=packagePath();

            state._fsp--;
            if (state.failed) return moduleDescriptor;

            if ( state.backtracking==0 ) { moduleDescriptor.setImportPath(packagePath8); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:79:7: ( CHAR_LITERAL | STRING_LITERAL )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==CHAR_LITERAL) ) {
                alt3=1;
            }
            else if ( (LA3_0==STRING_LITERAL) ) {
                alt3=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return moduleDescriptor;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:80:9: CHAR_LITERAL
                    {
                    CHAR_LITERAL9=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_moduleDescriptor360); if (state.failed) return moduleDescriptor;

                    if ( state.backtracking==0 ) { moduleDescriptor.setVersion(new QuotedLiteral(CHAR_LITERAL9)); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:83:9: STRING_LITERAL
                    {
                    STRING_LITERAL10=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_moduleDescriptor388); if (state.failed) return moduleDescriptor;

                    if ( state.backtracking==0 ) { moduleDescriptor.setVersion(new QuotedLiteral(STRING_LITERAL10)); }

                    }
                    break;

            }


            pushFollow(FOLLOW_importModuleList_in_moduleDescriptor414);
            importModuleList11=importModuleList();

            state._fsp--;
            if (state.failed) return moduleDescriptor;

            if ( state.backtracking==0 ) { moduleDescriptor.setImportModuleList(importModuleList11); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return moduleDescriptor;
    }
    // $ANTLR end "moduleDescriptor"



    // $ANTLR start "importModuleList"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:90:1: importModuleList returns [ImportModuleList importModuleList] : LBRACE ( compilerAnnotations annotations importModule )* RBRACE ;
    public ImportModuleList importModuleList() throws RecognitionException {
        ImportModuleList importModuleList = null;


        Token LBRACE12=null;
        Token RBRACE16=null;
        ImportModule importModule13 =null;

        AnnotationList annotations14 =null;

        List<CompilerAnnotation> compilerAnnotations15 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:91:5: ( LBRACE ( compilerAnnotations annotations importModule )* RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:91:7: LBRACE ( compilerAnnotations annotations importModule )* RBRACE
            {
            LBRACE12=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_importModuleList443); if (state.failed) return importModuleList;

            if ( state.backtracking==0 ) { importModuleList = new ImportModuleList(LBRACE12); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:93:7: ( compilerAnnotations annotations importModule )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ALIAS||(LA4_0 >= ASSERT && LA4_0 <= ASSIGN)||(LA4_0 >= BACKTICK && LA4_0 <= BREAK)||(LA4_0 >= CHAR_LITERAL && LA4_0 <= CLASS_DEFINITION)||LA4_0==COMPILER_ANNOTATION||LA4_0==CONTINUE||(LA4_0 >= DECREMENT_OP && LA4_0 <= DIFFERENCE_OP)||LA4_0==DYNAMIC||(LA4_0 >= FLOAT_LITERAL && LA4_0 <= FUNCTION_MODIFIER)||(LA4_0 >= IF_CLAUSE && LA4_0 <= INTERFACE_DEFINITION)||LA4_0==IN_OP||(LA4_0 >= LBRACE && LA4_0 <= LIDENTIFIER)||LA4_0==LPAREN||LA4_0==MODULE||LA4_0==NATURAL_LITERAL||(LA4_0 >= NOT_OP && LA4_0 <= OBJECT_DEFINITION)||(LA4_0 >= OUT && LA4_0 <= PACKAGE)||LA4_0==PRODUCT_OP||(LA4_0 >= RETURN && LA4_0 <= RPAREN)||(LA4_0 >= SEMICOLON && LA4_0 <= SMALLER_OP)||LA4_0==STRING_LITERAL||LA4_0==STRING_START||(LA4_0 >= SUM_OP && LA4_0 <= SWITCH_CLAUSE)||(LA4_0 >= THIS && LA4_0 <= UIDENTIFIER)||(LA4_0 >= VALUE_MODIFIER && LA4_0 <= WHILE_CLAUSE)) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:94:9: compilerAnnotations annotations importModule
            	    {
            	    pushFollow(FOLLOW_compilerAnnotations_in_importModuleList469);
            	    compilerAnnotations15=compilerAnnotations();

            	    state._fsp--;
            	    if (state.failed) return importModuleList;

            	    pushFollow(FOLLOW_annotations_in_importModuleList471);
            	    annotations14=annotations();

            	    state._fsp--;
            	    if (state.failed) return importModuleList;

            	    pushFollow(FOLLOW_importModule_in_importModuleList481);
            	    importModule13=importModule();

            	    state._fsp--;
            	    if (state.failed) return importModuleList;

            	    if ( state.backtracking==0 ) { if (importModule13!=null)
            	                  importModuleList.addImportModule(importModule13); 
            	              if (importModule13!=null)
            	                  importModule13.setAnnotationList(annotations14);
            	              if (importModule13!=null)
            	                  importModule13.getCompilerAnnotations().addAll(compilerAnnotations15); }

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            RBRACE16=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_importModuleList508); if (state.failed) return importModuleList;

            if ( state.backtracking==0 ) { importModuleList.setEndToken(RBRACE16); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return importModuleList;
    }
    // $ANTLR end "importModuleList"



    // $ANTLR start "packageDescriptor"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:107:1: packageDescriptor returns [PackageDescriptor packageDescriptor] : compilerAnnotations annotations PACKAGE packagePath SEMICOLON ;
    public PackageDescriptor packageDescriptor() throws RecognitionException {
        PackageDescriptor packageDescriptor = null;


        Token PACKAGE17=null;
        Token SEMICOLON21=null;
        AnnotationList annotations18 =null;

        List<CompilerAnnotation> compilerAnnotations19 =null;

        ImportPath packagePath20 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:108:5: ( compilerAnnotations annotations PACKAGE packagePath SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:108:7: compilerAnnotations annotations PACKAGE packagePath SEMICOLON
            {
            pushFollow(FOLLOW_compilerAnnotations_in_packageDescriptor537);
            compilerAnnotations19=compilerAnnotations();

            state._fsp--;
            if (state.failed) return packageDescriptor;

            pushFollow(FOLLOW_annotations_in_packageDescriptor539);
            annotations18=annotations();

            state._fsp--;
            if (state.failed) return packageDescriptor;

            PACKAGE17=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_packageDescriptor547); if (state.failed) return packageDescriptor;

            if ( state.backtracking==0 ) { packageDescriptor = new PackageDescriptor(PACKAGE17); 
                    packageDescriptor.setAnnotationList(annotations18); 
                    packageDescriptor.getCompilerAnnotations().addAll(compilerAnnotations19); }

            pushFollow(FOLLOW_packagePath_in_packageDescriptor564);
            packagePath20=packagePath();

            state._fsp--;
            if (state.failed) return packageDescriptor;

            if ( state.backtracking==0 ) { packageDescriptor.setImportPath(packagePath20); 
                    expecting=SEMICOLON; }

            SEMICOLON21=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_packageDescriptor580); if (state.failed) return packageDescriptor;

            if ( state.backtracking==0 ) { packageDescriptor.setEndToken(SEMICOLON21); 
                    expecting=-1; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return packageDescriptor;
    }
    // $ANTLR end "packageDescriptor"



    // $ANTLR start "importModule"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:121:1: importModule returns [ImportModule importModule] : IMPORT (c1= CHAR_LITERAL |s1= STRING_LITERAL | packagePath ) (c2= CHAR_LITERAL |s2= STRING_LITERAL )? SEMICOLON ;
    public ImportModule importModule() throws RecognitionException {
        ImportModule importModule = null;


        Token c1=null;
        Token s1=null;
        Token c2=null;
        Token s2=null;
        Token IMPORT22=null;
        Token SEMICOLON24=null;
        ImportPath packagePath23 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:122:5: ( IMPORT (c1= CHAR_LITERAL |s1= STRING_LITERAL | packagePath ) (c2= CHAR_LITERAL |s2= STRING_LITERAL )? SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:122:7: IMPORT (c1= CHAR_LITERAL |s1= STRING_LITERAL | packagePath ) (c2= CHAR_LITERAL |s2= STRING_LITERAL )? SEMICOLON
            {
            IMPORT22=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importModule609); if (state.failed) return importModule;

            if ( state.backtracking==0 ) { importModule = new ImportModule(IMPORT22); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:124:7: (c1= CHAR_LITERAL |s1= STRING_LITERAL | packagePath )
            int alt5=3;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
                {
                alt5=1;
                }
                break;
            case STRING_LITERAL:
                {
                alt5=2;
                }
                break;
            case LIDENTIFIER:
            case UIDENTIFIER:
                {
                alt5=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return importModule;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:125:9: c1= CHAR_LITERAL
                    {
                    c1=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_importModule638); if (state.failed) return importModule;

                    if ( state.backtracking==0 ) { importModule.setQuotedLiteral(new QuotedLiteral(c1)); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:128:9: s1= STRING_LITERAL
                    {
                    s1=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_importModule668); if (state.failed) return importModule;

                    if ( state.backtracking==0 ) { importModule.setQuotedLiteral(new QuotedLiteral(s1)); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:131:9: packagePath
                    {
                    pushFollow(FOLLOW_packagePath_in_importModule696);
                    packagePath23=packagePath();

                    state._fsp--;
                    if (state.failed) return importModule;

                    if ( state.backtracking==0 ) { importModule.setImportPath(packagePath23); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:134:7: (c2= CHAR_LITERAL |s2= STRING_LITERAL )?
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==CHAR_LITERAL) ) {
                alt6=1;
            }
            else if ( (LA6_0==STRING_LITERAL) ) {
                alt6=2;
            }
            switch (alt6) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:135:9: c2= CHAR_LITERAL
                    {
                    c2=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_importModule734); if (state.failed) return importModule;

                    if ( state.backtracking==0 ) { importModule.setVersion(new QuotedLiteral(c2)); 
                              expecting=SEMICOLON; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:139:9: s2= STRING_LITERAL
                    {
                    s2=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_importModule764); if (state.failed) return importModule;

                    if ( state.backtracking==0 ) { importModule.setVersion(new QuotedLiteral(s2)); 
                              expecting=SEMICOLON; }

                    }
                    break;

            }


            SEMICOLON24=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_importModule791); if (state.failed) return importModule;

            if ( state.backtracking==0 ) { importModule.setEndToken(SEMICOLON24); 
                    expecting=-1; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return importModule;
    }
    // $ANTLR end "importModule"



    // $ANTLR start "importDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:148:1: importDeclaration returns [Import importDeclaration] : IMPORT ( packagePath |) importElementList ;
    public Import importDeclaration() throws RecognitionException {
        Import importDeclaration = null;


        Token IMPORT25=null;
        ImportPath packagePath26 =null;

        ImportMemberOrTypeList importElementList27 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:149:5: ( IMPORT ( packagePath |) importElementList )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:149:7: IMPORT ( packagePath |) importElementList
            {
            IMPORT25=(Token)match(input,IMPORT,FOLLOW_IMPORT_in_importDeclaration820); if (state.failed) return importDeclaration;

            if ( state.backtracking==0 ) { importDeclaration = new Import(IMPORT25); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:151:7: ( packagePath |)
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==LIDENTIFIER||LA7_0==UIDENTIFIER) ) {
                alt7=1;
            }
            else if ( (LA7_0==LBRACE) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return importDeclaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:152:9: packagePath
                    {
                    pushFollow(FOLLOW_packagePath_in_importDeclaration848);
                    packagePath26=packagePath();

                    state._fsp--;
                    if (state.failed) return importDeclaration;

                    if ( state.backtracking==0 ) { importDeclaration.setImportPath(packagePath26); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:154:9: 
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                  new MismatchedTokenException(LIDENTIFIER, input)); }

                    }
                    break;

            }


            pushFollow(FOLLOW_importElementList_in_importDeclaration884);
            importElementList27=importElementList();

            state._fsp--;
            if (state.failed) return importDeclaration;

            if ( state.backtracking==0 ) { importDeclaration.setImportMemberOrTypeList(importElementList27); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return importDeclaration;
    }
    // $ANTLR end "importDeclaration"



    // $ANTLR start "importElementList"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:161:1: importElementList returns [ImportMemberOrTypeList importMemberOrTypeList] : LBRACE (ie1= importElement (c1= COMMA (ie2= importElement |iw= importWildcard |) )* |iw= importWildcard )? RBRACE ;
    public ImportMemberOrTypeList importElementList() throws RecognitionException {
        ImportMemberOrTypeList importMemberOrTypeList = null;


        Token c1=null;
        Token LBRACE28=null;
        Token RBRACE29=null;
        ImportMemberOrType ie1 =null;

        ImportMemberOrType ie2 =null;

        ImportWildcard iw =null;


         ImportMemberOrTypeList il=null; 
                    boolean wildcarded = false; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:164:5: ( LBRACE (ie1= importElement (c1= COMMA (ie2= importElement |iw= importWildcard |) )* |iw= importWildcard )? RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:165:5: LBRACE (ie1= importElement (c1= COMMA (ie2= importElement |iw= importWildcard |) )* |iw= importWildcard )? RBRACE
            {
            LBRACE28=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_importElementList926); if (state.failed) return importMemberOrTypeList;

            if ( state.backtracking==0 ) { il = new ImportMemberOrTypeList(LBRACE28);
                  importMemberOrTypeList = il; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:168:5: (ie1= importElement (c1= COMMA (ie2= importElement |iw= importWildcard |) )* |iw= importWildcard )?
            int alt10=3;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ALIAS||(LA10_0 >= ASSERT && LA10_0 <= ASSIGN)||(LA10_0 >= BACKTICK && LA10_0 <= BREAK)||(LA10_0 >= CHAR_LITERAL && LA10_0 <= CLASS_DEFINITION)||LA10_0==COMPILER_ANNOTATION||LA10_0==CONTINUE||(LA10_0 >= DECREMENT_OP && LA10_0 <= DIFFERENCE_OP)||LA10_0==DYNAMIC||(LA10_0 >= FLOAT_LITERAL && LA10_0 <= FUNCTION_MODIFIER)||(LA10_0 >= IF_CLAUSE && LA10_0 <= INTERFACE_DEFINITION)||LA10_0==IN_OP||(LA10_0 >= LBRACE && LA10_0 <= LIDENTIFIER)||LA10_0==LPAREN||LA10_0==MODULE||LA10_0==NATURAL_LITERAL||(LA10_0 >= NOT_OP && LA10_0 <= OBJECT_DEFINITION)||(LA10_0 >= OUT && LA10_0 <= PACKAGE)||LA10_0==PRODUCT_OP||(LA10_0 >= RETURN && LA10_0 <= RPAREN)||(LA10_0 >= SEMICOLON && LA10_0 <= SMALLER_OP)||LA10_0==STRING_LITERAL||LA10_0==STRING_START||(LA10_0 >= SUM_OP && LA10_0 <= SWITCH_CLAUSE)||(LA10_0 >= THIS && LA10_0 <= UIDENTIFIER)||(LA10_0 >= VALUE_MODIFIER && LA10_0 <= WHILE_CLAUSE)) ) {
                alt10=1;
            }
            else if ( (LA10_0==ELLIPSIS) ) {
                alt10=2;
            }
            switch (alt10) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:169:7: ie1= importElement (c1= COMMA (ie2= importElement |iw= importWildcard |) )*
                    {
                    pushFollow(FOLLOW_importElement_in_importElementList949);
                    ie1=importElement();

                    state._fsp--;
                    if (state.failed) return importMemberOrTypeList;

                    if ( state.backtracking==0 ) { if (ie1!=null)
                                il.addImportMemberOrType(ie1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:172:7: (c1= COMMA (ie2= importElement |iw= importWildcard |) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:173:9: c1= COMMA (ie2= importElement |iw= importWildcard |)
                    	    {
                    	    c1=(Token)match(input,COMMA,FOLLOW_COMMA_in_importElementList980); if (state.failed) return importMemberOrTypeList;

                    	    if ( state.backtracking==0 ) { il.setEndToken(c1); 
                    	              if (wildcarded) 
                    	                  displayRecognitionError(getTokenNames(), 
                    	                      new MismatchedTokenException(RBRACE, input)); }

                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:178:9: (ie2= importElement |iw= importWildcard |)
                    	    int alt8=3;
                    	    switch ( input.LA(1) ) {
                    	    case ALIAS:
                    	    case ASSERT:
                    	    case ASSIGN:
                    	    case BACKTICK:
                    	    case BREAK:
                    	    case CHAR_LITERAL:
                    	    case CLASS_DEFINITION:
                    	    case COMPILER_ANNOTATION:
                    	    case CONTINUE:
                    	    case DECREMENT_OP:
                    	    case DIFFERENCE_OP:
                    	    case DYNAMIC:
                    	    case FLOAT_LITERAL:
                    	    case FOR_CLAUSE:
                    	    case FUNCTION_MODIFIER:
                    	    case IF_CLAUSE:
                    	    case IMPORT:
                    	    case INCREMENT_OP:
                    	    case INTERFACE_DEFINITION:
                    	    case IN_OP:
                    	    case LBRACE:
                    	    case LBRACKET:
                    	    case LIDENTIFIER:
                    	    case LPAREN:
                    	    case MODULE:
                    	    case NATURAL_LITERAL:
                    	    case NOT_OP:
                    	    case OBJECT_DEFINITION:
                    	    case OUT:
                    	    case OUTER:
                    	    case PACKAGE:
                    	    case PRODUCT_OP:
                    	    case RETURN:
                    	    case RPAREN:
                    	    case SEMICOLON:
                    	    case SMALLER_OP:
                    	    case STRING_LITERAL:
                    	    case STRING_START:
                    	    case SUM_OP:
                    	    case SUPER:
                    	    case SWITCH_CLAUSE:
                    	    case THIS:
                    	    case THROW:
                    	    case TRY_CLAUSE:
                    	    case TYPE_CONSTRAINT:
                    	    case UIDENTIFIER:
                    	    case VALUE_MODIFIER:
                    	    case VERBATIM_STRING:
                    	    case VOID_MODIFIER:
                    	    case WHILE_CLAUSE:
                    	        {
                    	        alt8=1;
                    	        }
                    	        break;
                    	    case ELLIPSIS:
                    	        {
                    	        alt8=2;
                    	        }
                    	        break;
                    	    case COMMA:
                    	    case RBRACE:
                    	        {
                    	        alt8=3;
                    	        }
                    	        break;
                    	    default:
                    	        if (state.backtracking>0) {state.failed=true; return importMemberOrTypeList;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 8, 0, input);

                    	        throw nvae;

                    	    }

                    	    switch (alt8) {
                    	        case 1 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:179:11: ie2= importElement
                    	            {
                    	            pushFollow(FOLLOW_importElement_in_importElementList1015);
                    	            ie2=importElement();

                    	            state._fsp--;
                    	            if (state.failed) return importMemberOrTypeList;

                    	            if ( state.backtracking==0 ) { if (ie2!=null)
                    	                            il.addImportMemberOrType(ie2);
                    	                        if (ie2!=null)
                    	                            il.setEndToken(null); }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:184:11: iw= importWildcard
                    	            {
                    	            pushFollow(FOLLOW_importWildcard_in_importElementList1043);
                    	            iw=importWildcard();

                    	            state._fsp--;
                    	            if (state.failed) return importMemberOrTypeList;

                    	            if ( state.backtracking==0 ) { wildcarded = true;
                    	                        if (iw!=null) 
                    	                            il.setImportWildcard(iw); 
                    	                        if (iw!=null) 
                    	                            il.setEndToken(null); }

                    	            }
                    	            break;
                    	        case 3 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:190:11: 
                    	            {
                    	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                    	                            new MismatchedTokenException(ELLIPSIS, input)); }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:194:7: iw= importWildcard
                    {
                    pushFollow(FOLLOW_importWildcard_in_importElementList1097);
                    iw=importWildcard();

                    state._fsp--;
                    if (state.failed) return importMemberOrTypeList;

                    if ( state.backtracking==0 ) { il.setImportWildcard(iw); }

                    }
                    break;

            }


            RBRACE29=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_importElementList1112); if (state.failed) return importMemberOrTypeList;

            if ( state.backtracking==0 ) { il.setEndToken(RBRACE29); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return importMemberOrTypeList;
    }
    // $ANTLR end "importElementList"



    // $ANTLR start "importElement"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:200:1: importElement returns [ImportMemberOrType importMemberOrType] : compilerAnnotations (in1= importName ( SPECIFY (in2= importName |) )? (iel2= importElementList )? ) ;
    public ImportMemberOrType importElement() throws RecognitionException {
        ImportMemberOrType importMemberOrType = null;


        Token SPECIFY30=null;
        Identifier in1 =null;

        Identifier in2 =null;

        ImportMemberOrTypeList iel2 =null;

        List<CompilerAnnotation> compilerAnnotations31 =null;


         Alias alias = null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:202:5: ( compilerAnnotations (in1= importName ( SPECIFY (in2= importName |) )? (iel2= importElementList )? ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:202:7: compilerAnnotations (in1= importName ( SPECIFY (in2= importName |) )? (iel2= importElementList )? )
            {
            pushFollow(FOLLOW_compilerAnnotations_in_importElement1148);
            compilerAnnotations31=compilerAnnotations();

            state._fsp--;
            if (state.failed) return importMemberOrType;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:203:5: (in1= importName ( SPECIFY (in2= importName |) )? (iel2= importElementList )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:203:7: in1= importName ( SPECIFY (in2= importName |) )? (iel2= importElementList )?
            {
            pushFollow(FOLLOW_importName_in_importElement1158);
            in1=importName();

            state._fsp--;
            if (state.failed) return importMemberOrType;

            if ( state.backtracking==0 ) { importMemberOrType = new ImportMember(null);
                    importMemberOrType.setIdentifier(in1); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:206:7: ( SPECIFY (in2= importName |) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==SPECIFY) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:206:9: SPECIFY (in2= importName |)
                    {
                    SPECIFY30=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_importElement1177); if (state.failed) return importMemberOrType;

                    if ( state.backtracking==0 ) { alias = new Alias(SPECIFY30);
                              alias.setIdentifier(in1);
                              importMemberOrType.setAlias(alias); 
                              importMemberOrType.setIdentifier(null); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:211:9: (in2= importName |)
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==LIDENTIFIER||LA11_0==UIDENTIFIER) ) {
                        alt11=1;
                    }
                    else if ( (LA11_0==COMMA||LA11_0==LBRACE||LA11_0==RBRACE) ) {
                        alt11=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return importMemberOrType;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 0, input);

                        throw nvae;

                    }
                    switch (alt11) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:212:11: in2= importName
                            {
                            pushFollow(FOLLOW_importName_in_importElement1211);
                            in2=importName();

                            state._fsp--;
                            if (state.failed) return importMemberOrType;

                            if ( state.backtracking==0 ) { importMemberOrType.setIdentifier(in2); }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:214:11: 
                            {
                            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                              new MismatchedTokenException(in1.getToken().getType(), input)); }

                            }
                            break;

                    }


                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:218:7: (iel2= importElementList )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==LBRACE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:219:9: iel2= importElementList
                    {
                    pushFollow(FOLLOW_importElementList_in_importElement1275);
                    iel2=importElementList();

                    state._fsp--;
                    if (state.failed) return importMemberOrType;

                    if ( state.backtracking==0 ) { importMemberOrType.setImportMemberOrTypeList(iel2); }

                    }
                    break;

            }


            }


            if ( state.backtracking==0 ) { if (importMemberOrType!=null)
                    importMemberOrType.getCompilerAnnotations().addAll(compilerAnnotations31); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return importMemberOrType;
    }
    // $ANTLR end "importElement"



    // $ANTLR start "importWildcard"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:227:1: importWildcard returns [ImportWildcard importWildcard] : ELLIPSIS ;
    public ImportWildcard importWildcard() throws RecognitionException {
        ImportWildcard importWildcard = null;


        Token ELLIPSIS32=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:228:5: ( ELLIPSIS )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:228:7: ELLIPSIS
            {
            ELLIPSIS32=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_importWildcard1327); if (state.failed) return importWildcard;

            if ( state.backtracking==0 ) { importWildcard = new ImportWildcard(ELLIPSIS32); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return importWildcard;
    }
    // $ANTLR end "importWildcard"



    // $ANTLR start "importName"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:232:1: importName returns [Identifier identifier] : ( memberName | typeName );
    public Identifier importName() throws RecognitionException {
        Identifier identifier = null;


        Identifier memberName33 =null;

        Identifier typeName34 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:233:5: ( memberName | typeName )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==LIDENTIFIER) ) {
                alt14=1;
            }
            else if ( (LA14_0==UIDENTIFIER) ) {
                alt14=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return identifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:233:7: memberName
                    {
                    pushFollow(FOLLOW_memberName_in_importName1356);
                    memberName33=memberName();

                    state._fsp--;
                    if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier =memberName33; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:234:7: typeName
                    {
                    pushFollow(FOLLOW_typeName_in_importName1366);
                    typeName34=typeName();

                    state._fsp--;
                    if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier =typeName34; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return identifier;
    }
    // $ANTLR end "importName"



    // $ANTLR start "packagePath"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:237:1: packagePath returns [ImportPath importPath] : pn1= packageName (m= MEMBER_OP (pn2= packageName |) )* ;
    public ImportPath packagePath() throws RecognitionException {
        ImportPath importPath = null;


        Token m=null;
        Identifier pn1 =null;

        Identifier pn2 =null;


         importPath = new ImportPath(null); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:239:5: (pn1= packageName (m= MEMBER_OP (pn2= packageName |) )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:239:7: pn1= packageName (m= MEMBER_OP (pn2= packageName |) )*
            {
            pushFollow(FOLLOW_packageName_in_packagePath1400);
            pn1=packageName();

            state._fsp--;
            if (state.failed) return importPath;

            if ( state.backtracking==0 ) { if (pn1!=null) 
                        importPath.addIdentifier(pn1); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:242:7: (m= MEMBER_OP (pn2= packageName |) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==MEMBER_OP) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:243:9: m= MEMBER_OP (pn2= packageName |)
            	    {
            	    m=(Token)match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_packagePath1431); if (state.failed) return importPath;

            	    if ( state.backtracking==0 ) { importPath.setEndToken(m); }

            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:245:9: (pn2= packageName |)
            	    int alt15=2;
            	    int LA15_0 = input.LA(1);

            	    if ( (LA15_0==LIDENTIFIER||LA15_0==UIDENTIFIER) ) {
            	        alt15=1;
            	    }
            	    else if ( (LA15_0==BACKTICK||LA15_0==CHAR_LITERAL||LA15_0==LBRACE||LA15_0==MEMBER_OP||LA15_0==SEMICOLON||LA15_0==STRING_LITERAL) ) {
            	        alt15=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return importPath;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 15, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt15) {
            	        case 1 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:246:11: pn2= packageName
            	            {
            	            pushFollow(FOLLOW_packageName_in_packagePath1466);
            	            pn2=packageName();

            	            state._fsp--;
            	            if (state.failed) return importPath;

            	            if ( state.backtracking==0 ) { importPath.addIdentifier(pn2); 
            	                        importPath.setEndToken(null); }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:249:11: 
            	            {
            	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
            	                            new MismatchedTokenException(LIDENTIFIER, input)); }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return importPath;
    }
    // $ANTLR end "packagePath"



    // $ANTLR start "packageName"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:255:1: packageName returns [Identifier identifier] : ( LIDENTIFIER | UIDENTIFIER );
    public Identifier packageName() throws RecognitionException {
        Identifier identifier = null;


        Token LIDENTIFIER35=null;
        Token UIDENTIFIER36=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:256:5: ( LIDENTIFIER | UIDENTIFIER )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==LIDENTIFIER) ) {
                alt17=1;
            }
            else if ( (LA17_0==UIDENTIFIER) ) {
                alt17=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return identifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:256:7: LIDENTIFIER
                    {
                    LIDENTIFIER35=(Token)match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_packageName1531); if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier = new Identifier(LIDENTIFIER35);
                            LIDENTIFIER35.setType(PIDENTIFIER);}

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:259:7: UIDENTIFIER
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(),
                                  new MismatchedTokenException(LIDENTIFIER, input), 5001); }

                    UIDENTIFIER36=(Token)match(input,UIDENTIFIER,FOLLOW_UIDENTIFIER_in_packageName1555); if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier = new Identifier(UIDENTIFIER36);
                            UIDENTIFIER36.setType(PIDENTIFIER);}

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return identifier;
    }
    // $ANTLR end "packageName"



    // $ANTLR start "typeName"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:266:1: typeName returns [Identifier identifier] : UIDENTIFIER ;
    public Identifier typeName() throws RecognitionException {
        Identifier identifier = null;


        Token UIDENTIFIER37=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:267:5: ( UIDENTIFIER )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:267:7: UIDENTIFIER
            {
            UIDENTIFIER37=(Token)match(input,UIDENTIFIER,FOLLOW_UIDENTIFIER_in_typeName1584); if (state.failed) return identifier;

            if ( state.backtracking==0 ) { identifier = new Identifier(UIDENTIFIER37); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return identifier;
    }
    // $ANTLR end "typeName"



    // $ANTLR start "annotationName"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:271:1: annotationName returns [Identifier identifier] : LIDENTIFIER ;
    public Identifier annotationName() throws RecognitionException {
        Identifier identifier = null;


        Token LIDENTIFIER38=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:272:5: ( LIDENTIFIER )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:272:7: LIDENTIFIER
            {
            LIDENTIFIER38=(Token)match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_annotationName1613); if (state.failed) return identifier;

            if ( state.backtracking==0 ) { identifier = new Identifier(LIDENTIFIER38); 
                    LIDENTIFIER38.setType(AIDENTIFIER); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return identifier;
    }
    // $ANTLR end "annotationName"



    // $ANTLR start "memberName"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:277:1: memberName returns [Identifier identifier] : LIDENTIFIER ;
    public Identifier memberName() throws RecognitionException {
        Identifier identifier = null;


        Token LIDENTIFIER39=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:278:5: ( LIDENTIFIER )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:278:7: LIDENTIFIER
            {
            LIDENTIFIER39=(Token)match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_memberName1642); if (state.failed) return identifier;

            if ( state.backtracking==0 ) { identifier = new Identifier(LIDENTIFIER39); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return identifier;
    }
    // $ANTLR end "memberName"



    // $ANTLR start "memberNameDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:282:1: memberNameDeclaration returns [Identifier identifier] : ( memberName | typeName );
    public Identifier memberNameDeclaration() throws RecognitionException {
        Identifier identifier = null;


        Identifier memberName40 =null;

        Identifier typeName41 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:283:5: ( memberName | typeName )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==LIDENTIFIER) ) {
                alt18=1;
            }
            else if ( (LA18_0==UIDENTIFIER) ) {
                alt18=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return identifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:283:7: memberName
                    {
                    pushFollow(FOLLOW_memberName_in_memberNameDeclaration1675);
                    memberName40=memberName();

                    state._fsp--;
                    if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier = memberName40; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:284:7: typeName
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                  new MismatchedTokenException(LIDENTIFIER, input), 5001); }

                    pushFollow(FOLLOW_typeName_in_memberNameDeclaration1693);
                    typeName41=typeName();

                    state._fsp--;
                    if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier = typeName41; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return identifier;
    }
    // $ANTLR end "memberNameDeclaration"



    // $ANTLR start "typeNameDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:290:1: typeNameDeclaration returns [Identifier identifier] : ( typeName | memberName );
    public Identifier typeNameDeclaration() throws RecognitionException {
        Identifier identifier = null;


        Identifier typeName42 =null;

        Identifier memberName43 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:291:5: ( typeName | memberName )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==UIDENTIFIER) ) {
                alt19=1;
            }
            else if ( (LA19_0==LIDENTIFIER) ) {
                alt19=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return identifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:291:7: typeName
                    {
                    pushFollow(FOLLOW_typeName_in_typeNameDeclaration1723);
                    typeName42=typeName();

                    state._fsp--;
                    if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier = typeName42; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:292:7: memberName
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                  new MismatchedTokenException(UIDENTIFIER, input), 5002); }

                    pushFollow(FOLLOW_memberName_in_typeNameDeclaration1741);
                    memberName43=memberName();

                    state._fsp--;
                    if (state.failed) return identifier;

                    if ( state.backtracking==0 ) { identifier = memberName43; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return identifier;
    }
    // $ANTLR end "typeNameDeclaration"



    // $ANTLR start "objectDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:298:1: objectDeclaration returns [ObjectDefinition declaration] : OBJECT_DEFINITION memberNameDeclaration ( extendedType )? ( satisfiedTypes )? ( classBody | SEMICOLON ) ;
    public ObjectDefinition objectDeclaration() throws RecognitionException {
        ObjectDefinition declaration = null;


        Token OBJECT_DEFINITION44=null;
        Token SEMICOLON49=null;
        Identifier memberNameDeclaration45 =null;

        ExtendedType extendedType46 =null;

        SatisfiedTypes satisfiedTypes47 =null;

        ClassBody classBody48 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:299:5: ( OBJECT_DEFINITION memberNameDeclaration ( extendedType )? ( satisfiedTypes )? ( classBody | SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:299:7: OBJECT_DEFINITION memberNameDeclaration ( extendedType )? ( satisfiedTypes )? ( classBody | SEMICOLON )
            {
            OBJECT_DEFINITION44=(Token)match(input,OBJECT_DEFINITION,FOLLOW_OBJECT_DEFINITION_in_objectDeclaration1771); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration = new ObjectDefinition(OBJECT_DEFINITION44); 
                    declaration.setType(new ValueModifier(null)); }

            pushFollow(FOLLOW_memberNameDeclaration_in_objectDeclaration1787);
            memberNameDeclaration45=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setIdentifier(memberNameDeclaration45); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:304:7: ( extendedType )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==EXTENDS) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:305:9: extendedType
                    {
                    pushFollow(FOLLOW_extendedType_in_objectDeclaration1814);
                    extendedType46=extendedType();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setExtendedType(extendedType46); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:308:7: ( satisfiedTypes )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==SATISFIES) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:309:9: satisfiedTypes
                    {
                    pushFollow(FOLLOW_satisfiedTypes_in_objectDeclaration1853);
                    satisfiedTypes47=satisfiedTypes();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setSatisfiedTypes(satisfiedTypes47); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:312:7: ( classBody | SEMICOLON )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==LBRACE) ) {
                alt22=1;
            }
            else if ( (LA22_0==SEMICOLON) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:313:9: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_objectDeclaration1891);
                    classBody48=classBody();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setClassBody(classBody48); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:315:9: SEMICOLON
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                  new MismatchedTokenException(LBRACE, input)); }

                    SEMICOLON49=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_objectDeclaration1921); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON49); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "objectDeclaration"



    // $ANTLR start "voidOrInferredMethodDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:322:1: voidOrInferredMethodDeclaration returns [AnyMethod declaration] : ( VOID_MODIFIER | FUNCTION_MODIFIER ) memberNameDeclaration ( typeParameters )? ( parameters )* ( typeConstraints )? ( block | ( functionSpecifier )? SEMICOLON ) ;
    public AnyMethod voidOrInferredMethodDeclaration() throws RecognitionException {
        AnyMethod declaration = null;


        Token VOID_MODIFIER50=null;
        Token FUNCTION_MODIFIER51=null;
        Token SEMICOLON58=null;
        Identifier memberNameDeclaration52 =null;

        TypeParameterList typeParameters53 =null;

        ParameterList parameters54 =null;

        TypeConstraintList typeConstraints55 =null;

        Block block56 =null;

        SpecifierExpression functionSpecifier57 =null;


         MethodDefinition def=null;
                    MethodDeclaration dec=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:325:5: ( ( VOID_MODIFIER | FUNCTION_MODIFIER ) memberNameDeclaration ( typeParameters )? ( parameters )* ( typeConstraints )? ( block | ( functionSpecifier )? SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:325:7: ( VOID_MODIFIER | FUNCTION_MODIFIER ) memberNameDeclaration ( typeParameters )? ( parameters )* ( typeConstraints )? ( block | ( functionSpecifier )? SEMICOLON )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:325:7: ( VOID_MODIFIER | FUNCTION_MODIFIER )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==VOID_MODIFIER) ) {
                alt23=1;
            }
            else if ( (LA23_0==FUNCTION_MODIFIER) ) {
                alt23=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:326:9: VOID_MODIFIER
                    {
                    VOID_MODIFIER50=(Token)match(input,VOID_MODIFIER,FOLLOW_VOID_MODIFIER_in_voidOrInferredMethodDeclaration1979); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { VoidModifier vm = new VoidModifier(VOID_MODIFIER50);
                              def = new MethodDefinition(VOID_MODIFIER50);
                              dec = new MethodDeclaration(VOID_MODIFIER50);
                              def.setType(vm);
                              dec.setType(vm);
                              declaration = dec; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:333:9: FUNCTION_MODIFIER
                    {
                    FUNCTION_MODIFIER51=(Token)match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_voidOrInferredMethodDeclaration1999); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { FunctionModifier fm = new FunctionModifier(FUNCTION_MODIFIER51);
                              def = new MethodDefinition(FUNCTION_MODIFIER51);
                              dec = new MethodDeclaration(FUNCTION_MODIFIER51);
                              def.setType(fm);
                              dec.setType(fm);
                              declaration = dec; }

                    }
                    break;

            }


            pushFollow(FOLLOW_memberNameDeclaration_in_voidOrInferredMethodDeclaration2025);
            memberNameDeclaration52=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { dec.setIdentifier(memberNameDeclaration52); 
                    def.setIdentifier(memberNameDeclaration52); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:344:7: ( typeParameters )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==SMALLER_OP) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:345:9: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_voidOrInferredMethodDeclaration2051);
                    typeParameters53=typeParameters();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setTypeParameterList(typeParameters53); 
                              dec.setTypeParameterList(typeParameters53); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:349:7: ( parameters )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==LPAREN) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:350:9: parameters
            	    {
            	    pushFollow(FOLLOW_parameters_in_voidOrInferredMethodDeclaration2096);
            	    parameters54=parameters();

            	    state._fsp--;
            	    if (state.failed) return declaration;

            	    if ( state.backtracking==0 ) { def.addParameterList(parameters54); 
            	              dec.addParameterList(parameters54); }

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:355:7: ( typeConstraints )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==COMPILER_ANNOTATION||LA26_0==TYPE_CONSTRAINT) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:356:9: typeConstraints
                    {
                    pushFollow(FOLLOW_typeConstraints_in_voidOrInferredMethodDeclaration2140);
                    typeConstraints55=typeConstraints();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setTypeConstraintList(typeConstraints55); 
                              dec.setTypeConstraintList(typeConstraints55); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:360:7: ( block | ( functionSpecifier )? SEMICOLON )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==LBRACE) ) {
                alt28=1;
            }
            else if ( (LA28_0==COMPUTE||LA28_0==SEMICOLON||LA28_0==SPECIFY) ) {
                alt28=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:361:9: block
                    {
                    if ( state.backtracking==0 ) { declaration = def; }

                    pushFollow(FOLLOW_block_in_voidOrInferredMethodDeclaration2188);
                    block56=block();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setBlock(block56); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:365:9: ( functionSpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:365:9: ( functionSpecifier )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==COMPUTE||LA27_0==SPECIFY) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:366:11: functionSpecifier
                            {
                            pushFollow(FOLLOW_functionSpecifier_in_voidOrInferredMethodDeclaration2230);
                            functionSpecifier57=functionSpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { dec.setSpecifierExpression(functionSpecifier57); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON58=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_voidOrInferredMethodDeclaration2273); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { expecting=-1; }

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON58); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "voidOrInferredMethodDeclaration"



    // $ANTLR start "setterDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:376:1: setterDeclaration returns [AttributeSetterDefinition declaration] : ASSIGN memberNameDeclaration ( block | ( functionSpecifier )? SEMICOLON ) ;
    public AttributeSetterDefinition setterDeclaration() throws RecognitionException {
        AttributeSetterDefinition declaration = null;


        Token ASSIGN59=null;
        Token SEMICOLON63=null;
        Identifier memberNameDeclaration60 =null;

        Block block61 =null;

        SpecifierExpression functionSpecifier62 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:377:5: ( ASSIGN memberNameDeclaration ( block | ( functionSpecifier )? SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:377:7: ASSIGN memberNameDeclaration ( block | ( functionSpecifier )? SEMICOLON )
            {
            ASSIGN59=(Token)match(input,ASSIGN,FOLLOW_ASSIGN_in_setterDeclaration2322); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration = new AttributeSetterDefinition(ASSIGN59); 
                    declaration.setType( new VoidModifier(null) ); }

            pushFollow(FOLLOW_memberNameDeclaration_in_setterDeclaration2339);
            memberNameDeclaration60=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setIdentifier(memberNameDeclaration60); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:382:7: ( block | ( functionSpecifier )? SEMICOLON )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==LBRACE) ) {
                alt30=1;
            }
            else if ( (LA30_0==COMPUTE||LA30_0==SEMICOLON||LA30_0==SPECIFY) ) {
                alt30=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;

            }
            switch (alt30) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:383:9: block
                    {
                    pushFollow(FOLLOW_block_in_setterDeclaration2367);
                    block61=block();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setBlock(block61); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:385:9: ( functionSpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:385:9: ( functionSpecifier )?
                    int alt29=2;
                    int LA29_0 = input.LA(1);

                    if ( (LA29_0==COMPUTE||LA29_0==SPECIFY) ) {
                        alt29=1;
                    }
                    switch (alt29) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:386:11: functionSpecifier
                            {
                            pushFollow(FOLLOW_functionSpecifier_in_setterDeclaration2399);
                            functionSpecifier62=functionSpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { declaration.setSpecifierExpression(functionSpecifier62); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON63=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_setterDeclaration2442); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON63); 
                              expecting=-1; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "setterDeclaration"



    // $ANTLR start "inferredAttributeDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:396:1: inferredAttributeDeclaration returns [AnyAttribute declaration] : VALUE_MODIFIER memberNameDeclaration ( ( specifier | lazySpecifier )? SEMICOLON | block ) ;
    public AnyAttribute inferredAttributeDeclaration() throws RecognitionException {
        AnyAttribute declaration = null;


        Token VALUE_MODIFIER64=null;
        Token SEMICOLON68=null;
        Identifier memberNameDeclaration65 =null;

        SpecifierExpression specifier66 =null;

        SpecifierExpression lazySpecifier67 =null;

        Block block69 =null;


         AttributeGetterDefinition def=null;
                    AttributeDeclaration dec=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:399:5: ( VALUE_MODIFIER memberNameDeclaration ( ( specifier | lazySpecifier )? SEMICOLON | block ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:399:7: VALUE_MODIFIER memberNameDeclaration ( ( specifier | lazySpecifier )? SEMICOLON | block )
            {
            VALUE_MODIFIER64=(Token)match(input,VALUE_MODIFIER,FOLLOW_VALUE_MODIFIER_in_inferredAttributeDeclaration2490); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { ValueModifier fm = new ValueModifier(VALUE_MODIFIER64);
                    def = new AttributeGetterDefinition(VALUE_MODIFIER64);
                    dec = new AttributeDeclaration(VALUE_MODIFIER64);
                    def.setType(fm);
                    dec.setType(fm);
                    declaration = dec; }

            pushFollow(FOLLOW_memberNameDeclaration_in_inferredAttributeDeclaration2507);
            memberNameDeclaration65=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { dec.setIdentifier(memberNameDeclaration65); 
                    def.setIdentifier(memberNameDeclaration65); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:409:7: ( ( specifier | lazySpecifier )? SEMICOLON | block )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==COMPUTE||LA32_0==SEMICOLON||LA32_0==SPECIFY) ) {
                alt32=1;
            }
            else if ( (LA32_0==LBRACE) ) {
                alt32=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;

            }
            switch (alt32) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:410:9: ( specifier | lazySpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:410:9: ( specifier | lazySpecifier )?
                    int alt31=3;
                    int LA31_0 = input.LA(1);

                    if ( (LA31_0==SPECIFY) ) {
                        alt31=1;
                    }
                    else if ( (LA31_0==COMPUTE) ) {
                        alt31=2;
                    }
                    switch (alt31) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:411:11: specifier
                            {
                            pushFollow(FOLLOW_specifier_in_inferredAttributeDeclaration2546);
                            specifier66=specifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { dec.setSpecifierOrInitializerExpression(specifier66); }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:414:11: lazySpecifier
                            {
                            pushFollow(FOLLOW_lazySpecifier_in_inferredAttributeDeclaration2581);
                            lazySpecifier67=lazySpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { dec.setSpecifierOrInitializerExpression(lazySpecifier67); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON68=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_inferredAttributeDeclaration2624); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON68); 
                              expecting=-1; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:422:9: block
                    {
                    if ( state.backtracking==0 ) { declaration = def; }

                    pushFollow(FOLLOW_block_in_inferredAttributeDeclaration2663);
                    block69=block();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setBlock(block69); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "inferredAttributeDeclaration"



    // $ANTLR start "typedMethodOrAttributeDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:428:1: typedMethodOrAttributeDeclaration returns [TypedDeclaration declaration] : ( variadicType | DYNAMIC ) memberNameDeclaration ( ( typeParameters )? ( parameters )+ ( typeConstraints )? (b1= block | (ms= functionSpecifier )? s1= SEMICOLON ) | (as= specifier |ac= lazySpecifier )? s2= SEMICOLON |b2= block ) ;
    public TypedDeclaration typedMethodOrAttributeDeclaration() throws RecognitionException {
        TypedDeclaration declaration = null;


        Token s1=null;
        Token s2=null;
        Token DYNAMIC71=null;
        Block b1 =null;

        SpecifierExpression ms =null;

        SpecifierExpression as =null;

        SpecifierExpression ac =null;

        Block b2 =null;

        Type variadicType70 =null;

        Identifier memberNameDeclaration72 =null;

        TypeParameterList typeParameters73 =null;

        ParameterList parameters74 =null;

        TypeConstraintList typeConstraints75 =null;


         AttributeGetterDefinition adef=new AttributeGetterDefinition(null);
                    AttributeDeclaration adec=new AttributeDeclaration(null);
                    MethodDefinition mdef=new MethodDefinition(null);
                    MethodDeclaration mdec=new MethodDeclaration(null); 
                    declaration = adec; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:434:5: ( ( variadicType | DYNAMIC ) memberNameDeclaration ( ( typeParameters )? ( parameters )+ ( typeConstraints )? (b1= block | (ms= functionSpecifier )? s1= SEMICOLON ) | (as= specifier |ac= lazySpecifier )? s2= SEMICOLON |b2= block ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:434:7: ( variadicType | DYNAMIC ) memberNameDeclaration ( ( typeParameters )? ( parameters )+ ( typeConstraints )? (b1= block | (ms= functionSpecifier )? s1= SEMICOLON ) | (as= specifier |ac= lazySpecifier )? s2= SEMICOLON |b2= block )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:434:7: ( variadicType | DYNAMIC )
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( ((LA33_0 >= LBRACE && LA33_0 <= LBRACKET)||LA33_0==SMALLER_OP||LA33_0==UIDENTIFIER) ) {
                alt33=1;
            }
            else if ( (LA33_0==DYNAMIC) ) {
                alt33=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 33, 0, input);

                throw nvae;

            }
            switch (alt33) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:434:9: variadicType
                    {
                    pushFollow(FOLLOW_variadicType_in_typedMethodOrAttributeDeclaration2713);
                    variadicType70=variadicType();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { adef.setType(variadicType70);
                              adec.setType(variadicType70); 
                              mdef.setType(variadicType70);
                              mdec.setType(variadicType70); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:439:9: DYNAMIC
                    {
                    DYNAMIC71=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_typedMethodOrAttributeDeclaration2733); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { DynamicModifier dm = new DynamicModifier(DYNAMIC71);
                              adef.setType(dm);
                              adec.setType(dm); 
                              mdef.setType(dm);
                              mdec.setType(dm); }

                    }
                    break;

            }


            pushFollow(FOLLOW_memberNameDeclaration_in_typedMethodOrAttributeDeclaration2759);
            memberNameDeclaration72=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { adef.setIdentifier(memberNameDeclaration72);
                    adec.setIdentifier(memberNameDeclaration72); 
                    mdef.setIdentifier(memberNameDeclaration72);
                    mdec.setIdentifier(memberNameDeclaration72); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:451:7: ( ( typeParameters )? ( parameters )+ ( typeConstraints )? (b1= block | (ms= functionSpecifier )? s1= SEMICOLON ) | (as= specifier |ac= lazySpecifier )? s2= SEMICOLON |b2= block )
            int alt40=3;
            switch ( input.LA(1) ) {
            case LPAREN:
            case SMALLER_OP:
                {
                alt40=1;
                }
                break;
            case COMPUTE:
            case SEMICOLON:
            case SPECIFY:
                {
                alt40=2;
                }
                break;
            case LBRACE:
                {
                alt40=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }

            switch (alt40) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:452:9: ( typeParameters )? ( parameters )+ ( typeConstraints )? (b1= block | (ms= functionSpecifier )? s1= SEMICOLON )
                    {
                    if ( state.backtracking==0 ) { declaration = mdec; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:453:9: ( typeParameters )?
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==SMALLER_OP) ) {
                        alt34=1;
                    }
                    switch (alt34) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:454:11: typeParameters
                            {
                            pushFollow(FOLLOW_typeParameters_in_typedMethodOrAttributeDeclaration2808);
                            typeParameters73=typeParameters();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { mdef.setTypeParameterList(typeParameters73);
                                        mdec.setTypeParameterList(typeParameters73); }

                            }
                            break;

                    }


                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:458:9: ( parameters )+
                    int cnt35=0;
                    loop35:
                    do {
                        int alt35=2;
                        int LA35_0 = input.LA(1);

                        if ( (LA35_0==LPAREN) ) {
                            alt35=1;
                        }


                        switch (alt35) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:459:11: parameters
                    	    {
                    	    pushFollow(FOLLOW_parameters_in_typedMethodOrAttributeDeclaration2853);
                    	    parameters74=parameters();

                    	    state._fsp--;
                    	    if (state.failed) return declaration;

                    	    if ( state.backtracking==0 ) { mdef.addParameterList(parameters74);
                    	                mdec.addParameterList(parameters74); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt35 >= 1 ) break loop35;
                    	    if (state.backtracking>0) {state.failed=true; return declaration;}
                                EarlyExitException eee =
                                    new EarlyExitException(35, input);
                                throw eee;
                        }
                        cnt35++;
                    } while (true);


                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:464:9: ( typeConstraints )?
                    int alt36=2;
                    int LA36_0 = input.LA(1);

                    if ( (LA36_0==COMPILER_ANNOTATION||LA36_0==TYPE_CONSTRAINT) ) {
                        alt36=1;
                    }
                    switch (alt36) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:465:11: typeConstraints
                            {
                            pushFollow(FOLLOW_typeConstraints_in_typedMethodOrAttributeDeclaration2908);
                            typeConstraints75=typeConstraints();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { mdef.setTypeConstraintList(typeConstraints75);
                                        mdec.setTypeConstraintList(typeConstraints75); }

                            }
                            break;

                    }


                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:469:9: (b1= block | (ms= functionSpecifier )? s1= SEMICOLON )
                    int alt38=2;
                    int LA38_0 = input.LA(1);

                    if ( (LA38_0==LBRACE) ) {
                        alt38=1;
                    }
                    else if ( (LA38_0==COMPUTE||LA38_0==SEMICOLON||LA38_0==SPECIFY) ) {
                        alt38=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return declaration;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 38, 0, input);

                        throw nvae;

                    }
                    switch (alt38) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:470:11: b1= block
                            {
                            if ( state.backtracking==0 ) { declaration = mdef; }

                            pushFollow(FOLLOW_block_in_typedMethodOrAttributeDeclaration2968);
                            b1=block();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { mdef.setBlock(b1); }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:474:11: (ms= functionSpecifier )? s1= SEMICOLON
                            {
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:474:11: (ms= functionSpecifier )?
                            int alt37=2;
                            int LA37_0 = input.LA(1);

                            if ( (LA37_0==COMPUTE||LA37_0==SPECIFY) ) {
                                alt37=1;
                            }
                            switch (alt37) {
                                case 1 :
                                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:475:13: ms= functionSpecifier
                                    {
                                    pushFollow(FOLLOW_functionSpecifier_in_typedMethodOrAttributeDeclaration3018);
                                    ms=functionSpecifier();

                                    state._fsp--;
                                    if (state.failed) return declaration;

                                    if ( state.backtracking==0 ) { mdec.setSpecifierExpression(ms); }

                                    }
                                    break;

                            }


                            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                            s1=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_typedMethodOrAttributeDeclaration3070); if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { declaration.setEndToken(s1);
                                        expecting=-1; }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:484:9: (as= specifier |ac= lazySpecifier )? s2= SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:484:9: (as= specifier |ac= lazySpecifier )?
                    int alt39=3;
                    int LA39_0 = input.LA(1);

                    if ( (LA39_0==SPECIFY) ) {
                        alt39=1;
                    }
                    else if ( (LA39_0==COMPUTE) ) {
                        alt39=2;
                    }
                    switch (alt39) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:485:11: as= specifier
                            {
                            pushFollow(FOLLOW_specifier_in_typedMethodOrAttributeDeclaration3125);
                            as=specifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { adec.setSpecifierOrInitializerExpression(as); }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:488:11: ac= lazySpecifier
                            {
                            pushFollow(FOLLOW_lazySpecifier_in_typedMethodOrAttributeDeclaration3163);
                            ac=lazySpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { adec.setSpecifierOrInitializerExpression(ac); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    s2=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_typedMethodOrAttributeDeclaration3209); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setEndToken(s2); 
                            expecting=-1; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:496:9: b2= block
                    {
                    if ( state.backtracking==0 ) { declaration = adef; }

                    pushFollow(FOLLOW_block_in_typedMethodOrAttributeDeclaration3250);
                    b2=block();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { adef.setBlock(b2); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "typedMethodOrAttributeDeclaration"



    // $ANTLR start "interfaceDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:502:1: interfaceDeclaration returns [AnyInterface declaration] : INTERFACE_DEFINITION typeNameDeclaration ( typeParameters )? ( caseTypes )? ( satisfiedTypes )? ( typeConstraints )? ( interfaceBody | ( typeSpecifier )? SEMICOLON ) ;
    public AnyInterface interfaceDeclaration() throws RecognitionException {
        AnyInterface declaration = null;


        Token INTERFACE_DEFINITION76=null;
        Token SEMICOLON84=null;
        Identifier typeNameDeclaration77 =null;

        TypeParameterList typeParameters78 =null;

        CaseTypes caseTypes79 =null;

        SatisfiedTypes satisfiedTypes80 =null;

        TypeConstraintList typeConstraints81 =null;

        InterfaceBody interfaceBody82 =null;

        TypeSpecifier typeSpecifier83 =null;


         InterfaceDefinition def=null; 
                    InterfaceDeclaration dec=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:505:5: ( INTERFACE_DEFINITION typeNameDeclaration ( typeParameters )? ( caseTypes )? ( satisfiedTypes )? ( typeConstraints )? ( interfaceBody | ( typeSpecifier )? SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:505:7: INTERFACE_DEFINITION typeNameDeclaration ( typeParameters )? ( caseTypes )? ( satisfiedTypes )? ( typeConstraints )? ( interfaceBody | ( typeSpecifier )? SEMICOLON )
            {
            INTERFACE_DEFINITION76=(Token)match(input,INTERFACE_DEFINITION,FOLLOW_INTERFACE_DEFINITION_in_interfaceDeclaration3298); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { def = new InterfaceDefinition(INTERFACE_DEFINITION76); 
                    dec = new InterfaceDeclaration(INTERFACE_DEFINITION76);
                    declaration = dec; }

            pushFollow(FOLLOW_typeNameDeclaration_in_interfaceDeclaration3314);
            typeNameDeclaration77=typeNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { dec.setIdentifier(typeNameDeclaration77); 
                    def.setIdentifier(typeNameDeclaration77); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:512:7: ( typeParameters )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==SMALLER_OP) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:513:9: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_interfaceDeclaration3341);
                    typeParameters78=typeParameters();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setTypeParameterList(typeParameters78); 
                              dec.setTypeParameterList(typeParameters78); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:517:7: ( caseTypes )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==CASE_TYPES) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:518:9: caseTypes
                    {
                    pushFollow(FOLLOW_caseTypes_in_interfaceDeclaration3379);
                    caseTypes79=caseTypes();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setCaseTypes(caseTypes79); 
                              dec.setCaseTypes(caseTypes79); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:527:7: ( satisfiedTypes )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==SATISFIES) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:528:9: satisfiedTypes
                    {
                    pushFollow(FOLLOW_satisfiedTypes_in_interfaceDeclaration3433);
                    satisfiedTypes80=satisfiedTypes();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setSatisfiedTypes(satisfiedTypes80); 
                              dec.setSatisfiedTypes(satisfiedTypes80); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:532:7: ( typeConstraints )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==COMPILER_ANNOTATION||LA44_0==TYPE_CONSTRAINT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:533:9: typeConstraints
                    {
                    pushFollow(FOLLOW_typeConstraints_in_interfaceDeclaration3470);
                    typeConstraints81=typeConstraints();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setTypeConstraintList(typeConstraints81); 
                              dec.setTypeConstraintList(typeConstraints81); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:537:7: ( interfaceBody | ( typeSpecifier )? SEMICOLON )
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==LBRACE) ) {
                alt46=1;
            }
            else if ( (LA46_0==COMPUTE||LA46_0==SEMICOLON||LA46_0==SPECIFY) ) {
                alt46=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 46, 0, input);

                throw nvae;

            }
            switch (alt46) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:538:9: interfaceBody
                    {
                    if ( state.backtracking==0 ) { declaration = def; }

                    pushFollow(FOLLOW_interfaceBody_in_interfaceDeclaration3517);
                    interfaceBody82=interfaceBody();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setInterfaceBody(interfaceBody82); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:542:9: ( typeSpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:542:9: ( typeSpecifier )?
                    int alt45=2;
                    int LA45_0 = input.LA(1);

                    if ( (LA45_0==COMPUTE||LA45_0==SPECIFY) ) {
                        alt45=1;
                    }
                    switch (alt45) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:543:11: typeSpecifier
                            {
                            pushFollow(FOLLOW_typeSpecifier_in_interfaceDeclaration3558);
                            typeSpecifier83=typeSpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { dec.setTypeSpecifier(typeSpecifier83); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON84=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_interfaceDeclaration3602); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON84); 
                              expecting=-1; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "interfaceDeclaration"



    // $ANTLR start "classDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:553:1: classDeclaration returns [AnyClass declaration] : CLASS_DEFINITION typeNameDeclaration ( typeParameters )? ( parameters )? ( caseTypes )? ( extendedType )? ( satisfiedTypes )? ( typeConstraints )? ( classBody | ( classSpecifier )? SEMICOLON ) ;
    public AnyClass classDeclaration() throws RecognitionException {
        AnyClass declaration = null;


        Token CLASS_DEFINITION85=null;
        Token SEMICOLON95=null;
        Identifier typeNameDeclaration86 =null;

        TypeParameterList typeParameters87 =null;

        ParameterList parameters88 =null;

        CaseTypes caseTypes89 =null;

        ExtendedType extendedType90 =null;

        SatisfiedTypes satisfiedTypes91 =null;

        TypeConstraintList typeConstraints92 =null;

        ClassBody classBody93 =null;

        ClassSpecifier classSpecifier94 =null;


         ClassDefinition def=null; 
                    ClassDeclaration dec=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:556:5: ( CLASS_DEFINITION typeNameDeclaration ( typeParameters )? ( parameters )? ( caseTypes )? ( extendedType )? ( satisfiedTypes )? ( typeConstraints )? ( classBody | ( classSpecifier )? SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:556:7: CLASS_DEFINITION typeNameDeclaration ( typeParameters )? ( parameters )? ( caseTypes )? ( extendedType )? ( satisfiedTypes )? ( typeConstraints )? ( classBody | ( classSpecifier )? SEMICOLON )
            {
            CLASS_DEFINITION85=(Token)match(input,CLASS_DEFINITION,FOLLOW_CLASS_DEFINITION_in_classDeclaration3650); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { def = new ClassDefinition(CLASS_DEFINITION85); 
                    dec = new ClassDeclaration(CLASS_DEFINITION85);
                    declaration = dec; }

            pushFollow(FOLLOW_typeNameDeclaration_in_classDeclaration3667);
            typeNameDeclaration86=typeNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { dec.setIdentifier(typeNameDeclaration86); 
                    def.setIdentifier(typeNameDeclaration86); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:563:7: ( typeParameters )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==SMALLER_OP) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:564:9: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_classDeclaration3693);
                    typeParameters87=typeParameters();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setTypeParameterList(typeParameters87); 
                              dec.setTypeParameterList(typeParameters87); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:568:7: ( parameters )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==LPAREN) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:569:9: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_classDeclaration3730);
                    parameters88=parameters();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setParameterList(parameters88); 
                              dec.setParameterList(parameters88); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:573:7: ( caseTypes )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==CASE_TYPES) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:574:9: caseTypes
                    {
                    pushFollow(FOLLOW_caseTypes_in_classDeclaration3767);
                    caseTypes89=caseTypes();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setCaseTypes(caseTypes89); 
                              dec.setCaseTypes(caseTypes89); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:579:7: ( extendedType )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==EXTENDS) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:580:9: extendedType
                    {
                    pushFollow(FOLLOW_extendedType_in_classDeclaration3813);
                    extendedType90=extendedType();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setExtendedType(extendedType90); 
                              dec.setExtendedType(extendedType90); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:584:7: ( satisfiedTypes )?
            int alt51=2;
            int LA51_0 = input.LA(1);

            if ( (LA51_0==SATISFIES) ) {
                alt51=1;
            }
            switch (alt51) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:585:9: satisfiedTypes
                    {
                    pushFollow(FOLLOW_satisfiedTypes_in_classDeclaration3851);
                    satisfiedTypes91=satisfiedTypes();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setSatisfiedTypes(satisfiedTypes91); 
                              dec.setSatisfiedTypes(satisfiedTypes91); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:589:7: ( typeConstraints )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==COMPILER_ANNOTATION||LA52_0==TYPE_CONSTRAINT) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:590:9: typeConstraints
                    {
                    pushFollow(FOLLOW_typeConstraints_in_classDeclaration3888);
                    typeConstraints92=typeConstraints();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setTypeConstraintList(typeConstraints92); 
                              dec.setTypeConstraintList(typeConstraints92); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:594:7: ( classBody | ( classSpecifier )? SEMICOLON )
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==LBRACE) ) {
                alt54=1;
            }
            else if ( (LA54_0==COMPUTE||LA54_0==SEMICOLON||LA54_0==SPECIFY) ) {
                alt54=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 54, 0, input);

                throw nvae;

            }
            switch (alt54) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:595:9: classBody
                    {
                    if ( state.backtracking==0 ) { declaration = def; }

                    pushFollow(FOLLOW_classBody_in_classDeclaration3935);
                    classBody93=classBody();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { def.setClassBody(classBody93); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:599:9: ( classSpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:599:9: ( classSpecifier )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==COMPUTE||LA53_0==SPECIFY) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:600:11: classSpecifier
                            {
                            pushFollow(FOLLOW_classSpecifier_in_classDeclaration3976);
                            classSpecifier94=classSpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { dec.setClassSpecifier(classSpecifier94); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON95=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_classDeclaration4019); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON95); 
                              expecting=-1; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "classDeclaration"



    // $ANTLR start "aliasDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:610:1: aliasDeclaration returns [TypeAliasDeclaration declaration] : ALIAS typeNameDeclaration ( typeParameters )? ( typeConstraints )? ( typeSpecifier )? SEMICOLON ;
    public TypeAliasDeclaration aliasDeclaration() throws RecognitionException {
        TypeAliasDeclaration declaration = null;


        Token ALIAS96=null;
        Token SEMICOLON101=null;
        Identifier typeNameDeclaration97 =null;

        TypeParameterList typeParameters98 =null;

        TypeConstraintList typeConstraints99 =null;

        TypeSpecifier typeSpecifier100 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:611:5: ( ALIAS typeNameDeclaration ( typeParameters )? ( typeConstraints )? ( typeSpecifier )? SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:611:7: ALIAS typeNameDeclaration ( typeParameters )? ( typeConstraints )? ( typeSpecifier )? SEMICOLON
            {
            ALIAS96=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_aliasDeclaration4058); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration = new TypeAliasDeclaration(ALIAS96);}

            pushFollow(FOLLOW_typeNameDeclaration_in_aliasDeclaration4074);
            typeNameDeclaration97=typeNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setIdentifier(typeNameDeclaration97); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:615:7: ( typeParameters )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==SMALLER_OP) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:616:9: typeParameters
                    {
                    pushFollow(FOLLOW_typeParameters_in_aliasDeclaration4101);
                    typeParameters98=typeParameters();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setTypeParameterList(typeParameters98); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:619:7: ( typeConstraints )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==COMPILER_ANNOTATION||LA56_0==TYPE_CONSTRAINT) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:620:9: typeConstraints
                    {
                    pushFollow(FOLLOW_typeConstraints_in_aliasDeclaration4139);
                    typeConstraints99=typeConstraints();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setTypeConstraintList(typeConstraints99); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:623:7: ( typeSpecifier )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==COMPUTE||LA57_0==SPECIFY) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:624:9: typeSpecifier
                    {
                    pushFollow(FOLLOW_typeSpecifier_in_aliasDeclaration4176);
                    typeSpecifier100=typeSpecifier();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setTypeSpecifier(typeSpecifier100); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

            SEMICOLON101=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_aliasDeclaration4211); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON101); 
                    expecting=-1; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "aliasDeclaration"



    // $ANTLR start "assertion"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:633:1: assertion returns [Assertion assertion] : annotations ASSERT conditions SEMICOLON ;
    public Assertion assertion() throws RecognitionException {
        Assertion assertion = null;


        Token ASSERT102=null;
        Token SEMICOLON105=null;
        AnnotationList annotations103 =null;

        ConditionList conditions104 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:634:5: ( annotations ASSERT conditions SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:634:7: annotations ASSERT conditions SEMICOLON
            {
            pushFollow(FOLLOW_annotations_in_assertion4240);
            annotations103=annotations();

            state._fsp--;
            if (state.failed) return assertion;

            ASSERT102=(Token)match(input,ASSERT,FOLLOW_ASSERT_in_assertion4248); if (state.failed) return assertion;

            if ( state.backtracking==0 ) { assertion = new Assertion(ASSERT102); 
                    assertion.setAnnotationList(annotations103); }

            pushFollow(FOLLOW_conditions_in_assertion4264);
            conditions104=conditions();

            state._fsp--;
            if (state.failed) return assertion;

            if ( state.backtracking==0 ) { assertion.setConditionList(conditions104); }

            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

            SEMICOLON105=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_assertion4288); if (state.failed) return assertion;

            if ( state.backtracking==0 ) { assertion.setEndToken(SEMICOLON105); 
                    expecting=-1; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return assertion;
    }
    // $ANTLR end "assertion"



    // $ANTLR start "block"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:646:1: block returns [Block block] : LBRACE ( declarationOrStatement )* RBRACE ;
    public Block block() throws RecognitionException {
        Block block = null;


        Token LBRACE106=null;
        Token RBRACE108=null;
        Statement declarationOrStatement107 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:647:5: ( LBRACE ( declarationOrStatement )* RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:647:7: LBRACE ( declarationOrStatement )* RBRACE
            {
            LBRACE106=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_block4317); if (state.failed) return block;

            if ( state.backtracking==0 ) { block = new Block(LBRACE106); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:649:7: ( declarationOrStatement )*
            loop58:
            do {
                int alt58=2;
                int LA58_0 = input.LA(1);

                if ( (LA58_0==ALIAS||(LA58_0 >= ASSERT && LA58_0 <= ASSIGN)||(LA58_0 >= BACKTICK && LA58_0 <= BREAK)||(LA58_0 >= CHAR_LITERAL && LA58_0 <= CLASS_DEFINITION)||LA58_0==COMPILER_ANNOTATION||LA58_0==CONTINUE||(LA58_0 >= DECREMENT_OP && LA58_0 <= DIFFERENCE_OP)||LA58_0==DYNAMIC||(LA58_0 >= FLOAT_LITERAL && LA58_0 <= FUNCTION_MODIFIER)||(LA58_0 >= IF_CLAUSE && LA58_0 <= INTERFACE_DEFINITION)||LA58_0==IN_OP||(LA58_0 >= LBRACE && LA58_0 <= LIDENTIFIER)||LA58_0==LPAREN||LA58_0==MODULE||LA58_0==NATURAL_LITERAL||(LA58_0 >= NOT_OP && LA58_0 <= OBJECT_DEFINITION)||(LA58_0 >= OUT && LA58_0 <= PACKAGE)||LA58_0==PRODUCT_OP||(LA58_0 >= RETURN && LA58_0 <= RPAREN)||(LA58_0 >= SEMICOLON && LA58_0 <= SMALLER_OP)||LA58_0==STRING_LITERAL||LA58_0==STRING_START||(LA58_0 >= SUM_OP && LA58_0 <= SWITCH_CLAUSE)||(LA58_0 >= THIS && LA58_0 <= UIDENTIFIER)||(LA58_0 >= VALUE_MODIFIER && LA58_0 <= WHILE_CLAUSE)) ) {
                    alt58=1;
                }


                switch (alt58) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:650:9: declarationOrStatement
            	    {
            	    pushFollow(FOLLOW_declarationOrStatement_in_block4344);
            	    declarationOrStatement107=declarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return block;

            	    if ( state.backtracking==0 ) { if (declarationOrStatement107!=null)
            	                  block.addStatement(declarationOrStatement107); }

            	    }
            	    break;

            	default :
            	    break loop58;
                }
            } while (true);


            RBRACE108=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_block4371); if (state.failed) return block;

            if ( state.backtracking==0 ) { block.setEndToken(RBRACE108); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return block;
    }
    // $ANTLR end "block"



    // $ANTLR start "interfaceBody"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:662:1: interfaceBody returns [InterfaceBody interfaceBody] : LBRACE ( declarationOrStatement )* RBRACE ;
    public InterfaceBody interfaceBody() throws RecognitionException {
        InterfaceBody interfaceBody = null;


        Token LBRACE109=null;
        Token RBRACE111=null;
        Statement declarationOrStatement110 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:663:5: ( LBRACE ( declarationOrStatement )* RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:663:7: LBRACE ( declarationOrStatement )* RBRACE
            {
            LBRACE109=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_interfaceBody4404); if (state.failed) return interfaceBody;

            if ( state.backtracking==0 ) { interfaceBody = new InterfaceBody(LBRACE109); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:665:7: ( declarationOrStatement )*
            loop59:
            do {
                int alt59=2;
                int LA59_0 = input.LA(1);

                if ( (LA59_0==ALIAS||(LA59_0 >= ASSERT && LA59_0 <= ASSIGN)||(LA59_0 >= BACKTICK && LA59_0 <= BREAK)||(LA59_0 >= CHAR_LITERAL && LA59_0 <= CLASS_DEFINITION)||LA59_0==COMPILER_ANNOTATION||LA59_0==CONTINUE||(LA59_0 >= DECREMENT_OP && LA59_0 <= DIFFERENCE_OP)||LA59_0==DYNAMIC||(LA59_0 >= FLOAT_LITERAL && LA59_0 <= FUNCTION_MODIFIER)||(LA59_0 >= IF_CLAUSE && LA59_0 <= INTERFACE_DEFINITION)||LA59_0==IN_OP||(LA59_0 >= LBRACE && LA59_0 <= LIDENTIFIER)||LA59_0==LPAREN||LA59_0==MODULE||LA59_0==NATURAL_LITERAL||(LA59_0 >= NOT_OP && LA59_0 <= OBJECT_DEFINITION)||(LA59_0 >= OUT && LA59_0 <= PACKAGE)||LA59_0==PRODUCT_OP||(LA59_0 >= RETURN && LA59_0 <= RPAREN)||(LA59_0 >= SEMICOLON && LA59_0 <= SMALLER_OP)||LA59_0==STRING_LITERAL||LA59_0==STRING_START||(LA59_0 >= SUM_OP && LA59_0 <= SWITCH_CLAUSE)||(LA59_0 >= THIS && LA59_0 <= UIDENTIFIER)||(LA59_0 >= VALUE_MODIFIER && LA59_0 <= WHILE_CLAUSE)) ) {
                    alt59=1;
                }


                switch (alt59) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:666:9: declarationOrStatement
            	    {
            	    pushFollow(FOLLOW_declarationOrStatement_in_interfaceBody4431);
            	    declarationOrStatement110=declarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return interfaceBody;

            	    if ( state.backtracking==0 ) { if (declarationOrStatement110!=null)
            	                  interfaceBody.addStatement(declarationOrStatement110); }

            	    }
            	    break;

            	default :
            	    break loop59;
                }
            } while (true);


            RBRACE111=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_interfaceBody4458); if (state.failed) return interfaceBody;

            if ( state.backtracking==0 ) { interfaceBody.setEndToken(RBRACE111); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return interfaceBody;
    }
    // $ANTLR end "interfaceBody"



    // $ANTLR start "classBody"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:674:1: classBody returns [ClassBody classBody] : LBRACE ( declarationOrStatement )* RBRACE ;
    public ClassBody classBody() throws RecognitionException {
        ClassBody classBody = null;


        Token LBRACE112=null;
        Token RBRACE114=null;
        Statement declarationOrStatement113 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:675:5: ( LBRACE ( declarationOrStatement )* RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:675:7: LBRACE ( declarationOrStatement )* RBRACE
            {
            LBRACE112=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_classBody4487); if (state.failed) return classBody;

            if ( state.backtracking==0 ) { classBody = new ClassBody(LBRACE112); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:677:7: ( declarationOrStatement )*
            loop60:
            do {
                int alt60=2;
                int LA60_0 = input.LA(1);

                if ( (LA60_0==ALIAS||(LA60_0 >= ASSERT && LA60_0 <= ASSIGN)||(LA60_0 >= BACKTICK && LA60_0 <= BREAK)||(LA60_0 >= CHAR_LITERAL && LA60_0 <= CLASS_DEFINITION)||LA60_0==COMPILER_ANNOTATION||LA60_0==CONTINUE||(LA60_0 >= DECREMENT_OP && LA60_0 <= DIFFERENCE_OP)||LA60_0==DYNAMIC||(LA60_0 >= FLOAT_LITERAL && LA60_0 <= FUNCTION_MODIFIER)||(LA60_0 >= IF_CLAUSE && LA60_0 <= INTERFACE_DEFINITION)||LA60_0==IN_OP||(LA60_0 >= LBRACE && LA60_0 <= LIDENTIFIER)||LA60_0==LPAREN||LA60_0==MODULE||LA60_0==NATURAL_LITERAL||(LA60_0 >= NOT_OP && LA60_0 <= OBJECT_DEFINITION)||(LA60_0 >= OUT && LA60_0 <= PACKAGE)||LA60_0==PRODUCT_OP||(LA60_0 >= RETURN && LA60_0 <= RPAREN)||(LA60_0 >= SEMICOLON && LA60_0 <= SMALLER_OP)||LA60_0==STRING_LITERAL||LA60_0==STRING_START||(LA60_0 >= SUM_OP && LA60_0 <= SWITCH_CLAUSE)||(LA60_0 >= THIS && LA60_0 <= UIDENTIFIER)||(LA60_0 >= VALUE_MODIFIER && LA60_0 <= WHILE_CLAUSE)) ) {
                    alt60=1;
                }


                switch (alt60) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:678:9: declarationOrStatement
            	    {
            	    pushFollow(FOLLOW_declarationOrStatement_in_classBody4513);
            	    declarationOrStatement113=declarationOrStatement();

            	    state._fsp--;
            	    if (state.failed) return classBody;

            	    if ( state.backtracking==0 ) { if (declarationOrStatement113!=null)
            	                  classBody.addStatement(declarationOrStatement113); }

            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            RBRACE114=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_classBody4540); if (state.failed) return classBody;

            if ( state.backtracking==0 ) { classBody.setEndToken(RBRACE114); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return classBody;
    }
    // $ANTLR end "classBody"



    // $ANTLR start "extendedType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:686:1: extendedType returns [ExtendedType extendedType] : EXTENDS ci= classInstantiation ;
    public ExtendedType extendedType() throws RecognitionException {
        ExtendedType extendedType = null;


        Token EXTENDS115=null;
        CeylonParser.classInstantiation_return ci =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:687:5: ( EXTENDS ci= classInstantiation )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:687:7: EXTENDS ci= classInstantiation
            {
            EXTENDS115=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_extendedType4569); if (state.failed) return extendedType;

            if ( state.backtracking==0 ) { extendedType = new ExtendedType(EXTENDS115); }

            pushFollow(FOLLOW_classInstantiation_in_extendedType4581);
            ci=classInstantiation();

            state._fsp--;
            if (state.failed) return extendedType;

            if ( state.backtracking==0 ) { extendedType.setType((ci!=null?ci.type:null));
                    extendedType.setInvocationExpression((ci!=null?ci.invocationExpression:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return extendedType;
    }
    // $ANTLR end "extendedType"



    // $ANTLR start "classSpecifier"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:693:1: classSpecifier returns [ClassSpecifier classSpecifier] : ( COMPUTE | SPECIFY ) ci= classInstantiation ;
    public ClassSpecifier classSpecifier() throws RecognitionException {
        ClassSpecifier classSpecifier = null;


        Token COMPUTE116=null;
        Token SPECIFY117=null;
        CeylonParser.classInstantiation_return ci =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:694:5: ( ( COMPUTE | SPECIFY ) ci= classInstantiation )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:694:7: ( COMPUTE | SPECIFY ) ci= classInstantiation
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:694:7: ( COMPUTE | SPECIFY )
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==COMPUTE) ) {
                alt61=1;
            }
            else if ( (LA61_0==SPECIFY) ) {
                alt61=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return classSpecifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;

            }
            switch (alt61) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:695:9: COMPUTE
                    {
                    COMPUTE116=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_classSpecifier4620); if (state.failed) return classSpecifier;

                    if ( state.backtracking==0 ) { classSpecifier = new ClassSpecifier(COMPUTE116); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:698:9: SPECIFY
                    {
                    SPECIFY117=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_classSpecifier4649); if (state.failed) return classSpecifier;

                    if ( state.backtracking==0 ) { classSpecifier = new ClassSpecifier(SPECIFY117); }

                    }
                    break;

            }


            pushFollow(FOLLOW_classInstantiation_in_classSpecifier4678);
            ci=classInstantiation();

            state._fsp--;
            if (state.failed) return classSpecifier;

            if ( state.backtracking==0 ) { classSpecifier.setType((ci!=null?ci.type:null));
                    classSpecifier.setInvocationExpression((ci!=null?ci.invocationExpression:null)); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return classSpecifier;
    }
    // $ANTLR end "classSpecifier"


    public static class classInstantiation_return extends ParserRuleReturnScope {
        public SimpleType type;
        public InvocationExpression invocationExpression;
    };


    // $ANTLR start "classInstantiation"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:706:1: classInstantiation returns [SimpleType type, InvocationExpression invocationExpression] : (t1= typeNameWithArguments | SUPER MEMBER_OP t2= typeNameWithArguments ) ( positionalArguments )? ;
    public CeylonParser.classInstantiation_return classInstantiation() throws RecognitionException {
        CeylonParser.classInstantiation_return retval = new CeylonParser.classInstantiation_return();
        retval.start = input.LT(1);


        Token SUPER118=null;
        CeylonParser.typeNameWithArguments_return t1 =null;

        CeylonParser.typeNameWithArguments_return t2 =null;

        PositionalArgumentList positionalArguments119 =null;


         Primary p=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:708:5: ( (t1= typeNameWithArguments | SUPER MEMBER_OP t2= typeNameWithArguments ) ( positionalArguments )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:708:7: (t1= typeNameWithArguments | SUPER MEMBER_OP t2= typeNameWithArguments ) ( positionalArguments )?
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:708:7: (t1= typeNameWithArguments | SUPER MEMBER_OP t2= typeNameWithArguments )
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==UIDENTIFIER) ) {
                alt62=1;
            }
            else if ( (LA62_0==SUPER) ) {
                alt62=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 62, 0, input);

                throw nvae;

            }
            switch (alt62) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:709:9: t1= typeNameWithArguments
                    {
                    pushFollow(FOLLOW_typeNameWithArguments_in_classInstantiation4728);
                    t1=typeNameWithArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { BaseType bt = new BaseType(null);
                              bt.setIdentifier((t1!=null?t1.identifier:null));
                              if ((t1!=null?t1.typeArgumentList:null)!=null)
                                  bt.setTypeArgumentList((t1!=null?t1.typeArgumentList:null));
                              retval.type =bt; 
                              ExtendedTypeExpression ete = new ExtendedTypeExpression(null);
                              ete.setExtendedType(retval.type); 
                              p = ete; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:718:9: SUPER MEMBER_OP t2= typeNameWithArguments
                    {
                    SUPER118=(Token)match(input,SUPER,FOLLOW_SUPER_in_classInstantiation4748); if (state.failed) return retval;

                    match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_classInstantiation4750); if (state.failed) return retval;

                    pushFollow(FOLLOW_typeNameWithArguments_in_classInstantiation4763);
                    t2=typeNameWithArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { QualifiedType qt=new QualifiedType(null);
                              SuperType st = new SuperType(SUPER118);
                              qt.setOuterType(st);
                              qt.setIdentifier((t2!=null?t2.identifier:null));
                              if ((t2!=null?t2.typeArgumentList:null)!=null)
                                  qt.setTypeArgumentList((t2!=null?t2.typeArgumentList:null));
                              retval.type =qt;
                              ExtendedTypeExpression ete = new ExtendedTypeExpression(null);
                              ete.setExtendedType(retval.type); 
                              p = ete; }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:731:7: ( positionalArguments )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LPAREN) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:732:9: positionalArguments
                    {
                    pushFollow(FOLLOW_positionalArguments_in_classInstantiation4800);
                    positionalArguments119=positionalArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { InvocationExpression ie = new InvocationExpression(null);
                              ie.setPrimary(p);
                              ie.setPositionalArgumentList(positionalArguments119);
                              retval.invocationExpression =ie; 
                              p = ie; }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "classInstantiation"



    // $ANTLR start "satisfiedTypes"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:741:1: satisfiedTypes returns [SatisfiedTypes satisfiedTypes] : SATISFIES (t1= abbreviatedType ) (i= INTERSECTION_OP (t2= abbreviatedType ) )* ;
    public SatisfiedTypes satisfiedTypes() throws RecognitionException {
        SatisfiedTypes satisfiedTypes = null;


        Token i=null;
        Token SATISFIES120=null;
        StaticType t1 =null;

        StaticType t2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:742:5: ( SATISFIES (t1= abbreviatedType ) (i= INTERSECTION_OP (t2= abbreviatedType ) )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:742:7: SATISFIES (t1= abbreviatedType ) (i= INTERSECTION_OP (t2= abbreviatedType ) )*
            {
            SATISFIES120=(Token)match(input,SATISFIES,FOLLOW_SATISFIES_in_satisfiedTypes4840); if (state.failed) return satisfiedTypes;

            if ( state.backtracking==0 ) { satisfiedTypes = new SatisfiedTypes(SATISFIES120); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:744:7: (t1= abbreviatedType )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:745:9: t1= abbreviatedType
            {
            pushFollow(FOLLOW_abbreviatedType_in_satisfiedTypes4870);
            t1=abbreviatedType();

            state._fsp--;
            if (state.failed) return satisfiedTypes;

            if ( state.backtracking==0 ) { if (t1!=null) satisfiedTypes.addType(t1); }

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:748:7: (i= INTERSECTION_OP (t2= abbreviatedType ) )*
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==INTERSECTION_OP) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:749:9: i= INTERSECTION_OP (t2= abbreviatedType )
            	    {
            	    i=(Token)match(input,INTERSECTION_OP,FOLLOW_INTERSECTION_OP_in_satisfiedTypes4909); if (state.failed) return satisfiedTypes;

            	    if ( state.backtracking==0 ) { satisfiedTypes.setEndToken(i); }

            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:751:9: (t2= abbreviatedType )
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:752:11: t2= abbreviatedType
            	    {
            	    pushFollow(FOLLOW_abbreviatedType_in_satisfiedTypes4943);
            	    t2=abbreviatedType();

            	    state._fsp--;
            	    if (state.failed) return satisfiedTypes;

            	    if ( state.backtracking==0 ) { if (t2!=null) {
            	                    satisfiedTypes.addType(t2); 
            	                    satisfiedTypes.setEndToken(null); } }

            	    }


            	    }
            	    break;

            	default :
            	    break loop64;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return satisfiedTypes;
    }
    // $ANTLR end "satisfiedTypes"



    // $ANTLR start "abstractedType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:760:1: abstractedType returns [AbstractedType abstractedType] : ABSTRACTED_TYPE qualifiedType ;
    public AbstractedType abstractedType() throws RecognitionException {
        AbstractedType abstractedType = null;


        Token ABSTRACTED_TYPE121=null;
        SimpleType qualifiedType122 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:761:5: ( ABSTRACTED_TYPE qualifiedType )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:761:7: ABSTRACTED_TYPE qualifiedType
            {
            ABSTRACTED_TYPE121=(Token)match(input,ABSTRACTED_TYPE,FOLLOW_ABSTRACTED_TYPE_in_abstractedType4995); if (state.failed) return abstractedType;

            if ( state.backtracking==0 ) { abstractedType = new AbstractedType(ABSTRACTED_TYPE121); }

            pushFollow(FOLLOW_qualifiedType_in_abstractedType5011);
            qualifiedType122=qualifiedType();

            state._fsp--;
            if (state.failed) return abstractedType;

            if ( state.backtracking==0 ) { abstractedType.setType(qualifiedType122); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return abstractedType;
    }
    // $ANTLR end "abstractedType"



    // $ANTLR start "caseTypes"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:785:1: caseTypes returns [CaseTypes caseTypes] : CASE_TYPES ct1= caseType (u= UNION_OP (ct2= caseType ) )* ;
    public CaseTypes caseTypes() throws RecognitionException {
        CaseTypes caseTypes = null;


        Token u=null;
        Token CASE_TYPES123=null;
        CeylonParser.caseType_return ct1 =null;

        CeylonParser.caseType_return ct2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:786:5: ( CASE_TYPES ct1= caseType (u= UNION_OP (ct2= caseType ) )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:786:7: CASE_TYPES ct1= caseType (u= UNION_OP (ct2= caseType ) )*
            {
            CASE_TYPES123=(Token)match(input,CASE_TYPES,FOLLOW_CASE_TYPES_in_caseTypes5043); if (state.failed) return caseTypes;

            if ( state.backtracking==0 ) { caseTypes = new CaseTypes(CASE_TYPES123); }

            pushFollow(FOLLOW_caseType_in_caseTypes5061);
            ct1=caseType();

            state._fsp--;
            if (state.failed) return caseTypes;

            if ( state.backtracking==0 ) { if ((ct1!=null?ct1.type:null)!=null) caseTypes.addType((ct1!=null?ct1.type:null)); 
                    if ((ct1!=null?ct1.instance:null)!=null) caseTypes.addBaseMemberExpression((ct1!=null?ct1.instance:null)); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:791:7: (u= UNION_OP (ct2= caseType ) )*
            loop65:
            do {
                int alt65=2;
                int LA65_0 = input.LA(1);

                if ( (LA65_0==UNION_OP) ) {
                    alt65=1;
                }


                switch (alt65) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:792:9: u= UNION_OP (ct2= caseType )
            	    {
            	    u=(Token)match(input,UNION_OP,FOLLOW_UNION_OP_in_caseTypes5090); if (state.failed) return caseTypes;

            	    if ( state.backtracking==0 ) { caseTypes.setEndToken(u); }

            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:794:9: (ct2= caseType )
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:795:11: ct2= caseType
            	    {
            	    pushFollow(FOLLOW_caseType_in_caseTypes5125);
            	    ct2=caseType();

            	    state._fsp--;
            	    if (state.failed) return caseTypes;

            	    if ( state.backtracking==0 ) { if ((ct2!=null?ct2.type:null)!=null) caseTypes.addType((ct2!=null?ct2.type:null)); 
            	                if ((ct2!=null?ct2.instance:null)!=null) caseTypes.addBaseMemberExpression((ct2!=null?ct2.instance:null)); 
            	                if ((ct2!=null?ct2.type:null)!=null||(ct2!=null?ct2.instance:null)!=null) caseTypes.setEndToken(null); }

            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return caseTypes;
    }
    // $ANTLR end "caseTypes"


    public static class caseType_return extends ParserRuleReturnScope {
        public StaticType type;
        public BaseMemberExpression instance;
    };


    // $ANTLR start "caseType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:803:1: caseType returns [StaticType type, BaseMemberExpression instance] : (t= abbreviatedType | memberName );
    public CeylonParser.caseType_return caseType() throws RecognitionException {
        CeylonParser.caseType_return retval = new CeylonParser.caseType_return();
        retval.start = input.LT(1);


        StaticType t =null;

        Identifier memberName124 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:804:5: (t= abbreviatedType | memberName )
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( ((LA66_0 >= LBRACE && LA66_0 <= LBRACKET)||LA66_0==SMALLER_OP||LA66_0==UIDENTIFIER) ) {
                alt66=1;
            }
            else if ( (LA66_0==LIDENTIFIER) ) {
                alt66=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;

            }
            switch (alt66) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:804:7: t= abbreviatedType
                    {
                    pushFollow(FOLLOW_abbreviatedType_in_caseType5179);
                    t=abbreviatedType();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.type =t;}

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:806:7: memberName
                    {
                    pushFollow(FOLLOW_memberName_in_caseType5196);
                    memberName124=memberName();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.instance = new BaseMemberExpression(null);
                            retval.instance.setIdentifier(memberName124);
                            retval.instance.setTypeArguments( new InferredTypeArguments(null) ); }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "caseType"



    // $ANTLR start "parameters"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:821:1: parameters returns [ParameterList parameterList] : LPAREN (ap1= parameterDeclarationOrRef (c= COMMA (ap2= parameterDeclarationOrRef |) )* )? RPAREN ;
    public ParameterList parameters() throws RecognitionException {
        ParameterList parameterList = null;


        Token c=null;
        Token LPAREN125=null;
        Token RPAREN126=null;
        Parameter ap1 =null;

        Parameter ap2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:822:5: ( LPAREN (ap1= parameterDeclarationOrRef (c= COMMA (ap2= parameterDeclarationOrRef |) )* )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:822:7: LPAREN (ap1= parameterDeclarationOrRef (c= COMMA (ap2= parameterDeclarationOrRef |) )* )? RPAREN
            {
            LPAREN125=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parameters5236); if (state.failed) return parameterList;

            if ( state.backtracking==0 ) { parameterList =new ParameterList(LPAREN125); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:824:7: (ap1= parameterDeclarationOrRef (c= COMMA (ap2= parameterDeclarationOrRef |) )* )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==COMPILER_ANNOTATION||LA69_0==DYNAMIC||LA69_0==FUNCTION_MODIFIER||(LA69_0 >= LBRACE && LA69_0 <= LIDENTIFIER)||LA69_0==SMALLER_OP||LA69_0==STRING_LITERAL||LA69_0==UIDENTIFIER||(LA69_0 >= VALUE_MODIFIER && LA69_0 <= VOID_MODIFIER)) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:825:9: ap1= parameterDeclarationOrRef (c= COMMA (ap2= parameterDeclarationOrRef |) )*
                    {
                    pushFollow(FOLLOW_parameterDeclarationOrRef_in_parameters5264);
                    ap1=parameterDeclarationOrRef();

                    state._fsp--;
                    if (state.failed) return parameterList;

                    if ( state.backtracking==0 ) { if (ap1!=null)
                                  parameterList.addParameter(ap1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:828:9: (c= COMMA (ap2= parameterDeclarationOrRef |) )*
                    loop68:
                    do {
                        int alt68=2;
                        int LA68_0 = input.LA(1);

                        if ( (LA68_0==COMMA) ) {
                            alt68=1;
                        }


                        switch (alt68) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:829:11: c= COMMA (ap2= parameterDeclarationOrRef |)
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_parameters5299); if (state.failed) return parameterList;

                    	    if ( state.backtracking==0 ) { parameterList.setEndToken(c); }

                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:831:11: (ap2= parameterDeclarationOrRef |)
                    	    int alt67=2;
                    	    int LA67_0 = input.LA(1);

                    	    if ( (LA67_0==COMPILER_ANNOTATION||LA67_0==DYNAMIC||LA67_0==FUNCTION_MODIFIER||(LA67_0 >= LBRACE && LA67_0 <= LIDENTIFIER)||LA67_0==SMALLER_OP||LA67_0==STRING_LITERAL||LA67_0==UIDENTIFIER||(LA67_0 >= VALUE_MODIFIER && LA67_0 <= VOID_MODIFIER)) ) {
                    	        alt67=1;
                    	    }
                    	    else if ( (LA67_0==COMMA||LA67_0==RPAREN) ) {
                    	        alt67=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return parameterList;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 67, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt67) {
                    	        case 1 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:832:13: ap2= parameterDeclarationOrRef
                    	            {
                    	            pushFollow(FOLLOW_parameterDeclarationOrRef_in_parameters5339);
                    	            ap2=parameterDeclarationOrRef();

                    	            state._fsp--;
                    	            if (state.failed) return parameterList;

                    	            if ( state.backtracking==0 ) { if (ap2!=null) {
                    	                              parameterList.addParameter(ap2); 
                    	                              parameterList.setEndToken(null); } }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:837:13: 
                    	            {
                    	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(),
                    	                            new MismatchedTokenException(UIDENTIFIER, input)); }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop68;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN126=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parameters5419); if (state.failed) return parameterList;

            if ( state.backtracking==0 ) { parameterList.setEndToken(RPAREN126); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return parameterList;
    }
    // $ANTLR end "parameters"



    // $ANTLR start "parameter"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:850:1: parameter returns [ParameterDeclaration parameter] : ( variadicType | VOID_MODIFIER | FUNCTION_MODIFIER | DYNAMIC | VALUE_MODIFIER ) memberName ( ( specifier )? | ( parameters )+ ( functionSpecifier )? ) ;
    public ParameterDeclaration parameter() throws RecognitionException {
        ParameterDeclaration parameter = null;


        Token VOID_MODIFIER128=null;
        Token FUNCTION_MODIFIER129=null;
        Token DYNAMIC130=null;
        Token VALUE_MODIFIER131=null;
        Type variadicType127 =null;

        Identifier memberName132 =null;

        SpecifierExpression specifier133 =null;

        ParameterList parameters134 =null;

        SpecifierExpression functionSpecifier135 =null;


         ValueParameterDeclaration vp = new ValueParameterDeclaration(null); 
                    FunctionalParameterDeclaration fp = new FunctionalParameterDeclaration(null);
                    AttributeDeclaration a = new AttributeDeclaration(null); 
                    MethodDeclaration m = new MethodDeclaration(null);
                    vp.setTypedDeclaration(a);
                    fp.setTypedDeclaration(m);
                    parameter = vp; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:858:5: ( ( variadicType | VOID_MODIFIER | FUNCTION_MODIFIER | DYNAMIC | VALUE_MODIFIER ) memberName ( ( specifier )? | ( parameters )+ ( functionSpecifier )? ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:858:7: ( variadicType | VOID_MODIFIER | FUNCTION_MODIFIER | DYNAMIC | VALUE_MODIFIER ) memberName ( ( specifier )? | ( parameters )+ ( functionSpecifier )? )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:858:7: ( variadicType | VOID_MODIFIER | FUNCTION_MODIFIER | DYNAMIC | VALUE_MODIFIER )
            int alt70=5;
            switch ( input.LA(1) ) {
            case LBRACE:
            case LBRACKET:
            case SMALLER_OP:
            case UIDENTIFIER:
                {
                alt70=1;
                }
                break;
            case VOID_MODIFIER:
                {
                alt70=2;
                }
                break;
            case FUNCTION_MODIFIER:
                {
                alt70=3;
                }
                break;
            case DYNAMIC:
                {
                alt70=4;
                }
                break;
            case VALUE_MODIFIER:
                {
                alt70=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return parameter;}
                NoViableAltException nvae =
                    new NoViableAltException("", 70, 0, input);

                throw nvae;

            }

            switch (alt70) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:859:9: variadicType
                    {
                    pushFollow(FOLLOW_variadicType_in_parameter5472);
                    variadicType127=variadicType();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { a.setType(variadicType127);
                              m.setType(variadicType127); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:862:9: VOID_MODIFIER
                    {
                    VOID_MODIFIER128=(Token)match(input,VOID_MODIFIER,FOLLOW_VOID_MODIFIER_in_parameter5492); if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { m.setType(new VoidModifier(VOID_MODIFIER128));
                              parameter =fp; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:865:9: FUNCTION_MODIFIER
                    {
                    FUNCTION_MODIFIER129=(Token)match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_parameter5512); if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { m.setType(new FunctionModifier(FUNCTION_MODIFIER129));
                              parameter =fp; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:868:9: DYNAMIC
                    {
                    DYNAMIC130=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_parameter5532); if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { a.setType(new DynamicModifier(DYNAMIC130)); }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:870:9: VALUE_MODIFIER
                    {
                    VALUE_MODIFIER131=(Token)match(input,VALUE_MODIFIER,FOLLOW_VALUE_MODIFIER_in_parameter5552); if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { a.setType(new ValueModifier(VALUE_MODIFIER131)); }

                    }
                    break;

            }


            pushFollow(FOLLOW_memberName_in_parameter5578);
            memberName132=memberName();

            state._fsp--;
            if (state.failed) return parameter;

            if ( state.backtracking==0 ) { a.setIdentifier(memberName132);
                    m.setIdentifier(memberName132); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:876:7: ( ( specifier )? | ( parameters )+ ( functionSpecifier )? )
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==COMMA||LA74_0==RPAREN||LA74_0==SPECIFY) ) {
                alt74=1;
            }
            else if ( (LA74_0==LPAREN) ) {
                alt74=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return parameter;}
                NoViableAltException nvae =
                    new NoViableAltException("", 74, 0, input);

                throw nvae;

            }
            switch (alt74) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:877:9: ( specifier )?
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:877:9: ( specifier )?
                    int alt71=2;
                    int LA71_0 = input.LA(1);

                    if ( (LA71_0==SPECIFY) ) {
                        alt71=1;
                    }
                    switch (alt71) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:878:11: specifier
                            {
                            pushFollow(FOLLOW_specifier_in_parameter5616);
                            specifier133=specifier();

                            state._fsp--;
                            if (state.failed) return parameter;

                            if ( state.backtracking==0 ) { a.setSpecifierOrInitializerExpression(specifier133); }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:882:9: ( parameters )+ ( functionSpecifier )?
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:882:9: ( parameters )+
                    int cnt72=0;
                    loop72:
                    do {
                        int alt72=2;
                        int LA72_0 = input.LA(1);

                        if ( (LA72_0==LPAREN) ) {
                            alt72=1;
                        }


                        switch (alt72) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:883:11: parameters
                    	    {
                    	    pushFollow(FOLLOW_parameters_in_parameter5669);
                    	    parameters134=parameters();

                    	    state._fsp--;
                    	    if (state.failed) return parameter;

                    	    if ( state.backtracking==0 ) { m.addParameterList(parameters134);
                    	                parameter =fp; }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt72 >= 1 ) break loop72;
                    	    if (state.backtracking>0) {state.failed=true; return parameter;}
                                EarlyExitException eee =
                                    new EarlyExitException(72, input);
                                throw eee;
                        }
                        cnt72++;
                    } while (true);


                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:887:9: ( functionSpecifier )?
                    int alt73=2;
                    int LA73_0 = input.LA(1);

                    if ( (LA73_0==COMPUTE||LA73_0==SPECIFY) ) {
                        alt73=1;
                    }
                    switch (alt73) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:888:11: functionSpecifier
                            {
                            pushFollow(FOLLOW_functionSpecifier_in_parameter5714);
                            functionSpecifier135=functionSpecifier();

                            state._fsp--;
                            if (state.failed) return parameter;

                            if ( state.backtracking==0 ) { m.setSpecifierExpression(functionSpecifier135); }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return parameter;
    }
    // $ANTLR end "parameter"



    // $ANTLR start "parameterRef"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:894:1: parameterRef returns [InitializerParameter parameter] : memberName ( specifier )? ;
    public InitializerParameter parameterRef() throws RecognitionException {
        InitializerParameter parameter = null;


        Identifier memberName136 =null;

        SpecifierExpression specifier137 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:895:5: ( memberName ( specifier )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:895:7: memberName ( specifier )?
            {
            pushFollow(FOLLOW_memberName_in_parameterRef5766);
            memberName136=memberName();

            state._fsp--;
            if (state.failed) return parameter;

            if ( state.backtracking==0 ) { parameter = new InitializerParameter(null);
                    parameter.setIdentifier(memberName136); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:898:7: ( specifier )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==SPECIFY) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:899:9: specifier
                    {
                    pushFollow(FOLLOW_specifier_in_parameterRef5792);
                    specifier137=specifier();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { parameter.setSpecifierExpression(specifier137); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return parameter;
    }
    // $ANTLR end "parameterRef"



    // $ANTLR start "parameterDeclarationOrRef"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:904:1: parameterDeclarationOrRef returns [Parameter parameter] : (r= parameterRef | compilerAnnotations annotations p= parameter );
    public Parameter parameterDeclarationOrRef() throws RecognitionException {
        Parameter parameter = null;


        InitializerParameter r =null;

        ParameterDeclaration p =null;

        AnnotationList annotations138 =null;

        List<CompilerAnnotation> compilerAnnotations139 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:905:5: (r= parameterRef | compilerAnnotations annotations p= parameter )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==LIDENTIFIER) ) {
                int LA76_1 = input.LA(2);

                if ( (LA76_1==COMMA||LA76_1==RPAREN||LA76_1==SPECIFY) ) {
                    alt76=1;
                }
                else if ( (LA76_1==DYNAMIC||LA76_1==FUNCTION_MODIFIER||(LA76_1 >= LBRACE && LA76_1 <= LIDENTIFIER)||LA76_1==LPAREN||LA76_1==SMALLER_OP||LA76_1==UIDENTIFIER||LA76_1==VALUE_MODIFIER||LA76_1==VOID_MODIFIER) ) {
                    alt76=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return parameter;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 76, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA76_0==COMPILER_ANNOTATION||LA76_0==DYNAMIC||LA76_0==FUNCTION_MODIFIER||(LA76_0 >= LBRACE && LA76_0 <= LBRACKET)||LA76_0==SMALLER_OP||LA76_0==STRING_LITERAL||LA76_0==UIDENTIFIER||(LA76_0 >= VALUE_MODIFIER && LA76_0 <= VOID_MODIFIER)) ) {
                alt76=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return parameter;}
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;

            }
            switch (alt76) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:906:7: r= parameterRef
                    {
                    pushFollow(FOLLOW_parameterRef_in_parameterDeclarationOrRef5840);
                    r=parameterRef();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { parameter =r; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:909:7: compilerAnnotations annotations p= parameter
                    {
                    pushFollow(FOLLOW_compilerAnnotations_in_parameterDeclarationOrRef5863);
                    compilerAnnotations139=compilerAnnotations();

                    state._fsp--;
                    if (state.failed) return parameter;

                    pushFollow(FOLLOW_annotations_in_parameterDeclarationOrRef5871);
                    annotations138=annotations();

                    state._fsp--;
                    if (state.failed) return parameter;

                    pushFollow(FOLLOW_parameter_in_parameterDeclarationOrRef5881);
                    p=parameter();

                    state._fsp--;
                    if (state.failed) return parameter;

                    if ( state.backtracking==0 ) { parameter =p;
                            p.getTypedDeclaration().setAnnotationList(annotations138);
                            p.getTypedDeclaration().getCompilerAnnotations().addAll(compilerAnnotations139); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return parameter;
    }
    // $ANTLR end "parameterDeclarationOrRef"



    // $ANTLR start "typeParameters"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:917:1: typeParameters returns [TypeParameterList typeParameterList] : SMALLER_OP tp1= typeParameter (c= COMMA (tp2= typeParameter |) )* LARGER_OP ;
    public TypeParameterList typeParameters() throws RecognitionException {
        TypeParameterList typeParameterList = null;


        Token c=null;
        Token SMALLER_OP140=null;
        Token LARGER_OP141=null;
        TypeParameterDeclaration tp1 =null;

        TypeParameterDeclaration tp2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:918:5: ( SMALLER_OP tp1= typeParameter (c= COMMA (tp2= typeParameter |) )* LARGER_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:918:7: SMALLER_OP tp1= typeParameter (c= COMMA (tp2= typeParameter |) )* LARGER_OP
            {
            SMALLER_OP140=(Token)match(input,SMALLER_OP,FOLLOW_SMALLER_OP_in_typeParameters5910); if (state.failed) return typeParameterList;

            if ( state.backtracking==0 ) { typeParameterList = new TypeParameterList(SMALLER_OP140); }

            pushFollow(FOLLOW_typeParameter_in_typeParameters5928);
            tp1=typeParameter();

            state._fsp--;
            if (state.failed) return typeParameterList;

            if ( state.backtracking==0 ) { if (tp1 instanceof TypeParameterDeclaration)
                        typeParameterList.addTypeParameterDeclaration(tp1); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:923:7: (c= COMMA (tp2= typeParameter |) )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==COMMA) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:924:9: c= COMMA (tp2= typeParameter |)
            	    {
            	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeParameters5956); if (state.failed) return typeParameterList;

            	    if ( state.backtracking==0 ) { typeParameterList.setEndToken(c); }

            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:926:9: (tp2= typeParameter |)
            	    int alt77=2;
            	    int LA77_0 = input.LA(1);

            	    if ( (LA77_0==ALIAS||(LA77_0 >= ASSERT && LA77_0 <= ASSIGN)||(LA77_0 >= BACKTICK && LA77_0 <= BREAK)||(LA77_0 >= CHAR_LITERAL && LA77_0 <= CLASS_DEFINITION)||LA77_0==COMPILER_ANNOTATION||LA77_0==CONTINUE||(LA77_0 >= DECREMENT_OP && LA77_0 <= DIFFERENCE_OP)||LA77_0==DYNAMIC||(LA77_0 >= FLOAT_LITERAL && LA77_0 <= FUNCTION_MODIFIER)||(LA77_0 >= IF_CLAUSE && LA77_0 <= INTERFACE_DEFINITION)||LA77_0==IN_OP||(LA77_0 >= LBRACE && LA77_0 <= LIDENTIFIER)||LA77_0==LPAREN||LA77_0==MODULE||LA77_0==NATURAL_LITERAL||(LA77_0 >= NOT_OP && LA77_0 <= OBJECT_DEFINITION)||(LA77_0 >= OUT && LA77_0 <= PACKAGE)||LA77_0==PRODUCT_OP||(LA77_0 >= RETURN && LA77_0 <= RPAREN)||(LA77_0 >= SEMICOLON && LA77_0 <= SMALLER_OP)||LA77_0==STRING_LITERAL||LA77_0==STRING_START||(LA77_0 >= SUM_OP && LA77_0 <= SWITCH_CLAUSE)||(LA77_0 >= THIS && LA77_0 <= UIDENTIFIER)||(LA77_0 >= VALUE_MODIFIER && LA77_0 <= WHILE_CLAUSE)) ) {
            	        alt77=1;
            	    }
            	    else if ( (LA77_0==COMMA||LA77_0==LARGER_OP) ) {
            	        alt77=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return typeParameterList;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 77, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt77) {
            	        case 1 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:927:11: tp2= typeParameter
            	            {
            	            pushFollow(FOLLOW_typeParameter_in_typeParameters5990);
            	            tp2=typeParameter();

            	            state._fsp--;
            	            if (state.failed) return typeParameterList;

            	            if ( state.backtracking==0 ) { if (tp2 instanceof TypeParameterDeclaration)
            	                            typeParameterList.addTypeParameterDeclaration(tp2);
            	                        typeParameterList.setEndToken(null); }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:931:11: 
            	            {
            	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
            	                            new MismatchedTokenException(UIDENTIFIER, input)); }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop78;
                }
            } while (true);


            LARGER_OP141=(Token)match(input,LARGER_OP,FOLLOW_LARGER_OP_in_typeParameters6041); if (state.failed) return typeParameterList;

            if ( state.backtracking==0 ) { typeParameterList.setEndToken(LARGER_OP141); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeParameterList;
    }
    // $ANTLR end "typeParameters"



    // $ANTLR start "typeParameter"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:939:1: typeParameter returns [TypeParameterDeclaration typeParameter] : compilerAnnotations ( variance )? typeNameDeclaration ( typeDefault )? ;
    public TypeParameterDeclaration typeParameter() throws RecognitionException {
        TypeParameterDeclaration typeParameter = null;


        TypeVariance variance142 =null;

        Identifier typeNameDeclaration143 =null;

        TypeSpecifier typeDefault144 =null;

        List<CompilerAnnotation> compilerAnnotations145 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:940:5: ( compilerAnnotations ( variance )? typeNameDeclaration ( typeDefault )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:940:7: compilerAnnotations ( variance )? typeNameDeclaration ( typeDefault )?
            {
            if ( state.backtracking==0 ) { typeParameter = new TypeParameterDeclaration(null); }

            pushFollow(FOLLOW_compilerAnnotations_in_typeParameter6078);
            compilerAnnotations145=compilerAnnotations();

            state._fsp--;
            if (state.failed) return typeParameter;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:942:7: ( variance )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==IN_OP||LA79_0==OUT) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:943:9: variance
                    {
                    pushFollow(FOLLOW_variance_in_typeParameter6097);
                    variance142=variance();

                    state._fsp--;
                    if (state.failed) return typeParameter;

                    if ( state.backtracking==0 ) { typeParameter.setTypeVariance(variance142); }

                    }
                    break;

            }


            pushFollow(FOLLOW_typeNameDeclaration_in_typeParameter6127);
            typeNameDeclaration143=typeNameDeclaration();

            state._fsp--;
            if (state.failed) return typeParameter;

            if ( state.backtracking==0 ) { typeParameter.setIdentifier(typeNameDeclaration143); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:948:7: ( typeDefault )?
            int alt80=2;
            int LA80_0 = input.LA(1);

            if ( (LA80_0==SPECIFY) ) {
                alt80=1;
            }
            switch (alt80) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:949:9: typeDefault
                    {
                    pushFollow(FOLLOW_typeDefault_in_typeParameter6153);
                    typeDefault144=typeDefault();

                    state._fsp--;
                    if (state.failed) return typeParameter;

                    if ( state.backtracking==0 ) { typeParameter.setTypeSpecifier(typeDefault144); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { typeParameter.getCompilerAnnotations().addAll(compilerAnnotations145); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeParameter;
    }
    // $ANTLR end "typeParameter"



    // $ANTLR start "variance"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:955:1: variance returns [TypeVariance typeVariance] : ( IN_OP | OUT );
    public TypeVariance variance() throws RecognitionException {
        TypeVariance typeVariance = null;


        Token IN_OP146=null;
        Token OUT147=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:956:5: ( IN_OP | OUT )
            int alt81=2;
            int LA81_0 = input.LA(1);

            if ( (LA81_0==IN_OP) ) {
                alt81=1;
            }
            else if ( (LA81_0==OUT) ) {
                alt81=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return typeVariance;}
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;

            }
            switch (alt81) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:956:7: IN_OP
                    {
                    IN_OP146=(Token)match(input,IN_OP,FOLLOW_IN_OP_in_variance6201); if (state.failed) return typeVariance;

                    if ( state.backtracking==0 ) { typeVariance = new TypeVariance(IN_OP146); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:958:7: OUT
                    {
                    OUT147=(Token)match(input,OUT,FOLLOW_OUT_in_variance6217); if (state.failed) return typeVariance;

                    if ( state.backtracking==0 ) { typeVariance = new TypeVariance(OUT147); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeVariance;
    }
    // $ANTLR end "variance"



    // $ANTLR start "typeConstraint"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:962:1: typeConstraint returns [TypeConstraint typeConstraint] : compilerAnnotations TYPE_CONSTRAINT typeNameDeclaration ( parameters )? ( caseTypes )? ( satisfiedTypes )? ( abstractedType )? ;
    public TypeConstraint typeConstraint() throws RecognitionException {
        TypeConstraint typeConstraint = null;


        Token TYPE_CONSTRAINT148=null;
        List<CompilerAnnotation> compilerAnnotations149 =null;

        Identifier typeNameDeclaration150 =null;

        ParameterList parameters151 =null;

        CaseTypes caseTypes152 =null;

        SatisfiedTypes satisfiedTypes153 =null;

        AbstractedType abstractedType154 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:963:5: ( compilerAnnotations TYPE_CONSTRAINT typeNameDeclaration ( parameters )? ( caseTypes )? ( satisfiedTypes )? ( abstractedType )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:963:7: compilerAnnotations TYPE_CONSTRAINT typeNameDeclaration ( parameters )? ( caseTypes )? ( satisfiedTypes )? ( abstractedType )?
            {
            pushFollow(FOLLOW_compilerAnnotations_in_typeConstraint6250);
            compilerAnnotations149=compilerAnnotations();

            state._fsp--;
            if (state.failed) return typeConstraint;

            TYPE_CONSTRAINT148=(Token)match(input,TYPE_CONSTRAINT,FOLLOW_TYPE_CONSTRAINT_in_typeConstraint6258); if (state.failed) return typeConstraint;

            if ( state.backtracking==0 ) { typeConstraint = new TypeConstraint(TYPE_CONSTRAINT148); 
                    typeConstraint.getCompilerAnnotations().addAll(compilerAnnotations149); }

            pushFollow(FOLLOW_typeNameDeclaration_in_typeConstraint6274);
            typeNameDeclaration150=typeNameDeclaration();

            state._fsp--;
            if (state.failed) return typeConstraint;

            if ( state.backtracking==0 ) { typeConstraint.setIdentifier(typeNameDeclaration150); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:970:7: ( parameters )?
            int alt82=2;
            int LA82_0 = input.LA(1);

            if ( (LA82_0==LPAREN) ) {
                alt82=1;
            }
            switch (alt82) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:971:9: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_typeConstraint6308);
                    parameters151=parameters();

                    state._fsp--;
                    if (state.failed) return typeConstraint;

                    if ( state.backtracking==0 ) { typeConstraint.setParameterList(parameters151); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:974:7: ( caseTypes )?
            int alt83=2;
            int LA83_0 = input.LA(1);

            if ( (LA83_0==CASE_TYPES) ) {
                alt83=1;
            }
            switch (alt83) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:975:9: caseTypes
                    {
                    pushFollow(FOLLOW_caseTypes_in_typeConstraint6345);
                    caseTypes152=caseTypes();

                    state._fsp--;
                    if (state.failed) return typeConstraint;

                    if ( state.backtracking==0 ) { typeConstraint.setCaseTypes(caseTypes152); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:979:7: ( satisfiedTypes )?
            int alt84=2;
            int LA84_0 = input.LA(1);

            if ( (LA84_0==SATISFIES) ) {
                alt84=1;
            }
            switch (alt84) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:980:9: satisfiedTypes
                    {
                    pushFollow(FOLLOW_satisfiedTypes_in_typeConstraint6389);
                    satisfiedTypes153=satisfiedTypes();

                    state._fsp--;
                    if (state.failed) return typeConstraint;

                    if ( state.backtracking==0 ) { typeConstraint.setSatisfiedTypes(satisfiedTypes153); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:983:7: ( abstractedType )?
            int alt85=2;
            int LA85_0 = input.LA(1);

            if ( (LA85_0==ABSTRACTED_TYPE) ) {
                alt85=1;
            }
            switch (alt85) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:984:9: abstractedType
                    {
                    pushFollow(FOLLOW_abstractedType_in_typeConstraint6427);
                    abstractedType154=abstractedType();

                    state._fsp--;
                    if (state.failed) return typeConstraint;

                    if ( state.backtracking==0 ) { typeConstraint.setAbstractedType(abstractedType154); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeConstraint;
    }
    // $ANTLR end "typeConstraint"



    // $ANTLR start "typeConstraints"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:989:1: typeConstraints returns [TypeConstraintList typeConstraintList] : ( typeConstraint )+ ;
    public TypeConstraintList typeConstraints() throws RecognitionException {
        TypeConstraintList typeConstraintList = null;


        TypeConstraint typeConstraint155 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:990:5: ( ( typeConstraint )+ )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:990:7: ( typeConstraint )+
            {
            if ( state.backtracking==0 ) { typeConstraintList =new TypeConstraintList(null); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:991:7: ( typeConstraint )+
            int cnt86=0;
            loop86:
            do {
                int alt86=2;
                int LA86_0 = input.LA(1);

                if ( (LA86_0==COMPILER_ANNOTATION||LA86_0==TYPE_CONSTRAINT) ) {
                    alt86=1;
                }


                switch (alt86) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:992:9: typeConstraint
            	    {
            	    pushFollow(FOLLOW_typeConstraint_in_typeConstraints6485);
            	    typeConstraint155=typeConstraint();

            	    state._fsp--;
            	    if (state.failed) return typeConstraintList;

            	    if ( state.backtracking==0 ) { if (typeConstraint155!=null)
            	                typeConstraintList.addTypeConstraint(typeConstraint155); }

            	    }
            	    break;

            	default :
            	    if ( cnt86 >= 1 ) break loop86;
            	    if (state.backtracking>0) {state.failed=true; return typeConstraintList;}
                        EarlyExitException eee =
                            new EarlyExitException(86, input);
                        throw eee;
                }
                cnt86++;
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeConstraintList;
    }
    // $ANTLR end "typeConstraints"



    // $ANTLR start "annotationListStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:998:1: annotationListStart : ( stringLiteral | annotation ) ( LIDENTIFIER | UIDENTIFIER | FUNCTION_MODIFIER | VOID_MODIFIER ) ;
    public void annotationListStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:999:5: ( ( stringLiteral | annotation ) ( LIDENTIFIER | UIDENTIFIER | FUNCTION_MODIFIER | VOID_MODIFIER ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:999:7: ( stringLiteral | annotation ) ( LIDENTIFIER | UIDENTIFIER | FUNCTION_MODIFIER | VOID_MODIFIER )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:999:7: ( stringLiteral | annotation )
            int alt87=2;
            int LA87_0 = input.LA(1);

            if ( (LA87_0==STRING_LITERAL||LA87_0==VERBATIM_STRING) ) {
                alt87=1;
            }
            else if ( (LA87_0==LIDENTIFIER) ) {
                alt87=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 87, 0, input);

                throw nvae;

            }
            switch (alt87) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:999:8: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_annotationListStart6522);
                    stringLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:999:22: annotation
                    {
                    pushFollow(FOLLOW_annotation_in_annotationListStart6524);
                    annotation();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            if ( input.LA(1)==FUNCTION_MODIFIER||input.LA(1)==LIDENTIFIER||input.LA(1)==UIDENTIFIER||input.LA(1)==VOID_MODIFIER ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "annotationListStart"



    // $ANTLR start "declarationOrStatement"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1003:1: declarationOrStatement returns [Statement statement] options {memoize=true; } : compilerAnnotations ( ( annotatedDeclarationStart )=>d= declaration | ( annotatedAssertionStart )=> assertion | ( annotationListStart )=>d1= declaration |s= statement ) ;
    public Statement declarationOrStatement() throws RecognitionException {
        Statement statement = null;

        int declarationOrStatement_StartIndex = input.index();

        Declaration d =null;

        Declaration d1 =null;

        Statement s =null;

        Assertion assertion156 =null;

        List<CompilerAnnotation> compilerAnnotations157 =null;


        try {
            if ( state.backtracking>0 && alreadyParsedRule(input, 47) ) { return statement; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1005:5: ( compilerAnnotations ( ( annotatedDeclarationStart )=>d= declaration | ( annotatedAssertionStart )=> assertion | ( annotationListStart )=>d1= declaration |s= statement ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1005:7: compilerAnnotations ( ( annotatedDeclarationStart )=>d= declaration | ( annotatedAssertionStart )=> assertion | ( annotationListStart )=>d1= declaration |s= statement )
            {
            pushFollow(FOLLOW_compilerAnnotations_in_declarationOrStatement6574);
            compilerAnnotations157=compilerAnnotations();

            state._fsp--;
            if (state.failed) return statement;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1006:7: ( ( annotatedDeclarationStart )=>d= declaration | ( annotatedAssertionStart )=> assertion | ( annotationListStart )=>d1= declaration |s= statement )
            int alt88=4;
            int LA88_0 = input.LA(1);

            if ( (LA88_0==STRING_LITERAL) ) {
                int LA88_1 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred4_Ceylon()) ) {
                    alt88=2;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==VERBATIM_STRING) ) {
                int LA88_2 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred4_Ceylon()) ) {
                    alt88=2;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==LIDENTIFIER) ) {
                int LA88_3 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred4_Ceylon()) ) {
                    alt88=2;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==OBJECT_DEFINITION) ) {
                int LA88_4 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==ASSIGN) ) {
                int LA88_5 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 5, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==VOID_MODIFIER) ) {
                int LA88_6 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 6, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==FUNCTION_MODIFIER) ) {
                int LA88_7 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 7, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==VALUE_MODIFIER) ) {
                int LA88_8 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==UIDENTIFIER) ) {
                int LA88_9 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==LBRACKET) ) {
                int LA88_10 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 10, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==LBRACE) ) {
                int LA88_11 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 11, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==SMALLER_OP) ) {
                int LA88_12 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 12, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==DYNAMIC) ) {
                int LA88_13 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else if ( (true) ) {
                    alt88=4;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==CLASS_DEFINITION) ) {
                int LA88_14 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 14, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==INTERFACE_DEFINITION) ) {
                int LA88_15 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 15, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==ALIAS) ) {
                int LA88_16 = input.LA(2);

                if ( (synpred3_Ceylon()) ) {
                    alt88=1;
                }
                else if ( (synpred5_Ceylon()) ) {
                    alt88=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return statement;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 88, 16, input);

                    throw nvae;

                }
            }
            else if ( (LA88_0==ASSERT) && (synpred4_Ceylon())) {
                alt88=2;
            }
            else if ( ((LA88_0 >= BACKTICK && LA88_0 <= BREAK)||LA88_0==CHAR_LITERAL||LA88_0==CONTINUE||(LA88_0 >= DECREMENT_OP && LA88_0 <= DIFFERENCE_OP)||(LA88_0 >= FLOAT_LITERAL && LA88_0 <= FOR_CLAUSE)||LA88_0==IF_CLAUSE||LA88_0==INCREMENT_OP||LA88_0==LPAREN||LA88_0==NATURAL_LITERAL||LA88_0==NOT_OP||(LA88_0 >= OUTER && LA88_0 <= PACKAGE)||LA88_0==RETURN||LA88_0==STRING_START||(LA88_0 >= SUM_OP && LA88_0 <= SWITCH_CLAUSE)||(LA88_0 >= THIS && LA88_0 <= TRY_CLAUSE)||LA88_0==WHILE_CLAUSE) ) {
                alt88=4;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return statement;}
                NoViableAltException nvae =
                    new NoViableAltException("", 88, 0, input);

                throw nvae;

            }
            switch (alt88) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1007:9: ( annotatedDeclarationStart )=>d= declaration
                    {
                    pushFollow(FOLLOW_declaration_in_declarationOrStatement6601);
                    d=declaration();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement =d; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1009:9: ( annotatedAssertionStart )=> assertion
                    {
                    pushFollow(FOLLOW_assertion_in_declarationOrStatement6627);
                    assertion156=assertion();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement = assertion156; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1011:9: ( annotationListStart )=>d1= declaration
                    {
                    pushFollow(FOLLOW_declaration_in_declarationOrStatement6655);
                    d1=declaration();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement =d1; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1013:9: s= statement
                    {
                    pushFollow(FOLLOW_statement_in_declarationOrStatement6677);
                    s=statement();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement =s; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { if (statement!=null)
                        statement.getCompilerAnnotations().addAll(compilerAnnotations157); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
            if ( state.backtracking>0 ) { memoize(input, 47, declarationOrStatement_StartIndex); }

        }
        return statement;
    }
    // $ANTLR end "declarationOrStatement"



    // $ANTLR start "declaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1020:1: declaration returns [Declaration declaration] : annotations ( objectDeclaration | setterDeclaration | voidOrInferredMethodDeclaration | inferredAttributeDeclaration | typedMethodOrAttributeDeclaration | classDeclaration | interfaceDeclaration | aliasDeclaration ) ;
    public Declaration declaration() throws RecognitionException {
        Declaration declaration = null;


        AnnotationList annotations158 =null;

        ObjectDefinition objectDeclaration159 =null;

        AttributeSetterDefinition setterDeclaration160 =null;

        AnyMethod voidOrInferredMethodDeclaration161 =null;

        AnyAttribute inferredAttributeDeclaration162 =null;

        TypedDeclaration typedMethodOrAttributeDeclaration163 =null;

        AnyClass classDeclaration164 =null;

        AnyInterface interfaceDeclaration165 =null;

        TypeAliasDeclaration aliasDeclaration166 =null;


         declaration = new MissingDeclaration(null); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1022:5: ( annotations ( objectDeclaration | setterDeclaration | voidOrInferredMethodDeclaration | inferredAttributeDeclaration | typedMethodOrAttributeDeclaration | classDeclaration | interfaceDeclaration | aliasDeclaration ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1022:7: annotations ( objectDeclaration | setterDeclaration | voidOrInferredMethodDeclaration | inferredAttributeDeclaration | typedMethodOrAttributeDeclaration | classDeclaration | interfaceDeclaration | aliasDeclaration )
            {
            pushFollow(FOLLOW_annotations_in_declaration6733);
            annotations158=annotations();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setAnnotationList(annotations158); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1024:5: ( objectDeclaration | setterDeclaration | voidOrInferredMethodDeclaration | inferredAttributeDeclaration | typedMethodOrAttributeDeclaration | classDeclaration | interfaceDeclaration | aliasDeclaration )
            int alt89=8;
            switch ( input.LA(1) ) {
            case OBJECT_DEFINITION:
                {
                alt89=1;
                }
                break;
            case ASSIGN:
                {
                alt89=2;
                }
                break;
            case FUNCTION_MODIFIER:
            case VOID_MODIFIER:
                {
                alt89=3;
                }
                break;
            case VALUE_MODIFIER:
                {
                alt89=4;
                }
                break;
            case DYNAMIC:
            case LBRACE:
            case LBRACKET:
            case SMALLER_OP:
            case UIDENTIFIER:
                {
                alt89=5;
                }
                break;
            case CLASS_DEFINITION:
                {
                alt89=6;
                }
                break;
            case INTERFACE_DEFINITION:
                {
                alt89=7;
                }
                break;
            case ALIAS:
                {
                alt89=8;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 89, 0, input);

                throw nvae;

            }

            switch (alt89) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1025:7: objectDeclaration
                    {
                    pushFollow(FOLLOW_objectDeclaration_in_declaration6756);
                    objectDeclaration159=objectDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =objectDeclaration159; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1027:7: setterDeclaration
                    {
                    pushFollow(FOLLOW_setterDeclaration_in_declaration6772);
                    setterDeclaration160=setterDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =setterDeclaration160; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1029:7: voidOrInferredMethodDeclaration
                    {
                    pushFollow(FOLLOW_voidOrInferredMethodDeclaration_in_declaration6788);
                    voidOrInferredMethodDeclaration161=voidOrInferredMethodDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =voidOrInferredMethodDeclaration161; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1031:7: inferredAttributeDeclaration
                    {
                    pushFollow(FOLLOW_inferredAttributeDeclaration_in_declaration6804);
                    inferredAttributeDeclaration162=inferredAttributeDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =inferredAttributeDeclaration162; }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1033:7: typedMethodOrAttributeDeclaration
                    {
                    pushFollow(FOLLOW_typedMethodOrAttributeDeclaration_in_declaration6820);
                    typedMethodOrAttributeDeclaration163=typedMethodOrAttributeDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =typedMethodOrAttributeDeclaration163; }

                    }
                    break;
                case 6 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1035:7: classDeclaration
                    {
                    pushFollow(FOLLOW_classDeclaration_in_declaration6836);
                    classDeclaration164=classDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =classDeclaration164; }

                    }
                    break;
                case 7 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1037:7: interfaceDeclaration
                    {
                    pushFollow(FOLLOW_interfaceDeclaration_in_declaration6852);
                    interfaceDeclaration165=interfaceDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =interfaceDeclaration165; }

                    }
                    break;
                case 8 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1039:7: aliasDeclaration
                    {
                    pushFollow(FOLLOW_aliasDeclaration_in_declaration6868);
                    aliasDeclaration166=aliasDeclaration();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =aliasDeclaration166; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { declaration.setAnnotationList(annotations158);  }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "declaration"



    // $ANTLR start "annotatedDeclarationStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1049:1: annotatedDeclarationStart : ( stringLiteral )? ( annotation )* declarationStart ;
    public void annotatedDeclarationStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1050:5: ( ( stringLiteral )? ( annotation )* declarationStart )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1050:7: ( stringLiteral )? ( annotation )* declarationStart
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1050:7: ( stringLiteral )?
            int alt90=2;
            int LA90_0 = input.LA(1);

            if ( (LA90_0==STRING_LITERAL||LA90_0==VERBATIM_STRING) ) {
                alt90=1;
            }
            switch (alt90) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1050:7: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_annotatedDeclarationStart6911);
                    stringLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1050:22: ( annotation )*
            loop91:
            do {
                int alt91=2;
                int LA91_0 = input.LA(1);

                if ( (LA91_0==LIDENTIFIER) ) {
                    alt91=1;
                }


                switch (alt91) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1050:22: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotatedDeclarationStart6914);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop91;
                }
            } while (true);


            pushFollow(FOLLOW_declarationStart_in_annotatedDeclarationStart6917);
            declarationStart();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "annotatedDeclarationStart"



    // $ANTLR start "annotatedAssertionStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1053:1: annotatedAssertionStart : ( stringLiteral )? ( annotation )* ASSERT ;
    public void annotatedAssertionStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1054:5: ( ( stringLiteral )? ( annotation )* ASSERT )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1054:7: ( stringLiteral )? ( annotation )* ASSERT
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1054:7: ( stringLiteral )?
            int alt92=2;
            int LA92_0 = input.LA(1);

            if ( (LA92_0==STRING_LITERAL||LA92_0==VERBATIM_STRING) ) {
                alt92=1;
            }
            switch (alt92) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1054:7: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_annotatedAssertionStart6934);
                    stringLiteral();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1054:22: ( annotation )*
            loop93:
            do {
                int alt93=2;
                int LA93_0 = input.LA(1);

                if ( (LA93_0==LIDENTIFIER) ) {
                    alt93=1;
                }


                switch (alt93) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1054:22: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotatedAssertionStart6937);
            	    annotation();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop93;
                }
            } while (true);


            match(input,ASSERT,FOLLOW_ASSERT_in_annotatedAssertionStart6940); if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "annotatedAssertionStart"



    // $ANTLR start "declarationStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1060:1: declarationStart : ( VALUE_MODIFIER ( LIDENTIFIER | UIDENTIFIER ) | FUNCTION_MODIFIER ( LIDENTIFIER | UIDENTIFIER ) | VOID_MODIFIER ( LIDENTIFIER | UIDENTIFIER ) | ASSIGN | INTERFACE_DEFINITION | CLASS_DEFINITION | OBJECT_DEFINITION | ALIAS | ( variadicType | DYNAMIC ) LIDENTIFIER );
    public void declarationStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1061:5: ( VALUE_MODIFIER ( LIDENTIFIER | UIDENTIFIER ) | FUNCTION_MODIFIER ( LIDENTIFIER | UIDENTIFIER ) | VOID_MODIFIER ( LIDENTIFIER | UIDENTIFIER ) | ASSIGN | INTERFACE_DEFINITION | CLASS_DEFINITION | OBJECT_DEFINITION | ALIAS | ( variadicType | DYNAMIC ) LIDENTIFIER )
            int alt95=9;
            switch ( input.LA(1) ) {
            case VALUE_MODIFIER:
                {
                alt95=1;
                }
                break;
            case FUNCTION_MODIFIER:
                {
                alt95=2;
                }
                break;
            case VOID_MODIFIER:
                {
                alt95=3;
                }
                break;
            case ASSIGN:
                {
                alt95=4;
                }
                break;
            case INTERFACE_DEFINITION:
                {
                alt95=5;
                }
                break;
            case CLASS_DEFINITION:
                {
                alt95=6;
                }
                break;
            case OBJECT_DEFINITION:
                {
                alt95=7;
                }
                break;
            case ALIAS:
                {
                alt95=8;
                }
                break;
            case DYNAMIC:
            case LBRACE:
            case LBRACKET:
            case SMALLER_OP:
            case UIDENTIFIER:
                {
                alt95=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 95, 0, input);

                throw nvae;

            }

            switch (alt95) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1061:7: VALUE_MODIFIER ( LIDENTIFIER | UIDENTIFIER )
                    {
                    match(input,VALUE_MODIFIER,FOLLOW_VALUE_MODIFIER_in_declarationStart6960); if (state.failed) return ;

                    if ( input.LA(1)==LIDENTIFIER||input.LA(1)==UIDENTIFIER ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1062:7: FUNCTION_MODIFIER ( LIDENTIFIER | UIDENTIFIER )
                    {
                    match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_declarationStart6975); if (state.failed) return ;

                    if ( input.LA(1)==LIDENTIFIER||input.LA(1)==UIDENTIFIER ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1063:7: VOID_MODIFIER ( LIDENTIFIER | UIDENTIFIER )
                    {
                    match(input,VOID_MODIFIER,FOLLOW_VOID_MODIFIER_in_declarationStart6990); if (state.failed) return ;

                    if ( input.LA(1)==LIDENTIFIER||input.LA(1)==UIDENTIFIER ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1064:7: ASSIGN
                    {
                    match(input,ASSIGN,FOLLOW_ASSIGN_in_declarationStart7005); if (state.failed) return ;

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1065:7: INTERFACE_DEFINITION
                    {
                    match(input,INTERFACE_DEFINITION,FOLLOW_INTERFACE_DEFINITION_in_declarationStart7013); if (state.failed) return ;

                    }
                    break;
                case 6 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1066:7: CLASS_DEFINITION
                    {
                    match(input,CLASS_DEFINITION,FOLLOW_CLASS_DEFINITION_in_declarationStart7021); if (state.failed) return ;

                    }
                    break;
                case 7 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1067:7: OBJECT_DEFINITION
                    {
                    match(input,OBJECT_DEFINITION,FOLLOW_OBJECT_DEFINITION_in_declarationStart7029); if (state.failed) return ;

                    }
                    break;
                case 8 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1068:7: ALIAS
                    {
                    match(input,ALIAS,FOLLOW_ALIAS_in_declarationStart7037); if (state.failed) return ;

                    }
                    break;
                case 9 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1069:7: ( variadicType | DYNAMIC ) LIDENTIFIER
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1069:7: ( variadicType | DYNAMIC )
                    int alt94=2;
                    int LA94_0 = input.LA(1);

                    if ( ((LA94_0 >= LBRACE && LA94_0 <= LBRACKET)||LA94_0==SMALLER_OP||LA94_0==UIDENTIFIER) ) {
                        alt94=1;
                    }
                    else if ( (LA94_0==DYNAMIC) ) {
                        alt94=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 94, 0, input);

                        throw nvae;

                    }
                    switch (alt94) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1069:8: variadicType
                            {
                            pushFollow(FOLLOW_variadicType_in_declarationStart7047);
                            variadicType();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1069:21: DYNAMIC
                            {
                            match(input,DYNAMIC,FOLLOW_DYNAMIC_in_declarationStart7049); if (state.failed) return ;

                            }
                            break;

                    }


                    match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_declarationStart7052); if (state.failed) return ;

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "declarationStart"



    // $ANTLR start "statement"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1072:1: statement returns [Statement statement] : ( directiveStatement | controlStatement | expressionOrSpecificationStatement );
    public Statement statement() throws RecognitionException {
        Statement statement = null;


        Directive directiveStatement167 =null;

        ControlStatement controlStatement168 =null;

        Statement expressionOrSpecificationStatement169 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1073:5: ( directiveStatement | controlStatement | expressionOrSpecificationStatement )
            int alt96=3;
            switch ( input.LA(1) ) {
            case BREAK:
            case CONTINUE:
            case RETURN:
            case THROW:
                {
                alt96=1;
                }
                break;
            case DYNAMIC:
            case FOR_CLAUSE:
            case IF_CLAUSE:
            case SWITCH_CLAUSE:
            case TRY_CLAUSE:
            case WHILE_CLAUSE:
                {
                alt96=2;
                }
                break;
            case BACKTICK:
            case CHAR_LITERAL:
            case DECREMENT_OP:
            case DIFFERENCE_OP:
            case FLOAT_LITERAL:
            case INCREMENT_OP:
            case LBRACE:
            case LBRACKET:
            case LIDENTIFIER:
            case LPAREN:
            case NATURAL_LITERAL:
            case NOT_OP:
            case OUTER:
            case PACKAGE:
            case STRING_LITERAL:
            case STRING_START:
            case SUM_OP:
            case SUPER:
            case THIS:
            case UIDENTIFIER:
            case VALUE_MODIFIER:
            case VERBATIM_STRING:
                {
                alt96=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return statement;}
                NoViableAltException nvae =
                    new NoViableAltException("", 96, 0, input);

                throw nvae;

            }

            switch (alt96) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1073:7: directiveStatement
                    {
                    pushFollow(FOLLOW_directiveStatement_in_statement7073);
                    directiveStatement167=directiveStatement();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement = directiveStatement167; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1075:7: controlStatement
                    {
                    pushFollow(FOLLOW_controlStatement_in_statement7089);
                    controlStatement168=controlStatement();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement = controlStatement168; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1077:7: expressionOrSpecificationStatement
                    {
                    pushFollow(FOLLOW_expressionOrSpecificationStatement_in_statement7105);
                    expressionOrSpecificationStatement169=expressionOrSpecificationStatement();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement = expressionOrSpecificationStatement169; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "statement"



    // $ANTLR start "expressionOrSpecificationStatement"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1081:1: expressionOrSpecificationStatement returns [Statement statement] : expression ( lazySpecifier )? ( SEMICOLON | COMMA ) ;
    public Statement expressionOrSpecificationStatement() throws RecognitionException {
        Statement statement = null;


        Token SEMICOLON172=null;
        Token COMMA173=null;
        Expression expression170 =null;

        SpecifierExpression lazySpecifier171 =null;


         SpecifierStatement ss=new SpecifierStatement(null); 
                    ExpressionStatement es=new ExpressionStatement(null); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1084:5: ( expression ( lazySpecifier )? ( SEMICOLON | COMMA ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1084:7: expression ( lazySpecifier )? ( SEMICOLON | COMMA )
            {
            pushFollow(FOLLOW_expression_in_expressionOrSpecificationStatement7143);
            expression170=expression();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { statement = es;
                    if (expression170!=null)
                        es.setExpression(expression170);
                    if (expression170.getTerm() instanceof AssignOp) {
                        AssignOp a = (AssignOp) expression170.getTerm();
                        if (a.getLeftTerm() instanceof BaseMemberExpression ||
                            a.getLeftTerm() instanceof ParameterizedExpression) {
                            SpecifierExpression se = new SpecifierExpression(null);
                            Expression e = new Expression(null);
                            se.setExpression(e);
                            e.setTerm(a.getRightTerm());
                            ss.setSpecifierExpression(se);
                            ss.setBaseMemberExpression(a.getLeftTerm());
                            statement = ss;
                        }
                    }
                  }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1102:7: ( lazySpecifier )?
            int alt97=2;
            int LA97_0 = input.LA(1);

            if ( (LA97_0==COMPUTE) ) {
                alt97=1;
            }
            switch (alt97) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1108:9: lazySpecifier
                    {
                    pushFollow(FOLLOW_lazySpecifier_in_expressionOrSpecificationStatement7179);
                    lazySpecifier171=lazySpecifier();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { ss.setSpecifierExpression(lazySpecifier171);
                              ss.setBaseMemberExpression(expression170.getTerm()); 
                              statement = ss; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1114:7: ( SEMICOLON | COMMA )
            int alt98=2;
            int LA98_0 = input.LA(1);

            if ( (LA98_0==SEMICOLON) ) {
                alt98=1;
            }
            else if ( (LA98_0==COMMA) ) {
                alt98=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return statement;}
                NoViableAltException nvae =
                    new NoViableAltException("", 98, 0, input);

                throw nvae;

            }
            switch (alt98) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1115:9: SEMICOLON
                    {
                    SEMICOLON172=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_expressionOrSpecificationStatement7224); if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement.setEndToken(SEMICOLON172); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1117:9: COMMA
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                  new MismatchedTokenException(SEMICOLON, input)); }

                    COMMA173=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionOrSpecificationStatement7254); if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement.setEndToken(COMMA173); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { expecting=-1; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "expressionOrSpecificationStatement"



    // $ANTLR start "directiveStatement"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1125:1: directiveStatement returns [Directive directive] : d= directive SEMICOLON ;
    public Directive directiveStatement() throws RecognitionException {
        Directive directive = null;


        Token SEMICOLON174=null;
        Directive d =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1126:5: (d= directive SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1126:7: d= directive SEMICOLON
            {
            pushFollow(FOLLOW_directive_in_directiveStatement7303);
            d=directive();

            state._fsp--;
            if (state.failed) return directive;

            if ( state.backtracking==0 ) { directive =d; }

            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

            SEMICOLON174=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_directiveStatement7329); if (state.failed) return directive;

            if ( state.backtracking==0 ) { directive.setEndToken(SEMICOLON174); }

            if ( state.backtracking==0 ) { expecting=-1; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return directive;
    }
    // $ANTLR end "directiveStatement"



    // $ANTLR start "directive"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1134:1: directive returns [Directive directive] : ( returnDirective | throwDirective | breakDirective | continueDirective );
    public Directive directive() throws RecognitionException {
        Directive directive = null;


        Return returnDirective175 =null;

        Throw throwDirective176 =null;

        Break breakDirective177 =null;

        Continue continueDirective178 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1135:5: ( returnDirective | throwDirective | breakDirective | continueDirective )
            int alt99=4;
            switch ( input.LA(1) ) {
            case RETURN:
                {
                alt99=1;
                }
                break;
            case THROW:
                {
                alt99=2;
                }
                break;
            case BREAK:
                {
                alt99=3;
                }
                break;
            case CONTINUE:
                {
                alt99=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return directive;}
                NoViableAltException nvae =
                    new NoViableAltException("", 99, 0, input);

                throw nvae;

            }

            switch (alt99) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1135:7: returnDirective
                    {
                    pushFollow(FOLLOW_returnDirective_in_directive7366);
                    returnDirective175=returnDirective();

                    state._fsp--;
                    if (state.failed) return directive;

                    if ( state.backtracking==0 ) { directive = returnDirective175; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1137:7: throwDirective
                    {
                    pushFollow(FOLLOW_throwDirective_in_directive7382);
                    throwDirective176=throwDirective();

                    state._fsp--;
                    if (state.failed) return directive;

                    if ( state.backtracking==0 ) { directive = throwDirective176; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1139:7: breakDirective
                    {
                    pushFollow(FOLLOW_breakDirective_in_directive7398);
                    breakDirective177=breakDirective();

                    state._fsp--;
                    if (state.failed) return directive;

                    if ( state.backtracking==0 ) { directive = breakDirective177; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1141:7: continueDirective
                    {
                    pushFollow(FOLLOW_continueDirective_in_directive7414);
                    continueDirective178=continueDirective();

                    state._fsp--;
                    if (state.failed) return directive;

                    if ( state.backtracking==0 ) { directive = continueDirective178; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return directive;
    }
    // $ANTLR end "directive"



    // $ANTLR start "returnDirective"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1145:1: returnDirective returns [Return directive] : RETURN ( functionOrExpression )? ;
    public Return returnDirective() throws RecognitionException {
        Return directive = null;


        Token RETURN179=null;
        Expression functionOrExpression180 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1146:5: ( RETURN ( functionOrExpression )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1146:7: RETURN ( functionOrExpression )?
            {
            RETURN179=(Token)match(input,RETURN,FOLLOW_RETURN_in_returnDirective7443); if (state.failed) return directive;

            if ( state.backtracking==0 ) { directive = new Return(RETURN179); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1148:7: ( functionOrExpression )?
            int alt100=2;
            int LA100_0 = input.LA(1);

            if ( (LA100_0==BACKTICK||LA100_0==CHAR_LITERAL||(LA100_0 >= DECREMENT_OP && LA100_0 <= DIFFERENCE_OP)||LA100_0==FLOAT_LITERAL||LA100_0==FUNCTION_MODIFIER||LA100_0==INCREMENT_OP||(LA100_0 >= LBRACE && LA100_0 <= LIDENTIFIER)||LA100_0==LPAREN||LA100_0==NATURAL_LITERAL||LA100_0==NOT_OP||(LA100_0 >= OUTER && LA100_0 <= PACKAGE)||LA100_0==STRING_LITERAL||LA100_0==STRING_START||(LA100_0 >= SUM_OP && LA100_0 <= SUPER)||LA100_0==THIS||LA100_0==UIDENTIFIER||(LA100_0 >= VALUE_MODIFIER && LA100_0 <= VOID_MODIFIER)) ) {
                alt100=1;
            }
            switch (alt100) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1149:9: functionOrExpression
                    {
                    pushFollow(FOLLOW_functionOrExpression_in_returnDirective7470);
                    functionOrExpression180=functionOrExpression();

                    state._fsp--;
                    if (state.failed) return directive;

                    if ( state.backtracking==0 ) { directive.setExpression(functionOrExpression180); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return directive;
    }
    // $ANTLR end "returnDirective"



    // $ANTLR start "throwDirective"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1154:1: throwDirective returns [Throw directive] : THROW ( expression )? ;
    public Throw throwDirective() throws RecognitionException {
        Throw directive = null;


        Token THROW181=null;
        Expression expression182 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1155:5: ( THROW ( expression )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1155:7: THROW ( expression )?
            {
            THROW181=(Token)match(input,THROW,FOLLOW_THROW_in_throwDirective7510); if (state.failed) return directive;

            if ( state.backtracking==0 ) { directive = new Throw(THROW181); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1157:7: ( expression )?
            int alt101=2;
            int LA101_0 = input.LA(1);

            if ( (LA101_0==BACKTICK||LA101_0==CHAR_LITERAL||(LA101_0 >= DECREMENT_OP && LA101_0 <= DIFFERENCE_OP)||LA101_0==FLOAT_LITERAL||LA101_0==INCREMENT_OP||(LA101_0 >= LBRACE && LA101_0 <= LIDENTIFIER)||LA101_0==LPAREN||LA101_0==NATURAL_LITERAL||LA101_0==NOT_OP||(LA101_0 >= OUTER && LA101_0 <= PACKAGE)||LA101_0==STRING_LITERAL||LA101_0==STRING_START||(LA101_0 >= SUM_OP && LA101_0 <= SUPER)||LA101_0==THIS||LA101_0==UIDENTIFIER||(LA101_0 >= VALUE_MODIFIER && LA101_0 <= VERBATIM_STRING)) ) {
                alt101=1;
            }
            switch (alt101) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1158:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_throwDirective7537);
                    expression182=expression();

                    state._fsp--;
                    if (state.failed) return directive;

                    if ( state.backtracking==0 ) { directive.setExpression(expression182); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return directive;
    }
    // $ANTLR end "throwDirective"



    // $ANTLR start "breakDirective"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1163:1: breakDirective returns [Break directive] : BREAK ;
    public Break breakDirective() throws RecognitionException {
        Break directive = null;


        Token BREAK183=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1164:5: ( BREAK )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1164:7: BREAK
            {
            BREAK183=(Token)match(input,BREAK,FOLLOW_BREAK_in_breakDirective7577); if (state.failed) return directive;

            if ( state.backtracking==0 ) { directive = new Break(BREAK183); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return directive;
    }
    // $ANTLR end "breakDirective"



    // $ANTLR start "continueDirective"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1168:1: continueDirective returns [Continue directive] : CONTINUE ;
    public Continue continueDirective() throws RecognitionException {
        Continue directive = null;


        Token CONTINUE184=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1169:5: ( CONTINUE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1169:7: CONTINUE
            {
            CONTINUE184=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_continueDirective7606); if (state.failed) return directive;

            if ( state.backtracking==0 ) { directive = new Continue(CONTINUE184); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return directive;
    }
    // $ANTLR end "continueDirective"



    // $ANTLR start "typeSpecifier"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1173:1: typeSpecifier returns [TypeSpecifier typeSpecifier] : ( COMPUTE | SPECIFY ) type ;
    public TypeSpecifier typeSpecifier() throws RecognitionException {
        TypeSpecifier typeSpecifier = null;


        Token COMPUTE185=null;
        Token SPECIFY186=null;
        StaticType type187 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1174:5: ( ( COMPUTE | SPECIFY ) type )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1174:7: ( COMPUTE | SPECIFY ) type
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1174:7: ( COMPUTE | SPECIFY )
            int alt102=2;
            int LA102_0 = input.LA(1);

            if ( (LA102_0==COMPUTE) ) {
                alt102=1;
            }
            else if ( (LA102_0==SPECIFY) ) {
                alt102=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return typeSpecifier;}
                NoViableAltException nvae =
                    new NoViableAltException("", 102, 0, input);

                throw nvae;

            }
            switch (alt102) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1175:9: COMPUTE
                    {
                    COMPUTE185=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_typeSpecifier7645); if (state.failed) return typeSpecifier;

                    if ( state.backtracking==0 ) { typeSpecifier = new TypeSpecifier(COMPUTE185); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1178:9: SPECIFY
                    {
                    SPECIFY186=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_typeSpecifier7674); if (state.failed) return typeSpecifier;

                    if ( state.backtracking==0 ) { typeSpecifier = new TypeSpecifier(SPECIFY186); }

                    }
                    break;

            }


            pushFollow(FOLLOW_type_in_typeSpecifier7701);
            type187=type();

            state._fsp--;
            if (state.failed) return typeSpecifier;

            if ( state.backtracking==0 ) { typeSpecifier.setType(type187); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeSpecifier;
    }
    // $ANTLR end "typeSpecifier"



    // $ANTLR start "typeDefault"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1185:1: typeDefault returns [TypeSpecifier typeSpecifier] : SPECIFY type ;
    public TypeSpecifier typeDefault() throws RecognitionException {
        TypeSpecifier typeSpecifier = null;


        Token SPECIFY188=null;
        StaticType type189 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1186:5: ( SPECIFY type )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1186:7: SPECIFY type
            {
            SPECIFY188=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_typeDefault7730); if (state.failed) return typeSpecifier;

            if ( state.backtracking==0 ) { typeSpecifier = new DefaultTypeArgument(SPECIFY188); }

            pushFollow(FOLLOW_type_in_typeDefault7747);
            type189=type();

            state._fsp--;
            if (state.failed) return typeSpecifier;

            if ( state.backtracking==0 ) { typeSpecifier.setType(type189); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeSpecifier;
    }
    // $ANTLR end "typeDefault"



    // $ANTLR start "specifier"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1192:1: specifier returns [SpecifierExpression specifierExpression] : SPECIFY functionOrExpression ;
    public SpecifierExpression specifier() throws RecognitionException {
        SpecifierExpression specifierExpression = null;


        Token SPECIFY190=null;
        Expression functionOrExpression191 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1193:5: ( SPECIFY functionOrExpression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1193:7: SPECIFY functionOrExpression
            {
            SPECIFY190=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_specifier7776); if (state.failed) return specifierExpression;

            if ( state.backtracking==0 ) { specifierExpression = new SpecifierExpression(SPECIFY190); }

            pushFollow(FOLLOW_functionOrExpression_in_specifier7792);
            functionOrExpression191=functionOrExpression();

            state._fsp--;
            if (state.failed) return specifierExpression;

            if ( state.backtracking==0 ) { specifierExpression.setExpression(functionOrExpression191); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return specifierExpression;
    }
    // $ANTLR end "specifier"



    // $ANTLR start "lazySpecifier"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1199:1: lazySpecifier returns [SpecifierExpression specifierExpression] : COMPUTE functionOrExpression ;
    public SpecifierExpression lazySpecifier() throws RecognitionException {
        SpecifierExpression specifierExpression = null;


        Token COMPUTE192=null;
        Expression functionOrExpression193 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1200:5: ( COMPUTE functionOrExpression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1200:7: COMPUTE functionOrExpression
            {
            COMPUTE192=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_lazySpecifier7821); if (state.failed) return specifierExpression;

            if ( state.backtracking==0 ) { specifierExpression = new LazySpecifierExpression(COMPUTE192); }

            pushFollow(FOLLOW_functionOrExpression_in_lazySpecifier7837);
            functionOrExpression193=functionOrExpression();

            state._fsp--;
            if (state.failed) return specifierExpression;

            if ( state.backtracking==0 ) { specifierExpression.setExpression(functionOrExpression193); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return specifierExpression;
    }
    // $ANTLR end "lazySpecifier"



    // $ANTLR start "functionSpecifier"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1206:1: functionSpecifier returns [SpecifierExpression specifierExpression] : ( COMPUTE | SPECIFY ) functionOrExpression ;
    public SpecifierExpression functionSpecifier() throws RecognitionException {
        SpecifierExpression specifierExpression = null;


        Token COMPUTE194=null;
        Token SPECIFY195=null;
        Expression functionOrExpression196 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1207:5: ( ( COMPUTE | SPECIFY ) functionOrExpression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1207:7: ( COMPUTE | SPECIFY ) functionOrExpression
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1207:7: ( COMPUTE | SPECIFY )
            int alt103=2;
            int LA103_0 = input.LA(1);

            if ( (LA103_0==COMPUTE) ) {
                alt103=1;
            }
            else if ( (LA103_0==SPECIFY) ) {
                alt103=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return specifierExpression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 103, 0, input);

                throw nvae;

            }
            switch (alt103) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1208:9: COMPUTE
                    {
                    COMPUTE194=(Token)match(input,COMPUTE,FOLLOW_COMPUTE_in_functionSpecifier7876); if (state.failed) return specifierExpression;

                    if ( state.backtracking==0 ) { specifierExpression = new LazySpecifierExpression(COMPUTE194); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1211:9: SPECIFY
                    {
                    SPECIFY195=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_functionSpecifier7904); if (state.failed) return specifierExpression;

                    if ( state.backtracking==0 ) { specifierExpression = new LazySpecifierExpression(SPECIFY195); }

                    }
                    break;

            }


            pushFollow(FOLLOW_functionOrExpression_in_functionSpecifier7930);
            functionOrExpression196=functionOrExpression();

            state._fsp--;
            if (state.failed) return specifierExpression;

            if ( state.backtracking==0 ) { specifierExpression.setExpression(functionOrExpression196); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return specifierExpression;
    }
    // $ANTLR end "functionSpecifier"



    // $ANTLR start "expression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1218:1: expression returns [Expression expression] : assignmentExpression ;
    public Expression expression() throws RecognitionException {
        Expression expression = null;


        Term assignmentExpression197 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1219:5: ( assignmentExpression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1219:7: assignmentExpression
            {
            if ( state.backtracking==0 ) { expression = new Expression(null); }

            pushFollow(FOLLOW_assignmentExpression_in_expression7967);
            assignmentExpression197=assignmentExpression();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) { expression.setTerm(assignmentExpression197); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "expression"



    // $ANTLR start "base"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1224:1: base returns [Primary primary] : ( nonstringLiteral | stringExpression | metaLiteral | enumeration | tuple | dynamicObject | selfReference | parExpression | baseReference );
    public Primary base() throws RecognitionException {
        Primary primary = null;


        Literal nonstringLiteral198 =null;

        Atom stringExpression199 =null;

        MetaLiteral metaLiteral200 =null;

        SequenceEnumeration enumeration201 =null;

        Tuple tuple202 =null;

        Dynamic dynamicObject203 =null;

        Atom selfReference204 =null;

        Expression parExpression205 =null;

        CeylonParser.baseReference_return baseReference206 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1225:5: ( nonstringLiteral | stringExpression | metaLiteral | enumeration | tuple | dynamicObject | selfReference | parExpression | baseReference )
            int alt104=9;
            switch ( input.LA(1) ) {
            case CHAR_LITERAL:
            case FLOAT_LITERAL:
            case NATURAL_LITERAL:
                {
                alt104=1;
                }
                break;
            case STRING_LITERAL:
            case STRING_START:
            case VERBATIM_STRING:
                {
                alt104=2;
                }
                break;
            case BACKTICK:
                {
                alt104=3;
                }
                break;
            case LBRACE:
                {
                alt104=4;
                }
                break;
            case LBRACKET:
                {
                alt104=5;
                }
                break;
            case VALUE_MODIFIER:
                {
                alt104=6;
                }
                break;
            case OUTER:
            case PACKAGE:
            case SUPER:
            case THIS:
                {
                alt104=7;
                }
                break;
            case LPAREN:
                {
                alt104=8;
                }
                break;
            case LIDENTIFIER:
            case UIDENTIFIER:
                {
                alt104=9;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return primary;}
                NoViableAltException nvae =
                    new NoViableAltException("", 104, 0, input);

                throw nvae;

            }

            switch (alt104) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1225:7: nonstringLiteral
                    {
                    pushFollow(FOLLOW_nonstringLiteral_in_base7996);
                    nonstringLiteral198=nonstringLiteral();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =nonstringLiteral198; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1227:7: stringExpression
                    {
                    pushFollow(FOLLOW_stringExpression_in_base8012);
                    stringExpression199=stringExpression();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =stringExpression199; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1229:7: metaLiteral
                    {
                    pushFollow(FOLLOW_metaLiteral_in_base8028);
                    metaLiteral200=metaLiteral();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =metaLiteral200; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1231:7: enumeration
                    {
                    pushFollow(FOLLOW_enumeration_in_base8044);
                    enumeration201=enumeration();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =enumeration201; }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1233:7: tuple
                    {
                    pushFollow(FOLLOW_tuple_in_base8060);
                    tuple202=tuple();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =tuple202; }

                    }
                    break;
                case 6 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1235:7: dynamicObject
                    {
                    pushFollow(FOLLOW_dynamicObject_in_base8076);
                    dynamicObject203=dynamicObject();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =dynamicObject203; }

                    }
                    break;
                case 7 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1237:7: selfReference
                    {
                    pushFollow(FOLLOW_selfReference_in_base8092);
                    selfReference204=selfReference();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =selfReference204; }

                    }
                    break;
                case 8 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1239:7: parExpression
                    {
                    pushFollow(FOLLOW_parExpression_in_base8108);
                    parExpression205=parExpression();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { primary =parExpression205; }

                    }
                    break;
                case 9 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1241:7: baseReference
                    {
                    pushFollow(FOLLOW_baseReference_in_base8124);
                    baseReference206=baseReference();

                    state._fsp--;
                    if (state.failed) return primary;

                    if ( state.backtracking==0 ) { BaseMemberOrTypeExpression be;
                            if ((baseReference206!=null?baseReference206.isMember:false))
                                be = new BaseMemberExpression(null);
                            else
                                be = new BaseTypeExpression(null);
                            be.setIdentifier((baseReference206!=null?baseReference206.identifier:null));
                            be.setTypeArguments( new InferredTypeArguments(null) );
                            if ((baseReference206!=null?baseReference206.typeArgumentList:null)!=null)
                                be.setTypeArguments((baseReference206!=null?baseReference206.typeArgumentList:null));
                            primary =be; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return primary;
    }
    // $ANTLR end "base"


    public static class baseReference_return extends ParserRuleReturnScope {
        public Identifier identifier;
        public TypeArgumentList typeArgumentList;
        public boolean isMember;
    };


    // $ANTLR start "baseReference"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1254:1: baseReference returns [Identifier identifier, TypeArgumentList typeArgumentList, \n boolean isMember] : ( memberReference | typeReference ) ;
    public CeylonParser.baseReference_return baseReference() throws RecognitionException {
        CeylonParser.baseReference_return retval = new CeylonParser.baseReference_return();
        retval.start = input.LT(1);


        CeylonParser.memberReference_return memberReference207 =null;

        CeylonParser.typeReference_return typeReference208 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1256:5: ( ( memberReference | typeReference ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1257:5: ( memberReference | typeReference )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1257:5: ( memberReference | typeReference )
            int alt105=2;
            int LA105_0 = input.LA(1);

            if ( (LA105_0==LIDENTIFIER) ) {
                alt105=1;
            }
            else if ( (LA105_0==UIDENTIFIER) ) {
                alt105=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 105, 0, input);

                throw nvae;

            }
            switch (alt105) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1258:7: memberReference
                    {
                    pushFollow(FOLLOW_memberReference_in_baseReference8166);
                    memberReference207=memberReference();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.identifier = (memberReference207!=null?memberReference207.identifier:null);
                            retval.typeArgumentList = (memberReference207!=null?memberReference207.typeArgumentList:null);
                            retval.isMember = true; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1262:7: typeReference
                    {
                    pushFollow(FOLLOW_typeReference_in_baseReference8182);
                    typeReference208=typeReference();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.identifier = (typeReference208!=null?typeReference208.identifier:null);
                            retval.typeArgumentList = (typeReference208!=null?typeReference208.typeArgumentList:null);
                            retval.isMember = false; }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "baseReference"



    // $ANTLR start "primary"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1269:1: primary returns [Primary primary] : base ( qualifiedReference | indexOrIndexRange | ( specifierParametersStart )=> parameters | positionalArguments | namedArguments )* ;
    public Primary primary() throws RecognitionException {
        Primary primary = null;


        Primary base209 =null;

        CeylonParser.qualifiedReference_return qualifiedReference210 =null;

        IndexExpression indexOrIndexRange211 =null;

        ParameterList parameters212 =null;

        PositionalArgumentList positionalArguments213 =null;

        NamedArgumentList namedArguments214 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1270:5: ( base ( qualifiedReference | indexOrIndexRange | ( specifierParametersStart )=> parameters | positionalArguments | namedArguments )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1270:7: base ( qualifiedReference | indexOrIndexRange | ( specifierParametersStart )=> parameters | positionalArguments | namedArguments )*
            {
            pushFollow(FOLLOW_base_in_primary8217);
            base209=base();

            state._fsp--;
            if (state.failed) return primary;

            if ( state.backtracking==0 ) { primary =base209; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1272:5: ( qualifiedReference | indexOrIndexRange | ( specifierParametersStart )=> parameters | positionalArguments | namedArguments )*
            loop106:
            do {
                int alt106=6;
                alt106 = dfa106.predict(input);
                switch (alt106) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1275:11: qualifiedReference
            	    {
            	    pushFollow(FOLLOW_qualifiedReference_in_primary8250);
            	    qualifiedReference210=qualifiedReference();

            	    state._fsp--;
            	    if (state.failed) return primary;

            	    if ( state.backtracking==0 ) { QualifiedMemberOrTypeExpression qe;
            	            if ((qualifiedReference210!=null?qualifiedReference210.isMember:false))
            	                qe = new QualifiedMemberExpression(null);
            	            else
            	                qe = new QualifiedTypeExpression(null);
            	            qe.setPrimary(primary);
            	            qe.setMemberOperator((qualifiedReference210!=null?qualifiedReference210.operator:null));
            	            qe.setIdentifier((qualifiedReference210!=null?qualifiedReference210.identifier:null));
            	            qe.setTypeArguments( new InferredTypeArguments(null) );
            	            if ((qualifiedReference210!=null?qualifiedReference210.typeArgumentList:null)!=null)
            	                qe.setTypeArguments((qualifiedReference210!=null?qualifiedReference210.typeArgumentList:null));
            	            primary =qe; }

            	    }
            	    break;
            	case 2 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1288:9: indexOrIndexRange
            	    {
            	    pushFollow(FOLLOW_indexOrIndexRange_in_primary8268);
            	    indexOrIndexRange211=indexOrIndexRange();

            	    state._fsp--;
            	    if (state.failed) return primary;

            	    if ( state.backtracking==0 ) { indexOrIndexRange211.setPrimary(primary);
            	              primary = indexOrIndexRange211; }

            	    }
            	    break;
            	case 3 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1291:9: ( specifierParametersStart )=> parameters
            	    {
            	    pushFollow(FOLLOW_parameters_in_primary8294);
            	    parameters212=parameters();

            	    state._fsp--;
            	    if (state.failed) return primary;

            	    if ( state.backtracking==0 ) { ParameterizedExpression pe;
            	              if (primary instanceof ParameterizedExpression) {
            	                  pe = (ParameterizedExpression) primary;
            	              } else {
            	                  pe = new ParameterizedExpression(null);
            	                  pe.setPrimary(primary);
            	              }
            	              pe.addParameterList(parameters212);
            	              primary = pe; }

            	    }
            	    break;
            	case 4 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1301:9: positionalArguments
            	    {
            	    pushFollow(FOLLOW_positionalArguments_in_primary8314);
            	    positionalArguments213=positionalArguments();

            	    state._fsp--;
            	    if (state.failed) return primary;

            	    if ( state.backtracking==0 ) { InvocationExpression ie = new InvocationExpression(null);
            	              ie.setPrimary(primary);
            	              ie.setPositionalArgumentList(positionalArguments213); 
            	              primary =ie; }

            	    }
            	    break;
            	case 5 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1306:9: namedArguments
            	    {
            	    pushFollow(FOLLOW_namedArguments_in_primary8335);
            	    namedArguments214=namedArguments();

            	    state._fsp--;
            	    if (state.failed) return primary;

            	    if ( state.backtracking==0 ) { InvocationExpression ie = new InvocationExpression(null);
            	              ie.setPrimary(primary);
            	              ie.setNamedArgumentList(namedArguments214);
            	              primary =ie; }

            	    }
            	    break;

            	default :
            	    break loop106;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return primary;
    }
    // $ANTLR end "primary"



    // $ANTLR start "specifierParametersStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1314:1: specifierParametersStart : LPAREN ( compilerAnnotations annotatedDeclarationStart | RPAREN ( SPECIFY | COMPUTE | specifierParametersStart ) ) ;
    public void specifierParametersStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:5: ( LPAREN ( compilerAnnotations annotatedDeclarationStart | RPAREN ( SPECIFY | COMPUTE | specifierParametersStart ) ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:7: LPAREN ( compilerAnnotations annotatedDeclarationStart | RPAREN ( SPECIFY | COMPUTE | specifierParametersStart ) )
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_specifierParametersStart8369); if (state.failed) return ;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:14: ( compilerAnnotations annotatedDeclarationStart | RPAREN ( SPECIFY | COMPUTE | specifierParametersStart ) )
            int alt108=2;
            int LA108_0 = input.LA(1);

            if ( (LA108_0==ALIAS||LA108_0==ASSIGN||LA108_0==CLASS_DEFINITION||LA108_0==COMPILER_ANNOTATION||LA108_0==DYNAMIC||LA108_0==FUNCTION_MODIFIER||LA108_0==INTERFACE_DEFINITION||(LA108_0 >= LBRACE && LA108_0 <= LIDENTIFIER)||LA108_0==OBJECT_DEFINITION||LA108_0==SMALLER_OP||LA108_0==STRING_LITERAL||LA108_0==UIDENTIFIER||(LA108_0 >= VALUE_MODIFIER && LA108_0 <= VOID_MODIFIER)) ) {
                alt108=1;
            }
            else if ( (LA108_0==RPAREN) ) {
                alt108=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 108, 0, input);

                throw nvae;

            }
            switch (alt108) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:15: compilerAnnotations annotatedDeclarationStart
                    {
                    pushFollow(FOLLOW_compilerAnnotations_in_specifierParametersStart8372);
                    compilerAnnotations();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_annotatedDeclarationStart_in_specifierParametersStart8374);
                    annotatedDeclarationStart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:63: RPAREN ( SPECIFY | COMPUTE | specifierParametersStart )
                    {
                    match(input,RPAREN,FOLLOW_RPAREN_in_specifierParametersStart8378); if (state.failed) return ;

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:70: ( SPECIFY | COMPUTE | specifierParametersStart )
                    int alt107=3;
                    switch ( input.LA(1) ) {
                    case SPECIFY:
                        {
                        alt107=1;
                        }
                        break;
                    case COMPUTE:
                        {
                        alt107=2;
                        }
                        break;
                    case LPAREN:
                        {
                        alt107=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return ;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 107, 0, input);

                        throw nvae;

                    }

                    switch (alt107) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:71: SPECIFY
                            {
                            match(input,SPECIFY,FOLLOW_SPECIFY_in_specifierParametersStart8381); if (state.failed) return ;

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:79: COMPUTE
                            {
                            match(input,COMPUTE,FOLLOW_COMPUTE_in_specifierParametersStart8383); if (state.failed) return ;

                            }
                            break;
                        case 3 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1315:87: specifierParametersStart
                            {
                            pushFollow(FOLLOW_specifierParametersStart_in_specifierParametersStart8385);
                            specifierParametersStart();

                            state._fsp--;
                            if (state.failed) return ;

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "specifierParametersStart"


    public static class qualifiedReference_return extends ParserRuleReturnScope {
        public Identifier identifier;
        public MemberOperator operator;
        public TypeArgumentList typeArgumentList;
        public boolean isMember;
    };


    // $ANTLR start "qualifiedReference"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1318:1: qualifiedReference returns [Identifier identifier, MemberOperator operator, \n TypeArgumentList typeArgumentList, boolean isMember] : memberSelectionOperator ( memberReference | typeReference | (~ ( LIDENTIFIER | UIDENTIFIER ) )=>) ;
    public CeylonParser.qualifiedReference_return qualifiedReference() throws RecognitionException {
        CeylonParser.qualifiedReference_return retval = new CeylonParser.qualifiedReference_return();
        retval.start = input.LT(1);


        MemberOperator memberSelectionOperator215 =null;

        CeylonParser.memberReference_return memberReference216 =null;

        CeylonParser.typeReference_return typeReference217 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1320:5: ( memberSelectionOperator ( memberReference | typeReference | (~ ( LIDENTIFIER | UIDENTIFIER ) )=>) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1320:7: memberSelectionOperator ( memberReference | typeReference | (~ ( LIDENTIFIER | UIDENTIFIER ) )=>)
            {
            pushFollow(FOLLOW_memberSelectionOperator_in_qualifiedReference8408);
            memberSelectionOperator215=memberSelectionOperator();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.operator = memberSelectionOperator215;
                    retval.identifier = new Identifier(retval.operator.getToken());
                    retval.identifier.setText("");
                    retval.isMember =true; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1325:7: ( memberReference | typeReference | (~ ( LIDENTIFIER | UIDENTIFIER ) )=>)
            int alt109=3;
            alt109 = dfa109.predict(input);
            switch (alt109) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1326:9: memberReference
                    {
                    pushFollow(FOLLOW_memberReference_in_qualifiedReference8436);
                    memberReference216=memberReference();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.identifier = (memberReference216!=null?memberReference216.identifier:null);
                              retval.typeArgumentList = (memberReference216!=null?memberReference216.typeArgumentList:null); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1329:9: typeReference
                    {
                    pushFollow(FOLLOW_typeReference_in_qualifiedReference8456);
                    typeReference217=typeReference();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.identifier = (typeReference217!=null?typeReference217.identifier:null);
                              retval.typeArgumentList = (typeReference217!=null?typeReference217.typeArgumentList:null);  
                              retval.isMember =false; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1333:9: (~ ( LIDENTIFIER | UIDENTIFIER ) )=>
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                  new MismatchedTokenException(LIDENTIFIER, input)); }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "qualifiedReference"



    // $ANTLR start "memberSelectionOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1339:1: memberSelectionOperator returns [MemberOperator operator] : ( MEMBER_OP | SAFE_MEMBER_OP | SPREAD_OP );
    public MemberOperator memberSelectionOperator() throws RecognitionException {
        MemberOperator operator = null;


        Token MEMBER_OP218=null;
        Token SAFE_MEMBER_OP219=null;
        Token SPREAD_OP220=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1340:5: ( MEMBER_OP | SAFE_MEMBER_OP | SPREAD_OP )
            int alt110=3;
            switch ( input.LA(1) ) {
            case MEMBER_OP:
                {
                alt110=1;
                }
                break;
            case SAFE_MEMBER_OP:
                {
                alt110=2;
                }
                break;
            case SPREAD_OP:
                {
                alt110=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 110, 0, input);

                throw nvae;

            }

            switch (alt110) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1340:7: MEMBER_OP
                    {
                    MEMBER_OP218=(Token)match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_memberSelectionOperator8523); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator =new MemberOp(MEMBER_OP218); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1342:7: SAFE_MEMBER_OP
                    {
                    SAFE_MEMBER_OP219=(Token)match(input,SAFE_MEMBER_OP,FOLLOW_SAFE_MEMBER_OP_in_memberSelectionOperator8539); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator =new SafeMemberOp(SAFE_MEMBER_OP219); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1344:7: SPREAD_OP
                    {
                    SPREAD_OP220=(Token)match(input,SPREAD_OP,FOLLOW_SPREAD_OP_in_memberSelectionOperator8555); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator =new SpreadOp(SPREAD_OP220); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "memberSelectionOperator"



    // $ANTLR start "enumeration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1348:1: enumeration returns [SequenceEnumeration sequenceEnumeration] : LBRACE ( sequencedArgument )? RBRACE ;
    public SequenceEnumeration enumeration() throws RecognitionException {
        SequenceEnumeration sequenceEnumeration = null;


        Token LBRACE221=null;
        Token RBRACE223=null;
        SequencedArgument sequencedArgument222 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1349:5: ( LBRACE ( sequencedArgument )? RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1349:7: LBRACE ( sequencedArgument )? RBRACE
            {
            LBRACE221=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_enumeration8584); if (state.failed) return sequenceEnumeration;

            if ( state.backtracking==0 ) { sequenceEnumeration = new SequenceEnumeration(LBRACE221); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1351:7: ( sequencedArgument )?
            int alt111=2;
            int LA111_0 = input.LA(1);

            if ( (LA111_0==ALIAS||(LA111_0 >= ASSERT && LA111_0 <= ASSIGN)||(LA111_0 >= BACKTICK && LA111_0 <= BREAK)||(LA111_0 >= CHAR_LITERAL && LA111_0 <= CLASS_DEFINITION)||LA111_0==COMPILER_ANNOTATION||LA111_0==CONTINUE||(LA111_0 >= DECREMENT_OP && LA111_0 <= DIFFERENCE_OP)||LA111_0==DYNAMIC||(LA111_0 >= FLOAT_LITERAL && LA111_0 <= FUNCTION_MODIFIER)||(LA111_0 >= IF_CLAUSE && LA111_0 <= INTERFACE_DEFINITION)||LA111_0==IN_OP||(LA111_0 >= LBRACE && LA111_0 <= LIDENTIFIER)||LA111_0==LPAREN||LA111_0==MODULE||LA111_0==NATURAL_LITERAL||(LA111_0 >= NOT_OP && LA111_0 <= OBJECT_DEFINITION)||(LA111_0 >= OUT && LA111_0 <= PACKAGE)||LA111_0==PRODUCT_OP||(LA111_0 >= RETURN && LA111_0 <= RPAREN)||(LA111_0 >= SEMICOLON && LA111_0 <= SMALLER_OP)||LA111_0==STRING_LITERAL||LA111_0==STRING_START||(LA111_0 >= SUM_OP && LA111_0 <= SWITCH_CLAUSE)||(LA111_0 >= THIS && LA111_0 <= UIDENTIFIER)||(LA111_0 >= VALUE_MODIFIER && LA111_0 <= WHILE_CLAUSE)) ) {
                alt111=1;
            }
            switch (alt111) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1352:9: sequencedArgument
                    {
                    pushFollow(FOLLOW_sequencedArgument_in_enumeration8612);
                    sequencedArgument222=sequencedArgument();

                    state._fsp--;
                    if (state.failed) return sequenceEnumeration;

                    if ( state.backtracking==0 ) { sequenceEnumeration.setSequencedArgument(sequencedArgument222); }

                    }
                    break;

            }


            RBRACE223=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_enumeration8639); if (state.failed) return sequenceEnumeration;

            if ( state.backtracking==0 ) { sequenceEnumeration.setEndToken(RBRACE223); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return sequenceEnumeration;
    }
    // $ANTLR end "enumeration"



    // $ANTLR start "tuple"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1359:1: tuple returns [Tuple tuple] : LBRACKET ( sequencedArgument )? RBRACKET ;
    public Tuple tuple() throws RecognitionException {
        Tuple tuple = null;


        Token LBRACKET224=null;
        Token RBRACKET226=null;
        SequencedArgument sequencedArgument225 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1360:5: ( LBRACKET ( sequencedArgument )? RBRACKET )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1360:7: LBRACKET ( sequencedArgument )? RBRACKET
            {
            LBRACKET224=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_tuple8668); if (state.failed) return tuple;

            if ( state.backtracking==0 ) { tuple = new Tuple(LBRACKET224); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1362:7: ( sequencedArgument )?
            int alt112=2;
            int LA112_0 = input.LA(1);

            if ( (LA112_0==ALIAS||(LA112_0 >= ASSERT && LA112_0 <= ASSIGN)||(LA112_0 >= BACKTICK && LA112_0 <= BREAK)||(LA112_0 >= CHAR_LITERAL && LA112_0 <= CLASS_DEFINITION)||LA112_0==COMPILER_ANNOTATION||LA112_0==CONTINUE||(LA112_0 >= DECREMENT_OP && LA112_0 <= DIFFERENCE_OP)||LA112_0==DYNAMIC||(LA112_0 >= FLOAT_LITERAL && LA112_0 <= FUNCTION_MODIFIER)||(LA112_0 >= IF_CLAUSE && LA112_0 <= INTERFACE_DEFINITION)||LA112_0==IN_OP||(LA112_0 >= LBRACE && LA112_0 <= LIDENTIFIER)||LA112_0==LPAREN||LA112_0==MODULE||LA112_0==NATURAL_LITERAL||(LA112_0 >= NOT_OP && LA112_0 <= OBJECT_DEFINITION)||(LA112_0 >= OUT && LA112_0 <= PACKAGE)||LA112_0==PRODUCT_OP||(LA112_0 >= RETURN && LA112_0 <= RPAREN)||(LA112_0 >= SEMICOLON && LA112_0 <= SMALLER_OP)||LA112_0==STRING_LITERAL||LA112_0==STRING_START||(LA112_0 >= SUM_OP && LA112_0 <= SWITCH_CLAUSE)||(LA112_0 >= THIS && LA112_0 <= UIDENTIFIER)||(LA112_0 >= VALUE_MODIFIER && LA112_0 <= WHILE_CLAUSE)) ) {
                alt112=1;
            }
            switch (alt112) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1363:9: sequencedArgument
                    {
                    pushFollow(FOLLOW_sequencedArgument_in_tuple8695);
                    sequencedArgument225=sequencedArgument();

                    state._fsp--;
                    if (state.failed) return tuple;

                    if ( state.backtracking==0 ) { tuple.setSequencedArgument(sequencedArgument225); }

                    }
                    break;

            }


            RBRACKET226=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_tuple8722); if (state.failed) return tuple;

            if ( state.backtracking==0 ) { tuple.setEndToken(RBRACKET226); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return tuple;
    }
    // $ANTLR end "tuple"



    // $ANTLR start "dynamicObject"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1370:1: dynamicObject returns [Dynamic dynamic] : VALUE_MODIFIER namedArguments ;
    public Dynamic dynamicObject() throws RecognitionException {
        Dynamic dynamic = null;


        Token VALUE_MODIFIER227=null;
        NamedArgumentList namedArguments228 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1371:5: ( VALUE_MODIFIER namedArguments )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1371:7: VALUE_MODIFIER namedArguments
            {
            VALUE_MODIFIER227=(Token)match(input,VALUE_MODIFIER,FOLLOW_VALUE_MODIFIER_in_dynamicObject8755); if (state.failed) return dynamic;

            if ( state.backtracking==0 ) { dynamic = new Dynamic(VALUE_MODIFIER227); }

            pushFollow(FOLLOW_namedArguments_in_dynamicObject8772);
            namedArguments228=namedArguments();

            state._fsp--;
            if (state.failed) return dynamic;

            if ( state.backtracking==0 ) { dynamic.setNamedArgumentList(namedArguments228); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return dynamic;
    }
    // $ANTLR end "dynamicObject"



    // $ANTLR start "expressions"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1377:1: expressions returns [ExpressionList expressionList] :e1= expression (c= COMMA (e2= expression |) )* ;
    public ExpressionList expressions() throws RecognitionException {
        ExpressionList expressionList = null;


        Token c=null;
        Expression e1 =null;

        Expression e2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1378:5: (e1= expression (c= COMMA (e2= expression |) )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1378:7: e1= expression (c= COMMA (e2= expression |) )*
            {
            if ( state.backtracking==0 ) { expressionList = new ExpressionList(null); }

            pushFollow(FOLLOW_expression_in_expressions8815);
            e1=expression();

            state._fsp--;
            if (state.failed) return expressionList;

            if ( state.backtracking==0 ) { expressionList.addExpression(e1); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1381:7: (c= COMMA (e2= expression |) )*
            loop114:
            do {
                int alt114=2;
                int LA114_0 = input.LA(1);

                if ( (LA114_0==COMMA) ) {
                    alt114=1;
                }


                switch (alt114) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1381:9: c= COMMA (e2= expression |)
            	    {
            	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressions8836); if (state.failed) return expressionList;

            	    if ( state.backtracking==0 ) { expressionList.setEndToken(c); }

            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1383:9: (e2= expression |)
            	    int alt113=2;
            	    int LA113_0 = input.LA(1);

            	    if ( (LA113_0==BACKTICK||LA113_0==CHAR_LITERAL||(LA113_0 >= DECREMENT_OP && LA113_0 <= DIFFERENCE_OP)||LA113_0==FLOAT_LITERAL||LA113_0==INCREMENT_OP||(LA113_0 >= LBRACE && LA113_0 <= LIDENTIFIER)||LA113_0==LPAREN||LA113_0==NATURAL_LITERAL||LA113_0==NOT_OP||(LA113_0 >= OUTER && LA113_0 <= PACKAGE)||LA113_0==STRING_LITERAL||LA113_0==STRING_START||(LA113_0 >= SUM_OP && LA113_0 <= SUPER)||LA113_0==THIS||LA113_0==UIDENTIFIER||(LA113_0 >= VALUE_MODIFIER && LA113_0 <= VERBATIM_STRING)) ) {
            	        alt113=1;
            	    }
            	    else if ( (LA113_0==COMMA||LA113_0==RPAREN) ) {
            	        alt113=2;
            	    }
            	    else {
            	        if (state.backtracking>0) {state.failed=true; return expressionList;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 113, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt113) {
            	        case 1 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1384:11: e2= expression
            	            {
            	            pushFollow(FOLLOW_expression_in_expressions8871);
            	            e2=expression();

            	            state._fsp--;
            	            if (state.failed) return expressionList;

            	            if ( state.backtracking==0 ) { if (e2!=null) {
            	                            expressionList.addExpression(e2);
            	                            expressionList.setEndToken(null); } }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1388:11: 
            	            {
            	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
            	                          new MismatchedTokenException(LIDENTIFIER, input)); }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop114;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expressionList;
    }
    // $ANTLR end "expressions"


    public static class memberReference_return extends ParserRuleReturnScope {
        public Identifier identifier;
        public TypeArgumentList typeArgumentList;
    };


    // $ANTLR start "memberReference"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1394:1: memberReference returns [Identifier identifier, \n TypeArgumentList typeArgumentList] : memberName ( ( typeArgumentsStart )=> typeArguments )? ;
    public CeylonParser.memberReference_return memberReference() throws RecognitionException {
        CeylonParser.memberReference_return retval = new CeylonParser.memberReference_return();
        retval.start = input.LT(1);


        Identifier memberName229 =null;

        TypeArgumentList typeArguments230 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1396:5: ( memberName ( ( typeArgumentsStart )=> typeArguments )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1396:7: memberName ( ( typeArgumentsStart )=> typeArguments )?
            {
            pushFollow(FOLLOW_memberName_in_memberReference8937);
            memberName229=memberName();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.identifier = memberName229; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1398:7: ( ( typeArgumentsStart )=> typeArguments )?
            int alt115=2;
            alt115 = dfa115.predict(input);
            switch (alt115) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1399:9: ( typeArgumentsStart )=> typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_memberReference8977);
                    typeArguments230=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.typeArgumentList = typeArguments230; }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "memberReference"


    public static class typeReference_return extends ParserRuleReturnScope {
        public Identifier identifier;
        public TypeArgumentList typeArgumentList;
    };


    // $ANTLR start "typeReference"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1405:1: typeReference returns [Identifier identifier, \n TypeArgumentList typeArgumentList] : typeName ( ( typeArgumentsStart )=> typeArguments )? ;
    public CeylonParser.typeReference_return typeReference() throws RecognitionException {
        CeylonParser.typeReference_return retval = new CeylonParser.typeReference_return();
        retval.start = input.LT(1);


        Identifier typeName231 =null;

        TypeArgumentList typeArguments232 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1407:5: ( typeName ( ( typeArgumentsStart )=> typeArguments )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1407:7: typeName ( ( typeArgumentsStart )=> typeArguments )?
            {
            pushFollow(FOLLOW_typeName_in_typeReference9017);
            typeName231=typeName();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.identifier = typeName231; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1409:7: ( ( typeArgumentsStart )=> typeArguments )?
            int alt116=2;
            alt116 = dfa116.predict(input);
            switch (alt116) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1410:9: ( typeArgumentsStart )=> typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_typeReference9058);
                    typeArguments232=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.typeArgumentList = typeArguments232; }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeReference"



    // $ANTLR start "typeArgumentsStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1419:1: typeArgumentsStart : SMALLER_OP ( type ( LARGER_OP | SMALLER_OP | COMMA ) | SMALLER_OP | LARGER_OP ) ;
    public void typeArgumentsStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1420:5: ( SMALLER_OP ( type ( LARGER_OP | SMALLER_OP | COMMA ) | SMALLER_OP | LARGER_OP ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1420:7: SMALLER_OP ( type ( LARGER_OP | SMALLER_OP | COMMA ) | SMALLER_OP | LARGER_OP )
            {
            match(input,SMALLER_OP,FOLLOW_SMALLER_OP_in_typeArgumentsStart9097); if (state.failed) return ;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1421:5: ( type ( LARGER_OP | SMALLER_OP | COMMA ) | SMALLER_OP | LARGER_OP )
            int alt117=3;
            switch ( input.LA(1) ) {
            case LBRACE:
            case LBRACKET:
            case UIDENTIFIER:
                {
                alt117=1;
                }
                break;
            case SMALLER_OP:
                {
                int LA117_2 = input.LA(2);

                if ( ((LA117_2 >= LBRACE && LA117_2 <= LBRACKET)||LA117_2==SMALLER_OP||LA117_2==UIDENTIFIER) ) {
                    alt117=1;
                }
                else if ( (LA117_2==EOF) ) {
                    alt117=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 117, 2, input);

                    throw nvae;

                }
                }
                break;
            case LARGER_OP:
                {
                alt117=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 117, 0, input);

                throw nvae;

            }

            switch (alt117) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1422:7: type ( LARGER_OP | SMALLER_OP | COMMA )
                    {
                    pushFollow(FOLLOW_type_in_typeArgumentsStart9111);
                    type();

                    state._fsp--;
                    if (state.failed) return ;

                    if ( input.LA(1)==COMMA||input.LA(1)==LARGER_OP||input.LA(1)==SMALLER_OP ) {
                        input.consume();
                        state.errorRecovery=false;
                        state.failed=false;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return ;}
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1425:7: SMALLER_OP
                    {
                    match(input,SMALLER_OP,FOLLOW_SMALLER_OP_in_typeArgumentsStart9139); if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1427:7: LARGER_OP
                    {
                    match(input,LARGER_OP,FOLLOW_LARGER_OP_in_typeArgumentsStart9154); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "typeArgumentsStart"



    // $ANTLR start "indexOrIndexRange"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1431:1: indexOrIndexRange returns [IndexExpression indexExpression] : LBRACKET (e1= ELLIPSIS i= index |l= index (e2= ELLIPSIS | RANGE_OP u= index | SEGMENT_OP s= index )? ) RBRACKET ;
    public IndexExpression indexOrIndexRange() throws RecognitionException {
        IndexExpression indexExpression = null;


        Token e1=null;
        Token e2=null;
        Token LBRACKET233=null;
        Token RANGE_OP234=null;
        Token SEGMENT_OP235=null;
        Token RBRACKET236=null;
        Expression i =null;

        Expression l =null;

        Expression u =null;

        Expression s =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1436:5: ( LBRACKET (e1= ELLIPSIS i= index |l= index (e2= ELLIPSIS | RANGE_OP u= index | SEGMENT_OP s= index )? ) RBRACKET )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1436:7: LBRACKET (e1= ELLIPSIS i= index |l= index (e2= ELLIPSIS | RANGE_OP u= index | SEGMENT_OP s= index )? ) RBRACKET
            {
            LBRACKET233=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_indexOrIndexRange9202); if (state.failed) return indexExpression;

            if ( state.backtracking==0 ) { indexExpression = new IndexExpression(LBRACKET233); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1438:7: (e1= ELLIPSIS i= index |l= index (e2= ELLIPSIS | RANGE_OP u= index | SEGMENT_OP s= index )? )
            int alt119=2;
            int LA119_0 = input.LA(1);

            if ( (LA119_0==ELLIPSIS) ) {
                alt119=1;
            }
            else if ( (LA119_0==BACKTICK||LA119_0==CHAR_LITERAL||(LA119_0 >= DECREMENT_OP && LA119_0 <= DIFFERENCE_OP)||LA119_0==FLOAT_LITERAL||LA119_0==INCREMENT_OP||(LA119_0 >= LBRACE && LA119_0 <= LIDENTIFIER)||LA119_0==LPAREN||LA119_0==NATURAL_LITERAL||(LA119_0 >= OUTER && LA119_0 <= PACKAGE)||LA119_0==STRING_LITERAL||LA119_0==STRING_START||(LA119_0 >= SUM_OP && LA119_0 <= SUPER)||LA119_0==THIS||LA119_0==UIDENTIFIER||(LA119_0 >= VALUE_MODIFIER && LA119_0 <= VERBATIM_STRING)) ) {
                alt119=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return indexExpression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 119, 0, input);

                throw nvae;

            }
            switch (alt119) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1439:9: e1= ELLIPSIS i= index
                    {
                    e1=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_indexOrIndexRange9230); if (state.failed) return indexExpression;

                    if ( state.backtracking==0 ) { indexExpression.setEndToken(e1); }

                    pushFollow(FOLLOW_index_in_indexOrIndexRange9250);
                    i=index();

                    state._fsp--;
                    if (state.failed) return indexExpression;

                    if ( state.backtracking==0 ) { ElementRange er0 = new ElementRange(null);
                            indexExpression.setElementOrRange(er0);
                            er0.setUpperBound(i); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1446:7: l= index (e2= ELLIPSIS | RANGE_OP u= index | SEGMENT_OP s= index )?
                    {
                    pushFollow(FOLLOW_index_in_indexOrIndexRange9276);
                    l=index();

                    state._fsp--;
                    if (state.failed) return indexExpression;

                    if ( state.backtracking==0 ) { Element e = new Element(null);
                            indexExpression.setElementOrRange(e);
                            e.setExpression(l); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1450:7: (e2= ELLIPSIS | RANGE_OP u= index | SEGMENT_OP s= index )?
                    int alt118=4;
                    switch ( input.LA(1) ) {
                        case ELLIPSIS:
                            {
                            alt118=1;
                            }
                            break;
                        case RANGE_OP:
                            {
                            alt118=2;
                            }
                            break;
                        case SEGMENT_OP:
                            {
                            alt118=3;
                            }
                            break;
                    }

                    switch (alt118) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1451:9: e2= ELLIPSIS
                            {
                            e2=(Token)match(input,ELLIPSIS,FOLLOW_ELLIPSIS_in_indexOrIndexRange9304); if (state.failed) return indexExpression;

                            if ( state.backtracking==0 ) { indexExpression.setEndToken(e2); }

                            if ( state.backtracking==0 ) { ElementRange er1 = new ElementRange(null);
                                    indexExpression.setElementOrRange(er1);
                                    er1.setLowerBound(l); }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1456:9: RANGE_OP u= index
                            {
                            RANGE_OP234=(Token)match(input,RANGE_OP,FOLLOW_RANGE_OP_in_indexOrIndexRange9332); if (state.failed) return indexExpression;

                            if ( state.backtracking==0 ) { indexExpression.setEndToken(RANGE_OP234); }

                            pushFollow(FOLLOW_index_in_indexOrIndexRange9355);
                            u=index();

                            state._fsp--;
                            if (state.failed) return indexExpression;

                            if ( state.backtracking==0 ) { ElementRange er2 = new ElementRange(null);
                                    indexExpression.setElementOrRange(er2);
                                    er2.setLowerBound(l); 
                                    er2.setUpperBound(u); }

                            }
                            break;
                        case 3 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1463:9: SEGMENT_OP s= index
                            {
                            SEGMENT_OP235=(Token)match(input,SEGMENT_OP,FOLLOW_SEGMENT_OP_in_indexOrIndexRange9374); if (state.failed) return indexExpression;

                            if ( state.backtracking==0 ) { indexExpression.setEndToken(SEGMENT_OP235); }

                            pushFollow(FOLLOW_index_in_indexOrIndexRange9396);
                            s=index();

                            state._fsp--;
                            if (state.failed) return indexExpression;

                            if ( state.backtracking==0 ) { ElementRange er3 = new ElementRange(null);
                                    indexExpression.setElementOrRange(er3);
                                    er3.setLowerBound(l); 
                                    er3.setLength(s); }

                            }
                            break;

                    }


                    }
                    break;

            }


            RBRACKET236=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_indexOrIndexRange9430); if (state.failed) return indexExpression;

            if ( state.backtracking==0 ) { indexExpression.setEndToken(RBRACKET236); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return indexExpression;
    }
    // $ANTLR end "indexOrIndexRange"



    // $ANTLR start "index"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1476:1: index returns [Expression expression] : additiveExpression ;
    public Expression index() throws RecognitionException {
        Expression expression = null;


        Term additiveExpression237 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1477:5: ( additiveExpression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1477:7: additiveExpression
            {
            pushFollow(FOLLOW_additiveExpression_in_index9459);
            additiveExpression237=additiveExpression();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) { expression = new Expression(null);
                    expression.setTerm(additiveExpression237); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "index"



    // $ANTLR start "namedArguments"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1482:1: namedArguments returns [NamedArgumentList namedArgumentList] : LBRACE ( ( namedArgumentStart )=> namedArgument | ( anonymousArgument )=> anonymousArgument )* ( sequencedArgument )? RBRACE ;
    public NamedArgumentList namedArguments() throws RecognitionException {
        NamedArgumentList namedArgumentList = null;


        Token LBRACE238=null;
        Token RBRACE242=null;
        NamedArgument namedArgument239 =null;

        SpecifiedArgument anonymousArgument240 =null;

        SequencedArgument sequencedArgument241 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1483:5: ( LBRACE ( ( namedArgumentStart )=> namedArgument | ( anonymousArgument )=> anonymousArgument )* ( sequencedArgument )? RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1483:7: LBRACE ( ( namedArgumentStart )=> namedArgument | ( anonymousArgument )=> anonymousArgument )* ( sequencedArgument )? RBRACE
            {
            LBRACE238=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_namedArguments9489); if (state.failed) return namedArgumentList;

            if ( state.backtracking==0 ) { namedArgumentList = new NamedArgumentList(LBRACE238); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1485:7: ( ( namedArgumentStart )=> namedArgument | ( anonymousArgument )=> anonymousArgument )*
            loop120:
            do {
                int alt120=3;
                int LA120_0 = input.LA(1);

                if ( (LA120_0==COMPILER_ANNOTATION) ) {
                    int LA120_1 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }


                }
                else if ( (LA120_0==FUNCTION_MODIFIER) ) {
                    int LA120_2 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }
                    else if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==VOID_MODIFIER) ) {
                    int LA120_3 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }
                    else if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==LPAREN) ) {
                    int LA120_4 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==NOT_OP) ) {
                    int LA120_5 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==DIFFERENCE_OP) ) {
                    int LA120_6 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==SUM_OP) ) {
                    int LA120_7 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==DECREMENT_OP) ) {
                    int LA120_8 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==INCREMENT_OP) ) {
                    int LA120_9 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==NATURAL_LITERAL) ) {
                    int LA120_10 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==FLOAT_LITERAL) ) {
                    int LA120_11 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==CHAR_LITERAL) ) {
                    int LA120_12 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==STRING_LITERAL) ) {
                    int LA120_13 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==VERBATIM_STRING) ) {
                    int LA120_14 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==STRING_START) ) {
                    int LA120_15 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==BACKTICK) ) {
                    int LA120_16 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==LBRACE) ) {
                    int LA120_17 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }
                    else if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==LBRACKET) ) {
                    int LA120_18 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }
                    else if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==VALUE_MODIFIER) ) {
                    int LA120_19 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }
                    else if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==THIS) ) {
                    int LA120_20 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==SUPER) ) {
                    int LA120_21 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==OUTER) ) {
                    int LA120_22 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==PACKAGE) ) {
                    int LA120_23 = input.LA(2);

                    if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==LIDENTIFIER) ) {
                    int LA120_24 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }
                    else if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==UIDENTIFIER) ) {
                    int LA120_25 = input.LA(2);

                    if ( (synpred10_Ceylon()) ) {
                        alt120=1;
                    }
                    else if ( (synpred11_Ceylon()) ) {
                        alt120=2;
                    }


                }
                else if ( (LA120_0==OBJECT_DEFINITION) && (synpred10_Ceylon())) {
                    alt120=1;
                }
                else if ( (LA120_0==SMALLER_OP) && (synpred10_Ceylon())) {
                    alt120=1;
                }


                switch (alt120) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1487:9: ( namedArgumentStart )=> namedArgument
            	    {
            	    pushFollow(FOLLOW_namedArgument_in_namedArguments9541);
            	    namedArgument239=namedArgument();

            	    state._fsp--;
            	    if (state.failed) return namedArgumentList;

            	    if ( state.backtracking==0 ) { if (namedArgument239!=null) 
            	                  namedArgumentList.addNamedArgument(namedArgument239); }

            	    }
            	    break;
            	case 2 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1491:9: ( anonymousArgument )=> anonymousArgument
            	    {
            	    pushFollow(FOLLOW_anonymousArgument_in_namedArguments9575);
            	    anonymousArgument240=anonymousArgument();

            	    state._fsp--;
            	    if (state.failed) return namedArgumentList;

            	    if ( state.backtracking==0 ) { if (anonymousArgument240!=null) 
            	                  namedArgumentList.addNamedArgument(anonymousArgument240); }

            	    }
            	    break;

            	default :
            	    break loop120;
                }
            } while (true);


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1496:7: ( sequencedArgument )?
            int alt121=2;
            int LA121_0 = input.LA(1);

            if ( (LA121_0==ALIAS||(LA121_0 >= ASSERT && LA121_0 <= ASSIGN)||(LA121_0 >= BACKTICK && LA121_0 <= BREAK)||(LA121_0 >= CHAR_LITERAL && LA121_0 <= CLASS_DEFINITION)||LA121_0==COMPILER_ANNOTATION||LA121_0==CONTINUE||(LA121_0 >= DECREMENT_OP && LA121_0 <= DIFFERENCE_OP)||LA121_0==DYNAMIC||(LA121_0 >= FLOAT_LITERAL && LA121_0 <= FUNCTION_MODIFIER)||(LA121_0 >= IF_CLAUSE && LA121_0 <= INTERFACE_DEFINITION)||LA121_0==IN_OP||(LA121_0 >= LBRACE && LA121_0 <= LIDENTIFIER)||LA121_0==LPAREN||LA121_0==MODULE||LA121_0==NATURAL_LITERAL||(LA121_0 >= NOT_OP && LA121_0 <= OBJECT_DEFINITION)||(LA121_0 >= OUT && LA121_0 <= PACKAGE)||LA121_0==PRODUCT_OP||(LA121_0 >= RETURN && LA121_0 <= RPAREN)||(LA121_0 >= SEMICOLON && LA121_0 <= SMALLER_OP)||LA121_0==STRING_LITERAL||LA121_0==STRING_START||(LA121_0 >= SUM_OP && LA121_0 <= SWITCH_CLAUSE)||(LA121_0 >= THIS && LA121_0 <= UIDENTIFIER)||(LA121_0 >= VALUE_MODIFIER && LA121_0 <= WHILE_CLAUSE)) ) {
                alt121=1;
            }
            switch (alt121) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1497:9: sequencedArgument
                    {
                    pushFollow(FOLLOW_sequencedArgument_in_namedArguments9613);
                    sequencedArgument241=sequencedArgument();

                    state._fsp--;
                    if (state.failed) return namedArgumentList;

                    if ( state.backtracking==0 ) { namedArgumentList.setSequencedArgument(sequencedArgument241); }

                    }
                    break;

            }


            RBRACE242=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_namedArguments9640); if (state.failed) return namedArgumentList;

            if ( state.backtracking==0 ) { namedArgumentList.setEndToken(RBRACE242); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return namedArgumentList;
    }
    // $ANTLR end "namedArguments"



    // $ANTLR start "sequencedArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1504:1: sequencedArgument returns [SequencedArgument sequencedArgument] : compilerAnnotations (pa1= positionalArgument |sa1= spreadArgument |c1= comprehension ) (c= COMMA (pa2= positionalArgument |sa2= spreadArgument |c2= comprehension |) )* ;
    public SequencedArgument sequencedArgument() throws RecognitionException {
        SequencedArgument sequencedArgument = null;


        Token c=null;
        ListedArgument pa1 =null;

        SpreadArgument sa1 =null;

        Comprehension c1 =null;

        ListedArgument pa2 =null;

        SpreadArgument sa2 =null;

        Comprehension c2 =null;

        List<CompilerAnnotation> compilerAnnotations243 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1505:5: ( compilerAnnotations (pa1= positionalArgument |sa1= spreadArgument |c1= comprehension ) (c= COMMA (pa2= positionalArgument |sa2= spreadArgument |c2= comprehension |) )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1505:7: compilerAnnotations (pa1= positionalArgument |sa1= spreadArgument |c1= comprehension ) (c= COMMA (pa2= positionalArgument |sa2= spreadArgument |c2= comprehension |) )*
            {
            pushFollow(FOLLOW_compilerAnnotations_in_sequencedArgument9669);
            compilerAnnotations243=compilerAnnotations();

            state._fsp--;
            if (state.failed) return sequencedArgument;

            if ( state.backtracking==0 ) { sequencedArgument = new SequencedArgument(null);
                    sequencedArgument.getCompilerAnnotations().addAll(compilerAnnotations243); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1508:9: (pa1= positionalArgument |sa1= spreadArgument |c1= comprehension )
            int alt122=3;
            switch ( input.LA(1) ) {
            case BACKTICK:
            case CHAR_LITERAL:
            case DECREMENT_OP:
            case DIFFERENCE_OP:
            case FLOAT_LITERAL:
            case FUNCTION_MODIFIER:
            case INCREMENT_OP:
            case LBRACE:
            case LBRACKET:
            case LIDENTIFIER:
            case LPAREN:
            case NATURAL_LITERAL:
            case NOT_OP:
            case OUTER:
            case PACKAGE:
            case STRING_LITERAL:
            case STRING_START:
            case SUM_OP:
            case SUPER:
            case THIS:
            case UIDENTIFIER:
            case VALUE_MODIFIER:
            case VERBATIM_STRING:
            case VOID_MODIFIER:
                {
                alt122=1;
                }
                break;
            case PRODUCT_OP:
                {
                alt122=2;
                }
                break;
            case FOR_CLAUSE:
                {
                alt122=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return sequencedArgument;}
                NoViableAltException nvae =
                    new NoViableAltException("", 122, 0, input);

                throw nvae;

            }

            switch (alt122) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1509:11: pa1= positionalArgument
                    {
                    pushFollow(FOLLOW_positionalArgument_in_sequencedArgument9701);
                    pa1=positionalArgument();

                    state._fsp--;
                    if (state.failed) return sequencedArgument;

                    if ( state.backtracking==0 ) { if (pa1!=null)
                                    sequencedArgument.addPositionalArgument(pa1); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1513:11: sa1= spreadArgument
                    {
                    pushFollow(FOLLOW_spreadArgument_in_sequencedArgument9737);
                    sa1=spreadArgument();

                    state._fsp--;
                    if (state.failed) return sequencedArgument;

                    if ( state.backtracking==0 ) { if (sa1!=null)
                                    sequencedArgument.addPositionalArgument(sa1); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1517:11: c1= comprehension
                    {
                    pushFollow(FOLLOW_comprehension_in_sequencedArgument9773);
                    c1=comprehension();

                    state._fsp--;
                    if (state.failed) return sequencedArgument;

                    if ( state.backtracking==0 ) { if (c1!=null)
                                    sequencedArgument.addPositionalArgument(c1); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1521:9: (c= COMMA (pa2= positionalArgument |sa2= spreadArgument |c2= comprehension |) )*
            loop124:
            do {
                int alt124=2;
                int LA124_0 = input.LA(1);

                if ( (LA124_0==COMMA) ) {
                    alt124=1;
                }


                switch (alt124) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1522:11: c= COMMA (pa2= positionalArgument |sa2= spreadArgument |c2= comprehension |)
            	    {
            	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_sequencedArgument9819); if (state.failed) return sequencedArgument;

            	    if ( state.backtracking==0 ) { sequencedArgument.setEndToken(c); }

            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1524:11: (pa2= positionalArgument |sa2= spreadArgument |c2= comprehension |)
            	    int alt123=4;
            	    switch ( input.LA(1) ) {
            	    case BACKTICK:
            	    case CHAR_LITERAL:
            	    case DECREMENT_OP:
            	    case DIFFERENCE_OP:
            	    case FLOAT_LITERAL:
            	    case FUNCTION_MODIFIER:
            	    case INCREMENT_OP:
            	    case LBRACE:
            	    case LBRACKET:
            	    case LIDENTIFIER:
            	    case LPAREN:
            	    case NATURAL_LITERAL:
            	    case NOT_OP:
            	    case OUTER:
            	    case PACKAGE:
            	    case STRING_LITERAL:
            	    case STRING_START:
            	    case SUM_OP:
            	    case SUPER:
            	    case THIS:
            	    case UIDENTIFIER:
            	    case VALUE_MODIFIER:
            	    case VERBATIM_STRING:
            	    case VOID_MODIFIER:
            	        {
            	        alt123=1;
            	        }
            	        break;
            	    case PRODUCT_OP:
            	        {
            	        alt123=2;
            	        }
            	        break;
            	    case FOR_CLAUSE:
            	        {
            	        alt123=3;
            	        }
            	        break;
            	    case COMMA:
            	    case RBRACE:
            	    case RBRACKET:
            	    case RPAREN:
            	        {
            	        alt123=4;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return sequencedArgument;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 123, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt123) {
            	        case 1 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1525:13: pa2= positionalArgument
            	            {
            	            pushFollow(FOLLOW_positionalArgument_in_sequencedArgument9859);
            	            pa2=positionalArgument();

            	            state._fsp--;
            	            if (state.failed) return sequencedArgument;

            	            if ( state.backtracking==0 ) { if (pa2!=null) {
            	                              sequencedArgument.addPositionalArgument(pa2); 
            	                              sequencedArgument.setEndToken(null); } }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1530:13: sa2= spreadArgument
            	            {
            	            pushFollow(FOLLOW_spreadArgument_in_sequencedArgument9901);
            	            sa2=spreadArgument();

            	            state._fsp--;
            	            if (state.failed) return sequencedArgument;

            	            if ( state.backtracking==0 ) { if (sa2!=null) {
            	                              sequencedArgument.addPositionalArgument(sa2); 
            	                              sequencedArgument.setEndToken(null); } }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1535:13: c2= comprehension
            	            {
            	            pushFollow(FOLLOW_comprehension_in_sequencedArgument9943);
            	            c2=comprehension();

            	            state._fsp--;
            	            if (state.failed) return sequencedArgument;

            	            if ( state.backtracking==0 ) { if (c2!=null) {
            	                              sequencedArgument.addPositionalArgument(c2);
            	                              sequencedArgument.setEndToken(null); } }

            	            }
            	            break;
            	        case 4 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1540:13: 
            	            {
            	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
            	                            new MismatchedTokenException(LIDENTIFIER, input)); }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop124;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return sequencedArgument;
    }
    // $ANTLR end "sequencedArgument"



    // $ANTLR start "namedArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1546:1: namedArgument returns [NamedArgument namedArgument] : compilerAnnotations ( namedSpecifiedArgument | namedArgumentDeclaration ) ;
    public NamedArgument namedArgument() throws RecognitionException {
        NamedArgument namedArgument = null;


        SpecifiedArgument namedSpecifiedArgument244 =null;

        NamedArgument namedArgumentDeclaration245 =null;

        List<CompilerAnnotation> compilerAnnotations246 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1547:5: ( compilerAnnotations ( namedSpecifiedArgument | namedArgumentDeclaration ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1547:7: compilerAnnotations ( namedSpecifiedArgument | namedArgumentDeclaration )
            {
            pushFollow(FOLLOW_compilerAnnotations_in_namedArgument10028);
            compilerAnnotations246=compilerAnnotations();

            state._fsp--;
            if (state.failed) return namedArgument;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1548:5: ( namedSpecifiedArgument | namedArgumentDeclaration )
            int alt125=2;
            int LA125_0 = input.LA(1);

            if ( (LA125_0==LIDENTIFIER) ) {
                int LA125_1 = input.LA(2);

                if ( (LA125_1==SEMICOLON||LA125_1==SPECIFY) ) {
                    alt125=1;
                }
                else if ( (LA125_1==COMPUTE||LA125_1==LPAREN) ) {
                    alt125=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return namedArgument;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 125, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA125_0==FUNCTION_MODIFIER||(LA125_0 >= LBRACE && LA125_0 <= LBRACKET)||LA125_0==OBJECT_DEFINITION||LA125_0==SMALLER_OP||LA125_0==UIDENTIFIER||LA125_0==VALUE_MODIFIER||LA125_0==VOID_MODIFIER) ) {
                alt125=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return namedArgument;}
                NoViableAltException nvae =
                    new NoViableAltException("", 125, 0, input);

                throw nvae;

            }
            switch (alt125) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1549:7: namedSpecifiedArgument
                    {
                    pushFollow(FOLLOW_namedSpecifiedArgument_in_namedArgument10045);
                    namedSpecifiedArgument244=namedSpecifiedArgument();

                    state._fsp--;
                    if (state.failed) return namedArgument;

                    if ( state.backtracking==0 ) { namedArgument = namedSpecifiedArgument244; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1552:7: namedArgumentDeclaration
                    {
                    pushFollow(FOLLOW_namedArgumentDeclaration_in_namedArgument10067);
                    namedArgumentDeclaration245=namedArgumentDeclaration();

                    state._fsp--;
                    if (state.failed) return namedArgument;

                    if ( state.backtracking==0 ) { namedArgument = namedArgumentDeclaration245; }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { if (namedArgument!=null)
                      namedArgument.getCompilerAnnotations().addAll(compilerAnnotations246); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return namedArgument;
    }
    // $ANTLR end "namedArgument"



    // $ANTLR start "namedSpecifiedArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1559:1: namedSpecifiedArgument returns [SpecifiedArgument specifiedArgument] : memberName ( specifier )? SEMICOLON ;
    public SpecifiedArgument namedSpecifiedArgument() throws RecognitionException {
        SpecifiedArgument specifiedArgument = null;


        Token SEMICOLON249=null;
        Identifier memberName247 =null;

        SpecifierExpression specifier248 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1560:5: ( memberName ( specifier )? SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1560:7: memberName ( specifier )? SEMICOLON
            {
            pushFollow(FOLLOW_memberName_in_namedSpecifiedArgument10108);
            memberName247=memberName();

            state._fsp--;
            if (state.failed) return specifiedArgument;

            if ( state.backtracking==0 ) { specifiedArgument = new SpecifiedArgument(null); 
                    specifiedArgument.setIdentifier(memberName247); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1563:7: ( specifier )?
            int alt126=2;
            int LA126_0 = input.LA(1);

            if ( (LA126_0==SPECIFY) ) {
                alt126=1;
            }
            switch (alt126) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1564:9: specifier
                    {
                    pushFollow(FOLLOW_specifier_in_namedSpecifiedArgument10134);
                    specifier248=specifier();

                    state._fsp--;
                    if (state.failed) return specifiedArgument;

                    if ( state.backtracking==0 ) { specifiedArgument.setSpecifierExpression(specifier248); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

            SEMICOLON249=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_namedSpecifiedArgument10170); if (state.failed) return specifiedArgument;

            if ( state.backtracking==0 ) { specifiedArgument.setEndToken(SEMICOLON249); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return specifiedArgument;
    }
    // $ANTLR end "namedSpecifiedArgument"



    // $ANTLR start "anonymousArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1572:1: anonymousArgument returns [SpecifiedArgument namedArgument] : functionOrExpression SEMICOLON ;
    public SpecifiedArgument anonymousArgument() throws RecognitionException {
        SpecifiedArgument namedArgument = null;


        Token SEMICOLON251=null;
        Expression functionOrExpression250 =null;


         namedArgument = new SpecifiedArgument(null); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1574:5: ( functionOrExpression SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1574:7: functionOrExpression SEMICOLON
            {
            pushFollow(FOLLOW_functionOrExpression_in_anonymousArgument10208);
            functionOrExpression250=functionOrExpression();

            state._fsp--;
            if (state.failed) return namedArgument;

            if ( state.backtracking==0 ) { SpecifierExpression se = new SpecifierExpression(null);
                   se.setExpression(functionOrExpression250);
                   namedArgument.setSpecifierExpression(se); }

            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

            SEMICOLON251=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_anonymousArgument10234); if (state.failed) return namedArgument;

            if ( state.backtracking==0 ) { namedArgument.setEndToken(SEMICOLON251); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return namedArgument;
    }
    // $ANTLR end "anonymousArgument"



    // $ANTLR start "objectArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1583:1: objectArgument returns [ObjectArgument declaration] : OBJECT_DEFINITION memberNameDeclaration ( extendedType )? ( satisfiedTypes )? ( classBody | SEMICOLON ) ;
    public ObjectArgument objectArgument() throws RecognitionException {
        ObjectArgument declaration = null;


        Token OBJECT_DEFINITION252=null;
        Token SEMICOLON257=null;
        Identifier memberNameDeclaration253 =null;

        ExtendedType extendedType254 =null;

        SatisfiedTypes satisfiedTypes255 =null;

        ClassBody classBody256 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1584:5: ( OBJECT_DEFINITION memberNameDeclaration ( extendedType )? ( satisfiedTypes )? ( classBody | SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1584:7: OBJECT_DEFINITION memberNameDeclaration ( extendedType )? ( satisfiedTypes )? ( classBody | SEMICOLON )
            {
            OBJECT_DEFINITION252=(Token)match(input,OBJECT_DEFINITION,FOLLOW_OBJECT_DEFINITION_in_objectArgument10263); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration = new ObjectArgument(OBJECT_DEFINITION252); 
                    declaration.setType(new ValueModifier(null)); }

            pushFollow(FOLLOW_memberNameDeclaration_in_objectArgument10280);
            memberNameDeclaration253=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setIdentifier(memberNameDeclaration253); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1589:7: ( extendedType )?
            int alt127=2;
            int LA127_0 = input.LA(1);

            if ( (LA127_0==EXTENDS) ) {
                alt127=1;
            }
            switch (alt127) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1590:9: extendedType
                    {
                    pushFollow(FOLLOW_extendedType_in_objectArgument10307);
                    extendedType254=extendedType();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setExtendedType(extendedType254); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1593:7: ( satisfiedTypes )?
            int alt128=2;
            int LA128_0 = input.LA(1);

            if ( (LA128_0==SATISFIES) ) {
                alt128=1;
            }
            switch (alt128) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1594:9: satisfiedTypes
                    {
                    pushFollow(FOLLOW_satisfiedTypes_in_objectArgument10346);
                    satisfiedTypes255=satisfiedTypes();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setSatisfiedTypes(satisfiedTypes255); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1597:7: ( classBody | SEMICOLON )
            int alt129=2;
            int LA129_0 = input.LA(1);

            if ( (LA129_0==LBRACE) ) {
                alt129=1;
            }
            else if ( (LA129_0==SEMICOLON) ) {
                alt129=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 129, 0, input);

                throw nvae;

            }
            switch (alt129) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1598:9: classBody
                    {
                    pushFollow(FOLLOW_classBody_in_objectArgument10384);
                    classBody256=classBody();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setClassBody(classBody256); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1600:9: SEMICOLON
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                  new MismatchedTokenException(LBRACE, input)); }

                    SEMICOLON257=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_objectArgument10414); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON257); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "objectArgument"



    // $ANTLR start "voidOrInferredMethodArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1607:1: voidOrInferredMethodArgument returns [MethodArgument declaration] : ( VOID_MODIFIER | FUNCTION_MODIFIER ) memberNameDeclaration ( parameters )* ( block | ( functionSpecifier )? SEMICOLON ) ;
    public MethodArgument voidOrInferredMethodArgument() throws RecognitionException {
        MethodArgument declaration = null;


        Token VOID_MODIFIER258=null;
        Token FUNCTION_MODIFIER259=null;
        Token SEMICOLON264=null;
        Identifier memberNameDeclaration260 =null;

        ParameterList parameters261 =null;

        Block block262 =null;

        SpecifierExpression functionSpecifier263 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1608:5: ( ( VOID_MODIFIER | FUNCTION_MODIFIER ) memberNameDeclaration ( parameters )* ( block | ( functionSpecifier )? SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1608:7: ( VOID_MODIFIER | FUNCTION_MODIFIER ) memberNameDeclaration ( parameters )* ( block | ( functionSpecifier )? SEMICOLON )
            {
            if ( state.backtracking==0 ) { declaration =new MethodArgument(null); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1609:7: ( VOID_MODIFIER | FUNCTION_MODIFIER )
            int alt130=2;
            int LA130_0 = input.LA(1);

            if ( (LA130_0==VOID_MODIFIER) ) {
                alt130=1;
            }
            else if ( (LA130_0==FUNCTION_MODIFIER) ) {
                alt130=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 130, 0, input);

                throw nvae;

            }
            switch (alt130) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1610:9: VOID_MODIFIER
                    {
                    VOID_MODIFIER258=(Token)match(input,VOID_MODIFIER,FOLLOW_VOID_MODIFIER_in_voidOrInferredMethodArgument10471); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setType(new VoidModifier(VOID_MODIFIER258)); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1613:9: FUNCTION_MODIFIER
                    {
                    FUNCTION_MODIFIER259=(Token)match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_voidOrInferredMethodArgument10499); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setType(new FunctionModifier(FUNCTION_MODIFIER259)); }

                    }
                    break;

            }


            pushFollow(FOLLOW_memberNameDeclaration_in_voidOrInferredMethodArgument10526);
            memberNameDeclaration260=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setIdentifier(memberNameDeclaration260); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1618:7: ( parameters )*
            loop131:
            do {
                int alt131=2;
                int LA131_0 = input.LA(1);

                if ( (LA131_0==LPAREN) ) {
                    alt131=1;
                }


                switch (alt131) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1619:9: parameters
            	    {
            	    pushFollow(FOLLOW_parameters_in_voidOrInferredMethodArgument10553);
            	    parameters261=parameters();

            	    state._fsp--;
            	    if (state.failed) return declaration;

            	    if ( state.backtracking==0 ) { declaration.addParameterList(parameters261); }

            	    }
            	    break;

            	default :
            	    break loop131;
                }
            } while (true);


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1622:7: ( block | ( functionSpecifier )? SEMICOLON )
            int alt133=2;
            int LA133_0 = input.LA(1);

            if ( (LA133_0==LBRACE) ) {
                alt133=1;
            }
            else if ( (LA133_0==COMPUTE||LA133_0==SEMICOLON||LA133_0==SPECIFY) ) {
                alt133=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 133, 0, input);

                throw nvae;

            }
            switch (alt133) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1623:9: block
                    {
                    pushFollow(FOLLOW_block_in_voidOrInferredMethodArgument10590);
                    block262=block();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setBlock(block262); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1626:9: ( functionSpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1626:9: ( functionSpecifier )?
                    int alt132=2;
                    int LA132_0 = input.LA(1);

                    if ( (LA132_0==COMPUTE||LA132_0==SPECIFY) ) {
                        alt132=1;
                    }
                    switch (alt132) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1627:11: functionSpecifier
                            {
                            pushFollow(FOLLOW_functionSpecifier_in_voidOrInferredMethodArgument10631);
                            functionSpecifier263=functionSpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { declaration.setSpecifierExpression(functionSpecifier263); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON264=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_voidOrInferredMethodArgument10674); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { expecting=-1; }

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON264); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "voidOrInferredMethodArgument"



    // $ANTLR start "inferredGetterArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1637:1: inferredGetterArgument returns [AttributeArgument declaration] : VALUE_MODIFIER memberNameDeclaration ( block | ( functionSpecifier )? SEMICOLON ) ;
    public AttributeArgument inferredGetterArgument() throws RecognitionException {
        AttributeArgument declaration = null;


        Token VALUE_MODIFIER265=null;
        Token SEMICOLON269=null;
        Identifier memberNameDeclaration266 =null;

        Block block267 =null;

        SpecifierExpression functionSpecifier268 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1638:5: ( VALUE_MODIFIER memberNameDeclaration ( block | ( functionSpecifier )? SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1638:7: VALUE_MODIFIER memberNameDeclaration ( block | ( functionSpecifier )? SEMICOLON )
            {
            if ( state.backtracking==0 ) { declaration =new AttributeArgument(null); }

            VALUE_MODIFIER265=(Token)match(input,VALUE_MODIFIER,FOLLOW_VALUE_MODIFIER_in_inferredGetterArgument10731); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setType(new ValueModifier(VALUE_MODIFIER265)); }

            pushFollow(FOLLOW_memberNameDeclaration_in_inferredGetterArgument10748);
            memberNameDeclaration266=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { declaration.setIdentifier(memberNameDeclaration266); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1643:7: ( block | ( functionSpecifier )? SEMICOLON )
            int alt135=2;
            int LA135_0 = input.LA(1);

            if ( (LA135_0==LBRACE) ) {
                alt135=1;
            }
            else if ( (LA135_0==COMPUTE||LA135_0==SEMICOLON||LA135_0==SPECIFY) ) {
                alt135=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 135, 0, input);

                throw nvae;

            }
            switch (alt135) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1644:9: block
                    {
                    pushFollow(FOLLOW_block_in_inferredGetterArgument10775);
                    block267=block();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration.setBlock(block267); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1647:9: ( functionSpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1647:9: ( functionSpecifier )?
                    int alt134=2;
                    int LA134_0 = input.LA(1);

                    if ( (LA134_0==COMPUTE||LA134_0==SPECIFY) ) {
                        alt134=1;
                    }
                    switch (alt134) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1648:11: functionSpecifier
                            {
                            pushFollow(FOLLOW_functionSpecifier_in_inferredGetterArgument10816);
                            functionSpecifier268=functionSpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { declaration.setSpecifierExpression(functionSpecifier268); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON269=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_inferredGetterArgument10859); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { expecting=-1; }

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON269); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "inferredGetterArgument"



    // $ANTLR start "typedMethodOrGetterArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1658:1: typedMethodOrGetterArgument returns [TypedArgument declaration] : type memberNameDeclaration ( ( parameters )+ )? ( block | ( functionSpecifier )? SEMICOLON ) ;
    public TypedArgument typedMethodOrGetterArgument() throws RecognitionException {
        TypedArgument declaration = null;


        Token SEMICOLON275=null;
        StaticType type270 =null;

        Identifier memberNameDeclaration271 =null;

        ParameterList parameters272 =null;

        Block block273 =null;

        SpecifierExpression functionSpecifier274 =null;


         MethodArgument marg = new MethodArgument(null);
                    AttributeArgument aarg = new AttributeArgument(null); 
                    declaration =aarg; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1662:5: ( type memberNameDeclaration ( ( parameters )+ )? ( block | ( functionSpecifier )? SEMICOLON ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1662:7: type memberNameDeclaration ( ( parameters )+ )? ( block | ( functionSpecifier )? SEMICOLON )
            {
            pushFollow(FOLLOW_type_in_typedMethodOrGetterArgument10917);
            type270=type();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { marg.setType(type270);
                    aarg.setType(type270); }

            pushFollow(FOLLOW_memberNameDeclaration_in_typedMethodOrGetterArgument10934);
            memberNameDeclaration271=memberNameDeclaration();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { marg.setIdentifier(memberNameDeclaration271);
                    aarg.setIdentifier(memberNameDeclaration271); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1668:7: ( ( parameters )+ )?
            int alt137=2;
            int LA137_0 = input.LA(1);

            if ( (LA137_0==LPAREN) ) {
                alt137=1;
            }
            switch (alt137) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1669:9: ( parameters )+
                    {
                    if ( state.backtracking==0 ) { declaration = marg; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1670:9: ( parameters )+
                    int cnt136=0;
                    loop136:
                    do {
                        int alt136=2;
                        int LA136_0 = input.LA(1);

                        if ( (LA136_0==LPAREN) ) {
                            alt136=1;
                        }


                        switch (alt136) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1671:11: parameters
                    	    {
                    	    pushFollow(FOLLOW_parameters_in_typedMethodOrGetterArgument10983);
                    	    parameters272=parameters();

                    	    state._fsp--;
                    	    if (state.failed) return declaration;

                    	    if ( state.backtracking==0 ) { marg.addParameterList(parameters272); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt136 >= 1 ) break loop136;
                    	    if (state.backtracking>0) {state.failed=true; return declaration;}
                                EarlyExitException eee =
                                    new EarlyExitException(136, input);
                                throw eee;
                        }
                        cnt136++;
                    } while (true);


                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1675:7: ( block | ( functionSpecifier )? SEMICOLON )
            int alt139=2;
            int LA139_0 = input.LA(1);

            if ( (LA139_0==LBRACE) ) {
                alt139=1;
            }
            else if ( (LA139_0==COMPUTE||LA139_0==SEMICOLON||LA139_0==SPECIFY) ) {
                alt139=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 139, 0, input);

                throw nvae;

            }
            switch (alt139) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1676:9: block
                    {
                    pushFollow(FOLLOW_block_in_typedMethodOrGetterArgument11033);
                    block273=block();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { marg.setBlock(block273);
                              aarg.setBlock(block273); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1680:9: ( functionSpecifier )? SEMICOLON
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1680:9: ( functionSpecifier )?
                    int alt138=2;
                    int LA138_0 = input.LA(1);

                    if ( (LA138_0==COMPUTE||LA138_0==SPECIFY) ) {
                        alt138=1;
                    }
                    switch (alt138) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1681:11: functionSpecifier
                            {
                            pushFollow(FOLLOW_functionSpecifier_in_typedMethodOrGetterArgument11074);
                            functionSpecifier274=functionSpecifier();

                            state._fsp--;
                            if (state.failed) return declaration;

                            if ( state.backtracking==0 ) { marg.setSpecifierExpression(functionSpecifier274);
                                        aarg.setSpecifierExpression(functionSpecifier274); }

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) { expecting=SEMICOLON; }

                    SEMICOLON275=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_typedMethodOrGetterArgument11117); if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { expecting=-1; }

                    if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON275); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "typedMethodOrGetterArgument"



    // $ANTLR start "untypedMethodOrGetterArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1692:1: untypedMethodOrGetterArgument returns [TypedArgument declaration] : memberName ( ( parameters )+ )? lazySpecifier SEMICOLON ;
    public TypedArgument untypedMethodOrGetterArgument() throws RecognitionException {
        TypedArgument declaration = null;


        Token SEMICOLON279=null;
        Identifier memberName276 =null;

        ParameterList parameters277 =null;

        SpecifierExpression lazySpecifier278 =null;


         MethodArgument marg = new MethodArgument(null);
                    marg.setType(new FunctionModifier(null));
                    AttributeArgument aarg = new AttributeArgument(null);
                    aarg.setType(new ValueModifier(null));
                    declaration =aarg; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1698:5: ( memberName ( ( parameters )+ )? lazySpecifier SEMICOLON )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1698:7: memberName ( ( parameters )+ )? lazySpecifier SEMICOLON
            {
            pushFollow(FOLLOW_memberName_in_untypedMethodOrGetterArgument11175);
            memberName276=memberName();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { marg.setIdentifier(memberName276);
                    aarg.setIdentifier(memberName276); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1701:7: ( ( parameters )+ )?
            int alt141=2;
            int LA141_0 = input.LA(1);

            if ( (LA141_0==LPAREN) ) {
                alt141=1;
            }
            switch (alt141) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1702:9: ( parameters )+
                    {
                    if ( state.backtracking==0 ) { declaration = marg; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1703:9: ( parameters )+
                    int cnt140=0;
                    loop140:
                    do {
                        int alt140=2;
                        int LA140_0 = input.LA(1);

                        if ( (LA140_0==LPAREN) ) {
                            alt140=1;
                        }


                        switch (alt140) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1704:11: parameters
                    	    {
                    	    pushFollow(FOLLOW_parameters_in_untypedMethodOrGetterArgument11224);
                    	    parameters277=parameters();

                    	    state._fsp--;
                    	    if (state.failed) return declaration;

                    	    if ( state.backtracking==0 ) { marg.addParameterList(parameters277); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt140 >= 1 ) break loop140;
                    	    if (state.backtracking>0) {state.failed=true; return declaration;}
                                EarlyExitException eee =
                                    new EarlyExitException(140, input);
                                throw eee;
                        }
                        cnt140++;
                    } while (true);


                    }
                    break;

            }


            pushFollow(FOLLOW_lazySpecifier_in_untypedMethodOrGetterArgument11264);
            lazySpecifier278=lazySpecifier();

            state._fsp--;
            if (state.failed) return declaration;

            if ( state.backtracking==0 ) { marg.setSpecifierExpression(lazySpecifier278);
                    aarg.setSpecifierExpression(lazySpecifier278); }

            if ( state.backtracking==0 ) { expecting=SEMICOLON; }

            SEMICOLON279=(Token)match(input,SEMICOLON,FOLLOW_SEMICOLON_in_untypedMethodOrGetterArgument11288); if (state.failed) return declaration;

            if ( state.backtracking==0 ) { expecting=-1; }

            if ( state.backtracking==0 ) { declaration.setEndToken(SEMICOLON279); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "untypedMethodOrGetterArgument"



    // $ANTLR start "namedArgumentDeclaration"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1717:1: namedArgumentDeclaration returns [NamedArgument declaration] : ( objectArgument | typedMethodOrGetterArgument | voidOrInferredMethodArgument | inferredGetterArgument | untypedMethodOrGetterArgument );
    public NamedArgument namedArgumentDeclaration() throws RecognitionException {
        NamedArgument declaration = null;


        ObjectArgument objectArgument280 =null;

        TypedArgument typedMethodOrGetterArgument281 =null;

        MethodArgument voidOrInferredMethodArgument282 =null;

        AttributeArgument inferredGetterArgument283 =null;

        TypedArgument untypedMethodOrGetterArgument284 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1718:5: ( objectArgument | typedMethodOrGetterArgument | voidOrInferredMethodArgument | inferredGetterArgument | untypedMethodOrGetterArgument )
            int alt142=5;
            switch ( input.LA(1) ) {
            case OBJECT_DEFINITION:
                {
                alt142=1;
                }
                break;
            case LBRACE:
            case LBRACKET:
            case SMALLER_OP:
            case UIDENTIFIER:
                {
                alt142=2;
                }
                break;
            case FUNCTION_MODIFIER:
            case VOID_MODIFIER:
                {
                alt142=3;
                }
                break;
            case VALUE_MODIFIER:
                {
                alt142=4;
                }
                break;
            case LIDENTIFIER:
                {
                alt142=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return declaration;}
                NoViableAltException nvae =
                    new NoViableAltException("", 142, 0, input);

                throw nvae;

            }

            switch (alt142) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1718:7: objectArgument
                    {
                    pushFollow(FOLLOW_objectArgument_in_namedArgumentDeclaration11325);
                    objectArgument280=objectArgument();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =objectArgument280; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1720:7: typedMethodOrGetterArgument
                    {
                    pushFollow(FOLLOW_typedMethodOrGetterArgument_in_namedArgumentDeclaration11341);
                    typedMethodOrGetterArgument281=typedMethodOrGetterArgument();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =typedMethodOrGetterArgument281; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1722:7: voidOrInferredMethodArgument
                    {
                    pushFollow(FOLLOW_voidOrInferredMethodArgument_in_namedArgumentDeclaration11357);
                    voidOrInferredMethodArgument282=voidOrInferredMethodArgument();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =voidOrInferredMethodArgument282; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1724:7: inferredGetterArgument
                    {
                    pushFollow(FOLLOW_inferredGetterArgument_in_namedArgumentDeclaration11373);
                    inferredGetterArgument283=inferredGetterArgument();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =inferredGetterArgument283; }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1726:7: untypedMethodOrGetterArgument
                    {
                    pushFollow(FOLLOW_untypedMethodOrGetterArgument_in_namedArgumentDeclaration11389);
                    untypedMethodOrGetterArgument284=untypedMethodOrGetterArgument();

                    state._fsp--;
                    if (state.failed) return declaration;

                    if ( state.backtracking==0 ) { declaration =untypedMethodOrGetterArgument284; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return declaration;
    }
    // $ANTLR end "namedArgumentDeclaration"



    // $ANTLR start "namedArgumentStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1733:1: namedArgumentStart : compilerAnnotations ( specificationStart | declarationStart ) ;
    public void namedArgumentStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1734:5: ( compilerAnnotations ( specificationStart | declarationStart ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1734:7: compilerAnnotations ( specificationStart | declarationStart )
            {
            pushFollow(FOLLOW_compilerAnnotations_in_namedArgumentStart11417);
            compilerAnnotations();

            state._fsp--;
            if (state.failed) return ;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1735:7: ( specificationStart | declarationStart )
            int alt143=2;
            int LA143_0 = input.LA(1);

            if ( (LA143_0==LIDENTIFIER) ) {
                alt143=1;
            }
            else if ( (LA143_0==ALIAS||LA143_0==ASSIGN||LA143_0==CLASS_DEFINITION||LA143_0==DYNAMIC||LA143_0==FUNCTION_MODIFIER||LA143_0==INTERFACE_DEFINITION||(LA143_0 >= LBRACE && LA143_0 <= LBRACKET)||LA143_0==OBJECT_DEFINITION||LA143_0==SMALLER_OP||LA143_0==UIDENTIFIER||LA143_0==VALUE_MODIFIER||LA143_0==VOID_MODIFIER) ) {
                alt143=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 143, 0, input);

                throw nvae;

            }
            switch (alt143) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1735:8: specificationStart
                    {
                    pushFollow(FOLLOW_specificationStart_in_namedArgumentStart11427);
                    specificationStart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1735:29: declarationStart
                    {
                    pushFollow(FOLLOW_declarationStart_in_namedArgumentStart11431);
                    declarationStart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "namedArgumentStart"



    // $ANTLR start "namedAnnotationArgumentsStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1738:1: namedAnnotationArgumentsStart : LBRACE ( ( namedArgumentStart )=> namedArgumentStart | iterableArgumentStart | RBRACE ) ;
    public void namedAnnotationArgumentsStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:5: ( LBRACE ( ( namedArgumentStart )=> namedArgumentStart | iterableArgumentStart | RBRACE ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:7: LBRACE ( ( namedArgumentStart )=> namedArgumentStart | iterableArgumentStart | RBRACE )
            {
            match(input,LBRACE,FOLLOW_LBRACE_in_namedAnnotationArgumentsStart11449); if (state.failed) return ;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:14: ( ( namedArgumentStart )=> namedArgumentStart | iterableArgumentStart | RBRACE )
            int alt144=3;
            int LA144_0 = input.LA(1);

            if ( (LA144_0==COMPILER_ANNOTATION) ) {
                int LA144_1 = input.LA(2);

                if ( (synpred12_Ceylon()) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA144_0==LIDENTIFIER) ) {
                int LA144_2 = input.LA(2);

                if ( (synpred12_Ceylon()) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA144_0==VALUE_MODIFIER) ) {
                int LA144_3 = input.LA(2);

                if ( (synpred12_Ceylon()) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA144_0==FUNCTION_MODIFIER) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==VOID_MODIFIER) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==ASSIGN) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==INTERFACE_DEFINITION) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==CLASS_DEFINITION) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==OBJECT_DEFINITION) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==ALIAS) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==UIDENTIFIER) ) {
                int LA144_11 = input.LA(2);

                if ( (synpred12_Ceylon()) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 11, input);

                    throw nvae;

                }
            }
            else if ( (LA144_0==LBRACKET) ) {
                int LA144_12 = input.LA(2);

                if ( (synpred12_Ceylon()) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 12, input);

                    throw nvae;

                }
            }
            else if ( (LA144_0==LBRACE) ) {
                int LA144_13 = input.LA(2);

                if ( (synpred12_Ceylon()) ) {
                    alt144=1;
                }
                else if ( (true) ) {
                    alt144=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return ;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 144, 13, input);

                    throw nvae;

                }
            }
            else if ( (LA144_0==SMALLER_OP) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==DYNAMIC) && (synpred12_Ceylon())) {
                alt144=1;
            }
            else if ( (LA144_0==BACKTICK||LA144_0==CHAR_LITERAL||(LA144_0 >= DECREMENT_OP && LA144_0 <= DIFFERENCE_OP)||LA144_0==FLOAT_LITERAL||LA144_0==INCREMENT_OP||LA144_0==LPAREN||LA144_0==NATURAL_LITERAL||LA144_0==NOT_OP||(LA144_0 >= OUTER && LA144_0 <= PACKAGE)||LA144_0==STRING_LITERAL||LA144_0==STRING_START||(LA144_0 >= SUM_OP && LA144_0 <= SUPER)||LA144_0==THIS||LA144_0==VERBATIM_STRING) ) {
                alt144=2;
            }
            else if ( (LA144_0==RBRACE) ) {
                alt144=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 144, 0, input);

                throw nvae;

            }
            switch (alt144) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:15: ( namedArgumentStart )=> namedArgumentStart
                    {
                    pushFollow(FOLLOW_namedArgumentStart_in_namedAnnotationArgumentsStart11456);
                    namedArgumentStart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:58: iterableArgumentStart
                    {
                    pushFollow(FOLLOW_iterableArgumentStart_in_namedAnnotationArgumentsStart11460);
                    iterableArgumentStart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:82: RBRACE
                    {
                    match(input,RBRACE,FOLLOW_RBRACE_in_namedAnnotationArgumentsStart11464); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "namedAnnotationArgumentsStart"



    // $ANTLR start "iterableArgumentStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1742:1: iterableArgumentStart : compilerAnnotations expression ( COMMA | SEMICOLON | RBRACE ) ;
    public void iterableArgumentStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1743:5: ( compilerAnnotations expression ( COMMA | SEMICOLON | RBRACE ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1743:7: compilerAnnotations expression ( COMMA | SEMICOLON | RBRACE )
            {
            pushFollow(FOLLOW_compilerAnnotations_in_iterableArgumentStart11482);
            compilerAnnotations();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_expression_in_iterableArgumentStart11484);
            expression();

            state._fsp--;
            if (state.failed) return ;

            if ( input.LA(1)==COMMA||input.LA(1)==RBRACE||input.LA(1)==SEMICOLON ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "iterableArgumentStart"



    // $ANTLR start "specificationStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1747:1: specificationStart : LIDENTIFIER ( parameters )* ( SPECIFY | COMPUTE ) ;
    public void specificationStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1748:5: ( LIDENTIFIER ( parameters )* ( SPECIFY | COMPUTE ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1748:7: LIDENTIFIER ( parameters )* ( SPECIFY | COMPUTE )
            {
            match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_specificationStart11510); if (state.failed) return ;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1748:19: ( parameters )*
            loop145:
            do {
                int alt145=2;
                int LA145_0 = input.LA(1);

                if ( (LA145_0==LPAREN) ) {
                    alt145=1;
                }


                switch (alt145) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1748:19: parameters
            	    {
            	    pushFollow(FOLLOW_parameters_in_specificationStart11512);
            	    parameters();

            	    state._fsp--;
            	    if (state.failed) return ;

            	    }
            	    break;

            	default :
            	    break loop145;
                }
            } while (true);


            if ( input.LA(1)==COMPUTE||input.LA(1)==SPECIFY ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "specificationStart"



    // $ANTLR start "parExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1751:1: parExpression returns [Expression expression] : LPAREN functionOrExpression RPAREN ;
    public Expression parExpression() throws RecognitionException {
        Expression expression = null;


        Token LPAREN285=null;
        Token RPAREN287=null;
        Expression functionOrExpression286 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1752:5: ( LPAREN functionOrExpression RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1752:7: LPAREN functionOrExpression RPAREN
            {
            LPAREN285=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_parExpression11541); if (state.failed) return expression;

            if ( state.backtracking==0 ) { expression = new Expression(LPAREN285); }

            pushFollow(FOLLOW_functionOrExpression_in_parExpression11558);
            functionOrExpression286=functionOrExpression();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) { if (functionOrExpression286!=null)
                        expression.setTerm(functionOrExpression286.getTerm()); }

            RPAREN287=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_parExpression11574); if (state.failed) return expression;

            if ( state.backtracking==0 ) { expression.setEndToken(RPAREN287); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "parExpression"



    // $ANTLR start "positionalArguments"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1761:1: positionalArguments returns [PositionalArgumentList positionalArgumentList] : LPAREN (sa= sequencedArgument )? RPAREN ;
    public PositionalArgumentList positionalArguments() throws RecognitionException {
        PositionalArgumentList positionalArgumentList = null;


        Token LPAREN288=null;
        Token RPAREN289=null;
        SequencedArgument sa =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1762:5: ( LPAREN (sa= sequencedArgument )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1762:7: LPAREN (sa= sequencedArgument )? RPAREN
            {
            LPAREN288=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_positionalArguments11611); if (state.failed) return positionalArgumentList;

            if ( state.backtracking==0 ) { positionalArgumentList = new PositionalArgumentList(LPAREN288); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1764:7: (sa= sequencedArgument )?
            int alt146=2;
            int LA146_0 = input.LA(1);

            if ( (LA146_0==BACKTICK||LA146_0==CHAR_LITERAL||LA146_0==COMPILER_ANNOTATION||(LA146_0 >= DECREMENT_OP && LA146_0 <= DIFFERENCE_OP)||(LA146_0 >= FLOAT_LITERAL && LA146_0 <= FUNCTION_MODIFIER)||LA146_0==INCREMENT_OP||(LA146_0 >= LBRACE && LA146_0 <= LIDENTIFIER)||LA146_0==LPAREN||LA146_0==NATURAL_LITERAL||LA146_0==NOT_OP||(LA146_0 >= OUTER && LA146_0 <= PACKAGE)||LA146_0==PRODUCT_OP||LA146_0==STRING_LITERAL||LA146_0==STRING_START||(LA146_0 >= SUM_OP && LA146_0 <= SUPER)||LA146_0==THIS||LA146_0==UIDENTIFIER||(LA146_0 >= VALUE_MODIFIER && LA146_0 <= VOID_MODIFIER)) ) {
                alt146=1;
            }
            switch (alt146) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1765:9: sa= sequencedArgument
                    {
                    pushFollow(FOLLOW_sequencedArgument_in_positionalArguments11640);
                    sa=sequencedArgument();

                    state._fsp--;
                    if (state.failed) return positionalArgumentList;

                    if ( state.backtracking==0 ) { if (sa!=null) {
                                  for (PositionalArgument pa: sa.getPositionalArguments())
                                      positionalArgumentList.addPositionalArgument(pa);
                                  //TODO: this is really nasty, PositionalArgumentList should have
                                  //      or be a SequencedArgument, not copy its PositionalArguments!
                                  positionalArgumentList.setEndToken(sa.getMainEndToken()); } }

                    }
                    break;

            }


            RPAREN289=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_positionalArguments11667); if (state.failed) return positionalArgumentList;

            if ( state.backtracking==0 ) { positionalArgumentList.setEndToken(RPAREN289); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return positionalArgumentList;
    }
    // $ANTLR end "positionalArguments"



    // $ANTLR start "positionalArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1777:1: positionalArgument returns [ListedArgument positionalArgument] : functionOrExpression ;
    public ListedArgument positionalArgument() throws RecognitionException {
        ListedArgument positionalArgument = null;


        Expression functionOrExpression290 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1778:5: ( functionOrExpression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1778:7: functionOrExpression
            {
            if ( state.backtracking==0 ) { positionalArgument = new ListedArgument(null); }

            pushFollow(FOLLOW_functionOrExpression_in_positionalArgument11704);
            functionOrExpression290=functionOrExpression();

            state._fsp--;
            if (state.failed) return positionalArgument;

            if ( state.backtracking==0 ) { positionalArgument.setExpression(functionOrExpression290); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return positionalArgument;
    }
    // $ANTLR end "positionalArgument"



    // $ANTLR start "spreadArgument"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1783:1: spreadArgument returns [SpreadArgument positionalArgument] : PRODUCT_OP unionExpression ;
    public SpreadArgument spreadArgument() throws RecognitionException {
        SpreadArgument positionalArgument = null;


        Token PRODUCT_OP291=null;
        Term unionExpression292 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1784:5: ( PRODUCT_OP unionExpression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1784:7: PRODUCT_OP unionExpression
            {
            PRODUCT_OP291=(Token)match(input,PRODUCT_OP,FOLLOW_PRODUCT_OP_in_spreadArgument11733); if (state.failed) return positionalArgument;

            if ( state.backtracking==0 ) { positionalArgument = new SpreadArgument(PRODUCT_OP291); }

            pushFollow(FOLLOW_unionExpression_in_spreadArgument11749);
            unionExpression292=unionExpression();

            state._fsp--;
            if (state.failed) return positionalArgument;

            if ( state.backtracking==0 ) { Expression e = new Expression(null);
                    e.setTerm(unionExpression292);
                    positionalArgument.setExpression(e); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return positionalArgument;
    }
    // $ANTLR end "spreadArgument"



    // $ANTLR start "anonParametersStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1792:1: anonParametersStart : LPAREN ( compilerAnnotations annotatedDeclarationStart | RPAREN ) ;
    public void anonParametersStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1793:5: ( LPAREN ( compilerAnnotations annotatedDeclarationStart | RPAREN ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1793:7: LPAREN ( compilerAnnotations annotatedDeclarationStart | RPAREN )
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_anonParametersStart11774); if (state.failed) return ;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1793:14: ( compilerAnnotations annotatedDeclarationStart | RPAREN )
            int alt147=2;
            int LA147_0 = input.LA(1);

            if ( (LA147_0==ALIAS||LA147_0==ASSIGN||LA147_0==CLASS_DEFINITION||LA147_0==COMPILER_ANNOTATION||LA147_0==DYNAMIC||LA147_0==FUNCTION_MODIFIER||LA147_0==INTERFACE_DEFINITION||(LA147_0 >= LBRACE && LA147_0 <= LIDENTIFIER)||LA147_0==OBJECT_DEFINITION||LA147_0==SMALLER_OP||LA147_0==STRING_LITERAL||LA147_0==UIDENTIFIER||(LA147_0 >= VALUE_MODIFIER && LA147_0 <= VOID_MODIFIER)) ) {
                alt147=1;
            }
            else if ( (LA147_0==RPAREN) ) {
                alt147=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                NoViableAltException nvae =
                    new NoViableAltException("", 147, 0, input);

                throw nvae;

            }
            switch (alt147) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1793:15: compilerAnnotations annotatedDeclarationStart
                    {
                    pushFollow(FOLLOW_compilerAnnotations_in_anonParametersStart11777);
                    compilerAnnotations();

                    state._fsp--;
                    if (state.failed) return ;

                    pushFollow(FOLLOW_annotatedDeclarationStart_in_anonParametersStart11779);
                    annotatedDeclarationStart();

                    state._fsp--;
                    if (state.failed) return ;

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1793:63: RPAREN
                    {
                    match(input,RPAREN,FOLLOW_RPAREN_in_anonParametersStart11783); if (state.failed) return ;

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "anonParametersStart"



    // $ANTLR start "nonemptyParametersStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1796:1: nonemptyParametersStart : LPAREN compilerAnnotations annotatedDeclarationStart ;
    public void nonemptyParametersStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1797:5: ( LPAREN compilerAnnotations annotatedDeclarationStart )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1797:7: LPAREN compilerAnnotations annotatedDeclarationStart
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_nonemptyParametersStart11801); if (state.failed) return ;

            pushFollow(FOLLOW_compilerAnnotations_in_nonemptyParametersStart11803);
            compilerAnnotations();

            state._fsp--;
            if (state.failed) return ;

            pushFollow(FOLLOW_annotatedDeclarationStart_in_nonemptyParametersStart11805);
            annotatedDeclarationStart();

            state._fsp--;
            if (state.failed) return ;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "nonemptyParametersStart"



    // $ANTLR start "functionOrExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1800:1: functionOrExpression returns [Expression expression] : ( ( FUNCTION_MODIFIER | VOID_MODIFIER | anonParametersStart )=>f= anonymousFunction |e= expression );
    public Expression functionOrExpression() throws RecognitionException {
        Expression expression = null;


        Expression f =null;

        Expression e =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1801:5: ( ( FUNCTION_MODIFIER | VOID_MODIFIER | anonParametersStart )=>f= anonymousFunction |e= expression )
            int alt148=2;
            int LA148_0 = input.LA(1);

            if ( (LA148_0==FUNCTION_MODIFIER) && (synpred13_Ceylon())) {
                alt148=1;
            }
            else if ( (LA148_0==VOID_MODIFIER) && (synpred13_Ceylon())) {
                alt148=1;
            }
            else if ( (LA148_0==LPAREN) ) {
                int LA148_3 = input.LA(2);

                if ( (synpred13_Ceylon()) ) {
                    alt148=1;
                }
                else if ( (true) ) {
                    alt148=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return expression;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 148, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA148_0==BACKTICK||LA148_0==CHAR_LITERAL||(LA148_0 >= DECREMENT_OP && LA148_0 <= DIFFERENCE_OP)||LA148_0==FLOAT_LITERAL||LA148_0==INCREMENT_OP||(LA148_0 >= LBRACE && LA148_0 <= LIDENTIFIER)||LA148_0==NATURAL_LITERAL||LA148_0==NOT_OP||(LA148_0 >= OUTER && LA148_0 <= PACKAGE)||LA148_0==STRING_LITERAL||LA148_0==STRING_START||(LA148_0 >= SUM_OP && LA148_0 <= SUPER)||LA148_0==THIS||LA148_0==UIDENTIFIER||(LA148_0 >= VALUE_MODIFIER && LA148_0 <= VERBATIM_STRING)) ) {
                alt148=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 148, 0, input);

                throw nvae;

            }
            switch (alt148) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1801:7: ( FUNCTION_MODIFIER | VOID_MODIFIER | anonParametersStart )=>f= anonymousFunction
                    {
                    pushFollow(FOLLOW_anonymousFunction_in_functionOrExpression11844);
                    f=anonymousFunction();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) { expression = f; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1804:7: e= expression
                    {
                    pushFollow(FOLLOW_expression_in_functionOrExpression11862);
                    e=expression();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) { expression = e; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "functionOrExpression"



    // $ANTLR start "anonymousFunction"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1808:1: anonymousFunction returns [Expression expression] : ( FUNCTION_MODIFIER | VOID_MODIFIER )? p1= parameters (p2= parameters )* ( COMPUTE fe= functionOrExpression | block ) ;
    public Expression anonymousFunction() throws RecognitionException {
        Expression expression = null;


        Token FUNCTION_MODIFIER293=null;
        Token VOID_MODIFIER294=null;
        ParameterList p1 =null;

        ParameterList p2 =null;

        Expression fe =null;

        Block block295 =null;


         FunctionArgument fa = new FunctionArgument(null);
                    fa.setType(new FunctionModifier(null)); 
                    Expression e = new Expression(null);
                    e.setTerm(fa); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1813:5: ( ( FUNCTION_MODIFIER | VOID_MODIFIER )? p1= parameters (p2= parameters )* ( COMPUTE fe= functionOrExpression | block ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1813:7: ( FUNCTION_MODIFIER | VOID_MODIFIER )? p1= parameters (p2= parameters )* ( COMPUTE fe= functionOrExpression | block )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1813:7: ( FUNCTION_MODIFIER | VOID_MODIFIER )?
            int alt149=3;
            int LA149_0 = input.LA(1);

            if ( (LA149_0==FUNCTION_MODIFIER) ) {
                alt149=1;
            }
            else if ( (LA149_0==VOID_MODIFIER) ) {
                alt149=2;
            }
            switch (alt149) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1814:9: FUNCTION_MODIFIER
                    {
                    FUNCTION_MODIFIER293=(Token)match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_anonymousFunction11910); if (state.failed) return expression;

                    if ( state.backtracking==0 ) { fa.setType(new FunctionModifier(FUNCTION_MODIFIER293)); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1817:9: VOID_MODIFIER
                    {
                    VOID_MODIFIER294=(Token)match(input,VOID_MODIFIER,FOLLOW_VOID_MODIFIER_in_anonymousFunction11938); if (state.failed) return expression;

                    if ( state.backtracking==0 ) { fa.setType(new VoidModifier(VOID_MODIFIER294)); }

                    }
                    break;

            }


            if ( state.backtracking==0 ) { expression =e; }

            pushFollow(FOLLOW_parameters_in_anonymousFunction11975);
            p1=parameters();

            state._fsp--;
            if (state.failed) return expression;

            if ( state.backtracking==0 ) { fa.addParameterList(p1); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1823:7: (p2= parameters )*
            loop150:
            do {
                int alt150=2;
                int LA150_0 = input.LA(1);

                if ( (LA150_0==LPAREN) ) {
                    alt150=1;
                }


                switch (alt150) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1825:9: p2= parameters
            	    {
            	    pushFollow(FOLLOW_parameters_in_anonymousFunction12013);
            	    p2=parameters();

            	    state._fsp--;
            	    if (state.failed) return expression;

            	    if ( state.backtracking==0 ) { fa.addParameterList(p2); }

            	    }
            	    break;

            	default :
            	    break loop150;
                }
            } while (true);


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1828:7: ( COMPUTE fe= functionOrExpression | block )
            int alt151=2;
            int LA151_0 = input.LA(1);

            if ( (LA151_0==COMPUTE) ) {
                alt151=1;
            }
            else if ( (LA151_0==LBRACE) ) {
                alt151=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return expression;}
                NoViableAltException nvae =
                    new NoViableAltException("", 151, 0, input);

                throw nvae;

            }
            switch (alt151) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1829:9: COMPUTE fe= functionOrExpression
                    {
                    match(input,COMPUTE,FOLLOW_COMPUTE_in_anonymousFunction12051); if (state.failed) return expression;

                    pushFollow(FOLLOW_functionOrExpression_in_anonymousFunction12063);
                    fe=functionOrExpression();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) { fa.setExpression(fe); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1833:9: block
                    {
                    pushFollow(FOLLOW_block_in_anonymousFunction12091);
                    block295=block();

                    state._fsp--;
                    if (state.failed) return expression;

                    if ( state.backtracking==0 ) { fa.setBlock(block295); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return expression;
    }
    // $ANTLR end "anonymousFunction"



    // $ANTLR start "comprehension"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1838:1: comprehension returns [Comprehension comprehension] : forComprehensionClause ;
    public Comprehension comprehension() throws RecognitionException {
        Comprehension comprehension = null;


        ForComprehensionClause forComprehensionClause296 =null;


         comprehension = new Comprehension(null); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1840:5: ( forComprehensionClause )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1840:7: forComprehensionClause
            {
            pushFollow(FOLLOW_forComprehensionClause_in_comprehension12139);
            forComprehensionClause296=forComprehensionClause();

            state._fsp--;
            if (state.failed) return comprehension;

            if ( state.backtracking==0 ) { comprehension.setForComprehensionClause(forComprehensionClause296); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return comprehension;
    }
    // $ANTLR end "comprehension"



    // $ANTLR start "comprehensionClause"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1844:1: comprehensionClause returns [ComprehensionClause comprehensionClause] : ( forComprehensionClause | ifComprehensionClause | expressionComprehensionClause );
    public ComprehensionClause comprehensionClause() throws RecognitionException {
        ComprehensionClause comprehensionClause = null;


        ForComprehensionClause forComprehensionClause297 =null;

        IfComprehensionClause ifComprehensionClause298 =null;

        ExpressionComprehensionClause expressionComprehensionClause299 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1845:5: ( forComprehensionClause | ifComprehensionClause | expressionComprehensionClause )
            int alt152=3;
            switch ( input.LA(1) ) {
            case FOR_CLAUSE:
                {
                alt152=1;
                }
                break;
            case IF_CLAUSE:
                {
                alt152=2;
                }
                break;
            case BACKTICK:
            case CHAR_LITERAL:
            case COMMA:
            case DECREMENT_OP:
            case DIFFERENCE_OP:
            case FLOAT_LITERAL:
            case FUNCTION_MODIFIER:
            case INCREMENT_OP:
            case LBRACE:
            case LBRACKET:
            case LIDENTIFIER:
            case LPAREN:
            case NATURAL_LITERAL:
            case NOT_OP:
            case OUTER:
            case PACKAGE:
            case RBRACE:
            case RBRACKET:
            case RPAREN:
            case STRING_LITERAL:
            case STRING_START:
            case SUM_OP:
            case SUPER:
            case THIS:
            case UIDENTIFIER:
            case VALUE_MODIFIER:
            case VERBATIM_STRING:
            case VOID_MODIFIER:
                {
                alt152=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return comprehensionClause;}
                NoViableAltException nvae =
                    new NoViableAltException("", 152, 0, input);

                throw nvae;

            }

            switch (alt152) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1845:7: forComprehensionClause
                    {
                    pushFollow(FOLLOW_forComprehensionClause_in_comprehensionClause12168);
                    forComprehensionClause297=forComprehensionClause();

                    state._fsp--;
                    if (state.failed) return comprehensionClause;

                    if ( state.backtracking==0 ) { comprehensionClause = forComprehensionClause297; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1847:7: ifComprehensionClause
                    {
                    pushFollow(FOLLOW_ifComprehensionClause_in_comprehensionClause12185);
                    ifComprehensionClause298=ifComprehensionClause();

                    state._fsp--;
                    if (state.failed) return comprehensionClause;

                    if ( state.backtracking==0 ) { comprehensionClause = ifComprehensionClause298; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1849:7: expressionComprehensionClause
                    {
                    pushFollow(FOLLOW_expressionComprehensionClause_in_comprehensionClause12202);
                    expressionComprehensionClause299=expressionComprehensionClause();

                    state._fsp--;
                    if (state.failed) return comprehensionClause;

                    if ( state.backtracking==0 ) { comprehensionClause = expressionComprehensionClause299; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return comprehensionClause;
    }
    // $ANTLR end "comprehensionClause"



    // $ANTLR start "expressionComprehensionClause"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1853:1: expressionComprehensionClause returns [ExpressionComprehensionClause comprehensionClause] : ( functionOrExpression |);
    public ExpressionComprehensionClause expressionComprehensionClause() throws RecognitionException {
        ExpressionComprehensionClause comprehensionClause = null;


        Expression functionOrExpression300 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1854:5: ( functionOrExpression |)
            int alt153=2;
            int LA153_0 = input.LA(1);

            if ( (LA153_0==BACKTICK||LA153_0==CHAR_LITERAL||(LA153_0 >= DECREMENT_OP && LA153_0 <= DIFFERENCE_OP)||LA153_0==FLOAT_LITERAL||LA153_0==FUNCTION_MODIFIER||LA153_0==INCREMENT_OP||(LA153_0 >= LBRACE && LA153_0 <= LIDENTIFIER)||LA153_0==LPAREN||LA153_0==NATURAL_LITERAL||LA153_0==NOT_OP||(LA153_0 >= OUTER && LA153_0 <= PACKAGE)||LA153_0==STRING_LITERAL||LA153_0==STRING_START||(LA153_0 >= SUM_OP && LA153_0 <= SUPER)||LA153_0==THIS||LA153_0==UIDENTIFIER||(LA153_0 >= VALUE_MODIFIER && LA153_0 <= VOID_MODIFIER)) ) {
                alt153=1;
            }
            else if ( (LA153_0==COMMA||(LA153_0 >= RBRACE && LA153_0 <= RBRACKET)||LA153_0==RPAREN) ) {
                alt153=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return comprehensionClause;}
                NoViableAltException nvae =
                    new NoViableAltException("", 153, 0, input);

                throw nvae;

            }
            switch (alt153) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1854:7: functionOrExpression
                    {
                    pushFollow(FOLLOW_functionOrExpression_in_expressionComprehensionClause12232);
                    functionOrExpression300=functionOrExpression();

                    state._fsp--;
                    if (state.failed) return comprehensionClause;

                    if ( state.backtracking==0 ) { comprehensionClause = new ExpressionComprehensionClause(null);
                            comprehensionClause.setExpression(functionOrExpression300); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1857:7: 
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                              new MismatchedTokenException(LIDENTIFIER, input)); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return comprehensionClause;
    }
    // $ANTLR end "expressionComprehensionClause"



    // $ANTLR start "forComprehensionClause"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1861:1: forComprehensionClause returns [ForComprehensionClause comprehensionClause] : FOR_CLAUSE forIterator comprehensionClause ;
    public ForComprehensionClause forComprehensionClause() throws RecognitionException {
        ForComprehensionClause comprehensionClause = null;


        Token FOR_CLAUSE301=null;
        ForIterator forIterator302 =null;

        ComprehensionClause comprehensionClause303 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1862:5: ( FOR_CLAUSE forIterator comprehensionClause )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1862:7: FOR_CLAUSE forIterator comprehensionClause
            {
            FOR_CLAUSE301=(Token)match(input,FOR_CLAUSE,FOLLOW_FOR_CLAUSE_in_forComprehensionClause12269); if (state.failed) return comprehensionClause;

            if ( state.backtracking==0 ) { comprehensionClause = new ForComprehensionClause(FOR_CLAUSE301); }

            pushFollow(FOLLOW_forIterator_in_forComprehensionClause12285);
            forIterator302=forIterator();

            state._fsp--;
            if (state.failed) return comprehensionClause;

            if ( state.backtracking==0 ) { comprehensionClause.setForIterator(forIterator302); }

            pushFollow(FOLLOW_comprehensionClause_in_forComprehensionClause12301);
            comprehensionClause303=comprehensionClause();

            state._fsp--;
            if (state.failed) return comprehensionClause;

            if ( state.backtracking==0 ) { comprehensionClause.setComprehensionClause(comprehensionClause303); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return comprehensionClause;
    }
    // $ANTLR end "forComprehensionClause"



    // $ANTLR start "ifComprehensionClause"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1870:1: ifComprehensionClause returns [IfComprehensionClause comprehensionClause] : IF_CLAUSE conditions comprehensionClause ;
    public IfComprehensionClause ifComprehensionClause() throws RecognitionException {
        IfComprehensionClause comprehensionClause = null;


        Token IF_CLAUSE304=null;
        ConditionList conditions305 =null;

        ComprehensionClause comprehensionClause306 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1871:5: ( IF_CLAUSE conditions comprehensionClause )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1871:7: IF_CLAUSE conditions comprehensionClause
            {
            IF_CLAUSE304=(Token)match(input,IF_CLAUSE,FOLLOW_IF_CLAUSE_in_ifComprehensionClause12334); if (state.failed) return comprehensionClause;

            if ( state.backtracking==0 ) { comprehensionClause = new IfComprehensionClause(IF_CLAUSE304); }

            pushFollow(FOLLOW_conditions_in_ifComprehensionClause12350);
            conditions305=conditions();

            state._fsp--;
            if (state.failed) return comprehensionClause;

            if ( state.backtracking==0 ) { comprehensionClause.setConditionList(conditions305); }

            pushFollow(FOLLOW_comprehensionClause_in_ifComprehensionClause12366);
            comprehensionClause306=comprehensionClause();

            state._fsp--;
            if (state.failed) return comprehensionClause;

            if ( state.backtracking==0 ) { comprehensionClause.setComprehensionClause(comprehensionClause306); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return comprehensionClause;
    }
    // $ANTLR end "ifComprehensionClause"



    // $ANTLR start "assignmentExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1879:1: assignmentExpression returns [Term term] : ee1= thenElseExpression ( assignmentOperator ee2= functionOrExpression | memberReference ( positionalArgument )? )? ;
    public Term assignmentExpression() throws RecognitionException {
        Term term = null;


        Term ee1 =null;

        Expression ee2 =null;

        AssignmentOp assignmentOperator307 =null;

        CeylonParser.memberReference_return memberReference308 =null;

        ListedArgument positionalArgument309 =null;


         QualifiedMemberOrTypeExpression qe=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1881:5: (ee1= thenElseExpression ( assignmentOperator ee2= functionOrExpression | memberReference ( positionalArgument )? )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1881:7: ee1= thenElseExpression ( assignmentOperator ee2= functionOrExpression | memberReference ( positionalArgument )? )?
            {
            pushFollow(FOLLOW_thenElseExpression_in_assignmentExpression12410);
            ee1=thenElseExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = ee1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1883:7: ( assignmentOperator ee2= functionOrExpression | memberReference ( positionalArgument )? )?
            int alt155=3;
            int LA155_0 = input.LA(1);

            if ( (LA155_0==ADD_SPECIFY||LA155_0==AND_SPECIFY||LA155_0==COMPLEMENT_SPECIFY||LA155_0==DIVIDE_SPECIFY||LA155_0==INTERSECT_SPECIFY||LA155_0==MULTIPLY_SPECIFY||LA155_0==OR_SPECIFY||LA155_0==REMAINDER_SPECIFY||LA155_0==SPECIFY||LA155_0==SUBTRACT_SPECIFY||LA155_0==UNION_SPECIFY) ) {
                alt155=1;
            }
            else if ( (LA155_0==LIDENTIFIER) ) {
                alt155=2;
            }
            switch (alt155) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1884:9: assignmentOperator ee2= functionOrExpression
                    {
                    pushFollow(FOLLOW_assignmentOperator_in_assignmentExpression12436);
                    assignmentOperator307=assignmentOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { assignmentOperator307.setLeftTerm(term);
                              term = assignmentOperator307; }

                    pushFollow(FOLLOW_functionOrExpression_in_assignmentExpression12459);
                    ee2=functionOrExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { if (ee2!=null)
                                  assignmentOperator307.setRightTerm(ee2.getTerm()); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1890:9: memberReference ( positionalArgument )?
                    {
                    pushFollow(FOLLOW_memberReference_in_assignmentExpression12479);
                    memberReference308=memberReference();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { qe = new QualifiedMemberExpression(null);
                              Expression e = new Expression(null);
                              e.setTerm(term);
                              qe.setPrimary(e);
                              qe.setMemberOperator(new MemberOp(null));
                              qe.setIdentifier((memberReference308!=null?memberReference308.identifier:null));
                              qe.setTypeArguments( new InferredTypeArguments(null) );
                              if ((memberReference308!=null?memberReference308.typeArgumentList:null)!=null)
                                  qe.setTypeArguments((memberReference308!=null?memberReference308.typeArgumentList:null)); 
                              term = qe; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1901:9: ( positionalArgument )?
                    int alt154=2;
                    int LA154_0 = input.LA(1);

                    if ( (LA154_0==BACKTICK||LA154_0==CHAR_LITERAL||(LA154_0 >= DECREMENT_OP && LA154_0 <= DIFFERENCE_OP)||LA154_0==FLOAT_LITERAL||LA154_0==FUNCTION_MODIFIER||LA154_0==INCREMENT_OP||(LA154_0 >= LBRACE && LA154_0 <= LIDENTIFIER)||LA154_0==LPAREN||LA154_0==NATURAL_LITERAL||LA154_0==NOT_OP||(LA154_0 >= OUTER && LA154_0 <= PACKAGE)||LA154_0==STRING_LITERAL||LA154_0==STRING_START||(LA154_0 >= SUM_OP && LA154_0 <= SUPER)||LA154_0==THIS||LA154_0==UIDENTIFIER||(LA154_0 >= VALUE_MODIFIER && LA154_0 <= VOID_MODIFIER)) ) {
                        alt154=1;
                    }
                    switch (alt154) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1902:9: positionalArgument
                            {
                            pushFollow(FOLLOW_positionalArgument_in_assignmentExpression12509);
                            positionalArgument309=positionalArgument();

                            state._fsp--;
                            if (state.failed) return term;

                            if ( state.backtracking==0 ) { InvocationExpression ie = new InvocationExpression(null);
                                      ie.setPrimary(qe);
                                      PositionalArgumentList al = new PositionalArgumentList(null);
                                      al.addPositionalArgument(positionalArgument309); 
                                      ie.setPositionalArgumentList(al);
                                      term = ie; }

                            }
                            break;

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "assignmentExpression"



    // $ANTLR start "assignmentOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1913:1: assignmentOperator returns [AssignmentOp operator] : ( SPECIFY | ADD_SPECIFY | SUBTRACT_SPECIFY | MULTIPLY_SPECIFY | DIVIDE_SPECIFY | REMAINDER_SPECIFY | INTERSECT_SPECIFY | UNION_SPECIFY | COMPLEMENT_SPECIFY | AND_SPECIFY | OR_SPECIFY );
    public AssignmentOp assignmentOperator() throws RecognitionException {
        AssignmentOp operator = null;


        Token SPECIFY310=null;
        Token ADD_SPECIFY311=null;
        Token SUBTRACT_SPECIFY312=null;
        Token MULTIPLY_SPECIFY313=null;
        Token DIVIDE_SPECIFY314=null;
        Token REMAINDER_SPECIFY315=null;
        Token INTERSECT_SPECIFY316=null;
        Token UNION_SPECIFY317=null;
        Token COMPLEMENT_SPECIFY318=null;
        Token AND_SPECIFY319=null;
        Token OR_SPECIFY320=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1914:5: ( SPECIFY | ADD_SPECIFY | SUBTRACT_SPECIFY | MULTIPLY_SPECIFY | DIVIDE_SPECIFY | REMAINDER_SPECIFY | INTERSECT_SPECIFY | UNION_SPECIFY | COMPLEMENT_SPECIFY | AND_SPECIFY | OR_SPECIFY )
            int alt156=11;
            switch ( input.LA(1) ) {
            case SPECIFY:
                {
                alt156=1;
                }
                break;
            case ADD_SPECIFY:
                {
                alt156=2;
                }
                break;
            case SUBTRACT_SPECIFY:
                {
                alt156=3;
                }
                break;
            case MULTIPLY_SPECIFY:
                {
                alt156=4;
                }
                break;
            case DIVIDE_SPECIFY:
                {
                alt156=5;
                }
                break;
            case REMAINDER_SPECIFY:
                {
                alt156=6;
                }
                break;
            case INTERSECT_SPECIFY:
                {
                alt156=7;
                }
                break;
            case UNION_SPECIFY:
                {
                alt156=8;
                }
                break;
            case COMPLEMENT_SPECIFY:
                {
                alt156=9;
                }
                break;
            case AND_SPECIFY:
                {
                alt156=10;
                }
                break;
            case OR_SPECIFY:
                {
                alt156=11;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 156, 0, input);

                throw nvae;

            }

            switch (alt156) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1914:7: SPECIFY
                    {
                    SPECIFY310=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_assignmentOperator12560); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new AssignOp(SPECIFY310); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1916:7: ADD_SPECIFY
                    {
                    ADD_SPECIFY311=(Token)match(input,ADD_SPECIFY,FOLLOW_ADD_SPECIFY_in_assignmentOperator12575); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new AddAssignOp(ADD_SPECIFY311); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1917:7: SUBTRACT_SPECIFY
                    {
                    SUBTRACT_SPECIFY312=(Token)match(input,SUBTRACT_SPECIFY,FOLLOW_SUBTRACT_SPECIFY_in_assignmentOperator12585); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new SubtractAssignOp(SUBTRACT_SPECIFY312); }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1918:7: MULTIPLY_SPECIFY
                    {
                    MULTIPLY_SPECIFY313=(Token)match(input,MULTIPLY_SPECIFY,FOLLOW_MULTIPLY_SPECIFY_in_assignmentOperator12595); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new MultiplyAssignOp(MULTIPLY_SPECIFY313); }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1919:7: DIVIDE_SPECIFY
                    {
                    DIVIDE_SPECIFY314=(Token)match(input,DIVIDE_SPECIFY,FOLLOW_DIVIDE_SPECIFY_in_assignmentOperator12605); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new DivideAssignOp(DIVIDE_SPECIFY314); }

                    }
                    break;
                case 6 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1920:7: REMAINDER_SPECIFY
                    {
                    REMAINDER_SPECIFY315=(Token)match(input,REMAINDER_SPECIFY,FOLLOW_REMAINDER_SPECIFY_in_assignmentOperator12615); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new RemainderAssignOp(REMAINDER_SPECIFY315); }

                    }
                    break;
                case 7 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1921:7: INTERSECT_SPECIFY
                    {
                    INTERSECT_SPECIFY316=(Token)match(input,INTERSECT_SPECIFY,FOLLOW_INTERSECT_SPECIFY_in_assignmentOperator12625); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new IntersectAssignOp(INTERSECT_SPECIFY316); }

                    }
                    break;
                case 8 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1922:7: UNION_SPECIFY
                    {
                    UNION_SPECIFY317=(Token)match(input,UNION_SPECIFY,FOLLOW_UNION_SPECIFY_in_assignmentOperator12635); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new UnionAssignOp(UNION_SPECIFY317); }

                    }
                    break;
                case 9 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1923:7: COMPLEMENT_SPECIFY
                    {
                    COMPLEMENT_SPECIFY318=(Token)match(input,COMPLEMENT_SPECIFY,FOLLOW_COMPLEMENT_SPECIFY_in_assignmentOperator12645); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new ComplementAssignOp(COMPLEMENT_SPECIFY318); }

                    }
                    break;
                case 10 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1924:7: AND_SPECIFY
                    {
                    AND_SPECIFY319=(Token)match(input,AND_SPECIFY,FOLLOW_AND_SPECIFY_in_assignmentOperator12655); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new AndAssignOp(AND_SPECIFY319); }

                    }
                    break;
                case 11 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1925:7: OR_SPECIFY
                    {
                    OR_SPECIFY320=(Token)match(input,OR_SPECIFY,FOLLOW_OR_SPECIFY_in_assignmentOperator12665); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new OrAssignOp(OR_SPECIFY320); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "assignmentOperator"



    // $ANTLR start "thenElseExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1929:1: thenElseExpression returns [Term term] : de1= disjunctionExpression ( thenElseOperator de2= disjunctionExpression )* ;
    public Term thenElseExpression() throws RecognitionException {
        Term term = null;


        Term de1 =null;

        Term de2 =null;

        BinaryOperatorExpression thenElseOperator321 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1930:5: (de1= disjunctionExpression ( thenElseOperator de2= disjunctionExpression )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1930:7: de1= disjunctionExpression ( thenElseOperator de2= disjunctionExpression )*
            {
            pushFollow(FOLLOW_disjunctionExpression_in_thenElseExpression12695);
            de1=disjunctionExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = de1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1932:7: ( thenElseOperator de2= disjunctionExpression )*
            loop157:
            do {
                int alt157=2;
                int LA157_0 = input.LA(1);

                if ( (LA157_0==ELSE_CLAUSE||LA157_0==THEN_CLAUSE) ) {
                    alt157=1;
                }


                switch (alt157) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1933:9: thenElseOperator de2= disjunctionExpression
            	    {
            	    pushFollow(FOLLOW_thenElseOperator_in_thenElseExpression12721);
            	    thenElseOperator321=thenElseOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { thenElseOperator321.setLeftTerm(term);
            	              term = thenElseOperator321; }

            	    pushFollow(FOLLOW_disjunctionExpression_in_thenElseExpression12743);
            	    de2=disjunctionExpression();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { thenElseOperator321.setRightTerm(de2); }

            	    }
            	    break;

            	default :
            	    break loop157;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "thenElseExpression"



    // $ANTLR start "thenElseOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1954:1: thenElseOperator returns [BinaryOperatorExpression operator] : ( ELSE_CLAUSE | THEN_CLAUSE );
    public BinaryOperatorExpression thenElseOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token ELSE_CLAUSE322=null;
        Token THEN_CLAUSE323=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1955:5: ( ELSE_CLAUSE | THEN_CLAUSE )
            int alt158=2;
            int LA158_0 = input.LA(1);

            if ( (LA158_0==ELSE_CLAUSE) ) {
                alt158=1;
            }
            else if ( (LA158_0==THEN_CLAUSE) ) {
                alt158=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 158, 0, input);

                throw nvae;

            }
            switch (alt158) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1955:7: ELSE_CLAUSE
                    {
                    ELSE_CLAUSE322=(Token)match(input,ELSE_CLAUSE,FOLLOW_ELSE_CLAUSE_in_thenElseOperator12814); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new DefaultOp(ELSE_CLAUSE322); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1957:7: THEN_CLAUSE
                    {
                    THEN_CLAUSE323=(Token)match(input,THEN_CLAUSE,FOLLOW_THEN_CLAUSE_in_thenElseOperator12831); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new ThenOp(THEN_CLAUSE323); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "thenElseOperator"



    // $ANTLR start "disjunctionExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1961:1: disjunctionExpression returns [Term term] : me1= conjunctionExpression ( disjunctionOperator me2= conjunctionExpression )* ;
    public Term disjunctionExpression() throws RecognitionException {
        Term term = null;


        Term me1 =null;

        Term me2 =null;

        OrOp disjunctionOperator324 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1962:5: (me1= conjunctionExpression ( disjunctionOperator me2= conjunctionExpression )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1962:7: me1= conjunctionExpression ( disjunctionOperator me2= conjunctionExpression )*
            {
            pushFollow(FOLLOW_conjunctionExpression_in_disjunctionExpression12862);
            me1=conjunctionExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = me1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1964:7: ( disjunctionOperator me2= conjunctionExpression )*
            loop159:
            do {
                int alt159=2;
                int LA159_0 = input.LA(1);

                if ( (LA159_0==OR_OP) ) {
                    alt159=1;
                }


                switch (alt159) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1965:9: disjunctionOperator me2= conjunctionExpression
            	    {
            	    pushFollow(FOLLOW_disjunctionOperator_in_disjunctionExpression12888);
            	    disjunctionOperator324=disjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { disjunctionOperator324.setLeftTerm(term);
            	              term = disjunctionOperator324; }

            	    pushFollow(FOLLOW_conjunctionExpression_in_disjunctionExpression12911);
            	    me2=conjunctionExpression();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { disjunctionOperator324.setRightTerm(me2); }

            	    }
            	    break;

            	default :
            	    break loop159;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "disjunctionExpression"



    // $ANTLR start "disjunctionOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1973:1: disjunctionOperator returns [OrOp operator] : OR_OP ;
    public OrOp disjunctionOperator() throws RecognitionException {
        OrOp operator = null;


        Token OR_OP325=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1974:5: ( OR_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1974:7: OR_OP
            {
            OR_OP325=(Token)match(input,OR_OP,FOLLOW_OR_OP_in_disjunctionOperator12951); if (state.failed) return operator;

            if ( state.backtracking==0 ) { operator = new OrOp(OR_OP325); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "disjunctionOperator"



    // $ANTLR start "conjunctionExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1978:1: conjunctionExpression returns [Term term] : me1= logicalNegationExpression ( conjunctionOperator me2= logicalNegationExpression )* ;
    public Term conjunctionExpression() throws RecognitionException {
        Term term = null;


        Term me1 =null;

        Term me2 =null;

        AndOp conjunctionOperator326 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1979:5: (me1= logicalNegationExpression ( conjunctionOperator me2= logicalNegationExpression )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1979:7: me1= logicalNegationExpression ( conjunctionOperator me2= logicalNegationExpression )*
            {
            pushFollow(FOLLOW_logicalNegationExpression_in_conjunctionExpression12983);
            me1=logicalNegationExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = me1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1981:7: ( conjunctionOperator me2= logicalNegationExpression )*
            loop160:
            do {
                int alt160=2;
                int LA160_0 = input.LA(1);

                if ( (LA160_0==AND_OP) ) {
                    alt160=1;
                }


                switch (alt160) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1982:9: conjunctionOperator me2= logicalNegationExpression
            	    {
            	    pushFollow(FOLLOW_conjunctionOperator_in_conjunctionExpression13009);
            	    conjunctionOperator326=conjunctionOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { conjunctionOperator326.setLeftTerm(term);
            	              term = conjunctionOperator326; }

            	    pushFollow(FOLLOW_logicalNegationExpression_in_conjunctionExpression13032);
            	    me2=logicalNegationExpression();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { conjunctionOperator326.setRightTerm(me2); }

            	    }
            	    break;

            	default :
            	    break loop160;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "conjunctionExpression"



    // $ANTLR start "conjunctionOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1990:1: conjunctionOperator returns [AndOp operator] : AND_OP ;
    public AndOp conjunctionOperator() throws RecognitionException {
        AndOp operator = null;


        Token AND_OP327=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1991:5: ( AND_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1991:7: AND_OP
            {
            AND_OP327=(Token)match(input,AND_OP,FOLLOW_AND_OP_in_conjunctionOperator13072); if (state.failed) return operator;

            if ( state.backtracking==0 ) { operator = new AndOp(AND_OP327); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "conjunctionOperator"



    // $ANTLR start "logicalNegationExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1995:1: logicalNegationExpression returns [Term term] : ( notOperator le= logicalNegationExpression | equalityExpression );
    public Term logicalNegationExpression() throws RecognitionException {
        Term term = null;


        Term le =null;

        NotOp notOperator328 =null;

        Term equalityExpression329 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1996:5: ( notOperator le= logicalNegationExpression | equalityExpression )
            int alt161=2;
            int LA161_0 = input.LA(1);

            if ( (LA161_0==NOT_OP) ) {
                alt161=1;
            }
            else if ( (LA161_0==BACKTICK||LA161_0==CHAR_LITERAL||(LA161_0 >= DECREMENT_OP && LA161_0 <= DIFFERENCE_OP)||LA161_0==FLOAT_LITERAL||LA161_0==INCREMENT_OP||(LA161_0 >= LBRACE && LA161_0 <= LIDENTIFIER)||LA161_0==LPAREN||LA161_0==NATURAL_LITERAL||(LA161_0 >= OUTER && LA161_0 <= PACKAGE)||LA161_0==STRING_LITERAL||LA161_0==STRING_START||(LA161_0 >= SUM_OP && LA161_0 <= SUPER)||LA161_0==THIS||LA161_0==UIDENTIFIER||(LA161_0 >= VALUE_MODIFIER && LA161_0 <= VERBATIM_STRING)) ) {
                alt161=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return term;}
                NoViableAltException nvae =
                    new NoViableAltException("", 161, 0, input);

                throw nvae;

            }
            switch (alt161) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1996:7: notOperator le= logicalNegationExpression
                    {
                    pushFollow(FOLLOW_notOperator_in_logicalNegationExpression13102);
                    notOperator328=notOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { term = notOperator328; }

                    pushFollow(FOLLOW_logicalNegationExpression_in_logicalNegationExpression13121);
                    le=logicalNegationExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { notOperator328.setTerm(le); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2000:7: equalityExpression
                    {
                    pushFollow(FOLLOW_equalityExpression_in_logicalNegationExpression13137);
                    equalityExpression329=equalityExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { term = equalityExpression329; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "logicalNegationExpression"



    // $ANTLR start "notOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2004:1: notOperator returns [NotOp operator] : NOT_OP ;
    public NotOp notOperator() throws RecognitionException {
        NotOp operator = null;


        Token NOT_OP330=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2005:5: ( NOT_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2005:7: NOT_OP
            {
            NOT_OP330=(Token)match(input,NOT_OP,FOLLOW_NOT_OP_in_notOperator13166); if (state.failed) return operator;

            if ( state.backtracking==0 ) { operator = new NotOp(NOT_OP330); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "notOperator"



    // $ANTLR start "equalityExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2009:1: equalityExpression returns [Term term] : ee1= comparisonExpression ( equalityOperator ee2= comparisonExpression )? ;
    public Term equalityExpression() throws RecognitionException {
        Term term = null;


        Term ee1 =null;

        Term ee2 =null;

        BinaryOperatorExpression equalityOperator331 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2010:5: (ee1= comparisonExpression ( equalityOperator ee2= comparisonExpression )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2010:7: ee1= comparisonExpression ( equalityOperator ee2= comparisonExpression )?
            {
            pushFollow(FOLLOW_comparisonExpression_in_equalityExpression13198);
            ee1=comparisonExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = ee1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2012:7: ( equalityOperator ee2= comparisonExpression )?
            int alt162=2;
            int LA162_0 = input.LA(1);

            if ( (LA162_0==EQUAL_OP||LA162_0==IDENTICAL_OP||LA162_0==NOT_EQUAL_OP) ) {
                alt162=1;
            }
            switch (alt162) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2013:9: equalityOperator ee2= comparisonExpression
                    {
                    pushFollow(FOLLOW_equalityOperator_in_equalityExpression13224);
                    equalityOperator331=equalityOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { equalityOperator331.setLeftTerm(term);
                              term = equalityOperator331; }

                    pushFollow(FOLLOW_comparisonExpression_in_equalityExpression13247);
                    ee2=comparisonExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { equalityOperator331.setRightTerm(ee2); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "equalityExpression"



    // $ANTLR start "equalityOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2021:1: equalityOperator returns [BinaryOperatorExpression operator] : ( EQUAL_OP | NOT_EQUAL_OP | IDENTICAL_OP );
    public BinaryOperatorExpression equalityOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token EQUAL_OP332=null;
        Token NOT_EQUAL_OP333=null;
        Token IDENTICAL_OP334=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2022:5: ( EQUAL_OP | NOT_EQUAL_OP | IDENTICAL_OP )
            int alt163=3;
            switch ( input.LA(1) ) {
            case EQUAL_OP:
                {
                alt163=1;
                }
                break;
            case NOT_EQUAL_OP:
                {
                alt163=2;
                }
                break;
            case IDENTICAL_OP:
                {
                alt163=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 163, 0, input);

                throw nvae;

            }

            switch (alt163) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2022:7: EQUAL_OP
                    {
                    EQUAL_OP332=(Token)match(input,EQUAL_OP,FOLLOW_EQUAL_OP_in_equalityOperator13287); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new EqualOp(EQUAL_OP332); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2024:7: NOT_EQUAL_OP
                    {
                    NOT_EQUAL_OP333=(Token)match(input,NOT_EQUAL_OP,FOLLOW_NOT_EQUAL_OP_in_equalityOperator13304); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new NotEqualOp(NOT_EQUAL_OP333); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2026:7: IDENTICAL_OP
                    {
                    IDENTICAL_OP334=(Token)match(input,IDENTICAL_OP,FOLLOW_IDENTICAL_OP_in_equalityOperator13320); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new IdenticalOp(IDENTICAL_OP334); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "equalityOperator"



    // $ANTLR start "comparisonExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2030:1: comparisonExpression returns [Term term] : ee1= existenceEmptinessExpression (co1= comparisonOperator ee2= existenceEmptinessExpression |lo1= largerOperator ee3= existenceEmptinessExpression |so1= smallerOperator ee4= existenceEmptinessExpression (so2= smallerOperator ee5= existenceEmptinessExpression )? |to1= typeOperator t1= type )? ;
    public Term comparisonExpression() throws RecognitionException {
        Term term = null;


        Term ee1 =null;

        BinaryOperatorExpression co1 =null;

        Term ee2 =null;

        ComparisonOp lo1 =null;

        Term ee3 =null;

        ComparisonOp so1 =null;

        Term ee4 =null;

        ComparisonOp so2 =null;

        Term ee5 =null;

        TypeOperatorExpression to1 =null;

        StaticType t1 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2031:5: (ee1= existenceEmptinessExpression (co1= comparisonOperator ee2= existenceEmptinessExpression |lo1= largerOperator ee3= existenceEmptinessExpression |so1= smallerOperator ee4= existenceEmptinessExpression (so2= smallerOperator ee5= existenceEmptinessExpression )? |to1= typeOperator t1= type )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2031:7: ee1= existenceEmptinessExpression (co1= comparisonOperator ee2= existenceEmptinessExpression |lo1= largerOperator ee3= existenceEmptinessExpression |so1= smallerOperator ee4= existenceEmptinessExpression (so2= smallerOperator ee5= existenceEmptinessExpression )? |to1= typeOperator t1= type )?
            {
            pushFollow(FOLLOW_existenceEmptinessExpression_in_comparisonExpression13351);
            ee1=existenceEmptinessExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = ee1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2033:7: (co1= comparisonOperator ee2= existenceEmptinessExpression |lo1= largerOperator ee3= existenceEmptinessExpression |so1= smallerOperator ee4= existenceEmptinessExpression (so2= smallerOperator ee5= existenceEmptinessExpression )? |to1= typeOperator t1= type )?
            int alt165=5;
            switch ( input.LA(1) ) {
                case COMPARE_OP:
                case IN_OP:
                    {
                    alt165=1;
                    }
                    break;
                case LARGER_OP:
                case LARGE_AS_OP:
                    {
                    alt165=2;
                    }
                    break;
                case SMALLER_OP:
                case SMALL_AS_OP:
                    {
                    alt165=3;
                    }
                    break;
                case CASE_TYPES:
                case EXTENDS:
                case IS_OP:
                case SATISFIES:
                    {
                    alt165=4;
                    }
                    break;
            }

            switch (alt165) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2034:9: co1= comparisonOperator ee2= existenceEmptinessExpression
                    {
                    pushFollow(FOLLOW_comparisonOperator_in_comparisonExpression13379);
                    co1=comparisonOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { co1.setLeftTerm(term);
                              term = co1; }

                    pushFollow(FOLLOW_existenceEmptinessExpression_in_comparisonExpression13402);
                    ee2=existenceEmptinessExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { co1.setRightTerm(ee2); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2039:9: lo1= largerOperator ee3= existenceEmptinessExpression
                    {
                    pushFollow(FOLLOW_largerOperator_in_comparisonExpression13424);
                    lo1=largerOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { lo1.setLeftTerm(term);
                              term = lo1; }

                    pushFollow(FOLLOW_existenceEmptinessExpression_in_comparisonExpression13447);
                    ee3=existenceEmptinessExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { lo1.setRightTerm(ee3); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2044:9: so1= smallerOperator ee4= existenceEmptinessExpression (so2= smallerOperator ee5= existenceEmptinessExpression )?
                    {
                    pushFollow(FOLLOW_smallerOperator_in_comparisonExpression13469);
                    so1=smallerOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { so1.setLeftTerm(term);
                              term = so1; }

                    pushFollow(FOLLOW_existenceEmptinessExpression_in_comparisonExpression13492);
                    ee4=existenceEmptinessExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { so1.setRightTerm(ee4); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2049:9: (so2= smallerOperator ee5= existenceEmptinessExpression )?
                    int alt164=2;
                    int LA164_0 = input.LA(1);

                    if ( ((LA164_0 >= SMALLER_OP && LA164_0 <= SMALL_AS_OP)) ) {
                        alt164=1;
                    }
                    switch (alt164) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2050:11: so2= smallerOperator ee5= existenceEmptinessExpression
                            {
                            pushFollow(FOLLOW_smallerOperator_in_comparisonExpression13527);
                            so2=smallerOperator();

                            state._fsp--;
                            if (state.failed) return term;

                            pushFollow(FOLLOW_existenceEmptinessExpression_in_comparisonExpression13541);
                            ee5=existenceEmptinessExpression();

                            state._fsp--;
                            if (state.failed) return term;

                            if ( state.backtracking==0 ) { WithinOp w = new WithinOp(null); 
                                        Bound lb = so1 instanceof SmallerOp ?
                                            new OpenBound(null) : new ClosedBound(null);
                                        lb.setTerm(ee1);
                                        Bound ub = so2 instanceof SmallerOp ?
                                            new OpenBound(null) : new ClosedBound(null);
                                        ub.setTerm(ee5);
                                        w.setLowerBound(lb);
                                        w.setUpperBound(ub);
                                        w.setTerm(ee4);
                                        term = w; }

                            }
                            break;

                    }


                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2064:9: to1= typeOperator t1= type
                    {
                    pushFollow(FOLLOW_typeOperator_in_comparisonExpression13576);
                    to1=typeOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { to1.setTerm(ee1); 
                              term = to1; }

                    pushFollow(FOLLOW_type_in_comparisonExpression13598);
                    t1=type();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { to1.setType(t1); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "comparisonExpression"



    // $ANTLR start "smallerOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2078:1: smallerOperator returns [ComparisonOp operator] : ( SMALL_AS_OP | SMALLER_OP );
    public ComparisonOp smallerOperator() throws RecognitionException {
        ComparisonOp operator = null;


        Token SMALL_AS_OP335=null;
        Token SMALLER_OP336=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2079:5: ( SMALL_AS_OP | SMALLER_OP )
            int alt166=2;
            int LA166_0 = input.LA(1);

            if ( (LA166_0==SMALL_AS_OP) ) {
                alt166=1;
            }
            else if ( (LA166_0==SMALLER_OP) ) {
                alt166=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 166, 0, input);

                throw nvae;

            }
            switch (alt166) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2079:7: SMALL_AS_OP
                    {
                    SMALL_AS_OP335=(Token)match(input,SMALL_AS_OP,FOLLOW_SMALL_AS_OP_in_smallerOperator13644); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new SmallAsOp(SMALL_AS_OP335); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2081:7: SMALLER_OP
                    {
                    SMALLER_OP336=(Token)match(input,SMALLER_OP,FOLLOW_SMALLER_OP_in_smallerOperator13660); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new SmallerOp(SMALLER_OP336); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "smallerOperator"



    // $ANTLR start "largerOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2085:1: largerOperator returns [ComparisonOp operator] : ( LARGE_AS_OP | LARGER_OP );
    public ComparisonOp largerOperator() throws RecognitionException {
        ComparisonOp operator = null;


        Token LARGE_AS_OP337=null;
        Token LARGER_OP338=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2086:5: ( LARGE_AS_OP | LARGER_OP )
            int alt167=2;
            int LA167_0 = input.LA(1);

            if ( (LA167_0==LARGE_AS_OP) ) {
                alt167=1;
            }
            else if ( (LA167_0==LARGER_OP) ) {
                alt167=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 167, 0, input);

                throw nvae;

            }
            switch (alt167) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2086:7: LARGE_AS_OP
                    {
                    LARGE_AS_OP337=(Token)match(input,LARGE_AS_OP,FOLLOW_LARGE_AS_OP_in_largerOperator13689); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new LargeAsOp(LARGE_AS_OP337); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2088:7: LARGER_OP
                    {
                    LARGER_OP338=(Token)match(input,LARGER_OP,FOLLOW_LARGER_OP_in_largerOperator13705); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new LargerOp(LARGER_OP338); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "largerOperator"



    // $ANTLR start "comparisonOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2092:1: comparisonOperator returns [BinaryOperatorExpression operator] : ( COMPARE_OP | IN_OP );
    public BinaryOperatorExpression comparisonOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token COMPARE_OP339=null;
        Token IN_OP340=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2093:5: ( COMPARE_OP | IN_OP )
            int alt168=2;
            int LA168_0 = input.LA(1);

            if ( (LA168_0==COMPARE_OP) ) {
                alt168=1;
            }
            else if ( (LA168_0==IN_OP) ) {
                alt168=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 168, 0, input);

                throw nvae;

            }
            switch (alt168) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2093:7: COMPARE_OP
                    {
                    COMPARE_OP339=(Token)match(input,COMPARE_OP,FOLLOW_COMPARE_OP_in_comparisonOperator13734); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new CompareOp(COMPARE_OP339); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2095:7: IN_OP
                    {
                    IN_OP340=(Token)match(input,IN_OP,FOLLOW_IN_OP_in_comparisonOperator13751); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new InOp(IN_OP340); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "comparisonOperator"



    // $ANTLR start "typeOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2099:1: typeOperator returns [TypeOperatorExpression operator] : ( IS_OP | EXTENDS | SATISFIES | CASE_TYPES );
    public TypeOperatorExpression typeOperator() throws RecognitionException {
        TypeOperatorExpression operator = null;


        Token IS_OP341=null;
        Token EXTENDS342=null;
        Token SATISFIES343=null;
        Token CASE_TYPES344=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2100:5: ( IS_OP | EXTENDS | SATISFIES | CASE_TYPES )
            int alt169=4;
            switch ( input.LA(1) ) {
            case IS_OP:
                {
                alt169=1;
                }
                break;
            case EXTENDS:
                {
                alt169=2;
                }
                break;
            case SATISFIES:
                {
                alt169=3;
                }
                break;
            case CASE_TYPES:
                {
                alt169=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 169, 0, input);

                throw nvae;

            }

            switch (alt169) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2100:7: IS_OP
                    {
                    IS_OP341=(Token)match(input,IS_OP,FOLLOW_IS_OP_in_typeOperator13780); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new IsOp(IS_OP341); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2102:7: EXTENDS
                    {
                    EXTENDS342=(Token)match(input,EXTENDS,FOLLOW_EXTENDS_in_typeOperator13796); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new Extends(EXTENDS342); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2104:7: SATISFIES
                    {
                    SATISFIES343=(Token)match(input,SATISFIES,FOLLOW_SATISFIES_in_typeOperator13812); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new Satisfies(SATISFIES343); }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2106:7: CASE_TYPES
                    {
                    CASE_TYPES344=(Token)match(input,CASE_TYPES,FOLLOW_CASE_TYPES_in_typeOperator13828); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new OfOp(CASE_TYPES344); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "typeOperator"



    // $ANTLR start "existenceEmptinessExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2110:1: existenceEmptinessExpression returns [Term term] : de1= entryRangeExpression (eno1= existsNonemptyOperator )? ;
    public Term existenceEmptinessExpression() throws RecognitionException {
        Term term = null;


        Term de1 =null;

        UnaryOperatorExpression eno1 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2111:5: (de1= entryRangeExpression (eno1= existsNonemptyOperator )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2111:7: de1= entryRangeExpression (eno1= existsNonemptyOperator )?
            {
            pushFollow(FOLLOW_entryRangeExpression_in_existenceEmptinessExpression13859);
            de1=entryRangeExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = de1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2113:7: (eno1= existsNonemptyOperator )?
            int alt170=2;
            int LA170_0 = input.LA(1);

            if ( (LA170_0==EXISTS||LA170_0==NONEMPTY) ) {
                alt170=1;
            }
            switch (alt170) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2114:9: eno1= existsNonemptyOperator
                    {
                    pushFollow(FOLLOW_existsNonemptyOperator_in_existenceEmptinessExpression13887);
                    eno1=existsNonemptyOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { term = eno1;
                              eno1.setTerm(de1); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "existenceEmptinessExpression"



    // $ANTLR start "existsNonemptyOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2124:1: existsNonemptyOperator returns [UnaryOperatorExpression operator] : ( EXISTS | NONEMPTY );
    public UnaryOperatorExpression existsNonemptyOperator() throws RecognitionException {
        UnaryOperatorExpression operator = null;


        Token EXISTS345=null;
        Token NONEMPTY346=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2125:5: ( EXISTS | NONEMPTY )
            int alt171=2;
            int LA171_0 = input.LA(1);

            if ( (LA171_0==EXISTS) ) {
                alt171=1;
            }
            else if ( (LA171_0==NONEMPTY) ) {
                alt171=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 171, 0, input);

                throw nvae;

            }
            switch (alt171) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2125:7: EXISTS
                    {
                    EXISTS345=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_existsNonemptyOperator13933); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new Exists(EXISTS345); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2127:7: NONEMPTY
                    {
                    NONEMPTY346=(Token)match(input,NONEMPTY,FOLLOW_NONEMPTY_in_existsNonemptyOperator13950); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new Nonempty(NONEMPTY346); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "existsNonemptyOperator"



    // $ANTLR start "entryRangeExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2131:1: entryRangeExpression returns [Term term] : ae1= additiveExpression ( rangeIntervalEntryOperator ae2= additiveExpression )? ;
    public Term entryRangeExpression() throws RecognitionException {
        Term term = null;


        Term ae1 =null;

        Term ae2 =null;

        BinaryOperatorExpression rangeIntervalEntryOperator347 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2132:5: (ae1= additiveExpression ( rangeIntervalEntryOperator ae2= additiveExpression )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2132:7: ae1= additiveExpression ( rangeIntervalEntryOperator ae2= additiveExpression )?
            {
            pushFollow(FOLLOW_additiveExpression_in_entryRangeExpression13981);
            ae1=additiveExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = ae1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2134:7: ( rangeIntervalEntryOperator ae2= additiveExpression )?
            int alt172=2;
            int LA172_0 = input.LA(1);

            if ( (LA172_0==ENTRY_OP||LA172_0==RANGE_OP||LA172_0==SEGMENT_OP) ) {
                alt172=1;
            }
            switch (alt172) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2135:9: rangeIntervalEntryOperator ae2= additiveExpression
                    {
                    pushFollow(FOLLOW_rangeIntervalEntryOperator_in_entryRangeExpression14007);
                    rangeIntervalEntryOperator347=rangeIntervalEntryOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { rangeIntervalEntryOperator347.setLeftTerm(term);
                              term = rangeIntervalEntryOperator347; }

                    pushFollow(FOLLOW_additiveExpression_in_entryRangeExpression14030);
                    ae2=additiveExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { rangeIntervalEntryOperator347.setRightTerm(ae2); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "entryRangeExpression"



    // $ANTLR start "rangeIntervalEntryOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2143:1: rangeIntervalEntryOperator returns [BinaryOperatorExpression operator] : ( RANGE_OP | SEGMENT_OP | ENTRY_OP );
    public BinaryOperatorExpression rangeIntervalEntryOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token RANGE_OP348=null;
        Token SEGMENT_OP349=null;
        Token ENTRY_OP350=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2144:5: ( RANGE_OP | SEGMENT_OP | ENTRY_OP )
            int alt173=3;
            switch ( input.LA(1) ) {
            case RANGE_OP:
                {
                alt173=1;
                }
                break;
            case SEGMENT_OP:
                {
                alt173=2;
                }
                break;
            case ENTRY_OP:
                {
                alt173=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 173, 0, input);

                throw nvae;

            }

            switch (alt173) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2144:7: RANGE_OP
                    {
                    RANGE_OP348=(Token)match(input,RANGE_OP,FOLLOW_RANGE_OP_in_rangeIntervalEntryOperator14070); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new RangeOp(RANGE_OP348); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2146:7: SEGMENT_OP
                    {
                    SEGMENT_OP349=(Token)match(input,SEGMENT_OP,FOLLOW_SEGMENT_OP_in_rangeIntervalEntryOperator14087); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new SegmentOp(SEGMENT_OP349); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2148:7: ENTRY_OP
                    {
                    ENTRY_OP350=(Token)match(input,ENTRY_OP,FOLLOW_ENTRY_OP_in_rangeIntervalEntryOperator14103); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new EntryOp(ENTRY_OP350); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "rangeIntervalEntryOperator"



    // $ANTLR start "additiveExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2152:1: additiveExpression returns [Term term] : me1= scaleExpression ( additiveOperator me2= scaleExpression )* ;
    public Term additiveExpression() throws RecognitionException {
        Term term = null;


        Term me1 =null;

        Term me2 =null;

        BinaryOperatorExpression additiveOperator351 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2153:5: (me1= scaleExpression ( additiveOperator me2= scaleExpression )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2153:7: me1= scaleExpression ( additiveOperator me2= scaleExpression )*
            {
            pushFollow(FOLLOW_scaleExpression_in_additiveExpression14134);
            me1=scaleExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = me1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2155:7: ( additiveOperator me2= scaleExpression )*
            loop174:
            do {
                int alt174=2;
                int LA174_0 = input.LA(1);

                if ( (LA174_0==DIFFERENCE_OP||LA174_0==SUM_OP) ) {
                    alt174=1;
                }


                switch (alt174) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2156:9: additiveOperator me2= scaleExpression
            	    {
            	    pushFollow(FOLLOW_additiveOperator_in_additiveExpression14160);
            	    additiveOperator351=additiveOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { additiveOperator351.setLeftTerm(term);
            	              term = additiveOperator351; }

            	    pushFollow(FOLLOW_scaleExpression_in_additiveExpression14183);
            	    me2=scaleExpression();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { additiveOperator351.setRightTerm(me2); }

            	    }
            	    break;

            	default :
            	    break loop174;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "additiveExpression"



    // $ANTLR start "additiveOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2164:1: additiveOperator returns [BinaryOperatorExpression operator] : ( SUM_OP | DIFFERENCE_OP );
    public BinaryOperatorExpression additiveOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token SUM_OP352=null;
        Token DIFFERENCE_OP353=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2165:5: ( SUM_OP | DIFFERENCE_OP )
            int alt175=2;
            int LA175_0 = input.LA(1);

            if ( (LA175_0==SUM_OP) ) {
                alt175=1;
            }
            else if ( (LA175_0==DIFFERENCE_OP) ) {
                alt175=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 175, 0, input);

                throw nvae;

            }
            switch (alt175) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2165:7: SUM_OP
                    {
                    SUM_OP352=(Token)match(input,SUM_OP,FOLLOW_SUM_OP_in_additiveOperator14223); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new SumOp(SUM_OP352); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2167:7: DIFFERENCE_OP
                    {
                    DIFFERENCE_OP353=(Token)match(input,DIFFERENCE_OP,FOLLOW_DIFFERENCE_OP_in_additiveOperator14240); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new DifferenceOp(DIFFERENCE_OP353); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "additiveOperator"



    // $ANTLR start "scaleExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2171:1: scaleExpression returns [Term term] : multiplicativeExpression ( scaleOperator se= scaleExpression )? ;
    public Term scaleExpression() throws RecognitionException {
        Term term = null;


        Term se =null;

        Term multiplicativeExpression354 =null;

        ScaleOp scaleOperator355 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2172:5: ( multiplicativeExpression ( scaleOperator se= scaleExpression )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2172:7: multiplicativeExpression ( scaleOperator se= scaleExpression )?
            {
            pushFollow(FOLLOW_multiplicativeExpression_in_scaleExpression14269);
            multiplicativeExpression354=multiplicativeExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = multiplicativeExpression354; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2174:7: ( scaleOperator se= scaleExpression )?
            int alt176=2;
            int LA176_0 = input.LA(1);

            if ( (LA176_0==SCALE_OP) ) {
                alt176=1;
            }
            switch (alt176) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2175:9: scaleOperator se= scaleExpression
                    {
                    pushFollow(FOLLOW_scaleOperator_in_scaleExpression14295);
                    scaleOperator355=scaleOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { scaleOperator355.setLeftTerm(term);
                              term = scaleOperator355; }

                    pushFollow(FOLLOW_scaleExpression_in_scaleExpression14317);
                    se=scaleExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { scaleOperator355.setRightTerm(se); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "scaleExpression"



    // $ANTLR start "multiplicativeExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2183:1: multiplicativeExpression returns [Term term] : ue1= unionExpression ( multiplicativeOperator ue2= unionExpression )* ;
    public Term multiplicativeExpression() throws RecognitionException {
        Term term = null;


        Term ue1 =null;

        Term ue2 =null;

        BinaryOperatorExpression multiplicativeOperator356 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2184:5: (ue1= unionExpression ( multiplicativeOperator ue2= unionExpression )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2184:7: ue1= unionExpression ( multiplicativeOperator ue2= unionExpression )*
            {
            pushFollow(FOLLOW_unionExpression_in_multiplicativeExpression14359);
            ue1=unionExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = ue1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2186:7: ( multiplicativeOperator ue2= unionExpression )*
            loop177:
            do {
                int alt177=2;
                int LA177_0 = input.LA(1);

                if ( ((LA177_0 >= PRODUCT_OP && LA177_0 <= QUOTIENT_OP)||LA177_0==REMAINDER_OP) ) {
                    alt177=1;
                }


                switch (alt177) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2187:9: multiplicativeOperator ue2= unionExpression
            	    {
            	    pushFollow(FOLLOW_multiplicativeOperator_in_multiplicativeExpression14385);
            	    multiplicativeOperator356=multiplicativeOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { multiplicativeOperator356.setLeftTerm(term);
            	              term = multiplicativeOperator356; }

            	    pushFollow(FOLLOW_unionExpression_in_multiplicativeExpression14408);
            	    ue2=unionExpression();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { multiplicativeOperator356.setRightTerm(ue2); }

            	    }
            	    break;

            	default :
            	    break loop177;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "multiplicativeExpression"



    // $ANTLR start "multiplicativeOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2195:1: multiplicativeOperator returns [BinaryOperatorExpression operator] : ( PRODUCT_OP | QUOTIENT_OP | REMAINDER_OP );
    public BinaryOperatorExpression multiplicativeOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token PRODUCT_OP357=null;
        Token QUOTIENT_OP358=null;
        Token REMAINDER_OP359=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2196:5: ( PRODUCT_OP | QUOTIENT_OP | REMAINDER_OP )
            int alt178=3;
            switch ( input.LA(1) ) {
            case PRODUCT_OP:
                {
                alt178=1;
                }
                break;
            case QUOTIENT_OP:
                {
                alt178=2;
                }
                break;
            case REMAINDER_OP:
                {
                alt178=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 178, 0, input);

                throw nvae;

            }

            switch (alt178) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2196:7: PRODUCT_OP
                    {
                    PRODUCT_OP357=(Token)match(input,PRODUCT_OP,FOLLOW_PRODUCT_OP_in_multiplicativeOperator14448); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new ProductOp(PRODUCT_OP357); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2198:7: QUOTIENT_OP
                    {
                    QUOTIENT_OP358=(Token)match(input,QUOTIENT_OP,FOLLOW_QUOTIENT_OP_in_multiplicativeOperator14465); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new QuotientOp(QUOTIENT_OP358); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2200:7: REMAINDER_OP
                    {
                    REMAINDER_OP359=(Token)match(input,REMAINDER_OP,FOLLOW_REMAINDER_OP_in_multiplicativeOperator14481); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new RemainderOp(REMAINDER_OP359); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "multiplicativeOperator"



    // $ANTLR start "unionExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2204:1: unionExpression returns [Term term] : ie1= intersectionExpression ( unionOperator ie2= intersectionExpression )* ;
    public Term unionExpression() throws RecognitionException {
        Term term = null;


        Term ie1 =null;

        Term ie2 =null;

        BinaryOperatorExpression unionOperator360 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2205:5: (ie1= intersectionExpression ( unionOperator ie2= intersectionExpression )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2205:7: ie1= intersectionExpression ( unionOperator ie2= intersectionExpression )*
            {
            pushFollow(FOLLOW_intersectionExpression_in_unionExpression14512);
            ie1=intersectionExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = ie1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2207:7: ( unionOperator ie2= intersectionExpression )*
            loop179:
            do {
                int alt179=2;
                int LA179_0 = input.LA(1);

                if ( (LA179_0==COMPLEMENT_OP||LA179_0==UNION_OP) ) {
                    alt179=1;
                }


                switch (alt179) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2208:9: unionOperator ie2= intersectionExpression
            	    {
            	    pushFollow(FOLLOW_unionOperator_in_unionExpression14538);
            	    unionOperator360=unionOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { unionOperator360.setLeftTerm(term);
            	              term = unionOperator360; }

            	    pushFollow(FOLLOW_intersectionExpression_in_unionExpression14561);
            	    ie2=intersectionExpression();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { unionOperator360.setRightTerm(ie2); }

            	    }
            	    break;

            	default :
            	    break loop179;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "unionExpression"



    // $ANTLR start "unionOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2216:1: unionOperator returns [BinaryOperatorExpression operator] : ( UNION_OP | COMPLEMENT_OP );
    public BinaryOperatorExpression unionOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token UNION_OP361=null;
        Token COMPLEMENT_OP362=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2217:5: ( UNION_OP | COMPLEMENT_OP )
            int alt180=2;
            int LA180_0 = input.LA(1);

            if ( (LA180_0==UNION_OP) ) {
                alt180=1;
            }
            else if ( (LA180_0==COMPLEMENT_OP) ) {
                alt180=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 180, 0, input);

                throw nvae;

            }
            switch (alt180) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2217:7: UNION_OP
                    {
                    UNION_OP361=(Token)match(input,UNION_OP,FOLLOW_UNION_OP_in_unionOperator14605); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new UnionOp(UNION_OP361); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2219:7: COMPLEMENT_OP
                    {
                    COMPLEMENT_OP362=(Token)match(input,COMPLEMENT_OP,FOLLOW_COMPLEMENT_OP_in_unionOperator14621); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new ComplementOp(COMPLEMENT_OP362); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "unionOperator"



    // $ANTLR start "intersectionExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2223:1: intersectionExpression returns [Term term] : ne1= negationComplementExpression ( intersectionOperator ne2= negationComplementExpression )* ;
    public Term intersectionExpression() throws RecognitionException {
        Term term = null;


        Term ne1 =null;

        Term ne2 =null;

        BinaryOperatorExpression intersectionOperator363 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2224:5: (ne1= negationComplementExpression ( intersectionOperator ne2= negationComplementExpression )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2224:7: ne1= negationComplementExpression ( intersectionOperator ne2= negationComplementExpression )*
            {
            pushFollow(FOLLOW_negationComplementExpression_in_intersectionExpression14652);
            ne1=negationComplementExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = ne1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2226:7: ( intersectionOperator ne2= negationComplementExpression )*
            loop181:
            do {
                int alt181=2;
                int LA181_0 = input.LA(1);

                if ( (LA181_0==INTERSECTION_OP) ) {
                    alt181=1;
                }


                switch (alt181) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2227:9: intersectionOperator ne2= negationComplementExpression
            	    {
            	    pushFollow(FOLLOW_intersectionOperator_in_intersectionExpression14678);
            	    intersectionOperator363=intersectionOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { intersectionOperator363.setLeftTerm(term);
            	              term = intersectionOperator363; }

            	    pushFollow(FOLLOW_negationComplementExpression_in_intersectionExpression14701);
            	    ne2=negationComplementExpression();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { intersectionOperator363.setRightTerm(ne2); }

            	    }
            	    break;

            	default :
            	    break loop181;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "intersectionExpression"



    // $ANTLR start "intersectionOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2235:1: intersectionOperator returns [BinaryOperatorExpression operator] : INTERSECTION_OP ;
    public BinaryOperatorExpression intersectionOperator() throws RecognitionException {
        BinaryOperatorExpression operator = null;


        Token INTERSECTION_OP364=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2236:5: ( INTERSECTION_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2236:7: INTERSECTION_OP
            {
            INTERSECTION_OP364=(Token)match(input,INTERSECTION_OP,FOLLOW_INTERSECTION_OP_in_intersectionOperator14745); if (state.failed) return operator;

            if ( state.backtracking==0 ) { operator = new IntersectionOp(INTERSECTION_OP364); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "intersectionOperator"



    // $ANTLR start "negationComplementExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2240:1: negationComplementExpression returns [Term term] : ( unaryMinusOrComplementOperator ne= negationComplementExpression | exponentiationExpression );
    public Term negationComplementExpression() throws RecognitionException {
        Term term = null;


        Term ne =null;

        UnaryOperatorExpression unaryMinusOrComplementOperator365 =null;

        Term exponentiationExpression366 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2241:5: ( unaryMinusOrComplementOperator ne= negationComplementExpression | exponentiationExpression )
            int alt182=2;
            int LA182_0 = input.LA(1);

            if ( (LA182_0==DIFFERENCE_OP||LA182_0==SUM_OP) ) {
                alt182=1;
            }
            else if ( (LA182_0==BACKTICK||LA182_0==CHAR_LITERAL||LA182_0==DECREMENT_OP||LA182_0==FLOAT_LITERAL||LA182_0==INCREMENT_OP||(LA182_0 >= LBRACE && LA182_0 <= LIDENTIFIER)||LA182_0==LPAREN||LA182_0==NATURAL_LITERAL||(LA182_0 >= OUTER && LA182_0 <= PACKAGE)||LA182_0==STRING_LITERAL||LA182_0==STRING_START||LA182_0==SUPER||LA182_0==THIS||LA182_0==UIDENTIFIER||(LA182_0 >= VALUE_MODIFIER && LA182_0 <= VERBATIM_STRING)) ) {
                alt182=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return term;}
                NoViableAltException nvae =
                    new NoViableAltException("", 182, 0, input);

                throw nvae;

            }
            switch (alt182) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2241:7: unaryMinusOrComplementOperator ne= negationComplementExpression
                    {
                    pushFollow(FOLLOW_unaryMinusOrComplementOperator_in_negationComplementExpression14774);
                    unaryMinusOrComplementOperator365=unaryMinusOrComplementOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { term = unaryMinusOrComplementOperator365; }

                    pushFollow(FOLLOW_negationComplementExpression_in_negationComplementExpression14793);
                    ne=negationComplementExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { unaryMinusOrComplementOperator365.setTerm(ne); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2245:7: exponentiationExpression
                    {
                    pushFollow(FOLLOW_exponentiationExpression_in_negationComplementExpression14809);
                    exponentiationExpression366=exponentiationExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { term = exponentiationExpression366; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "negationComplementExpression"



    // $ANTLR start "unaryMinusOrComplementOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2249:1: unaryMinusOrComplementOperator returns [UnaryOperatorExpression operator] : ( DIFFERENCE_OP | SUM_OP );
    public UnaryOperatorExpression unaryMinusOrComplementOperator() throws RecognitionException {
        UnaryOperatorExpression operator = null;


        Token DIFFERENCE_OP367=null;
        Token SUM_OP368=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2250:5: ( DIFFERENCE_OP | SUM_OP )
            int alt183=2;
            int LA183_0 = input.LA(1);

            if ( (LA183_0==DIFFERENCE_OP) ) {
                alt183=1;
            }
            else if ( (LA183_0==SUM_OP) ) {
                alt183=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 183, 0, input);

                throw nvae;

            }
            switch (alt183) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2250:7: DIFFERENCE_OP
                    {
                    DIFFERENCE_OP367=(Token)match(input,DIFFERENCE_OP,FOLLOW_DIFFERENCE_OP_in_unaryMinusOrComplementOperator14838); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new NegativeOp(DIFFERENCE_OP367); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2252:7: SUM_OP
                    {
                    SUM_OP368=(Token)match(input,SUM_OP,FOLLOW_SUM_OP_in_unaryMinusOrComplementOperator14855); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new PositiveOp(SUM_OP368); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "unaryMinusOrComplementOperator"



    // $ANTLR start "exponentiationExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2256:1: exponentiationExpression returns [Term term] : incrementDecrementExpression ( exponentiationOperator ee= exponentiationExpression )? ;
    public Term exponentiationExpression() throws RecognitionException {
        Term term = null;


        Term ee =null;

        Term incrementDecrementExpression369 =null;

        PowerOp exponentiationOperator370 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2257:5: ( incrementDecrementExpression ( exponentiationOperator ee= exponentiationExpression )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2257:7: incrementDecrementExpression ( exponentiationOperator ee= exponentiationExpression )?
            {
            pushFollow(FOLLOW_incrementDecrementExpression_in_exponentiationExpression14884);
            incrementDecrementExpression369=incrementDecrementExpression();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = incrementDecrementExpression369; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2259:7: ( exponentiationOperator ee= exponentiationExpression )?
            int alt184=2;
            int LA184_0 = input.LA(1);

            if ( (LA184_0==POWER_OP) ) {
                alt184=1;
            }
            switch (alt184) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2260:9: exponentiationOperator ee= exponentiationExpression
                    {
                    pushFollow(FOLLOW_exponentiationOperator_in_exponentiationExpression14910);
                    exponentiationOperator370=exponentiationOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { exponentiationOperator370.setLeftTerm(term);
                              term = exponentiationOperator370; }

                    pushFollow(FOLLOW_exponentiationExpression_in_exponentiationExpression14932);
                    ee=exponentiationExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { exponentiationOperator370.setRightTerm(ee); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "exponentiationExpression"



    // $ANTLR start "exponentiationOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2268:1: exponentiationOperator returns [PowerOp operator] : POWER_OP ;
    public PowerOp exponentiationOperator() throws RecognitionException {
        PowerOp operator = null;


        Token POWER_OP371=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2269:5: ( POWER_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2269:7: POWER_OP
            {
            POWER_OP371=(Token)match(input,POWER_OP,FOLLOW_POWER_OP_in_exponentiationOperator14972); if (state.failed) return operator;

            if ( state.backtracking==0 ) { operator = new PowerOp(POWER_OP371); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "exponentiationOperator"



    // $ANTLR start "scaleOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2273:1: scaleOperator returns [ScaleOp operator] : SCALE_OP ;
    public ScaleOp scaleOperator() throws RecognitionException {
        ScaleOp operator = null;


        Token SCALE_OP372=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2274:5: ( SCALE_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2274:7: SCALE_OP
            {
            SCALE_OP372=(Token)match(input,SCALE_OP,FOLLOW_SCALE_OP_in_scaleOperator15002); if (state.failed) return operator;

            if ( state.backtracking==0 ) { operator = new ScaleOp(SCALE_OP372); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "scaleOperator"



    // $ANTLR start "incrementDecrementExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2278:1: incrementDecrementExpression returns [Term term] : ( prefixOperator ie= incrementDecrementExpression | postfixIncrementDecrementExpression );
    public Term incrementDecrementExpression() throws RecognitionException {
        Term term = null;


        Term ie =null;

        PrefixOperatorExpression prefixOperator373 =null;

        Term postfixIncrementDecrementExpression374 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2279:5: ( prefixOperator ie= incrementDecrementExpression | postfixIncrementDecrementExpression )
            int alt185=2;
            int LA185_0 = input.LA(1);

            if ( (LA185_0==DECREMENT_OP||LA185_0==INCREMENT_OP) ) {
                alt185=1;
            }
            else if ( (LA185_0==BACKTICK||LA185_0==CHAR_LITERAL||LA185_0==FLOAT_LITERAL||(LA185_0 >= LBRACE && LA185_0 <= LIDENTIFIER)||LA185_0==LPAREN||LA185_0==NATURAL_LITERAL||(LA185_0 >= OUTER && LA185_0 <= PACKAGE)||LA185_0==STRING_LITERAL||LA185_0==STRING_START||LA185_0==SUPER||LA185_0==THIS||LA185_0==UIDENTIFIER||(LA185_0 >= VALUE_MODIFIER && LA185_0 <= VERBATIM_STRING)) ) {
                alt185=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return term;}
                NoViableAltException nvae =
                    new NoViableAltException("", 185, 0, input);

                throw nvae;

            }
            switch (alt185) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2279:7: prefixOperator ie= incrementDecrementExpression
                    {
                    pushFollow(FOLLOW_prefixOperator_in_incrementDecrementExpression15032);
                    prefixOperator373=prefixOperator();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { term = prefixOperator373; }

                    pushFollow(FOLLOW_incrementDecrementExpression_in_incrementDecrementExpression15050);
                    ie=incrementDecrementExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { prefixOperator373.setTerm(ie); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2283:7: postfixIncrementDecrementExpression
                    {
                    pushFollow(FOLLOW_postfixIncrementDecrementExpression_in_incrementDecrementExpression15066);
                    postfixIncrementDecrementExpression374=postfixIncrementDecrementExpression();

                    state._fsp--;
                    if (state.failed) return term;

                    if ( state.backtracking==0 ) { term = postfixIncrementDecrementExpression374; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "incrementDecrementExpression"



    // $ANTLR start "prefixOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2287:1: prefixOperator returns [PrefixOperatorExpression operator] : ( DECREMENT_OP | INCREMENT_OP );
    public PrefixOperatorExpression prefixOperator() throws RecognitionException {
        PrefixOperatorExpression operator = null;


        Token DECREMENT_OP375=null;
        Token INCREMENT_OP376=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2288:5: ( DECREMENT_OP | INCREMENT_OP )
            int alt186=2;
            int LA186_0 = input.LA(1);

            if ( (LA186_0==DECREMENT_OP) ) {
                alt186=1;
            }
            else if ( (LA186_0==INCREMENT_OP) ) {
                alt186=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 186, 0, input);

                throw nvae;

            }
            switch (alt186) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2288:7: DECREMENT_OP
                    {
                    DECREMENT_OP375=(Token)match(input,DECREMENT_OP,FOLLOW_DECREMENT_OP_in_prefixOperator15095); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new DecrementOp(DECREMENT_OP375); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2290:7: INCREMENT_OP
                    {
                    INCREMENT_OP376=(Token)match(input,INCREMENT_OP,FOLLOW_INCREMENT_OP_in_prefixOperator15112); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new IncrementOp(INCREMENT_OP376); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "prefixOperator"



    // $ANTLR start "postfixIncrementDecrementExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2294:1: postfixIncrementDecrementExpression returns [Term term] : primary ( postfixOperator )* ;
    public Term postfixIncrementDecrementExpression() throws RecognitionException {
        Term term = null;


        Primary primary377 =null;

        PostfixOperatorExpression postfixOperator378 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2295:5: ( primary ( postfixOperator )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2295:7: primary ( postfixOperator )*
            {
            pushFollow(FOLLOW_primary_in_postfixIncrementDecrementExpression15142);
            primary377=primary();

            state._fsp--;
            if (state.failed) return term;

            if ( state.backtracking==0 ) { term = primary377; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2297:7: ( postfixOperator )*
            loop187:
            do {
                int alt187=2;
                int LA187_0 = input.LA(1);

                if ( (LA187_0==DECREMENT_OP||LA187_0==INCREMENT_OP) ) {
                    alt187=1;
                }


                switch (alt187) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2298:9: postfixOperator
            	    {
            	    pushFollow(FOLLOW_postfixOperator_in_postfixIncrementDecrementExpression15170);
            	    postfixOperator378=postfixOperator();

            	    state._fsp--;
            	    if (state.failed) return term;

            	    if ( state.backtracking==0 ) { postfixOperator378.setTerm(term);
            	              term = postfixOperator378; }

            	    }
            	    break;

            	default :
            	    break loop187;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return term;
    }
    // $ANTLR end "postfixIncrementDecrementExpression"



    // $ANTLR start "postfixOperator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2304:1: postfixOperator returns [PostfixOperatorExpression operator] : ( DECREMENT_OP | INCREMENT_OP );
    public PostfixOperatorExpression postfixOperator() throws RecognitionException {
        PostfixOperatorExpression operator = null;


        Token DECREMENT_OP379=null;
        Token INCREMENT_OP380=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2305:5: ( DECREMENT_OP | INCREMENT_OP )
            int alt188=2;
            int LA188_0 = input.LA(1);

            if ( (LA188_0==DECREMENT_OP) ) {
                alt188=1;
            }
            else if ( (LA188_0==INCREMENT_OP) ) {
                alt188=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return operator;}
                NoViableAltException nvae =
                    new NoViableAltException("", 188, 0, input);

                throw nvae;

            }
            switch (alt188) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2305:7: DECREMENT_OP
                    {
                    DECREMENT_OP379=(Token)match(input,DECREMENT_OP,FOLLOW_DECREMENT_OP_in_postfixOperator15210); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new PostfixDecrementOp(DECREMENT_OP379); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2307:7: INCREMENT_OP
                    {
                    INCREMENT_OP380=(Token)match(input,INCREMENT_OP,FOLLOW_INCREMENT_OP_in_postfixOperator15227); if (state.failed) return operator;

                    if ( state.backtracking==0 ) { operator = new PostfixIncrementOp(INCREMENT_OP380); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return operator;
    }
    // $ANTLR end "postfixOperator"



    // $ANTLR start "selfReference"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2311:1: selfReference returns [Atom atom] : ( THIS | SUPER | OUTER | PACKAGE );
    public Atom selfReference() throws RecognitionException {
        Atom atom = null;


        Token THIS381=null;
        Token SUPER382=null;
        Token OUTER383=null;
        Token PACKAGE384=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2312:5: ( THIS | SUPER | OUTER | PACKAGE )
            int alt189=4;
            switch ( input.LA(1) ) {
            case THIS:
                {
                alt189=1;
                }
                break;
            case SUPER:
                {
                alt189=2;
                }
                break;
            case OUTER:
                {
                alt189=3;
                }
                break;
            case PACKAGE:
                {
                alt189=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return atom;}
                NoViableAltException nvae =
                    new NoViableAltException("", 189, 0, input);

                throw nvae;

            }

            switch (alt189) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2312:7: THIS
                    {
                    THIS381=(Token)match(input,THIS,FOLLOW_THIS_in_selfReference15257); if (state.failed) return atom;

                    if ( state.backtracking==0 ) { atom = new This(THIS381); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2314:7: SUPER
                    {
                    SUPER382=(Token)match(input,SUPER,FOLLOW_SUPER_in_selfReference15273); if (state.failed) return atom;

                    if ( state.backtracking==0 ) { atom = new Super(SUPER382); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2316:7: OUTER
                    {
                    OUTER383=(Token)match(input,OUTER,FOLLOW_OUTER_in_selfReference15290); if (state.failed) return atom;

                    if ( state.backtracking==0 ) { atom = new Outer(OUTER383); }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2318:7: PACKAGE
                    {
                    PACKAGE384=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_selfReference15306); if (state.failed) return atom;

                    if ( state.backtracking==0 ) { atom = new Package(PACKAGE384); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return atom;
    }
    // $ANTLR end "selfReference"



    // $ANTLR start "nonstringLiteral"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2322:1: nonstringLiteral returns [Literal literal] : ( NATURAL_LITERAL | FLOAT_LITERAL | CHAR_LITERAL );
    public Literal nonstringLiteral() throws RecognitionException {
        Literal literal = null;


        Token NATURAL_LITERAL385=null;
        Token FLOAT_LITERAL386=null;
        Token CHAR_LITERAL387=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2323:5: ( NATURAL_LITERAL | FLOAT_LITERAL | CHAR_LITERAL )
            int alt190=3;
            switch ( input.LA(1) ) {
            case NATURAL_LITERAL:
                {
                alt190=1;
                }
                break;
            case FLOAT_LITERAL:
                {
                alt190=2;
                }
                break;
            case CHAR_LITERAL:
                {
                alt190=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return literal;}
                NoViableAltException nvae =
                    new NoViableAltException("", 190, 0, input);

                throw nvae;

            }

            switch (alt190) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2323:7: NATURAL_LITERAL
                    {
                    NATURAL_LITERAL385=(Token)match(input,NATURAL_LITERAL,FOLLOW_NATURAL_LITERAL_in_nonstringLiteral15339); if (state.failed) return literal;

                    if ( state.backtracking==0 ) { literal = new NaturalLiteral(NATURAL_LITERAL385); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2325:7: FLOAT_LITERAL
                    {
                    FLOAT_LITERAL386=(Token)match(input,FLOAT_LITERAL,FOLLOW_FLOAT_LITERAL_in_nonstringLiteral15356); if (state.failed) return literal;

                    if ( state.backtracking==0 ) { literal = new FloatLiteral(FLOAT_LITERAL386); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2327:7: CHAR_LITERAL
                    {
                    CHAR_LITERAL387=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_nonstringLiteral15373); if (state.failed) return literal;

                    if ( state.backtracking==0 ) { literal = new CharLiteral(CHAR_LITERAL387); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return literal;
    }
    // $ANTLR end "nonstringLiteral"



    // $ANTLR start "stringLiteral"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2331:1: stringLiteral returns [StringLiteral stringLiteral] : ( STRING_LITERAL | VERBATIM_STRING );
    public StringLiteral stringLiteral() throws RecognitionException {
        StringLiteral stringLiteral = null;


        Token STRING_LITERAL388=null;
        Token VERBATIM_STRING389=null;

        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2332:5: ( STRING_LITERAL | VERBATIM_STRING )
            int alt191=2;
            int LA191_0 = input.LA(1);

            if ( (LA191_0==STRING_LITERAL) ) {
                alt191=1;
            }
            else if ( (LA191_0==VERBATIM_STRING) ) {
                alt191=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return stringLiteral;}
                NoViableAltException nvae =
                    new NoViableAltException("", 191, 0, input);

                throw nvae;

            }
            switch (alt191) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2332:7: STRING_LITERAL
                    {
                    STRING_LITERAL388=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringLiteral15403); if (state.failed) return stringLiteral;

                    if ( state.backtracking==0 ) { stringLiteral = new StringLiteral(STRING_LITERAL388); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2334:7: VERBATIM_STRING
                    {
                    VERBATIM_STRING389=(Token)match(input,VERBATIM_STRING,FOLLOW_VERBATIM_STRING_in_stringLiteral15420); if (state.failed) return stringLiteral;

                    if ( state.backtracking==0 ) { stringLiteral = new StringLiteral(VERBATIM_STRING389); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return stringLiteral;
    }
    // $ANTLR end "stringLiteral"



    // $ANTLR start "stringExpression"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2338:1: stringExpression returns [Atom atom] : (sl1= stringLiteral | STRING_START e1= expression ( STRING_MID e2= expression )* STRING_END );
    public Atom stringExpression() throws RecognitionException {
        Atom atom = null;


        Token STRING_START390=null;
        Token STRING_MID391=null;
        Token STRING_END392=null;
        StringLiteral sl1 =null;

        Expression e1 =null;

        Expression e2 =null;


         StringTemplate st=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2340:5: (sl1= stringLiteral | STRING_START e1= expression ( STRING_MID e2= expression )* STRING_END )
            int alt193=2;
            int LA193_0 = input.LA(1);

            if ( (LA193_0==STRING_LITERAL||LA193_0==VERBATIM_STRING) ) {
                alt193=1;
            }
            else if ( (LA193_0==STRING_START) ) {
                alt193=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return atom;}
                NoViableAltException nvae =
                    new NoViableAltException("", 193, 0, input);

                throw nvae;

            }
            switch (alt193) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2340:7: sl1= stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_stringExpression15460);
                    sl1=stringLiteral();

                    state._fsp--;
                    if (state.failed) return atom;

                    if ( state.backtracking==0 ) { atom =sl1; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2342:7: STRING_START e1= expression ( STRING_MID e2= expression )* STRING_END
                    {
                    STRING_START390=(Token)match(input,STRING_START,FOLLOW_STRING_START_in_stringExpression15476); if (state.failed) return atom;

                    if ( state.backtracking==0 ) { st = new StringTemplate(null);
                            st.addStringLiteral(new StringLiteral(STRING_START390));
                            atom =st; }

                    pushFollow(FOLLOW_expression_in_stringExpression15494);
                    e1=expression();

                    state._fsp--;
                    if (state.failed) return atom;

                    if ( state.backtracking==0 ) { if (e1!=null) 
                                st.addExpression(e1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2349:7: ( STRING_MID e2= expression )*
                    loop192:
                    do {
                        int alt192=2;
                        int LA192_0 = input.LA(1);

                        if ( (LA192_0==STRING_MID) ) {
                            alt192=1;
                        }


                        switch (alt192) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2350:9: STRING_MID e2= expression
                    	    {
                    	    STRING_MID391=(Token)match(input,STRING_MID,FOLLOW_STRING_MID_in_stringExpression15520); if (state.failed) return atom;

                    	    if ( state.backtracking==0 ) { st.addStringLiteral(new StringLiteral(STRING_MID391)); }

                    	    pushFollow(FOLLOW_expression_in_stringExpression15542);
                    	    e2=expression();

                    	    state._fsp--;
                    	    if (state.failed) return atom;

                    	    if ( state.backtracking==0 ) { if (e2!=null) 
                    	                  st.addExpression(e2); }

                    	    }
                    	    break;

                    	default :
                    	    break loop192;
                        }
                    } while (true);


                    STRING_END392=(Token)match(input,STRING_END,FOLLOW_STRING_END_in_stringExpression15569); if (state.failed) return atom;

                    if ( state.backtracking==0 ) { st.addStringLiteral(new StringLiteral(STRING_END392)); }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return atom;
    }
    // $ANTLR end "stringExpression"



    // $ANTLR start "typeArguments"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2360:1: typeArguments returns [TypeArgumentList typeArgumentList] : SMALLER_OP (ta1= type (c= COMMA (ta2= type |) )* )? LARGER_OP ;
    public TypeArgumentList typeArguments() throws RecognitionException {
        TypeArgumentList typeArgumentList = null;


        Token c=null;
        Token SMALLER_OP393=null;
        Token LARGER_OP394=null;
        StaticType ta1 =null;

        StaticType ta2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2361:5: ( SMALLER_OP (ta1= type (c= COMMA (ta2= type |) )* )? LARGER_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2361:7: SMALLER_OP (ta1= type (c= COMMA (ta2= type |) )* )? LARGER_OP
            {
            SMALLER_OP393=(Token)match(input,SMALLER_OP,FOLLOW_SMALLER_OP_in_typeArguments15598); if (state.failed) return typeArgumentList;

            if ( state.backtracking==0 ) { typeArgumentList = new TypeArgumentList(SMALLER_OP393); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2363:7: (ta1= type (c= COMMA (ta2= type |) )* )?
            int alt196=2;
            int LA196_0 = input.LA(1);

            if ( ((LA196_0 >= LBRACE && LA196_0 <= LBRACKET)||LA196_0==SMALLER_OP||LA196_0==UIDENTIFIER) ) {
                alt196=1;
            }
            switch (alt196) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2364:9: ta1= type (c= COMMA (ta2= type |) )*
                    {
                    pushFollow(FOLLOW_type_in_typeArguments15626);
                    ta1=type();

                    state._fsp--;
                    if (state.failed) return typeArgumentList;

                    if ( state.backtracking==0 ) { if (ta1!=null)
                                  typeArgumentList.addType(ta1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2367:9: (c= COMMA (ta2= type |) )*
                    loop195:
                    do {
                        int alt195=2;
                        int LA195_0 = input.LA(1);

                        if ( (LA195_0==COMMA) ) {
                            alt195=1;
                        }


                        switch (alt195) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2368:11: c= COMMA (ta2= type |)
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_typeArguments15660); if (state.failed) return typeArgumentList;

                    	    if ( state.backtracking==0 ) { typeArgumentList.setEndToken(c); }

                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2370:11: (ta2= type |)
                    	    int alt194=2;
                    	    int LA194_0 = input.LA(1);

                    	    if ( ((LA194_0 >= LBRACE && LA194_0 <= LBRACKET)||LA194_0==SMALLER_OP||LA194_0==UIDENTIFIER) ) {
                    	        alt194=1;
                    	    }
                    	    else if ( (LA194_0==COMMA||LA194_0==LARGER_OP) ) {
                    	        alt194=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return typeArgumentList;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 194, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt194) {
                    	        case 1 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2371:13: ta2= type
                    	            {
                    	            pushFollow(FOLLOW_type_in_typeArguments15700);
                    	            ta2=type();

                    	            state._fsp--;
                    	            if (state.failed) return typeArgumentList;

                    	            if ( state.backtracking==0 ) { if (ta2!=null) {
                    	                              typeArgumentList.addType(ta2); 
                    	                              typeArgumentList.setEndToken(null); } }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2375:15: 
                    	            {
                    	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                    	                              new MismatchedTokenException(UIDENTIFIER, input)); }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop195;
                        }
                    } while (true);


                    }
                    break;

            }


            LARGER_OP394=(Token)match(input,LARGER_OP,FOLLOW_LARGER_OP_in_typeArguments15770); if (state.failed) return typeArgumentList;

            if ( state.backtracking==0 ) { typeArgumentList.setEndToken(LARGER_OP394); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return typeArgumentList;
    }
    // $ANTLR end "typeArguments"



    // $ANTLR start "variadicType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2384:1: variadicType returns [Type type] : ( ( unionType ( PRODUCT_OP | SUM_OP ) )=>at= unionType ( PRODUCT_OP | SUM_OP )? |t= type );
    public Type variadicType() throws RecognitionException {
        Type type = null;


        Token PRODUCT_OP395=null;
        Token SUM_OP396=null;
        StaticType at =null;

        StaticType t =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2385:5: ( ( unionType ( PRODUCT_OP | SUM_OP ) )=>at= unionType ( PRODUCT_OP | SUM_OP )? |t= type )
            int alt198=2;
            switch ( input.LA(1) ) {
            case UIDENTIFIER:
                {
                int LA198_1 = input.LA(2);

                if ( (synpred14_Ceylon()) ) {
                    alt198=1;
                }
                else if ( (true) ) {
                    alt198=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 198, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA198_2 = input.LA(2);

                if ( (synpred14_Ceylon()) ) {
                    alt198=1;
                }
                else if ( (true) ) {
                    alt198=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 198, 2, input);

                    throw nvae;

                }
                }
                break;
            case LBRACE:
                {
                int LA198_3 = input.LA(2);

                if ( (synpred14_Ceylon()) ) {
                    alt198=1;
                }
                else if ( (true) ) {
                    alt198=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 198, 3, input);

                    throw nvae;

                }
                }
                break;
            case SMALLER_OP:
                {
                int LA198_4 = input.LA(2);

                if ( (synpred14_Ceylon()) ) {
                    alt198=1;
                }
                else if ( (true) ) {
                    alt198=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 198, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 198, 0, input);

                throw nvae;

            }

            switch (alt198) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2385:7: ( unionType ( PRODUCT_OP | SUM_OP ) )=>at= unionType ( PRODUCT_OP | SUM_OP )?
                    {
                    pushFollow(FOLLOW_unionType_in_variadicType15818);
                    at=unionType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = at; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2388:7: ( PRODUCT_OP | SUM_OP )?
                    int alt197=3;
                    int LA197_0 = input.LA(1);

                    if ( (LA197_0==PRODUCT_OP) ) {
                        alt197=1;
                    }
                    else if ( (LA197_0==SUM_OP) ) {
                        alt197=2;
                    }
                    switch (alt197) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2389:9: PRODUCT_OP
                            {
                            PRODUCT_OP395=(Token)match(input,PRODUCT_OP,FOLLOW_PRODUCT_OP_in_variadicType15844); if (state.failed) return type;

                            if ( state.backtracking==0 ) { SequencedType st = new SequencedType(null);
                                      st.setType(at); 
                                      st.setEndToken(PRODUCT_OP395);
                                      type = st; }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2395:9: SUM_OP
                            {
                            SUM_OP396=(Token)match(input,SUM_OP,FOLLOW_SUM_OP_in_variadicType15872); if (state.failed) return type;

                            if ( state.backtracking==0 ) { SequencedType st = new SequencedType(null);
                                      st.setType(at); 
                                      st.setEndToken(SUM_OP396);
                                      st.setAtLeastOne(true);
                                      type = st; }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2402:7: t= type
                    {
                    pushFollow(FOLLOW_type_in_variadicType15901);
                    t=type();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = t; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "variadicType"



    // $ANTLR start "defaultedType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2406:1: defaultedType returns [Type type] : ( ( type ( SPECIFY ) )=>t= type ( SPECIFY )? | variadicType );
    public Type defaultedType() throws RecognitionException {
        Type type = null;


        Token SPECIFY397=null;
        StaticType t =null;

        Type variadicType398 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2407:5: ( ( type ( SPECIFY ) )=>t= type ( SPECIFY )? | variadicType )
            int alt200=2;
            switch ( input.LA(1) ) {
            case UIDENTIFIER:
                {
                int LA200_1 = input.LA(2);

                if ( (synpred15_Ceylon()) ) {
                    alt200=1;
                }
                else if ( (true) ) {
                    alt200=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 200, 1, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA200_2 = input.LA(2);

                if ( (synpred15_Ceylon()) ) {
                    alt200=1;
                }
                else if ( (true) ) {
                    alt200=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 200, 2, input);

                    throw nvae;

                }
                }
                break;
            case LBRACE:
                {
                int LA200_3 = input.LA(2);

                if ( (synpred15_Ceylon()) ) {
                    alt200=1;
                }
                else if ( (true) ) {
                    alt200=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 200, 3, input);

                    throw nvae;

                }
                }
                break;
            case SMALLER_OP:
                {
                int LA200_4 = input.LA(2);

                if ( (synpred15_Ceylon()) ) {
                    alt200=1;
                }
                else if ( (true) ) {
                    alt200=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return type;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 200, 4, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 200, 0, input);

                throw nvae;

            }

            switch (alt200) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2407:7: ( type ( SPECIFY ) )=>t= type ( SPECIFY )?
                    {
                    pushFollow(FOLLOW_type_in_defaultedType15947);
                    t=type();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type = t; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2410:7: ( SPECIFY )?
                    int alt199=2;
                    int LA199_0 = input.LA(1);

                    if ( (LA199_0==SPECIFY) ) {
                        alt199=1;
                    }
                    switch (alt199) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2411:9: SPECIFY
                            {
                            SPECIFY397=(Token)match(input,SPECIFY,FOLLOW_SPECIFY_in_defaultedType15973); if (state.failed) return type;

                            if ( state.backtracking==0 ) { DefaultedType st = new DefaultedType(null);
                                      st.setType(t); 
                                      st.setEndToken(SPECIFY397);
                                      type = st; }

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2417:7: variadicType
                    {
                    pushFollow(FOLLOW_variadicType_in_defaultedType16000);
                    variadicType398=variadicType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type =variadicType398; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "defaultedType"



    // $ANTLR start "tupleType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2421:1: tupleType returns [TupleType type] : LBRACKET (t1= defaultedType (c= COMMA t2= defaultedType )* )? RBRACKET ;
    public TupleType tupleType() throws RecognitionException {
        TupleType type = null;


        Token c=null;
        Token LBRACKET399=null;
        Token RBRACKET400=null;
        Type t1 =null;

        Type t2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2422:5: ( LBRACKET (t1= defaultedType (c= COMMA t2= defaultedType )* )? RBRACKET )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2422:7: LBRACKET (t1= defaultedType (c= COMMA t2= defaultedType )* )? RBRACKET
            {
            LBRACKET399=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_tupleType16029); if (state.failed) return type;

            if ( state.backtracking==0 ) { type = new TupleType(LBRACKET399); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2424:7: (t1= defaultedType (c= COMMA t2= defaultedType )* )?
            int alt202=2;
            int LA202_0 = input.LA(1);

            if ( ((LA202_0 >= LBRACE && LA202_0 <= LBRACKET)||LA202_0==SMALLER_OP||LA202_0==UIDENTIFIER) ) {
                alt202=1;
            }
            switch (alt202) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2425:9: t1= defaultedType (c= COMMA t2= defaultedType )*
                    {
                    pushFollow(FOLLOW_defaultedType_in_tupleType16057);
                    t1=defaultedType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type.addElementType(t1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2427:9: (c= COMMA t2= defaultedType )*
                    loop201:
                    do {
                        int alt201=2;
                        int LA201_0 = input.LA(1);

                        if ( (LA201_0==COMMA) ) {
                            alt201=1;
                        }


                        switch (alt201) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2428:11: c= COMMA t2= defaultedType
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_tupleType16091); if (state.failed) return type;

                    	    if ( state.backtracking==0 ) { type.setEndToken(c); }

                    	    pushFollow(FOLLOW_defaultedType_in_tupleType16117);
                    	    t2=defaultedType();

                    	    state._fsp--;
                    	    if (state.failed) return type;

                    	    if ( state.backtracking==0 ) { type.addElementType(t2);
                    	                type.setEndToken(null); }

                    	    }
                    	    break;

                    	default :
                    	    break loop201;
                        }
                    } while (true);


                    }
                    break;

            }


            RBRACKET400=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_tupleType16157); if (state.failed) return type;

            if ( state.backtracking==0 ) { type.setEndToken(RBRACKET400); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "tupleType"



    // $ANTLR start "groupedType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2439:1: groupedType returns [StaticType type] : SMALLER_OP t= type LARGER_OP ;
    public StaticType groupedType() throws RecognitionException {
        StaticType type = null;


        StaticType t =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2440:5: ( SMALLER_OP t= type LARGER_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2440:7: SMALLER_OP t= type LARGER_OP
            {
            match(input,SMALLER_OP,FOLLOW_SMALLER_OP_in_groupedType16186); if (state.failed) return type;

            pushFollow(FOLLOW_type_in_groupedType16196);
            t=type();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { type =t; }

            match(input,LARGER_OP,FOLLOW_LARGER_OP_in_groupedType16212); if (state.failed) return type;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "groupedType"



    // $ANTLR start "iterableType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2446:1: iterableType returns [IterableType type] : LBRACE t= variadicType RBRACE ;
    public IterableType iterableType() throws RecognitionException {
        IterableType type = null;


        Token LBRACE401=null;
        Token RBRACE402=null;
        Type t =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2447:4: ( LBRACE t= variadicType RBRACE )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2447:6: LBRACE t= variadicType RBRACE
            {
            LBRACE401=(Token)match(input,LBRACE,FOLLOW_LBRACE_in_iterableType16232); if (state.failed) return type;

            if ( state.backtracking==0 ) { type = new IterableType(LBRACE401); }

            pushFollow(FOLLOW_variadicType_in_iterableType16248);
            t=variadicType();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { type.setElementType(t); }

            RBRACE402=(Token)match(input,RBRACE,FOLLOW_RBRACE_in_iterableType16262); if (state.failed) return type;

            if ( state.backtracking==0 ) { type.setEndToken(RBRACE402); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "iterableType"



    // $ANTLR start "metaLiteral"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2455:1: metaLiteral returns [MetaLiteral meta] : d1= BACKTICK ( MODULE p1= packagePath | PACKAGE p2= packagePath | CLASS_DEFINITION ct= type | INTERFACE_DEFINITION it= type | ALIAS at= type | TYPE_CONSTRAINT tt= type | ( VALUE_MODIFIER | OBJECT_DEFINITION ) (vt= type vo= MEMBER_OP )? vm= memberName | FUNCTION_MODIFIER (ft= type fo= MEMBER_OP )? fm= memberName | ( abbreviatedType MEMBER_OP )=>at= abbreviatedType o1= MEMBER_OP m1= memberName (ta1= typeArguments )? | ( groupedType MEMBER_OP )=>gt= groupedType o2= MEMBER_OP m2= memberName (ta2= typeArguments )? |t= type |m3= memberName (ta3= typeArguments )? ) d2= BACKTICK ;
    public MetaLiteral metaLiteral() throws RecognitionException {
        MetaLiteral meta = null;


        Token d1=null;
        Token vo=null;
        Token fo=null;
        Token o1=null;
        Token o2=null;
        Token d2=null;
        Token MODULE403=null;
        Token PACKAGE404=null;
        Token CLASS_DEFINITION405=null;
        Token INTERFACE_DEFINITION406=null;
        Token ALIAS407=null;
        Token TYPE_CONSTRAINT408=null;
        Token VALUE_MODIFIER409=null;
        Token OBJECT_DEFINITION410=null;
        Token FUNCTION_MODIFIER411=null;
        ImportPath p1 =null;

        ImportPath p2 =null;

        StaticType ct =null;

        StaticType it =null;

        StaticType at =null;

        StaticType tt =null;

        StaticType vt =null;

        Identifier vm =null;

        StaticType ft =null;

        Identifier fm =null;

        Identifier m1 =null;

        TypeArgumentList ta1 =null;

        StaticType gt =null;

        Identifier m2 =null;

        TypeArgumentList ta2 =null;

        StaticType t =null;

        Identifier m3 =null;

        TypeArgumentList ta3 =null;


         TypeLiteral tl=null; 
                    MemberLiteral ml=null; 
                    PackageLiteral p=null;
                    ModuleLiteral m=null; 
                    ClassLiteral c=null;
                    InterfaceLiteral i=null;
                    AliasLiteral a=null;
                    TypeParameterLiteral tp=null;
                    ValueLiteral v=null;
                    FunctionLiteral f=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2466:5: (d1= BACKTICK ( MODULE p1= packagePath | PACKAGE p2= packagePath | CLASS_DEFINITION ct= type | INTERFACE_DEFINITION it= type | ALIAS at= type | TYPE_CONSTRAINT tt= type | ( VALUE_MODIFIER | OBJECT_DEFINITION ) (vt= type vo= MEMBER_OP )? vm= memberName | FUNCTION_MODIFIER (ft= type fo= MEMBER_OP )? fm= memberName | ( abbreviatedType MEMBER_OP )=>at= abbreviatedType o1= MEMBER_OP m1= memberName (ta1= typeArguments )? | ( groupedType MEMBER_OP )=>gt= groupedType o2= MEMBER_OP m2= memberName (ta2= typeArguments )? |t= type |m3= memberName (ta3= typeArguments )? ) d2= BACKTICK )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2466:7: d1= BACKTICK ( MODULE p1= packagePath | PACKAGE p2= packagePath | CLASS_DEFINITION ct= type | INTERFACE_DEFINITION it= type | ALIAS at= type | TYPE_CONSTRAINT tt= type | ( VALUE_MODIFIER | OBJECT_DEFINITION ) (vt= type vo= MEMBER_OP )? vm= memberName | FUNCTION_MODIFIER (ft= type fo= MEMBER_OP )? fm= memberName | ( abbreviatedType MEMBER_OP )=>at= abbreviatedType o1= MEMBER_OP m1= memberName (ta1= typeArguments )? | ( groupedType MEMBER_OP )=>gt= groupedType o2= MEMBER_OP m2= memberName (ta2= typeArguments )? |t= type |m3= memberName (ta3= typeArguments )? ) d2= BACKTICK
            {
            d1=(Token)match(input,BACKTICK,FOLLOW_BACKTICK_in_metaLiteral16300); if (state.failed) return meta;

            if ( state.backtracking==0 ) { tl = new TypeLiteral(d1);
                    meta = tl; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2469:5: ( MODULE p1= packagePath | PACKAGE p2= packagePath | CLASS_DEFINITION ct= type | INTERFACE_DEFINITION it= type | ALIAS at= type | TYPE_CONSTRAINT tt= type | ( VALUE_MODIFIER | OBJECT_DEFINITION ) (vt= type vo= MEMBER_OP )? vm= memberName | FUNCTION_MODIFIER (ft= type fo= MEMBER_OP )? fm= memberName | ( abbreviatedType MEMBER_OP )=>at= abbreviatedType o1= MEMBER_OP m1= memberName (ta1= typeArguments )? | ( groupedType MEMBER_OP )=>gt= groupedType o2= MEMBER_OP m2= memberName (ta2= typeArguments )? |t= type |m3= memberName (ta3= typeArguments )? )
            int alt209=12;
            switch ( input.LA(1) ) {
            case MODULE:
                {
                alt209=1;
                }
                break;
            case PACKAGE:
                {
                alt209=2;
                }
                break;
            case CLASS_DEFINITION:
                {
                alt209=3;
                }
                break;
            case INTERFACE_DEFINITION:
                {
                alt209=4;
                }
                break;
            case ALIAS:
                {
                alt209=5;
                }
                break;
            case TYPE_CONSTRAINT:
                {
                alt209=6;
                }
                break;
            case OBJECT_DEFINITION:
            case VALUE_MODIFIER:
                {
                alt209=7;
                }
                break;
            case FUNCTION_MODIFIER:
                {
                alt209=8;
                }
                break;
            case UIDENTIFIER:
                {
                int LA209_10 = input.LA(2);

                if ( (synpred16_Ceylon()) ) {
                    alt209=9;
                }
                else if ( (true) ) {
                    alt209=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return meta;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 209, 10, input);

                    throw nvae;

                }
                }
                break;
            case LBRACKET:
                {
                int LA209_11 = input.LA(2);

                if ( (synpred16_Ceylon()) ) {
                    alt209=9;
                }
                else if ( (true) ) {
                    alt209=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return meta;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 209, 11, input);

                    throw nvae;

                }
                }
                break;
            case LBRACE:
                {
                int LA209_12 = input.LA(2);

                if ( (synpred16_Ceylon()) ) {
                    alt209=9;
                }
                else if ( (true) ) {
                    alt209=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return meta;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 209, 12, input);

                    throw nvae;

                }
                }
                break;
            case SMALLER_OP:
                {
                int LA209_13 = input.LA(2);

                if ( (synpred16_Ceylon()) ) {
                    alt209=9;
                }
                else if ( (synpred17_Ceylon()) ) {
                    alt209=10;
                }
                else if ( (true) ) {
                    alt209=11;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return meta;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 209, 13, input);

                    throw nvae;

                }
                }
                break;
            case LIDENTIFIER:
                {
                alt209=12;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return meta;}
                NoViableAltException nvae =
                    new NoViableAltException("", 209, 0, input);

                throw nvae;

            }

            switch (alt209) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2470:7: MODULE p1= packagePath
                    {
                    MODULE403=(Token)match(input,MODULE,FOLLOW_MODULE_in_metaLiteral16322); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { m = new ModuleLiteral(d1);
                            m.setEndToken(MODULE403); 
                            meta =m; }

                    pushFollow(FOLLOW_packagePath_in_metaLiteral16340);
                    p1=packagePath();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { m.setImportPath(p1); 
                            m.setEndToken(null); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2478:7: PACKAGE p2= packagePath
                    {
                    PACKAGE404=(Token)match(input,PACKAGE,FOLLOW_PACKAGE_in_metaLiteral16362); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { p = new PackageLiteral(d1);
                            p.setEndToken(PACKAGE404); 
                            meta =p; }

                    pushFollow(FOLLOW_packagePath_in_metaLiteral16380);
                    p2=packagePath();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { p.setImportPath(p2); 
                            p.setEndToken(null); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2486:7: CLASS_DEFINITION ct= type
                    {
                    CLASS_DEFINITION405=(Token)match(input,CLASS_DEFINITION,FOLLOW_CLASS_DEFINITION_in_metaLiteral16402); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { c = new ClassLiteral(d1);
                            c.setEndToken(CLASS_DEFINITION405); 
                            meta =c; }

                    pushFollow(FOLLOW_type_in_metaLiteral16420);
                    ct=type();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { c.setType(ct); 
                            c.setEndToken(null); }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2494:7: INTERFACE_DEFINITION it= type
                    {
                    INTERFACE_DEFINITION406=(Token)match(input,INTERFACE_DEFINITION,FOLLOW_INTERFACE_DEFINITION_in_metaLiteral16442); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { i = new InterfaceLiteral(d1);
                            i.setEndToken(INTERFACE_DEFINITION406); 
                            meta =i; }

                    pushFollow(FOLLOW_type_in_metaLiteral16460);
                    it=type();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { i.setType(it); 
                            i.setEndToken(null); }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2502:7: ALIAS at= type
                    {
                    ALIAS407=(Token)match(input,ALIAS,FOLLOW_ALIAS_in_metaLiteral16482); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { a = new AliasLiteral(d1);
                            a.setEndToken(ALIAS407); 
                            meta =a; }

                    pushFollow(FOLLOW_type_in_metaLiteral16500);
                    at=type();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { a.setType(at); 
                            a.setEndToken(null); }

                    }
                    break;
                case 6 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2510:7: TYPE_CONSTRAINT tt= type
                    {
                    TYPE_CONSTRAINT408=(Token)match(input,TYPE_CONSTRAINT,FOLLOW_TYPE_CONSTRAINT_in_metaLiteral16522); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { tp = new TypeParameterLiteral(d1);
                            tp.setEndToken(TYPE_CONSTRAINT408); 
                            meta =tp; }

                    pushFollow(FOLLOW_type_in_metaLiteral16540);
                    tt=type();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { tp.setType(tt); 
                            tp.setEndToken(null); }

                    }
                    break;
                case 7 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2518:7: ( VALUE_MODIFIER | OBJECT_DEFINITION ) (vt= type vo= MEMBER_OP )? vm= memberName
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2518:7: ( VALUE_MODIFIER | OBJECT_DEFINITION )
                    int alt203=2;
                    int LA203_0 = input.LA(1);

                    if ( (LA203_0==VALUE_MODIFIER) ) {
                        alt203=1;
                    }
                    else if ( (LA203_0==OBJECT_DEFINITION) ) {
                        alt203=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return meta;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 203, 0, input);

                        throw nvae;

                    }
                    switch (alt203) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2519:9: VALUE_MODIFIER
                            {
                            VALUE_MODIFIER409=(Token)match(input,VALUE_MODIFIER,FOLLOW_VALUE_MODIFIER_in_metaLiteral16572); if (state.failed) return meta;

                            if ( state.backtracking==0 ) { v = new ValueLiteral(d1);
                                      v.setEndToken(VALUE_MODIFIER409); 
                                      meta =v; }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2524:9: OBJECT_DEFINITION
                            {
                            OBJECT_DEFINITION410=(Token)match(input,OBJECT_DEFINITION,FOLLOW_OBJECT_DEFINITION_in_metaLiteral16600); if (state.failed) return meta;

                            if ( state.backtracking==0 ) { v = new ValueLiteral(d1);
                                      v.setEndToken(OBJECT_DEFINITION410);
                                      v.setBroken(true); 
                                      meta =v; }

                            }
                            break;

                    }


                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2530:7: (vt= type vo= MEMBER_OP )?
                    int alt204=2;
                    int LA204_0 = input.LA(1);

                    if ( ((LA204_0 >= LBRACE && LA204_0 <= LBRACKET)||LA204_0==SMALLER_OP||LA204_0==UIDENTIFIER) ) {
                        alt204=1;
                    }
                    switch (alt204) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2531:9: vt= type vo= MEMBER_OP
                            {
                            pushFollow(FOLLOW_type_in_metaLiteral16638);
                            vt=type();

                            state._fsp--;
                            if (state.failed) return meta;

                            if ( state.backtracking==0 ) { v.setType(vt); 
                                      v.setEndToken(null); }

                            vo=(Token)match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_metaLiteral16660); if (state.failed) return meta;

                            if ( state.backtracking==0 ) { v.setEndToken(vo); }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_memberName_in_metaLiteral16689);
                    vm=memberName();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { v.setIdentifier(vm); 
                            v.setEndToken(null); }

                    }
                    break;
                case 8 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2541:7: FUNCTION_MODIFIER (ft= type fo= MEMBER_OP )? fm= memberName
                    {
                    FUNCTION_MODIFIER411=(Token)match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_metaLiteral16711); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { f = new FunctionLiteral(d1);
                            f.setEndToken(FUNCTION_MODIFIER411); 
                            meta =f; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2545:7: (ft= type fo= MEMBER_OP )?
                    int alt205=2;
                    int LA205_0 = input.LA(1);

                    if ( ((LA205_0 >= LBRACE && LA205_0 <= LBRACKET)||LA205_0==SMALLER_OP||LA205_0==UIDENTIFIER) ) {
                        alt205=1;
                    }
                    switch (alt205) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2546:9: ft= type fo= MEMBER_OP
                            {
                            pushFollow(FOLLOW_type_in_metaLiteral16739);
                            ft=type();

                            state._fsp--;
                            if (state.failed) return meta;

                            if ( state.backtracking==0 ) { f.setType(ft); 
                                      f.setEndToken(null); }

                            fo=(Token)match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_metaLiteral16761); if (state.failed) return meta;

                            if ( state.backtracking==0 ) { f.setEndToken(fo); }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_memberName_in_metaLiteral16790);
                    fm=memberName();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { f.setIdentifier(fm); 
                            f.setEndToken(null); }

                    }
                    break;
                case 9 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2556:7: ( abbreviatedType MEMBER_OP )=>at= abbreviatedType o1= MEMBER_OP m1= memberName (ta1= typeArguments )?
                    {
                    if ( state.backtracking==0 ) { ml = new MemberLiteral(d1);
                            meta = ml; }

                    pushFollow(FOLLOW_abbreviatedType_in_metaLiteral16836);
                    at=abbreviatedType();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { ml.setType(at); }

                    o1=(Token)match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_metaLiteral16854); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { ml.setEndToken(o1); }

                    pushFollow(FOLLOW_memberName_in_metaLiteral16872);
                    m1=memberName();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { ml.setIdentifier(m1); 
                            ml.setEndToken(null); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2566:7: (ta1= typeArguments )?
                    int alt206=2;
                    int LA206_0 = input.LA(1);

                    if ( (LA206_0==SMALLER_OP) ) {
                        alt206=1;
                    }
                    switch (alt206) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2567:9: ta1= typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_metaLiteral16900);
                            ta1=typeArguments();

                            state._fsp--;
                            if (state.failed) return meta;

                            if ( state.backtracking==0 ) { ml.setTypeArgumentList(ta1); }

                            }
                            break;

                    }


                    }
                    break;
                case 10 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2570:7: ( groupedType MEMBER_OP )=>gt= groupedType o2= MEMBER_OP m2= memberName (ta2= typeArguments )?
                    {
                    if ( state.backtracking==0 ) { ml = new MemberLiteral(d1);
                            meta = ml; }

                    pushFollow(FOLLOW_groupedType_in_metaLiteral16951);
                    gt=groupedType();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { ml.setType(gt); }

                    o2=(Token)match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_metaLiteral16969); if (state.failed) return meta;

                    if ( state.backtracking==0 ) { ml.setEndToken(o2); }

                    pushFollow(FOLLOW_memberName_in_metaLiteral16987);
                    m2=memberName();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { ml.setIdentifier(m2); 
                            ml.setEndToken(null); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2580:7: (ta2= typeArguments )?
                    int alt207=2;
                    int LA207_0 = input.LA(1);

                    if ( (LA207_0==SMALLER_OP) ) {
                        alt207=1;
                    }
                    switch (alt207) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2581:9: ta2= typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_metaLiteral17015);
                            ta2=typeArguments();

                            state._fsp--;
                            if (state.failed) return meta;

                            if ( state.backtracking==0 ) { ml.setTypeArgumentList(ta2); }

                            }
                            break;

                    }


                    }
                    break;
                case 11 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2584:7: t= type
                    {
                    pushFollow(FOLLOW_type_in_metaLiteral17044);
                    t=type();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { tl = new TypeLiteral(d1);
                            meta = tl;
                            tl.setType(t); }

                    }
                    break;
                case 12 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2588:7: m3= memberName (ta3= typeArguments )?
                    {
                    pushFollow(FOLLOW_memberName_in_metaLiteral17062);
                    m3=memberName();

                    state._fsp--;
                    if (state.failed) return meta;

                    if ( state.backtracking==0 ) { ml = new MemberLiteral(d1);
                            meta = ml;
                            ml.setIdentifier(m3); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2592:7: (ta3= typeArguments )?
                    int alt208=2;
                    int LA208_0 = input.LA(1);

                    if ( (LA208_0==SMALLER_OP) ) {
                        alt208=1;
                    }
                    switch (alt208) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2593:9: ta3= typeArguments
                            {
                            pushFollow(FOLLOW_typeArguments_in_metaLiteral17090);
                            ta3=typeArguments();

                            state._fsp--;
                            if (state.failed) return meta;

                            if ( state.backtracking==0 ) { ml.setTypeArgumentList(ta3); }

                            }
                            break;

                    }


                    }
                    break;

            }


            d2=(Token)match(input,BACKTICK,FOLLOW_BACKTICK_in_metaLiteral17125); if (state.failed) return meta;

            if ( state.backtracking==0 ) { meta.setEndToken(d2); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return meta;
    }
    // $ANTLR end "metaLiteral"



    // $ANTLR start "type"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2601:1: type returns [StaticType type] : t1= unionType ( ENTRY_OP (t2= unionType ) )? ;
    public StaticType type() throws RecognitionException {
        StaticType type = null;


        Token ENTRY_OP412=null;
        StaticType t1 =null;

        StaticType t2 =null;


         EntryType bt=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2603:5: (t1= unionType ( ENTRY_OP (t2= unionType ) )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2603:7: t1= unionType ( ENTRY_OP (t2= unionType ) )?
            {
            pushFollow(FOLLOW_unionType_in_type17165);
            t1=unionType();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { type =t1; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2605:7: ( ENTRY_OP (t2= unionType ) )?
            int alt210=2;
            int LA210_0 = input.LA(1);

            if ( (LA210_0==ENTRY_OP) ) {
                alt210=1;
            }
            switch (alt210) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2606:9: ENTRY_OP (t2= unionType )
                    {
                    ENTRY_OP412=(Token)match(input,ENTRY_OP,FOLLOW_ENTRY_OP_in_type17191); if (state.failed) return type;

                    if ( state.backtracking==0 ) { bt=new EntryType(null);
                              bt.setKeyType(type);
                              bt.setEndToken(ENTRY_OP412); 
                              type =bt; }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2611:9: (t2= unionType )
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2612:11: t2= unionType
                    {
                    pushFollow(FOLLOW_unionType_in_type17225);
                    t2=unionType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { bt.setValueType(t2);
                                bt.setEndToken(null); }

                    }


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "type"



    // $ANTLR start "unionType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2621:1: unionType returns [StaticType type] : it1= intersectionType ( (u= UNION_OP (it2= intersectionType ) )+ )? ;
    public StaticType unionType() throws RecognitionException {
        StaticType type = null;


        Token u=null;
        StaticType it1 =null;

        StaticType it2 =null;


         UnionType ut=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2623:5: (it1= intersectionType ( (u= UNION_OP (it2= intersectionType ) )+ )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2623:7: it1= intersectionType ( (u= UNION_OP (it2= intersectionType ) )+ )?
            {
            pushFollow(FOLLOW_intersectionType_in_unionType17290);
            it1=intersectionType();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { type = it1;
                    ut = new UnionType(null);
                    ut.addStaticType(type); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2627:7: ( (u= UNION_OP (it2= intersectionType ) )+ )?
            int alt212=2;
            int LA212_0 = input.LA(1);

            if ( (LA212_0==UNION_OP) ) {
                alt212=1;
            }
            switch (alt212) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2628:9: (u= UNION_OP (it2= intersectionType ) )+
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2628:9: (u= UNION_OP (it2= intersectionType ) )+
                    int cnt211=0;
                    loop211:
                    do {
                        int alt211=2;
                        int LA211_0 = input.LA(1);

                        if ( (LA211_0==UNION_OP) ) {
                            alt211=1;
                        }


                        switch (alt211) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2629:11: u= UNION_OP (it2= intersectionType )
                    	    {
                    	    u=(Token)match(input,UNION_OP,FOLLOW_UNION_OP_in_unionType17331); if (state.failed) return type;

                    	    if ( state.backtracking==0 ) { ut.setEndToken(u); }

                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2631:11: (it2= intersectionType )
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2632:13: it2= intersectionType
                    	    {
                    	    pushFollow(FOLLOW_intersectionType_in_unionType17371);
                    	    it2=intersectionType();

                    	    state._fsp--;
                    	    if (state.failed) return type;

                    	    if ( state.backtracking==0 ) { if (it2!=null) {
                    	                      ut.addStaticType(it2);
                    	                      ut.setEndToken(null); 
                    	                  } }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt211 >= 1 ) break loop211;
                    	    if (state.backtracking>0) {state.failed=true; return type;}
                                EarlyExitException eee =
                                    new EarlyExitException(211, input);
                                throw eee;
                        }
                        cnt211++;
                    } while (true);


                    if ( state.backtracking==0 ) { type = ut; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "unionType"



    // $ANTLR start "intersectionType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2645:1: intersectionType returns [StaticType type] : at1= abbreviatedType ( (i= INTERSECTION_OP (at2= abbreviatedType ) )+ )? ;
    public StaticType intersectionType() throws RecognitionException {
        StaticType type = null;


        Token i=null;
        StaticType at1 =null;

        StaticType at2 =null;


         IntersectionType it=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2647:5: (at1= abbreviatedType ( (i= INTERSECTION_OP (at2= abbreviatedType ) )+ )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2647:7: at1= abbreviatedType ( (i= INTERSECTION_OP (at2= abbreviatedType ) )+ )?
            {
            pushFollow(FOLLOW_abbreviatedType_in_intersectionType17461);
            at1=abbreviatedType();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { type = at1;
                    it = new IntersectionType(null);
                    it.addStaticType(type); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2651:7: ( (i= INTERSECTION_OP (at2= abbreviatedType ) )+ )?
            int alt214=2;
            int LA214_0 = input.LA(1);

            if ( (LA214_0==INTERSECTION_OP) ) {
                alt214=1;
            }
            switch (alt214) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2652:9: (i= INTERSECTION_OP (at2= abbreviatedType ) )+
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2652:9: (i= INTERSECTION_OP (at2= abbreviatedType ) )+
                    int cnt213=0;
                    loop213:
                    do {
                        int alt213=2;
                        int LA213_0 = input.LA(1);

                        if ( (LA213_0==INTERSECTION_OP) ) {
                            alt213=1;
                        }


                        switch (alt213) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2653:11: i= INTERSECTION_OP (at2= abbreviatedType )
                    	    {
                    	    i=(Token)match(input,INTERSECTION_OP,FOLLOW_INTERSECTION_OP_in_intersectionType17502); if (state.failed) return type;

                    	    if ( state.backtracking==0 ) { it.setEndToken(i); }

                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2655:11: (at2= abbreviatedType )
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2656:13: at2= abbreviatedType
                    	    {
                    	    pushFollow(FOLLOW_abbreviatedType_in_intersectionType17542);
                    	    at2=abbreviatedType();

                    	    state._fsp--;
                    	    if (state.failed) return type;

                    	    if ( state.backtracking==0 ) { if (at2!=null) {
                    	                      it.addStaticType(at2);
                    	                      it.setEndToken(null); 
                    	                  } }

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt213 >= 1 ) break loop213;
                    	    if (state.backtracking>0) {state.failed=true; return type;}
                                EarlyExitException eee =
                                    new EarlyExitException(213, input);
                                throw eee;
                        }
                        cnt213++;
                    } while (true);


                    if ( state.backtracking==0 ) { type = it; }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "intersectionType"



    // $ANTLR start "qualifiedOrTupleType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2669:1: qualifiedOrTupleType returns [StaticType type] : ( qualifiedType | tupleType | iterableType | groupedType );
    public StaticType qualifiedOrTupleType() throws RecognitionException {
        StaticType type = null;


        SimpleType qualifiedType413 =null;

        TupleType tupleType414 =null;

        IterableType iterableType415 =null;

        StaticType groupedType416 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2670:5: ( qualifiedType | tupleType | iterableType | groupedType )
            int alt215=4;
            switch ( input.LA(1) ) {
            case UIDENTIFIER:
                {
                alt215=1;
                }
                break;
            case LBRACKET:
                {
                alt215=2;
                }
                break;
            case LBRACE:
                {
                alt215=3;
                }
                break;
            case SMALLER_OP:
                {
                alt215=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return type;}
                NoViableAltException nvae =
                    new NoViableAltException("", 215, 0, input);

                throw nvae;

            }

            switch (alt215) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2670:7: qualifiedType
                    {
                    pushFollow(FOLLOW_qualifiedType_in_qualifiedOrTupleType17621);
                    qualifiedType413=qualifiedType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type =qualifiedType413; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2672:7: tupleType
                    {
                    pushFollow(FOLLOW_tupleType_in_qualifiedOrTupleType17638);
                    tupleType414=tupleType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type =tupleType414; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2674:7: iterableType
                    {
                    pushFollow(FOLLOW_iterableType_in_qualifiedOrTupleType17655);
                    iterableType415=iterableType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type =iterableType415; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2676:7: groupedType
                    {
                    pushFollow(FOLLOW_groupedType_in_qualifiedOrTupleType17671);
                    groupedType416=groupedType();

                    state._fsp--;
                    if (state.failed) return type;

                    if ( state.backtracking==0 ) { type =groupedType416; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "qualifiedOrTupleType"



    // $ANTLR start "abbreviatedType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2686:1: abbreviatedType returns [StaticType type] : qualifiedOrTupleType ( ( OPTIONAL | LBRACKET RBRACKET | LPAREN (t1= defaultedType ( COMMA t2= defaultedType )* )? RPAREN ) )* ;
    public StaticType abbreviatedType() throws RecognitionException {
        StaticType type = null;


        Token OPTIONAL418=null;
        Token LBRACKET419=null;
        Token RBRACKET420=null;
        Token LPAREN421=null;
        Token COMMA422=null;
        Token RPAREN423=null;
        Type t1 =null;

        Type t2 =null;

        StaticType qualifiedOrTupleType417 =null;


         FunctionType bt=null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2688:5: ( qualifiedOrTupleType ( ( OPTIONAL | LBRACKET RBRACKET | LPAREN (t1= defaultedType ( COMMA t2= defaultedType )* )? RPAREN ) )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2688:7: qualifiedOrTupleType ( ( OPTIONAL | LBRACKET RBRACKET | LPAREN (t1= defaultedType ( COMMA t2= defaultedType )* )? RPAREN ) )*
            {
            pushFollow(FOLLOW_qualifiedOrTupleType_in_abbreviatedType17712);
            qualifiedOrTupleType417=qualifiedOrTupleType();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { type =qualifiedOrTupleType417; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2690:7: ( ( OPTIONAL | LBRACKET RBRACKET | LPAREN (t1= defaultedType ( COMMA t2= defaultedType )* )? RPAREN ) )*
            loop219:
            do {
                int alt219=2;
                int LA219_0 = input.LA(1);

                if ( (LA219_0==LBRACKET||LA219_0==LPAREN||LA219_0==OPTIONAL) ) {
                    alt219=1;
                }


                switch (alt219) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2695:7: ( OPTIONAL | LBRACKET RBRACKET | LPAREN (t1= defaultedType ( COMMA t2= defaultedType )* )? RPAREN )
            	    {
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2695:7: ( OPTIONAL | LBRACKET RBRACKET | LPAREN (t1= defaultedType ( COMMA t2= defaultedType )* )? RPAREN )
            	    int alt218=3;
            	    switch ( input.LA(1) ) {
            	    case OPTIONAL:
            	        {
            	        alt218=1;
            	        }
            	        break;
            	    case LBRACKET:
            	        {
            	        alt218=2;
            	        }
            	        break;
            	    case LPAREN:
            	        {
            	        alt218=3;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return type;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 218, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt218) {
            	        case 1 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2696:9: OPTIONAL
            	            {
            	            OPTIONAL418=(Token)match(input,OPTIONAL,FOLLOW_OPTIONAL_in_abbreviatedType17774); if (state.failed) return type;

            	            if ( state.backtracking==0 ) { OptionalType ot = new OptionalType(null);
            	                      ot.setDefiniteType(type);
            	                      ot.setEndToken(OPTIONAL418);
            	                      type =ot; }

            	            }
            	            break;
            	        case 2 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2701:9: LBRACKET RBRACKET
            	            {
            	            LBRACKET419=(Token)match(input,LBRACKET,FOLLOW_LBRACKET_in_abbreviatedType17795); if (state.failed) return type;

            	            RBRACKET420=(Token)match(input,RBRACKET,FOLLOW_RBRACKET_in_abbreviatedType17797); if (state.failed) return type;

            	            if ( state.backtracking==0 ) { SequenceType st = new SequenceType(null);
            	                      st.setElementType(type);
            	                      st.setEndToken(LBRACKET419);
            	                      st.setEndToken(RBRACKET420);
            	                      type =st; }

            	            }
            	            break;
            	        case 3 :
            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2707:9: LPAREN (t1= defaultedType ( COMMA t2= defaultedType )* )? RPAREN
            	            {
            	            LPAREN421=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_abbreviatedType17818); if (state.failed) return type;

            	            if ( state.backtracking==0 ) { bt = new FunctionType(null);
            	                      bt.setEndToken(LPAREN421);
            	                      bt.setReturnType(type);
            	                      type =bt; }

            	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2712:11: (t1= defaultedType ( COMMA t2= defaultedType )* )?
            	            int alt217=2;
            	            int LA217_0 = input.LA(1);

            	            if ( ((LA217_0 >= LBRACE && LA217_0 <= LBRACKET)||LA217_0==SMALLER_OP||LA217_0==UIDENTIFIER) ) {
            	                alt217=1;
            	            }
            	            switch (alt217) {
            	                case 1 :
            	                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2713:13: t1= defaultedType ( COMMA t2= defaultedType )*
            	                    {
            	                    pushFollow(FOLLOW_defaultedType_in_abbreviatedType17856);
            	                    t1=defaultedType();

            	                    state._fsp--;
            	                    if (state.failed) return type;

            	                    if ( state.backtracking==0 ) { if (t1!=null)
            	                                      bt.addArgumentType(t1); }

            	                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2716:13: ( COMMA t2= defaultedType )*
            	                    loop216:
            	                    do {
            	                        int alt216=2;
            	                        int LA216_0 = input.LA(1);

            	                        if ( (LA216_0==COMMA) ) {
            	                            alt216=1;
            	                        }


            	                        switch (alt216) {
            	                    	case 1 :
            	                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2717:15: COMMA t2= defaultedType
            	                    	    {
            	                    	    COMMA422=(Token)match(input,COMMA,FOLLOW_COMMA_in_abbreviatedType17900); if (state.failed) return type;

            	                    	    if ( state.backtracking==0 ) { bt.setEndToken(COMMA422); }

            	                    	    pushFollow(FOLLOW_defaultedType_in_abbreviatedType17934);
            	                    	    t2=defaultedType();

            	                    	    state._fsp--;
            	                    	    if (state.failed) return type;

            	                    	    if ( state.backtracking==0 ) { if (t2!=null)
            	                    	                        bt.addArgumentType(t2); }

            	                    	    }
            	                    	    break;

            	                    	default :
            	                    	    break loop216;
            	                        }
            	                    } while (true);


            	                    }
            	                    break;

            	            }


            	            RPAREN423=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_abbreviatedType17988); if (state.failed) return type;

            	            if ( state.backtracking==0 ) { bt.setEndToken(RPAREN423); }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop219;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "abbreviatedType"



    // $ANTLR start "qualifiedType"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2730:1: qualifiedType returns [SimpleType type] : ot= typeNameWithArguments ( MEMBER_OP it= typeNameWithArguments )* ;
    public SimpleType qualifiedType() throws RecognitionException {
        SimpleType type = null;


        Token MEMBER_OP424=null;
        CeylonParser.typeNameWithArguments_return ot =null;

        CeylonParser.typeNameWithArguments_return it =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2731:5: (ot= typeNameWithArguments ( MEMBER_OP it= typeNameWithArguments )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2731:7: ot= typeNameWithArguments ( MEMBER_OP it= typeNameWithArguments )*
            {
            pushFollow(FOLLOW_typeNameWithArguments_in_qualifiedType18042);
            ot=typeNameWithArguments();

            state._fsp--;
            if (state.failed) return type;

            if ( state.backtracking==0 ) { BaseType bt = new BaseType(null);
                    bt.setIdentifier((ot!=null?ot.identifier:null));
                    if ((ot!=null?ot.typeArgumentList:null)!=null)
                        bt.setTypeArgumentList((ot!=null?ot.typeArgumentList:null));
                    type =bt; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2737:7: ( MEMBER_OP it= typeNameWithArguments )*
            loop220:
            do {
                int alt220=2;
                int LA220_0 = input.LA(1);

                if ( (LA220_0==MEMBER_OP) ) {
                    int LA220_2 = input.LA(2);

                    if ( (LA220_2==UIDENTIFIER) ) {
                        alt220=1;
                    }


                }


                switch (alt220) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2738:9: MEMBER_OP it= typeNameWithArguments
            	    {
            	    MEMBER_OP424=(Token)match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_qualifiedType18068); if (state.failed) return type;

            	    pushFollow(FOLLOW_typeNameWithArguments_in_qualifiedType18081);
            	    it=typeNameWithArguments();

            	    state._fsp--;
            	    if (state.failed) return type;

            	    if ( state.backtracking==0 ) { QualifiedType qt = new QualifiedType(MEMBER_OP424);
            	              qt.setIdentifier((it!=null?it.identifier:null));
            	              if ((it!=null?it.typeArgumentList:null)!=null)
            	                  qt.setTypeArgumentList((it!=null?it.typeArgumentList:null));
            	              qt.setOuterType(type);
            	              type =qt; }

            	    }
            	    break;

            	default :
            	    break loop220;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return type;
    }
    // $ANTLR end "qualifiedType"


    public static class typeNameWithArguments_return extends ParserRuleReturnScope {
        public Identifier identifier;
        public TypeArgumentList typeArgumentList;
    };


    // $ANTLR start "typeNameWithArguments"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2749:1: typeNameWithArguments returns [Identifier identifier, TypeArgumentList typeArgumentList] : typeName ( typeArguments )? ;
    public CeylonParser.typeNameWithArguments_return typeNameWithArguments() throws RecognitionException {
        CeylonParser.typeNameWithArguments_return retval = new CeylonParser.typeNameWithArguments_return();
        retval.start = input.LT(1);


        Identifier typeName425 =null;

        TypeArgumentList typeArguments426 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2750:5: ( typeName ( typeArguments )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2750:7: typeName ( typeArguments )?
            {
            pushFollow(FOLLOW_typeName_in_typeNameWithArguments18121);
            typeName425=typeName();

            state._fsp--;
            if (state.failed) return retval;

            if ( state.backtracking==0 ) { retval.identifier = typeName425; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2752:7: ( typeArguments )?
            int alt221=2;
            int LA221_0 = input.LA(1);

            if ( (LA221_0==SMALLER_OP) ) {
                int LA221_1 = input.LA(2);

                if ( (LA221_1==LARGER_OP||(LA221_1 >= LBRACE && LA221_1 <= LBRACKET)||LA221_1==SMALLER_OP||LA221_1==UIDENTIFIER) ) {
                    alt221=1;
                }
            }
            switch (alt221) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2753:9: typeArguments
                    {
                    pushFollow(FOLLOW_typeArguments_in_typeNameWithArguments18148);
                    typeArguments426=typeArguments();

                    state._fsp--;
                    if (state.failed) return retval;

                    if ( state.backtracking==0 ) { retval.typeArgumentList = typeArguments426; }

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typeNameWithArguments"



    // $ANTLR start "annotations"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2758:1: annotations returns [AnnotationList annotationList] : ( stringLiteral )? ( annotation )* ;
    public AnnotationList annotations() throws RecognitionException {
        AnnotationList annotationList = null;


        StringLiteral stringLiteral427 =null;

        Annotation annotation428 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2759:5: ( ( stringLiteral )? ( annotation )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2759:7: ( stringLiteral )? ( annotation )*
            {
            if ( state.backtracking==0 ) { annotationList = new AnnotationList(null); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2760:7: ( stringLiteral )?
            int alt222=2;
            int LA222_0 = input.LA(1);

            if ( (LA222_0==STRING_LITERAL||LA222_0==VERBATIM_STRING) ) {
                alt222=1;
            }
            switch (alt222) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2761:11: stringLiteral
                    {
                    pushFollow(FOLLOW_stringLiteral_in_annotations18212);
                    stringLiteral427=stringLiteral();

                    state._fsp--;
                    if (state.failed) return annotationList;

                    if ( state.backtracking==0 ) { if (stringLiteral427.getToken().getType()==VERBATIM_STRING)
                                    stringLiteral427.getToken().setType(AVERBATIM_STRING);
                                else
                                    stringLiteral427.getToken().setType(ASTRING_LITERAL);
                                AnonymousAnnotation aa = new AnonymousAnnotation(null);
                                aa.setStringLiteral(stringLiteral427);
                                annotationList.setAnonymousAnnotation(aa); }

                    }
                    break;

            }


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2770:7: ( annotation )*
            loop223:
            do {
                int alt223=2;
                int LA223_0 = input.LA(1);

                if ( (LA223_0==LIDENTIFIER) ) {
                    alt223=1;
                }


                switch (alt223) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2771:9: annotation
            	    {
            	    pushFollow(FOLLOW_annotation_in_annotations18251);
            	    annotation428=annotation();

            	    state._fsp--;
            	    if (state.failed) return annotationList;

            	    if ( state.backtracking==0 ) { annotationList.addAnnotation(annotation428); 
            	              new com.redhat.ceylon.compiler.typechecker.tree.Visitor() { 
            	                  public void visit(StringLiteral that) {
            	                      if (that.getToken().getType()==VERBATIM_STRING)
            	                          that.getToken().setType(AVERBATIM_STRING);
            	                      else
            	                          that.getToken().setType(ASTRING_LITERAL);
            	                  }
            	              }.visit(annotation428); }

            	    }
            	    break;

            	default :
            	    break loop223;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return annotationList;
    }
    // $ANTLR end "annotations"



    // $ANTLR start "annotation"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2784:1: annotation returns [Annotation annotation] : annotationName ( positionalArguments | ( namedAnnotationArgumentsStart )=> namedArguments |) ;
    public Annotation annotation() throws RecognitionException {
        Annotation annotation = null;


        Identifier annotationName429 =null;

        PositionalArgumentList positionalArguments430 =null;

        NamedArgumentList namedArguments431 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2785:5: ( annotationName ( positionalArguments | ( namedAnnotationArgumentsStart )=> namedArguments |) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2785:7: annotationName ( positionalArguments | ( namedAnnotationArgumentsStart )=> namedArguments |)
            {
            pushFollow(FOLLOW_annotationName_in_annotation18292);
            annotationName429=annotationName();

            state._fsp--;
            if (state.failed) return annotation;

            if ( state.backtracking==0 ) { annotation = new Annotation(null);
                    BaseMemberExpression bme = new BaseMemberExpression(null);
                    bme.setIdentifier(annotationName429);
                    bme.setTypeArguments( new InferredTypeArguments(null) );
                    annotation.setPrimary(bme); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2791:5: ( positionalArguments | ( namedAnnotationArgumentsStart )=> namedArguments |)
            int alt224=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt224=1;
                }
                break;
            case LBRACE:
                {
                int LA224_2 = input.LA(2);

                if ( (synpred18_Ceylon()) ) {
                    alt224=2;
                }
                else if ( (true) ) {
                    alt224=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return annotation;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 224, 2, input);

                    throw nvae;

                }
                }
                break;
            case ALIAS:
            case ASSERT:
            case ASSIGN:
            case CLASS_DEFINITION:
            case DYNAMIC:
            case FUNCTION_MODIFIER:
            case IMPORT:
            case INTERFACE_DEFINITION:
            case LBRACKET:
            case LIDENTIFIER:
            case MODULE:
            case OBJECT_DEFINITION:
            case PACKAGE:
            case SMALLER_OP:
            case UIDENTIFIER:
            case VALUE_MODIFIER:
            case VOID_MODIFIER:
                {
                alt224=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return annotation;}
                NoViableAltException nvae =
                    new NoViableAltException("", 224, 0, input);

                throw nvae;

            }

            switch (alt224) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2792:7: positionalArguments
                    {
                    pushFollow(FOLLOW_positionalArguments_in_annotation18315);
                    positionalArguments430=positionalArguments();

                    state._fsp--;
                    if (state.failed) return annotation;

                    if ( state.backtracking==0 ) { annotation.setPositionalArgumentList(positionalArguments430); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2794:7: ( namedAnnotationArgumentsStart )=> namedArguments
                    {
                    pushFollow(FOLLOW_namedArguments_in_annotation18344);
                    namedArguments431=namedArguments();

                    state._fsp--;
                    if (state.failed) return annotation;

                    if ( state.backtracking==0 ) { annotation.setNamedArgumentList(namedArguments431); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2797:7: 
                    {
                    if ( state.backtracking==0 ) { annotation.setPositionalArgumentList(new PositionalArgumentList(null)); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return annotation;
    }
    // $ANTLR end "annotation"



    // $ANTLR start "prefixOperatorStart"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2801:1: prefixOperatorStart : ( DIFFERENCE_OP | INCREMENT_OP | DECREMENT_OP | COMPLEMENT_OP );
    public void prefixOperatorStart() throws RecognitionException {
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2802:5: ( DIFFERENCE_OP | INCREMENT_OP | DECREMENT_OP | COMPLEMENT_OP )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:
            {
            if ( input.LA(1)==COMPLEMENT_OP||(input.LA(1) >= DECREMENT_OP && input.LA(1) <= DIFFERENCE_OP)||input.LA(1)==INCREMENT_OP ) {
                input.consume();
                state.errorRecovery=false;
                state.failed=false;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return ;}
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prefixOperatorStart"



    // $ANTLR start "compilerAnnotations"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2808:1: compilerAnnotations returns [List<CompilerAnnotation> annotations] : ( compilerAnnotation )* ;
    public List<CompilerAnnotation> compilerAnnotations() throws RecognitionException {
        List<CompilerAnnotation> annotations = null;


        CompilerAnnotation compilerAnnotation432 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2809:5: ( ( compilerAnnotation )* )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2809:7: ( compilerAnnotation )*
            {
            if ( state.backtracking==0 ) { annotations = new ArrayList<CompilerAnnotation>(); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2810:5: ( compilerAnnotation )*
            loop225:
            do {
                int alt225=2;
                int LA225_0 = input.LA(1);

                if ( (LA225_0==COMPILER_ANNOTATION) ) {
                    alt225=1;
                }


                switch (alt225) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2811:7: compilerAnnotation
            	    {
            	    pushFollow(FOLLOW_compilerAnnotation_in_compilerAnnotations18448);
            	    compilerAnnotation432=compilerAnnotation();

            	    state._fsp--;
            	    if (state.failed) return annotations;

            	    if ( state.backtracking==0 ) { annotations.add(compilerAnnotation432); }

            	    }
            	    break;

            	default :
            	    break loop225;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return annotations;
    }
    // $ANTLR end "compilerAnnotations"



    // $ANTLR start "compilerAnnotation"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2816:1: compilerAnnotation returns [CompilerAnnotation annotation] : COMPILER_ANNOTATION annotationName ( SEGMENT_OP stringLiteral )? ;
    public CompilerAnnotation compilerAnnotation() throws RecognitionException {
        CompilerAnnotation annotation = null;


        Token COMPILER_ANNOTATION433=null;
        Identifier annotationName434 =null;

        StringLiteral stringLiteral435 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2817:5: ( COMPILER_ANNOTATION annotationName ( SEGMENT_OP stringLiteral )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2817:7: COMPILER_ANNOTATION annotationName ( SEGMENT_OP stringLiteral )?
            {
            COMPILER_ANNOTATION433=(Token)match(input,COMPILER_ANNOTATION,FOLLOW_COMPILER_ANNOTATION_in_compilerAnnotation18488); if (state.failed) return annotation;

            if ( state.backtracking==0 ) { annotation =new CompilerAnnotation(COMPILER_ANNOTATION433); }

            pushFollow(FOLLOW_annotationName_in_compilerAnnotation18505);
            annotationName434=annotationName();

            state._fsp--;
            if (state.failed) return annotation;

            if ( state.backtracking==0 ) { annotation.setIdentifier(annotationName434); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2821:7: ( SEGMENT_OP stringLiteral )?
            int alt226=2;
            int LA226_0 = input.LA(1);

            if ( (LA226_0==SEGMENT_OP) ) {
                alt226=1;
            }
            switch (alt226) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2822:11: SEGMENT_OP stringLiteral
                    {
                    match(input,SEGMENT_OP,FOLLOW_SEGMENT_OP_in_compilerAnnotation18535); if (state.failed) return annotation;

                    pushFollow(FOLLOW_stringLiteral_in_compilerAnnotation18547);
                    stringLiteral435=stringLiteral();

                    state._fsp--;
                    if (state.failed) return annotation;

                    if ( state.backtracking==0 ) { annotation.setStringLiteral(stringLiteral435); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return annotation;
    }
    // $ANTLR end "compilerAnnotation"



    // $ANTLR start "conditions"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2828:1: conditions returns [ConditionList conditionList] : LPAREN (c1= condition (c= COMMA (c2= condition |) )* )? RPAREN ;
    public ConditionList conditions() throws RecognitionException {
        ConditionList conditionList = null;


        Token c=null;
        Token LPAREN436=null;
        Token RPAREN437=null;
        Condition c1 =null;

        Condition c2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2829:5: ( LPAREN (c1= condition (c= COMMA (c2= condition |) )* )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2829:7: LPAREN (c1= condition (c= COMMA (c2= condition |) )* )? RPAREN
            {
            LPAREN436=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_conditions18589); if (state.failed) return conditionList;

            if ( state.backtracking==0 ) { conditionList = new ConditionList(LPAREN436); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2831:7: (c1= condition (c= COMMA (c2= condition |) )* )?
            int alt229=2;
            int LA229_0 = input.LA(1);

            if ( (LA229_0==BACKTICK||LA229_0==CHAR_LITERAL||(LA229_0 >= DECREMENT_OP && LA229_0 <= DIFFERENCE_OP)||LA229_0==EXISTS||LA229_0==FLOAT_LITERAL||LA229_0==INCREMENT_OP||LA229_0==IS_OP||(LA229_0 >= LBRACE && LA229_0 <= LIDENTIFIER)||LA229_0==LPAREN||(LA229_0 >= NATURAL_LITERAL && LA229_0 <= NONEMPTY)||LA229_0==NOT_OP||(LA229_0 >= OUTER && LA229_0 <= PACKAGE)||LA229_0==SATISFIES||LA229_0==STRING_LITERAL||LA229_0==STRING_START||(LA229_0 >= SUM_OP && LA229_0 <= SUPER)||LA229_0==THIS||LA229_0==UIDENTIFIER||(LA229_0 >= VALUE_MODIFIER && LA229_0 <= VERBATIM_STRING)) ) {
                alt229=1;
            }
            switch (alt229) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2832:7: c1= condition (c= COMMA (c2= condition |) )*
                    {
                    pushFollow(FOLLOW_condition_in_conditions18615);
                    c1=condition();

                    state._fsp--;
                    if (state.failed) return conditionList;

                    if ( state.backtracking==0 ) { if (c1!=null) 
                                conditionList.addCondition(c1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2835:7: (c= COMMA (c2= condition |) )*
                    loop228:
                    do {
                        int alt228=2;
                        int LA228_0 = input.LA(1);

                        if ( (LA228_0==COMMA) ) {
                            alt228=1;
                        }


                        switch (alt228) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2835:9: c= COMMA (c2= condition |)
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_conditions18635); if (state.failed) return conditionList;

                    	    if ( state.backtracking==0 ) { conditionList.setEndToken(c); }

                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2837:9: (c2= condition |)
                    	    int alt227=2;
                    	    int LA227_0 = input.LA(1);

                    	    if ( (LA227_0==BACKTICK||LA227_0==CHAR_LITERAL||(LA227_0 >= DECREMENT_OP && LA227_0 <= DIFFERENCE_OP)||LA227_0==EXISTS||LA227_0==FLOAT_LITERAL||LA227_0==INCREMENT_OP||LA227_0==IS_OP||(LA227_0 >= LBRACE && LA227_0 <= LIDENTIFIER)||LA227_0==LPAREN||(LA227_0 >= NATURAL_LITERAL && LA227_0 <= NONEMPTY)||LA227_0==NOT_OP||(LA227_0 >= OUTER && LA227_0 <= PACKAGE)||LA227_0==SATISFIES||LA227_0==STRING_LITERAL||LA227_0==STRING_START||(LA227_0 >= SUM_OP && LA227_0 <= SUPER)||LA227_0==THIS||LA227_0==UIDENTIFIER||(LA227_0 >= VALUE_MODIFIER && LA227_0 <= VERBATIM_STRING)) ) {
                    	        alt227=1;
                    	    }
                    	    else if ( (LA227_0==COMMA||LA227_0==RPAREN) ) {
                    	        alt227=2;
                    	    }
                    	    else {
                    	        if (state.backtracking>0) {state.failed=true; return conditionList;}
                    	        NoViableAltException nvae =
                    	            new NoViableAltException("", 227, 0, input);

                    	        throw nvae;

                    	    }
                    	    switch (alt227) {
                    	        case 1 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2838:11: c2= condition
                    	            {
                    	            pushFollow(FOLLOW_condition_in_conditions18670);
                    	            c2=condition();

                    	            state._fsp--;
                    	            if (state.failed) return conditionList;

                    	            if ( state.backtracking==0 ) { if (c2!=null) 
                    	                            conditionList.addCondition(c2);
                    	                        conditionList.setEndToken(null); }

                    	            }
                    	            break;
                    	        case 2 :
                    	            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2842:11: 
                    	            {
                    	            if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                    	                          new MismatchedTokenException(LIDENTIFIER, input)); }

                    	            }
                    	            break;

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop228;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN437=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_conditions18732); if (state.failed) return conditionList;

            if ( state.backtracking==0 ) { conditionList.setEndToken(RPAREN437); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return conditionList;
    }
    // $ANTLR end "conditions"



    // $ANTLR start "condition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2851:1: condition returns [Condition condition] : ( existsCondition | nonemptyCondition | isCondition | satisfiesCondition | booleanCondition );
    public Condition condition() throws RecognitionException {
        Condition condition = null;


        ExistsCondition existsCondition438 =null;

        NonemptyCondition nonemptyCondition439 =null;

        IsCondition isCondition440 =null;

        SatisfiesCondition satisfiesCondition441 =null;

        BooleanCondition booleanCondition442 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2852:5: ( existsCondition | nonemptyCondition | isCondition | satisfiesCondition | booleanCondition )
            int alt230=5;
            switch ( input.LA(1) ) {
            case EXISTS:
                {
                alt230=1;
                }
                break;
            case NONEMPTY:
                {
                alt230=2;
                }
                break;
            case NOT_OP:
                {
                int LA230_3 = input.LA(2);

                if ( (LA230_3==IS_OP) ) {
                    alt230=3;
                }
                else if ( (LA230_3==BACKTICK||LA230_3==CHAR_LITERAL||(LA230_3 >= DECREMENT_OP && LA230_3 <= DIFFERENCE_OP)||LA230_3==FLOAT_LITERAL||LA230_3==INCREMENT_OP||(LA230_3 >= LBRACE && LA230_3 <= LIDENTIFIER)||LA230_3==LPAREN||LA230_3==NATURAL_LITERAL||LA230_3==NOT_OP||(LA230_3 >= OUTER && LA230_3 <= PACKAGE)||LA230_3==STRING_LITERAL||LA230_3==STRING_START||(LA230_3 >= SUM_OP && LA230_3 <= SUPER)||LA230_3==THIS||LA230_3==UIDENTIFIER||(LA230_3 >= VALUE_MODIFIER && LA230_3 <= VERBATIM_STRING)) ) {
                    alt230=5;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 230, 3, input);

                    throw nvae;

                }
                }
                break;
            case IS_OP:
                {
                alt230=3;
                }
                break;
            case SATISFIES:
                {
                alt230=4;
                }
                break;
            case BACKTICK:
            case CHAR_LITERAL:
            case DECREMENT_OP:
            case DIFFERENCE_OP:
            case FLOAT_LITERAL:
            case INCREMENT_OP:
            case LBRACE:
            case LBRACKET:
            case LIDENTIFIER:
            case LPAREN:
            case NATURAL_LITERAL:
            case OUTER:
            case PACKAGE:
            case STRING_LITERAL:
            case STRING_START:
            case SUM_OP:
            case SUPER:
            case THIS:
            case UIDENTIFIER:
            case VALUE_MODIFIER:
            case VERBATIM_STRING:
                {
                alt230=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return condition;}
                NoViableAltException nvae =
                    new NoViableAltException("", 230, 0, input);

                throw nvae;

            }

            switch (alt230) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2852:7: existsCondition
                    {
                    pushFollow(FOLLOW_existsCondition_in_condition18761);
                    existsCondition438=existsCondition();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition =existsCondition438; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2854:7: nonemptyCondition
                    {
                    pushFollow(FOLLOW_nonemptyCondition_in_condition18777);
                    nonemptyCondition439=nonemptyCondition();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition =nonemptyCondition439; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2856:7: isCondition
                    {
                    pushFollow(FOLLOW_isCondition_in_condition18793);
                    isCondition440=isCondition();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition =isCondition440; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2858:7: satisfiesCondition
                    {
                    pushFollow(FOLLOW_satisfiesCondition_in_condition18810);
                    satisfiesCondition441=satisfiesCondition();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition =satisfiesCondition441; }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2860:7: booleanCondition
                    {
                    pushFollow(FOLLOW_booleanCondition_in_condition18826);
                    booleanCondition442=booleanCondition();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition =booleanCondition442; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "condition"



    // $ANTLR start "booleanCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2864:1: booleanCondition returns [BooleanCondition condition] : expression ;
    public BooleanCondition booleanCondition() throws RecognitionException {
        BooleanCondition condition = null;


        Expression expression443 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2865:5: ( expression )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2865:7: expression
            {
            if ( state.backtracking==0 ) { condition = new BooleanCondition(null); }

            pushFollow(FOLLOW_expression_in_booleanCondition18867);
            expression443=expression();

            state._fsp--;
            if (state.failed) return condition;

            if ( state.backtracking==0 ) { condition.setExpression(expression443); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "booleanCondition"



    // $ANTLR start "existsCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2870:1: existsCondition returns [ExistsCondition condition] : EXISTS ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression ) ;
    public ExistsCondition existsCondition() throws RecognitionException {
        ExistsCondition condition = null;


        Token EXISTS444=null;
        Variable specifiedVariable445 =null;

        Variable impliedVariable446 =null;

        Expression expression447 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2871:5: ( EXISTS ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2871:7: EXISTS ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression )
            {
            EXISTS444=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_existsCondition18900); if (state.failed) return condition;

            if ( state.backtracking==0 ) { condition = new ExistsCondition(EXISTS444); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2873:5: ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression )
            int alt231=3;
            int LA231_0 = input.LA(1);

            if ( (LA231_0==COMPILER_ANNOTATION) && (synpred19_Ceylon())) {
                alt231=1;
            }
            else if ( (LA231_0==UIDENTIFIER) ) {
                int LA231_2 = input.LA(2);

                if ( (synpred19_Ceylon()) ) {
                    alt231=1;
                }
                else if ( (true) ) {
                    alt231=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 231, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA231_0==LBRACKET) ) {
                int LA231_3 = input.LA(2);

                if ( (synpred19_Ceylon()) ) {
                    alt231=1;
                }
                else if ( (true) ) {
                    alt231=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 231, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA231_0==LBRACE) ) {
                int LA231_4 = input.LA(2);

                if ( (synpred19_Ceylon()) ) {
                    alt231=1;
                }
                else if ( (true) ) {
                    alt231=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 231, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA231_0==SMALLER_OP) && (synpred19_Ceylon())) {
                alt231=1;
            }
            else if ( (LA231_0==VOID_MODIFIER) && (synpred19_Ceylon())) {
                alt231=1;
            }
            else if ( (LA231_0==FUNCTION_MODIFIER) && (synpred19_Ceylon())) {
                alt231=1;
            }
            else if ( (LA231_0==VALUE_MODIFIER) ) {
                int LA231_8 = input.LA(2);

                if ( (synpred19_Ceylon()) ) {
                    alt231=1;
                }
                else if ( (true) ) {
                    alt231=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 231, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA231_0==LIDENTIFIER) ) {
                int LA231_9 = input.LA(2);

                if ( (synpred19_Ceylon()) ) {
                    alt231=1;
                }
                else if ( (synpred20_Ceylon()) ) {
                    alt231=2;
                }
                else if ( (true) ) {
                    alt231=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 231, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA231_0==BACKTICK||LA231_0==CHAR_LITERAL||(LA231_0 >= DECREMENT_OP && LA231_0 <= DIFFERENCE_OP)||LA231_0==FLOAT_LITERAL||LA231_0==INCREMENT_OP||LA231_0==LPAREN||LA231_0==NATURAL_LITERAL||LA231_0==NOT_OP||(LA231_0 >= OUTER && LA231_0 <= PACKAGE)||LA231_0==STRING_LITERAL||LA231_0==STRING_START||(LA231_0 >= SUM_OP && LA231_0 <= SUPER)||LA231_0==THIS||LA231_0==VERBATIM_STRING) ) {
                alt231=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return condition;}
                NoViableAltException nvae =
                    new NoViableAltException("", 231, 0, input);

                throw nvae;

            }
            switch (alt231) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2873:7: ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable
                    {
                    pushFollow(FOLLOW_specifiedVariable_in_existsCondition18937);
                    specifiedVariable445=specifiedVariable();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setVariable(specifiedVariable445); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2877:9: ( LIDENTIFIER )=> impliedVariable
                    {
                    pushFollow(FOLLOW_impliedVariable_in_existsCondition18972);
                    impliedVariable446=impliedVariable();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setVariable(impliedVariable446); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2879:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_existsCondition18992);
                    expression447=expression();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setBrokenExpression(expression447); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "existsCondition"



    // $ANTLR start "nonemptyCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2884:1: nonemptyCondition returns [NonemptyCondition condition] : NONEMPTY ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression ) ;
    public NonemptyCondition nonemptyCondition() throws RecognitionException {
        NonemptyCondition condition = null;


        Token NONEMPTY448=null;
        Variable specifiedVariable449 =null;

        Variable impliedVariable450 =null;

        Expression expression451 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2885:5: ( NONEMPTY ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2885:7: NONEMPTY ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression )
            {
            NONEMPTY448=(Token)match(input,NONEMPTY,FOLLOW_NONEMPTY_in_nonemptyCondition19033); if (state.failed) return condition;

            if ( state.backtracking==0 ) { condition = new NonemptyCondition(NONEMPTY448); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2887:5: ( ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable | ( LIDENTIFIER )=> impliedVariable | expression )
            int alt232=3;
            int LA232_0 = input.LA(1);

            if ( (LA232_0==COMPILER_ANNOTATION) && (synpred21_Ceylon())) {
                alt232=1;
            }
            else if ( (LA232_0==UIDENTIFIER) ) {
                int LA232_2 = input.LA(2);

                if ( (synpred21_Ceylon()) ) {
                    alt232=1;
                }
                else if ( (true) ) {
                    alt232=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 232, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA232_0==LBRACKET) ) {
                int LA232_3 = input.LA(2);

                if ( (synpred21_Ceylon()) ) {
                    alt232=1;
                }
                else if ( (true) ) {
                    alt232=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 232, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA232_0==LBRACE) ) {
                int LA232_4 = input.LA(2);

                if ( (synpred21_Ceylon()) ) {
                    alt232=1;
                }
                else if ( (true) ) {
                    alt232=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 232, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA232_0==SMALLER_OP) && (synpred21_Ceylon())) {
                alt232=1;
            }
            else if ( (LA232_0==VOID_MODIFIER) && (synpred21_Ceylon())) {
                alt232=1;
            }
            else if ( (LA232_0==FUNCTION_MODIFIER) && (synpred21_Ceylon())) {
                alt232=1;
            }
            else if ( (LA232_0==VALUE_MODIFIER) ) {
                int LA232_8 = input.LA(2);

                if ( (synpred21_Ceylon()) ) {
                    alt232=1;
                }
                else if ( (true) ) {
                    alt232=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 232, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA232_0==LIDENTIFIER) ) {
                int LA232_9 = input.LA(2);

                if ( (synpred21_Ceylon()) ) {
                    alt232=1;
                }
                else if ( (synpred22_Ceylon()) ) {
                    alt232=2;
                }
                else if ( (true) ) {
                    alt232=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 232, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA232_0==BACKTICK||LA232_0==CHAR_LITERAL||(LA232_0 >= DECREMENT_OP && LA232_0 <= DIFFERENCE_OP)||LA232_0==FLOAT_LITERAL||LA232_0==INCREMENT_OP||LA232_0==LPAREN||LA232_0==NATURAL_LITERAL||LA232_0==NOT_OP||(LA232_0 >= OUTER && LA232_0 <= PACKAGE)||LA232_0==STRING_LITERAL||LA232_0==STRING_START||(LA232_0 >= SUM_OP && LA232_0 <= SUPER)||LA232_0==THIS||LA232_0==VERBATIM_STRING) ) {
                alt232=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return condition;}
                NoViableAltException nvae =
                    new NoViableAltException("", 232, 0, input);

                throw nvae;

            }
            switch (alt232) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2887:7: ( compilerAnnotations ( declarationStart | specificationStart ) )=> specifiedVariable
                    {
                    pushFollow(FOLLOW_specifiedVariable_in_nonemptyCondition19068);
                    specifiedVariable449=specifiedVariable();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setVariable(specifiedVariable449); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2891:7: ( LIDENTIFIER )=> impliedVariable
                    {
                    pushFollow(FOLLOW_impliedVariable_in_nonemptyCondition19097);
                    impliedVariable450=impliedVariable();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setVariable(impliedVariable450); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2893:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_nonemptyCondition19114);
                    expression451=expression();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setBrokenExpression(expression451); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "nonemptyCondition"



    // $ANTLR start "isCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2898:1: isCondition returns [IsCondition condition] : ( NOT_OP )? IS_OP type ( ( LIDENTIFIER SPECIFY )=> memberName specifier | impliedVariable ) ;
    public IsCondition isCondition() throws RecognitionException {
        IsCondition condition = null;


        Token NOT_OP452=null;
        Token IS_OP453=null;
        StaticType type454 =null;

        Identifier memberName455 =null;

        SpecifierExpression specifier456 =null;

        Variable impliedVariable457 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2899:5: ( ( NOT_OP )? IS_OP type ( ( LIDENTIFIER SPECIFY )=> memberName specifier | impliedVariable ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2899:7: ( NOT_OP )? IS_OP type ( ( LIDENTIFIER SPECIFY )=> memberName specifier | impliedVariable )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2899:7: ( NOT_OP )?
            int alt233=2;
            int LA233_0 = input.LA(1);

            if ( (LA233_0==NOT_OP) ) {
                alt233=1;
            }
            switch (alt233) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2900:9: NOT_OP
                    {
                    NOT_OP452=(Token)match(input,NOT_OP,FOLLOW_NOT_OP_in_isCondition19159); if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition = new IsCondition(NOT_OP452);
                              condition.setNot(true); }

                    }
                    break;

            }


            IS_OP453=(Token)match(input,IS_OP,FOLLOW_IS_OP_in_isCondition19186); if (state.failed) return condition;

            if ( state.backtracking==0 ) { if (condition==null)
                        condition = new IsCondition(IS_OP453); }

            pushFollow(FOLLOW_type_in_isCondition19203);
            type454=type();

            state._fsp--;
            if (state.failed) return condition;

            if ( state.backtracking==0 ) { condition.setType(type454); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2909:5: ( ( LIDENTIFIER SPECIFY )=> memberName specifier | impliedVariable )
            int alt234=2;
            int LA234_0 = input.LA(1);

            if ( (LA234_0==LIDENTIFIER) ) {
                int LA234_1 = input.LA(2);

                if ( (LA234_1==SPECIFY) && (synpred23_Ceylon())) {
                    alt234=1;
                }
                else if ( (LA234_1==COMMA||LA234_1==RPAREN) ) {
                    alt234=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return condition;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 234, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return condition;}
                NoViableAltException nvae =
                    new NoViableAltException("", 234, 0, input);

                throw nvae;

            }
            switch (alt234) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2909:7: ( LIDENTIFIER SPECIFY )=> memberName specifier
                    {
                    if ( state.backtracking==0 ) { Variable v = new Variable(null);
                            v.setType(new ValueModifier(null)); 
                            condition.setVariable(v); }

                    pushFollow(FOLLOW_memberName_in_isCondition19241);
                    memberName455=memberName();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.getVariable().setIdentifier(memberName455); }

                    pushFollow(FOLLOW_specifier_in_isCondition19257);
                    specifier456=specifier();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.getVariable().setSpecifierExpression(specifier456); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2918:7: impliedVariable
                    {
                    pushFollow(FOLLOW_impliedVariable_in_isCondition19280);
                    impliedVariable457=impliedVariable();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setVariable(impliedVariable457); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "isCondition"



    // $ANTLR start "satisfiesCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2923:1: satisfiesCondition returns [SatisfiesCondition condition] : SATISFIES (t1= qualifiedType t2= qualifiedType )? ;
    public SatisfiesCondition satisfiesCondition() throws RecognitionException {
        SatisfiesCondition condition = null;


        Token SATISFIES458=null;
        SimpleType t1 =null;

        SimpleType t2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2924:5: ( SATISFIES (t1= qualifiedType t2= qualifiedType )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2924:7: SATISFIES (t1= qualifiedType t2= qualifiedType )?
            {
            SATISFIES458=(Token)match(input,SATISFIES,FOLLOW_SATISFIES_in_satisfiesCondition19316); if (state.failed) return condition;

            if ( state.backtracking==0 ) { condition = new SatisfiesCondition(SATISFIES458); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2926:7: (t1= qualifiedType t2= qualifiedType )?
            int alt235=2;
            int LA235_0 = input.LA(1);

            if ( (LA235_0==UIDENTIFIER) ) {
                alt235=1;
            }
            switch (alt235) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2926:8: t1= qualifiedType t2= qualifiedType
                    {
                    pushFollow(FOLLOW_qualifiedType_in_satisfiesCondition19336);
                    t1=qualifiedType();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setLeftType(t1); }

                    pushFollow(FOLLOW_qualifiedType_in_satisfiesCondition19355);
                    t2=qualifiedType();

                    state._fsp--;
                    if (state.failed) return condition;

                    if ( state.backtracking==0 ) { condition.setRightType(t2); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return condition;
    }
    // $ANTLR end "satisfiesCondition"



    // $ANTLR start "controlStatement"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2932:1: controlStatement returns [ControlStatement controlStatement] : ( ifElse | switchCaseElse | whileLoop | forElse | tryCatchFinally | dynamic );
    public ControlStatement controlStatement() throws RecognitionException {
        ControlStatement controlStatement = null;


        IfStatement ifElse459 =null;

        SwitchStatement switchCaseElse460 =null;

        WhileStatement whileLoop461 =null;

        ForStatement forElse462 =null;

        TryCatchStatement tryCatchFinally463 =null;

        DynamicStatement dynamic464 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2933:5: ( ifElse | switchCaseElse | whileLoop | forElse | tryCatchFinally | dynamic )
            int alt236=6;
            switch ( input.LA(1) ) {
            case IF_CLAUSE:
                {
                alt236=1;
                }
                break;
            case SWITCH_CLAUSE:
                {
                alt236=2;
                }
                break;
            case WHILE_CLAUSE:
                {
                alt236=3;
                }
                break;
            case FOR_CLAUSE:
                {
                alt236=4;
                }
                break;
            case TRY_CLAUSE:
                {
                alt236=5;
                }
                break;
            case DYNAMIC:
                {
                alt236=6;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return controlStatement;}
                NoViableAltException nvae =
                    new NoViableAltException("", 236, 0, input);

                throw nvae;

            }

            switch (alt236) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2933:7: ifElse
                    {
                    pushFollow(FOLLOW_ifElse_in_controlStatement19387);
                    ifElse459=ifElse();

                    state._fsp--;
                    if (state.failed) return controlStatement;

                    if ( state.backtracking==0 ) { controlStatement =ifElse459; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2935:7: switchCaseElse
                    {
                    pushFollow(FOLLOW_switchCaseElse_in_controlStatement19404);
                    switchCaseElse460=switchCaseElse();

                    state._fsp--;
                    if (state.failed) return controlStatement;

                    if ( state.backtracking==0 ) { controlStatement =switchCaseElse460; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2937:7: whileLoop
                    {
                    pushFollow(FOLLOW_whileLoop_in_controlStatement19421);
                    whileLoop461=whileLoop();

                    state._fsp--;
                    if (state.failed) return controlStatement;

                    if ( state.backtracking==0 ) { controlStatement =whileLoop461; }

                    }
                    break;
                case 4 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2939:7: forElse
                    {
                    pushFollow(FOLLOW_forElse_in_controlStatement19438);
                    forElse462=forElse();

                    state._fsp--;
                    if (state.failed) return controlStatement;

                    if ( state.backtracking==0 ) { controlStatement =forElse462; }

                    }
                    break;
                case 5 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2941:7: tryCatchFinally
                    {
                    pushFollow(FOLLOW_tryCatchFinally_in_controlStatement19455);
                    tryCatchFinally463=tryCatchFinally();

                    state._fsp--;
                    if (state.failed) return controlStatement;

                    if ( state.backtracking==0 ) { controlStatement =tryCatchFinally463; }

                    }
                    break;
                case 6 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2943:7: dynamic
                    {
                    pushFollow(FOLLOW_dynamic_in_controlStatement19471);
                    dynamic464=dynamic();

                    state._fsp--;
                    if (state.failed) return controlStatement;

                    if ( state.backtracking==0 ) { controlStatement =dynamic464; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return controlStatement;
    }
    // $ANTLR end "controlStatement"



    // $ANTLR start "controlBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2947:1: controlBlock returns [Block block] : ( ( LBRACE )=>b= block |) ;
    public Block controlBlock() throws RecognitionException {
        Block block = null;


        Block b =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2948:5: ( ( ( LBRACE )=>b= block |) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2948:7: ( ( LBRACE )=>b= block |)
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2948:7: ( ( LBRACE )=>b= block |)
            int alt237=2;
            int LA237_0 = input.LA(1);

            if ( (LA237_0==LBRACE) ) {
                int LA237_1 = input.LA(2);

                if ( (synpred24_Ceylon()) ) {
                    alt237=1;
                }
                else if ( (true) ) {
                    alt237=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return block;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 237, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA237_0==ALIAS||(LA237_0 >= ASSERT && LA237_0 <= ASSIGN)||(LA237_0 >= BACKTICK && LA237_0 <= BREAK)||(LA237_0 >= CATCH_CLAUSE && LA237_0 <= CLASS_DEFINITION)||LA237_0==COMPILER_ANNOTATION||LA237_0==CONTINUE||(LA237_0 >= DECREMENT_OP && LA237_0 <= DIFFERENCE_OP)||LA237_0==DYNAMIC||LA237_0==ELSE_CLAUSE||(LA237_0 >= FINALLY_CLAUSE && LA237_0 <= FUNCTION_MODIFIER)||LA237_0==IF_CLAUSE||(LA237_0 >= INCREMENT_OP && LA237_0 <= INTERFACE_DEFINITION)||(LA237_0 >= LBRACKET && LA237_0 <= LIDENTIFIER)||LA237_0==LPAREN||LA237_0==NATURAL_LITERAL||(LA237_0 >= NOT_OP && LA237_0 <= OBJECT_DEFINITION)||(LA237_0 >= OUTER && LA237_0 <= PACKAGE)||LA237_0==RBRACE||LA237_0==RETURN||LA237_0==SMALLER_OP||LA237_0==STRING_LITERAL||LA237_0==STRING_START||(LA237_0 >= SUM_OP && LA237_0 <= SWITCH_CLAUSE)||(LA237_0 >= THIS && LA237_0 <= TRY_CLAUSE)||LA237_0==UIDENTIFIER||(LA237_0 >= VALUE_MODIFIER && LA237_0 <= WHILE_CLAUSE)) ) {
                alt237=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return block;}
                NoViableAltException nvae =
                    new NoViableAltException("", 237, 0, input);

                throw nvae;

            }
            switch (alt237) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2948:9: ( LBRACE )=>b= block
                    {
                    pushFollow(FOLLOW_block_in_controlBlock19509);
                    b=block();

                    state._fsp--;
                    if (state.failed) return block;

                    if ( state.backtracking==0 ) { block =b; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2950:9: 
                    {
                    if ( state.backtracking==0 ) { displayRecognitionError(getTokenNames(), 
                                    new MismatchedTokenException(LBRACE, input)); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return block;
    }
    // $ANTLR end "controlBlock"



    // $ANTLR start "dynamic"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2955:1: dynamic returns [DynamicStatement statement] : DYNAMIC controlBlock ;
    public DynamicStatement dynamic() throws RecognitionException {
        DynamicStatement statement = null;


        Token DYNAMIC465=null;
        Block controlBlock466 =null;


         DynamicClause dc = null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2957:5: ( DYNAMIC controlBlock )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2957:7: DYNAMIC controlBlock
            {
            if ( state.backtracking==0 ) { statement =new DynamicStatement(null); }

            DYNAMIC465=(Token)match(input,DYNAMIC,FOLLOW_DYNAMIC_in_dynamic19575); if (state.failed) return statement;

            if ( state.backtracking==0 ) { dc = new DynamicClause(DYNAMIC465);
                    statement.setDynamicClause(dc); }

            pushFollow(FOLLOW_controlBlock_in_dynamic19592);
            controlBlock466=controlBlock();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { dc.setBlock(controlBlock466); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "dynamic"



    // $ANTLR start "ifElse"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2965:1: ifElse returns [IfStatement statement] : ifBlock ( elseBlock )? ;
    public IfStatement ifElse() throws RecognitionException {
        IfStatement statement = null;


        IfClause ifBlock467 =null;

        ElseClause elseBlock468 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2966:5: ( ifBlock ( elseBlock )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2966:7: ifBlock ( elseBlock )?
            {
            if ( state.backtracking==0 ) { statement =new IfStatement(null); }

            pushFollow(FOLLOW_ifBlock_in_ifElse19629);
            ifBlock467=ifBlock();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { statement.setIfClause(ifBlock467); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2969:7: ( elseBlock )?
            int alt238=2;
            int LA238_0 = input.LA(1);

            if ( (LA238_0==ELSE_CLAUSE) ) {
                alt238=1;
            }
            switch (alt238) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2970:9: elseBlock
                    {
                    pushFollow(FOLLOW_elseBlock_in_ifElse19657);
                    elseBlock468=elseBlock();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement.setElseClause(elseBlock468); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "ifElse"



    // $ANTLR start "ifBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2975:1: ifBlock returns [IfClause clause] : IF_CLAUSE conditions controlBlock ;
    public IfClause ifBlock() throws RecognitionException {
        IfClause clause = null;


        Token IF_CLAUSE469=null;
        ConditionList conditions470 =null;

        Block controlBlock471 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2976:5: ( IF_CLAUSE conditions controlBlock )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2976:7: IF_CLAUSE conditions controlBlock
            {
            IF_CLAUSE469=(Token)match(input,IF_CLAUSE,FOLLOW_IF_CLAUSE_in_ifBlock19697); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new IfClause(IF_CLAUSE469); }

            pushFollow(FOLLOW_conditions_in_ifBlock19714);
            conditions470=conditions();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setConditionList(conditions470); }

            pushFollow(FOLLOW_controlBlock_in_ifBlock19730);
            controlBlock471=controlBlock();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(controlBlock471); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "ifBlock"



    // $ANTLR start "elseBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2984:1: elseBlock returns [ElseClause clause] : ELSE_CLAUSE ( elseIf | block ) ;
    public ElseClause elseBlock() throws RecognitionException {
        ElseClause clause = null;


        Token ELSE_CLAUSE472=null;
        Block elseIf473 =null;

        Block block474 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2985:5: ( ELSE_CLAUSE ( elseIf | block ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2985:7: ELSE_CLAUSE ( elseIf | block )
            {
            ELSE_CLAUSE472=(Token)match(input,ELSE_CLAUSE,FOLLOW_ELSE_CLAUSE_in_elseBlock19759); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new ElseClause(ELSE_CLAUSE472); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2987:7: ( elseIf | block )
            int alt239=2;
            int LA239_0 = input.LA(1);

            if ( (LA239_0==IF_CLAUSE) ) {
                alt239=1;
            }
            else if ( (LA239_0==LBRACE) ) {
                alt239=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return clause;}
                NoViableAltException nvae =
                    new NoViableAltException("", 239, 0, input);

                throw nvae;

            }
            switch (alt239) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2988:9: elseIf
                    {
                    pushFollow(FOLLOW_elseIf_in_elseBlock19786);
                    elseIf473=elseIf();

                    state._fsp--;
                    if (state.failed) return clause;

                    if ( state.backtracking==0 ) { clause.setBlock(elseIf473); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2991:9: block
                    {
                    pushFollow(FOLLOW_block_in_elseBlock19816);
                    block474=block();

                    state._fsp--;
                    if (state.failed) return clause;

                    if ( state.backtracking==0 ) { clause.setBlock(block474); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "elseBlock"



    // $ANTLR start "elseIf"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2996:1: elseIf returns [Block block] : ifElse ;
    public Block elseIf() throws RecognitionException {
        Block block = null;


        IfStatement ifElse475 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2997:5: ( ifElse )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2997:7: ifElse
            {
            pushFollow(FOLLOW_ifElse_in_elseIf19855);
            ifElse475=ifElse();

            state._fsp--;
            if (state.failed) return block;

            if ( state.backtracking==0 ) { block = new Block(null);
                    block.addStatement(ifElse475); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return block;
    }
    // $ANTLR end "elseIf"



    // $ANTLR start "switchCaseElse"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3002:1: switchCaseElse returns [SwitchStatement statement] : switchHeader cases ;
    public SwitchStatement switchCaseElse() throws RecognitionException {
        SwitchStatement statement = null;


        SwitchClause switchHeader476 =null;

        SwitchCaseList cases477 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3003:5: ( switchHeader cases )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3003:7: switchHeader cases
            {
            if ( state.backtracking==0 ) { statement = new SwitchStatement(null); }

            pushFollow(FOLLOW_switchHeader_in_switchCaseElse19892);
            switchHeader476=switchHeader();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { statement.setSwitchClause(switchHeader476); }

            pushFollow(FOLLOW_cases_in_switchCaseElse19909);
            cases477=cases();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { statement.setSwitchCaseList(cases477);
                    Expression ex = switchHeader476.getExpression();
                    if (ex!=null && ex.getTerm() instanceof BaseMemberExpression) {
                      Identifier id = ((BaseMemberExpression) ex.getTerm()).getIdentifier();
                      for (CaseClause cc: cases477.getCaseClauses()) {
                        CaseItem item = cc.getCaseItem();
                        if (item instanceof IsCase) {
                          IsCase ic = (IsCase) item;
                          Variable v = new Variable(null);
                          v.setType(new SyntheticVariable(null));
                          v.setIdentifier(id);
                          SpecifierExpression se = new SpecifierExpression(null);
                          Expression e = new Expression(null);
                          BaseMemberExpression bme = new BaseMemberExpression(null);
                          bme.setIdentifier(id);
                          bme.setTypeArguments( new InferredTypeArguments(null) );
                          e.setTerm(bme);
                          se.setExpression(e);
                          v.setSpecifierExpression(se);
                          ic.setVariable(v);
                        }
                      } 
                    } 
                  }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "switchCaseElse"



    // $ANTLR start "switchHeader"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3033:1: switchHeader returns [SwitchClause clause] : SWITCH_CLAUSE LPAREN ( expression )? RPAREN ;
    public SwitchClause switchHeader() throws RecognitionException {
        SwitchClause clause = null;


        Token SWITCH_CLAUSE478=null;
        Expression expression479 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3034:5: ( SWITCH_CLAUSE LPAREN ( expression )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3034:7: SWITCH_CLAUSE LPAREN ( expression )? RPAREN
            {
            SWITCH_CLAUSE478=(Token)match(input,SWITCH_CLAUSE,FOLLOW_SWITCH_CLAUSE_in_switchHeader19938); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new SwitchClause(SWITCH_CLAUSE478); }

            match(input,LPAREN,FOLLOW_LPAREN_in_switchHeader19955); if (state.failed) return clause;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3037:7: ( expression )?
            int alt240=2;
            int LA240_0 = input.LA(1);

            if ( (LA240_0==BACKTICK||LA240_0==CHAR_LITERAL||(LA240_0 >= DECREMENT_OP && LA240_0 <= DIFFERENCE_OP)||LA240_0==FLOAT_LITERAL||LA240_0==INCREMENT_OP||(LA240_0 >= LBRACE && LA240_0 <= LIDENTIFIER)||LA240_0==LPAREN||LA240_0==NATURAL_LITERAL||LA240_0==NOT_OP||(LA240_0 >= OUTER && LA240_0 <= PACKAGE)||LA240_0==STRING_LITERAL||LA240_0==STRING_START||(LA240_0 >= SUM_OP && LA240_0 <= SUPER)||LA240_0==THIS||LA240_0==UIDENTIFIER||(LA240_0 >= VALUE_MODIFIER && LA240_0 <= VERBATIM_STRING)) ) {
                alt240=1;
            }
            switch (alt240) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3038:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_switchHeader19972);
                    expression479=expression();

                    state._fsp--;
                    if (state.failed) return clause;

                    if ( state.backtracking==0 ) { clause.setExpression(expression479); }

                    }
                    break;

            }


            match(input,RPAREN,FOLLOW_RPAREN_in_switchHeader19998); if (state.failed) return clause;

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "switchHeader"



    // $ANTLR start "cases"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3044:1: cases returns [SwitchCaseList switchCaseList] : ( caseBlock )+ ( defaultCaseBlock )? ;
    public SwitchCaseList cases() throws RecognitionException {
        SwitchCaseList switchCaseList = null;


        CaseClause caseBlock480 =null;

        ElseClause defaultCaseBlock481 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3045:5: ( ( caseBlock )+ ( defaultCaseBlock )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3045:7: ( caseBlock )+ ( defaultCaseBlock )?
            {
            if ( state.backtracking==0 ) { switchCaseList = new SwitchCaseList(null); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3046:7: ( caseBlock )+
            int cnt241=0;
            loop241:
            do {
                int alt241=2;
                int LA241_0 = input.LA(1);

                if ( (LA241_0==CASE_CLAUSE) ) {
                    alt241=1;
                }


                switch (alt241) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3047:9: caseBlock
            	    {
            	    pushFollow(FOLLOW_caseBlock_in_cases20037);
            	    caseBlock480=caseBlock();

            	    state._fsp--;
            	    if (state.failed) return switchCaseList;

            	    if ( state.backtracking==0 ) { switchCaseList.addCaseClause(caseBlock480); }

            	    }
            	    break;

            	default :
            	    if ( cnt241 >= 1 ) break loop241;
            	    if (state.backtracking>0) {state.failed=true; return switchCaseList;}
                        EarlyExitException eee =
                            new EarlyExitException(241, input);
                        throw eee;
                }
                cnt241++;
            } while (true);


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3050:7: ( defaultCaseBlock )?
            int alt242=2;
            int LA242_0 = input.LA(1);

            if ( (LA242_0==ELSE_CLAUSE) ) {
                alt242=1;
            }
            switch (alt242) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3051:9: defaultCaseBlock
                    {
                    pushFollow(FOLLOW_defaultCaseBlock_in_cases20074);
                    defaultCaseBlock481=defaultCaseBlock();

                    state._fsp--;
                    if (state.failed) return switchCaseList;

                    if ( state.backtracking==0 ) { switchCaseList.setElseClause(defaultCaseBlock481); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return switchCaseList;
    }
    // $ANTLR end "cases"



    // $ANTLR start "caseBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3056:1: caseBlock returns [CaseClause clause] : CASE_CLAUSE caseItemList block ;
    public CaseClause caseBlock() throws RecognitionException {
        CaseClause clause = null;


        Token CASE_CLAUSE482=null;
        CaseItem caseItemList483 =null;

        Block block484 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3057:5: ( CASE_CLAUSE caseItemList block )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3057:7: CASE_CLAUSE caseItemList block
            {
            CASE_CLAUSE482=(Token)match(input,CASE_CLAUSE,FOLLOW_CASE_CLAUSE_in_caseBlock20118); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new CaseClause(CASE_CLAUSE482); }

            pushFollow(FOLLOW_caseItemList_in_caseBlock20135);
            caseItemList483=caseItemList();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setCaseItem(caseItemList483); }

            pushFollow(FOLLOW_block_in_caseBlock20151);
            block484=block();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(block484); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "caseBlock"



    // $ANTLR start "caseItemList"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3065:1: caseItemList returns [CaseItem item] : LPAREN (ci= caseItem )? RPAREN ;
    public CaseItem caseItemList() throws RecognitionException {
        CaseItem item = null;


        Token RPAREN485=null;
        CaseItem ci =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3066:5: ( LPAREN (ci= caseItem )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3066:7: LPAREN (ci= caseItem )? RPAREN
            {
            match(input,LPAREN,FOLLOW_LPAREN_in_caseItemList20180); if (state.failed) return item;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3067:7: (ci= caseItem )?
            int alt243=2;
            int LA243_0 = input.LA(1);

            if ( (LA243_0==BACKTICK||LA243_0==CHAR_LITERAL||(LA243_0 >= DECREMENT_OP && LA243_0 <= DIFFERENCE_OP)||LA243_0==FLOAT_LITERAL||LA243_0==INCREMENT_OP||LA243_0==IS_OP||(LA243_0 >= LBRACE && LA243_0 <= LIDENTIFIER)||LA243_0==LPAREN||LA243_0==NATURAL_LITERAL||LA243_0==NOT_OP||(LA243_0 >= OUTER && LA243_0 <= PACKAGE)||LA243_0==SATISFIES||LA243_0==STRING_LITERAL||LA243_0==STRING_START||(LA243_0 >= SUM_OP && LA243_0 <= SUPER)||LA243_0==THIS||LA243_0==UIDENTIFIER||(LA243_0 >= VALUE_MODIFIER && LA243_0 <= VERBATIM_STRING)) ) {
                alt243=1;
            }
            switch (alt243) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3068:9: ci= caseItem
                    {
                    pushFollow(FOLLOW_caseItem_in_caseItemList20201);
                    ci=caseItem();

                    state._fsp--;
                    if (state.failed) return item;

                    if ( state.backtracking==0 ) { item = ci; }

                    }
                    break;

            }


            RPAREN485=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_caseItemList20228); if (state.failed) return item;

            if ( state.backtracking==0 ) { if (item!=null) 
                        item.setEndToken(RPAREN485); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return item;
    }
    // $ANTLR end "caseItemList"



    // $ANTLR start "defaultCaseBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3076:1: defaultCaseBlock returns [ElseClause clause] : ELSE_CLAUSE block ;
    public ElseClause defaultCaseBlock() throws RecognitionException {
        ElseClause clause = null;


        Token ELSE_CLAUSE486=null;
        Block block487 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3077:5: ( ELSE_CLAUSE block )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3077:7: ELSE_CLAUSE block
            {
            ELSE_CLAUSE486=(Token)match(input,ELSE_CLAUSE,FOLLOW_ELSE_CLAUSE_in_defaultCaseBlock20258); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new ElseClause(ELSE_CLAUSE486); }

            pushFollow(FOLLOW_block_in_defaultCaseBlock20275);
            block487=block();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(block487); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "defaultCaseBlock"



    // $ANTLR start "caseItem"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3083:1: caseItem returns [CaseItem item] : ( ( IS_OP )=> isCaseCondition | ( SATISFIES )=> satisfiesCaseCondition | matchCaseCondition );
    public CaseItem caseItem() throws RecognitionException {
        CaseItem item = null;


        IsCase isCaseCondition488 =null;

        SatisfiesCase satisfiesCaseCondition489 =null;

        MatchCase matchCaseCondition490 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3084:5: ( ( IS_OP )=> isCaseCondition | ( SATISFIES )=> satisfiesCaseCondition | matchCaseCondition )
            int alt244=3;
            int LA244_0 = input.LA(1);

            if ( (LA244_0==IS_OP) && (synpred25_Ceylon())) {
                alt244=1;
            }
            else if ( (LA244_0==SATISFIES) && (synpred26_Ceylon())) {
                alt244=2;
            }
            else if ( (LA244_0==BACKTICK||LA244_0==CHAR_LITERAL||(LA244_0 >= DECREMENT_OP && LA244_0 <= DIFFERENCE_OP)||LA244_0==FLOAT_LITERAL||LA244_0==INCREMENT_OP||(LA244_0 >= LBRACE && LA244_0 <= LIDENTIFIER)||LA244_0==LPAREN||LA244_0==NATURAL_LITERAL||LA244_0==NOT_OP||(LA244_0 >= OUTER && LA244_0 <= PACKAGE)||LA244_0==STRING_LITERAL||LA244_0==STRING_START||(LA244_0 >= SUM_OP && LA244_0 <= SUPER)||LA244_0==THIS||LA244_0==UIDENTIFIER||(LA244_0 >= VALUE_MODIFIER && LA244_0 <= VERBATIM_STRING)) ) {
                alt244=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return item;}
                NoViableAltException nvae =
                    new NoViableAltException("", 244, 0, input);

                throw nvae;

            }
            switch (alt244) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3084:7: ( IS_OP )=> isCaseCondition
                    {
                    pushFollow(FOLLOW_isCaseCondition_in_caseItem20308);
                    isCaseCondition488=isCaseCondition();

                    state._fsp--;
                    if (state.failed) return item;

                    if ( state.backtracking==0 ) { item =isCaseCondition488; }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3086:7: ( SATISFIES )=> satisfiesCaseCondition
                    {
                    pushFollow(FOLLOW_satisfiesCaseCondition_in_caseItem20329);
                    satisfiesCaseCondition489=satisfiesCaseCondition();

                    state._fsp--;
                    if (state.failed) return item;

                    if ( state.backtracking==0 ) { item =satisfiesCaseCondition489; }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3088:7: matchCaseCondition
                    {
                    pushFollow(FOLLOW_matchCaseCondition_in_caseItem20345);
                    matchCaseCondition490=matchCaseCondition();

                    state._fsp--;
                    if (state.failed) return item;

                    if ( state.backtracking==0 ) { item =matchCaseCondition490; }

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return item;
    }
    // $ANTLR end "caseItem"



    // $ANTLR start "matchCaseCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3092:1: matchCaseCondition returns [MatchCase item] : expressions ;
    public MatchCase matchCaseCondition() throws RecognitionException {
        MatchCase item = null;


        ExpressionList expressions491 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3093:5: ( expressions )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3093:7: expressions
            {
            pushFollow(FOLLOW_expressions_in_matchCaseCondition20374);
            expressions491=expressions();

            state._fsp--;
            if (state.failed) return item;

            if ( state.backtracking==0 ) { item = new MatchCase(null);
                    item.setExpressionList(expressions491); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return item;
    }
    // $ANTLR end "matchCaseCondition"



    // $ANTLR start "isCaseCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3098:1: isCaseCondition returns [IsCase item] : IS_OP type ;
    public IsCase isCaseCondition() throws RecognitionException {
        IsCase item = null;


        Token IS_OP492=null;
        StaticType type493 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3099:5: ( IS_OP type )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3099:7: IS_OP type
            {
            IS_OP492=(Token)match(input,IS_OP,FOLLOW_IS_OP_in_isCaseCondition20403); if (state.failed) return item;

            if ( state.backtracking==0 ) { item = new IsCase(IS_OP492); }

            pushFollow(FOLLOW_type_in_isCaseCondition20420);
            type493=type();

            state._fsp--;
            if (state.failed) return item;

            if ( state.backtracking==0 ) { item.setType(type493); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return item;
    }
    // $ANTLR end "isCaseCondition"



    // $ANTLR start "satisfiesCaseCondition"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3105:1: satisfiesCaseCondition returns [SatisfiesCase item] : SATISFIES qualifiedType ;
    public SatisfiesCase satisfiesCaseCondition() throws RecognitionException {
        SatisfiesCase item = null;


        Token SATISFIES494=null;
        SimpleType qualifiedType495 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3106:5: ( SATISFIES qualifiedType )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3106:7: SATISFIES qualifiedType
            {
            SATISFIES494=(Token)match(input,SATISFIES,FOLLOW_SATISFIES_in_satisfiesCaseCondition20449); if (state.failed) return item;

            if ( state.backtracking==0 ) { item = new SatisfiesCase(SATISFIES494); }

            pushFollow(FOLLOW_qualifiedType_in_satisfiesCaseCondition20466);
            qualifiedType495=qualifiedType();

            state._fsp--;
            if (state.failed) return item;

            if ( state.backtracking==0 ) { item.setType(qualifiedType495); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return item;
    }
    // $ANTLR end "satisfiesCaseCondition"



    // $ANTLR start "forElse"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3112:1: forElse returns [ForStatement statement] : forBlock ( failBlock )? ;
    public ForStatement forElse() throws RecognitionException {
        ForStatement statement = null;


        ForClause forBlock496 =null;

        ElseClause failBlock497 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3113:5: ( forBlock ( failBlock )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3113:7: forBlock ( failBlock )?
            {
            if ( state.backtracking==0 ) { statement =new ForStatement(null); }

            pushFollow(FOLLOW_forBlock_in_forElse20503);
            forBlock496=forBlock();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { statement.setForClause(forBlock496); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3116:7: ( failBlock )?
            int alt245=2;
            int LA245_0 = input.LA(1);

            if ( (LA245_0==ELSE_CLAUSE) ) {
                alt245=1;
            }
            switch (alt245) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3117:9: failBlock
                    {
                    pushFollow(FOLLOW_failBlock_in_forElse20530);
                    failBlock497=failBlock();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement.setElseClause(failBlock497); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "forElse"



    // $ANTLR start "forBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3122:1: forBlock returns [ForClause clause] : FOR_CLAUSE forIterator controlBlock ;
    public ForClause forBlock() throws RecognitionException {
        ForClause clause = null;


        Token FOR_CLAUSE498=null;
        ForIterator forIterator499 =null;

        Block controlBlock500 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3123:5: ( FOR_CLAUSE forIterator controlBlock )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3123:7: FOR_CLAUSE forIterator controlBlock
            {
            FOR_CLAUSE498=(Token)match(input,FOR_CLAUSE,FOLLOW_FOR_CLAUSE_in_forBlock20570); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new ForClause(FOR_CLAUSE498); }

            pushFollow(FOLLOW_forIterator_in_forBlock20587);
            forIterator499=forIterator();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setForIterator(forIterator499); }

            pushFollow(FOLLOW_controlBlock_in_forBlock20604);
            controlBlock500=controlBlock();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(controlBlock500); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "forBlock"



    // $ANTLR start "failBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3131:1: failBlock returns [ElseClause clause] : ELSE_CLAUSE block ;
    public ElseClause failBlock() throws RecognitionException {
        ElseClause clause = null;


        Token ELSE_CLAUSE501=null;
        Block block502 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3132:5: ( ELSE_CLAUSE block )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3132:7: ELSE_CLAUSE block
            {
            ELSE_CLAUSE501=(Token)match(input,ELSE_CLAUSE,FOLLOW_ELSE_CLAUSE_in_failBlock20633); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new ElseClause(ELSE_CLAUSE501); }

            pushFollow(FOLLOW_block_in_failBlock20650);
            block502=block();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(block502); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "failBlock"



    // $ANTLR start "forIterator"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3138:1: forIterator returns [ForIterator iterator] : LPAREN compilerAnnotations (v1= var (c1= containment | ENTRY_OP v2= var c2= containment )? )? RPAREN ;
    public ForIterator forIterator() throws RecognitionException {
        ForIterator iterator = null;


        Token LPAREN503=null;
        Token RPAREN505=null;
        Variable v1 =null;

        SpecifierExpression c1 =null;

        Variable v2 =null;

        SpecifierExpression c2 =null;

        List<CompilerAnnotation> compilerAnnotations504 =null;


         ValueIterator vi = null;
                    KeyValueIterator kvi = null; 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3141:5: ( LPAREN compilerAnnotations (v1= var (c1= containment | ENTRY_OP v2= var c2= containment )? )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3141:7: LPAREN compilerAnnotations (v1= var (c1= containment | ENTRY_OP v2= var c2= containment )? )? RPAREN
            {
            LPAREN503=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_forIterator20688); if (state.failed) return iterator;

            if ( state.backtracking==0 ) { vi = new ValueIterator(LPAREN503); 
                  kvi = new KeyValueIterator(LPAREN503); 
                  iterator = vi; }

            pushFollow(FOLLOW_compilerAnnotations_in_forIterator20700);
            compilerAnnotations504=compilerAnnotations();

            state._fsp--;
            if (state.failed) return iterator;

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3146:5: (v1= var (c1= containment | ENTRY_OP v2= var c2= containment )? )?
            int alt247=2;
            int LA247_0 = input.LA(1);

            if ( (LA247_0==FUNCTION_MODIFIER||(LA247_0 >= LBRACE && LA247_0 <= LIDENTIFIER)||LA247_0==SMALLER_OP||LA247_0==UIDENTIFIER||LA247_0==VALUE_MODIFIER||LA247_0==VOID_MODIFIER) ) {
                alt247=1;
            }
            switch (alt247) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3147:7: v1= var (c1= containment | ENTRY_OP v2= var c2= containment )?
                    {
                    pushFollow(FOLLOW_var_in_forIterator20717);
                    v1=var();

                    state._fsp--;
                    if (state.failed) return iterator;

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3148:7: (c1= containment | ENTRY_OP v2= var c2= containment )?
                    int alt246=3;
                    int LA246_0 = input.LA(1);

                    if ( (LA246_0==IN_OP) ) {
                        alt246=1;
                    }
                    else if ( (LA246_0==ENTRY_OP) ) {
                        alt246=2;
                    }
                    switch (alt246) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3149:9: c1= containment
                            {
                            if ( state.backtracking==0 ) { vi.setVariable(v1); }

                            pushFollow(FOLLOW_containment_in_forIterator20747);
                            c1=containment();

                            state._fsp--;
                            if (state.failed) return iterator;

                            if ( state.backtracking==0 ) { vi.setSpecifierExpression(c1); }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3153:9: ENTRY_OP v2= var c2= containment
                            {
                            if ( state.backtracking==0 ) { iterator = kvi; }

                            match(input,ENTRY_OP,FOLLOW_ENTRY_OP_in_forIterator20786); if (state.failed) return iterator;

                            if ( state.backtracking==0 ) { kvi.setKeyVariable(v1); }

                            pushFollow(FOLLOW_var_in_forIterator20808);
                            v2=var();

                            state._fsp--;
                            if (state.failed) return iterator;

                            if ( state.backtracking==0 ) { kvi.setValueVariable(v2); }

                            pushFollow(FOLLOW_containment_in_forIterator20830);
                            c2=containment();

                            state._fsp--;
                            if (state.failed) return iterator;

                            if ( state.backtracking==0 ) {  kvi.setSpecifierExpression(c2); }

                            }
                            break;

                    }


                    }
                    break;

            }


            if ( state.backtracking==0 ) { if (iterator!=null)
                      iterator.getCompilerAnnotations().addAll(compilerAnnotations504); }

            RPAREN505=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_forIterator20868); if (state.failed) return iterator;

            if ( state.backtracking==0 ) { iterator.setEndToken(RPAREN505); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return iterator;
    }
    // $ANTLR end "forIterator"



    // $ANTLR start "containment"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3168:1: containment returns [SpecifierExpression specifierExpression] : IN_OP ( expression )? ;
    public SpecifierExpression containment() throws RecognitionException {
        SpecifierExpression specifierExpression = null;


        Token IN_OP506=null;
        Expression expression507 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3169:5: ( IN_OP ( expression )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3169:7: IN_OP ( expression )?
            {
            IN_OP506=(Token)match(input,IN_OP,FOLLOW_IN_OP_in_containment20899); if (state.failed) return specifierExpression;

            if ( state.backtracking==0 ) { specifierExpression = new SpecifierExpression(IN_OP506); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3171:7: ( expression )?
            int alt248=2;
            int LA248_0 = input.LA(1);

            if ( (LA248_0==BACKTICK||LA248_0==CHAR_LITERAL||(LA248_0 >= DECREMENT_OP && LA248_0 <= DIFFERENCE_OP)||LA248_0==FLOAT_LITERAL||LA248_0==INCREMENT_OP||(LA248_0 >= LBRACE && LA248_0 <= LIDENTIFIER)||LA248_0==LPAREN||LA248_0==NATURAL_LITERAL||LA248_0==NOT_OP||(LA248_0 >= OUTER && LA248_0 <= PACKAGE)||LA248_0==STRING_LITERAL||LA248_0==STRING_START||(LA248_0 >= SUM_OP && LA248_0 <= SUPER)||LA248_0==THIS||LA248_0==UIDENTIFIER||(LA248_0 >= VALUE_MODIFIER && LA248_0 <= VERBATIM_STRING)) ) {
                alt248=1;
            }
            switch (alt248) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3171:8: expression
                    {
                    pushFollow(FOLLOW_expression_in_containment20917);
                    expression507=expression();

                    state._fsp--;
                    if (state.failed) return specifierExpression;

                    if ( state.backtracking==0 ) { specifierExpression.setExpression(expression507); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return specifierExpression;
    }
    // $ANTLR end "containment"



    // $ANTLR start "whileLoop"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3175:1: whileLoop returns [WhileStatement statement] : whileBlock ;
    public WhileStatement whileLoop() throws RecognitionException {
        WhileStatement statement = null;


        WhileClause whileBlock508 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3176:5: ( whileBlock )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3176:7: whileBlock
            {
            if ( state.backtracking==0 ) { statement = new WhileStatement(null); }

            pushFollow(FOLLOW_whileBlock_in_whileLoop20960);
            whileBlock508=whileBlock();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { statement.setWhileClause(whileBlock508); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "whileLoop"



    // $ANTLR start "whileBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3181:1: whileBlock returns [WhileClause clause] : WHILE_CLAUSE conditions controlBlock ;
    public WhileClause whileBlock() throws RecognitionException {
        WhileClause clause = null;


        Token WHILE_CLAUSE509=null;
        ConditionList conditions510 =null;

        Block controlBlock511 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3182:5: ( WHILE_CLAUSE conditions controlBlock )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3182:7: WHILE_CLAUSE conditions controlBlock
            {
            WHILE_CLAUSE509=(Token)match(input,WHILE_CLAUSE,FOLLOW_WHILE_CLAUSE_in_whileBlock20989); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new WhileClause(WHILE_CLAUSE509); }

            pushFollow(FOLLOW_conditions_in_whileBlock21005);
            conditions510=conditions();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setConditionList(conditions510); }

            pushFollow(FOLLOW_controlBlock_in_whileBlock21021);
            controlBlock511=controlBlock();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(controlBlock511); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "whileBlock"



    // $ANTLR start "tryCatchFinally"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3190:1: tryCatchFinally returns [TryCatchStatement statement] : tryBlock ( catchBlock )* ( finallyBlock )? ;
    public TryCatchStatement tryCatchFinally() throws RecognitionException {
        TryCatchStatement statement = null;


        TryClause tryBlock512 =null;

        CatchClause catchBlock513 =null;

        FinallyClause finallyBlock514 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3191:5: ( tryBlock ( catchBlock )* ( finallyBlock )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3191:7: tryBlock ( catchBlock )* ( finallyBlock )?
            {
            if ( state.backtracking==0 ) { statement = new TryCatchStatement(null); }

            pushFollow(FOLLOW_tryBlock_in_tryCatchFinally21058);
            tryBlock512=tryBlock();

            state._fsp--;
            if (state.failed) return statement;

            if ( state.backtracking==0 ) { statement.setTryClause(tryBlock512); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3194:7: ( catchBlock )*
            loop249:
            do {
                int alt249=2;
                int LA249_0 = input.LA(1);

                if ( (LA249_0==CATCH_CLAUSE) ) {
                    alt249=1;
                }


                switch (alt249) {
            	case 1 :
            	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3195:9: catchBlock
            	    {
            	    pushFollow(FOLLOW_catchBlock_in_tryCatchFinally21085);
            	    catchBlock513=catchBlock();

            	    state._fsp--;
            	    if (state.failed) return statement;

            	    if ( state.backtracking==0 ) { statement.addCatchClause(catchBlock513); }

            	    }
            	    break;

            	default :
            	    break loop249;
                }
            } while (true);


            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3198:7: ( finallyBlock )?
            int alt250=2;
            int LA250_0 = input.LA(1);

            if ( (LA250_0==FINALLY_CLAUSE) ) {
                alt250=1;
            }
            switch (alt250) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3199:9: finallyBlock
                    {
                    pushFollow(FOLLOW_finallyBlock_in_tryCatchFinally21122);
                    finallyBlock514=finallyBlock();

                    state._fsp--;
                    if (state.failed) return statement;

                    if ( state.backtracking==0 ) { statement.setFinallyClause(finallyBlock514); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return statement;
    }
    // $ANTLR end "tryCatchFinally"



    // $ANTLR start "tryBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3204:1: tryBlock returns [TryClause clause] : TRY_CLAUSE ( resources controlBlock | block ) ;
    public TryClause tryBlock() throws RecognitionException {
        TryClause clause = null;


        Token TRY_CLAUSE515=null;
        ResourceList resources516 =null;

        Block controlBlock517 =null;

        Block block518 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3205:5: ( TRY_CLAUSE ( resources controlBlock | block ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3205:7: TRY_CLAUSE ( resources controlBlock | block )
            {
            TRY_CLAUSE515=(Token)match(input,TRY_CLAUSE,FOLLOW_TRY_CLAUSE_in_tryBlock21160); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new TryClause(TRY_CLAUSE515); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3207:7: ( resources controlBlock | block )
            int alt251=2;
            int LA251_0 = input.LA(1);

            if ( (LA251_0==LPAREN) ) {
                alt251=1;
            }
            else if ( (LA251_0==LBRACE) ) {
                alt251=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return clause;}
                NoViableAltException nvae =
                    new NoViableAltException("", 251, 0, input);

                throw nvae;

            }
            switch (alt251) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3208:9: resources controlBlock
                    {
                    pushFollow(FOLLOW_resources_in_tryBlock21187);
                    resources516=resources();

                    state._fsp--;
                    if (state.failed) return clause;

                    if ( state.backtracking==0 ) { clause.setResourceList(resources516); }

                    pushFollow(FOLLOW_controlBlock_in_tryBlock21207);
                    controlBlock517=controlBlock();

                    state._fsp--;
                    if (state.failed) return clause;

                    if ( state.backtracking==0 ) { clause.setBlock(controlBlock517); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3213:9: block
                    {
                    pushFollow(FOLLOW_block_in_tryBlock21235);
                    block518=block();

                    state._fsp--;
                    if (state.failed) return clause;

                    if ( state.backtracking==0 ) { clause.setBlock(block518); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "tryBlock"



    // $ANTLR start "catchBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3218:1: catchBlock returns [CatchClause clause] : CATCH_CLAUSE catchVariable block ;
    public CatchClause catchBlock() throws RecognitionException {
        CatchClause clause = null;


        Token CATCH_CLAUSE519=null;
        CatchVariable catchVariable520 =null;

        Block block521 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3219:5: ( CATCH_CLAUSE catchVariable block )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3219:7: CATCH_CLAUSE catchVariable block
            {
            CATCH_CLAUSE519=(Token)match(input,CATCH_CLAUSE,FOLLOW_CATCH_CLAUSE_in_catchBlock21274); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new CatchClause(CATCH_CLAUSE519); }

            pushFollow(FOLLOW_catchVariable_in_catchBlock21291);
            catchVariable520=catchVariable();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setCatchVariable(catchVariable520); }

            pushFollow(FOLLOW_block_in_catchBlock21307);
            block521=block();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(block521); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "catchBlock"



    // $ANTLR start "catchVariable"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3227:1: catchVariable returns [CatchVariable catchVariable] : LPAREN ( variable )? RPAREN ;
    public CatchVariable catchVariable() throws RecognitionException {
        CatchVariable catchVariable = null;


        Token LPAREN522=null;
        Token RPAREN524=null;
        Variable variable523 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3228:5: ( LPAREN ( variable )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3228:7: LPAREN ( variable )? RPAREN
            {
            LPAREN522=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_catchVariable21336); if (state.failed) return catchVariable;

            if ( state.backtracking==0 ) { catchVariable =new CatchVariable(LPAREN522); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3230:7: ( variable )?
            int alt252=2;
            int LA252_0 = input.LA(1);

            if ( (LA252_0==COMPILER_ANNOTATION||LA252_0==FUNCTION_MODIFIER||(LA252_0 >= LBRACE && LA252_0 <= LIDENTIFIER)||LA252_0==SMALLER_OP||LA252_0==UIDENTIFIER||LA252_0==VALUE_MODIFIER||LA252_0==VOID_MODIFIER) ) {
                alt252=1;
            }
            switch (alt252) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3231:7: variable
                    {
                    pushFollow(FOLLOW_variable_in_catchVariable21361);
                    variable523=variable();

                    state._fsp--;
                    if (state.failed) return catchVariable;

                    if ( state.backtracking==0 ) { catchVariable.setVariable(variable523); }

                    }
                    break;

            }


            RPAREN524=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_catchVariable21387); if (state.failed) return catchVariable;

            if ( state.backtracking==0 ) { catchVariable.setEndToken(RPAREN524); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return catchVariable;
    }
    // $ANTLR end "catchVariable"



    // $ANTLR start "finallyBlock"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3239:1: finallyBlock returns [FinallyClause clause] : FINALLY_CLAUSE block ;
    public FinallyClause finallyBlock() throws RecognitionException {
        FinallyClause clause = null;


        Token FINALLY_CLAUSE525=null;
        Block block526 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3240:5: ( FINALLY_CLAUSE block )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3240:7: FINALLY_CLAUSE block
            {
            FINALLY_CLAUSE525=(Token)match(input,FINALLY_CLAUSE,FOLLOW_FINALLY_CLAUSE_in_finallyBlock21418); if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause = new FinallyClause(FINALLY_CLAUSE525); }

            pushFollow(FOLLOW_block_in_finallyBlock21435);
            block526=block();

            state._fsp--;
            if (state.failed) return clause;

            if ( state.backtracking==0 ) { clause.setBlock(block526); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return clause;
    }
    // $ANTLR end "finallyBlock"



    // $ANTLR start "resources"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3246:1: resources returns [ResourceList resources] : LPAREN (r1= resource (c= COMMA r2= resource )* )? RPAREN ;
    public ResourceList resources() throws RecognitionException {
        ResourceList resources = null;


        Token c=null;
        Token LPAREN527=null;
        Token RPAREN528=null;
        Resource r1 =null;

        Resource r2 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3247:5: ( LPAREN (r1= resource (c= COMMA r2= resource )* )? RPAREN )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3247:7: LPAREN (r1= resource (c= COMMA r2= resource )* )? RPAREN
            {
            LPAREN527=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_resources21464); if (state.failed) return resources;

            if ( state.backtracking==0 ) { resources = new ResourceList(LPAREN527); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3249:5: (r1= resource (c= COMMA r2= resource )* )?
            int alt254=2;
            int LA254_0 = input.LA(1);

            if ( (LA254_0==BACKTICK||LA254_0==CHAR_LITERAL||LA254_0==COMPILER_ANNOTATION||(LA254_0 >= DECREMENT_OP && LA254_0 <= DIFFERENCE_OP)||LA254_0==FLOAT_LITERAL||LA254_0==FUNCTION_MODIFIER||LA254_0==INCREMENT_OP||(LA254_0 >= LBRACE && LA254_0 <= LIDENTIFIER)||LA254_0==LPAREN||LA254_0==NATURAL_LITERAL||LA254_0==NOT_OP||(LA254_0 >= OUTER && LA254_0 <= PACKAGE)||LA254_0==SMALLER_OP||LA254_0==STRING_LITERAL||LA254_0==STRING_START||(LA254_0 >= SUM_OP && LA254_0 <= SUPER)||LA254_0==THIS||LA254_0==UIDENTIFIER||(LA254_0 >= VALUE_MODIFIER && LA254_0 <= VOID_MODIFIER)) ) {
                alt254=1;
            }
            switch (alt254) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3250:5: r1= resource (c= COMMA r2= resource )*
                    {
                    pushFollow(FOLLOW_resource_in_resources21485);
                    r1=resource();

                    state._fsp--;
                    if (state.failed) return resources;

                    if ( state.backtracking==0 ) { resources.addResource(r1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3252:5: (c= COMMA r2= resource )*
                    loop253:
                    do {
                        int alt253=2;
                        int LA253_0 = input.LA(1);

                        if ( (LA253_0==COMMA) ) {
                            alt253=1;
                        }


                        switch (alt253) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3253:7: c= COMMA r2= resource
                    	    {
                    	    c=(Token)match(input,COMMA,FOLLOW_COMMA_in_resources21507); if (state.failed) return resources;

                    	    if ( state.backtracking==0 ) { resources.setEndToken(c); }

                    	    pushFollow(FOLLOW_resource_in_resources21526);
                    	    r2=resource();

                    	    state._fsp--;
                    	    if (state.failed) return resources;

                    	    if ( state.backtracking==0 ) { resources.addResource(r2);
                    	            resources.setEndToken(null); }

                    	    }
                    	    break;

                    	default :
                    	    break loop253;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN528=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_resources21554); if (state.failed) return resources;

            if ( state.backtracking==0 ) { resources.setEndToken(RPAREN528); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return resources;
    }
    // $ANTLR end "resources"



    // $ANTLR start "resource"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3264:1: resource returns [Resource resource] : ( ( COMPILER_ANNOTATION | declarationStart | specificationStart )=> specifiedVariable | expression ) ;
    public Resource resource() throws RecognitionException {
        Resource resource = null;


        Variable specifiedVariable529 =null;

        Expression expression530 =null;


         resource = new Resource(null); 
        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:5: ( ( ( COMPILER_ANNOTATION | declarationStart | specificationStart )=> specifiedVariable | expression ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:7: ( ( COMPILER_ANNOTATION | declarationStart | specificationStart )=> specifiedVariable | expression )
            {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:7: ( ( COMPILER_ANNOTATION | declarationStart | specificationStart )=> specifiedVariable | expression )
            int alt255=2;
            int LA255_0 = input.LA(1);

            if ( (LA255_0==COMPILER_ANNOTATION) && (synpred27_Ceylon())) {
                alt255=1;
            }
            else if ( (LA255_0==UIDENTIFIER) ) {
                int LA255_2 = input.LA(2);

                if ( (synpred27_Ceylon()) ) {
                    alt255=1;
                }
                else if ( (true) ) {
                    alt255=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return resource;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 255, 2, input);

                    throw nvae;

                }
            }
            else if ( (LA255_0==LBRACKET) ) {
                int LA255_3 = input.LA(2);

                if ( (synpred27_Ceylon()) ) {
                    alt255=1;
                }
                else if ( (true) ) {
                    alt255=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return resource;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 255, 3, input);

                    throw nvae;

                }
            }
            else if ( (LA255_0==LBRACE) ) {
                int LA255_4 = input.LA(2);

                if ( (synpred27_Ceylon()) ) {
                    alt255=1;
                }
                else if ( (true) ) {
                    alt255=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return resource;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 255, 4, input);

                    throw nvae;

                }
            }
            else if ( (LA255_0==SMALLER_OP) && (synpred27_Ceylon())) {
                alt255=1;
            }
            else if ( (LA255_0==VOID_MODIFIER) && (synpred27_Ceylon())) {
                alt255=1;
            }
            else if ( (LA255_0==FUNCTION_MODIFIER) && (synpred27_Ceylon())) {
                alt255=1;
            }
            else if ( (LA255_0==VALUE_MODIFIER) ) {
                int LA255_8 = input.LA(2);

                if ( (synpred27_Ceylon()) ) {
                    alt255=1;
                }
                else if ( (true) ) {
                    alt255=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return resource;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 255, 8, input);

                    throw nvae;

                }
            }
            else if ( (LA255_0==LIDENTIFIER) ) {
                int LA255_9 = input.LA(2);

                if ( (synpred27_Ceylon()) ) {
                    alt255=1;
                }
                else if ( (true) ) {
                    alt255=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return resource;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 255, 9, input);

                    throw nvae;

                }
            }
            else if ( (LA255_0==BACKTICK||LA255_0==CHAR_LITERAL||(LA255_0 >= DECREMENT_OP && LA255_0 <= DIFFERENCE_OP)||LA255_0==FLOAT_LITERAL||LA255_0==INCREMENT_OP||LA255_0==LPAREN||LA255_0==NATURAL_LITERAL||LA255_0==NOT_OP||(LA255_0 >= OUTER && LA255_0 <= PACKAGE)||LA255_0==STRING_LITERAL||LA255_0==STRING_START||(LA255_0 >= SUM_OP && LA255_0 <= SUPER)||LA255_0==THIS||LA255_0==VERBATIM_STRING) ) {
                alt255=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return resource;}
                NoViableAltException nvae =
                    new NoViableAltException("", 255, 0, input);

                throw nvae;

            }
            switch (alt255) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:9: ( COMPILER_ANNOTATION | declarationStart | specificationStart )=> specifiedVariable
                    {
                    pushFollow(FOLLOW_specifiedVariable_in_resource21611);
                    specifiedVariable529=specifiedVariable();

                    state._fsp--;
                    if (state.failed) return resource;

                    if ( state.backtracking==0 ) { resource.setVariable(specifiedVariable529); }

                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3269:9: expression
                    {
                    pushFollow(FOLLOW_expression_in_resource21631);
                    expression530=expression();

                    state._fsp--;
                    if (state.failed) return resource;

                    if ( state.backtracking==0 ) { resource.setExpression(expression530); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return resource;
    }
    // $ANTLR end "resource"



    // $ANTLR start "specifiedVariable"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3274:1: specifiedVariable returns [Variable variable] : v= variable ( specifier )? ;
    public Variable specifiedVariable() throws RecognitionException {
        Variable variable = null;


        Variable v =null;

        SpecifierExpression specifier531 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3275:5: (v= variable ( specifier )? )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3275:7: v= variable ( specifier )?
            {
            pushFollow(FOLLOW_variable_in_specifiedVariable21672);
            v=variable();

            state._fsp--;
            if (state.failed) return variable;

            if ( state.backtracking==0 ) { variable = v; }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3277:7: ( specifier )?
            int alt256=2;
            int LA256_0 = input.LA(1);

            if ( (LA256_0==SPECIFY) ) {
                alt256=1;
            }
            switch (alt256) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3278:9: specifier
                    {
                    pushFollow(FOLLOW_specifier_in_specifiedVariable21699);
                    specifier531=specifier();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) { variable.setSpecifierExpression(specifier531); }

                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variable;
    }
    // $ANTLR end "specifiedVariable"



    // $ANTLR start "variable"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3283:1: variable returns [Variable variable] : compilerAnnotations var ;
    public Variable variable() throws RecognitionException {
        Variable variable = null;


        Variable var532 =null;

        List<CompilerAnnotation> compilerAnnotations533 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3284:5: ( compilerAnnotations var )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3284:7: compilerAnnotations var
            {
            pushFollow(FOLLOW_compilerAnnotations_in_variable21739);
            compilerAnnotations533=compilerAnnotations();

            state._fsp--;
            if (state.failed) return variable;

            pushFollow(FOLLOW_var_in_variable21747);
            var532=var();

            state._fsp--;
            if (state.failed) return variable;

            if ( state.backtracking==0 ) { variable =var532;
                    variable.getCompilerAnnotations().addAll(compilerAnnotations533); }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variable;
    }
    // $ANTLR end "variable"



    // $ANTLR start "var"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3290:1: var returns [Variable variable] : ( ( type | VOID_MODIFIER | FUNCTION_MODIFIER | VALUE_MODIFIER ) mn1= memberName (p1= parameters )* |mn2= memberName |mn3= memberName (p3= parameters )+ ) ;
    public Variable var() throws RecognitionException {
        Variable variable = null;


        Token VOID_MODIFIER535=null;
        Token FUNCTION_MODIFIER536=null;
        Token VALUE_MODIFIER537=null;
        Identifier mn1 =null;

        ParameterList p1 =null;

        Identifier mn2 =null;

        Identifier mn3 =null;

        ParameterList p3 =null;

        StaticType type534 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3291:5: ( ( ( type | VOID_MODIFIER | FUNCTION_MODIFIER | VALUE_MODIFIER ) mn1= memberName (p1= parameters )* |mn2= memberName |mn3= memberName (p3= parameters )+ ) )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3291:7: ( ( type | VOID_MODIFIER | FUNCTION_MODIFIER | VALUE_MODIFIER ) mn1= memberName (p1= parameters )* |mn2= memberName |mn3= memberName (p3= parameters )+ )
            {
            if ( state.backtracking==0 ) { variable = new Variable(null); }

            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3292:5: ( ( type | VOID_MODIFIER | FUNCTION_MODIFIER | VALUE_MODIFIER ) mn1= memberName (p1= parameters )* |mn2= memberName |mn3= memberName (p3= parameters )+ )
            int alt260=3;
            int LA260_0 = input.LA(1);

            if ( (LA260_0==FUNCTION_MODIFIER||(LA260_0 >= LBRACE && LA260_0 <= LBRACKET)||LA260_0==SMALLER_OP||LA260_0==UIDENTIFIER||LA260_0==VALUE_MODIFIER||LA260_0==VOID_MODIFIER) ) {
                alt260=1;
            }
            else if ( (LA260_0==LIDENTIFIER) ) {
                int LA260_2 = input.LA(2);

                if ( (LA260_2==COMMA||LA260_2==ENTRY_OP||LA260_2==IN_OP||LA260_2==RPAREN||LA260_2==SPECIFY) ) {
                    alt260=2;
                }
                else if ( (LA260_2==LPAREN) ) {
                    alt260=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return variable;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 260, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return variable;}
                NoViableAltException nvae =
                    new NoViableAltException("", 260, 0, input);

                throw nvae;

            }
            switch (alt260) {
                case 1 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3293:7: ( type | VOID_MODIFIER | FUNCTION_MODIFIER | VALUE_MODIFIER ) mn1= memberName (p1= parameters )*
                    {
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3293:7: ( type | VOID_MODIFIER | FUNCTION_MODIFIER | VALUE_MODIFIER )
                    int alt257=4;
                    switch ( input.LA(1) ) {
                    case LBRACE:
                    case LBRACKET:
                    case SMALLER_OP:
                    case UIDENTIFIER:
                        {
                        alt257=1;
                        }
                        break;
                    case VOID_MODIFIER:
                        {
                        alt257=2;
                        }
                        break;
                    case FUNCTION_MODIFIER:
                        {
                        alt257=3;
                        }
                        break;
                    case VALUE_MODIFIER:
                        {
                        alt257=4;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return variable;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 257, 0, input);

                        throw nvae;

                    }

                    switch (alt257) {
                        case 1 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3293:9: type
                            {
                            pushFollow(FOLLOW_type_in_var21796);
                            type534=type();

                            state._fsp--;
                            if (state.failed) return variable;

                            if ( state.backtracking==0 ) { variable.setType(type534); }

                            }
                            break;
                        case 2 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3295:9: VOID_MODIFIER
                            {
                            VOID_MODIFIER535=(Token)match(input,VOID_MODIFIER,FOLLOW_VOID_MODIFIER_in_var21817); if (state.failed) return variable;

                            if ( state.backtracking==0 ) { variable.setType(new VoidModifier(VOID_MODIFIER535)); }

                            }
                            break;
                        case 3 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3297:9: FUNCTION_MODIFIER
                            {
                            FUNCTION_MODIFIER536=(Token)match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_var21837); if (state.failed) return variable;

                            if ( state.backtracking==0 ) { variable.setType(new FunctionModifier(FUNCTION_MODIFIER536)); }

                            }
                            break;
                        case 4 :
                            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3299:9: VALUE_MODIFIER
                            {
                            VALUE_MODIFIER537=(Token)match(input,VALUE_MODIFIER,FOLLOW_VALUE_MODIFIER_in_var21857); if (state.failed) return variable;

                            if ( state.backtracking==0 ) { variable.setType(new ValueModifier(VALUE_MODIFIER537)); }

                            }
                            break;

                    }


                    pushFollow(FOLLOW_memberName_in_var21885);
                    mn1=memberName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) { variable.setIdentifier(mn1); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3304:7: (p1= parameters )*
                    loop258:
                    do {
                        int alt258=2;
                        int LA258_0 = input.LA(1);

                        if ( (LA258_0==LPAREN) ) {
                            alt258=1;
                        }


                        switch (alt258) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3305:9: p1= parameters
                    	    {
                    	    pushFollow(FOLLOW_parameters_in_var21915);
                    	    p1=parameters();

                    	    state._fsp--;
                    	    if (state.failed) return variable;

                    	    if ( state.backtracking==0 ) { variable.addParameterList(p1); }

                    	    }
                    	    break;

                    	default :
                    	    break loop258;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3309:7: mn2= memberName
                    {
                    if ( state.backtracking==0 ) { variable.setType( new ValueModifier(null) ); }

                    pushFollow(FOLLOW_memberName_in_var21959);
                    mn2=memberName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) { variable.setIdentifier(mn2); }

                    }
                    break;
                case 3 :
                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3313:7: mn3= memberName (p3= parameters )+
                    {
                    if ( state.backtracking==0 ) { variable.setType( new FunctionModifier(null) ); }

                    pushFollow(FOLLOW_memberName_in_var21992);
                    mn3=memberName();

                    state._fsp--;
                    if (state.failed) return variable;

                    if ( state.backtracking==0 ) { variable.setIdentifier(mn3); }

                    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3316:7: (p3= parameters )+
                    int cnt259=0;
                    loop259:
                    do {
                        int alt259=2;
                        int LA259_0 = input.LA(1);

                        if ( (LA259_0==LPAREN) ) {
                            alt259=1;
                        }


                        switch (alt259) {
                    	case 1 :
                    	    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3317:9: p3= parameters
                    	    {
                    	    pushFollow(FOLLOW_parameters_in_var22021);
                    	    p3=parameters();

                    	    state._fsp--;
                    	    if (state.failed) return variable;

                    	    if ( state.backtracking==0 ) { variable.addParameterList(p3); }

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt259 >= 1 ) break loop259;
                    	    if (state.backtracking>0) {state.failed=true; return variable;}
                                EarlyExitException eee =
                                    new EarlyExitException(259, input);
                                throw eee;
                        }
                        cnt259++;
                    } while (true);


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variable;
    }
    // $ANTLR end "var"



    // $ANTLR start "impliedVariable"
    // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3323:1: impliedVariable returns [Variable variable] : memberName ;
    public Variable impliedVariable() throws RecognitionException {
        Variable variable = null;


        Identifier memberName538 =null;


        try {
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3324:5: ( memberName )
            // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3324:7: memberName
            {
            pushFollow(FOLLOW_memberName_in_impliedVariable22067);
            memberName538=memberName();

            state._fsp--;
            if (state.failed) return variable;

            if ( state.backtracking==0 ) { Variable v = new Variable(null);
                    v.setType(new SyntheticVariable(null));
                    v.setIdentifier(memberName538);
                    SpecifierExpression se = new SpecifierExpression(null);
                    Expression e = new Expression(null);
                    BaseMemberExpression bme = new BaseMemberExpression(null);
                    bme.setIdentifier(memberName538);
                    bme.setTypeArguments( new InferredTypeArguments(null) );
                    e.setTerm(bme);
                    se.setExpression(e);
                    v.setSpecifierExpression(se); 
                    variable = v; }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return variable;
    }
    // $ANTLR end "impliedVariable"

    // $ANTLR start synpred1_Ceylon
    public void synpred1_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:54:9: ( compilerAnnotations annotations MODULE )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:54:10: compilerAnnotations annotations MODULE
        {
        pushFollow(FOLLOW_compilerAnnotations_in_synpred1_Ceylon164);
        compilerAnnotations();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_annotations_in_synpred1_Ceylon166);
        annotations();

        state._fsp--;
        if (state.failed) return ;

        match(input,MODULE,FOLLOW_MODULE_in_synpred1_Ceylon168); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_Ceylon

    // $ANTLR start synpred2_Ceylon
    public void synpred2_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:58:9: ( compilerAnnotations annotations PACKAGE )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:58:10: compilerAnnotations annotations PACKAGE
        {
        pushFollow(FOLLOW_compilerAnnotations_in_synpred2_Ceylon210);
        compilerAnnotations();

        state._fsp--;
        if (state.failed) return ;

        pushFollow(FOLLOW_annotations_in_synpred2_Ceylon212);
        annotations();

        state._fsp--;
        if (state.failed) return ;

        match(input,PACKAGE,FOLLOW_PACKAGE_in_synpred2_Ceylon214); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_Ceylon

    // $ANTLR start synpred3_Ceylon
    public void synpred3_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1007:9: ( annotatedDeclarationStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1007:10: annotatedDeclarationStart
        {
        pushFollow(FOLLOW_annotatedDeclarationStart_in_synpred3_Ceylon6594);
        annotatedDeclarationStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_Ceylon

    // $ANTLR start synpred4_Ceylon
    public void synpred4_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1009:9: ( annotatedAssertionStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1009:10: annotatedAssertionStart
        {
        pushFollow(FOLLOW_annotatedAssertionStart_in_synpred4_Ceylon6622);
        annotatedAssertionStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_Ceylon

    // $ANTLR start synpred5_Ceylon
    public void synpred5_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1011:9: ( annotationListStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1011:10: annotationListStart
        {
        pushFollow(FOLLOW_annotationListStart_in_synpred5_Ceylon6648);
        annotationListStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_Ceylon

    // $ANTLR start synpred6_Ceylon
    public void synpred6_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1291:9: ( specifierParametersStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1291:10: specifierParametersStart
        {
        pushFollow(FOLLOW_specifierParametersStart_in_synpred6_Ceylon8290);
        specifierParametersStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_Ceylon

    // $ANTLR start synpred7_Ceylon
    public void synpred7_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1333:9: (~ ( LIDENTIFIER | UIDENTIFIER ) )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:
        {
        if ( (input.LA(1) >= ABSTRACTED_TYPE && input.LA(1) <= LBRACKET)||(input.LA(1) >= LINE_COMMENT && input.LA(1) <= TYPE_CONSTRAINT)||(input.LA(1) >= UIdentifierPrefix && input.LA(1) <= WS) ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred7_Ceylon

    // $ANTLR start synpred8_Ceylon
    public void synpred8_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1399:9: ( typeArgumentsStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1399:10: typeArgumentsStart
        {
        pushFollow(FOLLOW_typeArgumentsStart_in_synpred8_Ceylon8964);
        typeArgumentsStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_Ceylon

    // $ANTLR start synpred9_Ceylon
    public void synpred9_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1410:9: ( typeArgumentsStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1410:10: typeArgumentsStart
        {
        pushFollow(FOLLOW_typeArgumentsStart_in_synpred9_Ceylon9045);
        typeArgumentsStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred9_Ceylon

    // $ANTLR start synpred10_Ceylon
    public void synpred10_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1487:9: ( namedArgumentStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1487:10: namedArgumentStart
        {
        pushFollow(FOLLOW_namedArgumentStart_in_synpred10_Ceylon9527);
        namedArgumentStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_Ceylon

    // $ANTLR start synpred11_Ceylon
    public void synpred11_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1491:9: ( anonymousArgument )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1491:10: anonymousArgument
        {
        pushFollow(FOLLOW_anonymousArgument_in_synpred11_Ceylon9562);
        anonymousArgument();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred11_Ceylon

    // $ANTLR start synpred12_Ceylon
    public void synpred12_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:15: ( namedArgumentStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1739:16: namedArgumentStart
        {
        pushFollow(FOLLOW_namedArgumentStart_in_synpred12_Ceylon11453);
        namedArgumentStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred12_Ceylon

    // $ANTLR start synpred13_Ceylon
    public void synpred13_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1801:7: ( FUNCTION_MODIFIER | VOID_MODIFIER | anonParametersStart )
        int alt261=3;
        switch ( input.LA(1) ) {
        case FUNCTION_MODIFIER:
            {
            alt261=1;
            }
            break;
        case VOID_MODIFIER:
            {
            alt261=2;
            }
            break;
        case LPAREN:
            {
            alt261=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 261, 0, input);

            throw nvae;

        }

        switch (alt261) {
            case 1 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1801:8: FUNCTION_MODIFIER
                {
                match(input,FUNCTION_MODIFIER,FOLLOW_FUNCTION_MODIFIER_in_synpred13_Ceylon11827); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1801:26: VOID_MODIFIER
                {
                match(input,VOID_MODIFIER,FOLLOW_VOID_MODIFIER_in_synpred13_Ceylon11829); if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:1801:40: anonParametersStart
                {
                pushFollow(FOLLOW_anonParametersStart_in_synpred13_Ceylon11831);
                anonParametersStart();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
    }
    // $ANTLR end synpred13_Ceylon

    // $ANTLR start synpred14_Ceylon
    public void synpred14_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2385:7: ( unionType ( PRODUCT_OP | SUM_OP ) )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2385:8: unionType ( PRODUCT_OP | SUM_OP )
        {
        pushFollow(FOLLOW_unionType_in_synpred14_Ceylon15800);
        unionType();

        state._fsp--;
        if (state.failed) return ;

        if ( input.LA(1)==PRODUCT_OP||input.LA(1)==SUM_OP ) {
            input.consume();
            state.errorRecovery=false;
            state.failed=false;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            MismatchedSetException mse = new MismatchedSetException(null,input);
            throw mse;
        }


        }

    }
    // $ANTLR end synpred14_Ceylon

    // $ANTLR start synpred15_Ceylon
    public void synpred15_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2407:7: ( type ( SPECIFY ) )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2407:8: type ( SPECIFY )
        {
        pushFollow(FOLLOW_type_in_synpred15_Ceylon15931);
        type();

        state._fsp--;
        if (state.failed) return ;

        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2407:13: ( SPECIFY )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2407:14: SPECIFY
        {
        match(input,SPECIFY,FOLLOW_SPECIFY_in_synpred15_Ceylon15934); if (state.failed) return ;

        }


        }

    }
    // $ANTLR end synpred15_Ceylon

    // $ANTLR start synpred16_Ceylon
    public void synpred16_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2556:7: ( abbreviatedType MEMBER_OP )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2556:8: abbreviatedType MEMBER_OP
        {
        pushFollow(FOLLOW_abbreviatedType_in_synpred16_Ceylon16813);
        abbreviatedType();

        state._fsp--;
        if (state.failed) return ;

        match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_synpred16_Ceylon16815); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred16_Ceylon

    // $ANTLR start synpred17_Ceylon
    public void synpred17_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2570:7: ( groupedType MEMBER_OP )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2570:8: groupedType MEMBER_OP
        {
        pushFollow(FOLLOW_groupedType_in_synpred17_Ceylon16928);
        groupedType();

        state._fsp--;
        if (state.failed) return ;

        match(input,MEMBER_OP,FOLLOW_MEMBER_OP_in_synpred17_Ceylon16930); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred17_Ceylon

    // $ANTLR start synpred18_Ceylon
    public void synpred18_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2794:7: ( namedAnnotationArgumentsStart )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2794:8: namedAnnotationArgumentsStart
        {
        pushFollow(FOLLOW_namedAnnotationArgumentsStart_in_synpred18_Ceylon18332);
        namedAnnotationArgumentsStart();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred18_Ceylon

    // $ANTLR start synpred19_Ceylon
    public void synpred19_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2873:7: ( compilerAnnotations ( declarationStart | specificationStart ) )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2873:8: compilerAnnotations ( declarationStart | specificationStart )
        {
        pushFollow(FOLLOW_compilerAnnotations_in_synpred19_Ceylon18918);
        compilerAnnotations();

        state._fsp--;
        if (state.failed) return ;

        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2873:28: ( declarationStart | specificationStart )
        int alt262=2;
        int LA262_0 = input.LA(1);

        if ( (LA262_0==ALIAS||LA262_0==ASSIGN||LA262_0==CLASS_DEFINITION||LA262_0==DYNAMIC||LA262_0==FUNCTION_MODIFIER||LA262_0==INTERFACE_DEFINITION||(LA262_0 >= LBRACE && LA262_0 <= LBRACKET)||LA262_0==OBJECT_DEFINITION||LA262_0==SMALLER_OP||LA262_0==UIDENTIFIER||LA262_0==VALUE_MODIFIER||LA262_0==VOID_MODIFIER) ) {
            alt262=1;
        }
        else if ( (LA262_0==LIDENTIFIER) ) {
            alt262=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 262, 0, input);

            throw nvae;

        }
        switch (alt262) {
            case 1 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2873:29: declarationStart
                {
                pushFollow(FOLLOW_declarationStart_in_synpred19_Ceylon18921);
                declarationStart();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2873:46: specificationStart
                {
                pushFollow(FOLLOW_specificationStart_in_synpred19_Ceylon18923);
                specificationStart();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred19_Ceylon

    // $ANTLR start synpred20_Ceylon
    public void synpred20_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2877:9: ( LIDENTIFIER )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2877:10: LIDENTIFIER
        {
        match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_synpred20_Ceylon18968); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred20_Ceylon

    // $ANTLR start synpred21_Ceylon
    public void synpred21_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2887:7: ( compilerAnnotations ( declarationStart | specificationStart ) )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2887:8: compilerAnnotations ( declarationStart | specificationStart )
        {
        pushFollow(FOLLOW_compilerAnnotations_in_synpred21_Ceylon19051);
        compilerAnnotations();

        state._fsp--;
        if (state.failed) return ;

        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2887:28: ( declarationStart | specificationStart )
        int alt263=2;
        int LA263_0 = input.LA(1);

        if ( (LA263_0==ALIAS||LA263_0==ASSIGN||LA263_0==CLASS_DEFINITION||LA263_0==DYNAMIC||LA263_0==FUNCTION_MODIFIER||LA263_0==INTERFACE_DEFINITION||(LA263_0 >= LBRACE && LA263_0 <= LBRACKET)||LA263_0==OBJECT_DEFINITION||LA263_0==SMALLER_OP||LA263_0==UIDENTIFIER||LA263_0==VALUE_MODIFIER||LA263_0==VOID_MODIFIER) ) {
            alt263=1;
        }
        else if ( (LA263_0==LIDENTIFIER) ) {
            alt263=2;
        }
        else {
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 263, 0, input);

            throw nvae;

        }
        switch (alt263) {
            case 1 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2887:29: declarationStart
                {
                pushFollow(FOLLOW_declarationStart_in_synpred21_Ceylon19054);
                declarationStart();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2887:46: specificationStart
                {
                pushFollow(FOLLOW_specificationStart_in_synpred21_Ceylon19056);
                specificationStart();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }


        }

    }
    // $ANTLR end synpred21_Ceylon

    // $ANTLR start synpred22_Ceylon
    public void synpred22_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2891:7: ( LIDENTIFIER )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2891:8: LIDENTIFIER
        {
        match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_synpred22_Ceylon19093); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred22_Ceylon

    // $ANTLR start synpred23_Ceylon
    public void synpred23_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2909:7: ( LIDENTIFIER SPECIFY )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2909:8: LIDENTIFIER SPECIFY
        {
        match(input,LIDENTIFIER,FOLLOW_LIDENTIFIER_in_synpred23_Ceylon19220); if (state.failed) return ;

        match(input,SPECIFY,FOLLOW_SPECIFY_in_synpred23_Ceylon19222); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred23_Ceylon

    // $ANTLR start synpred24_Ceylon
    public void synpred24_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2948:9: ( LBRACE )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:2948:10: LBRACE
        {
        match(input,LBRACE,FOLLOW_LBRACE_in_synpred24_Ceylon19503); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred24_Ceylon

    // $ANTLR start synpred25_Ceylon
    public void synpred25_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3084:7: ( IS_OP )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3084:8: IS_OP
        {
        match(input,IS_OP,FOLLOW_IS_OP_in_synpred25_Ceylon20305); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred25_Ceylon

    // $ANTLR start synpred26_Ceylon
    public void synpred26_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3086:7: ( SATISFIES )
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3086:8: SATISFIES
        {
        match(input,SATISFIES,FOLLOW_SATISFIES_in_synpred26_Ceylon20326); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred26_Ceylon

    // $ANTLR start synpred27_Ceylon
    public void synpred27_Ceylon_fragment() throws RecognitionException {
        // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:9: ( COMPILER_ANNOTATION | declarationStart | specificationStart )
        int alt264=3;
        switch ( input.LA(1) ) {
        case COMPILER_ANNOTATION:
            {
            alt264=1;
            }
            break;
        case ALIAS:
        case ASSIGN:
        case CLASS_DEFINITION:
        case DYNAMIC:
        case FUNCTION_MODIFIER:
        case INTERFACE_DEFINITION:
        case LBRACE:
        case LBRACKET:
        case OBJECT_DEFINITION:
        case SMALLER_OP:
        case UIDENTIFIER:
        case VALUE_MODIFIER:
        case VOID_MODIFIER:
            {
            alt264=2;
            }
            break;
        case LIDENTIFIER:
            {
            alt264=3;
            }
            break;
        default:
            if (state.backtracking>0) {state.failed=true; return ;}
            NoViableAltException nvae =
                new NoViableAltException("", 264, 0, input);

            throw nvae;

        }

        switch (alt264) {
            case 1 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:10: COMPILER_ANNOTATION
                {
                match(input,COMPILER_ANNOTATION,FOLLOW_COMPILER_ANNOTATION_in_synpred27_Ceylon21593); if (state.failed) return ;

                }
                break;
            case 2 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:30: declarationStart
                {
                pushFollow(FOLLOW_declarationStart_in_synpred27_Ceylon21595);
                declarationStart();

                state._fsp--;
                if (state.failed) return ;

                }
                break;
            case 3 :
                // /Users/bastien/Dev/ceylon/ceylon-spec/Ceylon.g:3266:47: specificationStart
                {
                pushFollow(FOLLOW_specificationStart_in_synpred27_Ceylon21597);
                specificationStart();

                state._fsp--;
                if (state.failed) return ;

                }
                break;

        }
    }
    // $ANTLR end synpred27_Ceylon

    // Delegated rules

    public boolean synpred24_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred24_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred25_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred25_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred13_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred13_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred9_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred9_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred10_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred15_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred15_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred7_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred7_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred1_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred16_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred16_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred12_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred12_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred2_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred20_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred20_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred6_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred23_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred23_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred11_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred14_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred14_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred8_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred18_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred18_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred27_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred27_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred4_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred21_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred21_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred22_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred22_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred26_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred26_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred3_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred17_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred17_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred5_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public boolean synpred19_Ceylon() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred19_Ceylon_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA1 dfa1 = new DFA1(this);
    protected DFA106 dfa106 = new DFA106(this);
    protected DFA109 dfa109 = new DFA109(this);
    protected DFA115 dfa115 = new DFA115(this);
    protected DFA116 dfa116 = new DFA116(this);
    static String DFA1_eotS =
        "\10\uffff";
    static String DFA1_eofS =
        "\1\3\7\uffff";
    static String DFA1_minS =
        "\1\7\1\104\2\uffff\1\7\1\156\2\7";
    static String DFA1_maxS =
        "\1\u0081\1\104\2\uffff\1\u0081\1\u0080\2\u0081";
    static String DFA1_acceptS =
        "\2\uffff\1\1\1\2\4\uffff";
    static String DFA1_specialS =
        "\10\uffff}>";
    static String[] DFA1_transitionS = {
            "\1\3\4\uffff\1\3\12\uffff\1\3\2\uffff\1\1\10\uffff\1\3\15\uffff"+
            "\1\3\5\uffff\1\3\1\uffff\1\3\10\uffff\3\3\5\uffff\1\3\7\uffff"+
            "\1\3\5\uffff\1\3\17\uffff\1\2\1\3\4\uffff\1\3\14\uffff\1\3\3"+
            "\uffff\3\3",
            "\1\4",
            "",
            "",
            "\1\3\4\uffff\1\3\12\uffff\1\3\2\uffff\1\1\10\uffff\1\3\15\uffff"+
            "\1\3\7\uffff\1\3\10\uffff\3\3\5\uffff\1\3\7\uffff\1\3\5\uffff"+
            "\1\3\16\uffff\1\5\1\2\1\3\4\uffff\1\3\14\uffff\1\3\3\uffff\3"+
            "\3",
            "\1\6\21\uffff\1\7",
            "\1\3\4\uffff\1\3\12\uffff\1\3\2\uffff\1\1\10\uffff\1\3\15\uffff"+
            "\1\3\7\uffff\1\3\10\uffff\3\3\5\uffff\1\3\7\uffff\1\3\5\uffff"+
            "\1\3\17\uffff\1\2\1\3\4\uffff\1\3\14\uffff\1\3\3\uffff\3\3",
            "\1\3\4\uffff\1\3\12\uffff\1\3\2\uffff\1\1\10\uffff\1\3\15\uffff"+
            "\1\3\7\uffff\1\3\10\uffff\3\3\5\uffff\1\3\7\uffff\1\3\5\uffff"+
            "\1\3\17\uffff\1\2\1\3\4\uffff\1\3\14\uffff\1\3\3\uffff\3\3"
    };

    static short[] DFA1_eot = DFA.unpackEncodedString(DFA1_eotS);
    static short[] DFA1_eof = DFA.unpackEncodedString(DFA1_eofS);
    static char[] DFA1_min = DFA.unpackEncodedStringToUnsignedChars(DFA1_minS);
    static char[] DFA1_max = DFA.unpackEncodedStringToUnsignedChars(DFA1_maxS);
    static short[] DFA1_accept = DFA.unpackEncodedString(DFA1_acceptS);
    static short[] DFA1_special = DFA.unpackEncodedString(DFA1_specialS);
    static short[][] DFA1_transition;

    static {
        int numStates = DFA1_transitionS.length;
        DFA1_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA1_transition[i] = DFA.unpackEncodedString(DFA1_transitionS[i]);
        }
    }

    class DFA1 extends DFA {

        public DFA1(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 1;
            this.eot = DFA1_eot;
            this.eof = DFA1_eof;
            this.min = DFA1_min;
            this.max = DFA1_max;
            this.accept = DFA1_accept;
            this.special = DFA1_special;
            this.transition = DFA1_transition;
        }
        public String getDescription() {
            return "45:7: (ca1= compilerAnnotations SEMICOLON )?";
        }
    }
    static String DFA106_eotS =
        "\100\uffff";
    static String DFA106_eofS =
        "\100\uffff";
    static String DFA106_minS =
        "\1\5\73\uffff\1\0\3\uffff";
    static String DFA106_maxS =
        "\1\176\73\uffff\1\0\3\uffff";
    static String DFA106_acceptS =
        "\1\uffff\1\6\66\uffff\1\1\2\uffff\1\2\1\uffff\1\5\1\3\1\4";
    static String DFA106_specialS =
        "\74\uffff\1\0\3\uffff}>";
    static String[] DFA106_transitionS = {
            "\1\1\2\uffff\2\1\12\uffff\1\1\3\uffff\2\1\1\uffff\3\1\2\uffff"+
            "\3\1\3\uffff\6\1\11\uffff\1\1\2\uffff\1\1\1\uffff\4\1\2\uffff"+
            "\2\1\1\75\1\73\1\1\2\uffff\1\74\1\uffff\1\70\1\uffff\1\1\3\uffff"+
            "\2\1\3\uffff\2\1\4\uffff\10\1\1\uffff\1\1\1\70\7\1\1\70\1\1"+
            "\1\uffff\1\1\1\uffff\2\1\3\uffff\1\1\6\uffff\2\1",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "",
            "",
            ""
    };

    static short[] DFA106_eot = DFA.unpackEncodedString(DFA106_eotS);
    static short[] DFA106_eof = DFA.unpackEncodedString(DFA106_eofS);
    static char[] DFA106_min = DFA.unpackEncodedStringToUnsignedChars(DFA106_minS);
    static char[] DFA106_max = DFA.unpackEncodedStringToUnsignedChars(DFA106_maxS);
    static short[] DFA106_accept = DFA.unpackEncodedString(DFA106_acceptS);
    static short[] DFA106_special = DFA.unpackEncodedString(DFA106_specialS);
    static short[][] DFA106_transition;

    static {
        int numStates = DFA106_transitionS.length;
        DFA106_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA106_transition[i] = DFA.unpackEncodedString(DFA106_transitionS[i]);
        }
    }

    class DFA106 extends DFA {

        public DFA106(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 106;
            this.eot = DFA106_eot;
            this.eof = DFA106_eof;
            this.min = DFA106_min;
            this.max = DFA106_max;
            this.accept = DFA106_accept;
            this.special = DFA106_special;
            this.transition = DFA106_transition;
        }
        public String getDescription() {
            return "()* loopback of 1272:5: ( qualifiedReference | indexOrIndexRange | ( specifierParametersStart )=> parameters | positionalArguments | namedArguments )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA106_60 = input.LA(1);

                         
                        int index106_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred6_Ceylon()) ) {s = 62;}

                        else if ( (true) ) {s = 63;}

                         
                        input.seek(index106_60);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 106, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static String DFA109_eotS =
        "\100\uffff";
    static String DFA109_eofS =
        "\100\uffff";
    static String DFA109_minS =
        "\1\5\1\0\76\uffff";
    static String DFA109_maxS =
        "\1\176\1\0\76\uffff";
    static String DFA109_acceptS =
        "\2\uffff\1\2\74\3\1\1";
    static String DFA109_specialS =
        "\1\1\1\0\76\uffff}>";
    static String[] DFA109_transitionS = {
            "\1\53\2\uffff\1\46\1\63\12\uffff\1\42\3\uffff\1\11\1\31\1\uffff"+
            "\1\10\1\62\1\65\2\uffff\1\3\1\22\1\56\3\uffff\1\23\1\50\1\26"+
            "\1\43\1\27\1\40\11\uffff\1\45\2\uffff\1\4\1\uffff\1\6\1\60\1"+
            "\32\1\37\2\uffff\1\34\1\33\1\76\1\74\1\1\2\uffff\1\75\1\uffff"+
            "\1\71\1\uffff\1\55\3\uffff\1\30\1\44\3\uffff\1\47\1\64\4\uffff"+
            "\1\5\1\15\1\16\1\24\1\12\1\13\1\17\1\57\1\uffff\1\14\1\72\1"+
            "\41\1\20\1\25\1\66\1\36\1\35\1\52\1\73\1\70\1\uffff\1\67\1\uffff"+
            "\1\54\1\21\3\uffff\1\51\4\uffff\1\2\1\uffff\1\7\1\61",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static short[] DFA109_eot = DFA.unpackEncodedString(DFA109_eotS);
    static short[] DFA109_eof = DFA.unpackEncodedString(DFA109_eofS);
    static char[] DFA109_min = DFA.unpackEncodedStringToUnsignedChars(DFA109_minS);
    static char[] DFA109_max = DFA.unpackEncodedStringToUnsignedChars(DFA109_maxS);
    static short[] DFA109_accept = DFA.unpackEncodedString(DFA109_acceptS);
    static short[] DFA109_special = DFA.unpackEncodedString(DFA109_specialS);
    static short[][] DFA109_transition;

    static {
        int numStates = DFA109_transitionS.length;
        DFA109_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA109_transition[i] = DFA.unpackEncodedString(DFA109_transitionS[i]);
        }
    }

    class DFA109 extends DFA {

        public DFA109(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 109;
            this.eot = DFA109_eot;
            this.eof = DFA109_eof;
            this.min = DFA109_min;
            this.max = DFA109_max;
            this.accept = DFA109_accept;
            this.special = DFA109_special;
            this.transition = DFA109_transition;
        }
        public String getDescription() {
            return "1325:7: ( memberReference | typeReference | (~ ( LIDENTIFIER | UIDENTIFIER ) )=>)";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA109_1 = input.LA(1);

                         
                        int index109_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (true) ) {s = 63;}

                        else if ( (synpred7_Ceylon()) ) {s = 62;}

                         
                        input.seek(index109_1);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA109_0 = input.LA(1);

                         
                        int index109_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA109_0==LIDENTIFIER) ) {s = 1;}

                        else if ( (LA109_0==UIDENTIFIER) ) {s = 2;}

                        else if ( (LA109_0==DECREMENT_OP) && (synpred7_Ceylon())) {s = 3;}

                        else if ( (LA109_0==INCREMENT_OP) && (synpred7_Ceylon())) {s = 4;}

                        else if ( (LA109_0==POWER_OP) && (synpred7_Ceylon())) {s = 5;}

                        else if ( (LA109_0==INTERSECTION_OP) && (synpred7_Ceylon())) {s = 6;}

                        else if ( (LA109_0==UNION_OP) && (synpred7_Ceylon())) {s = 7;}

                        else if ( (LA109_0==COMPLEMENT_OP) && (synpred7_Ceylon())) {s = 8;}

                        else if ( (LA109_0==COMMA) && (synpred7_Ceylon())) {s = 9;}

                        else if ( (LA109_0==RBRACE) && (synpred7_Ceylon())) {s = 10;}

                        else if ( (LA109_0==RBRACKET) && (synpred7_Ceylon())) {s = 11;}

                        else if ( (LA109_0==RPAREN) && (synpred7_Ceylon())) {s = 12;}

                        else if ( (LA109_0==PRODUCT_OP) && (synpred7_Ceylon())) {s = 13;}

                        else if ( (LA109_0==QUOTIENT_OP) && (synpred7_Ceylon())) {s = 14;}

                        else if ( (LA109_0==REMAINDER_OP) && (synpred7_Ceylon())) {s = 15;}

                        else if ( (LA109_0==SCALE_OP) && (synpred7_Ceylon())) {s = 16;}

                        else if ( (LA109_0==SUM_OP) && (synpred7_Ceylon())) {s = 17;}

                        else if ( (LA109_0==DIFFERENCE_OP) && (synpred7_Ceylon())) {s = 18;}

                        else if ( (LA109_0==ELLIPSIS) && (synpred7_Ceylon())) {s = 19;}

                        else if ( (LA109_0==RANGE_OP) && (synpred7_Ceylon())) {s = 20;}

                        else if ( (LA109_0==SEGMENT_OP) && (synpred7_Ceylon())) {s = 21;}

                        else if ( (LA109_0==ENTRY_OP) && (synpred7_Ceylon())) {s = 22;}

                        else if ( (LA109_0==EXISTS) && (synpred7_Ceylon())) {s = 23;}

                        else if ( (LA109_0==NONEMPTY) && (synpred7_Ceylon())) {s = 24;}

                        else if ( (LA109_0==COMPARE_OP) && (synpred7_Ceylon())) {s = 25;}

                        else if ( (LA109_0==IN_OP) && (synpred7_Ceylon())) {s = 26;}

                        else if ( (LA109_0==LARGE_AS_OP) && (synpred7_Ceylon())) {s = 27;}

                        else if ( (LA109_0==LARGER_OP) && (synpred7_Ceylon())) {s = 28;}

                        else if ( (LA109_0==SMALL_AS_OP) && (synpred7_Ceylon())) {s = 29;}

                        else if ( (LA109_0==SMALLER_OP) && (synpred7_Ceylon())) {s = 30;}

                        else if ( (LA109_0==IS_OP) && (synpred7_Ceylon())) {s = 31;}

                        else if ( (LA109_0==EXTENDS) && (synpred7_Ceylon())) {s = 32;}

                        else if ( (LA109_0==SATISFIES) && (synpred7_Ceylon())) {s = 33;}

                        else if ( (LA109_0==CASE_TYPES) && (synpred7_Ceylon())) {s = 34;}

                        else if ( (LA109_0==EQUAL_OP) && (synpred7_Ceylon())) {s = 35;}

                        else if ( (LA109_0==NOT_EQUAL_OP) && (synpred7_Ceylon())) {s = 36;}

                        else if ( (LA109_0==IDENTICAL_OP) && (synpred7_Ceylon())) {s = 37;}

                        else if ( (LA109_0==AND_OP) && (synpred7_Ceylon())) {s = 38;}

                        else if ( (LA109_0==OR_OP) && (synpred7_Ceylon())) {s = 39;}

                        else if ( (LA109_0==ELSE_CLAUSE) && (synpred7_Ceylon())) {s = 40;}

                        else if ( (LA109_0==THEN_CLAUSE) && (synpred7_Ceylon())) {s = 41;}

                        else if ( (LA109_0==SPECIFY) && (synpred7_Ceylon())) {s = 42;}

                        else if ( (LA109_0==ADD_SPECIFY) && (synpred7_Ceylon())) {s = 43;}

                        else if ( (LA109_0==SUBTRACT_SPECIFY) && (synpred7_Ceylon())) {s = 44;}

                        else if ( (LA109_0==MULTIPLY_SPECIFY) && (synpred7_Ceylon())) {s = 45;}

                        else if ( (LA109_0==DIVIDE_SPECIFY) && (synpred7_Ceylon())) {s = 46;}

                        else if ( (LA109_0==REMAINDER_SPECIFY) && (synpred7_Ceylon())) {s = 47;}

                        else if ( (LA109_0==INTERSECT_SPECIFY) && (synpred7_Ceylon())) {s = 48;}

                        else if ( (LA109_0==UNION_SPECIFY) && (synpred7_Ceylon())) {s = 49;}

                        else if ( (LA109_0==COMPLEMENT_SPECIFY) && (synpred7_Ceylon())) {s = 50;}

                        else if ( (LA109_0==AND_SPECIFY) && (synpred7_Ceylon())) {s = 51;}

                        else if ( (LA109_0==OR_SPECIFY) && (synpred7_Ceylon())) {s = 52;}

                        else if ( (LA109_0==COMPUTE) && (synpred7_Ceylon())) {s = 53;}

                        else if ( (LA109_0==SEMICOLON) && (synpred7_Ceylon())) {s = 54;}

                        else if ( (LA109_0==STRING_MID) && (synpred7_Ceylon())) {s = 55;}

                        else if ( (LA109_0==STRING_END) && (synpred7_Ceylon())) {s = 56;}

                        else if ( (LA109_0==MEMBER_OP) && (synpred7_Ceylon())) {s = 57;}

                        else if ( (LA109_0==SAFE_MEMBER_OP) && (synpred7_Ceylon())) {s = 58;}

                        else if ( (LA109_0==SPREAD_OP) && (synpred7_Ceylon())) {s = 59;}

                        else if ( (LA109_0==LBRACKET) && (synpred7_Ceylon())) {s = 60;}

                        else if ( (LA109_0==LPAREN) && (synpred7_Ceylon())) {s = 61;}

                        else if ( (LA109_0==LBRACE) && (synpred7_Ceylon())) {s = 62;}

                         
                        input.seek(index109_0);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 109, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static String DFA115_eotS =
        "\117\uffff";
    static String DFA115_eofS =
        "\117\uffff";
    static String DFA115_minS =
        "\1\5\1\0\115\uffff";
    static String DFA115_maxS =
        "\1\u0081\1\0\115\uffff";
    static String DFA115_acceptS =
        "\2\uffff\1\2\113\uffff\1\1";
    static String DFA115_specialS =
        "\1\uffff\1\0\115\uffff}>";
    static String[] DFA115_transitionS = {
            "\1\2\2\uffff\2\2\5\uffff\1\2\4\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\2\2\1\uffff\3\2\2\uffff\3\2\3\uffff\6\2\3\uffff\1\2\1\uffff"+
            "\1\2\3\uffff\1\2\2\uffff\1\2\1\uffff\4\2\2\uffff\5\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\2\uffff\4\2\2\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\10\2\1\uffff\6\2\1\1\12\2\2\uffff\2\2\3\uffff\1"+
            "\2\1\uffff\5\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static short[] DFA115_eot = DFA.unpackEncodedString(DFA115_eotS);
    static short[] DFA115_eof = DFA.unpackEncodedString(DFA115_eofS);
    static char[] DFA115_min = DFA.unpackEncodedStringToUnsignedChars(DFA115_minS);
    static char[] DFA115_max = DFA.unpackEncodedStringToUnsignedChars(DFA115_maxS);
    static short[] DFA115_accept = DFA.unpackEncodedString(DFA115_acceptS);
    static short[] DFA115_special = DFA.unpackEncodedString(DFA115_specialS);
    static short[][] DFA115_transition;

    static {
        int numStates = DFA115_transitionS.length;
        DFA115_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA115_transition[i] = DFA.unpackEncodedString(DFA115_transitionS[i]);
        }
    }

    class DFA115 extends DFA {

        public DFA115(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 115;
            this.eot = DFA115_eot;
            this.eof = DFA115_eof;
            this.min = DFA115_min;
            this.max = DFA115_max;
            this.accept = DFA115_accept;
            this.special = DFA115_special;
            this.transition = DFA115_transition;
        }
        public String getDescription() {
            return "1398:7: ( ( typeArgumentsStart )=> typeArguments )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA115_1 = input.LA(1);

                         
                        int index115_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred8_Ceylon()) ) {s = 78;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index115_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 115, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static String DFA116_eotS =
        "\77\uffff";
    static String DFA116_eofS =
        "\77\uffff";
    static String DFA116_minS =
        "\1\5\1\0\75\uffff";
    static String DFA116_maxS =
        "\1\176\1\0\75\uffff";
    static String DFA116_acceptS =
        "\2\uffff\1\2\73\uffff\1\1";
    static String DFA116_specialS =
        "\1\uffff\1\0\75\uffff}>";
    static String[] DFA116_transitionS = {
            "\1\2\2\uffff\2\2\12\uffff\1\2\3\uffff\2\2\1\uffff\3\2\2\uffff"+
            "\3\2\3\uffff\6\2\11\uffff\1\2\2\uffff\1\2\1\uffff\4\2\2\uffff"+
            "\5\2\2\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\2\2\3\uffff"+
            "\2\2\4\uffff\10\2\1\uffff\6\2\1\1\4\2\1\uffff\1\2\1\uffff\2"+
            "\2\3\uffff\1\2\6\uffff\2\2",
            "\1\uffff",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static short[] DFA116_eot = DFA.unpackEncodedString(DFA116_eotS);
    static short[] DFA116_eof = DFA.unpackEncodedString(DFA116_eofS);
    static char[] DFA116_min = DFA.unpackEncodedStringToUnsignedChars(DFA116_minS);
    static char[] DFA116_max = DFA.unpackEncodedStringToUnsignedChars(DFA116_maxS);
    static short[] DFA116_accept = DFA.unpackEncodedString(DFA116_acceptS);
    static short[] DFA116_special = DFA.unpackEncodedString(DFA116_specialS);
    static short[][] DFA116_transition;

    static {
        int numStates = DFA116_transitionS.length;
        DFA116_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA116_transition[i] = DFA.unpackEncodedString(DFA116_transitionS[i]);
        }
    }

    class DFA116 extends DFA {

        public DFA116(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 116;
            this.eot = DFA116_eot;
            this.eof = DFA116_eof;
            this.min = DFA116_min;
            this.max = DFA116_max;
            this.accept = DFA116_accept;
            this.special = DFA116_special;
            this.transition = DFA116_transition;
        }
        public String getDescription() {
            return "1409:7: ( ( typeArgumentsStart )=> typeArguments )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA116_1 = input.LA(1);

                         
                        int index116_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred9_Ceylon()) ) {s = 62;}

                        else if ( (true) ) {s = 2;}

                         
                        input.seek(index116_1);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 116, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static BitSet FOLLOW_compilerAnnotations_in_compilationUnit86 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_compilationUnit96 = new BitSet(new long[]{0x0282000804801080L,0x880042000104041CL,0x0000000000000003L});
    public static BitSet FOLLOW_importDeclaration_in_compilationUnit134 = new BitSet(new long[]{0x0282000804801080L,0x880042000104041CL,0x0000000000000003L});
    public static BitSet FOLLOW_moduleDescriptor_in_compilationUnit180 = new BitSet(new long[]{0x0282000804801080L,0x880042000104041CL,0x0000000000000003L});
    public static BitSet FOLLOW_packageDescriptor_in_compilationUnit226 = new BitSet(new long[]{0x0282000804801080L,0x880042000104041CL,0x0000000000000003L});
    public static BitSet FOLLOW_compilerAnnotations_in_compilationUnit256 = new BitSet(new long[]{0x0202000800801080L,0x880042000004001CL,0x0000000000000003L});
    public static BitSet FOLLOW_declaration_in_compilationUnit258 = new BitSet(new long[]{0x0282000804801080L,0x880042000104041CL,0x0000000000000003L});
    public static BitSet FOLLOW_EOF_in_compilationUnit286 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_moduleDescriptor307 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000410L,0x0000000000000001L});
    public static BitSet FOLLOW_annotations_in_moduleDescriptor309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static BitSet FOLLOW_MODULE_in_moduleDescriptor317 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_packagePath_in_moduleDescriptor334 = new BitSet(new long[]{0x0000000000400000L,0x0000400000000000L});
    public static BitSet FOLLOW_CHAR_LITERAL_in_moduleDescriptor360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_STRING_LITERAL_in_moduleDescriptor388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_importModuleList_in_moduleDescriptor414 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_importModuleList443 = new BitSet(new long[]{0x0080000004000000L,0x0000400040000010L,0x0000000000000001L});
    public static BitSet FOLLOW_compilerAnnotations_in_importModuleList469 = new BitSet(new long[]{0x0080000000000000L,0x0000400000000010L,0x0000000000000001L});
    public static BitSet FOLLOW_annotations_in_importModuleList471 = new BitSet(new long[]{0x0080000000000000L});
    public static BitSet FOLLOW_importModule_in_importModuleList481 = new BitSet(new long[]{0x0080000004000000L,0x0000400040000010L,0x0000000000000001L});
    public static BitSet FOLLOW_RBRACE_in_importModuleList508 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_packageDescriptor537 = new BitSet(new long[]{0x0000000000000000L,0x0000400001000010L,0x0000000000000001L});
    public static BitSet FOLLOW_annotations_in_packageDescriptor539 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static BitSet FOLLOW_PACKAGE_in_packageDescriptor547 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_packagePath_in_packageDescriptor564 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_packageDescriptor580 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IMPORT_in_importModule609 = new BitSet(new long[]{0x0000000000400000L,0x0800400000000010L});
    public static BitSet FOLLOW_CHAR_LITERAL_in_importModule638 = new BitSet(new long[]{0x0000000000400000L,0x0000410000000000L});
    public static BitSet FOLLOW_STRING_LITERAL_in_importModule668 = new BitSet(new long[]{0x0000000000400000L,0x0000410000000000L});
    public static BitSet FOLLOW_packagePath_in_importModule696 = new BitSet(new long[]{0x0000000000400000L,0x0000410000000000L});
    public static BitSet FOLLOW_CHAR_LITERAL_in_importModule734 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_STRING_LITERAL_in_importModule764 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_importModule791 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IMPORT_in_importDeclaration820 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000014L});
    public static BitSet FOLLOW_packagePath_in_importDeclaration848 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_importElementList_in_importDeclaration884 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_importElementList926 = new BitSet(new long[]{0x0000004004000000L,0x0800000040000010L});
    public static BitSet FOLLOW_importElement_in_importElementList949 = new BitSet(new long[]{0x0000000001000000L,0x0000000040000000L});
    public static BitSet FOLLOW_COMMA_in_importElementList980 = new BitSet(new long[]{0x0000004005000000L,0x0800000040000010L});
    public static BitSet FOLLOW_importElement_in_importElementList1015 = new BitSet(new long[]{0x0000000001000000L,0x0000000040000000L});
    public static BitSet FOLLOW_importWildcard_in_importElementList1043 = new BitSet(new long[]{0x0000000001000000L,0x0000000040000000L});
    public static BitSet FOLLOW_importWildcard_in_importElementList1097 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static BitSet FOLLOW_RBRACE_in_importElementList1112 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_importElement1148 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_importName_in_importElement1158 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000004L});
    public static BitSet FOLLOW_SPECIFY_in_importElement1177 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000014L});
    public static BitSet FOLLOW_importName_in_importElement1211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static BitSet FOLLOW_importElementList_in_importElement1275 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ELLIPSIS_in_importWildcard1327 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_importName1356 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeName_in_importName1366 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_packageName_in_packagePath1400 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_packagePath1431 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000210L});
    public static BitSet FOLLOW_packageName_in_packagePath1466 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static BitSet FOLLOW_LIDENTIFIER_in_packageName1531 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_UIDENTIFIER_in_packageName1555 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_UIDENTIFIER_in_typeName1584 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LIDENTIFIER_in_annotationName1613 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LIDENTIFIER_in_memberName1642 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_memberNameDeclaration1675 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeName_in_memberNameDeclaration1693 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeName_in_typeNameDeclaration1723 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_typeNameDeclaration1741 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_OBJECT_DEFINITION_in_objectDeclaration1771 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_objectDeclaration1787 = new BitSet(new long[]{0x0000080000000000L,0x0000012000000004L});
    public static BitSet FOLLOW_extendedType_in_objectDeclaration1814 = new BitSet(new long[]{0x0000000000000000L,0x0000012000000004L});
    public static BitSet FOLLOW_satisfiedTypes_in_objectDeclaration1853 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000004L});
    public static BitSet FOLLOW_classBody_in_objectDeclaration1891 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SEMICOLON_in_objectDeclaration1921 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VOID_MODIFIER_in_voidOrInferredMethodDeclaration1979 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_voidOrInferredMethodDeclaration1999 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_voidOrInferredMethodDeclaration2025 = new BitSet(new long[]{0x0000000024000000L,0x04000B0000000084L});
    public static BitSet FOLLOW_typeParameters_in_voidOrInferredMethodDeclaration2051 = new BitSet(new long[]{0x0000000024000000L,0x0400090000000084L});
    public static BitSet FOLLOW_parameters_in_voidOrInferredMethodDeclaration2096 = new BitSet(new long[]{0x0000000024000000L,0x0400090000000084L});
    public static BitSet FOLLOW_typeConstraints_in_voidOrInferredMethodDeclaration2140 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000004L});
    public static BitSet FOLLOW_block_in_voidOrInferredMethodDeclaration2188 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionSpecifier_in_voidOrInferredMethodDeclaration2230 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_voidOrInferredMethodDeclaration2273 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ASSIGN_in_setterDeclaration2322 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_setterDeclaration2339 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000004L});
    public static BitSet FOLLOW_block_in_setterDeclaration2367 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionSpecifier_in_setterDeclaration2399 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_setterDeclaration2442 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VALUE_MODIFIER_in_inferredAttributeDeclaration2490 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_inferredAttributeDeclaration2507 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000004L});
    public static BitSet FOLLOW_specifier_in_inferredAttributeDeclaration2546 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_lazySpecifier_in_inferredAttributeDeclaration2581 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_inferredAttributeDeclaration2624 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_block_in_inferredAttributeDeclaration2663 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_variadicType_in_typedMethodOrAttributeDeclaration2713 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_DYNAMIC_in_typedMethodOrAttributeDeclaration2733 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_typedMethodOrAttributeDeclaration2759 = new BitSet(new long[]{0x0000000020000000L,0x00000B0000000084L});
    public static BitSet FOLLOW_typeParameters_in_typedMethodOrAttributeDeclaration2808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_parameters_in_typedMethodOrAttributeDeclaration2853 = new BitSet(new long[]{0x0000000024000000L,0x0400090000000084L});
    public static BitSet FOLLOW_typeConstraints_in_typedMethodOrAttributeDeclaration2908 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000004L});
    public static BitSet FOLLOW_block_in_typedMethodOrAttributeDeclaration2968 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionSpecifier_in_typedMethodOrAttributeDeclaration3018 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_typedMethodOrAttributeDeclaration3070 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_specifier_in_typedMethodOrAttributeDeclaration3125 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_lazySpecifier_in_typedMethodOrAttributeDeclaration3163 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_typedMethodOrAttributeDeclaration3209 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_block_in_typedMethodOrAttributeDeclaration3250 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_INTERFACE_DEFINITION_in_interfaceDeclaration3298 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_typeNameDeclaration_in_interfaceDeclaration3314 = new BitSet(new long[]{0x0000000024100000L,0x04000B2000000004L});
    public static BitSet FOLLOW_typeParameters_in_interfaceDeclaration3341 = new BitSet(new long[]{0x0000000024100000L,0x0400092000000004L});
    public static BitSet FOLLOW_caseTypes_in_interfaceDeclaration3379 = new BitSet(new long[]{0x0000000024000000L,0x0400092000000004L});
    public static BitSet FOLLOW_satisfiedTypes_in_interfaceDeclaration3433 = new BitSet(new long[]{0x0000000024000000L,0x0400090000000004L});
    public static BitSet FOLLOW_typeConstraints_in_interfaceDeclaration3470 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000004L});
    public static BitSet FOLLOW_interfaceBody_in_interfaceDeclaration3517 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeSpecifier_in_interfaceDeclaration3558 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_interfaceDeclaration3602 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CLASS_DEFINITION_in_classDeclaration3650 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_typeNameDeclaration_in_classDeclaration3667 = new BitSet(new long[]{0x0000080024100000L,0x04000B2000000084L});
    public static BitSet FOLLOW_typeParameters_in_classDeclaration3693 = new BitSet(new long[]{0x0000080024100000L,0x0400092000000084L});
    public static BitSet FOLLOW_parameters_in_classDeclaration3730 = new BitSet(new long[]{0x0000080024100000L,0x0400092000000004L});
    public static BitSet FOLLOW_caseTypes_in_classDeclaration3767 = new BitSet(new long[]{0x0000080024000000L,0x0400092000000004L});
    public static BitSet FOLLOW_extendedType_in_classDeclaration3813 = new BitSet(new long[]{0x0000000024000000L,0x0400092000000004L});
    public static BitSet FOLLOW_satisfiedTypes_in_classDeclaration3851 = new BitSet(new long[]{0x0000000024000000L,0x0400090000000004L});
    public static BitSet FOLLOW_typeConstraints_in_classDeclaration3888 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000004L});
    public static BitSet FOLLOW_classBody_in_classDeclaration3935 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_classSpecifier_in_classDeclaration3976 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_classDeclaration4019 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ALIAS_in_aliasDeclaration4058 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_typeNameDeclaration_in_aliasDeclaration4074 = new BitSet(new long[]{0x0000000024000000L,0x04000B0000000000L});
    public static BitSet FOLLOW_typeParameters_in_aliasDeclaration4101 = new BitSet(new long[]{0x0000000024000000L,0x0400090000000000L});
    public static BitSet FOLLOW_typeConstraints_in_aliasDeclaration4139 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000000L});
    public static BitSet FOLLOW_typeSpecifier_in_aliasDeclaration4176 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_aliasDeclaration4211 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_annotations_in_assertion4240 = new BitSet(new long[]{0x0000000000000800L});
    public static BitSet FOLLOW_ASSERT_in_assertion4248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_conditions_in_assertion4264 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_assertion4288 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_block4317 = new BitSet(new long[]{0x0343800B44C19880L,0x8B9D42044186409CL,0x0000000000000007L});
    public static BitSet FOLLOW_declarationOrStatement_in_block4344 = new BitSet(new long[]{0x0343800B44C19880L,0x8B9D42044186409CL,0x0000000000000007L});
    public static BitSet FOLLOW_RBRACE_in_block4371 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_interfaceBody4404 = new BitSet(new long[]{0x0343800B44C19880L,0x8B9D42044186409CL,0x0000000000000007L});
    public static BitSet FOLLOW_declarationOrStatement_in_interfaceBody4431 = new BitSet(new long[]{0x0343800B44C19880L,0x8B9D42044186409CL,0x0000000000000007L});
    public static BitSet FOLLOW_RBRACE_in_interfaceBody4458 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_classBody4487 = new BitSet(new long[]{0x0343800B44C19880L,0x8B9D42044186409CL,0x0000000000000007L});
    public static BitSet FOLLOW_declarationOrStatement_in_classBody4513 = new BitSet(new long[]{0x0343800B44C19880L,0x8B9D42044186409CL,0x0000000000000007L});
    public static BitSet FOLLOW_RBRACE_in_classBody4540 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_EXTENDS_in_extendedType4569 = new BitSet(new long[]{0x0000000000000000L,0x0808000000000000L});
    public static BitSet FOLLOW_classInstantiation_in_extendedType4581 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPUTE_in_classSpecifier4620 = new BitSet(new long[]{0x0000000000000000L,0x0808000000000000L});
    public static BitSet FOLLOW_SPECIFY_in_classSpecifier4649 = new BitSet(new long[]{0x0000000000000000L,0x0808000000000000L});
    public static BitSet FOLLOW_classInstantiation_in_classSpecifier4678 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeNameWithArguments_in_classInstantiation4728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static BitSet FOLLOW_SUPER_in_classInstantiation4748 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_classInstantiation4750 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static BitSet FOLLOW_typeNameWithArguments_in_classInstantiation4763 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static BitSet FOLLOW_positionalArguments_in_classInstantiation4800 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SATISFIES_in_satisfiedTypes4840 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_abbreviatedType_in_satisfiedTypes4870 = new BitSet(new long[]{0x0400000000000002L});
    public static BitSet FOLLOW_INTERSECTION_OP_in_satisfiedTypes4909 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_abbreviatedType_in_satisfiedTypes4943 = new BitSet(new long[]{0x0400000000000002L});
    public static BitSet FOLLOW_ABSTRACTED_TYPE_in_abstractedType4995 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static BitSet FOLLOW_qualifiedType_in_abstractedType5011 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CASE_TYPES_in_caseTypes5043 = new BitSet(new long[]{0x0000000000000000L,0x080002000000001CL});
    public static BitSet FOLLOW_caseType_in_caseTypes5061 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static BitSet FOLLOW_UNION_OP_in_caseTypes5090 = new BitSet(new long[]{0x0000000000000000L,0x080002000000001CL});
    public static BitSet FOLLOW_caseType_in_caseTypes5125 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static BitSet FOLLOW_abbreviatedType_in_caseType5179 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_caseType5196 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_parameters5236 = new BitSet(new long[]{0x0002000804000000L,0x880042080000001CL,0x0000000000000003L});
    public static BitSet FOLLOW_parameterDeclarationOrRef_in_parameters5264 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_COMMA_in_parameters5299 = new BitSet(new long[]{0x0002000805000000L,0x880042080000001CL,0x0000000000000003L});
    public static BitSet FOLLOW_parameterDeclarationOrRef_in_parameters5339 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_parameters5419 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_variadicType_in_parameter5472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_VOID_MODIFIER_in_parameter5492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_parameter5512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_DYNAMIC_in_parameter5532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_VALUE_MODIFIER_in_parameter5552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_memberName_in_parameter5578 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000080L});
    public static BitSet FOLLOW_specifier_in_parameter5616 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_parameters_in_parameter5669 = new BitSet(new long[]{0x0000000020000002L,0x0000080000000080L});
    public static BitSet FOLLOW_functionSpecifier_in_parameter5714 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_parameterRef5766 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static BitSet FOLLOW_specifier_in_parameterRef5792 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_parameterRef_in_parameterDeclarationOrRef5840 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_parameterDeclarationOrRef5863 = new BitSet(new long[]{0x0002000800000000L,0x880042000000001CL,0x0000000000000003L});
    public static BitSet FOLLOW_annotations_in_parameterDeclarationOrRef5871 = new BitSet(new long[]{0x0002000800000000L,0x880002000000000CL,0x0000000000000002L});
    public static BitSet FOLLOW_parameter_in_parameterDeclarationOrRef5881 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SMALLER_OP_in_typeParameters5910 = new BitSet(new long[]{0x1000000004000000L,0x0800000000400010L});
    public static BitSet FOLLOW_typeParameter_in_typeParameters5928 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static BitSet FOLLOW_COMMA_in_typeParameters5956 = new BitSet(new long[]{0x1000000005000000L,0x0800000000400011L});
    public static BitSet FOLLOW_typeParameter_in_typeParameters5990 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static BitSet FOLLOW_LARGER_OP_in_typeParameters6041 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_typeParameter6078 = new BitSet(new long[]{0x1000000000000000L,0x0800000000400010L});
    public static BitSet FOLLOW_variance_in_typeParameter6097 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_typeNameDeclaration_in_typeParameter6127 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static BitSet FOLLOW_typeDefault_in_typeParameter6153 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IN_OP_in_variance6201 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_OUT_in_variance6217 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_typeConstraint6250 = new BitSet(new long[]{0x0000000000000000L,0x0400000000000000L});
    public static BitSet FOLLOW_TYPE_CONSTRAINT_in_typeConstraint6258 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_typeNameDeclaration_in_typeConstraint6274 = new BitSet(new long[]{0x0000000000100012L,0x0000002000000080L});
    public static BitSet FOLLOW_parameters_in_typeConstraint6308 = new BitSet(new long[]{0x0000000000100012L,0x0000002000000000L});
    public static BitSet FOLLOW_caseTypes_in_typeConstraint6345 = new BitSet(new long[]{0x0000000000000012L,0x0000002000000000L});
    public static BitSet FOLLOW_satisfiedTypes_in_typeConstraint6389 = new BitSet(new long[]{0x0000000000000012L});
    public static BitSet FOLLOW_abstractedType_in_typeConstraint6427 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeConstraint_in_typeConstraints6485 = new BitSet(new long[]{0x0000000004000002L,0x0400000000000000L});
    public static BitSet FOLLOW_stringLiteral_in_annotationListStart6522 = new BitSet(new long[]{0x0002000000000000L,0x0800000000000010L,0x0000000000000002L});
    public static BitSet FOLLOW_annotation_in_annotationListStart6524 = new BitSet(new long[]{0x0002000000000000L,0x0800000000000010L,0x0000000000000002L});
    public static BitSet FOLLOW_set_in_annotationListStart6534 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_declarationOrStatement6574 = new BitSet(new long[]{0x0343800B40C19880L,0x8B9D42040186409CL,0x0000000000000007L});
    public static BitSet FOLLOW_declaration_in_declarationOrStatement6601 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_assertion_in_declarationOrStatement6627 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_declaration_in_declarationOrStatement6655 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_statement_in_declarationOrStatement6677 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_annotations_in_declaration6733 = new BitSet(new long[]{0x0202000800801080L,0x880002000004000CL,0x0000000000000002L});
    public static BitSet FOLLOW_objectDeclaration_in_declaration6756 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_setterDeclaration_in_declaration6772 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_voidOrInferredMethodDeclaration_in_declaration6788 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_inferredAttributeDeclaration_in_declaration6804 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typedMethodOrAttributeDeclaration_in_declaration6820 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_classDeclaration_in_declaration6836 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_interfaceDeclaration_in_declaration6852 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_aliasDeclaration_in_declaration6868 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_stringLiteral_in_annotatedDeclarationStart6911 = new BitSet(new long[]{0x0202000800801080L,0x880002000004001CL,0x0000000000000002L});
    public static BitSet FOLLOW_annotation_in_annotatedDeclarationStart6914 = new BitSet(new long[]{0x0202000800801080L,0x880002000004001CL,0x0000000000000002L});
    public static BitSet FOLLOW_declarationStart_in_annotatedDeclarationStart6917 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_stringLiteral_in_annotatedAssertionStart6934 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000010L});
    public static BitSet FOLLOW_annotation_in_annotatedAssertionStart6937 = new BitSet(new long[]{0x0000000000000800L,0x0000000000000010L});
    public static BitSet FOLLOW_ASSERT_in_annotatedAssertionStart6940 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VALUE_MODIFIER_in_declarationStart6960 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_set_in_declarationStart6962 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_declarationStart6975 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_set_in_declarationStart6977 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VOID_MODIFIER_in_declarationStart6990 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_set_in_declarationStart6992 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ASSIGN_in_declarationStart7005 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_INTERFACE_DEFINITION_in_declarationStart7013 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CLASS_DEFINITION_in_declarationStart7021 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_OBJECT_DEFINITION_in_declarationStart7029 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ALIAS_in_declarationStart7037 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_variadicType_in_declarationStart7047 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_DYNAMIC_in_declarationStart7049 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_LIDENTIFIER_in_declarationStart7052 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_directiveStatement_in_statement7073 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_controlStatement_in_statement7089 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expressionOrSpecificationStatement_in_statement7105 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expression_in_expressionOrSpecificationStatement7143 = new BitSet(new long[]{0x0000000021000000L,0x0000010000000000L});
    public static BitSet FOLLOW_lazySpecifier_in_expressionOrSpecificationStatement7179 = new BitSet(new long[]{0x0000000001000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_expressionOrSpecificationStatement7224 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMMA_in_expressionOrSpecificationStatement7254 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_directive_in_directiveStatement7303 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_directiveStatement7329 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_returnDirective_in_directive7366 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_throwDirective_in_directive7382 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_breakDirective_in_directive7398 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_continueDirective_in_directive7414 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_RETURN_in_returnDirective7443 = new BitSet(new long[]{0x0102800300408002L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_functionOrExpression_in_returnDirective7470 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_THROW_in_throwDirective7510 = new BitSet(new long[]{0x0100800300408002L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_expression_in_throwDirective7537 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_BREAK_in_breakDirective7577 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CONTINUE_in_continueDirective7606 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPUTE_in_typeSpecifier7645 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_SPECIFY_in_typeSpecifier7674 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_typeSpecifier7701 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SPECIFY_in_typeDefault7730 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_typeDefault7747 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SPECIFY_in_specifier7776 = new BitSet(new long[]{0x0102800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_functionOrExpression_in_specifier7792 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPUTE_in_lazySpecifier7821 = new BitSet(new long[]{0x0102800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_functionOrExpression_in_lazySpecifier7837 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPUTE_in_functionSpecifier7876 = new BitSet(new long[]{0x0102800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_SPECIFY_in_functionSpecifier7904 = new BitSet(new long[]{0x0102800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_functionOrExpression_in_functionSpecifier7930 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_assignmentExpression_in_expression7967 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_nonstringLiteral_in_base7996 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_stringExpression_in_base8012 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_metaLiteral_in_base8028 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_enumeration_in_base8044 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_tuple_in_base8060 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_dynamicObject_in_base8076 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_selfReference_in_base8092 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_parExpression_in_base8108 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_baseReference_in_base8124 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberReference_in_baseReference8166 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeReference_in_baseReference8182 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_base_in_primary8217 = new BitSet(new long[]{0x0000000000000002L,0x000010100000028CL});
    public static BitSet FOLLOW_qualifiedReference_in_primary8250 = new BitSet(new long[]{0x0000000000000002L,0x000010100000028CL});
    public static BitSet FOLLOW_indexOrIndexRange_in_primary8268 = new BitSet(new long[]{0x0000000000000002L,0x000010100000028CL});
    public static BitSet FOLLOW_parameters_in_primary8294 = new BitSet(new long[]{0x0000000000000002L,0x000010100000028CL});
    public static BitSet FOLLOW_positionalArguments_in_primary8314 = new BitSet(new long[]{0x0000000000000002L,0x000010100000028CL});
    public static BitSet FOLLOW_namedArguments_in_primary8335 = new BitSet(new long[]{0x0000000000000002L,0x000010100000028CL});
    public static BitSet FOLLOW_LPAREN_in_specifierParametersStart8369 = new BitSet(new long[]{0x0202000804801080L,0x880042080004001CL,0x0000000000000003L});
    public static BitSet FOLLOW_compilerAnnotations_in_specifierParametersStart8372 = new BitSet(new long[]{0x0202000800801080L,0x880042000004001CL,0x0000000000000003L});
    public static BitSet FOLLOW_annotatedDeclarationStart_in_specifierParametersStart8374 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_RPAREN_in_specifierParametersStart8378 = new BitSet(new long[]{0x0000000020000000L,0x0000080000000080L});
    public static BitSet FOLLOW_SPECIFY_in_specifierParametersStart8381 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPUTE_in_specifierParametersStart8383 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_specifierParametersStart_in_specifierParametersStart8385 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberSelectionOperator_in_qualifiedReference8408 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000010L});
    public static BitSet FOLLOW_memberReference_in_qualifiedReference8436 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeReference_in_qualifiedReference8456 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_MEMBER_OP_in_memberSelectionOperator8523 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SAFE_MEMBER_OP_in_memberSelectionOperator8539 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SPREAD_OP_in_memberSelectionOperator8555 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_enumeration8584 = new BitSet(new long[]{0x0103800304408000L,0x888D40004982409CL,0x0000000000000003L});
    public static BitSet FOLLOW_sequencedArgument_in_enumeration8612 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static BitSet FOLLOW_RBRACE_in_enumeration8639 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACKET_in_tuple8668 = new BitSet(new long[]{0x0103800304408000L,0x888D40008982409CL,0x0000000000000003L});
    public static BitSet FOLLOW_sequencedArgument_in_tuple8695 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static BitSet FOLLOW_RBRACKET_in_tuple8722 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VALUE_MODIFIER_in_dynamicObject8755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_namedArguments_in_dynamicObject8772 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expression_in_expressions8815 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_COMMA_in_expressions8836 = new BitSet(new long[]{0x0100800301408002L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_expression_in_expressions8871 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_memberName_in_memberReference8937 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static BitSet FOLLOW_typeArguments_in_memberReference8977 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeName_in_typeReference9017 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static BitSet FOLLOW_typeArguments_in_typeReference9058 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SMALLER_OP_in_typeArgumentsStart9097 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000DL});
    public static BitSet FOLLOW_type_in_typeArgumentsStart9111 = new BitSet(new long[]{0x0000000001000000L,0x0000020000000001L});
    public static BitSet FOLLOW_set_in_typeArgumentsStart9119 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SMALLER_OP_in_typeArgumentsStart9139 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LARGER_OP_in_typeArgumentsStart9154 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACKET_in_indexOrIndexRange9202 = new BitSet(new long[]{0x0100804300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_ELLIPSIS_in_indexOrIndexRange9230 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_index_in_indexOrIndexRange9250 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static BitSet FOLLOW_index_in_indexOrIndexRange9276 = new BitSet(new long[]{0x0000004000000000L,0x00000080A0000000L});
    public static BitSet FOLLOW_ELLIPSIS_in_indexOrIndexRange9304 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static BitSet FOLLOW_RANGE_OP_in_indexOrIndexRange9332 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_index_in_indexOrIndexRange9355 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static BitSet FOLLOW_SEGMENT_OP_in_indexOrIndexRange9374 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_index_in_indexOrIndexRange9396 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static BitSet FOLLOW_RBRACKET_in_indexOrIndexRange9430 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_additiveExpression_in_index9459 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_namedArguments9489 = new BitSet(new long[]{0x0103800304408000L,0x888D42004986409CL,0x0000000000000003L});
    public static BitSet FOLLOW_namedArgument_in_namedArguments9541 = new BitSet(new long[]{0x0103800304408000L,0x888D42004986409CL,0x0000000000000003L});
    public static BitSet FOLLOW_anonymousArgument_in_namedArguments9575 = new BitSet(new long[]{0x0103800304408000L,0x888D42004986409CL,0x0000000000000003L});
    public static BitSet FOLLOW_sequencedArgument_in_namedArguments9613 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static BitSet FOLLOW_RBRACE_in_namedArguments9640 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_sequencedArgument9669 = new BitSet(new long[]{0x0103800300408000L,0x888D40000982409CL,0x0000000000000003L});
    public static BitSet FOLLOW_positionalArgument_in_sequencedArgument9701 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_spreadArgument_in_sequencedArgument9737 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_comprehension_in_sequencedArgument9773 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_COMMA_in_sequencedArgument9819 = new BitSet(new long[]{0x0103800301408002L,0x888D40000982409CL,0x0000000000000003L});
    public static BitSet FOLLOW_positionalArgument_in_sequencedArgument9859 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_spreadArgument_in_sequencedArgument9901 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_comprehension_in_sequencedArgument9943 = new BitSet(new long[]{0x0000000001000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_namedArgument10028 = new BitSet(new long[]{0x0002000000000000L,0x880002000004001CL,0x0000000000000002L});
    public static BitSet FOLLOW_namedSpecifiedArgument_in_namedArgument10045 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_namedArgumentDeclaration_in_namedArgument10067 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_namedSpecifiedArgument10108 = new BitSet(new long[]{0x0000000000000000L,0x0000090000000000L});
    public static BitSet FOLLOW_specifier_in_namedSpecifiedArgument10134 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_namedSpecifiedArgument10170 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionOrExpression_in_anonymousArgument10208 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_anonymousArgument10234 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_OBJECT_DEFINITION_in_objectArgument10263 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_objectArgument10280 = new BitSet(new long[]{0x0000080000000000L,0x0000012000000004L});
    public static BitSet FOLLOW_extendedType_in_objectArgument10307 = new BitSet(new long[]{0x0000000000000000L,0x0000012000000004L});
    public static BitSet FOLLOW_satisfiedTypes_in_objectArgument10346 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000004L});
    public static BitSet FOLLOW_classBody_in_objectArgument10384 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SEMICOLON_in_objectArgument10414 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VOID_MODIFIER_in_voidOrInferredMethodArgument10471 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_voidOrInferredMethodArgument10499 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_voidOrInferredMethodArgument10526 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000084L});
    public static BitSet FOLLOW_parameters_in_voidOrInferredMethodArgument10553 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000084L});
    public static BitSet FOLLOW_block_in_voidOrInferredMethodArgument10590 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionSpecifier_in_voidOrInferredMethodArgument10631 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_voidOrInferredMethodArgument10674 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VALUE_MODIFIER_in_inferredGetterArgument10731 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_inferredGetterArgument10748 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000004L});
    public static BitSet FOLLOW_block_in_inferredGetterArgument10775 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionSpecifier_in_inferredGetterArgument10816 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_inferredGetterArgument10859 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_type_in_typedMethodOrGetterArgument10917 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_memberNameDeclaration_in_typedMethodOrGetterArgument10934 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000084L});
    public static BitSet FOLLOW_parameters_in_typedMethodOrGetterArgument10983 = new BitSet(new long[]{0x0000000020000000L,0x0000090000000084L});
    public static BitSet FOLLOW_block_in_typedMethodOrGetterArgument11033 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionSpecifier_in_typedMethodOrGetterArgument11074 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_typedMethodOrGetterArgument11117 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_untypedMethodOrGetterArgument11175 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000080L});
    public static BitSet FOLLOW_parameters_in_untypedMethodOrGetterArgument11224 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000080L});
    public static BitSet FOLLOW_lazySpecifier_in_untypedMethodOrGetterArgument11264 = new BitSet(new long[]{0x0000000000000000L,0x0000010000000000L});
    public static BitSet FOLLOW_SEMICOLON_in_untypedMethodOrGetterArgument11288 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_objectArgument_in_namedArgumentDeclaration11325 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typedMethodOrGetterArgument_in_namedArgumentDeclaration11341 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_voidOrInferredMethodArgument_in_namedArgumentDeclaration11357 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_inferredGetterArgument_in_namedArgumentDeclaration11373 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_untypedMethodOrGetterArgument_in_namedArgumentDeclaration11389 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_namedArgumentStart11417 = new BitSet(new long[]{0x0202000800801080L,0x880002000004001CL,0x0000000000000002L});
    public static BitSet FOLLOW_specificationStart_in_namedArgumentStart11427 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_declarationStart_in_namedArgumentStart11431 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_namedAnnotationArgumentsStart11449 = new BitSet(new long[]{0x0302800B04C09080L,0x888D42004186409CL,0x0000000000000003L});
    public static BitSet FOLLOW_namedArgumentStart_in_namedAnnotationArgumentsStart11456 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_iterableArgumentStart_in_namedAnnotationArgumentsStart11460 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_RBRACE_in_namedAnnotationArgumentsStart11464 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_iterableArgumentStart11482 = new BitSet(new long[]{0x0100800300408000L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_expression_in_iterableArgumentStart11484 = new BitSet(new long[]{0x0000000001000000L,0x0000010040000000L});
    public static BitSet FOLLOW_set_in_iterableArgumentStart11486 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LIDENTIFIER_in_specificationStart11510 = new BitSet(new long[]{0x0000000020000000L,0x0000080000000080L});
    public static BitSet FOLLOW_parameters_in_specificationStart11512 = new BitSet(new long[]{0x0000000020000000L,0x0000080000000080L});
    public static BitSet FOLLOW_set_in_specificationStart11515 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_parExpression11541 = new BitSet(new long[]{0x0102800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_functionOrExpression_in_parExpression11558 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_parExpression11574 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_positionalArguments11611 = new BitSet(new long[]{0x0103800304408000L,0x888D40080982409CL,0x0000000000000003L});
    public static BitSet FOLLOW_sequencedArgument_in_positionalArguments11640 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_positionalArguments11667 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionOrExpression_in_positionalArgument11704 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_PRODUCT_OP_in_spreadArgument11733 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_unionExpression_in_spreadArgument11749 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_anonParametersStart11774 = new BitSet(new long[]{0x0202000804801080L,0x880042080004001CL,0x0000000000000003L});
    public static BitSet FOLLOW_compilerAnnotations_in_anonParametersStart11777 = new BitSet(new long[]{0x0202000800801080L,0x880042000004001CL,0x0000000000000003L});
    public static BitSet FOLLOW_annotatedDeclarationStart_in_anonParametersStart11779 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_RPAREN_in_anonParametersStart11783 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_nonemptyParametersStart11801 = new BitSet(new long[]{0x0202000804801080L,0x880042000004001CL,0x0000000000000003L});
    public static BitSet FOLLOW_compilerAnnotations_in_nonemptyParametersStart11803 = new BitSet(new long[]{0x0202000800801080L,0x880042000004001CL,0x0000000000000003L});
    public static BitSet FOLLOW_annotatedDeclarationStart_in_nonemptyParametersStart11805 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_anonymousFunction_in_functionOrExpression11844 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expression_in_functionOrExpression11862 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_anonymousFunction11910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_VOID_MODIFIER_in_anonymousFunction11938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_parameters_in_anonymousFunction11975 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000084L});
    public static BitSet FOLLOW_parameters_in_anonymousFunction12013 = new BitSet(new long[]{0x0000000020000000L,0x0000000000000084L});
    public static BitSet FOLLOW_COMPUTE_in_anonymousFunction12051 = new BitSet(new long[]{0x0102800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_functionOrExpression_in_anonymousFunction12063 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_block_in_anonymousFunction12091 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_forComprehensionClause_in_comprehension12139 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_forComprehensionClause_in_comprehensionClause12168 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ifComprehensionClause_in_comprehensionClause12185 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expressionComprehensionClause_in_comprehensionClause12202 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_functionOrExpression_in_expressionComprehensionClause12232 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_FOR_CLAUSE_in_forComprehensionClause12269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_forIterator_in_forComprehensionClause12285 = new BitSet(new long[]{0x0143800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_comprehensionClause_in_forComprehensionClause12301 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IF_CLAUSE_in_ifComprehensionClause12334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_conditions_in_ifComprehensionClause12350 = new BitSet(new long[]{0x0143800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_comprehensionClause_in_ifComprehensionClause12366 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_thenElseExpression_in_assignmentExpression12410 = new BitSet(new long[]{0x0800000410000222L,0x4002080200200810L});
    public static BitSet FOLLOW_assignmentOperator_in_assignmentExpression12436 = new BitSet(new long[]{0x0102800300408000L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_functionOrExpression_in_assignmentExpression12459 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberReference_in_assignmentExpression12479 = new BitSet(new long[]{0x0102800300408002L,0x888D40000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_positionalArgument_in_assignmentExpression12509 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SPECIFY_in_assignmentOperator12560 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ADD_SPECIFY_in_assignmentOperator12575 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SUBTRACT_SPECIFY_in_assignmentOperator12585 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_MULTIPLY_SPECIFY_in_assignmentOperator12595 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_DIVIDE_SPECIFY_in_assignmentOperator12605 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_REMAINDER_SPECIFY_in_assignmentOperator12615 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_INTERSECT_SPECIFY_in_assignmentOperator12625 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_UNION_SPECIFY_in_assignmentOperator12635 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPLEMENT_SPECIFY_in_assignmentOperator12645 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_AND_SPECIFY_in_assignmentOperator12655 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_OR_SPECIFY_in_assignmentOperator12665 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_disjunctionExpression_in_thenElseExpression12695 = new BitSet(new long[]{0x0000008000000002L,0x0040000000000000L});
    public static BitSet FOLLOW_thenElseOperator_in_thenElseExpression12721 = new BitSet(new long[]{0x0100800300408000L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_disjunctionExpression_in_thenElseExpression12743 = new BitSet(new long[]{0x0000008000000002L,0x0040000000000000L});
    public static BitSet FOLLOW_ELSE_CLAUSE_in_thenElseOperator12814 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_THEN_CLAUSE_in_thenElseOperator12831 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_conjunctionExpression_in_disjunctionExpression12862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static BitSet FOLLOW_disjunctionOperator_in_disjunctionExpression12888 = new BitSet(new long[]{0x0100800300408000L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_conjunctionExpression_in_disjunctionExpression12911 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static BitSet FOLLOW_OR_OP_in_disjunctionOperator12951 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_logicalNegationExpression_in_conjunctionExpression12983 = new BitSet(new long[]{0x0000000000000102L});
    public static BitSet FOLLOW_conjunctionOperator_in_conjunctionExpression13009 = new BitSet(new long[]{0x0100800300408000L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_logicalNegationExpression_in_conjunctionExpression13032 = new BitSet(new long[]{0x0000000000000102L});
    public static BitSet FOLLOW_AND_OP_in_conjunctionOperator13072 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_notOperator_in_logicalNegationExpression13102 = new BitSet(new long[]{0x0100800300408000L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_logicalNegationExpression_in_logicalNegationExpression13121 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_equalityExpression_in_logicalNegationExpression13137 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_NOT_OP_in_notOperator13166 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_comparisonExpression_in_equalityExpression13198 = new BitSet(new long[]{0x0020020000000002L,0x0000000000010000L});
    public static BitSet FOLLOW_equalityOperator_in_equalityExpression13224 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_comparisonExpression_in_equalityExpression13247 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_EQUAL_OP_in_equalityOperator13287 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_NOT_EQUAL_OP_in_equalityOperator13304 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IDENTICAL_OP_in_equalityOperator13320 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_existenceEmptinessExpression_in_comparisonExpression13351 = new BitSet(new long[]{0x3000080002100002L,0x0000062000000003L});
    public static BitSet FOLLOW_comparisonOperator_in_comparisonExpression13379 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_existenceEmptinessExpression_in_comparisonExpression13402 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_largerOperator_in_comparisonExpression13424 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_existenceEmptinessExpression_in_comparisonExpression13447 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_smallerOperator_in_comparisonExpression13469 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_existenceEmptinessExpression_in_comparisonExpression13492 = new BitSet(new long[]{0x0000000000000002L,0x0000060000000000L});
    public static BitSet FOLLOW_smallerOperator_in_comparisonExpression13527 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_existenceEmptinessExpression_in_comparisonExpression13541 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeOperator_in_comparisonExpression13576 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_comparisonExpression13598 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SMALL_AS_OP_in_smallerOperator13644 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SMALLER_OP_in_smallerOperator13660 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LARGE_AS_OP_in_largerOperator13689 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LARGER_OP_in_largerOperator13705 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPARE_OP_in_comparisonOperator13734 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IN_OP_in_comparisonOperator13751 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IS_OP_in_typeOperator13780 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_EXTENDS_in_typeOperator13796 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SATISFIES_in_typeOperator13812 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CASE_TYPES_in_typeOperator13828 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_entryRangeExpression_in_existenceEmptinessExpression13859 = new BitSet(new long[]{0x0000040000000002L,0x0000000000008000L});
    public static BitSet FOLLOW_existsNonemptyOperator_in_existenceEmptinessExpression13887 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_EXISTS_in_existsNonemptyOperator13933 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_NONEMPTY_in_existsNonemptyOperator13950 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_additiveExpression_in_entryRangeExpression13981 = new BitSet(new long[]{0x0000010000000002L,0x0000008020000000L});
    public static BitSet FOLLOW_rangeIntervalEntryOperator_in_entryRangeExpression14007 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_additiveExpression_in_entryRangeExpression14030 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_RANGE_OP_in_rangeIntervalEntryOperator14070 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SEGMENT_OP_in_rangeIntervalEntryOperator14087 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ENTRY_OP_in_rangeIntervalEntryOperator14103 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_scaleExpression_in_additiveExpression14134 = new BitSet(new long[]{0x0000000200000002L,0x0004000000000000L});
    public static BitSet FOLLOW_additiveOperator_in_additiveExpression14160 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_scaleExpression_in_additiveExpression14183 = new BitSet(new long[]{0x0000000200000002L,0x0004000000000000L});
    public static BitSet FOLLOW_SUM_OP_in_additiveOperator14223 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_DIFFERENCE_OP_in_additiveOperator14240 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_multiplicativeExpression_in_scaleExpression14269 = new BitSet(new long[]{0x0000000000000002L,0x0000004000000000L});
    public static BitSet FOLLOW_scaleOperator_in_scaleExpression14295 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_scaleExpression_in_scaleExpression14317 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_unionExpression_in_multiplicativeExpression14359 = new BitSet(new long[]{0x0000000000000002L,0x0000000118000000L});
    public static BitSet FOLLOW_multiplicativeOperator_in_multiplicativeExpression14385 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_unionExpression_in_multiplicativeExpression14408 = new BitSet(new long[]{0x0000000000000002L,0x0000000118000000L});
    public static BitSet FOLLOW_PRODUCT_OP_in_multiplicativeOperator14448 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_QUOTIENT_OP_in_multiplicativeOperator14465 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_REMAINDER_OP_in_multiplicativeOperator14481 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_intersectionExpression_in_unionExpression14512 = new BitSet(new long[]{0x0000000008000002L,0x2000000000000000L});
    public static BitSet FOLLOW_unionOperator_in_unionExpression14538 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_intersectionExpression_in_unionExpression14561 = new BitSet(new long[]{0x0000000008000002L,0x2000000000000000L});
    public static BitSet FOLLOW_UNION_OP_in_unionOperator14605 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPLEMENT_OP_in_unionOperator14621 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_negationComplementExpression_in_intersectionExpression14652 = new BitSet(new long[]{0x0400000000000002L});
    public static BitSet FOLLOW_intersectionOperator_in_intersectionExpression14678 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_negationComplementExpression_in_intersectionExpression14701 = new BitSet(new long[]{0x0400000000000002L});
    public static BitSet FOLLOW_INTERSECTION_OP_in_intersectionOperator14745 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_unaryMinusOrComplementOperator_in_negationComplementExpression14774 = new BitSet(new long[]{0x0100800300408000L,0x888D40000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_negationComplementExpression_in_negationComplementExpression14793 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_exponentiationExpression_in_negationComplementExpression14809 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_DIFFERENCE_OP_in_unaryMinusOrComplementOperator14838 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SUM_OP_in_unaryMinusOrComplementOperator14855 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_incrementDecrementExpression_in_exponentiationExpression14884 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000000L});
    public static BitSet FOLLOW_exponentiationOperator_in_exponentiationExpression14910 = new BitSet(new long[]{0x0100800100408000L,0x888940000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_exponentiationExpression_in_exponentiationExpression14932 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_POWER_OP_in_exponentiationOperator14972 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SCALE_OP_in_scaleOperator15002 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_prefixOperator_in_incrementDecrementExpression15032 = new BitSet(new long[]{0x0100800100408000L,0x888940000180409CL,0x0000000000000001L});
    public static BitSet FOLLOW_incrementDecrementExpression_in_incrementDecrementExpression15050 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_postfixIncrementDecrementExpression_in_incrementDecrementExpression15066 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_DECREMENT_OP_in_prefixOperator15095 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_INCREMENT_OP_in_prefixOperator15112 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_primary_in_postfixIncrementDecrementExpression15142 = new BitSet(new long[]{0x0100000100000002L});
    public static BitSet FOLLOW_postfixOperator_in_postfixIncrementDecrementExpression15170 = new BitSet(new long[]{0x0100000100000002L});
    public static BitSet FOLLOW_DECREMENT_OP_in_postfixOperator15210 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_INCREMENT_OP_in_postfixOperator15227 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_THIS_in_selfReference15257 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SUPER_in_selfReference15273 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_OUTER_in_selfReference15290 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_PACKAGE_in_selfReference15306 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_NATURAL_LITERAL_in_nonstringLiteral15339 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_FLOAT_LITERAL_in_nonstringLiteral15356 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CHAR_LITERAL_in_nonstringLiteral15373 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_STRING_LITERAL_in_stringLiteral15403 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VERBATIM_STRING_in_stringLiteral15420 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_stringLiteral_in_stringExpression15460 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_STRING_START_in_stringExpression15476 = new BitSet(new long[]{0x0100800300408000L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_expression_in_stringExpression15494 = new BitSet(new long[]{0x0000000000000000L,0x0000A00000000000L});
    public static BitSet FOLLOW_STRING_MID_in_stringExpression15520 = new BitSet(new long[]{0x0100800300408000L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_expression_in_stringExpression15542 = new BitSet(new long[]{0x0000000000000000L,0x0000A00000000000L});
    public static BitSet FOLLOW_STRING_END_in_stringExpression15569 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SMALLER_OP_in_typeArguments15598 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000DL});
    public static BitSet FOLLOW_type_in_typeArguments15626 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static BitSet FOLLOW_COMMA_in_typeArguments15660 = new BitSet(new long[]{0x0000000001000000L,0x080002000000000DL});
    public static BitSet FOLLOW_type_in_typeArguments15700 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000001L});
    public static BitSet FOLLOW_LARGER_OP_in_typeArguments15770 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_unionType_in_variadicType15818 = new BitSet(new long[]{0x0000000000000002L,0x0004000008000000L});
    public static BitSet FOLLOW_PRODUCT_OP_in_variadicType15844 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SUM_OP_in_variadicType15872 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_type_in_variadicType15901 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_type_in_defaultedType15947 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static BitSet FOLLOW_SPECIFY_in_defaultedType15973 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_variadicType_in_defaultedType16000 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACKET_in_tupleType16029 = new BitSet(new long[]{0x0000000000000000L,0x080002008000000CL});
    public static BitSet FOLLOW_defaultedType_in_tupleType16057 = new BitSet(new long[]{0x0000000001000000L,0x0000000080000000L});
    public static BitSet FOLLOW_COMMA_in_tupleType16091 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_defaultedType_in_tupleType16117 = new BitSet(new long[]{0x0000000001000000L,0x0000000080000000L});
    public static BitSet FOLLOW_RBRACKET_in_tupleType16157 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SMALLER_OP_in_groupedType16186 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_groupedType16196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000001L});
    public static BitSet FOLLOW_LARGER_OP_in_groupedType16212 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_iterableType16232 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_variadicType_in_iterableType16248 = new BitSet(new long[]{0x0000000000000000L,0x0000000040000000L});
    public static BitSet FOLLOW_RBRACE_in_iterableType16262 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_BACKTICK_in_metaLiteral16300 = new BitSet(new long[]{0x0202000000800080L,0x8C0002000104041CL});
    public static BitSet FOLLOW_MODULE_in_metaLiteral16322 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_packagePath_in_metaLiteral16340 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_PACKAGE_in_metaLiteral16362 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000010L});
    public static BitSet FOLLOW_packagePath_in_metaLiteral16380 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_CLASS_DEFINITION_in_metaLiteral16402 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_metaLiteral16420 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_INTERFACE_DEFINITION_in_metaLiteral16442 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_metaLiteral16460 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_ALIAS_in_metaLiteral16482 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_metaLiteral16500 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_TYPE_CONSTRAINT_in_metaLiteral16522 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_metaLiteral16540 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_VALUE_MODIFIER_in_metaLiteral16572 = new BitSet(new long[]{0x0000000000000000L,0x080002000000001CL});
    public static BitSet FOLLOW_OBJECT_DEFINITION_in_metaLiteral16600 = new BitSet(new long[]{0x0000000000000000L,0x080002000000001CL});
    public static BitSet FOLLOW_type_in_metaLiteral16638 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_metaLiteral16660 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_memberName_in_metaLiteral16689 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_metaLiteral16711 = new BitSet(new long[]{0x0000000000000000L,0x080002000000001CL});
    public static BitSet FOLLOW_type_in_metaLiteral16739 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_metaLiteral16761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_memberName_in_metaLiteral16790 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_abbreviatedType_in_metaLiteral16836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_metaLiteral16854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_memberName_in_metaLiteral16872 = new BitSet(new long[]{0x0000000000008000L,0x0000020000000000L});
    public static BitSet FOLLOW_typeArguments_in_metaLiteral16900 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_groupedType_in_metaLiteral16951 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_metaLiteral16969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_memberName_in_metaLiteral16987 = new BitSet(new long[]{0x0000000000008000L,0x0000020000000000L});
    public static BitSet FOLLOW_typeArguments_in_metaLiteral17015 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_type_in_metaLiteral17044 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_memberName_in_metaLiteral17062 = new BitSet(new long[]{0x0000000000008000L,0x0000020000000000L});
    public static BitSet FOLLOW_typeArguments_in_metaLiteral17090 = new BitSet(new long[]{0x0000000000008000L});
    public static BitSet FOLLOW_BACKTICK_in_metaLiteral17125 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_unionType_in_type17165 = new BitSet(new long[]{0x0000010000000002L});
    public static BitSet FOLLOW_ENTRY_OP_in_type17191 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_unionType_in_type17225 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_intersectionType_in_unionType17290 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static BitSet FOLLOW_UNION_OP_in_unionType17331 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_intersectionType_in_unionType17371 = new BitSet(new long[]{0x0000000000000002L,0x2000000000000000L});
    public static BitSet FOLLOW_abbreviatedType_in_intersectionType17461 = new BitSet(new long[]{0x0400000000000002L});
    public static BitSet FOLLOW_INTERSECTION_OP_in_intersectionType17502 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_abbreviatedType_in_intersectionType17542 = new BitSet(new long[]{0x0400000000000002L});
    public static BitSet FOLLOW_qualifiedType_in_qualifiedOrTupleType17621 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_tupleType_in_qualifiedOrTupleType17638 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_iterableType_in_qualifiedOrTupleType17655 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_groupedType_in_qualifiedOrTupleType17671 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_qualifiedOrTupleType_in_abbreviatedType17712 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080088L});
    public static BitSet FOLLOW_OPTIONAL_in_abbreviatedType17774 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080088L});
    public static BitSet FOLLOW_LBRACKET_in_abbreviatedType17795 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static BitSet FOLLOW_RBRACKET_in_abbreviatedType17797 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080088L});
    public static BitSet FOLLOW_LPAREN_in_abbreviatedType17818 = new BitSet(new long[]{0x0000000000000000L,0x080002080000000CL});
    public static BitSet FOLLOW_defaultedType_in_abbreviatedType17856 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_COMMA_in_abbreviatedType17900 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_defaultedType_in_abbreviatedType17934 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_abbreviatedType17988 = new BitSet(new long[]{0x0000000000000002L,0x0000000000080088L});
    public static BitSet FOLLOW_typeNameWithArguments_in_qualifiedType18042 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_qualifiedType18068 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static BitSet FOLLOW_typeNameWithArguments_in_qualifiedType18081 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000200L});
    public static BitSet FOLLOW_typeName_in_typeNameWithArguments18121 = new BitSet(new long[]{0x0000000000000002L,0x0000020000000000L});
    public static BitSet FOLLOW_typeArguments_in_typeNameWithArguments18148 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_stringLiteral_in_annotations18212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static BitSet FOLLOW_annotation_in_annotations18251 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000010L});
    public static BitSet FOLLOW_annotationName_in_annotation18292 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000084L});
    public static BitSet FOLLOW_positionalArguments_in_annotation18315 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_namedArguments_in_annotation18344 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotation_in_compilerAnnotations18448 = new BitSet(new long[]{0x0000000004000002L});
    public static BitSet FOLLOW_COMPILER_ANNOTATION_in_compilerAnnotation18488 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_annotationName_in_compilerAnnotation18505 = new BitSet(new long[]{0x0000000000000002L,0x0000008000000000L});
    public static BitSet FOLLOW_SEGMENT_OP_in_compilerAnnotation18535 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000000L,0x0000000000000001L});
    public static BitSet FOLLOW_stringLiteral_in_compilerAnnotation18547 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_conditions18589 = new BitSet(new long[]{0x2100840300408000L,0x888D40280182C09CL,0x0000000000000001L});
    public static BitSet FOLLOW_condition_in_conditions18615 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_COMMA_in_conditions18635 = new BitSet(new long[]{0x2100840301408000L,0x888D40280182C09CL,0x0000000000000001L});
    public static BitSet FOLLOW_condition_in_conditions18670 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_conditions18732 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_existsCondition_in_condition18761 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_nonemptyCondition_in_condition18777 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_isCondition_in_condition18793 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_satisfiesCondition_in_condition18810 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_booleanCondition_in_condition18826 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expression_in_booleanCondition18867 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_EXISTS_in_existsCondition18900 = new BitSet(new long[]{0x0102800304408000L,0x888D42000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_specifiedVariable_in_existsCondition18937 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_impliedVariable_in_existsCondition18972 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expression_in_existsCondition18992 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_NONEMPTY_in_nonemptyCondition19033 = new BitSet(new long[]{0x0102800304408000L,0x888D42000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_specifiedVariable_in_nonemptyCondition19068 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_impliedVariable_in_nonemptyCondition19097 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expression_in_nonemptyCondition19114 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_NOT_OP_in_isCondition19159 = new BitSet(new long[]{0x2000000000000000L});
    public static BitSet FOLLOW_IS_OP_in_isCondition19186 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_isCondition19203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_memberName_in_isCondition19241 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static BitSet FOLLOW_specifier_in_isCondition19257 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_impliedVariable_in_isCondition19280 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SATISFIES_in_satisfiesCondition19316 = new BitSet(new long[]{0x0000000000000002L,0x0800000000000000L});
    public static BitSet FOLLOW_qualifiedType_in_satisfiesCondition19336 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static BitSet FOLLOW_qualifiedType_in_satisfiesCondition19355 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ifElse_in_controlStatement19387 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_switchCaseElse_in_controlStatement19404 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_whileLoop_in_controlStatement19421 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_forElse_in_controlStatement19438 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_tryCatchFinally_in_controlStatement19455 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_dynamic_in_controlStatement19471 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_block_in_controlBlock19509 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_DYNAMIC_in_dynamic19575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_controlBlock_in_dynamic19592 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ifBlock_in_ifElse19629 = new BitSet(new long[]{0x0000008000000002L});
    public static BitSet FOLLOW_elseBlock_in_ifElse19657 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IF_CLAUSE_in_ifBlock19697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_conditions_in_ifBlock19714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_controlBlock_in_ifBlock19730 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ELSE_CLAUSE_in_elseBlock19759 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_elseIf_in_elseBlock19786 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_block_in_elseBlock19816 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ifElse_in_elseIf19855 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_switchHeader_in_switchCaseElse19892 = new BitSet(new long[]{0x0000000000080000L});
    public static BitSet FOLLOW_cases_in_switchCaseElse19909 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SWITCH_CLAUSE_in_switchHeader19938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_LPAREN_in_switchHeader19955 = new BitSet(new long[]{0x0100800300408000L,0x888D40080182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_expression_in_switchHeader19972 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_switchHeader19998 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_caseBlock_in_cases20037 = new BitSet(new long[]{0x0000008000080002L});
    public static BitSet FOLLOW_defaultCaseBlock_in_cases20074 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CASE_CLAUSE_in_caseBlock20118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_caseItemList_in_caseBlock20135 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_block_in_caseBlock20151 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_caseItemList20180 = new BitSet(new long[]{0x2100800300408000L,0x888D40280182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_caseItem_in_caseItemList20201 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_caseItemList20228 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ELSE_CLAUSE_in_defaultCaseBlock20258 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_block_in_defaultCaseBlock20275 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_isCaseCondition_in_caseItem20308 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_satisfiesCaseCondition_in_caseItem20329 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_matchCaseCondition_in_caseItem20345 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expressions_in_matchCaseCondition20374 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IS_OP_in_isCaseCondition20403 = new BitSet(new long[]{0x0000000000000000L,0x080002000000000CL});
    public static BitSet FOLLOW_type_in_isCaseCondition20420 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SATISFIES_in_satisfiesCaseCondition20449 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
    public static BitSet FOLLOW_qualifiedType_in_satisfiesCaseCondition20466 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_forBlock_in_forElse20503 = new BitSet(new long[]{0x0000008000000002L});
    public static BitSet FOLLOW_failBlock_in_forElse20530 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_FOR_CLAUSE_in_forBlock20570 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_forIterator_in_forBlock20587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_controlBlock_in_forBlock20604 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_ELSE_CLAUSE_in_failBlock20633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_block_in_failBlock20650 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_forIterator20688 = new BitSet(new long[]{0x0002000004000000L,0x880002080000001CL,0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_forIterator20700 = new BitSet(new long[]{0x0002000000000000L,0x880002080000001CL,0x0000000000000002L});
    public static BitSet FOLLOW_var_in_forIterator20717 = new BitSet(new long[]{0x1000010000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_containment_in_forIterator20747 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_ENTRY_OP_in_forIterator20786 = new BitSet(new long[]{0x0002000000000000L,0x880002000000001CL,0x0000000000000002L});
    public static BitSet FOLLOW_var_in_forIterator20808 = new BitSet(new long[]{0x1000000000000000L});
    public static BitSet FOLLOW_containment_in_forIterator20830 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_forIterator20868 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IN_OP_in_containment20899 = new BitSet(new long[]{0x0100800300408002L,0x888D40000182409CL,0x0000000000000001L});
    public static BitSet FOLLOW_expression_in_containment20917 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_whileBlock_in_whileLoop20960 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_WHILE_CLAUSE_in_whileBlock20989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_conditions_in_whileBlock21005 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_controlBlock_in_whileBlock21021 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_tryBlock_in_tryCatchFinally21058 = new BitSet(new long[]{0x0000400000200002L});
    public static BitSet FOLLOW_catchBlock_in_tryCatchFinally21085 = new BitSet(new long[]{0x0000400000200002L});
    public static BitSet FOLLOW_finallyBlock_in_tryCatchFinally21122 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_TRY_CLAUSE_in_tryBlock21160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000084L});
    public static BitSet FOLLOW_resources_in_tryBlock21187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_controlBlock_in_tryBlock21207 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_block_in_tryBlock21235 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_CATCH_CLAUSE_in_catchBlock21274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_catchVariable_in_catchBlock21291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_block_in_catchBlock21307 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_catchVariable21336 = new BitSet(new long[]{0x0002000004000000L,0x880002080000001CL,0x0000000000000002L});
    public static BitSet FOLLOW_variable_in_catchVariable21361 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_catchVariable21387 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_FINALLY_CLAUSE_in_finallyBlock21418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static BitSet FOLLOW_block_in_finallyBlock21435 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LPAREN_in_resources21464 = new BitSet(new long[]{0x0102800304408000L,0x888D42080182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_resource_in_resources21485 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_COMMA_in_resources21507 = new BitSet(new long[]{0x0102800304408000L,0x888D42000182409CL,0x0000000000000003L});
    public static BitSet FOLLOW_resource_in_resources21526 = new BitSet(new long[]{0x0000000001000000L,0x0000000800000000L});
    public static BitSet FOLLOW_RPAREN_in_resources21554 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_specifiedVariable_in_resource21611 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_expression_in_resource21631 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_variable_in_specifiedVariable21672 = new BitSet(new long[]{0x0000000000000002L,0x0000080000000000L});
    public static BitSet FOLLOW_specifier_in_specifiedVariable21699 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_variable21739 = new BitSet(new long[]{0x0002000000000000L,0x880002000000001CL,0x0000000000000002L});
    public static BitSet FOLLOW_var_in_variable21747 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_type_in_var21796 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_VOID_MODIFIER_in_var21817 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_var21837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_VALUE_MODIFIER_in_var21857 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static BitSet FOLLOW_memberName_in_var21885 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static BitSet FOLLOW_parameters_in_var21915 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static BitSet FOLLOW_memberName_in_var21959 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_memberName_in_var21992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static BitSet FOLLOW_parameters_in_var22021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static BitSet FOLLOW_memberName_in_impliedVariable22067 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_synpred1_Ceylon164 = new BitSet(new long[]{0x0000000000000000L,0x0000400000000410L,0x0000000000000001L});
    public static BitSet FOLLOW_annotations_in_synpred1_Ceylon166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static BitSet FOLLOW_MODULE_in_synpred1_Ceylon168 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_synpred2_Ceylon210 = new BitSet(new long[]{0x0000000000000000L,0x0000400001000010L,0x0000000000000001L});
    public static BitSet FOLLOW_annotations_in_synpred2_Ceylon212 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static BitSet FOLLOW_PACKAGE_in_synpred2_Ceylon214 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_annotatedDeclarationStart_in_synpred3_Ceylon6594 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_annotatedAssertionStart_in_synpred4_Ceylon6622 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_annotationListStart_in_synpred5_Ceylon6648 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_specifierParametersStart_in_synpred6_Ceylon8290 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeArgumentsStart_in_synpred8_Ceylon8964 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_typeArgumentsStart_in_synpred9_Ceylon9045 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_namedArgumentStart_in_synpred10_Ceylon9527 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_anonymousArgument_in_synpred11_Ceylon9562 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_namedArgumentStart_in_synpred12_Ceylon11453 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_FUNCTION_MODIFIER_in_synpred13_Ceylon11827 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_VOID_MODIFIER_in_synpred13_Ceylon11829 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_anonParametersStart_in_synpred13_Ceylon11831 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_unionType_in_synpred14_Ceylon15800 = new BitSet(new long[]{0x0000000000000000L,0x0004000008000000L});
    public static BitSet FOLLOW_set_in_synpred14_Ceylon15802 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_type_in_synpred15_Ceylon15931 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static BitSet FOLLOW_SPECIFY_in_synpred15_Ceylon15934 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_abbreviatedType_in_synpred16_Ceylon16813 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_synpred16_Ceylon16815 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_groupedType_in_synpred17_Ceylon16928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static BitSet FOLLOW_MEMBER_OP_in_synpred17_Ceylon16930 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_namedAnnotationArgumentsStart_in_synpred18_Ceylon18332 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_synpred19_Ceylon18918 = new BitSet(new long[]{0x0202000800801080L,0x880002000004001CL,0x0000000000000002L});
    public static BitSet FOLLOW_declarationStart_in_synpred19_Ceylon18921 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_specificationStart_in_synpred19_Ceylon18923 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LIDENTIFIER_in_synpred20_Ceylon18968 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_compilerAnnotations_in_synpred21_Ceylon19051 = new BitSet(new long[]{0x0202000800801080L,0x880002000004001CL,0x0000000000000002L});
    public static BitSet FOLLOW_declarationStart_in_synpred21_Ceylon19054 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_specificationStart_in_synpred21_Ceylon19056 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LIDENTIFIER_in_synpred22_Ceylon19093 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LIDENTIFIER_in_synpred23_Ceylon19220 = new BitSet(new long[]{0x0000000000000000L,0x0000080000000000L});
    public static BitSet FOLLOW_SPECIFY_in_synpred23_Ceylon19222 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_LBRACE_in_synpred24_Ceylon19503 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_IS_OP_in_synpred25_Ceylon20305 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_SATISFIES_in_synpred26_Ceylon20326 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_COMPILER_ANNOTATION_in_synpred27_Ceylon21593 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_declarationStart_in_synpred27_Ceylon21595 = new BitSet(new long[]{0x0000000000000002L});
    public static BitSet FOLLOW_specificationStart_in_synpred27_Ceylon21597 = new BitSet(new long[]{0x0000000000000002L});

}