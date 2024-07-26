// $ANTLR 3.4 PrepareStatementParser.g 2024-07-25 22:38:45

package org.apache.hadoop.hive.sql.parse;


import org.antlr.runtime.*;

import org.antlr.runtime.tree.*;


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
public class HiveParser_PrepareStatementParser extends Parser {
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
    public static final int KW_ANTI=463;
    public static final int KW_BATCH=473;
    public static final int KW_DAYOFWEEK=521;
    public static final int KW_HOLD_DDLTIME=580;
    public static final int KW_NO_DROP=636;
    public static final int KW_OFFLINE=640;
    public static final int KW_PROTECTION=670;
    public static final int KW_READONLY=678;
    public static final int KW_TIMESTAMPTZ=753;
    public static final int TOK_ABORT_COMPACTIONS=821;
    public static final int TOK_ABORT_TRANSACTIONS=822;
    public static final int TOK_ACTIVATE=823;
    public static final int TOK_ADD_TRIGGER=824;
    public static final int TOK_ADMIN_OPTION_FOR=825;
    public static final int TOK_ALIAS=826;
    public static final int TOK_ALIASLIST=827;
    public static final int TOK_ALLCOLREF=828;
    public static final int TOK_ALLOC_FRACTION=829;
    public static final int TOK_ALTERDATABASE_LOCATION=830;
    public static final int TOK_ALTERDATABASE_MANAGEDLOCATION=831;
    public static final int TOK_ALTERDATABASE_OWNER=832;
    public static final int TOK_ALTERDATABASE_PROPERTIES=833;
    public static final int TOK_ALTERDATACONNECTOR_OWNER=834;
    public static final int TOK_ALTERDATACONNECTOR_PROPERTIES=835;
    public static final int TOK_ALTERDATACONNECTOR_URL=836;
    public static final int TOK_ALTERPARTITION_BUCKETS=837;
    public static final int TOK_ALTERPARTITION_FILEFORMAT=838;
    public static final int TOK_ALTERPARTITION_LOCATION=839;
    public static final int TOK_ALTERPARTITION_MERGEFILES=840;
    public static final int TOK_ALTERPARTITION_SERIALIZER=841;
    public static final int TOK_ALTERPARTITION_SETSERDEPROPERTIES=842;
    public static final int TOK_ALTERPARTITION_UNSETSERDEPROPERTIES=843;
    public static final int TOK_ALTERPARTITION_UPDATECOLSTATS=844;
    public static final int TOK_ALTERPARTITION_UPDATESTATS=845;
    public static final int TOK_ALTERTABLE=846;
    public static final int TOK_ALTERTABLE_ADDCOLS=847;
    public static final int TOK_ALTERTABLE_ADDCONSTRAINT=848;
    public static final int TOK_ALTERTABLE_ADDPARTS=849;
    public static final int TOK_ALTERTABLE_ARCHIVE=850;
    public static final int TOK_ALTERTABLE_BUCKETS=851;
    public static final int TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION=852;
    public static final int TOK_ALTERTABLE_CLUSTER_SORT=853;
    public static final int TOK_ALTERTABLE_COMPACT=854;
    public static final int TOK_ALTERTABLE_CONVERT=855;
    public static final int TOK_ALTERTABLE_CREATE_BRANCH=856;
    public static final int TOK_ALTERTABLE_CREATE_TAG=857;
    public static final int TOK_ALTERTABLE_DROPCONSTRAINT=858;
    public static final int TOK_ALTERTABLE_DROPPARTS=859;
    public static final int TOK_ALTERTABLE_DROPPROPERTIES=860;
    public static final int TOK_ALTERTABLE_DROP_BRANCH=861;
    public static final int TOK_ALTERTABLE_DROP_TAG=862;
    public static final int TOK_ALTERTABLE_EXCHANGEPARTITION=863;
    public static final int TOK_ALTERTABLE_EXECUTE=864;
    public static final int TOK_ALTERTABLE_FILEFORMAT=865;
    public static final int TOK_ALTERTABLE_LOCATION=866;
    public static final int TOK_ALTERTABLE_MERGEFILES=867;
    public static final int TOK_ALTERTABLE_OWNER=868;
    public static final int TOK_ALTERTABLE_PARTCOLTYPE=869;
    public static final int TOK_ALTERTABLE_PROPERTIES=870;
    public static final int TOK_ALTERTABLE_RENAME=871;
    public static final int TOK_ALTERTABLE_RENAMECOL=872;
    public static final int TOK_ALTERTABLE_RENAMEPART=873;
    public static final int TOK_ALTERTABLE_RENAME_BRANCH=874;
    public static final int TOK_ALTERTABLE_REPLACECOLS=875;
    public static final int TOK_ALTERTABLE_REPLACE_SNAPSHOTREF=876;
    public static final int TOK_ALTERTABLE_SERIALIZER=877;
    public static final int TOK_ALTERTABLE_SETPARTSPEC=878;
    public static final int TOK_ALTERTABLE_SETSERDEPROPERTIES=879;
    public static final int TOK_ALTERTABLE_SKEWED=880;
    public static final int TOK_ALTERTABLE_SKEWED_LOCATION=881;
    public static final int TOK_ALTERTABLE_TOUCH=882;
    public static final int TOK_ALTERTABLE_UNARCHIVE=883;
    public static final int TOK_ALTERTABLE_UNSETSERDEPROPERTIES=884;
    public static final int TOK_ALTERTABLE_UPDATECOLSTATS=885;
    public static final int TOK_ALTERTABLE_UPDATECOLUMNS=886;
    public static final int TOK_ALTERTABLE_UPDATESTATS=887;
    public static final int TOK_ALTERVIEW=888;
    public static final int TOK_ALTERVIEW_ADDPARTS=889;
    public static final int TOK_ALTERVIEW_AS=890;
    public static final int TOK_ALTERVIEW_DROPPARTS=891;
    public static final int TOK_ALTERVIEW_DROPPROPERTIES=892;
    public static final int TOK_ALTERVIEW_PROPERTIES=893;
    public static final int TOK_ALTERVIEW_RENAME=894;
    public static final int TOK_ALTER_MAPPING=895;
    public static final int TOK_ALTER_MATERIALIZED_VIEW=896;
    public static final int TOK_ALTER_MATERIALIZED_VIEW_REBUILD=897;
    public static final int TOK_ALTER_MATERIALIZED_VIEW_REWRITE=898;
    public static final int TOK_ALTER_POOL=899;
    public static final int TOK_ALTER_POOL_ADD_TRIGGER=900;
    public static final int TOK_ALTER_POOL_DROP_TRIGGER=901;
    public static final int TOK_ALTER_RP_DISABLE=902;
    public static final int TOK_ALTER_RP_ENABLE=903;
    public static final int TOK_ALTER_RP_RENAME=904;
    public static final int TOK_ALTER_RP_REPLACE=905;
    public static final int TOK_ALTER_RP_SET=906;
    public static final int TOK_ALTER_RP_UNSET=907;
    public static final int TOK_ALTER_RP_VALIDATE=908;
    public static final int TOK_ALTER_SCHEDULED_QUERY=909;
    public static final int TOK_ALTER_TRIGGER=910;
    public static final int TOK_ANALYZE=911;
    public static final int TOK_ARCHIVE=912;
    public static final int TOK_AS_OF_TAG=913;
    public static final int TOK_AS_OF_TIME=914;
    public static final int TOK_AS_OF_VERSION=915;
    public static final int TOK_BIGINT=916;
    public static final int TOK_BINARY=917;
    public static final int TOK_BLOCKING=918;
    public static final int TOK_BOOLEAN=919;
    public static final int TOK_BUCKET=920;
    public static final int TOK_CACHE_METADATA=921;
    public static final int TOK_CASCADE=922;
    public static final int TOK_CHAR=923;
    public static final int TOK_CHARSETLITERAL=924;
    public static final int TOK_CHECK_CONSTRAINT=925;
    public static final int TOK_CLUSTERBY=926;
    public static final int TOK_COLTYPELIST=927;
    public static final int TOK_COL_NAME=928;
    public static final int TOK_COMMIT=929;
    public static final int TOK_COMPACTION_STATUS=930;
    public static final int TOK_COMPACTION_TYPE=931;
    public static final int TOK_COMPACT_ID=932;
    public static final int TOK_COMPACT_POOL=933;
    public static final int TOK_CONSTRAINT_NAME=934;
    public static final int TOK_CREATEDATABASE=935;
    public static final int TOK_CREATEDATACONNECTOR=936;
    public static final int TOK_CREATEFUNCTION=937;
    public static final int TOK_CREATEMACRO=938;
    public static final int TOK_CREATEROLE=939;
    public static final int TOK_CREATETABLE=940;
    public static final int TOK_CREATEVIEW=941;
    public static final int TOK_CREATE_MAPPING=942;
    public static final int TOK_CREATE_MATERIALIZED_VIEW=943;
    public static final int TOK_CREATE_POOL=944;
    public static final int TOK_CREATE_RP=945;
    public static final int TOK_CREATE_SCHEDULED_QUERY=946;
    public static final int TOK_CREATE_TRIGGER=947;
    public static final int TOK_CRON=948;
    public static final int TOK_CROSSJOIN=949;
    public static final int TOK_CTE=950;
    public static final int TOK_CUBE_GROUPBY=951;
    public static final int TOK_DATABASECOMMENT=952;
    public static final int TOK_DATABASELOCATION=953;
    public static final int TOK_DATABASEPROPERTIES=954;
    public static final int TOK_DATABASE_MANAGEDLOCATION=955;
    public static final int TOK_DATACONNECTOR=956;
    public static final int TOK_DATACONNECTORCOMMENT=957;
    public static final int TOK_DATACONNECTOROWNER=958;
    public static final int TOK_DATACONNECTORPROPERTIES=959;
    public static final int TOK_DATACONNECTORTYPE=960;
    public static final int TOK_DATACONNECTORURL=961;
    public static final int TOK_DATE=962;
    public static final int TOK_DATELITERAL=963;
    public static final int TOK_DATETIME=964;
    public static final int TOK_DAY=965;
    public static final int TOK_DBNAME=966;
    public static final int TOK_DBPROPLIST=967;
    public static final int TOK_DB_TYPE=968;
    public static final int TOK_DDL=969;
    public static final int TOK_DECIMAL=970;
    public static final int TOK_DEFAULT_POOL=971;
    public static final int TOK_DEFAULT_VALUE=972;
    public static final int TOK_DELETE=973;
    public static final int TOK_DELETE_FROM=974;
    public static final int TOK_DESCDATABASE=975;
    public static final int TOK_DESCDATACONNECTOR=976;
    public static final int TOK_DESCFUNCTION=977;
    public static final int TOK_DESCTABLE=978;
    public static final int TOK_DESTINATION=979;
    public static final int TOK_DETAIL=980;
    public static final int TOK_DIR=981;
    public static final int TOK_DISABLE=982;
    public static final int TOK_DISTRIBUTEBY=983;
    public static final int TOK_DOUBLE=984;
    public static final int TOK_DROPDATABASE=985;
    public static final int TOK_DROPDATACONNECTOR=986;
    public static final int TOK_DROPFUNCTION=987;
    public static final int TOK_DROPMACRO=988;
    public static final int TOK_DROPROLE=989;
    public static final int TOK_DROPTABLE=990;
    public static final int TOK_DROPVIEW=991;
    public static final int TOK_DROP_MAPPING=992;
    public static final int TOK_DROP_MATERIALIZED_VIEW=993;
    public static final int TOK_DROP_POOL=994;
    public static final int TOK_DROP_RP=995;
    public static final int TOK_DROP_SCHEDULED_QUERY=996;
    public static final int TOK_DROP_TRIGGER=997;
    public static final int TOK_ENABLE=998;
    public static final int TOK_EVERY=999;
    public static final int TOK_EXCEPTALL=1000;
    public static final int TOK_EXCEPTDISTINCT=1001;
    public static final int TOK_EXECUTE=1002;
    public static final int TOK_EXECUTED_AS=1003;
    public static final int TOK_EXECUTE_PARAM_LIST=1004;
    public static final int TOK_EXPLAIN=1005;
    public static final int TOK_EXPLAIN_SQ_REWRITE=1006;
    public static final int TOK_EXPLIST=1007;
    public static final int TOK_EXPORT=1008;
    public static final int TOK_EXPRESSION=1009;
    public static final int TOK_FALSE=1010;
    public static final int TOK_FILE=1011;
    public static final int TOK_FILEFORMAT_GENERIC=1012;
    public static final int TOK_FLOAT=1013;
    public static final int TOK_FORCE=1014;
    public static final int TOK_FOREIGN_KEY=1015;
    public static final int TOK_FROM=1016;
    public static final int TOK_FROM_VERSION=1017;
    public static final int TOK_FULLOUTERJOIN=1018;
    public static final int TOK_FUNCTION=1019;
    public static final int TOK_FUNCTIONDI=1020;
    public static final int TOK_FUNCTIONSTAR=1021;
    public static final int TOK_GRANT=1022;
    public static final int TOK_GRANT_OPTION_FOR=1023;
    public static final int TOK_GRANT_ROLE=1024;
    public static final int TOK_GRANT_WITH_ADMIN_OPTION=1025;
    public static final int TOK_GRANT_WITH_OPTION=1026;
    public static final int TOK_GROUP=1027;
    public static final int TOK_GROUPBY=1028;
    public static final int TOK_GROUPING_SETS=1029;
    public static final int TOK_GROUPING_SETS_EXPRESSION=1030;
    public static final int TOK_HAVING=1031;
    public static final int TOK_HOUR=1032;
    public static final int TOK_IDENTITY=1033;
    public static final int TOK_IFEXISTS=1034;
    public static final int TOK_IFNOTEXISTS=1035;
    public static final int TOK_IGNORE_NULLS=1036;
    public static final int TOK_IMPORT=1037;
    public static final int TOK_INPUTFORMAT=1038;
    public static final int TOK_INSERT=1039;
    public static final int TOK_INSERT_INTO=1040;
    public static final int TOK_INT=1041;
    public static final int TOK_INTERSECTALL=1042;
    public static final int TOK_INTERSECTDISTINCT=1043;
    public static final int TOK_INTERVAL_DAY_LITERAL=1044;
    public static final int TOK_INTERVAL_DAY_TIME=1045;
    public static final int TOK_INTERVAL_DAY_TIME_LITERAL=1046;
    public static final int TOK_INTERVAL_HOUR_LITERAL=1047;
    public static final int TOK_INTERVAL_MINUTE_LITERAL=1048;
    public static final int TOK_INTERVAL_MONTH_LITERAL=1049;
    public static final int TOK_INTERVAL_SECOND_LITERAL=1050;
    public static final int TOK_INTERVAL_YEAR_LITERAL=1051;
    public static final int TOK_INTERVAL_YEAR_MONTH=1052;
    public static final int TOK_INTERVAL_YEAR_MONTH_LITERAL=1053;
    public static final int TOK_ISOLATION_LEVEL=1054;
    public static final int TOK_ISOLATION_SNAPSHOT=1055;
    public static final int TOK_JAR=1056;
    public static final int TOK_JOIN=1057;
    public static final int TOK_KILL_QUERY=1058;
    public static final int TOK_LATERAL_VIEW=1059;
    public static final int TOK_LATERAL_VIEW_OUTER=1060;
    public static final int TOK_LEFTANTISEMIJOIN=1061;
    public static final int TOK_LEFTOUTERJOIN=1062;
    public static final int TOK_LEFTSEMIJOIN=1063;
    public static final int TOK_LENGTH=1064;
    public static final int TOK_LIKEFILE=1065;
    public static final int TOK_LIKERP=1066;
    public static final int TOK_LIKETABLE=1067;
    public static final int TOK_LIMIT=1068;
    public static final int TOK_LIST=1069;
    public static final int TOK_LOAD=1070;
    public static final int TOK_LOCKDB=1071;
    public static final int TOK_LOCKTABLE=1072;
    public static final int TOK_MAP=1073;
    public static final int TOK_MATCHED=1074;
    public static final int TOK_MERGE=1075;
    public static final int TOK_METADATA=1076;
    public static final int TOK_MONTH=1077;
    public static final int TOK_MSCK=1078;
    public static final int TOK_NORELY=1079;
    public static final int TOK_NOT_CLUSTERED=1080;
    public static final int TOK_NOT_MATCHED=1081;
    public static final int TOK_NOT_NULL=1082;
    public static final int TOK_NOT_SORTED=1083;
    public static final int TOK_NOVALIDATE=1084;
    public static final int TOK_NO_DROP=1085;
    public static final int TOK_NULL=1086;
    public static final int TOK_NULLS_FIRST=1087;
    public static final int TOK_NULLS_LAST=1088;
    public static final int TOK_OFFLINE=1089;
    public static final int TOK_OFFSET=1090;
    public static final int TOK_ONLY=1091;
    public static final int TOK_OPERATOR=1092;
    public static final int TOK_OP_ADD=1093;
    public static final int TOK_OP_AND=1094;
    public static final int TOK_OP_BITAND=1095;
    public static final int TOK_OP_BITNOT=1096;
    public static final int TOK_OP_BITOR=1097;
    public static final int TOK_OP_BITXOR=1098;
    public static final int TOK_OP_DIV=1099;
    public static final int TOK_OP_EQ=1100;
    public static final int TOK_OP_GE=1101;
    public static final int TOK_OP_GT=1102;
    public static final int TOK_OP_LE=1103;
    public static final int TOK_OP_LIKE=1104;
    public static final int TOK_OP_LT=1105;
    public static final int TOK_OP_MOD=1106;
    public static final int TOK_OP_MUL=1107;
    public static final int TOK_OP_NE=1108;
    public static final int TOK_OP_NOT=1109;
    public static final int TOK_OP_OR=1110;
    public static final int TOK_OP_SUB=1111;
    public static final int TOK_ORDERBY=1112;
    public static final int TOK_ORREPLACE=1113;
    public static final int TOK_PARAMETER=1114;
    public static final int TOK_PARAMETER_IDX=1115;
    public static final int TOK_PARTITIONINGSPEC=1116;
    public static final int TOK_PARTITIONLOCATION=1117;
    public static final int TOK_PARTSPEC=1118;
    public static final int TOK_PARTVAL=1119;
    public static final int TOK_PATH=1120;
    public static final int TOK_PERCENT=1121;
    public static final int TOK_PREPARE=1122;
    public static final int TOK_PRIMARY_KEY=1123;
    public static final int TOK_PRINCIPAL_NAME=1124;
    public static final int TOK_PRIVILEGE=1125;
    public static final int TOK_PRIVILEGE_LIST=1126;
    public static final int TOK_PRIV_ALL=1127;
    public static final int TOK_PRIV_ALTER_DATA=1128;
    public static final int TOK_PRIV_ALTER_METADATA=1129;
    public static final int TOK_PRIV_CREATE=1130;
    public static final int TOK_PRIV_DELETE=1131;
    public static final int TOK_PRIV_DROP=1132;
    public static final int TOK_PRIV_INSERT=1133;
    public static final int TOK_PRIV_LOCK=1134;
    public static final int TOK_PRIV_OBJECT=1135;
    public static final int TOK_PRIV_OBJECT_COL=1136;
    public static final int TOK_PRIV_SELECT=1137;
    public static final int TOK_PRIV_SHOW_DATABASE=1138;
    public static final int TOK_PTBLFUNCTION=1139;
    public static final int TOK_QUALIFY=1140;
    public static final int TOK_QUERY=1141;
    public static final int TOK_QUERY_PARALLELISM=1142;
    public static final int TOK_READONLY=1143;
    public static final int TOK_REAL=1144;
    public static final int TOK_RECORDREADER=1145;
    public static final int TOK_RECORDWRITER=1146;
    public static final int TOK_RELOADFUNCTIONS=1147;
    public static final int TOK_RELY=1148;
    public static final int TOK_REMOTE=1149;
    public static final int TOK_RENAME=1150;
    public static final int TOK_REPLACE=1151;
    public static final int TOK_REPLICATION=1152;
    public static final int TOK_REPL_CONFIG=1153;
    public static final int TOK_REPL_CONFIG_LIST=1154;
    public static final int TOK_REPL_DUMP=1155;
    public static final int TOK_REPL_LOAD=1156;
    public static final int TOK_REPL_STATUS=1157;
    public static final int TOK_REPL_TABLES=1158;
    public static final int TOK_REPL_TABLES_LIST=1159;
    public static final int TOK_RESOURCE_ALL=1160;
    public static final int TOK_RESOURCE_LIST=1161;
    public static final int TOK_RESOURCE_URI=1162;
    public static final int TOK_RESPECT_NULLS=1163;
    public static final int TOK_RESTRICT=1164;
    public static final int TOK_RETAIN=1165;
    public static final int TOK_REVOKE=1166;
    public static final int TOK_REVOKE_ROLE=1167;
    public static final int TOK_REWRITE_DISABLED=1168;
    public static final int TOK_REWRITE_ENABLED=1169;
    public static final int TOK_RIGHTOUTERJOIN=1170;
    public static final int TOK_ROLE=1171;
    public static final int TOK_ROLLBACK=1172;
    public static final int TOK_ROLLUP_GROUPBY=1173;
    public static final int TOK_ROWCOUNT=1174;
    public static final int TOK_SCHEDULE=1175;
    public static final int TOK_SCHEDULING_POLICY=1176;
    public static final int TOK_SELECT=1177;
    public static final int TOK_SELECTDI=1178;
    public static final int TOK_SELEXPR=1179;
    public static final int TOK_SERDE=1180;
    public static final int TOK_SERDENAME=1181;
    public static final int TOK_SERDEPROPS=1182;
    public static final int TOK_SERVER_TYPE=1183;
    public static final int TOK_SETCOLREF=1184;
    public static final int TOK_SET_AUTOCOMMIT=1185;
    public static final int TOK_SET_COLUMNS_CLAUSE=1186;
    public static final int TOK_SET_ROLE=1187;
    public static final int TOK_SHOWCOLUMNS=1188;
    public static final int TOK_SHOWCONF=1189;
    public static final int TOK_SHOWDATABASES=1190;
    public static final int TOK_SHOWDATACONNECTORS=1191;
    public static final int TOK_SHOWDBLOCKS=1192;
    public static final int TOK_SHOWFUNCTIONS=1193;
    public static final int TOK_SHOWLOCKS=1194;
    public static final int TOK_SHOWMATERIALIZEDVIEWS=1195;
    public static final int TOK_SHOWPARTITIONS=1196;
    public static final int TOK_SHOWTABLES=1197;
    public static final int TOK_SHOWVIEWS=1198;
    public static final int TOK_SHOW_COMPACTIONS=1199;
    public static final int TOK_SHOW_CREATEDATABASE=1200;
    public static final int TOK_SHOW_CREATETABLE=1201;
    public static final int TOK_SHOW_CURRENT_ROLE=1202;
    public static final int TOK_SHOW_GRANT=1203;
    public static final int TOK_SHOW_ROLES=1204;
    public static final int TOK_SHOW_ROLE_GRANT=1205;
    public static final int TOK_SHOW_ROLE_PRINCIPALS=1206;
    public static final int TOK_SHOW_RP=1207;
    public static final int TOK_SHOW_TABLESTATUS=1208;
    public static final int TOK_SHOW_TBLPROPERTIES=1209;
    public static final int TOK_SHOW_TRANSACTIONS=1210;
    public static final int TOK_SKEWED_LOCATIONS=1211;
    public static final int TOK_SKEWED_LOCATION_LIST=1212;
    public static final int TOK_SKEWED_LOCATION_MAP=1213;
    public static final int TOK_SMALLINT=1214;
    public static final int TOK_SORTBY=1215;
    public static final int TOK_START_TRANSACTION=1216;
    public static final int TOK_STORAGEHANDLER=1217;
    public static final int TOK_STOREDASDIRS=1218;
    public static final int TOK_STRING=1219;
    public static final int TOK_STRINGLITERALSEQUENCE=1220;
    public static final int TOK_STRUCT=1221;
    public static final int TOK_SUBQUERY=1222;
    public static final int TOK_SUBQUERY_EXPR=1223;
    public static final int TOK_SUBQUERY_OP=1224;
    public static final int TOK_SUBQUERY_OP_NOTEXISTS=1225;
    public static final int TOK_SUBQUERY_OP_NOTIN=1226;
    public static final int TOK_SUMMARY=1227;
    public static final int TOK_SWITCHDATABASE=1228;
    public static final int TOK_TAB=1229;
    public static final int TOK_TABALIAS=1230;
    public static final int TOK_TABCOL=1231;
    public static final int TOK_TABCOLLIST=1232;
    public static final int TOK_TABCOLNAME=1233;
    public static final int TOK_TABCOLVALUE=1234;
    public static final int TOK_TABCOLVALUES=1235;
    public static final int TOK_TABCOLVALUE_PAIR=1236;
    public static final int TOK_TABLEBUCKETSAMPLE=1237;
    public static final int TOK_TABLECOMMENT=1238;
    public static final int TOK_TABLEFILEFORMAT=1239;
    public static final int TOK_TABLELOCATION=1240;
    public static final int TOK_TABLEPARTCOLNAMES=1241;
    public static final int TOK_TABLEPARTCOLS=1242;
    public static final int TOK_TABLEPARTCOLSBYSPEC=1243;
    public static final int TOK_TABLEPROPERTIES=1244;
    public static final int TOK_TABLEPROPERTY=1245;
    public static final int TOK_TABLEPROPLIST=1246;
    public static final int TOK_TABLEROWFORMAT=1247;
    public static final int TOK_TABLEROWFORMATCOLLITEMS=1248;
    public static final int TOK_TABLEROWFORMATFIELD=1249;
    public static final int TOK_TABLEROWFORMATLINES=1250;
    public static final int TOK_TABLEROWFORMATMAPKEYS=1251;
    public static final int TOK_TABLEROWFORMATNULL=1252;
    public static final int TOK_TABLESERIALIZER=1253;
    public static final int TOK_TABLESKEWED=1254;
    public static final int TOK_TABLESPLITSAMPLE=1255;
    public static final int TOK_TABLE_OR_COL=1256;
    public static final int TOK_TABLE_PARTITION=1257;
    public static final int TOK_TABLE_TYPE=1258;
    public static final int TOK_TABNAME=1259;
    public static final int TOK_TABREF=1260;
    public static final int TOK_TABSORTCOLNAMEASC=1261;
    public static final int TOK_TABSORTCOLNAMEDESC=1262;
    public static final int TOK_TABSRC=1263;
    public static final int TOK_TABTYPE=1264;
    public static final int TOK_TEMPORARY=1265;
    public static final int TOK_TIMESTAMP=1266;
    public static final int TOK_TIMESTAMPLITERAL=1267;
    public static final int TOK_TIMESTAMPLOCALTZ=1268;
    public static final int TOK_TIMESTAMPLOCALTZLITERAL=1269;
    public static final int TOK_TINYINT=1270;
    public static final int TOK_TMP_FILE=1271;
    public static final int TOK_TO=1272;
    public static final int TOK_TRANSFORM=1273;
    public static final int TOK_TRIGGER_EXPRESSION=1274;
    public static final int TOK_TRUE=1275;
    public static final int TOK_TRUNCATE=1276;
    public static final int TOK_TRUNCATETABLE=1277;
    public static final int TOK_TXN_ACCESS_MODE=1278;
    public static final int TOK_TXN_READ_ONLY=1279;
    public static final int TOK_TXN_READ_WRITE=1280;
    public static final int TOK_UNIONALL=1281;
    public static final int TOK_UNIONDISTINCT=1282;
    public static final int TOK_UNIONTYPE=1283;
    public static final int TOK_UNIQUE=1284;
    public static final int TOK_UNIQUEJOIN=1285;
    public static final int TOK_UNKNOWN=1286;
    public static final int TOK_UNLOCKDB=1287;
    public static final int TOK_UNLOCKTABLE=1288;
    public static final int TOK_UNMANAGED=1289;
    public static final int TOK_UPDATE=1290;
    public static final int TOK_UPDATE_TABLE=1291;
    public static final int TOK_URI_TYPE=1292;
    public static final int TOK_USER=1293;
    public static final int TOK_USERSCRIPTCOLNAMES=1294;
    public static final int TOK_USERSCRIPTCOLSCHEMA=1295;
    public static final int TOK_VALIDATE=1296;
    public static final int TOK_VARCHAR=1297;
    public static final int TOK_VIEWCLUSTERCOLS=1298;
    public static final int TOK_VIEWDISTRIBUTECOLS=1299;
    public static final int TOK_VIEWPARTCOLS=1300;
    public static final int TOK_VIEWSORTCOLS=1301;
    public static final int TOK_WHERE=1302;
    public static final int TOK_WINDOWDEF=1303;
    public static final int TOK_WINDOWRANGE=1304;
    public static final int TOK_WINDOWSPEC=1305;
    public static final int TOK_WINDOWVALUES=1306;
    public static final int TOK_WITHIN_GROUP=1307;
    public static final int TOK_WITH_SNAPSHOT_RETENTION=1308;
    public static final int TOK_YEAR=1309;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators
    public HiveParser gHiveParser;
    public HiveParser gParent;


    public HiveParser_PrepareStatementParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_PrepareStatementParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
        super(input, state);
        this.gHiveParser = gHiveParser;
        gParent = gHiveParser;
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return HiveParser.tokenNames; }
    public String getGrammarFileName() { return "PrepareStatementParser.g"; }


      @Override
      public Object recoverFromMismatchedSet(IntStream input,
          RecognitionException re, BitSet follow) throws RecognitionException {
        throw re;
      }
      @Override
      public void displayRecognitionError(String[] tokenNames,
          RecognitionException e) {
        gParent.errors.add(new ParseError(gParent, e, tokenNames));
      }


    public static class prepareStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prepareStatement"
    // PrepareStatementParser.g:47:1: prepareStatement : KW_PREPARE identifier KW_FROM queryStatementExpression -> ^( TOK_PREPARE queryStatementExpression identifier ) ;
    public final HiveParser_PrepareStatementParser.prepareStatement_return prepareStatement() throws RecognitionException {
        HiveParser_PrepareStatementParser.prepareStatement_return retval = new HiveParser_PrepareStatementParser.prepareStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_PREPARE1=null;
        Token KW_FROM3=null;
        HiveParser_IdentifiersParser.identifier_return identifier2 =null;

        HiveParser.queryStatementExpression_return queryStatementExpression4 =null;


        ASTNode KW_PREPARE1_tree=null;
        ASTNode KW_FROM3_tree=null;
        RewriteRuleTokenStream stream_KW_PREPARE=new RewriteRuleTokenStream(adaptor,"token KW_PREPARE");
        RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");
         gParent.pushMsg("prepare statement ", state); 
        try {
            // PrepareStatementParser.g:50:5: ( KW_PREPARE identifier KW_FROM queryStatementExpression -> ^( TOK_PREPARE queryStatementExpression identifier ) )
            // PrepareStatementParser.g:50:7: KW_PREPARE identifier KW_FROM queryStatementExpression
            {
            KW_PREPARE1=(Token)match(input,KW_PREPARE,FOLLOW_KW_PREPARE_in_prepareStatement66);  
            stream_KW_PREPARE.add(KW_PREPARE1);


            pushFollow(FOLLOW_identifier_in_prepareStatement68);
            identifier2=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(identifier2.getTree());

            KW_FROM3=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_prepareStatement70);  
            stream_KW_FROM.add(KW_FROM3);


            pushFollow(FOLLOW_queryStatementExpression_in_prepareStatement72);
            queryStatementExpression4=gHiveParser.queryStatementExpression();

            state._fsp--;

            stream_queryStatementExpression.add(queryStatementExpression4.getTree());

            // AST REWRITE
            // elements: identifier, queryStatementExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 51:5: -> ^( TOK_PREPARE queryStatementExpression identifier )
            {
                // PrepareStatementParser.g:51:8: ^( TOK_PREPARE queryStatementExpression identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_PREPARE, "TOK_PREPARE")
                , root_1);

                adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.popMsg(state); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prepareStatement"


    public static class executeStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "executeStatement"
    // PrepareStatementParser.g:54:1: executeStatement : KW_EXECUTE identifier KW_USING executeParamList -> ^( TOK_EXECUTE executeParamList identifier ) ;
    public final HiveParser_PrepareStatementParser.executeStatement_return executeStatement() throws RecognitionException {
        HiveParser_PrepareStatementParser.executeStatement_return retval = new HiveParser_PrepareStatementParser.executeStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_EXECUTE5=null;
        Token KW_USING7=null;
        HiveParser_IdentifiersParser.identifier_return identifier6 =null;

        HiveParser_PrepareStatementParser.executeParamList_return executeParamList8 =null;


        ASTNode KW_EXECUTE5_tree=null;
        ASTNode KW_USING7_tree=null;
        RewriteRuleTokenStream stream_KW_USING=new RewriteRuleTokenStream(adaptor,"token KW_USING");
        RewriteRuleTokenStream stream_KW_EXECUTE=new RewriteRuleTokenStream(adaptor,"token KW_EXECUTE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_executeParamList=new RewriteRuleSubtreeStream(adaptor,"rule executeParamList");
         gParent.pushMsg("execute statement ", state); 
        try {
            // PrepareStatementParser.g:57:5: ( KW_EXECUTE identifier KW_USING executeParamList -> ^( TOK_EXECUTE executeParamList identifier ) )
            // PrepareStatementParser.g:57:7: KW_EXECUTE identifier KW_USING executeParamList
            {
            KW_EXECUTE5=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_executeStatement113);  
            stream_KW_EXECUTE.add(KW_EXECUTE5);


            pushFollow(FOLLOW_identifier_in_executeStatement115);
            identifier6=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(identifier6.getTree());

            KW_USING7=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_executeStatement117);  
            stream_KW_USING.add(KW_USING7);


            pushFollow(FOLLOW_executeParamList_in_executeStatement119);
            executeParamList8=executeParamList();

            state._fsp--;

            stream_executeParamList.add(executeParamList8.getTree());

            // AST REWRITE
            // elements: identifier, executeParamList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 58:5: -> ^( TOK_EXECUTE executeParamList identifier )
            {
                // PrepareStatementParser.g:58:8: ^( TOK_EXECUTE executeParamList identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_EXECUTE, "TOK_EXECUTE")
                , root_1);

                adaptor.addChild(root_1, stream_executeParamList.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.popMsg(state); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "executeStatement"


    public static class executeParamList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "executeParamList"
    // PrepareStatementParser.g:62:1: executeParamList : constant ( COMMA constant )* -> ^( TOK_EXECUTE_PARAM_LIST ( constant )+ ) ;
    public final HiveParser_PrepareStatementParser.executeParamList_return executeParamList() throws RecognitionException {
        HiveParser_PrepareStatementParser.executeParamList_return retval = new HiveParser_PrepareStatementParser.executeParamList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA10=null;
        HiveParser_IdentifiersParser.constant_return constant9 =null;

        HiveParser_IdentifiersParser.constant_return constant11 =null;


        ASTNode COMMA10_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_constant=new RewriteRuleSubtreeStream(adaptor,"rule constant");
         gParent.pushMsg("execute param list", state); 
        try {
            // PrepareStatementParser.g:65:5: ( constant ( COMMA constant )* -> ^( TOK_EXECUTE_PARAM_LIST ( constant )+ ) )
            // PrepareStatementParser.g:65:7: constant ( COMMA constant )*
            {
            pushFollow(FOLLOW_constant_in_executeParamList161);
            constant9=gHiveParser.constant();

            state._fsp--;

            stream_constant.add(constant9.getTree());

            // PrepareStatementParser.g:65:16: ( COMMA constant )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // PrepareStatementParser.g:65:17: COMMA constant
            	    {
            	    COMMA10=(Token)match(input,COMMA,FOLLOW_COMMA_in_executeParamList164);  
            	    stream_COMMA.add(COMMA10);


            	    pushFollow(FOLLOW_constant_in_executeParamList166);
            	    constant11=gHiveParser.constant();

            	    state._fsp--;

            	    stream_constant.add(constant11.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: constant
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 66:5: -> ^( TOK_EXECUTE_PARAM_LIST ( constant )+ )
            {
                // PrepareStatementParser.g:66:8: ^( TOK_EXECUTE_PARAM_LIST ( constant )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_EXECUTE_PARAM_LIST, "TOK_EXECUTE_PARAM_LIST")
                , root_1);

                if ( !(stream_constant.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_constant.hasNext() ) {
                    adaptor.addChild(root_1, stream_constant.nextTree());

                }
                stream_constant.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

             gParent.popMsg(state); 
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "executeParamList"

    // Delegated rules


 

    public static final BitSet FOLLOW_KW_PREPARE_in_prepareStatement66 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_prepareStatement68 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_FROM_in_prepareStatement70 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000100000000L,0x0000000000800000L,0x0400000004000000L,0x0000000000000000L,0x0000000040080080L});
    public static final BitSet FOLLOW_queryStatementExpression_in_prepareStatement72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_executeStatement113 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_executeStatement115 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_USING_in_executeStatement117 = new BitSet(new long[]{0x0000000002001000L,0x0000000206000000L,0x0000000000020000L,0x0000020000000000L,0x0000000000000000L,0x0000801800000000L,0x0001013000000000L});
    public static final BitSet FOLLOW_executeParamList_in_executeStatement119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constant_in_executeParamList161 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_executeParamList164 = new BitSet(new long[]{0x0000000002001000L,0x0000000206000000L,0x0000000000020000L,0x0000020000000000L,0x0000000000000000L,0x0000801800000000L,0x0001013000000000L});
    public static final BitSet FOLLOW_constant_in_executeParamList166 = new BitSet(new long[]{0x0000000000000202L});

}