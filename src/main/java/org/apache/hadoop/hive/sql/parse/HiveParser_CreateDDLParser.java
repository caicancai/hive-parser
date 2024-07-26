// $ANTLR 3.4 CreateDDLParser.g 2024-07-25 22:38:45

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
public class HiveParser_CreateDDLParser extends Parser {
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


    public HiveParser_CreateDDLParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_CreateDDLParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
    public String getGrammarFileName() { return "CreateDDLParser.g"; }


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


    public static class likeTableOrFile_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "likeTableOrFile"
    // CreateDDLParser.g:46:1: likeTableOrFile : ( ( KW_LIKE KW_FILE )=> KW_LIKE KW_FILE | ( KW_LIKE KW_FILE format= identifier uri= StringLiteral ) -> ^( TOK_LIKEFILE $format $uri) | ( KW_LIKE likeName= tableName ) -> ^( TOK_LIKETABLE $likeName) );
    public final HiveParser_CreateDDLParser.likeTableOrFile_return likeTableOrFile() throws RecognitionException {
        HiveParser_CreateDDLParser.likeTableOrFile_return retval = new HiveParser_CreateDDLParser.likeTableOrFile_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token uri=null;
        Token KW_LIKE1=null;
        Token KW_FILE2=null;
        Token KW_LIKE3=null;
        Token KW_FILE4=null;
        Token KW_LIKE5=null;
        HiveParser_IdentifiersParser.identifier_return format =null;

        HiveParser_FromClauseParser.tableName_return likeName =null;


        ASTNode uri_tree=null;
        ASTNode KW_LIKE1_tree=null;
        ASTNode KW_FILE2_tree=null;
        ASTNode KW_LIKE3_tree=null;
        ASTNode KW_FILE4_tree=null;
        ASTNode KW_LIKE5_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_FILE=new RewriteRuleTokenStream(adaptor,"token KW_FILE");
        RewriteRuleTokenStream stream_KW_LIKE=new RewriteRuleTokenStream(adaptor,"token KW_LIKE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        try {
            // CreateDDLParser.g:47:5: ( ( KW_LIKE KW_FILE )=> KW_LIKE KW_FILE | ( KW_LIKE KW_FILE format= identifier uri= StringLiteral ) -> ^( TOK_LIKEFILE $format $uri) | ( KW_LIKE likeName= tableName ) -> ^( TOK_LIKETABLE $likeName) )
            int alt1=3;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==KW_LIKE) ) {
                int LA1_1 = input.LA(2);

                if ( (LA1_1==KW_FILE) ) {
                    int LA1_2 = input.LA(3);

                    if ( (LA1_2==Identifier||(LA1_2 >= KW_ABORT && LA1_2 <= KW_AFTER)||LA1_2==KW_ALLOC_FRACTION||LA1_2==KW_ANALYZE||LA1_2==KW_ARCHIVE||(LA1_2 >= KW_ASC && LA1_2 <= KW_AT)||(LA1_2 >= KW_AUTOCOMMIT && LA1_2 <= KW_BEFORE)||(LA1_2 >= KW_BRANCH && LA1_2 <= KW_BUCKETS)||(LA1_2 >= KW_CACHE && LA1_2 <= KW_CASCADE)||(LA1_2 >= KW_CBO && LA1_2 <= KW_CHANGE)||LA1_2==KW_CHECK||(LA1_2 >= KW_CLUSTER && LA1_2 <= KW_COLLECTION)||(LA1_2 >= KW_COLUMNS && LA1_2 <= KW_COMMENT)||(LA1_2 >= KW_COMPACT && LA1_2 <= KW_COMPACTIONS)||(LA1_2 >= KW_COMPUTE && LA1_2 <= KW_CONCATENATE)||LA1_2==KW_CONTINUE||LA1_2==KW_COST||LA1_2==KW_CRON||LA1_2==KW_DATA||LA1_2==KW_DATABASES||(LA1_2 >= KW_DATETIME && LA1_2 <= KW_DCPROPERTIES)||LA1_2==KW_DEBUG||(LA1_2 >= KW_DEFAULT && LA1_2 <= KW_DEFINED)||(LA1_2 >= KW_DELIMITED && LA1_2 <= KW_DESC)||(LA1_2 >= KW_DETAIL && LA1_2 <= KW_DISABLE)||(LA1_2 >= KW_DISTRIBUTE && LA1_2 <= KW_DO)||LA1_2==KW_DOW||(LA1_2 >= KW_DUMP && LA1_2 <= KW_ELEM_TYPE)||LA1_2==KW_ENABLE||(LA1_2 >= KW_ENFORCED && LA1_2 <= KW_EVERY)||(LA1_2 >= KW_EXCLUSIVE && LA1_2 <= KW_EXECUTED)||(LA1_2 >= KW_EXPIRE_SNAPSHOTS && LA1_2 <= KW_EXPRESSION)||LA1_2==KW_FAST_FORWARD||(LA1_2 >= KW_FIELDS && LA1_2 <= KW_FIRST)||(LA1_2 >= KW_FORMAT && LA1_2 <= KW_FORMATTED)||LA1_2==KW_FUNCTIONS||(LA1_2 >= KW_HOUR && LA1_2 <= KW_IDXPROPERTIES)||LA1_2==KW_IGNORE||(LA1_2 >= KW_INDEX && LA1_2 <= KW_INDEXES)||(LA1_2 >= KW_INPATH && LA1_2 <= KW_INPUTFORMAT)||(LA1_2 >= KW_ISOLATION && LA1_2 <= KW_JAR)||(LA1_2 >= KW_JOINCOST && LA1_2 <= KW_LAST)||LA1_2==KW_LEVEL||(LA1_2 >= KW_LIMIT && LA1_2 <= KW_LOAD)||(LA1_2 >= KW_LOCATION && LA1_2 <= KW_LONG)||(LA1_2 >= KW_MANAGED && LA1_2 <= KW_MANAGEMENT)||(LA1_2 >= KW_MAPJOIN && LA1_2 <= KW_MATERIALIZED)||LA1_2==KW_METADATA||(LA1_2 >= KW_MINUTE && LA1_2 <= KW_MONTH)||(LA1_2 >= KW_MOVE && LA1_2 <= KW_MSCK)||(LA1_2 >= KW_NORELY && LA1_2 <= KW_NOSCAN)||LA1_2==KW_NOVALIDATE||LA1_2==KW_NULLS||LA1_2==KW_OFFSET||(LA1_2 >= KW_OPERATOR && LA1_2 <= KW_OPTION)||(LA1_2 >= KW_OUTPUTDRIVER && LA1_2 <= KW_OUTPUTFORMAT)||(LA1_2 >= KW_OVERWRITE && LA1_2 <= KW_OWNER)||(LA1_2 >= KW_PARTITIONED && LA1_2 <= KW_PATH)||(LA1_2 >= KW_PLAN && LA1_2 <= KW_POOL)||LA1_2==KW_PRINCIPALS||LA1_2==KW_PURGE||(LA1_2 >= KW_QUARTER && LA1_2 <= KW_QUERY_PARALLELISM)||LA1_2==KW_READ||(LA1_2 >= KW_REBUILD && LA1_2 <= KW_RECORDWRITER)||(LA1_2 >= KW_RELOAD && LA1_2 <= KW_RETENTION)||LA1_2==KW_REWRITE||(LA1_2 >= KW_ROLE && LA1_2 <= KW_ROLES)||(LA1_2 >= KW_SCHEDULED && LA1_2 <= KW_SECOND)||(LA1_2 >= KW_SEMI && LA1_2 <= KW_SERVER)||(LA1_2 >= KW_SETS && LA1_2 <= KW_SKEWED)||(LA1_2 >= KW_SNAPSHOT && LA1_2 <= KW_SNAPSHOTS)||(LA1_2 >= KW_SORT && LA1_2 <= KW_SSL)||(LA1_2 >= KW_STATISTICS && LA1_2 <= KW_SUMMARY)||(LA1_2 >= KW_SYSTEM_TIME && LA1_2 <= KW_SYSTEM_VERSION)||LA1_2==KW_TABLES||(LA1_2 >= KW_TAG && LA1_2 <= KW_TERMINATED)||LA1_2==KW_TINYINT||LA1_2==KW_TOUCH||(LA1_2 >= KW_TRANSACTION && LA1_2 <= KW_TRANSACTIONS)||LA1_2==KW_TRIM||(LA1_2 >= KW_TYPE && LA1_2 <= KW_UNARCHIVE)||LA1_2==KW_UNDO||LA1_2==KW_UNIONTYPE||(LA1_2 >= KW_UNKNOWN && LA1_2 <= KW_UNSIGNED)||(LA1_2 >= KW_URI && LA1_2 <= KW_USE)||(LA1_2 >= KW_UTC && LA1_2 <= KW_VALIDATE)||LA1_2==KW_VALUE_TYPE||(LA1_2 >= KW_VECTORIZATION && LA1_2 <= KW_WEEK)||LA1_2==KW_WHILE||(LA1_2 >= KW_WITHIN && LA1_2 <= KW_ZONE)||LA1_2==KW_BATCH||LA1_2==KW_DAYOFWEEK||LA1_2==KW_HOLD_DDLTIME||LA1_2==KW_NO_DROP||LA1_2==KW_OFFLINE||LA1_2==KW_PROTECTION||LA1_2==KW_READONLY||LA1_2==KW_TIMESTAMPTZ) ) {
                        alt1=2;
                    }
                    else if ( (synpred1_CreateDDLParser()) ) {
                        alt1=1;
                    }
                    else if ( (true) ) {
                        alt1=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 1, 2, input);

                        throw nvae;

                    }
                }
                else if ( (LA1_1==Identifier||(LA1_1 >= KW_ABORT && LA1_1 <= KW_AFTER)||LA1_1==KW_ALLOC_FRACTION||LA1_1==KW_ANALYZE||LA1_1==KW_ARCHIVE||(LA1_1 >= KW_ASC && LA1_1 <= KW_AT)||(LA1_1 >= KW_AUTOCOMMIT && LA1_1 <= KW_BEFORE)||(LA1_1 >= KW_BRANCH && LA1_1 <= KW_BUCKETS)||(LA1_1 >= KW_CACHE && LA1_1 <= KW_CASCADE)||(LA1_1 >= KW_CBO && LA1_1 <= KW_CHANGE)||LA1_1==KW_CHECK||(LA1_1 >= KW_CLUSTER && LA1_1 <= KW_COLLECTION)||(LA1_1 >= KW_COLUMNS && LA1_1 <= KW_COMMENT)||(LA1_1 >= KW_COMPACT && LA1_1 <= KW_COMPACTIONS)||(LA1_1 >= KW_COMPUTE && LA1_1 <= KW_CONCATENATE)||LA1_1==KW_CONTINUE||LA1_1==KW_COST||LA1_1==KW_CRON||LA1_1==KW_DATA||LA1_1==KW_DATABASES||(LA1_1 >= KW_DATETIME && LA1_1 <= KW_DCPROPERTIES)||LA1_1==KW_DEBUG||(LA1_1 >= KW_DEFAULT && LA1_1 <= KW_DEFINED)||(LA1_1 >= KW_DELIMITED && LA1_1 <= KW_DESC)||(LA1_1 >= KW_DETAIL && LA1_1 <= KW_DISABLE)||(LA1_1 >= KW_DISTRIBUTE && LA1_1 <= KW_DO)||LA1_1==KW_DOW||(LA1_1 >= KW_DUMP && LA1_1 <= KW_ELEM_TYPE)||LA1_1==KW_ENABLE||(LA1_1 >= KW_ENFORCED && LA1_1 <= KW_EVERY)||(LA1_1 >= KW_EXCLUSIVE && LA1_1 <= KW_EXECUTED)||(LA1_1 >= KW_EXPIRE_SNAPSHOTS && LA1_1 <= KW_EXPRESSION)||LA1_1==KW_FAST_FORWARD||LA1_1==KW_FIELDS||(LA1_1 >= KW_FILEFORMAT && LA1_1 <= KW_FIRST)||(LA1_1 >= KW_FORMAT && LA1_1 <= KW_FORMATTED)||LA1_1==KW_FUNCTIONS||(LA1_1 >= KW_HOUR && LA1_1 <= KW_IDXPROPERTIES)||LA1_1==KW_IGNORE||(LA1_1 >= KW_INDEX && LA1_1 <= KW_INDEXES)||(LA1_1 >= KW_INPATH && LA1_1 <= KW_INPUTFORMAT)||(LA1_1 >= KW_ISOLATION && LA1_1 <= KW_JAR)||(LA1_1 >= KW_JOINCOST && LA1_1 <= KW_LAST)||LA1_1==KW_LEVEL||(LA1_1 >= KW_LIMIT && LA1_1 <= KW_LOAD)||(LA1_1 >= KW_LOCATION && LA1_1 <= KW_LONG)||(LA1_1 >= KW_MANAGED && LA1_1 <= KW_MANAGEMENT)||(LA1_1 >= KW_MAPJOIN && LA1_1 <= KW_MATERIALIZED)||LA1_1==KW_METADATA||(LA1_1 >= KW_MINUTE && LA1_1 <= KW_MONTH)||(LA1_1 >= KW_MOVE && LA1_1 <= KW_MSCK)||(LA1_1 >= KW_NORELY && LA1_1 <= KW_NOSCAN)||LA1_1==KW_NOVALIDATE||LA1_1==KW_NULLS||LA1_1==KW_OFFSET||(LA1_1 >= KW_OPERATOR && LA1_1 <= KW_OPTION)||(LA1_1 >= KW_OUTPUTDRIVER && LA1_1 <= KW_OUTPUTFORMAT)||(LA1_1 >= KW_OVERWRITE && LA1_1 <= KW_OWNER)||(LA1_1 >= KW_PARTITIONED && LA1_1 <= KW_PATH)||(LA1_1 >= KW_PLAN && LA1_1 <= KW_POOL)||LA1_1==KW_PRINCIPALS||LA1_1==KW_PURGE||(LA1_1 >= KW_QUARTER && LA1_1 <= KW_QUERY_PARALLELISM)||LA1_1==KW_READ||(LA1_1 >= KW_REBUILD && LA1_1 <= KW_RECORDWRITER)||(LA1_1 >= KW_RELOAD && LA1_1 <= KW_RETENTION)||LA1_1==KW_REWRITE||(LA1_1 >= KW_ROLE && LA1_1 <= KW_ROLES)||(LA1_1 >= KW_SCHEDULED && LA1_1 <= KW_SECOND)||(LA1_1 >= KW_SEMI && LA1_1 <= KW_SERVER)||(LA1_1 >= KW_SETS && LA1_1 <= KW_SKEWED)||(LA1_1 >= KW_SNAPSHOT && LA1_1 <= KW_SNAPSHOTS)||(LA1_1 >= KW_SORT && LA1_1 <= KW_SSL)||(LA1_1 >= KW_STATISTICS && LA1_1 <= KW_SUMMARY)||(LA1_1 >= KW_SYSTEM_TIME && LA1_1 <= KW_SYSTEM_VERSION)||LA1_1==KW_TABLES||(LA1_1 >= KW_TAG && LA1_1 <= KW_TERMINATED)||LA1_1==KW_TINYINT||LA1_1==KW_TOUCH||(LA1_1 >= KW_TRANSACTION && LA1_1 <= KW_TRANSACTIONS)||LA1_1==KW_TRIM||(LA1_1 >= KW_TYPE && LA1_1 <= KW_UNARCHIVE)||LA1_1==KW_UNDO||LA1_1==KW_UNIONTYPE||(LA1_1 >= KW_UNKNOWN && LA1_1 <= KW_UNSIGNED)||(LA1_1 >= KW_URI && LA1_1 <= KW_USE)||(LA1_1 >= KW_UTC && LA1_1 <= KW_VALIDATE)||LA1_1==KW_VALUE_TYPE||(LA1_1 >= KW_VECTORIZATION && LA1_1 <= KW_WEEK)||LA1_1==KW_WHILE||(LA1_1 >= KW_WITHIN && LA1_1 <= KW_ZONE)||LA1_1==KW_BATCH||LA1_1==KW_DAYOFWEEK||LA1_1==KW_HOLD_DDLTIME||LA1_1==KW_NO_DROP||LA1_1==KW_OFFLINE||LA1_1==KW_PROTECTION||LA1_1==KW_READONLY||LA1_1==KW_TIMESTAMPTZ) ) {
                    alt1=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 1, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // CreateDDLParser.g:47:7: ( KW_LIKE KW_FILE )=> KW_LIKE KW_FILE
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    KW_LIKE1=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_likeTableOrFile63); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_LIKE1_tree = 
                    (ASTNode)adaptor.create(KW_LIKE1)
                    ;
                    adaptor.addChild(root_0, KW_LIKE1_tree);
                    }

                    KW_FILE2=(Token)match(input,KW_FILE,FOLLOW_KW_FILE_in_likeTableOrFile65); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_FILE2_tree = 
                    (ASTNode)adaptor.create(KW_FILE2)
                    ;
                    adaptor.addChild(root_0, KW_FILE2_tree);
                    }

                    }
                    break;
                case 2 :
                    // CreateDDLParser.g:48:7: ( KW_LIKE KW_FILE format= identifier uri= StringLiteral )
                    {
                    // CreateDDLParser.g:48:7: ( KW_LIKE KW_FILE format= identifier uri= StringLiteral )
                    // CreateDDLParser.g:48:8: KW_LIKE KW_FILE format= identifier uri= StringLiteral
                    {
                    KW_LIKE3=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_likeTableOrFile74); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LIKE.add(KW_LIKE3);


                    KW_FILE4=(Token)match(input,KW_FILE,FOLLOW_KW_FILE_in_likeTableOrFile76); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FILE.add(KW_FILE4);


                    pushFollow(FOLLOW_identifier_in_likeTableOrFile80);
                    format=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(format.getTree());

                    uri=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_likeTableOrFile84); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(uri);


                    }


                    // AST REWRITE
                    // elements: uri, format
                    // token labels: uri
                    // rule labels: format, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_uri=new RewriteRuleTokenStream(adaptor,"token uri",uri);
                    RewriteRuleSubtreeStream stream_format=new RewriteRuleSubtreeStream(adaptor,"rule format",format!=null?format.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 48:61: -> ^( TOK_LIKEFILE $format $uri)
                    {
                        // CreateDDLParser.g:48:64: ^( TOK_LIKEFILE $format $uri)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LIKEFILE, "TOK_LIKEFILE")
                        , root_1);

                        adaptor.addChild(root_1, stream_format.nextTree());

                        adaptor.addChild(root_1, stream_uri.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // CreateDDLParser.g:49:7: ( KW_LIKE likeName= tableName )
                    {
                    // CreateDDLParser.g:49:7: ( KW_LIKE likeName= tableName )
                    // CreateDDLParser.g:49:8: KW_LIKE likeName= tableName
                    {
                    KW_LIKE5=(Token)match(input,KW_LIKE,FOLLOW_KW_LIKE_in_likeTableOrFile106); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LIKE.add(KW_LIKE5);


                    pushFollow(FOLLOW_tableName_in_likeTableOrFile110);
                    likeName=gHiveParser.tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(likeName.getTree());

                    }


                    // AST REWRITE
                    // elements: likeName
                    // token labels: 
                    // rule labels: likeName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_likeName=new RewriteRuleSubtreeStream(adaptor,"rule likeName",likeName!=null?likeName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 49:36: -> ^( TOK_LIKETABLE $likeName)
                    {
                        // CreateDDLParser.g:49:39: ^( TOK_LIKETABLE $likeName)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LIKETABLE, "TOK_LIKETABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_likeName.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "likeTableOrFile"


    public static class createTableStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createTableStatement"
    // CreateDDLParser.g:53:1: createTableStatement : ( KW_CREATE (temp= KW_TEMPORARY )? (trans= KW_TRANSACTIONAL )? (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) | KW_CREATE mgd= KW_MANAGED KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) );
    public final HiveParser_CreateDDLParser.createTableStatement_return createTableStatement() throws RecognitionException {
        HiveParser_CreateDDLParser.createTableStatement_return retval = new HiveParser_CreateDDLParser.createTableStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token temp=null;
        Token trans=null;
        Token ext=null;
        Token mgd=null;
        Token KW_CREATE6=null;
        Token KW_TABLE7=null;
        Token LPAREN15=null;
        Token RPAREN17=null;
        Token KW_AS26=null;
        Token KW_CREATE28=null;
        Token KW_TABLE29=null;
        Token LPAREN36=null;
        Token RPAREN38=null;
        Token KW_AS47=null;
        HiveParser_FromClauseParser.tableName_return name =null;

        HiveParser.ifNotExists_return ifNotExists8 =null;

        HiveParser_CreateDDLParser.likeTableOrFile_return likeTableOrFile9 =null;

        HiveParser.createTablePartitionSpec_return createTablePartitionSpec10 =null;

        HiveParser.tableRowFormat_return tableRowFormat11 =null;

        HiveParser.tableFileFormat_return tableFileFormat12 =null;

        HiveParser.tableLocation_return tableLocation13 =null;

        HiveParser.tablePropertiesPrefixed_return tablePropertiesPrefixed14 =null;

        HiveParser.columnNameTypeOrConstraintList_return columnNameTypeOrConstraintList16 =null;

        HiveParser.tableComment_return tableComment18 =null;

        HiveParser.createTablePartitionSpec_return createTablePartitionSpec19 =null;

        HiveParser.tableBuckets_return tableBuckets20 =null;

        HiveParser.tableSkewed_return tableSkewed21 =null;

        HiveParser.tableRowFormat_return tableRowFormat22 =null;

        HiveParser.tableFileFormat_return tableFileFormat23 =null;

        HiveParser.tableLocation_return tableLocation24 =null;

        HiveParser.tablePropertiesPrefixed_return tablePropertiesPrefixed25 =null;

        HiveParser.selectStatementWithCTE_return selectStatementWithCTE27 =null;

        HiveParser.ifNotExists_return ifNotExists30 =null;

        HiveParser_CreateDDLParser.likeTableOrFile_return likeTableOrFile31 =null;

        HiveParser.tableRowFormat_return tableRowFormat32 =null;

        HiveParser.tableFileFormat_return tableFileFormat33 =null;

        HiveParser.tableLocation_return tableLocation34 =null;

        HiveParser.tablePropertiesPrefixed_return tablePropertiesPrefixed35 =null;

        HiveParser.columnNameTypeOrConstraintList_return columnNameTypeOrConstraintList37 =null;

        HiveParser.tableComment_return tableComment39 =null;

        HiveParser.createTablePartitionSpec_return createTablePartitionSpec40 =null;

        HiveParser.tableBuckets_return tableBuckets41 =null;

        HiveParser.tableSkewed_return tableSkewed42 =null;

        HiveParser.tableRowFormat_return tableRowFormat43 =null;

        HiveParser.tableFileFormat_return tableFileFormat44 =null;

        HiveParser.tableLocation_return tableLocation45 =null;

        HiveParser.tablePropertiesPrefixed_return tablePropertiesPrefixed46 =null;

        HiveParser.selectStatementWithCTE_return selectStatementWithCTE48 =null;


        ASTNode temp_tree=null;
        ASTNode trans_tree=null;
        ASTNode ext_tree=null;
        ASTNode mgd_tree=null;
        ASTNode KW_CREATE6_tree=null;
        ASTNode KW_TABLE7_tree=null;
        ASTNode LPAREN15_tree=null;
        ASTNode RPAREN17_tree=null;
        ASTNode KW_AS26_tree=null;
        ASTNode KW_CREATE28_tree=null;
        ASTNode KW_TABLE29_tree=null;
        ASTNode LPAREN36_tree=null;
        ASTNode RPAREN38_tree=null;
        ASTNode KW_AS47_tree=null;
        RewriteRuleTokenStream stream_KW_TEMPORARY=new RewriteRuleTokenStream(adaptor,"token KW_TEMPORARY");
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_EXTERNAL=new RewriteRuleTokenStream(adaptor,"token KW_EXTERNAL");
        RewriteRuleTokenStream stream_KW_TRANSACTIONAL=new RewriteRuleTokenStream(adaptor,"token KW_TRANSACTIONAL");
        RewriteRuleTokenStream stream_KW_MANAGED=new RewriteRuleTokenStream(adaptor,"token KW_MANAGED");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_tableLocation=new RewriteRuleSubtreeStream(adaptor,"rule tableLocation");
        RewriteRuleSubtreeStream stream_columnNameTypeOrConstraintList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeOrConstraintList");
        RewriteRuleSubtreeStream stream_tableSkewed=new RewriteRuleSubtreeStream(adaptor,"rule tableSkewed");
        RewriteRuleSubtreeStream stream_tablePropertiesPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule tablePropertiesPrefixed");
        RewriteRuleSubtreeStream stream_likeTableOrFile=new RewriteRuleSubtreeStream(adaptor,"rule likeTableOrFile");
        RewriteRuleSubtreeStream stream_tableFileFormat=new RewriteRuleSubtreeStream(adaptor,"rule tableFileFormat");
        RewriteRuleSubtreeStream stream_tableComment=new RewriteRuleSubtreeStream(adaptor,"rule tableComment");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        RewriteRuleSubtreeStream stream_tableRowFormat=new RewriteRuleSubtreeStream(adaptor,"rule tableRowFormat");
        RewriteRuleSubtreeStream stream_selectStatementWithCTE=new RewriteRuleSubtreeStream(adaptor,"rule selectStatementWithCTE");
        RewriteRuleSubtreeStream stream_createTablePartitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule createTablePartitionSpec");
        RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
        RewriteRuleSubtreeStream stream_tableBuckets=new RewriteRuleSubtreeStream(adaptor,"rule tableBuckets");
         gParent.pushMsg("create table statement", state); 
        try {
            // CreateDDLParser.g:56:5: ( KW_CREATE (temp= KW_TEMPORARY )? (trans= KW_TRANSACTIONAL )? (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) | KW_CREATE mgd= KW_MANAGED KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? ) -> ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? ) )
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KW_CREATE) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==KW_MANAGED) ) {
                    alt38=2;
                }
                else if ( (LA38_1==KW_EXTERNAL||LA38_1==KW_TABLE||LA38_1==KW_TEMPORARY||LA38_1==KW_TRANSACTIONAL) ) {
                    alt38=1;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // CreateDDLParser.g:56:7: KW_CREATE (temp= KW_TEMPORARY )? (trans= KW_TRANSACTIONAL )? (ext= KW_EXTERNAL )? KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
                    {
                    KW_CREATE6=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createTableStatement148); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE6);


                    // CreateDDLParser.g:56:17: (temp= KW_TEMPORARY )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==KW_TEMPORARY) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // CreateDDLParser.g:56:18: temp= KW_TEMPORARY
                            {
                            temp=(Token)match(input,KW_TEMPORARY,FOLLOW_KW_TEMPORARY_in_createTableStatement153); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_TEMPORARY.add(temp);


                            }
                            break;

                    }


                    // CreateDDLParser.g:56:38: (trans= KW_TRANSACTIONAL )?
                    int alt3=2;
                    int LA3_0 = input.LA(1);

                    if ( (LA3_0==KW_TRANSACTIONAL) ) {
                        alt3=1;
                    }
                    switch (alt3) {
                        case 1 :
                            // CreateDDLParser.g:56:39: trans= KW_TRANSACTIONAL
                            {
                            trans=(Token)match(input,KW_TRANSACTIONAL,FOLLOW_KW_TRANSACTIONAL_in_createTableStatement160); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_TRANSACTIONAL.add(trans);


                            }
                            break;

                    }


                    // CreateDDLParser.g:56:64: (ext= KW_EXTERNAL )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==KW_EXTERNAL) ) {
                        alt4=1;
                    }
                    switch (alt4) {
                        case 1 :
                            // CreateDDLParser.g:56:65: ext= KW_EXTERNAL
                            {
                            ext=(Token)match(input,KW_EXTERNAL,FOLLOW_KW_EXTERNAL_in_createTableStatement167); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_EXTERNAL.add(ext);


                            }
                            break;

                    }


                    KW_TABLE7=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_createTableStatement171); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE7);


                    // CreateDDLParser.g:56:92: ( ifNotExists )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==KW_IF) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // CreateDDLParser.g:56:92: ifNotExists
                            {
                            pushFollow(FOLLOW_ifNotExists_in_createTableStatement173);
                            ifNotExists8=gHiveParser.ifNotExists();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists8.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_tableName_in_createTableStatement178);
                    name=gHiveParser.tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(name.getTree());

                    // CreateDDLParser.g:57:7: ( likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
                    int alt21=2;
                    int LA21_0 = input.LA(1);

                    if ( (LA21_0==KW_LIKE) ) {
                        alt21=1;
                    }
                    else if ( (LA21_0==EOF||LA21_0==KW_AS||LA21_0==KW_CLUSTERED||LA21_0==KW_COMMENT||LA21_0==KW_LOCATION||LA21_0==KW_PARTITIONED||LA21_0==KW_ROW||LA21_0==KW_SKEWED||LA21_0==KW_STORED||LA21_0==KW_TBLPROPERTIES||LA21_0==LPAREN) ) {
                        alt21=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }
                    switch (alt21) {
                        case 1 :
                            // CreateDDLParser.g:57:10: likeTableOrFile ( createTablePartitionSpec )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )?
                            {
                            pushFollow(FOLLOW_likeTableOrFile_in_createTableStatement189);
                            likeTableOrFile9=likeTableOrFile();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_likeTableOrFile.add(likeTableOrFile9.getTree());

                            // CreateDDLParser.g:58:10: ( createTablePartitionSpec )?
                            int alt6=2;
                            int LA6_0 = input.LA(1);

                            if ( (LA6_0==KW_PARTITIONED) ) {
                                alt6=1;
                            }
                            switch (alt6) {
                                case 1 :
                                    // CreateDDLParser.g:58:10: createTablePartitionSpec
                                    {
                                    pushFollow(FOLLOW_createTablePartitionSpec_in_createTableStatement200);
                                    createTablePartitionSpec10=gHiveParser.createTablePartitionSpec();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_createTablePartitionSpec.add(createTablePartitionSpec10.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:59:10: ( tableRowFormat )?
                            int alt7=2;
                            int LA7_0 = input.LA(1);

                            if ( (LA7_0==KW_ROW) ) {
                                alt7=1;
                            }
                            switch (alt7) {
                                case 1 :
                                    // CreateDDLParser.g:59:10: tableRowFormat
                                    {
                                    pushFollow(FOLLOW_tableRowFormat_in_createTableStatement212);
                                    tableRowFormat11=gHiveParser.tableRowFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat11.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:60:10: ( tableFileFormat )?
                            int alt8=2;
                            int LA8_0 = input.LA(1);

                            if ( (LA8_0==KW_STORED) ) {
                                alt8=1;
                            }
                            switch (alt8) {
                                case 1 :
                                    // CreateDDLParser.g:60:10: tableFileFormat
                                    {
                                    pushFollow(FOLLOW_tableFileFormat_in_createTableStatement224);
                                    tableFileFormat12=gHiveParser.tableFileFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat12.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:61:10: ( tableLocation )?
                            int alt9=2;
                            int LA9_0 = input.LA(1);

                            if ( (LA9_0==KW_LOCATION) ) {
                                alt9=1;
                            }
                            switch (alt9) {
                                case 1 :
                                    // CreateDDLParser.g:61:10: tableLocation
                                    {
                                    pushFollow(FOLLOW_tableLocation_in_createTableStatement236);
                                    tableLocation13=gHiveParser.tableLocation();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation13.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:62:10: ( tablePropertiesPrefixed )?
                            int alt10=2;
                            int LA10_0 = input.LA(1);

                            if ( (LA10_0==KW_TBLPROPERTIES) ) {
                                alt10=1;
                            }
                            switch (alt10) {
                                case 1 :
                                    // CreateDDLParser.g:62:10: tablePropertiesPrefixed
                                    {
                                    pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement248);
                                    tablePropertiesPrefixed14=gHiveParser.tablePropertiesPrefixed();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed14.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // CreateDDLParser.g:63:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )?
                            {
                            // CreateDDLParser.g:63:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )?
                            int alt11=2;
                            int LA11_0 = input.LA(1);

                            if ( (LA11_0==LPAREN) ) {
                                alt11=1;
                            }
                            switch (alt11) {
                                case 1 :
                                    // CreateDDLParser.g:63:11: LPAREN columnNameTypeOrConstraintList RPAREN
                                    {
                                    LPAREN15=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement261); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN15);


                                    pushFollow(FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement263);
                                    columnNameTypeOrConstraintList16=gHiveParser.columnNameTypeOrConstraintList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_columnNameTypeOrConstraintList.add(columnNameTypeOrConstraintList16.getTree());

                                    RPAREN17=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement265); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN17);


                                    }
                                    break;

                            }


                            // CreateDDLParser.g:64:10: ( tableComment )?
                            int alt12=2;
                            int LA12_0 = input.LA(1);

                            if ( (LA12_0==KW_COMMENT) ) {
                                alt12=1;
                            }
                            switch (alt12) {
                                case 1 :
                                    // CreateDDLParser.g:64:10: tableComment
                                    {
                                    pushFollow(FOLLOW_tableComment_in_createTableStatement278);
                                    tableComment18=gHiveParser.tableComment();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableComment.add(tableComment18.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:65:10: ( createTablePartitionSpec )?
                            int alt13=2;
                            int LA13_0 = input.LA(1);

                            if ( (LA13_0==KW_PARTITIONED) ) {
                                alt13=1;
                            }
                            switch (alt13) {
                                case 1 :
                                    // CreateDDLParser.g:65:10: createTablePartitionSpec
                                    {
                                    pushFollow(FOLLOW_createTablePartitionSpec_in_createTableStatement290);
                                    createTablePartitionSpec19=gHiveParser.createTablePartitionSpec();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_createTablePartitionSpec.add(createTablePartitionSpec19.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:66:10: ( tableBuckets )?
                            int alt14=2;
                            int LA14_0 = input.LA(1);

                            if ( (LA14_0==KW_CLUSTERED) ) {
                                alt14=1;
                            }
                            switch (alt14) {
                                case 1 :
                                    // CreateDDLParser.g:66:10: tableBuckets
                                    {
                                    pushFollow(FOLLOW_tableBuckets_in_createTableStatement302);
                                    tableBuckets20=gHiveParser.tableBuckets();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableBuckets.add(tableBuckets20.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:67:10: ( tableSkewed )?
                            int alt15=2;
                            int LA15_0 = input.LA(1);

                            if ( (LA15_0==KW_SKEWED) ) {
                                alt15=1;
                            }
                            switch (alt15) {
                                case 1 :
                                    // CreateDDLParser.g:67:10: tableSkewed
                                    {
                                    pushFollow(FOLLOW_tableSkewed_in_createTableStatement314);
                                    tableSkewed21=gHiveParser.tableSkewed();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableSkewed.add(tableSkewed21.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:68:10: ( tableRowFormat )?
                            int alt16=2;
                            int LA16_0 = input.LA(1);

                            if ( (LA16_0==KW_ROW) ) {
                                alt16=1;
                            }
                            switch (alt16) {
                                case 1 :
                                    // CreateDDLParser.g:68:10: tableRowFormat
                                    {
                                    pushFollow(FOLLOW_tableRowFormat_in_createTableStatement326);
                                    tableRowFormat22=gHiveParser.tableRowFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat22.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:69:10: ( tableFileFormat )?
                            int alt17=2;
                            int LA17_0 = input.LA(1);

                            if ( (LA17_0==KW_STORED) ) {
                                alt17=1;
                            }
                            switch (alt17) {
                                case 1 :
                                    // CreateDDLParser.g:69:10: tableFileFormat
                                    {
                                    pushFollow(FOLLOW_tableFileFormat_in_createTableStatement338);
                                    tableFileFormat23=gHiveParser.tableFileFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat23.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:70:10: ( tableLocation )?
                            int alt18=2;
                            int LA18_0 = input.LA(1);

                            if ( (LA18_0==KW_LOCATION) ) {
                                alt18=1;
                            }
                            switch (alt18) {
                                case 1 :
                                    // CreateDDLParser.g:70:10: tableLocation
                                    {
                                    pushFollow(FOLLOW_tableLocation_in_createTableStatement350);
                                    tableLocation24=gHiveParser.tableLocation();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation24.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:71:10: ( tablePropertiesPrefixed )?
                            int alt19=2;
                            int LA19_0 = input.LA(1);

                            if ( (LA19_0==KW_TBLPROPERTIES) ) {
                                alt19=1;
                            }
                            switch (alt19) {
                                case 1 :
                                    // CreateDDLParser.g:71:10: tablePropertiesPrefixed
                                    {
                                    pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement362);
                                    tablePropertiesPrefixed25=gHiveParser.tablePropertiesPrefixed();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed25.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:72:10: ( KW_AS selectStatementWithCTE )?
                            int alt20=2;
                            int LA20_0 = input.LA(1);

                            if ( (LA20_0==KW_AS) ) {
                                alt20=1;
                            }
                            switch (alt20) {
                                case 1 :
                                    // CreateDDLParser.g:72:11: KW_AS selectStatementWithCTE
                                    {
                                    KW_AS26=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_createTableStatement375); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS26);


                                    pushFollow(FOLLOW_selectStatementWithCTE_in_createTableStatement377);
                                    selectStatementWithCTE27=gHiveParser.selectStatementWithCTE();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_selectStatementWithCTE.add(selectStatementWithCTE27.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: temp, tableComment, tableSkewed, tablePropertiesPrefixed, likeTableOrFile, createTablePartitionSpec, tableLocation, tableBuckets, tableRowFormat, columnNameTypeOrConstraintList, ifNotExists, tableFileFormat, name, trans, ext, selectStatementWithCTE
                    // token labels: ext, temp, trans
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_ext=new RewriteRuleTokenStream(adaptor,"token ext",ext);
                    RewriteRuleTokenStream stream_temp=new RewriteRuleTokenStream(adaptor,"token temp",temp);
                    RewriteRuleTokenStream stream_trans=new RewriteRuleTokenStream(adaptor,"token trans",trans);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 74:5: -> ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
                    {
                        // CreateDDLParser.g:74:8: ^( TOK_CREATETABLE $name ( $temp)? ( $trans)? ( $ext)? ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_CREATETABLE, "TOK_CREATETABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        // CreateDDLParser.g:74:33: ( $temp)?
                        if ( stream_temp.hasNext() ) {
                            adaptor.addChild(root_1, stream_temp.nextNode());

                        }
                        stream_temp.reset();

                        // CreateDDLParser.g:74:40: ( $trans)?
                        if ( stream_trans.hasNext() ) {
                            adaptor.addChild(root_1, stream_trans.nextNode());

                        }
                        stream_trans.reset();

                        // CreateDDLParser.g:74:48: ( $ext)?
                        if ( stream_ext.hasNext() ) {
                            adaptor.addChild(root_1, stream_ext.nextNode());

                        }
                        stream_ext.reset();

                        // CreateDDLParser.g:74:53: ( ifNotExists )?
                        if ( stream_ifNotExists.hasNext() ) {
                            adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                        }
                        stream_ifNotExists.reset();

                        // CreateDDLParser.g:75:10: ( likeTableOrFile )?
                        if ( stream_likeTableOrFile.hasNext() ) {
                            adaptor.addChild(root_1, stream_likeTableOrFile.nextTree());

                        }
                        stream_likeTableOrFile.reset();

                        // CreateDDLParser.g:76:10: ( columnNameTypeOrConstraintList )?
                        if ( stream_columnNameTypeOrConstraintList.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnNameTypeOrConstraintList.nextTree());

                        }
                        stream_columnNameTypeOrConstraintList.reset();

                        // CreateDDLParser.g:77:10: ( tableComment )?
                        if ( stream_tableComment.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableComment.nextTree());

                        }
                        stream_tableComment.reset();

                        // CreateDDLParser.g:78:10: ( createTablePartitionSpec )?
                        if ( stream_createTablePartitionSpec.hasNext() ) {
                            adaptor.addChild(root_1, stream_createTablePartitionSpec.nextTree());

                        }
                        stream_createTablePartitionSpec.reset();

                        // CreateDDLParser.g:79:10: ( tableBuckets )?
                        if ( stream_tableBuckets.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableBuckets.nextTree());

                        }
                        stream_tableBuckets.reset();

                        // CreateDDLParser.g:80:10: ( tableSkewed )?
                        if ( stream_tableSkewed.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableSkewed.nextTree());

                        }
                        stream_tableSkewed.reset();

                        // CreateDDLParser.g:81:10: ( tableRowFormat )?
                        if ( stream_tableRowFormat.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableRowFormat.nextTree());

                        }
                        stream_tableRowFormat.reset();

                        // CreateDDLParser.g:82:10: ( tableFileFormat )?
                        if ( stream_tableFileFormat.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableFileFormat.nextTree());

                        }
                        stream_tableFileFormat.reset();

                        // CreateDDLParser.g:83:10: ( tableLocation )?
                        if ( stream_tableLocation.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableLocation.nextTree());

                        }
                        stream_tableLocation.reset();

                        // CreateDDLParser.g:84:10: ( tablePropertiesPrefixed )?
                        if ( stream_tablePropertiesPrefixed.hasNext() ) {
                            adaptor.addChild(root_1, stream_tablePropertiesPrefixed.nextTree());

                        }
                        stream_tablePropertiesPrefixed.reset();

                        // CreateDDLParser.g:85:10: ( selectStatementWithCTE )?
                        if ( stream_selectStatementWithCTE.hasNext() ) {
                            adaptor.addChild(root_1, stream_selectStatementWithCTE.nextTree());

                        }
                        stream_selectStatementWithCTE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // CreateDDLParser.g:87:7: KW_CREATE mgd= KW_MANAGED KW_TABLE ( ifNotExists )? name= tableName ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
                    {
                    KW_CREATE28=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createTableStatement564); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE28);


                    mgd=(Token)match(input,KW_MANAGED,FOLLOW_KW_MANAGED_in_createTableStatement568); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_MANAGED.add(mgd);


                    KW_TABLE29=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_createTableStatement570); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE29);


                    // CreateDDLParser.g:87:41: ( ifNotExists )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==KW_IF) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // CreateDDLParser.g:87:41: ifNotExists
                            {
                            pushFollow(FOLLOW_ifNotExists_in_createTableStatement572);
                            ifNotExists30=gHiveParser.ifNotExists();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists30.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_tableName_in_createTableStatement577);
                    name=gHiveParser.tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(name.getTree());

                    // CreateDDLParser.g:88:7: ( likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? | ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )? )
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==KW_LIKE) ) {
                        alt37=1;
                    }
                    else if ( (LA37_0==EOF||LA37_0==KW_AS||LA37_0==KW_CLUSTERED||LA37_0==KW_COMMENT||LA37_0==KW_LOCATION||LA37_0==KW_PARTITIONED||LA37_0==KW_ROW||LA37_0==KW_SKEWED||LA37_0==KW_STORED||LA37_0==KW_TBLPROPERTIES||LA37_0==LPAREN) ) {
                        alt37=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 37, 0, input);

                        throw nvae;

                    }
                    switch (alt37) {
                        case 1 :
                            // CreateDDLParser.g:88:10: likeTableOrFile ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )?
                            {
                            pushFollow(FOLLOW_likeTableOrFile_in_createTableStatement588);
                            likeTableOrFile31=likeTableOrFile();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_likeTableOrFile.add(likeTableOrFile31.getTree());

                            // CreateDDLParser.g:89:10: ( tableRowFormat )?
                            int alt23=2;
                            int LA23_0 = input.LA(1);

                            if ( (LA23_0==KW_ROW) ) {
                                alt23=1;
                            }
                            switch (alt23) {
                                case 1 :
                                    // CreateDDLParser.g:89:10: tableRowFormat
                                    {
                                    pushFollow(FOLLOW_tableRowFormat_in_createTableStatement599);
                                    tableRowFormat32=gHiveParser.tableRowFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat32.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:90:10: ( tableFileFormat )?
                            int alt24=2;
                            int LA24_0 = input.LA(1);

                            if ( (LA24_0==KW_STORED) ) {
                                alt24=1;
                            }
                            switch (alt24) {
                                case 1 :
                                    // CreateDDLParser.g:90:10: tableFileFormat
                                    {
                                    pushFollow(FOLLOW_tableFileFormat_in_createTableStatement611);
                                    tableFileFormat33=gHiveParser.tableFileFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat33.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:91:10: ( tableLocation )?
                            int alt25=2;
                            int LA25_0 = input.LA(1);

                            if ( (LA25_0==KW_LOCATION) ) {
                                alt25=1;
                            }
                            switch (alt25) {
                                case 1 :
                                    // CreateDDLParser.g:91:10: tableLocation
                                    {
                                    pushFollow(FOLLOW_tableLocation_in_createTableStatement623);
                                    tableLocation34=gHiveParser.tableLocation();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation34.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:92:10: ( tablePropertiesPrefixed )?
                            int alt26=2;
                            int LA26_0 = input.LA(1);

                            if ( (LA26_0==KW_TBLPROPERTIES) ) {
                                alt26=1;
                            }
                            switch (alt26) {
                                case 1 :
                                    // CreateDDLParser.g:92:10: tablePropertiesPrefixed
                                    {
                                    pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement635);
                                    tablePropertiesPrefixed35=gHiveParser.tablePropertiesPrefixed();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed35.getTree());

                                    }
                                    break;

                            }


                            }
                            break;
                        case 2 :
                            // CreateDDLParser.g:93:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( KW_AS selectStatementWithCTE )?
                            {
                            // CreateDDLParser.g:93:10: ( LPAREN columnNameTypeOrConstraintList RPAREN )?
                            int alt27=2;
                            int LA27_0 = input.LA(1);

                            if ( (LA27_0==LPAREN) ) {
                                alt27=1;
                            }
                            switch (alt27) {
                                case 1 :
                                    // CreateDDLParser.g:93:11: LPAREN columnNameTypeOrConstraintList RPAREN
                                    {
                                    LPAREN36=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_createTableStatement648); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN36);


                                    pushFollow(FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement650);
                                    columnNameTypeOrConstraintList37=gHiveParser.columnNameTypeOrConstraintList();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_columnNameTypeOrConstraintList.add(columnNameTypeOrConstraintList37.getTree());

                                    RPAREN38=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_createTableStatement652); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN38);


                                    }
                                    break;

                            }


                            // CreateDDLParser.g:94:10: ( tableComment )?
                            int alt28=2;
                            int LA28_0 = input.LA(1);

                            if ( (LA28_0==KW_COMMENT) ) {
                                alt28=1;
                            }
                            switch (alt28) {
                                case 1 :
                                    // CreateDDLParser.g:94:10: tableComment
                                    {
                                    pushFollow(FOLLOW_tableComment_in_createTableStatement665);
                                    tableComment39=gHiveParser.tableComment();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableComment.add(tableComment39.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:95:10: ( createTablePartitionSpec )?
                            int alt29=2;
                            int LA29_0 = input.LA(1);

                            if ( (LA29_0==KW_PARTITIONED) ) {
                                alt29=1;
                            }
                            switch (alt29) {
                                case 1 :
                                    // CreateDDLParser.g:95:10: createTablePartitionSpec
                                    {
                                    pushFollow(FOLLOW_createTablePartitionSpec_in_createTableStatement677);
                                    createTablePartitionSpec40=gHiveParser.createTablePartitionSpec();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_createTablePartitionSpec.add(createTablePartitionSpec40.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:96:10: ( tableBuckets )?
                            int alt30=2;
                            int LA30_0 = input.LA(1);

                            if ( (LA30_0==KW_CLUSTERED) ) {
                                alt30=1;
                            }
                            switch (alt30) {
                                case 1 :
                                    // CreateDDLParser.g:96:10: tableBuckets
                                    {
                                    pushFollow(FOLLOW_tableBuckets_in_createTableStatement689);
                                    tableBuckets41=gHiveParser.tableBuckets();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableBuckets.add(tableBuckets41.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:97:10: ( tableSkewed )?
                            int alt31=2;
                            int LA31_0 = input.LA(1);

                            if ( (LA31_0==KW_SKEWED) ) {
                                alt31=1;
                            }
                            switch (alt31) {
                                case 1 :
                                    // CreateDDLParser.g:97:10: tableSkewed
                                    {
                                    pushFollow(FOLLOW_tableSkewed_in_createTableStatement701);
                                    tableSkewed42=gHiveParser.tableSkewed();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableSkewed.add(tableSkewed42.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:98:10: ( tableRowFormat )?
                            int alt32=2;
                            int LA32_0 = input.LA(1);

                            if ( (LA32_0==KW_ROW) ) {
                                alt32=1;
                            }
                            switch (alt32) {
                                case 1 :
                                    // CreateDDLParser.g:98:10: tableRowFormat
                                    {
                                    pushFollow(FOLLOW_tableRowFormat_in_createTableStatement713);
                                    tableRowFormat43=gHiveParser.tableRowFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableRowFormat.add(tableRowFormat43.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:99:10: ( tableFileFormat )?
                            int alt33=2;
                            int LA33_0 = input.LA(1);

                            if ( (LA33_0==KW_STORED) ) {
                                alt33=1;
                            }
                            switch (alt33) {
                                case 1 :
                                    // CreateDDLParser.g:99:10: tableFileFormat
                                    {
                                    pushFollow(FOLLOW_tableFileFormat_in_createTableStatement725);
                                    tableFileFormat44=gHiveParser.tableFileFormat();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableFileFormat.add(tableFileFormat44.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:100:10: ( tableLocation )?
                            int alt34=2;
                            int LA34_0 = input.LA(1);

                            if ( (LA34_0==KW_LOCATION) ) {
                                alt34=1;
                            }
                            switch (alt34) {
                                case 1 :
                                    // CreateDDLParser.g:100:10: tableLocation
                                    {
                                    pushFollow(FOLLOW_tableLocation_in_createTableStatement737);
                                    tableLocation45=gHiveParser.tableLocation();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tableLocation.add(tableLocation45.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:101:10: ( tablePropertiesPrefixed )?
                            int alt35=2;
                            int LA35_0 = input.LA(1);

                            if ( (LA35_0==KW_TBLPROPERTIES) ) {
                                alt35=1;
                            }
                            switch (alt35) {
                                case 1 :
                                    // CreateDDLParser.g:101:10: tablePropertiesPrefixed
                                    {
                                    pushFollow(FOLLOW_tablePropertiesPrefixed_in_createTableStatement749);
                                    tablePropertiesPrefixed46=gHiveParser.tablePropertiesPrefixed();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed46.getTree());

                                    }
                                    break;

                            }


                            // CreateDDLParser.g:102:10: ( KW_AS selectStatementWithCTE )?
                            int alt36=2;
                            int LA36_0 = input.LA(1);

                            if ( (LA36_0==KW_AS) ) {
                                alt36=1;
                            }
                            switch (alt36) {
                                case 1 :
                                    // CreateDDLParser.g:102:11: KW_AS selectStatementWithCTE
                                    {
                                    KW_AS47=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_createTableStatement762); if (state.failed) return retval; 
                                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS47);


                                    pushFollow(FOLLOW_selectStatementWithCTE_in_createTableStatement764);
                                    selectStatementWithCTE48=gHiveParser.selectStatementWithCTE();

                                    state._fsp--;
                                    if (state.failed) return retval;
                                    if ( state.backtracking==0 ) stream_selectStatementWithCTE.add(selectStatementWithCTE48.getTree());

                                    }
                                    break;

                            }


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: tableFileFormat, name, tableComment, createTablePartitionSpec, likeTableOrFile, tablePropertiesPrefixed, columnNameTypeOrConstraintList, tableRowFormat, selectStatementWithCTE, mgd, tableBuckets, tableLocation, tableSkewed, ifNotExists
                    // token labels: mgd
                    // rule labels: name, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_mgd=new RewriteRuleTokenStream(adaptor,"token mgd",mgd);
                    RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 104:5: -> ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
                    {
                        // CreateDDLParser.g:104:8: ^( TOK_CREATETABLE $name $mgd ( ifNotExists )? ( likeTableOrFile )? ( columnNameTypeOrConstraintList )? ( tableComment )? ( createTablePartitionSpec )? ( tableBuckets )? ( tableSkewed )? ( tableRowFormat )? ( tableFileFormat )? ( tableLocation )? ( tablePropertiesPrefixed )? ( selectStatementWithCTE )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_CREATETABLE, "TOK_CREATETABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_name.nextTree());

                        adaptor.addChild(root_1, stream_mgd.nextNode());

                        // CreateDDLParser.g:104:37: ( ifNotExists )?
                        if ( stream_ifNotExists.hasNext() ) {
                            adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                        }
                        stream_ifNotExists.reset();

                        // CreateDDLParser.g:105:10: ( likeTableOrFile )?
                        if ( stream_likeTableOrFile.hasNext() ) {
                            adaptor.addChild(root_1, stream_likeTableOrFile.nextTree());

                        }
                        stream_likeTableOrFile.reset();

                        // CreateDDLParser.g:106:10: ( columnNameTypeOrConstraintList )?
                        if ( stream_columnNameTypeOrConstraintList.hasNext() ) {
                            adaptor.addChild(root_1, stream_columnNameTypeOrConstraintList.nextTree());

                        }
                        stream_columnNameTypeOrConstraintList.reset();

                        // CreateDDLParser.g:107:10: ( tableComment )?
                        if ( stream_tableComment.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableComment.nextTree());

                        }
                        stream_tableComment.reset();

                        // CreateDDLParser.g:108:10: ( createTablePartitionSpec )?
                        if ( stream_createTablePartitionSpec.hasNext() ) {
                            adaptor.addChild(root_1, stream_createTablePartitionSpec.nextTree());

                        }
                        stream_createTablePartitionSpec.reset();

                        // CreateDDLParser.g:109:10: ( tableBuckets )?
                        if ( stream_tableBuckets.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableBuckets.nextTree());

                        }
                        stream_tableBuckets.reset();

                        // CreateDDLParser.g:110:10: ( tableSkewed )?
                        if ( stream_tableSkewed.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableSkewed.nextTree());

                        }
                        stream_tableSkewed.reset();

                        // CreateDDLParser.g:111:10: ( tableRowFormat )?
                        if ( stream_tableRowFormat.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableRowFormat.nextTree());

                        }
                        stream_tableRowFormat.reset();

                        // CreateDDLParser.g:112:10: ( tableFileFormat )?
                        if ( stream_tableFileFormat.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableFileFormat.nextTree());

                        }
                        stream_tableFileFormat.reset();

                        // CreateDDLParser.g:113:10: ( tableLocation )?
                        if ( stream_tableLocation.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableLocation.nextTree());

                        }
                        stream_tableLocation.reset();

                        // CreateDDLParser.g:114:10: ( tablePropertiesPrefixed )?
                        if ( stream_tablePropertiesPrefixed.hasNext() ) {
                            adaptor.addChild(root_1, stream_tablePropertiesPrefixed.nextTree());

                        }
                        stream_tablePropertiesPrefixed.reset();

                        // CreateDDLParser.g:115:10: ( selectStatementWithCTE )?
                        if ( stream_selectStatementWithCTE.hasNext() ) {
                            adaptor.addChild(root_1, stream_selectStatementWithCTE.nextTree());

                        }
                        stream_selectStatementWithCTE.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "createTableStatement"


    public static class createDataConnectorStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "createDataConnectorStatement"
    // CreateDDLParser.g:119:1: createDataConnectorStatement : KW_CREATE KW_DATACONNECTOR ( ifNotExists )? name= identifier dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )? -> ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? ) ;
    public final HiveParser_CreateDDLParser.createDataConnectorStatement_return createDataConnectorStatement() throws RecognitionException {
        HiveParser_CreateDDLParser.createDataConnectorStatement_return retval = new HiveParser_CreateDDLParser.createDataConnectorStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CREATE49=null;
        Token KW_DATACONNECTOR50=null;
        Token KW_WITH55=null;
        Token KW_DCPROPERTIES56=null;
        HiveParser_IdentifiersParser.identifier_return name =null;

        HiveParser_CreateDDLParser.dcProperties_return dcprops =null;

        HiveParser.ifNotExists_return ifNotExists51 =null;

        HiveParser_CreateDDLParser.dataConnectorType_return dataConnectorType52 =null;

        HiveParser_CreateDDLParser.dataConnectorUrl_return dataConnectorUrl53 =null;

        HiveParser_CreateDDLParser.dataConnectorComment_return dataConnectorComment54 =null;


        ASTNode KW_CREATE49_tree=null;
        ASTNode KW_DATACONNECTOR50_tree=null;
        ASTNode KW_WITH55_tree=null;
        ASTNode KW_DCPROPERTIES56_tree=null;
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_DATACONNECTOR=new RewriteRuleTokenStream(adaptor,"token KW_DATACONNECTOR");
        RewriteRuleTokenStream stream_KW_DCPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_DCPROPERTIES");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_dataConnectorType=new RewriteRuleSubtreeStream(adaptor,"rule dataConnectorType");
        RewriteRuleSubtreeStream stream_dcProperties=new RewriteRuleSubtreeStream(adaptor,"rule dcProperties");
        RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
        RewriteRuleSubtreeStream stream_dataConnectorComment=new RewriteRuleSubtreeStream(adaptor,"rule dataConnectorComment");
        RewriteRuleSubtreeStream stream_dataConnectorUrl=new RewriteRuleSubtreeStream(adaptor,"rule dataConnectorUrl");
         gParent.pushMsg("create connector statement", state); 
        try {
            // CreateDDLParser.g:122:5: ( KW_CREATE KW_DATACONNECTOR ( ifNotExists )? name= identifier dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )? -> ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? ) )
            // CreateDDLParser.g:122:7: KW_CREATE KW_DATACONNECTOR ( ifNotExists )? name= identifier dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )?
            {
            KW_CREATE49=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_createDataConnectorStatement961); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE49);


            KW_DATACONNECTOR50=(Token)match(input,KW_DATACONNECTOR,FOLLOW_KW_DATACONNECTOR_in_createDataConnectorStatement963); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DATACONNECTOR.add(KW_DATACONNECTOR50);


            // CreateDDLParser.g:122:34: ( ifNotExists )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KW_IF) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // CreateDDLParser.g:122:34: ifNotExists
                    {
                    pushFollow(FOLLOW_ifNotExists_in_createDataConnectorStatement965);
                    ifNotExists51=gHiveParser.ifNotExists();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists51.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_createDataConnectorStatement970);
            name=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(name.getTree());

            pushFollow(FOLLOW_dataConnectorType_in_createDataConnectorStatement972);
            dataConnectorType52=dataConnectorType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dataConnectorType.add(dataConnectorType52.getTree());

            pushFollow(FOLLOW_dataConnectorUrl_in_createDataConnectorStatement974);
            dataConnectorUrl53=dataConnectorUrl();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dataConnectorUrl.add(dataConnectorUrl53.getTree());

            // CreateDDLParser.g:122:98: ( dataConnectorComment )?
            int alt40=2;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KW_COMMENT) ) {
                alt40=1;
            }
            switch (alt40) {
                case 1 :
                    // CreateDDLParser.g:122:98: dataConnectorComment
                    {
                    pushFollow(FOLLOW_dataConnectorComment_in_createDataConnectorStatement976);
                    dataConnectorComment54=dataConnectorComment();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dataConnectorComment.add(dataConnectorComment54.getTree());

                    }
                    break;

            }


            // CreateDDLParser.g:122:120: ( KW_WITH KW_DCPROPERTIES dcprops= dcProperties )?
            int alt41=2;
            int LA41_0 = input.LA(1);

            if ( (LA41_0==KW_WITH) ) {
                alt41=1;
            }
            switch (alt41) {
                case 1 :
                    // CreateDDLParser.g:122:122: KW_WITH KW_DCPROPERTIES dcprops= dcProperties
                    {
                    KW_WITH55=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_createDataConnectorStatement981); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH55);


                    KW_DCPROPERTIES56=(Token)match(input,KW_DCPROPERTIES,FOLLOW_KW_DCPROPERTIES_in_createDataConnectorStatement983); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DCPROPERTIES.add(KW_DCPROPERTIES56);


                    pushFollow(FOLLOW_dcProperties_in_createDataConnectorStatement987);
                    dcprops=dcProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_dcProperties.add(dcprops.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: name, dataConnectorType, dataConnectorComment, dcprops, dataConnectorUrl, ifNotExists
            // token labels: 
            // rule labels: name, retval, dcprops
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_dcprops=new RewriteRuleSubtreeStream(adaptor,"rule dcprops",dcprops!=null?dcprops.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 123:5: -> ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? )
            {
                // CreateDDLParser.g:123:8: ^( TOK_CREATEDATACONNECTOR $name ( ifNotExists )? dataConnectorType dataConnectorUrl ( dataConnectorComment )? ( $dcprops)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_CREATEDATACONNECTOR, "TOK_CREATEDATACONNECTOR")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                // CreateDDLParser.g:123:40: ( ifNotExists )?
                if ( stream_ifNotExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                }
                stream_ifNotExists.reset();

                adaptor.addChild(root_1, stream_dataConnectorType.nextTree());

                adaptor.addChild(root_1, stream_dataConnectorUrl.nextTree());

                // CreateDDLParser.g:123:88: ( dataConnectorComment )?
                if ( stream_dataConnectorComment.hasNext() ) {
                    adaptor.addChild(root_1, stream_dataConnectorComment.nextTree());

                }
                stream_dataConnectorComment.reset();

                // CreateDDLParser.g:123:111: ( $dcprops)?
                if ( stream_dcprops.hasNext() ) {
                    adaptor.addChild(root_1, stream_dcprops.nextTree());

                }
                stream_dcprops.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "createDataConnectorStatement"


    public static class dataConnectorComment_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dataConnectorComment"
    // CreateDDLParser.g:126:1: dataConnectorComment : KW_COMMENT comment= StringLiteral -> ^( TOK_DATACONNECTORCOMMENT $comment) ;
    public final HiveParser_CreateDDLParser.dataConnectorComment_return dataConnectorComment() throws RecognitionException {
        HiveParser_CreateDDLParser.dataConnectorComment_return retval = new HiveParser_CreateDDLParser.dataConnectorComment_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token comment=null;
        Token KW_COMMENT57=null;

        ASTNode comment_tree=null;
        ASTNode KW_COMMENT57_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");

         gParent.pushMsg("dataconnector comment", state); 
        try {
            // CreateDDLParser.g:129:5: ( KW_COMMENT comment= StringLiteral -> ^( TOK_DATACONNECTORCOMMENT $comment) )
            // CreateDDLParser.g:129:7: KW_COMMENT comment= StringLiteral
            {
            KW_COMMENT57=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_dataConnectorComment1043); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT57);


            comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataConnectorComment1047); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(comment);


            // AST REWRITE
            // elements: comment
            // token labels: comment
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 130:5: -> ^( TOK_DATACONNECTORCOMMENT $comment)
            {
                // CreateDDLParser.g:130:8: ^( TOK_DATACONNECTORCOMMENT $comment)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DATACONNECTORCOMMENT, "TOK_DATACONNECTORCOMMENT")
                , root_1);

                adaptor.addChild(root_1, stream_comment.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dataConnectorComment"


    public static class dataConnectorUrl_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dataConnectorUrl"
    // CreateDDLParser.g:133:1: dataConnectorUrl : KW_URL url= StringLiteral -> ^( TOK_DATACONNECTORURL $url) ;
    public final HiveParser_CreateDDLParser.dataConnectorUrl_return dataConnectorUrl() throws RecognitionException {
        HiveParser_CreateDDLParser.dataConnectorUrl_return retval = new HiveParser_CreateDDLParser.dataConnectorUrl_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token url=null;
        Token KW_URL58=null;

        ASTNode url_tree=null;
        ASTNode KW_URL58_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_URL=new RewriteRuleTokenStream(adaptor,"token KW_URL");

         gParent.pushMsg("dataconnector URL", state); 
        try {
            // CreateDDLParser.g:136:5: ( KW_URL url= StringLiteral -> ^( TOK_DATACONNECTORURL $url) )
            // CreateDDLParser.g:136:7: KW_URL url= StringLiteral
            {
            KW_URL58=(Token)match(input,KW_URL,FOLLOW_KW_URL_in_dataConnectorUrl1087); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_URL.add(KW_URL58);


            url=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataConnectorUrl1091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(url);


            // AST REWRITE
            // elements: url
            // token labels: url
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_url=new RewriteRuleTokenStream(adaptor,"token url",url);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 137:5: -> ^( TOK_DATACONNECTORURL $url)
            {
                // CreateDDLParser.g:137:8: ^( TOK_DATACONNECTORURL $url)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DATACONNECTORURL, "TOK_DATACONNECTORURL")
                , root_1);

                adaptor.addChild(root_1, stream_url.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dataConnectorUrl"


    public static class dataConnectorType_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dataConnectorType"
    // CreateDDLParser.g:140:1: dataConnectorType : KW_TYPE dcType= StringLiteral -> ^( TOK_DATACONNECTORTYPE $dcType) ;
    public final HiveParser_CreateDDLParser.dataConnectorType_return dataConnectorType() throws RecognitionException {
        HiveParser_CreateDDLParser.dataConnectorType_return retval = new HiveParser_CreateDDLParser.dataConnectorType_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token dcType=null;
        Token KW_TYPE59=null;

        ASTNode dcType_tree=null;
        ASTNode KW_TYPE59_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_TYPE=new RewriteRuleTokenStream(adaptor,"token KW_TYPE");

         gParent.pushMsg("dataconnector type", state); 
        try {
            // CreateDDLParser.g:143:5: ( KW_TYPE dcType= StringLiteral -> ^( TOK_DATACONNECTORTYPE $dcType) )
            // CreateDDLParser.g:143:7: KW_TYPE dcType= StringLiteral
            {
            KW_TYPE59=(Token)match(input,KW_TYPE,FOLLOW_KW_TYPE_in_dataConnectorType1131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TYPE.add(KW_TYPE59);


            dcType=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_dataConnectorType1135); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(dcType);


            // AST REWRITE
            // elements: dcType
            // token labels: dcType
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_dcType=new RewriteRuleTokenStream(adaptor,"token dcType",dcType);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 144:5: -> ^( TOK_DATACONNECTORTYPE $dcType)
            {
                // CreateDDLParser.g:144:8: ^( TOK_DATACONNECTORTYPE $dcType)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DATACONNECTORTYPE, "TOK_DATACONNECTORTYPE")
                , root_1);

                adaptor.addChild(root_1, stream_dcType.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dataConnectorType"


    public static class dcProperties_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dcProperties"
    // CreateDDLParser.g:147:1: dcProperties : LPAREN dbPropertiesList RPAREN -> ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList ) ;
    public final HiveParser_CreateDDLParser.dcProperties_return dcProperties() throws RecognitionException {
        HiveParser_CreateDDLParser.dcProperties_return retval = new HiveParser_CreateDDLParser.dcProperties_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN60=null;
        Token RPAREN62=null;
        HiveParser.dbPropertiesList_return dbPropertiesList61 =null;


        ASTNode LPAREN60_tree=null;
        ASTNode RPAREN62_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_dbPropertiesList=new RewriteRuleSubtreeStream(adaptor,"rule dbPropertiesList");
         gParent.pushMsg("dcproperties", state); 
        try {
            // CreateDDLParser.g:150:5: ( LPAREN dbPropertiesList RPAREN -> ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList ) )
            // CreateDDLParser.g:151:7: LPAREN dbPropertiesList RPAREN
            {
            LPAREN60=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_dcProperties1181); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN60);


            pushFollow(FOLLOW_dbPropertiesList_in_dcProperties1183);
            dbPropertiesList61=gHiveParser.dbPropertiesList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dbPropertiesList.add(dbPropertiesList61.getTree());

            RPAREN62=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_dcProperties1185); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN62);


            // AST REWRITE
            // elements: dbPropertiesList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 151:38: -> ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList )
            {
                // CreateDDLParser.g:151:41: ^( TOK_DATACONNECTORPROPERTIES dbPropertiesList )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DATACONNECTORPROPERTIES, "TOK_DATACONNECTORPROPERTIES")
                , root_1);

                adaptor.addChild(root_1, stream_dbPropertiesList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dcProperties"


    public static class dropDataConnectorStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dropDataConnectorStatement"
    // CreateDDLParser.g:154:1: dropDataConnectorStatement : KW_DROP ( KW_DATACONNECTOR ) ( ifExists )? identifier -> ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? ) ;
    public final HiveParser_CreateDDLParser.dropDataConnectorStatement_return dropDataConnectorStatement() throws RecognitionException {
        HiveParser_CreateDDLParser.dropDataConnectorStatement_return retval = new HiveParser_CreateDDLParser.dropDataConnectorStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP63=null;
        Token KW_DATACONNECTOR64=null;
        HiveParser.ifExists_return ifExists65 =null;

        HiveParser_IdentifiersParser.identifier_return identifier66 =null;


        ASTNode KW_DROP63_tree=null;
        ASTNode KW_DATACONNECTOR64_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_DATACONNECTOR=new RewriteRuleTokenStream(adaptor,"token KW_DATACONNECTOR");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
         gParent.pushMsg("drop connector statement", state); 
        try {
            // CreateDDLParser.g:157:5: ( KW_DROP ( KW_DATACONNECTOR ) ( ifExists )? identifier -> ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? ) )
            // CreateDDLParser.g:157:7: KW_DROP ( KW_DATACONNECTOR ) ( ifExists )? identifier
            {
            KW_DROP63=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_dropDataConnectorStatement1220); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP63);


            // CreateDDLParser.g:157:15: ( KW_DATACONNECTOR )
            // CreateDDLParser.g:157:16: KW_DATACONNECTOR
            {
            KW_DATACONNECTOR64=(Token)match(input,KW_DATACONNECTOR,FOLLOW_KW_DATACONNECTOR_in_dropDataConnectorStatement1223); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DATACONNECTOR.add(KW_DATACONNECTOR64);


            }


            // CreateDDLParser.g:157:34: ( ifExists )?
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KW_IF) ) {
                alt42=1;
            }
            switch (alt42) {
                case 1 :
                    // CreateDDLParser.g:157:34: ifExists
                    {
                    pushFollow(FOLLOW_ifExists_in_dropDataConnectorStatement1226);
                    ifExists65=gHiveParser.ifExists();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifExists.add(ifExists65.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_dropDataConnectorStatement1229);
            identifier66=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier66.getTree());

            // AST REWRITE
            // elements: identifier, ifExists
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 158:5: -> ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? )
            {
                // CreateDDLParser.g:158:8: ^( TOK_DROPDATACONNECTOR identifier ( ifExists )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DROPDATACONNECTOR, "TOK_DROPDATACONNECTOR")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

                // CreateDDLParser.g:158:43: ( ifExists )?
                if ( stream_ifExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifExists.nextTree());

                }
                stream_ifExists.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;
            }

            }

            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) { gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dropDataConnectorStatement"

    // $ANTLR start synpred1_CreateDDLParser
    public final void synpred1_CreateDDLParser_fragment() throws RecognitionException {
        // CreateDDLParser.g:47:7: ( KW_LIKE KW_FILE )
        // CreateDDLParser.g:47:8: KW_LIKE KW_FILE
        {
        match(input,KW_LIKE,FOLLOW_KW_LIKE_in_synpred1_CreateDDLParser56); if (state.failed) return ;

        match(input,KW_FILE,FOLLOW_KW_FILE_in_synpred1_CreateDDLParser58); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_CreateDDLParser

    // Delegated rules

    public final boolean synpred1_CreateDDLParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_CreateDDLParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


 

    public static final BitSet FOLLOW_KW_LIKE_in_likeTableOrFile63 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_FILE_in_likeTableOrFile65 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LIKE_in_likeTableOrFile74 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_FILE_in_likeTableOrFile76 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_likeTableOrFile80 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_likeTableOrFile84 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LIKE_in_likeTableOrFile106 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_likeTableOrFile110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_createTableStatement148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000040042000000L});
    public static final BitSet FOLLOW_KW_TEMPORARY_in_createTableStatement153 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000040002000000L});
    public static final BitSet FOLLOW_KW_TRANSACTIONAL_in_createTableStatement160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000008000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_EXTERNAL_in_createTableStatement167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_TABLE_in_createTableStatement171 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifNotExists_in_createTableStatement173 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_createTableStatement178 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000108L,0x0000000000000000L,0x4000000000004200L,0x0008000000000000L,0x0000000020020020L,0x0000000040000000L});
    public static final BitSet FOLLOW_likeTableOrFile_in_createTableStatement189 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x4000000000004000L,0x0008000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_createTablePartitionSpec_in_createTableStatement200 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement212 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement224 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tableLocation_in_createTableStatement236 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_createTableStatement261 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502B6DBDL,0xDC0ECB08E0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975879L,0xBED64EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement263 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_createTableStatement265 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000108L,0x0000000000000000L,0x4000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_tableComment_in_createTableStatement278 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000008L,0x0000000000000000L,0x4000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_createTablePartitionSpec_in_createTableStatement290 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000008L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_tableBuckets_in_createTableStatement302 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_tableSkewed_in_createTableStatement314 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement326 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement338 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tableLocation_in_createTableStatement350 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement362 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_KW_AS_in_createTableStatement375 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0400000004000000L,0x0000000000000000L,0x0000000040080080L});
    public static final BitSet FOLLOW_selectStatementWithCTE_in_createTableStatement377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_createTableStatement564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_KW_MANAGED_in_createTableStatement568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_TABLE_in_createTableStatement570 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifNotExists_in_createTableStatement572 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_createTableStatement577 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000108L,0x0000000000000000L,0x4000000000004200L,0x0008000000000000L,0x0000000020020020L,0x0000000040000000L});
    public static final BitSet FOLLOW_likeTableOrFile_in_createTableStatement588 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement611 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tableLocation_in_createTableStatement623 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_createTableStatement648 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502B6DBDL,0xDC0ECB08E0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975879L,0xBED64EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_columnNameTypeOrConstraintList_in_createTableStatement650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_createTableStatement652 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000108L,0x0000000000000000L,0x4000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_tableComment_in_createTableStatement665 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000008L,0x0000000000000000L,0x4000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_createTablePartitionSpec_in_createTableStatement677 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000008L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_tableBuckets_in_createTableStatement689 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020020L});
    public static final BitSet FOLLOW_tableSkewed_in_createTableStatement701 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0008000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableRowFormat_in_createTableStatement713 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020020000L});
    public static final BitSet FOLLOW_tableFileFormat_in_createTableStatement725 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tableLocation_in_createTableStatement737 = new BitSet(new long[]{0x0000020000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tablePropertiesPrefixed_in_createTableStatement749 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_KW_AS_in_createTableStatement762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0400000004000000L,0x0000000000000000L,0x0000000040080080L});
    public static final BitSet FOLLOW_selectStatementWithCTE_in_createTableStatement764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_createDataConnectorStatement961 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_KW_DATACONNECTOR_in_createDataConnectorStatement963 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifNotExists_in_createDataConnectorStatement965 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_createDataConnectorStatement970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_dataConnectorType_in_createDataConnectorStatement972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_dataConnectorUrl_in_createDataConnectorStatement974 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_dataConnectorComment_in_createDataConnectorStatement976 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_createDataConnectorStatement981 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_KW_DCPROPERTIES_in_createDataConnectorStatement983 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dcProperties_in_createDataConnectorStatement987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_COMMENT_in_dataConnectorComment1043 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_dataConnectorComment1047 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_URL_in_dataConnectorUrl1087 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_dataConnectorUrl1091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TYPE_in_dataConnectorType1131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_dataConnectorType1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_dcProperties1181 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_dbPropertiesList_in_dcProperties1183 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_dcProperties1185 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_dropDataConnectorStatement1220 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_KW_DATACONNECTOR_in_dropDataConnectorStatement1223 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifExists_in_dropDataConnectorStatement1226 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_dropDataConnectorStatement1229 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LIKE_in_synpred1_CreateDDLParser56 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_FILE_in_synpred1_CreateDDLParser58 = new BitSet(new long[]{0x0000000000000002L});

}