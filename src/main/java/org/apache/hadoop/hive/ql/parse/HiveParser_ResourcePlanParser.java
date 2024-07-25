// $ANTLR 3.4 ResourcePlanParser.g 2024-07-25 22:38:45

package org.apache.hadoop.hive.ql.parse;


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
public class HiveParser_ResourcePlanParser extends Parser {
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


    public HiveParser_ResourcePlanParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_ResourcePlanParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
    public String getGrammarFileName() { return "ResourcePlanParser.g"; }


      @Override
      public Object recoverFromMismatchedSet(IntStream input,
          RecognitionException re, BitSet follow) throws RecognitionException {
        return gParent.recoverFromMismatchedSet(input, re, follow);
      }

      @Override
      public void displayRecognitionError(String[] tokenNames,
          RecognitionException e) {
        gParent.displayRecognitionError(tokenNames, e);
      }


    public static class resourcePlanDdlStatements_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "resourcePlanDdlStatements"
    // ResourcePlanParser.g:46:1: resourcePlanDdlStatements : ( createResourcePlanStatement | alterResourcePlanStatement | dropResourcePlanStatement | globalWmStatement | replaceResourcePlanStatement | createTriggerStatement | alterTriggerStatement | dropTriggerStatement | createPoolStatement | alterPoolStatement | dropPoolStatement | createMappingStatement | alterMappingStatement | dropMappingStatement );
    public final HiveParser_ResourcePlanParser.resourcePlanDdlStatements_return resourcePlanDdlStatements() throws RecognitionException {
        HiveParser_ResourcePlanParser.resourcePlanDdlStatements_return retval = new HiveParser_ResourcePlanParser.resourcePlanDdlStatements_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_ResourcePlanParser.createResourcePlanStatement_return createResourcePlanStatement1 =null;

        HiveParser_ResourcePlanParser.alterResourcePlanStatement_return alterResourcePlanStatement2 =null;

        HiveParser_ResourcePlanParser.dropResourcePlanStatement_return dropResourcePlanStatement3 =null;

        HiveParser_ResourcePlanParser.globalWmStatement_return globalWmStatement4 =null;

        HiveParser_ResourcePlanParser.replaceResourcePlanStatement_return replaceResourcePlanStatement5 =null;

        HiveParser_ResourcePlanParser.createTriggerStatement_return createTriggerStatement6 =null;

        HiveParser_ResourcePlanParser.alterTriggerStatement_return alterTriggerStatement7 =null;

        HiveParser_ResourcePlanParser.dropTriggerStatement_return dropTriggerStatement8 =null;

        HiveParser_ResourcePlanParser.createPoolStatement_return createPoolStatement9 =null;

        HiveParser_ResourcePlanParser.alterPoolStatement_return alterPoolStatement10 =null;

        HiveParser_ResourcePlanParser.dropPoolStatement_return dropPoolStatement11 =null;

        HiveParser_ResourcePlanParser.createMappingStatement_return createMappingStatement12 =null;

        HiveParser_ResourcePlanParser.alterMappingStatement_return alterMappingStatement13 =null;

        HiveParser_ResourcePlanParser.dropMappingStatement_return dropMappingStatement14 =null;



        try {
            // ResourcePlanParser.g:47:5: ( createResourcePlanStatement | alterResourcePlanStatement | dropResourcePlanStatement | globalWmStatement | replaceResourcePlanStatement | createTriggerStatement | alterTriggerStatement | dropTriggerStatement | createPoolStatement | alterPoolStatement | dropPoolStatement | createMappingStatement | alterMappingStatement | dropMappingStatement )
            int alt1=14;
            switch ( input.LA(1) ) {
            case KW_CREATE:
                {
                switch ( input.LA(2) ) {
                case KW_RESOURCE:
                    {
                    alt1=1;
                    }
                    break;
                case KW_TRIGGER:
                    {
                    alt1=6;
                    }
                    break;
                case KW_POOL:
                    {
                    alt1=9;
                    }
                    break;
                case KW_APPLICATION:
                case KW_GROUP:
                case KW_USER:
                    {
                    alt1=12;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }

                }
                break;
            case KW_ALTER:
                {
                switch ( input.LA(2) ) {
                case KW_RESOURCE:
                    {
                    alt1=2;
                    }
                    break;
                case KW_TRIGGER:
                    {
                    alt1=7;
                    }
                    break;
                case KW_POOL:
                    {
                    alt1=10;
                    }
                    break;
                case KW_APPLICATION:
                case KW_GROUP:
                case KW_USER:
                    {
                    alt1=13;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 2, input);

                    throw nvae;

                }

                }
                break;
            case KW_DROP:
                {
                switch ( input.LA(2) ) {
                case KW_RESOURCE:
                    {
                    alt1=3;
                    }
                    break;
                case KW_TRIGGER:
                    {
                    alt1=8;
                    }
                    break;
                case KW_POOL:
                    {
                    alt1=11;
                    }
                    break;
                case KW_APPLICATION:
                case KW_GROUP:
                case KW_USER:
                    {
                    alt1=14;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 3, input);

                    throw nvae;

                }

                }
                break;
            case KW_DISABLE:
            case KW_ENABLE:
                {
                alt1=4;
                }
                break;
            case KW_REPLACE:
                {
                alt1=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }

            switch (alt1) {
                case 1 :
                    // ResourcePlanParser.g:47:7: createResourcePlanStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_createResourcePlanStatement_in_resourcePlanDdlStatements63);
                    createResourcePlanStatement1=createResourcePlanStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, createResourcePlanStatement1.getTree());

                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:48:7: alterResourcePlanStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterResourcePlanStatement_in_resourcePlanDdlStatements71);
                    alterResourcePlanStatement2=alterResourcePlanStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, alterResourcePlanStatement2.getTree());

                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:49:7: dropResourcePlanStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_dropResourcePlanStatement_in_resourcePlanDdlStatements79);
                    dropResourcePlanStatement3=dropResourcePlanStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, dropResourcePlanStatement3.getTree());

                    }
                    break;
                case 4 :
                    // ResourcePlanParser.g:50:7: globalWmStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_globalWmStatement_in_resourcePlanDdlStatements87);
                    globalWmStatement4=globalWmStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, globalWmStatement4.getTree());

                    }
                    break;
                case 5 :
                    // ResourcePlanParser.g:51:7: replaceResourcePlanStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_replaceResourcePlanStatement_in_resourcePlanDdlStatements95);
                    replaceResourcePlanStatement5=replaceResourcePlanStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, replaceResourcePlanStatement5.getTree());

                    }
                    break;
                case 6 :
                    // ResourcePlanParser.g:52:7: createTriggerStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_createTriggerStatement_in_resourcePlanDdlStatements103);
                    createTriggerStatement6=createTriggerStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, createTriggerStatement6.getTree());

                    }
                    break;
                case 7 :
                    // ResourcePlanParser.g:53:7: alterTriggerStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterTriggerStatement_in_resourcePlanDdlStatements111);
                    alterTriggerStatement7=alterTriggerStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, alterTriggerStatement7.getTree());

                    }
                    break;
                case 8 :
                    // ResourcePlanParser.g:54:7: dropTriggerStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_dropTriggerStatement_in_resourcePlanDdlStatements119);
                    dropTriggerStatement8=dropTriggerStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, dropTriggerStatement8.getTree());

                    }
                    break;
                case 9 :
                    // ResourcePlanParser.g:55:7: createPoolStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_createPoolStatement_in_resourcePlanDdlStatements127);
                    createPoolStatement9=createPoolStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, createPoolStatement9.getTree());

                    }
                    break;
                case 10 :
                    // ResourcePlanParser.g:56:7: alterPoolStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterPoolStatement_in_resourcePlanDdlStatements135);
                    alterPoolStatement10=alterPoolStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, alterPoolStatement10.getTree());

                    }
                    break;
                case 11 :
                    // ResourcePlanParser.g:57:7: dropPoolStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_dropPoolStatement_in_resourcePlanDdlStatements143);
                    dropPoolStatement11=dropPoolStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, dropPoolStatement11.getTree());

                    }
                    break;
                case 12 :
                    // ResourcePlanParser.g:58:7: createMappingStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_createMappingStatement_in_resourcePlanDdlStatements151);
                    createMappingStatement12=createMappingStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, createMappingStatement12.getTree());

                    }
                    break;
                case 13 :
                    // ResourcePlanParser.g:59:7: alterMappingStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterMappingStatement_in_resourcePlanDdlStatements159);
                    alterMappingStatement13=alterMappingStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, alterMappingStatement13.getTree());

                    }
                    break;
                case 14 :
                    // ResourcePlanParser.g:60:7: dropMappingStatement
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_dropMappingStatement_in_resourcePlanDdlStatements167);
                    dropMappingStatement14=dropMappingStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, dropMappingStatement14.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "resourcePlanDdlStatements"


    public static class rpAssign_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rpAssign"
    // ResourcePlanParser.g:63:1: rpAssign : ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) ) ;
    public final HiveParser_ResourcePlanParser.rpAssign_return rpAssign() throws RecognitionException {
        HiveParser_ResourcePlanParser.rpAssign_return retval = new HiveParser_ResourcePlanParser.rpAssign_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token parallelism=null;
        Token KW_QUERY_PARALLELISM15=null;
        Token EQUAL16=null;
        Token KW_DEFAULT17=null;
        Token KW_POOL18=null;
        Token EQUAL19=null;
        HiveParser_ResourcePlanParser.poolPath_return poolPath20 =null;


        ASTNode parallelism_tree=null;
        ASTNode KW_QUERY_PARALLELISM15_tree=null;
        ASTNode EQUAL16_tree=null;
        ASTNode KW_DEFAULT17_tree=null;
        ASTNode KW_POOL18_tree=null;
        ASTNode EQUAL19_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
        RewriteRuleTokenStream stream_KW_DEFAULT=new RewriteRuleTokenStream(adaptor,"token KW_DEFAULT");
        RewriteRuleTokenStream stream_KW_QUERY_PARALLELISM=new RewriteRuleTokenStream(adaptor,"token KW_QUERY_PARALLELISM");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
         gParent.pushMsg("rpAssign", state); 
        try {
            // ResourcePlanParser.g:66:3: ( ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) ) )
            // ResourcePlanParser.g:66:5: ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) )
            {
            // ResourcePlanParser.g:66:5: ( ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_DEFAULT KW_POOL EQUAL poolPath ) -> ^( TOK_DEFAULT_POOL poolPath ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==KW_QUERY_PARALLELISM) ) {
                alt2=1;
            }
            else if ( (LA2_0==KW_DEFAULT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // ResourcePlanParser.g:67:7: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
                    {
                    // ResourcePlanParser.g:67:7: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
                    // ResourcePlanParser.g:67:8: KW_QUERY_PARALLELISM EQUAL parallelism= Number
                    {
                    KW_QUERY_PARALLELISM15=(Token)match(input,KW_QUERY_PARALLELISM,FOLLOW_KW_QUERY_PARALLELISM_in_rpAssign201);  
                    stream_KW_QUERY_PARALLELISM.add(KW_QUERY_PARALLELISM15);


                    EQUAL16=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_rpAssign203);  
                    stream_EQUAL.add(EQUAL16);


                    parallelism=(Token)match(input,Number,FOLLOW_Number_in_rpAssign207);  
                    stream_Number.add(parallelism);


                    }


                    // AST REWRITE
                    // elements: parallelism
                    // token labels: parallelism
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_parallelism=new RewriteRuleTokenStream(adaptor,"token parallelism",parallelism);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 67:55: -> ^( TOK_QUERY_PARALLELISM $parallelism)
                    {
                        // ResourcePlanParser.g:67:58: ^( TOK_QUERY_PARALLELISM $parallelism)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_QUERY_PARALLELISM, "TOK_QUERY_PARALLELISM")
                        , root_1);

                        adaptor.addChild(root_1, stream_parallelism.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:68:7: ( KW_DEFAULT KW_POOL EQUAL poolPath )
                    {
                    // ResourcePlanParser.g:68:7: ( KW_DEFAULT KW_POOL EQUAL poolPath )
                    // ResourcePlanParser.g:68:8: KW_DEFAULT KW_POOL EQUAL poolPath
                    {
                    KW_DEFAULT17=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_rpAssign226);  
                    stream_KW_DEFAULT.add(KW_DEFAULT17);


                    KW_POOL18=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_rpAssign228);  
                    stream_KW_POOL.add(KW_POOL18);


                    EQUAL19=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_rpAssign230);  
                    stream_EQUAL.add(EQUAL19);


                    pushFollow(FOLLOW_poolPath_in_rpAssign232);
                    poolPath20=poolPath();

                    state._fsp--;

                    stream_poolPath.add(poolPath20.getTree());

                    }


                    // AST REWRITE
                    // elements: poolPath
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 68:43: -> ^( TOK_DEFAULT_POOL poolPath )
                    {
                        // ResourcePlanParser.g:68:46: ^( TOK_DEFAULT_POOL poolPath )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_DEFAULT_POOL, "TOK_DEFAULT_POOL")
                        , root_1);

                        adaptor.addChild(root_1, stream_poolPath.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


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
    // $ANTLR end "rpAssign"


    public static class rpAssignList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rpAssignList"
    // ResourcePlanParser.g:72:1: rpAssignList : rpAssign ( COMMA rpAssign )* -> ( rpAssign )+ ;
    public final HiveParser_ResourcePlanParser.rpAssignList_return rpAssignList() throws RecognitionException {
        HiveParser_ResourcePlanParser.rpAssignList_return retval = new HiveParser_ResourcePlanParser.rpAssignList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA22=null;
        HiveParser_ResourcePlanParser.rpAssign_return rpAssign21 =null;

        HiveParser_ResourcePlanParser.rpAssign_return rpAssign23 =null;


        ASTNode COMMA22_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_rpAssign=new RewriteRuleSubtreeStream(adaptor,"rule rpAssign");
         gParent.pushMsg("rpAssignList", state); 
        try {
            // ResourcePlanParser.g:75:3: ( rpAssign ( COMMA rpAssign )* -> ( rpAssign )+ )
            // ResourcePlanParser.g:75:5: rpAssign ( COMMA rpAssign )*
            {
            pushFollow(FOLLOW_rpAssign_in_rpAssignList270);
            rpAssign21=rpAssign();

            state._fsp--;

            stream_rpAssign.add(rpAssign21.getTree());

            // ResourcePlanParser.g:75:14: ( COMMA rpAssign )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ResourcePlanParser.g:75:15: COMMA rpAssign
            	    {
            	    COMMA22=(Token)match(input,COMMA,FOLLOW_COMMA_in_rpAssignList273);  
            	    stream_COMMA.add(COMMA22);


            	    pushFollow(FOLLOW_rpAssign_in_rpAssignList275);
            	    rpAssign23=rpAssign();

            	    state._fsp--;

            	    stream_rpAssign.add(rpAssign23.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: rpAssign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 75:32: -> ( rpAssign )+
            {
                if ( !(stream_rpAssign.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rpAssign.hasNext() ) {
                    adaptor.addChild(root_0, stream_rpAssign.nextTree());

                }
                stream_rpAssign.reset();

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
    // $ANTLR end "rpAssignList"


    public static class rpUnassign_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rpUnassign"
    // ResourcePlanParser.g:78:1: rpUnassign : ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL ) ) ;
    public final HiveParser_ResourcePlanParser.rpUnassign_return rpUnassign() throws RecognitionException {
        HiveParser_ResourcePlanParser.rpUnassign_return retval = new HiveParser_ResourcePlanParser.rpUnassign_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_QUERY_PARALLELISM24=null;
        Token KW_DEFAULT25=null;
        Token KW_POOL26=null;

        ASTNode KW_QUERY_PARALLELISM24_tree=null;
        ASTNode KW_DEFAULT25_tree=null;
        ASTNode KW_POOL26_tree=null;
        RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
        RewriteRuleTokenStream stream_KW_DEFAULT=new RewriteRuleTokenStream(adaptor,"token KW_DEFAULT");
        RewriteRuleTokenStream stream_KW_QUERY_PARALLELISM=new RewriteRuleTokenStream(adaptor,"token KW_QUERY_PARALLELISM");

         gParent.pushMsg("rpUnassign", state); 
        try {
            // ResourcePlanParser.g:81:3: ( ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL ) ) )
            // ResourcePlanParser.g:81:5: ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL ) )
            {
            // ResourcePlanParser.g:81:5: ( ( KW_QUERY_PARALLELISM ) -> ^( TOK_QUERY_PARALLELISM ) | ( KW_DEFAULT KW_POOL ) -> ^( TOK_DEFAULT_POOL ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==KW_QUERY_PARALLELISM) ) {
                alt4=1;
            }
            else if ( (LA4_0==KW_DEFAULT) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // ResourcePlanParser.g:82:7: ( KW_QUERY_PARALLELISM )
                    {
                    // ResourcePlanParser.g:82:7: ( KW_QUERY_PARALLELISM )
                    // ResourcePlanParser.g:82:8: KW_QUERY_PARALLELISM
                    {
                    KW_QUERY_PARALLELISM24=(Token)match(input,KW_QUERY_PARALLELISM,FOLLOW_KW_QUERY_PARALLELISM_in_rpUnassign314);  
                    stream_KW_QUERY_PARALLELISM.add(KW_QUERY_PARALLELISM24);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 82:30: -> ^( TOK_QUERY_PARALLELISM )
                    {
                        // ResourcePlanParser.g:82:33: ^( TOK_QUERY_PARALLELISM )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_QUERY_PARALLELISM, "TOK_QUERY_PARALLELISM")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:83:7: ( KW_DEFAULT KW_POOL )
                    {
                    // ResourcePlanParser.g:83:7: ( KW_DEFAULT KW_POOL )
                    // ResourcePlanParser.g:83:8: KW_DEFAULT KW_POOL
                    {
                    KW_DEFAULT25=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_rpUnassign330);  
                    stream_KW_DEFAULT.add(KW_DEFAULT25);


                    KW_POOL26=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_rpUnassign332);  
                    stream_KW_POOL.add(KW_POOL26);


                    }


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 83:28: -> ^( TOK_DEFAULT_POOL )
                    {
                        // ResourcePlanParser.g:83:31: ^( TOK_DEFAULT_POOL )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_DEFAULT_POOL, "TOK_DEFAULT_POOL")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


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
    // $ANTLR end "rpUnassign"


    public static class rpUnassignList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "rpUnassignList"
    // ResourcePlanParser.g:87:1: rpUnassignList : rpUnassign ( COMMA rpUnassign )* -> ( rpUnassign )+ ;
    public final HiveParser_ResourcePlanParser.rpUnassignList_return rpUnassignList() throws RecognitionException {
        HiveParser_ResourcePlanParser.rpUnassignList_return retval = new HiveParser_ResourcePlanParser.rpUnassignList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA28=null;
        HiveParser_ResourcePlanParser.rpUnassign_return rpUnassign27 =null;

        HiveParser_ResourcePlanParser.rpUnassign_return rpUnassign29 =null;


        ASTNode COMMA28_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_rpUnassign=new RewriteRuleSubtreeStream(adaptor,"rule rpUnassign");
         gParent.pushMsg("rpAssignList", state); 
        try {
            // ResourcePlanParser.g:90:3: ( rpUnassign ( COMMA rpUnassign )* -> ( rpUnassign )+ )
            // ResourcePlanParser.g:90:5: rpUnassign ( COMMA rpUnassign )*
            {
            pushFollow(FOLLOW_rpUnassign_in_rpUnassignList368);
            rpUnassign27=rpUnassign();

            state._fsp--;

            stream_rpUnassign.add(rpUnassign27.getTree());

            // ResourcePlanParser.g:90:16: ( COMMA rpUnassign )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==COMMA) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ResourcePlanParser.g:90:17: COMMA rpUnassign
            	    {
            	    COMMA28=(Token)match(input,COMMA,FOLLOW_COMMA_in_rpUnassignList371);  
            	    stream_COMMA.add(COMMA28);


            	    pushFollow(FOLLOW_rpUnassign_in_rpUnassignList373);
            	    rpUnassign29=rpUnassign();

            	    state._fsp--;

            	    stream_rpUnassign.add(rpUnassign29.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // AST REWRITE
            // elements: rpUnassign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 90:36: -> ( rpUnassign )+
            {
                if ( !(stream_rpUnassign.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_rpUnassign.hasNext() ) {
                    adaptor.addChild(root_0, stream_rpUnassign.nextTree());

                }
                stream_rpUnassign.reset();

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
    // $ANTLR end "rpUnassignList"


    public static class createResourcePlanStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createResourcePlanStatement"
    // ResourcePlanParser.g:93:1: createResourcePlanStatement : KW_CREATE KW_RESOURCE KW_PLAN ( ifNotExists )? ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) ) ;
    public final HiveParser_ResourcePlanParser.createResourcePlanStatement_return createResourcePlanStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.createResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.createResourcePlanStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CREATE30=null;
        Token KW_RESOURCE31=null;
        Token KW_PLAN32=null;
        Token KW_LIKE34=null;
        Token KW_WITH35=null;
        HiveParser_IdentifiersParser.identifier_return name =null;

        HiveParser_IdentifiersParser.identifier_return likeName =null;

        HiveParser.ifNotExists_return ifNotExists33 =null;

        HiveParser_ResourcePlanParser.rpAssignList_return rpAssignList36 =null;


        ASTNode KW_CREATE30_tree=null;
        ASTNode KW_RESOURCE31_tree=null;
        ASTNode KW_PLAN32_tree=null;
        ASTNode KW_LIKE34_tree=null;
        ASTNode KW_WITH35_tree=null;
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
        RewriteRuleTokenStream stream_KW_LIKE=new RewriteRuleTokenStream(adaptor,"token KW_LIKE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_rpAssignList=new RewriteRuleSubtreeStream(adaptor,"rule rpAssignList");
        RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
         gParent.pushMsg("create resource plan statement", state); 
        try {
            // ResourcePlanParser.g:96:5: ( KW_CREATE KW_RESOURCE KW_PLAN ( ifNotExists )? ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) ) )
            // ResourcePlanParser.g:96:7: KW_CREATE KW_RESOURCE KW_PLAN ( ifNotExists )? ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) )
            {
            KW_CREATE30=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createResourcePlanStatement405);  
            stream_KW_CREATE.add(KW_CREATE30);


            KW_RESOURCE31=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_createResourcePlanStatement407);  
            stream_KW_RESOURCE.add(KW_RESOURCE31);


            KW_PLAN32=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_createResourcePlanStatement409);  
            stream_KW_PLAN.add(KW_PLAN32);


            // ResourcePlanParser.g:96:37: ( ifNotExists )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==KW_IF) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ResourcePlanParser.g:96:37: ifNotExists
                    {
                    pushFollow(FOLLOW_ifNotExists_in_createResourcePlanStatement411);
                    ifNotExists33=gHiveParser.ifNotExists();

                    state._fsp--;

                    stream_ifNotExists.add(ifNotExists33.getTree());

                    }
                    break;

            }


            // ResourcePlanParser.g:96:50: ( (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) ) | (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) ) )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Identifier) ) {
                int LA8_1 = input.LA(2);

                if ( (LA8_1==KW_LIKE) ) {
                    alt8=1;
                }
                else if ( (LA8_1==EOF||LA8_1==KW_WITH) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA8_0 >= KW_ABORT && LA8_0 <= KW_AFTER)||LA8_0==KW_ALLOC_FRACTION||LA8_0==KW_ANALYZE||LA8_0==KW_ARCHIVE||(LA8_0 >= KW_ASC && LA8_0 <= KW_AT)||(LA8_0 >= KW_AUTOCOMMIT && LA8_0 <= KW_BEFORE)||(LA8_0 >= KW_BRANCH && LA8_0 <= KW_BUCKETS)||(LA8_0 >= KW_CACHE && LA8_0 <= KW_CASCADE)||(LA8_0 >= KW_CBO && LA8_0 <= KW_CHANGE)||LA8_0==KW_CHECK||(LA8_0 >= KW_CLUSTER && LA8_0 <= KW_COLLECTION)||(LA8_0 >= KW_COLUMNS && LA8_0 <= KW_COMMENT)||(LA8_0 >= KW_COMPACT && LA8_0 <= KW_COMPACTIONS)||(LA8_0 >= KW_COMPUTE && LA8_0 <= KW_CONCATENATE)||LA8_0==KW_CONTINUE||LA8_0==KW_COST||LA8_0==KW_CRON||LA8_0==KW_DATA||LA8_0==KW_DATABASES||(LA8_0 >= KW_DATETIME && LA8_0 <= KW_DCPROPERTIES)||LA8_0==KW_DEBUG||(LA8_0 >= KW_DEFAULT && LA8_0 <= KW_DEFINED)||(LA8_0 >= KW_DELIMITED && LA8_0 <= KW_DESC)||(LA8_0 >= KW_DETAIL && LA8_0 <= KW_DISABLE)||(LA8_0 >= KW_DISTRIBUTE && LA8_0 <= KW_DO)||LA8_0==KW_DOW||(LA8_0 >= KW_DUMP && LA8_0 <= KW_ELEM_TYPE)||LA8_0==KW_ENABLE||(LA8_0 >= KW_ENFORCED && LA8_0 <= KW_EVERY)||(LA8_0 >= KW_EXCLUSIVE && LA8_0 <= KW_EXECUTED)||(LA8_0 >= KW_EXPIRE_SNAPSHOTS && LA8_0 <= KW_EXPRESSION)||LA8_0==KW_FAST_FORWARD||(LA8_0 >= KW_FIELDS && LA8_0 <= KW_FIRST)||(LA8_0 >= KW_FORMAT && LA8_0 <= KW_FORMATTED)||LA8_0==KW_FUNCTIONS||(LA8_0 >= KW_HOUR && LA8_0 <= KW_IDXPROPERTIES)||LA8_0==KW_IGNORE||(LA8_0 >= KW_INDEX && LA8_0 <= KW_INDEXES)||(LA8_0 >= KW_INPATH && LA8_0 <= KW_INPUTFORMAT)||(LA8_0 >= KW_ISOLATION && LA8_0 <= KW_JAR)||(LA8_0 >= KW_JOINCOST && LA8_0 <= KW_LAST)||LA8_0==KW_LEVEL||(LA8_0 >= KW_LIMIT && LA8_0 <= KW_LOAD)||(LA8_0 >= KW_LOCATION && LA8_0 <= KW_LONG)||(LA8_0 >= KW_MANAGED && LA8_0 <= KW_MANAGEMENT)||(LA8_0 >= KW_MAPJOIN && LA8_0 <= KW_MATERIALIZED)||LA8_0==KW_METADATA||(LA8_0 >= KW_MINUTE && LA8_0 <= KW_MONTH)||(LA8_0 >= KW_MOVE && LA8_0 <= KW_MSCK)||(LA8_0 >= KW_NORELY && LA8_0 <= KW_NOSCAN)||LA8_0==KW_NOVALIDATE||LA8_0==KW_NULLS||LA8_0==KW_OFFSET||(LA8_0 >= KW_OPERATOR && LA8_0 <= KW_OPTION)||(LA8_0 >= KW_OUTPUTDRIVER && LA8_0 <= KW_OUTPUTFORMAT)||(LA8_0 >= KW_OVERWRITE && LA8_0 <= KW_OWNER)||(LA8_0 >= KW_PARTITIONED && LA8_0 <= KW_PATH)||(LA8_0 >= KW_PLAN && LA8_0 <= KW_POOL)||LA8_0==KW_PRINCIPALS||LA8_0==KW_PURGE||(LA8_0 >= KW_QUARTER && LA8_0 <= KW_QUERY_PARALLELISM)||LA8_0==KW_READ||(LA8_0 >= KW_REBUILD && LA8_0 <= KW_RECORDWRITER)||(LA8_0 >= KW_RELOAD && LA8_0 <= KW_RETENTION)||LA8_0==KW_REWRITE||(LA8_0 >= KW_ROLE && LA8_0 <= KW_ROLES)||(LA8_0 >= KW_SCHEDULED && LA8_0 <= KW_SECOND)||(LA8_0 >= KW_SEMI && LA8_0 <= KW_SERVER)||(LA8_0 >= KW_SETS && LA8_0 <= KW_SKEWED)||(LA8_0 >= KW_SNAPSHOT && LA8_0 <= KW_SNAPSHOTS)||(LA8_0 >= KW_SORT && LA8_0 <= KW_SSL)||(LA8_0 >= KW_STATISTICS && LA8_0 <= KW_SUMMARY)||(LA8_0 >= KW_SYSTEM_TIME && LA8_0 <= KW_SYSTEM_VERSION)||LA8_0==KW_TABLES||(LA8_0 >= KW_TAG && LA8_0 <= KW_TERMINATED)||LA8_0==KW_TINYINT||LA8_0==KW_TOUCH||(LA8_0 >= KW_TRANSACTION && LA8_0 <= KW_TRANSACTIONS)||LA8_0==KW_TRIM||(LA8_0 >= KW_TYPE && LA8_0 <= KW_UNARCHIVE)||LA8_0==KW_UNDO||LA8_0==KW_UNIONTYPE||(LA8_0 >= KW_UNKNOWN && LA8_0 <= KW_UNSIGNED)||(LA8_0 >= KW_URI && LA8_0 <= KW_USE)||(LA8_0 >= KW_UTC && LA8_0 <= KW_VALIDATE)||LA8_0==KW_VALUE_TYPE||(LA8_0 >= KW_VECTORIZATION && LA8_0 <= KW_WEEK)||LA8_0==KW_WHILE||(LA8_0 >= KW_WITHIN && LA8_0 <= KW_ZONE)||LA8_0==KW_BATCH||LA8_0==KW_DAYOFWEEK||LA8_0==KW_HOLD_DDLTIME||LA8_0==KW_NO_DROP||LA8_0==KW_OFFLINE||LA8_0==KW_PROTECTION||LA8_0==KW_READONLY||LA8_0==KW_TIMESTAMPTZ) ) {
                int LA8_2 = input.LA(2);

                if ( (LA8_2==KW_LIKE) ) {
                    alt8=1;
                }
                else if ( (LA8_2==EOF||LA8_2==KW_WITH) ) {
                    alt8=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 8, 2, input);

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
                    // ResourcePlanParser.g:97:11: (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) )
                    {
                    // ResourcePlanParser.g:97:11: (name= identifier KW_LIKE likeName= identifier -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) ) )
                    // ResourcePlanParser.g:97:12: name= identifier KW_LIKE likeName= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_createResourcePlanStatement429);
                    name=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(name.getTree());

                    KW_LIKE34=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_createResourcePlanStatement431);  
                    stream_KW_LIKE.add(KW_LIKE34);


                    pushFollow(FOLLOW_identifier_in_createResourcePlanStatement435);
                    likeName=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(likeName.getTree());

                    // AST REWRITE
                    // elements: likeName, name, ifNotExists
                    // token labels: 
                    // rule labels: likeName, name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_likeName=new RewriteRuleSubtreeStream(adaptor,"rule likeName",likeName!=null?likeName.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 97:56: -> ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) )
                    {
                        // ResourcePlanParser.g:97:59: ^( TOK_CREATE_RP $name ( ifNotExists )? ^( TOK_LIKERP $likeName) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_CREATE_RP, "TOK_CREATE_RP")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        // ResourcePlanParser.g:97:81: ( ifNotExists )?
                        if ( stream_ifNotExists.hasNext() ) {
                            adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                        }
                        stream_ifNotExists.reset();

                        // ResourcePlanParser.g:97:94: ^( TOK_LIKERP $likeName)
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LIKERP, "TOK_LIKERP")
                        , root_2);

                        adaptor.addChild(root_2, stream_likeName.nextTree());

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:98:11: (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) )
                    {
                    // ResourcePlanParser.g:98:11: (name= identifier ( KW_WITH rpAssignList )? -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? ) )
                    // ResourcePlanParser.g:98:12: name= identifier ( KW_WITH rpAssignList )?
                    {
                    pushFollow(FOLLOW_identifier_in_createResourcePlanStatement470);
                    name=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(name.getTree());

                    // ResourcePlanParser.g:98:28: ( KW_WITH rpAssignList )?
                    int alt7=2;
                    int LA7_0 = input.LA(1);

                    if ( (LA7_0==KW_WITH) ) {
                        alt7=1;
                    }
                    switch (alt7) {
                        case 1 :
                            // ResourcePlanParser.g:98:29: KW_WITH rpAssignList
                            {
                            KW_WITH35=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createResourcePlanStatement473);  
                            stream_KW_WITH.add(KW_WITH35);


                            pushFollow(FOLLOW_rpAssignList_in_createResourcePlanStatement475);
                            rpAssignList36=rpAssignList();

                            state._fsp--;

                            stream_rpAssignList.add(rpAssignList36.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: rpAssignList, ifNotExists, name
                    // token labels: 
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 98:52: -> ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? )
                    {
                        // ResourcePlanParser.g:98:55: ^( TOK_CREATE_RP $name ( ifNotExists )? ( rpAssignList )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_CREATE_RP, "TOK_CREATE_RP")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        // ResourcePlanParser.g:98:77: ( ifNotExists )?
                        if ( stream_ifNotExists.hasNext() ) {
                            adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                        }
                        stream_ifNotExists.reset();

                        // ResourcePlanParser.g:98:90: ( rpAssignList )?
                        if ( stream_rpAssignList.hasNext() ) {
                            adaptor.addChild(root_1, stream_rpAssignList.nextTree());

                        }
                        stream_rpAssignList.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "createResourcePlanStatement"


    public static class withReplace_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "withReplace"
    // ResourcePlanParser.g:103:1: withReplace : KW_WITH KW_REPLACE -> ^( TOK_REPLACE ) ;
    public final HiveParser_ResourcePlanParser.withReplace_return withReplace() throws RecognitionException {
        HiveParser_ResourcePlanParser.withReplace_return retval = new HiveParser_ResourcePlanParser.withReplace_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_WITH37=null;
        Token KW_REPLACE38=null;

        ASTNode KW_WITH37_tree=null;
        ASTNode KW_REPLACE38_tree=null;
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");

        try {
            // ResourcePlanParser.g:103:13: ( KW_WITH KW_REPLACE -> ^( TOK_REPLACE ) )
            // ResourcePlanParser.g:103:15: KW_WITH KW_REPLACE
            {
            KW_WITH37=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_withReplace515);  
            stream_KW_WITH.add(KW_WITH37);


            KW_REPLACE38=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_withReplace517);  
            stream_KW_REPLACE.add(KW_REPLACE38);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 103:34: -> ^( TOK_REPLACE )
            {
                // ResourcePlanParser.g:103:37: ^( TOK_REPLACE )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_REPLACE, "TOK_REPLACE")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "withReplace"


    public static class activate_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "activate"
    // ResourcePlanParser.g:104:1: activate : KW_ACTIVATE ( withReplace )? -> ^( TOK_ACTIVATE ( withReplace )? ) ;
    public final HiveParser_ResourcePlanParser.activate_return activate() throws RecognitionException {
        HiveParser_ResourcePlanParser.activate_return retval = new HiveParser_ResourcePlanParser.activate_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ACTIVATE39=null;
        HiveParser_ResourcePlanParser.withReplace_return withReplace40 =null;


        ASTNode KW_ACTIVATE39_tree=null;
        RewriteRuleTokenStream stream_KW_ACTIVATE=new RewriteRuleTokenStream(adaptor,"token KW_ACTIVATE");
        RewriteRuleSubtreeStream stream_withReplace=new RewriteRuleSubtreeStream(adaptor,"rule withReplace");
        try {
            // ResourcePlanParser.g:104:10: ( KW_ACTIVATE ( withReplace )? -> ^( TOK_ACTIVATE ( withReplace )? ) )
            // ResourcePlanParser.g:104:12: KW_ACTIVATE ( withReplace )?
            {
            KW_ACTIVATE39=(Token)match(input,KW_ACTIVATE,FOLLOW_KW_ACTIVATE_in_activate530);  
            stream_KW_ACTIVATE.add(KW_ACTIVATE39);


            // ResourcePlanParser.g:104:24: ( withReplace )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==KW_WITH) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ResourcePlanParser.g:104:24: withReplace
                    {
                    pushFollow(FOLLOW_withReplace_in_activate532);
                    withReplace40=withReplace();

                    state._fsp--;

                    stream_withReplace.add(withReplace40.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: withReplace
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 104:37: -> ^( TOK_ACTIVATE ( withReplace )? )
            {
                // ResourcePlanParser.g:104:40: ^( TOK_ACTIVATE ( withReplace )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ACTIVATE, "TOK_ACTIVATE")
                , root_1);

                // ResourcePlanParser.g:104:55: ( withReplace )?
                if ( stream_withReplace.hasNext() ) {
                    adaptor.addChild(root_1, stream_withReplace.nextTree());

                }
                stream_withReplace.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "activate"


    public static class enable_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "enable"
    // ResourcePlanParser.g:105:1: enable : KW_ENABLE -> ^( TOK_ENABLE ) ;
    public final HiveParser_ResourcePlanParser.enable_return enable() throws RecognitionException {
        HiveParser_ResourcePlanParser.enable_return retval = new HiveParser_ResourcePlanParser.enable_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ENABLE41=null;

        ASTNode KW_ENABLE41_tree=null;
        RewriteRuleTokenStream stream_KW_ENABLE=new RewriteRuleTokenStream(adaptor,"token KW_ENABLE");

        try {
            // ResourcePlanParser.g:105:8: ( KW_ENABLE -> ^( TOK_ENABLE ) )
            // ResourcePlanParser.g:105:10: KW_ENABLE
            {
            KW_ENABLE41=(Token)match(input,KW_ENABLE,FOLLOW_KW_ENABLE_in_enable549);  
            stream_KW_ENABLE.add(KW_ENABLE41);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 105:20: -> ^( TOK_ENABLE )
            {
                // ResourcePlanParser.g:105:23: ^( TOK_ENABLE )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ENABLE, "TOK_ENABLE")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "enable"


    public static class disable_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "disable"
    // ResourcePlanParser.g:106:1: disable : KW_DISABLE -> ^( TOK_DISABLE ) ;
    public final HiveParser_ResourcePlanParser.disable_return disable() throws RecognitionException {
        HiveParser_ResourcePlanParser.disable_return retval = new HiveParser_ResourcePlanParser.disable_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DISABLE42=null;

        ASTNode KW_DISABLE42_tree=null;
        RewriteRuleTokenStream stream_KW_DISABLE=new RewriteRuleTokenStream(adaptor,"token KW_DISABLE");

        try {
            // ResourcePlanParser.g:106:9: ( KW_DISABLE -> ^( TOK_DISABLE ) )
            // ResourcePlanParser.g:106:11: KW_DISABLE
            {
            KW_DISABLE42=(Token)match(input,KW_DISABLE,FOLLOW_KW_DISABLE_in_disable562);  
            stream_KW_DISABLE.add(KW_DISABLE42);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 106:22: -> ^( TOK_DISABLE )
            {
                // ResourcePlanParser.g:106:25: ^( TOK_DISABLE )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DISABLE, "TOK_DISABLE")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "disable"


    public static class unmanaged_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "unmanaged"
    // ResourcePlanParser.g:107:1: unmanaged : KW_UNMANAGED -> ^( TOK_UNMANAGED ) ;
    public final HiveParser_ResourcePlanParser.unmanaged_return unmanaged() throws RecognitionException {
        HiveParser_ResourcePlanParser.unmanaged_return retval = new HiveParser_ResourcePlanParser.unmanaged_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_UNMANAGED43=null;

        ASTNode KW_UNMANAGED43_tree=null;
        RewriteRuleTokenStream stream_KW_UNMANAGED=new RewriteRuleTokenStream(adaptor,"token KW_UNMANAGED");

        try {
            // ResourcePlanParser.g:107:11: ( KW_UNMANAGED -> ^( TOK_UNMANAGED ) )
            // ResourcePlanParser.g:107:13: KW_UNMANAGED
            {
            KW_UNMANAGED43=(Token)match(input,KW_UNMANAGED,FOLLOW_KW_UNMANAGED_in_unmanaged575);  
            stream_KW_UNMANAGED.add(KW_UNMANAGED43);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 107:26: -> ^( TOK_UNMANAGED )
            {
                // ResourcePlanParser.g:107:29: ^( TOK_UNMANAGED )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_UNMANAGED, "TOK_UNMANAGED")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "unmanaged"


    public static class alterResourcePlanStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterResourcePlanStatement"
    // ResourcePlanParser.g:110:1: alterResourcePlanStatement : KW_ALTER KW_RESOURCE KW_PLAN name= identifier ( ( KW_VALIDATE -> ^( TOK_ALTER_RP_VALIDATE $name) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP_DISABLE $name) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP_SET $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP_UNSET $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP_RENAME $name $newName) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? ) ) ) ;
    public final HiveParser_ResourcePlanParser.alterResourcePlanStatement_return alterResourcePlanStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.alterResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.alterResourcePlanStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ALTER44=null;
        Token KW_RESOURCE45=null;
        Token KW_PLAN46=null;
        Token KW_VALIDATE47=null;
        Token KW_DISABLE48=null;
        Token KW_SET49=null;
        Token KW_UNSET51=null;
        Token KW_RENAME53=null;
        Token KW_TO54=null;
        HiveParser_IdentifiersParser.identifier_return name =null;

        HiveParser_IdentifiersParser.identifier_return newName =null;

        HiveParser_ResourcePlanParser.rpAssignList_return rpAssignList50 =null;

        HiveParser_ResourcePlanParser.rpUnassignList_return rpUnassignList52 =null;

        HiveParser_ResourcePlanParser.activate_return activate55 =null;

        HiveParser_ResourcePlanParser.enable_return enable56 =null;

        HiveParser_ResourcePlanParser.enable_return enable57 =null;

        HiveParser_ResourcePlanParser.activate_return activate58 =null;


        ASTNode KW_ALTER44_tree=null;
        ASTNode KW_RESOURCE45_tree=null;
        ASTNode KW_PLAN46_tree=null;
        ASTNode KW_VALIDATE47_tree=null;
        ASTNode KW_DISABLE48_tree=null;
        ASTNode KW_SET49_tree=null;
        ASTNode KW_UNSET51_tree=null;
        ASTNode KW_RENAME53_tree=null;
        ASTNode KW_TO54_tree=null;
        RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
        RewriteRuleTokenStream stream_KW_VALIDATE=new RewriteRuleTokenStream(adaptor,"token KW_VALIDATE");
        RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
        RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
        RewriteRuleTokenStream stream_KW_DISABLE=new RewriteRuleTokenStream(adaptor,"token KW_DISABLE");
        RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_rpAssignList=new RewriteRuleSubtreeStream(adaptor,"rule rpAssignList");
        RewriteRuleSubtreeStream stream_enable=new RewriteRuleSubtreeStream(adaptor,"rule enable");
        RewriteRuleSubtreeStream stream_rpUnassignList=new RewriteRuleSubtreeStream(adaptor,"rule rpUnassignList");
        RewriteRuleSubtreeStream stream_activate=new RewriteRuleSubtreeStream(adaptor,"rule activate");
         gParent.pushMsg("alter resource plan statement", state); 
        try {
            // ResourcePlanParser.g:113:5: ( KW_ALTER KW_RESOURCE KW_PLAN name= identifier ( ( KW_VALIDATE -> ^( TOK_ALTER_RP_VALIDATE $name) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP_DISABLE $name) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP_SET $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP_UNSET $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP_RENAME $name $newName) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? ) ) ) )
            // ResourcePlanParser.g:113:7: KW_ALTER KW_RESOURCE KW_PLAN name= identifier ( ( KW_VALIDATE -> ^( TOK_ALTER_RP_VALIDATE $name) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP_DISABLE $name) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP_SET $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP_UNSET $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP_RENAME $name $newName) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? ) ) )
            {
            KW_ALTER44=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterResourcePlanStatement604);  
            stream_KW_ALTER.add(KW_ALTER44);


            KW_RESOURCE45=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_alterResourcePlanStatement606);  
            stream_KW_RESOURCE.add(KW_RESOURCE45);


            KW_PLAN46=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_alterResourcePlanStatement608);  
            stream_KW_PLAN.add(KW_PLAN46);


            pushFollow(FOLLOW_identifier_in_alterResourcePlanStatement612);
            name=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(name.getTree());

            // ResourcePlanParser.g:113:52: ( ( KW_VALIDATE -> ^( TOK_ALTER_RP_VALIDATE $name) ) | ( KW_DISABLE -> ^( TOK_ALTER_RP_DISABLE $name) ) | ( KW_SET rpAssignList -> ^( TOK_ALTER_RP_SET $name rpAssignList ) ) | ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP_UNSET $name rpUnassignList ) ) | ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP_RENAME $name $newName) ) | ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? ) ) )
            int alt13=6;
            switch ( input.LA(1) ) {
            case KW_VALIDATE:
                {
                alt13=1;
                }
                break;
            case KW_DISABLE:
                {
                alt13=2;
                }
                break;
            case KW_SET:
                {
                alt13=3;
                }
                break;
            case KW_UNSET:
                {
                alt13=4;
                }
                break;
            case KW_RENAME:
                {
                alt13=5;
                }
                break;
            case KW_ACTIVATE:
            case KW_ENABLE:
                {
                alt13=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }

            switch (alt13) {
                case 1 :
                    // ResourcePlanParser.g:114:11: ( KW_VALIDATE -> ^( TOK_ALTER_RP_VALIDATE $name) )
                    {
                    // ResourcePlanParser.g:114:11: ( KW_VALIDATE -> ^( TOK_ALTER_RP_VALIDATE $name) )
                    // ResourcePlanParser.g:114:12: KW_VALIDATE
                    {
                    KW_VALIDATE47=(Token)match(input,KW_VALIDATE,FOLLOW_KW_VALIDATE_in_alterResourcePlanStatement627);  
                    stream_KW_VALIDATE.add(KW_VALIDATE47);


                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 114:24: -> ^( TOK_ALTER_RP_VALIDATE $name)
                    {
                        // ResourcePlanParser.g:114:27: ^( TOK_ALTER_RP_VALIDATE $name)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_VALIDATE, "TOK_ALTER_RP_VALIDATE")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:115:11: ( KW_DISABLE -> ^( TOK_ALTER_RP_DISABLE $name) )
                    {
                    // ResourcePlanParser.g:115:11: ( KW_DISABLE -> ^( TOK_ALTER_RP_DISABLE $name) )
                    // ResourcePlanParser.g:115:12: KW_DISABLE
                    {
                    KW_DISABLE48=(Token)match(input,KW_DISABLE,FOLLOW_KW_DISABLE_in_alterResourcePlanStatement650);  
                    stream_KW_DISABLE.add(KW_DISABLE48);


                    // AST REWRITE
                    // elements: name
                    // token labels: 
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 115:23: -> ^( TOK_ALTER_RP_DISABLE $name)
                    {
                        // ResourcePlanParser.g:115:26: ^( TOK_ALTER_RP_DISABLE $name)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_DISABLE, "TOK_ALTER_RP_DISABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:116:11: ( KW_SET rpAssignList -> ^( TOK_ALTER_RP_SET $name rpAssignList ) )
                    {
                    // ResourcePlanParser.g:116:11: ( KW_SET rpAssignList -> ^( TOK_ALTER_RP_SET $name rpAssignList ) )
                    // ResourcePlanParser.g:116:12: KW_SET rpAssignList
                    {
                    KW_SET49=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterResourcePlanStatement673);  
                    stream_KW_SET.add(KW_SET49);


                    pushFollow(FOLLOW_rpAssignList_in_alterResourcePlanStatement675);
                    rpAssignList50=rpAssignList();

                    state._fsp--;

                    stream_rpAssignList.add(rpAssignList50.getTree());

                    // AST REWRITE
                    // elements: name, rpAssignList
                    // token labels: 
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 116:32: -> ^( TOK_ALTER_RP_SET $name rpAssignList )
                    {
                        // ResourcePlanParser.g:116:35: ^( TOK_ALTER_RP_SET $name rpAssignList )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_SET, "TOK_ALTER_RP_SET")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_1, stream_rpAssignList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 4 :
                    // ResourcePlanParser.g:117:11: ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP_UNSET $name rpUnassignList ) )
                    {
                    // ResourcePlanParser.g:117:11: ( KW_UNSET rpUnassignList -> ^( TOK_ALTER_RP_UNSET $name rpUnassignList ) )
                    // ResourcePlanParser.g:117:12: KW_UNSET rpUnassignList
                    {
                    KW_UNSET51=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterResourcePlanStatement700);  
                    stream_KW_UNSET.add(KW_UNSET51);


                    pushFollow(FOLLOW_rpUnassignList_in_alterResourcePlanStatement702);
                    rpUnassignList52=rpUnassignList();

                    state._fsp--;

                    stream_rpUnassignList.add(rpUnassignList52.getTree());

                    // AST REWRITE
                    // elements: rpUnassignList, name
                    // token labels: 
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 117:36: -> ^( TOK_ALTER_RP_UNSET $name rpUnassignList )
                    {
                        // ResourcePlanParser.g:117:39: ^( TOK_ALTER_RP_UNSET $name rpUnassignList )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_UNSET, "TOK_ALTER_RP_UNSET")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_1, stream_rpUnassignList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 5 :
                    // ResourcePlanParser.g:118:11: ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP_RENAME $name $newName) )
                    {
                    // ResourcePlanParser.g:118:11: ( KW_RENAME KW_TO newName= identifier -> ^( TOK_ALTER_RP_RENAME $name $newName) )
                    // ResourcePlanParser.g:118:12: KW_RENAME KW_TO newName= identifier
                    {
                    KW_RENAME53=(Token)match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterResourcePlanStatement727);  
                    stream_KW_RENAME.add(KW_RENAME53);


                    KW_TO54=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterResourcePlanStatement729);  
                    stream_KW_TO.add(KW_TO54);


                    pushFollow(FOLLOW_identifier_in_alterResourcePlanStatement733);
                    newName=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(newName.getTree());

                    // AST REWRITE
                    // elements: name, newName
                    // token labels: 
                    // rule labels: newName, name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_newName=new RewriteRuleSubtreeStream(adaptor,"rule newName",newName!=null?newName.tree:null);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 118:47: -> ^( TOK_ALTER_RP_RENAME $name $newName)
                    {
                        // ResourcePlanParser.g:118:50: ^( TOK_ALTER_RP_RENAME $name $newName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_RENAME, "TOK_ALTER_RP_RENAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_1, stream_newName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 6 :
                    // ResourcePlanParser.g:119:11: ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? ) )
                    {
                    // ResourcePlanParser.g:119:11: ( ( activate ( enable )? | enable ( activate )? ) -> ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? ) )
                    // ResourcePlanParser.g:119:12: ( activate ( enable )? | enable ( activate )? )
                    {
                    // ResourcePlanParser.g:119:12: ( activate ( enable )? | enable ( activate )? )
                    int alt12=2;
                    int LA12_0 = input.LA(1);

                    if ( (LA12_0==KW_ACTIVATE) ) {
                        alt12=1;
                    }
                    else if ( (LA12_0==KW_ENABLE) ) {
                        alt12=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 12, 0, input);

                        throw nvae;

                    }
                    switch (alt12) {
                        case 1 :
                            // ResourcePlanParser.g:119:13: activate ( enable )?
                            {
                            pushFollow(FOLLOW_activate_in_alterResourcePlanStatement760);
                            activate55=activate();

                            state._fsp--;

                            stream_activate.add(activate55.getTree());

                            // ResourcePlanParser.g:119:22: ( enable )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==KW_ENABLE) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // ResourcePlanParser.g:119:22: enable
                                    {
                                    pushFollow(FOLLOW_enable_in_alterResourcePlanStatement762);
                                    enable56=enable();

                                    state._fsp--;

                                    stream_enable.add(enable56.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // ResourcePlanParser.g:119:32: enable ( activate )?
                            {
                            pushFollow(FOLLOW_enable_in_alterResourcePlanStatement767);
                            enable57=enable();

                            state._fsp--;

                            stream_enable.add(enable57.getTree());

                            // ResourcePlanParser.g:119:39: ( activate )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==KW_ACTIVATE) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // ResourcePlanParser.g:119:39: activate
                                    {
                                    pushFollow(FOLLOW_activate_in_alterResourcePlanStatement769);
                                    activate58=activate();

                                    state._fsp--;

                                    stream_activate.add(activate58.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: activate, enable, name
                    // token labels: 
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 119:50: -> ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? )
                    {
                        // ResourcePlanParser.g:119:53: ^( TOK_ALTER_RP_ENABLE $name ( activate )? ( enable )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_ENABLE, "TOK_ALTER_RP_ENABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        // ResourcePlanParser.g:119:81: ( activate )?
                        if ( stream_activate.hasNext() ) {
                            adaptor.addChild(root_1, stream_activate.nextTree());

                        }
                        stream_activate.reset();

                        // ResourcePlanParser.g:119:91: ( enable )?
                        if ( stream_enable.hasNext() ) {
                            adaptor.addChild(root_1, stream_enable.nextTree());

                        }
                        stream_enable.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "alterResourcePlanStatement"


    public static class globalWmStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "globalWmStatement"
    // ResourcePlanParser.g:125:1: globalWmStatement : ( KW_ENABLE KW_WORKLOAD KW_MANAGEMENT -> ^( TOK_ALTER_RP_ENABLE ) | KW_DISABLE KW_WORKLOAD KW_MANAGEMENT -> ^( TOK_ALTER_RP_DISABLE ) );
    public final HiveParser_ResourcePlanParser.globalWmStatement_return globalWmStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.globalWmStatement_return retval = new HiveParser_ResourcePlanParser.globalWmStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ENABLE59=null;
        Token KW_WORKLOAD60=null;
        Token KW_MANAGEMENT61=null;
        Token KW_DISABLE62=null;
        Token KW_WORKLOAD63=null;
        Token KW_MANAGEMENT64=null;

        ASTNode KW_ENABLE59_tree=null;
        ASTNode KW_WORKLOAD60_tree=null;
        ASTNode KW_MANAGEMENT61_tree=null;
        ASTNode KW_DISABLE62_tree=null;
        ASTNode KW_WORKLOAD63_tree=null;
        ASTNode KW_MANAGEMENT64_tree=null;
        RewriteRuleTokenStream stream_KW_WORKLOAD=new RewriteRuleTokenStream(adaptor,"token KW_WORKLOAD");
        RewriteRuleTokenStream stream_KW_MANAGEMENT=new RewriteRuleTokenStream(adaptor,"token KW_MANAGEMENT");
        RewriteRuleTokenStream stream_KW_DISABLE=new RewriteRuleTokenStream(adaptor,"token KW_DISABLE");
        RewriteRuleTokenStream stream_KW_ENABLE=new RewriteRuleTokenStream(adaptor,"token KW_ENABLE");

         gParent.pushMsg("global WM statement", state); 
        try {
            // ResourcePlanParser.g:128:5: ( KW_ENABLE KW_WORKLOAD KW_MANAGEMENT -> ^( TOK_ALTER_RP_ENABLE ) | KW_DISABLE KW_WORKLOAD KW_MANAGEMENT -> ^( TOK_ALTER_RP_DISABLE ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KW_ENABLE) ) {
                alt14=1;
            }
            else if ( (LA14_0==KW_DISABLE) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // ResourcePlanParser.g:128:7: KW_ENABLE KW_WORKLOAD KW_MANAGEMENT
                    {
                    KW_ENABLE59=(Token)match(input,KW_ENABLE,FOLLOW_KW_ENABLE_in_globalWmStatement824);  
                    stream_KW_ENABLE.add(KW_ENABLE59);


                    KW_WORKLOAD60=(Token)match(input,KW_WORKLOAD,FOLLOW_KW_WORKLOAD_in_globalWmStatement826);  
                    stream_KW_WORKLOAD.add(KW_WORKLOAD60);


                    KW_MANAGEMENT61=(Token)match(input,KW_MANAGEMENT,FOLLOW_KW_MANAGEMENT_in_globalWmStatement828);  
                    stream_KW_MANAGEMENT.add(KW_MANAGEMENT61);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 128:43: -> ^( TOK_ALTER_RP_ENABLE )
                    {
                        // ResourcePlanParser.g:128:46: ^( TOK_ALTER_RP_ENABLE )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_ENABLE, "TOK_ALTER_RP_ENABLE")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:129:7: KW_DISABLE KW_WORKLOAD KW_MANAGEMENT
                    {
                    KW_DISABLE62=(Token)match(input,KW_DISABLE,FOLLOW_KW_DISABLE_in_globalWmStatement842);  
                    stream_KW_DISABLE.add(KW_DISABLE62);


                    KW_WORKLOAD63=(Token)match(input,KW_WORKLOAD,FOLLOW_KW_WORKLOAD_in_globalWmStatement844);  
                    stream_KW_WORKLOAD.add(KW_WORKLOAD63);


                    KW_MANAGEMENT64=(Token)match(input,KW_MANAGEMENT,FOLLOW_KW_MANAGEMENT_in_globalWmStatement846);  
                    stream_KW_MANAGEMENT.add(KW_MANAGEMENT64);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 129:44: -> ^( TOK_ALTER_RP_DISABLE )
                    {
                        // ResourcePlanParser.g:129:47: ^( TOK_ALTER_RP_DISABLE )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_DISABLE, "TOK_ALTER_RP_DISABLE")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

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
    // $ANTLR end "globalWmStatement"


    public static class replaceResourcePlanStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "replaceResourcePlanStatement"
    // ResourcePlanParser.g:132:1: replaceResourcePlanStatement : KW_REPLACE ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src $dest) ) ) ;
    public final HiveParser_ResourcePlanParser.replaceResourcePlanStatement_return replaceResourcePlanStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.replaceResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.replaceResourcePlanStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_REPLACE65=null;
        Token KW_ACTIVE66=null;
        Token KW_RESOURCE67=null;
        Token KW_PLAN68=null;
        Token KW_WITH69=null;
        Token KW_RESOURCE70=null;
        Token KW_PLAN71=null;
        Token KW_WITH72=null;
        HiveParser_IdentifiersParser.identifier_return src =null;

        HiveParser_IdentifiersParser.identifier_return dest =null;


        ASTNode KW_REPLACE65_tree=null;
        ASTNode KW_ACTIVE66_tree=null;
        ASTNode KW_RESOURCE67_tree=null;
        ASTNode KW_PLAN68_tree=null;
        ASTNode KW_WITH69_tree=null;
        ASTNode KW_RESOURCE70_tree=null;
        ASTNode KW_PLAN71_tree=null;
        ASTNode KW_WITH72_tree=null;
        RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
        RewriteRuleTokenStream stream_KW_ACTIVE=new RewriteRuleTokenStream(adaptor,"token KW_ACTIVE");
        RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("replace resource plan statement", state); 
        try {
            // ResourcePlanParser.g:135:5: ( KW_REPLACE ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src $dest) ) ) )
            // ResourcePlanParser.g:135:7: KW_REPLACE ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src $dest) ) )
            {
            KW_REPLACE65=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_replaceResourcePlanStatement879);  
            stream_KW_REPLACE.add(KW_REPLACE65);


            // ResourcePlanParser.g:135:18: ( ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src) ) | ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src $dest) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KW_ACTIVE) ) {
                alt15=1;
            }
            else if ( (LA15_0==KW_RESOURCE) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // ResourcePlanParser.g:136:11: ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src) )
                    {
                    // ResourcePlanParser.g:136:11: ( KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src) )
                    // ResourcePlanParser.g:136:12: KW_ACTIVE KW_RESOURCE KW_PLAN KW_WITH src= identifier
                    {
                    KW_ACTIVE66=(Token)match(input,KW_ACTIVE,FOLLOW_KW_ACTIVE_in_replaceResourcePlanStatement894);  
                    stream_KW_ACTIVE.add(KW_ACTIVE66);


                    KW_RESOURCE67=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement896);  
                    stream_KW_RESOURCE.add(KW_RESOURCE67);


                    KW_PLAN68=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_replaceResourcePlanStatement898);  
                    stream_KW_PLAN.add(KW_PLAN68);


                    KW_WITH69=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_replaceResourcePlanStatement900);  
                    stream_KW_WITH.add(KW_WITH69);


                    pushFollow(FOLLOW_identifier_in_replaceResourcePlanStatement904);
                    src=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(src.getTree());

                    // AST REWRITE
                    // elements: src
                    // token labels: 
                    // rule labels: src, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_src=new RewriteRuleSubtreeStream(adaptor,"rule src",src!=null?src.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 136:65: -> ^( TOK_ALTER_RP_REPLACE $src)
                    {
                        // ResourcePlanParser.g:136:68: ^( TOK_ALTER_RP_REPLACE $src)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_REPLACE, "TOK_ALTER_RP_REPLACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_src.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:137:11: ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src $dest) )
                    {
                    // ResourcePlanParser.g:137:11: ( KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier -> ^( TOK_ALTER_RP_REPLACE $src $dest) )
                    // ResourcePlanParser.g:137:12: KW_RESOURCE KW_PLAN dest= identifier KW_WITH src= identifier
                    {
                    KW_RESOURCE70=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement927);  
                    stream_KW_RESOURCE.add(KW_RESOURCE70);


                    KW_PLAN71=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_replaceResourcePlanStatement929);  
                    stream_KW_PLAN.add(KW_PLAN71);


                    pushFollow(FOLLOW_identifier_in_replaceResourcePlanStatement933);
                    dest=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(dest.getTree());

                    KW_WITH72=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_replaceResourcePlanStatement935);  
                    stream_KW_WITH.add(KW_WITH72);


                    pushFollow(FOLLOW_identifier_in_replaceResourcePlanStatement939);
                    src=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(src.getTree());

                    // AST REWRITE
                    // elements: src, dest
                    // token labels: 
                    // rule labels: src, dest, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_src=new RewriteRuleSubtreeStream(adaptor,"rule src",src!=null?src.tree:null);
                    RewriteRuleSubtreeStream stream_dest=new RewriteRuleSubtreeStream(adaptor,"rule dest",dest!=null?dest.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 137:71: -> ^( TOK_ALTER_RP_REPLACE $src $dest)
                    {
                        // ResourcePlanParser.g:137:74: ^( TOK_ALTER_RP_REPLACE $src $dest)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_RP_REPLACE, "TOK_ALTER_RP_REPLACE")
                        , root_1);

                        adaptor.addChild(root_1, stream_src.nextTree());

                        adaptor.addChild(root_1, stream_dest.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "replaceResourcePlanStatement"


    public static class dropResourcePlanStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropResourcePlanStatement"
    // ResourcePlanParser.g:141:1: dropResourcePlanStatement : KW_DROP KW_RESOURCE KW_PLAN ( ifExists )? name= identifier -> ^( TOK_DROP_RP $name ( ifExists )? ) ;
    public final HiveParser_ResourcePlanParser.dropResourcePlanStatement_return dropResourcePlanStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.dropResourcePlanStatement_return retval = new HiveParser_ResourcePlanParser.dropResourcePlanStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP73=null;
        Token KW_RESOURCE74=null;
        Token KW_PLAN75=null;
        HiveParser_IdentifiersParser.identifier_return name =null;

        HiveParser.ifExists_return ifExists76 =null;


        ASTNode KW_DROP73_tree=null;
        ASTNode KW_RESOURCE74_tree=null;
        ASTNode KW_PLAN75_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_PLAN=new RewriteRuleTokenStream(adaptor,"token KW_PLAN");
        RewriteRuleTokenStream stream_KW_RESOURCE=new RewriteRuleTokenStream(adaptor,"token KW_RESOURCE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
         gParent.pushMsg("drop resource plan statement", state); 
        try {
            // ResourcePlanParser.g:144:5: ( KW_DROP KW_RESOURCE KW_PLAN ( ifExists )? name= identifier -> ^( TOK_DROP_RP $name ( ifExists )? ) )
            // ResourcePlanParser.g:144:7: KW_DROP KW_RESOURCE KW_PLAN ( ifExists )? name= identifier
            {
            KW_DROP73=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropResourcePlanStatement987);  
            stream_KW_DROP.add(KW_DROP73);


            KW_RESOURCE74=(Token)match(input,KW_RESOURCE,FOLLOW_KW_RESOURCE_in_dropResourcePlanStatement989);  
            stream_KW_RESOURCE.add(KW_RESOURCE74);


            KW_PLAN75=(Token)match(input,KW_PLAN,FOLLOW_KW_PLAN_in_dropResourcePlanStatement991);  
            stream_KW_PLAN.add(KW_PLAN75);


            // ResourcePlanParser.g:144:35: ( ifExists )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KW_IF) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ResourcePlanParser.g:144:35: ifExists
                    {
                    pushFollow(FOLLOW_ifExists_in_dropResourcePlanStatement993);
                    ifExists76=gHiveParser.ifExists();

                    state._fsp--;

                    stream_ifExists.add(ifExists76.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_dropResourcePlanStatement998);
            name=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(name.getTree());

            // AST REWRITE
            // elements: name, ifExists
            // token labels: 
            // rule labels: name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 144:61: -> ^( TOK_DROP_RP $name ( ifExists )? )
            {
                // ResourcePlanParser.g:144:64: ^( TOK_DROP_RP $name ( ifExists )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DROP_RP, "TOK_DROP_RP")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                // ResourcePlanParser.g:144:84: ( ifExists )?
                if ( stream_ifExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifExists.nextTree());

                }
                stream_ifExists.reset();

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
    // $ANTLR end "dropResourcePlanStatement"


    public static class poolPath_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "poolPath"
    // ResourcePlanParser.g:147:1: poolPath : identifier ^ ( DOT identifier )* ;
    public final HiveParser_ResourcePlanParser.poolPath_return poolPath() throws RecognitionException {
        HiveParser_ResourcePlanParser.poolPath_return retval = new HiveParser_ResourcePlanParser.poolPath_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token DOT78=null;
        HiveParser_IdentifiersParser.identifier_return identifier77 =null;

        HiveParser_IdentifiersParser.identifier_return identifier79 =null;


        ASTNode DOT78_tree=null;

         gParent.pushMsg("poolPath", state); 
        try {
            // ResourcePlanParser.g:150:5: ( identifier ^ ( DOT identifier )* )
            // ResourcePlanParser.g:150:7: identifier ^ ( DOT identifier )*
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_poolPath1037);
            identifier77=gHiveParser.identifier();

            state._fsp--;

            root_0 = (ASTNode)adaptor.becomeRoot(identifier77.getTree(), root_0);

            // ResourcePlanParser.g:150:19: ( DOT identifier )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==DOT) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // ResourcePlanParser.g:150:20: DOT identifier
            	    {
            	    DOT78=(Token)match(input,DOT,FOLLOW_DOT_in_poolPath1041); 
            	    DOT78_tree = 
            	    (ASTNode)adaptor.create(DOT78)
            	    ;
            	    adaptor.addChild(root_0, DOT78_tree);


            	    pushFollow(FOLLOW_identifier_in_poolPath1043);
            	    identifier79=gHiveParser.identifier();

            	    state._fsp--;

            	    adaptor.addChild(root_0, identifier79.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


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
    // $ANTLR end "poolPath"


    public static class triggerExpression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerExpression"
    // ResourcePlanParser.g:153:1: triggerExpression : triggerAtomExpression -> ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression ) ;
    public final HiveParser_ResourcePlanParser.triggerExpression_return triggerExpression() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerExpression_return retval = new HiveParser_ResourcePlanParser.triggerExpression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_ResourcePlanParser.triggerAtomExpression_return triggerAtomExpression80 =null;


        RewriteRuleSubtreeStream stream_triggerAtomExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerAtomExpression");
         gParent.pushMsg("triggerExpression", state); 
        try {
            // ResourcePlanParser.g:156:5: ( triggerAtomExpression -> ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression ) )
            // ResourcePlanParser.g:156:7: triggerAtomExpression
            {
            pushFollow(FOLLOW_triggerAtomExpression_in_triggerExpression1072);
            triggerAtomExpression80=triggerAtomExpression();

            state._fsp--;

            stream_triggerAtomExpression.add(triggerAtomExpression80.getTree());

            // AST REWRITE
            // elements: triggerAtomExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 156:29: -> ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression )
            {
                // ResourcePlanParser.g:156:32: ^( TOK_TRIGGER_EXPRESSION triggerAtomExpression )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TRIGGER_EXPRESSION, "TOK_TRIGGER_EXPRESSION")
                , root_1);

                adaptor.addChild(root_1, stream_triggerAtomExpression.nextTree());

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
    // $ANTLR end "triggerExpression"


    public static class triggerExpressionStandalone_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerExpressionStandalone"
    // ResourcePlanParser.g:159:1: triggerExpressionStandalone : triggerExpression EOF ;
    public final HiveParser_ResourcePlanParser.triggerExpressionStandalone_return triggerExpressionStandalone() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerExpressionStandalone_return retval = new HiveParser_ResourcePlanParser.triggerExpressionStandalone_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token EOF82=null;
        HiveParser_ResourcePlanParser.triggerExpression_return triggerExpression81 =null;


        ASTNode EOF82_tree=null;

        try {
            // ResourcePlanParser.g:159:29: ( triggerExpression EOF )
            // ResourcePlanParser.g:159:31: triggerExpression EOF
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_triggerExpression_in_triggerExpressionStandalone1093);
            triggerExpression81=triggerExpression();

            state._fsp--;

            adaptor.addChild(root_0, triggerExpression81.getTree());

            EOF82=(Token)match(input,EOF,FOLLOW_EOF_in_triggerExpressionStandalone1095); 
            EOF82_tree = 
            (ASTNode)adaptor.create(EOF82)
            ;
            adaptor.addChild(root_0, EOF82_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triggerExpressionStandalone"


    public static class triggerOrExpression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerOrExpression"
    // ResourcePlanParser.g:165:1: triggerOrExpression : triggerAndExpression ( KW_OR triggerAndExpression )* ;
    public final HiveParser_ResourcePlanParser.triggerOrExpression_return triggerOrExpression() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerOrExpression_return retval = new HiveParser_ResourcePlanParser.triggerOrExpression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_OR84=null;
        HiveParser_ResourcePlanParser.triggerAndExpression_return triggerAndExpression83 =null;

        HiveParser_ResourcePlanParser.triggerAndExpression_return triggerAndExpression85 =null;


        ASTNode KW_OR84_tree=null;

         gParent.pushMsg("triggerOrExpression", state); 
        try {
            // ResourcePlanParser.g:168:5: ( triggerAndExpression ( KW_OR triggerAndExpression )* )
            // ResourcePlanParser.g:168:7: triggerAndExpression ( KW_OR triggerAndExpression )*
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_triggerAndExpression_in_triggerOrExpression1120);
            triggerAndExpression83=triggerAndExpression();

            state._fsp--;

            adaptor.addChild(root_0, triggerAndExpression83.getTree());

            // ResourcePlanParser.g:168:28: ( KW_OR triggerAndExpression )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==KW_OR) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ResourcePlanParser.g:168:29: KW_OR triggerAndExpression
            	    {
            	    KW_OR84=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_triggerOrExpression1123); 
            	    KW_OR84_tree = 
            	    (ASTNode)adaptor.create(KW_OR84)
            	    ;
            	    adaptor.addChild(root_0, KW_OR84_tree);


            	    pushFollow(FOLLOW_triggerAndExpression_in_triggerOrExpression1125);
            	    triggerAndExpression85=triggerAndExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerAndExpression85.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


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
    // $ANTLR end "triggerOrExpression"


    public static class triggerAndExpression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerAndExpression"
    // ResourcePlanParser.g:171:1: triggerAndExpression : triggerAtomExpression ( KW_AND triggerAtomExpression )* ;
    public final HiveParser_ResourcePlanParser.triggerAndExpression_return triggerAndExpression() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerAndExpression_return retval = new HiveParser_ResourcePlanParser.triggerAndExpression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AND87=null;
        HiveParser_ResourcePlanParser.triggerAtomExpression_return triggerAtomExpression86 =null;

        HiveParser_ResourcePlanParser.triggerAtomExpression_return triggerAtomExpression88 =null;


        ASTNode KW_AND87_tree=null;

         gParent.pushMsg("triggerAndExpression", state); 
        try {
            // ResourcePlanParser.g:174:5: ( triggerAtomExpression ( KW_AND triggerAtomExpression )* )
            // ResourcePlanParser.g:174:7: triggerAtomExpression ( KW_AND triggerAtomExpression )*
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_triggerAtomExpression_in_triggerAndExpression1154);
            triggerAtomExpression86=triggerAtomExpression();

            state._fsp--;

            adaptor.addChild(root_0, triggerAtomExpression86.getTree());

            // ResourcePlanParser.g:174:29: ( KW_AND triggerAtomExpression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==KW_AND) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ResourcePlanParser.g:174:30: KW_AND triggerAtomExpression
            	    {
            	    KW_AND87=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_triggerAndExpression1157); 
            	    KW_AND87_tree = 
            	    (ASTNode)adaptor.create(KW_AND87)
            	    ;
            	    adaptor.addChild(root_0, KW_AND87_tree);


            	    pushFollow(FOLLOW_triggerAtomExpression_in_triggerAndExpression1159);
            	    triggerAtomExpression88=triggerAtomExpression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, triggerAtomExpression88.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


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
    // $ANTLR end "triggerAndExpression"


    public static class triggerAtomExpression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerAtomExpression"
    // ResourcePlanParser.g:177:1: triggerAtomExpression : identifier comparisionOperator triggerLiteral ;
    public final HiveParser_ResourcePlanParser.triggerAtomExpression_return triggerAtomExpression() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerAtomExpression_return retval = new HiveParser_ResourcePlanParser.triggerAtomExpression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier89 =null;

        HiveParser_ResourcePlanParser.comparisionOperator_return comparisionOperator90 =null;

        HiveParser_ResourcePlanParser.triggerLiteral_return triggerLiteral91 =null;



         gParent.pushMsg("triggerAtomExpression", state); 
        try {
            // ResourcePlanParser.g:180:5: ( identifier comparisionOperator triggerLiteral )
            // ResourcePlanParser.g:180:7: identifier comparisionOperator triggerLiteral
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_identifier_in_triggerAtomExpression1188);
            identifier89=gHiveParser.identifier();

            state._fsp--;

            adaptor.addChild(root_0, identifier89.getTree());

            pushFollow(FOLLOW_comparisionOperator_in_triggerAtomExpression1190);
            comparisionOperator90=comparisionOperator();

            state._fsp--;

            adaptor.addChild(root_0, comparisionOperator90.getTree());

            pushFollow(FOLLOW_triggerLiteral_in_triggerAtomExpression1192);
            triggerLiteral91=triggerLiteral();

            state._fsp--;

            adaptor.addChild(root_0, triggerLiteral91.getTree());

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
    // $ANTLR end "triggerAtomExpression"


    public static class triggerLiteral_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerLiteral"
    // ResourcePlanParser.g:184:1: triggerLiteral : ( Number | StringLiteral );
    public final HiveParser_ResourcePlanParser.triggerLiteral_return triggerLiteral() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerLiteral_return retval = new HiveParser_ResourcePlanParser.triggerLiteral_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token set92=null;

        ASTNode set92_tree=null;

         gParent.pushMsg("triggerLiteral", state); 
        try {
            // ResourcePlanParser.g:187:5: ( Number | StringLiteral )
            // ResourcePlanParser.g:
            {
            root_0 = (ASTNode)adaptor.nil();


            set92=(Token)input.LT(1);

            if ( input.LA(1)==Number||input.LA(1)==StringLiteral ) {
                input.consume();
                adaptor.addChild(root_0, 
                (ASTNode)adaptor.create(set92)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


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
    // $ANTLR end "triggerLiteral"


    public static class comparisionOperator_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "comparisionOperator"
    // ResourcePlanParser.g:191:1: comparisionOperator : GREATERTHAN ;
    public final HiveParser_ResourcePlanParser.comparisionOperator_return comparisionOperator() throws RecognitionException {
        HiveParser_ResourcePlanParser.comparisionOperator_return retval = new HiveParser_ResourcePlanParser.comparisionOperator_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token GREATERTHAN93=null;

        ASTNode GREATERTHAN93_tree=null;

         gParent.pushMsg("comparisionOperator", state); 
        try {
            // ResourcePlanParser.g:194:5: ( GREATERTHAN )
            // ResourcePlanParser.g:194:7: GREATERTHAN
            {
            root_0 = (ASTNode)adaptor.nil();


            GREATERTHAN93=(Token)match(input,GREATERTHAN,FOLLOW_GREATERTHAN_in_comparisionOperator1255); 
            GREATERTHAN93_tree = 
            (ASTNode)adaptor.create(GREATERTHAN93)
            ;
            adaptor.addChild(root_0, GREATERTHAN93_tree);


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
    // $ANTLR end "comparisionOperator"


    public static class triggerActionExpression_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerActionExpression"
    // ResourcePlanParser.g:197:1: triggerActionExpression : ( KW_KILL | ( KW_MOVE ^ KW_TO ! poolPath ) );
    public final HiveParser_ResourcePlanParser.triggerActionExpression_return triggerActionExpression() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerActionExpression_return retval = new HiveParser_ResourcePlanParser.triggerActionExpression_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_KILL94=null;
        Token KW_MOVE95=null;
        Token KW_TO96=null;
        HiveParser_ResourcePlanParser.poolPath_return poolPath97 =null;


        ASTNode KW_KILL94_tree=null;
        ASTNode KW_MOVE95_tree=null;
        ASTNode KW_TO96_tree=null;

         gParent.pushMsg("triggerActionExpression", state); 
        try {
            // ResourcePlanParser.g:200:5: ( KW_KILL | ( KW_MOVE ^ KW_TO ! poolPath ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KW_KILL) ) {
                alt20=1;
            }
            else if ( (LA20_0==KW_MOVE) ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // ResourcePlanParser.g:200:7: KW_KILL
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    KW_KILL94=(Token)match(input,KW_KILL,FOLLOW_KW_KILL_in_triggerActionExpression1282); 
                    KW_KILL94_tree = 
                    (ASTNode)adaptor.create(KW_KILL94)
                    ;
                    adaptor.addChild(root_0, KW_KILL94_tree);


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:201:7: ( KW_MOVE ^ KW_TO ! poolPath )
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    // ResourcePlanParser.g:201:7: ( KW_MOVE ^ KW_TO ! poolPath )
                    // ResourcePlanParser.g:201:8: KW_MOVE ^ KW_TO ! poolPath
                    {
                    KW_MOVE95=(Token)match(input,KW_MOVE,FOLLOW_KW_MOVE_in_triggerActionExpression1291); 
                    KW_MOVE95_tree = 
                    (ASTNode)adaptor.create(KW_MOVE95)
                    ;
                    root_0 = (ASTNode)adaptor.becomeRoot(KW_MOVE95_tree, root_0);


                    KW_TO96=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_triggerActionExpression1294); 

                    pushFollow(FOLLOW_poolPath_in_triggerActionExpression1297);
                    poolPath97=poolPath();

                    state._fsp--;

                    adaptor.addChild(root_0, poolPath97.getTree());

                    }


                    }
                    break;

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
    // $ANTLR end "triggerActionExpression"


    public static class triggerActionExpressionStandalone_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "triggerActionExpressionStandalone"
    // ResourcePlanParser.g:204:1: triggerActionExpressionStandalone : triggerActionExpression EOF ;
    public final HiveParser_ResourcePlanParser.triggerActionExpressionStandalone_return triggerActionExpressionStandalone() throws RecognitionException {
        HiveParser_ResourcePlanParser.triggerActionExpressionStandalone_return retval = new HiveParser_ResourcePlanParser.triggerActionExpressionStandalone_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token EOF99=null;
        HiveParser_ResourcePlanParser.triggerActionExpression_return triggerActionExpression98 =null;


        ASTNode EOF99_tree=null;

        try {
            // ResourcePlanParser.g:204:35: ( triggerActionExpression EOF )
            // ResourcePlanParser.g:204:37: triggerActionExpression EOF
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_triggerActionExpression_in_triggerActionExpressionStandalone1311);
            triggerActionExpression98=triggerActionExpression();

            state._fsp--;

            adaptor.addChild(root_0, triggerActionExpression98.getTree());

            EOF99=(Token)match(input,EOF,FOLLOW_EOF_in_triggerActionExpressionStandalone1313); 
            EOF99_tree = 
            (ASTNode)adaptor.create(EOF99)
            ;
            adaptor.addChild(root_0, EOF99_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
            throw e;
          }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "triggerActionExpressionStandalone"


    public static class createTriggerStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createTriggerStatement"
    // ResourcePlanParser.g:206:1: createTriggerStatement : KW_CREATE KW_TRIGGER rpName= identifier DOT triggerName= identifier KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ;
    public final HiveParser_ResourcePlanParser.createTriggerStatement_return createTriggerStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.createTriggerStatement_return retval = new HiveParser_ResourcePlanParser.createTriggerStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CREATE100=null;
        Token KW_TRIGGER101=null;
        Token DOT102=null;
        Token KW_WHEN103=null;
        Token KW_DO105=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_IdentifiersParser.identifier_return triggerName =null;

        HiveParser_ResourcePlanParser.triggerExpression_return triggerExpression104 =null;

        HiveParser_ResourcePlanParser.triggerActionExpression_return triggerActionExpression106 =null;


        ASTNode KW_CREATE100_tree=null;
        ASTNode KW_TRIGGER101_tree=null;
        ASTNode DOT102_tree=null;
        ASTNode KW_WHEN103_tree=null;
        ASTNode KW_DO105_tree=null;
        RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_DO=new RewriteRuleTokenStream(adaptor,"token KW_DO");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_triggerExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerExpression");
        RewriteRuleSubtreeStream stream_triggerActionExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerActionExpression");
         gParent.pushMsg("create trigger statement", state); 
        try {
            // ResourcePlanParser.g:209:5: ( KW_CREATE KW_TRIGGER rpName= identifier DOT triggerName= identifier KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) )
            // ResourcePlanParser.g:209:7: KW_CREATE KW_TRIGGER rpName= identifier DOT triggerName= identifier KW_WHEN triggerExpression KW_DO triggerActionExpression
            {
            KW_CREATE100=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createTriggerStatement1336);  
            stream_KW_CREATE.add(KW_CREATE100);


            KW_TRIGGER101=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_createTriggerStatement1338);  
            stream_KW_TRIGGER.add(KW_TRIGGER101);


            pushFollow(FOLLOW_identifier_in_createTriggerStatement1342);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            DOT102=(Token)match(input,DOT,FOLLOW_DOT_in_createTriggerStatement1344);  
            stream_DOT.add(DOT102);


            pushFollow(FOLLOW_identifier_in_createTriggerStatement1348);
            triggerName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(triggerName.getTree());

            KW_WHEN103=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_createTriggerStatement1356);  
            stream_KW_WHEN.add(KW_WHEN103);


            pushFollow(FOLLOW_triggerExpression_in_createTriggerStatement1358);
            triggerExpression104=triggerExpression();

            state._fsp--;

            stream_triggerExpression.add(triggerExpression104.getTree());

            KW_DO105=(Token)match(input,KW_DO,FOLLOW_KW_DO_in_createTriggerStatement1360);  
            stream_KW_DO.add(KW_DO105);


            pushFollow(FOLLOW_triggerActionExpression_in_createTriggerStatement1362);
            triggerActionExpression106=triggerActionExpression();

            state._fsp--;

            stream_triggerActionExpression.add(triggerActionExpression106.getTree());

            // AST REWRITE
            // elements: rpName, triggerActionExpression, triggerName, triggerExpression
            // token labels: 
            // rule labels: triggerName, rpName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
            RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 211:5: -> ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
            {
                // ResourcePlanParser.g:211:8: ^( TOK_CREATE_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_CREATE_TRIGGER, "TOK_CREATE_TRIGGER")
                , root_1);

                adaptor.addChild(root_1, stream_rpName.nextTree());

                adaptor.addChild(root_1, stream_triggerName.nextTree());

                adaptor.addChild(root_1, stream_triggerExpression.nextTree());

                adaptor.addChild(root_1, stream_triggerActionExpression.nextTree());

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
    // $ANTLR end "createTriggerStatement"


    public static class alterTriggerStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterTriggerStatement"
    // ResourcePlanParser.g:214:1: alterTriggerStatement : KW_ALTER KW_TRIGGER rpName= identifier DOT triggerName= identifier ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) ) ;
    public final HiveParser_ResourcePlanParser.alterTriggerStatement_return alterTriggerStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.alterTriggerStatement_return retval = new HiveParser_ResourcePlanParser.alterTriggerStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ALTER107=null;
        Token KW_TRIGGER108=null;
        Token DOT109=null;
        Token KW_WHEN110=null;
        Token KW_DO112=null;
        Token KW_ADD114=null;
        Token KW_TO115=null;
        Token KW_POOL116=null;
        Token KW_DROP117=null;
        Token KW_FROM118=null;
        Token KW_POOL119=null;
        Token KW_ADD120=null;
        Token KW_TO121=null;
        Token KW_UNMANAGED122=null;
        Token KW_DROP123=null;
        Token KW_FROM124=null;
        Token KW_UNMANAGED125=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_IdentifiersParser.identifier_return triggerName =null;

        HiveParser_ResourcePlanParser.poolPath_return poolName =null;

        HiveParser_ResourcePlanParser.triggerExpression_return triggerExpression111 =null;

        HiveParser_ResourcePlanParser.triggerActionExpression_return triggerActionExpression113 =null;


        ASTNode KW_ALTER107_tree=null;
        ASTNode KW_TRIGGER108_tree=null;
        ASTNode DOT109_tree=null;
        ASTNode KW_WHEN110_tree=null;
        ASTNode KW_DO112_tree=null;
        ASTNode KW_ADD114_tree=null;
        ASTNode KW_TO115_tree=null;
        ASTNode KW_POOL116_tree=null;
        ASTNode KW_DROP117_tree=null;
        ASTNode KW_FROM118_tree=null;
        ASTNode KW_POOL119_tree=null;
        ASTNode KW_ADD120_tree=null;
        ASTNode KW_TO121_tree=null;
        ASTNode KW_UNMANAGED122_tree=null;
        ASTNode KW_DROP123_tree=null;
        ASTNode KW_FROM124_tree=null;
        ASTNode KW_UNMANAGED125_tree=null;
        RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
        RewriteRuleTokenStream stream_KW_WHEN=new RewriteRuleTokenStream(adaptor,"token KW_WHEN");
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
        RewriteRuleTokenStream stream_KW_DO=new RewriteRuleTokenStream(adaptor,"token KW_DO");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
        RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
        RewriteRuleTokenStream stream_KW_UNMANAGED=new RewriteRuleTokenStream(adaptor,"token KW_UNMANAGED");
        RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
        RewriteRuleSubtreeStream stream_triggerExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerExpression");
        RewriteRuleSubtreeStream stream_triggerActionExpression=new RewriteRuleSubtreeStream(adaptor,"rule triggerActionExpression");
         gParent.pushMsg("alter trigger statement", state); 
        try {
            // ResourcePlanParser.g:217:5: ( KW_ALTER KW_TRIGGER rpName= identifier DOT triggerName= identifier ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) ) )
            // ResourcePlanParser.g:217:7: KW_ALTER KW_TRIGGER rpName= identifier DOT triggerName= identifier ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) )
            {
            KW_ALTER107=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterTriggerStatement1409);  
            stream_KW_ALTER.add(KW_ALTER107);


            KW_TRIGGER108=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_alterTriggerStatement1411);  
            stream_KW_TRIGGER.add(KW_TRIGGER108);


            pushFollow(FOLLOW_identifier_in_alterTriggerStatement1415);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            DOT109=(Token)match(input,DOT,FOLLOW_DOT_in_alterTriggerStatement1417);  
            stream_DOT.add(DOT109);


            pushFollow(FOLLOW_identifier_in_alterTriggerStatement1421);
            triggerName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(triggerName.getTree());

            // ResourcePlanParser.g:217:72: ( ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) ) | ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName) ) | ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName) ) | ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) | ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName) ) )
            int alt21=5;
            switch ( input.LA(1) ) {
            case KW_WHEN:
                {
                alt21=1;
                }
                break;
            case KW_ADD:
                {
                int LA21_2 = input.LA(2);

                if ( (LA21_2==KW_TO) ) {
                    int LA21_4 = input.LA(3);

                    if ( (LA21_4==KW_POOL) ) {
                        alt21=2;
                    }
                    else if ( (LA21_4==KW_UNMANAGED) ) {
                        alt21=4;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 4, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 2, input);

                    throw nvae;

                }
                }
                break;
            case KW_DROP:
                {
                int LA21_3 = input.LA(2);

                if ( (LA21_3==KW_FROM) ) {
                    int LA21_5 = input.LA(3);

                    if ( (LA21_5==KW_POOL) ) {
                        alt21=3;
                    }
                    else if ( (LA21_5==KW_UNMANAGED) ) {
                        alt21=5;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 5, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // ResourcePlanParser.g:218:9: ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) )
                    {
                    // ResourcePlanParser.g:218:9: ( KW_WHEN triggerExpression KW_DO triggerActionExpression -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression ) )
                    // ResourcePlanParser.g:218:10: KW_WHEN triggerExpression KW_DO triggerActionExpression
                    {
                    KW_WHEN110=(Token)match(input,KW_WHEN,FOLLOW_KW_WHEN_in_alterTriggerStatement1434);  
                    stream_KW_WHEN.add(KW_WHEN110);


                    pushFollow(FOLLOW_triggerExpression_in_alterTriggerStatement1436);
                    triggerExpression111=triggerExpression();

                    state._fsp--;

                    stream_triggerExpression.add(triggerExpression111.getTree());

                    KW_DO112=(Token)match(input,KW_DO,FOLLOW_KW_DO_in_alterTriggerStatement1438);  
                    stream_KW_DO.add(KW_DO112);


                    pushFollow(FOLLOW_triggerActionExpression_in_alterTriggerStatement1440);
                    triggerActionExpression113=triggerActionExpression();

                    state._fsp--;

                    stream_triggerActionExpression.add(triggerActionExpression113.getTree());

                    // AST REWRITE
                    // elements: triggerActionExpression, rpName, triggerName, triggerExpression
                    // token labels: 
                    // rule labels: triggerName, rpName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 219:11: -> ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
                    {
                        // ResourcePlanParser.g:219:14: ^( TOK_ALTER_TRIGGER $rpName $triggerName triggerExpression triggerActionExpression )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_TRIGGER, "TOK_ALTER_TRIGGER")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, stream_triggerName.nextTree());

                        adaptor.addChild(root_1, stream_triggerExpression.nextTree());

                        adaptor.addChild(root_1, stream_triggerActionExpression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:220:9: ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName) )
                    {
                    // ResourcePlanParser.g:220:9: ( KW_ADD KW_TO KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName) )
                    // ResourcePlanParser.g:220:10: KW_ADD KW_TO KW_POOL poolName= poolPath
                    {
                    KW_ADD114=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterTriggerStatement1478);  
                    stream_KW_ADD.add(KW_ADD114);


                    KW_TO115=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterTriggerStatement1480);  
                    stream_KW_TO.add(KW_TO115);


                    KW_POOL116=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_alterTriggerStatement1482);  
                    stream_KW_POOL.add(KW_POOL116);


                    pushFollow(FOLLOW_poolPath_in_alterTriggerStatement1486);
                    poolName=poolPath();

                    state._fsp--;

                    stream_poolPath.add(poolName.getTree());

                    // AST REWRITE
                    // elements: rpName, triggerName, poolName
                    // token labels: 
                    // rule labels: triggerName, rpName, retval, poolName
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_poolName=new RewriteRuleSubtreeStream(adaptor,"rule poolName",poolName!=null?poolName.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 220:49: -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName)
                    {
                        // ResourcePlanParser.g:220:52: ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName $poolName $triggerName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL_ADD_TRIGGER, "TOK_ALTER_POOL_ADD_TRIGGER")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, stream_poolName.nextTree());

                        adaptor.addChild(root_1, stream_triggerName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:221:9: ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName) )
                    {
                    // ResourcePlanParser.g:221:9: ( KW_DROP KW_FROM KW_POOL poolName= poolPath -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName) )
                    // ResourcePlanParser.g:221:10: KW_DROP KW_FROM KW_POOL poolName= poolPath
                    {
                    KW_DROP117=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterTriggerStatement1513);  
                    stream_KW_DROP.add(KW_DROP117);


                    KW_FROM118=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_alterTriggerStatement1515);  
                    stream_KW_FROM.add(KW_FROM118);


                    KW_POOL119=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_alterTriggerStatement1517);  
                    stream_KW_POOL.add(KW_POOL119);


                    pushFollow(FOLLOW_poolPath_in_alterTriggerStatement1521);
                    poolName=poolPath();

                    state._fsp--;

                    stream_poolPath.add(poolName.getTree());

                    // AST REWRITE
                    // elements: rpName, poolName, triggerName
                    // token labels: 
                    // rule labels: triggerName, rpName, retval, poolName
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
                    RewriteRuleSubtreeStream stream_poolName=new RewriteRuleSubtreeStream(adaptor,"rule poolName",poolName!=null?poolName.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 221:52: -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName)
                    {
                        // ResourcePlanParser.g:221:55: ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName $poolName $triggerName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL_DROP_TRIGGER, "TOK_ALTER_POOL_DROP_TRIGGER")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, stream_poolName.nextTree());

                        adaptor.addChild(root_1, stream_triggerName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 4 :
                    // ResourcePlanParser.g:222:9: ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName) )
                    {
                    // ResourcePlanParser.g:222:9: ( KW_ADD KW_TO KW_UNMANAGED -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName) )
                    // ResourcePlanParser.g:222:10: KW_ADD KW_TO KW_UNMANAGED
                    {
                    KW_ADD120=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterTriggerStatement1549);  
                    stream_KW_ADD.add(KW_ADD120);


                    KW_TO121=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterTriggerStatement1551);  
                    stream_KW_TO.add(KW_TO121);


                    KW_UNMANAGED122=(Token)match(input,KW_UNMANAGED,FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1553);  
                    stream_KW_UNMANAGED.add(KW_UNMANAGED122);


                    // AST REWRITE
                    // elements: rpName, triggerName
                    // token labels: 
                    // rule labels: triggerName, rpName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 222:36: -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName)
                    {
                        // ResourcePlanParser.g:222:39: ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName TOK_UNMANAGED $triggerName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL_ADD_TRIGGER, "TOK_ALTER_POOL_ADD_TRIGGER")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_UNMANAGED, "TOK_UNMANAGED")
                        );

                        adaptor.addChild(root_1, stream_triggerName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 5 :
                    // ResourcePlanParser.g:223:9: ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName) )
                    {
                    // ResourcePlanParser.g:223:9: ( KW_DROP KW_FROM KW_UNMANAGED -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName) )
                    // ResourcePlanParser.g:223:10: KW_DROP KW_FROM KW_UNMANAGED
                    {
                    KW_DROP123=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterTriggerStatement1579);  
                    stream_KW_DROP.add(KW_DROP123);


                    KW_FROM124=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_alterTriggerStatement1581);  
                    stream_KW_FROM.add(KW_FROM124);


                    KW_UNMANAGED125=(Token)match(input,KW_UNMANAGED,FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1583);  
                    stream_KW_UNMANAGED.add(KW_UNMANAGED125);


                    // AST REWRITE
                    // elements: triggerName, rpName
                    // token labels: 
                    // rule labels: triggerName, rpName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 223:39: -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName)
                    {
                        // ResourcePlanParser.g:223:42: ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName TOK_UNMANAGED $triggerName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL_DROP_TRIGGER, "TOK_ALTER_POOL_DROP_TRIGGER")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_UNMANAGED, "TOK_UNMANAGED")
                        );

                        adaptor.addChild(root_1, stream_triggerName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "alterTriggerStatement"


    public static class dropTriggerStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropTriggerStatement"
    // ResourcePlanParser.g:228:1: dropTriggerStatement : KW_DROP KW_TRIGGER rpName= identifier DOT triggerName= identifier -> ^( TOK_DROP_TRIGGER $rpName $triggerName) ;
    public final HiveParser_ResourcePlanParser.dropTriggerStatement_return dropTriggerStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.dropTriggerStatement_return retval = new HiveParser_ResourcePlanParser.dropTriggerStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP126=null;
        Token KW_TRIGGER127=null;
        Token DOT128=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_IdentifiersParser.identifier_return triggerName =null;


        ASTNode KW_DROP126_tree=null;
        ASTNode KW_TRIGGER127_tree=null;
        ASTNode DOT128_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("drop trigger statement", state); 
        try {
            // ResourcePlanParser.g:231:5: ( KW_DROP KW_TRIGGER rpName= identifier DOT triggerName= identifier -> ^( TOK_DROP_TRIGGER $rpName $triggerName) )
            // ResourcePlanParser.g:231:7: KW_DROP KW_TRIGGER rpName= identifier DOT triggerName= identifier
            {
            KW_DROP126=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropTriggerStatement1632);  
            stream_KW_DROP.add(KW_DROP126);


            KW_TRIGGER127=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_dropTriggerStatement1634);  
            stream_KW_TRIGGER.add(KW_TRIGGER127);


            pushFollow(FOLLOW_identifier_in_dropTriggerStatement1638);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            DOT128=(Token)match(input,DOT,FOLLOW_DOT_in_dropTriggerStatement1640);  
            stream_DOT.add(DOT128);


            pushFollow(FOLLOW_identifier_in_dropTriggerStatement1644);
            triggerName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(triggerName.getTree());

            // AST REWRITE
            // elements: rpName, triggerName
            // token labels: 
            // rule labels: triggerName, rpName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
            RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 232:5: -> ^( TOK_DROP_TRIGGER $rpName $triggerName)
            {
                // ResourcePlanParser.g:232:8: ^( TOK_DROP_TRIGGER $rpName $triggerName)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DROP_TRIGGER, "TOK_DROP_TRIGGER")
                , root_1);

                adaptor.addChild(root_1, stream_rpName.nextTree());

                adaptor.addChild(root_1, stream_triggerName.nextTree());

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
    // $ANTLR end "dropTriggerStatement"


    public static class poolAssign_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "poolAssign"
    // ResourcePlanParser.g:235:1: poolAssign : ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) ) ;
    public final HiveParser_ResourcePlanParser.poolAssign_return poolAssign() throws RecognitionException {
        HiveParser_ResourcePlanParser.poolAssign_return retval = new HiveParser_ResourcePlanParser.poolAssign_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token allocFraction=null;
        Token parallelism=null;
        Token policy=null;
        Token KW_ALLOC_FRACTION129=null;
        Token EQUAL130=null;
        Token KW_QUERY_PARALLELISM131=null;
        Token EQUAL132=null;
        Token KW_SCHEDULING_POLICY133=null;
        Token EQUAL134=null;
        Token KW_PATH135=null;
        Token EQUAL136=null;
        HiveParser_ResourcePlanParser.poolPath_return path =null;


        ASTNode allocFraction_tree=null;
        ASTNode parallelism_tree=null;
        ASTNode policy_tree=null;
        ASTNode KW_ALLOC_FRACTION129_tree=null;
        ASTNode EQUAL130_tree=null;
        ASTNode KW_QUERY_PARALLELISM131_tree=null;
        ASTNode EQUAL132_tree=null;
        ASTNode KW_SCHEDULING_POLICY133_tree=null;
        ASTNode EQUAL134_tree=null;
        ASTNode KW_PATH135_tree=null;
        ASTNode EQUAL136_tree=null;
        RewriteRuleTokenStream stream_KW_PATH=new RewriteRuleTokenStream(adaptor,"token KW_PATH");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_ALLOC_FRACTION=new RewriteRuleTokenStream(adaptor,"token KW_ALLOC_FRACTION");
        RewriteRuleTokenStream stream_KW_SCHEDULING_POLICY=new RewriteRuleTokenStream(adaptor,"token KW_SCHEDULING_POLICY");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleTokenStream stream_KW_QUERY_PARALLELISM=new RewriteRuleTokenStream(adaptor,"token KW_QUERY_PARALLELISM");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
         gParent.pushMsg("poolAssign", state); 
        try {
            // ResourcePlanParser.g:238:5: ( ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) ) )
            // ResourcePlanParser.g:238:7: ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) )
            {
            // ResourcePlanParser.g:238:7: ( ( KW_ALLOC_FRACTION EQUAL allocFraction= Number ) -> ^( TOK_ALLOC_FRACTION $allocFraction) | ( KW_QUERY_PARALLELISM EQUAL parallelism= Number ) -> ^( TOK_QUERY_PARALLELISM $parallelism) | ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral ) -> ^( TOK_SCHEDULING_POLICY $policy) | ( KW_PATH EQUAL path= poolPath ) -> ^( TOK_PATH $path) )
            int alt22=4;
            switch ( input.LA(1) ) {
            case KW_ALLOC_FRACTION:
                {
                alt22=1;
                }
                break;
            case KW_QUERY_PARALLELISM:
                {
                alt22=2;
                }
                break;
            case KW_SCHEDULING_POLICY:
                {
                alt22=3;
                }
                break;
            case KW_PATH:
                {
                alt22=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // ResourcePlanParser.g:239:9: ( KW_ALLOC_FRACTION EQUAL allocFraction= Number )
                    {
                    // ResourcePlanParser.g:239:9: ( KW_ALLOC_FRACTION EQUAL allocFraction= Number )
                    // ResourcePlanParser.g:239:10: KW_ALLOC_FRACTION EQUAL allocFraction= Number
                    {
                    KW_ALLOC_FRACTION129=(Token)match(input,KW_ALLOC_FRACTION,FOLLOW_KW_ALLOC_FRACTION_in_poolAssign1698);  
                    stream_KW_ALLOC_FRACTION.add(KW_ALLOC_FRACTION129);


                    EQUAL130=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1700);  
                    stream_EQUAL.add(EQUAL130);


                    allocFraction=(Token)match(input,Number,FOLLOW_Number_in_poolAssign1704);  
                    stream_Number.add(allocFraction);


                    }


                    // AST REWRITE
                    // elements: allocFraction
                    // token labels: allocFraction
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_allocFraction=new RewriteRuleTokenStream(adaptor,"token allocFraction",allocFraction);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 239:56: -> ^( TOK_ALLOC_FRACTION $allocFraction)
                    {
                        // ResourcePlanParser.g:239:59: ^( TOK_ALLOC_FRACTION $allocFraction)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALLOC_FRACTION, "TOK_ALLOC_FRACTION")
                        , root_1);

                        adaptor.addChild(root_1, stream_allocFraction.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:240:9: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
                    {
                    // ResourcePlanParser.g:240:9: ( KW_QUERY_PARALLELISM EQUAL parallelism= Number )
                    // ResourcePlanParser.g:240:10: KW_QUERY_PARALLELISM EQUAL parallelism= Number
                    {
                    KW_QUERY_PARALLELISM131=(Token)match(input,KW_QUERY_PARALLELISM,FOLLOW_KW_QUERY_PARALLELISM_in_poolAssign1725);  
                    stream_KW_QUERY_PARALLELISM.add(KW_QUERY_PARALLELISM131);


                    EQUAL132=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1727);  
                    stream_EQUAL.add(EQUAL132);


                    parallelism=(Token)match(input,Number,FOLLOW_Number_in_poolAssign1731);  
                    stream_Number.add(parallelism);


                    }


                    // AST REWRITE
                    // elements: parallelism
                    // token labels: parallelism
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_parallelism=new RewriteRuleTokenStream(adaptor,"token parallelism",parallelism);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 240:57: -> ^( TOK_QUERY_PARALLELISM $parallelism)
                    {
                        // ResourcePlanParser.g:240:60: ^( TOK_QUERY_PARALLELISM $parallelism)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_QUERY_PARALLELISM, "TOK_QUERY_PARALLELISM")
                        , root_1);

                        adaptor.addChild(root_1, stream_parallelism.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:241:9: ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral )
                    {
                    // ResourcePlanParser.g:241:9: ( KW_SCHEDULING_POLICY EQUAL policy= StringLiteral )
                    // ResourcePlanParser.g:241:10: KW_SCHEDULING_POLICY EQUAL policy= StringLiteral
                    {
                    KW_SCHEDULING_POLICY133=(Token)match(input,KW_SCHEDULING_POLICY,FOLLOW_KW_SCHEDULING_POLICY_in_poolAssign1752);  
                    stream_KW_SCHEDULING_POLICY.add(KW_SCHEDULING_POLICY133);


                    EQUAL134=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1754);  
                    stream_EQUAL.add(EQUAL134);


                    policy=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_poolAssign1758);  
                    stream_StringLiteral.add(policy);


                    }


                    // AST REWRITE
                    // elements: policy
                    // token labels: policy
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_policy=new RewriteRuleTokenStream(adaptor,"token policy",policy);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 241:59: -> ^( TOK_SCHEDULING_POLICY $policy)
                    {
                        // ResourcePlanParser.g:241:62: ^( TOK_SCHEDULING_POLICY $policy)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SCHEDULING_POLICY, "TOK_SCHEDULING_POLICY")
                        , root_1);

                        adaptor.addChild(root_1, stream_policy.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // ResourcePlanParser.g:242:9: ( KW_PATH EQUAL path= poolPath )
                    {
                    // ResourcePlanParser.g:242:9: ( KW_PATH EQUAL path= poolPath )
                    // ResourcePlanParser.g:242:10: KW_PATH EQUAL path= poolPath
                    {
                    KW_PATH135=(Token)match(input,KW_PATH,FOLLOW_KW_PATH_in_poolAssign1779);  
                    stream_KW_PATH.add(KW_PATH135);


                    EQUAL136=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_poolAssign1781);  
                    stream_EQUAL.add(EQUAL136);


                    pushFollow(FOLLOW_poolPath_in_poolAssign1785);
                    path=poolPath();

                    state._fsp--;

                    stream_poolPath.add(path.getTree());

                    }


                    // AST REWRITE
                    // elements: path
                    // token labels: 
                    // rule labels: path, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 242:39: -> ^( TOK_PATH $path)
                    {
                        // ResourcePlanParser.g:242:42: ^( TOK_PATH $path)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PATH, "TOK_PATH")
                        , root_1);

                        adaptor.addChild(root_1, stream_path.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }


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
    // $ANTLR end "poolAssign"


    public static class poolAssignList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "poolAssignList"
    // ResourcePlanParser.g:246:1: poolAssignList : poolAssign ( COMMA poolAssign )* -> ( poolAssign )+ ;
    public final HiveParser_ResourcePlanParser.poolAssignList_return poolAssignList() throws RecognitionException {
        HiveParser_ResourcePlanParser.poolAssignList_return retval = new HiveParser_ResourcePlanParser.poolAssignList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA138=null;
        HiveParser_ResourcePlanParser.poolAssign_return poolAssign137 =null;

        HiveParser_ResourcePlanParser.poolAssign_return poolAssign139 =null;


        ASTNode COMMA138_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_poolAssign=new RewriteRuleSubtreeStream(adaptor,"rule poolAssign");
         gParent.pushMsg("poolAssignList", state); 
        try {
            // ResourcePlanParser.g:249:5: ( poolAssign ( COMMA poolAssign )* -> ( poolAssign )+ )
            // ResourcePlanParser.g:249:7: poolAssign ( COMMA poolAssign )*
            {
            pushFollow(FOLLOW_poolAssign_in_poolAssignList1830);
            poolAssign137=poolAssign();

            state._fsp--;

            stream_poolAssign.add(poolAssign137.getTree());

            // ResourcePlanParser.g:249:18: ( COMMA poolAssign )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==COMMA) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // ResourcePlanParser.g:249:19: COMMA poolAssign
            	    {
            	    COMMA138=(Token)match(input,COMMA,FOLLOW_COMMA_in_poolAssignList1833);  
            	    stream_COMMA.add(COMMA138);


            	    pushFollow(FOLLOW_poolAssign_in_poolAssignList1835);
            	    poolAssign139=poolAssign();

            	    state._fsp--;

            	    stream_poolAssign.add(poolAssign139.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            // AST REWRITE
            // elements: poolAssign
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 249:38: -> ( poolAssign )+
            {
                if ( !(stream_poolAssign.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_poolAssign.hasNext() ) {
                    adaptor.addChild(root_0, stream_poolAssign.nextTree());

                }
                stream_poolAssign.reset();

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
    // $ANTLR end "poolAssignList"


    public static class createPoolStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createPoolStatement"
    // ResourcePlanParser.g:252:1: createPoolStatement : KW_CREATE KW_POOL rpName= identifier DOT poolPath KW_WITH poolAssignList -> ^( TOK_CREATE_POOL $rpName poolPath poolAssignList ) ;
    public final HiveParser_ResourcePlanParser.createPoolStatement_return createPoolStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.createPoolStatement_return retval = new HiveParser_ResourcePlanParser.createPoolStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CREATE140=null;
        Token KW_POOL141=null;
        Token DOT142=null;
        Token KW_WITH144=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_ResourcePlanParser.poolPath_return poolPath143 =null;

        HiveParser_ResourcePlanParser.poolAssignList_return poolAssignList145 =null;


        ASTNode KW_CREATE140_tree=null;
        ASTNode KW_POOL141_tree=null;
        ASTNode DOT142_tree=null;
        ASTNode KW_WITH144_tree=null;
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_poolAssignList=new RewriteRuleSubtreeStream(adaptor,"rule poolAssignList");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
         gParent.pushMsg("create pool statement", state); 
        try {
            // ResourcePlanParser.g:255:5: ( KW_CREATE KW_POOL rpName= identifier DOT poolPath KW_WITH poolAssignList -> ^( TOK_CREATE_POOL $rpName poolPath poolAssignList ) )
            // ResourcePlanParser.g:255:7: KW_CREATE KW_POOL rpName= identifier DOT poolPath KW_WITH poolAssignList
            {
            KW_CREATE140=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createPoolStatement1869);  
            stream_KW_CREATE.add(KW_CREATE140);


            KW_POOL141=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_createPoolStatement1871);  
            stream_KW_POOL.add(KW_POOL141);


            pushFollow(FOLLOW_identifier_in_createPoolStatement1875);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            DOT142=(Token)match(input,DOT,FOLLOW_DOT_in_createPoolStatement1877);  
            stream_DOT.add(DOT142);


            pushFollow(FOLLOW_poolPath_in_createPoolStatement1879);
            poolPath143=poolPath();

            state._fsp--;

            stream_poolPath.add(poolPath143.getTree());

            KW_WITH144=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createPoolStatement1887);  
            stream_KW_WITH.add(KW_WITH144);


            pushFollow(FOLLOW_poolAssignList_in_createPoolStatement1889);
            poolAssignList145=poolAssignList();

            state._fsp--;

            stream_poolAssignList.add(poolAssignList145.getTree());

            // AST REWRITE
            // elements: poolAssignList, rpName, poolPath
            // token labels: 
            // rule labels: rpName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 257:5: -> ^( TOK_CREATE_POOL $rpName poolPath poolAssignList )
            {
                // ResourcePlanParser.g:257:8: ^( TOK_CREATE_POOL $rpName poolPath poolAssignList )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_CREATE_POOL, "TOK_CREATE_POOL")
                , root_1);

                adaptor.addChild(root_1, stream_rpName.nextTree());

                adaptor.addChild(root_1, stream_poolPath.nextTree());

                adaptor.addChild(root_1, stream_poolAssignList.nextTree());

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
    // $ANTLR end "createPoolStatement"


    public static class alterPoolStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterPoolStatement"
    // ResourcePlanParser.g:260:1: alterPoolStatement : KW_ALTER KW_POOL rpName= identifier DOT poolPath ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName) ) ) ;
    public final HiveParser_ResourcePlanParser.alterPoolStatement_return alterPoolStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.alterPoolStatement_return retval = new HiveParser_ResourcePlanParser.alterPoolStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ALTER146=null;
        Token KW_POOL147=null;
        Token DOT148=null;
        Token KW_SET150=null;
        Token KW_UNSET152=null;
        Token KW_SCHEDULING_POLICY153=null;
        Token KW_ADD154=null;
        Token KW_TRIGGER155=null;
        Token KW_DROP156=null;
        Token KW_TRIGGER157=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_IdentifiersParser.identifier_return triggerName =null;

        HiveParser_ResourcePlanParser.poolPath_return poolPath149 =null;

        HiveParser_ResourcePlanParser.poolAssignList_return poolAssignList151 =null;


        ASTNode KW_ALTER146_tree=null;
        ASTNode KW_POOL147_tree=null;
        ASTNode DOT148_tree=null;
        ASTNode KW_SET150_tree=null;
        ASTNode KW_UNSET152_tree=null;
        ASTNode KW_SCHEDULING_POLICY153_tree=null;
        ASTNode KW_ADD154_tree=null;
        ASTNode KW_TRIGGER155_tree=null;
        ASTNode KW_DROP156_tree=null;
        ASTNode KW_TRIGGER157_tree=null;
        RewriteRuleTokenStream stream_KW_TRIGGER=new RewriteRuleTokenStream(adaptor,"token KW_TRIGGER");
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
        RewriteRuleTokenStream stream_KW_SCHEDULING_POLICY=new RewriteRuleTokenStream(adaptor,"token KW_SCHEDULING_POLICY");
        RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_poolAssignList=new RewriteRuleSubtreeStream(adaptor,"rule poolAssignList");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
         gParent.pushMsg("alter pool statement", state); 
        try {
            // ResourcePlanParser.g:263:5: ( KW_ALTER KW_POOL rpName= identifier DOT poolPath ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName) ) ) )
            // ResourcePlanParser.g:263:7: KW_ALTER KW_POOL rpName= identifier DOT poolPath ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName) ) )
            {
            KW_ALTER146=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterPoolStatement1933);  
            stream_KW_ALTER.add(KW_ALTER146);


            KW_POOL147=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_alterPoolStatement1935);  
            stream_KW_POOL.add(KW_POOL147);


            pushFollow(FOLLOW_identifier_in_alterPoolStatement1939);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            DOT148=(Token)match(input,DOT,FOLLOW_DOT_in_alterPoolStatement1941);  
            stream_DOT.add(DOT148);


            pushFollow(FOLLOW_poolPath_in_alterPoolStatement1943);
            poolPath149=poolPath();

            state._fsp--;

            stream_poolPath.add(poolPath149.getTree());

            // ResourcePlanParser.g:263:55: ( ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) ) | ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) ) | ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName) ) | ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName) ) )
            int alt24=4;
            switch ( input.LA(1) ) {
            case KW_SET:
                {
                alt24=1;
                }
                break;
            case KW_UNSET:
                {
                alt24=2;
                }
                break;
            case KW_ADD:
                {
                alt24=3;
                }
                break;
            case KW_DROP:
                {
                alt24=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }

            switch (alt24) {
                case 1 :
                    // ResourcePlanParser.g:264:9: ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) )
                    {
                    // ResourcePlanParser.g:264:9: ( KW_SET poolAssignList -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList ) )
                    // ResourcePlanParser.g:264:10: KW_SET poolAssignList
                    {
                    KW_SET150=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterPoolStatement1956);  
                    stream_KW_SET.add(KW_SET150);


                    pushFollow(FOLLOW_poolAssignList_in_alterPoolStatement1958);
                    poolAssignList151=poolAssignList();

                    state._fsp--;

                    stream_poolAssignList.add(poolAssignList151.getTree());

                    // AST REWRITE
                    // elements: rpName, poolAssignList, poolPath
                    // token labels: 
                    // rule labels: rpName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 264:32: -> ^( TOK_ALTER_POOL $rpName poolPath poolAssignList )
                    {
                        // ResourcePlanParser.g:264:35: ^( TOK_ALTER_POOL $rpName poolPath poolAssignList )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, stream_poolPath.nextTree());

                        adaptor.addChild(root_1, stream_poolAssignList.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:265:11: ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) )
                    {
                    // ResourcePlanParser.g:265:11: ( KW_UNSET KW_SCHEDULING_POLICY -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) ) )
                    // ResourcePlanParser.g:265:12: KW_UNSET KW_SCHEDULING_POLICY
                    {
                    KW_UNSET152=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterPoolStatement1985);  
                    stream_KW_UNSET.add(KW_UNSET152);


                    KW_SCHEDULING_POLICY153=(Token)match(input,KW_SCHEDULING_POLICY,FOLLOW_KW_SCHEDULING_POLICY_in_alterPoolStatement1987);  
                    stream_KW_SCHEDULING_POLICY.add(KW_SCHEDULING_POLICY153);


                    // AST REWRITE
                    // elements: poolPath, rpName
                    // token labels: 
                    // rule labels: rpName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 265:42: -> ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) )
                    {
                        // ResourcePlanParser.g:265:45: ^( TOK_ALTER_POOL $rpName poolPath ^( TOK_SCHEDULING_POLICY TOK_NULL ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL, "TOK_ALTER_POOL")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, stream_poolPath.nextTree());

                        // ResourcePlanParser.g:265:79: ^( TOK_SCHEDULING_POLICY TOK_NULL )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SCHEDULING_POLICY, "TOK_SCHEDULING_POLICY")
                        , root_2);

                        adaptor.addChild(root_2, 
                        (ASTNode)adaptor.create(TOK_NULL, "TOK_NULL")
                        );

                        adaptor.addChild(root_1, root_2);
                        }

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:266:11: ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName) )
                    {
                    // ResourcePlanParser.g:266:11: ( KW_ADD KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName) )
                    // ResourcePlanParser.g:266:12: KW_ADD KW_TRIGGER triggerName= identifier
                    {
                    KW_ADD154=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterPoolStatement2018);  
                    stream_KW_ADD.add(KW_ADD154);


                    KW_TRIGGER155=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_alterPoolStatement2020);  
                    stream_KW_TRIGGER.add(KW_TRIGGER155);


                    pushFollow(FOLLOW_identifier_in_alterPoolStatement2024);
                    triggerName=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(triggerName.getTree());

                    // AST REWRITE
                    // elements: poolPath, rpName, triggerName
                    // token labels: 
                    // rule labels: triggerName, rpName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 266:53: -> ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName)
                    {
                        // ResourcePlanParser.g:266:56: ^( TOK_ALTER_POOL_ADD_TRIGGER $rpName poolPath $triggerName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL_ADD_TRIGGER, "TOK_ALTER_POOL_ADD_TRIGGER")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, stream_poolPath.nextTree());

                        adaptor.addChild(root_1, stream_triggerName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;
                case 4 :
                    // ResourcePlanParser.g:267:11: ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName) )
                    {
                    // ResourcePlanParser.g:267:11: ( KW_DROP KW_TRIGGER triggerName= identifier -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName) )
                    // ResourcePlanParser.g:267:12: KW_DROP KW_TRIGGER triggerName= identifier
                    {
                    KW_DROP156=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterPoolStatement2052);  
                    stream_KW_DROP.add(KW_DROP156);


                    KW_TRIGGER157=(Token)match(input,KW_TRIGGER,FOLLOW_KW_TRIGGER_in_alterPoolStatement2054);  
                    stream_KW_TRIGGER.add(KW_TRIGGER157);


                    pushFollow(FOLLOW_identifier_in_alterPoolStatement2058);
                    triggerName=gHiveParser.identifier();

                    state._fsp--;

                    stream_identifier.add(triggerName.getTree());

                    // AST REWRITE
                    // elements: poolPath, triggerName, rpName
                    // token labels: 
                    // rule labels: triggerName, rpName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_triggerName=new RewriteRuleSubtreeStream(adaptor,"rule triggerName",triggerName!=null?triggerName.tree:null);
                    RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 267:54: -> ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName)
                    {
                        // ResourcePlanParser.g:267:57: ^( TOK_ALTER_POOL_DROP_TRIGGER $rpName poolPath $triggerName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTER_POOL_DROP_TRIGGER, "TOK_ALTER_POOL_DROP_TRIGGER")
                        , root_1);

                        adaptor.addChild(root_1, stream_rpName.nextTree());

                        adaptor.addChild(root_1, stream_poolPath.nextTree());

                        adaptor.addChild(root_1, stream_triggerName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }


                    }
                    break;

            }


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
    // $ANTLR end "alterPoolStatement"


    public static class dropPoolStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropPoolStatement"
    // ResourcePlanParser.g:271:1: dropPoolStatement : KW_DROP KW_POOL rpName= identifier DOT poolPath -> ^( TOK_DROP_POOL $rpName poolPath ) ;
    public final HiveParser_ResourcePlanParser.dropPoolStatement_return dropPoolStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.dropPoolStatement_return retval = new HiveParser_ResourcePlanParser.dropPoolStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP158=null;
        Token KW_POOL159=null;
        Token DOT160=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_ResourcePlanParser.poolPath_return poolPath161 =null;


        ASTNode KW_DROP158_tree=null;
        ASTNode KW_POOL159_tree=null;
        ASTNode DOT160_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
         gParent.pushMsg("drop pool statement", state); 
        try {
            // ResourcePlanParser.g:274:5: ( KW_DROP KW_POOL rpName= identifier DOT poolPath -> ^( TOK_DROP_POOL $rpName poolPath ) )
            // ResourcePlanParser.g:274:7: KW_DROP KW_POOL rpName= identifier DOT poolPath
            {
            KW_DROP158=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropPoolStatement2108);  
            stream_KW_DROP.add(KW_DROP158);


            KW_POOL159=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_dropPoolStatement2110);  
            stream_KW_POOL.add(KW_POOL159);


            pushFollow(FOLLOW_identifier_in_dropPoolStatement2114);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            DOT160=(Token)match(input,DOT,FOLLOW_DOT_in_dropPoolStatement2116);  
            stream_DOT.add(DOT160);


            pushFollow(FOLLOW_poolPath_in_dropPoolStatement2118);
            poolPath161=poolPath();

            state._fsp--;

            stream_poolPath.add(poolPath161.getTree());

            // AST REWRITE
            // elements: poolPath, rpName
            // token labels: 
            // rule labels: rpName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 275:5: -> ^( TOK_DROP_POOL $rpName poolPath )
            {
                // ResourcePlanParser.g:275:8: ^( TOK_DROP_POOL $rpName poolPath )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DROP_POOL, "TOK_DROP_POOL")
                , root_1);

                adaptor.addChild(root_1, stream_rpName.nextTree());

                adaptor.addChild(root_1, stream_poolPath.nextTree());

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
    // $ANTLR end "dropPoolStatement"


    public static class createMappingStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createMappingStatement"
    // ResourcePlanParser.g:278:1: createMappingStatement : ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) ;
    public final HiveParser_ResourcePlanParser.createMappingStatement_return createMappingStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.createMappingStatement_return retval = new HiveParser_ResourcePlanParser.createMappingStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token mappingType=null;
        Token name=null;
        Token order=null;
        Token KW_CREATE162=null;
        Token KW_USER163=null;
        Token KW_GROUP164=null;
        Token KW_APPLICATION165=null;
        Token KW_MAPPING166=null;
        Token KW_IN167=null;
        Token KW_TO168=null;
        Token KW_WITH170=null;
        Token KW_ORDER171=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_ResourcePlanParser.poolPath_return path =null;

        HiveParser_ResourcePlanParser.unmanaged_return unmanaged169 =null;


        ASTNode mappingType_tree=null;
        ASTNode name_tree=null;
        ASTNode order_tree=null;
        ASTNode KW_CREATE162_tree=null;
        ASTNode KW_USER163_tree=null;
        ASTNode KW_GROUP164_tree=null;
        ASTNode KW_APPLICATION165_tree=null;
        ASTNode KW_MAPPING166_tree=null;
        ASTNode KW_IN167_tree=null;
        ASTNode KW_TO168_tree=null;
        ASTNode KW_WITH170_tree=null;
        ASTNode KW_ORDER171_tree=null;
        RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_USER=new RewriteRuleTokenStream(adaptor,"token KW_USER");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_MAPPING=new RewriteRuleTokenStream(adaptor,"token KW_MAPPING");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleTokenStream stream_KW_APPLICATION=new RewriteRuleTokenStream(adaptor,"token KW_APPLICATION");
        RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
        RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_unmanaged=new RewriteRuleSubtreeStream(adaptor,"rule unmanaged");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
         gParent.pushMsg("create mapping statement", state); 
        try {
            // ResourcePlanParser.g:281:5: ( ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) )
            // ResourcePlanParser.g:281:7: ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
            {
            // ResourcePlanParser.g:281:7: ( KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
            // ResourcePlanParser.g:281:8: KW_CREATE mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )?
            {
            KW_CREATE162=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createMappingStatement2161);  
            stream_KW_CREATE.add(KW_CREATE162);


            // ResourcePlanParser.g:281:30: ( KW_USER | KW_GROUP | KW_APPLICATION )
            int alt25=3;
            switch ( input.LA(1) ) {
            case KW_USER:
                {
                alt25=1;
                }
                break;
            case KW_GROUP:
                {
                alt25=2;
                }
                break;
            case KW_APPLICATION:
                {
                alt25=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // ResourcePlanParser.g:281:31: KW_USER
                    {
                    KW_USER163=(Token)match(input,KW_USER,FOLLOW_KW_USER_in_createMappingStatement2166);  
                    stream_KW_USER.add(KW_USER163);


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:281:41: KW_GROUP
                    {
                    KW_GROUP164=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_createMappingStatement2170);  
                    stream_KW_GROUP.add(KW_GROUP164);


                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:281:52: KW_APPLICATION
                    {
                    KW_APPLICATION165=(Token)match(input,KW_APPLICATION,FOLLOW_KW_APPLICATION_in_createMappingStatement2174);  
                    stream_KW_APPLICATION.add(KW_APPLICATION165);


                    }
                    break;

            }


            KW_MAPPING166=(Token)match(input,KW_MAPPING,FOLLOW_KW_MAPPING_in_createMappingStatement2186);  
            stream_KW_MAPPING.add(KW_MAPPING166);


            name=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_createMappingStatement2190);  
            stream_StringLiteral.add(name);


            KW_IN167=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_createMappingStatement2201);  
            stream_KW_IN.add(KW_IN167);


            pushFollow(FOLLOW_identifier_in_createMappingStatement2205);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            // ResourcePlanParser.g:283:34: ( ( KW_TO path= poolPath ) | unmanaged )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==KW_TO) ) {
                alt26=1;
            }
            else if ( (LA26_0==KW_UNMANAGED) ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // ResourcePlanParser.g:283:35: ( KW_TO path= poolPath )
                    {
                    // ResourcePlanParser.g:283:35: ( KW_TO path= poolPath )
                    // ResourcePlanParser.g:283:36: KW_TO path= poolPath
                    {
                    KW_TO168=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_createMappingStatement2209);  
                    stream_KW_TO.add(KW_TO168);


                    pushFollow(FOLLOW_poolPath_in_createMappingStatement2213);
                    path=poolPath();

                    state._fsp--;

                    stream_poolPath.add(path.getTree());

                    }


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:283:59: unmanaged
                    {
                    pushFollow(FOLLOW_unmanaged_in_createMappingStatement2218);
                    unmanaged169=unmanaged();

                    state._fsp--;

                    stream_unmanaged.add(unmanaged169.getTree());

                    }
                    break;

            }


            // ResourcePlanParser.g:284:10: ( KW_WITH KW_ORDER order= Number )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==KW_WITH) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ResourcePlanParser.g:284:11: KW_WITH KW_ORDER order= Number
                    {
                    KW_WITH170=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createMappingStatement2231);  
                    stream_KW_WITH.add(KW_WITH170);


                    KW_ORDER171=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_createMappingStatement2233);  
                    stream_KW_ORDER.add(KW_ORDER171);


                    order=(Token)match(input,Number,FOLLOW_Number_in_createMappingStatement2237);  
                    stream_Number.add(order);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: name, mappingType, path, unmanaged, order, rpName
            // token labels: mappingType, name, order
            // rule labels: path, rpName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_mappingType=new RewriteRuleTokenStream(adaptor,"token mappingType",mappingType);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_order=new RewriteRuleTokenStream(adaptor,"token order",order);
            RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.tree:null);
            RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 285:5: -> ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
            {
                // ResourcePlanParser.g:285:8: ^( TOK_CREATE_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_CREATE_MAPPING, "TOK_CREATE_MAPPING")
                , root_1);

                adaptor.addChild(root_1, stream_rpName.nextTree());

                adaptor.addChild(root_1, stream_mappingType.nextNode());

                adaptor.addChild(root_1, stream_name.nextNode());

                // ResourcePlanParser.g:285:57: ( $path)?
                if ( stream_path.hasNext() ) {
                    adaptor.addChild(root_1, stream_path.nextTree());

                }
                stream_path.reset();

                // ResourcePlanParser.g:285:63: ( unmanaged )?
                if ( stream_unmanaged.hasNext() ) {
                    adaptor.addChild(root_1, stream_unmanaged.nextTree());

                }
                stream_unmanaged.reset();

                // ResourcePlanParser.g:285:75: ( $order)?
                if ( stream_order.hasNext() ) {
                    adaptor.addChild(root_1, stream_order.nextNode());

                }
                stream_order.reset();

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
    // $ANTLR end "createMappingStatement"


    public static class alterMappingStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterMappingStatement"
    // ResourcePlanParser.g:288:1: alterMappingStatement : ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) ;
    public final HiveParser_ResourcePlanParser.alterMappingStatement_return alterMappingStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.alterMappingStatement_return retval = new HiveParser_ResourcePlanParser.alterMappingStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token mappingType=null;
        Token name=null;
        Token order=null;
        Token KW_ALTER172=null;
        Token KW_USER173=null;
        Token KW_GROUP174=null;
        Token KW_APPLICATION175=null;
        Token KW_MAPPING176=null;
        Token KW_IN177=null;
        Token KW_TO178=null;
        Token KW_WITH180=null;
        Token KW_ORDER181=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;

        HiveParser_ResourcePlanParser.poolPath_return path =null;

        HiveParser_ResourcePlanParser.unmanaged_return unmanaged179 =null;


        ASTNode mappingType_tree=null;
        ASTNode name_tree=null;
        ASTNode order_tree=null;
        ASTNode KW_ALTER172_tree=null;
        ASTNode KW_USER173_tree=null;
        ASTNode KW_GROUP174_tree=null;
        ASTNode KW_APPLICATION175_tree=null;
        ASTNode KW_MAPPING176_tree=null;
        ASTNode KW_IN177_tree=null;
        ASTNode KW_TO178_tree=null;
        ASTNode KW_WITH180_tree=null;
        ASTNode KW_ORDER181_tree=null;
        RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_USER=new RewriteRuleTokenStream(adaptor,"token KW_USER");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_MAPPING=new RewriteRuleTokenStream(adaptor,"token KW_MAPPING");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleTokenStream stream_KW_APPLICATION=new RewriteRuleTokenStream(adaptor,"token KW_APPLICATION");
        RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
        RewriteRuleTokenStream stream_KW_ORDER=new RewriteRuleTokenStream(adaptor,"token KW_ORDER");
        RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_unmanaged=new RewriteRuleSubtreeStream(adaptor,"rule unmanaged");
        RewriteRuleSubtreeStream stream_poolPath=new RewriteRuleSubtreeStream(adaptor,"rule poolPath");
         gParent.pushMsg("alter mapping statement", state); 
        try {
            // ResourcePlanParser.g:291:5: ( ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? ) -> ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? ) )
            // ResourcePlanParser.g:291:7: ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
            {
            // ResourcePlanParser.g:291:7: ( KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )? )
            // ResourcePlanParser.g:291:8: KW_ALTER mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier ( ( KW_TO path= poolPath ) | unmanaged ) ( KW_WITH KW_ORDER order= Number )?
            {
            KW_ALTER172=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterMappingStatement2298);  
            stream_KW_ALTER.add(KW_ALTER172);


            // ResourcePlanParser.g:291:29: ( KW_USER | KW_GROUP | KW_APPLICATION )
            int alt28=3;
            switch ( input.LA(1) ) {
            case KW_USER:
                {
                alt28=1;
                }
                break;
            case KW_GROUP:
                {
                alt28=2;
                }
                break;
            case KW_APPLICATION:
                {
                alt28=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // ResourcePlanParser.g:291:30: KW_USER
                    {
                    KW_USER173=(Token)match(input,KW_USER,FOLLOW_KW_USER_in_alterMappingStatement2303);  
                    stream_KW_USER.add(KW_USER173);


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:291:40: KW_GROUP
                    {
                    KW_GROUP174=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_alterMappingStatement2307);  
                    stream_KW_GROUP.add(KW_GROUP174);


                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:291:51: KW_APPLICATION
                    {
                    KW_APPLICATION175=(Token)match(input,KW_APPLICATION,FOLLOW_KW_APPLICATION_in_alterMappingStatement2311);  
                    stream_KW_APPLICATION.add(KW_APPLICATION175);


                    }
                    break;

            }


            KW_MAPPING176=(Token)match(input,KW_MAPPING,FOLLOW_KW_MAPPING_in_alterMappingStatement2323);  
            stream_KW_MAPPING.add(KW_MAPPING176);


            name=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterMappingStatement2327);  
            stream_StringLiteral.add(name);


            KW_IN177=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_alterMappingStatement2338);  
            stream_KW_IN.add(KW_IN177);


            pushFollow(FOLLOW_identifier_in_alterMappingStatement2342);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            // ResourcePlanParser.g:293:34: ( ( KW_TO path= poolPath ) | unmanaged )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KW_TO) ) {
                alt29=1;
            }
            else if ( (LA29_0==KW_UNMANAGED) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // ResourcePlanParser.g:293:35: ( KW_TO path= poolPath )
                    {
                    // ResourcePlanParser.g:293:35: ( KW_TO path= poolPath )
                    // ResourcePlanParser.g:293:36: KW_TO path= poolPath
                    {
                    KW_TO178=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterMappingStatement2346);  
                    stream_KW_TO.add(KW_TO178);


                    pushFollow(FOLLOW_poolPath_in_alterMappingStatement2350);
                    path=poolPath();

                    state._fsp--;

                    stream_poolPath.add(path.getTree());

                    }


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:293:59: unmanaged
                    {
                    pushFollow(FOLLOW_unmanaged_in_alterMappingStatement2355);
                    unmanaged179=unmanaged();

                    state._fsp--;

                    stream_unmanaged.add(unmanaged179.getTree());

                    }
                    break;

            }


            // ResourcePlanParser.g:294:10: ( KW_WITH KW_ORDER order= Number )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==KW_WITH) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // ResourcePlanParser.g:294:11: KW_WITH KW_ORDER order= Number
                    {
                    KW_WITH180=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterMappingStatement2368);  
                    stream_KW_WITH.add(KW_WITH180);


                    KW_ORDER181=(Token)match(input,KW_ORDER,FOLLOW_KW_ORDER_in_alterMappingStatement2370);  
                    stream_KW_ORDER.add(KW_ORDER181);


                    order=(Token)match(input,Number,FOLLOW_Number_in_alterMappingStatement2374);  
                    stream_Number.add(order);


                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: order, path, mappingType, name, unmanaged, rpName
            // token labels: mappingType, name, order
            // rule labels: path, rpName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_mappingType=new RewriteRuleTokenStream(adaptor,"token mappingType",mappingType);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleTokenStream stream_order=new RewriteRuleTokenStream(adaptor,"token order",order);
            RewriteRuleSubtreeStream stream_path=new RewriteRuleSubtreeStream(adaptor,"rule path",path!=null?path.tree:null);
            RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 295:5: -> ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
            {
                // ResourcePlanParser.g:295:8: ^( TOK_ALTER_MAPPING $rpName $mappingType $name ( $path)? ( unmanaged )? ( $order)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTER_MAPPING, "TOK_ALTER_MAPPING")
                , root_1);

                adaptor.addChild(root_1, stream_rpName.nextTree());

                adaptor.addChild(root_1, stream_mappingType.nextNode());

                adaptor.addChild(root_1, stream_name.nextNode());

                // ResourcePlanParser.g:295:56: ( $path)?
                if ( stream_path.hasNext() ) {
                    adaptor.addChild(root_1, stream_path.nextTree());

                }
                stream_path.reset();

                // ResourcePlanParser.g:295:62: ( unmanaged )?
                if ( stream_unmanaged.hasNext() ) {
                    adaptor.addChild(root_1, stream_unmanaged.nextTree());

                }
                stream_unmanaged.reset();

                // ResourcePlanParser.g:295:74: ( $order)?
                if ( stream_order.hasNext() ) {
                    adaptor.addChild(root_1, stream_order.nextNode());

                }
                stream_order.reset();

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
    // $ANTLR end "alterMappingStatement"


    public static class dropMappingStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropMappingStatement"
    // ResourcePlanParser.g:298:1: dropMappingStatement : KW_DROP mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier -> ^( TOK_DROP_MAPPING $rpName $mappingType $name) ;
    public final HiveParser_ResourcePlanParser.dropMappingStatement_return dropMappingStatement() throws RecognitionException {
        HiveParser_ResourcePlanParser.dropMappingStatement_return retval = new HiveParser_ResourcePlanParser.dropMappingStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token mappingType=null;
        Token name=null;
        Token KW_DROP182=null;
        Token KW_USER183=null;
        Token KW_GROUP184=null;
        Token KW_APPLICATION185=null;
        Token KW_MAPPING186=null;
        Token KW_IN187=null;
        HiveParser_IdentifiersParser.identifier_return rpName =null;


        ASTNode mappingType_tree=null;
        ASTNode name_tree=null;
        ASTNode KW_DROP182_tree=null;
        ASTNode KW_USER183_tree=null;
        ASTNode KW_GROUP184_tree=null;
        ASTNode KW_APPLICATION185_tree=null;
        ASTNode KW_MAPPING186_tree=null;
        ASTNode KW_IN187_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_IN=new RewriteRuleTokenStream(adaptor,"token KW_IN");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_USER=new RewriteRuleTokenStream(adaptor,"token KW_USER");
        RewriteRuleTokenStream stream_KW_MAPPING=new RewriteRuleTokenStream(adaptor,"token KW_MAPPING");
        RewriteRuleTokenStream stream_KW_APPLICATION=new RewriteRuleTokenStream(adaptor,"token KW_APPLICATION");
        RewriteRuleTokenStream stream_KW_GROUP=new RewriteRuleTokenStream(adaptor,"token KW_GROUP");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("drop mapping statement", state); 
        try {
            // ResourcePlanParser.g:301:5: ( KW_DROP mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier -> ^( TOK_DROP_MAPPING $rpName $mappingType $name) )
            // ResourcePlanParser.g:301:7: KW_DROP mappingType= ( KW_USER | KW_GROUP | KW_APPLICATION ) KW_MAPPING name= StringLiteral KW_IN rpName= identifier
            {
            KW_DROP182=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropMappingStatement2434);  
            stream_KW_DROP.add(KW_DROP182);


            // ResourcePlanParser.g:301:27: ( KW_USER | KW_GROUP | KW_APPLICATION )
            int alt31=3;
            switch ( input.LA(1) ) {
            case KW_USER:
                {
                alt31=1;
                }
                break;
            case KW_GROUP:
                {
                alt31=2;
                }
                break;
            case KW_APPLICATION:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }

            switch (alt31) {
                case 1 :
                    // ResourcePlanParser.g:301:28: KW_USER
                    {
                    KW_USER183=(Token)match(input,KW_USER,FOLLOW_KW_USER_in_dropMappingStatement2439);  
                    stream_KW_USER.add(KW_USER183);


                    }
                    break;
                case 2 :
                    // ResourcePlanParser.g:301:38: KW_GROUP
                    {
                    KW_GROUP184=(Token)match(input,KW_GROUP,FOLLOW_KW_GROUP_in_dropMappingStatement2443);  
                    stream_KW_GROUP.add(KW_GROUP184);


                    }
                    break;
                case 3 :
                    // ResourcePlanParser.g:301:49: KW_APPLICATION
                    {
                    KW_APPLICATION185=(Token)match(input,KW_APPLICATION,FOLLOW_KW_APPLICATION_in_dropMappingStatement2447);  
                    stream_KW_APPLICATION.add(KW_APPLICATION185);


                    }
                    break;

            }


            KW_MAPPING186=(Token)match(input,KW_MAPPING,FOLLOW_KW_MAPPING_in_dropMappingStatement2450);  
            stream_KW_MAPPING.add(KW_MAPPING186);


            name=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dropMappingStatement2463);  
            stream_StringLiteral.add(name);


            KW_IN187=(Token)match(input,KW_IN,FOLLOW_KW_IN_in_dropMappingStatement2465);  
            stream_KW_IN.add(KW_IN187);


            pushFollow(FOLLOW_identifier_in_dropMappingStatement2469);
            rpName=gHiveParser.identifier();

            state._fsp--;

            stream_identifier.add(rpName.getTree());

            // AST REWRITE
            // elements: mappingType, name, rpName
            // token labels: mappingType, name
            // rule labels: rpName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleTokenStream stream_mappingType=new RewriteRuleTokenStream(adaptor,"token mappingType",mappingType);
            RewriteRuleTokenStream stream_name=new RewriteRuleTokenStream(adaptor,"token name",name);
            RewriteRuleSubtreeStream stream_rpName=new RewriteRuleSubtreeStream(adaptor,"rule rpName",rpName!=null?rpName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 303:5: -> ^( TOK_DROP_MAPPING $rpName $mappingType $name)
            {
                // ResourcePlanParser.g:303:8: ^( TOK_DROP_MAPPING $rpName $mappingType $name)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DROP_MAPPING, "TOK_DROP_MAPPING")
                , root_1);

                adaptor.addChild(root_1, stream_rpName.nextTree());

                adaptor.addChild(root_1, stream_mappingType.nextNode());

                adaptor.addChild(root_1, stream_name.nextNode());

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
    // $ANTLR end "dropMappingStatement"

    // Delegated rules


 

    public static final BitSet FOLLOW_createResourcePlanStatement_in_resourcePlanDdlStatements63 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterResourcePlanStatement_in_resourcePlanDdlStatements71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropResourcePlanStatement_in_resourcePlanDdlStatements79 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_globalWmStatement_in_resourcePlanDdlStatements87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_replaceResourcePlanStatement_in_resourcePlanDdlStatements95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createTriggerStatement_in_resourcePlanDdlStatements103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTriggerStatement_in_resourcePlanDdlStatements111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropTriggerStatement_in_resourcePlanDdlStatements119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createPoolStatement_in_resourcePlanDdlStatements127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterPoolStatement_in_resourcePlanDdlStatements135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropPoolStatement_in_resourcePlanDdlStatements143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_createMappingStatement_in_resourcePlanDdlStatements151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterMappingStatement_in_resourcePlanDdlStatements159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dropMappingStatement_in_resourcePlanDdlStatements167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_QUERY_PARALLELISM_in_rpAssign201 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_rpAssign203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_rpAssign207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_rpAssign226 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_POOL_in_rpAssign228 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_rpAssign230 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_rpAssign232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rpAssign_in_rpAssignList270 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_rpAssignList273 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rpAssign_in_rpAssignList275 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_KW_QUERY_PARALLELISM_in_rpUnassign314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_rpUnassign330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_POOL_in_rpUnassign332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rpUnassign_in_rpUnassignList368 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_rpUnassignList371 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rpUnassign_in_rpUnassignList373 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_KW_CREATE_in_createResourcePlanStatement405 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_RESOURCE_in_createResourcePlanStatement407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_PLAN_in_createResourcePlanStatement409 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifNotExists_in_createResourcePlanStatement411 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_createResourcePlanStatement429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_KW_LIKE_in_createResourcePlanStatement431 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_createResourcePlanStatement435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_createResourcePlanStatement470 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_createResourcePlanStatement473 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rpAssignList_in_createResourcePlanStatement475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WITH_in_withReplace515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_REPLACE_in_withReplace517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ACTIVATE_in_activate530 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_withReplace_in_activate532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ENABLE_in_enable549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DISABLE_in_disable562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNMANAGED_in_unmanaged575 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterResourcePlanStatement604 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_RESOURCE_in_alterResourcePlanStatement606 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_PLAN_in_alterResourcePlanStatement608 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterResourcePlanStatement612 = new BitSet(new long[]{0x0000000008000000L,0x8010000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000100000000L,0x1000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_VALIDATE_in_alterResourcePlanStatement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DISABLE_in_alterResourcePlanStatement650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterResourcePlanStatement673 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rpAssignList_in_alterResourcePlanStatement675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNSET_in_alterResourcePlanStatement700 = new BitSet(new long[]{0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_rpUnassignList_in_alterResourcePlanStatement702 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RENAME_in_alterResourcePlanStatement727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterResourcePlanStatement729 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterResourcePlanStatement733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_activate_in_alterResourcePlanStatement760 = new BitSet(new long[]{0x0000000000000002L,0x8000000000000000L});
    public static final BitSet FOLLOW_enable_in_alterResourcePlanStatement762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_enable_in_alterResourcePlanStatement767 = new BitSet(new long[]{0x0000000008000002L});
    public static final BitSet FOLLOW_activate_in_alterResourcePlanStatement769 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ENABLE_in_globalWmStatement824 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_WORKLOAD_in_globalWmStatement826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_MANAGEMENT_in_globalWmStatement828 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DISABLE_in_globalWmStatement842 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_WORKLOAD_in_globalWmStatement844 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_MANAGEMENT_in_globalWmStatement846 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_REPLACE_in_replaceResourcePlanStatement879 = new BitSet(new long[]{0x0000000010000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_ACTIVE_in_replaceResourcePlanStatement894 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_PLAN_in_replaceResourcePlanStatement898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_replaceResourcePlanStatement900 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_replaceResourcePlanStatement904 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RESOURCE_in_replaceResourcePlanStatement927 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_PLAN_in_replaceResourcePlanStatement929 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_replaceResourcePlanStatement933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_replaceResourcePlanStatement935 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_replaceResourcePlanStatement939 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_dropResourcePlanStatement987 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_RESOURCE_in_dropResourcePlanStatement989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_PLAN_in_dropResourcePlanStatement991 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifExists_in_dropResourcePlanStatement993 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_dropResourcePlanStatement998 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_poolPath1037 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOT_in_poolPath1041 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_poolPath1043 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_triggerAtomExpression_in_triggerExpression1072 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerExpression_in_triggerExpressionStandalone1093 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_triggerExpressionStandalone1095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerAndExpression_in_triggerOrExpression1120 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_OR_in_triggerOrExpression1123 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_triggerAndExpression_in_triggerOrExpression1125 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_triggerAtomExpression_in_triggerAndExpression1154 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_KW_AND_in_triggerAndExpression1157 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_triggerAtomExpression_in_triggerAndExpression1159 = new BitSet(new long[]{0x0000001000000002L});
    public static final BitSet FOLLOW_identifier_in_triggerAtomExpression1188 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_comparisionOperator_in_triggerAtomExpression1190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001001000000000L});
    public static final BitSet FOLLOW_triggerLiteral_in_triggerAtomExpression1192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GREATERTHAN_in_comparisionOperator1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_KILL_in_triggerActionExpression1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MOVE_in_triggerActionExpression1291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_triggerActionExpression1294 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_triggerActionExpression1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_triggerActionExpression_in_triggerActionExpressionStandalone1311 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_triggerActionExpressionStandalone1313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_createTriggerStatement1336 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_TRIGGER_in_createTriggerStatement1338 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_createTriggerStatement1342 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_createTriggerStatement1344 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_createTriggerStatement1348 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KW_WHEN_in_createTriggerStatement1356 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_triggerExpression_in_createTriggerStatement1358 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KW_DO_in_createTriggerStatement1360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000004L});
    public static final BitSet FOLLOW_triggerActionExpression_in_createTriggerStatement1362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterTriggerStatement1409 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_TRIGGER_in_alterTriggerStatement1411 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterTriggerStatement1415 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_alterTriggerStatement1417 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterTriggerStatement1421 = new BitSet(new long[]{0x0000000020000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KW_WHEN_in_alterTriggerStatement1434 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_triggerExpression_in_alterTriggerStatement1436 = new BitSet(new long[]{0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KW_DO_in_alterTriggerStatement1438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000400000004L});
    public static final BitSet FOLLOW_triggerActionExpression_in_alterTriggerStatement1440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ADD_in_alterTriggerStatement1478 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterTriggerStatement1480 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_POOL_in_alterTriggerStatement1482 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_alterTriggerStatement1486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_alterTriggerStatement1513 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_FROM_in_alterTriggerStatement1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_POOL_in_alterTriggerStatement1517 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_alterTriggerStatement1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ADD_in_alterTriggerStatement1549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterTriggerStatement1551 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_alterTriggerStatement1579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_FROM_in_alterTriggerStatement1581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_UNMANAGED_in_alterTriggerStatement1583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_dropTriggerStatement1632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_TRIGGER_in_dropTriggerStatement1634 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_dropTriggerStatement1638 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_dropTriggerStatement1640 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_dropTriggerStatement1644 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALLOC_FRACTION_in_poolAssign1698 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_poolAssign1700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_poolAssign1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_QUERY_PARALLELISM_in_poolAssign1725 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_poolAssign1727 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_poolAssign1731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SCHEDULING_POLICY_in_poolAssign1752 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_poolAssign1754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_poolAssign1758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PATH_in_poolAssign1779 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_poolAssign1781 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_poolAssign1785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_poolAssign_in_poolAssignList1830 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_poolAssignList1833 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000040001L});
    public static final BitSet FOLLOW_poolAssign_in_poolAssignList1835 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_KW_CREATE_in_createPoolStatement1869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_POOL_in_createPoolStatement1871 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_createPoolStatement1875 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_createPoolStatement1877 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_createPoolStatement1879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_createPoolStatement1887 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000040001L});
    public static final BitSet FOLLOW_poolAssignList_in_createPoolStatement1889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterPoolStatement1933 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_POOL_in_alterPoolStatement1935 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterPoolStatement1939 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_alterPoolStatement1941 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_alterPoolStatement1943 = new BitSet(new long[]{0x0000000020000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterPoolStatement1956 = new BitSet(new long[]{0x0000000200000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000040001L});
    public static final BitSet FOLLOW_poolAssignList_in_alterPoolStatement1958 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNSET_in_alterPoolStatement1985 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_KW_SCHEDULING_POLICY_in_alterPoolStatement1987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ADD_in_alterPoolStatement2018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_TRIGGER_in_alterPoolStatement2020 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterPoolStatement2024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_alterPoolStatement2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_TRIGGER_in_alterPoolStatement2054 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterPoolStatement2058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_dropPoolStatement2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_POOL_in_dropPoolStatement2110 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_dropPoolStatement2114 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_dropPoolStatement2116 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_dropPoolStatement2118 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_createMappingStatement2161 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KW_USER_in_createMappingStatement2166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_GROUP_in_createMappingStatement2170 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_APPLICATION_in_createMappingStatement2174 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_MAPPING_in_createMappingStatement2186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_createMappingStatement2190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_IN_in_createMappingStatement2201 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_createMappingStatement2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_createMappingStatement2209 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_createMappingStatement2213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_unmanaged_in_createMappingStatement2218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_createMappingStatement2231 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_ORDER_in_createMappingStatement2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_createMappingStatement2237 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterMappingStatement2298 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KW_USER_in_alterMappingStatement2303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_GROUP_in_alterMappingStatement2307 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_APPLICATION_in_alterMappingStatement2311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_MAPPING_in_alterMappingStatement2323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterMappingStatement2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_IN_in_alterMappingStatement2338 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterMappingStatement2342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterMappingStatement2346 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_poolPath_in_alterMappingStatement2350 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_unmanaged_in_alterMappingStatement2355 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_alterMappingStatement2368 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_KW_ORDER_in_alterMappingStatement2370 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_alterMappingStatement2374 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_dropMappingStatement2434 = new BitSet(new long[]{0x0000004000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_KW_USER_in_dropMappingStatement2439 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_GROUP_in_dropMappingStatement2443 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_APPLICATION_in_dropMappingStatement2447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_MAPPING_in_dropMappingStatement2450 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_dropMappingStatement2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_IN_in_dropMappingStatement2465 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_dropMappingStatement2469 = new BitSet(new long[]{0x0000000000000002L});

}