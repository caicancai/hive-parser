// $ANTLR 3.4 HiveLexerParent.g 2024-07-25 22:38:41

import org.antlr.runtime.*;


/**
   Licensed to the Apache Software Foundation (ASF) under one or more
   contributor license agreements.  See the NOTICE file distributed with
   this work for additional information regarding copyright ownership.
   The ASF licenses this file to You under the Apache License, Version 2.0
   (the "License"); you may not use this file except in compliance with
   the License.  You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/
@SuppressWarnings({"all", "warnings", "unchecked"})
public class HiveLexerParent extends Lexer {
    public static final int EOF=-1;
    public static final int AMPERSAND=4;
    public static final int BITWISEOR=5;
    public static final int BITWISEXOR=6;
    public static final int ByteLengthLiteral=7;
    public static final int COLON=8;
    public static final int COMMA=9;
    public static final int CONCATENATE=10;
    public static final int CharSetLiteral=11;
    public static final int CharSetName=12;
    public static final int DIV=13;
    public static final int DIVIDE=14;
    public static final int DOLLAR=15;
    public static final int DOT=16;
    public static final int Digit=17;
    public static final int EQUAL=18;
    public static final int EQUAL_NS=19;
    public static final int Exponent=20;
    public static final int GREATERTHAN=21;
    public static final int GREATERTHANOREQUALTO=22;
    public static final int HexDigit=23;
    public static final int Identifier=24;
    public static final int IntegralLiteral=25;
    public static final int KW_ABORT=26;
    public static final int KW_ACTIVATE=27;
    public static final int KW_ACTIVE=28;
    public static final int KW_ADD=29;
    public static final int KW_ADMIN=30;
    public static final int KW_AFTER=31;
    public static final int KW_ALL=32;
    public static final int KW_ALLOC_FRACTION=33;
    public static final int KW_ALTER=34;
    public static final int KW_ANALYZE=35;
    public static final int KW_AND=36;
    public static final int KW_ANY=37;
    public static final int KW_APPLICATION=38;
    public static final int KW_ARCHIVE=39;
    public static final int KW_ARRAY=40;
    public static final int KW_AS=41;
    public static final int KW_ASC=42;
    public static final int KW_AST=43;
    public static final int KW_AT=44;
    public static final int KW_AUTHORIZATION=45;
    public static final int KW_AUTOCOMMIT=46;
    public static final int KW_BEFORE=47;
    public static final int KW_BETWEEN=48;
    public static final int KW_BIGINT=49;
    public static final int KW_BINARY=50;
    public static final int KW_BOOLEAN=51;
    public static final int KW_BOTH=52;
    public static final int KW_BRANCH=53;
    public static final int KW_BUCKET=54;
    public static final int KW_BUCKETS=55;
    public static final int KW_BY=56;
    public static final int KW_CACHE=57;
    public static final int KW_CASCADE=58;
    public static final int KW_CASE=59;
    public static final int KW_CAST=60;
    public static final int KW_CBO=61;
    public static final int KW_CHANGE=62;
    public static final int KW_CHAR=63;
    public static final int KW_CHECK=64;
    public static final int KW_CHERRY_PICK=65;
    public static final int KW_CLUSTER=66;
    public static final int KW_CLUSTERED=67;
    public static final int KW_CLUSTERSTATUS=68;
    public static final int KW_COLLECTION=69;
    public static final int KW_COLUMN=70;
    public static final int KW_COLUMNS=71;
    public static final int KW_COMMENT=72;
    public static final int KW_COMMIT=73;
    public static final int KW_COMPACT=74;
    public static final int KW_COMPACTIONS=75;
    public static final int KW_COMPACT_ID=76;
    public static final int KW_COMPUTE=77;
    public static final int KW_CONCATENATE=78;
    public static final int KW_CONF=79;
    public static final int KW_CONSTRAINT=80;
    public static final int KW_CONTINUE=81;
    public static final int KW_CONVERT=82;
    public static final int KW_COST=83;
    public static final int KW_CREATE=84;
    public static final int KW_CRON=85;
    public static final int KW_CROSS=86;
    public static final int KW_CUBE=87;
    public static final int KW_CURRENT=88;
    public static final int KW_CURRENT_DATE=89;
    public static final int KW_CURRENT_TIMESTAMP=90;
    public static final int KW_CURSOR=91;
    public static final int KW_DATA=92;
    public static final int KW_DATABASE=93;
    public static final int KW_DATABASES=94;
    public static final int KW_DATACONNECTOR=95;
    public static final int KW_DATACONNECTORS=96;
    public static final int KW_DATE=97;
    public static final int KW_DATETIME=98;
    public static final int KW_DAY=99;
    public static final int KW_DBPROPERTIES=100;
    public static final int KW_DCPROPERTIES=101;
    public static final int KW_DDL=102;
    public static final int KW_DEBUG=103;
    public static final int KW_DECIMAL=104;
    public static final int KW_DEFAULT=105;
    public static final int KW_DEFERRED=106;
    public static final int KW_DEFINED=107;
    public static final int KW_DELETE=108;
    public static final int KW_DELIMITED=109;
    public static final int KW_DEPENDENCY=110;
    public static final int KW_DESC=111;
    public static final int KW_DESCRIBE=112;
    public static final int KW_DETAIL=113;
    public static final int KW_DIRECTORIES=114;
    public static final int KW_DIRECTORY=115;
    public static final int KW_DISABLE=116;
    public static final int KW_DISTINCT=117;
    public static final int KW_DISTRIBUTE=118;
    public static final int KW_DISTRIBUTED=119;
    public static final int KW_DO=120;
    public static final int KW_DOUBLE=121;
    public static final int KW_DOW=122;
    public static final int KW_DROP=123;
    public static final int KW_DUMP=124;
    public static final int KW_ELEM_TYPE=125;
    public static final int KW_ELSE=126;
    public static final int KW_ENABLE=127;
    public static final int KW_END=128;
    public static final int KW_ENFORCED=129;
    public static final int KW_ESCAPED=130;
    public static final int KW_EVERY=131;
    public static final int KW_EXCEPT=132;
    public static final int KW_EXCHANGE=133;
    public static final int KW_EXCLUSIVE=134;
    public static final int KW_EXECUTE=135;
    public static final int KW_EXECUTED=136;
    public static final int KW_EXISTS=137;
    public static final int KW_EXPIRE_SNAPSHOTS=138;
    public static final int KW_EXPLAIN=139;
    public static final int KW_EXPORT=140;
    public static final int KW_EXPRESSION=141;
    public static final int KW_EXTENDED=142;
    public static final int KW_EXTERNAL=143;
    public static final int KW_EXTRACT=144;
    public static final int KW_FALSE=145;
    public static final int KW_FAST_FORWARD=146;
    public static final int KW_FETCH=147;
    public static final int KW_FIELDS=148;
    public static final int KW_FILE=149;
    public static final int KW_FILEFORMAT=150;
    public static final int KW_FIRST=151;
    public static final int KW_FLOAT=152;
    public static final int KW_FLOOR=153;
    public static final int KW_FOLLOWING=154;
    public static final int KW_FOR=155;
    public static final int KW_FORCE=156;
    public static final int KW_FOREIGN=157;
    public static final int KW_FORMAT=158;
    public static final int KW_FORMATTED=159;
    public static final int KW_FROM=160;
    public static final int KW_FULL=161;
    public static final int KW_FUNCTION=162;
    public static final int KW_FUNCTIONS=163;
    public static final int KW_GRANT=164;
    public static final int KW_GROUP=165;
    public static final int KW_GROUPING=166;
    public static final int KW_HAVING=167;
    public static final int KW_HOUR=168;
    public static final int KW_IDXPROPERTIES=169;
    public static final int KW_IF=170;
    public static final int KW_IGNORE=171;
    public static final int KW_IMPORT=172;
    public static final int KW_IN=173;
    public static final int KW_INDEX=174;
    public static final int KW_INDEXES=175;
    public static final int KW_INNER=176;
    public static final int KW_INPATH=177;
    public static final int KW_INPUTDRIVER=178;
    public static final int KW_INPUTFORMAT=179;
    public static final int KW_INSERT=180;
    public static final int KW_INT=181;
    public static final int KW_INTERSECT=182;
    public static final int KW_INTERVAL=183;
    public static final int KW_INTO=184;
    public static final int KW_IS=185;
    public static final int KW_ISOLATION=186;
    public static final int KW_ITEMS=187;
    public static final int KW_JAR=188;
    public static final int KW_JOIN=189;
    public static final int KW_JOINCOST=190;
    public static final int KW_KEY=191;
    public static final int KW_KEYS=192;
    public static final int KW_KEY_TYPE=193;
    public static final int KW_KILL=194;
    public static final int KW_LAST=195;
    public static final int KW_LATERAL=196;
    public static final int KW_LEADING=197;
    public static final int KW_LEFT=198;
    public static final int KW_LESS=199;
    public static final int KW_LEVEL=200;
    public static final int KW_LIKE=201;
    public static final int KW_LIMIT=202;
    public static final int KW_LINES=203;
    public static final int KW_LOAD=204;
    public static final int KW_LOCAL=205;
    public static final int KW_LOCATION=206;
    public static final int KW_LOCK=207;
    public static final int KW_LOCKS=208;
    public static final int KW_LOGICAL=209;
    public static final int KW_LONG=210;
    public static final int KW_MACRO=211;
    public static final int KW_MANAGED=212;
    public static final int KW_MANAGEDLOCATION=213;
    public static final int KW_MANAGEMENT=214;
    public static final int KW_MAP=215;
    public static final int KW_MAPJOIN=216;
    public static final int KW_MAPPING=217;
    public static final int KW_MATCHED=218;
    public static final int KW_MATERIALIZED=219;
    public static final int KW_MERGE=220;
    public static final int KW_METADATA=221;
    public static final int KW_MINUS=222;
    public static final int KW_MINUTE=223;
    public static final int KW_MONTH=224;
    public static final int KW_MORE=225;
    public static final int KW_MOVE=226;
    public static final int KW_MSCK=227;
    public static final int KW_NONE=228;
    public static final int KW_NORELY=229;
    public static final int KW_NOSCAN=230;
    public static final int KW_NOT=231;
    public static final int KW_NOVALIDATE=232;
    public static final int KW_NULL=233;
    public static final int KW_NULLS=234;
    public static final int KW_OF=235;
    public static final int KW_OFFSET=236;
    public static final int KW_OLDER=237;
    public static final int KW_ON=238;
    public static final int KW_ONLY=239;
    public static final int KW_OPERATOR=240;
    public static final int KW_OPTIMIZE=241;
    public static final int KW_OPTION=242;
    public static final int KW_OR=243;
    public static final int KW_ORDER=244;
    public static final int KW_ORPHAN_FILES=245;
    public static final int KW_OUT=246;
    public static final int KW_OUTER=247;
    public static final int KW_OUTPUTDRIVER=248;
    public static final int KW_OUTPUTFORMAT=249;
    public static final int KW_OVER=250;
    public static final int KW_OVERWRITE=251;
    public static final int KW_OWNER=252;
    public static final int KW_PARTITION=253;
    public static final int KW_PARTITIONED=254;
    public static final int KW_PARTITIONS=255;
    public static final int KW_PATH=256;
    public static final int KW_PERCENT=257;
    public static final int KW_PKFK_JOIN=258;
    public static final int KW_PLAN=259;
    public static final int KW_PLANS=260;
    public static final int KW_PLUS=261;
    public static final int KW_POOL=262;
    public static final int KW_PRECEDING=263;
    public static final int KW_PRECISION=264;
    public static final int KW_PREPARE=265;
    public static final int KW_PRESERVE=266;
    public static final int KW_PRIMARY=267;
    public static final int KW_PRINCIPALS=268;
    public static final int KW_PROCEDURE=269;
    public static final int KW_PURGE=270;
    public static final int KW_QUALIFY=271;
    public static final int KW_QUARTER=272;
    public static final int KW_QUERY=273;
    public static final int KW_QUERY_PARALLELISM=274;
    public static final int KW_RANGE=275;
    public static final int KW_READ=276;
    public static final int KW_READS=277;
    public static final int KW_REAL=278;
    public static final int KW_REBUILD=279;
    public static final int KW_RECORDREADER=280;
    public static final int KW_RECORDWRITER=281;
    public static final int KW_REDUCE=282;
    public static final int KW_REFERENCES=283;
    public static final int KW_REGEXP=284;
    public static final int KW_RELOAD=285;
    public static final int KW_RELY=286;
    public static final int KW_REMOTE=287;
    public static final int KW_RENAME=288;
    public static final int KW_REOPTIMIZATION=289;
    public static final int KW_REPAIR=290;
    public static final int KW_REPL=291;
    public static final int KW_REPLACE=292;
    public static final int KW_REPLICATION=293;
    public static final int KW_RESOURCE=294;
    public static final int KW_RESPECT=295;
    public static final int KW_RESTRICT=296;
    public static final int KW_RETAIN=297;
    public static final int KW_RETENTION=298;
    public static final int KW_REVOKE=299;
    public static final int KW_REWRITE=300;
    public static final int KW_RIGHT=301;
    public static final int KW_RLIKE=302;
    public static final int KW_ROLE=303;
    public static final int KW_ROLES=304;
    public static final int KW_ROLLBACK=305;
    public static final int KW_ROLLUP=306;
    public static final int KW_ROW=307;
    public static final int KW_ROWS=308;
    public static final int KW_SCHEDULED=309;
    public static final int KW_SCHEDULING_POLICY=310;
    public static final int KW_SCHEMA=311;
    public static final int KW_SCHEMAS=312;
    public static final int KW_SECOND=313;
    public static final int KW_SELECT=314;
    public static final int KW_SEMI=315;
    public static final int KW_SERDE=316;
    public static final int KW_SERDEPROPERTIES=317;
    public static final int KW_SERVER=318;
    public static final int KW_SET=319;
    public static final int KW_SETS=320;
    public static final int KW_SET_CURRENT_SNAPSHOT=321;
    public static final int KW_SHARED=322;
    public static final int KW_SHOW=323;
    public static final int KW_SHOW_DATABASE=324;
    public static final int KW_SKEWED=325;
    public static final int KW_SMALLINT=326;
    public static final int KW_SNAPSHOT=327;
    public static final int KW_SNAPSHOTS=328;
    public static final int KW_SOME=329;
    public static final int KW_SORT=330;
    public static final int KW_SORTED=331;
    public static final int KW_SPEC=332;
    public static final int KW_SSL=333;
    public static final int KW_START=334;
    public static final int KW_STATISTICS=335;
    public static final int KW_STATUS=336;
    public static final int KW_STORED=337;
    public static final int KW_STREAMTABLE=338;
    public static final int KW_STRING=339;
    public static final int KW_STRUCT=340;
    public static final int KW_SUMMARY=341;
    public static final int KW_SYNC=342;
    public static final int KW_SYSTEM_TIME=343;
    public static final int KW_SYSTEM_VERSION=344;
    public static final int KW_TABLE=345;
    public static final int KW_TABLES=346;
    public static final int KW_TABLESAMPLE=347;
    public static final int KW_TAG=348;
    public static final int KW_TBLPROPERTIES=349;
    public static final int KW_TEMPORARY=350;
    public static final int KW_TERMINATED=351;
    public static final int KW_THAN=352;
    public static final int KW_THEN=353;
    public static final int KW_TIME=354;
    public static final int KW_TIMESTAMP=355;
    public static final int KW_TIMESTAMPLOCALTZ=356;
    public static final int KW_TINYINT=357;
    public static final int KW_TO=358;
    public static final int KW_TOUCH=359;
    public static final int KW_TRAILING=360;
    public static final int KW_TRANSACTION=361;
    public static final int KW_TRANSACTIONAL=362;
    public static final int KW_TRANSACTIONS=363;
    public static final int KW_TRANSFORM=364;
    public static final int KW_TRIGGER=365;
    public static final int KW_TRIM=366;
    public static final int KW_TRUE=367;
    public static final int KW_TRUNCATE=368;
    public static final int KW_TYPE=369;
    public static final int KW_UNARCHIVE=370;
    public static final int KW_UNBOUNDED=371;
    public static final int KW_UNDO=372;
    public static final int KW_UNION=373;
    public static final int KW_UNIONTYPE=374;
    public static final int KW_UNIQUE=375;
    public static final int KW_UNIQUEJOIN=376;
    public static final int KW_UNKNOWN=377;
    public static final int KW_UNLOCK=378;
    public static final int KW_UNMANAGED=379;
    public static final int KW_UNSET=380;
    public static final int KW_UNSIGNED=381;
    public static final int KW_UPDATE=382;
    public static final int KW_URI=383;
    public static final int KW_URL=384;
    public static final int KW_USE=385;
    public static final int KW_USER=386;
    public static final int KW_USING=387;
    public static final int KW_UTC=388;
    public static final int KW_UTCTIMESTAMP=389;
    public static final int KW_VALIDATE=390;
    public static final int KW_VALUES=391;
    public static final int KW_VALUE_TYPE=392;
    public static final int KW_VARCHAR=393;
    public static final int KW_VECTORIZATION=394;
    public static final int KW_VIEW=395;
    public static final int KW_VIEWS=396;
    public static final int KW_WAIT=397;
    public static final int KW_WEEK=398;
    public static final int KW_WHEN=399;
    public static final int KW_WHERE=400;
    public static final int KW_WHILE=401;
    public static final int KW_WINDOW=402;
    public static final int KW_WITH=403;
    public static final int KW_WITHIN=404;
    public static final int KW_WORK=405;
    public static final int KW_WORKLOAD=406;
    public static final int KW_WRITE=407;
    public static final int KW_YEAR=408;
    public static final int KW_ZONE=409;
    public static final int LCURLY=410;
    public static final int LESSTHAN=411;
    public static final int LESSTHANOREQUALTO=412;
    public static final int LINE_COMMENT=413;
    public static final int LPAREN=414;
    public static final int LSQUARE=415;
    public static final int Letter=416;
    public static final int MINUS=417;
    public static final int MOD=418;
    public static final int NOTEQUAL=419;
    public static final int Number=420;
    public static final int NumberLiteral=421;
    public static final int PLUS=422;
    public static final int QUERY_HINT=423;
    public static final int QUESTION=424;
    public static final int QuotedIdentifier=425;
    public static final int RCURLY=426;
    public static final int RPAREN=427;
    public static final int RSQUARE=428;
    public static final int RegexComponent=429;
    public static final int SEMICOLON=430;
    public static final int STAR=431;
    public static final int StringLiteral=432;
    public static final int TILDE=433;
    public static final int WS=434;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public HiveLexerParent() {} 
    public HiveLexerParent(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public HiveLexerParent(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "HiveLexerParent.g"; }

    // $ANTLR start "KW_TRUE"
    public final void mKW_TRUE() throws RecognitionException {
        try {
            int _type = KW_TRUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:21:9: ( 'TRUE' )
            // HiveLexerParent.g:21:11: 'TRUE'
            {
            match("TRUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRUE"

    // $ANTLR start "KW_FALSE"
    public final void mKW_FALSE() throws RecognitionException {
        try {
            int _type = KW_FALSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:22:10: ( 'FALSE' )
            // HiveLexerParent.g:22:12: 'FALSE'
            {
            match("FALSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FALSE"

    // $ANTLR start "KW_UNKNOWN"
    public final void mKW_UNKNOWN() throws RecognitionException {
        try {
            int _type = KW_UNKNOWN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:23:12: ( 'UNKNOWN' )
            // HiveLexerParent.g:23:14: 'UNKNOWN'
            {
            match("UNKNOWN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNKNOWN"

    // $ANTLR start "KW_ALL"
    public final void mKW_ALL() throws RecognitionException {
        try {
            int _type = KW_ALL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:24:8: ( 'ALL' )
            // HiveLexerParent.g:24:10: 'ALL'
            {
            match("ALL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ALL"

    // $ANTLR start "KW_SOME"
    public final void mKW_SOME() throws RecognitionException {
        try {
            int _type = KW_SOME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:25:9: ( 'SOME' )
            // HiveLexerParent.g:25:11: 'SOME'
            {
            match("SOME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SOME"

    // $ANTLR start "KW_NONE"
    public final void mKW_NONE() throws RecognitionException {
        try {
            int _type = KW_NONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:26:8: ( 'NONE' )
            // HiveLexerParent.g:26:10: 'NONE'
            {
            match("NONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NONE"

    // $ANTLR start "KW_AND"
    public final void mKW_AND() throws RecognitionException {
        try {
            int _type = KW_AND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:27:8: ( 'AND' )
            // HiveLexerParent.g:27:10: 'AND'
            {
            match("AND"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AND"

    // $ANTLR start "KW_OR"
    public final void mKW_OR() throws RecognitionException {
        try {
            int _type = KW_OR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:28:7: ( 'OR' )
            // HiveLexerParent.g:28:9: 'OR'
            {
            match("OR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OR"

    // $ANTLR start "KW_NOT"
    public final void mKW_NOT() throws RecognitionException {
        try {
            int _type = KW_NOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:29:8: ( 'NOT' | '!' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='N') ) {
                alt1=1;
            }
            else if ( (LA1_0=='!') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // HiveLexerParent.g:29:10: 'NOT'
                    {
                    match("NOT"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:29:18: '!'
                    {
                    match('!'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOT"

    // $ANTLR start "KW_LIKE"
    public final void mKW_LIKE() throws RecognitionException {
        try {
            int _type = KW_LIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:30:9: ( 'LIKE' )
            // HiveLexerParent.g:30:11: 'LIKE'
            {
            match("LIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LIKE"

    // $ANTLR start "KW_ANY"
    public final void mKW_ANY() throws RecognitionException {
        try {
            int _type = KW_ANY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:31:8: ( 'ANY' )
            // HiveLexerParent.g:31:10: 'ANY'
            {
            match("ANY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ANY"

    // $ANTLR start "KW_IF"
    public final void mKW_IF() throws RecognitionException {
        try {
            int _type = KW_IF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:32:7: ( 'IF' )
            // HiveLexerParent.g:32:9: 'IF'
            {
            match("IF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IF"

    // $ANTLR start "KW_EXISTS"
    public final void mKW_EXISTS() throws RecognitionException {
        try {
            int _type = KW_EXISTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:33:11: ( 'EXISTS' )
            // HiveLexerParent.g:33:13: 'EXISTS'
            {
            match("EXISTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXISTS"

    // $ANTLR start "KW_ASC"
    public final void mKW_ASC() throws RecognitionException {
        try {
            int _type = KW_ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:35:8: ( 'ASC' )
            // HiveLexerParent.g:35:10: 'ASC'
            {
            match("ASC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ASC"

    // $ANTLR start "KW_DESC"
    public final void mKW_DESC() throws RecognitionException {
        try {
            int _type = KW_DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:36:9: ( 'DESC' )
            // HiveLexerParent.g:36:11: 'DESC'
            {
            match("DESC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DESC"

    // $ANTLR start "KW_NULLS"
    public final void mKW_NULLS() throws RecognitionException {
        try {
            int _type = KW_NULLS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:37:10: ( 'NULLS' )
            // HiveLexerParent.g:37:12: 'NULLS'
            {
            match("NULLS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NULLS"

    // $ANTLR start "KW_LAST"
    public final void mKW_LAST() throws RecognitionException {
        try {
            int _type = KW_LAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:38:9: ( 'LAST' )
            // HiveLexerParent.g:38:11: 'LAST'
            {
            match("LAST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LAST"

    // $ANTLR start "KW_ORDER"
    public final void mKW_ORDER() throws RecognitionException {
        try {
            int _type = KW_ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:39:10: ( 'ORDER' )
            // HiveLexerParent.g:39:12: 'ORDER'
            {
            match("ORDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ORDER"

    // $ANTLR start "KW_GROUP"
    public final void mKW_GROUP() throws RecognitionException {
        try {
            int _type = KW_GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:40:10: ( 'GROUP' )
            // HiveLexerParent.g:40:12: 'GROUP'
            {
            match("GROUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GROUP"

    // $ANTLR start "KW_BY"
    public final void mKW_BY() throws RecognitionException {
        try {
            int _type = KW_BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:41:7: ( 'BY' )
            // HiveLexerParent.g:41:9: 'BY'
            {
            match("BY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BY"

    // $ANTLR start "KW_HAVING"
    public final void mKW_HAVING() throws RecognitionException {
        try {
            int _type = KW_HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:42:11: ( 'HAVING' )
            // HiveLexerParent.g:42:13: 'HAVING'
            {
            match("HAVING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_HAVING"

    // $ANTLR start "KW_QUALIFY"
    public final void mKW_QUALIFY() throws RecognitionException {
        try {
            int _type = KW_QUALIFY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:43:12: ( 'QUALIFY' )
            // HiveLexerParent.g:43:14: 'QUALIFY'
            {
            match("QUALIFY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_QUALIFY"

    // $ANTLR start "KW_WHERE"
    public final void mKW_WHERE() throws RecognitionException {
        try {
            int _type = KW_WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:44:10: ( 'WHERE' )
            // HiveLexerParent.g:44:12: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHERE"

    // $ANTLR start "KW_FROM"
    public final void mKW_FROM() throws RecognitionException {
        try {
            int _type = KW_FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:45:9: ( 'FROM' )
            // HiveLexerParent.g:45:11: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FROM"

    // $ANTLR start "KW_AS"
    public final void mKW_AS() throws RecognitionException {
        try {
            int _type = KW_AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:46:7: ( 'AS' )
            // HiveLexerParent.g:46:9: 'AS'
            {
            match("AS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AS"

    // $ANTLR start "KW_SELECT"
    public final void mKW_SELECT() throws RecognitionException {
        try {
            int _type = KW_SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:47:11: ( 'SELECT' )
            // HiveLexerParent.g:47:13: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SELECT"

    // $ANTLR start "KW_DISTINCT"
    public final void mKW_DISTINCT() throws RecognitionException {
        try {
            int _type = KW_DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:48:13: ( 'DISTINCT' )
            // HiveLexerParent.g:48:15: 'DISTINCT'
            {
            match("DISTINCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTINCT"

    // $ANTLR start "KW_INSERT"
    public final void mKW_INSERT() throws RecognitionException {
        try {
            int _type = KW_INSERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:49:11: ( 'INSERT' )
            // HiveLexerParent.g:49:13: 'INSERT'
            {
            match("INSERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INSERT"

    // $ANTLR start "KW_OVERWRITE"
    public final void mKW_OVERWRITE() throws RecognitionException {
        try {
            int _type = KW_OVERWRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:50:14: ( 'OVERWRITE' )
            // HiveLexerParent.g:50:16: 'OVERWRITE'
            {
            match("OVERWRITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OVERWRITE"

    // $ANTLR start "KW_OUTER"
    public final void mKW_OUTER() throws RecognitionException {
        try {
            int _type = KW_OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:51:10: ( 'OUTER' )
            // HiveLexerParent.g:51:12: 'OUTER'
            {
            match("OUTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTER"

    // $ANTLR start "KW_UNIQUEJOIN"
    public final void mKW_UNIQUEJOIN() throws RecognitionException {
        try {
            int _type = KW_UNIQUEJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:52:15: ( 'UNIQUEJOIN' )
            // HiveLexerParent.g:52:17: 'UNIQUEJOIN'
            {
            match("UNIQUEJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNIQUEJOIN"

    // $ANTLR start "KW_PRESERVE"
    public final void mKW_PRESERVE() throws RecognitionException {
        try {
            int _type = KW_PRESERVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:53:13: ( 'PRESERVE' )
            // HiveLexerParent.g:53:15: 'PRESERVE'
            {
            match("PRESERVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRESERVE"

    // $ANTLR start "KW_JOIN"
    public final void mKW_JOIN() throws RecognitionException {
        try {
            int _type = KW_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:54:9: ( 'JOIN' )
            // HiveLexerParent.g:54:11: 'JOIN'
            {
            match("JOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_JOIN"

    // $ANTLR start "KW_LEFT"
    public final void mKW_LEFT() throws RecognitionException {
        try {
            int _type = KW_LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:55:9: ( 'LEFT' )
            // HiveLexerParent.g:55:11: 'LEFT'
            {
            match("LEFT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LEFT"

    // $ANTLR start "KW_RIGHT"
    public final void mKW_RIGHT() throws RecognitionException {
        try {
            int _type = KW_RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:56:10: ( 'RIGHT' )
            // HiveLexerParent.g:56:12: 'RIGHT'
            {
            match("RIGHT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RIGHT"

    // $ANTLR start "KW_FULL"
    public final void mKW_FULL() throws RecognitionException {
        try {
            int _type = KW_FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:57:9: ( 'FULL' )
            // HiveLexerParent.g:57:11: 'FULL'
            {
            match("FULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FULL"

    // $ANTLR start "KW_ON"
    public final void mKW_ON() throws RecognitionException {
        try {
            int _type = KW_ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:58:7: ( 'ON' )
            // HiveLexerParent.g:58:9: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ON"

    // $ANTLR start "KW_PARTITION"
    public final void mKW_PARTITION() throws RecognitionException {
        try {
            int _type = KW_PARTITION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:59:14: ( 'PARTITION' )
            // HiveLexerParent.g:59:16: 'PARTITION'
            {
            match("PARTITION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITION"

    // $ANTLR start "KW_PARTITIONS"
    public final void mKW_PARTITIONS() throws RecognitionException {
        try {
            int _type = KW_PARTITIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:60:15: ( 'PARTITIONS' )
            // HiveLexerParent.g:60:17: 'PARTITIONS'
            {
            match("PARTITIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITIONS"

    // $ANTLR start "KW_TABLE"
    public final void mKW_TABLE() throws RecognitionException {
        try {
            int _type = KW_TABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:61:9: ( 'TABLE' )
            // HiveLexerParent.g:61:11: 'TABLE'
            {
            match("TABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLE"

    // $ANTLR start "KW_TABLES"
    public final void mKW_TABLES() throws RecognitionException {
        try {
            int _type = KW_TABLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:62:10: ( 'TABLES' )
            // HiveLexerParent.g:62:12: 'TABLES'
            {
            match("TABLES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLES"

    // $ANTLR start "KW_COLUMNS"
    public final void mKW_COLUMNS() throws RecognitionException {
        try {
            int _type = KW_COLUMNS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:63:11: ( 'COLUMNS' )
            // HiveLexerParent.g:63:13: 'COLUMNS'
            {
            match("COLUMNS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLUMNS"

    // $ANTLR start "KW_INDEX"
    public final void mKW_INDEX() throws RecognitionException {
        try {
            int _type = KW_INDEX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:64:9: ( 'INDEX' )
            // HiveLexerParent.g:64:11: 'INDEX'
            {
            match("INDEX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INDEX"

    // $ANTLR start "KW_INDEXES"
    public final void mKW_INDEXES() throws RecognitionException {
        try {
            int _type = KW_INDEXES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:65:11: ( 'INDEXES' )
            // HiveLexerParent.g:65:13: 'INDEXES'
            {
            match("INDEXES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INDEXES"

    // $ANTLR start "KW_REBUILD"
    public final void mKW_REBUILD() throws RecognitionException {
        try {
            int _type = KW_REBUILD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:66:11: ( 'REBUILD' )
            // HiveLexerParent.g:66:13: 'REBUILD'
            {
            match("REBUILD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REBUILD"

    // $ANTLR start "KW_FUNCTIONS"
    public final void mKW_FUNCTIONS() throws RecognitionException {
        try {
            int _type = KW_FUNCTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:67:13: ( 'FUNCTIONS' )
            // HiveLexerParent.g:67:15: 'FUNCTIONS'
            {
            match("FUNCTIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FUNCTIONS"

    // $ANTLR start "KW_SHOW"
    public final void mKW_SHOW() throws RecognitionException {
        try {
            int _type = KW_SHOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:68:8: ( 'SHOW' )
            // HiveLexerParent.g:68:10: 'SHOW'
            {
            match("SHOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHOW"

    // $ANTLR start "KW_MSCK"
    public final void mKW_MSCK() throws RecognitionException {
        try {
            int _type = KW_MSCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:69:8: ( 'MSCK' )
            // HiveLexerParent.g:69:10: 'MSCK'
            {
            match("MSCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MSCK"

    // $ANTLR start "KW_REPAIR"
    public final void mKW_REPAIR() throws RecognitionException {
        try {
            int _type = KW_REPAIR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:70:10: ( 'REPAIR' )
            // HiveLexerParent.g:70:12: 'REPAIR'
            {
            match("REPAIR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPAIR"

    // $ANTLR start "KW_DIRECTORY"
    public final void mKW_DIRECTORY() throws RecognitionException {
        try {
            int _type = KW_DIRECTORY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:71:13: ( 'DIRECTORY' )
            // HiveLexerParent.g:71:15: 'DIRECTORY'
            {
            match("DIRECTORY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DIRECTORY"

    // $ANTLR start "KW_LOCAL"
    public final void mKW_LOCAL() throws RecognitionException {
        try {
            int _type = KW_LOCAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:72:9: ( 'LOCAL' )
            // HiveLexerParent.g:72:11: 'LOCAL'
            {
            match("LOCAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCAL"

    // $ANTLR start "KW_TRANSFORM"
    public final void mKW_TRANSFORM() throws RecognitionException {
        try {
            int _type = KW_TRANSFORM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:73:14: ( 'TRANSFORM' )
            // HiveLexerParent.g:73:16: 'TRANSFORM'
            {
            match("TRANSFORM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRANSFORM"

    // $ANTLR start "KW_USING"
    public final void mKW_USING() throws RecognitionException {
        try {
            int _type = KW_USING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:74:9: ( 'USING' )
            // HiveLexerParent.g:74:11: 'USING'
            {
            match("USING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USING"

    // $ANTLR start "KW_COMPACT_ID"
    public final void mKW_COMPACT_ID() throws RecognitionException {
        try {
            int _type = KW_COMPACT_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:75:14: ( 'COMPACTIONID' )
            // HiveLexerParent.g:75:16: 'COMPACTIONID'
            {
            match("COMPACTIONID"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPACT_ID"

    // $ANTLR start "KW_CLUSTER"
    public final void mKW_CLUSTER() throws RecognitionException {
        try {
            int _type = KW_CLUSTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:76:11: ( 'CLUSTER' )
            // HiveLexerParent.g:76:13: 'CLUSTER'
            {
            match("CLUSTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTER"

    // $ANTLR start "KW_DISTRIBUTE"
    public final void mKW_DISTRIBUTE() throws RecognitionException {
        try {
            int _type = KW_DISTRIBUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:77:14: ( 'DISTRIBUTE' )
            // HiveLexerParent.g:77:16: 'DISTRIBUTE'
            {
            match("DISTRIBUTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTRIBUTE"

    // $ANTLR start "KW_SORT"
    public final void mKW_SORT() throws RecognitionException {
        try {
            int _type = KW_SORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:78:8: ( 'SORT' )
            // HiveLexerParent.g:78:10: 'SORT'
            {
            match("SORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SORT"

    // $ANTLR start "KW_UNION"
    public final void mKW_UNION() throws RecognitionException {
        try {
            int _type = KW_UNION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:79:9: ( 'UNION' )
            // HiveLexerParent.g:79:11: 'UNION'
            {
            match("UNION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNION"

    // $ANTLR start "KW_EXCEPT"
    public final void mKW_EXCEPT() throws RecognitionException {
        try {
            int _type = KW_EXCEPT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:80:10: ( 'EXCEPT' )
            // HiveLexerParent.g:80:12: 'EXCEPT'
            {
            match("EXCEPT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCEPT"

    // $ANTLR start "KW_LOAD"
    public final void mKW_LOAD() throws RecognitionException {
        try {
            int _type = KW_LOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:81:8: ( 'LOAD' )
            // HiveLexerParent.g:81:10: 'LOAD'
            {
            match("LOAD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOAD"

    // $ANTLR start "KW_PREPARE"
    public final void mKW_PREPARE() throws RecognitionException {
        try {
            int _type = KW_PREPARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:82:11: ( 'PREPARE' )
            // HiveLexerParent.g:82:13: 'PREPARE'
            {
            match("PREPARE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PREPARE"

    // $ANTLR start "KW_EXPORT"
    public final void mKW_EXPORT() throws RecognitionException {
        try {
            int _type = KW_EXPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:83:10: ( 'EXPORT' )
            // HiveLexerParent.g:83:12: 'EXPORT'
            {
            match("EXPORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPORT"

    // $ANTLR start "KW_IMPORT"
    public final void mKW_IMPORT() throws RecognitionException {
        try {
            int _type = KW_IMPORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:84:10: ( 'IMPORT' )
            // HiveLexerParent.g:84:12: 'IMPORT'
            {
            match("IMPORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IMPORT"

    // $ANTLR start "KW_REPLICATION"
    public final void mKW_REPLICATION() throws RecognitionException {
        try {
            int _type = KW_REPLICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:85:15: ( 'REPLICATION' )
            // HiveLexerParent.g:85:17: 'REPLICATION'
            {
            match("REPLICATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPLICATION"

    // $ANTLR start "KW_METADATA"
    public final void mKW_METADATA() throws RecognitionException {
        try {
            int _type = KW_METADATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:86:12: ( 'METADATA' )
            // HiveLexerParent.g:86:14: 'METADATA'
            {
            match("METADATA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_METADATA"

    // $ANTLR start "KW_DATA"
    public final void mKW_DATA() throws RecognitionException {
        try {
            int _type = KW_DATA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:87:8: ( 'DATA' )
            // HiveLexerParent.g:87:10: 'DATA'
            {
            match("DATA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATA"

    // $ANTLR start "KW_INPATH"
    public final void mKW_INPATH() throws RecognitionException {
        try {
            int _type = KW_INPATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:88:10: ( 'INPATH' )
            // HiveLexerParent.g:88:12: 'INPATH'
            {
            match("INPATH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPATH"

    // $ANTLR start "KW_IS"
    public final void mKW_IS() throws RecognitionException {
        try {
            int _type = KW_IS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:89:6: ( 'IS' )
            // HiveLexerParent.g:89:8: 'IS'
            {
            match("IS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IS"

    // $ANTLR start "KW_NULL"
    public final void mKW_NULL() throws RecognitionException {
        try {
            int _type = KW_NULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:90:8: ( 'NULL' )
            // HiveLexerParent.g:90:10: 'NULL'
            {
            match("NULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NULL"

    // $ANTLR start "KW_CREATE"
    public final void mKW_CREATE() throws RecognitionException {
        try {
            int _type = KW_CREATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:91:10: ( 'CREATE' )
            // HiveLexerParent.g:91:12: 'CREATE'
            {
            match("CREATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CREATE"

    // $ANTLR start "KW_EXTERNAL"
    public final void mKW_EXTERNAL() throws RecognitionException {
        try {
            int _type = KW_EXTERNAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:92:12: ( 'EXTERNAL' )
            // HiveLexerParent.g:92:14: 'EXTERNAL'
            {
            match("EXTERNAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXTERNAL"

    // $ANTLR start "KW_ALTER"
    public final void mKW_ALTER() throws RecognitionException {
        try {
            int _type = KW_ALTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:93:9: ( 'ALTER' )
            // HiveLexerParent.g:93:11: 'ALTER'
            {
            match("ALTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ALTER"

    // $ANTLR start "KW_CHANGE"
    public final void mKW_CHANGE() throws RecognitionException {
        try {
            int _type = KW_CHANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:94:10: ( 'CHANGE' )
            // HiveLexerParent.g:94:12: 'CHANGE'
            {
            match("CHANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CHANGE"

    // $ANTLR start "KW_COLUMN"
    public final void mKW_COLUMN() throws RecognitionException {
        try {
            int _type = KW_COLUMN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:95:10: ( 'COLUMN' )
            // HiveLexerParent.g:95:12: 'COLUMN'
            {
            match("COLUMN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLUMN"

    // $ANTLR start "KW_FIRST"
    public final void mKW_FIRST() throws RecognitionException {
        try {
            int _type = KW_FIRST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:96:9: ( 'FIRST' )
            // HiveLexerParent.g:96:11: 'FIRST'
            {
            match("FIRST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FIRST"

    // $ANTLR start "KW_AFTER"
    public final void mKW_AFTER() throws RecognitionException {
        try {
            int _type = KW_AFTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:97:9: ( 'AFTER' )
            // HiveLexerParent.g:97:11: 'AFTER'
            {
            match("AFTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AFTER"

    // $ANTLR start "KW_DESCRIBE"
    public final void mKW_DESCRIBE() throws RecognitionException {
        try {
            int _type = KW_DESCRIBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:98:12: ( 'DESCRIBE' )
            // HiveLexerParent.g:98:14: 'DESCRIBE'
            {
            match("DESCRIBE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DESCRIBE"

    // $ANTLR start "KW_DROP"
    public final void mKW_DROP() throws RecognitionException {
        try {
            int _type = KW_DROP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:99:8: ( 'DROP' )
            // HiveLexerParent.g:99:10: 'DROP'
            {
            match("DROP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DROP"

    // $ANTLR start "KW_RENAME"
    public final void mKW_RENAME() throws RecognitionException {
        try {
            int _type = KW_RENAME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:100:10: ( 'RENAME' )
            // HiveLexerParent.g:100:12: 'RENAME'
            {
            match("RENAME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RENAME"

    // $ANTLR start "KW_TO"
    public final void mKW_TO() throws RecognitionException {
        try {
            int _type = KW_TO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:101:6: ( 'TO' )
            // HiveLexerParent.g:101:8: 'TO'
            {
            match("TO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TO"

    // $ANTLR start "KW_COMMENT"
    public final void mKW_COMMENT() throws RecognitionException {
        try {
            int _type = KW_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:102:11: ( 'COMMENT' )
            // HiveLexerParent.g:102:13: 'COMMENT'
            {
            match("COMMENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMMENT"

    // $ANTLR start "KW_BOOLEAN"
    public final void mKW_BOOLEAN() throws RecognitionException {
        try {
            int _type = KW_BOOLEAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:103:11: ( 'BOOLEAN' )
            // HiveLexerParent.g:103:13: 'BOOLEAN'
            {
            match("BOOLEAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BOOLEAN"

    // $ANTLR start "KW_TINYINT"
    public final void mKW_TINYINT() throws RecognitionException {
        try {
            int _type = KW_TINYINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:104:11: ( 'TINYINT' )
            // HiveLexerParent.g:104:13: 'TINYINT'
            {
            match("TINYINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TINYINT"

    // $ANTLR start "KW_SMALLINT"
    public final void mKW_SMALLINT() throws RecognitionException {
        try {
            int _type = KW_SMALLINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:105:12: ( 'SMALLINT' )
            // HiveLexerParent.g:105:14: 'SMALLINT'
            {
            match("SMALLINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SMALLINT"

    // $ANTLR start "KW_INT"
    public final void mKW_INT() throws RecognitionException {
        try {
            int _type = KW_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:106:7: ( 'INT' | 'INTEGER' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='I') ) {
                int LA2_1 = input.LA(2);

                if ( (LA2_1=='N') ) {
                    int LA2_2 = input.LA(3);

                    if ( (LA2_2=='T') ) {
                        int LA2_3 = input.LA(4);

                        if ( (LA2_3=='E') ) {
                            alt2=2;
                        }
                        else {
                            alt2=1;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // HiveLexerParent.g:106:9: 'INT'
                    {
                    match("INT"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:106:17: 'INTEGER'
                    {
                    match("INTEGER"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INT"

    // $ANTLR start "KW_BIGINT"
    public final void mKW_BIGINT() throws RecognitionException {
        try {
            int _type = KW_BIGINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:107:10: ( 'BIGINT' )
            // HiveLexerParent.g:107:12: 'BIGINT'
            {
            match("BIGINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BIGINT"

    // $ANTLR start "KW_FLOAT"
    public final void mKW_FLOAT() throws RecognitionException {
        try {
            int _type = KW_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:108:9: ( 'FLOAT' )
            // HiveLexerParent.g:108:11: 'FLOAT'
            {
            match("FLOAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FLOAT"

    // $ANTLR start "KW_REAL"
    public final void mKW_REAL() throws RecognitionException {
        try {
            int _type = KW_REAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:109:8: ( 'REAL' )
            // HiveLexerParent.g:109:10: 'REAL'
            {
            match("REAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REAL"

    // $ANTLR start "KW_DOUBLE"
    public final void mKW_DOUBLE() throws RecognitionException {
        try {
            int _type = KW_DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:110:10: ( 'DOUBLE' )
            // HiveLexerParent.g:110:12: 'DOUBLE'
            {
            match("DOUBLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DOUBLE"

    // $ANTLR start "KW_PRECISION"
    public final void mKW_PRECISION() throws RecognitionException {
        try {
            int _type = KW_PRECISION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:111:13: ( 'PRECISION' )
            // HiveLexerParent.g:111:15: 'PRECISION'
            {
            match("PRECISION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRECISION"

    // $ANTLR start "KW_DATE"
    public final void mKW_DATE() throws RecognitionException {
        try {
            int _type = KW_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:112:8: ( 'DATE' )
            // HiveLexerParent.g:112:10: 'DATE'
            {
            match("DATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATE"

    // $ANTLR start "KW_DATETIME"
    public final void mKW_DATETIME() throws RecognitionException {
        try {
            int _type = KW_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:113:12: ( 'DATETIME' )
            // HiveLexerParent.g:113:14: 'DATETIME'
            {
            match("DATETIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATETIME"

    // $ANTLR start "KW_TIMESTAMP"
    public final void mKW_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:114:13: ( 'TIMESTAMP' )
            // HiveLexerParent.g:114:15: 'TIMESTAMP'
            {
            match("TIMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TIMESTAMP"

    // $ANTLR start "KW_TIMESTAMPLOCALTZ"
    public final void mKW_TIMESTAMPLOCALTZ() throws RecognitionException {
        try {
            int _type = KW_TIMESTAMPLOCALTZ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:115:20: ( 'TIMESTAMPLOCALTZ' )
            // HiveLexerParent.g:115:22: 'TIMESTAMPLOCALTZ'
            {
            match("TIMESTAMPLOCALTZ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TIMESTAMPLOCALTZ"

    // $ANTLR start "KW_TIME"
    public final void mKW_TIME() throws RecognitionException {
        try {
            int _type = KW_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:116:8: ( 'TIME' )
            // HiveLexerParent.g:116:10: 'TIME'
            {
            match("TIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TIME"

    // $ANTLR start "KW_ZONE"
    public final void mKW_ZONE() throws RecognitionException {
        try {
            int _type = KW_ZONE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:117:8: ( 'ZONE' )
            // HiveLexerParent.g:117:10: 'ZONE'
            {
            match("ZONE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ZONE"

    // $ANTLR start "KW_INTERVAL"
    public final void mKW_INTERVAL() throws RecognitionException {
        try {
            int _type = KW_INTERVAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:118:12: ( 'INTERVAL' )
            // HiveLexerParent.g:118:14: 'INTERVAL'
            {
            match("INTERVAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTERVAL"

    // $ANTLR start "KW_DECIMAL"
    public final void mKW_DECIMAL() throws RecognitionException {
        try {
            int _type = KW_DECIMAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:119:11: ( 'DECIMAL' | 'DEC' | 'NUMERIC' )
            int alt3=3;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='D') ) {
                int LA3_1 = input.LA(2);

                if ( (LA3_1=='E') ) {
                    int LA3_3 = input.LA(3);

                    if ( (LA3_3=='C') ) {
                        int LA3_4 = input.LA(4);

                        if ( (LA3_4=='I') ) {
                            alt3=1;
                        }
                        else {
                            alt3=2;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 3, 3, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA3_0=='N') ) {
                alt3=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // HiveLexerParent.g:119:13: 'DECIMAL'
                    {
                    match("DECIMAL"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:119:25: 'DEC'
                    {
                    match("DEC"); 



                    }
                    break;
                case 3 :
                    // HiveLexerParent.g:119:33: 'NUMERIC'
                    {
                    match("NUMERIC"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DECIMAL"

    // $ANTLR start "KW_STRING"
    public final void mKW_STRING() throws RecognitionException {
        try {
            int _type = KW_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:120:10: ( 'STRING' )
            // HiveLexerParent.g:120:12: 'STRING'
            {
            match("STRING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STRING"

    // $ANTLR start "KW_CHAR"
    public final void mKW_CHAR() throws RecognitionException {
        try {
            int _type = KW_CHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:121:8: ( 'CHAR' )
            // HiveLexerParent.g:121:10: 'CHAR'
            {
            match("CHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CHAR"

    // $ANTLR start "KW_VARCHAR"
    public final void mKW_VARCHAR() throws RecognitionException {
        try {
            int _type = KW_VARCHAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:122:11: ( 'VARCHAR' )
            // HiveLexerParent.g:122:13: 'VARCHAR'
            {
            match("VARCHAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VARCHAR"

    // $ANTLR start "KW_ARRAY"
    public final void mKW_ARRAY() throws RecognitionException {
        try {
            int _type = KW_ARRAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:123:9: ( 'ARRAY' )
            // HiveLexerParent.g:123:11: 'ARRAY'
            {
            match("ARRAY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ARRAY"

    // $ANTLR start "KW_STRUCT"
    public final void mKW_STRUCT() throws RecognitionException {
        try {
            int _type = KW_STRUCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:124:10: ( 'STRUCT' )
            // HiveLexerParent.g:124:12: 'STRUCT'
            {
            match("STRUCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STRUCT"

    // $ANTLR start "KW_MAP"
    public final void mKW_MAP() throws RecognitionException {
        try {
            int _type = KW_MAP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:125:7: ( 'MAP' )
            // HiveLexerParent.g:125:9: 'MAP'
            {
            match("MAP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MAP"

    // $ANTLR start "KW_UNIONTYPE"
    public final void mKW_UNIONTYPE() throws RecognitionException {
        try {
            int _type = KW_UNIONTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:126:13: ( 'UNIONTYPE' )
            // HiveLexerParent.g:126:15: 'UNIONTYPE'
            {
            match("UNIONTYPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNIONTYPE"

    // $ANTLR start "KW_REDUCE"
    public final void mKW_REDUCE() throws RecognitionException {
        try {
            int _type = KW_REDUCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:127:10: ( 'REDUCE' )
            // HiveLexerParent.g:127:12: 'REDUCE'
            {
            match("REDUCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REDUCE"

    // $ANTLR start "KW_PARTITIONED"
    public final void mKW_PARTITIONED() throws RecognitionException {
        try {
            int _type = KW_PARTITIONED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:128:15: ( 'PARTITIONED' )
            // HiveLexerParent.g:128:17: 'PARTITIONED'
            {
            match("PARTITIONED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PARTITIONED"

    // $ANTLR start "KW_CLUSTERED"
    public final void mKW_CLUSTERED() throws RecognitionException {
        try {
            int _type = KW_CLUSTERED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:129:13: ( 'CLUSTERED' )
            // HiveLexerParent.g:129:15: 'CLUSTERED'
            {
            match("CLUSTERED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTERED"

    // $ANTLR start "KW_DISTRIBUTED"
    public final void mKW_DISTRIBUTED() throws RecognitionException {
        try {
            int _type = KW_DISTRIBUTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:130:15: ( 'DISTRIBUTED' )
            // HiveLexerParent.g:130:17: 'DISTRIBUTED'
            {
            match("DISTRIBUTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISTRIBUTED"

    // $ANTLR start "KW_SORTED"
    public final void mKW_SORTED() throws RecognitionException {
        try {
            int _type = KW_SORTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:131:10: ( 'SORTED' )
            // HiveLexerParent.g:131:12: 'SORTED'
            {
            match("SORTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SORTED"

    // $ANTLR start "KW_INTO"
    public final void mKW_INTO() throws RecognitionException {
        try {
            int _type = KW_INTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:132:8: ( 'INTO' )
            // HiveLexerParent.g:132:10: 'INTO'
            {
            match("INTO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTO"

    // $ANTLR start "KW_BUCKETS"
    public final void mKW_BUCKETS() throws RecognitionException {
        try {
            int _type = KW_BUCKETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:133:11: ( 'BUCKETS' )
            // HiveLexerParent.g:133:13: 'BUCKETS'
            {
            match("BUCKETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BUCKETS"

    // $ANTLR start "KW_ROW"
    public final void mKW_ROW() throws RecognitionException {
        try {
            int _type = KW_ROW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:134:7: ( 'ROW' )
            // HiveLexerParent.g:134:9: 'ROW'
            {
            match("ROW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROW"

    // $ANTLR start "KW_ROWS"
    public final void mKW_ROWS() throws RecognitionException {
        try {
            int _type = KW_ROWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:135:8: ( 'ROWS' )
            // HiveLexerParent.g:135:10: 'ROWS'
            {
            match("ROWS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROWS"

    // $ANTLR start "KW_FORMAT"
    public final void mKW_FORMAT() throws RecognitionException {
        try {
            int _type = KW_FORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:136:10: ( 'FORMAT' )
            // HiveLexerParent.g:136:12: 'FORMAT'
            {
            match("FORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FORMAT"

    // $ANTLR start "KW_DELIMITED"
    public final void mKW_DELIMITED() throws RecognitionException {
        try {
            int _type = KW_DELIMITED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:137:13: ( 'DELIMITED' )
            // HiveLexerParent.g:137:15: 'DELIMITED'
            {
            match("DELIMITED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DELIMITED"

    // $ANTLR start "KW_FIELDS"
    public final void mKW_FIELDS() throws RecognitionException {
        try {
            int _type = KW_FIELDS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:138:10: ( 'FIELDS' )
            // HiveLexerParent.g:138:12: 'FIELDS'
            {
            match("FIELDS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FIELDS"

    // $ANTLR start "KW_TERMINATED"
    public final void mKW_TERMINATED() throws RecognitionException {
        try {
            int _type = KW_TERMINATED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:139:14: ( 'TERMINATED' )
            // HiveLexerParent.g:139:16: 'TERMINATED'
            {
            match("TERMINATED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TERMINATED"

    // $ANTLR start "KW_ESCAPED"
    public final void mKW_ESCAPED() throws RecognitionException {
        try {
            int _type = KW_ESCAPED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:140:11: ( 'ESCAPED' )
            // HiveLexerParent.g:140:13: 'ESCAPED'
            {
            match("ESCAPED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ESCAPED"

    // $ANTLR start "KW_COLLECTION"
    public final void mKW_COLLECTION() throws RecognitionException {
        try {
            int _type = KW_COLLECTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:141:14: ( 'COLLECTION' )
            // HiveLexerParent.g:141:16: 'COLLECTION'
            {
            match("COLLECTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COLLECTION"

    // $ANTLR start "KW_ITEMS"
    public final void mKW_ITEMS() throws RecognitionException {
        try {
            int _type = KW_ITEMS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:142:9: ( 'ITEMS' )
            // HiveLexerParent.g:142:11: 'ITEMS'
            {
            match("ITEMS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ITEMS"

    // $ANTLR start "KW_KEYS"
    public final void mKW_KEYS() throws RecognitionException {
        try {
            int _type = KW_KEYS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:143:8: ( 'KEYS' )
            // HiveLexerParent.g:143:10: 'KEYS'
            {
            match("KEYS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KEYS"

    // $ANTLR start "KW_KEY_TYPE"
    public final void mKW_KEY_TYPE() throws RecognitionException {
        try {
            int _type = KW_KEY_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:144:12: ( '$KEY$' )
            // HiveLexerParent.g:144:14: '$KEY$'
            {
            match("$KEY$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KEY_TYPE"

    // $ANTLR start "KW_KILL"
    public final void mKW_KILL() throws RecognitionException {
        try {
            int _type = KW_KILL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:145:8: ( 'KILL' )
            // HiveLexerParent.g:145:10: 'KILL'
            {
            match("KILL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KILL"

    // $ANTLR start "KW_LINES"
    public final void mKW_LINES() throws RecognitionException {
        try {
            int _type = KW_LINES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:146:9: ( 'LINES' )
            // HiveLexerParent.g:146:11: 'LINES'
            {
            match("LINES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LINES"

    // $ANTLR start "KW_STORED"
    public final void mKW_STORED() throws RecognitionException {
        try {
            int _type = KW_STORED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:147:10: ( 'STORED' )
            // HiveLexerParent.g:147:12: 'STORED'
            {
            match("STORED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STORED"

    // $ANTLR start "KW_FILEFORMAT"
    public final void mKW_FILEFORMAT() throws RecognitionException {
        try {
            int _type = KW_FILEFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:148:14: ( 'FILEFORMAT' )
            // HiveLexerParent.g:148:16: 'FILEFORMAT'
            {
            match("FILEFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FILEFORMAT"

    // $ANTLR start "KW_INPUTFORMAT"
    public final void mKW_INPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_INPUTFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:149:15: ( 'INPUTFORMAT' )
            // HiveLexerParent.g:149:17: 'INPUTFORMAT'
            {
            match("INPUTFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPUTFORMAT"

    // $ANTLR start "KW_OUTPUTFORMAT"
    public final void mKW_OUTPUTFORMAT() throws RecognitionException {
        try {
            int _type = KW_OUTPUTFORMAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:150:16: ( 'OUTPUTFORMAT' )
            // HiveLexerParent.g:150:18: 'OUTPUTFORMAT'
            {
            match("OUTPUTFORMAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTPUTFORMAT"

    // $ANTLR start "KW_INPUTDRIVER"
    public final void mKW_INPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_INPUTDRIVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:151:15: ( 'INPUTDRIVER' )
            // HiveLexerParent.g:151:17: 'INPUTDRIVER'
            {
            match("INPUTDRIVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INPUTDRIVER"

    // $ANTLR start "KW_OUTPUTDRIVER"
    public final void mKW_OUTPUTDRIVER() throws RecognitionException {
        try {
            int _type = KW_OUTPUTDRIVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:152:16: ( 'OUTPUTDRIVER' )
            // HiveLexerParent.g:152:18: 'OUTPUTDRIVER'
            {
            match("OUTPUTDRIVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUTPUTDRIVER"

    // $ANTLR start "KW_ENABLE"
    public final void mKW_ENABLE() throws RecognitionException {
        try {
            int _type = KW_ENABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:153:10: ( 'ENABLE' | 'ENABLED' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='E') ) {
                int LA4_1 = input.LA(2);

                if ( (LA4_1=='N') ) {
                    int LA4_2 = input.LA(3);

                    if ( (LA4_2=='A') ) {
                        int LA4_3 = input.LA(4);

                        if ( (LA4_3=='B') ) {
                            int LA4_4 = input.LA(5);

                            if ( (LA4_4=='L') ) {
                                int LA4_5 = input.LA(6);

                                if ( (LA4_5=='E') ) {
                                    int LA4_6 = input.LA(7);

                                    if ( (LA4_6=='D') ) {
                                        alt4=2;
                                    }
                                    else {
                                        alt4=1;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 4, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 4, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 4, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 4, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 4, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // HiveLexerParent.g:153:12: 'ENABLE'
                    {
                    match("ENABLE"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:153:23: 'ENABLED'
                    {
                    match("ENABLED"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ENABLE"

    // $ANTLR start "KW_DISABLE"
    public final void mKW_DISABLE() throws RecognitionException {
        try {
            int _type = KW_DISABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:154:11: ( 'DISABLE' | 'DISABLED' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='D') ) {
                int LA5_1 = input.LA(2);

                if ( (LA5_1=='I') ) {
                    int LA5_2 = input.LA(3);

                    if ( (LA5_2=='S') ) {
                        int LA5_3 = input.LA(4);

                        if ( (LA5_3=='A') ) {
                            int LA5_4 = input.LA(5);

                            if ( (LA5_4=='B') ) {
                                int LA5_5 = input.LA(6);

                                if ( (LA5_5=='L') ) {
                                    int LA5_6 = input.LA(7);

                                    if ( (LA5_6=='E') ) {
                                        int LA5_7 = input.LA(8);

                                        if ( (LA5_7=='D') ) {
                                            alt5=2;
                                        }
                                        else {
                                            alt5=1;
                                        }
                                    }
                                    else {
                                        NoViableAltException nvae =
                                            new NoViableAltException("", 5, 6, input);

                                        throw nvae;

                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 5, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 5, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 5, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // HiveLexerParent.g:154:13: 'DISABLE'
                    {
                    match("DISABLE"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:154:25: 'DISABLED'
                    {
                    match("DISABLED"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DISABLE"

    // $ANTLR start "KW_EXECUTED"
    public final void mKW_EXECUTED() throws RecognitionException {
        try {
            int _type = KW_EXECUTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:155:12: ( 'EXECUTED' )
            // HiveLexerParent.g:155:14: 'EXECUTED'
            {
            match("EXECUTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXECUTED"

    // $ANTLR start "KW_EXECUTE"
    public final void mKW_EXECUTE() throws RecognitionException {
        try {
            int _type = KW_EXECUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:156:11: ( 'EXECUTE' )
            // HiveLexerParent.g:156:13: 'EXECUTE'
            {
            match("EXECUTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXECUTE"

    // $ANTLR start "KW_LOCATION"
    public final void mKW_LOCATION() throws RecognitionException {
        try {
            int _type = KW_LOCATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:157:12: ( 'LOCATION' )
            // HiveLexerParent.g:157:14: 'LOCATION'
            {
            match("LOCATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCATION"

    // $ANTLR start "KW_MANAGED"
    public final void mKW_MANAGED() throws RecognitionException {
        try {
            int _type = KW_MANAGED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:158:11: ( 'MANAGED' )
            // HiveLexerParent.g:158:13: 'MANAGED'
            {
            match("MANAGED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MANAGED"

    // $ANTLR start "KW_MANAGEDLOCATION"
    public final void mKW_MANAGEDLOCATION() throws RecognitionException {
        try {
            int _type = KW_MANAGEDLOCATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:159:19: ( 'MANAGEDLOCATION' )
            // HiveLexerParent.g:159:21: 'MANAGEDLOCATION'
            {
            match("MANAGEDLOCATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MANAGEDLOCATION"

    // $ANTLR start "KW_TABLESAMPLE"
    public final void mKW_TABLESAMPLE() throws RecognitionException {
        try {
            int _type = KW_TABLESAMPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:160:15: ( 'TABLESAMPLE' )
            // HiveLexerParent.g:160:17: 'TABLESAMPLE'
            {
            match("TABLESAMPLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TABLESAMPLE"

    // $ANTLR start "KW_BUCKET"
    public final void mKW_BUCKET() throws RecognitionException {
        try {
            int _type = KW_BUCKET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:161:10: ( 'BUCKET' )
            // HiveLexerParent.g:161:12: 'BUCKET'
            {
            match("BUCKET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BUCKET"

    // $ANTLR start "KW_OUT"
    public final void mKW_OUT() throws RecognitionException {
        try {
            int _type = KW_OUT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:162:7: ( 'OUT' )
            // HiveLexerParent.g:162:9: 'OUT'
            {
            match("OUT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OUT"

    // $ANTLR start "KW_OF"
    public final void mKW_OF() throws RecognitionException {
        try {
            int _type = KW_OF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:163:6: ( 'OF' )
            // HiveLexerParent.g:163:8: 'OF'
            {
            match("OF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OF"

    // $ANTLR start "KW_PERCENT"
    public final void mKW_PERCENT() throws RecognitionException {
        try {
            int _type = KW_PERCENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:164:11: ( 'PERCENT' )
            // HiveLexerParent.g:164:13: 'PERCENT'
            {
            match("PERCENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PERCENT"

    // $ANTLR start "KW_CAST"
    public final void mKW_CAST() throws RecognitionException {
        try {
            int _type = KW_CAST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:165:8: ( 'CAST' )
            // HiveLexerParent.g:165:10: 'CAST'
            {
            match("CAST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CAST"

    // $ANTLR start "KW_ADD"
    public final void mKW_ADD() throws RecognitionException {
        try {
            int _type = KW_ADD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:166:7: ( 'ADD' )
            // HiveLexerParent.g:166:9: 'ADD'
            {
            match("ADD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ADD"

    // $ANTLR start "KW_REPLACE"
    public final void mKW_REPLACE() throws RecognitionException {
        try {
            int _type = KW_REPLACE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:167:11: ( 'REPLACE' )
            // HiveLexerParent.g:167:13: 'REPLACE'
            {
            match("REPLACE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPLACE"

    // $ANTLR start "KW_RLIKE"
    public final void mKW_RLIKE() throws RecognitionException {
        try {
            int _type = KW_RLIKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:168:9: ( 'RLIKE' )
            // HiveLexerParent.g:168:11: 'RLIKE'
            {
            match("RLIKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RLIKE"

    // $ANTLR start "KW_REGEXP"
    public final void mKW_REGEXP() throws RecognitionException {
        try {
            int _type = KW_REGEXP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:169:10: ( 'REGEXP' )
            // HiveLexerParent.g:169:12: 'REGEXP'
            {
            match("REGEXP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REGEXP"

    // $ANTLR start "KW_TEMPORARY"
    public final void mKW_TEMPORARY() throws RecognitionException {
        try {
            int _type = KW_TEMPORARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:170:13: ( 'TEMPORARY' )
            // HiveLexerParent.g:170:15: 'TEMPORARY'
            {
            match("TEMPORARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TEMPORARY"

    // $ANTLR start "KW_FUNCTION"
    public final void mKW_FUNCTION() throws RecognitionException {
        try {
            int _type = KW_FUNCTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:171:12: ( 'FUNCTION' )
            // HiveLexerParent.g:171:14: 'FUNCTION'
            {
            match("FUNCTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FUNCTION"

    // $ANTLR start "KW_MACRO"
    public final void mKW_MACRO() throws RecognitionException {
        try {
            int _type = KW_MACRO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:172:9: ( 'MACRO' )
            // HiveLexerParent.g:172:11: 'MACRO'
            {
            match("MACRO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MACRO"

    // $ANTLR start "KW_FILE"
    public final void mKW_FILE() throws RecognitionException {
        try {
            int _type = KW_FILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:173:8: ( 'FILE' )
            // HiveLexerParent.g:173:10: 'FILE'
            {
            match("FILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FILE"

    // $ANTLR start "KW_JAR"
    public final void mKW_JAR() throws RecognitionException {
        try {
            int _type = KW_JAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:174:7: ( 'JAR' )
            // HiveLexerParent.g:174:9: 'JAR'
            {
            match("JAR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_JAR"

    // $ANTLR start "KW_EXPLAIN"
    public final void mKW_EXPLAIN() throws RecognitionException {
        try {
            int _type = KW_EXPLAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:175:11: ( 'EXPLAIN' )
            // HiveLexerParent.g:175:13: 'EXPLAIN'
            {
            match("EXPLAIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPLAIN"

    // $ANTLR start "KW_DDL"
    public final void mKW_DDL() throws RecognitionException {
        try {
            int _type = KW_DDL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:176:7: ( 'DDL' )
            // HiveLexerParent.g:176:9: 'DDL'
            {
            match("DDL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DDL"

    // $ANTLR start "KW_EXTENDED"
    public final void mKW_EXTENDED() throws RecognitionException {
        try {
            int _type = KW_EXTENDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:177:12: ( 'EXTENDED' )
            // HiveLexerParent.g:177:14: 'EXTENDED'
            {
            match("EXTENDED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXTENDED"

    // $ANTLR start "KW_DEBUG"
    public final void mKW_DEBUG() throws RecognitionException {
        try {
            int _type = KW_DEBUG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:178:9: ( 'DEBUG' )
            // HiveLexerParent.g:178:11: 'DEBUG'
            {
            match("DEBUG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEBUG"

    // $ANTLR start "KW_FORMATTED"
    public final void mKW_FORMATTED() throws RecognitionException {
        try {
            int _type = KW_FORMATTED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:179:13: ( 'FORMATTED' )
            // HiveLexerParent.g:179:15: 'FORMATTED'
            {
            match("FORMATTED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FORMATTED"

    // $ANTLR start "KW_DEPENDENCY"
    public final void mKW_DEPENDENCY() throws RecognitionException {
        try {
            int _type = KW_DEPENDENCY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:180:14: ( 'DEPENDENCY' )
            // HiveLexerParent.g:180:16: 'DEPENDENCY'
            {
            match("DEPENDENCY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEPENDENCY"

    // $ANTLR start "KW_LOGICAL"
    public final void mKW_LOGICAL() throws RecognitionException {
        try {
            int _type = KW_LOGICAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:181:11: ( 'LOGICAL' )
            // HiveLexerParent.g:181:13: 'LOGICAL'
            {
            match("LOGICAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOGICAL"

    // $ANTLR start "KW_CBO"
    public final void mKW_CBO() throws RecognitionException {
        try {
            int _type = KW_CBO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:182:7: ( 'CBO' )
            // HiveLexerParent.g:182:9: 'CBO'
            {
            match("CBO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CBO"

    // $ANTLR start "KW_SERDE"
    public final void mKW_SERDE() throws RecognitionException {
        try {
            int _type = KW_SERDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:183:9: ( 'SERDE' )
            // HiveLexerParent.g:183:11: 'SERDE'
            {
            match("SERDE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SERDE"

    // $ANTLR start "KW_WITH"
    public final void mKW_WITH() throws RecognitionException {
        try {
            int _type = KW_WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:184:8: ( 'WITH' )
            // HiveLexerParent.g:184:10: 'WITH'
            {
            match("WITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WITH"

    // $ANTLR start "KW_DEFERRED"
    public final void mKW_DEFERRED() throws RecognitionException {
        try {
            int _type = KW_DEFERRED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:185:12: ( 'DEFERRED' )
            // HiveLexerParent.g:185:14: 'DEFERRED'
            {
            match("DEFERRED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEFERRED"

    // $ANTLR start "KW_SERDEPROPERTIES"
    public final void mKW_SERDEPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_SERDEPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:186:19: ( 'SERDEPROPERTIES' )
            // HiveLexerParent.g:186:21: 'SERDEPROPERTIES'
            {
            match("SERDEPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SERDEPROPERTIES"

    // $ANTLR start "KW_DBPROPERTIES"
    public final void mKW_DBPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_DBPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:187:16: ( 'DBPROPERTIES' )
            // HiveLexerParent.g:187:18: 'DBPROPERTIES'
            {
            match("DBPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DBPROPERTIES"

    // $ANTLR start "KW_DCPROPERTIES"
    public final void mKW_DCPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_DCPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:188:16: ( 'DCPROPERTIES' )
            // HiveLexerParent.g:188:18: 'DCPROPERTIES'
            {
            match("DCPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DCPROPERTIES"

    // $ANTLR start "KW_LIMIT"
    public final void mKW_LIMIT() throws RecognitionException {
        try {
            int _type = KW_LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:189:9: ( 'LIMIT' )
            // HiveLexerParent.g:189:11: 'LIMIT'
            {
            match("LIMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LIMIT"

    // $ANTLR start "KW_OFFSET"
    public final void mKW_OFFSET() throws RecognitionException {
        try {
            int _type = KW_OFFSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:190:10: ( 'OFFSET' )
            // HiveLexerParent.g:190:12: 'OFFSET'
            {
            match("OFFSET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OFFSET"

    // $ANTLR start "KW_SET"
    public final void mKW_SET() throws RecognitionException {
        try {
            int _type = KW_SET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:191:7: ( 'SET' )
            // HiveLexerParent.g:191:9: 'SET'
            {
            match("SET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SET"

    // $ANTLR start "KW_UNSET"
    public final void mKW_UNSET() throws RecognitionException {
        try {
            int _type = KW_UNSET;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:192:9: ( 'UNSET' )
            // HiveLexerParent.g:192:11: 'UNSET'
            {
            match("UNSET"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNSET"

    // $ANTLR start "KW_TBLPROPERTIES"
    public final void mKW_TBLPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_TBLPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:193:17: ( 'TBLPROPERTIES' )
            // HiveLexerParent.g:193:19: 'TBLPROPERTIES'
            {
            match("TBLPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TBLPROPERTIES"

    // $ANTLR start "KW_IDXPROPERTIES"
    public final void mKW_IDXPROPERTIES() throws RecognitionException {
        try {
            int _type = KW_IDXPROPERTIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:194:17: ( 'IDXPROPERTIES' )
            // HiveLexerParent.g:194:19: 'IDXPROPERTIES'
            {
            match("IDXPROPERTIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IDXPROPERTIES"

    // $ANTLR start "KW_VALUE_TYPE"
    public final void mKW_VALUE_TYPE() throws RecognitionException {
        try {
            int _type = KW_VALUE_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:195:14: ( '$VALUE$' )
            // HiveLexerParent.g:195:16: '$VALUE$'
            {
            match("$VALUE$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VALUE_TYPE"

    // $ANTLR start "KW_ELEM_TYPE"
    public final void mKW_ELEM_TYPE() throws RecognitionException {
        try {
            int _type = KW_ELEM_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:196:13: ( '$ELEM$' )
            // HiveLexerParent.g:196:15: '$ELEM$'
            {
            match("$ELEM$"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ELEM_TYPE"

    // $ANTLR start "KW_DEFINED"
    public final void mKW_DEFINED() throws RecognitionException {
        try {
            int _type = KW_DEFINED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:197:11: ( 'DEFINED' )
            // HiveLexerParent.g:197:13: 'DEFINED'
            {
            match("DEFINED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEFINED"

    // $ANTLR start "KW_CASE"
    public final void mKW_CASE() throws RecognitionException {
        try {
            int _type = KW_CASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:198:8: ( 'CASE' )
            // HiveLexerParent.g:198:10: 'CASE'
            {
            match("CASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CASE"

    // $ANTLR start "KW_WHEN"
    public final void mKW_WHEN() throws RecognitionException {
        try {
            int _type = KW_WHEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:199:8: ( 'WHEN' )
            // HiveLexerParent.g:199:10: 'WHEN'
            {
            match("WHEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHEN"

    // $ANTLR start "KW_THEN"
    public final void mKW_THEN() throws RecognitionException {
        try {
            int _type = KW_THEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:200:8: ( 'THEN' )
            // HiveLexerParent.g:200:10: 'THEN'
            {
            match("THEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_THEN"

    // $ANTLR start "KW_ELSE"
    public final void mKW_ELSE() throws RecognitionException {
        try {
            int _type = KW_ELSE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:201:8: ( 'ELSE' )
            // HiveLexerParent.g:201:10: 'ELSE'
            {
            match("ELSE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ELSE"

    // $ANTLR start "KW_END"
    public final void mKW_END() throws RecognitionException {
        try {
            int _type = KW_END;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:202:7: ( 'END' )
            // HiveLexerParent.g:202:9: 'END'
            {
            match("END"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_END"

    // $ANTLR start "KW_MAPJOIN"
    public final void mKW_MAPJOIN() throws RecognitionException {
        try {
            int _type = KW_MAPJOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:203:11: ( 'MAPJOIN' )
            // HiveLexerParent.g:203:13: 'MAPJOIN'
            {
            match("MAPJOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MAPJOIN"

    // $ANTLR start "KW_STREAMTABLE"
    public final void mKW_STREAMTABLE() throws RecognitionException {
        try {
            int _type = KW_STREAMTABLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:204:15: ( 'STREAMTABLE' )
            // HiveLexerParent.g:204:17: 'STREAMTABLE'
            {
            match("STREAMTABLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STREAMTABLE"

    // $ANTLR start "KW_CLUSTERSTATUS"
    public final void mKW_CLUSTERSTATUS() throws RecognitionException {
        try {
            int _type = KW_CLUSTERSTATUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:205:17: ( 'CLUSTERSTATUS' )
            // HiveLexerParent.g:205:19: 'CLUSTERSTATUS'
            {
            match("CLUSTERSTATUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CLUSTERSTATUS"

    // $ANTLR start "KW_UTC"
    public final void mKW_UTC() throws RecognitionException {
        try {
            int _type = KW_UTC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:206:7: ( 'UTC' )
            // HiveLexerParent.g:206:9: 'UTC'
            {
            match("UTC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UTC"

    // $ANTLR start "KW_UTCTIMESTAMP"
    public final void mKW_UTCTIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_UTCTIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:207:16: ( 'UTC_TMESTAMP' )
            // HiveLexerParent.g:207:18: 'UTC_TMESTAMP'
            {
            match("UTC_TMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UTCTIMESTAMP"

    // $ANTLR start "KW_LONG"
    public final void mKW_LONG() throws RecognitionException {
        try {
            int _type = KW_LONG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:208:8: ( 'LONG' )
            // HiveLexerParent.g:208:10: 'LONG'
            {
            match("LONG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LONG"

    // $ANTLR start "KW_DELETE"
    public final void mKW_DELETE() throws RecognitionException {
        try {
            int _type = KW_DELETE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:209:10: ( 'DELETE' )
            // HiveLexerParent.g:209:12: 'DELETE'
            {
            match("DELETE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DELETE"

    // $ANTLR start "KW_PLUS"
    public final void mKW_PLUS() throws RecognitionException {
        try {
            int _type = KW_PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:210:8: ( 'PLUS' )
            // HiveLexerParent.g:210:10: 'PLUS'
            {
            match("PLUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PLUS"

    // $ANTLR start "KW_MINUS"
    public final void mKW_MINUS() throws RecognitionException {
        try {
            int _type = KW_MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:211:9: ( 'MINUS' )
            // HiveLexerParent.g:211:11: 'MINUS'
            {
            match("MINUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MINUS"

    // $ANTLR start "KW_FETCH"
    public final void mKW_FETCH() throws RecognitionException {
        try {
            int _type = KW_FETCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:212:9: ( 'FETCH' )
            // HiveLexerParent.g:212:11: 'FETCH'
            {
            match("FETCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FETCH"

    // $ANTLR start "KW_INTERSECT"
    public final void mKW_INTERSECT() throws RecognitionException {
        try {
            int _type = KW_INTERSECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:213:13: ( 'INTERSECT' )
            // HiveLexerParent.g:213:15: 'INTERSECT'
            {
            match("INTERSECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INTERSECT"

    // $ANTLR start "KW_VIEW"
    public final void mKW_VIEW() throws RecognitionException {
        try {
            int _type = KW_VIEW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:214:8: ( 'VIEW' )
            // HiveLexerParent.g:214:10: 'VIEW'
            {
            match("VIEW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VIEW"

    // $ANTLR start "KW_VIEWS"
    public final void mKW_VIEWS() throws RecognitionException {
        try {
            int _type = KW_VIEWS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:215:9: ( 'VIEWS' )
            // HiveLexerParent.g:215:11: 'VIEWS'
            {
            match("VIEWS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VIEWS"

    // $ANTLR start "KW_IN"
    public final void mKW_IN() throws RecognitionException {
        try {
            int _type = KW_IN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:216:6: ( 'IN' )
            // HiveLexerParent.g:216:8: 'IN'
            {
            match("IN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IN"

    // $ANTLR start "KW_DATABASE"
    public final void mKW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:217:12: ( 'DATABASE' )
            // HiveLexerParent.g:217:14: 'DATABASE'
            {
            match("DATABASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATABASE"

    // $ANTLR start "KW_DATABASES"
    public final void mKW_DATABASES() throws RecognitionException {
        try {
            int _type = KW_DATABASES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:218:13: ( 'DATABASES' )
            // HiveLexerParent.g:218:15: 'DATABASES'
            {
            match("DATABASES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATABASES"

    // $ANTLR start "KW_MATERIALIZED"
    public final void mKW_MATERIALIZED() throws RecognitionException {
        try {
            int _type = KW_MATERIALIZED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:219:16: ( 'MATERIALIZED' )
            // HiveLexerParent.g:219:18: 'MATERIALIZED'
            {
            match("MATERIALIZED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MATERIALIZED"

    // $ANTLR start "KW_SCHEMA"
    public final void mKW_SCHEMA() throws RecognitionException {
        try {
            int _type = KW_SCHEMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:220:10: ( 'SCHEMA' )
            // HiveLexerParent.g:220:12: 'SCHEMA'
            {
            match("SCHEMA"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEMA"

    // $ANTLR start "KW_SCHEMAS"
    public final void mKW_SCHEMAS() throws RecognitionException {
        try {
            int _type = KW_SCHEMAS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:221:11: ( 'SCHEMAS' )
            // HiveLexerParent.g:221:13: 'SCHEMAS'
            {
            match("SCHEMAS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEMAS"

    // $ANTLR start "KW_GRANT"
    public final void mKW_GRANT() throws RecognitionException {
        try {
            int _type = KW_GRANT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:222:9: ( 'GRANT' )
            // HiveLexerParent.g:222:11: 'GRANT'
            {
            match("GRANT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GRANT"

    // $ANTLR start "KW_REVOKE"
    public final void mKW_REVOKE() throws RecognitionException {
        try {
            int _type = KW_REVOKE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:223:10: ( 'REVOKE' )
            // HiveLexerParent.g:223:12: 'REVOKE'
            {
            match("REVOKE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REVOKE"

    // $ANTLR start "KW_SSL"
    public final void mKW_SSL() throws RecognitionException {
        try {
            int _type = KW_SSL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:224:7: ( 'SSL' )
            // HiveLexerParent.g:224:9: 'SSL'
            {
            match("SSL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SSL"

    // $ANTLR start "KW_UNDO"
    public final void mKW_UNDO() throws RecognitionException {
        try {
            int _type = KW_UNDO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:225:8: ( 'UNDO' )
            // HiveLexerParent.g:225:10: 'UNDO'
            {
            match("UNDO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNDO"

    // $ANTLR start "KW_LOCK"
    public final void mKW_LOCK() throws RecognitionException {
        try {
            int _type = KW_LOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:226:8: ( 'LOCK' )
            // HiveLexerParent.g:226:10: 'LOCK'
            {
            match("LOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCK"

    // $ANTLR start "KW_LOCKS"
    public final void mKW_LOCKS() throws RecognitionException {
        try {
            int _type = KW_LOCKS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:227:9: ( 'LOCKS' )
            // HiveLexerParent.g:227:11: 'LOCKS'
            {
            match("LOCKS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LOCKS"

    // $ANTLR start "KW_UNLOCK"
    public final void mKW_UNLOCK() throws RecognitionException {
        try {
            int _type = KW_UNLOCK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:228:10: ( 'UNLOCK' )
            // HiveLexerParent.g:228:12: 'UNLOCK'
            {
            match("UNLOCK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNLOCK"

    // $ANTLR start "KW_SHARED"
    public final void mKW_SHARED() throws RecognitionException {
        try {
            int _type = KW_SHARED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:229:10: ( 'SHARED' )
            // HiveLexerParent.g:229:12: 'SHARED'
            {
            match("SHARED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHARED"

    // $ANTLR start "KW_EXCLUSIVE"
    public final void mKW_EXCLUSIVE() throws RecognitionException {
        try {
            int _type = KW_EXCLUSIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:230:13: ( 'EXCLUSIVE' )
            // HiveLexerParent.g:230:15: 'EXCLUSIVE'
            {
            match("EXCLUSIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCLUSIVE"

    // $ANTLR start "KW_PROCEDURE"
    public final void mKW_PROCEDURE() throws RecognitionException {
        try {
            int _type = KW_PROCEDURE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:231:13: ( 'PROCEDURE' )
            // HiveLexerParent.g:231:15: 'PROCEDURE'
            {
            match("PROCEDURE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PROCEDURE"

    // $ANTLR start "KW_UNSIGNED"
    public final void mKW_UNSIGNED() throws RecognitionException {
        try {
            int _type = KW_UNSIGNED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:232:12: ( 'UNSIGNED' )
            // HiveLexerParent.g:232:14: 'UNSIGNED'
            {
            match("UNSIGNED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNSIGNED"

    // $ANTLR start "KW_WHILE"
    public final void mKW_WHILE() throws RecognitionException {
        try {
            int _type = KW_WHILE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:233:9: ( 'WHILE' )
            // HiveLexerParent.g:233:11: 'WHILE'
            {
            match("WHILE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WHILE"

    // $ANTLR start "KW_READ"
    public final void mKW_READ() throws RecognitionException {
        try {
            int _type = KW_READ;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:234:8: ( 'READ' )
            // HiveLexerParent.g:234:10: 'READ'
            {
            match("READ"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READ"

    // $ANTLR start "KW_READS"
    public final void mKW_READS() throws RecognitionException {
        try {
            int _type = KW_READS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:235:9: ( 'READS' )
            // HiveLexerParent.g:235:11: 'READS'
            {
            match("READS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_READS"

    // $ANTLR start "KW_PURGE"
    public final void mKW_PURGE() throws RecognitionException {
        try {
            int _type = KW_PURGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:236:9: ( 'PURGE' )
            // HiveLexerParent.g:236:11: 'PURGE'
            {
            match("PURGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PURGE"

    // $ANTLR start "KW_RANGE"
    public final void mKW_RANGE() throws RecognitionException {
        try {
            int _type = KW_RANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:237:9: ( 'RANGE' )
            // HiveLexerParent.g:237:11: 'RANGE'
            {
            match("RANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RANGE"

    // $ANTLR start "KW_ANALYZE"
    public final void mKW_ANALYZE() throws RecognitionException {
        try {
            int _type = KW_ANALYZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:238:11: ( 'ANALYZE' )
            // HiveLexerParent.g:238:13: 'ANALYZE'
            {
            match("ANALYZE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ANALYZE"

    // $ANTLR start "KW_BEFORE"
    public final void mKW_BEFORE() throws RecognitionException {
        try {
            int _type = KW_BEFORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:239:10: ( 'BEFORE' )
            // HiveLexerParent.g:239:12: 'BEFORE'
            {
            match("BEFORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BEFORE"

    // $ANTLR start "KW_BETWEEN"
    public final void mKW_BETWEEN() throws RecognitionException {
        try {
            int _type = KW_BETWEEN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:240:11: ( 'BETWEEN' )
            // HiveLexerParent.g:240:13: 'BETWEEN'
            {
            match("BETWEEN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BETWEEN"

    // $ANTLR start "KW_BOTH"
    public final void mKW_BOTH() throws RecognitionException {
        try {
            int _type = KW_BOTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:241:8: ( 'BOTH' )
            // HiveLexerParent.g:241:10: 'BOTH'
            {
            match("BOTH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BOTH"

    // $ANTLR start "KW_BINARY"
    public final void mKW_BINARY() throws RecognitionException {
        try {
            int _type = KW_BINARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:242:10: ( 'BINARY' )
            // HiveLexerParent.g:242:12: 'BINARY'
            {
            match("BINARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BINARY"

    // $ANTLR start "KW_CROSS"
    public final void mKW_CROSS() throws RecognitionException {
        try {
            int _type = KW_CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:243:9: ( 'CROSS' )
            // HiveLexerParent.g:243:11: 'CROSS'
            {
            match("CROSS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CROSS"

    // $ANTLR start "KW_CONTINUE"
    public final void mKW_CONTINUE() throws RecognitionException {
        try {
            int _type = KW_CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:244:12: ( 'CONTINUE' )
            // HiveLexerParent.g:244:14: 'CONTINUE'
            {
            match("CONTINUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONTINUE"

    // $ANTLR start "KW_CONVERT"
    public final void mKW_CONVERT() throws RecognitionException {
        try {
            int _type = KW_CONVERT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:245:11: ( 'CONVERT' )
            // HiveLexerParent.g:245:13: 'CONVERT'
            {
            match("CONVERT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONVERT"

    // $ANTLR start "KW_CURSOR"
    public final void mKW_CURSOR() throws RecognitionException {
        try {
            int _type = KW_CURSOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:246:10: ( 'CURSOR' )
            // HiveLexerParent.g:246:12: 'CURSOR'
            {
            match("CURSOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURSOR"

    // $ANTLR start "KW_TRIGGER"
    public final void mKW_TRIGGER() throws RecognitionException {
        try {
            int _type = KW_TRIGGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:247:11: ( 'TRIGGER' )
            // HiveLexerParent.g:247:13: 'TRIGGER'
            {
            match("TRIGGER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRIGGER"

    // $ANTLR start "KW_RECORDREADER"
    public final void mKW_RECORDREADER() throws RecognitionException {
        try {
            int _type = KW_RECORDREADER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:248:16: ( 'RECORDREADER' )
            // HiveLexerParent.g:248:18: 'RECORDREADER'
            {
            match("RECORDREADER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RECORDREADER"

    // $ANTLR start "KW_RECORDWRITER"
    public final void mKW_RECORDWRITER() throws RecognitionException {
        try {
            int _type = KW_RECORDWRITER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:249:16: ( 'RECORDWRITER' )
            // HiveLexerParent.g:249:18: 'RECORDWRITER'
            {
            match("RECORDWRITER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RECORDWRITER"

    // $ANTLR start "KW_SEMI"
    public final void mKW_SEMI() throws RecognitionException {
        try {
            int _type = KW_SEMI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:250:8: ( 'SEMI' )
            // HiveLexerParent.g:250:10: 'SEMI'
            {
            match("SEMI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SEMI"

    // $ANTLR start "KW_LATERAL"
    public final void mKW_LATERAL() throws RecognitionException {
        try {
            int _type = KW_LATERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:251:11: ( 'LATERAL' )
            // HiveLexerParent.g:251:13: 'LATERAL'
            {
            match("LATERAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LATERAL"

    // $ANTLR start "KW_TOUCH"
    public final void mKW_TOUCH() throws RecognitionException {
        try {
            int _type = KW_TOUCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:252:9: ( 'TOUCH' )
            // HiveLexerParent.g:252:11: 'TOUCH'
            {
            match("TOUCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TOUCH"

    // $ANTLR start "KW_ARCHIVE"
    public final void mKW_ARCHIVE() throws RecognitionException {
        try {
            int _type = KW_ARCHIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:253:11: ( 'ARCHIVE' )
            // HiveLexerParent.g:253:13: 'ARCHIVE'
            {
            match("ARCHIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ARCHIVE"

    // $ANTLR start "KW_UNARCHIVE"
    public final void mKW_UNARCHIVE() throws RecognitionException {
        try {
            int _type = KW_UNARCHIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:254:13: ( 'UNARCHIVE' )
            // HiveLexerParent.g:254:15: 'UNARCHIVE'
            {
            match("UNARCHIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNARCHIVE"

    // $ANTLR start "KW_COMPUTE"
    public final void mKW_COMPUTE() throws RecognitionException {
        try {
            int _type = KW_COMPUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:255:11: ( 'COMPUTE' )
            // HiveLexerParent.g:255:13: 'COMPUTE'
            {
            match("COMPUTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPUTE"

    // $ANTLR start "KW_STATISTICS"
    public final void mKW_STATISTICS() throws RecognitionException {
        try {
            int _type = KW_STATISTICS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:256:14: ( 'STATISTICS' )
            // HiveLexerParent.g:256:16: 'STATISTICS'
            {
            match("STATISTICS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STATISTICS"

    // $ANTLR start "KW_USE"
    public final void mKW_USE() throws RecognitionException {
        try {
            int _type = KW_USE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:257:7: ( 'USE' )
            // HiveLexerParent.g:257:9: 'USE'
            {
            match("USE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USE"

    // $ANTLR start "KW_OPTION"
    public final void mKW_OPTION() throws RecognitionException {
        try {
            int _type = KW_OPTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:258:10: ( 'OPTION' )
            // HiveLexerParent.g:258:12: 'OPTION'
            {
            match("OPTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OPTION"

    // $ANTLR start "KW_CONCATENATE"
    public final void mKW_CONCATENATE() throws RecognitionException {
        try {
            int _type = KW_CONCATENATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:259:15: ( 'CONCATENATE' )
            // HiveLexerParent.g:259:17: 'CONCATENATE'
            {
            match("CONCATENATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONCATENATE"

    // $ANTLR start "KW_SHOW_DATABASE"
    public final void mKW_SHOW_DATABASE() throws RecognitionException {
        try {
            int _type = KW_SHOW_DATABASE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:260:17: ( 'SHOW_DATABASE' )
            // HiveLexerParent.g:260:19: 'SHOW_DATABASE'
            {
            match("SHOW_DATABASE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SHOW_DATABASE"

    // $ANTLR start "KW_UPDATE"
    public final void mKW_UPDATE() throws RecognitionException {
        try {
            int _type = KW_UPDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:261:10: ( 'UPDATE' )
            // HiveLexerParent.g:261:12: 'UPDATE'
            {
            match("UPDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UPDATE"

    // $ANTLR start "KW_RESTRICT"
    public final void mKW_RESTRICT() throws RecognitionException {
        try {
            int _type = KW_RESTRICT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:262:12: ( 'RESTRICT' )
            // HiveLexerParent.g:262:14: 'RESTRICT'
            {
            match("RESTRICT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RESTRICT"

    // $ANTLR start "KW_CASCADE"
    public final void mKW_CASCADE() throws RecognitionException {
        try {
            int _type = KW_CASCADE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:263:11: ( 'CASCADE' )
            // HiveLexerParent.g:263:13: 'CASCADE'
            {
            match("CASCADE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CASCADE"

    // $ANTLR start "KW_SKEWED"
    public final void mKW_SKEWED() throws RecognitionException {
        try {
            int _type = KW_SKEWED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:264:10: ( 'SKEWED' )
            // HiveLexerParent.g:264:12: 'SKEWED'
            {
            match("SKEWED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SKEWED"

    // $ANTLR start "KW_ROLLUP"
    public final void mKW_ROLLUP() throws RecognitionException {
        try {
            int _type = KW_ROLLUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:265:10: ( 'ROLLUP' )
            // HiveLexerParent.g:265:12: 'ROLLUP'
            {
            match("ROLLUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLLUP"

    // $ANTLR start "KW_CUBE"
    public final void mKW_CUBE() throws RecognitionException {
        try {
            int _type = KW_CUBE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:266:8: ( 'CUBE' )
            // HiveLexerParent.g:266:10: 'CUBE'
            {
            match("CUBE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CUBE"

    // $ANTLR start "KW_DIRECTORIES"
    public final void mKW_DIRECTORIES() throws RecognitionException {
        try {
            int _type = KW_DIRECTORIES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:267:15: ( 'DIRECTORIES' )
            // HiveLexerParent.g:267:17: 'DIRECTORIES'
            {
            match("DIRECTORIES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DIRECTORIES"

    // $ANTLR start "KW_FOR"
    public final void mKW_FOR() throws RecognitionException {
        try {
            int _type = KW_FOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:268:7: ( 'FOR' )
            // HiveLexerParent.g:268:9: 'FOR'
            {
            match("FOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FOR"

    // $ANTLR start "KW_WINDOW"
    public final void mKW_WINDOW() throws RecognitionException {
        try {
            int _type = KW_WINDOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:269:10: ( 'WINDOW' )
            // HiveLexerParent.g:269:12: 'WINDOW'
            {
            match("WINDOW"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WINDOW"

    // $ANTLR start "KW_UNBOUNDED"
    public final void mKW_UNBOUNDED() throws RecognitionException {
        try {
            int _type = KW_UNBOUNDED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:270:13: ( 'UNBOUNDED' )
            // HiveLexerParent.g:270:15: 'UNBOUNDED'
            {
            match("UNBOUNDED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNBOUNDED"

    // $ANTLR start "KW_PRECEDING"
    public final void mKW_PRECEDING() throws RecognitionException {
        try {
            int _type = KW_PRECEDING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:271:13: ( 'PRECEDING' )
            // HiveLexerParent.g:271:15: 'PRECEDING'
            {
            match("PRECEDING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRECEDING"

    // $ANTLR start "KW_FOLLOWING"
    public final void mKW_FOLLOWING() throws RecognitionException {
        try {
            int _type = KW_FOLLOWING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:272:13: ( 'FOLLOWING' )
            // HiveLexerParent.g:272:15: 'FOLLOWING'
            {
            match("FOLLOWING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FOLLOWING"

    // $ANTLR start "KW_CURRENT"
    public final void mKW_CURRENT() throws RecognitionException {
        try {
            int _type = KW_CURRENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:273:11: ( 'CURRENT' )
            // HiveLexerParent.g:273:13: 'CURRENT'
            {
            match("CURRENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURRENT"

    // $ANTLR start "KW_CURRENT_DATE"
    public final void mKW_CURRENT_DATE() throws RecognitionException {
        try {
            int _type = KW_CURRENT_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:274:16: ( 'CURRENT_DATE' )
            // HiveLexerParent.g:274:18: 'CURRENT_DATE'
            {
            match("CURRENT_DATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURRENT_DATE"

    // $ANTLR start "KW_CURRENT_TIMESTAMP"
    public final void mKW_CURRENT_TIMESTAMP() throws RecognitionException {
        try {
            int _type = KW_CURRENT_TIMESTAMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:275:21: ( 'CURRENT_TIMESTAMP' )
            // HiveLexerParent.g:275:23: 'CURRENT_TIMESTAMP'
            {
            match("CURRENT_TIMESTAMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CURRENT_TIMESTAMP"

    // $ANTLR start "KW_LESS"
    public final void mKW_LESS() throws RecognitionException {
        try {
            int _type = KW_LESS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:276:8: ( 'LESS' )
            // HiveLexerParent.g:276:10: 'LESS'
            {
            match("LESS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LESS"

    // $ANTLR start "KW_MORE"
    public final void mKW_MORE() throws RecognitionException {
        try {
            int _type = KW_MORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:277:8: ( 'MORE' )
            // HiveLexerParent.g:277:10: 'MORE'
            {
            match("MORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MORE"

    // $ANTLR start "KW_OVER"
    public final void mKW_OVER() throws RecognitionException {
        try {
            int _type = KW_OVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:278:8: ( 'OVER' )
            // HiveLexerParent.g:278:10: 'OVER'
            {
            match("OVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OVER"

    // $ANTLR start "KW_GROUPING"
    public final void mKW_GROUPING() throws RecognitionException {
        try {
            int _type = KW_GROUPING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:279:12: ( 'GROUPING' )
            // HiveLexerParent.g:279:14: 'GROUPING'
            {
            match("GROUPING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_GROUPING"

    // $ANTLR start "KW_SETS"
    public final void mKW_SETS() throws RecognitionException {
        try {
            int _type = KW_SETS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:280:8: ( 'SETS' )
            // HiveLexerParent.g:280:10: 'SETS'
            {
            match("SETS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SETS"

    // $ANTLR start "KW_TRUNCATE"
    public final void mKW_TRUNCATE() throws RecognitionException {
        try {
            int _type = KW_TRUNCATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:281:12: ( 'TRUNCATE' )
            // HiveLexerParent.g:281:14: 'TRUNCATE'
            {
            match("TRUNCATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRUNCATE"

    // $ANTLR start "KW_NOSCAN"
    public final void mKW_NOSCAN() throws RecognitionException {
        try {
            int _type = KW_NOSCAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:282:10: ( 'NOSCAN' )
            // HiveLexerParent.g:282:12: 'NOSCAN'
            {
            match("NOSCAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOSCAN"

    // $ANTLR start "KW_USER"
    public final void mKW_USER() throws RecognitionException {
        try {
            int _type = KW_USER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:283:8: ( 'USER' )
            // HiveLexerParent.g:283:10: 'USER'
            {
            match("USER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_USER"

    // $ANTLR start "KW_ROLE"
    public final void mKW_ROLE() throws RecognitionException {
        try {
            int _type = KW_ROLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:284:8: ( 'ROLE' )
            // HiveLexerParent.g:284:10: 'ROLE'
            {
            match("ROLE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLE"

    // $ANTLR start "KW_ROLES"
    public final void mKW_ROLES() throws RecognitionException {
        try {
            int _type = KW_ROLES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:285:9: ( 'ROLES' )
            // HiveLexerParent.g:285:11: 'ROLES'
            {
            match("ROLES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLES"

    // $ANTLR start "KW_INNER"
    public final void mKW_INNER() throws RecognitionException {
        try {
            int _type = KW_INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:286:9: ( 'INNER' )
            // HiveLexerParent.g:286:11: 'INNER'
            {
            match("INNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_INNER"

    // $ANTLR start "KW_EXCHANGE"
    public final void mKW_EXCHANGE() throws RecognitionException {
        try {
            int _type = KW_EXCHANGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:287:12: ( 'EXCHANGE' )
            // HiveLexerParent.g:287:14: 'EXCHANGE'
            {
            match("EXCHANGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXCHANGE"

    // $ANTLR start "KW_URI"
    public final void mKW_URI() throws RecognitionException {
        try {
            int _type = KW_URI;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:288:7: ( 'URI' )
            // HiveLexerParent.g:288:9: 'URI'
            {
            match("URI"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_URI"

    // $ANTLR start "KW_SERVER"
    public final void mKW_SERVER() throws RecognitionException {
        try {
            int _type = KW_SERVER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:289:11: ( 'SERVER' )
            // HiveLexerParent.g:289:13: 'SERVER'
            {
            match("SERVER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SERVER"

    // $ANTLR start "KW_ADMIN"
    public final void mKW_ADMIN() throws RecognitionException {
        try {
            int _type = KW_ADMIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:290:9: ( 'ADMIN' )
            // HiveLexerParent.g:290:11: 'ADMIN'
            {
            match("ADMIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ADMIN"

    // $ANTLR start "KW_OWNER"
    public final void mKW_OWNER() throws RecognitionException {
        try {
            int _type = KW_OWNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:291:9: ( 'OWNER' )
            // HiveLexerParent.g:291:11: 'OWNER'
            {
            match("OWNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OWNER"

    // $ANTLR start "KW_PRINCIPALS"
    public final void mKW_PRINCIPALS() throws RecognitionException {
        try {
            int _type = KW_PRINCIPALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:292:14: ( 'PRINCIPALS' )
            // HiveLexerParent.g:292:16: 'PRINCIPALS'
            {
            match("PRINCIPALS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRINCIPALS"

    // $ANTLR start "KW_COMPACT"
    public final void mKW_COMPACT() throws RecognitionException {
        try {
            int _type = KW_COMPACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:293:11: ( 'COMPACT' )
            // HiveLexerParent.g:293:13: 'COMPACT'
            {
            match("COMPACT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPACT"

    // $ANTLR start "KW_COMPACTIONS"
    public final void mKW_COMPACTIONS() throws RecognitionException {
        try {
            int _type = KW_COMPACTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:294:15: ( 'COMPACTIONS' )
            // HiveLexerParent.g:294:17: 'COMPACTIONS'
            {
            match("COMPACTIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMPACTIONS"

    // $ANTLR start "KW_TRANSACTIONS"
    public final void mKW_TRANSACTIONS() throws RecognitionException {
        try {
            int _type = KW_TRANSACTIONS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:295:16: ( 'TRANSACTIONS' )
            // HiveLexerParent.g:295:18: 'TRANSACTIONS'
            {
            match("TRANSACTIONS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRANSACTIONS"

    // $ANTLR start "KW_TRANSACTIONAL"
    public final void mKW_TRANSACTIONAL() throws RecognitionException {
        try {
            int _type = KW_TRANSACTIONAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:296:17: ( 'TRANSACTIONAL' )
            // HiveLexerParent.g:296:19: 'TRANSACTIONAL'
            {
            match("TRANSACTIONAL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRANSACTIONAL"

    // $ANTLR start "KW_REWRITE"
    public final void mKW_REWRITE() throws RecognitionException {
        try {
            int _type = KW_REWRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:297:12: ( 'REWRITE' )
            // HiveLexerParent.g:297:14: 'REWRITE'
            {
            match("REWRITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REWRITE"

    // $ANTLR start "KW_AUTHORIZATION"
    public final void mKW_AUTHORIZATION() throws RecognitionException {
        try {
            int _type = KW_AUTHORIZATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:298:17: ( 'AUTHORIZATION' )
            // HiveLexerParent.g:298:19: 'AUTHORIZATION'
            {
            match("AUTHORIZATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AUTHORIZATION"

    // $ANTLR start "KW_REOPTIMIZATION"
    public final void mKW_REOPTIMIZATION() throws RecognitionException {
        try {
            int _type = KW_REOPTIMIZATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:299:18: ( 'REOPTIMIZATION' )
            // HiveLexerParent.g:299:20: 'REOPTIMIZATION'
            {
            match("REOPTIMIZATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REOPTIMIZATION"

    // $ANTLR start "KW_CONF"
    public final void mKW_CONF() throws RecognitionException {
        try {
            int _type = KW_CONF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:300:8: ( 'CONF' )
            // HiveLexerParent.g:300:10: 'CONF'
            {
            match("CONF"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONF"

    // $ANTLR start "KW_VALUES"
    public final void mKW_VALUES() throws RecognitionException {
        try {
            int _type = KW_VALUES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:301:10: ( 'VALUES' )
            // HiveLexerParent.g:301:12: 'VALUES'
            {
            match("VALUES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VALUES"

    // $ANTLR start "KW_RELOAD"
    public final void mKW_RELOAD() throws RecognitionException {
        try {
            int _type = KW_RELOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:302:10: ( 'RELOAD' )
            // HiveLexerParent.g:302:12: 'RELOAD'
            {
            match("RELOAD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RELOAD"

    // $ANTLR start "KW_YEAR"
    public final void mKW_YEAR() throws RecognitionException {
        try {
            int _type = KW_YEAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:303:8: ( 'YEAR' | 'YEARS' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='Y') ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1=='E') ) {
                    int LA6_2 = input.LA(3);

                    if ( (LA6_2=='A') ) {
                        int LA6_3 = input.LA(4);

                        if ( (LA6_3=='R') ) {
                            int LA6_4 = input.LA(5);

                            if ( (LA6_4=='S') ) {
                                alt6=2;
                            }
                            else {
                                alt6=1;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 6, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // HiveLexerParent.g:303:10: 'YEAR'
                    {
                    match("YEAR"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:303:19: 'YEARS'
                    {
                    match("YEARS"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_YEAR"

    // $ANTLR start "KW_QUERY"
    public final void mKW_QUERY() throws RecognitionException {
        try {
            int _type = KW_QUERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:304:9: ( 'QUERY' )
            // HiveLexerParent.g:304:11: 'QUERY'
            {
            match("QUERY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_QUERY"

    // $ANTLR start "KW_QUARTER"
    public final void mKW_QUARTER() throws RecognitionException {
        try {
            int _type = KW_QUARTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:305:11: ( 'QUARTER' )
            // HiveLexerParent.g:305:13: 'QUARTER'
            {
            match("QUARTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_QUARTER"

    // $ANTLR start "KW_MONTH"
    public final void mKW_MONTH() throws RecognitionException {
        try {
            int _type = KW_MONTH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:306:9: ( 'MONTH' | 'MONTHS' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='M') ) {
                int LA7_1 = input.LA(2);

                if ( (LA7_1=='O') ) {
                    int LA7_2 = input.LA(3);

                    if ( (LA7_2=='N') ) {
                        int LA7_3 = input.LA(4);

                        if ( (LA7_3=='T') ) {
                            int LA7_4 = input.LA(5);

                            if ( (LA7_4=='H') ) {
                                int LA7_5 = input.LA(6);

                                if ( (LA7_5=='S') ) {
                                    alt7=2;
                                }
                                else {
                                    alt7=1;
                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 7, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 7, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 7, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // HiveLexerParent.g:306:11: 'MONTH'
                    {
                    match("MONTH"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:306:21: 'MONTHS'
                    {
                    match("MONTHS"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MONTH"

    // $ANTLR start "KW_WEEK"
    public final void mKW_WEEK() throws RecognitionException {
        try {
            int _type = KW_WEEK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:307:8: ( 'WEEK' | 'WEEKS' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='W') ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1=='E') ) {
                    int LA8_2 = input.LA(3);

                    if ( (LA8_2=='E') ) {
                        int LA8_3 = input.LA(4);

                        if ( (LA8_3=='K') ) {
                            int LA8_4 = input.LA(5);

                            if ( (LA8_4=='S') ) {
                                alt8=2;
                            }
                            else {
                                alt8=1;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 8, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 8, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // HiveLexerParent.g:307:10: 'WEEK'
                    {
                    match("WEEK"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:307:19: 'WEEKS'
                    {
                    match("WEEKS"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WEEK"

    // $ANTLR start "KW_DAY"
    public final void mKW_DAY() throws RecognitionException {
        try {
            int _type = KW_DAY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:308:7: ( 'DAY' | 'DAYS' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='D') ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1=='A') ) {
                    int LA9_2 = input.LA(3);

                    if ( (LA9_2=='Y') ) {
                        int LA9_3 = input.LA(4);

                        if ( (LA9_3=='S') ) {
                            alt9=2;
                        }
                        else {
                            alt9=1;
                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // HiveLexerParent.g:308:9: 'DAY'
                    {
                    match("DAY"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:308:17: 'DAYS'
                    {
                    match("DAYS"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DAY"

    // $ANTLR start "KW_DOW"
    public final void mKW_DOW() throws RecognitionException {
        try {
            int _type = KW_DOW;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:309:7: ( 'DAYOFWEEK' )
            // HiveLexerParent.g:309:9: 'DAYOFWEEK'
            {
            match("DAYOFWEEK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DOW"

    // $ANTLR start "KW_HOUR"
    public final void mKW_HOUR() throws RecognitionException {
        try {
            int _type = KW_HOUR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:310:8: ( 'HOUR' | 'HOURS' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='H') ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1=='O') ) {
                    int LA10_2 = input.LA(3);

                    if ( (LA10_2=='U') ) {
                        int LA10_3 = input.LA(4);

                        if ( (LA10_3=='R') ) {
                            int LA10_4 = input.LA(5);

                            if ( (LA10_4=='S') ) {
                                alt10=2;
                            }
                            else {
                                alt10=1;
                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 10, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // HiveLexerParent.g:310:10: 'HOUR'
                    {
                    match("HOUR"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:310:19: 'HOURS'
                    {
                    match("HOURS"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_HOUR"

    // $ANTLR start "KW_MINUTE"
    public final void mKW_MINUTE() throws RecognitionException {
        try {
            int _type = KW_MINUTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:311:10: ( 'MINUTE' | 'MINUTES' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='M') ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1=='I') ) {
                    int LA11_2 = input.LA(3);

                    if ( (LA11_2=='N') ) {
                        int LA11_3 = input.LA(4);

                        if ( (LA11_3=='U') ) {
                            int LA11_4 = input.LA(5);

                            if ( (LA11_4=='T') ) {
                                int LA11_5 = input.LA(6);

                                if ( (LA11_5=='E') ) {
                                    int LA11_6 = input.LA(7);

                                    if ( (LA11_6=='S') ) {
                                        alt11=2;
                                    }
                                    else {
                                        alt11=1;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 11, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 11, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 11, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 11, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 11, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // HiveLexerParent.g:311:12: 'MINUTE'
                    {
                    match("MINUTE"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:311:23: 'MINUTES'
                    {
                    match("MINUTES"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MINUTE"

    // $ANTLR start "KW_SECOND"
    public final void mKW_SECOND() throws RecognitionException {
        try {
            int _type = KW_SECOND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:312:10: ( 'SECOND' | 'SECONDS' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='S') ) {
                int LA12_1 = input.LA(2);

                if ( (LA12_1=='E') ) {
                    int LA12_2 = input.LA(3);

                    if ( (LA12_2=='C') ) {
                        int LA12_3 = input.LA(4);

                        if ( (LA12_3=='O') ) {
                            int LA12_4 = input.LA(5);

                            if ( (LA12_4=='N') ) {
                                int LA12_5 = input.LA(6);

                                if ( (LA12_5=='D') ) {
                                    int LA12_6 = input.LA(7);

                                    if ( (LA12_6=='S') ) {
                                        alt12=2;
                                    }
                                    else {
                                        alt12=1;
                                    }
                                }
                                else {
                                    NoViableAltException nvae =
                                        new NoViableAltException("", 12, 5, input);

                                    throw nvae;

                                }
                            }
                            else {
                                NoViableAltException nvae =
                                    new NoViableAltException("", 12, 4, input);

                                throw nvae;

                            }
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 12, 3, input);

                            throw nvae;

                        }
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 2, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 12, 1, input);

                    throw nvae;

                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // HiveLexerParent.g:312:12: 'SECOND'
                    {
                    match("SECOND"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:312:23: 'SECONDS'
                    {
                    match("SECONDS"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SECOND"

    // $ANTLR start "KW_START"
    public final void mKW_START() throws RecognitionException {
        try {
            int _type = KW_START;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:313:9: ( 'START' )
            // HiveLexerParent.g:313:11: 'START'
            {
            match("START"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_START"

    // $ANTLR start "KW_TRANSACTION"
    public final void mKW_TRANSACTION() throws RecognitionException {
        try {
            int _type = KW_TRANSACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:314:15: ( 'TRANSACTION' )
            // HiveLexerParent.g:314:17: 'TRANSACTION'
            {
            match("TRANSACTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRANSACTION"

    // $ANTLR start "KW_COMMIT"
    public final void mKW_COMMIT() throws RecognitionException {
        try {
            int _type = KW_COMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:315:10: ( 'COMMIT' )
            // HiveLexerParent.g:315:12: 'COMMIT'
            {
            match("COMMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COMMIT"

    // $ANTLR start "KW_ROLLBACK"
    public final void mKW_ROLLBACK() throws RecognitionException {
        try {
            int _type = KW_ROLLBACK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:316:12: ( 'ROLLBACK' )
            // HiveLexerParent.g:316:14: 'ROLLBACK'
            {
            match("ROLLBACK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ROLLBACK"

    // $ANTLR start "KW_WORK"
    public final void mKW_WORK() throws RecognitionException {
        try {
            int _type = KW_WORK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:317:8: ( 'WORK' )
            // HiveLexerParent.g:317:10: 'WORK'
            {
            match("WORK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WORK"

    // $ANTLR start "KW_ONLY"
    public final void mKW_ONLY() throws RecognitionException {
        try {
            int _type = KW_ONLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:318:8: ( 'ONLY' )
            // HiveLexerParent.g:318:10: 'ONLY'
            {
            match("ONLY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ONLY"

    // $ANTLR start "KW_WRITE"
    public final void mKW_WRITE() throws RecognitionException {
        try {
            int _type = KW_WRITE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:319:9: ( 'WRITE' )
            // HiveLexerParent.g:319:11: 'WRITE'
            {
            match("WRITE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WRITE"

    // $ANTLR start "KW_ISOLATION"
    public final void mKW_ISOLATION() throws RecognitionException {
        try {
            int _type = KW_ISOLATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:320:13: ( 'ISOLATION' )
            // HiveLexerParent.g:320:15: 'ISOLATION'
            {
            match("ISOLATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ISOLATION"

    // $ANTLR start "KW_LEVEL"
    public final void mKW_LEVEL() throws RecognitionException {
        try {
            int _type = KW_LEVEL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:321:9: ( 'LEVEL' )
            // HiveLexerParent.g:321:11: 'LEVEL'
            {
            match("LEVEL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LEVEL"

    // $ANTLR start "KW_SNAPSHOT"
    public final void mKW_SNAPSHOT() throws RecognitionException {
        try {
            int _type = KW_SNAPSHOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:322:12: ( 'SNAPSHOT' )
            // HiveLexerParent.g:322:14: 'SNAPSHOT'
            {
            match("SNAPSHOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SNAPSHOT"

    // $ANTLR start "KW_AUTOCOMMIT"
    public final void mKW_AUTOCOMMIT() throws RecognitionException {
        try {
            int _type = KW_AUTOCOMMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:323:14: ( 'AUTOCOMMIT' )
            // HiveLexerParent.g:323:16: 'AUTOCOMMIT'
            {
            match("AUTOCOMMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AUTOCOMMIT"

    // $ANTLR start "KW_CACHE"
    public final void mKW_CACHE() throws RecognitionException {
        try {
            int _type = KW_CACHE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:324:9: ( 'CACHE' )
            // HiveLexerParent.g:324:11: 'CACHE'
            {
            match("CACHE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CACHE"

    // $ANTLR start "KW_PRIMARY"
    public final void mKW_PRIMARY() throws RecognitionException {
        try {
            int _type = KW_PRIMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:325:11: ( 'PRIMARY' )
            // HiveLexerParent.g:325:13: 'PRIMARY'
            {
            match("PRIMARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PRIMARY"

    // $ANTLR start "KW_FOREIGN"
    public final void mKW_FOREIGN() throws RecognitionException {
        try {
            int _type = KW_FOREIGN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:326:11: ( 'FOREIGN' )
            // HiveLexerParent.g:326:13: 'FOREIGN'
            {
            match("FOREIGN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FOREIGN"

    // $ANTLR start "KW_REFERENCES"
    public final void mKW_REFERENCES() throws RecognitionException {
        try {
            int _type = KW_REFERENCES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:327:14: ( 'REFERENCES' )
            // HiveLexerParent.g:327:16: 'REFERENCES'
            {
            match("REFERENCES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REFERENCES"

    // $ANTLR start "KW_CONSTRAINT"
    public final void mKW_CONSTRAINT() throws RecognitionException {
        try {
            int _type = KW_CONSTRAINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:328:14: ( 'CONSTRAINT' )
            // HiveLexerParent.g:328:16: 'CONSTRAINT'
            {
            match("CONSTRAINT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CONSTRAINT"

    // $ANTLR start "KW_FORCE"
    public final void mKW_FORCE() throws RecognitionException {
        try {
            int _type = KW_FORCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:329:9: ( 'FORCE' )
            // HiveLexerParent.g:329:11: 'FORCE'
            {
            match("FORCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FORCE"

    // $ANTLR start "KW_ENFORCED"
    public final void mKW_ENFORCED() throws RecognitionException {
        try {
            int _type = KW_ENFORCED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:330:12: ( 'ENFORCED' )
            // HiveLexerParent.g:330:14: 'ENFORCED'
            {
            match("ENFORCED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ENFORCED"

    // $ANTLR start "KW_VALIDATE"
    public final void mKW_VALIDATE() throws RecognitionException {
        try {
            int _type = KW_VALIDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:331:12: ( 'VALIDATE' )
            // HiveLexerParent.g:331:14: 'VALIDATE'
            {
            match("VALIDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VALIDATE"

    // $ANTLR start "KW_NOVALIDATE"
    public final void mKW_NOVALIDATE() throws RecognitionException {
        try {
            int _type = KW_NOVALIDATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:332:14: ( 'NOVALIDATE' )
            // HiveLexerParent.g:332:16: 'NOVALIDATE'
            {
            match("NOVALIDATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NOVALIDATE"

    // $ANTLR start "KW_RELY"
    public final void mKW_RELY() throws RecognitionException {
        try {
            int _type = KW_RELY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:333:8: ( 'RELY' )
            // HiveLexerParent.g:333:10: 'RELY'
            {
            match("RELY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RELY"

    // $ANTLR start "KW_NORELY"
    public final void mKW_NORELY() throws RecognitionException {
        try {
            int _type = KW_NORELY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:334:10: ( 'NORELY' )
            // HiveLexerParent.g:334:12: 'NORELY'
            {
            match("NORELY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_NORELY"

    // $ANTLR start "KW_UNIQUE"
    public final void mKW_UNIQUE() throws RecognitionException {
        try {
            int _type = KW_UNIQUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:335:10: ( 'UNIQUE' )
            // HiveLexerParent.g:335:12: 'UNIQUE'
            {
            match("UNIQUE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNIQUE"

    // $ANTLR start "KW_KEY"
    public final void mKW_KEY() throws RecognitionException {
        try {
            int _type = KW_KEY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:336:7: ( 'KEY' )
            // HiveLexerParent.g:336:9: 'KEY'
            {
            match("KEY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_KEY"

    // $ANTLR start "KW_ABORT"
    public final void mKW_ABORT() throws RecognitionException {
        try {
            int _type = KW_ABORT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:337:9: ( 'ABORT' )
            // HiveLexerParent.g:337:11: 'ABORT'
            {
            match("ABORT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ABORT"

    // $ANTLR start "KW_EXTRACT"
    public final void mKW_EXTRACT() throws RecognitionException {
        try {
            int _type = KW_EXTRACT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:338:11: ( 'EXTRACT' )
            // HiveLexerParent.g:338:13: 'EXTRACT'
            {
            match("EXTRACT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXTRACT"

    // $ANTLR start "KW_FLOOR"
    public final void mKW_FLOOR() throws RecognitionException {
        try {
            int _type = KW_FLOOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:339:9: ( 'FLOOR' )
            // HiveLexerParent.g:339:11: 'FLOOR'
            {
            match("FLOOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FLOOR"

    // $ANTLR start "KW_MERGE"
    public final void mKW_MERGE() throws RecognitionException {
        try {
            int _type = KW_MERGE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:340:9: ( 'MERGE' )
            // HiveLexerParent.g:340:11: 'MERGE'
            {
            match("MERGE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MERGE"

    // $ANTLR start "KW_MATCHED"
    public final void mKW_MATCHED() throws RecognitionException {
        try {
            int _type = KW_MATCHED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:341:11: ( 'MATCHED' )
            // HiveLexerParent.g:341:13: 'MATCHED'
            {
            match("MATCHED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MATCHED"

    // $ANTLR start "KW_REPL"
    public final void mKW_REPL() throws RecognitionException {
        try {
            int _type = KW_REPL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:342:8: ( 'REPL' )
            // HiveLexerParent.g:342:10: 'REPL'
            {
            match("REPL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REPL"

    // $ANTLR start "KW_DUMP"
    public final void mKW_DUMP() throws RecognitionException {
        try {
            int _type = KW_DUMP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:343:8: ( 'DUMP' )
            // HiveLexerParent.g:343:10: 'DUMP'
            {
            match("DUMP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DUMP"

    // $ANTLR start "KW_STATUS"
    public final void mKW_STATUS() throws RecognitionException {
        try {
            int _type = KW_STATUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:344:10: ( 'STATUS' )
            // HiveLexerParent.g:344:12: 'STATUS'
            {
            match("STATUS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_STATUS"

    // $ANTLR start "KW_VECTORIZATION"
    public final void mKW_VECTORIZATION() throws RecognitionException {
        try {
            int _type = KW_VECTORIZATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:345:17: ( 'VECTORIZATION' )
            // HiveLexerParent.g:345:19: 'VECTORIZATION'
            {
            match("VECTORIZATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_VECTORIZATION"

    // $ANTLR start "KW_SUMMARY"
    public final void mKW_SUMMARY() throws RecognitionException {
        try {
            int _type = KW_SUMMARY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:346:11: ( 'SUMMARY' )
            // HiveLexerParent.g:346:13: 'SUMMARY'
            {
            match("SUMMARY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SUMMARY"

    // $ANTLR start "KW_OPERATOR"
    public final void mKW_OPERATOR() throws RecognitionException {
        try {
            int _type = KW_OPERATOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:347:12: ( 'OPERATOR' )
            // HiveLexerParent.g:347:14: 'OPERATOR'
            {
            match("OPERATOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OPERATOR"

    // $ANTLR start "KW_EXPRESSION"
    public final void mKW_EXPRESSION() throws RecognitionException {
        try {
            int _type = KW_EXPRESSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:348:14: ( 'EXPRESSION' )
            // HiveLexerParent.g:348:16: 'EXPRESSION'
            {
            match("EXPRESSION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPRESSION"

    // $ANTLR start "KW_DETAIL"
    public final void mKW_DETAIL() throws RecognitionException {
        try {
            int _type = KW_DETAIL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:349:10: ( 'DETAIL' )
            // HiveLexerParent.g:349:12: 'DETAIL'
            {
            match("DETAIL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DETAIL"

    // $ANTLR start "KW_WAIT"
    public final void mKW_WAIT() throws RecognitionException {
        try {
            int _type = KW_WAIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:350:8: ( 'WAIT' )
            // HiveLexerParent.g:350:10: 'WAIT'
            {
            match("WAIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WAIT"

    // $ANTLR start "KW_RESOURCE"
    public final void mKW_RESOURCE() throws RecognitionException {
        try {
            int _type = KW_RESOURCE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:351:12: ( 'RESOURCE' )
            // HiveLexerParent.g:351:14: 'RESOURCE'
            {
            match("RESOURCE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RESOURCE"

    // $ANTLR start "KW_PLAN"
    public final void mKW_PLAN() throws RecognitionException {
        try {
            int _type = KW_PLAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:352:8: ( 'PLAN' )
            // HiveLexerParent.g:352:10: 'PLAN'
            {
            match("PLAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PLAN"

    // $ANTLR start "KW_QUERY_PARALLELISM"
    public final void mKW_QUERY_PARALLELISM() throws RecognitionException {
        try {
            int _type = KW_QUERY_PARALLELISM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:353:21: ( 'QUERY_PARALLELISM' )
            // HiveLexerParent.g:353:23: 'QUERY_PARALLELISM'
            {
            match("QUERY_PARALLELISM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_QUERY_PARALLELISM"

    // $ANTLR start "KW_PLANS"
    public final void mKW_PLANS() throws RecognitionException {
        try {
            int _type = KW_PLANS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:354:9: ( 'PLANS' )
            // HiveLexerParent.g:354:11: 'PLANS'
            {
            match("PLANS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PLANS"

    // $ANTLR start "KW_ACTIVATE"
    public final void mKW_ACTIVATE() throws RecognitionException {
        try {
            int _type = KW_ACTIVATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:355:12: ( 'ACTIVATE' )
            // HiveLexerParent.g:355:14: 'ACTIVATE'
            {
            match("ACTIVATE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ACTIVATE"

    // $ANTLR start "KW_DEFAULT"
    public final void mKW_DEFAULT() throws RecognitionException {
        try {
            int _type = KW_DEFAULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:356:11: ( 'DEFAULT' )
            // HiveLexerParent.g:356:13: 'DEFAULT'
            {
            match("DEFAULT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DEFAULT"

    // $ANTLR start "KW_CHECK"
    public final void mKW_CHECK() throws RecognitionException {
        try {
            int _type = KW_CHECK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:357:9: ( 'CHECK' )
            // HiveLexerParent.g:357:11: 'CHECK'
            {
            match("CHECK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CHECK"

    // $ANTLR start "KW_POOL"
    public final void mKW_POOL() throws RecognitionException {
        try {
            int _type = KW_POOL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:358:8: ( 'POOL' )
            // HiveLexerParent.g:358:10: 'POOL'
            {
            match("POOL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_POOL"

    // $ANTLR start "KW_MOVE"
    public final void mKW_MOVE() throws RecognitionException {
        try {
            int _type = KW_MOVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:359:8: ( 'MOVE' )
            // HiveLexerParent.g:359:10: 'MOVE'
            {
            match("MOVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MOVE"

    // $ANTLR start "KW_DO"
    public final void mKW_DO() throws RecognitionException {
        try {
            int _type = KW_DO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:360:6: ( 'DO' )
            // HiveLexerParent.g:360:8: 'DO'
            {
            match("DO"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DO"

    // $ANTLR start "KW_ALLOC_FRACTION"
    public final void mKW_ALLOC_FRACTION() throws RecognitionException {
        try {
            int _type = KW_ALLOC_FRACTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:361:18: ( 'ALLOC_FRACTION' )
            // HiveLexerParent.g:361:20: 'ALLOC_FRACTION'
            {
            match("ALLOC_FRACTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ALLOC_FRACTION"

    // $ANTLR start "KW_SCHEDULING_POLICY"
    public final void mKW_SCHEDULING_POLICY() throws RecognitionException {
        try {
            int _type = KW_SCHEDULING_POLICY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:362:21: ( 'SCHEDULING_POLICY' )
            // HiveLexerParent.g:362:23: 'SCHEDULING_POLICY'
            {
            match("SCHEDULING_POLICY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEDULING_POLICY"

    // $ANTLR start "KW_SCHEDULED"
    public final void mKW_SCHEDULED() throws RecognitionException {
        try {
            int _type = KW_SCHEDULED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:363:13: ( 'SCHEDULED' )
            // HiveLexerParent.g:363:15: 'SCHEDULED'
            {
            match("SCHEDULED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SCHEDULED"

    // $ANTLR start "KW_EVERY"
    public final void mKW_EVERY() throws RecognitionException {
        try {
            int _type = KW_EVERY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:364:9: ( 'EVERY' )
            // HiveLexerParent.g:364:11: 'EVERY'
            {
            match("EVERY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EVERY"

    // $ANTLR start "KW_AT"
    public final void mKW_AT() throws RecognitionException {
        try {
            int _type = KW_AT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:365:6: ( 'AT' )
            // HiveLexerParent.g:365:8: 'AT'
            {
            match("AT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AT"

    // $ANTLR start "KW_CRON"
    public final void mKW_CRON() throws RecognitionException {
        try {
            int _type = KW_CRON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:366:8: ( 'CRON' )
            // HiveLexerParent.g:366:10: 'CRON'
            {
            match("CRON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CRON"

    // $ANTLR start "KW_PATH"
    public final void mKW_PATH() throws RecognitionException {
        try {
            int _type = KW_PATH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:367:8: ( 'PATH' )
            // HiveLexerParent.g:367:10: 'PATH'
            {
            match("PATH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PATH"

    // $ANTLR start "KW_MAPPING"
    public final void mKW_MAPPING() throws RecognitionException {
        try {
            int _type = KW_MAPPING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:368:11: ( 'MAPPING' )
            // HiveLexerParent.g:368:13: 'MAPPING'
            {
            match("MAPPING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MAPPING"

    // $ANTLR start "KW_WORKLOAD"
    public final void mKW_WORKLOAD() throws RecognitionException {
        try {
            int _type = KW_WORKLOAD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:369:12: ( 'WORKLOAD' )
            // HiveLexerParent.g:369:14: 'WORKLOAD'
            {
            match("WORKLOAD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WORKLOAD"

    // $ANTLR start "KW_MANAGEMENT"
    public final void mKW_MANAGEMENT() throws RecognitionException {
        try {
            int _type = KW_MANAGEMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:370:14: ( 'MANAGEMENT' )
            // HiveLexerParent.g:370:16: 'MANAGEMENT'
            {
            match("MANAGEMENT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_MANAGEMENT"

    // $ANTLR start "KW_ACTIVE"
    public final void mKW_ACTIVE() throws RecognitionException {
        try {
            int _type = KW_ACTIVE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:371:10: ( 'ACTIVE' )
            // HiveLexerParent.g:371:12: 'ACTIVE'
            {
            match("ACTIVE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ACTIVE"

    // $ANTLR start "KW_UNMANAGED"
    public final void mKW_UNMANAGED() throws RecognitionException {
        try {
            int _type = KW_UNMANAGED;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:372:13: ( 'UNMANAGED' )
            // HiveLexerParent.g:372:15: 'UNMANAGED'
            {
            match("UNMANAGED"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_UNMANAGED"

    // $ANTLR start "KW_APPLICATION"
    public final void mKW_APPLICATION() throws RecognitionException {
        try {
            int _type = KW_APPLICATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:373:15: ( 'APPLICATION' )
            // HiveLexerParent.g:373:17: 'APPLICATION'
            {
            match("APPLICATION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_APPLICATION"

    // $ANTLR start "KW_SYNC"
    public final void mKW_SYNC() throws RecognitionException {
        try {
            int _type = KW_SYNC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:374:8: ( 'SYNC' )
            // HiveLexerParent.g:374:10: 'SYNC'
            {
            match("SYNC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SYNC"

    // $ANTLR start "KW_AST"
    public final void mKW_AST() throws RecognitionException {
        try {
            int _type = KW_AST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:375:7: ( 'AST' )
            // HiveLexerParent.g:375:9: 'AST'
            {
            match("AST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_AST"

    // $ANTLR start "KW_COST"
    public final void mKW_COST() throws RecognitionException {
        try {
            int _type = KW_COST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:376:8: ( 'COST' )
            // HiveLexerParent.g:376:10: 'COST'
            {
            match("COST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_COST"

    // $ANTLR start "KW_JOINCOST"
    public final void mKW_JOINCOST() throws RecognitionException {
        try {
            int _type = KW_JOINCOST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:377:12: ( 'JOINCOST' )
            // HiveLexerParent.g:377:14: 'JOINCOST'
            {
            match("JOINCOST"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_JOINCOST"

    // $ANTLR start "KW_WITHIN"
    public final void mKW_WITHIN() throws RecognitionException {
        try {
            int _type = KW_WITHIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:378:10: ( 'WITHIN' )
            // HiveLexerParent.g:378:12: 'WITHIN'
            {
            match("WITHIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_WITHIN"

    // $ANTLR start "KW_PKFK_JOIN"
    public final void mKW_PKFK_JOIN() throws RecognitionException {
        try {
            int _type = KW_PKFK_JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:379:13: ( 'PKFK_JOIN' )
            // HiveLexerParent.g:379:15: 'PKFK_JOIN'
            {
            match("PKFK_JOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_PKFK_JOIN"

    // $ANTLR start "KW_LEADING"
    public final void mKW_LEADING() throws RecognitionException {
        try {
            int _type = KW_LEADING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:380:11: ( 'LEADING' )
            // HiveLexerParent.g:380:13: 'LEADING'
            {
            match("LEADING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_LEADING"

    // $ANTLR start "KW_TRAILING"
    public final void mKW_TRAILING() throws RecognitionException {
        try {
            int _type = KW_TRAILING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:381:12: ( 'TRAILING' )
            // HiveLexerParent.g:381:14: 'TRAILING'
            {
            match("TRAILING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRAILING"

    // $ANTLR start "KW_TRIM"
    public final void mKW_TRIM() throws RecognitionException {
        try {
            int _type = KW_TRIM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:382:8: ( 'TRIM' )
            // HiveLexerParent.g:382:10: 'TRIM'
            {
            match("TRIM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TRIM"

    // $ANTLR start "KW_IGNORE"
    public final void mKW_IGNORE() throws RecognitionException {
        try {
            int _type = KW_IGNORE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:383:10: ( 'IGNORE' )
            // HiveLexerParent.g:383:12: 'IGNORE'
            {
            match("IGNORE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_IGNORE"

    // $ANTLR start "KW_RESPECT"
    public final void mKW_RESPECT() throws RecognitionException {
        try {
            int _type = KW_RESPECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:384:11: ( 'RESPECT' )
            // HiveLexerParent.g:384:13: 'RESPECT'
            {
            match("RESPECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RESPECT"

    // $ANTLR start "KW_DATACONNECTOR"
    public final void mKW_DATACONNECTOR() throws RecognitionException {
        try {
            int _type = KW_DATACONNECTOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:385:17: ( 'CONNECTOR' )
            // HiveLexerParent.g:385:19: 'CONNECTOR'
            {
            match("CONNECTOR"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATACONNECTOR"

    // $ANTLR start "KW_DATACONNECTORS"
    public final void mKW_DATACONNECTORS() throws RecognitionException {
        try {
            int _type = KW_DATACONNECTORS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:386:18: ( 'CONNECTORS' )
            // HiveLexerParent.g:386:20: 'CONNECTORS'
            {
            match("CONNECTORS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_DATACONNECTORS"

    // $ANTLR start "KW_TYPE"
    public final void mKW_TYPE() throws RecognitionException {
        try {
            int _type = KW_TYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:387:8: ( 'TYPE' )
            // HiveLexerParent.g:387:10: 'TYPE'
            {
            match("TYPE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TYPE"

    // $ANTLR start "KW_URL"
    public final void mKW_URL() throws RecognitionException {
        try {
            int _type = KW_URL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:388:7: ( 'URL' )
            // HiveLexerParent.g:388:9: 'URL'
            {
            match("URL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_URL"

    // $ANTLR start "KW_REMOTE"
    public final void mKW_REMOTE() throws RecognitionException {
        try {
            int _type = KW_REMOTE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:389:10: ( 'REMOTE' )
            // HiveLexerParent.g:389:12: 'REMOTE'
            {
            match("REMOTE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_REMOTE"

    // $ANTLR start "KW_SPEC"
    public final void mKW_SPEC() throws RecognitionException {
        try {
            int _type = KW_SPEC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:390:8: ( 'SPEC' )
            // HiveLexerParent.g:390:10: 'SPEC'
            {
            match("SPEC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SPEC"

    // $ANTLR start "KW_SYSTEM_TIME"
    public final void mKW_SYSTEM_TIME() throws RecognitionException {
        try {
            int _type = KW_SYSTEM_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:391:15: ( 'SYSTEM_TIME' )
            // HiveLexerParent.g:391:17: 'SYSTEM_TIME'
            {
            match("SYSTEM_TIME"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SYSTEM_TIME"

    // $ANTLR start "KW_SYSTEM_VERSION"
    public final void mKW_SYSTEM_VERSION() throws RecognitionException {
        try {
            int _type = KW_SYSTEM_VERSION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:392:18: ( 'SYSTEM_VERSION' )
            // HiveLexerParent.g:392:20: 'SYSTEM_VERSION'
            {
            match("SYSTEM_VERSION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SYSTEM_VERSION"

    // $ANTLR start "KW_EXPIRE_SNAPSHOTS"
    public final void mKW_EXPIRE_SNAPSHOTS() throws RecognitionException {
        try {
            int _type = KW_EXPIRE_SNAPSHOTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:393:20: ( 'EXPIRE_SNAPSHOTS' )
            // HiveLexerParent.g:393:22: 'EXPIRE_SNAPSHOTS'
            {
            match("EXPIRE_SNAPSHOTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_EXPIRE_SNAPSHOTS"

    // $ANTLR start "KW_SET_CURRENT_SNAPSHOT"
    public final void mKW_SET_CURRENT_SNAPSHOT() throws RecognitionException {
        try {
            int _type = KW_SET_CURRENT_SNAPSHOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:394:24: ( 'SET_CURRENT_SNAPSHOT' )
            // HiveLexerParent.g:394:26: 'SET_CURRENT_SNAPSHOT'
            {
            match("SET_CURRENT_SNAPSHOT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SET_CURRENT_SNAPSHOT"

    // $ANTLR start "KW_BRANCH"
    public final void mKW_BRANCH() throws RecognitionException {
        try {
            int _type = KW_BRANCH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:395:10: ( 'BRANCH' )
            // HiveLexerParent.g:395:12: 'BRANCH'
            {
            match("BRANCH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_BRANCH"

    // $ANTLR start "KW_SNAPSHOTS"
    public final void mKW_SNAPSHOTS() throws RecognitionException {
        try {
            int _type = KW_SNAPSHOTS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:396:13: ( 'SNAPSHOTS' )
            // HiveLexerParent.g:396:15: 'SNAPSHOTS'
            {
            match("SNAPSHOTS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_SNAPSHOTS"

    // $ANTLR start "KW_RETAIN"
    public final void mKW_RETAIN() throws RecognitionException {
        try {
            int _type = KW_RETAIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:397:10: ( 'RETAIN' )
            // HiveLexerParent.g:397:12: 'RETAIN'
            {
            match("RETAIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RETAIN"

    // $ANTLR start "KW_RETENTION"
    public final void mKW_RETENTION() throws RecognitionException {
        try {
            int _type = KW_RETENTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:398:13: ( 'RETENTION' )
            // HiveLexerParent.g:398:15: 'RETENTION'
            {
            match("RETENTION"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_RETENTION"

    // $ANTLR start "KW_TAG"
    public final void mKW_TAG() throws RecognitionException {
        try {
            int _type = KW_TAG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:399:7: ( 'TAG' )
            // HiveLexerParent.g:399:9: 'TAG'
            {
            match("TAG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_TAG"

    // $ANTLR start "KW_FAST_FORWARD"
    public final void mKW_FAST_FORWARD() throws RecognitionException {
        try {
            int _type = KW_FAST_FORWARD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:400:16: ( 'FAST-FORWARD' )
            // HiveLexerParent.g:400:18: 'FAST-FORWARD'
            {
            match("FAST-FORWARD"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_FAST_FORWARD"

    // $ANTLR start "KW_CHERRY_PICK"
    public final void mKW_CHERRY_PICK() throws RecognitionException {
        try {
            int _type = KW_CHERRY_PICK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:401:15: ( 'CHERRY-PICK' )
            // HiveLexerParent.g:401:17: 'CHERRY-PICK'
            {
            match("CHERRY-PICK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_CHERRY_PICK"

    // $ANTLR start "KW_ORPHAN_FILES"
    public final void mKW_ORPHAN_FILES() throws RecognitionException {
        try {
            int _type = KW_ORPHAN_FILES;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:402:16: ( 'ORPHAN-FILES' )
            // HiveLexerParent.g:402:18: 'ORPHAN-FILES'
            {
            match("ORPHAN-FILES"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_ORPHAN_FILES"

    // $ANTLR start "KW_OLDER"
    public final void mKW_OLDER() throws RecognitionException {
        try {
            int _type = KW_OLDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:403:9: ( 'OLDER' )
            // HiveLexerParent.g:403:11: 'OLDER'
            {
            match("OLDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OLDER"

    // $ANTLR start "KW_THAN"
    public final void mKW_THAN() throws RecognitionException {
        try {
            int _type = KW_THAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:404:8: ( 'THAN' )
            // HiveLexerParent.g:404:10: 'THAN'
            {
            match("THAN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_THAN"

    // $ANTLR start "KW_OPTIMIZE"
    public final void mKW_OPTIMIZE() throws RecognitionException {
        try {
            int _type = KW_OPTIMIZE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:405:12: ( 'OPTIMIZE' )
            // HiveLexerParent.g:405:14: 'OPTIMIZE'
            {
            match("OPTIMIZE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "KW_OPTIMIZE"

    // $ANTLR start "DOT"
    public final void mDOT() throws RecognitionException {
        try {
            int _type = DOT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:410:5: ( '.' )
            // HiveLexerParent.g:410:7: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOT"

    // $ANTLR start "COLON"
    public final void mCOLON() throws RecognitionException {
        try {
            int _type = COLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:411:7: ( ':' )
            // HiveLexerParent.g:411:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COLON"

    // $ANTLR start "COMMA"
    public final void mCOMMA() throws RecognitionException {
        try {
            int _type = COMMA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:412:7: ( ',' )
            // HiveLexerParent.g:412:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMA"

    // $ANTLR start "SEMICOLON"
    public final void mSEMICOLON() throws RecognitionException {
        try {
            int _type = SEMICOLON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:413:11: ( ';' )
            // HiveLexerParent.g:413:13: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SEMICOLON"

    // $ANTLR start "LPAREN"
    public final void mLPAREN() throws RecognitionException {
        try {
            int _type = LPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:415:8: ( '(' )
            // HiveLexerParent.g:415:10: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LPAREN"

    // $ANTLR start "RPAREN"
    public final void mRPAREN() throws RecognitionException {
        try {
            int _type = RPAREN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:416:8: ( ')' )
            // HiveLexerParent.g:416:10: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RPAREN"

    // $ANTLR start "LSQUARE"
    public final void mLSQUARE() throws RecognitionException {
        try {
            int _type = LSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:417:9: ( '[' )
            // HiveLexerParent.g:417:11: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LSQUARE"

    // $ANTLR start "RSQUARE"
    public final void mRSQUARE() throws RecognitionException {
        try {
            int _type = RSQUARE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:418:9: ( ']' )
            // HiveLexerParent.g:418:11: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RSQUARE"

    // $ANTLR start "LCURLY"
    public final void mLCURLY() throws RecognitionException {
        try {
            int _type = LCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:419:8: ( '{' )
            // HiveLexerParent.g:419:10: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LCURLY"

    // $ANTLR start "RCURLY"
    public final void mRCURLY() throws RecognitionException {
        try {
            int _type = RCURLY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:420:8: ( '}' )
            // HiveLexerParent.g:420:10: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RCURLY"

    // $ANTLR start "EQUAL"
    public final void mEQUAL() throws RecognitionException {
        try {
            int _type = EQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:422:7: ( '=' | '==' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='=') ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1=='=') ) {
                    alt13=2;
                }
                else {
                    alt13=1;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // HiveLexerParent.g:422:9: '='
                    {
                    match('='); 

                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:422:15: '=='
                    {
                    match("=="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL"

    // $ANTLR start "EQUAL_NS"
    public final void mEQUAL_NS() throws RecognitionException {
        try {
            int _type = EQUAL_NS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:423:10: ( '<=>' )
            // HiveLexerParent.g:423:12: '<=>'
            {
            match("<=>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EQUAL_NS"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:424:10: ( '<>' | '!=' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='<') ) {
                alt14=1;
            }
            else if ( (LA14_0=='!') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // HiveLexerParent.g:424:12: '<>'
                    {
                    match("<>"); 



                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:424:19: '!='
                    {
                    match("!="); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "LESSTHANOREQUALTO"
    public final void mLESSTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = LESSTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:425:19: ( '<=' )
            // HiveLexerParent.g:425:21: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHANOREQUALTO"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:426:10: ( '<' )
            // HiveLexerParent.g:426:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "GREATERTHANOREQUALTO"
    public final void mGREATERTHANOREQUALTO() throws RecognitionException {
        try {
            int _type = GREATERTHANOREQUALTO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:427:22: ( '>=' )
            // HiveLexerParent.g:427:24: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHANOREQUALTO"

    // $ANTLR start "GREATERTHAN"
    public final void mGREATERTHAN() throws RecognitionException {
        try {
            int _type = GREATERTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:428:13: ( '>' )
            // HiveLexerParent.g:428:15: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GREATERTHAN"

    // $ANTLR start "DIVIDE"
    public final void mDIVIDE() throws RecognitionException {
        try {
            int _type = DIVIDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:430:8: ( '/' )
            // HiveLexerParent.g:430:10: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIVIDE"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:431:6: ( '+' )
            // HiveLexerParent.g:431:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:432:7: ( '-' )
            // HiveLexerParent.g:432:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "STAR"
    public final void mSTAR() throws RecognitionException {
        try {
            int _type = STAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:433:6: ( '*' )
            // HiveLexerParent.g:433:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STAR"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:434:5: ( '%' )
            // HiveLexerParent.g:434:7: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:435:5: ( 'DIV' )
            // HiveLexerParent.g:435:7: 'DIV'
            {
            match("DIV"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "AMPERSAND"
    public final void mAMPERSAND() throws RecognitionException {
        try {
            int _type = AMPERSAND;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:437:11: ( '&' )
            // HiveLexerParent.g:437:13: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AMPERSAND"

    // $ANTLR start "TILDE"
    public final void mTILDE() throws RecognitionException {
        try {
            int _type = TILDE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:438:7: ( '~' )
            // HiveLexerParent.g:438:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TILDE"

    // $ANTLR start "BITWISEOR"
    public final void mBITWISEOR() throws RecognitionException {
        try {
            int _type = BITWISEOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:439:11: ( '|' )
            // HiveLexerParent.g:439:13: '|'
            {
            match('|'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISEOR"

    // $ANTLR start "CONCATENATE"
    public final void mCONCATENATE() throws RecognitionException {
        try {
            int _type = CONCATENATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:440:13: ( '||' )
            // HiveLexerParent.g:440:15: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONCATENATE"

    // $ANTLR start "BITWISEXOR"
    public final void mBITWISEXOR() throws RecognitionException {
        try {
            int _type = BITWISEXOR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:441:12: ( '^' )
            // HiveLexerParent.g:441:14: '^'
            {
            match('^'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BITWISEXOR"

    // $ANTLR start "QUESTION"
    public final void mQUESTION() throws RecognitionException {
        try {
            int _type = QUESTION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:442:10: ( '?' )
            // HiveLexerParent.g:442:12: '?'
            {
            match('?'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUESTION"

    // $ANTLR start "DOLLAR"
    public final void mDOLLAR() throws RecognitionException {
        try {
            int _type = DOLLAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:443:8: ( '$' )
            // HiveLexerParent.g:443:10: '$'
            {
            match('$'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOLLAR"

    // $ANTLR start "Letter"
    public final void mLetter() throws RecognitionException {
        try {
            // HiveLexerParent.g:448:5: ( 'a' .. 'z' | 'A' .. 'Z' )
            // HiveLexerParent.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Letter"

    // $ANTLR start "HexDigit"
    public final void mHexDigit() throws RecognitionException {
        try {
            // HiveLexerParent.g:453:5: ( 'a' .. 'f' | 'A' .. 'F' )
            // HiveLexerParent.g:
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HexDigit"

    // $ANTLR start "Digit"
    public final void mDigit() throws RecognitionException {
        try {
            // HiveLexerParent.g:458:5: ( '0' .. '9' )
            // HiveLexerParent.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Digit"

    // $ANTLR start "Exponent"
    public final void mExponent() throws RecognitionException {
        try {
            // HiveLexerParent.g:464:5: ( ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+ )
            // HiveLexerParent.g:465:5: ( 'e' | 'E' ) ( PLUS | MINUS )? ( Digit )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // HiveLexerParent.g:465:17: ( PLUS | MINUS )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='+'||LA15_0=='-') ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // HiveLexerParent.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // HiveLexerParent.g:465:33: ( Digit )+
            int cnt16=0;
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( ((LA16_0 >= '0' && LA16_0 <= '9')) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // HiveLexerParent.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt16 >= 1 ) break loop16;
                        EarlyExitException eee =
                            new EarlyExitException(16, input);
                        throw eee;
                }
                cnt16++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Exponent"

    // $ANTLR start "RegexComponent"
    public final void mRegexComponent() throws RecognitionException {
        try {
            // HiveLexerParent.g:470:5: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | PLUS | STAR | QUESTION | MINUS | DOT | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | BITWISEXOR | BITWISEOR | DOLLAR | '!' )
            // HiveLexerParent.g:
            {
            if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RegexComponent"

    // $ANTLR start "StringLiteral"
    public final void mStringLiteral() throws RecognitionException {
        try {
            int _type = StringLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:477:5: ()
            // HiveLexerParent.g:479:5: 
            {
            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringLiteral"

    // $ANTLR start "CharSetLiteral"
    public final void mCharSetLiteral() throws RecognitionException {
        try {
            int _type = CharSetLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:482:5: ( StringLiteral | '0' 'X' ( HexDigit | Digit )+ )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='0') ) {
                alt18=2;
            }
            else {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // HiveLexerParent.g:483:5: StringLiteral
                    {
                    mStringLiteral(); 


                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:484:7: '0' 'X' ( HexDigit | Digit )+
                    {
                    match('0'); 

                    match('X'); 

                    // HiveLexerParent.g:484:15: ( HexDigit | Digit )+
                    int cnt17=0;
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( ((LA17_0 >= '0' && LA17_0 <= '9')||(LA17_0 >= 'A' && LA17_0 <= 'F')||(LA17_0 >= 'a' && LA17_0 <= 'f')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // HiveLexerParent.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt17 >= 1 ) break loop17;
                                EarlyExitException eee =
                                    new EarlyExitException(17, input);
                                throw eee;
                        }
                        cnt17++;
                    } while (true);


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharSetLiteral"

    // $ANTLR start "IntegralLiteral"
    public final void mIntegralLiteral() throws RecognitionException {
        try {
            int _type = IntegralLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:488:5: ( ( Digit )+ ( 'L' | 'S' | 'Y' ) )
            // HiveLexerParent.g:489:5: ( Digit )+ ( 'L' | 'S' | 'Y' )
            {
            // HiveLexerParent.g:489:5: ( Digit )+
            int cnt19=0;
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0 >= '0' && LA19_0 <= '9')) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // HiveLexerParent.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt19 >= 1 ) break loop19;
                        EarlyExitException eee =
                            new EarlyExitException(19, input);
                        throw eee;
                }
                cnt19++;
            } while (true);


            if ( input.LA(1)=='L'||input.LA(1)=='S'||input.LA(1)=='Y' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "IntegralLiteral"

    // $ANTLR start "NumberLiteral"
    public final void mNumberLiteral() throws RecognitionException {
        try {
            int _type = NumberLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:493:5: ( Number ( 'D' | 'B' 'D' ) )
            // HiveLexerParent.g:494:5: Number ( 'D' | 'B' 'D' )
            {
            mNumber(); 


            // HiveLexerParent.g:494:12: ( 'D' | 'B' 'D' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='D') ) {
                alt20=1;
            }
            else if ( (LA20_0=='B') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // HiveLexerParent.g:494:13: 'D'
                    {
                    match('D'); 

                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:494:19: 'B' 'D'
                    {
                    match('B'); 

                    match('D'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NumberLiteral"

    // $ANTLR start "ByteLengthLiteral"
    public final void mByteLengthLiteral() throws RecognitionException {
        try {
            int _type = ByteLengthLiteral;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:498:5: ( ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' ) )
            // HiveLexerParent.g:499:5: ( Digit )+ ( 'b' | 'B' | 'k' | 'K' | 'm' | 'M' | 'g' | 'G' )
            {
            // HiveLexerParent.g:499:5: ( Digit )+
            int cnt21=0;
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( ((LA21_0 >= '0' && LA21_0 <= '9')) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // HiveLexerParent.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt21 >= 1 ) break loop21;
                        EarlyExitException eee =
                            new EarlyExitException(21, input);
                        throw eee;
                }
                cnt21++;
            } while (true);


            if ( input.LA(1)=='B'||input.LA(1)=='G'||input.LA(1)=='K'||input.LA(1)=='M'||input.LA(1)=='b'||input.LA(1)=='g'||input.LA(1)=='k'||input.LA(1)=='m' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ByteLengthLiteral"

    // $ANTLR start "Number"
    public final void mNumber() throws RecognitionException {
        try {
            int _type = Number;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:503:5: ( ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )? )
            // HiveLexerParent.g:504:5: ( Digit )+ ( DOT ( Digit )* ( Exponent )? | Exponent )?
            {
            // HiveLexerParent.g:504:5: ( Digit )+
            int cnt22=0;
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0 >= '0' && LA22_0 <= '9')) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // HiveLexerParent.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt22 >= 1 ) break loop22;
                        EarlyExitException eee =
                            new EarlyExitException(22, input);
                        throw eee;
                }
                cnt22++;
            } while (true);


            // HiveLexerParent.g:504:14: ( DOT ( Digit )* ( Exponent )? | Exponent )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='.') ) {
                alt25=1;
            }
            else if ( (LA25_0=='E'||LA25_0=='e') ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // HiveLexerParent.g:504:16: DOT ( Digit )* ( Exponent )?
                    {
                    mDOT(); 


                    // HiveLexerParent.g:504:20: ( Digit )*
                    loop23:
                    do {
                        int alt23=2;
                        int LA23_0 = input.LA(1);

                        if ( ((LA23_0 >= '0' && LA23_0 <= '9')) ) {
                            alt23=1;
                        }


                        switch (alt23) {
                    	case 1 :
                    	    // HiveLexerParent.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop23;
                        }
                    } while (true);


                    // HiveLexerParent.g:504:29: ( Exponent )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0=='E'||LA24_0=='e') ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // HiveLexerParent.g:504:30: Exponent
                            {
                            mExponent(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:504:43: Exponent
                    {
                    mExponent(); 


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Number"

    // $ANTLR start "Identifier"
    public final void mIdentifier() throws RecognitionException {
        try {
            int _type = Identifier;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:529:5: ( ( Letter | Digit ) ( Letter | Digit | '_' )* |{...}? QuotedIdentifier | '`' ( RegexComponent )+ '`' )
            int alt28=3;
            switch ( input.LA(1) ) {
            case '0':
            case '1':
            case '2':
            case '3':
            case '4':
            case '5':
            case '6':
            case '7':
            case '8':
            case '9':
            case 'A':
            case 'B':
            case 'C':
            case 'D':
            case 'E':
            case 'F':
            case 'G':
            case 'H':
            case 'I':
            case 'J':
            case 'K':
            case 'L':
            case 'M':
            case 'N':
            case 'O':
            case 'P':
            case 'Q':
            case 'R':
            case 'S':
            case 'T':
            case 'U':
            case 'V':
            case 'W':
            case 'X':
            case 'Y':
            case 'Z':
            case 'a':
            case 'b':
            case 'c':
            case 'd':
            case 'e':
            case 'f':
            case 'g':
            case 'h':
            case 'i':
            case 'j':
            case 'k':
            case 'l':
            case 'm':
            case 'n':
            case 'o':
            case 'p':
            case 'q':
            case 'r':
            case 's':
            case 't':
            case 'u':
            case 'v':
            case 'w':
            case 'x':
            case 'y':
            case 'z':
                {
                alt28=1;
                }
                break;
            case '`':
                {
                alt28=3;
                }
                break;
            default:
                alt28=2;
            }

            switch (alt28) {
                case 1 :
                    // HiveLexerParent.g:530:5: ( Letter | Digit ) ( Letter | Digit | '_' )*
                    {
                    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    // HiveLexerParent.g:530:22: ( Letter | Digit | '_' )*
                    loop26:
                    do {
                        int alt26=2;
                        int LA26_0 = input.LA(1);

                        if ( ((LA26_0 >= '0' && LA26_0 <= '9')||(LA26_0 >= 'A' && LA26_0 <= 'Z')||LA26_0=='_'||(LA26_0 >= 'a' && LA26_0 <= 'z')) ) {
                            alt26=1;
                        }


                        switch (alt26) {
                    	case 1 :
                    	    // HiveLexerParent.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop26;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // HiveLexerParent.g:531:7: {...}? QuotedIdentifier
                    {
//                    if ( !((allowQuotedId() != Quotation.NONE)) ) {
//                        throw new FailedPredicateException(input, "Identifier", "allowQuotedId() != Quotation.NONE");
//                    }

                    mQuotedIdentifier(); 


                    }
                    break;
                case 3 :
                    // HiveLexerParent.g:532:7: '`' ( RegexComponent )+ '`'
                    {
                    match('`'); 

                    // HiveLexerParent.g:532:11: ( RegexComponent )+
                    int cnt27=0;
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0=='!'||LA27_0=='$'||(LA27_0 >= '(' && LA27_0 <= '+')||(LA27_0 >= '-' && LA27_0 <= '.')||(LA27_0 >= '0' && LA27_0 <= '9')||LA27_0=='?'||(LA27_0 >= 'A' && LA27_0 <= '[')||(LA27_0 >= ']' && LA27_0 <= '_')||(LA27_0 >= 'a' && LA27_0 <= '}')) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // HiveLexerParent.g:
                    	    {
                    	    if ( input.LA(1)=='!'||input.LA(1)=='$'||(input.LA(1) >= '(' && input.LA(1) <= '+')||(input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= '9')||input.LA(1)=='?'||(input.LA(1) >= 'A' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '_')||(input.LA(1) >= 'a' && input.LA(1) <= '}') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt27 >= 1 ) break loop27;
                                EarlyExitException eee =
                                    new EarlyExitException(27, input);
                                throw eee;
                        }
                        cnt27++;
                    } while (true);


                    match('`'); 

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "Identifier"

    // $ANTLR start "QuotedIdentifier"
    public final void mQuotedIdentifier() throws RecognitionException {
        try {
            // HiveLexerParent.g:537:5: ()
            // HiveLexerParent.g:539:5: 
            {
            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QuotedIdentifier"

    // $ANTLR start "CharSetName"
    public final void mCharSetName() throws RecognitionException {
        try {
            int _type = CharSetName;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:542:5: ( '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+ )
            // HiveLexerParent.g:543:5: '_' ( Letter | Digit | '_' | '-' | '.' | ':' )+
            {
            match('_'); 

            // HiveLexerParent.g:543:9: ( Letter | Digit | '_' | '-' | '.' | ':' )+
            int cnt29=0;
            loop29:
            do {
                int alt29=2;
                int LA29_0 = input.LA(1);

                if ( ((LA29_0 >= '-' && LA29_0 <= '.')||(LA29_0 >= '0' && LA29_0 <= ':')||(LA29_0 >= 'A' && LA29_0 <= 'Z')||LA29_0=='_'||(LA29_0 >= 'a' && LA29_0 <= 'z')) ) {
                    alt29=1;
                }


                switch (alt29) {
            	case 1 :
            	    // HiveLexerParent.g:
            	    {
            	    if ( (input.LA(1) >= '-' && input.LA(1) <= '.')||(input.LA(1) >= '0' && input.LA(1) <= ':')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt29 >= 1 ) break loop29;
                        EarlyExitException eee =
                            new EarlyExitException(29, input);
                        throw eee;
                }
                cnt29++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CharSetName"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:546:5: ( ( ' ' | '\\r' | '\\t' | '\\n' ) )
            // HiveLexerParent.g:546:8: ( ' ' | '\\r' | '\\t' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:550:5: ( '--' (~ ( '\\n' | '\\r' ) )* )
            // HiveLexerParent.g:550:7: '--' (~ ( '\\n' | '\\r' ) )*
            {
            match("--"); 



            // HiveLexerParent.g:550:12: (~ ( '\\n' | '\\r' ) )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= '\u0000' && LA30_0 <= '\t')||(LA30_0 >= '\u000B' && LA30_0 <= '\f')||(LA30_0 >= '\u000E' && LA30_0 <= '\uFFFF')) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // HiveLexerParent.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    // $ANTLR start "QUERY_HINT"
    public final void mQUERY_HINT() throws RecognitionException {
        try {
            int _type = QUERY_HINT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // HiveLexerParent.g:554:5: ( '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/' )
            // HiveLexerParent.g:554:7: '/*' ( options {greedy=false; } : QUERY_HINT | . )* '*/'
            {
            match("/*"); 



            // HiveLexerParent.g:554:12: ( options {greedy=false; } : QUERY_HINT | . )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='*') ) {
                    int LA31_1 = input.LA(2);

                    if ( (LA31_1=='/') ) {
                        alt31=3;
                    }
                    else if ( ((LA31_1 >= '\u0000' && LA31_1 <= '.')||(LA31_1 >= '0' && LA31_1 <= '\uFFFF')) ) {
                        alt31=2;
                    }


                }
                else if ( (LA31_0=='/') ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2=='*') ) {
                        alt31=1;
                    }
                    else if ( ((LA31_2 >= '\u0000' && LA31_2 <= ')')||(LA31_2 >= '+' && LA31_2 <= '\uFFFF')) ) {
                        alt31=2;
                    }


                }
                else if ( ((LA31_0 >= '\u0000' && LA31_0 <= ')')||(LA31_0 >= '+' && LA31_0 <= '.')||(LA31_0 >= '0' && LA31_0 <= '\uFFFF')) ) {
                    alt31=2;
                }


                switch (alt31) {
            	case 1 :
            	    // HiveLexerParent.g:554:41: QUERY_HINT
            	    {
            	    mQUERY_HINT(); 


            	    }
            	    break;
            	case 2 :
            	    // HiveLexerParent.g:554:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            match("*/"); 



             if(getText().charAt(2) != '+') { _channel=HIDDEN; } else { setText(getText().substring(3, getText().length() - 2)); } 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "QUERY_HINT"

    public void mTokens() throws RecognitionException {
        // HiveLexerParent.g:1:8: ( KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_ALL | KW_SOME | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_QUALIFY | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_COMPACT_ID | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_PREPARE | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_REAL | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_DISTRIBUTED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_EXECUTED | KW_EXECUTE | KW_LOCATION | KW_MANAGED | KW_MANAGEDLOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_DDL | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_CBO | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_DCPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CONVERT | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_SCHEDULED | KW_EVERY | KW_AT | KW_CRON | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_AST | KW_COST | KW_JOINCOST | KW_WITHIN | KW_PKFK_JOIN | KW_LEADING | KW_TRAILING | KW_TRIM | KW_IGNORE | KW_RESPECT | KW_DATACONNECTOR | KW_DATACONNECTORS | KW_TYPE | KW_URL | KW_REMOTE | KW_SPEC | KW_SYSTEM_TIME | KW_SYSTEM_VERSION | KW_EXPIRE_SNAPSHOTS | KW_SET_CURRENT_SNAPSHOT | KW_BRANCH | KW_SNAPSHOTS | KW_RETAIN | KW_RETENTION | KW_TAG | KW_FAST_FORWARD | KW_CHERRY_PICK | KW_ORPHAN_FILES | KW_OLDER | KW_THAN | KW_OPTIMIZE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT )
        int alt32=425;
        alt32 = dfa32.predict(input);
        switch (alt32) {
            case 1 :
                // HiveLexerParent.g:1:10: KW_TRUE
                {
                mKW_TRUE(); 


                }
                break;
            case 2 :
                // HiveLexerParent.g:1:18: KW_FALSE
                {
                mKW_FALSE(); 


                }
                break;
            case 3 :
                // HiveLexerParent.g:1:27: KW_UNKNOWN
                {
                mKW_UNKNOWN(); 


                }
                break;
            case 4 :
                // HiveLexerParent.g:1:38: KW_ALL
                {
                mKW_ALL(); 


                }
                break;
            case 5 :
                // HiveLexerParent.g:1:45: KW_SOME
                {
                mKW_SOME(); 


                }
                break;
            case 6 :
                // HiveLexerParent.g:1:53: KW_NONE
                {
                mKW_NONE(); 


                }
                break;
            case 7 :
                // HiveLexerParent.g:1:61: KW_AND
                {
                mKW_AND(); 


                }
                break;
            case 8 :
                // HiveLexerParent.g:1:68: KW_OR
                {
                mKW_OR(); 


                }
                break;
            case 9 :
                // HiveLexerParent.g:1:74: KW_NOT
                {
                mKW_NOT(); 


                }
                break;
            case 10 :
                // HiveLexerParent.g:1:81: KW_LIKE
                {
                mKW_LIKE(); 


                }
                break;
            case 11 :
                // HiveLexerParent.g:1:89: KW_ANY
                {
                mKW_ANY(); 


                }
                break;
            case 12 :
                // HiveLexerParent.g:1:96: KW_IF
                {
                mKW_IF(); 


                }
                break;
            case 13 :
                // HiveLexerParent.g:1:102: KW_EXISTS
                {
                mKW_EXISTS(); 


                }
                break;
            case 14 :
                // HiveLexerParent.g:1:112: KW_ASC
                {
                mKW_ASC(); 


                }
                break;
            case 15 :
                // HiveLexerParent.g:1:119: KW_DESC
                {
                mKW_DESC(); 


                }
                break;
            case 16 :
                // HiveLexerParent.g:1:127: KW_NULLS
                {
                mKW_NULLS(); 


                }
                break;
            case 17 :
                // HiveLexerParent.g:1:136: KW_LAST
                {
                mKW_LAST(); 


                }
                break;
            case 18 :
                // HiveLexerParent.g:1:144: KW_ORDER
                {
                mKW_ORDER(); 


                }
                break;
            case 19 :
                // HiveLexerParent.g:1:153: KW_GROUP
                {
                mKW_GROUP(); 


                }
                break;
            case 20 :
                // HiveLexerParent.g:1:162: KW_BY
                {
                mKW_BY(); 


                }
                break;
            case 21 :
                // HiveLexerParent.g:1:168: KW_HAVING
                {
                mKW_HAVING(); 


                }
                break;
            case 22 :
                // HiveLexerParent.g:1:178: KW_QUALIFY
                {
                mKW_QUALIFY(); 


                }
                break;
            case 23 :
                // HiveLexerParent.g:1:189: KW_WHERE
                {
                mKW_WHERE(); 


                }
                break;
            case 24 :
                // HiveLexerParent.g:1:198: KW_FROM
                {
                mKW_FROM(); 


                }
                break;
            case 25 :
                // HiveLexerParent.g:1:206: KW_AS
                {
                mKW_AS(); 


                }
                break;
            case 26 :
                // HiveLexerParent.g:1:212: KW_SELECT
                {
                mKW_SELECT(); 


                }
                break;
            case 27 :
                // HiveLexerParent.g:1:222: KW_DISTINCT
                {
                mKW_DISTINCT(); 


                }
                break;
            case 28 :
                // HiveLexerParent.g:1:234: KW_INSERT
                {
                mKW_INSERT(); 


                }
                break;
            case 29 :
                // HiveLexerParent.g:1:244: KW_OVERWRITE
                {
                mKW_OVERWRITE(); 


                }
                break;
            case 30 :
                // HiveLexerParent.g:1:257: KW_OUTER
                {
                mKW_OUTER(); 


                }
                break;
            case 31 :
                // HiveLexerParent.g:1:266: KW_UNIQUEJOIN
                {
                mKW_UNIQUEJOIN(); 


                }
                break;
            case 32 :
                // HiveLexerParent.g:1:280: KW_PRESERVE
                {
                mKW_PRESERVE(); 


                }
                break;
            case 33 :
                // HiveLexerParent.g:1:292: KW_JOIN
                {
                mKW_JOIN(); 


                }
                break;
            case 34 :
                // HiveLexerParent.g:1:300: KW_LEFT
                {
                mKW_LEFT(); 


                }
                break;
            case 35 :
                // HiveLexerParent.g:1:308: KW_RIGHT
                {
                mKW_RIGHT(); 


                }
                break;
            case 36 :
                // HiveLexerParent.g:1:317: KW_FULL
                {
                mKW_FULL(); 


                }
                break;
            case 37 :
                // HiveLexerParent.g:1:325: KW_ON
                {
                mKW_ON(); 


                }
                break;
            case 38 :
                // HiveLexerParent.g:1:331: KW_PARTITION
                {
                mKW_PARTITION(); 


                }
                break;
            case 39 :
                // HiveLexerParent.g:1:344: KW_PARTITIONS
                {
                mKW_PARTITIONS(); 


                }
                break;
            case 40 :
                // HiveLexerParent.g:1:358: KW_TABLE
                {
                mKW_TABLE(); 


                }
                break;
            case 41 :
                // HiveLexerParent.g:1:367: KW_TABLES
                {
                mKW_TABLES(); 


                }
                break;
            case 42 :
                // HiveLexerParent.g:1:377: KW_COLUMNS
                {
                mKW_COLUMNS(); 


                }
                break;
            case 43 :
                // HiveLexerParent.g:1:388: KW_INDEX
                {
                mKW_INDEX(); 


                }
                break;
            case 44 :
                // HiveLexerParent.g:1:397: KW_INDEXES
                {
                mKW_INDEXES(); 


                }
                break;
            case 45 :
                // HiveLexerParent.g:1:408: KW_REBUILD
                {
                mKW_REBUILD(); 


                }
                break;
            case 46 :
                // HiveLexerParent.g:1:419: KW_FUNCTIONS
                {
                mKW_FUNCTIONS(); 


                }
                break;
            case 47 :
                // HiveLexerParent.g:1:432: KW_SHOW
                {
                mKW_SHOW(); 


                }
                break;
            case 48 :
                // HiveLexerParent.g:1:440: KW_MSCK
                {
                mKW_MSCK(); 


                }
                break;
            case 49 :
                // HiveLexerParent.g:1:448: KW_REPAIR
                {
                mKW_REPAIR(); 


                }
                break;
            case 50 :
                // HiveLexerParent.g:1:458: KW_DIRECTORY
                {
                mKW_DIRECTORY(); 


                }
                break;
            case 51 :
                // HiveLexerParent.g:1:471: KW_LOCAL
                {
                mKW_LOCAL(); 


                }
                break;
            case 52 :
                // HiveLexerParent.g:1:480: KW_TRANSFORM
                {
                mKW_TRANSFORM(); 


                }
                break;
            case 53 :
                // HiveLexerParent.g:1:493: KW_USING
                {
                mKW_USING(); 


                }
                break;
            case 54 :
                // HiveLexerParent.g:1:502: KW_COMPACT_ID
                {
                mKW_COMPACT_ID(); 


                }
                break;
            case 55 :
                // HiveLexerParent.g:1:516: KW_CLUSTER
                {
                mKW_CLUSTER(); 


                }
                break;
            case 56 :
                // HiveLexerParent.g:1:527: KW_DISTRIBUTE
                {
                mKW_DISTRIBUTE(); 


                }
                break;
            case 57 :
                // HiveLexerParent.g:1:541: KW_SORT
                {
                mKW_SORT(); 


                }
                break;
            case 58 :
                // HiveLexerParent.g:1:549: KW_UNION
                {
                mKW_UNION(); 


                }
                break;
            case 59 :
                // HiveLexerParent.g:1:558: KW_EXCEPT
                {
                mKW_EXCEPT(); 


                }
                break;
            case 60 :
                // HiveLexerParent.g:1:568: KW_LOAD
                {
                mKW_LOAD(); 


                }
                break;
            case 61 :
                // HiveLexerParent.g:1:576: KW_PREPARE
                {
                mKW_PREPARE(); 


                }
                break;
            case 62 :
                // HiveLexerParent.g:1:587: KW_EXPORT
                {
                mKW_EXPORT(); 


                }
                break;
            case 63 :
                // HiveLexerParent.g:1:597: KW_IMPORT
                {
                mKW_IMPORT(); 


                }
                break;
            case 64 :
                // HiveLexerParent.g:1:607: KW_REPLICATION
                {
                mKW_REPLICATION(); 


                }
                break;
            case 65 :
                // HiveLexerParent.g:1:622: KW_METADATA
                {
                mKW_METADATA(); 


                }
                break;
            case 66 :
                // HiveLexerParent.g:1:634: KW_DATA
                {
                mKW_DATA(); 


                }
                break;
            case 67 :
                // HiveLexerParent.g:1:642: KW_INPATH
                {
                mKW_INPATH(); 


                }
                break;
            case 68 :
                // HiveLexerParent.g:1:652: KW_IS
                {
                mKW_IS(); 


                }
                break;
            case 69 :
                // HiveLexerParent.g:1:658: KW_NULL
                {
                mKW_NULL(); 


                }
                break;
            case 70 :
                // HiveLexerParent.g:1:666: KW_CREATE
                {
                mKW_CREATE(); 


                }
                break;
            case 71 :
                // HiveLexerParent.g:1:676: KW_EXTERNAL
                {
                mKW_EXTERNAL(); 


                }
                break;
            case 72 :
                // HiveLexerParent.g:1:688: KW_ALTER
                {
                mKW_ALTER(); 


                }
                break;
            case 73 :
                // HiveLexerParent.g:1:697: KW_CHANGE
                {
                mKW_CHANGE(); 


                }
                break;
            case 74 :
                // HiveLexerParent.g:1:707: KW_COLUMN
                {
                mKW_COLUMN(); 


                }
                break;
            case 75 :
                // HiveLexerParent.g:1:717: KW_FIRST
                {
                mKW_FIRST(); 


                }
                break;
            case 76 :
                // HiveLexerParent.g:1:726: KW_AFTER
                {
                mKW_AFTER(); 


                }
                break;
            case 77 :
                // HiveLexerParent.g:1:735: KW_DESCRIBE
                {
                mKW_DESCRIBE(); 


                }
                break;
            case 78 :
                // HiveLexerParent.g:1:747: KW_DROP
                {
                mKW_DROP(); 


                }
                break;
            case 79 :
                // HiveLexerParent.g:1:755: KW_RENAME
                {
                mKW_RENAME(); 


                }
                break;
            case 80 :
                // HiveLexerParent.g:1:765: KW_TO
                {
                mKW_TO(); 


                }
                break;
            case 81 :
                // HiveLexerParent.g:1:771: KW_COMMENT
                {
                mKW_COMMENT(); 


                }
                break;
            case 82 :
                // HiveLexerParent.g:1:782: KW_BOOLEAN
                {
                mKW_BOOLEAN(); 


                }
                break;
            case 83 :
                // HiveLexerParent.g:1:793: KW_TINYINT
                {
                mKW_TINYINT(); 


                }
                break;
            case 84 :
                // HiveLexerParent.g:1:804: KW_SMALLINT
                {
                mKW_SMALLINT(); 


                }
                break;
            case 85 :
                // HiveLexerParent.g:1:816: KW_INT
                {
                mKW_INT(); 


                }
                break;
            case 86 :
                // HiveLexerParent.g:1:823: KW_BIGINT
                {
                mKW_BIGINT(); 


                }
                break;
            case 87 :
                // HiveLexerParent.g:1:833: KW_FLOAT
                {
                mKW_FLOAT(); 


                }
                break;
            case 88 :
                // HiveLexerParent.g:1:842: KW_REAL
                {
                mKW_REAL(); 


                }
                break;
            case 89 :
                // HiveLexerParent.g:1:850: KW_DOUBLE
                {
                mKW_DOUBLE(); 


                }
                break;
            case 90 :
                // HiveLexerParent.g:1:860: KW_PRECISION
                {
                mKW_PRECISION(); 


                }
                break;
            case 91 :
                // HiveLexerParent.g:1:873: KW_DATE
                {
                mKW_DATE(); 


                }
                break;
            case 92 :
                // HiveLexerParent.g:1:881: KW_DATETIME
                {
                mKW_DATETIME(); 


                }
                break;
            case 93 :
                // HiveLexerParent.g:1:893: KW_TIMESTAMP
                {
                mKW_TIMESTAMP(); 


                }
                break;
            case 94 :
                // HiveLexerParent.g:1:906: KW_TIMESTAMPLOCALTZ
                {
                mKW_TIMESTAMPLOCALTZ(); 


                }
                break;
            case 95 :
                // HiveLexerParent.g:1:926: KW_TIME
                {
                mKW_TIME(); 


                }
                break;
            case 96 :
                // HiveLexerParent.g:1:934: KW_ZONE
                {
                mKW_ZONE(); 


                }
                break;
            case 97 :
                // HiveLexerParent.g:1:942: KW_INTERVAL
                {
                mKW_INTERVAL(); 


                }
                break;
            case 98 :
                // HiveLexerParent.g:1:954: KW_DECIMAL
                {
                mKW_DECIMAL(); 


                }
                break;
            case 99 :
                // HiveLexerParent.g:1:965: KW_STRING
                {
                mKW_STRING(); 


                }
                break;
            case 100 :
                // HiveLexerParent.g:1:975: KW_CHAR
                {
                mKW_CHAR(); 


                }
                break;
            case 101 :
                // HiveLexerParent.g:1:983: KW_VARCHAR
                {
                mKW_VARCHAR(); 


                }
                break;
            case 102 :
                // HiveLexerParent.g:1:994: KW_ARRAY
                {
                mKW_ARRAY(); 


                }
                break;
            case 103 :
                // HiveLexerParent.g:1:1003: KW_STRUCT
                {
                mKW_STRUCT(); 


                }
                break;
            case 104 :
                // HiveLexerParent.g:1:1013: KW_MAP
                {
                mKW_MAP(); 


                }
                break;
            case 105 :
                // HiveLexerParent.g:1:1020: KW_UNIONTYPE
                {
                mKW_UNIONTYPE(); 


                }
                break;
            case 106 :
                // HiveLexerParent.g:1:1033: KW_REDUCE
                {
                mKW_REDUCE(); 


                }
                break;
            case 107 :
                // HiveLexerParent.g:1:1043: KW_PARTITIONED
                {
                mKW_PARTITIONED(); 


                }
                break;
            case 108 :
                // HiveLexerParent.g:1:1058: KW_CLUSTERED
                {
                mKW_CLUSTERED(); 


                }
                break;
            case 109 :
                // HiveLexerParent.g:1:1071: KW_DISTRIBUTED
                {
                mKW_DISTRIBUTED(); 


                }
                break;
            case 110 :
                // HiveLexerParent.g:1:1086: KW_SORTED
                {
                mKW_SORTED(); 


                }
                break;
            case 111 :
                // HiveLexerParent.g:1:1096: KW_INTO
                {
                mKW_INTO(); 


                }
                break;
            case 112 :
                // HiveLexerParent.g:1:1104: KW_BUCKETS
                {
                mKW_BUCKETS(); 


                }
                break;
            case 113 :
                // HiveLexerParent.g:1:1115: KW_ROW
                {
                mKW_ROW(); 


                }
                break;
            case 114 :
                // HiveLexerParent.g:1:1122: KW_ROWS
                {
                mKW_ROWS(); 


                }
                break;
            case 115 :
                // HiveLexerParent.g:1:1130: KW_FORMAT
                {
                mKW_FORMAT(); 


                }
                break;
            case 116 :
                // HiveLexerParent.g:1:1140: KW_DELIMITED
                {
                mKW_DELIMITED(); 


                }
                break;
            case 117 :
                // HiveLexerParent.g:1:1153: KW_FIELDS
                {
                mKW_FIELDS(); 


                }
                break;
            case 118 :
                // HiveLexerParent.g:1:1163: KW_TERMINATED
                {
                mKW_TERMINATED(); 


                }
                break;
            case 119 :
                // HiveLexerParent.g:1:1177: KW_ESCAPED
                {
                mKW_ESCAPED(); 


                }
                break;
            case 120 :
                // HiveLexerParent.g:1:1188: KW_COLLECTION
                {
                mKW_COLLECTION(); 


                }
                break;
            case 121 :
                // HiveLexerParent.g:1:1202: KW_ITEMS
                {
                mKW_ITEMS(); 


                }
                break;
            case 122 :
                // HiveLexerParent.g:1:1211: KW_KEYS
                {
                mKW_KEYS(); 


                }
                break;
            case 123 :
                // HiveLexerParent.g:1:1219: KW_KEY_TYPE
                {
                mKW_KEY_TYPE(); 


                }
                break;
            case 124 :
                // HiveLexerParent.g:1:1231: KW_KILL
                {
                mKW_KILL(); 


                }
                break;
            case 125 :
                // HiveLexerParent.g:1:1239: KW_LINES
                {
                mKW_LINES(); 


                }
                break;
            case 126 :
                // HiveLexerParent.g:1:1248: KW_STORED
                {
                mKW_STORED(); 


                }
                break;
            case 127 :
                // HiveLexerParent.g:1:1258: KW_FILEFORMAT
                {
                mKW_FILEFORMAT(); 


                }
                break;
            case 128 :
                // HiveLexerParent.g:1:1272: KW_INPUTFORMAT
                {
                mKW_INPUTFORMAT(); 


                }
                break;
            case 129 :
                // HiveLexerParent.g:1:1287: KW_OUTPUTFORMAT
                {
                mKW_OUTPUTFORMAT(); 


                }
                break;
            case 130 :
                // HiveLexerParent.g:1:1303: KW_INPUTDRIVER
                {
                mKW_INPUTDRIVER(); 


                }
                break;
            case 131 :
                // HiveLexerParent.g:1:1318: KW_OUTPUTDRIVER
                {
                mKW_OUTPUTDRIVER(); 


                }
                break;
            case 132 :
                // HiveLexerParent.g:1:1334: KW_ENABLE
                {
                mKW_ENABLE(); 


                }
                break;
            case 133 :
                // HiveLexerParent.g:1:1344: KW_DISABLE
                {
                mKW_DISABLE(); 


                }
                break;
            case 134 :
                // HiveLexerParent.g:1:1355: KW_EXECUTED
                {
                mKW_EXECUTED(); 


                }
                break;
            case 135 :
                // HiveLexerParent.g:1:1367: KW_EXECUTE
                {
                mKW_EXECUTE(); 


                }
                break;
            case 136 :
                // HiveLexerParent.g:1:1378: KW_LOCATION
                {
                mKW_LOCATION(); 


                }
                break;
            case 137 :
                // HiveLexerParent.g:1:1390: KW_MANAGED
                {
                mKW_MANAGED(); 


                }
                break;
            case 138 :
                // HiveLexerParent.g:1:1401: KW_MANAGEDLOCATION
                {
                mKW_MANAGEDLOCATION(); 


                }
                break;
            case 139 :
                // HiveLexerParent.g:1:1420: KW_TABLESAMPLE
                {
                mKW_TABLESAMPLE(); 


                }
                break;
            case 140 :
                // HiveLexerParent.g:1:1435: KW_BUCKET
                {
                mKW_BUCKET(); 


                }
                break;
            case 141 :
                // HiveLexerParent.g:1:1445: KW_OUT
                {
                mKW_OUT(); 


                }
                break;
            case 142 :
                // HiveLexerParent.g:1:1452: KW_OF
                {
                mKW_OF(); 


                }
                break;
            case 143 :
                // HiveLexerParent.g:1:1458: KW_PERCENT
                {
                mKW_PERCENT(); 


                }
                break;
            case 144 :
                // HiveLexerParent.g:1:1469: KW_CAST
                {
                mKW_CAST(); 


                }
                break;
            case 145 :
                // HiveLexerParent.g:1:1477: KW_ADD
                {
                mKW_ADD(); 


                }
                break;
            case 146 :
                // HiveLexerParent.g:1:1484: KW_REPLACE
                {
                mKW_REPLACE(); 


                }
                break;
            case 147 :
                // HiveLexerParent.g:1:1495: KW_RLIKE
                {
                mKW_RLIKE(); 


                }
                break;
            case 148 :
                // HiveLexerParent.g:1:1504: KW_REGEXP
                {
                mKW_REGEXP(); 


                }
                break;
            case 149 :
                // HiveLexerParent.g:1:1514: KW_TEMPORARY
                {
                mKW_TEMPORARY(); 


                }
                break;
            case 150 :
                // HiveLexerParent.g:1:1527: KW_FUNCTION
                {
                mKW_FUNCTION(); 


                }
                break;
            case 151 :
                // HiveLexerParent.g:1:1539: KW_MACRO
                {
                mKW_MACRO(); 


                }
                break;
            case 152 :
                // HiveLexerParent.g:1:1548: KW_FILE
                {
                mKW_FILE(); 


                }
                break;
            case 153 :
                // HiveLexerParent.g:1:1556: KW_JAR
                {
                mKW_JAR(); 


                }
                break;
            case 154 :
                // HiveLexerParent.g:1:1563: KW_EXPLAIN
                {
                mKW_EXPLAIN(); 


                }
                break;
            case 155 :
                // HiveLexerParent.g:1:1574: KW_DDL
                {
                mKW_DDL(); 


                }
                break;
            case 156 :
                // HiveLexerParent.g:1:1581: KW_EXTENDED
                {
                mKW_EXTENDED(); 


                }
                break;
            case 157 :
                // HiveLexerParent.g:1:1593: KW_DEBUG
                {
                mKW_DEBUG(); 


                }
                break;
            case 158 :
                // HiveLexerParent.g:1:1602: KW_FORMATTED
                {
                mKW_FORMATTED(); 


                }
                break;
            case 159 :
                // HiveLexerParent.g:1:1615: KW_DEPENDENCY
                {
                mKW_DEPENDENCY(); 


                }
                break;
            case 160 :
                // HiveLexerParent.g:1:1629: KW_LOGICAL
                {
                mKW_LOGICAL(); 


                }
                break;
            case 161 :
                // HiveLexerParent.g:1:1640: KW_CBO
                {
                mKW_CBO(); 


                }
                break;
            case 162 :
                // HiveLexerParent.g:1:1647: KW_SERDE
                {
                mKW_SERDE(); 


                }
                break;
            case 163 :
                // HiveLexerParent.g:1:1656: KW_WITH
                {
                mKW_WITH(); 


                }
                break;
            case 164 :
                // HiveLexerParent.g:1:1664: KW_DEFERRED
                {
                mKW_DEFERRED(); 


                }
                break;
            case 165 :
                // HiveLexerParent.g:1:1676: KW_SERDEPROPERTIES
                {
                mKW_SERDEPROPERTIES(); 


                }
                break;
            case 166 :
                // HiveLexerParent.g:1:1695: KW_DBPROPERTIES
                {
                mKW_DBPROPERTIES(); 


                }
                break;
            case 167 :
                // HiveLexerParent.g:1:1711: KW_DCPROPERTIES
                {
                mKW_DCPROPERTIES(); 


                }
                break;
            case 168 :
                // HiveLexerParent.g:1:1727: KW_LIMIT
                {
                mKW_LIMIT(); 


                }
                break;
            case 169 :
                // HiveLexerParent.g:1:1736: KW_OFFSET
                {
                mKW_OFFSET(); 


                }
                break;
            case 170 :
                // HiveLexerParent.g:1:1746: KW_SET
                {
                mKW_SET(); 


                }
                break;
            case 171 :
                // HiveLexerParent.g:1:1753: KW_UNSET
                {
                mKW_UNSET(); 


                }
                break;
            case 172 :
                // HiveLexerParent.g:1:1762: KW_TBLPROPERTIES
                {
                mKW_TBLPROPERTIES(); 


                }
                break;
            case 173 :
                // HiveLexerParent.g:1:1779: KW_IDXPROPERTIES
                {
                mKW_IDXPROPERTIES(); 


                }
                break;
            case 174 :
                // HiveLexerParent.g:1:1796: KW_VALUE_TYPE
                {
                mKW_VALUE_TYPE(); 


                }
                break;
            case 175 :
                // HiveLexerParent.g:1:1810: KW_ELEM_TYPE
                {
                mKW_ELEM_TYPE(); 


                }
                break;
            case 176 :
                // HiveLexerParent.g:1:1823: KW_DEFINED
                {
                mKW_DEFINED(); 


                }
                break;
            case 177 :
                // HiveLexerParent.g:1:1834: KW_CASE
                {
                mKW_CASE(); 


                }
                break;
            case 178 :
                // HiveLexerParent.g:1:1842: KW_WHEN
                {
                mKW_WHEN(); 


                }
                break;
            case 179 :
                // HiveLexerParent.g:1:1850: KW_THEN
                {
                mKW_THEN(); 


                }
                break;
            case 180 :
                // HiveLexerParent.g:1:1858: KW_ELSE
                {
                mKW_ELSE(); 


                }
                break;
            case 181 :
                // HiveLexerParent.g:1:1866: KW_END
                {
                mKW_END(); 


                }
                break;
            case 182 :
                // HiveLexerParent.g:1:1873: KW_MAPJOIN
                {
                mKW_MAPJOIN(); 


                }
                break;
            case 183 :
                // HiveLexerParent.g:1:1884: KW_STREAMTABLE
                {
                mKW_STREAMTABLE(); 


                }
                break;
            case 184 :
                // HiveLexerParent.g:1:1899: KW_CLUSTERSTATUS
                {
                mKW_CLUSTERSTATUS(); 


                }
                break;
            case 185 :
                // HiveLexerParent.g:1:1916: KW_UTC
                {
                mKW_UTC(); 


                }
                break;
            case 186 :
                // HiveLexerParent.g:1:1923: KW_UTCTIMESTAMP
                {
                mKW_UTCTIMESTAMP(); 


                }
                break;
            case 187 :
                // HiveLexerParent.g:1:1939: KW_LONG
                {
                mKW_LONG(); 


                }
                break;
            case 188 :
                // HiveLexerParent.g:1:1947: KW_DELETE
                {
                mKW_DELETE(); 


                }
                break;
            case 189 :
                // HiveLexerParent.g:1:1957: KW_PLUS
                {
                mKW_PLUS(); 


                }
                break;
            case 190 :
                // HiveLexerParent.g:1:1965: KW_MINUS
                {
                mKW_MINUS(); 


                }
                break;
            case 191 :
                // HiveLexerParent.g:1:1974: KW_FETCH
                {
                mKW_FETCH(); 


                }
                break;
            case 192 :
                // HiveLexerParent.g:1:1983: KW_INTERSECT
                {
                mKW_INTERSECT(); 


                }
                break;
            case 193 :
                // HiveLexerParent.g:1:1996: KW_VIEW
                {
                mKW_VIEW(); 


                }
                break;
            case 194 :
                // HiveLexerParent.g:1:2004: KW_VIEWS
                {
                mKW_VIEWS(); 


                }
                break;
            case 195 :
                // HiveLexerParent.g:1:2013: KW_IN
                {
                mKW_IN(); 


                }
                break;
            case 196 :
                // HiveLexerParent.g:1:2019: KW_DATABASE
                {
                mKW_DATABASE(); 


                }
                break;
            case 197 :
                // HiveLexerParent.g:1:2031: KW_DATABASES
                {
                mKW_DATABASES(); 


                }
                break;
            case 198 :
                // HiveLexerParent.g:1:2044: KW_MATERIALIZED
                {
                mKW_MATERIALIZED(); 


                }
                break;
            case 199 :
                // HiveLexerParent.g:1:2060: KW_SCHEMA
                {
                mKW_SCHEMA(); 


                }
                break;
            case 200 :
                // HiveLexerParent.g:1:2070: KW_SCHEMAS
                {
                mKW_SCHEMAS(); 


                }
                break;
            case 201 :
                // HiveLexerParent.g:1:2081: KW_GRANT
                {
                mKW_GRANT(); 


                }
                break;
            case 202 :
                // HiveLexerParent.g:1:2090: KW_REVOKE
                {
                mKW_REVOKE(); 


                }
                break;
            case 203 :
                // HiveLexerParent.g:1:2100: KW_SSL
                {
                mKW_SSL(); 


                }
                break;
            case 204 :
                // HiveLexerParent.g:1:2107: KW_UNDO
                {
                mKW_UNDO(); 


                }
                break;
            case 205 :
                // HiveLexerParent.g:1:2115: KW_LOCK
                {
                mKW_LOCK(); 


                }
                break;
            case 206 :
                // HiveLexerParent.g:1:2123: KW_LOCKS
                {
                mKW_LOCKS(); 


                }
                break;
            case 207 :
                // HiveLexerParent.g:1:2132: KW_UNLOCK
                {
                mKW_UNLOCK(); 


                }
                break;
            case 208 :
                // HiveLexerParent.g:1:2142: KW_SHARED
                {
                mKW_SHARED(); 


                }
                break;
            case 209 :
                // HiveLexerParent.g:1:2152: KW_EXCLUSIVE
                {
                mKW_EXCLUSIVE(); 


                }
                break;
            case 210 :
                // HiveLexerParent.g:1:2165: KW_PROCEDURE
                {
                mKW_PROCEDURE(); 


                }
                break;
            case 211 :
                // HiveLexerParent.g:1:2178: KW_UNSIGNED
                {
                mKW_UNSIGNED(); 


                }
                break;
            case 212 :
                // HiveLexerParent.g:1:2190: KW_WHILE
                {
                mKW_WHILE(); 


                }
                break;
            case 213 :
                // HiveLexerParent.g:1:2199: KW_READ
                {
                mKW_READ(); 


                }
                break;
            case 214 :
                // HiveLexerParent.g:1:2207: KW_READS
                {
                mKW_READS(); 


                }
                break;
            case 215 :
                // HiveLexerParent.g:1:2216: KW_PURGE
                {
                mKW_PURGE(); 


                }
                break;
            case 216 :
                // HiveLexerParent.g:1:2225: KW_RANGE
                {
                mKW_RANGE(); 


                }
                break;
            case 217 :
                // HiveLexerParent.g:1:2234: KW_ANALYZE
                {
                mKW_ANALYZE(); 


                }
                break;
            case 218 :
                // HiveLexerParent.g:1:2245: KW_BEFORE
                {
                mKW_BEFORE(); 


                }
                break;
            case 219 :
                // HiveLexerParent.g:1:2255: KW_BETWEEN
                {
                mKW_BETWEEN(); 


                }
                break;
            case 220 :
                // HiveLexerParent.g:1:2266: KW_BOTH
                {
                mKW_BOTH(); 


                }
                break;
            case 221 :
                // HiveLexerParent.g:1:2274: KW_BINARY
                {
                mKW_BINARY(); 


                }
                break;
            case 222 :
                // HiveLexerParent.g:1:2284: KW_CROSS
                {
                mKW_CROSS(); 


                }
                break;
            case 223 :
                // HiveLexerParent.g:1:2293: KW_CONTINUE
                {
                mKW_CONTINUE(); 


                }
                break;
            case 224 :
                // HiveLexerParent.g:1:2305: KW_CONVERT
                {
                mKW_CONVERT(); 


                }
                break;
            case 225 :
                // HiveLexerParent.g:1:2316: KW_CURSOR
                {
                mKW_CURSOR(); 


                }
                break;
            case 226 :
                // HiveLexerParent.g:1:2326: KW_TRIGGER
                {
                mKW_TRIGGER(); 


                }
                break;
            case 227 :
                // HiveLexerParent.g:1:2337: KW_RECORDREADER
                {
                mKW_RECORDREADER(); 


                }
                break;
            case 228 :
                // HiveLexerParent.g:1:2353: KW_RECORDWRITER
                {
                mKW_RECORDWRITER(); 


                }
                break;
            case 229 :
                // HiveLexerParent.g:1:2369: KW_SEMI
                {
                mKW_SEMI(); 


                }
                break;
            case 230 :
                // HiveLexerParent.g:1:2377: KW_LATERAL
                {
                mKW_LATERAL(); 


                }
                break;
            case 231 :
                // HiveLexerParent.g:1:2388: KW_TOUCH
                {
                mKW_TOUCH(); 


                }
                break;
            case 232 :
                // HiveLexerParent.g:1:2397: KW_ARCHIVE
                {
                mKW_ARCHIVE(); 


                }
                break;
            case 233 :
                // HiveLexerParent.g:1:2408: KW_UNARCHIVE
                {
                mKW_UNARCHIVE(); 


                }
                break;
            case 234 :
                // HiveLexerParent.g:1:2421: KW_COMPUTE
                {
                mKW_COMPUTE(); 


                }
                break;
            case 235 :
                // HiveLexerParent.g:1:2432: KW_STATISTICS
                {
                mKW_STATISTICS(); 


                }
                break;
            case 236 :
                // HiveLexerParent.g:1:2446: KW_USE
                {
                mKW_USE(); 


                }
                break;
            case 237 :
                // HiveLexerParent.g:1:2453: KW_OPTION
                {
                mKW_OPTION(); 


                }
                break;
            case 238 :
                // HiveLexerParent.g:1:2463: KW_CONCATENATE
                {
                mKW_CONCATENATE(); 


                }
                break;
            case 239 :
                // HiveLexerParent.g:1:2478: KW_SHOW_DATABASE
                {
                mKW_SHOW_DATABASE(); 


                }
                break;
            case 240 :
                // HiveLexerParent.g:1:2495: KW_UPDATE
                {
                mKW_UPDATE(); 


                }
                break;
            case 241 :
                // HiveLexerParent.g:1:2505: KW_RESTRICT
                {
                mKW_RESTRICT(); 


                }
                break;
            case 242 :
                // HiveLexerParent.g:1:2517: KW_CASCADE
                {
                mKW_CASCADE(); 


                }
                break;
            case 243 :
                // HiveLexerParent.g:1:2528: KW_SKEWED
                {
                mKW_SKEWED(); 


                }
                break;
            case 244 :
                // HiveLexerParent.g:1:2538: KW_ROLLUP
                {
                mKW_ROLLUP(); 


                }
                break;
            case 245 :
                // HiveLexerParent.g:1:2548: KW_CUBE
                {
                mKW_CUBE(); 


                }
                break;
            case 246 :
                // HiveLexerParent.g:1:2556: KW_DIRECTORIES
                {
                mKW_DIRECTORIES(); 


                }
                break;
            case 247 :
                // HiveLexerParent.g:1:2571: KW_FOR
                {
                mKW_FOR(); 


                }
                break;
            case 248 :
                // HiveLexerParent.g:1:2578: KW_WINDOW
                {
                mKW_WINDOW(); 


                }
                break;
            case 249 :
                // HiveLexerParent.g:1:2588: KW_UNBOUNDED
                {
                mKW_UNBOUNDED(); 


                }
                break;
            case 250 :
                // HiveLexerParent.g:1:2601: KW_PRECEDING
                {
                mKW_PRECEDING(); 


                }
                break;
            case 251 :
                // HiveLexerParent.g:1:2614: KW_FOLLOWING
                {
                mKW_FOLLOWING(); 


                }
                break;
            case 252 :
                // HiveLexerParent.g:1:2627: KW_CURRENT
                {
                mKW_CURRENT(); 


                }
                break;
            case 253 :
                // HiveLexerParent.g:1:2638: KW_CURRENT_DATE
                {
                mKW_CURRENT_DATE(); 


                }
                break;
            case 254 :
                // HiveLexerParent.g:1:2654: KW_CURRENT_TIMESTAMP
                {
                mKW_CURRENT_TIMESTAMP(); 


                }
                break;
            case 255 :
                // HiveLexerParent.g:1:2675: KW_LESS
                {
                mKW_LESS(); 


                }
                break;
            case 256 :
                // HiveLexerParent.g:1:2683: KW_MORE
                {
                mKW_MORE(); 


                }
                break;
            case 257 :
                // HiveLexerParent.g:1:2691: KW_OVER
                {
                mKW_OVER(); 


                }
                break;
            case 258 :
                // HiveLexerParent.g:1:2699: KW_GROUPING
                {
                mKW_GROUPING(); 


                }
                break;
            case 259 :
                // HiveLexerParent.g:1:2711: KW_SETS
                {
                mKW_SETS(); 


                }
                break;
            case 260 :
                // HiveLexerParent.g:1:2719: KW_TRUNCATE
                {
                mKW_TRUNCATE(); 


                }
                break;
            case 261 :
                // HiveLexerParent.g:1:2731: KW_NOSCAN
                {
                mKW_NOSCAN(); 


                }
                break;
            case 262 :
                // HiveLexerParent.g:1:2741: KW_USER
                {
                mKW_USER(); 


                }
                break;
            case 263 :
                // HiveLexerParent.g:1:2749: KW_ROLE
                {
                mKW_ROLE(); 


                }
                break;
            case 264 :
                // HiveLexerParent.g:1:2757: KW_ROLES
                {
                mKW_ROLES(); 


                }
                break;
            case 265 :
                // HiveLexerParent.g:1:2766: KW_INNER
                {
                mKW_INNER(); 


                }
                break;
            case 266 :
                // HiveLexerParent.g:1:2775: KW_EXCHANGE
                {
                mKW_EXCHANGE(); 


                }
                break;
            case 267 :
                // HiveLexerParent.g:1:2787: KW_URI
                {
                mKW_URI(); 


                }
                break;
            case 268 :
                // HiveLexerParent.g:1:2794: KW_SERVER
                {
                mKW_SERVER(); 


                }
                break;
            case 269 :
                // HiveLexerParent.g:1:2804: KW_ADMIN
                {
                mKW_ADMIN(); 


                }
                break;
            case 270 :
                // HiveLexerParent.g:1:2813: KW_OWNER
                {
                mKW_OWNER(); 


                }
                break;
            case 271 :
                // HiveLexerParent.g:1:2822: KW_PRINCIPALS
                {
                mKW_PRINCIPALS(); 


                }
                break;
            case 272 :
                // HiveLexerParent.g:1:2836: KW_COMPACT
                {
                mKW_COMPACT(); 


                }
                break;
            case 273 :
                // HiveLexerParent.g:1:2847: KW_COMPACTIONS
                {
                mKW_COMPACTIONS(); 


                }
                break;
            case 274 :
                // HiveLexerParent.g:1:2862: KW_TRANSACTIONS
                {
                mKW_TRANSACTIONS(); 


                }
                break;
            case 275 :
                // HiveLexerParent.g:1:2878: KW_TRANSACTIONAL
                {
                mKW_TRANSACTIONAL(); 


                }
                break;
            case 276 :
                // HiveLexerParent.g:1:2895: KW_REWRITE
                {
                mKW_REWRITE(); 


                }
                break;
            case 277 :
                // HiveLexerParent.g:1:2906: KW_AUTHORIZATION
                {
                mKW_AUTHORIZATION(); 


                }
                break;
            case 278 :
                // HiveLexerParent.g:1:2923: KW_REOPTIMIZATION
                {
                mKW_REOPTIMIZATION(); 


                }
                break;
            case 279 :
                // HiveLexerParent.g:1:2941: KW_CONF
                {
                mKW_CONF(); 


                }
                break;
            case 280 :
                // HiveLexerParent.g:1:2949: KW_VALUES
                {
                mKW_VALUES(); 


                }
                break;
            case 281 :
                // HiveLexerParent.g:1:2959: KW_RELOAD
                {
                mKW_RELOAD(); 


                }
                break;
            case 282 :
                // HiveLexerParent.g:1:2969: KW_YEAR
                {
                mKW_YEAR(); 


                }
                break;
            case 283 :
                // HiveLexerParent.g:1:2977: KW_QUERY
                {
                mKW_QUERY(); 


                }
                break;
            case 284 :
                // HiveLexerParent.g:1:2986: KW_QUARTER
                {
                mKW_QUARTER(); 


                }
                break;
            case 285 :
                // HiveLexerParent.g:1:2997: KW_MONTH
                {
                mKW_MONTH(); 


                }
                break;
            case 286 :
                // HiveLexerParent.g:1:3006: KW_WEEK
                {
                mKW_WEEK(); 


                }
                break;
            case 287 :
                // HiveLexerParent.g:1:3014: KW_DAY
                {
                mKW_DAY(); 


                }
                break;
            case 288 :
                // HiveLexerParent.g:1:3021: KW_DOW
                {
                mKW_DOW(); 


                }
                break;
            case 289 :
                // HiveLexerParent.g:1:3028: KW_HOUR
                {
                mKW_HOUR(); 


                }
                break;
            case 290 :
                // HiveLexerParent.g:1:3036: KW_MINUTE
                {
                mKW_MINUTE(); 


                }
                break;
            case 291 :
                // HiveLexerParent.g:1:3046: KW_SECOND
                {
                mKW_SECOND(); 


                }
                break;
            case 292 :
                // HiveLexerParent.g:1:3056: KW_START
                {
                mKW_START(); 


                }
                break;
            case 293 :
                // HiveLexerParent.g:1:3065: KW_TRANSACTION
                {
                mKW_TRANSACTION(); 


                }
                break;
            case 294 :
                // HiveLexerParent.g:1:3080: KW_COMMIT
                {
                mKW_COMMIT(); 


                }
                break;
            case 295 :
                // HiveLexerParent.g:1:3090: KW_ROLLBACK
                {
                mKW_ROLLBACK(); 


                }
                break;
            case 296 :
                // HiveLexerParent.g:1:3102: KW_WORK
                {
                mKW_WORK(); 


                }
                break;
            case 297 :
                // HiveLexerParent.g:1:3110: KW_ONLY
                {
                mKW_ONLY(); 


                }
                break;
            case 298 :
                // HiveLexerParent.g:1:3118: KW_WRITE
                {
                mKW_WRITE(); 


                }
                break;
            case 299 :
                // HiveLexerParent.g:1:3127: KW_ISOLATION
                {
                mKW_ISOLATION(); 


                }
                break;
            case 300 :
                // HiveLexerParent.g:1:3140: KW_LEVEL
                {
                mKW_LEVEL(); 


                }
                break;
            case 301 :
                // HiveLexerParent.g:1:3149: KW_SNAPSHOT
                {
                mKW_SNAPSHOT(); 


                }
                break;
            case 302 :
                // HiveLexerParent.g:1:3161: KW_AUTOCOMMIT
                {
                mKW_AUTOCOMMIT(); 


                }
                break;
            case 303 :
                // HiveLexerParent.g:1:3175: KW_CACHE
                {
                mKW_CACHE(); 


                }
                break;
            case 304 :
                // HiveLexerParent.g:1:3184: KW_PRIMARY
                {
                mKW_PRIMARY(); 


                }
                break;
            case 305 :
                // HiveLexerParent.g:1:3195: KW_FOREIGN
                {
                mKW_FOREIGN(); 


                }
                break;
            case 306 :
                // HiveLexerParent.g:1:3206: KW_REFERENCES
                {
                mKW_REFERENCES(); 


                }
                break;
            case 307 :
                // HiveLexerParent.g:1:3220: KW_CONSTRAINT
                {
                mKW_CONSTRAINT(); 


                }
                break;
            case 308 :
                // HiveLexerParent.g:1:3234: KW_FORCE
                {
                mKW_FORCE(); 


                }
                break;
            case 309 :
                // HiveLexerParent.g:1:3243: KW_ENFORCED
                {
                mKW_ENFORCED(); 


                }
                break;
            case 310 :
                // HiveLexerParent.g:1:3255: KW_VALIDATE
                {
                mKW_VALIDATE(); 


                }
                break;
            case 311 :
                // HiveLexerParent.g:1:3267: KW_NOVALIDATE
                {
                mKW_NOVALIDATE(); 


                }
                break;
            case 312 :
                // HiveLexerParent.g:1:3281: KW_RELY
                {
                mKW_RELY(); 


                }
                break;
            case 313 :
                // HiveLexerParent.g:1:3289: KW_NORELY
                {
                mKW_NORELY(); 


                }
                break;
            case 314 :
                // HiveLexerParent.g:1:3299: KW_UNIQUE
                {
                mKW_UNIQUE(); 


                }
                break;
            case 315 :
                // HiveLexerParent.g:1:3309: KW_KEY
                {
                mKW_KEY(); 


                }
                break;
            case 316 :
                // HiveLexerParent.g:1:3316: KW_ABORT
                {
                mKW_ABORT(); 


                }
                break;
            case 317 :
                // HiveLexerParent.g:1:3325: KW_EXTRACT
                {
                mKW_EXTRACT(); 


                }
                break;
            case 318 :
                // HiveLexerParent.g:1:3336: KW_FLOOR
                {
                mKW_FLOOR(); 


                }
                break;
            case 319 :
                // HiveLexerParent.g:1:3345: KW_MERGE
                {
                mKW_MERGE(); 


                }
                break;
            case 320 :
                // HiveLexerParent.g:1:3354: KW_MATCHED
                {
                mKW_MATCHED(); 


                }
                break;
            case 321 :
                // HiveLexerParent.g:1:3365: KW_REPL
                {
                mKW_REPL(); 


                }
                break;
            case 322 :
                // HiveLexerParent.g:1:3373: KW_DUMP
                {
                mKW_DUMP(); 


                }
                break;
            case 323 :
                // HiveLexerParent.g:1:3381: KW_STATUS
                {
                mKW_STATUS(); 


                }
                break;
            case 324 :
                // HiveLexerParent.g:1:3391: KW_VECTORIZATION
                {
                mKW_VECTORIZATION(); 


                }
                break;
            case 325 :
                // HiveLexerParent.g:1:3408: KW_SUMMARY
                {
                mKW_SUMMARY(); 


                }
                break;
            case 326 :
                // HiveLexerParent.g:1:3419: KW_OPERATOR
                {
                mKW_OPERATOR(); 


                }
                break;
            case 327 :
                // HiveLexerParent.g:1:3431: KW_EXPRESSION
                {
                mKW_EXPRESSION(); 


                }
                break;
            case 328 :
                // HiveLexerParent.g:1:3445: KW_DETAIL
                {
                mKW_DETAIL(); 


                }
                break;
            case 329 :
                // HiveLexerParent.g:1:3455: KW_WAIT
                {
                mKW_WAIT(); 


                }
                break;
            case 330 :
                // HiveLexerParent.g:1:3463: KW_RESOURCE
                {
                mKW_RESOURCE(); 


                }
                break;
            case 331 :
                // HiveLexerParent.g:1:3475: KW_PLAN
                {
                mKW_PLAN(); 


                }
                break;
            case 332 :
                // HiveLexerParent.g:1:3483: KW_QUERY_PARALLELISM
                {
                mKW_QUERY_PARALLELISM(); 


                }
                break;
            case 333 :
                // HiveLexerParent.g:1:3504: KW_PLANS
                {
                mKW_PLANS(); 


                }
                break;
            case 334 :
                // HiveLexerParent.g:1:3513: KW_ACTIVATE
                {
                mKW_ACTIVATE(); 


                }
                break;
            case 335 :
                // HiveLexerParent.g:1:3525: KW_DEFAULT
                {
                mKW_DEFAULT(); 


                }
                break;
            case 336 :
                // HiveLexerParent.g:1:3536: KW_CHECK
                {
                mKW_CHECK(); 


                }
                break;
            case 337 :
                // HiveLexerParent.g:1:3545: KW_POOL
                {
                mKW_POOL(); 


                }
                break;
            case 338 :
                // HiveLexerParent.g:1:3553: KW_MOVE
                {
                mKW_MOVE(); 


                }
                break;
            case 339 :
                // HiveLexerParent.g:1:3561: KW_DO
                {
                mKW_DO(); 


                }
                break;
            case 340 :
                // HiveLexerParent.g:1:3567: KW_ALLOC_FRACTION
                {
                mKW_ALLOC_FRACTION(); 


                }
                break;
            case 341 :
                // HiveLexerParent.g:1:3585: KW_SCHEDULING_POLICY
                {
                mKW_SCHEDULING_POLICY(); 


                }
                break;
            case 342 :
                // HiveLexerParent.g:1:3606: KW_SCHEDULED
                {
                mKW_SCHEDULED(); 


                }
                break;
            case 343 :
                // HiveLexerParent.g:1:3619: KW_EVERY
                {
                mKW_EVERY(); 


                }
                break;
            case 344 :
                // HiveLexerParent.g:1:3628: KW_AT
                {
                mKW_AT(); 


                }
                break;
            case 345 :
                // HiveLexerParent.g:1:3634: KW_CRON
                {
                mKW_CRON(); 


                }
                break;
            case 346 :
                // HiveLexerParent.g:1:3642: KW_PATH
                {
                mKW_PATH(); 


                }
                break;
            case 347 :
                // HiveLexerParent.g:1:3650: KW_MAPPING
                {
                mKW_MAPPING(); 


                }
                break;
            case 348 :
                // HiveLexerParent.g:1:3661: KW_WORKLOAD
                {
                mKW_WORKLOAD(); 


                }
                break;
            case 349 :
                // HiveLexerParent.g:1:3673: KW_MANAGEMENT
                {
                mKW_MANAGEMENT(); 


                }
                break;
            case 350 :
                // HiveLexerParent.g:1:3687: KW_ACTIVE
                {
                mKW_ACTIVE(); 


                }
                break;
            case 351 :
                // HiveLexerParent.g:1:3697: KW_UNMANAGED
                {
                mKW_UNMANAGED(); 


                }
                break;
            case 352 :
                // HiveLexerParent.g:1:3710: KW_APPLICATION
                {
                mKW_APPLICATION(); 


                }
                break;
            case 353 :
                // HiveLexerParent.g:1:3725: KW_SYNC
                {
                mKW_SYNC(); 


                }
                break;
            case 354 :
                // HiveLexerParent.g:1:3733: KW_AST
                {
                mKW_AST(); 


                }
                break;
            case 355 :
                // HiveLexerParent.g:1:3740: KW_COST
                {
                mKW_COST(); 


                }
                break;
            case 356 :
                // HiveLexerParent.g:1:3748: KW_JOINCOST
                {
                mKW_JOINCOST(); 


                }
                break;
            case 357 :
                // HiveLexerParent.g:1:3760: KW_WITHIN
                {
                mKW_WITHIN(); 


                }
                break;
            case 358 :
                // HiveLexerParent.g:1:3770: KW_PKFK_JOIN
                {
                mKW_PKFK_JOIN(); 


                }
                break;
            case 359 :
                // HiveLexerParent.g:1:3783: KW_LEADING
                {
                mKW_LEADING(); 


                }
                break;
            case 360 :
                // HiveLexerParent.g:1:3794: KW_TRAILING
                {
                mKW_TRAILING(); 


                }
                break;
            case 361 :
                // HiveLexerParent.g:1:3806: KW_TRIM
                {
                mKW_TRIM(); 


                }
                break;
            case 362 :
                // HiveLexerParent.g:1:3814: KW_IGNORE
                {
                mKW_IGNORE(); 


                }
                break;
            case 363 :
                // HiveLexerParent.g:1:3824: KW_RESPECT
                {
                mKW_RESPECT(); 


                }
                break;
            case 364 :
                // HiveLexerParent.g:1:3835: KW_DATACONNECTOR
                {
                mKW_DATACONNECTOR(); 


                }
                break;
            case 365 :
                // HiveLexerParent.g:1:3852: KW_DATACONNECTORS
                {
                mKW_DATACONNECTORS(); 


                }
                break;
            case 366 :
                // HiveLexerParent.g:1:3870: KW_TYPE
                {
                mKW_TYPE(); 


                }
                break;
            case 367 :
                // HiveLexerParent.g:1:3878: KW_URL
                {
                mKW_URL(); 


                }
                break;
            case 368 :
                // HiveLexerParent.g:1:3885: KW_REMOTE
                {
                mKW_REMOTE(); 


                }
                break;
            case 369 :
                // HiveLexerParent.g:1:3895: KW_SPEC
                {
                mKW_SPEC(); 


                }
                break;
            case 370 :
                // HiveLexerParent.g:1:3903: KW_SYSTEM_TIME
                {
                mKW_SYSTEM_TIME(); 


                }
                break;
            case 371 :
                // HiveLexerParent.g:1:3918: KW_SYSTEM_VERSION
                {
                mKW_SYSTEM_VERSION(); 


                }
                break;
            case 372 :
                // HiveLexerParent.g:1:3936: KW_EXPIRE_SNAPSHOTS
                {
                mKW_EXPIRE_SNAPSHOTS(); 


                }
                break;
            case 373 :
                // HiveLexerParent.g:1:3956: KW_SET_CURRENT_SNAPSHOT
                {
                mKW_SET_CURRENT_SNAPSHOT(); 


                }
                break;
            case 374 :
                // HiveLexerParent.g:1:3980: KW_BRANCH
                {
                mKW_BRANCH(); 


                }
                break;
            case 375 :
                // HiveLexerParent.g:1:3990: KW_SNAPSHOTS
                {
                mKW_SNAPSHOTS(); 


                }
                break;
            case 376 :
                // HiveLexerParent.g:1:4003: KW_RETAIN
                {
                mKW_RETAIN(); 


                }
                break;
            case 377 :
                // HiveLexerParent.g:1:4013: KW_RETENTION
                {
                mKW_RETENTION(); 


                }
                break;
            case 378 :
                // HiveLexerParent.g:1:4026: KW_TAG
                {
                mKW_TAG(); 


                }
                break;
            case 379 :
                // HiveLexerParent.g:1:4033: KW_FAST_FORWARD
                {
                mKW_FAST_FORWARD(); 


                }
                break;
            case 380 :
                // HiveLexerParent.g:1:4049: KW_CHERRY_PICK
                {
                mKW_CHERRY_PICK(); 


                }
                break;
            case 381 :
                // HiveLexerParent.g:1:4064: KW_ORPHAN_FILES
                {
                mKW_ORPHAN_FILES(); 


                }
                break;
            case 382 :
                // HiveLexerParent.g:1:4080: KW_OLDER
                {
                mKW_OLDER(); 


                }
                break;
            case 383 :
                // HiveLexerParent.g:1:4089: KW_THAN
                {
                mKW_THAN(); 


                }
                break;
            case 384 :
                // HiveLexerParent.g:1:4097: KW_OPTIMIZE
                {
                mKW_OPTIMIZE(); 


                }
                break;
            case 385 :
                // HiveLexerParent.g:1:4109: DOT
                {
                mDOT(); 


                }
                break;
            case 386 :
                // HiveLexerParent.g:1:4113: COLON
                {
                mCOLON(); 


                }
                break;
            case 387 :
                // HiveLexerParent.g:1:4119: COMMA
                {
                mCOMMA(); 


                }
                break;
            case 388 :
                // HiveLexerParent.g:1:4125: SEMICOLON
                {
                mSEMICOLON(); 


                }
                break;
            case 389 :
                // HiveLexerParent.g:1:4135: LPAREN
                {
                mLPAREN(); 


                }
                break;
            case 390 :
                // HiveLexerParent.g:1:4142: RPAREN
                {
                mRPAREN(); 


                }
                break;
            case 391 :
                // HiveLexerParent.g:1:4149: LSQUARE
                {
                mLSQUARE(); 


                }
                break;
            case 392 :
                // HiveLexerParent.g:1:4157: RSQUARE
                {
                mRSQUARE(); 


                }
                break;
            case 393 :
                // HiveLexerParent.g:1:4165: LCURLY
                {
                mLCURLY(); 


                }
                break;
            case 394 :
                // HiveLexerParent.g:1:4172: RCURLY
                {
                mRCURLY(); 


                }
                break;
            case 395 :
                // HiveLexerParent.g:1:4179: EQUAL
                {
                mEQUAL(); 


                }
                break;
            case 396 :
                // HiveLexerParent.g:1:4185: EQUAL_NS
                {
                mEQUAL_NS(); 


                }
                break;
            case 397 :
                // HiveLexerParent.g:1:4194: NOTEQUAL
                {
                mNOTEQUAL(); 


                }
                break;
            case 398 :
                // HiveLexerParent.g:1:4203: LESSTHANOREQUALTO
                {
                mLESSTHANOREQUALTO(); 


                }
                break;
            case 399 :
                // HiveLexerParent.g:1:4221: LESSTHAN
                {
                mLESSTHAN(); 


                }
                break;
            case 400 :
                // HiveLexerParent.g:1:4230: GREATERTHANOREQUALTO
                {
                mGREATERTHANOREQUALTO(); 


                }
                break;
            case 401 :
                // HiveLexerParent.g:1:4251: GREATERTHAN
                {
                mGREATERTHAN(); 


                }
                break;
            case 402 :
                // HiveLexerParent.g:1:4263: DIVIDE
                {
                mDIVIDE(); 


                }
                break;
            case 403 :
                // HiveLexerParent.g:1:4270: PLUS
                {
                mPLUS(); 


                }
                break;
            case 404 :
                // HiveLexerParent.g:1:4275: MINUS
                {
                mMINUS(); 


                }
                break;
            case 405 :
                // HiveLexerParent.g:1:4281: STAR
                {
                mSTAR(); 


                }
                break;
            case 406 :
                // HiveLexerParent.g:1:4286: MOD
                {
                mMOD(); 


                }
                break;
            case 407 :
                // HiveLexerParent.g:1:4290: DIV
                {
                mDIV(); 


                }
                break;
            case 408 :
                // HiveLexerParent.g:1:4294: AMPERSAND
                {
                mAMPERSAND(); 


                }
                break;
            case 409 :
                // HiveLexerParent.g:1:4304: TILDE
                {
                mTILDE(); 


                }
                break;
            case 410 :
                // HiveLexerParent.g:1:4310: BITWISEOR
                {
                mBITWISEOR(); 


                }
                break;
            case 411 :
                // HiveLexerParent.g:1:4320: CONCATENATE
                {
                mCONCATENATE(); 


                }
                break;
            case 412 :
                // HiveLexerParent.g:1:4332: BITWISEXOR
                {
                mBITWISEXOR(); 


                }
                break;
            case 413 :
                // HiveLexerParent.g:1:4343: QUESTION
                {
                mQUESTION(); 


                }
                break;
            case 414 :
                // HiveLexerParent.g:1:4352: DOLLAR
                {
                mDOLLAR(); 


                }
                break;
            case 415 :
                // HiveLexerParent.g:1:4359: StringLiteral
                {
                mStringLiteral(); 


                }
                break;
            case 416 :
                // HiveLexerParent.g:1:4373: CharSetLiteral
                {
                mCharSetLiteral(); 


                }
                break;
            case 417 :
                // HiveLexerParent.g:1:4388: IntegralLiteral
                {
                mIntegralLiteral(); 


                }
                break;
            case 418 :
                // HiveLexerParent.g:1:4404: NumberLiteral
                {
                mNumberLiteral(); 


                }
                break;
            case 419 :
                // HiveLexerParent.g:1:4418: ByteLengthLiteral
                {
                mByteLengthLiteral(); 


                }
                break;
            case 420 :
                // HiveLexerParent.g:1:4436: Number
                {
                mNumber(); 


                }
                break;
            case 421 :
                // HiveLexerParent.g:1:4443: Identifier
                {
                mIdentifier(); 


                }
                break;
            case 422 :
                // HiveLexerParent.g:1:4454: CharSetName
                {
                mCharSetName(); 


                }
                break;
            case 423 :
                // HiveLexerParent.g:1:4466: WS
                {
                mWS(); 


                }
                break;
            case 424 :
                // HiveLexerParent.g:1:4469: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;
            case 425 :
                // HiveLexerParent.g:1:4482: QUERY_HINT
                {
                mQUERY_HINT(); 


                }
                break;

        }

    }


    protected DFA32 dfa32 = new DFA32(this);
    static final String DFA32_eotS =
        "\1\63\7\66\1\157\21\66\1\u00bc\1\66\13\uffff\1\u00bf\1\u00c1\1\u00c3"+
        "\1\uffff\1\u00c5\4\uffff\1\u00c7\3\uffff\2\u00cd\3\uffff\2\66\1"+
        "\u00d7\23\66\1\u0101\6\66\1\u010a\17\66\1\u012a\2\66\1\u012e\1\u0130"+
        "\3\66\2\uffff\4\66\1\u0142\1\u0148\1\66\1\u014b\14\66\1\u0168\5"+
        "\66\1\u016f\56\66\4\uffff\1\66\1\u01c7\11\uffff\1\66\1\u01c9\2\u00cd"+
        "\1\66\1\uffff\1\u01cc\2\u01d0\4\66\1\u01d8\1\66\1\uffff\21\66\1"+
        "\u01ef\13\66\1\u01fe\1\u0200\1\66\1\u0202\1\u0203\1\u0205\1\66\1"+
        "\u0207\1\u0208\1\66\1\u020a\1\u020b\1\uffff\3\66\1\u020f\4\66\1"+
        "\uffff\5\66\1\u021d\11\66\1\u022a\7\66\1\157\7\66\1\uffff\1\66\1"+
        "\u023c\1\66\1\uffff\1\66\1\uffff\21\66\1\uffff\3\66\1\u0257\1\66"+
        "\1\uffff\2\66\1\uffff\12\66\1\u026b\4\66\1\u0271\7\66\1\u027d\1"+
        "\66\1\u0282\2\66\1\uffff\1\u0285\5\66\1\uffff\40\66\1\u02b0\20\66"+
        "\1\u02c8\16\66\1\u02e4\5\66\1\u02ed\14\66\1\u02fd\2\66\2\uffff\1"+
        "\u0300\1\uffff\1\u00cd\3\uffff\1\u00cd\1\u01cc\1\uffff\1\u0305\4"+
        "\66\1\u030a\1\66\1\uffff\2\66\1\u030f\3\66\1\u0313\1\u0314\1\u0315"+
        "\2\66\1\u0318\1\u0319\3\66\1\u031e\5\66\1\uffff\7\66\1\u032b\5\66"+
        "\1\u0331\1\uffff\1\66\1\uffff\1\66\2\uffff\1\66\1\uffff\1\66\2\uffff"+
        "\1\66\2\uffff\3\66\1\uffff\6\66\1\u0340\1\u0342\3\66\1\u0346\1\66"+
        "\1\uffff\1\u0348\1\66\1\u034b\11\66\1\uffff\3\66\1\u035a\1\66\1"+
        "\u035c\1\u035d\3\66\1\u0362\3\66\1\u0367\2\66\1\uffff\1\u036a\5"+
        "\66\1\u0371\2\66\1\u0374\1\66\1\u0376\1\u0377\3\66\1\u037d\1\u037e"+
        "\1\66\1\u0380\5\66\1\u0387\1\uffff\23\66\1\uffff\1\66\1\u039d\1"+
        "\66\1\u03a0\1\66\1\uffff\13\66\1\uffff\1\u03af\1\u03b1\1\u0282\1"+
        "\66\1\uffff\1\u03b3\1\66\1\uffff\2\66\1\u03b7\3\66\1\u03bb\7\66"+
        "\1\u03c4\4\66\1\u03c9\1\66\1\u03cc\1\66\1\u03cf\1\u03d1\1\66\1\u03d3"+
        "\7\66\1\u03dc\1\66\1\u03de\1\u03e0\1\66\1\u03e2\1\66\1\u03e5\1\uffff"+
        "\3\66\1\u03eb\1\66\1\u03ed\1\u03ef\12\66\1\u03fa\4\66\1\u03ff\1"+
        "\uffff\1\66\1\u0403\11\66\1\u040f\2\66\1\u0412\3\66\1\u0416\1\66"+
        "\1\u0418\2\66\1\u041b\1\u041c\2\66\1\uffff\2\66\1\u0421\1\u0422"+
        "\4\66\1\uffff\5\66\1\u042d\1\66\1\u042f\1\u0430\3\66\1\u0435\1\66"+
        "\1\u0437\1\uffff\1\u0438\1\u043a\2\uffff\2\u00cd\1\66\1\uffff\4"+
        "\66\1\uffff\1\u0441\1\u0442\2\66\1\uffff\3\66\3\uffff\1\u0448\3"+
        "\uffff\1\66\1\u044a\2\66\1\uffff\1\u044d\1\u044e\2\66\1\u0451\1"+
        "\66\1\u0453\2\66\1\u0457\1\u0458\1\66\1\uffff\4\66\1\u045e\1\uffff"+
        "\3\66\1\u0462\1\66\1\u0464\1\u0465\1\66\1\u0467\2\66\1\u046a\2\66"+
        "\1\uffff\1\66\1\uffff\1\66\1\u0471\1\66\1\uffff\1\66\1\uffff\2\66"+
        "\1\uffff\10\66\1\u047e\5\66\1\uffff\1\66\2\uffff\3\66\1\u0488\1"+
        "\uffff\1\66\1\u048a\2\66\1\uffff\1\u048d\1\66\1\uffff\4\66\1\u0493"+
        "\1\u0494\1\uffff\1\u0495\1\u0496\1\uffff\1\66\2\uffff\1\u0498\1"+
        "\66\1\u049a\1\66\1\u049c\2\uffff\1\66\1\uffff\1\66\1\u04a0\4\66"+
        "\1\uffff\1\u04a7\2\66\1\u04aa\21\66\1\uffff\1\u04bc\1\66\1\uffff"+
        "\3\66\1\u04c1\12\66\1\uffff\1\66\1\uffff\1\66\1\uffff\3\66\1\uffff"+
        "\1\u04d2\1\u04d3\1\66\1\uffff\7\66\1\u03c4\1\uffff\2\66\1\u04df"+
        "\1\u04e0\1\uffff\1\u04e1\1\66\1\uffff\1\66\1\u03cf\1\uffff\1\66"+
        "\1\uffff\1\u04e5\1\uffff\10\66\1\uffff\1\66\1\uffff\1\u04ef\1\uffff"+
        "\1\u04f0\1\uffff\2\66\1\uffff\1\u04f3\4\66\1\uffff\1\66\1\uffff"+
        "\1\u04f9\1\uffff\12\66\1\uffff\4\66\1\uffff\2\66\1\u050a\1\uffff"+
        "\1\u050b\1\u050c\11\66\1\uffff\2\66\1\uffff\2\66\1\u051a\1\uffff"+
        "\1\66\1\uffff\1\u051c\1\66\2\uffff\1\66\1\u051f\2\66\2\uffff\1\66"+
        "\1\u0523\3\66\1\u0527\2\66\1\u052a\1\66\1\uffff\1\u052d\2\uffff"+
        "\3\66\1\u0531\1\uffff\1\66\2\uffff\1\u043a\1\uffff\5\66\1\u0539"+
        "\2\uffff\5\66\1\uffff\1\66\1\uffff\1\u0540\1\66\2\uffff\1\u0543"+
        "\1\66\1\uffff\1\66\1\uffff\1\66\1\u0548\1\66\2\uffff\1\66\1\u054b"+
        "\3\66\1\uffff\1\66\1\u0550\1\66\1\uffff\1\66\2\uffff\1\66\1\uffff"+
        "\2\66\1\uffff\1\66\1\u0557\1\66\1\u0559\1\u055a\1\66\1\uffff\1\u055c"+
        "\1\66\1\u055f\1\66\1\u0561\1\66\1\u0563\1\u0564\1\66\1\u0566\1\66"+
        "\1\u0568\1\uffff\1\u056a\1\66\1\u056c\3\66\1\u0570\1\66\1\u0572"+
        "\1\uffff\1\66\1\uffff\2\66\1\uffff\1\66\1\u0578\1\u0579\2\66\4\uffff"+
        "\1\66\1\uffff\1\66\1\uffff\1\66\1\uffff\1\66\1\u0580\1\66\1\uffff"+
        "\1\u0582\5\66\1\uffff\1\u0588\1\66\1\uffff\1\66\1\u058b\1\u058c"+
        "\1\u058d\2\66\1\u0590\10\66\1\u059a\1\66\1\uffff\3\66\1\u059f\1"+
        "\uffff\4\66\1\u05a4\7\66\1\u05ac\3\66\2\uffff\1\66\1\u05b1\1\u05b2"+
        "\1\u05b4\1\u05b5\1\66\1\u05b7\1\u05b8\3\66\3\uffff\1\u05bc\1\u05bd"+
        "\1\66\1\uffff\11\66\2\uffff\2\66\1\uffff\1\66\1\u05cb\2\66\1\u05ce"+
        "\1\uffff\1\u05cf\1\u05d0\1\u05d1\6\66\1\u05d9\1\66\1\u05db\1\u05dc"+
        "\1\66\1\u05de\1\66\3\uffff\1\u05e1\4\66\1\u05e6\6\66\1\u05ed\1\uffff"+
        "\1\u05ee\1\uffff\2\66\1\uffff\1\u05f1\2\66\1\uffff\3\66\1\uffff"+
        "\2\66\1\uffff\1\u05fb\1\u052d\1\uffff\1\66\1\u05fd\1\66\1\uffff"+
        "\5\66\1\u0604\1\66\1\uffff\1\u0606\5\66\1\uffff\2\66\1\uffff\1\u060e"+
        "\1\66\1\u0610\1\66\1\uffff\2\66\1\uffff\4\66\1\uffff\1\66\1\u0619"+
        "\1\u061a\3\66\1\uffff\1\66\2\uffff\1\66\1\uffff\1\66\1\u055f\1\uffff"+
        "\1\66\1\uffff\1\66\2\uffff\1\66\1\uffff\1\66\1\uffff\1\u0625\1\uffff"+
        "\1\66\1\uffff\1\66\1\u0629\1\66\1\uffff\1\66\1\uffff\1\u0271\1\uffff"+
        "\3\66\2\uffff\2\66\1\u0632\1\u0633\1\66\1\u0635\1\uffff\1\u0636"+
        "\1\uffff\2\66\1\u0257\2\66\1\uffff\2\66\3\uffff\2\66\1\uffff\1\u063f"+
        "\4\66\1\u0644\1\u0646\1\u0647\1\u059a\1\uffff\2\66\1\u0271\1\66"+
        "\1\uffff\2\66\1\u064d\1\u064e\1\uffff\2\66\1\u0652\4\66\1\uffff"+
        "\3\66\1\u065a\2\uffff\1\u065b\2\uffff\1\u065c\2\uffff\1\u065d\1"+
        "\u065e\1\66\2\uffff\2\66\1\u0662\4\66\1\u0667\1\66\1\u0669\2\66"+
        "\1\u066c\1\uffff\1\66\1\u066e\4\uffff\4\66\1\u0673\1\u0674\1\66"+
        "\1\uffff\1\66\2\uffff\1\66\1\uffff\1\66\1\u0679\1\uffff\1\66\1\u067c"+
        "\1\u067d\1\u067e\1\uffff\1\66\1\u0680\3\66\1\u0686\3\uffff\1\u0687"+
        "\1\uffff\1\u0689\1\66\1\u068b\1\u068c\1\u068e\2\66\1\u0691\1\u05fb"+
        "\1\uffff\1\u0692\1\uffff\2\66\1\u0695\2\66\1\u0698\1\uffff\1\66"+
        "\1\uffff\4\66\1\u069f\2\66\1\uffff\1\66\1\uffff\2\66\1\u06a5\5\66"+
        "\2\uffff\2\66\1\u06ad\4\66\1\u06b2\2\66\1\uffff\2\66\1\u06b8\1\uffff"+
        "\6\66\1\u06bf\1\u06c0\2\uffff\1\u06c1\2\uffff\2\66\1\u06c4\4\66"+
        "\1\u06c9\1\uffff\2\66\1\u06cc\1\u06cd\1\uffff\1\u06ce\2\uffff\1"+
        "\u06cf\1\u06d0\2\66\1\u06d3\2\uffff\1\u06d4\1\66\1\u0652\1\uffff"+
        "\1\66\1\u06d9\1\u06da\3\66\1\u06de\5\uffff\1\66\1\u06e0\1\u06e1"+
        "\1\uffff\4\66\1\uffff\1\66\1\uffff\1\66\1\u06e8\1\uffff\1\66\1\uffff"+
        "\2\66\1\u06ec\1\u06ed\2\uffff\3\66\1\u06f1\1\uffff\2\66\3\uffff"+
        "\1\u06f4\1\uffff\5\66\2\uffff\1\66\1\uffff\1\u06fc\2\uffff\1\66"+
        "\1\uffff\2\66\2\uffff\1\u0700\1\66\1\uffff\1\u0702\1\66\1\uffff"+
        "\1\66\1\u0706\1\66\1\u0708\1\66\1\u070a\1\uffff\1\66\1\u070c\1\u070d"+
        "\1\66\1\u070f\1\uffff\1\u0710\1\u0711\1\u0712\4\66\1\uffff\4\66"+
        "\1\uffff\3\66\1\u071e\1\u071f\1\uffff\3\66\1\u0723\2\66\3\uffff"+
        "\2\66\1\uffff\1\u0728\1\u0729\1\66\1\u072b\1\uffff\2\66\5\uffff"+
        "\1\u072e\1\66\2\uffff\1\66\1\u0731\1\66\1\u0733\2\uffff\1\u0734"+
        "\2\66\1\uffff\1\66\2\uffff\1\u0738\1\u0739\1\u073a\1\66\1\u073e"+
        "\1\u073f\1\uffff\3\66\2\uffff\2\66\1\u0745\1\uffff\2\66\1\uffff"+
        "\2\66\1\u074b\1\u074c\3\66\1\uffff\3\66\1\uffff\1\66\1\uffff\3\66"+
        "\1\uffff\1\u0757\1\uffff\1\66\1\uffff\1\u0759\2\uffff\1\u075a\4"+
        "\uffff\3\66\1\u075e\5\66\1\u0764\1\66\2\uffff\2\66\1\u0768\1\uffff"+
        "\4\66\2\uffff\1\66\1\uffff\1\u076e\1\66\1\uffff\1\u0770\1\u0772"+
        "\1\uffff\1\66\2\uffff\3\66\3\uffff\1\u0777\1\u0778\1\66\2\uffff"+
        "\4\66\1\u077e\1\uffff\1\u077f\2\66\1\u0783\1\u0784\2\uffff\4\66"+
        "\1\u0789\2\66\1\u078e\1\u078f\1\66\1\uffff\1\66\2\uffff\3\66\1\uffff"+
        "\1\u0795\3\66\1\u0799\1\uffff\1\66\1\u079b\1\66\1\uffff\2\66\1\u079f"+
        "\1\u07a0\1\66\1\uffff\1\66\1\uffff\1\u07a3\1\uffff\1\u07a4\3\66"+
        "\2\uffff\1\u07a8\1\u07a9\3\66\2\uffff\1\66\1\u07ae\1\u07af\2\uffff"+
        "\4\66\1\uffff\2\66\1\u07b6\1\66\2\uffff\2\66\1\u07ba\2\66\1\uffff"+
        "\3\66\1\uffff\1\66\1\uffff\1\66\1\u07c2\1\u07c3\2\uffff\2\66\2\uffff"+
        "\1\u07c6\1\u07c7\1\66\2\uffff\1\u07c9\1\u07ca\1\66\1\u07cc\2\uffff"+
        "\1\66\1\u07ce\2\66\1\u07d1\1\66\1\uffff\1\u07d3\1\66\1\u07d5\1\uffff"+
        "\1\66\1\u07d7\2\66\1\u07da\2\66\2\uffff\1\u07dd\1\66\2\uffff\1\66"+
        "\2\uffff\1\66\1\uffff\1\u07e1\1\uffff\2\66\1\uffff\1\u07e4\1\uffff"+
        "\1\66\1\uffff\1\u07e6\1\uffff\2\66\1\uffff\1\66\1\u07ea\1\uffff"+
        "\2\66\1\u07ed\1\uffff\2\66\1\uffff\1\66\1\uffff\1\u07f1\2\66\1\uffff"+
        "\2\66\1\uffff\1\66\1\u07f7\1\u07f8\1\uffff\2\66\1\u07fb\2\66\2\uffff"+
        "\1\66\1\u07ff\1\uffff\1\u0800\1\u0801\1\66\3\uffff\1\66\1\u0804"+
        "\1\uffff";
    static final String DFA32_eofS =
        "\u0805\uffff";
    static final String DFA32_minS =
        "\1\11\2\101\1\116\1\102\1\103\1\117\1\106\1\75\1\101\1\104\1\114"+
        "\1\101\1\122\1\105\1\101\1\125\6\101\1\117\1\101\3\105\13\uffff"+
        "\2\75\1\52\1\uffff\1\55\4\uffff\1\174\3\uffff\2\56\3\uffff\1\101"+
        "\1\102\1\60\2\115\1\114\1\101\1\120\1\114\1\117\1\114\1\105\1\117"+
        "\1\114\1\124\1\101\1\105\1\103\1\104\1\111\1\114\1\101\1\60\1\124"+
        "\1\103\1\104\1\124\1\117\1\124\1\60\1\120\1\115\1\103\3\101\1\110"+
        "\1\114\1\105\1\101\1\115\1\116\1\105\1\116\1\114\1\60\1\105\1\124"+
        "\2\60\1\105\1\116\1\104\2\uffff\1\113\1\123\2\101\2\60\1\120\1\60"+
        "\1\105\1\130\1\116\2\103\1\101\1\123\1\105\1\102\1\122\1\124\1\117"+
        "\1\60\1\114\2\120\1\115\1\101\1\60\1\117\1\107\1\103\1\106\1\101"+
        "\1\126\1\125\1\101\1\105\1\116\1\105\1\122\2\111\1\105\2\122\1\101"+
        "\1\122\1\117\1\106\1\111\1\122\1\107\1\101\1\114\1\111\1\116\1\114"+
        "\1\125\1\105\1\101\1\103\1\117\1\102\1\103\1\122\1\103\3\116\1\114"+
        "\1\105\1\103\1\131\1\114\4\uffff\1\101\1\76\11\uffff\2\60\1\56\1"+
        "\60\1\53\1\uffff\3\60\1\105\1\111\1\107\1\114\1\60\1\103\1\uffff"+
        "\1\131\1\105\1\115\2\120\2\116\1\105\1\123\1\124\1\115\1\114\1\103"+
        "\1\123\1\114\1\105\1\101\1\60\1\114\1\103\1\116\1\117\1\105\2\117"+
        "\1\122\1\117\1\101\1\116\2\60\1\101\3\60\1\105\2\60\1\114\2\60\1"+
        "\uffff\1\105\1\101\1\110\1\60\1\111\1\110\1\122\1\111\1\uffff\1"+
        "\114\1\105\1\124\1\105\1\104\1\60\1\111\1\117\1\127\1\122\1\114"+
        "\1\105\2\122\1\105\1\60\1\127\1\120\1\115\1\103\1\124\1\103\1\105"+
        "\1\60\1\103\1\101\1\105\1\114\2\105\1\110\1\uffff\1\122\1\60\1\131"+
        "\1\uffff\1\123\1\uffff\1\111\1\122\4\105\1\111\1\124\1\105\1\124"+
        "\1\123\1\105\1\104\1\101\1\104\1\111\1\107\1\uffff\2\105\1\101\1"+
        "\60\1\105\1\uffff\1\117\1\114\1\uffff\1\115\1\120\1\117\1\123\1"+
        "\105\1\111\1\105\1\103\1\101\1\102\1\60\1\117\1\105\1\122\1\103"+
        "\1\60\1\105\1\125\1\105\3\101\1\105\1\60\1\101\1\60\1\120\1\102"+
        "\1\uffff\1\60\2\122\1\120\1\125\1\116\1\uffff\1\114\1\110\1\111"+
        "\1\101\1\113\1\117\1\127\1\116\1\111\1\122\1\114\1\122\1\116\1\114"+
        "\1\110\1\104\2\113\2\124\2\103\1\115\1\124\1\110\1\103\1\123\1\116"+
        "\1\107\1\114\1\113\1\116\1\60\1\110\1\125\2\101\1\104\1\125\1\105"+
        "\3\117\1\122\1\120\1\117\1\105\1\117\1\101\1\60\1\105\1\113\1\107"+
        "\1\114\1\115\1\103\1\124\1\123\1\101\2\116\2\103\1\110\1\60\1\122"+
        "\1\105\1\113\1\101\1\107\1\60\1\101\1\122\1\103\1\125\1\105\1\124"+
        "\2\105\1\103\1\111\1\127\1\124\1\60\1\114\1\122\2\uffff\1\60\1\uffff"+
        "\1\60\1\53\1\uffff\3\60\1\uffff\1\60\1\103\1\123\1\114\1\107\1\60"+
        "\1\105\1\uffff\1\110\1\111\1\60\1\111\1\117\1\122\3\60\1\105\1\55"+
        "\2\60\2\124\1\104\1\60\1\124\1\122\1\101\1\111\1\105\1\uffff\1\117"+
        "\1\110\1\117\1\125\1\116\1\124\1\107\1\60\2\103\1\125\1\116\1\107"+
        "\1\60\1\uffff\1\124\1\uffff\1\124\2\uffff\1\103\1\uffff\1\122\2"+
        "\uffff\1\131\2\uffff\1\122\1\131\1\111\1\uffff\1\116\1\117\1\103"+
        "\1\124\1\126\1\111\2\60\1\103\2\105\1\60\1\103\1\uffff\1\60\1\116"+
        "\1\60\1\105\1\114\1\116\1\103\1\101\1\105\1\111\1\124\1\104\1\uffff"+
        "\1\105\1\123\1\101\1\60\1\105\2\60\1\101\2\114\1\60\2\122\1\101"+
        "\1\60\1\122\1\125\1\uffff\1\60\1\105\1\115\1\101\2\122\1\60\1\123"+
        "\1\124\1\60\1\122\2\60\1\114\1\111\1\114\2\60\1\103\1\60\1\122\1"+
        "\130\2\124\1\107\1\60\1\uffff\2\122\1\101\1\123\2\122\1\124\1\120"+
        "\1\125\1\101\1\122\1\101\1\105\1\122\1\116\1\101\1\125\1\120\1\114"+
        "\1\uffff\1\122\1\60\1\131\1\60\1\115\1\uffff\1\115\1\124\1\107\1"+
        "\116\1\122\1\116\1\125\2\111\1\102\1\103\1\uffff\3\60\1\106\1\uffff"+
        "\1\60\1\114\1\uffff\2\117\1\60\1\120\1\124\1\105\1\60\1\116\1\122"+
        "\1\105\1\122\1\105\1\103\1\116\1\60\1\111\1\124\1\131\1\105\1\60"+
        "\1\105\1\60\1\117\2\60\1\105\1\60\1\105\1\101\2\105\1\103\1\101"+
        "\1\111\1\60\1\105\2\60\1\105\1\60\1\137\1\60\1\uffff\1\124\2\111"+
        "\1\60\1\115\2\60\1\103\1\130\1\113\2\122\1\125\1\105\1\111\1\124"+
        "\1\101\1\60\1\122\1\124\1\111\1\116\1\60\1\uffff\1\102\1\60\2\105"+
        "\1\115\1\105\1\101\1\105\1\111\1\105\1\101\1\60\1\124\1\105\1\60"+
        "\2\124\1\123\1\60\1\107\1\60\1\113\1\122\2\60\1\101\1\105\1\uffff"+
        "\1\117\1\105\2\60\1\104\1\105\1\117\1\111\1\uffff\1\107\1\117\1"+
        "\122\1\110\1\123\1\60\1\110\2\60\1\110\1\105\1\104\1\60\1\117\1"+
        "\60\1\uffff\2\60\1\uffff\3\60\1\104\1\uffff\2\101\1\111\1\105\1"+
        "\uffff\2\60\1\116\1\124\1\uffff\1\116\1\122\1\117\3\uffff\1\60\3"+
        "\uffff\1\111\1\60\1\123\1\117\1\uffff\2\60\1\124\1\107\1\60\1\127"+
        "\1\60\1\127\1\105\2\60\1\116\1\uffff\1\113\1\110\1\116\1\101\1\60"+
        "\1\uffff\1\115\1\105\1\137\1\60\1\132\2\60\1\126\1\60\1\122\1\117"+
        "\1\60\1\101\1\103\1\uffff\1\104\1\uffff\1\124\1\60\1\122\1\uffff"+
        "\1\125\1\uffff\2\104\1\uffff\1\104\1\111\1\107\1\124\1\115\1\104"+
        "\2\123\1\60\1\101\1\125\1\104\1\110\1\122\1\uffff\1\115\2\uffff"+
        "\1\116\1\111\1\131\1\60\1\uffff\1\111\1\60\1\116\1\122\1\uffff\1"+
        "\60\1\124\1\uffff\1\124\1\116\1\111\1\124\2\60\1\uffff\2\60\1\uffff"+
        "\1\101\2\uffff\1\60\1\116\1\60\1\111\1\60\2\uffff\1\101\1\uffff"+
        "\1\124\1\60\1\110\1\104\1\105\1\123\1\uffff\1\60\2\124\1\60\1\117"+
        "\1\105\1\123\1\124\1\123\1\116\1\124\1\111\1\123\1\105\1\116\1\104"+
        "\1\103\1\124\2\105\1\103\1\uffff\1\60\1\111\1\uffff\1\101\1\111"+
        "\1\105\1\60\1\104\1\122\1\105\2\114\1\116\1\111\1\114\1\124\1\101"+
        "\1\uffff\1\111\1\uffff\1\127\1\uffff\1\105\2\120\1\uffff\2\60\1"+
        "\101\1\uffff\1\124\1\131\1\124\2\105\1\110\1\107\1\60\1\uffff\1"+
        "\106\1\105\2\60\1\uffff\1\60\1\116\1\uffff\1\127\1\60\1\uffff\1"+
        "\117\1\uffff\1\60\1\uffff\2\122\1\123\2\104\1\111\1\122\1\124\1"+
        "\uffff\1\116\1\uffff\1\60\1\uffff\1\60\1\uffff\1\112\1\117\1\uffff"+
        "\1\60\1\114\1\122\2\103\1\uffff\1\105\1\uffff\1\60\1\uffff\1\105"+
        "\1\120\1\105\1\104\1\111\1\122\1\103\1\124\1\111\1\104\1\uffff\2"+
        "\105\1\116\1\124\1\uffff\1\120\1\101\1\60\1\uffff\2\60\1\116\2\103"+
        "\1\124\1\116\1\124\1\116\1\122\1\124\1\uffff\1\122\1\103\1\uffff"+
        "\2\105\1\60\1\uffff\1\105\1\uffff\1\60\1\131\2\uffff\1\104\1\60"+
        "\1\122\1\116\2\uffff\1\101\1\60\1\111\1\116\1\105\1\60\1\111\1\105"+
        "\1\60\1\105\1\uffff\1\60\2\uffff\1\101\1\123\1\101\1\60\1\uffff"+
        "\1\122\2\uffff\1\60\1\uffff\1\124\1\117\1\103\1\116\1\122\1\60\2"+
        "\uffff\1\124\3\101\1\120\1\uffff\1\117\1\uffff\1\60\1\122\2\uffff"+
        "\1\60\1\116\1\uffff\1\111\1\uffff\1\116\1\60\1\131\2\uffff\1\105"+
        "\1\60\1\111\1\104\1\107\1\uffff\1\105\1\60\1\106\1\uffff\1\105\2"+
        "\uffff\1\105\1\uffff\1\111\1\115\1\uffff\1\124\1\60\1\101\2\60\1"+
        "\122\1\uffff\1\60\1\122\1\60\1\101\1\60\1\116\2\60\1\124\1\60\1"+
        "\124\1\60\1\uffff\1\60\1\114\1\60\1\117\1\131\1\137\1\60\1\104\1"+
        "\60\1\uffff\1\103\1\uffff\1\55\1\111\1\uffff\1\104\2\60\1\132\1"+
        "\117\4\uffff\1\114\1\uffff\1\107\1\uffff\1\117\1\uffff\1\114\1\60"+
        "\1\123\1\uffff\1\60\1\117\2\122\1\101\1\105\1\uffff\1\60\1\111\1"+
        "\uffff\1\120\3\60\1\111\1\107\1\60\1\116\1\123\1\137\1\101\1\105"+
        "\1\124\1\105\1\104\1\60\1\105\1\uffff\1\102\1\114\1\124\1\60\1\uffff"+
        "\2\105\1\104\1\124\1\60\1\103\1\102\1\105\1\117\1\123\1\115\1\105"+
        "\1\60\2\105\1\116\2\uffff\1\116\4\60\1\116\2\60\1\131\1\122\1\120"+
        "\3\uffff\2\60\1\101\1\uffff\1\126\1\105\2\111\1\125\1\120\1\131"+
        "\1\111\1\124\2\uffff\1\117\1\123\1\uffff\1\104\1\60\1\101\1\105"+
        "\1\60\1\uffff\3\60\1\122\2\103\1\124\1\105\1\115\1\60\1\116\2\60"+
        "\1\111\1\60\1\103\3\uffff\1\60\2\124\1\105\1\124\1\60\1\125\1\124"+
        "\1\105\1\101\1\124\1\122\1\60\1\uffff\1\60\1\uffff\1\55\1\105\1"+
        "\uffff\1\60\2\124\1\uffff\1\116\1\107\1\104\1\uffff\1\101\1\104"+
        "\1\uffff\2\60\1\uffff\1\122\1\60\1\124\1\uffff\1\111\1\105\1\122"+
        "\1\124\1\107\1\60\1\115\1\uffff\1\60\1\115\1\124\1\122\1\105\1\116"+
        "\1\uffff\1\115\1\105\1\uffff\1\60\1\116\1\60\1\117\1\uffff\1\120"+
        "\1\104\1\uffff\1\126\2\105\1\123\1\uffff\1\122\2\60\1\132\1\115"+
        "\1\105\1\uffff\1\124\2\uffff\1\117\1\uffff\1\122\1\60\1\uffff\1"+
        "\124\1\uffff\1\124\2\uffff\1\101\1\uffff\1\111\1\uffff\1\60\1\uffff"+
        "\1\105\1\uffff\1\124\1\60\1\124\1\uffff\1\101\1\uffff\1\60\1\uffff"+
        "\1\124\1\117\1\122\2\uffff\1\105\1\122\2\60\1\116\1\60\1\uffff\1"+
        "\60\1\uffff\1\122\1\111\1\60\1\114\1\103\1\uffff\1\117\1\105\3\uffff"+
        "\1\126\1\105\1\uffff\1\60\1\111\1\123\1\114\1\104\4\60\1\uffff\1"+
        "\104\1\105\1\60\1\105\1\uffff\1\116\1\104\2\60\1\uffff\1\124\1\125"+
        "\1\60\1\122\3\105\1\uffff\2\122\1\107\1\60\2\uffff\1\60\2\uffff"+
        "\1\60\2\uffff\2\60\1\101\2\uffff\1\104\1\105\1\60\1\117\1\116\1"+
        "\122\1\101\1\60\1\117\1\60\1\111\1\124\1\60\1\uffff\1\124\1\60\4"+
        "\uffff\1\105\1\122\1\124\1\105\2\60\1\111\1\uffff\1\103\2\uffff"+
        "\1\117\1\uffff\1\113\1\60\1\uffff\1\111\3\60\1\uffff\1\105\1\60"+
        "\1\116\1\111\1\117\1\60\3\uffff\1\60\1\uffff\1\60\1\101\3\60\1\105"+
        "\1\114\2\60\1\uffff\1\60\1\uffff\1\105\1\132\1\60\1\115\1\111\1"+
        "\60\1\uffff\1\120\1\uffff\1\120\1\105\1\131\1\122\1\60\1\101\1\104"+
        "\1\uffff\1\107\1\uffff\1\111\1\105\1\60\1\105\2\104\1\124\1\101"+
        "\2\uffff\1\101\1\111\1\60\1\111\1\120\1\105\1\101\1\60\1\102\1\103"+
        "\1\uffff\1\116\1\104\1\60\1\uffff\1\111\1\105\1\124\1\105\1\122"+
        "\1\111\2\60\2\uffff\1\60\2\uffff\1\115\1\126\1\60\1\124\1\116\1"+
        "\122\1\105\1\60\1\uffff\1\117\1\116\2\60\1\uffff\1\60\2\uffff\2"+
        "\60\1\104\1\103\1\60\2\uffff\1\60\1\124\1\60\1\uffff\1\111\2\60"+
        "\1\113\2\124\1\60\5\uffff\1\122\2\60\1\uffff\1\116\1\107\1\105\1"+
        "\114\1\uffff\1\116\1\uffff\1\116\1\60\1\uffff\1\111\1\uffff\1\101"+
        "\1\111\2\60\2\uffff\1\132\1\105\1\116\1\60\1\uffff\2\117\3\uffff"+
        "\1\60\1\uffff\1\101\1\116\1\122\1\104\1\124\2\uffff\1\104\1\uffff"+
        "\1\60\2\uffff\1\117\1\uffff\1\116\1\111\2\uffff\1\60\1\101\1\uffff"+
        "\1\60\1\117\1\uffff\1\114\1\60\1\104\1\60\1\124\1\60\1\uffff\1\124"+
        "\2\60\1\116\1\60\1\uffff\3\60\1\101\1\103\2\124\1\uffff\1\117\1"+
        "\105\1\116\1\102\1\uffff\1\114\1\123\1\107\2\60\1\uffff\1\115\1"+
        "\122\1\105\1\60\1\115\1\126\3\uffff\1\101\1\105\1\uffff\2\60\1\124"+
        "\1\60\1\uffff\1\116\1\101\5\uffff\1\60\1\131\2\uffff\1\105\1\60"+
        "\1\105\1\60\2\uffff\1\60\2\111\1\uffff\1\101\2\uffff\3\60\1\123"+
        "\2\60\1\uffff\1\117\1\104\1\124\2\uffff\1\101\1\123\1\60\1\uffff"+
        "\2\116\1\uffff\2\124\2\60\2\101\1\111\1\uffff\1\103\1\124\1\132"+
        "\1\uffff\1\124\1\uffff\1\116\1\105\1\117\1\uffff\1\60\1\uffff\1"+
        "\111\1\uffff\1\60\2\uffff\1\60\4\uffff\1\115\1\124\1\111\1\60\1"+
        "\116\1\122\1\124\1\101\1\105\1\60\1\137\2\uffff\1\105\1\123\1\60"+
        "\1\uffff\1\101\1\105\1\124\1\122\2\uffff\1\111\1\uffff\1\60\1\120"+
        "\1\uffff\2\60\1\uffff\1\123\2\uffff\2\105\1\114\3\uffff\2\60\1\104"+
        "\2\uffff\1\116\2\105\1\124\1\60\1\uffff\1\60\1\111\1\105\2\60\2"+
        "\uffff\2\124\1\115\1\101\1\60\1\105\1\111\2\60\1\103\1\uffff\1\105"+
        "\2\uffff\1\120\1\111\1\117\1\uffff\1\60\1\124\1\137\1\123\1\60\1"+
        "\uffff\1\120\1\60\1\111\1\uffff\1\124\1\122\2\60\1\105\1\uffff\1"+
        "\123\1\uffff\1\60\1\uffff\1\60\2\123\1\114\2\uffff\2\60\2\122\1"+
        "\111\2\uffff\1\104\2\60\2\uffff\1\125\2\105\1\124\1\uffff\1\104"+
        "\1\117\1\60\1\114\2\uffff\1\101\1\123\1\60\1\117\1\116\1\uffff\1"+
        "\111\1\123\1\105\1\uffff\1\117\1\uffff\1\117\2\60\2\uffff\1\123"+
        "\1\110\2\uffff\2\60\1\105\2\uffff\2\60\1\117\1\60\2\uffff\1\123"+
        "\1\60\1\123\1\111\1\60\1\116\1\uffff\1\60\1\114\1\60\1\uffff\1\116"+
        "\1\60\1\105\1\116\1\60\1\114\1\116\2\uffff\1\60\1\117\2\uffff\1"+
        "\114\2\uffff\1\116\1\uffff\1\60\1\uffff\1\124\1\117\1\uffff\1\60"+
        "\1\uffff\1\124\1\uffff\1\60\1\uffff\1\123\1\101\1\uffff\1\111\1"+
        "\60\1\uffff\1\124\1\111\1\60\1\uffff\1\101\1\116\1\uffff\1\132\1"+
        "\uffff\1\60\1\120\1\103\1\uffff\2\123\1\uffff\1\115\2\60\1\uffff"+
        "\1\123\1\131\1\60\1\115\1\120\2\uffff\1\110\1\60\1\uffff\2\60\1"+
        "\117\3\uffff\1\124\1\60\1\uffff";
    static final String DFA32_maxS =
        "\1\176\1\131\1\125\1\124\1\125\1\131\1\125\1\127\1\75\1\117\1\124"+
        "\1\130\1\125\1\122\1\131\1\117\1\125\1\122\1\125\2\117\1\125\1\123"+
        "\1\117\2\111\1\126\1\105\13\uffff\1\76\1\75\1\52\1\uffff\1\55\4"+
        "\uffff\1\174\3\uffff\2\172\3\uffff\1\125\1\107\1\172\1\116\1\122"+
        "\1\114\1\105\1\120\1\123\1\117\1\116\1\122\1\117\1\122\1\124\1\123"+
        "\1\111\1\103\1\104\1\114\1\124\1\131\1\172\1\124\1\122\1\115\1\124"+
        "\1\117\1\124\1\172\1\120\1\122\1\124\1\117\1\101\1\122\1\110\1\114"+
        "\1\105\1\101\1\115\1\123\1\105\1\126\1\115\1\172\1\105\1\124\2\172"+
        "\1\124\1\116\1\104\2\uffff\1\116\1\124\1\126\1\116\2\172\1\120\1"+
        "\172\1\105\1\130\1\116\1\124\1\103\1\106\1\123\1\105\1\124\1\126"+
        "\1\131\1\117\1\172\1\114\2\120\1\115\1\117\1\172\1\124\1\116\1\103"+
        "\1\124\1\101\1\126\1\125\1\105\1\111\1\124\1\105\1\122\2\111\1\117"+
        "\1\124\1\122\1\125\1\122\1\117\1\106\1\111\1\122\1\107\2\127\1\111"+
        "\1\116\1\123\1\125\1\117\1\105\1\123\1\117\1\122\1\103\2\124\1\116"+
        "\1\126\1\116\1\122\1\105\1\103\1\131\1\114\4\uffff\1\101\1\76\11"+
        "\uffff\1\146\2\172\1\145\1\71\1\uffff\3\172\2\116\1\115\1\114\1"+
        "\172\1\103\1\uffff\1\131\1\105\1\115\2\120\2\116\1\105\1\123\1\124"+
        "\1\115\1\114\1\103\1\123\1\114\1\105\1\117\1\172\1\114\1\103\1\116"+
        "\1\121\1\111\2\117\1\122\1\117\1\101\1\116\2\172\1\101\3\172\1\105"+
        "\2\172\1\114\2\172\1\uffff\1\105\1\101\1\110\1\172\1\111\1\117\1"+
        "\122\1\111\1\uffff\1\114\1\105\1\124\1\105\1\126\1\172\1\111\1\117"+
        "\1\127\1\122\1\114\1\125\1\122\1\124\1\105\1\172\1\127\1\120\1\115"+
        "\1\103\1\124\1\103\1\105\1\172\1\103\1\101\1\105\1\114\2\105\1\110"+
        "\1\uffff\1\122\1\172\1\131\1\uffff\1\123\1\uffff\1\111\1\122\4\105"+
        "\1\111\1\124\1\105\1\124\1\123\1\105\1\104\1\113\1\104\1\111\1\107"+
        "\1\uffff\2\105\1\125\1\172\1\105\1\uffff\1\117\1\114\1\uffff\1\115"+
        "\1\120\1\117\1\123\1\114\2\122\1\103\1\101\1\102\1\172\1\117\1\105"+
        "\1\122\1\103\1\172\1\111\1\125\1\105\1\111\1\101\1\124\1\105\1\172"+
        "\1\105\1\172\1\120\1\102\1\uffff\1\172\2\122\1\120\1\125\1\116\1"+
        "\uffff\1\114\1\110\1\111\1\101\1\113\1\117\1\127\1\116\1\111\4\122"+
        "\1\114\1\110\1\104\2\113\2\124\1\123\1\103\1\116\1\124\1\110\1\103"+
        "\1\123\1\116\1\107\1\114\1\113\1\116\1\172\1\110\1\125\1\114\1\101"+
        "\1\114\1\125\1\105\2\117\1\124\1\122\1\120\1\131\1\105\1\117\1\105"+
        "\1\172\1\114\1\113\1\107\1\125\1\120\1\126\1\124\1\123\1\101\1\123"+
        "\2\122\1\124\1\110\1\172\1\123\1\105\1\113\1\101\1\107\1\172\1\101"+
        "\1\122\1\105\1\125\1\105\1\124\2\105\1\103\1\125\1\127\1\124\1\172"+
        "\1\114\1\122\2\uffff\1\172\1\uffff\1\145\1\71\1\uffff\1\71\2\172"+
        "\1\uffff\1\172\1\103\1\123\1\114\1\107\1\172\1\105\1\uffff\1\110"+
        "\1\111\1\172\1\111\1\117\1\122\3\172\1\105\1\55\2\172\2\124\1\104"+
        "\1\172\1\124\1\122\1\101\1\111\1\105\1\uffff\1\117\1\110\1\117\1"+
        "\125\1\116\1\124\1\107\1\172\2\103\1\125\1\116\1\107\1\172\1\uffff"+
        "\1\124\1\uffff\1\124\2\uffff\1\103\1\uffff\1\122\2\uffff\1\131\2"+
        "\uffff\1\122\1\131\1\111\1\uffff\1\116\1\117\1\103\1\124\1\126\1"+
        "\111\2\172\1\103\2\105\1\172\1\103\1\uffff\1\172\1\116\1\172\1\105"+
        "\1\114\1\116\1\103\1\101\1\105\1\125\1\124\1\115\1\uffff\1\105\1"+
        "\123\1\101\1\172\1\105\2\172\1\101\2\114\1\172\2\122\1\101\1\172"+
        "\1\122\1\125\1\uffff\1\172\1\105\1\117\1\101\2\122\1\172\1\123\1"+
        "\124\1\172\1\122\2\172\1\114\1\111\1\124\2\172\1\103\1\172\1\122"+
        "\1\130\2\124\1\122\1\172\1\uffff\2\122\1\101\1\123\2\122\1\124\1"+
        "\120\1\125\1\101\1\122\1\101\1\105\2\122\1\101\1\125\1\120\1\114"+
        "\1\uffff\1\122\1\172\1\131\1\172\1\115\1\uffff\1\115\1\124\1\107"+
        "\1\116\1\122\1\116\1\125\1\111\1\122\1\102\1\103\1\uffff\3\172\1"+
        "\106\1\uffff\1\172\1\114\1\uffff\2\117\1\172\1\120\1\124\1\105\1"+
        "\172\1\116\1\122\1\105\1\122\1\105\1\103\1\116\1\172\1\111\1\124"+
        "\1\131\1\105\1\172\1\105\1\172\1\117\2\172\1\105\1\172\1\105\1\101"+
        "\1\111\1\105\1\103\1\101\1\111\1\172\1\105\2\172\1\105\1\172\1\137"+
        "\1\172\1\uffff\1\124\2\111\1\172\1\115\2\172\1\103\1\130\1\113\2"+
        "\122\1\125\1\105\1\111\1\124\1\101\1\172\1\122\1\124\1\111\1\116"+
        "\1\172\1\uffff\1\125\1\172\2\105\1\115\1\105\1\125\2\111\1\105\1"+
        "\101\1\172\1\124\1\105\1\172\2\124\1\123\1\172\1\107\1\172\1\113"+
        "\1\122\2\172\1\101\1\105\1\uffff\1\117\1\105\2\172\1\104\1\105\1"+
        "\117\1\111\1\uffff\1\107\1\117\1\122\1\110\1\124\1\172\1\110\2\172"+
        "\1\110\1\105\1\104\1\172\1\117\1\172\1\uffff\2\172\1\uffff\1\71"+
        "\3\104\1\uffff\1\101\1\106\1\111\1\105\1\uffff\2\172\1\116\1\124"+
        "\1\uffff\1\116\1\122\1\117\3\uffff\1\172\3\uffff\1\111\1\172\1\123"+
        "\1\117\1\uffff\2\172\1\124\1\107\1\172\1\127\1\172\1\127\1\105\2"+
        "\172\1\116\1\uffff\1\113\1\110\1\116\1\101\1\172\1\uffff\1\115\1"+
        "\105\1\137\1\172\1\132\2\172\1\126\1\172\1\122\1\117\1\172\1\105"+
        "\1\103\1\uffff\1\104\1\uffff\1\124\1\172\1\122\1\uffff\1\125\1\uffff"+
        "\2\104\1\uffff\1\104\1\111\1\107\1\124\1\115\1\104\2\123\1\172\1"+
        "\101\1\125\1\104\1\110\1\122\1\uffff\1\115\2\uffff\1\116\1\111\1"+
        "\131\1\172\1\uffff\1\111\1\172\1\116\1\122\1\uffff\1\172\1\124\1"+
        "\uffff\1\124\1\116\1\111\1\124\2\172\1\uffff\2\172\1\uffff\1\101"+
        "\2\uffff\1\172\1\116\1\172\1\111\1\172\2\uffff\1\101\1\uffff\1\124"+
        "\1\172\1\110\1\106\1\105\1\126\1\uffff\1\172\2\124\1\172\1\117\1"+
        "\105\1\123\1\124\1\123\1\116\1\124\1\111\1\123\1\105\1\116\1\104"+
        "\1\103\1\124\2\105\1\103\1\uffff\1\172\1\111\1\uffff\1\101\1\111"+
        "\1\105\1\172\1\104\1\122\1\105\2\114\1\116\1\111\1\114\1\124\1\101"+
        "\1\uffff\1\111\1\uffff\1\127\1\uffff\1\105\2\120\1\uffff\2\172\1"+
        "\101\1\uffff\1\124\1\131\1\124\2\105\1\110\1\107\1\172\1\uffff\1"+
        "\106\1\105\2\172\1\uffff\1\172\1\116\1\uffff\1\127\1\172\1\uffff"+
        "\1\117\1\uffff\1\172\1\uffff\2\122\1\123\2\104\1\111\1\122\1\124"+
        "\1\uffff\1\116\1\uffff\1\172\1\uffff\1\172\1\uffff\1\112\1\117\1"+
        "\uffff\1\172\1\114\1\122\2\103\1\uffff\1\105\1\uffff\1\172\1\uffff"+
        "\1\105\1\120\1\105\1\104\1\111\1\122\1\103\1\124\1\111\1\104\1\uffff"+
        "\2\105\1\116\1\124\1\uffff\1\120\1\101\1\172\1\uffff\2\172\1\116"+
        "\2\103\1\124\1\116\1\124\1\116\1\122\1\124\1\uffff\1\122\1\103\1"+
        "\uffff\2\105\1\172\1\uffff\1\105\1\uffff\1\172\1\131\2\uffff\1\104"+
        "\1\172\1\122\1\116\2\uffff\1\101\1\172\1\111\1\116\1\105\1\172\1"+
        "\111\1\105\1\172\1\105\1\uffff\1\172\2\uffff\1\101\1\123\1\101\1"+
        "\172\1\uffff\1\122\2\uffff\1\172\1\uffff\1\124\1\117\1\103\1\116"+
        "\1\122\1\172\2\uffff\1\124\3\101\1\120\1\uffff\1\117\1\uffff\1\172"+
        "\1\122\2\uffff\1\172\1\116\1\uffff\1\111\1\uffff\1\116\1\172\1\131"+
        "\2\uffff\1\105\1\172\1\111\1\104\1\107\1\uffff\1\105\1\172\1\106"+
        "\1\uffff\1\105\2\uffff\1\105\1\uffff\1\111\1\115\1\uffff\1\124\1"+
        "\172\1\101\2\172\1\122\1\uffff\1\172\1\122\1\172\1\101\1\172\1\116"+
        "\2\172\1\124\1\172\1\124\1\172\1\uffff\1\172\1\114\1\172\1\117\1"+
        "\131\1\137\1\172\1\104\1\172\1\uffff\1\103\1\uffff\1\55\1\111\1"+
        "\uffff\1\106\2\172\1\132\1\117\4\uffff\1\114\1\uffff\1\107\1\uffff"+
        "\1\117\1\uffff\1\114\1\172\1\123\1\uffff\1\172\1\117\2\122\1\101"+
        "\1\105\1\uffff\1\172\1\111\1\uffff\1\120\3\172\1\111\1\107\1\172"+
        "\1\116\1\123\1\137\1\101\1\105\1\124\1\105\1\104\1\172\1\105\1\uffff"+
        "\1\102\1\114\1\124\1\172\1\uffff\2\105\1\104\1\124\1\172\1\103\1"+
        "\102\1\105\1\117\1\123\1\115\1\105\1\172\2\105\1\116\2\uffff\1\116"+
        "\4\172\1\116\2\172\1\131\1\122\1\120\3\uffff\2\172\1\101\1\uffff"+
        "\1\126\1\105\2\111\1\125\1\120\1\131\1\111\1\124\2\uffff\1\117\1"+
        "\123\1\uffff\1\104\1\172\1\101\1\105\1\172\1\uffff\3\172\1\127\2"+
        "\103\1\124\1\105\1\115\1\172\1\116\2\172\1\111\1\172\1\103\3\uffff"+
        "\1\172\2\124\1\105\1\124\1\172\1\125\1\124\1\105\1\101\1\124\1\122"+
        "\1\172\1\uffff\1\172\1\uffff\1\55\1\105\1\uffff\1\172\2\124\1\uffff"+
        "\1\116\1\107\1\115\1\uffff\1\101\1\104\1\uffff\2\172\1\uffff\1\122"+
        "\1\172\1\124\1\uffff\1\111\1\105\1\122\1\124\1\107\1\172\1\115\1"+
        "\uffff\1\172\1\115\1\124\1\122\1\105\1\116\1\uffff\1\115\1\105\1"+
        "\uffff\1\172\1\116\1\172\1\117\1\uffff\1\120\1\104\1\uffff\1\126"+
        "\2\105\1\123\1\uffff\1\122\2\172\1\132\1\115\1\105\1\uffff\1\124"+
        "\2\uffff\1\117\1\uffff\1\122\1\172\1\uffff\1\124\1\uffff\1\124\2"+
        "\uffff\1\101\1\uffff\1\111\1\uffff\1\172\1\uffff\1\111\1\uffff\1"+
        "\124\1\172\1\126\1\uffff\1\101\1\uffff\1\172\1\uffff\1\124\1\117"+
        "\1\122\2\uffff\1\105\1\122\2\172\1\116\1\172\1\uffff\1\172\1\uffff"+
        "\1\122\1\111\1\172\1\114\1\103\1\uffff\1\117\1\105\3\uffff\1\126"+
        "\1\105\1\uffff\1\172\1\111\1\123\1\114\1\104\4\172\1\uffff\1\104"+
        "\1\105\1\172\1\105\1\uffff\1\116\1\104\2\172\1\uffff\1\124\1\125"+
        "\1\172\1\122\3\105\1\uffff\2\122\1\107\1\172\2\uffff\1\172\2\uffff"+
        "\1\172\2\uffff\2\172\1\101\2\uffff\1\104\1\105\1\172\1\117\1\116"+
        "\1\122\1\101\1\172\1\117\1\172\1\111\1\124\1\172\1\uffff\1\124\1"+
        "\172\4\uffff\1\105\1\122\1\124\1\105\2\172\1\111\1\uffff\1\103\2"+
        "\uffff\1\117\1\uffff\1\113\1\172\1\uffff\1\111\3\172\1\uffff\1\105"+
        "\1\172\1\116\1\111\1\117\1\172\3\uffff\1\172\1\uffff\1\172\1\101"+
        "\3\172\1\105\1\114\2\172\1\uffff\1\172\1\uffff\1\105\1\132\1\172"+
        "\1\115\1\111\1\172\1\uffff\1\120\1\uffff\1\120\1\105\1\131\1\122"+
        "\1\172\1\101\1\104\1\uffff\1\107\1\uffff\1\111\1\105\1\172\1\105"+
        "\2\104\1\124\1\101\2\uffff\1\101\1\111\1\172\1\111\1\120\1\105\1"+
        "\101\1\172\1\102\1\103\1\uffff\1\116\1\104\1\172\1\uffff\1\111\1"+
        "\105\1\124\1\105\1\122\1\111\2\172\2\uffff\1\172\2\uffff\1\115\1"+
        "\126\1\172\1\124\1\116\1\122\1\105\1\172\1\uffff\1\117\1\116\2\172"+
        "\1\uffff\1\172\2\uffff\2\172\1\104\1\103\1\172\2\uffff\1\172\1\124"+
        "\1\172\1\uffff\1\131\2\172\1\113\2\124\1\172\5\uffff\1\122\2\172"+
        "\1\uffff\1\116\1\107\1\105\1\114\1\uffff\1\116\1\uffff\1\116\1\172"+
        "\1\uffff\1\111\1\uffff\1\101\1\111\2\172\2\uffff\1\132\1\105\1\116"+
        "\1\172\1\uffff\2\117\3\uffff\1\172\1\uffff\1\101\1\116\1\122\1\104"+
        "\1\124\2\uffff\1\124\1\uffff\1\172\2\uffff\1\117\1\uffff\1\116\1"+
        "\111\2\uffff\1\172\1\101\1\uffff\1\172\1\117\1\uffff\1\114\1\172"+
        "\1\104\1\172\1\124\1\172\1\uffff\1\124\2\172\1\116\1\172\1\uffff"+
        "\3\172\1\101\1\103\2\124\1\uffff\1\117\1\105\1\116\1\102\1\uffff"+
        "\1\114\1\123\1\107\2\172\1\uffff\1\115\1\122\1\105\1\172\1\115\1"+
        "\126\3\uffff\1\101\1\105\1\uffff\2\172\1\124\1\172\1\uffff\1\116"+
        "\1\101\5\uffff\1\172\1\131\2\uffff\1\105\1\172\1\105\1\172\2\uffff"+
        "\1\172\2\111\1\uffff\1\101\2\uffff\3\172\1\123\2\172\1\uffff\1\117"+
        "\1\104\1\124\2\uffff\1\101\1\123\1\172\1\uffff\2\116\1\uffff\2\124"+
        "\2\172\2\101\1\111\1\uffff\1\103\1\124\1\132\1\uffff\1\124\1\uffff"+
        "\1\116\1\105\1\117\1\uffff\1\172\1\uffff\1\111\1\uffff\1\172\2\uffff"+
        "\1\172\4\uffff\1\115\1\124\1\111\1\172\1\116\1\122\1\124\1\101\1"+
        "\105\1\172\1\137\2\uffff\1\105\1\123\1\172\1\uffff\1\101\1\105\1"+
        "\124\1\122\2\uffff\1\111\1\uffff\1\172\1\120\1\uffff\2\172\1\uffff"+
        "\1\123\2\uffff\2\105\1\114\3\uffff\2\172\1\104\2\uffff\1\116\2\105"+
        "\1\124\1\172\1\uffff\1\172\1\123\1\105\2\172\2\uffff\2\124\1\115"+
        "\1\101\1\172\1\105\1\111\2\172\1\103\1\uffff\1\105\2\uffff\1\120"+
        "\1\111\1\117\1\uffff\1\172\1\124\1\137\1\123\1\172\1\uffff\1\120"+
        "\1\172\1\111\1\uffff\1\124\1\122\2\172\1\105\1\uffff\1\123\1\uffff"+
        "\1\172\1\uffff\1\172\2\123\1\114\2\uffff\2\172\2\122\1\111\2\uffff"+
        "\1\104\2\172\2\uffff\1\125\2\105\1\124\1\uffff\1\104\1\117\1\172"+
        "\1\114\2\uffff\1\101\1\123\1\172\1\117\1\116\1\uffff\1\111\1\123"+
        "\1\105\1\uffff\1\117\1\uffff\1\117\2\172\2\uffff\1\123\1\110\2\uffff"+
        "\2\172\1\105\2\uffff\2\172\1\117\1\172\2\uffff\1\123\1\172\1\123"+
        "\1\111\1\172\1\116\1\uffff\1\172\1\114\1\172\1\uffff\1\116\1\172"+
        "\1\105\1\116\1\172\1\114\1\116\2\uffff\1\172\1\117\2\uffff\1\114"+
        "\2\uffff\1\116\1\uffff\1\172\1\uffff\1\124\1\117\1\uffff\1\172\1"+
        "\uffff\1\124\1\uffff\1\172\1\uffff\1\123\1\101\1\uffff\1\111\1\172"+
        "\1\uffff\1\124\1\111\1\172\1\uffff\1\101\1\116\1\uffff\1\132\1\uffff"+
        "\1\172\1\120\1\103\1\uffff\2\123\1\uffff\1\115\2\172\1\uffff\1\123"+
        "\1\131\1\172\1\115\1\120\2\uffff\1\110\1\172\1\uffff\2\172\1\117"+
        "\3\uffff\1\124\1\172\1\uffff";
    static final String DFA32_acceptS =
        "\34\uffff\1\u0181\1\u0182\1\u0183\1\u0184\1\u0185\1\u0186\1\u0187"+
        "\1\u0188\1\u0189\1\u018a\1\u018b\3\uffff\1\u0193\1\uffff\1\u0195"+
        "\1\u0196\1\u0198\1\u0199\1\uffff\1\u019c\1\u019d\1\u019f\2\uffff"+
        "\1\u01a5\1\u01a6\1\u01a7\65\uffff\1\u018d\1\11\111\uffff\1\173\1"+
        "\u00ae\1\u00af\1\u019e\2\uffff\1\u018f\1\u0190\1\u0191\1\u01a9\1"+
        "\u0192\1\u01a8\1\u0194\1\u019b\1\u019a\5\uffff\1\u01a4\11\uffff"+
        "\1\120\51\uffff\1\31\10\uffff\1\u0158\37\uffff\1\10\3\uffff\1\45"+
        "\1\uffff\1\u008e\21\uffff\1\14\5\uffff\1\u00c3\2\uffff\1\104\34"+
        "\uffff\1\u0153\6\uffff\1\24\126\uffff\1\u018c\1\u018e\1\uffff\1"+
        "\u01a1\2\uffff\1\u01a2\3\uffff\1\u01a3\7\uffff\1\u017a\26\uffff"+
        "\1\u00f7\16\uffff\1\u00ec\1\uffff\1\u00b9\1\uffff\1\u010b\1\u016f"+
        "\1\uffff\1\4\1\uffff\1\7\1\13\1\uffff\1\16\1\u0162\3\uffff\1\u0091"+
        "\15\uffff\1\u00aa\14\uffff\1\u00cb\21\uffff\1\u008d\32\uffff\1\125"+
        "\23\uffff\1\u00b5\5\uffff\1\142\13\uffff\1\u0197\4\uffff\1\u011f"+
        "\2\uffff\1\u009b\52\uffff\1\u0099\27\uffff\1\161\33\uffff\1\u00a1"+
        "\10\uffff\1\150\17\uffff\1\u013b\2\uffff\1\u01a0\4\uffff\1\1\4\uffff"+
        "\1\u0169\4\uffff\1\137\3\uffff\1\u00b3\1\u017f\1\u016e\1\uffff\1"+
        "\u017b\1\30\1\44\4\uffff\1\u0098\14\uffff\1\u00cc\5\uffff\1\u0106"+
        "\16\uffff\1\5\1\uffff\1\71\3\uffff\1\u0103\1\uffff\1\u00e5\2\uffff"+
        "\1\57\16\uffff\1\u0161\1\uffff\1\u0171\1\6\4\uffff\1\105\4\uffff"+
        "\1\u0101\2\uffff\1\u0129\6\uffff\1\12\2\uffff\1\21\1\uffff\1\42"+
        "\1\u00ff\5\uffff\1\u00cd\1\74\1\uffff\1\u00bb\6\uffff\1\157\25\uffff"+
        "\1\u00b4\2\uffff\1\17\16\uffff\1\102\1\uffff\1\133\1\uffff\1\116"+
        "\3\uffff\1\u0142\3\uffff\1\u00dc\10\uffff\1\u0121\4\uffff\1\u00b2"+
        "\2\uffff\1\u00a3\2\uffff\1\u011e\1\uffff\1\u0128\1\uffff\1\u0149"+
        "\10\uffff\1\u015a\1\uffff\1\u00bd\1\uffff\1\u014b\1\uffff\1\u0151"+
        "\2\uffff\1\41\5\uffff\1\u0141\1\uffff\1\130\1\uffff\1\u00d5\12\uffff"+
        "\1\u0138\4\uffff\1\162\3\uffff\1\u0107\13\uffff\1\u0117\2\uffff"+
        "\1\u0163\3\uffff\1\u0159\1\uffff\1\144\2\uffff\1\u0090\1\u00b1\4"+
        "\uffff\1\u00f5\1\60\12\uffff\1\u0100\1\uffff\1\u0152\1\140\4\uffff"+
        "\1\u00c1\1\uffff\1\172\1\174\1\uffff\1\u011a\6\uffff\1\50\1\u00e7"+
        "\5\uffff\1\2\1\uffff\1\113\2\uffff\1\127\1\u013e\2\uffff\1\u0134"+
        "\1\uffff\1\u00bf\3\uffff\1\72\1\u00ab\5\uffff\1\65\3\uffff\1\110"+
        "\1\uffff\1\114\1\146\1\uffff\1\u010d\2\uffff\1\u013c\6\uffff\1\u00a2"+
        "\14\uffff\1\u0124\11\uffff\1\20\1\uffff\1\22\2\uffff\1\36\5\uffff"+
        "\1\u010e\1\u017e\1\175\1\u00a8\1\uffff\1\u012c\1\uffff\1\63\1\uffff"+
        "\1\u00ce\3\uffff\1\53\6\uffff\1\u0109\2\uffff\1\171\21\uffff\1\u0157"+
        "\4\uffff\1\u009d\20\uffff\1\23\1\u00c9\13\uffff\1\u011b\1\27\1\u00d4"+
        "\3\uffff\1\u012a\11\uffff\1\u014d\1\u00d7\2\uffff\1\43\5\uffff\1"+
        "\u00d6\20\uffff\1\u0108\1\u0093\1\u00d8\15\uffff\1\u00de\1\uffff"+
        "\1\u0150\2\uffff\1\u012f\3\uffff\1\u013f\3\uffff\1\u0097\2\uffff"+
        "\1\u00be\2\uffff\1\u011d\3\uffff\1\u00c2\7\uffff\1\51\6\uffff\1"+
        "\165\2\uffff\1\163\4\uffff\1\u013a\2\uffff\1\u00cf\4\uffff\1\u00f0"+
        "\6\uffff\1\u015e\1\uffff\1\156\1\32\1\uffff\1\u010c\2\uffff\1\u0123"+
        "\1\uffff\1\u00d0\1\uffff\1\143\1\147\1\uffff\1\176\1\uffff\1\u0143"+
        "\1\uffff\1\u00c7\1\uffff\1\u00f3\3\uffff\1\u0105\1\uffff\1\u0139"+
        "\1\uffff\1\u017d\3\uffff\1\u00a9\1\u00ed\6\uffff\1\34\1\uffff\1"+
        "\103\5\uffff\1\77\2\uffff\1\u016a\1\15\1\73\2\uffff\1\76\11\uffff"+
        "\1\u0084\4\uffff\1\u00bc\4\uffff\1\u0148\7\uffff\1\131\4\uffff\1"+
        "\126\1\u00dd\1\uffff\1\u008c\1\u00da\1\uffff\1\u0176\1\25\3\uffff"+
        "\1\u0165\1\u00f8\15\uffff\1\61\2\uffff\1\117\1\152\1\u0094\1\u00ca"+
        "\7\uffff\1\u0119\1\uffff\1\u0170\1\u0178\1\uffff\1\u00f4\2\uffff"+
        "\1\112\4\uffff\1\u0126\6\uffff\1\106\1\111\1\u017c\1\uffff\1\u00e1"+
        "\11\uffff\1\u0122\1\uffff\1\u0118\6\uffff\1\u00e2\1\uffff\1\123"+
        "\7\uffff\1\u0131\1\uffff\1\3\10\uffff\1\u00d9\1\u00e8\12\uffff\1"+
        "\u00c8\3\uffff\1\u0145\10\uffff\1\u00e6\1\u0167\1\uffff\1\u00a0"+
        "\1\54\10\uffff\1\u009a\4\uffff\1\u013d\1\uffff\1\u0087\1\167\5\uffff"+
        "\1\u00b0\1\u014f\3\uffff\1\u0085\7\uffff\1\122\1\160\1\u00db\1\26"+
        "\1\u011c\3\uffff\1\75\4\uffff\1\u0130\1\uffff\1\u008f\2\uffff\1"+
        "\55\1\uffff\1\u0092\4\uffff\1\u016b\1\u0114\4\uffff\1\52\2\uffff"+
        "\1\u0110\1\u00ea\1\121\1\uffff\1\u00e0\5\uffff\1\67\1\u00f2\1\uffff"+
        "\1\u00fc\1\uffff\1\u00b6\1\u015b\1\uffff\1\u0089\2\uffff\1\u0140"+
        "\1\145\2\uffff\1\u0104\2\uffff\1\u0168\6\uffff\1\u0096\5\uffff\1"+
        "\u00d3\7\uffff\1\u014e\4\uffff\1\124\5\uffff\1\u012d\6\uffff\1\u0180"+
        "\1\u0146\1\u0088\2\uffff\1\141\4\uffff\1\u010a\2\uffff\1\107\1\u009c"+
        "\1\u0086\1\u0135\1\115\2\uffff\1\u00a4\1\33\4\uffff\1\u00c4\1\134"+
        "\3\uffff\1\u0102\1\uffff\1\u015c\1\40\6\uffff\1\u0164\3\uffff\1"+
        "\u00f1\1\u014a\3\uffff\1\u0127\2\uffff\1\u00df\7\uffff\1\101\3\uffff"+
        "\1\u0136\1\uffff\1\64\3\uffff\1\135\1\uffff\1\u0095\1\uffff\1\56"+
        "\1\uffff\1\u009e\1\u00fb\1\uffff\1\151\1\u00e9\1\u00f9\1\u015f\13"+
        "\uffff\1\u0156\1\u0177\3\uffff\1\35\4\uffff\1\u00c0\1\u012b\1\uffff"+
        "\1\u00d1\2\uffff\1\164\2\uffff\1\62\1\uffff\1\u00c5\1\u0120\3\uffff"+
        "\1\132\1\u00fa\1\u00d2\3\uffff\1\46\1\u0166\5\uffff\1\u0179\5\uffff"+
        "\1\u016c\1\154\12\uffff\1\166\1\uffff\1\177\1\37\3\uffff\1\u012e"+
        "\5\uffff\1\u00eb\3\uffff\1\u0137\5\uffff\1\u0147\1\uffff\1\u009f"+
        "\1\uffff\1\70\4\uffff\1\u010f\1\47\5\uffff\1\u0132\1\170\3\uffff"+
        "\1\u0133\1\u016d\4\uffff\1\u015d\4\uffff\1\u0125\1\u008b\5\uffff"+
        "\1\u0160\3\uffff\1\u00b7\1\uffff\1\u0172\3\uffff\1\u0080\1\u0082"+
        "\2\uffff\1\155\1\u00f6\3\uffff\1\153\1\100\4\uffff\1\u0111\1\u00ee"+
        "\6\uffff\1\u0112\3\uffff\1\u00ba\7\uffff\1\u0081\1\u0083\2\uffff"+
        "\1\u00a6\1\u00a7\1\uffff\1\u00e3\1\u00e4\1\uffff\1\66\1\uffff\1"+
        "\u00fd\2\uffff\1\u00c6\1\uffff\1\u0113\1\uffff\1\u00ac\1\uffff\1"+
        "\u0115\2\uffff\1\u00ef\2\uffff\1\u00ad\3\uffff\1\u00b8\2\uffff\1"+
        "\u0144\1\uffff\1\u0154\3\uffff\1\u0173\2\uffff\1\u0116\3\uffff\1"+
        "\u00a5\5\uffff\1\u008a\1\136\2\uffff\1\u0174\3\uffff\1\u0155\1\u014c"+
        "\1\u00fe\2\uffff\1\u0175";
    static final String DFA32_specialS =
        "\u0805\uffff}>";
    static final String[] DFA32_transitionS = {
            "\2\70\2\uffff\1\70\22\uffff\1\70\1\10\2\uffff\1\32\1\55\1\56"+
            "\1\uffff\1\40\1\41\1\54\1\52\1\36\1\53\1\34\1\51\1\64\11\65"+
            "\1\35\1\37\1\47\1\46\1\50\1\62\1\uffff\1\4\1\16\1\25\1\14\1"+
            "\13\1\2\1\15\1\17\1\12\1\23\1\31\1\11\1\26\1\6\1\7\1\22\1\20"+
            "\1\24\1\5\1\1\1\3\1\30\1\21\1\66\1\33\1\27\1\42\1\uffff\1\43"+
            "\1\61\1\67\33\66\1\44\1\60\1\45\1\57",
            "\1\72\1\76\2\uffff\1\75\2\uffff\1\77\1\74\5\uffff\1\73\2\uffff"+
            "\1\71\6\uffff\1\100",
            "\1\101\3\uffff\1\107\3\uffff\1\104\2\uffff\1\105\2\uffff\1"+
            "\106\2\uffff\1\102\2\uffff\1\103",
            "\1\110\1\uffff\1\113\1\uffff\1\114\1\111\1\112",
            "\1\124\1\125\1\122\1\uffff\1\120\5\uffff\1\115\1\uffff\1\116"+
            "\1\uffff\1\127\1\uffff\1\121\1\117\1\126\1\123",
            "\1\135\1\uffff\1\131\2\uffff\1\132\2\uffff\1\137\1\uffff\1"+
            "\133\1\140\1\130\1\143\2\uffff\1\136\1\134\1\141\3\uffff\1\142",
            "\1\144\5\uffff\1\145",
            "\1\152\5\uffff\1\155\1\uffff\1\151\1\uffff\1\153\1\uffff\1"+
            "\146\2\uffff\1\150\1\147\1\154",
            "\1\156",
            "\1\161\3\uffff\1\162\3\uffff\1\160\5\uffff\1\163",
            "\1\171\1\uffff\1\164\1\172\5\uffff\1\166\1\165\4\uffff\1\167"+
            "\1\170",
            "\1\176\1\uffff\1\175\4\uffff\1\174\2\uffff\1\177\1\uffff\1"+
            "\173",
            "\1\u0082\1\u0086\1\u0087\1\u0085\1\u0080\3\uffff\1\u0081\5"+
            "\uffff\1\u0084\2\uffff\1\u0083\2\uffff\1\u0088",
            "\1\u0089",
            "\1\u008e\3\uffff\1\u008c\5\uffff\1\u008b\2\uffff\1\u008f\2"+
            "\uffff\1\u008d\3\uffff\1\u008a",
            "\1\u0090\15\uffff\1\u0091",
            "\1\u0092",
            "\1\u0098\3\uffff\1\u0095\2\uffff\1\u0093\1\u0094\5\uffff\1"+
            "\u0096\2\uffff\1\u0097",
            "\1\u009a\3\uffff\1\u009b\5\uffff\1\u009f\1\u009c\2\uffff\1"+
            "\u009e\2\uffff\1\u0099\2\uffff\1\u009d",
            "\1\u00a1\15\uffff\1\u00a0",
            "\1\u00a6\3\uffff\1\u00a3\3\uffff\1\u00a2\2\uffff\1\u00a5\2"+
            "\uffff\1\u00a4",
            "\1\u00ab\1\u00ac\5\uffff\1\u00aa\3\uffff\1\u00a8\2\uffff\1"+
            "\u00a7\2\uffff\1\u00a9\2\uffff\1\u00ad",
            "\1\u00b0\3\uffff\1\u00af\3\uffff\1\u00b1\5\uffff\1\u00b2\3"+
            "\uffff\1\u00ae",
            "\1\u00b3",
            "\1\u00b4\3\uffff\1\u00b6\3\uffff\1\u00b5",
            "\1\u00b7\3\uffff\1\u00b8",
            "\1\u00bb\5\uffff\1\u00b9\12\uffff\1\u00ba",
            "\1\u00bd",
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
            "\1\u00be\1\156",
            "\1\u00c0",
            "\1\u00c2",
            "",
            "\1\u00c4",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "",
            "",
            "",
            "\1\u00cb\1\uffff\12\u00ca\7\uffff\1\66\1\u00cf\1\66\1\u00ce"+
            "\1\u00cc\1\66\1\u00d0\3\66\1\u00d0\1\u00c9\1\u00d0\5\66\1\u00c9"+
            "\4\66\1\u00c8\1\u00c9\1\66\4\uffff\1\66\1\uffff\1\66\1\u00d0"+
            "\2\66\1\u00cc\1\66\1\u00d0\3\66\1\u00d0\1\66\1\u00d0\15\66",
            "\1\u00cb\1\uffff\12\u00ca\7\uffff\1\66\1\u00cf\1\66\1\u00ce"+
            "\1\u00cc\1\66\1\u00d0\3\66\1\u00d0\1\u00c9\1\u00d0\5\66\1\u00c9"+
            "\5\66\1\u00c9\1\66\4\uffff\1\66\1\uffff\1\66\1\u00d0\2\66\1"+
            "\u00cc\1\66\1\u00d0\3\66\1\u00d0\1\66\1\u00d0\15\66",
            "",
            "",
            "",
            "\1\u00d2\7\uffff\1\u00d3\13\uffff\1\u00d1",
            "\1\u00d4\4\uffff\1\u00d5",
            "\12\66\7\uffff\24\66\1\u00d6\5\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00d9\1\u00d8",
            "\1\u00db\4\uffff\1\u00da",
            "\1\u00dc",
            "\1\u00de\3\uffff\1\u00dd",
            "\1\u00df",
            "\1\u00e0\6\uffff\1\u00e1",
            "\1\u00e2",
            "\1\u00e3\1\uffff\1\u00e4",
            "\1\u00e6\6\uffff\1\u00e7\5\uffff\1\u00e5",
            "\1\u00e8",
            "\1\u00ea\5\uffff\1\u00e9",
            "\1\u00eb",
            "\1\u00f1\1\u00f2\1\uffff\1\u00ef\4\uffff\1\u00ed\1\uffff\1"+
            "\u00ec\1\u00f0\1\u00f3\5\uffff\1\u00ee",
            "\1\u00f5\3\uffff\1\u00f4",
            "\1\u00f6",
            "\1\u00f7",
            "\1\u00f8\2\uffff\1\u00f9",
            "\1\u00fa\7\uffff\1\u00fb",
            "\1\u00fe\2\uffff\1\u00fc\24\uffff\1\u00fd",
            "\12\66\7\uffff\2\66\1\u00ff\20\66\1\u0100\6\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\1\u0102",
            "\1\u0104\16\uffff\1\u0103",
            "\1\u0105\10\uffff\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\1\u0109",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u010b",
            "\1\u010c\4\uffff\1\u010d",
            "\1\u0112\10\uffff\1\u010e\1\u0111\4\uffff\1\u010f\1\uffff\1"+
            "\u0110",
            "\1\u0114\15\uffff\1\u0113",
            "\1\u0115",
            "\1\u0118\15\uffff\1\u0117\2\uffff\1\u0116",
            "\1\u0119",
            "\1\u011a",
            "\1\u011b",
            "\1\u011c",
            "\1\u011d",
            "\1\u011e\4\uffff\1\u011f",
            "\1\u0120",
            "\1\u0121\3\uffff\1\u0125\1\u0123\1\u0122\1\uffff\1\u0124",
            "\1\u0126\1\u0127",
            "\12\66\7\uffff\3\66\1\u0128\13\66\1\u0129\12\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\1\u012b",
            "\1\u012c",
            "\12\66\7\uffff\13\66\1\u012d\16\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\12\66\7\uffff\5\66\1\u012f\24\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0132\16\uffff\1\u0131",
            "\1\u0133",
            "\1\u0134",
            "",
            "",
            "\1\u0135\1\uffff\1\u0137\1\u0136",
            "\1\u0138\1\u0139",
            "\1\u013d\4\uffff\1\u013a\14\uffff\1\u013b\2\uffff\1\u013c",
            "\1\u013f\1\uffff\1\u013e\3\uffff\1\u0140\6\uffff\1\u0141",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\3\66\1\u0144\11\66\1\u0147\1\66\1\u0145\2\66"+
            "\1\u0143\1\u0146\6\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0149",
            "\12\66\7\uffff\16\66\1\u014a\13\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u014c",
            "\1\u014d",
            "\1\u014e",
            "\1\u0150\1\uffff\1\u0153\3\uffff\1\u014f\6\uffff\1\u0151\3"+
            "\uffff\1\u0152",
            "\1\u0154",
            "\1\u0155\2\uffff\1\u0156\1\uffff\1\u0157",
            "\1\u0158",
            "\1\u0159",
            "\1\u015d\1\u015b\2\uffff\1\u015f\5\uffff\1\u015c\3\uffff\1"+
            "\u015e\2\uffff\1\u015a\1\u0160",
            "\1\u0162\1\u0161\2\uffff\1\u0163",
            "\1\u0164\4\uffff\1\u0165",
            "\1\u0166",
            "\12\66\7\uffff\24\66\1\u0167\5\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0169",
            "\1\u016a",
            "\1\u016b",
            "\1\u016c",
            "\1\u016e\15\uffff\1\u016d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0170\4\uffff\1\u0171",
            "\1\u0172\6\uffff\1\u0173",
            "\1\u0174",
            "\1\u0175\15\uffff\1\u0176",
            "\1\u0177",
            "\1\u0178",
            "\1\u0179",
            "\1\u017a\3\uffff\1\u017b",
            "\1\u017c\3\uffff\1\u017d",
            "\1\u017f\5\uffff\1\u017e",
            "\1\u0180",
            "\1\u0181",
            "\1\u0182",
            "\1\u0183",
            "\1\u0184\3\uffff\1\u0186\5\uffff\1\u0185",
            "\1\u0187\1\uffff\1\u0188",
            "\1\u0189",
            "\1\u018b\23\uffff\1\u018a",
            "\1\u018c",
            "\1\u018d",
            "\1\u018e",
            "\1\u018f",
            "\1\u0190",
            "\1\u0191",
            "\1\u0195\1\u0192\1\u0199\1\u0196\1\uffff\1\u019e\1\u0197\4"+
            "\uffff\1\u019d\1\u019f\1\u0194\1\u019c\1\u0193\2\uffff\1\u019a"+
            "\1\u01a0\1\uffff\1\u0198\1\u019b",
            "\1\u01a2\12\uffff\1\u01a1",
            "\1\u01a3",
            "\1\u01a4",
            "\1\u01a5\1\u01a6\1\u01a7\4\uffff\1\u01a8",
            "\1\u01a9",
            "\1\u01aa\11\uffff\1\u01ab",
            "\1\u01ac\3\uffff\1\u01ad",
            "\1\u01af\17\uffff\1\u01ae",
            "\1\u01b0",
            "\1\u01b2\17\uffff\1\u01b1",
            "\1\u01b3",
            "\1\u01b5\1\uffff\1\u01b4",
            "\1\u01b8\12\uffff\1\u01b7\1\uffff\1\u01b6\3\uffff\1\u01b9",
            "\1\u01ba",
            "\1\u01bc\3\uffff\1\u01bb\3\uffff\1\u01bd",
            "\1\u01be",
            "\1\u01c0\5\uffff\1\u01bf",
            "\1\u01c1",
            "\1\u01c2",
            "\1\u01c3",
            "\1\u01c4",
            "",
            "",
            "",
            "",
            "\1\u01c5",
            "\1\u01c6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\12\u01c8\7\uffff\6\u01c8\32\uffff\6\u01c8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u00cb\1\uffff\12\u00ca\7\uffff\1\66\1\u00cf\1\66\1\u00ce"+
            "\1\u00cc\1\66\1\u00d0\3\66\1\u00d0\1\u00c9\1\u00d0\5\66\1\u00c9"+
            "\5\66\1\u00c9\1\66\4\uffff\1\66\1\uffff\1\66\1\u00d0\2\66\1"+
            "\u00cc\1\66\1\u00d0\3\66\1\u00d0\1\66\1\u00d0\15\66",
            "\12\u01ca\10\uffff\1\u01cc\1\uffff\1\u01cc\1\u01cb\37\uffff"+
            "\1\u01cb",
            "\1\u01cd\1\uffff\1\u01cd\2\uffff\12\u01ce",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\3\66\1\u01cf\26\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d1\10\uffff\1\u01d2",
            "\1\u01d4\4\uffff\1\u01d3",
            "\1\u01d5\5\uffff\1\u01d6",
            "\1\u01d7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u01d9",
            "",
            "\1\u01da",
            "\1\u01db",
            "\1\u01dc",
            "\1\u01dd",
            "\1\u01de",
            "\1\u01df",
            "\1\u01e0",
            "\1\u01e1",
            "\1\u01e2",
            "\1\u01e3",
            "\1\u01e4",
            "\1\u01e5",
            "\1\u01e6",
            "\1\u01e7",
            "\1\u01e8",
            "\1\u01e9",
            "\1\u01ea\15\uffff\1\u01eb",
            "\12\66\7\uffff\2\66\1\u01ee\1\66\1\u01ed\7\66\1\u01ec\15\66"+
            "\4\uffff\1\66\1\uffff\32\66",
            "\1\u01f0",
            "\1\u01f1",
            "\1\u01f2",
            "\1\u01f4\1\uffff\1\u01f3",
            "\1\u01f5\3\uffff\1\u01f6",
            "\1\u01f7",
            "\1\u01f8",
            "\1\u01f9",
            "\1\u01fa",
            "\1\u01fb",
            "\1\u01fc",
            "\12\66\7\uffff\21\66\1\u01fd\10\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\12\66\7\uffff\32\66\4\uffff\1\u01ff\1\uffff\32\66",
            "\1\u0201",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\16\66\1\u0204\13\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0206",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0209",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u020c",
            "\1\u020d",
            "\1\u020e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0210",
            "\1\u0211\6\uffff\1\u0212",
            "\1\u0213",
            "\1\u0214",
            "",
            "\1\u0215",
            "\1\u0216",
            "\1\u0217",
            "\1\u0218",
            "\1\u0219\21\uffff\1\u021a",
            "\12\66\7\uffff\22\66\1\u021b\7\66\4\uffff\1\u021c\1\uffff\32"+
            "\66",
            "\1\u021e",
            "\1\u021f",
            "\1\u0220",
            "\1\u0221",
            "\1\u0222",
            "\1\u0225\3\uffff\1\u0223\13\uffff\1\u0224",
            "\1\u0226",
            "\1\u0228\1\uffff\1\u0227",
            "\1\u0229",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u022b",
            "\1\u022c",
            "\1\u022d",
            "\1\u022e",
            "\1\u022f",
            "\1\u0230",
            "\1\u0231",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0232",
            "\1\u0233",
            "\1\u0234",
            "\1\u0235",
            "\1\u0236",
            "\1\u0237",
            "\1\u0238",
            "",
            "\1\u0239",
            "\12\66\7\uffff\4\66\1\u023a\12\66\1\u023b\12\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\1\u023d",
            "",
            "\1\u023e",
            "",
            "\1\u023f",
            "\1\u0240",
            "\1\u0241",
            "\1\u0242",
            "\1\u0243",
            "\1\u0244",
            "\1\u0245",
            "\1\u0246",
            "\1\u0247",
            "\1\u0248",
            "\1\u0249",
            "\1\u024a",
            "\1\u024b",
            "\1\u024c\11\uffff\1\u024d",
            "\1\u024e",
            "\1\u024f",
            "\1\u0250",
            "",
            "\1\u0251",
            "\1\u0252",
            "\1\u0253\23\uffff\1\u0254",
            "\12\66\7\uffff\4\66\1\u0255\11\66\1\u0256\13\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\1\u0258",
            "",
            "\1\u0259",
            "\1\u025a",
            "",
            "\1\u025b",
            "\1\u025c",
            "\1\u025d",
            "\1\u025e",
            "\1\u025f\2\uffff\1\u0261\3\uffff\1\u0260",
            "\1\u0265\2\uffff\1\u0263\2\uffff\1\u0262\2\uffff\1\u0264",
            "\1\u0266\14\uffff\1\u0267",
            "\1\u0268",
            "\1\u0269",
            "\1\u026a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u026c",
            "\1\u026d",
            "\1\u026e",
            "\1\u026f",
            "\12\66\7\uffff\10\66\1\u0270\21\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0273\3\uffff\1\u0272",
            "\1\u0274",
            "\1\u0275",
            "\1\u0278\3\uffff\1\u0276\3\uffff\1\u0277",
            "\1\u0279",
            "\1\u027b\22\uffff\1\u027a",
            "\1\u027c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u027e\3\uffff\1\u027f",
            "\12\66\7\uffff\16\66\1\u0281\3\66\1\u0280\7\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\1\u0283",
            "\1\u0284",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0286",
            "\1\u0287",
            "\1\u0288",
            "\1\u0289",
            "\1\u028a",
            "",
            "\1\u028b",
            "\1\u028c",
            "\1\u028d",
            "\1\u028e",
            "\1\u028f",
            "\1\u0290",
            "\1\u0291",
            "\1\u0292",
            "\1\u0293",
            "\1\u0294",
            "\1\u0295\5\uffff\1\u0296",
            "\1\u0297",
            "\1\u0299\3\uffff\1\u0298",
            "\1\u029a",
            "\1\u029b",
            "\1\u029c",
            "\1\u029d",
            "\1\u029e",
            "\1\u029f",
            "\1\u02a0",
            "\1\u02a3\14\uffff\1\u02a2\2\uffff\1\u02a1",
            "\1\u02a4",
            "\1\u02a6\1\u02a5",
            "\1\u02a7",
            "\1\u02a8",
            "\1\u02a9",
            "\1\u02aa",
            "\1\u02ab",
            "\1\u02ac",
            "\1\u02ad",
            "\1\u02ae",
            "\1\u02af",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02b1",
            "\1\u02b2",
            "\1\u02b3\12\uffff\1\u02b4",
            "\1\u02b5",
            "\1\u02b7\7\uffff\1\u02b6",
            "\1\u02b8",
            "\1\u02b9",
            "\1\u02ba",
            "\1\u02bb",
            "\1\u02bd\1\u02be\3\uffff\1\u02bc",
            "\1\u02bf",
            "\1\u02c0",
            "\1\u02c1\11\uffff\1\u02c2",
            "\1\u02c3",
            "\1\u02c4",
            "\1\u02c5\3\uffff\1\u02c6",
            "\12\66\7\uffff\22\66\1\u02c7\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02ca\6\uffff\1\u02c9",
            "\1\u02cb",
            "\1\u02cc",
            "\1\u02ce\10\uffff\1\u02cd",
            "\1\u02d0\2\uffff\1\u02cf",
            "\1\u02d3\2\uffff\1\u02d4\7\uffff\1\u02d6\4\uffff\1\u02d5\1"+
            "\u02d1\1\uffff\1\u02d2",
            "\1\u02d7",
            "\1\u02d8",
            "\1\u02d9",
            "\1\u02db\4\uffff\1\u02da",
            "\1\u02dc\3\uffff\1\u02dd",
            "\1\u02de\16\uffff\1\u02df",
            "\1\u02e2\1\uffff\1\u02e1\16\uffff\1\u02e0",
            "\1\u02e3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02e6\1\u02e5",
            "\1\u02e7",
            "\1\u02e8",
            "\1\u02e9",
            "\1\u02ea",
            "\12\66\7\uffff\11\66\1\u02eb\5\66\1\u02ec\12\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\1\u02ee",
            "\1\u02ef",
            "\1\u02f1\1\uffff\1\u02f0",
            "\1\u02f2",
            "\1\u02f3",
            "\1\u02f4",
            "\1\u02f5",
            "\1\u02f6",
            "\1\u02f7",
            "\1\u02f9\13\uffff\1\u02f8",
            "\1\u02fa",
            "\1\u02fb",
            "\12\66\7\uffff\22\66\1\u02fc\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u02fe",
            "\1\u02ff",
            "",
            "",
            "\12\u01c8\7\uffff\6\u01c8\24\66\4\uffff\1\66\1\uffff\6\u01c8"+
            "\24\66",
            "",
            "\12\u01ca\10\uffff\1\u01cc\1\uffff\1\u01cc\1\u01cb\37\uffff"+
            "\1\u01cb",
            "\1\u0301\1\uffff\1\u0301\2\uffff\12\u0302",
            "",
            "\12\u0303",
            "\12\u01ce\7\uffff\1\66\1\u0304\1\66\1\u00ce\26\66\4\uffff\1"+
            "\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0306",
            "\1\u0307",
            "\1\u0308",
            "\1\u0309",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u030b",
            "",
            "\1\u030c",
            "\1\u030d",
            "\12\66\7\uffff\22\66\1\u030e\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0310",
            "\1\u0311",
            "\1\u0312",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0316",
            "\1\u0317",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u031a",
            "\1\u031b",
            "\1\u031c",
            "\12\66\7\uffff\5\66\1\u031d\24\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u031f",
            "\1\u0320",
            "\1\u0321",
            "\1\u0322",
            "\1\u0323",
            "",
            "\1\u0324",
            "\1\u0325",
            "\1\u0326",
            "\1\u0327",
            "\1\u0328",
            "\1\u0329",
            "\1\u032a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u032c",
            "\1\u032d",
            "\1\u032e",
            "\1\u032f",
            "\1\u0330",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0332",
            "",
            "\1\u0333",
            "",
            "",
            "\1\u0334",
            "",
            "\1\u0335",
            "",
            "",
            "\1\u0336",
            "",
            "",
            "\1\u0337",
            "\1\u0338",
            "\1\u0339",
            "",
            "\1\u033a",
            "\1\u033b",
            "\1\u033c",
            "\1\u033d",
            "\1\u033e",
            "\1\u033f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\4\66\1\u0341\25\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0343",
            "\1\u0344",
            "\1\u0345",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0347",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0349",
            "\12\66\7\uffff\32\66\4\uffff\1\u034a\1\uffff\32\66",
            "\1\u034c",
            "\1\u034d",
            "\1\u034e",
            "\1\u034f",
            "\1\u0350",
            "\1\u0351",
            "\1\u0352\13\uffff\1\u0353",
            "\1\u0354",
            "\1\u0356\10\uffff\1\u0355",
            "",
            "\1\u0357",
            "\1\u0358",
            "\1\u0359",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u035b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u035e",
            "\1\u035f",
            "\1\u0360",
            "\12\66\7\uffff\22\66\1\u0361\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0363",
            "\1\u0364",
            "\1\u0365",
            "\12\66\7\uffff\26\66\1\u0366\3\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0368",
            "\1\u0369",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u036b",
            "\1\u036d\1\uffff\1\u036c",
            "\1\u036e",
            "\1\u036f",
            "\1\u0370",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0372",
            "\1\u0373",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0375",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0378",
            "\1\u0379",
            "\1\u037a\7\uffff\1\u037b",
            "\12\66\7\uffff\22\66\1\u037c\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u037f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0381",
            "\1\u0382",
            "\1\u0383",
            "\1\u0384",
            "\1\u0385\12\uffff\1\u0386",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0388",
            "\1\u0389",
            "\1\u038a",
            "\1\u038b",
            "\1\u038c",
            "\1\u038d",
            "\1\u038e",
            "\1\u038f",
            "\1\u0390",
            "\1\u0391",
            "\1\u0392",
            "\1\u0393",
            "\1\u0394",
            "\1\u0395",
            "\1\u0397\3\uffff\1\u0396",
            "\1\u0398",
            "\1\u0399",
            "\1\u039a",
            "\1\u039b",
            "",
            "\1\u039c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u039e",
            "\12\66\7\uffff\21\66\1\u039f\10\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u03a1",
            "",
            "\1\u03a2",
            "\1\u03a3",
            "\1\u03a4",
            "\1\u03a5",
            "\1\u03a6",
            "\1\u03a7",
            "\1\u03a8",
            "\1\u03a9",
            "\1\u03aa\10\uffff\1\u03ab",
            "\1\u03ac",
            "\1\u03ad",
            "",
            "\12\66\7\uffff\1\66\1\u03ae\30\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\23\66\1\u03b0\6\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03b2",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03b4",
            "",
            "\1\u03b5",
            "\1\u03b6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03b8",
            "\1\u03b9",
            "\1\u03ba",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03bc",
            "\1\u03bd",
            "\1\u03be",
            "\1\u03bf",
            "\1\u03c0",
            "\1\u03c1",
            "\1\u03c2",
            "\12\66\7\uffff\22\66\1\u03c3\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03c5",
            "\1\u03c6",
            "\1\u03c7",
            "\1\u03c8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03ca",
            "\12\66\7\uffff\10\66\1\u03cb\21\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u03cd",
            "\12\66\7\uffff\22\66\1\u03ce\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\13\66\1\u03d0\16\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u03d2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03d4",
            "\1\u03d5",
            "\1\u03d7\3\uffff\1\u03d6",
            "\1\u03d8",
            "\1\u03d9",
            "\1\u03da",
            "\1\u03db",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03dd",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\22\66\1\u03df\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03e1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03e3",
            "\12\66\7\uffff\2\66\1\u03e4\27\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u03e6",
            "\1\u03e7",
            "\1\u03e8",
            "\12\66\7\uffff\1\u03ea\7\66\1\u03e9\21\66\4\uffff\1\66\1\uffff"+
            "\32\66",
            "\1\u03ec",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\22\66\1\u03ee\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03f0",
            "\1\u03f1",
            "\1\u03f2",
            "\1\u03f3",
            "\1\u03f4",
            "\1\u03f5",
            "\1\u03f6",
            "\1\u03f7",
            "\1\u03f8",
            "\1\u03f9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u03fb",
            "\1\u03fc",
            "\1\u03fd",
            "\1\u03fe",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0401\22\uffff\1\u0400",
            "\12\66\7\uffff\22\66\1\u0402\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0404",
            "\1\u0405",
            "\1\u0406",
            "\1\u0407",
            "\1\u0408\23\uffff\1\u0409",
            "\1\u040a\3\uffff\1\u040b",
            "\1\u040c",
            "\1\u040d",
            "\1\u040e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0410",
            "\1\u0411",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0413",
            "\1\u0414",
            "\1\u0415",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0417",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0419",
            "\1\u041a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u041d",
            "\1\u041e",
            "",
            "\1\u041f",
            "\1\u0420",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0423",
            "\1\u0424",
            "\1\u0425",
            "\1\u0426",
            "",
            "\1\u0427",
            "\1\u0428",
            "\1\u0429",
            "\1\u042a",
            "\1\u042b\1\u042c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u042e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0431",
            "\1\u0432",
            "\1\u0433",
            "\12\66\7\uffff\22\66\1\u0434\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0436",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\22\66\1\u0439\7\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\u0302",
            "\12\u0302\10\uffff\1\u01cc\1\uffff\1\u01cc",
            "\12\u0303\10\uffff\1\u01cc\1\uffff\1\u01cc",
            "\1\u01cf",
            "",
            "\1\u043b",
            "\1\u043d\4\uffff\1\u043c",
            "\1\u043e",
            "\1\u043f",
            "",
            "\12\66\7\uffff\22\66\1\u0440\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0443",
            "\1\u0444",
            "",
            "\1\u0445",
            "\1\u0446",
            "\1\u0447",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "\1\u0449",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u044b",
            "\1\u044c",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u044f",
            "\1\u0450",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0452",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0454",
            "\1\u0455",
            "\12\66\7\uffff\23\66\1\u0456\6\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0459",
            "",
            "\1\u045a",
            "\1\u045b",
            "\1\u045c",
            "\1\u045d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u045f",
            "\1\u0460",
            "\1\u0461",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0463",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0466",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0468",
            "\1\u0469",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u046b\3\uffff\1\u046c",
            "\1\u046d",
            "",
            "\1\u046e",
            "",
            "\1\u046f",
            "\12\66\7\uffff\17\66\1\u0470\12\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0472",
            "",
            "\1\u0473",
            "",
            "\1\u0474",
            "\1\u0475",
            "",
            "\1\u0476",
            "\1\u0477",
            "\1\u0478",
            "\1\u0479",
            "\1\u047a",
            "\1\u047b",
            "\1\u047c",
            "\1\u047d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u047f",
            "\1\u0480",
            "\1\u0481",
            "\1\u0482",
            "\1\u0483",
            "",
            "\1\u0484",
            "",
            "",
            "\1\u0485",
            "\1\u0486",
            "\1\u0487",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0489",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u048b",
            "\1\u048c",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u048e",
            "",
            "\1\u048f",
            "\1\u0490",
            "\1\u0491",
            "\1\u0492",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0497",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0499",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u049b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u049d",
            "",
            "\1\u049e",
            "\12\66\7\uffff\4\66\1\u049f\25\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04a1",
            "\1\u04a3\1\uffff\1\u04a2",
            "\1\u04a4",
            "\1\u04a6\2\uffff\1\u04a5",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04a8",
            "\1\u04a9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04ab",
            "\1\u04ac",
            "\1\u04ad",
            "\1\u04ae",
            "\1\u04af",
            "\1\u04b0",
            "\1\u04b1",
            "\1\u04b2",
            "\1\u04b3",
            "\1\u04b4",
            "\1\u04b5",
            "\1\u04b6",
            "\1\u04b7",
            "\1\u04b8",
            "\1\u04b9",
            "\1\u04ba",
            "\1\u04bb",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04bd",
            "",
            "\1\u04be",
            "\1\u04bf",
            "\1\u04c0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04c2",
            "\1\u04c3",
            "\1\u04c4",
            "\1\u04c5",
            "\1\u04c6",
            "\1\u04c7",
            "\1\u04c8",
            "\1\u04c9",
            "\1\u04ca",
            "\1\u04cb",
            "",
            "\1\u04cc",
            "",
            "\1\u04cd",
            "",
            "\1\u04ce",
            "\1\u04cf",
            "\1\u04d0",
            "",
            "\12\66\7\uffff\10\66\1\u04d1\21\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04d4",
            "",
            "\1\u04d5",
            "\1\u04d6",
            "\1\u04d7",
            "\1\u04d8",
            "\1\u04d9",
            "\1\u04da",
            "\1\u04db",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u04dc",
            "\1\u04dd",
            "\12\66\7\uffff\32\66\4\uffff\1\u04de\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04e2",
            "",
            "\1\u04e3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u04e4",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u04e6",
            "\1\u04e7",
            "\1\u04e8",
            "\1\u04e9",
            "\1\u04ea",
            "\1\u04eb",
            "\1\u04ec",
            "\1\u04ed",
            "",
            "\1\u04ee",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u04f1",
            "\1\u04f2",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u04f4",
            "\1\u04f5",
            "\1\u04f6",
            "\1\u04f7",
            "",
            "\1\u04f8",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u04fa",
            "\1\u04fb",
            "\1\u04fc",
            "\1\u04fd",
            "\1\u04fe",
            "\1\u04ff",
            "\1\u0500",
            "\1\u0501",
            "\1\u0502",
            "\1\u0503",
            "",
            "\1\u0504",
            "\1\u0505",
            "\1\u0506",
            "\1\u0507",
            "",
            "\1\u0508",
            "\1\u0509",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u050d",
            "\1\u050e",
            "\1\u050f",
            "\1\u0510",
            "\1\u0511",
            "\1\u0512",
            "\1\u0513",
            "\1\u0514",
            "\1\u0515",
            "",
            "\1\u0516",
            "\1\u0517",
            "",
            "\1\u0518",
            "\1\u0519",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u051b",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u051d",
            "",
            "",
            "\1\u051e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0520",
            "\1\u0521",
            "",
            "",
            "\1\u0522",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0524",
            "\1\u0525",
            "\1\u0526",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0528",
            "\1\u0529",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u052b",
            "",
            "\12\66\7\uffff\22\66\1\u052c\7\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u052e",
            "\1\u052f",
            "\1\u0530",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0532",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0533",
            "\1\u0534",
            "\1\u0535",
            "\1\u0536",
            "\1\u0537",
            "\12\66\7\uffff\1\u0538\31\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u053a",
            "\1\u053b",
            "\1\u053c",
            "\1\u053d",
            "\1\u053e",
            "",
            "\1\u053f",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0541",
            "",
            "",
            "\12\66\7\uffff\23\66\1\u0542\6\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0544",
            "",
            "\1\u0545",
            "",
            "\1\u0546",
            "\12\66\7\uffff\11\66\1\u0547\20\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0549",
            "",
            "",
            "\1\u054a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u054c",
            "\1\u054d",
            "\1\u054e",
            "",
            "\1\u054f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0551",
            "",
            "\1\u0552",
            "",
            "",
            "\1\u0553",
            "",
            "\1\u0554",
            "\1\u0555",
            "",
            "\1\u0556",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0558",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u055b",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u055d",
            "\12\66\7\uffff\22\66\1\u055e\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0560",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0562",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0565",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0567",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\22\66\1\u0569\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u056b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u056d",
            "\1\u056e",
            "\1\u056f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0571",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0573",
            "",
            "\1\u0574",
            "\1\u0575",
            "",
            "\1\u0577\1\uffff\1\u0576",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u057a",
            "\1\u057b",
            "",
            "",
            "",
            "",
            "\1\u057c",
            "",
            "\1\u057d",
            "",
            "\1\u057e",
            "",
            "\1\u057f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0581",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0583",
            "\1\u0584",
            "\1\u0585",
            "\1\u0586",
            "\1\u0587",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0589",
            "",
            "\1\u058a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u058e",
            "\1\u058f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0591",
            "\1\u0592",
            "\1\u0593",
            "\1\u0594",
            "\1\u0595",
            "\1\u0596",
            "\1\u0597",
            "\1\u0598",
            "\12\66\7\uffff\3\66\1\u0599\26\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u059b",
            "",
            "\1\u059c",
            "\1\u059d",
            "\1\u059e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u05a0",
            "\1\u05a1",
            "\1\u05a2",
            "\1\u05a3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05a5",
            "\1\u05a6",
            "\1\u05a7",
            "\1\u05a8",
            "\1\u05a9",
            "\1\u05aa",
            "\1\u05ab",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05ad",
            "\1\u05ae",
            "\1\u05af",
            "",
            "",
            "\1\u05b0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\22\66\1\u05b3\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05b6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05b9",
            "\1\u05ba",
            "\1\u05bb",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05be",
            "",
            "\1\u05bf",
            "\1\u05c0",
            "\1\u05c1",
            "\1\u05c2",
            "\1\u05c3",
            "\1\u05c4",
            "\1\u05c5",
            "\1\u05c6",
            "\1\u05c7",
            "",
            "",
            "\1\u05c8",
            "\1\u05c9",
            "",
            "\1\u05ca",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05cc",
            "\1\u05cd",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05d2\4\uffff\1\u05d3",
            "\1\u05d4",
            "\1\u05d5",
            "\1\u05d6",
            "\1\u05d7",
            "\1\u05d8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05da",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05dd",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05df",
            "",
            "",
            "",
            "\12\66\7\uffff\22\66\1\u05e0\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05e2",
            "\1\u05e3",
            "\1\u05e4",
            "\1\u05e5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05e7",
            "\1\u05e8",
            "\1\u05e9",
            "\1\u05ea",
            "\1\u05eb",
            "\1\u05ec",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u05ef",
            "\1\u05f0",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05f2",
            "\1\u05f3",
            "",
            "\1\u05f4",
            "\1\u05f5",
            "\1\u05f6\10\uffff\1\u05f7",
            "",
            "\1\u05f8",
            "\1\u05f9",
            "",
            "\12\66\7\uffff\22\66\1\u05fa\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u05fc",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u05fe",
            "",
            "\1\u05ff",
            "\1\u0600",
            "\1\u0601",
            "\1\u0602",
            "\1\u0603",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0605",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0607",
            "\1\u0608",
            "\1\u0609",
            "\1\u060a",
            "\1\u060b",
            "",
            "\1\u060c",
            "\1\u060d",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u060f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0611",
            "",
            "\1\u0612",
            "\1\u0613",
            "",
            "\1\u0614",
            "\1\u0615",
            "\1\u0616",
            "\1\u0617",
            "",
            "\1\u0618",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u061b",
            "\1\u061c",
            "\1\u061d",
            "",
            "\1\u061e",
            "",
            "",
            "\1\u061f",
            "",
            "\1\u0620",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0621",
            "",
            "\1\u0622",
            "",
            "",
            "\1\u0623",
            "",
            "\1\u0624",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0627\3\uffff\1\u0626",
            "",
            "\1\u0628",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u062a\1\uffff\1\u062b",
            "",
            "\1\u062c",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u062d",
            "\1\u062e",
            "\1\u062f",
            "",
            "",
            "\1\u0630",
            "\1\u0631",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0634",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0637",
            "\1\u0638",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0639",
            "\1\u063a",
            "",
            "\1\u063b",
            "\1\u063c",
            "",
            "",
            "",
            "\1\u063d",
            "\1\u063e",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0640",
            "\1\u0641",
            "\1\u0642",
            "\1\u0643",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\3\66\1\u0645\26\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0648",
            "\1\u0649",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u064a",
            "",
            "\1\u064b",
            "\1\u064c",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u064f",
            "\1\u0650",
            "\12\66\7\uffff\3\66\1\u0651\26\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0653",
            "\1\u0654",
            "\1\u0655",
            "\1\u0656",
            "",
            "\1\u0657",
            "\1\u0658",
            "\1\u0659",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u065f",
            "",
            "",
            "\1\u0660",
            "\1\u0661",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0663",
            "\1\u0664",
            "\1\u0665",
            "\1\u0666",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0668",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u066a",
            "\1\u066b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u066d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "\1\u066f",
            "\1\u0670",
            "\1\u0671",
            "\1\u0672",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0675",
            "",
            "\1\u0676",
            "",
            "",
            "\1\u0677",
            "",
            "\1\u0678",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u067a",
            "\12\66\7\uffff\10\66\1\u067b\21\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u067f",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0681",
            "\1\u0682",
            "\1\u0683",
            "\12\66\7\uffff\4\66\1\u0684\15\66\1\u0685\7\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\u0688\1\uffff\32\66",
            "\1\u068a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\13\66\1\u068d\16\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u068f",
            "\1\u0690",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0693",
            "\1\u0694",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0696",
            "\1\u0697",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0699",
            "",
            "\1\u069a",
            "\1\u069b",
            "\1\u069c",
            "\1\u069d",
            "\12\66\7\uffff\22\66\1\u069e\7\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06a0",
            "\1\u06a1",
            "",
            "\1\u06a2",
            "",
            "\1\u06a3",
            "\1\u06a4",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06a6",
            "\1\u06a7",
            "\1\u06a8",
            "\1\u06a9",
            "\1\u06aa",
            "",
            "",
            "\1\u06ab",
            "\1\u06ac",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06ae",
            "\1\u06af",
            "\1\u06b0",
            "\1\u06b1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06b3",
            "\1\u06b4",
            "",
            "\1\u06b5",
            "\1\u06b6",
            "\12\66\7\uffff\22\66\1\u06b7\7\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u06b9",
            "\1\u06ba",
            "\1\u06bb",
            "\1\u06bc",
            "\1\u06bd",
            "\1\u06be",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u06c2",
            "\1\u06c3",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06c5",
            "\1\u06c6",
            "\1\u06c7",
            "\1\u06c8",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u06ca",
            "\1\u06cb",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06d1",
            "\1\u06d2",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06d5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u06d7\17\uffff\1\u06d6",
            "\12\66\7\uffff\22\66\1\u06d8\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u06db",
            "\1\u06dc",
            "\1\u06dd",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "",
            "\1\u06df",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u06e2",
            "\1\u06e3",
            "\1\u06e4",
            "\1\u06e5",
            "",
            "\1\u06e6",
            "",
            "\1\u06e7",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u06e9",
            "",
            "\1\u06ea",
            "\1\u06eb",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u06ee",
            "\1\u06ef",
            "\1\u06f0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u06f2",
            "\1\u06f3",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u06f5",
            "\1\u06f6",
            "\1\u06f7",
            "\1\u06f8",
            "\1\u06f9",
            "",
            "",
            "\1\u06fa\17\uffff\1\u06fb",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u06fd",
            "",
            "\1\u06fe",
            "\1\u06ff",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0701",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0703",
            "",
            "\1\u0704",
            "\12\66\7\uffff\13\66\1\u0705\16\66\4\uffff\1\66\1\uffff\32"+
            "\66",
            "\1\u0707",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0709",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u070b",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u070e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0713",
            "\1\u0714",
            "\1\u0715",
            "\1\u0716",
            "",
            "\1\u0717",
            "\1\u0718",
            "\1\u0719",
            "\1\u071a",
            "",
            "\1\u071b",
            "\1\u071c",
            "\1\u071d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0720",
            "\1\u0721",
            "\1\u0722",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0724",
            "\1\u0725",
            "",
            "",
            "",
            "\1\u0726",
            "\1\u0727",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u072a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u072c",
            "\1\u072d",
            "",
            "",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u072f",
            "",
            "",
            "\1\u0730",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0732",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0735",
            "\1\u0736",
            "",
            "\1\u0737",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u073b",
            "\12\66\7\uffff\4\66\1\u073d\15\66\1\u073c\7\66\4\uffff\1\66"+
            "\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0740",
            "\1\u0741",
            "\1\u0742",
            "",
            "",
            "\1\u0743",
            "\1\u0744",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0746",
            "\1\u0747",
            "",
            "\1\u0748",
            "\1\u0749",
            "\12\66\7\uffff\22\66\1\u074a\7\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u074d",
            "\1\u074e",
            "\1\u074f",
            "",
            "\1\u0750",
            "\1\u0751",
            "\1\u0752",
            "",
            "\1\u0753",
            "",
            "\1\u0754",
            "\1\u0755",
            "\1\u0756",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0758",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "",
            "",
            "\1\u075b",
            "\1\u075c",
            "\1\u075d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u075f",
            "\1\u0760",
            "\1\u0761",
            "\1\u0762",
            "\1\u0763",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0765",
            "",
            "",
            "\1\u0766",
            "\1\u0767",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0769",
            "\1\u076a",
            "\1\u076b",
            "\1\u076c",
            "",
            "",
            "\1\u076d",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u076f",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\3\66\1\u0771\26\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u0773",
            "",
            "",
            "\1\u0774",
            "\1\u0775",
            "\1\u0776",
            "",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0779",
            "",
            "",
            "\1\u077a",
            "\1\u077b",
            "\1\u077c",
            "\1\u077d",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0780\11\uffff\1\u0781",
            "\1\u0782",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u0785",
            "\1\u0786",
            "\1\u0787",
            "\1\u0788",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u078a",
            "\1\u078b",
            "\12\66\7\uffff\1\u078d\21\66\1\u078c\7\66\4\uffff\1\66\1\uffff"+
            "\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0790",
            "",
            "\1\u0791",
            "",
            "",
            "\1\u0792",
            "\1\u0793",
            "\1\u0794",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0796",
            "\1\u0797",
            "\1\u0798",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u079a",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u079c",
            "",
            "\1\u079d",
            "\1\u079e",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07a1",
            "",
            "\1\u07a2",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07a5",
            "\1\u07a6",
            "\1\u07a7",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07aa",
            "\1\u07ab",
            "\1\u07ac",
            "",
            "",
            "\1\u07ad",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u07b0",
            "\1\u07b1",
            "\1\u07b2",
            "\1\u07b3",
            "",
            "\1\u07b4",
            "\1\u07b5",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07b7",
            "",
            "",
            "\1\u07b8",
            "\1\u07b9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07bb",
            "\1\u07bc",
            "",
            "\1\u07bd",
            "\1\u07be",
            "\1\u07bf",
            "",
            "\1\u07c0",
            "",
            "\1\u07c1",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u07c4",
            "\1\u07c5",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07c8",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07cb",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "",
            "\1\u07cd",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07cf",
            "\1\u07d0",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07d2",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07d4",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u07d6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07d8",
            "\1\u07d9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07db",
            "\1\u07dc",
            "",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07de",
            "",
            "",
            "\1\u07df",
            "",
            "",
            "\1\u07e0",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u07e2",
            "\1\u07e3",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u07e5",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u07e7",
            "\1\u07e8",
            "",
            "\1\u07e9",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u07eb",
            "\1\u07ec",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u07ee",
            "\1\u07ef",
            "",
            "\1\u07f0",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07f2",
            "\1\u07f3",
            "",
            "\1\u07f4",
            "\1\u07f5",
            "",
            "\1\u07f6",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\1\u07f9",
            "\1\u07fa",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u07fc",
            "\1\u07fd",
            "",
            "",
            "\1\u07fe",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            "\1\u0802",
            "",
            "",
            "",
            "\1\u0803",
            "\12\66\7\uffff\32\66\4\uffff\1\66\1\uffff\32\66",
            ""
    };

    static final short[] DFA32_eot = DFA.unpackEncodedString(DFA32_eotS);
    static final short[] DFA32_eof = DFA.unpackEncodedString(DFA32_eofS);
    static final char[] DFA32_min = DFA.unpackEncodedStringToUnsignedChars(DFA32_minS);
    static final char[] DFA32_max = DFA.unpackEncodedStringToUnsignedChars(DFA32_maxS);
    static final short[] DFA32_accept = DFA.unpackEncodedString(DFA32_acceptS);
    static final short[] DFA32_special = DFA.unpackEncodedString(DFA32_specialS);
    static final short[][] DFA32_transition;

    static {
        int numStates = DFA32_transitionS.length;
        DFA32_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA32_transition[i] = DFA.unpackEncodedString(DFA32_transitionS[i]);
        }
    }

    class DFA32 extends DFA {

        public DFA32(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 32;
            this.eot = DFA32_eot;
            this.eof = DFA32_eof;
            this.min = DFA32_min;
            this.max = DFA32_max;
            this.accept = DFA32_accept;
            this.special = DFA32_special;
            this.transition = DFA32_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( KW_TRUE | KW_FALSE | KW_UNKNOWN | KW_ALL | KW_SOME | KW_NONE | KW_AND | KW_OR | KW_NOT | KW_LIKE | KW_ANY | KW_IF | KW_EXISTS | KW_ASC | KW_DESC | KW_NULLS | KW_LAST | KW_ORDER | KW_GROUP | KW_BY | KW_HAVING | KW_QUALIFY | KW_WHERE | KW_FROM | KW_AS | KW_SELECT | KW_DISTINCT | KW_INSERT | KW_OVERWRITE | KW_OUTER | KW_UNIQUEJOIN | KW_PRESERVE | KW_JOIN | KW_LEFT | KW_RIGHT | KW_FULL | KW_ON | KW_PARTITION | KW_PARTITIONS | KW_TABLE | KW_TABLES | KW_COLUMNS | KW_INDEX | KW_INDEXES | KW_REBUILD | KW_FUNCTIONS | KW_SHOW | KW_MSCK | KW_REPAIR | KW_DIRECTORY | KW_LOCAL | KW_TRANSFORM | KW_USING | KW_COMPACT_ID | KW_CLUSTER | KW_DISTRIBUTE | KW_SORT | KW_UNION | KW_EXCEPT | KW_LOAD | KW_PREPARE | KW_EXPORT | KW_IMPORT | KW_REPLICATION | KW_METADATA | KW_DATA | KW_INPATH | KW_IS | KW_NULL | KW_CREATE | KW_EXTERNAL | KW_ALTER | KW_CHANGE | KW_COLUMN | KW_FIRST | KW_AFTER | KW_DESCRIBE | KW_DROP | KW_RENAME | KW_TO | KW_COMMENT | KW_BOOLEAN | KW_TINYINT | KW_SMALLINT | KW_INT | KW_BIGINT | KW_FLOAT | KW_REAL | KW_DOUBLE | KW_PRECISION | KW_DATE | KW_DATETIME | KW_TIMESTAMP | KW_TIMESTAMPLOCALTZ | KW_TIME | KW_ZONE | KW_INTERVAL | KW_DECIMAL | KW_STRING | KW_CHAR | KW_VARCHAR | KW_ARRAY | KW_STRUCT | KW_MAP | KW_UNIONTYPE | KW_REDUCE | KW_PARTITIONED | KW_CLUSTERED | KW_DISTRIBUTED | KW_SORTED | KW_INTO | KW_BUCKETS | KW_ROW | KW_ROWS | KW_FORMAT | KW_DELIMITED | KW_FIELDS | KW_TERMINATED | KW_ESCAPED | KW_COLLECTION | KW_ITEMS | KW_KEYS | KW_KEY_TYPE | KW_KILL | KW_LINES | KW_STORED | KW_FILEFORMAT | KW_INPUTFORMAT | KW_OUTPUTFORMAT | KW_INPUTDRIVER | KW_OUTPUTDRIVER | KW_ENABLE | KW_DISABLE | KW_EXECUTED | KW_EXECUTE | KW_LOCATION | KW_MANAGED | KW_MANAGEDLOCATION | KW_TABLESAMPLE | KW_BUCKET | KW_OUT | KW_OF | KW_PERCENT | KW_CAST | KW_ADD | KW_REPLACE | KW_RLIKE | KW_REGEXP | KW_TEMPORARY | KW_FUNCTION | KW_MACRO | KW_FILE | KW_JAR | KW_EXPLAIN | KW_DDL | KW_EXTENDED | KW_DEBUG | KW_FORMATTED | KW_DEPENDENCY | KW_LOGICAL | KW_CBO | KW_SERDE | KW_WITH | KW_DEFERRED | KW_SERDEPROPERTIES | KW_DBPROPERTIES | KW_DCPROPERTIES | KW_LIMIT | KW_OFFSET | KW_SET | KW_UNSET | KW_TBLPROPERTIES | KW_IDXPROPERTIES | KW_VALUE_TYPE | KW_ELEM_TYPE | KW_DEFINED | KW_CASE | KW_WHEN | KW_THEN | KW_ELSE | KW_END | KW_MAPJOIN | KW_STREAMTABLE | KW_CLUSTERSTATUS | KW_UTC | KW_UTCTIMESTAMP | KW_LONG | KW_DELETE | KW_PLUS | KW_MINUS | KW_FETCH | KW_INTERSECT | KW_VIEW | KW_VIEWS | KW_IN | KW_DATABASE | KW_DATABASES | KW_MATERIALIZED | KW_SCHEMA | KW_SCHEMAS | KW_GRANT | KW_REVOKE | KW_SSL | KW_UNDO | KW_LOCK | KW_LOCKS | KW_UNLOCK | KW_SHARED | KW_EXCLUSIVE | KW_PROCEDURE | KW_UNSIGNED | KW_WHILE | KW_READ | KW_READS | KW_PURGE | KW_RANGE | KW_ANALYZE | KW_BEFORE | KW_BETWEEN | KW_BOTH | KW_BINARY | KW_CROSS | KW_CONTINUE | KW_CONVERT | KW_CURSOR | KW_TRIGGER | KW_RECORDREADER | KW_RECORDWRITER | KW_SEMI | KW_LATERAL | KW_TOUCH | KW_ARCHIVE | KW_UNARCHIVE | KW_COMPUTE | KW_STATISTICS | KW_USE | KW_OPTION | KW_CONCATENATE | KW_SHOW_DATABASE | KW_UPDATE | KW_RESTRICT | KW_CASCADE | KW_SKEWED | KW_ROLLUP | KW_CUBE | KW_DIRECTORIES | KW_FOR | KW_WINDOW | KW_UNBOUNDED | KW_PRECEDING | KW_FOLLOWING | KW_CURRENT | KW_CURRENT_DATE | KW_CURRENT_TIMESTAMP | KW_LESS | KW_MORE | KW_OVER | KW_GROUPING | KW_SETS | KW_TRUNCATE | KW_NOSCAN | KW_USER | KW_ROLE | KW_ROLES | KW_INNER | KW_EXCHANGE | KW_URI | KW_SERVER | KW_ADMIN | KW_OWNER | KW_PRINCIPALS | KW_COMPACT | KW_COMPACTIONS | KW_TRANSACTIONS | KW_TRANSACTIONAL | KW_REWRITE | KW_AUTHORIZATION | KW_REOPTIMIZATION | KW_CONF | KW_VALUES | KW_RELOAD | KW_YEAR | KW_QUERY | KW_QUARTER | KW_MONTH | KW_WEEK | KW_DAY | KW_DOW | KW_HOUR | KW_MINUTE | KW_SECOND | KW_START | KW_TRANSACTION | KW_COMMIT | KW_ROLLBACK | KW_WORK | KW_ONLY | KW_WRITE | KW_ISOLATION | KW_LEVEL | KW_SNAPSHOT | KW_AUTOCOMMIT | KW_CACHE | KW_PRIMARY | KW_FOREIGN | KW_REFERENCES | KW_CONSTRAINT | KW_FORCE | KW_ENFORCED | KW_VALIDATE | KW_NOVALIDATE | KW_RELY | KW_NORELY | KW_UNIQUE | KW_KEY | KW_ABORT | KW_EXTRACT | KW_FLOOR | KW_MERGE | KW_MATCHED | KW_REPL | KW_DUMP | KW_STATUS | KW_VECTORIZATION | KW_SUMMARY | KW_OPERATOR | KW_EXPRESSION | KW_DETAIL | KW_WAIT | KW_RESOURCE | KW_PLAN | KW_QUERY_PARALLELISM | KW_PLANS | KW_ACTIVATE | KW_DEFAULT | KW_CHECK | KW_POOL | KW_MOVE | KW_DO | KW_ALLOC_FRACTION | KW_SCHEDULING_POLICY | KW_SCHEDULED | KW_EVERY | KW_AT | KW_CRON | KW_PATH | KW_MAPPING | KW_WORKLOAD | KW_MANAGEMENT | KW_ACTIVE | KW_UNMANAGED | KW_APPLICATION | KW_SYNC | KW_AST | KW_COST | KW_JOINCOST | KW_WITHIN | KW_PKFK_JOIN | KW_LEADING | KW_TRAILING | KW_TRIM | KW_IGNORE | KW_RESPECT | KW_DATACONNECTOR | KW_DATACONNECTORS | KW_TYPE | KW_URL | KW_REMOTE | KW_SPEC | KW_SYSTEM_TIME | KW_SYSTEM_VERSION | KW_EXPIRE_SNAPSHOTS | KW_SET_CURRENT_SNAPSHOT | KW_BRANCH | KW_SNAPSHOTS | KW_RETAIN | KW_RETENTION | KW_TAG | KW_FAST_FORWARD | KW_CHERRY_PICK | KW_ORPHAN_FILES | KW_OLDER | KW_THAN | KW_OPTIMIZE | DOT | COLON | COMMA | SEMICOLON | LPAREN | RPAREN | LSQUARE | RSQUARE | LCURLY | RCURLY | EQUAL | EQUAL_NS | NOTEQUAL | LESSTHANOREQUALTO | LESSTHAN | GREATERTHANOREQUALTO | GREATERTHAN | DIVIDE | PLUS | MINUS | STAR | MOD | DIV | AMPERSAND | TILDE | BITWISEOR | CONCATENATE | BITWISEXOR | QUESTION | DOLLAR | StringLiteral | CharSetLiteral | IntegralLiteral | NumberLiteral | ByteLengthLiteral | Number | Identifier | CharSetName | WS | LINE_COMMENT | QUERY_HINT );";
        }
    }
 

}