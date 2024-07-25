// $ANTLR 3.4 AlterClauseParser.g 2024-07-25 22:38:44

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
public class HiveParser_AlterClauseParser extends Parser {
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


    public HiveParser_AlterClauseParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_AlterClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
    public String getGrammarFileName() { return "AlterClauseParser.g"; }


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


    public static class alterStatement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatement"
    // AlterClauseParser.g:47:1: alterStatement : ( KW_ALTER KW_TABLE tableName alterTableStatementSuffix -> ^( TOK_ALTERTABLE tableName alterTableStatementSuffix ) | KW_ALTER KW_VIEW tableName ( KW_AS )? alterViewStatementSuffix -> ^( TOK_ALTERVIEW tableName alterViewStatementSuffix ) | KW_ALTER KW_MATERIALIZED KW_VIEW tableNameTree= tableName alterMaterializedViewStatementSuffix[$tableNameTree.tree] -> alterMaterializedViewStatementSuffix | KW_ALTER ( KW_DATABASE | KW_SCHEMA ) alterDatabaseStatementSuffix -> alterDatabaseStatementSuffix | KW_ALTER KW_DATACONNECTOR alterDataConnectorStatementSuffix -> alterDataConnectorStatementSuffix | KW_OPTIMIZE KW_TABLE tableName optimizeTableStatementSuffix -> ^( TOK_ALTERTABLE tableName optimizeTableStatementSuffix ) );
    public final HiveParser_AlterClauseParser.alterStatement_return alterStatement() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatement_return retval = new HiveParser_AlterClauseParser.alterStatement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ALTER1=null;
        Token KW_TABLE2=null;
        Token KW_ALTER5=null;
        Token KW_VIEW6=null;
        Token KW_AS8=null;
        Token KW_ALTER10=null;
        Token KW_MATERIALIZED11=null;
        Token KW_VIEW12=null;
        Token KW_ALTER14=null;
        Token KW_DATABASE15=null;
        Token KW_SCHEMA16=null;
        Token KW_ALTER18=null;
        Token KW_DATACONNECTOR19=null;
        Token KW_OPTIMIZE21=null;
        Token KW_TABLE22=null;
        HiveParser_FromClauseParser.tableName_return tableNameTree =null;

        HiveParser_FromClauseParser.tableName_return tableName3 =null;

        HiveParser_AlterClauseParser.alterTableStatementSuffix_return alterTableStatementSuffix4 =null;

        HiveParser_FromClauseParser.tableName_return tableName7 =null;

        HiveParser_AlterClauseParser.alterViewStatementSuffix_return alterViewStatementSuffix9 =null;

        HiveParser_AlterClauseParser.alterMaterializedViewStatementSuffix_return alterMaterializedViewStatementSuffix13 =null;

        HiveParser_AlterClauseParser.alterDatabaseStatementSuffix_return alterDatabaseStatementSuffix17 =null;

        HiveParser_AlterClauseParser.alterDataConnectorStatementSuffix_return alterDataConnectorStatementSuffix20 =null;

        HiveParser_FromClauseParser.tableName_return tableName23 =null;

        HiveParser_AlterClauseParser.optimizeTableStatementSuffix_return optimizeTableStatementSuffix24 =null;


        ASTNode KW_ALTER1_tree=null;
        ASTNode KW_TABLE2_tree=null;
        ASTNode KW_ALTER5_tree=null;
        ASTNode KW_VIEW6_tree=null;
        ASTNode KW_AS8_tree=null;
        ASTNode KW_ALTER10_tree=null;
        ASTNode KW_MATERIALIZED11_tree=null;
        ASTNode KW_VIEW12_tree=null;
        ASTNode KW_ALTER14_tree=null;
        ASTNode KW_DATABASE15_tree=null;
        ASTNode KW_SCHEMA16_tree=null;
        ASTNode KW_ALTER18_tree=null;
        ASTNode KW_DATACONNECTOR19_tree=null;
        ASTNode KW_OPTIMIZE21_tree=null;
        ASTNode KW_TABLE22_tree=null;
        RewriteRuleTokenStream stream_KW_SCHEMA=new RewriteRuleTokenStream(adaptor,"token KW_SCHEMA");
        RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
        RewriteRuleTokenStream stream_KW_DATABASE=new RewriteRuleTokenStream(adaptor,"token KW_DATABASE");
        RewriteRuleTokenStream stream_KW_DATACONNECTOR=new RewriteRuleTokenStream(adaptor,"token KW_DATACONNECTOR");
        RewriteRuleTokenStream stream_KW_ALTER=new RewriteRuleTokenStream(adaptor,"token KW_ALTER");
        RewriteRuleTokenStream stream_KW_OPTIMIZE=new RewriteRuleTokenStream(adaptor,"token KW_OPTIMIZE");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_MATERIALIZED=new RewriteRuleTokenStream(adaptor,"token KW_MATERIALIZED");
        RewriteRuleSubtreeStream stream_optimizeTableStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule optimizeTableStatementSuffix");
        RewriteRuleSubtreeStream stream_alterDataConnectorStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterDataConnectorStatementSuffix");
        RewriteRuleSubtreeStream stream_alterMaterializedViewStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterMaterializedViewStatementSuffix");
        RewriteRuleSubtreeStream stream_alterTableStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterTableStatementSuffix");
        RewriteRuleSubtreeStream stream_alterViewStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterViewStatementSuffix");
        RewriteRuleSubtreeStream stream_alterDatabaseStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterDatabaseStatementSuffix");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
         gParent.pushMsg("alter statement", state); 
        try {
            // AlterClauseParser.g:50:5: ( KW_ALTER KW_TABLE tableName alterTableStatementSuffix -> ^( TOK_ALTERTABLE tableName alterTableStatementSuffix ) | KW_ALTER KW_VIEW tableName ( KW_AS )? alterViewStatementSuffix -> ^( TOK_ALTERVIEW tableName alterViewStatementSuffix ) | KW_ALTER KW_MATERIALIZED KW_VIEW tableNameTree= tableName alterMaterializedViewStatementSuffix[$tableNameTree.tree] -> alterMaterializedViewStatementSuffix | KW_ALTER ( KW_DATABASE | KW_SCHEMA ) alterDatabaseStatementSuffix -> alterDatabaseStatementSuffix | KW_ALTER KW_DATACONNECTOR alterDataConnectorStatementSuffix -> alterDataConnectorStatementSuffix | KW_OPTIMIZE KW_TABLE tableName optimizeTableStatementSuffix -> ^( TOK_ALTERTABLE tableName optimizeTableStatementSuffix ) )
            int alt3=6;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==KW_ALTER) ) {
                switch ( input.LA(2) ) {
                case KW_TABLE:
                    {
                    alt3=1;
                    }
                    break;
                case KW_VIEW:
                    {
                    alt3=2;
                    }
                    break;
                case KW_MATERIALIZED:
                    {
                    alt3=3;
                    }
                    break;
                case KW_DATACONNECTOR:
                    {
                    alt3=5;
                    }
                    break;
                case KW_DATABASE:
                case KW_SCHEMA:
                    {
                    alt3=4;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;

                }

            }
            else if ( (LA3_0==KW_OPTIMIZE) ) {
                alt3=6;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // AlterClauseParser.g:50:7: KW_ALTER KW_TABLE tableName alterTableStatementSuffix
                    {
                    KW_ALTER1=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement66); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER1);


                    KW_TABLE2=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_alterStatement68); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE2);


                    pushFollow(FOLLOW_tableName_in_alterStatement70);
                    tableName3=gHiveParser.tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(tableName3.getTree());

                    pushFollow(FOLLOW_alterTableStatementSuffix_in_alterStatement72);
                    alterTableStatementSuffix4=alterTableStatementSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterTableStatementSuffix.add(alterTableStatementSuffix4.getTree());

                    // AST REWRITE
                    // elements: tableName, alterTableStatementSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 50:61: -> ^( TOK_ALTERTABLE tableName alterTableStatementSuffix )
                    {
                        // AlterClauseParser.g:50:64: ^( TOK_ALTERTABLE tableName alterTableStatementSuffix )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE, "TOK_ALTERTABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableName.nextTree());

                        adaptor.addChild(root_1, stream_alterTableStatementSuffix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:51:7: KW_ALTER KW_VIEW tableName ( KW_AS )? alterViewStatementSuffix
                    {
                    KW_ALTER5=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement90); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER5);


                    KW_VIEW6=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_alterStatement92); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW6);


                    pushFollow(FOLLOW_tableName_in_alterStatement94);
                    tableName7=gHiveParser.tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(tableName7.getTree());

                    // AlterClauseParser.g:51:34: ( KW_AS )?
                    int alt1=2;
                    int LA1_0 = input.LA(1);

                    if ( (LA1_0==KW_AS) ) {
                        alt1=1;
                    }
                    switch (alt1) {
                        case 1 :
                            // AlterClauseParser.g:51:34: KW_AS
                            {
                            KW_AS8=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_alterStatement96); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS8);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_alterViewStatementSuffix_in_alterStatement99);
                    alterViewStatementSuffix9=alterViewStatementSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterViewStatementSuffix.add(alterViewStatementSuffix9.getTree());

                    // AST REWRITE
                    // elements: alterViewStatementSuffix, tableName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 51:66: -> ^( TOK_ALTERVIEW tableName alterViewStatementSuffix )
                    {
                        // AlterClauseParser.g:51:69: ^( TOK_ALTERVIEW tableName alterViewStatementSuffix )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERVIEW, "TOK_ALTERVIEW")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableName.nextTree());

                        adaptor.addChild(root_1, stream_alterViewStatementSuffix.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:52:7: KW_ALTER KW_MATERIALIZED KW_VIEW tableNameTree= tableName alterMaterializedViewStatementSuffix[$tableNameTree.tree]
                    {
                    KW_ALTER10=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement117); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER10);


                    KW_MATERIALIZED11=(Token)match(input,KW_MATERIALIZED,FOLLOW_KW_MATERIALIZED_in_alterStatement119); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_MATERIALIZED.add(KW_MATERIALIZED11);


                    KW_VIEW12=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_alterStatement121); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW12);


                    pushFollow(FOLLOW_tableName_in_alterStatement125);
                    tableNameTree=gHiveParser.tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(tableNameTree.getTree());

                    pushFollow(FOLLOW_alterMaterializedViewStatementSuffix_in_alterStatement127);
                    alterMaterializedViewStatementSuffix13=alterMaterializedViewStatementSuffix((tableNameTree!=null?((ASTNode)tableNameTree.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterMaterializedViewStatementSuffix.add(alterMaterializedViewStatementSuffix13.getTree());

                    // AST REWRITE
                    // elements: alterMaterializedViewStatementSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 52:122: -> alterMaterializedViewStatementSuffix
                    {
                        adaptor.addChild(root_0, stream_alterMaterializedViewStatementSuffix.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // AlterClauseParser.g:53:7: KW_ALTER ( KW_DATABASE | KW_SCHEMA ) alterDatabaseStatementSuffix
                    {
                    KW_ALTER14=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER14);


                    // AlterClauseParser.g:53:16: ( KW_DATABASE | KW_SCHEMA )
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==KW_DATABASE) ) {
                        alt2=1;
                    }
                    else if ( (LA2_0==KW_SCHEMA) ) {
                        alt2=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;

                    }
                    switch (alt2) {
                        case 1 :
                            // AlterClauseParser.g:53:17: KW_DATABASE
                            {
                            KW_DATABASE15=(Token)match(input,KW_DATABASE,FOLLOW_KW_DATABASE_in_alterStatement143); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_DATABASE.add(KW_DATABASE15);


                            }
                            break;
                        case 2 :
                            // AlterClauseParser.g:53:29: KW_SCHEMA
                            {
                            KW_SCHEMA16=(Token)match(input,KW_SCHEMA,FOLLOW_KW_SCHEMA_in_alterStatement145); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_SCHEMA.add(KW_SCHEMA16);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_alterDatabaseStatementSuffix_in_alterStatement148);
                    alterDatabaseStatementSuffix17=alterDatabaseStatementSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterDatabaseStatementSuffix.add(alterDatabaseStatementSuffix17.getTree());

                    // AST REWRITE
                    // elements: alterDatabaseStatementSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 53:69: -> alterDatabaseStatementSuffix
                    {
                        adaptor.addChild(root_0, stream_alterDatabaseStatementSuffix.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // AlterClauseParser.g:54:7: KW_ALTER KW_DATACONNECTOR alterDataConnectorStatementSuffix
                    {
                    KW_ALTER18=(Token)match(input,KW_ALTER,FOLLOW_KW_ALTER_in_alterStatement160); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ALTER.add(KW_ALTER18);


                    KW_DATACONNECTOR19=(Token)match(input,KW_DATACONNECTOR,FOLLOW_KW_DATACONNECTOR_in_alterStatement162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DATACONNECTOR.add(KW_DATACONNECTOR19);


                    pushFollow(FOLLOW_alterDataConnectorStatementSuffix_in_alterStatement164);
                    alterDataConnectorStatementSuffix20=alterDataConnectorStatementSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterDataConnectorStatementSuffix.add(alterDataConnectorStatementSuffix20.getTree());

                    // AST REWRITE
                    // elements: alterDataConnectorStatementSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 54:67: -> alterDataConnectorStatementSuffix
                    {
                        adaptor.addChild(root_0, stream_alterDataConnectorStatementSuffix.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // AlterClauseParser.g:55:7: KW_OPTIMIZE KW_TABLE tableName optimizeTableStatementSuffix
                    {
                    KW_OPTIMIZE21=(Token)match(input,KW_OPTIMIZE,FOLLOW_KW_OPTIMIZE_in_alterStatement176); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OPTIMIZE.add(KW_OPTIMIZE21);


                    KW_TABLE22=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_alterStatement178); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE22);


                    pushFollow(FOLLOW_tableName_in_alterStatement180);
                    tableName23=gHiveParser.tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(tableName23.getTree());

                    pushFollow(FOLLOW_optimizeTableStatementSuffix_in_alterStatement182);
                    optimizeTableStatementSuffix24=optimizeTableStatementSuffix();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_optimizeTableStatementSuffix.add(optimizeTableStatementSuffix24.getTree());

                    // AST REWRITE
                    // elements: tableName, optimizeTableStatementSuffix
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 55:67: -> ^( TOK_ALTERTABLE tableName optimizeTableStatementSuffix )
                    {
                        // AlterClauseParser.g:55:70: ^( TOK_ALTERTABLE tableName optimizeTableStatementSuffix )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE, "TOK_ALTERTABLE")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableName.nextTree());

                        adaptor.addChild(root_1, stream_optimizeTableStatementSuffix.nextTree());

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
    // $ANTLR end "alterStatement"


    public static class alterTableStatementSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterTableStatementSuffix"
    // AlterClauseParser.g:58:1: alterTableStatementSuffix : ( ( alterStatementSuffixRename[true] )=> alterStatementSuffixRename[true] | alterStatementSuffixDropPartitions[true] | alterStatementSuffixAddPartitions[true] | alterStatementSuffixTouch | alterStatementSuffixArchive | alterStatementSuffixUnArchive | alterStatementSuffixProperties | alterStatementSuffixSkewedby | alterStatementSuffixExchangePartition | alterStatementPartitionKeyType | alterStatementSuffixDropConstraint | alterStatementSuffixAddConstraint | alterTblPartitionStatementSuffix[false] | partitionSpec alterTblPartitionStatementSuffix[true] -> alterTblPartitionStatementSuffix partitionSpec | alterStatementSuffixSetOwner | alterStatementSuffixSetPartSpec | alterStatementSuffixExecute | ( KW_CREATE KW_OR KW_REPLACE KW_TAG )=> alterStatementSuffixCreateOrReplaceTag | alterStatementSuffixCreateBranch | alterStatementSuffixDropBranch | alterStatementSuffixCreateTag | alterStatementSuffixDropTag | alterStatementSuffixConvert | alterStatementSuffixRenameBranch | alterStatementSuffixReplaceBranch | alterStatementSuffixReplaceTag );
    public final HiveParser_AlterClauseParser.alterTableStatementSuffix_return alterTableStatementSuffix() throws RecognitionException {
        HiveParser_AlterClauseParser.alterTableStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterTableStatementSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_AlterClauseParser.alterStatementSuffixRename_return alterStatementSuffixRename25 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return alterStatementSuffixDropPartitions26 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return alterStatementSuffixAddPartitions27 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixTouch_return alterStatementSuffixTouch28 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixArchive_return alterStatementSuffixArchive29 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixUnArchive_return alterStatementSuffixUnArchive30 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixProperties_return alterStatementSuffixProperties31 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixSkewedby_return alterStatementSuffixSkewedby32 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixExchangePartition_return alterStatementSuffixExchangePartition33 =null;

        HiveParser_AlterClauseParser.alterStatementPartitionKeyType_return alterStatementPartitionKeyType34 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixDropConstraint_return alterStatementSuffixDropConstraint35 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixAddConstraint_return alterStatementSuffixAddConstraint36 =null;

        HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return alterTblPartitionStatementSuffix37 =null;

        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec38 =null;

        HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return alterTblPartitionStatementSuffix39 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixSetOwner_return alterStatementSuffixSetOwner40 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixSetPartSpec_return alterStatementSuffixSetPartSpec41 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixExecute_return alterStatementSuffixExecute42 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixCreateOrReplaceTag_return alterStatementSuffixCreateOrReplaceTag43 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixCreateBranch_return alterStatementSuffixCreateBranch44 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixDropBranch_return alterStatementSuffixDropBranch45 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixCreateTag_return alterStatementSuffixCreateTag46 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixDropTag_return alterStatementSuffixDropTag47 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixConvert_return alterStatementSuffixConvert48 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixRenameBranch_return alterStatementSuffixRenameBranch49 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixReplaceBranch_return alterStatementSuffixReplaceBranch50 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixReplaceTag_return alterStatementSuffixReplaceTag51 =null;


        RewriteRuleSubtreeStream stream_alterTblPartitionStatementSuffix=new RewriteRuleSubtreeStream(adaptor,"rule alterTblPartitionStatementSuffix");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         gParent.pushMsg("alter table statement", state); 
        try {
            // AlterClauseParser.g:61:5: ( ( alterStatementSuffixRename[true] )=> alterStatementSuffixRename[true] | alterStatementSuffixDropPartitions[true] | alterStatementSuffixAddPartitions[true] | alterStatementSuffixTouch | alterStatementSuffixArchive | alterStatementSuffixUnArchive | alterStatementSuffixProperties | alterStatementSuffixSkewedby | alterStatementSuffixExchangePartition | alterStatementPartitionKeyType | alterStatementSuffixDropConstraint | alterStatementSuffixAddConstraint | alterTblPartitionStatementSuffix[false] | partitionSpec alterTblPartitionStatementSuffix[true] -> alterTblPartitionStatementSuffix partitionSpec | alterStatementSuffixSetOwner | alterStatementSuffixSetPartSpec | alterStatementSuffixExecute | ( KW_CREATE KW_OR KW_REPLACE KW_TAG )=> alterStatementSuffixCreateOrReplaceTag | alterStatementSuffixCreateBranch | alterStatementSuffixDropBranch | alterStatementSuffixCreateTag | alterStatementSuffixDropTag | alterStatementSuffixConvert | alterStatementSuffixRenameBranch | alterStatementSuffixReplaceBranch | alterStatementSuffixReplaceTag )
            int alt4=26;
            alt4 = dfa4.predict(input);
            switch (alt4) {
                case 1 :
                    // AlterClauseParser.g:61:7: ( alterStatementSuffixRename[true] )=> alterStatementSuffixRename[true]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixRename_in_alterTableStatementSuffix226);
                    alterStatementSuffixRename25=alterStatementSuffixRename(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRename25.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:62:7: alterStatementSuffixDropPartitions[true]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixDropPartitions_in_alterTableStatementSuffix235);
                    alterStatementSuffixDropPartitions26=alterStatementSuffixDropPartitions(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropPartitions26.getTree());

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:63:7: alterStatementSuffixAddPartitions[true]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixAddPartitions_in_alterTableStatementSuffix244);
                    alterStatementSuffixAddPartitions27=alterStatementSuffixAddPartitions(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddPartitions27.getTree());

                    }
                    break;
                case 4 :
                    // AlterClauseParser.g:64:7: alterStatementSuffixTouch
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixTouch_in_alterTableStatementSuffix253);
                    alterStatementSuffixTouch28=alterStatementSuffixTouch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixTouch28.getTree());

                    }
                    break;
                case 5 :
                    // AlterClauseParser.g:65:7: alterStatementSuffixArchive
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixArchive_in_alterTableStatementSuffix261);
                    alterStatementSuffixArchive29=alterStatementSuffixArchive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixArchive29.getTree());

                    }
                    break;
                case 6 :
                    // AlterClauseParser.g:66:7: alterStatementSuffixUnArchive
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixUnArchive_in_alterTableStatementSuffix269);
                    alterStatementSuffixUnArchive30=alterStatementSuffixUnArchive();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUnArchive30.getTree());

                    }
                    break;
                case 7 :
                    // AlterClauseParser.g:67:7: alterStatementSuffixProperties
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixProperties_in_alterTableStatementSuffix277);
                    alterStatementSuffixProperties31=alterStatementSuffixProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixProperties31.getTree());

                    }
                    break;
                case 8 :
                    // AlterClauseParser.g:68:7: alterStatementSuffixSkewedby
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixSkewedby_in_alterTableStatementSuffix285);
                    alterStatementSuffixSkewedby32=alterStatementSuffixSkewedby();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSkewedby32.getTree());

                    }
                    break;
                case 9 :
                    // AlterClauseParser.g:69:7: alterStatementSuffixExchangePartition
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixExchangePartition_in_alterTableStatementSuffix293);
                    alterStatementSuffixExchangePartition33=alterStatementSuffixExchangePartition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixExchangePartition33.getTree());

                    }
                    break;
                case 10 :
                    // AlterClauseParser.g:70:7: alterStatementPartitionKeyType
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementPartitionKeyType_in_alterTableStatementSuffix301);
                    alterStatementPartitionKeyType34=alterStatementPartitionKeyType();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementPartitionKeyType34.getTree());

                    }
                    break;
                case 11 :
                    // AlterClauseParser.g:71:7: alterStatementSuffixDropConstraint
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixDropConstraint_in_alterTableStatementSuffix309);
                    alterStatementSuffixDropConstraint35=alterStatementSuffixDropConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropConstraint35.getTree());

                    }
                    break;
                case 12 :
                    // AlterClauseParser.g:72:7: alterStatementSuffixAddConstraint
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixAddConstraint_in_alterTableStatementSuffix317);
                    alterStatementSuffixAddConstraint36=alterStatementSuffixAddConstraint();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddConstraint36.getTree());

                    }
                    break;
                case 13 :
                    // AlterClauseParser.g:73:7: alterTblPartitionStatementSuffix[false]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix325);
                    alterTblPartitionStatementSuffix37=alterTblPartitionStatementSuffix(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterTblPartitionStatementSuffix37.getTree());

                    }
                    break;
                case 14 :
                    // AlterClauseParser.g:74:7: partitionSpec alterTblPartitionStatementSuffix[true]
                    {
                    pushFollow(FOLLOW_partitionSpec_in_alterTableStatementSuffix334);
                    partitionSpec38=gHiveParser.partitionSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec38.getTree());

                    pushFollow(FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix336);
                    alterTblPartitionStatementSuffix39=alterTblPartitionStatementSuffix(true);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterTblPartitionStatementSuffix.add(alterTblPartitionStatementSuffix39.getTree());

                    // AST REWRITE
                    // elements: alterTblPartitionStatementSuffix, partitionSpec
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 74:60: -> alterTblPartitionStatementSuffix partitionSpec
                    {
                        adaptor.addChild(root_0, stream_alterTblPartitionStatementSuffix.nextTree());

                        adaptor.addChild(root_0, stream_partitionSpec.nextTree());

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 15 :
                    // AlterClauseParser.g:75:7: alterStatementSuffixSetOwner
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixSetOwner_in_alterTableStatementSuffix351);
                    alterStatementSuffixSetOwner40=alterStatementSuffixSetOwner();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSetOwner40.getTree());

                    }
                    break;
                case 16 :
                    // AlterClauseParser.g:76:7: alterStatementSuffixSetPartSpec
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixSetPartSpec_in_alterTableStatementSuffix359);
                    alterStatementSuffixSetPartSpec41=alterStatementSuffixSetPartSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSetPartSpec41.getTree());

                    }
                    break;
                case 17 :
                    // AlterClauseParser.g:77:7: alterStatementSuffixExecute
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixExecute_in_alterTableStatementSuffix367);
                    alterStatementSuffixExecute42=alterStatementSuffixExecute();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixExecute42.getTree());

                    }
                    break;
                case 18 :
                    // AlterClauseParser.g:78:7: ( KW_CREATE KW_OR KW_REPLACE KW_TAG )=> alterStatementSuffixCreateOrReplaceTag
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixCreateOrReplaceTag_in_alterTableStatementSuffix387);
                    alterStatementSuffixCreateOrReplaceTag43=alterStatementSuffixCreateOrReplaceTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixCreateOrReplaceTag43.getTree());

                    }
                    break;
                case 19 :
                    // AlterClauseParser.g:79:7: alterStatementSuffixCreateBranch
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixCreateBranch_in_alterTableStatementSuffix395);
                    alterStatementSuffixCreateBranch44=alterStatementSuffixCreateBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixCreateBranch44.getTree());

                    }
                    break;
                case 20 :
                    // AlterClauseParser.g:80:7: alterStatementSuffixDropBranch
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixDropBranch_in_alterTableStatementSuffix403);
                    alterStatementSuffixDropBranch45=alterStatementSuffixDropBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropBranch45.getTree());

                    }
                    break;
                case 21 :
                    // AlterClauseParser.g:81:7: alterStatementSuffixCreateTag
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixCreateTag_in_alterTableStatementSuffix411);
                    alterStatementSuffixCreateTag46=alterStatementSuffixCreateTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixCreateTag46.getTree());

                    }
                    break;
                case 22 :
                    // AlterClauseParser.g:82:7: alterStatementSuffixDropTag
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixDropTag_in_alterTableStatementSuffix419);
                    alterStatementSuffixDropTag47=alterStatementSuffixDropTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropTag47.getTree());

                    }
                    break;
                case 23 :
                    // AlterClauseParser.g:83:7: alterStatementSuffixConvert
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixConvert_in_alterTableStatementSuffix427);
                    alterStatementSuffixConvert48=alterStatementSuffixConvert();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixConvert48.getTree());

                    }
                    break;
                case 24 :
                    // AlterClauseParser.g:84:7: alterStatementSuffixRenameBranch
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixRenameBranch_in_alterTableStatementSuffix435);
                    alterStatementSuffixRenameBranch49=alterStatementSuffixRenameBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRenameBranch49.getTree());

                    }
                    break;
                case 25 :
                    // AlterClauseParser.g:85:7: alterStatementSuffixReplaceBranch
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixReplaceBranch_in_alterTableStatementSuffix443);
                    alterStatementSuffixReplaceBranch50=alterStatementSuffixReplaceBranch();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixReplaceBranch50.getTree());

                    }
                    break;
                case 26 :
                    // AlterClauseParser.g:86:7: alterStatementSuffixReplaceTag
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixReplaceTag_in_alterTableStatementSuffix451);
                    alterStatementSuffixReplaceTag51=alterStatementSuffixReplaceTag();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixReplaceTag51.getTree());

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
    // $ANTLR end "alterTableStatementSuffix"


    public static class alterTblPartitionStatementSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterTblPartitionStatementSuffix"
    // AlterClauseParser.g:89:1: alterTblPartitionStatementSuffix[boolean partition] : ( alterStatementSuffixFileFormat[partition] | alterStatementSuffixLocation[partition] | alterStatementSuffixMergeFiles[partition] | alterStatementSuffixSerdeProperties[partition] | alterStatementSuffixRenamePart | alterStatementSuffixBucketNum[partition] | alterTblPartitionStatementSuffixSkewedLocation | alterStatementSuffixClusterbySortby | alterStatementSuffixCompact | alterStatementSuffixUpdateStatsCol[partition] | alterStatementSuffixUpdateStats[partition] | alterStatementSuffixRenameCol | alterStatementSuffixAddCol | alterStatementSuffixUpdateColumns );
    public final HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return alterTblPartitionStatementSuffix(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterTblPartitionStatementSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_AlterClauseParser.alterStatementSuffixFileFormat_return alterStatementSuffixFileFormat52 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixLocation_return alterStatementSuffixLocation53 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixMergeFiles_return alterStatementSuffixMergeFiles54 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixSerdeProperties_return alterStatementSuffixSerdeProperties55 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixRenamePart_return alterStatementSuffixRenamePart56 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixBucketNum_return alterStatementSuffixBucketNum57 =null;

        HiveParser_AlterClauseParser.alterTblPartitionStatementSuffixSkewedLocation_return alterTblPartitionStatementSuffixSkewedLocation58 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixClusterbySortby_return alterStatementSuffixClusterbySortby59 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixCompact_return alterStatementSuffixCompact60 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixUpdateStatsCol_return alterStatementSuffixUpdateStatsCol61 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixUpdateStats_return alterStatementSuffixUpdateStats62 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixRenameCol_return alterStatementSuffixRenameCol63 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixAddCol_return alterStatementSuffixAddCol64 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixUpdateColumns_return alterStatementSuffixUpdateColumns65 =null;



        gParent.pushMsg("alter table partition statement suffix", state);
        try {
            // AlterClauseParser.g:92:3: ( alterStatementSuffixFileFormat[partition] | alterStatementSuffixLocation[partition] | alterStatementSuffixMergeFiles[partition] | alterStatementSuffixSerdeProperties[partition] | alterStatementSuffixRenamePart | alterStatementSuffixBucketNum[partition] | alterTblPartitionStatementSuffixSkewedLocation | alterStatementSuffixClusterbySortby | alterStatementSuffixCompact | alterStatementSuffixUpdateStatsCol[partition] | alterStatementSuffixUpdateStats[partition] | alterStatementSuffixRenameCol | alterStatementSuffixAddCol | alterStatementSuffixUpdateColumns )
            int alt5=14;
            switch ( input.LA(1) ) {
            case KW_SET:
                {
                switch ( input.LA(2) ) {
                case KW_FILEFORMAT:
                    {
                    alt5=1;
                    }
                    break;
                case KW_LOCATION:
                    {
                    alt5=2;
                    }
                    break;
                case KW_SERDE:
                case KW_SERDEPROPERTIES:
                    {
                    alt5=4;
                    }
                    break;
                case KW_SKEWED:
                    {
                    alt5=7;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 1, input);

                    throw nvae;

                }

                }
                break;
            case KW_CONCATENATE:
                {
                alt5=3;
                }
                break;
            case KW_UNSET:
                {
                alt5=4;
                }
                break;
            case KW_RENAME:
                {
                alt5=5;
                }
                break;
            case KW_INTO:
                {
                alt5=6;
                }
                break;
            case KW_CLUSTERED:
            case KW_NOT:
                {
                alt5=8;
                }
                break;
            case KW_COMPACT:
                {
                alt5=9;
                }
                break;
            case KW_UPDATE:
                {
                int LA5_9 = input.LA(2);

                if ( (LA5_9==KW_STATISTICS) ) {
                    int LA5_18 = input.LA(3);

                    if ( (LA5_18==KW_FOR) ) {
                        alt5=10;
                    }
                    else if ( (LA5_18==KW_SET) ) {
                        alt5=11;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 18, input);

                        throw nvae;

                    }
                }
                else if ( (LA5_9==KW_COLUMNS) ) {
                    alt5=14;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 5, 9, input);

                    throw nvae;

                }
                }
                break;
            case KW_CHANGE:
                {
                alt5=12;
                }
                break;
            case KW_ADD:
            case KW_REPLACE:
                {
                alt5=13;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // AlterClauseParser.g:92:5: alterStatementSuffixFileFormat[partition]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixFileFormat_in_alterTblPartitionStatementSuffix477);
                    alterStatementSuffixFileFormat52=alterStatementSuffixFileFormat(partition);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixFileFormat52.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:93:5: alterStatementSuffixLocation[partition]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixLocation_in_alterTblPartitionStatementSuffix484);
                    alterStatementSuffixLocation53=alterStatementSuffixLocation(partition);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixLocation53.getTree());

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:94:5: alterStatementSuffixMergeFiles[partition]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixMergeFiles_in_alterTblPartitionStatementSuffix491);
                    alterStatementSuffixMergeFiles54=alterStatementSuffixMergeFiles(partition);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixMergeFiles54.getTree());

                    }
                    break;
                case 4 :
                    // AlterClauseParser.g:95:5: alterStatementSuffixSerdeProperties[partition]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixSerdeProperties_in_alterTblPartitionStatementSuffix498);
                    alterStatementSuffixSerdeProperties55=alterStatementSuffixSerdeProperties(partition);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixSerdeProperties55.getTree());

                    }
                    break;
                case 5 :
                    // AlterClauseParser.g:96:5: alterStatementSuffixRenamePart
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixRenamePart_in_alterTblPartitionStatementSuffix505);
                    alterStatementSuffixRenamePart56=alterStatementSuffixRenamePart();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRenamePart56.getTree());

                    }
                    break;
                case 6 :
                    // AlterClauseParser.g:97:5: alterStatementSuffixBucketNum[partition]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixBucketNum_in_alterTblPartitionStatementSuffix511);
                    alterStatementSuffixBucketNum57=alterStatementSuffixBucketNum(partition);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixBucketNum57.getTree());

                    }
                    break;
                case 7 :
                    // AlterClauseParser.g:98:5: alterTblPartitionStatementSuffixSkewedLocation
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterTblPartitionStatementSuffixSkewedLocation_in_alterTblPartitionStatementSuffix518);
                    alterTblPartitionStatementSuffixSkewedLocation58=alterTblPartitionStatementSuffixSkewedLocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterTblPartitionStatementSuffixSkewedLocation58.getTree());

                    }
                    break;
                case 8 :
                    // AlterClauseParser.g:99:5: alterStatementSuffixClusterbySortby
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixClusterbySortby_in_alterTblPartitionStatementSuffix524);
                    alterStatementSuffixClusterbySortby59=alterStatementSuffixClusterbySortby();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixClusterbySortby59.getTree());

                    }
                    break;
                case 9 :
                    // AlterClauseParser.g:100:5: alterStatementSuffixCompact
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixCompact_in_alterTblPartitionStatementSuffix530);
                    alterStatementSuffixCompact60=alterStatementSuffixCompact();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixCompact60.getTree());

                    }
                    break;
                case 10 :
                    // AlterClauseParser.g:101:5: alterStatementSuffixUpdateStatsCol[partition]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixUpdateStatsCol_in_alterTblPartitionStatementSuffix536);
                    alterStatementSuffixUpdateStatsCol61=alterStatementSuffixUpdateStatsCol(partition);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUpdateStatsCol61.getTree());

                    }
                    break;
                case 11 :
                    // AlterClauseParser.g:102:5: alterStatementSuffixUpdateStats[partition]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixUpdateStats_in_alterTblPartitionStatementSuffix543);
                    alterStatementSuffixUpdateStats62=alterStatementSuffixUpdateStats(partition);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUpdateStats62.getTree());

                    }
                    break;
                case 12 :
                    // AlterClauseParser.g:103:5: alterStatementSuffixRenameCol
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixRenameCol_in_alterTblPartitionStatementSuffix550);
                    alterStatementSuffixRenameCol63=alterStatementSuffixRenameCol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRenameCol63.getTree());

                    }
                    break;
                case 13 :
                    // AlterClauseParser.g:104:5: alterStatementSuffixAddCol
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixAddCol_in_alterTblPartitionStatementSuffix556);
                    alterStatementSuffixAddCol64=alterStatementSuffixAddCol();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddCol64.getTree());

                    }
                    break;
                case 14 :
                    // AlterClauseParser.g:105:5: alterStatementSuffixUpdateColumns
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixUpdateColumns_in_alterTblPartitionStatementSuffix562);
                    alterStatementSuffixUpdateColumns65=alterStatementSuffixUpdateColumns();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixUpdateColumns65.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            if ( state.backtracking==0 ) {

            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
            }
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterTblPartitionStatementSuffix"


    public static class optimizeTableStatementSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optimizeTableStatementSuffix"
    // AlterClauseParser.g:108:1: optimizeTableStatementSuffix : optimizeTblRewriteDataSuffix ;
    public final HiveParser_AlterClauseParser.optimizeTableStatementSuffix_return optimizeTableStatementSuffix() throws RecognitionException {
        HiveParser_AlterClauseParser.optimizeTableStatementSuffix_return retval = new HiveParser_AlterClauseParser.optimizeTableStatementSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_AlterClauseParser.optimizeTblRewriteDataSuffix_return optimizeTblRewriteDataSuffix66 =null;



         gParent.pushMsg("optimize table statement suffix", state); 
        try {
            // AlterClauseParser.g:111:5: ( optimizeTblRewriteDataSuffix )
            // AlterClauseParser.g:111:7: optimizeTblRewriteDataSuffix
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_optimizeTblRewriteDataSuffix_in_optimizeTableStatementSuffix587);
            optimizeTblRewriteDataSuffix66=optimizeTblRewriteDataSuffix();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, optimizeTblRewriteDataSuffix66.getTree());

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
    // $ANTLR end "optimizeTableStatementSuffix"


    public static class optimizeTblRewriteDataSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "optimizeTblRewriteDataSuffix"
    // AlterClauseParser.g:114:1: optimizeTblRewriteDataSuffix : KW_REWRITE KW_DATA -> ^( TOK_ALTERTABLE_COMPACT Identifier[\"'MAJOR'\"] TOK_BLOCKING ) ;
    public final HiveParser_AlterClauseParser.optimizeTblRewriteDataSuffix_return optimizeTblRewriteDataSuffix() throws RecognitionException {
        HiveParser_AlterClauseParser.optimizeTblRewriteDataSuffix_return retval = new HiveParser_AlterClauseParser.optimizeTblRewriteDataSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_REWRITE67=null;
        Token KW_DATA68=null;

        ASTNode KW_REWRITE67_tree=null;
        ASTNode KW_DATA68_tree=null;
        RewriteRuleTokenStream stream_KW_REWRITE=new RewriteRuleTokenStream(adaptor,"token KW_REWRITE");
        RewriteRuleTokenStream stream_KW_DATA=new RewriteRuleTokenStream(adaptor,"token KW_DATA");

         gParent.msgs.push("compaction request"); 
        try {
            // AlterClauseParser.g:117:5: ( KW_REWRITE KW_DATA -> ^( TOK_ALTERTABLE_COMPACT Identifier[\"'MAJOR'\"] TOK_BLOCKING ) )
            // AlterClauseParser.g:117:7: KW_REWRITE KW_DATA
            {
            KW_REWRITE67=(Token)match(input,KW_REWRITE,FOLLOW_KW_REWRITE_in_optimizeTblRewriteDataSuffix614); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_REWRITE.add(KW_REWRITE67);


            KW_DATA68=(Token)match(input,KW_DATA,FOLLOW_KW_DATA_in_optimizeTblRewriteDataSuffix616); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DATA.add(KW_DATA68);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 118:5: -> ^( TOK_ALTERTABLE_COMPACT Identifier[\"'MAJOR'\"] TOK_BLOCKING )
            {
                // AlterClauseParser.g:118:8: ^( TOK_ALTERTABLE_COMPACT Identifier[\"'MAJOR'\"] TOK_BLOCKING )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_COMPACT, "TOK_ALTERTABLE_COMPACT")
                , root_1);

                adaptor.addChild(root_1, 
                (ASTNode)adaptor.create(Identifier, "'MAJOR'")
                );

                adaptor.addChild(root_1, 
                (ASTNode)adaptor.create(TOK_BLOCKING, "TOK_BLOCKING")
                );

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
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "optimizeTblRewriteDataSuffix"


    public static class alterStatementPartitionKeyType_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementPartitionKeyType"
    // AlterClauseParser.g:121:1: alterStatementPartitionKeyType : KW_PARTITION KW_COLUMN LPAREN columnNameType RPAREN -> ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType ) ;
    public final HiveParser_AlterClauseParser.alterStatementPartitionKeyType_return alterStatementPartitionKeyType() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementPartitionKeyType_return retval = new HiveParser_AlterClauseParser.alterStatementPartitionKeyType_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_PARTITION69=null;
        Token KW_COLUMN70=null;
        Token LPAREN71=null;
        Token RPAREN73=null;
        HiveParser.columnNameType_return columnNameType72 =null;


        ASTNode KW_PARTITION69_tree=null;
        ASTNode KW_COLUMN70_tree=null;
        ASTNode LPAREN71_tree=null;
        ASTNode RPAREN73_tree=null;
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
        RewriteRuleSubtreeStream stream_columnNameType=new RewriteRuleSubtreeStream(adaptor,"rule columnNameType");
        gParent.msgs.push("alter partition key type"); 
        try {
            // AlterClauseParser.g:124:2: ( KW_PARTITION KW_COLUMN LPAREN columnNameType RPAREN -> ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType ) )
            // AlterClauseParser.g:124:4: KW_PARTITION KW_COLUMN LPAREN columnNameType RPAREN
            {
            KW_PARTITION69=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementPartitionKeyType655); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION69);


            KW_COLUMN70=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementPartitionKeyType657); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN70);


            LPAREN71=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementPartitionKeyType659); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN71);


            pushFollow(FOLLOW_columnNameType_in_alterStatementPartitionKeyType661);
            columnNameType72=gHiveParser.columnNameType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNameType.add(columnNameType72.getTree());

            RPAREN73=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementPartitionKeyType663); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN73);


            // AST REWRITE
            // elements: columnNameType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 125:2: -> ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType )
            {
                // AlterClauseParser.g:125:5: ^( TOK_ALTERTABLE_PARTCOLTYPE columnNameType )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_PARTCOLTYPE, "TOK_ALTERTABLE_PARTCOLTYPE")
                , root_1);

                adaptor.addChild(root_1, stream_columnNameType.nextTree());

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
            if ( state.backtracking==0 ) {gParent.msgs.pop();}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterStatementPartitionKeyType"


    public static class alterViewStatementSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterViewStatementSuffix"
    // AlterClauseParser.g:128:1: alterViewStatementSuffix : ( alterViewSuffixProperties | alterStatementSuffixRename[false] | alterStatementSuffixAddPartitions[false] | alterStatementSuffixDropPartitions[false] | selectStatementWithCTE -> ^( TOK_ALTERVIEW_AS selectStatementWithCTE ) );
    public final HiveParser_AlterClauseParser.alterViewStatementSuffix_return alterViewStatementSuffix() throws RecognitionException {
        HiveParser_AlterClauseParser.alterViewStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterViewStatementSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_AlterClauseParser.alterViewSuffixProperties_return alterViewSuffixProperties74 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixRename_return alterStatementSuffixRename75 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return alterStatementSuffixAddPartitions76 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return alterStatementSuffixDropPartitions77 =null;

        HiveParser.selectStatementWithCTE_return selectStatementWithCTE78 =null;


        RewriteRuleSubtreeStream stream_selectStatementWithCTE=new RewriteRuleSubtreeStream(adaptor,"rule selectStatementWithCTE");
         gParent.pushMsg("alter view statement", state); 
        try {
            // AlterClauseParser.g:131:5: ( alterViewSuffixProperties | alterStatementSuffixRename[false] | alterStatementSuffixAddPartitions[false] | alterStatementSuffixDropPartitions[false] | selectStatementWithCTE -> ^( TOK_ALTERVIEW_AS selectStatementWithCTE ) )
            int alt6=5;
            switch ( input.LA(1) ) {
            case KW_SET:
            case KW_UNSET:
                {
                alt6=1;
                }
                break;
            case KW_RENAME:
                {
                alt6=2;
                }
                break;
            case KW_ADD:
                {
                alt6=3;
                }
                break;
            case KW_DROP:
                {
                alt6=4;
                }
                break;
            case KW_MAP:
            case KW_REDUCE:
            case KW_SELECT:
            case KW_VALUES:
            case KW_WITH:
            case LPAREN:
                {
                alt6=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // AlterClauseParser.g:131:7: alterViewSuffixProperties
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterViewSuffixProperties_in_alterViewStatementSuffix696);
                    alterViewSuffixProperties74=alterViewSuffixProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterViewSuffixProperties74.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:132:7: alterStatementSuffixRename[false]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixRename_in_alterViewStatementSuffix704);
                    alterStatementSuffixRename75=alterStatementSuffixRename(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixRename75.getTree());

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:133:7: alterStatementSuffixAddPartitions[false]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixAddPartitions_in_alterViewStatementSuffix713);
                    alterStatementSuffixAddPartitions76=alterStatementSuffixAddPartitions(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixAddPartitions76.getTree());

                    }
                    break;
                case 4 :
                    // AlterClauseParser.g:134:7: alterStatementSuffixDropPartitions[false]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterStatementSuffixDropPartitions_in_alterViewStatementSuffix722);
                    alterStatementSuffixDropPartitions77=alterStatementSuffixDropPartitions(false);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterStatementSuffixDropPartitions77.getTree());

                    }
                    break;
                case 5 :
                    // AlterClauseParser.g:135:7: selectStatementWithCTE
                    {
                    pushFollow(FOLLOW_selectStatementWithCTE_in_alterViewStatementSuffix731);
                    selectStatementWithCTE78=gHiveParser.selectStatementWithCTE();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_selectStatementWithCTE.add(selectStatementWithCTE78.getTree());

                    // AST REWRITE
                    // elements: selectStatementWithCTE
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 135:30: -> ^( TOK_ALTERVIEW_AS selectStatementWithCTE )
                    {
                        // AlterClauseParser.g:135:33: ^( TOK_ALTERVIEW_AS selectStatementWithCTE )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERVIEW_AS, "TOK_ALTERVIEW_AS")
                        , root_1);

                        adaptor.addChild(root_1, stream_selectStatementWithCTE.nextTree());

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
    // $ANTLR end "alterViewStatementSuffix"


    public static class alterMaterializedViewStatementSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterMaterializedViewStatementSuffix"
    // AlterClauseParser.g:138:1: alterMaterializedViewStatementSuffix[CommonTree tableNameTree] : ( alterMaterializedViewSuffixRewrite[tableNameTree] | alterMaterializedViewSuffixRebuild[tableNameTree] );
    public final HiveParser_AlterClauseParser.alterMaterializedViewStatementSuffix_return alterMaterializedViewStatementSuffix(CommonTree tableNameTree) throws RecognitionException {
        HiveParser_AlterClauseParser.alterMaterializedViewStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterMaterializedViewStatementSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_AlterClauseParser.alterMaterializedViewSuffixRewrite_return alterMaterializedViewSuffixRewrite79 =null;

        HiveParser_AlterClauseParser.alterMaterializedViewSuffixRebuild_return alterMaterializedViewSuffixRebuild80 =null;



         gParent.pushMsg("alter materialized view statement", state); 
        try {
            // AlterClauseParser.g:141:5: ( alterMaterializedViewSuffixRewrite[tableNameTree] | alterMaterializedViewSuffixRebuild[tableNameTree] )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==KW_DISABLE||LA7_0==KW_ENABLE) ) {
                alt7=1;
            }
            else if ( (LA7_0==KW_REBUILD) ) {
                alt7=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // AlterClauseParser.g:141:7: alterMaterializedViewSuffixRewrite[tableNameTree]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterMaterializedViewSuffixRewrite_in_alterMaterializedViewStatementSuffix767);
                    alterMaterializedViewSuffixRewrite79=alterMaterializedViewSuffixRewrite(tableNameTree);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterMaterializedViewSuffixRewrite79.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:142:7: alterMaterializedViewSuffixRebuild[tableNameTree]
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterMaterializedViewSuffixRebuild_in_alterMaterializedViewStatementSuffix776);
                    alterMaterializedViewSuffixRebuild80=alterMaterializedViewSuffixRebuild(tableNameTree);

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterMaterializedViewSuffixRebuild80.getTree());

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
    // $ANTLR end "alterMaterializedViewStatementSuffix"


    public static class alterMaterializedViewSuffixRewrite_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterMaterializedViewSuffixRewrite"
    // AlterClauseParser.g:145:1: alterMaterializedViewSuffixRewrite[CommonTree tableNameTree] : (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled ) -> ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag) ;
    public final HiveParser_AlterClauseParser.alterMaterializedViewSuffixRewrite_return alterMaterializedViewSuffixRewrite(CommonTree tableNameTree) throws RecognitionException {
        HiveParser_AlterClauseParser.alterMaterializedViewSuffixRewrite_return retval = new HiveParser_AlterClauseParser.alterMaterializedViewSuffixRewrite_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser.rewriteEnabled_return mvRewriteFlag =null;


        RewriteRuleSubtreeStream stream_rewriteEnabled=new RewriteRuleSubtreeStream(adaptor,"rule rewriteEnabled");
        RewriteRuleSubtreeStream stream_rewriteDisabled=new RewriteRuleSubtreeStream(adaptor,"rule rewriteDisabled");
         gParent.pushMsg("alter materialized view rewrite statement", state); 
        try {
            // AlterClauseParser.g:148:5: ( (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled ) -> ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag) )
            // AlterClauseParser.g:148:7: (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled )
            {
            // AlterClauseParser.g:148:7: (mvRewriteFlag= rewriteEnabled |mvRewriteFlag= rewriteDisabled )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==KW_ENABLE) ) {
                alt8=1;
            }
            else if ( (LA8_0==KW_DISABLE) ) {
                alt8=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // AlterClauseParser.g:148:8: mvRewriteFlag= rewriteEnabled
                    {
                    pushFollow(FOLLOW_rewriteEnabled_in_alterMaterializedViewSuffixRewrite808);
                    mvRewriteFlag=gHiveParser.rewriteEnabled();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rewriteEnabled.add(mvRewriteFlag.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:148:39: mvRewriteFlag= rewriteDisabled
                    {
                    pushFollow(FOLLOW_rewriteDisabled_in_alterMaterializedViewSuffixRewrite814);
//                    mvRewriteFlag=gHiveParser.rewriteDisabled();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_rewriteDisabled.add(mvRewriteFlag.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: mvRewriteFlag
            // token labels: 
            // rule labels: mvRewriteFlag, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_mvRewriteFlag=new RewriteRuleSubtreeStream(adaptor,"rule mvRewriteFlag",mvRewriteFlag!=null?mvRewriteFlag.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 149:5: -> ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag)
            {
                // AlterClauseParser.g:149:8: ^( TOK_ALTER_MATERIALIZED_VIEW_REWRITE $mvRewriteFlag)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTER_MATERIALIZED_VIEW_REWRITE, "TOK_ALTER_MATERIALIZED_VIEW_REWRITE")
                , root_1);

                adaptor.addChild(root_1, tableNameTree);

                adaptor.addChild(root_1, stream_mvRewriteFlag.nextTree());

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
    // $ANTLR end "alterMaterializedViewSuffixRewrite"


    public static class alterMaterializedViewSuffixRebuild_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterMaterializedViewSuffixRebuild"
    // AlterClauseParser.g:152:1: alterMaterializedViewSuffixRebuild[CommonTree tableNameTree] : KW_REBUILD -> ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD ) ;
    public final HiveParser_AlterClauseParser.alterMaterializedViewSuffixRebuild_return alterMaterializedViewSuffixRebuild(CommonTree tableNameTree) throws RecognitionException {
        HiveParser_AlterClauseParser.alterMaterializedViewSuffixRebuild_return retval = new HiveParser_AlterClauseParser.alterMaterializedViewSuffixRebuild_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_REBUILD81=null;

        ASTNode KW_REBUILD81_tree=null;
        RewriteRuleTokenStream stream_KW_REBUILD=new RewriteRuleTokenStream(adaptor,"token KW_REBUILD");

         gParent.pushMsg("alter materialized view rebuild statement", state); 
        try {
            // AlterClauseParser.g:155:5: ( KW_REBUILD -> ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD ) )
            // AlterClauseParser.g:155:7: KW_REBUILD
            {
            KW_REBUILD81=(Token)match(input,KW_REBUILD,FOLLOW_KW_REBUILD_in_alterMaterializedViewSuffixRebuild858); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_REBUILD.add(KW_REBUILD81);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 155:18: -> ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD )
            {
                // AlterClauseParser.g:155:21: ^( TOK_ALTER_MATERIALIZED_VIEW_REBUILD )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTER_MATERIALIZED_VIEW_REBUILD, "TOK_ALTER_MATERIALIZED_VIEW_REBUILD")
                , root_1);

                adaptor.addChild(root_1, tableNameTree);

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
    // $ANTLR end "alterMaterializedViewSuffixRebuild"


    public static class alterDatabaseStatementSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDatabaseStatementSuffix"
    // AlterClauseParser.g:158:1: alterDatabaseStatementSuffix : ( alterDatabaseSuffixProperties | alterDatabaseSuffixSetOwner | alterDatabaseSuffixSetLocation );
    public final HiveParser_AlterClauseParser.alterDatabaseStatementSuffix_return alterDatabaseStatementSuffix() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDatabaseStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterDatabaseStatementSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_AlterClauseParser.alterDatabaseSuffixProperties_return alterDatabaseSuffixProperties82 =null;

        HiveParser_AlterClauseParser.alterDatabaseSuffixSetOwner_return alterDatabaseSuffixSetOwner83 =null;

        HiveParser_AlterClauseParser.alterDatabaseSuffixSetLocation_return alterDatabaseSuffixSetLocation84 =null;



         gParent.pushMsg("alter database statement", state); 
        try {
            // AlterClauseParser.g:161:5: ( alterDatabaseSuffixProperties | alterDatabaseSuffixSetOwner | alterDatabaseSuffixSetLocation )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Identifier) ) {
                int LA9_1 = input.LA(2);

                if ( (LA9_1==KW_SET) ) {
                    switch ( input.LA(3) ) {
                    case KW_DBPROPERTIES:
                        {
                        alt9=1;
                        }
                        break;
                    case KW_OWNER:
                        {
                        alt9=2;
                        }
                        break;
                    case KW_LOCATION:
                    case KW_MANAGEDLOCATION:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 3, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA9_0 >= KW_ABORT && LA9_0 <= KW_AFTER)||LA9_0==KW_ALLOC_FRACTION||LA9_0==KW_ANALYZE||LA9_0==KW_ARCHIVE||(LA9_0 >= KW_ASC && LA9_0 <= KW_AT)||(LA9_0 >= KW_AUTOCOMMIT && LA9_0 <= KW_BEFORE)||(LA9_0 >= KW_BRANCH && LA9_0 <= KW_BUCKETS)||(LA9_0 >= KW_CACHE && LA9_0 <= KW_CASCADE)||(LA9_0 >= KW_CBO && LA9_0 <= KW_CHANGE)||LA9_0==KW_CHECK||(LA9_0 >= KW_CLUSTER && LA9_0 <= KW_COLLECTION)||(LA9_0 >= KW_COLUMNS && LA9_0 <= KW_COMMENT)||(LA9_0 >= KW_COMPACT && LA9_0 <= KW_COMPACTIONS)||(LA9_0 >= KW_COMPUTE && LA9_0 <= KW_CONCATENATE)||LA9_0==KW_CONTINUE||LA9_0==KW_COST||LA9_0==KW_CRON||LA9_0==KW_DATA||LA9_0==KW_DATABASES||(LA9_0 >= KW_DATETIME && LA9_0 <= KW_DCPROPERTIES)||LA9_0==KW_DEBUG||(LA9_0 >= KW_DEFAULT && LA9_0 <= KW_DEFINED)||(LA9_0 >= KW_DELIMITED && LA9_0 <= KW_DESC)||(LA9_0 >= KW_DETAIL && LA9_0 <= KW_DISABLE)||(LA9_0 >= KW_DISTRIBUTE && LA9_0 <= KW_DO)||LA9_0==KW_DOW||(LA9_0 >= KW_DUMP && LA9_0 <= KW_ELEM_TYPE)||LA9_0==KW_ENABLE||(LA9_0 >= KW_ENFORCED && LA9_0 <= KW_EVERY)||(LA9_0 >= KW_EXCLUSIVE && LA9_0 <= KW_EXECUTED)||(LA9_0 >= KW_EXPIRE_SNAPSHOTS && LA9_0 <= KW_EXPRESSION)||LA9_0==KW_FAST_FORWARD||(LA9_0 >= KW_FIELDS && LA9_0 <= KW_FIRST)||(LA9_0 >= KW_FORMAT && LA9_0 <= KW_FORMATTED)||LA9_0==KW_FUNCTIONS||(LA9_0 >= KW_HOUR && LA9_0 <= KW_IDXPROPERTIES)||LA9_0==KW_IGNORE||(LA9_0 >= KW_INDEX && LA9_0 <= KW_INDEXES)||(LA9_0 >= KW_INPATH && LA9_0 <= KW_INPUTFORMAT)||(LA9_0 >= KW_ISOLATION && LA9_0 <= KW_JAR)||(LA9_0 >= KW_JOINCOST && LA9_0 <= KW_LAST)||LA9_0==KW_LEVEL||(LA9_0 >= KW_LIMIT && LA9_0 <= KW_LOAD)||(LA9_0 >= KW_LOCATION && LA9_0 <= KW_LONG)||(LA9_0 >= KW_MANAGED && LA9_0 <= KW_MANAGEMENT)||(LA9_0 >= KW_MAPJOIN && LA9_0 <= KW_MATERIALIZED)||LA9_0==KW_METADATA||(LA9_0 >= KW_MINUTE && LA9_0 <= KW_MONTH)||(LA9_0 >= KW_MOVE && LA9_0 <= KW_MSCK)||(LA9_0 >= KW_NORELY && LA9_0 <= KW_NOSCAN)||LA9_0==KW_NOVALIDATE||LA9_0==KW_NULLS||LA9_0==KW_OFFSET||(LA9_0 >= KW_OPERATOR && LA9_0 <= KW_OPTION)||(LA9_0 >= KW_OUTPUTDRIVER && LA9_0 <= KW_OUTPUTFORMAT)||(LA9_0 >= KW_OVERWRITE && LA9_0 <= KW_OWNER)||(LA9_0 >= KW_PARTITIONED && LA9_0 <= KW_PATH)||(LA9_0 >= KW_PLAN && LA9_0 <= KW_POOL)||LA9_0==KW_PRINCIPALS||LA9_0==KW_PURGE||(LA9_0 >= KW_QUARTER && LA9_0 <= KW_QUERY_PARALLELISM)||LA9_0==KW_READ||(LA9_0 >= KW_REBUILD && LA9_0 <= KW_RECORDWRITER)||(LA9_0 >= KW_RELOAD && LA9_0 <= KW_RETENTION)||LA9_0==KW_REWRITE||(LA9_0 >= KW_ROLE && LA9_0 <= KW_ROLES)||(LA9_0 >= KW_SCHEDULED && LA9_0 <= KW_SECOND)||(LA9_0 >= KW_SEMI && LA9_0 <= KW_SERVER)||(LA9_0 >= KW_SETS && LA9_0 <= KW_SKEWED)||(LA9_0 >= KW_SNAPSHOT && LA9_0 <= KW_SNAPSHOTS)||(LA9_0 >= KW_SORT && LA9_0 <= KW_SSL)||(LA9_0 >= KW_STATISTICS && LA9_0 <= KW_SUMMARY)||(LA9_0 >= KW_SYSTEM_TIME && LA9_0 <= KW_SYSTEM_VERSION)||LA9_0==KW_TABLES||(LA9_0 >= KW_TAG && LA9_0 <= KW_TERMINATED)||LA9_0==KW_TINYINT||LA9_0==KW_TOUCH||(LA9_0 >= KW_TRANSACTION && LA9_0 <= KW_TRANSACTIONS)||LA9_0==KW_TRIM||(LA9_0 >= KW_TYPE && LA9_0 <= KW_UNARCHIVE)||LA9_0==KW_UNDO||LA9_0==KW_UNIONTYPE||(LA9_0 >= KW_UNKNOWN && LA9_0 <= KW_UNSIGNED)||(LA9_0 >= KW_URI && LA9_0 <= KW_USE)||(LA9_0 >= KW_UTC && LA9_0 <= KW_VALIDATE)||LA9_0==KW_VALUE_TYPE||(LA9_0 >= KW_VECTORIZATION && LA9_0 <= KW_WEEK)||LA9_0==KW_WHILE||(LA9_0 >= KW_WITHIN && LA9_0 <= KW_ZONE)||LA9_0==KW_BATCH||LA9_0==KW_DAYOFWEEK||LA9_0==KW_HOLD_DDLTIME||LA9_0==KW_NO_DROP||LA9_0==KW_OFFLINE||LA9_0==KW_PROTECTION||LA9_0==KW_READONLY||LA9_0==KW_TIMESTAMPTZ) ) {
                int LA9_2 = input.LA(2);

                if ( (LA9_2==KW_SET) ) {
                    switch ( input.LA(3) ) {
                    case KW_DBPROPERTIES:
                        {
                        alt9=1;
                        }
                        break;
                    case KW_OWNER:
                        {
                        alt9=2;
                        }
                        break;
                    case KW_LOCATION:
                    case KW_MANAGEDLOCATION:
                        {
                        alt9=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 9, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 9, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // AlterClauseParser.g:161:7: alterDatabaseSuffixProperties
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterDatabaseSuffixProperties_in_alterDatabaseStatementSuffix893);
                    alterDatabaseSuffixProperties82=alterDatabaseSuffixProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDatabaseSuffixProperties82.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:162:7: alterDatabaseSuffixSetOwner
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterDatabaseSuffixSetOwner_in_alterDatabaseStatementSuffix901);
                    alterDatabaseSuffixSetOwner83=alterDatabaseSuffixSetOwner();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDatabaseSuffixSetOwner83.getTree());

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:163:7: alterDatabaseSuffixSetLocation
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterDatabaseSuffixSetLocation_in_alterDatabaseStatementSuffix909);
                    alterDatabaseSuffixSetLocation84=alterDatabaseSuffixSetLocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDatabaseSuffixSetLocation84.getTree());

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
    // $ANTLR end "alterDatabaseStatementSuffix"


    public static class alterDatabaseSuffixProperties_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDatabaseSuffixProperties"
    // AlterClauseParser.g:166:1: alterDatabaseSuffixProperties : name= identifier KW_SET KW_DBPROPERTIES dbProperties -> ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties ) ;
    public final HiveParser_AlterClauseParser.alterDatabaseSuffixProperties_return alterDatabaseSuffixProperties() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDatabaseSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixProperties_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET85=null;
        Token KW_DBPROPERTIES86=null;
        HiveParser_IdentifiersParser.identifier_return name =null;

        HiveParser.dbProperties_return dbProperties87 =null;


        ASTNode KW_SET85_tree=null;
        ASTNode KW_DBPROPERTIES86_tree=null;
        RewriteRuleTokenStream stream_KW_DBPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_DBPROPERTIES");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_dbProperties=new RewriteRuleSubtreeStream(adaptor,"rule dbProperties");
         gParent.pushMsg("alter database properties statement", state); 
        try {
            // AlterClauseParser.g:169:5: (name= identifier KW_SET KW_DBPROPERTIES dbProperties -> ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties ) )
            // AlterClauseParser.g:169:7: name= identifier KW_SET KW_DBPROPERTIES dbProperties
            {
            pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixProperties938);
            name=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(name.getTree());

            KW_SET85=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixProperties940); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET85);


            KW_DBPROPERTIES86=(Token)match(input,KW_DBPROPERTIES,FOLLOW_KW_DBPROPERTIES_in_alterDatabaseSuffixProperties942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DBPROPERTIES.add(KW_DBPROPERTIES86);


            pushFollow(FOLLOW_dbProperties_in_alterDatabaseSuffixProperties944);
            dbProperties87=gHiveParser.dbProperties();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dbProperties.add(dbProperties87.getTree());

            // AST REWRITE
            // elements: dbProperties, name
            // token labels: 
            // rule labels: name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 170:5: -> ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties )
            {
                // AlterClauseParser.g:170:8: ^( TOK_ALTERDATABASE_PROPERTIES $name dbProperties )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERDATABASE_PROPERTIES, "TOK_ALTERDATABASE_PROPERTIES")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                adaptor.addChild(root_1, stream_dbProperties.nextTree());

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
    // $ANTLR end "alterDatabaseSuffixProperties"


    public static class alterDatabaseSuffixSetOwner_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDatabaseSuffixSetOwner"
    // AlterClauseParser.g:173:1: alterDatabaseSuffixSetOwner : dbName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATABASE_OWNER $dbName principalName ) ;
    public final HiveParser_AlterClauseParser.alterDatabaseSuffixSetOwner_return alterDatabaseSuffixSetOwner() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDatabaseSuffixSetOwner_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixSetOwner_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET88=null;
        Token KW_OWNER89=null;
        HiveParser_IdentifiersParser.identifier_return dbName =null;

        HiveParser.principalName_return principalName90 =null;


        ASTNode KW_SET88_tree=null;
        ASTNode KW_OWNER89_tree=null;
        RewriteRuleTokenStream stream_KW_OWNER=new RewriteRuleTokenStream(adaptor,"token KW_OWNER");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_principalName=new RewriteRuleSubtreeStream(adaptor,"rule principalName");
         gParent.pushMsg("alter database set owner", state); 
        try {
            // AlterClauseParser.g:176:5: (dbName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATABASE_OWNER $dbName principalName ) )
            // AlterClauseParser.g:176:7: dbName= identifier KW_SET KW_OWNER principalName
            {
            pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetOwner988);
            dbName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());

            KW_SET88=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetOwner990); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET88);


            KW_OWNER89=(Token)match(input,KW_OWNER,FOLLOW_KW_OWNER_in_alterDatabaseSuffixSetOwner992); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OWNER.add(KW_OWNER89);


            pushFollow(FOLLOW_principalName_in_alterDatabaseSuffixSetOwner994);
            principalName90=gHiveParser.principalName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_principalName.add(principalName90.getTree());

            // AST REWRITE
            // elements: dbName, principalName
            // token labels: 
            // rule labels: dbName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 177:5: -> ^( TOK_ALTERDATABASE_OWNER $dbName principalName )
            {
                // AlterClauseParser.g:177:8: ^( TOK_ALTERDATABASE_OWNER $dbName principalName )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERDATABASE_OWNER, "TOK_ALTERDATABASE_OWNER")
                , root_1);

                adaptor.addChild(root_1, stream_dbName.nextTree());

                adaptor.addChild(root_1, stream_principalName.nextTree());

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
    // $ANTLR end "alterDatabaseSuffixSetOwner"


    public static class alterDatabaseSuffixSetLocation_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDatabaseSuffixSetLocation"
    // AlterClauseParser.g:180:1: alterDatabaseSuffixSetLocation : (dbName= identifier KW_SET KW_LOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation) |dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) );
    public final HiveParser_AlterClauseParser.alterDatabaseSuffixSetLocation_return alterDatabaseSuffixSetLocation() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDatabaseSuffixSetLocation_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixSetLocation_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token newLocation=null;
        Token KW_SET91=null;
        Token KW_LOCATION92=null;
        Token KW_SET93=null;
        Token KW_MANAGEDLOCATION94=null;
        HiveParser_IdentifiersParser.identifier_return dbName =null;


        ASTNode newLocation_tree=null;
        ASTNode KW_SET91_tree=null;
        ASTNode KW_LOCATION92_tree=null;
        ASTNode KW_SET93_tree=null;
        ASTNode KW_MANAGEDLOCATION94_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");
        RewriteRuleTokenStream stream_KW_MANAGEDLOCATION=new RewriteRuleTokenStream(adaptor,"token KW_MANAGEDLOCATION");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("alter database set location", state); 
        try {
            // AlterClauseParser.g:183:5: (dbName= identifier KW_SET KW_LOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation) |dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==Identifier) ) {
                int LA10_1 = input.LA(2);

                if ( (LA10_1==KW_SET) ) {
                    int LA10_3 = input.LA(3);

                    if ( (LA10_3==KW_LOCATION) ) {
                        alt10=1;
                    }
                    else if ( (LA10_3==KW_MANAGEDLOCATION) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA10_0 >= KW_ABORT && LA10_0 <= KW_AFTER)||LA10_0==KW_ALLOC_FRACTION||LA10_0==KW_ANALYZE||LA10_0==KW_ARCHIVE||(LA10_0 >= KW_ASC && LA10_0 <= KW_AT)||(LA10_0 >= KW_AUTOCOMMIT && LA10_0 <= KW_BEFORE)||(LA10_0 >= KW_BRANCH && LA10_0 <= KW_BUCKETS)||(LA10_0 >= KW_CACHE && LA10_0 <= KW_CASCADE)||(LA10_0 >= KW_CBO && LA10_0 <= KW_CHANGE)||LA10_0==KW_CHECK||(LA10_0 >= KW_CLUSTER && LA10_0 <= KW_COLLECTION)||(LA10_0 >= KW_COLUMNS && LA10_0 <= KW_COMMENT)||(LA10_0 >= KW_COMPACT && LA10_0 <= KW_COMPACTIONS)||(LA10_0 >= KW_COMPUTE && LA10_0 <= KW_CONCATENATE)||LA10_0==KW_CONTINUE||LA10_0==KW_COST||LA10_0==KW_CRON||LA10_0==KW_DATA||LA10_0==KW_DATABASES||(LA10_0 >= KW_DATETIME && LA10_0 <= KW_DCPROPERTIES)||LA10_0==KW_DEBUG||(LA10_0 >= KW_DEFAULT && LA10_0 <= KW_DEFINED)||(LA10_0 >= KW_DELIMITED && LA10_0 <= KW_DESC)||(LA10_0 >= KW_DETAIL && LA10_0 <= KW_DISABLE)||(LA10_0 >= KW_DISTRIBUTE && LA10_0 <= KW_DO)||LA10_0==KW_DOW||(LA10_0 >= KW_DUMP && LA10_0 <= KW_ELEM_TYPE)||LA10_0==KW_ENABLE||(LA10_0 >= KW_ENFORCED && LA10_0 <= KW_EVERY)||(LA10_0 >= KW_EXCLUSIVE && LA10_0 <= KW_EXECUTED)||(LA10_0 >= KW_EXPIRE_SNAPSHOTS && LA10_0 <= KW_EXPRESSION)||LA10_0==KW_FAST_FORWARD||(LA10_0 >= KW_FIELDS && LA10_0 <= KW_FIRST)||(LA10_0 >= KW_FORMAT && LA10_0 <= KW_FORMATTED)||LA10_0==KW_FUNCTIONS||(LA10_0 >= KW_HOUR && LA10_0 <= KW_IDXPROPERTIES)||LA10_0==KW_IGNORE||(LA10_0 >= KW_INDEX && LA10_0 <= KW_INDEXES)||(LA10_0 >= KW_INPATH && LA10_0 <= KW_INPUTFORMAT)||(LA10_0 >= KW_ISOLATION && LA10_0 <= KW_JAR)||(LA10_0 >= KW_JOINCOST && LA10_0 <= KW_LAST)||LA10_0==KW_LEVEL||(LA10_0 >= KW_LIMIT && LA10_0 <= KW_LOAD)||(LA10_0 >= KW_LOCATION && LA10_0 <= KW_LONG)||(LA10_0 >= KW_MANAGED && LA10_0 <= KW_MANAGEMENT)||(LA10_0 >= KW_MAPJOIN && LA10_0 <= KW_MATERIALIZED)||LA10_0==KW_METADATA||(LA10_0 >= KW_MINUTE && LA10_0 <= KW_MONTH)||(LA10_0 >= KW_MOVE && LA10_0 <= KW_MSCK)||(LA10_0 >= KW_NORELY && LA10_0 <= KW_NOSCAN)||LA10_0==KW_NOVALIDATE||LA10_0==KW_NULLS||LA10_0==KW_OFFSET||(LA10_0 >= KW_OPERATOR && LA10_0 <= KW_OPTION)||(LA10_0 >= KW_OUTPUTDRIVER && LA10_0 <= KW_OUTPUTFORMAT)||(LA10_0 >= KW_OVERWRITE && LA10_0 <= KW_OWNER)||(LA10_0 >= KW_PARTITIONED && LA10_0 <= KW_PATH)||(LA10_0 >= KW_PLAN && LA10_0 <= KW_POOL)||LA10_0==KW_PRINCIPALS||LA10_0==KW_PURGE||(LA10_0 >= KW_QUARTER && LA10_0 <= KW_QUERY_PARALLELISM)||LA10_0==KW_READ||(LA10_0 >= KW_REBUILD && LA10_0 <= KW_RECORDWRITER)||(LA10_0 >= KW_RELOAD && LA10_0 <= KW_RETENTION)||LA10_0==KW_REWRITE||(LA10_0 >= KW_ROLE && LA10_0 <= KW_ROLES)||(LA10_0 >= KW_SCHEDULED && LA10_0 <= KW_SECOND)||(LA10_0 >= KW_SEMI && LA10_0 <= KW_SERVER)||(LA10_0 >= KW_SETS && LA10_0 <= KW_SKEWED)||(LA10_0 >= KW_SNAPSHOT && LA10_0 <= KW_SNAPSHOTS)||(LA10_0 >= KW_SORT && LA10_0 <= KW_SSL)||(LA10_0 >= KW_STATISTICS && LA10_0 <= KW_SUMMARY)||(LA10_0 >= KW_SYSTEM_TIME && LA10_0 <= KW_SYSTEM_VERSION)||LA10_0==KW_TABLES||(LA10_0 >= KW_TAG && LA10_0 <= KW_TERMINATED)||LA10_0==KW_TINYINT||LA10_0==KW_TOUCH||(LA10_0 >= KW_TRANSACTION && LA10_0 <= KW_TRANSACTIONS)||LA10_0==KW_TRIM||(LA10_0 >= KW_TYPE && LA10_0 <= KW_UNARCHIVE)||LA10_0==KW_UNDO||LA10_0==KW_UNIONTYPE||(LA10_0 >= KW_UNKNOWN && LA10_0 <= KW_UNSIGNED)||(LA10_0 >= KW_URI && LA10_0 <= KW_USE)||(LA10_0 >= KW_UTC && LA10_0 <= KW_VALIDATE)||LA10_0==KW_VALUE_TYPE||(LA10_0 >= KW_VECTORIZATION && LA10_0 <= KW_WEEK)||LA10_0==KW_WHILE||(LA10_0 >= KW_WITHIN && LA10_0 <= KW_ZONE)||LA10_0==KW_BATCH||LA10_0==KW_DAYOFWEEK||LA10_0==KW_HOLD_DDLTIME||LA10_0==KW_NO_DROP||LA10_0==KW_OFFLINE||LA10_0==KW_PROTECTION||LA10_0==KW_READONLY||LA10_0==KW_TIMESTAMPTZ) ) {
                int LA10_2 = input.LA(2);

                if ( (LA10_2==KW_SET) ) {
                    int LA10_4 = input.LA(3);

                    if ( (LA10_4==KW_LOCATION) ) {
                        alt10=1;
                    }
                    else if ( (LA10_4==KW_MANAGEDLOCATION) ) {
                        alt10=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 4, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 10, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // AlterClauseParser.g:183:7: dbName= identifier KW_SET KW_LOCATION newLocation= StringLiteral
                    {
                    pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetLocation1038);
                    dbName=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());

                    KW_SET91=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation1040); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET91);


                    KW_LOCATION92=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_alterDatabaseSuffixSetLocation1042); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION92);


                    newLocation=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation1046); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(newLocation);


                    // AST REWRITE
                    // elements: dbName, newLocation
                    // token labels: newLocation
                    // rule labels: dbName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_newLocation=new RewriteRuleTokenStream(adaptor,"token newLocation",newLocation);
                    RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 184:5: -> ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation)
                    {
                        // AlterClauseParser.g:184:8: ^( TOK_ALTERDATABASE_LOCATION $dbName $newLocation)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERDATABASE_LOCATION, "TOK_ALTERDATABASE_LOCATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_dbName.nextTree());

                        adaptor.addChild(root_1, stream_newLocation.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:185:7: dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral
                    {
                    pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetLocation1072);
                    dbName=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());

                    KW_SET93=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation1074); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET93);


                    KW_MANAGEDLOCATION94=(Token)match(input,KW_MANAGEDLOCATION,FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetLocation1076); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_MANAGEDLOCATION.add(KW_MANAGEDLOCATION94);


                    newLocation=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation1080); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(newLocation);


                    // AST REWRITE
                    // elements: newLocation, dbName
                    // token labels: newLocation
                    // rule labels: dbName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_newLocation=new RewriteRuleTokenStream(adaptor,"token newLocation",newLocation);
                    RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 186:5: -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
                    {
                        // AlterClauseParser.g:186:8: ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERDATABASE_MANAGEDLOCATION, "TOK_ALTERDATABASE_MANAGEDLOCATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_dbName.nextTree());

                        adaptor.addChild(root_1, stream_newLocation.nextNode());

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
    // $ANTLR end "alterDatabaseSuffixSetLocation"


    public static class alterDatabaseSuffixSetManagedLocation_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDatabaseSuffixSetManagedLocation"
    // AlterClauseParser.g:189:1: alterDatabaseSuffixSetManagedLocation : dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) ;
    public final HiveParser_AlterClauseParser.alterDatabaseSuffixSetManagedLocation_return alterDatabaseSuffixSetManagedLocation() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDatabaseSuffixSetManagedLocation_return retval = new HiveParser_AlterClauseParser.alterDatabaseSuffixSetManagedLocation_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token newLocation=null;
        Token KW_SET95=null;
        Token KW_MANAGEDLOCATION96=null;
        HiveParser_IdentifiersParser.identifier_return dbName =null;


        ASTNode newLocation_tree=null;
        ASTNode KW_SET95_tree=null;
        ASTNode KW_MANAGEDLOCATION96_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_MANAGEDLOCATION=new RewriteRuleTokenStream(adaptor,"token KW_MANAGEDLOCATION");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("alter database set managed location", state); 
        try {
            // AlterClauseParser.g:192:5: (dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation) )
            // AlterClauseParser.g:192:7: dbName= identifier KW_SET KW_MANAGEDLOCATION newLocation= StringLiteral
            {
            pushFollow(FOLLOW_identifier_in_alterDatabaseSuffixSetManagedLocation1125);
            dbName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(dbName.getTree());

            KW_SET95=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDatabaseSuffixSetManagedLocation1127); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET95);


            KW_MANAGEDLOCATION96=(Token)match(input,KW_MANAGEDLOCATION,FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetManagedLocation1129); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_MANAGEDLOCATION.add(KW_MANAGEDLOCATION96);


            newLocation=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDatabaseSuffixSetManagedLocation1133); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(newLocation);


            // AST REWRITE
            // elements: newLocation, dbName
            // token labels: newLocation
            // rule labels: dbName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_newLocation=new RewriteRuleTokenStream(adaptor,"token newLocation",newLocation);
            RewriteRuleSubtreeStream stream_dbName=new RewriteRuleSubtreeStream(adaptor,"rule dbName",dbName!=null?dbName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 193:5: -> ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
            {
                // AlterClauseParser.g:193:8: ^( TOK_ALTERDATABASE_MANAGEDLOCATION $dbName $newLocation)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERDATABASE_MANAGEDLOCATION, "TOK_ALTERDATABASE_MANAGEDLOCATION")
                , root_1);

                adaptor.addChild(root_1, stream_dbName.nextTree());

                adaptor.addChild(root_1, stream_newLocation.nextNode());

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
    // $ANTLR end "alterDatabaseSuffixSetManagedLocation"


    public static class alterStatementSuffixRename_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixRename"
    // AlterClauseParser.g:196:1: alterStatementSuffixRename[boolean table] : KW_RENAME KW_TO tableName -> { table }? ^( TOK_ALTERTABLE_RENAME tableName ) -> ^( TOK_ALTERVIEW_RENAME tableName ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixRename_return alterStatementSuffixRename(boolean table) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixRename_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixRename_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_RENAME97=null;
        Token KW_TO98=null;
        HiveParser_FromClauseParser.tableName_return tableName99 =null;


        ASTNode KW_RENAME97_tree=null;
        ASTNode KW_TO98_tree=null;
        RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
         gParent.pushMsg("rename statement", state); 
        try {
            // AlterClauseParser.g:199:5: ( KW_RENAME KW_TO tableName -> { table }? ^( TOK_ALTERTABLE_RENAME tableName ) -> ^( TOK_ALTERVIEW_RENAME tableName ) )
            // AlterClauseParser.g:199:7: KW_RENAME KW_TO tableName
            {
            KW_RENAME97=(Token)match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterStatementSuffixRename1177); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RENAME.add(KW_RENAME97);


            KW_TO98=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterStatementSuffixRename1179); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO98);


            pushFollow(FOLLOW_tableName_in_alterStatementSuffixRename1181);
            tableName99=gHiveParser.tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tableName99.getTree());

            // AST REWRITE
            // elements: tableName, tableName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 200:5: -> { table }? ^( TOK_ALTERTABLE_RENAME tableName )
            if ( table ) {
                // AlterClauseParser.g:200:19: ^( TOK_ALTERTABLE_RENAME tableName )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_RENAME, "TOK_ALTERTABLE_RENAME")
                , root_1);

                adaptor.addChild(root_1, stream_tableName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 201:5: -> ^( TOK_ALTERVIEW_RENAME tableName )
            {
                // AlterClauseParser.g:201:19: ^( TOK_ALTERVIEW_RENAME tableName )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERVIEW_RENAME, "TOK_ALTERVIEW_RENAME")
                , root_1);

                adaptor.addChild(root_1, stream_tableName.nextTree());

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
    // $ANTLR end "alterStatementSuffixRename"


    public static class alterStatementSuffixAddCol_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixAddCol"
    // AlterClauseParser.g:204:1: alterStatementSuffixAddCol : (add= KW_ADD |replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN ( restrictOrCascade )? -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? ) -> ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixAddCol_return alterStatementSuffixAddCol() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixAddCol_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddCol_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token add=null;
        Token replace=null;
        Token KW_COLUMNS100=null;
        Token LPAREN101=null;
        Token RPAREN103=null;
        HiveParser.columnNameTypeList_return columnNameTypeList102 =null;

        HiveParser.restrictOrCascade_return restrictOrCascade104 =null;


        ASTNode add_tree=null;
        ASTNode replace_tree=null;
        ASTNode KW_COLUMNS100_tree=null;
        ASTNode LPAREN101_tree=null;
        ASTNode RPAREN103_tree=null;
        RewriteRuleTokenStream stream_KW_COLUMNS=new RewriteRuleTokenStream(adaptor,"token KW_COLUMNS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
        RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
        RewriteRuleSubtreeStream stream_columnNameTypeList=new RewriteRuleSubtreeStream(adaptor,"rule columnNameTypeList");
        RewriteRuleSubtreeStream stream_restrictOrCascade=new RewriteRuleSubtreeStream(adaptor,"rule restrictOrCascade");
         gParent.pushMsg("add column statement", state); 
        try {
            // AlterClauseParser.g:207:5: ( (add= KW_ADD |replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN ( restrictOrCascade )? -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? ) -> ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? ) )
            // AlterClauseParser.g:207:7: (add= KW_ADD |replace= KW_REPLACE ) KW_COLUMNS LPAREN columnNameTypeList RPAREN ( restrictOrCascade )?
            {
            // AlterClauseParser.g:207:7: (add= KW_ADD |replace= KW_REPLACE )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==KW_ADD) ) {
                alt11=1;
            }
            else if ( (LA11_0==KW_REPLACE) ) {
                alt11=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // AlterClauseParser.g:207:8: add= KW_ADD
                    {
                    add=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddCol1248); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ADD.add(add);


                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:207:21: replace= KW_REPLACE
                    {
                    replace=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_alterStatementSuffixAddCol1254); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_REPLACE.add(replace);


                    }
                    break;

            }


            KW_COLUMNS100=(Token)match(input,KW_COLUMNS,FOLLOW_KW_COLUMNS_in_alterStatementSuffixAddCol1257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_COLUMNS.add(KW_COLUMNS100);


            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixAddCol1259); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);


            pushFollow(FOLLOW_columnNameTypeList_in_alterStatementSuffixAddCol1261);
            columnNameTypeList102=gHiveParser.columnNameTypeList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_columnNameTypeList.add(columnNameTypeList102.getTree());

            RPAREN103=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixAddCol1263); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN103);


            // AlterClauseParser.g:207:85: ( restrictOrCascade )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==KW_CASCADE||LA12_0==KW_RESTRICT) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // AlterClauseParser.g:207:85: restrictOrCascade
                    {
                    pushFollow(FOLLOW_restrictOrCascade_in_alterStatementSuffixAddCol1265);
                    restrictOrCascade104=gHiveParser.restrictOrCascade();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_restrictOrCascade.add(restrictOrCascade104.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: restrictOrCascade, restrictOrCascade, columnNameTypeList, columnNameTypeList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 208:5: -> {$add != null}? ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? )
            if (add != null) {
                // AlterClauseParser.g:208:24: ^( TOK_ALTERTABLE_ADDCOLS columnNameTypeList ( restrictOrCascade )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_ADDCOLS, "TOK_ALTERTABLE_ADDCOLS")
                , root_1);

                adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());

                // AlterClauseParser.g:208:68: ( restrictOrCascade )?
                if ( stream_restrictOrCascade.hasNext() ) {
                    adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());

                }
                stream_restrictOrCascade.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 209:5: -> ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? )
            {
                // AlterClauseParser.g:209:24: ^( TOK_ALTERTABLE_REPLACECOLS columnNameTypeList ( restrictOrCascade )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_REPLACECOLS, "TOK_ALTERTABLE_REPLACECOLS")
                , root_1);

                adaptor.addChild(root_1, stream_columnNameTypeList.nextTree());

                // AlterClauseParser.g:209:72: ( restrictOrCascade )?
                if ( stream_restrictOrCascade.hasNext() ) {
                    adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());

                }
                stream_restrictOrCascade.reset();

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
    // $ANTLR end "alterStatementSuffixAddCol"


    public static class alterStatementSuffixAddConstraint_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixAddConstraint"
    // AlterClauseParser.g:212:1: alterStatementSuffixAddConstraint : KW_ADD (fk= alterForeignKeyWithName | alterConstraintWithName ) -> {fk != null}? ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName ) -> ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixAddConstraint_return alterStatementSuffixAddConstraint() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixAddConstraint_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddConstraint_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ADD105=null;
        HiveParser.alterForeignKeyWithName_return fk =null;

        HiveParser.alterConstraintWithName_return alterConstraintWithName106 =null;


        ASTNode KW_ADD105_tree=null;
        RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
        RewriteRuleSubtreeStream stream_alterForeignKeyWithName=new RewriteRuleSubtreeStream(adaptor,"rule alterForeignKeyWithName");
        RewriteRuleSubtreeStream stream_alterConstraintWithName=new RewriteRuleSubtreeStream(adaptor,"rule alterConstraintWithName");
         gParent.pushMsg("add constraint statement", state); 
        try {
            // AlterClauseParser.g:215:4: ( KW_ADD (fk= alterForeignKeyWithName | alterConstraintWithName ) -> {fk != null}? ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName ) -> ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName ) )
            // AlterClauseParser.g:215:7: KW_ADD (fk= alterForeignKeyWithName | alterConstraintWithName )
            {
            KW_ADD105=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddConstraint1341); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ADD.add(KW_ADD105);


            // AlterClauseParser.g:215:14: (fk= alterForeignKeyWithName | alterConstraintWithName )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==KW_CONSTRAINT) ) {
                int LA13_1 = input.LA(2);

                if ( (LA13_1==Identifier) ) {
                    int LA13_2 = input.LA(3);

                    if ( (LA13_2==KW_FOREIGN) ) {
                        alt13=1;
                    }
                    else if ( (LA13_2==KW_CHECK||LA13_2==KW_PRIMARY||LA13_2==KW_UNIQUE) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 2, input);

                        throw nvae;

                    }
                }
                else if ( ((LA13_1 >= KW_ABORT && LA13_1 <= KW_AFTER)||LA13_1==KW_ALLOC_FRACTION||LA13_1==KW_ANALYZE||LA13_1==KW_ARCHIVE||(LA13_1 >= KW_ASC && LA13_1 <= KW_AT)||(LA13_1 >= KW_AUTOCOMMIT && LA13_1 <= KW_BEFORE)||(LA13_1 >= KW_BRANCH && LA13_1 <= KW_BUCKETS)||(LA13_1 >= KW_CACHE && LA13_1 <= KW_CASCADE)||(LA13_1 >= KW_CBO && LA13_1 <= KW_CHANGE)||LA13_1==KW_CHECK||(LA13_1 >= KW_CLUSTER && LA13_1 <= KW_COLLECTION)||(LA13_1 >= KW_COLUMNS && LA13_1 <= KW_COMMENT)||(LA13_1 >= KW_COMPACT && LA13_1 <= KW_COMPACTIONS)||(LA13_1 >= KW_COMPUTE && LA13_1 <= KW_CONCATENATE)||LA13_1==KW_CONTINUE||LA13_1==KW_COST||LA13_1==KW_CRON||LA13_1==KW_DATA||LA13_1==KW_DATABASES||(LA13_1 >= KW_DATETIME && LA13_1 <= KW_DCPROPERTIES)||LA13_1==KW_DEBUG||(LA13_1 >= KW_DEFAULT && LA13_1 <= KW_DEFINED)||(LA13_1 >= KW_DELIMITED && LA13_1 <= KW_DESC)||(LA13_1 >= KW_DETAIL && LA13_1 <= KW_DISABLE)||(LA13_1 >= KW_DISTRIBUTE && LA13_1 <= KW_DO)||LA13_1==KW_DOW||(LA13_1 >= KW_DUMP && LA13_1 <= KW_ELEM_TYPE)||LA13_1==KW_ENABLE||(LA13_1 >= KW_ENFORCED && LA13_1 <= KW_EVERY)||(LA13_1 >= KW_EXCLUSIVE && LA13_1 <= KW_EXECUTED)||(LA13_1 >= KW_EXPIRE_SNAPSHOTS && LA13_1 <= KW_EXPRESSION)||LA13_1==KW_FAST_FORWARD||(LA13_1 >= KW_FIELDS && LA13_1 <= KW_FIRST)||(LA13_1 >= KW_FORMAT && LA13_1 <= KW_FORMATTED)||LA13_1==KW_FUNCTIONS||(LA13_1 >= KW_HOUR && LA13_1 <= KW_IDXPROPERTIES)||LA13_1==KW_IGNORE||(LA13_1 >= KW_INDEX && LA13_1 <= KW_INDEXES)||(LA13_1 >= KW_INPATH && LA13_1 <= KW_INPUTFORMAT)||(LA13_1 >= KW_ISOLATION && LA13_1 <= KW_JAR)||(LA13_1 >= KW_JOINCOST && LA13_1 <= KW_LAST)||LA13_1==KW_LEVEL||(LA13_1 >= KW_LIMIT && LA13_1 <= KW_LOAD)||(LA13_1 >= KW_LOCATION && LA13_1 <= KW_LONG)||(LA13_1 >= KW_MANAGED && LA13_1 <= KW_MANAGEMENT)||(LA13_1 >= KW_MAPJOIN && LA13_1 <= KW_MATERIALIZED)||LA13_1==KW_METADATA||(LA13_1 >= KW_MINUTE && LA13_1 <= KW_MONTH)||(LA13_1 >= KW_MOVE && LA13_1 <= KW_MSCK)||(LA13_1 >= KW_NORELY && LA13_1 <= KW_NOSCAN)||LA13_1==KW_NOVALIDATE||LA13_1==KW_NULLS||LA13_1==KW_OFFSET||(LA13_1 >= KW_OPERATOR && LA13_1 <= KW_OPTION)||(LA13_1 >= KW_OUTPUTDRIVER && LA13_1 <= KW_OUTPUTFORMAT)||(LA13_1 >= KW_OVERWRITE && LA13_1 <= KW_OWNER)||(LA13_1 >= KW_PARTITIONED && LA13_1 <= KW_PATH)||(LA13_1 >= KW_PLAN && LA13_1 <= KW_POOL)||LA13_1==KW_PRINCIPALS||LA13_1==KW_PURGE||(LA13_1 >= KW_QUARTER && LA13_1 <= KW_QUERY_PARALLELISM)||LA13_1==KW_READ||(LA13_1 >= KW_REBUILD && LA13_1 <= KW_RECORDWRITER)||(LA13_1 >= KW_RELOAD && LA13_1 <= KW_RETENTION)||LA13_1==KW_REWRITE||(LA13_1 >= KW_ROLE && LA13_1 <= KW_ROLES)||(LA13_1 >= KW_SCHEDULED && LA13_1 <= KW_SECOND)||(LA13_1 >= KW_SEMI && LA13_1 <= KW_SERVER)||(LA13_1 >= KW_SETS && LA13_1 <= KW_SKEWED)||(LA13_1 >= KW_SNAPSHOT && LA13_1 <= KW_SNAPSHOTS)||(LA13_1 >= KW_SORT && LA13_1 <= KW_SSL)||(LA13_1 >= KW_STATISTICS && LA13_1 <= KW_SUMMARY)||(LA13_1 >= KW_SYSTEM_TIME && LA13_1 <= KW_SYSTEM_VERSION)||LA13_1==KW_TABLES||(LA13_1 >= KW_TAG && LA13_1 <= KW_TERMINATED)||LA13_1==KW_TINYINT||LA13_1==KW_TOUCH||(LA13_1 >= KW_TRANSACTION && LA13_1 <= KW_TRANSACTIONS)||LA13_1==KW_TRIM||(LA13_1 >= KW_TYPE && LA13_1 <= KW_UNARCHIVE)||LA13_1==KW_UNDO||LA13_1==KW_UNIONTYPE||(LA13_1 >= KW_UNKNOWN && LA13_1 <= KW_UNSIGNED)||(LA13_1 >= KW_URI && LA13_1 <= KW_USE)||(LA13_1 >= KW_UTC && LA13_1 <= KW_VALIDATE)||LA13_1==KW_VALUE_TYPE||(LA13_1 >= KW_VECTORIZATION && LA13_1 <= KW_WEEK)||LA13_1==KW_WHILE||(LA13_1 >= KW_WITHIN && LA13_1 <= KW_ZONE)||LA13_1==KW_BATCH||LA13_1==KW_DAYOFWEEK||LA13_1==KW_HOLD_DDLTIME||LA13_1==KW_NO_DROP||LA13_1==KW_OFFLINE||LA13_1==KW_PROTECTION||LA13_1==KW_READONLY||LA13_1==KW_TIMESTAMPTZ) ) {
                    int LA13_3 = input.LA(3);

                    if ( (LA13_3==KW_FOREIGN) ) {
                        alt13=1;
                    }
                    else if ( (LA13_3==KW_CHECK||LA13_3==KW_PRIMARY||LA13_3==KW_UNIQUE) ) {
                        alt13=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 3, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 13, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // AlterClauseParser.g:215:15: fk= alterForeignKeyWithName
                    {
                    pushFollow(FOLLOW_alterForeignKeyWithName_in_alterStatementSuffixAddConstraint1346);
                    fk=gHiveParser.alterForeignKeyWithName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterForeignKeyWithName.add(fk.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:215:44: alterConstraintWithName
                    {
                    pushFollow(FOLLOW_alterConstraintWithName_in_alterStatementSuffixAddConstraint1350);
                    alterConstraintWithName106=gHiveParser.alterConstraintWithName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterConstraintWithName.add(alterConstraintWithName106.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: alterConstraintWithName, alterForeignKeyWithName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 216:4: -> {fk != null}? ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName )
            if (fk != null) {
                // AlterClauseParser.g:216:21: ^( TOK_ALTERTABLE_ADDCONSTRAINT alterForeignKeyWithName )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_ADDCONSTRAINT, "TOK_ALTERTABLE_ADDCONSTRAINT")
                , root_1);

                adaptor.addChild(root_1, stream_alterForeignKeyWithName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 217:4: -> ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName )
            {
                // AlterClauseParser.g:217:21: ^( TOK_ALTERTABLE_ADDCONSTRAINT alterConstraintWithName )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_ADDCONSTRAINT, "TOK_ALTERTABLE_ADDCONSTRAINT")
                , root_1);

                adaptor.addChild(root_1, stream_alterConstraintWithName.nextTree());

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
    // $ANTLR end "alterStatementSuffixAddConstraint"


    public static class alterStatementSuffixUpdateColumns_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixUpdateColumns"
    // AlterClauseParser.g:220:1: alterStatementSuffixUpdateColumns : KW_UPDATE KW_COLUMNS ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixUpdateColumns_return alterStatementSuffixUpdateColumns() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixUpdateColumns_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUpdateColumns_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_UPDATE107=null;
        Token KW_COLUMNS108=null;
        HiveParser.restrictOrCascade_return restrictOrCascade109 =null;


        ASTNode KW_UPDATE107_tree=null;
        ASTNode KW_COLUMNS108_tree=null;
        RewriteRuleTokenStream stream_KW_COLUMNS=new RewriteRuleTokenStream(adaptor,"token KW_COLUMNS");
        RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
        RewriteRuleSubtreeStream stream_restrictOrCascade=new RewriteRuleSubtreeStream(adaptor,"rule restrictOrCascade");
         gParent.pushMsg("update columns statement", state); 
        try {
            // AlterClauseParser.g:223:5: ( KW_UPDATE KW_COLUMNS ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? ) )
            // AlterClauseParser.g:223:7: KW_UPDATE KW_COLUMNS ( restrictOrCascade )?
            {
            KW_UPDATE107=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateColumns1415); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE107);


            KW_COLUMNS108=(Token)match(input,KW_COLUMNS,FOLLOW_KW_COLUMNS_in_alterStatementSuffixUpdateColumns1417); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_COLUMNS.add(KW_COLUMNS108);


            // AlterClauseParser.g:223:28: ( restrictOrCascade )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==KW_CASCADE||LA14_0==KW_RESTRICT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // AlterClauseParser.g:223:28: restrictOrCascade
                    {
                    pushFollow(FOLLOW_restrictOrCascade_in_alterStatementSuffixUpdateColumns1419);
                    restrictOrCascade109=gHiveParser.restrictOrCascade();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_restrictOrCascade.add(restrictOrCascade109.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: restrictOrCascade
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 224:5: -> ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? )
            {
                // AlterClauseParser.g:224:8: ^( TOK_ALTERTABLE_UPDATECOLUMNS ( restrictOrCascade )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATECOLUMNS, "TOK_ALTERTABLE_UPDATECOLUMNS")
                , root_1);

                // AlterClauseParser.g:224:39: ( restrictOrCascade )?
                if ( stream_restrictOrCascade.hasNext() ) {
                    adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());

                }
                stream_restrictOrCascade.reset();

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
    // $ANTLR end "alterStatementSuffixUpdateColumns"


    public static class alterStatementSuffixDropConstraint_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixDropConstraint"
    // AlterClauseParser.g:227:1: alterStatementSuffixDropConstraint : KW_DROP KW_CONSTRAINT cName= identifier -> ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixDropConstraint_return alterStatementSuffixDropConstraint() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixDropConstraint_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixDropConstraint_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP110=null;
        Token KW_CONSTRAINT111=null;
        HiveParser_IdentifiersParser.identifier_return cName =null;


        ASTNode KW_DROP110_tree=null;
        ASTNode KW_CONSTRAINT111_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_CONSTRAINT=new RewriteRuleTokenStream(adaptor,"token KW_CONSTRAINT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("drop constraint statement", state); 
        try {
            // AlterClauseParser.g:230:4: ( KW_DROP KW_CONSTRAINT cName= identifier -> ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName) )
            // AlterClauseParser.g:230:6: KW_DROP KW_CONSTRAINT cName= identifier
            {
            KW_DROP110=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterStatementSuffixDropConstraint1459); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP110);


            KW_CONSTRAINT111=(Token)match(input,KW_CONSTRAINT,FOLLOW_KW_CONSTRAINT_in_alterStatementSuffixDropConstraint1461); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CONSTRAINT.add(KW_CONSTRAINT111);


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixDropConstraint1465);
            cName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(cName.getTree());

            // AST REWRITE
            // elements: cName
            // token labels: 
            // rule labels: cName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_cName=new RewriteRuleSubtreeStream(adaptor,"rule cName",cName!=null?cName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 231:4: -> ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName)
            {
                // AlterClauseParser.g:231:6: ^( TOK_ALTERTABLE_DROPCONSTRAINT $cName)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_DROPCONSTRAINT, "TOK_ALTERTABLE_DROPCONSTRAINT")
                , root_1);

                adaptor.addChild(root_1, stream_cName.nextTree());

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
    // $ANTLR end "alterStatementSuffixDropConstraint"


    public static class alterStatementSuffixRenameCol_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixRenameCol"
    // AlterClauseParser.g:234:1: alterStatementSuffixRenameCol : KW_CHANGE ( KW_COLUMN )? oldName= identifier newName= identifier colType ( alterColumnConstraint[$newName.tree] )? ( KW_COMMENT comment= StringLiteral )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixRenameCol_return alterStatementSuffixRenameCol() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixRenameCol_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixRenameCol_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token comment=null;
        Token KW_CHANGE112=null;
        Token KW_COLUMN113=null;
        Token KW_COMMENT116=null;
        HiveParser_IdentifiersParser.identifier_return oldName =null;

        HiveParser_IdentifiersParser.identifier_return newName =null;

        HiveParser.colType_return colType114 =null;

        HiveParser.alterColumnConstraint_return alterColumnConstraint115 =null;

        HiveParser_AlterClauseParser.alterStatementChangeColPosition_return alterStatementChangeColPosition117 =null;

        HiveParser.restrictOrCascade_return restrictOrCascade118 =null;


        ASTNode comment_tree=null;
        ASTNode KW_CHANGE112_tree=null;
        ASTNode KW_COLUMN113_tree=null;
        ASTNode KW_COMMENT116_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");
        RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
        RewriteRuleTokenStream stream_KW_CHANGE=new RewriteRuleTokenStream(adaptor,"token KW_CHANGE");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_colType=new RewriteRuleSubtreeStream(adaptor,"rule colType");
        RewriteRuleSubtreeStream stream_alterStatementChangeColPosition=new RewriteRuleSubtreeStream(adaptor,"rule alterStatementChangeColPosition");
        RewriteRuleSubtreeStream stream_restrictOrCascade=new RewriteRuleSubtreeStream(adaptor,"rule restrictOrCascade");
        RewriteRuleSubtreeStream stream_alterColumnConstraint=new RewriteRuleSubtreeStream(adaptor,"rule alterColumnConstraint");
         gParent.pushMsg("rename column name", state); 
        try {
            // AlterClauseParser.g:237:5: ( KW_CHANGE ( KW_COLUMN )? oldName= identifier newName= identifier colType ( alterColumnConstraint[$newName.tree] )? ( KW_COMMENT comment= StringLiteral )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? -> ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? ) )
            // AlterClauseParser.g:237:7: KW_CHANGE ( KW_COLUMN )? oldName= identifier newName= identifier colType ( alterColumnConstraint[$newName.tree] )? ( KW_COMMENT comment= StringLiteral )? ( alterStatementChangeColPosition )? ( restrictOrCascade )?
            {
            KW_CHANGE112=(Token)match(input,KW_CHANGE,FOLLOW_KW_CHANGE_in_alterStatementSuffixRenameCol1502); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CHANGE.add(KW_CHANGE112);


            // AlterClauseParser.g:237:17: ( KW_COLUMN )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==KW_COLUMN) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // AlterClauseParser.g:237:17: KW_COLUMN
                    {
                    KW_COLUMN113=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementSuffixRenameCol1504); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN113);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixRenameCol1509);
            oldName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(oldName.getTree());

            pushFollow(FOLLOW_identifier_in_alterStatementSuffixRenameCol1513);
            newName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(newName.getTree());

            pushFollow(FOLLOW_colType_in_alterStatementSuffixRenameCol1515);
            colType114=gHiveParser.colType();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_colType.add(colType114.getTree());

            // AlterClauseParser.g:237:74: ( alterColumnConstraint[$newName.tree] )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==KW_CHECK||LA16_0==KW_CONSTRAINT||LA16_0==KW_DEFAULT||LA16_0==KW_NOT||LA16_0==KW_PRIMARY||LA16_0==KW_REFERENCES||LA16_0==KW_UNIQUE) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // AlterClauseParser.g:237:74: alterColumnConstraint[$newName.tree]
                    {
                    pushFollow(FOLLOW_alterColumnConstraint_in_alterStatementSuffixRenameCol1517);
                    alterColumnConstraint115=gHiveParser.alterColumnConstraint((newName!=null?((ASTNode)newName.tree):null));

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterColumnConstraint.add(alterColumnConstraint115.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:237:112: ( KW_COMMENT comment= StringLiteral )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KW_COMMENT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // AlterClauseParser.g:237:113: KW_COMMENT comment= StringLiteral
                    {
                    KW_COMMENT116=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_alterStatementSuffixRenameCol1522); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT116);


                    comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixRenameCol1526); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(comment);


                    }
                    break;

            }


            // AlterClauseParser.g:237:148: ( alterStatementChangeColPosition )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==KW_AFTER||LA18_0==KW_FIRST) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // AlterClauseParser.g:237:148: alterStatementChangeColPosition
                    {
                    pushFollow(FOLLOW_alterStatementChangeColPosition_in_alterStatementSuffixRenameCol1530);
                    alterStatementChangeColPosition117=alterStatementChangeColPosition();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_alterStatementChangeColPosition.add(alterStatementChangeColPosition117.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:237:181: ( restrictOrCascade )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==KW_CASCADE||LA19_0==KW_RESTRICT) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // AlterClauseParser.g:237:181: restrictOrCascade
                    {
                    pushFollow(FOLLOW_restrictOrCascade_in_alterStatementSuffixRenameCol1533);
                    restrictOrCascade118=gHiveParser.restrictOrCascade();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_restrictOrCascade.add(restrictOrCascade118.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: restrictOrCascade, oldName, alterStatementChangeColPosition, newName, comment, colType, alterColumnConstraint
            // token labels: comment
            // rule labels: newName, oldName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
            RewriteRuleSubtreeStream stream_newName=new RewriteRuleSubtreeStream(adaptor,"rule newName",newName!=null?newName.tree:null);
            RewriteRuleSubtreeStream stream_oldName=new RewriteRuleSubtreeStream(adaptor,"rule oldName",oldName!=null?oldName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 238:5: -> ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? )
            {
                // AlterClauseParser.g:238:7: ^( TOK_ALTERTABLE_RENAMECOL $oldName $newName colType ( $comment)? ( alterColumnConstraint )? ( alterStatementChangeColPosition )? ( restrictOrCascade )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_RENAMECOL, "TOK_ALTERTABLE_RENAMECOL")
                , root_1);

                adaptor.addChild(root_1, stream_oldName.nextTree());

                adaptor.addChild(root_1, stream_newName.nextTree());

                adaptor.addChild(root_1, stream_colType.nextTree());

                // AlterClauseParser.g:238:61: ( $comment)?
                if ( stream_comment.hasNext() ) {
                    adaptor.addChild(root_1, stream_comment.nextNode());

                }
                stream_comment.reset();

                // AlterClauseParser.g:238:70: ( alterColumnConstraint )?
                if ( stream_alterColumnConstraint.hasNext() ) {
                    adaptor.addChild(root_1, stream_alterColumnConstraint.nextTree());

                }
                stream_alterColumnConstraint.reset();

                // AlterClauseParser.g:238:93: ( alterStatementChangeColPosition )?
                if ( stream_alterStatementChangeColPosition.hasNext() ) {
                    adaptor.addChild(root_1, stream_alterStatementChangeColPosition.nextTree());

                }
                stream_alterStatementChangeColPosition.reset();

                // AlterClauseParser.g:238:126: ( restrictOrCascade )?
                if ( stream_restrictOrCascade.hasNext() ) {
                    adaptor.addChild(root_1, stream_restrictOrCascade.nextTree());

                }
                stream_restrictOrCascade.reset();

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
    // $ANTLR end "alterStatementSuffixRenameCol"


    public static class alterStatementSuffixUpdateStatsCol_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixUpdateStatsCol"
    // AlterClauseParser.g:241:1: alterStatementSuffixUpdateStatsCol[boolean partition] : KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> {partition}? ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? ) -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixUpdateStatsCol_return alterStatementSuffixUpdateStatsCol(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixUpdateStatsCol_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUpdateStatsCol_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token comment=null;
        Token KW_UPDATE119=null;
        Token KW_STATISTICS120=null;
        Token KW_FOR121=null;
        Token KW_COLUMN122=null;
        Token KW_SET123=null;
        Token KW_COMMENT125=null;
        HiveParser_IdentifiersParser.identifier_return colName =null;

        HiveParser.tableProperties_return tableProperties124 =null;


        ASTNode comment_tree=null;
        ASTNode KW_UPDATE119_tree=null;
        ASTNode KW_STATISTICS120_tree=null;
        ASTNode KW_FOR121_tree=null;
        ASTNode KW_COLUMN122_tree=null;
        ASTNode KW_SET123_tree=null;
        ASTNode KW_COMMENT125_tree=null;
        RewriteRuleTokenStream stream_KW_STATISTICS=new RewriteRuleTokenStream(adaptor,"token KW_STATISTICS");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
        RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");
        RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         gParent.pushMsg("update column statistics", state); 
        try {
            // AlterClauseParser.g:244:5: ( KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> {partition}? ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? ) -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) )
            // AlterClauseParser.g:244:7: KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )?
            {
            KW_UPDATE119=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStatsCol1592); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE119);


            KW_STATISTICS120=(Token)match(input,KW_STATISTICS,FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStatsCol1594); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_STATISTICS.add(KW_STATISTICS120);


            KW_FOR121=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_alterStatementSuffixUpdateStatsCol1596); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR121);


            // AlterClauseParser.g:244:38: ( KW_COLUMN )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==KW_COLUMN) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // AlterClauseParser.g:244:38: KW_COLUMN
                    {
                    KW_COLUMN122=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementSuffixUpdateStatsCol1598); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN122);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixUpdateStatsCol1603);
            colName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(colName.getTree());

            KW_SET123=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixUpdateStatsCol1605); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET123);


            pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixUpdateStatsCol1607);
            tableProperties124=gHiveParser.tableProperties();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties124.getTree());

            // AlterClauseParser.g:244:91: ( KW_COMMENT comment= StringLiteral )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==KW_COMMENT) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // AlterClauseParser.g:244:92: KW_COMMENT comment= StringLiteral
                    {
                    KW_COMMENT125=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_alterStatementSuffixUpdateStatsCol1610); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT125);


                    comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixUpdateStatsCol1614); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(comment);


                    }
                    break;

            }


            // AST REWRITE
            // elements: tableProperties, colName, comment, tableProperties, comment, colName
            // token labels: comment
            // rule labels: colName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
            RewriteRuleSubtreeStream stream_colName=new RewriteRuleSubtreeStream(adaptor,"rule colName",colName!=null?colName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 245:5: -> {partition}? ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? )
            if (partition) {
                // AlterClauseParser.g:245:21: ^( TOK_ALTERPARTITION_UPDATECOLSTATS $colName tableProperties ( $comment)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERPARTITION_UPDATECOLSTATS, "TOK_ALTERPARTITION_UPDATECOLSTATS")
                , root_1);

                adaptor.addChild(root_1, stream_colName.nextTree());

                adaptor.addChild(root_1, stream_tableProperties.nextTree());

                // AlterClauseParser.g:245:83: ( $comment)?
                if ( stream_comment.hasNext() ) {
                    adaptor.addChild(root_1, stream_comment.nextNode());

                }
                stream_comment.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 246:5: -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
            {
                // AlterClauseParser.g:246:21: ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATECOLSTATS, "TOK_ALTERTABLE_UPDATECOLSTATS")
                , root_1);

                adaptor.addChild(root_1, stream_colName.nextTree());

                adaptor.addChild(root_1, stream_tableProperties.nextTree());

                // AlterClauseParser.g:246:79: ( $comment)?
                if ( stream_comment.hasNext() ) {
                    adaptor.addChild(root_1, stream_comment.nextNode());

                }
                stream_comment.reset();

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
    // $ANTLR end "alterStatementSuffixUpdateStatsCol"


    public static class alterStatementSuffixUpdateStats_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixUpdateStats"
    // AlterClauseParser.g:249:1: alterStatementSuffixUpdateStats[boolean partition] : KW_UPDATE KW_STATISTICS KW_SET tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties ) -> ^( TOK_ALTERTABLE_UPDATESTATS tableProperties ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixUpdateStats_return alterStatementSuffixUpdateStats(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixUpdateStats_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUpdateStats_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_UPDATE126=null;
        Token KW_STATISTICS127=null;
        Token KW_SET128=null;
        HiveParser.tableProperties_return tableProperties129 =null;


        ASTNode KW_UPDATE126_tree=null;
        ASTNode KW_STATISTICS127_tree=null;
        ASTNode KW_SET128_tree=null;
        RewriteRuleTokenStream stream_KW_STATISTICS=new RewriteRuleTokenStream(adaptor,"token KW_STATISTICS");
        RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         gParent.pushMsg("update basic statistics", state); 
        try {
            // AlterClauseParser.g:252:5: ( KW_UPDATE KW_STATISTICS KW_SET tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties ) -> ^( TOK_ALTERTABLE_UPDATESTATS tableProperties ) )
            // AlterClauseParser.g:252:7: KW_UPDATE KW_STATISTICS KW_SET tableProperties
            {
            KW_UPDATE126=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStats1697); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE126);


            KW_STATISTICS127=(Token)match(input,KW_STATISTICS,FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStats1699); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_STATISTICS.add(KW_STATISTICS127);


            KW_SET128=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixUpdateStats1701); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET128);


            pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixUpdateStats1703);
            tableProperties129=gHiveParser.tableProperties();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties129.getTree());

            // AST REWRITE
            // elements: tableProperties, tableProperties
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 253:5: -> {partition}? ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties )
            if (partition) {
                // AlterClauseParser.g:253:21: ^( TOK_ALTERPARTITION_UPDATESTATS tableProperties )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERPARTITION_UPDATESTATS, "TOK_ALTERPARTITION_UPDATESTATS")
                , root_1);

                adaptor.addChild(root_1, stream_tableProperties.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 254:5: -> ^( TOK_ALTERTABLE_UPDATESTATS tableProperties )
            {
                // AlterClauseParser.g:254:21: ^( TOK_ALTERTABLE_UPDATESTATS tableProperties )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATESTATS, "TOK_ALTERTABLE_UPDATESTATS")
                , root_1);

                adaptor.addChild(root_1, stream_tableProperties.nextTree());

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
    // $ANTLR end "alterStatementSuffixUpdateStats"


    public static class alterStatementChangeColPosition_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementChangeColPosition"
    // AlterClauseParser.g:257:1: alterStatementChangeColPosition : (first= KW_FIRST | KW_AFTER afterCol= identifier -> {$first != null}? ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION ) -> ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol) );
    public final HiveParser_AlterClauseParser.alterStatementChangeColPosition_return alterStatementChangeColPosition() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementChangeColPosition_return retval = new HiveParser_AlterClauseParser.alterStatementChangeColPosition_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token first=null;
        Token KW_AFTER130=null;
        HiveParser_IdentifiersParser.identifier_return afterCol =null;


        ASTNode first_tree=null;
        ASTNode KW_AFTER130_tree=null;
        RewriteRuleTokenStream stream_KW_AFTER=new RewriteRuleTokenStream(adaptor,"token KW_AFTER");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        try {
            // AlterClauseParser.g:258:5: (first= KW_FIRST | KW_AFTER afterCol= identifier -> {$first != null}? ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION ) -> ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol) )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==KW_FIRST) ) {
                alt22=1;
            }
            else if ( (LA22_0==KW_AFTER) ) {
                alt22=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // AlterClauseParser.g:258:7: first= KW_FIRST
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    first=(Token)match(input,KW_FIRST,FOLLOW_KW_FIRST_in_alterStatementChangeColPosition1761); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    first_tree = 
                    (ASTNode)adaptor.create(first)
                    ;
                    adaptor.addChild(root_0, first_tree);
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:258:22: KW_AFTER afterCol= identifier
                    {
                    KW_AFTER130=(Token)match(input,KW_AFTER,FOLLOW_KW_AFTER_in_alterStatementChangeColPosition1763); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AFTER.add(KW_AFTER130);


                    pushFollow(FOLLOW_identifier_in_alterStatementChangeColPosition1767);
                    afterCol=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(afterCol.getTree());

                    // AST REWRITE
                    // elements: afterCol
                    // token labels: 
                    // rule labels: afterCol, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_afterCol=new RewriteRuleSubtreeStream(adaptor,"rule afterCol",afterCol!=null?afterCol.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 259:5: -> {$first != null}? ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION )
                    if (first != null) {
                        // AlterClauseParser.g:259:25: ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION, "TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 260:5: -> ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol)
                    {
                        // AlterClauseParser.g:260:8: ^( TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION $afterCol)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION, "TOK_ALTERTABLE_CHANGECOL_AFTER_POSITION")
                        , root_1);

                        adaptor.addChild(root_1, stream_afterCol.nextTree());

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
    // $ANTLR end "alterStatementChangeColPosition"


    public static class alterStatementSuffixAddPartitions_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixAddPartitions"
    // AlterClauseParser.g:263:1: alterStatementSuffixAddPartitions[boolean table] : KW_ADD ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ -> { table }? ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) -> ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return alterStatementSuffixAddPartitions(boolean table) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddPartitions_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ADD131=null;
        HiveParser.ifNotExists_return ifNotExists132 =null;

        HiveParser_AlterClauseParser.alterStatementSuffixAddPartitionsElement_return alterStatementSuffixAddPartitionsElement133 =null;


        ASTNode KW_ADD131_tree=null;
        RewriteRuleTokenStream stream_KW_ADD=new RewriteRuleTokenStream(adaptor,"token KW_ADD");
        RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
        RewriteRuleSubtreeStream stream_alterStatementSuffixAddPartitionsElement=new RewriteRuleSubtreeStream(adaptor,"rule alterStatementSuffixAddPartitionsElement");
         gParent.pushMsg("add partition statement", state); 
        try {
            // AlterClauseParser.g:266:5: ( KW_ADD ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ -> { table }? ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) -> ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ ) )
            // AlterClauseParser.g:266:7: KW_ADD ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+
            {
            KW_ADD131=(Token)match(input,KW_ADD,FOLLOW_KW_ADD_in_alterStatementSuffixAddPartitions1820); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ADD.add(KW_ADD131);


            // AlterClauseParser.g:266:14: ( ifNotExists )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==KW_IF) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // AlterClauseParser.g:266:14: ifNotExists
                    {
                    pushFollow(FOLLOW_ifNotExists_in_alterStatementSuffixAddPartitions1822);
                    ifNotExists132=gHiveParser.ifNotExists();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists132.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:266:27: ( alterStatementSuffixAddPartitionsElement )+
            int cnt24=0;
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==KW_PARTITION) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // AlterClauseParser.g:266:27: alterStatementSuffixAddPartitionsElement
            	    {
            	    pushFollow(FOLLOW_alterStatementSuffixAddPartitionsElement_in_alterStatementSuffixAddPartitions1825);
            	    alterStatementSuffixAddPartitionsElement133=alterStatementSuffixAddPartitionsElement();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_alterStatementSuffixAddPartitionsElement.add(alterStatementSuffixAddPartitionsElement133.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt24 >= 1 ) break loop24;
            	    if (state.backtracking>0) {state.failed=true; return retval;}
                        EarlyExitException eee =
                            new EarlyExitException(24, input);
                        throw eee;
                }
                cnt24++;
            } while (true);


            // AST REWRITE
            // elements: ifNotExists, ifNotExists, alterStatementSuffixAddPartitionsElement, alterStatementSuffixAddPartitionsElement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 267:5: -> { table }? ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
            if ( table ) {
                // AlterClauseParser.g:267:19: ^( TOK_ALTERTABLE_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_ADDPARTS, "TOK_ALTERTABLE_ADDPARTS")
                , root_1);

                // AlterClauseParser.g:267:45: ( ifNotExists )?
                if ( stream_ifNotExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                }
                stream_ifNotExists.reset();

                if ( !(stream_alterStatementSuffixAddPartitionsElement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_alterStatementSuffixAddPartitionsElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_alterStatementSuffixAddPartitionsElement.nextTree());

                }
                stream_alterStatementSuffixAddPartitionsElement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 268:5: -> ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
            {
                // AlterClauseParser.g:268:19: ^( TOK_ALTERVIEW_ADDPARTS ( ifNotExists )? ( alterStatementSuffixAddPartitionsElement )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERVIEW_ADDPARTS, "TOK_ALTERVIEW_ADDPARTS")
                , root_1);

                // AlterClauseParser.g:268:44: ( ifNotExists )?
                if ( stream_ifNotExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                }
                stream_ifNotExists.reset();

                if ( !(stream_alterStatementSuffixAddPartitionsElement.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_alterStatementSuffixAddPartitionsElement.hasNext() ) {
                    adaptor.addChild(root_1, stream_alterStatementSuffixAddPartitionsElement.nextTree());

                }
                stream_alterStatementSuffixAddPartitionsElement.reset();

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
    // $ANTLR end "alterStatementSuffixAddPartitions"


    public static class alterStatementSuffixAddPartitionsElement_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixAddPartitionsElement"
    // AlterClauseParser.g:271:1: alterStatementSuffixAddPartitionsElement : partitionSpec ( partitionLocation )? ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixAddPartitionsElement_return alterStatementSuffixAddPartitionsElement() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixAddPartitionsElement_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixAddPartitionsElement_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec134 =null;

        HiveParser_AlterClauseParser.partitionLocation_return partitionLocation135 =null;



        try {
            // AlterClauseParser.g:272:5: ( partitionSpec ( partitionLocation )? )
            // AlterClauseParser.g:272:7: partitionSpec ( partitionLocation )?
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitionsElement1888);
            partitionSpec134=gHiveParser.partitionSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionSpec134.getTree());

            // AlterClauseParser.g:272:21: ( partitionLocation )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==KW_LOCATION) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // AlterClauseParser.g:272:21: partitionLocation
                    {
                    pushFollow(FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitionsElement1890);
                    partitionLocation135=partitionLocation();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionLocation135.getTree());

                    }
                    break;

            }


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
    // $ANTLR end "alterStatementSuffixAddPartitionsElement"


    public static class alterStatementSuffixTouch_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixTouch"
    // AlterClauseParser.g:275:1: alterStatementSuffixTouch : KW_TOUCH ( partitionSpec )* -> ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixTouch_return alterStatementSuffixTouch() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixTouch_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixTouch_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_TOUCH136=null;
        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec137 =null;


        ASTNode KW_TOUCH136_tree=null;
        RewriteRuleTokenStream stream_KW_TOUCH=new RewriteRuleTokenStream(adaptor,"token KW_TOUCH");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         gParent.pushMsg("touch statement", state); 
        try {
            // AlterClauseParser.g:278:5: ( KW_TOUCH ( partitionSpec )* -> ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* ) )
            // AlterClauseParser.g:278:7: KW_TOUCH ( partitionSpec )*
            {
            KW_TOUCH136=(Token)match(input,KW_TOUCH,FOLLOW_KW_TOUCH_in_alterStatementSuffixTouch1918); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TOUCH.add(KW_TOUCH136);


            // AlterClauseParser.g:278:16: ( partitionSpec )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==KW_PARTITION) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // AlterClauseParser.g:278:17: partitionSpec
            	    {
            	    pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixTouch1921);
            	    partitionSpec137=gHiveParser.partitionSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec137.getTree());

            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);


            // AST REWRITE
            // elements: partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 279:5: -> ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* )
            {
                // AlterClauseParser.g:279:8: ^( TOK_ALTERTABLE_TOUCH ( partitionSpec )* )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_TOUCH, "TOK_ALTERTABLE_TOUCH")
                , root_1);

                // AlterClauseParser.g:279:31: ( partitionSpec )*
                while ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                }
                stream_partitionSpec.reset();

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
    // $ANTLR end "alterStatementSuffixTouch"


    public static class alterStatementSuffixArchive_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixArchive"
    // AlterClauseParser.g:282:1: alterStatementSuffixArchive : KW_ARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixArchive_return alterStatementSuffixArchive() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixArchive_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixArchive_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ARCHIVE138=null;
        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec139 =null;


        ASTNode KW_ARCHIVE138_tree=null;
        RewriteRuleTokenStream stream_KW_ARCHIVE=new RewriteRuleTokenStream(adaptor,"token KW_ARCHIVE");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         gParent.pushMsg("archive statement", state); 
        try {
            // AlterClauseParser.g:285:5: ( KW_ARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* ) )
            // AlterClauseParser.g:285:7: KW_ARCHIVE ( partitionSpec )*
            {
            KW_ARCHIVE138=(Token)match(input,KW_ARCHIVE,FOLLOW_KW_ARCHIVE_in_alterStatementSuffixArchive1965); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ARCHIVE.add(KW_ARCHIVE138);


            // AlterClauseParser.g:285:18: ( partitionSpec )*
            loop27:
            do {
                int alt27=2;
                int LA27_0 = input.LA(1);

                if ( (LA27_0==KW_PARTITION) ) {
                    alt27=1;
                }


                switch (alt27) {
            	case 1 :
            	    // AlterClauseParser.g:285:19: partitionSpec
            	    {
            	    pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixArchive1968);
            	    partitionSpec139=gHiveParser.partitionSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec139.getTree());

            	    }
            	    break;

            	default :
            	    break loop27;
                }
            } while (true);


            // AST REWRITE
            // elements: partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 286:5: -> ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* )
            {
                // AlterClauseParser.g:286:8: ^( TOK_ALTERTABLE_ARCHIVE ( partitionSpec )* )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_ARCHIVE, "TOK_ALTERTABLE_ARCHIVE")
                , root_1);

                // AlterClauseParser.g:286:33: ( partitionSpec )*
                while ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                }
                stream_partitionSpec.reset();

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
    // $ANTLR end "alterStatementSuffixArchive"


    public static class alterStatementSuffixUnArchive_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixUnArchive"
    // AlterClauseParser.g:289:1: alterStatementSuffixUnArchive : KW_UNARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixUnArchive_return alterStatementSuffixUnArchive() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixUnArchive_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixUnArchive_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_UNARCHIVE140=null;
        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec141 =null;


        ASTNode KW_UNARCHIVE140_tree=null;
        RewriteRuleTokenStream stream_KW_UNARCHIVE=new RewriteRuleTokenStream(adaptor,"token KW_UNARCHIVE");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         gParent.pushMsg("unarchive statement", state); 
        try {
            // AlterClauseParser.g:292:5: ( KW_UNARCHIVE ( partitionSpec )* -> ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* ) )
            // AlterClauseParser.g:292:7: KW_UNARCHIVE ( partitionSpec )*
            {
            KW_UNARCHIVE140=(Token)match(input,KW_UNARCHIVE,FOLLOW_KW_UNARCHIVE_in_alterStatementSuffixUnArchive2012); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UNARCHIVE.add(KW_UNARCHIVE140);


            // AlterClauseParser.g:292:20: ( partitionSpec )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( (LA28_0==KW_PARTITION) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // AlterClauseParser.g:292:21: partitionSpec
            	    {
            	    pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixUnArchive2015);
            	    partitionSpec141=gHiveParser.partitionSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec141.getTree());

            	    }
            	    break;

            	default :
            	    break loop28;
                }
            } while (true);


            // AST REWRITE
            // elements: partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 293:5: -> ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* )
            {
                // AlterClauseParser.g:293:8: ^( TOK_ALTERTABLE_UNARCHIVE ( partitionSpec )* )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_UNARCHIVE, "TOK_ALTERTABLE_UNARCHIVE")
                , root_1);

                // AlterClauseParser.g:293:35: ( partitionSpec )*
                while ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                }
                stream_partitionSpec.reset();

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
    // $ANTLR end "alterStatementSuffixUnArchive"


    public static class partitionLocation_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionLocation"
    // AlterClauseParser.g:296:1: partitionLocation : KW_LOCATION locn= StringLiteral -> ^( TOK_PARTITIONLOCATION $locn) ;
    public final HiveParser_AlterClauseParser.partitionLocation_return partitionLocation() throws RecognitionException {
        HiveParser_AlterClauseParser.partitionLocation_return retval = new HiveParser_AlterClauseParser.partitionLocation_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token locn=null;
        Token KW_LOCATION142=null;

        ASTNode locn_tree=null;
        ASTNode KW_LOCATION142_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");

         gParent.pushMsg("partition location", state); 
        try {
            // AlterClauseParser.g:299:5: ( KW_LOCATION locn= StringLiteral -> ^( TOK_PARTITIONLOCATION $locn) )
            // AlterClauseParser.g:300:7: KW_LOCATION locn= StringLiteral
            {
            KW_LOCATION142=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_partitionLocation2065); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION142);


            locn=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_partitionLocation2069); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(locn);


            // AST REWRITE
            // elements: locn
            // token labels: locn
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_locn=new RewriteRuleTokenStream(adaptor,"token locn",locn);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 300:38: -> ^( TOK_PARTITIONLOCATION $locn)
            {
                // AlterClauseParser.g:300:41: ^( TOK_PARTITIONLOCATION $locn)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_PARTITIONLOCATION, "TOK_PARTITIONLOCATION")
                , root_1);

                adaptor.addChild(root_1, stream_locn.nextNode());

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
    // $ANTLR end "partitionLocation"


    public static class alterStatementSuffixDropPartitions_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixDropPartitions"
    // AlterClauseParser.g:303:1: alterStatementSuffixDropPartitions[boolean table] : KW_DROP ( ifExists )? KW_PARTITION partitionSelectorSpec ( COMMA KW_PARTITION partitionSelectorSpec )* ( KW_PURGE )? ( replicationClause )? -> { table }? ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? ) -> ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return alterStatementSuffixDropPartitions(boolean table) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixDropPartitions_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP143=null;
        Token KW_PARTITION145=null;
        Token COMMA147=null;
        Token KW_PARTITION148=null;
        Token KW_PURGE150=null;
        HiveParser.ifExists_return ifExists144 =null;

        HiveParser_IdentifiersParser.partitionSelectorSpec_return partitionSelectorSpec146 =null;

        HiveParser_IdentifiersParser.partitionSelectorSpec_return partitionSelectorSpec149 =null;

        HiveParser_ReplClauseParser.replicationClause_return replicationClause151 =null;


        ASTNode KW_DROP143_tree=null;
        ASTNode KW_PARTITION145_tree=null;
        ASTNode COMMA147_tree=null;
        ASTNode KW_PARTITION148_tree=null;
        ASTNode KW_PURGE150_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_KW_PURGE=new RewriteRuleTokenStream(adaptor,"token KW_PURGE");
        RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
        RewriteRuleSubtreeStream stream_partitionSelectorSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSelectorSpec");
        RewriteRuleSubtreeStream stream_replicationClause=new RewriteRuleSubtreeStream(adaptor,"rule replicationClause");
         gParent.pushMsg("drop partition statement", state); 
        try {
            // AlterClauseParser.g:306:5: ( KW_DROP ( ifExists )? KW_PARTITION partitionSelectorSpec ( COMMA KW_PARTITION partitionSelectorSpec )* ( KW_PURGE )? ( replicationClause )? -> { table }? ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? ) -> ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? ) )
            // AlterClauseParser.g:306:7: KW_DROP ( ifExists )? KW_PARTITION partitionSelectorSpec ( COMMA KW_PARTITION partitionSelectorSpec )* ( KW_PURGE )? ( replicationClause )?
            {
            KW_DROP143=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterStatementSuffixDropPartitions2106); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP143);


            // AlterClauseParser.g:306:15: ( ifExists )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==KW_IF) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // AlterClauseParser.g:306:15: ifExists
                    {
                    pushFollow(FOLLOW_ifExists_in_alterStatementSuffixDropPartitions2108);
                    ifExists144=gHiveParser.ifExists();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifExists.add(ifExists144.getTree());

                    }
                    break;

            }


            KW_PARTITION145=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions2111); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION145);


            pushFollow(FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions2113);
            partitionSelectorSpec146=gHiveParser.partitionSelectorSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionSelectorSpec.add(partitionSelectorSpec146.getTree());

            // AlterClauseParser.g:306:60: ( COMMA KW_PARTITION partitionSelectorSpec )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( (LA30_0==COMMA) ) {
                    alt30=1;
                }


                switch (alt30) {
            	case 1 :
            	    // AlterClauseParser.g:306:61: COMMA KW_PARTITION partitionSelectorSpec
            	    {
            	    COMMA147=(Token)match(input,COMMA,FOLLOW_COMMA_in_alterStatementSuffixDropPartitions2116); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA147);


            	    KW_PARTITION148=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions2118); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION148);


            	    pushFollow(FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions2120);
            	    partitionSelectorSpec149=gHiveParser.partitionSelectorSpec();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_partitionSelectorSpec.add(partitionSelectorSpec149.getTree());

            	    }
            	    break;

            	default :
            	    break loop30;
                }
            } while (true);


            // AlterClauseParser.g:306:104: ( KW_PURGE )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KW_PURGE) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // AlterClauseParser.g:306:104: KW_PURGE
                    {
                    KW_PURGE150=(Token)match(input,KW_PURGE,FOLLOW_KW_PURGE_in_alterStatementSuffixDropPartitions2124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_PURGE.add(KW_PURGE150);


                    }
                    break;

            }


            // AlterClauseParser.g:306:114: ( replicationClause )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==KW_FOR) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // AlterClauseParser.g:306:114: replicationClause
                    {
                    pushFollow(FOLLOW_replicationClause_in_alterStatementSuffixDropPartitions2127);
                    replicationClause151=gHiveParser.replicationClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_replicationClause.add(replicationClause151.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ifExists, ifExists, KW_PURGE, partitionSelectorSpec, replicationClause, partitionSelectorSpec, replicationClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 307:5: -> { table }? ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? )
            if ( table ) {
                // AlterClauseParser.g:307:19: ^( TOK_ALTERTABLE_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( KW_PURGE )? ( replicationClause )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_DROPPARTS, "TOK_ALTERTABLE_DROPPARTS")
                , root_1);

                if ( !(stream_partitionSelectorSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionSelectorSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSelectorSpec.nextTree());

                }
                stream_partitionSelectorSpec.reset();

                // AlterClauseParser.g:307:69: ( ifExists )?
                if ( stream_ifExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifExists.nextTree());

                }
                stream_ifExists.reset();

                // AlterClauseParser.g:307:79: ( KW_PURGE )?
                if ( stream_KW_PURGE.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_KW_PURGE.nextNode()
                    );

                }
                stream_KW_PURGE.reset();

                // AlterClauseParser.g:307:89: ( replicationClause )?
                if ( stream_replicationClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_replicationClause.nextTree());

                }
                stream_replicationClause.reset();

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 308:5: -> ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? )
            {
                // AlterClauseParser.g:308:19: ^( TOK_ALTERVIEW_DROPPARTS ( partitionSelectorSpec )+ ( ifExists )? ( replicationClause )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERVIEW_DROPPARTS, "TOK_ALTERVIEW_DROPPARTS")
                , root_1);

                if ( !(stream_partitionSelectorSpec.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_partitionSelectorSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSelectorSpec.nextTree());

                }
                stream_partitionSelectorSpec.reset();

                // AlterClauseParser.g:308:68: ( ifExists )?
                if ( stream_ifExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifExists.nextTree());

                }
                stream_ifExists.reset();

                // AlterClauseParser.g:308:78: ( replicationClause )?
                if ( stream_replicationClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_replicationClause.nextTree());

                }
                stream_replicationClause.reset();

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
    // $ANTLR end "alterStatementSuffixDropPartitions"


    public static class alterStatementSuffixProperties_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixProperties"
    // AlterClauseParser.g:311:1: alterStatementSuffixProperties : ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? ) );
    public final HiveParser_AlterClauseParser.alterStatementSuffixProperties_return alterStatementSuffixProperties() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixProperties_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET152=null;
        Token KW_TBLPROPERTIES153=null;
        Token KW_UNSET155=null;
        Token KW_TBLPROPERTIES156=null;
        HiveParser.tableProperties_return tableProperties154 =null;

        HiveParser.ifExists_return ifExists157 =null;

        HiveParser.tableProperties_return tableProperties158 =null;


        ASTNode KW_SET152_tree=null;
        ASTNode KW_TBLPROPERTIES153_tree=null;
        ASTNode KW_UNSET155_tree=null;
        ASTNode KW_TBLPROPERTIES156_tree=null;
        RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
        RewriteRuleTokenStream stream_KW_TBLPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_TBLPROPERTIES");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
        RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
         gParent.pushMsg("alter properties statement", state); 
        try {
            // AlterClauseParser.g:314:5: ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERTABLE_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? ) )
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==KW_SET) ) {
                alt34=1;
            }
            else if ( (LA34_0==KW_UNSET) ) {
                alt34=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 34, 0, input);

                throw nvae;

            }
            switch (alt34) {
                case 1 :
                    // AlterClauseParser.g:314:7: KW_SET KW_TBLPROPERTIES tableProperties
                    {
                    KW_SET152=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixProperties2209); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET152);


                    KW_TBLPROPERTIES153=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2211); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES153);


                    pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixProperties2213);
                    tableProperties154=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties154.getTree());

                    // AST REWRITE
                    // elements: tableProperties
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 315:5: -> ^( TOK_ALTERTABLE_PROPERTIES tableProperties )
                    {
                        // AlterClauseParser.g:315:8: ^( TOK_ALTERTABLE_PROPERTIES tableProperties )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_PROPERTIES, "TOK_ALTERTABLE_PROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:316:7: KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties
                    {
                    KW_UNSET155=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterStatementSuffixProperties2233); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_UNSET.add(KW_UNSET155);


                    KW_TBLPROPERTIES156=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2235); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES156);


                    // AlterClauseParser.g:316:33: ( ifExists )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( (LA33_0==KW_IF) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // AlterClauseParser.g:316:33: ifExists
                            {
                            pushFollow(FOLLOW_ifExists_in_alterStatementSuffixProperties2237);
                            ifExists157=gHiveParser.ifExists();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ifExists.add(ifExists157.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixProperties2240);
                    tableProperties158=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties158.getTree());

                    // AST REWRITE
                    // elements: tableProperties, ifExists
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 317:5: -> ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? )
                    {
                        // AlterClauseParser.g:317:8: ^( TOK_ALTERTABLE_DROPPROPERTIES tableProperties ( ifExists )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_DROPPROPERTIES, "TOK_ALTERTABLE_DROPPROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        // AlterClauseParser.g:317:56: ( ifExists )?
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
    // $ANTLR end "alterStatementSuffixProperties"


    public static class alterViewSuffixProperties_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterViewSuffixProperties"
    // AlterClauseParser.g:320:1: alterViewSuffixProperties : ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERVIEW_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? ) );
    public final HiveParser_AlterClauseParser.alterViewSuffixProperties_return alterViewSuffixProperties() throws RecognitionException {
        HiveParser_AlterClauseParser.alterViewSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterViewSuffixProperties_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET159=null;
        Token KW_TBLPROPERTIES160=null;
        Token KW_UNSET162=null;
        Token KW_TBLPROPERTIES163=null;
        HiveParser.tableProperties_return tableProperties161 =null;

        HiveParser.ifExists_return ifExists164 =null;

        HiveParser.tableProperties_return tableProperties165 =null;


        ASTNode KW_SET159_tree=null;
        ASTNode KW_TBLPROPERTIES160_tree=null;
        ASTNode KW_UNSET162_tree=null;
        ASTNode KW_TBLPROPERTIES163_tree=null;
        RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
        RewriteRuleTokenStream stream_KW_TBLPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_TBLPROPERTIES");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
        RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
         gParent.pushMsg("alter view properties statement", state); 
        try {
            // AlterClauseParser.g:323:5: ( KW_SET KW_TBLPROPERTIES tableProperties -> ^( TOK_ALTERVIEW_PROPERTIES tableProperties ) | KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties -> ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? ) )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KW_SET) ) {
                alt36=1;
            }
            else if ( (LA36_0==KW_UNSET) ) {
                alt36=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // AlterClauseParser.g:323:7: KW_SET KW_TBLPROPERTIES tableProperties
                    {
                    KW_SET159=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterViewSuffixProperties2282); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET159);


                    KW_TBLPROPERTIES160=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2284); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES160);


                    pushFollow(FOLLOW_tableProperties_in_alterViewSuffixProperties2286);
                    tableProperties161=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties161.getTree());

                    // AST REWRITE
                    // elements: tableProperties
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 324:5: -> ^( TOK_ALTERVIEW_PROPERTIES tableProperties )
                    {
                        // AlterClauseParser.g:324:8: ^( TOK_ALTERVIEW_PROPERTIES tableProperties )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERVIEW_PROPERTIES, "TOK_ALTERVIEW_PROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:325:7: KW_UNSET KW_TBLPROPERTIES ( ifExists )? tableProperties
                    {
                    KW_UNSET162=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterViewSuffixProperties2306); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_UNSET.add(KW_UNSET162);


                    KW_TBLPROPERTIES163=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2308); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES163);


                    // AlterClauseParser.g:325:33: ( ifExists )?
                    int alt35=2;
                    int LA35_0 = input.LA(1);

                    if ( (LA35_0==KW_IF) ) {
                        alt35=1;
                    }
                    switch (alt35) {
                        case 1 :
                            // AlterClauseParser.g:325:33: ifExists
                            {
                            pushFollow(FOLLOW_ifExists_in_alterViewSuffixProperties2310);
                            ifExists164=gHiveParser.ifExists();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ifExists.add(ifExists164.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_tableProperties_in_alterViewSuffixProperties2313);
                    tableProperties165=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties165.getTree());

                    // AST REWRITE
                    // elements: ifExists, tableProperties
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 326:5: -> ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? )
                    {
                        // AlterClauseParser.g:326:8: ^( TOK_ALTERVIEW_DROPPROPERTIES tableProperties ( ifExists )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERVIEW_DROPPROPERTIES, "TOK_ALTERVIEW_DROPPROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        // AlterClauseParser.g:326:55: ( ifExists )?
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
    // $ANTLR end "alterViewSuffixProperties"


    public static class alterStatementSuffixSerdeProperties_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixSerdeProperties"
    // AlterClauseParser.g:329:1: alterStatementSuffixSerdeProperties[boolean partition] : ( KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> {partition}? ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? ) -> ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? ) | KW_SET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties ) | KW_UNSET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties ) );
    public final HiveParser_AlterClauseParser.alterStatementSuffixSerdeProperties_return alterStatementSuffixSerdeProperties(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixSerdeProperties_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSerdeProperties_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token serdeName=null;
        Token KW_SET166=null;
        Token KW_SERDE167=null;
        Token KW_WITH168=null;
        Token KW_SERDEPROPERTIES169=null;
        Token KW_SET171=null;
        Token KW_SERDEPROPERTIES172=null;
        Token KW_UNSET174=null;
        Token KW_SERDEPROPERTIES175=null;
        HiveParser.tableProperties_return tableProperties170 =null;

        HiveParser.tableProperties_return tableProperties173 =null;

        HiveParser.tableProperties_return tableProperties176 =null;


        ASTNode serdeName_tree=null;
        ASTNode KW_SET166_tree=null;
        ASTNode KW_SERDE167_tree=null;
        ASTNode KW_WITH168_tree=null;
        ASTNode KW_SERDEPROPERTIES169_tree=null;
        ASTNode KW_SET171_tree=null;
        ASTNode KW_SERDEPROPERTIES172_tree=null;
        ASTNode KW_UNSET174_tree=null;
        ASTNode KW_SERDEPROPERTIES175_tree=null;
        RewriteRuleTokenStream stream_KW_UNSET=new RewriteRuleTokenStream(adaptor,"token KW_UNSET");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_SERDEPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_SERDEPROPERTIES");
        RewriteRuleTokenStream stream_KW_SERDE=new RewriteRuleTokenStream(adaptor,"token KW_SERDE");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         gParent.pushMsg("alter serde statement", state); 
        try {
            // AlterClauseParser.g:332:5: ( KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )? -> {partition}? ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? ) -> ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? ) | KW_SET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties ) | KW_UNSET KW_SERDEPROPERTIES tableProperties -> {partition}? ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties ) -> ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties ) )
            int alt38=3;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KW_SET) ) {
                int LA38_1 = input.LA(2);

                if ( (LA38_1==KW_SERDE) ) {
                    alt38=1;
                }
                else if ( (LA38_1==KW_SERDEPROPERTIES) ) {
                    alt38=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 38, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA38_0==KW_UNSET) ) {
                alt38=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 38, 0, input);

                throw nvae;

            }
            switch (alt38) {
                case 1 :
                    // AlterClauseParser.g:332:7: KW_SET KW_SERDE serdeName= StringLiteral ( KW_WITH KW_SERDEPROPERTIES tableProperties )?
                    {
                    KW_SET166=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2356); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET166);


                    KW_SERDE167=(Token)match(input,KW_SERDE,FOLLOW_KW_SERDE_in_alterStatementSuffixSerdeProperties2358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SERDE.add(KW_SERDE167);


                    serdeName=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixSerdeProperties2362); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(serdeName);


                    // AlterClauseParser.g:332:47: ( KW_WITH KW_SERDEPROPERTIES tableProperties )?
                    int alt37=2;
                    int LA37_0 = input.LA(1);

                    if ( (LA37_0==KW_WITH) ) {
                        alt37=1;
                    }
                    switch (alt37) {
                        case 1 :
                            // AlterClauseParser.g:332:48: KW_WITH KW_SERDEPROPERTIES tableProperties
                            {
                            KW_WITH168=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterStatementSuffixSerdeProperties2365); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH168);


                            KW_SERDEPROPERTIES169=(Token)match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2367); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES169);


                            pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2369);
                            tableProperties170=gHiveParser.tableProperties();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties170.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: serdeName, serdeName, tableProperties, tableProperties
                    // token labels: serdeName
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_serdeName=new RewriteRuleTokenStream(adaptor,"token serdeName",serdeName);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 333:5: -> {partition}? ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? )
                    if (partition) {
                        // AlterClauseParser.g:333:21: ^( TOK_ALTERPARTITION_SERIALIZER $serdeName ( tableProperties )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERPARTITION_SERIALIZER, "TOK_ALTERPARTITION_SERIALIZER")
                        , root_1);

                        adaptor.addChild(root_1, stream_serdeName.nextNode());

                        // AlterClauseParser.g:333:64: ( tableProperties )?
                        if ( stream_tableProperties.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        }
                        stream_tableProperties.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 334:5: -> ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? )
                    {
                        // AlterClauseParser.g:334:21: ^( TOK_ALTERTABLE_SERIALIZER $serdeName ( tableProperties )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_SERIALIZER, "TOK_ALTERTABLE_SERIALIZER")
                        , root_1);

                        adaptor.addChild(root_1, stream_serdeName.nextNode());

                        // AlterClauseParser.g:334:60: ( tableProperties )?
                        if ( stream_tableProperties.hasNext() ) {
                            adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        }
                        stream_tableProperties.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:335:7: KW_SET KW_SERDEPROPERTIES tableProperties
                    {
                    KW_SET171=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2426); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET171);


                    KW_SERDEPROPERTIES172=(Token)match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2428); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES172);


                    pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2430);
                    tableProperties173=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties173.getTree());

                    // AST REWRITE
                    // elements: tableProperties, tableProperties
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 336:5: -> {partition}? ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties )
                    if (partition) {
                        // AlterClauseParser.g:336:21: ^( TOK_ALTERPARTITION_SETSERDEPROPERTIES tableProperties )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERPARTITION_SETSERDEPROPERTIES, "TOK_ALTERPARTITION_SETSERDEPROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 337:5: -> ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties )
                    {
                        // AlterClauseParser.g:337:21: ^( TOK_ALTERTABLE_SETSERDEPROPERTIES tableProperties )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_SETSERDEPROPERTIES, "TOK_ALTERTABLE_SETSERDEPROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:338:7: KW_UNSET KW_SERDEPROPERTIES tableProperties
                    {
                    KW_UNSET174=(Token)match(input,KW_UNSET,FOLLOW_KW_UNSET_in_alterStatementSuffixSerdeProperties2477); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_UNSET.add(KW_UNSET174);


                    KW_SERDEPROPERTIES175=(Token)match(input,KW_SERDEPROPERTIES,FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2479); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SERDEPROPERTIES.add(KW_SERDEPROPERTIES175);


                    pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2481);
                    tableProperties176=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties176.getTree());

                    // AST REWRITE
                    // elements: tableProperties, tableProperties
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 339:5: -> {partition}? ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties )
                    if (partition) {
                        // AlterClauseParser.g:339:21: ^( TOK_ALTERPARTITION_UNSETSERDEPROPERTIES tableProperties )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERPARTITION_UNSETSERDEPROPERTIES, "TOK_ALTERPARTITION_UNSETSERDEPROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 340:5: -> ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties )
                    {
                        // AlterClauseParser.g:340:21: ^( TOK_ALTERTABLE_UNSETSERDEPROPERTIES tableProperties )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_UNSETSERDEPROPERTIES, "TOK_ALTERTABLE_UNSETSERDEPROPERTIES")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableProperties.nextTree());

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
    // $ANTLR end "alterStatementSuffixSerdeProperties"


    public static class tablePartitionPrefix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tablePartitionPrefix"
    // AlterClauseParser.g:343:1: tablePartitionPrefix : tableName ( partitionSpec )? -> ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? ) ;
    public final HiveParser_AlterClauseParser.tablePartitionPrefix_return tablePartitionPrefix() throws RecognitionException {
        HiveParser_AlterClauseParser.tablePartitionPrefix_return retval = new HiveParser_AlterClauseParser.tablePartitionPrefix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.tableName_return tableName177 =null;

        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec178 =null;


        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        gParent.pushMsg("table partition prefix", state);
        try {
            // AlterClauseParser.g:346:3: ( tableName ( partitionSpec )? -> ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? ) )
            // AlterClauseParser.g:346:5: tableName ( partitionSpec )?
            {
            pushFollow(FOLLOW_tableName_in_tablePartitionPrefix2545);
            tableName177=gHiveParser.tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tableName177.getTree());

            // AlterClauseParser.g:346:15: ( partitionSpec )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KW_PARTITION) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // AlterClauseParser.g:346:15: partitionSpec
                    {
                    pushFollow(FOLLOW_partitionSpec_in_tablePartitionPrefix2547);
                    partitionSpec178=gHiveParser.partitionSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec178.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tableName, partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 347:3: -> ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? )
            {
                // AlterClauseParser.g:347:5: ^( TOK_TABLE_PARTITION tableName ( partitionSpec )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABLE_PARTITION, "TOK_TABLE_PARTITION")
                , root_1);

                adaptor.addChild(root_1, stream_tableName.nextTree());

                // AlterClauseParser.g:347:37: ( partitionSpec )?
                if ( stream_partitionSpec.hasNext() ) {
                    adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                }
                stream_partitionSpec.reset();

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
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tablePartitionPrefix"


    public static class alterStatementSuffixFileFormat_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixFileFormat"
    // AlterClauseParser.g:350:1: alterStatementSuffixFileFormat[boolean partition] : KW_SET KW_FILEFORMAT fileFormat -> {partition}? ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat ) -> ^( TOK_ALTERTABLE_FILEFORMAT fileFormat ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixFileFormat_return alterStatementSuffixFileFormat(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixFileFormat_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixFileFormat_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET179=null;
        Token KW_FILEFORMAT180=null;
        HiveParser_AlterClauseParser.fileFormat_return fileFormat181 =null;


        ASTNode KW_SET179_tree=null;
        ASTNode KW_FILEFORMAT180_tree=null;
        RewriteRuleTokenStream stream_KW_FILEFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_FILEFORMAT");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_fileFormat=new RewriteRuleSubtreeStream(adaptor,"rule fileFormat");
        gParent.pushMsg("alter fileformat statement", state); 
        try {
            // AlterClauseParser.g:353:3: ( KW_SET KW_FILEFORMAT fileFormat -> {partition}? ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat ) -> ^( TOK_ALTERTABLE_FILEFORMAT fileFormat ) )
            // AlterClauseParser.g:353:5: KW_SET KW_FILEFORMAT fileFormat
            {
            KW_SET179=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixFileFormat2584); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET179);


            KW_FILEFORMAT180=(Token)match(input,KW_FILEFORMAT,FOLLOW_KW_FILEFORMAT_in_alterStatementSuffixFileFormat2586); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FILEFORMAT.add(KW_FILEFORMAT180);


            pushFollow(FOLLOW_fileFormat_in_alterStatementSuffixFileFormat2588);
            fileFormat181=fileFormat();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fileFormat.add(fileFormat181.getTree());

            // AST REWRITE
            // elements: fileFormat, fileFormat
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 354:3: -> {partition}? ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat )
            if (partition) {
                // AlterClauseParser.g:354:19: ^( TOK_ALTERPARTITION_FILEFORMAT fileFormat )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERPARTITION_FILEFORMAT, "TOK_ALTERPARTITION_FILEFORMAT")
                , root_1);

                adaptor.addChild(root_1, stream_fileFormat.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 355:3: -> ^( TOK_ALTERTABLE_FILEFORMAT fileFormat )
            {
                // AlterClauseParser.g:355:19: ^( TOK_ALTERTABLE_FILEFORMAT fileFormat )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_FILEFORMAT, "TOK_ALTERTABLE_FILEFORMAT")
                , root_1);

                adaptor.addChild(root_1, stream_fileFormat.nextTree());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterStatementSuffixFileFormat"


    public static class alterStatementSuffixClusterbySortby_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixClusterbySortby"
    // AlterClauseParser.g:358:1: alterStatementSuffixClusterbySortby : ( KW_NOT KW_CLUSTERED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED ) | KW_NOT KW_SORTED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED ) | tableBuckets -> ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets ) );
    public final HiveParser_AlterClauseParser.alterStatementSuffixClusterbySortby_return alterStatementSuffixClusterbySortby() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixClusterbySortby_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixClusterbySortby_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_NOT182=null;
        Token KW_CLUSTERED183=null;
        Token KW_NOT184=null;
        Token KW_SORTED185=null;
        HiveParser.tableBuckets_return tableBuckets186 =null;


        ASTNode KW_NOT182_tree=null;
        ASTNode KW_CLUSTERED183_tree=null;
        ASTNode KW_NOT184_tree=null;
        ASTNode KW_SORTED185_tree=null;
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
        RewriteRuleTokenStream stream_KW_SORTED=new RewriteRuleTokenStream(adaptor,"token KW_SORTED");
        RewriteRuleTokenStream stream_KW_CLUSTERED=new RewriteRuleTokenStream(adaptor,"token KW_CLUSTERED");
        RewriteRuleSubtreeStream stream_tableBuckets=new RewriteRuleSubtreeStream(adaptor,"rule tableBuckets");
        gParent.pushMsg("alter partition cluster by sort by statement", state);
        try {
            // AlterClauseParser.g:361:3: ( KW_NOT KW_CLUSTERED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED ) | KW_NOT KW_SORTED -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED ) | tableBuckets -> ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets ) )
            int alt40=3;
            int LA40_0 = input.LA(1);

            if ( (LA40_0==KW_NOT) ) {
                int LA40_1 = input.LA(2);

                if ( (LA40_1==KW_CLUSTERED) ) {
                    alt40=1;
                }
                else if ( (LA40_1==KW_SORTED) ) {
                    alt40=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 40, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA40_0==KW_CLUSTERED) ) {
                alt40=3;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;

            }
            switch (alt40) {
                case 1 :
                    // AlterClauseParser.g:361:5: KW_NOT KW_CLUSTERED
                    {
                    KW_NOT182=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2646); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT182);


                    KW_CLUSTERED183=(Token)match(input,KW_CLUSTERED,FOLLOW_KW_CLUSTERED_in_alterStatementSuffixClusterbySortby2648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CLUSTERED.add(KW_CLUSTERED183);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 361:25: -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED )
                    {
                        // AlterClauseParser.g:361:28: ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_CLUSTERED )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_CLUSTER_SORT, "TOK_ALTERTABLE_CLUSTER_SORT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_NOT_CLUSTERED, "TOK_NOT_CLUSTERED")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:362:5: KW_NOT KW_SORTED
                    {
                    KW_NOT184=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2662); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT184);


                    KW_SORTED185=(Token)match(input,KW_SORTED,FOLLOW_KW_SORTED_in_alterStatementSuffixClusterbySortby2664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SORTED.add(KW_SORTED185);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 362:22: -> ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED )
                    {
                        // AlterClauseParser.g:362:25: ^( TOK_ALTERTABLE_CLUSTER_SORT TOK_NOT_SORTED )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_CLUSTER_SORT, "TOK_ALTERTABLE_CLUSTER_SORT")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_NOT_SORTED, "TOK_NOT_SORTED")
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:363:5: tableBuckets
                    {
                    pushFollow(FOLLOW_tableBuckets_in_alterStatementSuffixClusterbySortby2678);
                    tableBuckets186=gHiveParser.tableBuckets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableBuckets.add(tableBuckets186.getTree());

                    // AST REWRITE
                    // elements: tableBuckets
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 363:18: -> ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets )
                    {
                        // AlterClauseParser.g:363:21: ^( TOK_ALTERTABLE_CLUSTER_SORT tableBuckets )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_CLUSTER_SORT, "TOK_ALTERTABLE_CLUSTER_SORT")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableBuckets.nextTree());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterStatementSuffixClusterbySortby"


    public static class alterTblPartitionStatementSuffixSkewedLocation_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterTblPartitionStatementSuffixSkewedLocation"
    // AlterClauseParser.g:366:1: alterTblPartitionStatementSuffixSkewedLocation : KW_SET KW_SKEWED KW_LOCATION skewedLocations -> ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations ) ;
    public final HiveParser_AlterClauseParser.alterTblPartitionStatementSuffixSkewedLocation_return alterTblPartitionStatementSuffixSkewedLocation() throws RecognitionException {
        HiveParser_AlterClauseParser.alterTblPartitionStatementSuffixSkewedLocation_return retval = new HiveParser_AlterClauseParser.alterTblPartitionStatementSuffixSkewedLocation_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET187=null;
        Token KW_SKEWED188=null;
        Token KW_LOCATION189=null;
        HiveParser_AlterClauseParser.skewedLocations_return skewedLocations190 =null;


        ASTNode KW_SET187_tree=null;
        ASTNode KW_SKEWED188_tree=null;
        ASTNode KW_LOCATION189_tree=null;
        RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");
        RewriteRuleTokenStream stream_KW_SKEWED=new RewriteRuleTokenStream(adaptor,"token KW_SKEWED");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_skewedLocations=new RewriteRuleSubtreeStream(adaptor,"rule skewedLocations");
        gParent.pushMsg("alter partition skewed location", state);
        try {
            // AlterClauseParser.g:369:3: ( KW_SET KW_SKEWED KW_LOCATION skewedLocations -> ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations ) )
            // AlterClauseParser.g:369:5: KW_SET KW_SKEWED KW_LOCATION skewedLocations
            {
            KW_SET187=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterTblPartitionStatementSuffixSkewedLocation2709); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET187);


            KW_SKEWED188=(Token)match(input,KW_SKEWED,FOLLOW_KW_SKEWED_in_alterTblPartitionStatementSuffixSkewedLocation2711); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SKEWED.add(KW_SKEWED188);


            KW_LOCATION189=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_alterTblPartitionStatementSuffixSkewedLocation2713); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION189);


            pushFollow(FOLLOW_skewedLocations_in_alterTblPartitionStatementSuffixSkewedLocation2715);
            skewedLocations190=skewedLocations();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_skewedLocations.add(skewedLocations190.getTree());

            // AST REWRITE
            // elements: skewedLocations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 370:3: -> ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations )
            {
                // AlterClauseParser.g:370:6: ^( TOK_ALTERTABLE_SKEWED_LOCATION skewedLocations )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED_LOCATION, "TOK_ALTERTABLE_SKEWED_LOCATION")
                , root_1);

                adaptor.addChild(root_1, stream_skewedLocations.nextTree());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterTblPartitionStatementSuffixSkewedLocation"


    public static class skewedLocations_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "skewedLocations"
    // AlterClauseParser.g:373:1: skewedLocations : LPAREN skewedLocationsList RPAREN -> ^( TOK_SKEWED_LOCATIONS skewedLocationsList ) ;
    public final HiveParser_AlterClauseParser.skewedLocations_return skewedLocations() throws RecognitionException {
        HiveParser_AlterClauseParser.skewedLocations_return retval = new HiveParser_AlterClauseParser.skewedLocations_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN191=null;
        Token RPAREN193=null;
        HiveParser_AlterClauseParser.skewedLocationsList_return skewedLocationsList192 =null;


        ASTNode LPAREN191_tree=null;
        ASTNode RPAREN193_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_skewedLocationsList=new RewriteRuleSubtreeStream(adaptor,"rule skewedLocationsList");
         gParent.pushMsg("skewed locations", state); 
        try {
            // AlterClauseParser.g:376:5: ( LPAREN skewedLocationsList RPAREN -> ^( TOK_SKEWED_LOCATIONS skewedLocationsList ) )
            // AlterClauseParser.g:377:7: LPAREN skewedLocationsList RPAREN
            {
            LPAREN191=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_skewedLocations2756); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN191);


            pushFollow(FOLLOW_skewedLocationsList_in_skewedLocations2758);
            skewedLocationsList192=skewedLocationsList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_skewedLocationsList.add(skewedLocationsList192.getTree());

            RPAREN193=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_skewedLocations2760); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN193);


            // AST REWRITE
            // elements: skewedLocationsList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 377:41: -> ^( TOK_SKEWED_LOCATIONS skewedLocationsList )
            {
                // AlterClauseParser.g:377:44: ^( TOK_SKEWED_LOCATIONS skewedLocationsList )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SKEWED_LOCATIONS, "TOK_SKEWED_LOCATIONS")
                , root_1);

                adaptor.addChild(root_1, stream_skewedLocationsList.nextTree());

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
    // $ANTLR end "skewedLocations"


    public static class skewedLocationsList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "skewedLocationsList"
    // AlterClauseParser.g:380:1: skewedLocationsList : skewedLocationMap ( COMMA skewedLocationMap )* -> ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ ) ;
    public final HiveParser_AlterClauseParser.skewedLocationsList_return skewedLocationsList() throws RecognitionException {
        HiveParser_AlterClauseParser.skewedLocationsList_return retval = new HiveParser_AlterClauseParser.skewedLocationsList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA195=null;
        HiveParser_AlterClauseParser.skewedLocationMap_return skewedLocationMap194 =null;

        HiveParser_AlterClauseParser.skewedLocationMap_return skewedLocationMap196 =null;


        ASTNode COMMA195_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_skewedLocationMap=new RewriteRuleSubtreeStream(adaptor,"rule skewedLocationMap");
         gParent.pushMsg("skewed locations list", state); 
        try {
            // AlterClauseParser.g:383:5: ( skewedLocationMap ( COMMA skewedLocationMap )* -> ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ ) )
            // AlterClauseParser.g:384:7: skewedLocationMap ( COMMA skewedLocationMap )*
            {
            pushFollow(FOLLOW_skewedLocationMap_in_skewedLocationsList2801);
            skewedLocationMap194=skewedLocationMap();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_skewedLocationMap.add(skewedLocationMap194.getTree());

            // AlterClauseParser.g:384:25: ( COMMA skewedLocationMap )*
            loop41:
            do {
                int alt41=2;
                int LA41_0 = input.LA(1);

                if ( (LA41_0==COMMA) ) {
                    alt41=1;
                }


                switch (alt41) {
            	case 1 :
            	    // AlterClauseParser.g:384:26: COMMA skewedLocationMap
            	    {
            	    COMMA195=(Token)match(input,COMMA,FOLLOW_COMMA_in_skewedLocationsList2804); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA195);


            	    pushFollow(FOLLOW_skewedLocationMap_in_skewedLocationsList2806);
            	    skewedLocationMap196=skewedLocationMap();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_skewedLocationMap.add(skewedLocationMap196.getTree());

            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);


            // AST REWRITE
            // elements: skewedLocationMap
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 384:52: -> ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ )
            {
                // AlterClauseParser.g:384:55: ^( TOK_SKEWED_LOCATION_LIST ( skewedLocationMap )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SKEWED_LOCATION_LIST, "TOK_SKEWED_LOCATION_LIST")
                , root_1);

                if ( !(stream_skewedLocationMap.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_skewedLocationMap.hasNext() ) {
                    adaptor.addChild(root_1, stream_skewedLocationMap.nextTree());

                }
                stream_skewedLocationMap.reset();

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
    // $ANTLR end "skewedLocationsList"


    public static class skewedLocationMap_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "skewedLocationMap"
    // AlterClauseParser.g:387:1: skewedLocationMap : key= skewedValueLocationElement EQUAL value= StringLiteral -> ^( TOK_SKEWED_LOCATION_MAP $key $value) ;
    public final HiveParser_AlterClauseParser.skewedLocationMap_return skewedLocationMap() throws RecognitionException {
        HiveParser_AlterClauseParser.skewedLocationMap_return retval = new HiveParser_AlterClauseParser.skewedLocationMap_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token value=null;
        Token EQUAL197=null;
        HiveParser.skewedValueLocationElement_return key =null;


        ASTNode value_tree=null;
        ASTNode EQUAL197_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_EQUAL=new RewriteRuleTokenStream(adaptor,"token EQUAL");
        RewriteRuleSubtreeStream stream_skewedValueLocationElement=new RewriteRuleSubtreeStream(adaptor,"rule skewedValueLocationElement");
         gParent.pushMsg("specifying skewed location map", state); 
        try {
            // AlterClauseParser.g:390:5: (key= skewedValueLocationElement EQUAL value= StringLiteral -> ^( TOK_SKEWED_LOCATION_MAP $key $value) )
            // AlterClauseParser.g:391:7: key= skewedValueLocationElement EQUAL value= StringLiteral
            {
            pushFollow(FOLLOW_skewedValueLocationElement_in_skewedLocationMap2852);
            key=gHiveParser.skewedValueLocationElement();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_skewedValueLocationElement.add(key.getTree());

            EQUAL197=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_skewedLocationMap2854); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_EQUAL.add(EQUAL197);


            value=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_skewedLocationMap2858); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(value);


            // AST REWRITE
            // elements: value, key
            // token labels: value
            // rule labels: key, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_value=new RewriteRuleTokenStream(adaptor,"token value",value);
            RewriteRuleSubtreeStream stream_key=new RewriteRuleSubtreeStream(adaptor,"rule key",key!=null?key.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 391:64: -> ^( TOK_SKEWED_LOCATION_MAP $key $value)
            {
                // AlterClauseParser.g:391:67: ^( TOK_SKEWED_LOCATION_MAP $key $value)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SKEWED_LOCATION_MAP, "TOK_SKEWED_LOCATION_MAP")
                , root_1);

                adaptor.addChild(root_1, stream_key.nextTree());

                adaptor.addChild(root_1, stream_value.nextNode());

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
    // $ANTLR end "skewedLocationMap"


    public static class alterStatementSuffixLocation_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixLocation"
    // AlterClauseParser.g:394:1: alterStatementSuffixLocation[boolean partition] : KW_SET KW_LOCATION newLoc= StringLiteral -> {partition}? ^( TOK_ALTERPARTITION_LOCATION $newLoc) -> ^( TOK_ALTERTABLE_LOCATION $newLoc) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixLocation_return alterStatementSuffixLocation(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixLocation_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixLocation_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token newLoc=null;
        Token KW_SET198=null;
        Token KW_LOCATION199=null;

        ASTNode newLoc_tree=null;
        ASTNode KW_SET198_tree=null;
        ASTNode KW_LOCATION199_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_LOCATION=new RewriteRuleTokenStream(adaptor,"token KW_LOCATION");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");

        gParent.pushMsg("alter location", state);
        try {
            // AlterClauseParser.g:397:3: ( KW_SET KW_LOCATION newLoc= StringLiteral -> {partition}? ^( TOK_ALTERPARTITION_LOCATION $newLoc) -> ^( TOK_ALTERTABLE_LOCATION $newLoc) )
            // AlterClauseParser.g:397:5: KW_SET KW_LOCATION newLoc= StringLiteral
            {
            KW_SET198=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixLocation2896); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET198);


            KW_LOCATION199=(Token)match(input,KW_LOCATION,FOLLOW_KW_LOCATION_in_alterStatementSuffixLocation2898); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_LOCATION.add(KW_LOCATION199);


            newLoc=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixLocation2902); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(newLoc);


            // AST REWRITE
            // elements: newLoc, newLoc
            // token labels: newLoc
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_newLoc=new RewriteRuleTokenStream(adaptor,"token newLoc",newLoc);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 398:3: -> {partition}? ^( TOK_ALTERPARTITION_LOCATION $newLoc)
            if (partition) {
                // AlterClauseParser.g:398:19: ^( TOK_ALTERPARTITION_LOCATION $newLoc)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERPARTITION_LOCATION, "TOK_ALTERPARTITION_LOCATION")
                , root_1);

                adaptor.addChild(root_1, stream_newLoc.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 399:3: -> ^( TOK_ALTERTABLE_LOCATION $newLoc)
            {
                // AlterClauseParser.g:399:19: ^( TOK_ALTERTABLE_LOCATION $newLoc)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_LOCATION, "TOK_ALTERTABLE_LOCATION")
                , root_1);

                adaptor.addChild(root_1, stream_newLoc.nextNode());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterStatementSuffixLocation"


    public static class alterStatementSuffixSkewedby_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixSkewedby"
    // AlterClauseParser.g:403:1: alterStatementSuffixSkewedby : ( tableSkewed -> ^( TOK_ALTERTABLE_SKEWED tableSkewed ) | KW_NOT KW_SKEWED -> ^( TOK_ALTERTABLE_SKEWED ) | KW_NOT storedAsDirs -> ^( TOK_ALTERTABLE_SKEWED storedAsDirs ) );
    public final HiveParser_AlterClauseParser.alterStatementSuffixSkewedby_return alterStatementSuffixSkewedby() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixSkewedby_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSkewedby_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_NOT201=null;
        Token KW_SKEWED202=null;
        Token KW_NOT203=null;
        HiveParser.tableSkewed_return tableSkewed200 =null;

        HiveParser.storedAsDirs_return storedAsDirs204 =null;


        ASTNode KW_NOT201_tree=null;
        ASTNode KW_SKEWED202_tree=null;
        ASTNode KW_NOT203_tree=null;
        RewriteRuleTokenStream stream_KW_NOT=new RewriteRuleTokenStream(adaptor,"token KW_NOT");
        RewriteRuleTokenStream stream_KW_SKEWED=new RewriteRuleTokenStream(adaptor,"token KW_SKEWED");
        RewriteRuleSubtreeStream stream_tableSkewed=new RewriteRuleSubtreeStream(adaptor,"rule tableSkewed");
        RewriteRuleSubtreeStream stream_storedAsDirs=new RewriteRuleSubtreeStream(adaptor,"rule storedAsDirs");
        gParent.pushMsg("alter skewed by statement", state);
        try {
            // AlterClauseParser.g:406:2: ( tableSkewed -> ^( TOK_ALTERTABLE_SKEWED tableSkewed ) | KW_NOT KW_SKEWED -> ^( TOK_ALTERTABLE_SKEWED ) | KW_NOT storedAsDirs -> ^( TOK_ALTERTABLE_SKEWED storedAsDirs ) )
            int alt42=3;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KW_SKEWED) ) {
                alt42=1;
            }
            else if ( (LA42_0==KW_NOT) ) {
                int LA42_2 = input.LA(2);

                if ( (LA42_2==KW_SKEWED) ) {
                    alt42=2;
                }
                else if ( (LA42_2==KW_STORED) ) {
                    alt42=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }
            switch (alt42) {
                case 1 :
                    // AlterClauseParser.g:406:4: tableSkewed
                    {
                    pushFollow(FOLLOW_tableSkewed_in_alterStatementSuffixSkewedby2961);
                    tableSkewed200=gHiveParser.tableSkewed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableSkewed.add(tableSkewed200.getTree());

                    // AST REWRITE
                    // elements: tableSkewed
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 407:2: -> ^( TOK_ALTERTABLE_SKEWED tableSkewed )
                    {
                        // AlterClauseParser.g:407:4: ^( TOK_ALTERTABLE_SKEWED tableSkewed )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED, "TOK_ALTERTABLE_SKEWED")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableSkewed.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:409:3: KW_NOT KW_SKEWED
                    {
                    KW_NOT201=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2976); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT201);


                    KW_SKEWED202=(Token)match(input,KW_SKEWED,FOLLOW_KW_SKEWED_in_alterStatementSuffixSkewedby2978); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SKEWED.add(KW_SKEWED202);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 410:2: -> ^( TOK_ALTERTABLE_SKEWED )
                    {
                        // AlterClauseParser.g:410:4: ^( TOK_ALTERTABLE_SKEWED )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED, "TOK_ALTERTABLE_SKEWED")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:412:3: KW_NOT storedAsDirs
                    {
                    KW_NOT203=(Token)match(input,KW_NOT,FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2991); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_NOT.add(KW_NOT203);


                    pushFollow(FOLLOW_storedAsDirs_in_alterStatementSuffixSkewedby2993);
                    storedAsDirs204=gHiveParser.storedAsDirs();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_storedAsDirs.add(storedAsDirs204.getTree());

                    // AST REWRITE
                    // elements: storedAsDirs
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 413:2: -> ^( TOK_ALTERTABLE_SKEWED storedAsDirs )
                    {
                        // AlterClauseParser.g:413:4: ^( TOK_ALTERTABLE_SKEWED storedAsDirs )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_SKEWED, "TOK_ALTERTABLE_SKEWED")
                        , root_1);

                        adaptor.addChild(root_1, stream_storedAsDirs.nextTree());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterStatementSuffixSkewedby"


    public static class alterStatementSuffixExchangePartition_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixExchangePartition"
    // AlterClauseParser.g:416:1: alterStatementSuffixExchangePartition : KW_EXCHANGE partitionSpec KW_WITH KW_TABLE exchangename= tableName -> ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixExchangePartition_return alterStatementSuffixExchangePartition() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixExchangePartition_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixExchangePartition_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_EXCHANGE205=null;
        Token KW_WITH207=null;
        Token KW_TABLE208=null;
        HiveParser_FromClauseParser.tableName_return exchangename =null;

        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec206 =null;


        ASTNode KW_EXCHANGE205_tree=null;
        ASTNode KW_WITH207_tree=null;
        ASTNode KW_TABLE208_tree=null;
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_KW_EXCHANGE=new RewriteRuleTokenStream(adaptor,"token KW_EXCHANGE");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        gParent.pushMsg("alter exchange partition", state);
        try {
            // AlterClauseParser.g:419:5: ( KW_EXCHANGE partitionSpec KW_WITH KW_TABLE exchangename= tableName -> ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename) )
            // AlterClauseParser.g:419:7: KW_EXCHANGE partitionSpec KW_WITH KW_TABLE exchangename= tableName
            {
            KW_EXCHANGE205=(Token)match(input,KW_EXCHANGE,FOLLOW_KW_EXCHANGE_in_alterStatementSuffixExchangePartition3024); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_EXCHANGE.add(KW_EXCHANGE205);


            pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixExchangePartition3026);
            partitionSpec206=gHiveParser.partitionSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec206.getTree());

            KW_WITH207=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterStatementSuffixExchangePartition3028); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH207);


            KW_TABLE208=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_alterStatementSuffixExchangePartition3030); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE208);


            pushFollow(FOLLOW_tableName_in_alterStatementSuffixExchangePartition3034);
            exchangename=gHiveParser.tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(exchangename.getTree());

            // AST REWRITE
            // elements: exchangename, partitionSpec
            // token labels: 
            // rule labels: exchangename, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_exchangename=new RewriteRuleSubtreeStream(adaptor,"rule exchangename",exchangename!=null?exchangename.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 420:5: -> ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename)
            {
                // AlterClauseParser.g:420:8: ^( TOK_ALTERTABLE_EXCHANGEPARTITION partitionSpec $exchangename)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_EXCHANGEPARTITION, "TOK_ALTERTABLE_EXCHANGEPARTITION")
                , root_1);

                adaptor.addChild(root_1, stream_partitionSpec.nextTree());

                adaptor.addChild(root_1, stream_exchangename.nextTree());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state);}
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterStatementSuffixExchangePartition"


    public static class alterStatementSuffixRenamePart_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixRenamePart"
    // AlterClauseParser.g:423:1: alterStatementSuffixRenamePart : KW_RENAME KW_TO partitionSpec -> ^( TOK_ALTERTABLE_RENAMEPART partitionSpec ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixRenamePart_return alterStatementSuffixRenamePart() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixRenamePart_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixRenamePart_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_RENAME209=null;
        Token KW_TO210=null;
        HiveParser_IdentifiersParser.partitionSpec_return partitionSpec211 =null;


        ASTNode KW_RENAME209_tree=null;
        ASTNode KW_TO210_tree=null;
        RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleSubtreeStream stream_partitionSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionSpec");
         gParent.pushMsg("alter table rename partition statement", state); 
        try {
            // AlterClauseParser.g:426:5: ( KW_RENAME KW_TO partitionSpec -> ^( TOK_ALTERTABLE_RENAMEPART partitionSpec ) )
            // AlterClauseParser.g:426:7: KW_RENAME KW_TO partitionSpec
            {
            KW_RENAME209=(Token)match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterStatementSuffixRenamePart3076); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RENAME.add(KW_RENAME209);


            KW_TO210=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterStatementSuffixRenamePart3078); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO210);


            pushFollow(FOLLOW_partitionSpec_in_alterStatementSuffixRenamePart3080);
            partitionSpec211=gHiveParser.partitionSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionSpec.add(partitionSpec211.getTree());

            // AST REWRITE
            // elements: partitionSpec
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 427:5: -> ^( TOK_ALTERTABLE_RENAMEPART partitionSpec )
            {
                // AlterClauseParser.g:427:7: ^( TOK_ALTERTABLE_RENAMEPART partitionSpec )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_RENAMEPART, "TOK_ALTERTABLE_RENAMEPART")
                , root_1);

                adaptor.addChild(root_1, stream_partitionSpec.nextTree());

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
    // $ANTLR end "alterStatementSuffixRenamePart"


    public static class alterStatementSuffixStatsPart_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixStatsPart"
    // AlterClauseParser.g:430:1: alterStatementSuffixStatsPart : KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixStatsPart_return alterStatementSuffixStatsPart() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixStatsPart_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixStatsPart_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token comment=null;
        Token KW_UPDATE212=null;
        Token KW_STATISTICS213=null;
        Token KW_FOR214=null;
        Token KW_COLUMN215=null;
        Token KW_SET216=null;
        Token KW_COMMENT218=null;
        HiveParser_IdentifiersParser.identifier_return colName =null;

        HiveParser.tableProperties_return tableProperties217 =null;


        ASTNode comment_tree=null;
        ASTNode KW_UPDATE212_tree=null;
        ASTNode KW_STATISTICS213_tree=null;
        ASTNode KW_FOR214_tree=null;
        ASTNode KW_COLUMN215_tree=null;
        ASTNode KW_SET216_tree=null;
        ASTNode KW_COMMENT218_tree=null;
        RewriteRuleTokenStream stream_KW_STATISTICS=new RewriteRuleTokenStream(adaptor,"token KW_STATISTICS");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleTokenStream stream_KW_UPDATE=new RewriteRuleTokenStream(adaptor,"token KW_UPDATE");
        RewriteRuleTokenStream stream_KW_COMMENT=new RewriteRuleTokenStream(adaptor,"token KW_COMMENT");
        RewriteRuleTokenStream stream_KW_COLUMN=new RewriteRuleTokenStream(adaptor,"token KW_COLUMN");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
         gParent.pushMsg("alter table stats partition statement", state); 
        try {
            // AlterClauseParser.g:433:5: ( KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )? -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? ) )
            // AlterClauseParser.g:433:7: KW_UPDATE KW_STATISTICS KW_FOR ( KW_COLUMN )? colName= identifier KW_SET tableProperties ( KW_COMMENT comment= StringLiteral )?
            {
            KW_UPDATE212=(Token)match(input,KW_UPDATE,FOLLOW_KW_UPDATE_in_alterStatementSuffixStatsPart3118); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UPDATE.add(KW_UPDATE212);


            KW_STATISTICS213=(Token)match(input,KW_STATISTICS,FOLLOW_KW_STATISTICS_in_alterStatementSuffixStatsPart3120); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_STATISTICS.add(KW_STATISTICS213);


            KW_FOR214=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_alterStatementSuffixStatsPart3122); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR214);


            // AlterClauseParser.g:433:38: ( KW_COLUMN )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KW_COLUMN) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // AlterClauseParser.g:433:38: KW_COLUMN
                    {
                    KW_COLUMN215=(Token)match(input,KW_COLUMN,FOLLOW_KW_COLUMN_in_alterStatementSuffixStatsPart3124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_COLUMN.add(KW_COLUMN215);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixStatsPart3129);
            colName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(colName.getTree());

            KW_SET216=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixStatsPart3131); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET216);


            pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixStatsPart3133);
            tableProperties217=gHiveParser.tableProperties();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties217.getTree());

            // AlterClauseParser.g:433:91: ( KW_COMMENT comment= StringLiteral )?
            int alt44=2;
            int LA44_0 = input.LA(1);

            if ( (LA44_0==KW_COMMENT) ) {
                alt44=1;
            }
            switch (alt44) {
                case 1 :
                    // AlterClauseParser.g:433:92: KW_COMMENT comment= StringLiteral
                    {
                    KW_COMMENT218=(Token)match(input,KW_COMMENT,FOLLOW_KW_COMMENT_in_alterStatementSuffixStatsPart3136); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_COMMENT.add(KW_COMMENT218);


                    comment=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixStatsPart3140); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(comment);


                    }
                    break;

            }


            // AST REWRITE
            // elements: colName, comment, tableProperties
            // token labels: comment
            // rule labels: colName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_comment=new RewriteRuleTokenStream(adaptor,"token comment",comment);
            RewriteRuleSubtreeStream stream_colName=new RewriteRuleSubtreeStream(adaptor,"rule colName",colName!=null?colName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 434:5: -> ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
            {
                // AlterClauseParser.g:434:7: ^( TOK_ALTERTABLE_UPDATECOLSTATS $colName tableProperties ( $comment)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_UPDATECOLSTATS, "TOK_ALTERTABLE_UPDATECOLSTATS")
                , root_1);

                adaptor.addChild(root_1, stream_colName.nextTree());

                adaptor.addChild(root_1, stream_tableProperties.nextTree());

                // AlterClauseParser.g:434:65: ( $comment)?
                if ( stream_comment.hasNext() ) {
                    adaptor.addChild(root_1, stream_comment.nextNode());

                }
                stream_comment.reset();

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
    // $ANTLR end "alterStatementSuffixStatsPart"


    public static class alterStatementSuffixMergeFiles_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixMergeFiles"
    // AlterClauseParser.g:437:1: alterStatementSuffixMergeFiles[boolean partition] : KW_CONCATENATE -> {partition}? ^( TOK_ALTERPARTITION_MERGEFILES ) -> ^( TOK_ALTERTABLE_MERGEFILES ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixMergeFiles_return alterStatementSuffixMergeFiles(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixMergeFiles_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixMergeFiles_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CONCATENATE219=null;

        ASTNode KW_CONCATENATE219_tree=null;
        RewriteRuleTokenStream stream_KW_CONCATENATE=new RewriteRuleTokenStream(adaptor,"token KW_CONCATENATE");

         gParent.pushMsg("", state); 
        try {
            // AlterClauseParser.g:440:5: ( KW_CONCATENATE -> {partition}? ^( TOK_ALTERPARTITION_MERGEFILES ) -> ^( TOK_ALTERTABLE_MERGEFILES ) )
            // AlterClauseParser.g:440:7: KW_CONCATENATE
            {
            KW_CONCATENATE219=(Token)match(input,KW_CONCATENATE,FOLLOW_KW_CONCATENATE_in_alterStatementSuffixMergeFiles3188); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CONCATENATE.add(KW_CONCATENATE219);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 441:5: -> {partition}? ^( TOK_ALTERPARTITION_MERGEFILES )
            if (partition) {
                // AlterClauseParser.g:441:21: ^( TOK_ALTERPARTITION_MERGEFILES )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERPARTITION_MERGEFILES, "TOK_ALTERPARTITION_MERGEFILES")
                , root_1);

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 442:5: -> ^( TOK_ALTERTABLE_MERGEFILES )
            {
                // AlterClauseParser.g:442:21: ^( TOK_ALTERTABLE_MERGEFILES )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_MERGEFILES, "TOK_ALTERTABLE_MERGEFILES")
                , root_1);

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
    // $ANTLR end "alterStatementSuffixMergeFiles"


    public static class alterStatementSuffixBucketNum_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixBucketNum"
    // AlterClauseParser.g:445:1: alterStatementSuffixBucketNum[boolean partition] : KW_INTO num= Number KW_BUCKETS -> {partition}? ^( TOK_ALTERPARTITION_BUCKETS $num) -> ^( TOK_ALTERTABLE_BUCKETS $num) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixBucketNum_return alterStatementSuffixBucketNum(boolean partition) throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixBucketNum_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixBucketNum_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token num=null;
        Token KW_INTO220=null;
        Token KW_BUCKETS221=null;

        ASTNode num_tree=null;
        ASTNode KW_INTO220_tree=null;
        ASTNode KW_BUCKETS221_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_INTO=new RewriteRuleTokenStream(adaptor,"token KW_INTO");
        RewriteRuleTokenStream stream_KW_BUCKETS=new RewriteRuleTokenStream(adaptor,"token KW_BUCKETS");

         gParent.pushMsg("", state); 
        try {
            // AlterClauseParser.g:448:5: ( KW_INTO num= Number KW_BUCKETS -> {partition}? ^( TOK_ALTERPARTITION_BUCKETS $num) -> ^( TOK_ALTERTABLE_BUCKETS $num) )
            // AlterClauseParser.g:448:7: KW_INTO num= Number KW_BUCKETS
            {
            KW_INTO220=(Token)match(input,KW_INTO,FOLLOW_KW_INTO_in_alterStatementSuffixBucketNum3251); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_INTO.add(KW_INTO220);


            num=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixBucketNum3255); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(num);


            KW_BUCKETS221=(Token)match(input,KW_BUCKETS,FOLLOW_KW_BUCKETS_in_alterStatementSuffixBucketNum3257); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BUCKETS.add(KW_BUCKETS221);


            // AST REWRITE
            // elements: num, num
            // token labels: num
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_num=new RewriteRuleTokenStream(adaptor,"token num",num);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 449:5: -> {partition}? ^( TOK_ALTERPARTITION_BUCKETS $num)
            if (partition) {
                // AlterClauseParser.g:449:21: ^( TOK_ALTERPARTITION_BUCKETS $num)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERPARTITION_BUCKETS, "TOK_ALTERPARTITION_BUCKETS")
                , root_1);

                adaptor.addChild(root_1, stream_num.nextNode());

                adaptor.addChild(root_0, root_1);
                }

            }

            else // 450:5: -> ^( TOK_ALTERTABLE_BUCKETS $num)
            {
                // AlterClauseParser.g:450:21: ^( TOK_ALTERTABLE_BUCKETS $num)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_BUCKETS, "TOK_ALTERTABLE_BUCKETS")
                , root_1);

                adaptor.addChild(root_1, stream_num.nextNode());

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
    // $ANTLR end "alterStatementSuffixBucketNum"


    public static class blocking_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "blocking"
    // AlterClauseParser.g:453:1: blocking : KW_AND KW_WAIT -> TOK_BLOCKING ;
    public final HiveParser_AlterClauseParser.blocking_return blocking() throws RecognitionException {
        HiveParser_AlterClauseParser.blocking_return retval = new HiveParser_AlterClauseParser.blocking_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AND222=null;
        Token KW_WAIT223=null;

        ASTNode KW_AND222_tree=null;
        ASTNode KW_WAIT223_tree=null;
        RewriteRuleTokenStream stream_KW_WAIT=new RewriteRuleTokenStream(adaptor,"token KW_WAIT");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");

        try {
            // AlterClauseParser.g:454:3: ( KW_AND KW_WAIT -> TOK_BLOCKING )
            // AlterClauseParser.g:454:5: KW_AND KW_WAIT
            {
            KW_AND222=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_blocking3313); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND222);


            KW_WAIT223=(Token)match(input,KW_WAIT,FOLLOW_KW_WAIT_in_blocking3315); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WAIT.add(KW_WAIT223);


            // AST REWRITE
            // elements: 
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 455:3: -> TOK_BLOCKING
            {
                adaptor.addChild(root_0, 
                (ASTNode)adaptor.create(TOK_BLOCKING, "TOK_BLOCKING")
                );

            }


            retval.tree = root_0;
            }

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
    // $ANTLR end "blocking"


    public static class compactPool_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compactPool"
    // AlterClauseParser.g:458:1: compactPool : KW_POOL poolName= StringLiteral -> ^( TOK_COMPACT_POOL $poolName) ;
    public final HiveParser_AlterClauseParser.compactPool_return compactPool() throws RecognitionException {
        HiveParser_AlterClauseParser.compactPool_return retval = new HiveParser_AlterClauseParser.compactPool_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token poolName=null;
        Token KW_POOL224=null;

        ASTNode poolName_tree=null;
        ASTNode KW_POOL224_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_POOL=new RewriteRuleTokenStream(adaptor,"token KW_POOL");

        try {
            // AlterClauseParser.g:459:3: ( KW_POOL poolName= StringLiteral -> ^( TOK_COMPACT_POOL $poolName) )
            // AlterClauseParser.g:459:5: KW_POOL poolName= StringLiteral
            {
            KW_POOL224=(Token)match(input,KW_POOL,FOLLOW_KW_POOL_in_compactPool3334); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_POOL.add(KW_POOL224);


            poolName=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_compactPool3338); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(poolName);


            // AST REWRITE
            // elements: poolName
            // token labels: poolName
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_poolName=new RewriteRuleTokenStream(adaptor,"token poolName",poolName);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 460:3: -> ^( TOK_COMPACT_POOL $poolName)
            {
                // AlterClauseParser.g:460:6: ^( TOK_COMPACT_POOL $poolName)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_COMPACT_POOL, "TOK_COMPACT_POOL")
                , root_1);

                adaptor.addChild(root_1, stream_poolName.nextNode());

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
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compactPool"


    public static class alterStatementSuffixCompact_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixCompact"
    // AlterClauseParser.g:463:1: alterStatementSuffixCompact : KW_COMPACT compactType= StringLiteral ( tableImplBuckets )? ( blocking )? ( compactPool )? ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )? ( orderByClause )? -> ^( TOK_ALTERTABLE_COMPACT $compactType ( tableImplBuckets )? ( blocking )? ( compactPool )? ( tableProperties )? ( orderByClause )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixCompact_return alterStatementSuffixCompact() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixCompact_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixCompact_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token compactType=null;
        Token KW_COMPACT225=null;
        Token KW_WITH229=null;
        Token KW_OVERWRITE230=null;
        Token KW_TBLPROPERTIES231=null;
        HiveParser.tableImplBuckets_return tableImplBuckets226 =null;

        HiveParser_AlterClauseParser.blocking_return blocking227 =null;

        HiveParser_AlterClauseParser.compactPool_return compactPool228 =null;

        HiveParser.tableProperties_return tableProperties232 =null;

        HiveParser_IdentifiersParser.orderByClause_return orderByClause233 =null;


        ASTNode compactType_tree=null;
        ASTNode KW_COMPACT225_tree=null;
        ASTNode KW_WITH229_tree=null;
        ASTNode KW_OVERWRITE230_tree=null;
        ASTNode KW_TBLPROPERTIES231_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_COMPACT=new RewriteRuleTokenStream(adaptor,"token KW_COMPACT");
        RewriteRuleTokenStream stream_KW_OVERWRITE=new RewriteRuleTokenStream(adaptor,"token KW_OVERWRITE");
        RewriteRuleTokenStream stream_KW_TBLPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_TBLPROPERTIES");
        RewriteRuleSubtreeStream stream_blocking=new RewriteRuleSubtreeStream(adaptor,"rule blocking");
        RewriteRuleSubtreeStream stream_tableImplBuckets=new RewriteRuleSubtreeStream(adaptor,"rule tableImplBuckets");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
        RewriteRuleSubtreeStream stream_compactPool=new RewriteRuleSubtreeStream(adaptor,"rule compactPool");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
         gParent.msgs.push("compaction request"); 
        try {
            // AlterClauseParser.g:466:5: ( KW_COMPACT compactType= StringLiteral ( tableImplBuckets )? ( blocking )? ( compactPool )? ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )? ( orderByClause )? -> ^( TOK_ALTERTABLE_COMPACT $compactType ( tableImplBuckets )? ( blocking )? ( compactPool )? ( tableProperties )? ( orderByClause )? ) )
            // AlterClauseParser.g:466:7: KW_COMPACT compactType= StringLiteral ( tableImplBuckets )? ( blocking )? ( compactPool )? ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )? ( orderByClause )?
            {
            KW_COMPACT225=(Token)match(input,KW_COMPACT,FOLLOW_KW_COMPACT_in_alterStatementSuffixCompact3374); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_COMPACT.add(KW_COMPACT225);


            compactType=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixCompact3378); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(compactType);


            // AlterClauseParser.g:466:44: ( tableImplBuckets )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==KW_CLUSTERED) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // AlterClauseParser.g:466:44: tableImplBuckets
                    {
                    pushFollow(FOLLOW_tableImplBuckets_in_alterStatementSuffixCompact3380);
                    tableImplBuckets226=gHiveParser.tableImplBuckets();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableImplBuckets.add(tableImplBuckets226.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:466:62: ( blocking )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==KW_AND) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // AlterClauseParser.g:466:62: blocking
                    {
                    pushFollow(FOLLOW_blocking_in_alterStatementSuffixCompact3383);
                    blocking227=blocking();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_blocking.add(blocking227.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:466:72: ( compactPool )?
            int alt47=2;
            int LA47_0 = input.LA(1);

            if ( (LA47_0==KW_POOL) ) {
                alt47=1;
            }
            switch (alt47) {
                case 1 :
                    // AlterClauseParser.g:466:72: compactPool
                    {
                    pushFollow(FOLLOW_compactPool_in_alterStatementSuffixCompact3386);
                    compactPool228=compactPool();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_compactPool.add(compactPool228.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:466:85: ( KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==KW_WITH) ) {
                alt48=1;
            }
            switch (alt48) {
                case 1 :
                    // AlterClauseParser.g:466:86: KW_WITH KW_OVERWRITE KW_TBLPROPERTIES tableProperties
                    {
                    KW_WITH229=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_alterStatementSuffixCompact3390); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH229);


                    KW_OVERWRITE230=(Token)match(input,KW_OVERWRITE,FOLLOW_KW_OVERWRITE_in_alterStatementSuffixCompact3392); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OVERWRITE.add(KW_OVERWRITE230);


                    KW_TBLPROPERTIES231=(Token)match(input,KW_TBLPROPERTIES,FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixCompact3394); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TBLPROPERTIES.add(KW_TBLPROPERTIES231);


                    pushFollow(FOLLOW_tableProperties_in_alterStatementSuffixCompact3396);
                    tableProperties232=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(tableProperties232.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:466:142: ( orderByClause )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KW_ORDER) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // AlterClauseParser.g:466:142: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_alterStatementSuffixCompact3400);
                    orderByClause233=gHiveParser.orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause233.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: blocking, compactType, tableImplBuckets, compactPool, tableProperties, orderByClause
            // token labels: compactType
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_compactType=new RewriteRuleTokenStream(adaptor,"token compactType",compactType);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 467:5: -> ^( TOK_ALTERTABLE_COMPACT $compactType ( tableImplBuckets )? ( blocking )? ( compactPool )? ( tableProperties )? ( orderByClause )? )
            {
                // AlterClauseParser.g:467:8: ^( TOK_ALTERTABLE_COMPACT $compactType ( tableImplBuckets )? ( blocking )? ( compactPool )? ( tableProperties )? ( orderByClause )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_COMPACT, "TOK_ALTERTABLE_COMPACT")
                , root_1);

                adaptor.addChild(root_1, stream_compactType.nextNode());

                // AlterClauseParser.g:467:46: ( tableImplBuckets )?
                if ( stream_tableImplBuckets.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableImplBuckets.nextTree());

                }
                stream_tableImplBuckets.reset();

                // AlterClauseParser.g:467:64: ( blocking )?
                if ( stream_blocking.hasNext() ) {
                    adaptor.addChild(root_1, stream_blocking.nextTree());

                }
                stream_blocking.reset();

                // AlterClauseParser.g:467:74: ( compactPool )?
                if ( stream_compactPool.hasNext() ) {
                    adaptor.addChild(root_1, stream_compactPool.nextTree());

                }
                stream_compactPool.reset();

                // AlterClauseParser.g:467:87: ( tableProperties )?
                if ( stream_tableProperties.hasNext() ) {
                    adaptor.addChild(root_1, stream_tableProperties.nextTree());

                }
                stream_tableProperties.reset();

                // AlterClauseParser.g:467:104: ( orderByClause )?
                if ( stream_orderByClause.hasNext() ) {
                    adaptor.addChild(root_1, stream_orderByClause.nextTree());

                }
                stream_orderByClause.reset();

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
            if ( state.backtracking==0 ) { gParent.msgs.pop(); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alterStatementSuffixCompact"


    public static class alterStatementSuffixSetOwner_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixSetOwner"
    // AlterClauseParser.g:470:1: alterStatementSuffixSetOwner : KW_SET KW_OWNER principalName -> ^( TOK_ALTERTABLE_OWNER principalName ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixSetOwner_return alterStatementSuffixSetOwner() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixSetOwner_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSetOwner_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET234=null;
        Token KW_OWNER235=null;
        HiveParser.principalName_return principalName236 =null;


        ASTNode KW_SET234_tree=null;
        ASTNode KW_OWNER235_tree=null;
        RewriteRuleTokenStream stream_KW_OWNER=new RewriteRuleTokenStream(adaptor,"token KW_OWNER");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_principalName=new RewriteRuleSubtreeStream(adaptor,"rule principalName");
         gParent.pushMsg("alter table set owner", state); 
        try {
            // AlterClauseParser.g:473:5: ( KW_SET KW_OWNER principalName -> ^( TOK_ALTERTABLE_OWNER principalName ) )
            // AlterClauseParser.g:473:7: KW_SET KW_OWNER principalName
            {
            KW_SET234=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSetOwner3456); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET234);


            KW_OWNER235=(Token)match(input,KW_OWNER,FOLLOW_KW_OWNER_in_alterStatementSuffixSetOwner3458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OWNER.add(KW_OWNER235);


            pushFollow(FOLLOW_principalName_in_alterStatementSuffixSetOwner3460);
            principalName236=gHiveParser.principalName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_principalName.add(principalName236.getTree());

            // AST REWRITE
            // elements: principalName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 474:5: -> ^( TOK_ALTERTABLE_OWNER principalName )
            {
                // AlterClauseParser.g:474:8: ^( TOK_ALTERTABLE_OWNER principalName )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_OWNER, "TOK_ALTERTABLE_OWNER")
                , root_1);

                adaptor.addChild(root_1, stream_principalName.nextTree());

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
    // $ANTLR end "alterStatementSuffixSetOwner"


    public static class alterStatementSuffixSetPartSpec_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixSetPartSpec"
    // AlterClauseParser.g:477:1: alterStatementSuffixSetPartSpec : KW_SET KW_PARTITION KW_SPEC LPAREN (spec= partitionTransformSpec ) RPAREN -> ^( TOK_ALTERTABLE_SETPARTSPEC $spec) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixSetPartSpec_return alterStatementSuffixSetPartSpec() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixSetPartSpec_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixSetPartSpec_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET237=null;
        Token KW_PARTITION238=null;
        Token KW_SPEC239=null;
        Token LPAREN240=null;
        Token RPAREN241=null;
        HiveParser.partitionTransformSpec_return spec =null;


        ASTNode KW_SET237_tree=null;
        ASTNode KW_PARTITION238_tree=null;
        ASTNode KW_SPEC239_tree=null;
        ASTNode LPAREN240_tree=null;
        ASTNode RPAREN241_tree=null;
        RewriteRuleTokenStream stream_KW_PARTITION=new RewriteRuleTokenStream(adaptor,"token KW_PARTITION");
        RewriteRuleTokenStream stream_KW_SPEC=new RewriteRuleTokenStream(adaptor,"token KW_SPEC");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_partitionTransformSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitionTransformSpec");
         gParent.pushMsg("alter table set partition spec", state); 
        try {
            // AlterClauseParser.g:480:5: ( KW_SET KW_PARTITION KW_SPEC LPAREN (spec= partitionTransformSpec ) RPAREN -> ^( TOK_ALTERTABLE_SETPARTSPEC $spec) )
            // AlterClauseParser.g:480:7: KW_SET KW_PARTITION KW_SPEC LPAREN (spec= partitionTransformSpec ) RPAREN
            {
            KW_SET237=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterStatementSuffixSetPartSpec3499); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET237);


            KW_PARTITION238=(Token)match(input,KW_PARTITION,FOLLOW_KW_PARTITION_in_alterStatementSuffixSetPartSpec3501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_PARTITION.add(KW_PARTITION238);


            KW_SPEC239=(Token)match(input,KW_SPEC,FOLLOW_KW_SPEC_in_alterStatementSuffixSetPartSpec3503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SPEC.add(KW_SPEC239);


            LPAREN240=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixSetPartSpec3505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN240);


            // AlterClauseParser.g:480:42: (spec= partitionTransformSpec )
            // AlterClauseParser.g:480:43: spec= partitionTransformSpec
            {
            pushFollow(FOLLOW_partitionTransformSpec_in_alterStatementSuffixSetPartSpec3512);
            spec=gHiveParser.partitionTransformSpec();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionTransformSpec.add(spec.getTree());

            }


            RPAREN241=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixSetPartSpec3515); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN241);


            // AST REWRITE
            // elements: spec
            // token labels: 
            // rule labels: spec, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec",spec!=null?spec.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 481:5: -> ^( TOK_ALTERTABLE_SETPARTSPEC $spec)
            {
                // AlterClauseParser.g:481:8: ^( TOK_ALTERTABLE_SETPARTSPEC $spec)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_SETPARTSPEC, "TOK_ALTERTABLE_SETPARTSPEC")
                , root_1);

                adaptor.addChild(root_1, stream_spec.nextTree());

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
    // $ANTLR end "alterStatementSuffixSetPartSpec"


    public static class alterStatementSuffixConvert_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixConvert"
    // AlterClauseParser.g:484:1: alterStatementSuffixConvert : KW_CONVERT KW_TO genericSpec= identifier ( tablePropertiesPrefixed )? -> ^( TOK_ALTERTABLE_CONVERT $genericSpec ( tablePropertiesPrefixed )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixConvert_return alterStatementSuffixConvert() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixConvert_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixConvert_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CONVERT242=null;
        Token KW_TO243=null;
        HiveParser_IdentifiersParser.identifier_return genericSpec =null;

        HiveParser.tablePropertiesPrefixed_return tablePropertiesPrefixed244 =null;


        ASTNode KW_CONVERT242_tree=null;
        ASTNode KW_TO243_tree=null;
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleTokenStream stream_KW_CONVERT=new RewriteRuleTokenStream(adaptor,"token KW_CONVERT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_tablePropertiesPrefixed=new RewriteRuleSubtreeStream(adaptor,"rule tablePropertiesPrefixed");
         gParent.pushMsg("alter table convert to", state); 
        try {
            // AlterClauseParser.g:487:5: ( KW_CONVERT KW_TO genericSpec= identifier ( tablePropertiesPrefixed )? -> ^( TOK_ALTERTABLE_CONVERT $genericSpec ( tablePropertiesPrefixed )? ) )
            // AlterClauseParser.g:487:7: KW_CONVERT KW_TO genericSpec= identifier ( tablePropertiesPrefixed )?
            {
            KW_CONVERT242=(Token)match(input,KW_CONVERT,FOLLOW_KW_CONVERT_in_alterStatementSuffixConvert3555); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CONVERT.add(KW_CONVERT242);


            KW_TO243=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterStatementSuffixConvert3557); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO243);


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixConvert3561);
            genericSpec=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(genericSpec.getTree());

            // AlterClauseParser.g:487:47: ( tablePropertiesPrefixed )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==KW_TBLPROPERTIES) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // AlterClauseParser.g:487:47: tablePropertiesPrefixed
                    {
                    pushFollow(FOLLOW_tablePropertiesPrefixed_in_alterStatementSuffixConvert3563);
                    tablePropertiesPrefixed244=gHiveParser.tablePropertiesPrefixed();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tablePropertiesPrefixed.add(tablePropertiesPrefixed244.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tablePropertiesPrefixed, genericSpec
            // token labels: 
            // rule labels: genericSpec, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_genericSpec=new RewriteRuleSubtreeStream(adaptor,"rule genericSpec",genericSpec!=null?genericSpec.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 488:5: -> ^( TOK_ALTERTABLE_CONVERT $genericSpec ( tablePropertiesPrefixed )? )
            {
                // AlterClauseParser.g:488:8: ^( TOK_ALTERTABLE_CONVERT $genericSpec ( tablePropertiesPrefixed )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_CONVERT, "TOK_ALTERTABLE_CONVERT")
                , root_1);

                adaptor.addChild(root_1, stream_genericSpec.nextTree());

                // AlterClauseParser.g:488:46: ( tablePropertiesPrefixed )?
                if ( stream_tablePropertiesPrefixed.hasNext() ) {
                    adaptor.addChild(root_1, stream_tablePropertiesPrefixed.nextTree());

                }
                stream_tablePropertiesPrefixed.reset();

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
    // $ANTLR end "alterStatementSuffixConvert"


    public static class alterStatementSuffixExecute_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixExecute"
    // AlterClauseParser.g:491:1: alterStatementSuffixExecute : ( KW_EXECUTE KW_ROLLBACK LPAREN (rollbackParam= ( StringLiteral | Number ) ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS ( LPAREN (expireParam= StringLiteral ) RPAREN )? -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS ( $expireParam)? ) | KW_EXECUTE KW_SET_CURRENT_SNAPSHOT LPAREN (snapshotParam= expression ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_SET_CURRENT_SNAPSHOT $snapshotParam) | KW_EXECUTE KW_FAST_FORWARD sourceBranch= StringLiteral (targetBranch= StringLiteral )? -> ^( TOK_ALTERTABLE_EXECUTE KW_FAST_FORWARD $sourceBranch ( $targetBranch)? ) | KW_EXECUTE KW_CHERRY_PICK snapshotId= Number -> ^( TOK_ALTERTABLE_EXECUTE KW_CHERRY_PICK $snapshotId) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS KW_BETWEEN (fromTimestamp= StringLiteral ) KW_AND (toTimestamp= StringLiteral ) -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $fromTimestamp $toTimestamp) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS KW_RETAIN KW_LAST numToRetain= Number -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS KW_RETAIN $numToRetain) | KW_EXECUTE KW_DELETE KW_ORPHAN_FILES ( KW_OLDER KW_THAN LPAREN (timestamp= StringLiteral ) RPAREN )? -> ^( TOK_ALTERTABLE_EXECUTE KW_ORPHAN_FILES ( $timestamp)? ) );
    public final HiveParser_AlterClauseParser.alterStatementSuffixExecute_return alterStatementSuffixExecute() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixExecute_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixExecute_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token rollbackParam=null;
        Token expireParam=null;
        Token sourceBranch=null;
        Token targetBranch=null;
        Token snapshotId=null;
        Token fromTimestamp=null;
        Token toTimestamp=null;
        Token numToRetain=null;
        Token timestamp=null;
        Token KW_EXECUTE245=null;
        Token KW_ROLLBACK246=null;
        Token LPAREN247=null;
        Token StringLiteral248=null;
        Token Number249=null;
        Token RPAREN250=null;
        Token KW_EXECUTE251=null;
        Token KW_EXPIRE_SNAPSHOTS252=null;
        Token LPAREN253=null;
        Token RPAREN254=null;
        Token KW_EXECUTE255=null;
        Token KW_SET_CURRENT_SNAPSHOT256=null;
        Token LPAREN257=null;
        Token RPAREN258=null;
        Token KW_EXECUTE259=null;
        Token KW_FAST_FORWARD260=null;
        Token KW_EXECUTE261=null;
        Token KW_CHERRY_PICK262=null;
        Token KW_EXECUTE263=null;
        Token KW_EXPIRE_SNAPSHOTS264=null;
        Token KW_BETWEEN265=null;
        Token KW_AND266=null;
        Token KW_EXECUTE267=null;
        Token KW_EXPIRE_SNAPSHOTS268=null;
        Token KW_RETAIN269=null;
        Token KW_LAST270=null;
        Token KW_EXECUTE271=null;
        Token KW_DELETE272=null;
        Token KW_ORPHAN_FILES273=null;
        Token KW_OLDER274=null;
        Token KW_THAN275=null;
        Token LPAREN276=null;
        Token RPAREN277=null;
        HiveParser_IdentifiersParser.expression_return snapshotParam =null;


        ASTNode rollbackParam_tree=null;
        ASTNode expireParam_tree=null;
        ASTNode sourceBranch_tree=null;
        ASTNode targetBranch_tree=null;
        ASTNode snapshotId_tree=null;
        ASTNode fromTimestamp_tree=null;
        ASTNode toTimestamp_tree=null;
        ASTNode numToRetain_tree=null;
        ASTNode timestamp_tree=null;
        ASTNode KW_EXECUTE245_tree=null;
        ASTNode KW_ROLLBACK246_tree=null;
        ASTNode LPAREN247_tree=null;
        ASTNode StringLiteral248_tree=null;
        ASTNode Number249_tree=null;
        ASTNode RPAREN250_tree=null;
        ASTNode KW_EXECUTE251_tree=null;
        ASTNode KW_EXPIRE_SNAPSHOTS252_tree=null;
        ASTNode LPAREN253_tree=null;
        ASTNode RPAREN254_tree=null;
        ASTNode KW_EXECUTE255_tree=null;
        ASTNode KW_SET_CURRENT_SNAPSHOT256_tree=null;
        ASTNode LPAREN257_tree=null;
        ASTNode RPAREN258_tree=null;
        ASTNode KW_EXECUTE259_tree=null;
        ASTNode KW_FAST_FORWARD260_tree=null;
        ASTNode KW_EXECUTE261_tree=null;
        ASTNode KW_CHERRY_PICK262_tree=null;
        ASTNode KW_EXECUTE263_tree=null;
        ASTNode KW_EXPIRE_SNAPSHOTS264_tree=null;
        ASTNode KW_BETWEEN265_tree=null;
        ASTNode KW_AND266_tree=null;
        ASTNode KW_EXECUTE267_tree=null;
        ASTNode KW_EXPIRE_SNAPSHOTS268_tree=null;
        ASTNode KW_RETAIN269_tree=null;
        ASTNode KW_LAST270_tree=null;
        ASTNode KW_EXECUTE271_tree=null;
        ASTNode KW_DELETE272_tree=null;
        ASTNode KW_ORPHAN_FILES273_tree=null;
        ASTNode KW_OLDER274_tree=null;
        ASTNode KW_THAN275_tree=null;
        ASTNode LPAREN276_tree=null;
        ASTNode RPAREN277_tree=null;
        RewriteRuleTokenStream stream_KW_BETWEEN=new RewriteRuleTokenStream(adaptor,"token KW_BETWEEN");
        RewriteRuleTokenStream stream_KW_DELETE=new RewriteRuleTokenStream(adaptor,"token KW_DELETE");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_ORPHAN_FILES=new RewriteRuleTokenStream(adaptor,"token KW_ORPHAN_FILES");
        RewriteRuleTokenStream stream_KW_LAST=new RewriteRuleTokenStream(adaptor,"token KW_LAST");
        RewriteRuleTokenStream stream_KW_OLDER=new RewriteRuleTokenStream(adaptor,"token KW_OLDER");
        RewriteRuleTokenStream stream_KW_ROLLBACK=new RewriteRuleTokenStream(adaptor,"token KW_ROLLBACK");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_CHERRY_PICK=new RewriteRuleTokenStream(adaptor,"token KW_CHERRY_PICK");
        RewriteRuleTokenStream stream_KW_AND=new RewriteRuleTokenStream(adaptor,"token KW_AND");
        RewriteRuleTokenStream stream_KW_EXPIRE_SNAPSHOTS=new RewriteRuleTokenStream(adaptor,"token KW_EXPIRE_SNAPSHOTS");
        RewriteRuleTokenStream stream_KW_EXECUTE=new RewriteRuleTokenStream(adaptor,"token KW_EXECUTE");
        RewriteRuleTokenStream stream_KW_SET_CURRENT_SNAPSHOT=new RewriteRuleTokenStream(adaptor,"token KW_SET_CURRENT_SNAPSHOT");
        RewriteRuleTokenStream stream_KW_FAST_FORWARD=new RewriteRuleTokenStream(adaptor,"token KW_FAST_FORWARD");
        RewriteRuleTokenStream stream_KW_RETAIN=new RewriteRuleTokenStream(adaptor,"token KW_RETAIN");
        RewriteRuleTokenStream stream_KW_THAN=new RewriteRuleTokenStream(adaptor,"token KW_THAN");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("alter table execute", state); 
        try {
            // AlterClauseParser.g:494:5: ( KW_EXECUTE KW_ROLLBACK LPAREN (rollbackParam= ( StringLiteral | Number ) ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS ( LPAREN (expireParam= StringLiteral ) RPAREN )? -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS ( $expireParam)? ) | KW_EXECUTE KW_SET_CURRENT_SNAPSHOT LPAREN (snapshotParam= expression ) RPAREN -> ^( TOK_ALTERTABLE_EXECUTE KW_SET_CURRENT_SNAPSHOT $snapshotParam) | KW_EXECUTE KW_FAST_FORWARD sourceBranch= StringLiteral (targetBranch= StringLiteral )? -> ^( TOK_ALTERTABLE_EXECUTE KW_FAST_FORWARD $sourceBranch ( $targetBranch)? ) | KW_EXECUTE KW_CHERRY_PICK snapshotId= Number -> ^( TOK_ALTERTABLE_EXECUTE KW_CHERRY_PICK $snapshotId) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS KW_BETWEEN (fromTimestamp= StringLiteral ) KW_AND (toTimestamp= StringLiteral ) -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $fromTimestamp $toTimestamp) | KW_EXECUTE KW_EXPIRE_SNAPSHOTS KW_RETAIN KW_LAST numToRetain= Number -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS KW_RETAIN $numToRetain) | KW_EXECUTE KW_DELETE KW_ORPHAN_FILES ( KW_OLDER KW_THAN LPAREN (timestamp= StringLiteral ) RPAREN )? -> ^( TOK_ALTERTABLE_EXECUTE KW_ORPHAN_FILES ( $timestamp)? ) )
            int alt55=8;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==KW_EXECUTE) ) {
                switch ( input.LA(2) ) {
                case KW_ROLLBACK:
                    {
                    alt55=1;
                    }
                    break;
                case KW_EXPIRE_SNAPSHOTS:
                    {
                    switch ( input.LA(3) ) {
                    case KW_BETWEEN:
                        {
                        alt55=6;
                        }
                        break;
                    case KW_RETAIN:
                        {
                        alt55=7;
                        }
                        break;
                    case EOF:
                    case LPAREN:
                        {
                        alt55=2;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 55, 3, input);

                        throw nvae;

                    }

                    }
                    break;
                case KW_SET_CURRENT_SNAPSHOT:
                    {
                    alt55=3;
                    }
                    break;
                case KW_FAST_FORWARD:
                    {
                    alt55=4;
                    }
                    break;
                case KW_CHERRY_PICK:
                    {
                    alt55=5;
                    }
                    break;
                case KW_DELETE:
                    {
                    alt55=8;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 55, 1, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 55, 0, input);

                throw nvae;

            }
            switch (alt55) {
                case 1 :
                    // AlterClauseParser.g:494:7: KW_EXECUTE KW_ROLLBACK LPAREN (rollbackParam= ( StringLiteral | Number ) ) RPAREN
                    {
                    KW_EXECUTE245=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3607); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE245);


                    KW_ROLLBACK246=(Token)match(input,KW_ROLLBACK,FOLLOW_KW_ROLLBACK_in_alterStatementSuffixExecute3609); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ROLLBACK.add(KW_ROLLBACK246);


                    LPAREN247=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixExecute3611); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN247);


                    // AlterClauseParser.g:494:37: (rollbackParam= ( StringLiteral | Number ) )
                    // AlterClauseParser.g:494:38: rollbackParam= ( StringLiteral | Number )
                    {
                    // AlterClauseParser.g:494:52: ( StringLiteral | Number )
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==StringLiteral) ) {
                        alt51=1;
                    }
                    else if ( (LA51_0==Number) ) {
                        alt51=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 51, 0, input);

                        throw nvae;

                    }
                    switch (alt51) {
                        case 1 :
                            // AlterClauseParser.g:494:53: StringLiteral
                            {
                            StringLiteral248=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3617); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(StringLiteral248);


                            }
                            break;
                        case 2 :
                            // AlterClauseParser.g:494:69: Number
                            {
                            Number249=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixExecute3621); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_Number.add(Number249);


                            }
                            break;

                    }


                    }


                    RPAREN250=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixExecute3625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN250);


                    // AST REWRITE
                    // elements: KW_ROLLBACK, rollbackParam
                    // token labels: rollbackParam
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_rollbackParam=new RewriteRuleTokenStream(adaptor,"token rollbackParam",rollbackParam);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 495:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam)
                    {
                        // AlterClauseParser.g:495:8: ^( TOK_ALTERTABLE_EXECUTE KW_ROLLBACK $rollbackParam)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_ROLLBACK.nextNode()
                        );

                        adaptor.addChild(root_1, stream_rollbackParam.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:496:7: KW_EXECUTE KW_EXPIRE_SNAPSHOTS ( LPAREN (expireParam= StringLiteral ) RPAREN )?
                    {
                    KW_EXECUTE251=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3648); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE251);


                    KW_EXPIRE_SNAPSHOTS252=(Token)match(input,KW_EXPIRE_SNAPSHOTS,FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3650); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXPIRE_SNAPSHOTS.add(KW_EXPIRE_SNAPSHOTS252);


                    // AlterClauseParser.g:496:38: ( LPAREN (expireParam= StringLiteral ) RPAREN )?
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==LPAREN) ) {
                        alt52=1;
                    }
                    switch (alt52) {
                        case 1 :
                            // AlterClauseParser.g:496:39: LPAREN (expireParam= StringLiteral ) RPAREN
                            {
                            LPAREN253=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixExecute3653); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN253);


                            // AlterClauseParser.g:496:46: (expireParam= StringLiteral )
                            // AlterClauseParser.g:496:47: expireParam= StringLiteral
                            {
                            expireParam=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3658); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(expireParam);


                            }


                            RPAREN254=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixExecute3661); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN254);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: expireParam, KW_EXPIRE_SNAPSHOTS
                    // token labels: expireParam
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_expireParam=new RewriteRuleTokenStream(adaptor,"token expireParam",expireParam);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 497:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS ( $expireParam)? )
                    {
                        // AlterClauseParser.g:497:8: ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS ( $expireParam)? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_EXPIRE_SNAPSHOTS.nextNode()
                        );

                        // AlterClauseParser.g:497:54: ( $expireParam)?
                        if ( stream_expireParam.hasNext() ) {
                            adaptor.addChild(root_1, stream_expireParam.nextNode());

                        }
                        stream_expireParam.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:498:7: KW_EXECUTE KW_SET_CURRENT_SNAPSHOT LPAREN (snapshotParam= expression ) RPAREN
                    {
                    KW_EXECUTE255=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3687); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE255);


                    KW_SET_CURRENT_SNAPSHOT256=(Token)match(input,KW_SET_CURRENT_SNAPSHOT,FOLLOW_KW_SET_CURRENT_SNAPSHOT_in_alterStatementSuffixExecute3689); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SET_CURRENT_SNAPSHOT.add(KW_SET_CURRENT_SNAPSHOT256);


                    LPAREN257=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixExecute3691); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN257);


                    // AlterClauseParser.g:498:49: (snapshotParam= expression )
                    // AlterClauseParser.g:498:50: snapshotParam= expression
                    {
                    pushFollow(FOLLOW_expression_in_alterStatementSuffixExecute3696);
                    snapshotParam=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(snapshotParam.getTree());

                    }


                    RPAREN258=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixExecute3699); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN258);


                    // AST REWRITE
                    // elements: snapshotParam, KW_SET_CURRENT_SNAPSHOT
                    // token labels: 
                    // rule labels: snapshotParam, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_snapshotParam=new RewriteRuleSubtreeStream(adaptor,"rule snapshotParam",snapshotParam!=null?snapshotParam.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 499:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_SET_CURRENT_SNAPSHOT $snapshotParam)
                    {
                        // AlterClauseParser.g:499:8: ^( TOK_ALTERTABLE_EXECUTE KW_SET_CURRENT_SNAPSHOT $snapshotParam)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_SET_CURRENT_SNAPSHOT.nextNode()
                        );

                        adaptor.addChild(root_1, stream_snapshotParam.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // AlterClauseParser.g:500:7: KW_EXECUTE KW_FAST_FORWARD sourceBranch= StringLiteral (targetBranch= StringLiteral )?
                    {
                    KW_EXECUTE259=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3722); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE259);


                    KW_FAST_FORWARD260=(Token)match(input,KW_FAST_FORWARD,FOLLOW_KW_FAST_FORWARD_in_alterStatementSuffixExecute3724); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FAST_FORWARD.add(KW_FAST_FORWARD260);


                    sourceBranch=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3728); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(sourceBranch);


                    // AlterClauseParser.g:500:61: (targetBranch= StringLiteral )?
                    int alt53=2;
                    int LA53_0 = input.LA(1);

                    if ( (LA53_0==StringLiteral) ) {
                        alt53=1;
                    }
                    switch (alt53) {
                        case 1 :
                            // AlterClauseParser.g:500:62: targetBranch= StringLiteral
                            {
                            targetBranch=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3733); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(targetBranch);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: sourceBranch, KW_FAST_FORWARD, targetBranch
                    // token labels: targetBranch, sourceBranch
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_targetBranch=new RewriteRuleTokenStream(adaptor,"token targetBranch",targetBranch);
                    RewriteRuleTokenStream stream_sourceBranch=new RewriteRuleTokenStream(adaptor,"token sourceBranch",sourceBranch);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 501:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_FAST_FORWARD $sourceBranch ( $targetBranch)? )
                    {
                        // AlterClauseParser.g:501:8: ^( TOK_ALTERTABLE_EXECUTE KW_FAST_FORWARD $sourceBranch ( $targetBranch)? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_FAST_FORWARD.nextNode()
                        );

                        adaptor.addChild(root_1, stream_sourceBranch.nextNode());

                        // AlterClauseParser.g:501:64: ( $targetBranch)?
                        if ( stream_targetBranch.hasNext() ) {
                            adaptor.addChild(root_1, stream_targetBranch.nextNode());

                        }
                        stream_targetBranch.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // AlterClauseParser.g:502:7: KW_EXECUTE KW_CHERRY_PICK snapshotId= Number
                    {
                    KW_EXECUTE261=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3762); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE261);


                    KW_CHERRY_PICK262=(Token)match(input,KW_CHERRY_PICK,FOLLOW_KW_CHERRY_PICK_in_alterStatementSuffixExecute3764); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CHERRY_PICK.add(KW_CHERRY_PICK262);


                    snapshotId=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixExecute3768); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(snapshotId);


                    // AST REWRITE
                    // elements: snapshotId, KW_CHERRY_PICK
                    // token labels: snapshotId
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_snapshotId=new RewriteRuleTokenStream(adaptor,"token snapshotId",snapshotId);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 503:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_CHERRY_PICK $snapshotId)
                    {
                        // AlterClauseParser.g:503:8: ^( TOK_ALTERTABLE_EXECUTE KW_CHERRY_PICK $snapshotId)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_CHERRY_PICK.nextNode()
                        );

                        adaptor.addChild(root_1, stream_snapshotId.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // AlterClauseParser.g:504:7: KW_EXECUTE KW_EXPIRE_SNAPSHOTS KW_BETWEEN (fromTimestamp= StringLiteral ) KW_AND (toTimestamp= StringLiteral )
                    {
                    KW_EXECUTE263=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE263);


                    KW_EXPIRE_SNAPSHOTS264=(Token)match(input,KW_EXPIRE_SNAPSHOTS,FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXPIRE_SNAPSHOTS.add(KW_EXPIRE_SNAPSHOTS264);


                    KW_BETWEEN265=(Token)match(input,KW_BETWEEN,FOLLOW_KW_BETWEEN_in_alterStatementSuffixExecute3795); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BETWEEN.add(KW_BETWEEN265);


                    // AlterClauseParser.g:504:49: (fromTimestamp= StringLiteral )
                    // AlterClauseParser.g:504:50: fromTimestamp= StringLiteral
                    {
                    fromTimestamp=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3800); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(fromTimestamp);


                    }


                    KW_AND266=(Token)match(input,KW_AND,FOLLOW_KW_AND_in_alterStatementSuffixExecute3803); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AND.add(KW_AND266);


                    // AlterClauseParser.g:504:86: (toTimestamp= StringLiteral )
                    // AlterClauseParser.g:504:87: toTimestamp= StringLiteral
                    {
                    toTimestamp=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3808); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(toTimestamp);


                    }


                    // AST REWRITE
                    // elements: fromTimestamp, toTimestamp, KW_EXPIRE_SNAPSHOTS
                    // token labels: fromTimestamp, toTimestamp
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_fromTimestamp=new RewriteRuleTokenStream(adaptor,"token fromTimestamp",fromTimestamp);
                    RewriteRuleTokenStream stream_toTimestamp=new RewriteRuleTokenStream(adaptor,"token toTimestamp",toTimestamp);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 505:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $fromTimestamp $toTimestamp)
                    {
                        // AlterClauseParser.g:505:8: ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS $fromTimestamp $toTimestamp)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_EXPIRE_SNAPSHOTS.nextNode()
                        );

                        adaptor.addChild(root_1, stream_fromTimestamp.nextNode());

                        adaptor.addChild(root_1, stream_toTimestamp.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // AlterClauseParser.g:506:7: KW_EXECUTE KW_EXPIRE_SNAPSHOTS KW_RETAIN KW_LAST numToRetain= Number
                    {
                    KW_EXECUTE267=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3835); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE267);


                    KW_EXPIRE_SNAPSHOTS268=(Token)match(input,KW_EXPIRE_SNAPSHOTS,FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3837); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXPIRE_SNAPSHOTS.add(KW_EXPIRE_SNAPSHOTS268);


                    KW_RETAIN269=(Token)match(input,KW_RETAIN,FOLLOW_KW_RETAIN_in_alterStatementSuffixExecute3839); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_RETAIN.add(KW_RETAIN269);


                    KW_LAST270=(Token)match(input,KW_LAST,FOLLOW_KW_LAST_in_alterStatementSuffixExecute3841); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LAST.add(KW_LAST270);


                    numToRetain=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixExecute3845); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(numToRetain);


                    // AST REWRITE
                    // elements: numToRetain, KW_RETAIN, KW_EXPIRE_SNAPSHOTS
                    // token labels: numToRetain
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_numToRetain=new RewriteRuleTokenStream(adaptor,"token numToRetain",numToRetain);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 507:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS KW_RETAIN $numToRetain)
                    {
                        // AlterClauseParser.g:507:8: ^( TOK_ALTERTABLE_EXECUTE KW_EXPIRE_SNAPSHOTS KW_RETAIN $numToRetain)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_EXPIRE_SNAPSHOTS.nextNode()
                        );

                        adaptor.addChild(root_1, 
                        stream_KW_RETAIN.nextNode()
                        );

                        adaptor.addChild(root_1, stream_numToRetain.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // AlterClauseParser.g:508:7: KW_EXECUTE KW_DELETE KW_ORPHAN_FILES ( KW_OLDER KW_THAN LPAREN (timestamp= StringLiteral ) RPAREN )?
                    {
                    KW_EXECUTE271=(Token)match(input,KW_EXECUTE,FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3870); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_EXECUTE.add(KW_EXECUTE271);


                    KW_DELETE272=(Token)match(input,KW_DELETE,FOLLOW_KW_DELETE_in_alterStatementSuffixExecute3872); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_DELETE.add(KW_DELETE272);


                    KW_ORPHAN_FILES273=(Token)match(input,KW_ORPHAN_FILES,FOLLOW_KW_ORPHAN_FILES_in_alterStatementSuffixExecute3874); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ORPHAN_FILES.add(KW_ORPHAN_FILES273);


                    // AlterClauseParser.g:508:44: ( KW_OLDER KW_THAN LPAREN (timestamp= StringLiteral ) RPAREN )?
                    int alt54=2;
                    int LA54_0 = input.LA(1);

                    if ( (LA54_0==KW_OLDER) ) {
                        alt54=1;
                    }
                    switch (alt54) {
                        case 1 :
                            // AlterClauseParser.g:508:45: KW_OLDER KW_THAN LPAREN (timestamp= StringLiteral ) RPAREN
                            {
                            KW_OLDER274=(Token)match(input,KW_OLDER,FOLLOW_KW_OLDER_in_alterStatementSuffixExecute3877); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OLDER.add(KW_OLDER274);


                            KW_THAN275=(Token)match(input,KW_THAN,FOLLOW_KW_THAN_in_alterStatementSuffixExecute3879); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_THAN.add(KW_THAN275);


                            LPAREN276=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_alterStatementSuffixExecute3881); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN276);


                            // AlterClauseParser.g:508:69: (timestamp= StringLiteral )
                            // AlterClauseParser.g:508:70: timestamp= StringLiteral
                            {
                            timestamp=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterStatementSuffixExecute3886); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(timestamp);


                            }


                            RPAREN277=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_alterStatementSuffixExecute3889); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN277);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: timestamp, KW_ORPHAN_FILES
                    // token labels: timestamp
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_timestamp=new RewriteRuleTokenStream(adaptor,"token timestamp",timestamp);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 509:5: -> ^( TOK_ALTERTABLE_EXECUTE KW_ORPHAN_FILES ( $timestamp)? )
                    {
                        // AlterClauseParser.g:509:8: ^( TOK_ALTERTABLE_EXECUTE KW_ORPHAN_FILES ( $timestamp)? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_EXECUTE, "TOK_ALTERTABLE_EXECUTE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_KW_ORPHAN_FILES.nextNode()
                        );

                        // AlterClauseParser.g:509:50: ( $timestamp)?
                        if ( stream_timestamp.hasNext() ) {
                            adaptor.addChild(root_1, stream_timestamp.nextNode());

                        }
                        stream_timestamp.reset();

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
    // $ANTLR end "alterStatementSuffixExecute"


    public static class alterStatementSuffixRenameBranch_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixRenameBranch"
    // AlterClauseParser.g:512:1: alterStatementSuffixRenameBranch : KW_RENAME KW_BRANCH sourceBranch= identifier KW_TO targetBranch= identifier -> ^( TOK_ALTERTABLE_RENAME_BRANCH $sourceBranch $targetBranch) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixRenameBranch_return alterStatementSuffixRenameBranch() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixRenameBranch_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixRenameBranch_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_RENAME278=null;
        Token KW_BRANCH279=null;
        Token KW_TO280=null;
        HiveParser_IdentifiersParser.identifier_return sourceBranch =null;

        HiveParser_IdentifiersParser.identifier_return targetBranch =null;


        ASTNode KW_RENAME278_tree=null;
        ASTNode KW_BRANCH279_tree=null;
        ASTNode KW_TO280_tree=null;
        RewriteRuleTokenStream stream_KW_RENAME=new RewriteRuleTokenStream(adaptor,"token KW_RENAME");
        RewriteRuleTokenStream stream_KW_BRANCH=new RewriteRuleTokenStream(adaptor,"token KW_BRANCH");
        RewriteRuleTokenStream stream_KW_TO=new RewriteRuleTokenStream(adaptor,"token KW_TO");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("alter table rename branch", state); 
        try {
            // AlterClauseParser.g:515:5: ( KW_RENAME KW_BRANCH sourceBranch= identifier KW_TO targetBranch= identifier -> ^( TOK_ALTERTABLE_RENAME_BRANCH $sourceBranch $targetBranch) )
            // AlterClauseParser.g:515:7: KW_RENAME KW_BRANCH sourceBranch= identifier KW_TO targetBranch= identifier
            {
            KW_RENAME278=(Token)match(input,KW_RENAME,FOLLOW_KW_RENAME_in_alterStatementSuffixRenameBranch3934); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RENAME.add(KW_RENAME278);


            KW_BRANCH279=(Token)match(input,KW_BRANCH,FOLLOW_KW_BRANCH_in_alterStatementSuffixRenameBranch3936); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BRANCH.add(KW_BRANCH279);


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixRenameBranch3940);
            sourceBranch=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(sourceBranch.getTree());

            KW_TO280=(Token)match(input,KW_TO,FOLLOW_KW_TO_in_alterStatementSuffixRenameBranch3942); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TO.add(KW_TO280);


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixRenameBranch3946);
            targetBranch=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(targetBranch.getTree());

            // AST REWRITE
            // elements: targetBranch, sourceBranch
            // token labels: 
            // rule labels: targetBranch, sourceBranch, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_targetBranch=new RewriteRuleSubtreeStream(adaptor,"rule targetBranch",targetBranch!=null?targetBranch.tree:null);
            RewriteRuleSubtreeStream stream_sourceBranch=new RewriteRuleSubtreeStream(adaptor,"rule sourceBranch",sourceBranch!=null?sourceBranch.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 516:5: -> ^( TOK_ALTERTABLE_RENAME_BRANCH $sourceBranch $targetBranch)
            {
                // AlterClauseParser.g:516:8: ^( TOK_ALTERTABLE_RENAME_BRANCH $sourceBranch $targetBranch)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_RENAME_BRANCH, "TOK_ALTERTABLE_RENAME_BRANCH")
                , root_1);

                adaptor.addChild(root_1, stream_sourceBranch.nextTree());

                adaptor.addChild(root_1, stream_targetBranch.nextTree());

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
    // $ANTLR end "alterStatementSuffixRenameBranch"


    public static class alterStatementSuffixReplaceBranch_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixReplaceBranch"
    // AlterClauseParser.g:519:1: alterStatementSuffixReplaceBranch : KW_REPLACE KW_BRANCH sourceBranch= Identifier KW_AS KW_OF ( ( KW_SYSTEM_VERSION snapshotId= Number ) | ( KW_BRANCH branch= identifier ) ) ( refRetain )? ( retentionOfSnapshots )? -> ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_BRANCH $sourceBranch ( KW_SYSTEM_VERSION )? ( $snapshotId)? ( $branch)? ( refRetain )? ( retentionOfSnapshots )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixReplaceBranch_return alterStatementSuffixReplaceBranch() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixReplaceBranch_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixReplaceBranch_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token sourceBranch=null;
        Token snapshotId=null;
        Token KW_REPLACE281=null;
        Token KW_BRANCH282=null;
        Token KW_AS283=null;
        Token KW_OF284=null;
        Token KW_SYSTEM_VERSION285=null;
        Token KW_BRANCH286=null;
        HiveParser_IdentifiersParser.identifier_return branch =null;

        HiveParser_AlterClauseParser.refRetain_return refRetain287 =null;

        HiveParser_AlterClauseParser.retentionOfSnapshots_return retentionOfSnapshots288 =null;


        ASTNode sourceBranch_tree=null;
        ASTNode snapshotId_tree=null;
        ASTNode KW_REPLACE281_tree=null;
        ASTNode KW_BRANCH282_tree=null;
        ASTNode KW_AS283_tree=null;
        ASTNode KW_OF284_tree=null;
        ASTNode KW_SYSTEM_VERSION285_tree=null;
        ASTNode KW_BRANCH286_tree=null;
        RewriteRuleTokenStream stream_KW_BRANCH=new RewriteRuleTokenStream(adaptor,"token KW_BRANCH");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_SYSTEM_VERSION=new RewriteRuleTokenStream(adaptor,"token KW_SYSTEM_VERSION");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_refRetain=new RewriteRuleSubtreeStream(adaptor,"rule refRetain");
        RewriteRuleSubtreeStream stream_retentionOfSnapshots=new RewriteRuleSubtreeStream(adaptor,"rule retentionOfSnapshots");
         gParent.pushMsg("alter table replace branch", state); 
        try {
            // AlterClauseParser.g:522:5: ( KW_REPLACE KW_BRANCH sourceBranch= Identifier KW_AS KW_OF ( ( KW_SYSTEM_VERSION snapshotId= Number ) | ( KW_BRANCH branch= identifier ) ) ( refRetain )? ( retentionOfSnapshots )? -> ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_BRANCH $sourceBranch ( KW_SYSTEM_VERSION )? ( $snapshotId)? ( $branch)? ( refRetain )? ( retentionOfSnapshots )? ) )
            // AlterClauseParser.g:522:7: KW_REPLACE KW_BRANCH sourceBranch= Identifier KW_AS KW_OF ( ( KW_SYSTEM_VERSION snapshotId= Number ) | ( KW_BRANCH branch= identifier ) ) ( refRetain )? ( retentionOfSnapshots )?
            {
            KW_REPLACE281=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_alterStatementSuffixReplaceBranch3989); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_REPLACE.add(KW_REPLACE281);


            KW_BRANCH282=(Token)match(input,KW_BRANCH,FOLLOW_KW_BRANCH_in_alterStatementSuffixReplaceBranch3991); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BRANCH.add(KW_BRANCH282);


            sourceBranch=(Token)match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixReplaceBranch3995); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(sourceBranch);


            KW_AS283=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_alterStatementSuffixReplaceBranch3997); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS283);


            KW_OF284=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_alterStatementSuffixReplaceBranch3999); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF284);


            // AlterClauseParser.g:522:64: ( ( KW_SYSTEM_VERSION snapshotId= Number ) | ( KW_BRANCH branch= identifier ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==KW_SYSTEM_VERSION) ) {
                alt56=1;
            }
            else if ( (LA56_0==KW_BRANCH) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;

            }
            switch (alt56) {
                case 1 :
                    // AlterClauseParser.g:522:65: ( KW_SYSTEM_VERSION snapshotId= Number )
                    {
                    // AlterClauseParser.g:522:65: ( KW_SYSTEM_VERSION snapshotId= Number )
                    // AlterClauseParser.g:522:66: KW_SYSTEM_VERSION snapshotId= Number
                    {
                    KW_SYSTEM_VERSION285=(Token)match(input,KW_SYSTEM_VERSION,FOLLOW_KW_SYSTEM_VERSION_in_alterStatementSuffixReplaceBranch4003); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SYSTEM_VERSION.add(KW_SYSTEM_VERSION285);


                    snapshotId=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixReplaceBranch4007); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(snapshotId);


                    }


                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:522:105: ( KW_BRANCH branch= identifier )
                    {
                    // AlterClauseParser.g:522:105: ( KW_BRANCH branch= identifier )
                    // AlterClauseParser.g:522:106: KW_BRANCH branch= identifier
                    {
                    KW_BRANCH286=(Token)match(input,KW_BRANCH,FOLLOW_KW_BRANCH_in_alterStatementSuffixReplaceBranch4013); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BRANCH.add(KW_BRANCH286);


                    pushFollow(FOLLOW_identifier_in_alterStatementSuffixReplaceBranch4017);
                    branch=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(branch.getTree());

                    }


                    }
                    break;

            }


            // AlterClauseParser.g:522:136: ( refRetain )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==KW_RETAIN) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // AlterClauseParser.g:522:136: refRetain
                    {
                    pushFollow(FOLLOW_refRetain_in_alterStatementSuffixReplaceBranch4021);
                    refRetain287=refRetain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_refRetain.add(refRetain287.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:522:147: ( retentionOfSnapshots )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==KW_WITH) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // AlterClauseParser.g:522:147: retentionOfSnapshots
                    {
                    pushFollow(FOLLOW_retentionOfSnapshots_in_alterStatementSuffixReplaceBranch4024);
                    retentionOfSnapshots288=retentionOfSnapshots();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_retentionOfSnapshots.add(retentionOfSnapshots288.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: sourceBranch, branch, KW_SYSTEM_VERSION, KW_BRANCH, snapshotId, retentionOfSnapshots, refRetain
            // token labels: sourceBranch, snapshotId
            // rule labels: branch, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_sourceBranch=new RewriteRuleTokenStream(adaptor,"token sourceBranch",sourceBranch);
            RewriteRuleTokenStream stream_snapshotId=new RewriteRuleTokenStream(adaptor,"token snapshotId",snapshotId);
            RewriteRuleSubtreeStream stream_branch=new RewriteRuleSubtreeStream(adaptor,"rule branch",branch!=null?branch.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 523:5: -> ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_BRANCH $sourceBranch ( KW_SYSTEM_VERSION )? ( $snapshotId)? ( $branch)? ( refRetain )? ( retentionOfSnapshots )? )
            {
                // AlterClauseParser.g:523:8: ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_BRANCH $sourceBranch ( KW_SYSTEM_VERSION )? ( $snapshotId)? ( $branch)? ( refRetain )? ( retentionOfSnapshots )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_REPLACE_SNAPSHOTREF, "TOK_ALTERTABLE_REPLACE_SNAPSHOTREF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_BRANCH.nextNode()
                );

                adaptor.addChild(root_1, stream_sourceBranch.nextNode());

                // AlterClauseParser.g:523:69: ( KW_SYSTEM_VERSION )?
                if ( stream_KW_SYSTEM_VERSION.hasNext() ) {
                    adaptor.addChild(root_1, 
                    stream_KW_SYSTEM_VERSION.nextNode()
                    );

                }
                stream_KW_SYSTEM_VERSION.reset();

                // AlterClauseParser.g:523:90: ( $snapshotId)?
                if ( stream_snapshotId.hasNext() ) {
                    adaptor.addChild(root_1, stream_snapshotId.nextNode());

                }
                stream_snapshotId.reset();

                // AlterClauseParser.g:523:103: ( $branch)?
                if ( stream_branch.hasNext() ) {
                    adaptor.addChild(root_1, stream_branch.nextTree());

                }
                stream_branch.reset();

                // AlterClauseParser.g:523:111: ( refRetain )?
                if ( stream_refRetain.hasNext() ) {
                    adaptor.addChild(root_1, stream_refRetain.nextTree());

                }
                stream_refRetain.reset();

                // AlterClauseParser.g:523:122: ( retentionOfSnapshots )?
                if ( stream_retentionOfSnapshots.hasNext() ) {
                    adaptor.addChild(root_1, stream_retentionOfSnapshots.nextTree());

                }
                stream_retentionOfSnapshots.reset();

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
    // $ANTLR end "alterStatementSuffixReplaceBranch"


    public static class alterStatementSuffixReplaceTag_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixReplaceTag"
    // AlterClauseParser.g:526:1: alterStatementSuffixReplaceTag : KW_REPLACE KW_TAG sourceBranch= Identifier KW_AS KW_OF KW_SYSTEM_VERSION snapshotId= Number ( refRetain )? -> ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_TAG $sourceBranch $snapshotId ( refRetain )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixReplaceTag_return alterStatementSuffixReplaceTag() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixReplaceTag_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixReplaceTag_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token sourceBranch=null;
        Token snapshotId=null;
        Token KW_REPLACE289=null;
        Token KW_TAG290=null;
        Token KW_AS291=null;
        Token KW_OF292=null;
        Token KW_SYSTEM_VERSION293=null;
        HiveParser_AlterClauseParser.refRetain_return refRetain294 =null;


        ASTNode sourceBranch_tree=null;
        ASTNode snapshotId_tree=null;
        ASTNode KW_REPLACE289_tree=null;
        ASTNode KW_TAG290_tree=null;
        ASTNode KW_AS291_tree=null;
        ASTNode KW_OF292_tree=null;
        ASTNode KW_SYSTEM_VERSION293_tree=null;
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_TAG=new RewriteRuleTokenStream(adaptor,"token KW_TAG");
        RewriteRuleTokenStream stream_KW_SYSTEM_VERSION=new RewriteRuleTokenStream(adaptor,"token KW_SYSTEM_VERSION");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_refRetain=new RewriteRuleSubtreeStream(adaptor,"rule refRetain");
         gParent.pushMsg("alter table replace tag", state); 
        try {
            // AlterClauseParser.g:529:5: ( KW_REPLACE KW_TAG sourceBranch= Identifier KW_AS KW_OF KW_SYSTEM_VERSION snapshotId= Number ( refRetain )? -> ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_TAG $sourceBranch $snapshotId ( refRetain )? ) )
            // AlterClauseParser.g:529:7: KW_REPLACE KW_TAG sourceBranch= Identifier KW_AS KW_OF KW_SYSTEM_VERSION snapshotId= Number ( refRetain )?
            {
            KW_REPLACE289=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_alterStatementSuffixReplaceTag4085); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_REPLACE.add(KW_REPLACE289);


            KW_TAG290=(Token)match(input,KW_TAG,FOLLOW_KW_TAG_in_alterStatementSuffixReplaceTag4087); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TAG.add(KW_TAG290);


            sourceBranch=(Token)match(input,Identifier,FOLLOW_Identifier_in_alterStatementSuffixReplaceTag4091); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Identifier.add(sourceBranch);


            KW_AS291=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_alterStatementSuffixReplaceTag4093); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS291);


            KW_OF292=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_alterStatementSuffixReplaceTag4095); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF292);


            KW_SYSTEM_VERSION293=(Token)match(input,KW_SYSTEM_VERSION,FOLLOW_KW_SYSTEM_VERSION_in_alterStatementSuffixReplaceTag4097); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SYSTEM_VERSION.add(KW_SYSTEM_VERSION293);


            snapshotId=(Token)match(input,Number,FOLLOW_Number_in_alterStatementSuffixReplaceTag4101); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(snapshotId);


            // AlterClauseParser.g:529:97: ( refRetain )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==KW_RETAIN) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // AlterClauseParser.g:529:97: refRetain
                    {
                    pushFollow(FOLLOW_refRetain_in_alterStatementSuffixReplaceTag4103);
                    refRetain294=refRetain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_refRetain.add(refRetain294.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: snapshotId, KW_TAG, refRetain, sourceBranch
            // token labels: snapshotId, sourceBranch
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_snapshotId=new RewriteRuleTokenStream(adaptor,"token snapshotId",snapshotId);
            RewriteRuleTokenStream stream_sourceBranch=new RewriteRuleTokenStream(adaptor,"token sourceBranch",sourceBranch);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 530:5: -> ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_TAG $sourceBranch $snapshotId ( refRetain )? )
            {
                // AlterClauseParser.g:530:8: ^( TOK_ALTERTABLE_REPLACE_SNAPSHOTREF KW_TAG $sourceBranch $snapshotId ( refRetain )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_REPLACE_SNAPSHOTREF, "TOK_ALTERTABLE_REPLACE_SNAPSHOTREF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_KW_TAG.nextNode()
                );

                adaptor.addChild(root_1, stream_sourceBranch.nextNode());

                adaptor.addChild(root_1, stream_snapshotId.nextNode());

                // AlterClauseParser.g:530:78: ( refRetain )?
                if ( stream_refRetain.hasNext() ) {
                    adaptor.addChild(root_1, stream_refRetain.nextTree());

                }
                stream_refRetain.reset();

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
    // $ANTLR end "alterStatementSuffixReplaceTag"


    public static class alterStatementSuffixDropBranch_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixDropBranch"
    // AlterClauseParser.g:533:1: alterStatementSuffixDropBranch : KW_DROP KW_BRANCH ( ifExists )? branchName= identifier -> ^( TOK_ALTERTABLE_DROP_BRANCH ( ifExists )? $branchName) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixDropBranch_return alterStatementSuffixDropBranch() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixDropBranch_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixDropBranch_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP295=null;
        Token KW_BRANCH296=null;
        HiveParser_IdentifiersParser.identifier_return branchName =null;

        HiveParser.ifExists_return ifExists297 =null;


        ASTNode KW_DROP295_tree=null;
        ASTNode KW_BRANCH296_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_BRANCH=new RewriteRuleTokenStream(adaptor,"token KW_BRANCH");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
         gParent.pushMsg("alter table drop branch (if exists) branchName", state); 
        try {
            // AlterClauseParser.g:536:5: ( KW_DROP KW_BRANCH ( ifExists )? branchName= identifier -> ^( TOK_ALTERTABLE_DROP_BRANCH ( ifExists )? $branchName) )
            // AlterClauseParser.g:536:7: KW_DROP KW_BRANCH ( ifExists )? branchName= identifier
            {
            KW_DROP295=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterStatementSuffixDropBranch4152); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP295);


            KW_BRANCH296=(Token)match(input,KW_BRANCH,FOLLOW_KW_BRANCH_in_alterStatementSuffixDropBranch4154); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BRANCH.add(KW_BRANCH296);


            // AlterClauseParser.g:536:25: ( ifExists )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==KW_IF) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // AlterClauseParser.g:536:25: ifExists
                    {
                    pushFollow(FOLLOW_ifExists_in_alterStatementSuffixDropBranch4156);
                    ifExists297=gHiveParser.ifExists();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifExists.add(ifExists297.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixDropBranch4161);
            branchName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(branchName.getTree());

            // AST REWRITE
            // elements: ifExists, branchName
            // token labels: 
            // rule labels: branchName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_branchName=new RewriteRuleSubtreeStream(adaptor,"rule branchName",branchName!=null?branchName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 537:5: -> ^( TOK_ALTERTABLE_DROP_BRANCH ( ifExists )? $branchName)
            {
                // AlterClauseParser.g:537:8: ^( TOK_ALTERTABLE_DROP_BRANCH ( ifExists )? $branchName)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_DROP_BRANCH, "TOK_ALTERTABLE_DROP_BRANCH")
                , root_1);

                // AlterClauseParser.g:537:37: ( ifExists )?
                if ( stream_ifExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifExists.nextTree());

                }
                stream_ifExists.reset();

                adaptor.addChild(root_1, stream_branchName.nextTree());

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
    // $ANTLR end "alterStatementSuffixDropBranch"


    public static class alterStatementSuffixCreateBranch_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixCreateBranch"
    // AlterClauseParser.g:540:1: alterStatementSuffixCreateBranch : ( KW_CREATE KW_BRANCH ( ifNotExists )? branchName= identifier ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? -> ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? ) | KW_CREATE KW_OR KW_REPLACE KW_BRANCH branchName= identifier ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? -> ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? ) );
    public final HiveParser_AlterClauseParser.alterStatementSuffixCreateBranch_return alterStatementSuffixCreateBranch() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixCreateBranch_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixCreateBranch_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CREATE298=null;
        Token KW_BRANCH299=null;
        Token KW_CREATE304=null;
        Token KW_OR305=null;
        Token KW_REPLACE306=null;
        Token KW_BRANCH307=null;
        HiveParser_IdentifiersParser.identifier_return branchName =null;

        HiveParser.ifNotExists_return ifNotExists300 =null;

        HiveParser_AlterClauseParser.snapshotIdOfRef_return snapshotIdOfRef301 =null;

        HiveParser_AlterClauseParser.refRetain_return refRetain302 =null;

        HiveParser_AlterClauseParser.retentionOfSnapshots_return retentionOfSnapshots303 =null;

        HiveParser_AlterClauseParser.snapshotIdOfRef_return snapshotIdOfRef308 =null;

        HiveParser_AlterClauseParser.refRetain_return refRetain309 =null;

        HiveParser_AlterClauseParser.retentionOfSnapshots_return retentionOfSnapshots310 =null;


        ASTNode KW_CREATE298_tree=null;
        ASTNode KW_BRANCH299_tree=null;
        ASTNode KW_CREATE304_tree=null;
        ASTNode KW_OR305_tree=null;
        ASTNode KW_REPLACE306_tree=null;
        ASTNode KW_BRANCH307_tree=null;
        RewriteRuleTokenStream stream_KW_BRANCH=new RewriteRuleTokenStream(adaptor,"token KW_BRANCH");
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
        RewriteRuleTokenStream stream_KW_OR=new RewriteRuleTokenStream(adaptor,"token KW_OR");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_refRetain=new RewriteRuleSubtreeStream(adaptor,"rule refRetain");
        RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
        RewriteRuleSubtreeStream stream_snapshotIdOfRef=new RewriteRuleSubtreeStream(adaptor,"rule snapshotIdOfRef");
        RewriteRuleSubtreeStream stream_retentionOfSnapshots=new RewriteRuleSubtreeStream(adaptor,"rule retentionOfSnapshots");
         gParent.pushMsg("alter table create branch", state); 
        try {
            // AlterClauseParser.g:543:5: ( KW_CREATE KW_BRANCH ( ifNotExists )? branchName= identifier ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? -> ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? ) | KW_CREATE KW_OR KW_REPLACE KW_BRANCH branchName= identifier ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? -> ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? ) )
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==KW_CREATE) ) {
                int LA68_1 = input.LA(2);

                if ( (LA68_1==KW_BRANCH) ) {
                    alt68=1;
                }
                else if ( (LA68_1==KW_OR) ) {
                    alt68=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 68, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 68, 0, input);

                throw nvae;

            }
            switch (alt68) {
                case 1 :
                    // AlterClauseParser.g:543:7: KW_CREATE KW_BRANCH ( ifNotExists )? branchName= identifier ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )?
                    {
                    KW_CREATE298=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_alterStatementSuffixCreateBranch4204); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE298);


                    KW_BRANCH299=(Token)match(input,KW_BRANCH,FOLLOW_KW_BRANCH_in_alterStatementSuffixCreateBranch4206); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BRANCH.add(KW_BRANCH299);


                    // AlterClauseParser.g:543:27: ( ifNotExists )?
                    int alt61=2;
                    int LA61_0 = input.LA(1);

                    if ( (LA61_0==KW_IF) ) {
                        alt61=1;
                    }
                    switch (alt61) {
                        case 1 :
                            // AlterClauseParser.g:543:27: ifNotExists
                            {
                            pushFollow(FOLLOW_ifNotExists_in_alterStatementSuffixCreateBranch4208);
                            ifNotExists300=gHiveParser.ifNotExists();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists300.getTree());

                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_alterStatementSuffixCreateBranch4213);
                    branchName=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(branchName.getTree());

                    // AlterClauseParser.g:543:62: ( snapshotIdOfRef )?
                    int alt62=2;
                    int LA62_0 = input.LA(1);

                    if ( (LA62_0==KW_FOR) ) {
                        alt62=1;
                    }
                    switch (alt62) {
                        case 1 :
                            // AlterClauseParser.g:543:62: snapshotIdOfRef
                            {
                            pushFollow(FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateBranch4215);
                            snapshotIdOfRef301=snapshotIdOfRef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_snapshotIdOfRef.add(snapshotIdOfRef301.getTree());

                            }
                            break;

                    }


                    // AlterClauseParser.g:543:79: ( refRetain )?
                    int alt63=2;
                    int LA63_0 = input.LA(1);

                    if ( (LA63_0==KW_RETAIN) ) {
                        alt63=1;
                    }
                    switch (alt63) {
                        case 1 :
                            // AlterClauseParser.g:543:79: refRetain
                            {
                            pushFollow(FOLLOW_refRetain_in_alterStatementSuffixCreateBranch4218);
                            refRetain302=refRetain();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_refRetain.add(refRetain302.getTree());

                            }
                            break;

                    }


                    // AlterClauseParser.g:543:90: ( retentionOfSnapshots )?
                    int alt64=2;
                    int LA64_0 = input.LA(1);

                    if ( (LA64_0==KW_WITH) ) {
                        alt64=1;
                    }
                    switch (alt64) {
                        case 1 :
                            // AlterClauseParser.g:543:90: retentionOfSnapshots
                            {
                            pushFollow(FOLLOW_retentionOfSnapshots_in_alterStatementSuffixCreateBranch4221);
                            retentionOfSnapshots303=retentionOfSnapshots();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_retentionOfSnapshots.add(retentionOfSnapshots303.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: branchName, retentionOfSnapshots, snapshotIdOfRef, refRetain, ifNotExists
                    // token labels: 
                    // rule labels: branchName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_branchName=new RewriteRuleSubtreeStream(adaptor,"rule branchName",branchName!=null?branchName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 544:5: -> ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? )
                    {
                        // AlterClauseParser.g:544:8: ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_CREATE_BRANCH, "TOK_ALTERTABLE_CREATE_BRANCH")
                        , root_1);

                        adaptor.addChild(root_1, stream_branchName.nextTree());

                        // AlterClauseParser.g:544:51: ( ifNotExists )?
                        if ( stream_ifNotExists.hasNext() ) {
                            adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                        }
                        stream_ifNotExists.reset();

                        // AlterClauseParser.g:544:64: ( snapshotIdOfRef )?
                        if ( stream_snapshotIdOfRef.hasNext() ) {
                            adaptor.addChild(root_1, stream_snapshotIdOfRef.nextTree());

                        }
                        stream_snapshotIdOfRef.reset();

                        // AlterClauseParser.g:544:81: ( refRetain )?
                        if ( stream_refRetain.hasNext() ) {
                            adaptor.addChild(root_1, stream_refRetain.nextTree());

                        }
                        stream_refRetain.reset();

                        // AlterClauseParser.g:544:92: ( retentionOfSnapshots )?
                        if ( stream_retentionOfSnapshots.hasNext() ) {
                            adaptor.addChild(root_1, stream_retentionOfSnapshots.nextTree());

                        }
                        stream_retentionOfSnapshots.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:545:7: KW_CREATE KW_OR KW_REPLACE KW_BRANCH branchName= identifier ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )?
                    {
                    KW_CREATE304=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_alterStatementSuffixCreateBranch4255); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE304);


                    KW_OR305=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_alterStatementSuffixCreateBranch4257); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OR.add(KW_OR305);


                    KW_REPLACE306=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_alterStatementSuffixCreateBranch4259); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_REPLACE.add(KW_REPLACE306);


                    KW_BRANCH307=(Token)match(input,KW_BRANCH,FOLLOW_KW_BRANCH_in_alterStatementSuffixCreateBranch4261); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_BRANCH.add(KW_BRANCH307);


                    pushFollow(FOLLOW_identifier_in_alterStatementSuffixCreateBranch4265);
                    branchName=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(branchName.getTree());

                    // AlterClauseParser.g:545:66: ( snapshotIdOfRef )?
                    int alt65=2;
                    int LA65_0 = input.LA(1);

                    if ( (LA65_0==KW_FOR) ) {
                        alt65=1;
                    }
                    switch (alt65) {
                        case 1 :
                            // AlterClauseParser.g:545:66: snapshotIdOfRef
                            {
                            pushFollow(FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateBranch4267);
                            snapshotIdOfRef308=snapshotIdOfRef();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_snapshotIdOfRef.add(snapshotIdOfRef308.getTree());

                            }
                            break;

                    }


                    // AlterClauseParser.g:545:83: ( refRetain )?
                    int alt66=2;
                    int LA66_0 = input.LA(1);

                    if ( (LA66_0==KW_RETAIN) ) {
                        alt66=1;
                    }
                    switch (alt66) {
                        case 1 :
                            // AlterClauseParser.g:545:83: refRetain
                            {
                            pushFollow(FOLLOW_refRetain_in_alterStatementSuffixCreateBranch4270);
                            refRetain309=refRetain();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_refRetain.add(refRetain309.getTree());

                            }
                            break;

                    }


                    // AlterClauseParser.g:545:94: ( retentionOfSnapshots )?
                    int alt67=2;
                    int LA67_0 = input.LA(1);

                    if ( (LA67_0==KW_WITH) ) {
                        alt67=1;
                    }
                    switch (alt67) {
                        case 1 :
                            // AlterClauseParser.g:545:94: retentionOfSnapshots
                            {
                            pushFollow(FOLLOW_retentionOfSnapshots_in_alterStatementSuffixCreateBranch4273);
                            retentionOfSnapshots310=retentionOfSnapshots();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_retentionOfSnapshots.add(retentionOfSnapshots310.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: refRetain, snapshotIdOfRef, branchName, retentionOfSnapshots, KW_REPLACE
                    // token labels: 
                    // rule labels: branchName, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_branchName=new RewriteRuleSubtreeStream(adaptor,"rule branchName",branchName!=null?branchName.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 546:5: -> ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? )
                    {
                        // AlterClauseParser.g:546:8: ^( TOK_ALTERTABLE_CREATE_BRANCH $branchName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? ( retentionOfSnapshots )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALTERTABLE_CREATE_BRANCH, "TOK_ALTERTABLE_CREATE_BRANCH")
                        , root_1);

                        adaptor.addChild(root_1, stream_branchName.nextTree());

                        adaptor.addChild(root_1, 
                        stream_KW_REPLACE.nextNode()
                        );

                        // AlterClauseParser.g:546:62: ( snapshotIdOfRef )?
                        if ( stream_snapshotIdOfRef.hasNext() ) {
                            adaptor.addChild(root_1, stream_snapshotIdOfRef.nextTree());

                        }
                        stream_snapshotIdOfRef.reset();

                        // AlterClauseParser.g:546:79: ( refRetain )?
                        if ( stream_refRetain.hasNext() ) {
                            adaptor.addChild(root_1, stream_refRetain.nextTree());

                        }
                        stream_refRetain.reset();

                        // AlterClauseParser.g:546:90: ( retentionOfSnapshots )?
                        if ( stream_retentionOfSnapshots.hasNext() ) {
                            adaptor.addChild(root_1, stream_retentionOfSnapshots.nextTree());

                        }
                        stream_retentionOfSnapshots.reset();

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
    // $ANTLR end "alterStatementSuffixCreateBranch"


    public static class snapshotIdOfRef_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "snapshotIdOfRef"
    // AlterClauseParser.g:549:1: snapshotIdOfRef : ( KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF snapshotId= Number -> ^( TOK_AS_OF_VERSION $snapshotId) | ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= StringLiteral ) -> ^( TOK_AS_OF_TIME $asOfTime) | ( KW_FOR KW_TAG KW_AS KW_OF asOfTag= identifier ) -> ^( TOK_AS_OF_TAG $asOfTag) );
    public final HiveParser_AlterClauseParser.snapshotIdOfRef_return snapshotIdOfRef() throws RecognitionException {
        HiveParser_AlterClauseParser.snapshotIdOfRef_return retval = new HiveParser_AlterClauseParser.snapshotIdOfRef_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token snapshotId=null;
        Token asOfTime=null;
        Token KW_FOR311=null;
        Token KW_SYSTEM_VERSION312=null;
        Token KW_AS313=null;
        Token KW_OF314=null;
        Token KW_FOR315=null;
        Token KW_SYSTEM_TIME316=null;
        Token KW_AS317=null;
        Token KW_OF318=null;
        Token KW_FOR319=null;
        Token KW_TAG320=null;
        Token KW_AS321=null;
        Token KW_OF322=null;
        HiveParser_IdentifiersParser.identifier_return asOfTag =null;


        ASTNode snapshotId_tree=null;
        ASTNode asOfTime_tree=null;
        ASTNode KW_FOR311_tree=null;
        ASTNode KW_SYSTEM_VERSION312_tree=null;
        ASTNode KW_AS313_tree=null;
        ASTNode KW_OF314_tree=null;
        ASTNode KW_FOR315_tree=null;
        ASTNode KW_SYSTEM_TIME316_tree=null;
        ASTNode KW_AS317_tree=null;
        ASTNode KW_OF318_tree=null;
        ASTNode KW_FOR319_tree=null;
        ASTNode KW_TAG320_tree=null;
        ASTNode KW_AS321_tree=null;
        ASTNode KW_OF322_tree=null;
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_TAG=new RewriteRuleTokenStream(adaptor,"token KW_TAG");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleTokenStream stream_KW_SYSTEM_VERSION=new RewriteRuleTokenStream(adaptor,"token KW_SYSTEM_VERSION");
        RewriteRuleTokenStream stream_KW_SYSTEM_TIME=new RewriteRuleTokenStream(adaptor,"token KW_SYSTEM_TIME");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("alter table create branch/tag as of version", state); 
        try {
            // AlterClauseParser.g:552:5: ( KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF snapshotId= Number -> ^( TOK_AS_OF_VERSION $snapshotId) | ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= StringLiteral ) -> ^( TOK_AS_OF_TIME $asOfTime) | ( KW_FOR KW_TAG KW_AS KW_OF asOfTag= identifier ) -> ^( TOK_AS_OF_TAG $asOfTag) )
            int alt69=3;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==KW_FOR) ) {
                switch ( input.LA(2) ) {
                case KW_SYSTEM_VERSION:
                    {
                    alt69=1;
                    }
                    break;
                case KW_SYSTEM_TIME:
                    {
                    alt69=2;
                    }
                    break;
                case KW_TAG:
                    {
                    alt69=3;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 69, 1, input);

                    throw nvae;

                }

            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 69, 0, input);

                throw nvae;

            }
            switch (alt69) {
                case 1 :
                    // AlterClauseParser.g:552:7: KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF snapshotId= Number
                    {
                    KW_FOR311=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_snapshotIdOfRef4325); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR311);


                    KW_SYSTEM_VERSION312=(Token)match(input,KW_SYSTEM_VERSION,FOLLOW_KW_SYSTEM_VERSION_in_snapshotIdOfRef4327); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SYSTEM_VERSION.add(KW_SYSTEM_VERSION312);


                    KW_AS313=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_snapshotIdOfRef4329); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS313);


                    KW_OF314=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_snapshotIdOfRef4331); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF314);


                    snapshotId=(Token)match(input,Number,FOLLOW_Number_in_snapshotIdOfRef4335); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(snapshotId);


                    // AST REWRITE
                    // elements: snapshotId
                    // token labels: snapshotId
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_snapshotId=new RewriteRuleTokenStream(adaptor,"token snapshotId",snapshotId);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 553:5: -> ^( TOK_AS_OF_VERSION $snapshotId)
                    {
                        // AlterClauseParser.g:553:8: ^( TOK_AS_OF_VERSION $snapshotId)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_AS_OF_VERSION, "TOK_AS_OF_VERSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_snapshotId.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:555:5: ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= StringLiteral )
                    {
                    // AlterClauseParser.g:555:5: ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= StringLiteral )
                    // AlterClauseParser.g:555:6: KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= StringLiteral
                    {
                    KW_FOR315=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_snapshotIdOfRef4361); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR315);


                    KW_SYSTEM_TIME316=(Token)match(input,KW_SYSTEM_TIME,FOLLOW_KW_SYSTEM_TIME_in_snapshotIdOfRef4363); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SYSTEM_TIME.add(KW_SYSTEM_TIME316);


                    KW_AS317=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_snapshotIdOfRef4365); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS317);


                    KW_OF318=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_snapshotIdOfRef4367); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF318);


                    asOfTime=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_snapshotIdOfRef4371); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(asOfTime);


                    }


                    // AST REWRITE
                    // elements: asOfTime
                    // token labels: asOfTime
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_asOfTime=new RewriteRuleTokenStream(adaptor,"token asOfTime",asOfTime);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 556:5: -> ^( TOK_AS_OF_TIME $asOfTime)
                    {
                        // AlterClauseParser.g:556:8: ^( TOK_AS_OF_TIME $asOfTime)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_AS_OF_TIME, "TOK_AS_OF_TIME")
                        , root_1);

                        adaptor.addChild(root_1, stream_asOfTime.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:558:5: ( KW_FOR KW_TAG KW_AS KW_OF asOfTag= identifier )
                    {
                    // AlterClauseParser.g:558:5: ( KW_FOR KW_TAG KW_AS KW_OF asOfTag= identifier )
                    // AlterClauseParser.g:558:6: KW_FOR KW_TAG KW_AS KW_OF asOfTag= identifier
                    {
                    KW_FOR319=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_snapshotIdOfRef4398); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR319);


                    KW_TAG320=(Token)match(input,KW_TAG,FOLLOW_KW_TAG_in_snapshotIdOfRef4400); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TAG.add(KW_TAG320);


                    KW_AS321=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_snapshotIdOfRef4402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS321);


                    KW_OF322=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_snapshotIdOfRef4404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF322);


                    pushFollow(FOLLOW_identifier_in_snapshotIdOfRef4408);
                    asOfTag=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(asOfTag.getTree());

                    }


                    // AST REWRITE
                    // elements: asOfTag
                    // token labels: 
                    // rule labels: asOfTag, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_asOfTag=new RewriteRuleSubtreeStream(adaptor,"rule asOfTag",asOfTag!=null?asOfTag.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 559:5: -> ^( TOK_AS_OF_TAG $asOfTag)
                    {
                        // AlterClauseParser.g:559:8: ^( TOK_AS_OF_TAG $asOfTag)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_AS_OF_TAG, "TOK_AS_OF_TAG")
                        , root_1);

                        adaptor.addChild(root_1, stream_asOfTag.nextTree());

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
    // $ANTLR end "snapshotIdOfRef"


    public static class refRetain_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "refRetain"
    // AlterClauseParser.g:562:1: refRetain : KW_RETAIN maxRefAge= Number timeUnit= timeUnitQualifiers -> ^( TOK_RETAIN $maxRefAge $timeUnit) ;
    public final HiveParser_AlterClauseParser.refRetain_return refRetain() throws RecognitionException {
        HiveParser_AlterClauseParser.refRetain_return retval = new HiveParser_AlterClauseParser.refRetain_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token maxRefAge=null;
        Token KW_RETAIN323=null;
        HiveParser_IdentifiersParser.timeUnitQualifiers_return timeUnit =null;


        ASTNode maxRefAge_tree=null;
        ASTNode KW_RETAIN323_tree=null;
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_RETAIN=new RewriteRuleTokenStream(adaptor,"token KW_RETAIN");
        RewriteRuleSubtreeStream stream_timeUnitQualifiers=new RewriteRuleSubtreeStream(adaptor,"rule timeUnitQualifiers");
         gParent.pushMsg("alter table create branch/tag RETAIN", state); 
        try {
            // AlterClauseParser.g:565:5: ( KW_RETAIN maxRefAge= Number timeUnit= timeUnitQualifiers -> ^( TOK_RETAIN $maxRefAge $timeUnit) )
            // AlterClauseParser.g:565:7: KW_RETAIN maxRefAge= Number timeUnit= timeUnitQualifiers
            {
            KW_RETAIN323=(Token)match(input,KW_RETAIN,FOLLOW_KW_RETAIN_in_refRetain4449); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETAIN.add(KW_RETAIN323);


            maxRefAge=(Token)match(input,Number,FOLLOW_Number_in_refRetain4453); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(maxRefAge);


            pushFollow(FOLLOW_timeUnitQualifiers_in_refRetain4457);
            timeUnit=gHiveParser.timeUnitQualifiers();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_timeUnitQualifiers.add(timeUnit.getTree());

            // AST REWRITE
            // elements: maxRefAge, timeUnit
            // token labels: maxRefAge
            // rule labels: retval, timeUnit
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_maxRefAge=new RewriteRuleTokenStream(adaptor,"token maxRefAge",maxRefAge);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit",timeUnit!=null?timeUnit.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 566:5: -> ^( TOK_RETAIN $maxRefAge $timeUnit)
            {
                // AlterClauseParser.g:566:8: ^( TOK_RETAIN $maxRefAge $timeUnit)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_RETAIN, "TOK_RETAIN")
                , root_1);

                adaptor.addChild(root_1, stream_maxRefAge.nextNode());

                adaptor.addChild(root_1, stream_timeUnit.nextTree());

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
    // $ANTLR end "refRetain"


    public static class retentionOfSnapshots_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "retentionOfSnapshots"
    // AlterClauseParser.g:569:1: retentionOfSnapshots : ( KW_WITH KW_SNAPSHOT KW_RETENTION minSnapshotsToKeep= Number KW_SNAPSHOTS (maxSnapshotAge= Number timeUnit= timeUnitQualifiers )? ) -> ^( TOK_WITH_SNAPSHOT_RETENTION $minSnapshotsToKeep ( $maxSnapshotAge $timeUnit)? ) ;
    public final HiveParser_AlterClauseParser.retentionOfSnapshots_return retentionOfSnapshots() throws RecognitionException {
        HiveParser_AlterClauseParser.retentionOfSnapshots_return retval = new HiveParser_AlterClauseParser.retentionOfSnapshots_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token minSnapshotsToKeep=null;
        Token maxSnapshotAge=null;
        Token KW_WITH324=null;
        Token KW_SNAPSHOT325=null;
        Token KW_RETENTION326=null;
        Token KW_SNAPSHOTS327=null;
        HiveParser_IdentifiersParser.timeUnitQualifiers_return timeUnit =null;


        ASTNode minSnapshotsToKeep_tree=null;
        ASTNode maxSnapshotAge_tree=null;
        ASTNode KW_WITH324_tree=null;
        ASTNode KW_SNAPSHOT325_tree=null;
        ASTNode KW_RETENTION326_tree=null;
        ASTNode KW_SNAPSHOTS327_tree=null;
        RewriteRuleTokenStream stream_KW_SNAPSHOTS=new RewriteRuleTokenStream(adaptor,"token KW_SNAPSHOTS");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_WITH=new RewriteRuleTokenStream(adaptor,"token KW_WITH");
        RewriteRuleTokenStream stream_KW_RETENTION=new RewriteRuleTokenStream(adaptor,"token KW_RETENTION");
        RewriteRuleTokenStream stream_KW_SNAPSHOT=new RewriteRuleTokenStream(adaptor,"token KW_SNAPSHOT");
        RewriteRuleSubtreeStream stream_timeUnitQualifiers=new RewriteRuleSubtreeStream(adaptor,"rule timeUnitQualifiers");
         gParent.pushMsg("alter table create branch WITH SNAPSHOT RETENTION", state); 
        try {
            // AlterClauseParser.g:572:5: ( ( KW_WITH KW_SNAPSHOT KW_RETENTION minSnapshotsToKeep= Number KW_SNAPSHOTS (maxSnapshotAge= Number timeUnit= timeUnitQualifiers )? ) -> ^( TOK_WITH_SNAPSHOT_RETENTION $minSnapshotsToKeep ( $maxSnapshotAge $timeUnit)? ) )
            // AlterClauseParser.g:572:7: ( KW_WITH KW_SNAPSHOT KW_RETENTION minSnapshotsToKeep= Number KW_SNAPSHOTS (maxSnapshotAge= Number timeUnit= timeUnitQualifiers )? )
            {
            // AlterClauseParser.g:572:7: ( KW_WITH KW_SNAPSHOT KW_RETENTION minSnapshotsToKeep= Number KW_SNAPSHOTS (maxSnapshotAge= Number timeUnit= timeUnitQualifiers )? )
            // AlterClauseParser.g:572:8: KW_WITH KW_SNAPSHOT KW_RETENTION minSnapshotsToKeep= Number KW_SNAPSHOTS (maxSnapshotAge= Number timeUnit= timeUnitQualifiers )?
            {
            KW_WITH324=(Token)match(input,KW_WITH,FOLLOW_KW_WITH_in_retentionOfSnapshots4501); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WITH.add(KW_WITH324);


            KW_SNAPSHOT325=(Token)match(input,KW_SNAPSHOT,FOLLOW_KW_SNAPSHOT_in_retentionOfSnapshots4503); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SNAPSHOT.add(KW_SNAPSHOT325);


            KW_RETENTION326=(Token)match(input,KW_RETENTION,FOLLOW_KW_RETENTION_in_retentionOfSnapshots4505); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_RETENTION.add(KW_RETENTION326);


            minSnapshotsToKeep=(Token)match(input,Number,FOLLOW_Number_in_retentionOfSnapshots4509); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(minSnapshotsToKeep);


            KW_SNAPSHOTS327=(Token)match(input,KW_SNAPSHOTS,FOLLOW_KW_SNAPSHOTS_in_retentionOfSnapshots4511); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SNAPSHOTS.add(KW_SNAPSHOTS327);


            // AlterClauseParser.g:572:80: (maxSnapshotAge= Number timeUnit= timeUnitQualifiers )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Number) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // AlterClauseParser.g:572:81: maxSnapshotAge= Number timeUnit= timeUnitQualifiers
                    {
                    maxSnapshotAge=(Token)match(input,Number,FOLLOW_Number_in_retentionOfSnapshots4516); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(maxSnapshotAge);


                    pushFollow(FOLLOW_timeUnitQualifiers_in_retentionOfSnapshots4520);
                    timeUnit=gHiveParser.timeUnitQualifiers();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_timeUnitQualifiers.add(timeUnit.getTree());

                    }
                    break;

            }


            }


            // AST REWRITE
            // elements: maxSnapshotAge, minSnapshotsToKeep, timeUnit
            // token labels: maxSnapshotAge, minSnapshotsToKeep
            // rule labels: retval, timeUnit
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_maxSnapshotAge=new RewriteRuleTokenStream(adaptor,"token maxSnapshotAge",maxSnapshotAge);
            RewriteRuleTokenStream stream_minSnapshotsToKeep=new RewriteRuleTokenStream(adaptor,"token minSnapshotsToKeep",minSnapshotsToKeep);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_timeUnit=new RewriteRuleSubtreeStream(adaptor,"rule timeUnit",timeUnit!=null?timeUnit.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 573:5: -> ^( TOK_WITH_SNAPSHOT_RETENTION $minSnapshotsToKeep ( $maxSnapshotAge $timeUnit)? )
            {
                // AlterClauseParser.g:573:8: ^( TOK_WITH_SNAPSHOT_RETENTION $minSnapshotsToKeep ( $maxSnapshotAge $timeUnit)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_WITH_SNAPSHOT_RETENTION, "TOK_WITH_SNAPSHOT_RETENTION")
                , root_1);

                adaptor.addChild(root_1, stream_minSnapshotsToKeep.nextNode());

                // AlterClauseParser.g:573:58: ( $maxSnapshotAge $timeUnit)?
                if ( stream_maxSnapshotAge.hasNext()||stream_timeUnit.hasNext() ) {
                    adaptor.addChild(root_1, stream_maxSnapshotAge.nextNode());

                    adaptor.addChild(root_1, stream_timeUnit.nextTree());

                }
                stream_maxSnapshotAge.reset();
                stream_timeUnit.reset();

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
    // $ANTLR end "retentionOfSnapshots"


    public static class alterStatementSuffixDropTag_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixDropTag"
    // AlterClauseParser.g:576:1: alterStatementSuffixDropTag : KW_DROP KW_TAG ( ifExists )? tagName= identifier -> ^( TOK_ALTERTABLE_DROP_TAG ( ifExists )? $tagName) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixDropTag_return alterStatementSuffixDropTag() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixDropTag_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixDropTag_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DROP328=null;
        Token KW_TAG329=null;
        HiveParser_IdentifiersParser.identifier_return tagName =null;

        HiveParser.ifExists_return ifExists330 =null;


        ASTNode KW_DROP328_tree=null;
        ASTNode KW_TAG329_tree=null;
        RewriteRuleTokenStream stream_KW_DROP=new RewriteRuleTokenStream(adaptor,"token KW_DROP");
        RewriteRuleTokenStream stream_KW_TAG=new RewriteRuleTokenStream(adaptor,"token KW_TAG");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_ifExists=new RewriteRuleSubtreeStream(adaptor,"rule ifExists");
         gParent.pushMsg("alter table drop tag (if exists) tagName", state); 
        try {
            // AlterClauseParser.g:579:5: ( KW_DROP KW_TAG ( ifExists )? tagName= identifier -> ^( TOK_ALTERTABLE_DROP_TAG ( ifExists )? $tagName) )
            // AlterClauseParser.g:579:7: KW_DROP KW_TAG ( ifExists )? tagName= identifier
            {
            KW_DROP328=(Token)match(input,KW_DROP,FOLLOW_KW_DROP_in_alterStatementSuffixDropTag4572); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DROP.add(KW_DROP328);


            KW_TAG329=(Token)match(input,KW_TAG,FOLLOW_KW_TAG_in_alterStatementSuffixDropTag4574); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TAG.add(KW_TAG329);


            // AlterClauseParser.g:579:22: ( ifExists )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==KW_IF) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // AlterClauseParser.g:579:22: ifExists
                    {
                    pushFollow(FOLLOW_ifExists_in_alterStatementSuffixDropTag4576);
                    ifExists330=gHiveParser.ifExists();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifExists.add(ifExists330.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixDropTag4581);
            tagName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(tagName.getTree());

            // AST REWRITE
            // elements: ifExists, tagName
            // token labels: 
            // rule labels: tagName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tagName=new RewriteRuleSubtreeStream(adaptor,"rule tagName",tagName!=null?tagName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 580:5: -> ^( TOK_ALTERTABLE_DROP_TAG ( ifExists )? $tagName)
            {
                // AlterClauseParser.g:580:8: ^( TOK_ALTERTABLE_DROP_TAG ( ifExists )? $tagName)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_DROP_TAG, "TOK_ALTERTABLE_DROP_TAG")
                , root_1);

                // AlterClauseParser.g:580:34: ( ifExists )?
                if ( stream_ifExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifExists.nextTree());

                }
                stream_ifExists.reset();

                adaptor.addChild(root_1, stream_tagName.nextTree());

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
    // $ANTLR end "alterStatementSuffixDropTag"


    public static class alterStatementSuffixCreateTag_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixCreateTag"
    // AlterClauseParser.g:583:1: alterStatementSuffixCreateTag : KW_CREATE KW_TAG ( ifNotExists )? tagName= identifier ( snapshotIdOfRef )? ( refRetain )? -> ^( TOK_ALTERTABLE_CREATE_TAG $tagName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixCreateTag_return alterStatementSuffixCreateTag() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixCreateTag_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixCreateTag_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CREATE331=null;
        Token KW_TAG332=null;
        HiveParser_IdentifiersParser.identifier_return tagName =null;

        HiveParser.ifNotExists_return ifNotExists333 =null;

        HiveParser_AlterClauseParser.snapshotIdOfRef_return snapshotIdOfRef334 =null;

        HiveParser_AlterClauseParser.refRetain_return refRetain335 =null;


        ASTNode KW_CREATE331_tree=null;
        ASTNode KW_TAG332_tree=null;
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_TAG=new RewriteRuleTokenStream(adaptor,"token KW_TAG");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_refRetain=new RewriteRuleSubtreeStream(adaptor,"rule refRetain");
        RewriteRuleSubtreeStream stream_ifNotExists=new RewriteRuleSubtreeStream(adaptor,"rule ifNotExists");
        RewriteRuleSubtreeStream stream_snapshotIdOfRef=new RewriteRuleSubtreeStream(adaptor,"rule snapshotIdOfRef");
         gParent.pushMsg("alter table create tag", state); 
        try {
            // AlterClauseParser.g:586:5: ( KW_CREATE KW_TAG ( ifNotExists )? tagName= identifier ( snapshotIdOfRef )? ( refRetain )? -> ^( TOK_ALTERTABLE_CREATE_TAG $tagName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? ) )
            // AlterClauseParser.g:586:7: KW_CREATE KW_TAG ( ifNotExists )? tagName= identifier ( snapshotIdOfRef )? ( refRetain )?
            {
            KW_CREATE331=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_alterStatementSuffixCreateTag4624); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE331);


            KW_TAG332=(Token)match(input,KW_TAG,FOLLOW_KW_TAG_in_alterStatementSuffixCreateTag4626); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TAG.add(KW_TAG332);


            // AlterClauseParser.g:586:24: ( ifNotExists )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==KW_IF) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // AlterClauseParser.g:586:24: ifNotExists
                    {
                    pushFollow(FOLLOW_ifNotExists_in_alterStatementSuffixCreateTag4628);
                    ifNotExists333=gHiveParser.ifNotExists();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_ifNotExists.add(ifNotExists333.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixCreateTag4633);
            tagName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(tagName.getTree());

            // AlterClauseParser.g:586:56: ( snapshotIdOfRef )?
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==KW_FOR) ) {
                alt73=1;
            }
            switch (alt73) {
                case 1 :
                    // AlterClauseParser.g:586:56: snapshotIdOfRef
                    {
                    pushFollow(FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateTag4635);
                    snapshotIdOfRef334=snapshotIdOfRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_snapshotIdOfRef.add(snapshotIdOfRef334.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:586:73: ( refRetain )?
            int alt74=2;
            int LA74_0 = input.LA(1);

            if ( (LA74_0==KW_RETAIN) ) {
                alt74=1;
            }
            switch (alt74) {
                case 1 :
                    // AlterClauseParser.g:586:73: refRetain
                    {
                    pushFollow(FOLLOW_refRetain_in_alterStatementSuffixCreateTag4638);
                    refRetain335=refRetain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_refRetain.add(refRetain335.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: tagName, refRetain, snapshotIdOfRef, ifNotExists
            // token labels: 
            // rule labels: tagName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tagName=new RewriteRuleSubtreeStream(adaptor,"rule tagName",tagName!=null?tagName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 587:5: -> ^( TOK_ALTERTABLE_CREATE_TAG $tagName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? )
            {
                // AlterClauseParser.g:587:8: ^( TOK_ALTERTABLE_CREATE_TAG $tagName ( ifNotExists )? ( snapshotIdOfRef )? ( refRetain )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_CREATE_TAG, "TOK_ALTERTABLE_CREATE_TAG")
                , root_1);

                adaptor.addChild(root_1, stream_tagName.nextTree());

                // AlterClauseParser.g:587:45: ( ifNotExists )?
                if ( stream_ifNotExists.hasNext() ) {
                    adaptor.addChild(root_1, stream_ifNotExists.nextTree());

                }
                stream_ifNotExists.reset();

                // AlterClauseParser.g:587:58: ( snapshotIdOfRef )?
                if ( stream_snapshotIdOfRef.hasNext() ) {
                    adaptor.addChild(root_1, stream_snapshotIdOfRef.nextTree());

                }
                stream_snapshotIdOfRef.reset();

                // AlterClauseParser.g:587:75: ( refRetain )?
                if ( stream_refRetain.hasNext() ) {
                    adaptor.addChild(root_1, stream_refRetain.nextTree());

                }
                stream_refRetain.reset();

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
    // $ANTLR end "alterStatementSuffixCreateTag"


    public static class alterStatementSuffixCreateOrReplaceTag_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterStatementSuffixCreateOrReplaceTag"
    // AlterClauseParser.g:590:1: alterStatementSuffixCreateOrReplaceTag : KW_CREATE KW_OR KW_REPLACE KW_TAG tagName= identifier ( snapshotIdOfRef )? ( refRetain )? -> ^( TOK_ALTERTABLE_CREATE_TAG $tagName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? ) ;
    public final HiveParser_AlterClauseParser.alterStatementSuffixCreateOrReplaceTag_return alterStatementSuffixCreateOrReplaceTag() throws RecognitionException {
        HiveParser_AlterClauseParser.alterStatementSuffixCreateOrReplaceTag_return retval = new HiveParser_AlterClauseParser.alterStatementSuffixCreateOrReplaceTag_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_CREATE336=null;
        Token KW_OR337=null;
        Token KW_REPLACE338=null;
        Token KW_TAG339=null;
        HiveParser_IdentifiersParser.identifier_return tagName =null;

        HiveParser_AlterClauseParser.snapshotIdOfRef_return snapshotIdOfRef340 =null;

        HiveParser_AlterClauseParser.refRetain_return refRetain341 =null;


        ASTNode KW_CREATE336_tree=null;
        ASTNode KW_OR337_tree=null;
        ASTNode KW_REPLACE338_tree=null;
        ASTNode KW_TAG339_tree=null;
        RewriteRuleTokenStream stream_KW_CREATE=new RewriteRuleTokenStream(adaptor,"token KW_CREATE");
        RewriteRuleTokenStream stream_KW_TAG=new RewriteRuleTokenStream(adaptor,"token KW_TAG");
        RewriteRuleTokenStream stream_KW_REPLACE=new RewriteRuleTokenStream(adaptor,"token KW_REPLACE");
        RewriteRuleTokenStream stream_KW_OR=new RewriteRuleTokenStream(adaptor,"token KW_OR");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_refRetain=new RewriteRuleSubtreeStream(adaptor,"rule refRetain");
        RewriteRuleSubtreeStream stream_snapshotIdOfRef=new RewriteRuleSubtreeStream(adaptor,"rule snapshotIdOfRef");
         gParent.pushMsg("alter table create tag", state); 
        try {
            // AlterClauseParser.g:593:6: ( KW_CREATE KW_OR KW_REPLACE KW_TAG tagName= identifier ( snapshotIdOfRef )? ( refRetain )? -> ^( TOK_ALTERTABLE_CREATE_TAG $tagName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? ) )
            // AlterClauseParser.g:593:8: KW_CREATE KW_OR KW_REPLACE KW_TAG tagName= identifier ( snapshotIdOfRef )? ( refRetain )?
            {
            KW_CREATE336=(Token)match(input,KW_CREATE,FOLLOW_KW_CREATE_in_alterStatementSuffixCreateOrReplaceTag4689); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_CREATE.add(KW_CREATE336);


            KW_OR337=(Token)match(input,KW_OR,FOLLOW_KW_OR_in_alterStatementSuffixCreateOrReplaceTag4691); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OR.add(KW_OR337);


            KW_REPLACE338=(Token)match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_alterStatementSuffixCreateOrReplaceTag4693); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_REPLACE.add(KW_REPLACE338);


            KW_TAG339=(Token)match(input,KW_TAG,FOLLOW_KW_TAG_in_alterStatementSuffixCreateOrReplaceTag4695); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TAG.add(KW_TAG339);


            pushFollow(FOLLOW_identifier_in_alterStatementSuffixCreateOrReplaceTag4699);
            tagName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(tagName.getTree());

            // AlterClauseParser.g:593:61: ( snapshotIdOfRef )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==KW_FOR) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // AlterClauseParser.g:593:61: snapshotIdOfRef
                    {
                    pushFollow(FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateOrReplaceTag4701);
                    snapshotIdOfRef340=snapshotIdOfRef();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_snapshotIdOfRef.add(snapshotIdOfRef340.getTree());

                    }
                    break;

            }


            // AlterClauseParser.g:593:78: ( refRetain )?
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==KW_RETAIN) ) {
                alt76=1;
            }
            switch (alt76) {
                case 1 :
                    // AlterClauseParser.g:593:78: refRetain
                    {
                    pushFollow(FOLLOW_refRetain_in_alterStatementSuffixCreateOrReplaceTag4704);
                    refRetain341=refRetain();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_refRetain.add(refRetain341.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: KW_REPLACE, snapshotIdOfRef, refRetain, tagName
            // token labels: 
            // rule labels: tagName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tagName=new RewriteRuleSubtreeStream(adaptor,"rule tagName",tagName!=null?tagName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 594:6: -> ^( TOK_ALTERTABLE_CREATE_TAG $tagName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? )
            {
                // AlterClauseParser.g:594:9: ^( TOK_ALTERTABLE_CREATE_TAG $tagName KW_REPLACE ( snapshotIdOfRef )? ( refRetain )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERTABLE_CREATE_TAG, "TOK_ALTERTABLE_CREATE_TAG")
                , root_1);

                adaptor.addChild(root_1, stream_tagName.nextTree());

                adaptor.addChild(root_1, 
                stream_KW_REPLACE.nextNode()
                );

                // AlterClauseParser.g:594:57: ( snapshotIdOfRef )?
                if ( stream_snapshotIdOfRef.hasNext() ) {
                    adaptor.addChild(root_1, stream_snapshotIdOfRef.nextTree());

                }
                stream_snapshotIdOfRef.reset();

                // AlterClauseParser.g:594:74: ( refRetain )?
                if ( stream_refRetain.hasNext() ) {
                    adaptor.addChild(root_1, stream_refRetain.nextTree());

                }
                stream_refRetain.reset();

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
    // $ANTLR end "alterStatementSuffixCreateOrReplaceTag"


    public static class fileFormat_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fileFormat"
    // AlterClauseParser.g:597:1: fileFormat : ( KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral KW_SERDE serdeCls= StringLiteral ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )? -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? ) |genericSpec= identifier -> ^( TOK_FILEFORMAT_GENERIC $genericSpec) );
    public final HiveParser_AlterClauseParser.fileFormat_return fileFormat() throws RecognitionException {
        HiveParser_AlterClauseParser.fileFormat_return retval = new HiveParser_AlterClauseParser.fileFormat_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token inFmt=null;
        Token outFmt=null;
        Token serdeCls=null;
        Token inDriver=null;
        Token outDriver=null;
        Token KW_INPUTFORMAT342=null;
        Token KW_OUTPUTFORMAT343=null;
        Token KW_SERDE344=null;
        Token KW_INPUTDRIVER345=null;
        Token KW_OUTPUTDRIVER346=null;
        HiveParser_IdentifiersParser.identifier_return genericSpec =null;


        ASTNode inFmt_tree=null;
        ASTNode outFmt_tree=null;
        ASTNode serdeCls_tree=null;
        ASTNode inDriver_tree=null;
        ASTNode outDriver_tree=null;
        ASTNode KW_INPUTFORMAT342_tree=null;
        ASTNode KW_OUTPUTFORMAT343_tree=null;
        ASTNode KW_SERDE344_tree=null;
        ASTNode KW_INPUTDRIVER345_tree=null;
        ASTNode KW_OUTPUTDRIVER346_tree=null;
        RewriteRuleTokenStream stream_KW_INPUTFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_INPUTFORMAT");
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_INPUTDRIVER=new RewriteRuleTokenStream(adaptor,"token KW_INPUTDRIVER");
        RewriteRuleTokenStream stream_KW_SERDE=new RewriteRuleTokenStream(adaptor,"token KW_SERDE");
        RewriteRuleTokenStream stream_KW_OUTPUTFORMAT=new RewriteRuleTokenStream(adaptor,"token KW_OUTPUTFORMAT");
        RewriteRuleTokenStream stream_KW_OUTPUTDRIVER=new RewriteRuleTokenStream(adaptor,"token KW_OUTPUTDRIVER");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("file format specification", state); 
        try {
            // AlterClauseParser.g:600:5: ( KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral KW_SERDE serdeCls= StringLiteral ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )? -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? ) |genericSpec= identifier -> ^( TOK_FILEFORMAT_GENERIC $genericSpec) )
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==KW_INPUTFORMAT) ) {
                int LA78_1 = input.LA(2);

                if ( (LA78_1==StringLiteral) ) {
                    alt78=1;
                }
                else if ( (LA78_1==EOF) ) {
                    alt78=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 78, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA78_0==Identifier||(LA78_0 >= KW_ABORT && LA78_0 <= KW_AFTER)||LA78_0==KW_ALLOC_FRACTION||LA78_0==KW_ANALYZE||LA78_0==KW_ARCHIVE||(LA78_0 >= KW_ASC && LA78_0 <= KW_AT)||(LA78_0 >= KW_AUTOCOMMIT && LA78_0 <= KW_BEFORE)||(LA78_0 >= KW_BRANCH && LA78_0 <= KW_BUCKETS)||(LA78_0 >= KW_CACHE && LA78_0 <= KW_CASCADE)||(LA78_0 >= KW_CBO && LA78_0 <= KW_CHANGE)||LA78_0==KW_CHECK||(LA78_0 >= KW_CLUSTER && LA78_0 <= KW_COLLECTION)||(LA78_0 >= KW_COLUMNS && LA78_0 <= KW_COMMENT)||(LA78_0 >= KW_COMPACT && LA78_0 <= KW_COMPACTIONS)||(LA78_0 >= KW_COMPUTE && LA78_0 <= KW_CONCATENATE)||LA78_0==KW_CONTINUE||LA78_0==KW_COST||LA78_0==KW_CRON||LA78_0==KW_DATA||LA78_0==KW_DATABASES||(LA78_0 >= KW_DATETIME && LA78_0 <= KW_DCPROPERTIES)||LA78_0==KW_DEBUG||(LA78_0 >= KW_DEFAULT && LA78_0 <= KW_DEFINED)||(LA78_0 >= KW_DELIMITED && LA78_0 <= KW_DESC)||(LA78_0 >= KW_DETAIL && LA78_0 <= KW_DISABLE)||(LA78_0 >= KW_DISTRIBUTE && LA78_0 <= KW_DO)||LA78_0==KW_DOW||(LA78_0 >= KW_DUMP && LA78_0 <= KW_ELEM_TYPE)||LA78_0==KW_ENABLE||(LA78_0 >= KW_ENFORCED && LA78_0 <= KW_EVERY)||(LA78_0 >= KW_EXCLUSIVE && LA78_0 <= KW_EXECUTED)||(LA78_0 >= KW_EXPIRE_SNAPSHOTS && LA78_0 <= KW_EXPRESSION)||LA78_0==KW_FAST_FORWARD||(LA78_0 >= KW_FIELDS && LA78_0 <= KW_FIRST)||(LA78_0 >= KW_FORMAT && LA78_0 <= KW_FORMATTED)||LA78_0==KW_FUNCTIONS||(LA78_0 >= KW_HOUR && LA78_0 <= KW_IDXPROPERTIES)||LA78_0==KW_IGNORE||(LA78_0 >= KW_INDEX && LA78_0 <= KW_INDEXES)||(LA78_0 >= KW_INPATH && LA78_0 <= KW_INPUTDRIVER)||(LA78_0 >= KW_ISOLATION && LA78_0 <= KW_JAR)||(LA78_0 >= KW_JOINCOST && LA78_0 <= KW_LAST)||LA78_0==KW_LEVEL||(LA78_0 >= KW_LIMIT && LA78_0 <= KW_LOAD)||(LA78_0 >= KW_LOCATION && LA78_0 <= KW_LONG)||(LA78_0 >= KW_MANAGED && LA78_0 <= KW_MANAGEMENT)||(LA78_0 >= KW_MAPJOIN && LA78_0 <= KW_MATERIALIZED)||LA78_0==KW_METADATA||(LA78_0 >= KW_MINUTE && LA78_0 <= KW_MONTH)||(LA78_0 >= KW_MOVE && LA78_0 <= KW_MSCK)||(LA78_0 >= KW_NORELY && LA78_0 <= KW_NOSCAN)||LA78_0==KW_NOVALIDATE||LA78_0==KW_NULLS||LA78_0==KW_OFFSET||(LA78_0 >= KW_OPERATOR && LA78_0 <= KW_OPTION)||(LA78_0 >= KW_OUTPUTDRIVER && LA78_0 <= KW_OUTPUTFORMAT)||(LA78_0 >= KW_OVERWRITE && LA78_0 <= KW_OWNER)||(LA78_0 >= KW_PARTITIONED && LA78_0 <= KW_PATH)||(LA78_0 >= KW_PLAN && LA78_0 <= KW_POOL)||LA78_0==KW_PRINCIPALS||LA78_0==KW_PURGE||(LA78_0 >= KW_QUARTER && LA78_0 <= KW_QUERY_PARALLELISM)||LA78_0==KW_READ||(LA78_0 >= KW_REBUILD && LA78_0 <= KW_RECORDWRITER)||(LA78_0 >= KW_RELOAD && LA78_0 <= KW_RETENTION)||LA78_0==KW_REWRITE||(LA78_0 >= KW_ROLE && LA78_0 <= KW_ROLES)||(LA78_0 >= KW_SCHEDULED && LA78_0 <= KW_SECOND)||(LA78_0 >= KW_SEMI && LA78_0 <= KW_SERVER)||(LA78_0 >= KW_SETS && LA78_0 <= KW_SKEWED)||(LA78_0 >= KW_SNAPSHOT && LA78_0 <= KW_SNAPSHOTS)||(LA78_0 >= KW_SORT && LA78_0 <= KW_SSL)||(LA78_0 >= KW_STATISTICS && LA78_0 <= KW_SUMMARY)||(LA78_0 >= KW_SYSTEM_TIME && LA78_0 <= KW_SYSTEM_VERSION)||LA78_0==KW_TABLES||(LA78_0 >= KW_TAG && LA78_0 <= KW_TERMINATED)||LA78_0==KW_TINYINT||LA78_0==KW_TOUCH||(LA78_0 >= KW_TRANSACTION && LA78_0 <= KW_TRANSACTIONS)||LA78_0==KW_TRIM||(LA78_0 >= KW_TYPE && LA78_0 <= KW_UNARCHIVE)||LA78_0==KW_UNDO||LA78_0==KW_UNIONTYPE||(LA78_0 >= KW_UNKNOWN && LA78_0 <= KW_UNSIGNED)||(LA78_0 >= KW_URI && LA78_0 <= KW_USE)||(LA78_0 >= KW_UTC && LA78_0 <= KW_VALIDATE)||LA78_0==KW_VALUE_TYPE||(LA78_0 >= KW_VECTORIZATION && LA78_0 <= KW_WEEK)||LA78_0==KW_WHILE||(LA78_0 >= KW_WITHIN && LA78_0 <= KW_ZONE)||LA78_0==KW_BATCH||LA78_0==KW_DAYOFWEEK||LA78_0==KW_HOLD_DDLTIME||LA78_0==KW_NO_DROP||LA78_0==KW_OFFLINE||LA78_0==KW_PROTECTION||LA78_0==KW_READONLY||LA78_0==KW_TIMESTAMPTZ) ) {
                alt78=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;

            }
            switch (alt78) {
                case 1 :
                    // AlterClauseParser.g:600:7: KW_INPUTFORMAT inFmt= StringLiteral KW_OUTPUTFORMAT outFmt= StringLiteral KW_SERDE serdeCls= StringLiteral ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )?
                    {
                    KW_INPUTFORMAT342=(Token)match(input,KW_INPUTFORMAT,FOLLOW_KW_INPUTFORMAT_in_fileFormat4755); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_INPUTFORMAT.add(KW_INPUTFORMAT342);


                    inFmt=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat4759); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(inFmt);


                    KW_OUTPUTFORMAT343=(Token)match(input,KW_OUTPUTFORMAT,FOLLOW_KW_OUTPUTFORMAT_in_fileFormat4761); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OUTPUTFORMAT.add(KW_OUTPUTFORMAT343);


                    outFmt=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat4765); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(outFmt);


                    KW_SERDE344=(Token)match(input,KW_SERDE,FOLLOW_KW_SERDE_in_fileFormat4767); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SERDE.add(KW_SERDE344);


                    serdeCls=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat4771); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_StringLiteral.add(serdeCls);


                    // AlterClauseParser.g:600:111: ( KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral )?
                    int alt77=2;
                    int LA77_0 = input.LA(1);

                    if ( (LA77_0==KW_INPUTDRIVER) ) {
                        alt77=1;
                    }
                    switch (alt77) {
                        case 1 :
                            // AlterClauseParser.g:600:112: KW_INPUTDRIVER inDriver= StringLiteral KW_OUTPUTDRIVER outDriver= StringLiteral
                            {
                            KW_INPUTDRIVER345=(Token)match(input,KW_INPUTDRIVER,FOLLOW_KW_INPUTDRIVER_in_fileFormat4774); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_INPUTDRIVER.add(KW_INPUTDRIVER345);


                            inDriver=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat4778); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(inDriver);


                            KW_OUTPUTDRIVER346=(Token)match(input,KW_OUTPUTDRIVER,FOLLOW_KW_OUTPUTDRIVER_in_fileFormat4780); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTPUTDRIVER.add(KW_OUTPUTDRIVER346);


                            outDriver=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_fileFormat4784); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_StringLiteral.add(outDriver);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: inFmt, outFmt, inDriver, outDriver, serdeCls
                    // token labels: inFmt, inDriver, outDriver, serdeCls, outFmt
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_inFmt=new RewriteRuleTokenStream(adaptor,"token inFmt",inFmt);
                    RewriteRuleTokenStream stream_inDriver=new RewriteRuleTokenStream(adaptor,"token inDriver",inDriver);
                    RewriteRuleTokenStream stream_outDriver=new RewriteRuleTokenStream(adaptor,"token outDriver",outDriver);
                    RewriteRuleTokenStream stream_serdeCls=new RewriteRuleTokenStream(adaptor,"token serdeCls",serdeCls);
                    RewriteRuleTokenStream stream_outFmt=new RewriteRuleTokenStream(adaptor,"token outFmt",outFmt);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 601:7: -> ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? )
                    {
                        // AlterClauseParser.g:601:10: ^( TOK_TABLEFILEFORMAT $inFmt $outFmt $serdeCls ( $inDriver)? ( $outDriver)? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABLEFILEFORMAT, "TOK_TABLEFILEFORMAT")
                        , root_1);

                        adaptor.addChild(root_1, stream_inFmt.nextNode());

                        adaptor.addChild(root_1, stream_outFmt.nextNode());

                        adaptor.addChild(root_1, stream_serdeCls.nextNode());

                        // AlterClauseParser.g:601:58: ( $inDriver)?
                        if ( stream_inDriver.hasNext() ) {
                            adaptor.addChild(root_1, stream_inDriver.nextNode());

                        }
                        stream_inDriver.reset();

                        // AlterClauseParser.g:601:69: ( $outDriver)?
                        if ( stream_outDriver.hasNext() ) {
                            adaptor.addChild(root_1, stream_outDriver.nextNode());

                        }
                        stream_outDriver.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:602:7: genericSpec= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_fileFormat4825);
                    genericSpec=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(genericSpec.getTree());

                    // AST REWRITE
                    // elements: genericSpec
                    // token labels: 
                    // rule labels: genericSpec, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_genericSpec=new RewriteRuleSubtreeStream(adaptor,"rule genericSpec",genericSpec!=null?genericSpec.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 602:30: -> ^( TOK_FILEFORMAT_GENERIC $genericSpec)
                    {
                        // AlterClauseParser.g:602:33: ^( TOK_FILEFORMAT_GENERIC $genericSpec)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_FILEFORMAT_GENERIC, "TOK_FILEFORMAT_GENERIC")
                        , root_1);

                        adaptor.addChild(root_1, stream_genericSpec.nextTree());

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
    // $ANTLR end "fileFormat"


    public static class alterDataConnectorStatementSuffix_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDataConnectorStatementSuffix"
    // AlterClauseParser.g:605:1: alterDataConnectorStatementSuffix : ( alterDataConnectorSuffixProperties | alterDataConnectorSuffixSetOwner | alterDataConnectorSuffixSetUrl );
    public final HiveParser_AlterClauseParser.alterDataConnectorStatementSuffix_return alterDataConnectorStatementSuffix() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDataConnectorStatementSuffix_return retval = new HiveParser_AlterClauseParser.alterDataConnectorStatementSuffix_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_AlterClauseParser.alterDataConnectorSuffixProperties_return alterDataConnectorSuffixProperties347 =null;

        HiveParser_AlterClauseParser.alterDataConnectorSuffixSetOwner_return alterDataConnectorSuffixSetOwner348 =null;

        HiveParser_AlterClauseParser.alterDataConnectorSuffixSetUrl_return alterDataConnectorSuffixSetUrl349 =null;



         gParent.pushMsg("alter connector statement", state); 
        try {
            // AlterClauseParser.g:608:5: ( alterDataConnectorSuffixProperties | alterDataConnectorSuffixSetOwner | alterDataConnectorSuffixSetUrl )
            int alt79=3;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==Identifier) ) {
                int LA79_1 = input.LA(2);

                if ( (LA79_1==KW_SET) ) {
                    switch ( input.LA(3) ) {
                    case KW_DCPROPERTIES:
                        {
                        alt79=1;
                        }
                        break;
                    case KW_OWNER:
                        {
                        alt79=2;
                        }
                        break;
                    case KW_URL:
                        {
                        alt79=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 3, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 1, input);

                    throw nvae;

                }
            }
            else if ( ((LA79_0 >= KW_ABORT && LA79_0 <= KW_AFTER)||LA79_0==KW_ALLOC_FRACTION||LA79_0==KW_ANALYZE||LA79_0==KW_ARCHIVE||(LA79_0 >= KW_ASC && LA79_0 <= KW_AT)||(LA79_0 >= KW_AUTOCOMMIT && LA79_0 <= KW_BEFORE)||(LA79_0 >= KW_BRANCH && LA79_0 <= KW_BUCKETS)||(LA79_0 >= KW_CACHE && LA79_0 <= KW_CASCADE)||(LA79_0 >= KW_CBO && LA79_0 <= KW_CHANGE)||LA79_0==KW_CHECK||(LA79_0 >= KW_CLUSTER && LA79_0 <= KW_COLLECTION)||(LA79_0 >= KW_COLUMNS && LA79_0 <= KW_COMMENT)||(LA79_0 >= KW_COMPACT && LA79_0 <= KW_COMPACTIONS)||(LA79_0 >= KW_COMPUTE && LA79_0 <= KW_CONCATENATE)||LA79_0==KW_CONTINUE||LA79_0==KW_COST||LA79_0==KW_CRON||LA79_0==KW_DATA||LA79_0==KW_DATABASES||(LA79_0 >= KW_DATETIME && LA79_0 <= KW_DCPROPERTIES)||LA79_0==KW_DEBUG||(LA79_0 >= KW_DEFAULT && LA79_0 <= KW_DEFINED)||(LA79_0 >= KW_DELIMITED && LA79_0 <= KW_DESC)||(LA79_0 >= KW_DETAIL && LA79_0 <= KW_DISABLE)||(LA79_0 >= KW_DISTRIBUTE && LA79_0 <= KW_DO)||LA79_0==KW_DOW||(LA79_0 >= KW_DUMP && LA79_0 <= KW_ELEM_TYPE)||LA79_0==KW_ENABLE||(LA79_0 >= KW_ENFORCED && LA79_0 <= KW_EVERY)||(LA79_0 >= KW_EXCLUSIVE && LA79_0 <= KW_EXECUTED)||(LA79_0 >= KW_EXPIRE_SNAPSHOTS && LA79_0 <= KW_EXPRESSION)||LA79_0==KW_FAST_FORWARD||(LA79_0 >= KW_FIELDS && LA79_0 <= KW_FIRST)||(LA79_0 >= KW_FORMAT && LA79_0 <= KW_FORMATTED)||LA79_0==KW_FUNCTIONS||(LA79_0 >= KW_HOUR && LA79_0 <= KW_IDXPROPERTIES)||LA79_0==KW_IGNORE||(LA79_0 >= KW_INDEX && LA79_0 <= KW_INDEXES)||(LA79_0 >= KW_INPATH && LA79_0 <= KW_INPUTFORMAT)||(LA79_0 >= KW_ISOLATION && LA79_0 <= KW_JAR)||(LA79_0 >= KW_JOINCOST && LA79_0 <= KW_LAST)||LA79_0==KW_LEVEL||(LA79_0 >= KW_LIMIT && LA79_0 <= KW_LOAD)||(LA79_0 >= KW_LOCATION && LA79_0 <= KW_LONG)||(LA79_0 >= KW_MANAGED && LA79_0 <= KW_MANAGEMENT)||(LA79_0 >= KW_MAPJOIN && LA79_0 <= KW_MATERIALIZED)||LA79_0==KW_METADATA||(LA79_0 >= KW_MINUTE && LA79_0 <= KW_MONTH)||(LA79_0 >= KW_MOVE && LA79_0 <= KW_MSCK)||(LA79_0 >= KW_NORELY && LA79_0 <= KW_NOSCAN)||LA79_0==KW_NOVALIDATE||LA79_0==KW_NULLS||LA79_0==KW_OFFSET||(LA79_0 >= KW_OPERATOR && LA79_0 <= KW_OPTION)||(LA79_0 >= KW_OUTPUTDRIVER && LA79_0 <= KW_OUTPUTFORMAT)||(LA79_0 >= KW_OVERWRITE && LA79_0 <= KW_OWNER)||(LA79_0 >= KW_PARTITIONED && LA79_0 <= KW_PATH)||(LA79_0 >= KW_PLAN && LA79_0 <= KW_POOL)||LA79_0==KW_PRINCIPALS||LA79_0==KW_PURGE||(LA79_0 >= KW_QUARTER && LA79_0 <= KW_QUERY_PARALLELISM)||LA79_0==KW_READ||(LA79_0 >= KW_REBUILD && LA79_0 <= KW_RECORDWRITER)||(LA79_0 >= KW_RELOAD && LA79_0 <= KW_RETENTION)||LA79_0==KW_REWRITE||(LA79_0 >= KW_ROLE && LA79_0 <= KW_ROLES)||(LA79_0 >= KW_SCHEDULED && LA79_0 <= KW_SECOND)||(LA79_0 >= KW_SEMI && LA79_0 <= KW_SERVER)||(LA79_0 >= KW_SETS && LA79_0 <= KW_SKEWED)||(LA79_0 >= KW_SNAPSHOT && LA79_0 <= KW_SNAPSHOTS)||(LA79_0 >= KW_SORT && LA79_0 <= KW_SSL)||(LA79_0 >= KW_STATISTICS && LA79_0 <= KW_SUMMARY)||(LA79_0 >= KW_SYSTEM_TIME && LA79_0 <= KW_SYSTEM_VERSION)||LA79_0==KW_TABLES||(LA79_0 >= KW_TAG && LA79_0 <= KW_TERMINATED)||LA79_0==KW_TINYINT||LA79_0==KW_TOUCH||(LA79_0 >= KW_TRANSACTION && LA79_0 <= KW_TRANSACTIONS)||LA79_0==KW_TRIM||(LA79_0 >= KW_TYPE && LA79_0 <= KW_UNARCHIVE)||LA79_0==KW_UNDO||LA79_0==KW_UNIONTYPE||(LA79_0 >= KW_UNKNOWN && LA79_0 <= KW_UNSIGNED)||(LA79_0 >= KW_URI && LA79_0 <= KW_USE)||(LA79_0 >= KW_UTC && LA79_0 <= KW_VALIDATE)||LA79_0==KW_VALUE_TYPE||(LA79_0 >= KW_VECTORIZATION && LA79_0 <= KW_WEEK)||LA79_0==KW_WHILE||(LA79_0 >= KW_WITHIN && LA79_0 <= KW_ZONE)||LA79_0==KW_BATCH||LA79_0==KW_DAYOFWEEK||LA79_0==KW_HOLD_DDLTIME||LA79_0==KW_NO_DROP||LA79_0==KW_OFFLINE||LA79_0==KW_PROTECTION||LA79_0==KW_READONLY||LA79_0==KW_TIMESTAMPTZ) ) {
                int LA79_2 = input.LA(2);

                if ( (LA79_2==KW_SET) ) {
                    switch ( input.LA(3) ) {
                    case KW_DCPROPERTIES:
                        {
                        alt79=1;
                        }
                        break;
                    case KW_OWNER:
                        {
                        alt79=2;
                        }
                        break;
                    case KW_URL:
                        {
                        alt79=3;
                        }
                        break;
                    default:
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 79, 4, input);

                        throw nvae;

                    }

                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 79, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;

            }
            switch (alt79) {
                case 1 :
                    // AlterClauseParser.g:608:7: alterDataConnectorSuffixProperties
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterDataConnectorSuffixProperties_in_alterDataConnectorStatementSuffix4861);
                    alterDataConnectorSuffixProperties347=alterDataConnectorSuffixProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDataConnectorSuffixProperties347.getTree());

                    }
                    break;
                case 2 :
                    // AlterClauseParser.g:609:7: alterDataConnectorSuffixSetOwner
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterDataConnectorSuffixSetOwner_in_alterDataConnectorStatementSuffix4869);
                    alterDataConnectorSuffixSetOwner348=alterDataConnectorSuffixSetOwner();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDataConnectorSuffixSetOwner348.getTree());

                    }
                    break;
                case 3 :
                    // AlterClauseParser.g:610:7: alterDataConnectorSuffixSetUrl
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_alterDataConnectorSuffixSetUrl_in_alterDataConnectorStatementSuffix4877);
                    alterDataConnectorSuffixSetUrl349=alterDataConnectorSuffixSetUrl();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, alterDataConnectorSuffixSetUrl349.getTree());

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
    // $ANTLR end "alterDataConnectorStatementSuffix"


    public static class alterDataConnectorSuffixProperties_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDataConnectorSuffixProperties"
    // AlterClauseParser.g:613:1: alterDataConnectorSuffixProperties : name= identifier KW_SET KW_DCPROPERTIES dcProperties -> ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties ) ;
    public final HiveParser_AlterClauseParser.alterDataConnectorSuffixProperties_return alterDataConnectorSuffixProperties() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDataConnectorSuffixProperties_return retval = new HiveParser_AlterClauseParser.alterDataConnectorSuffixProperties_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET350=null;
        Token KW_DCPROPERTIES351=null;
        HiveParser_IdentifiersParser.identifier_return name =null;

        HiveParser_CreateDDLParser.dcProperties_return dcProperties352 =null;


        ASTNode KW_SET350_tree=null;
        ASTNode KW_DCPROPERTIES351_tree=null;
        RewriteRuleTokenStream stream_KW_DCPROPERTIES=new RewriteRuleTokenStream(adaptor,"token KW_DCPROPERTIES");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_dcProperties=new RewriteRuleSubtreeStream(adaptor,"rule dcProperties");
         gParent.pushMsg("alter connector set properties statement", state); 
        try {
            // AlterClauseParser.g:616:5: (name= identifier KW_SET KW_DCPROPERTIES dcProperties -> ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties ) )
            // AlterClauseParser.g:616:7: name= identifier KW_SET KW_DCPROPERTIES dcProperties
            {
            pushFollow(FOLLOW_identifier_in_alterDataConnectorSuffixProperties4906);
            name=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(name.getTree());

            KW_SET350=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDataConnectorSuffixProperties4908); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET350);


            KW_DCPROPERTIES351=(Token)match(input,KW_DCPROPERTIES,FOLLOW_KW_DCPROPERTIES_in_alterDataConnectorSuffixProperties4910); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DCPROPERTIES.add(KW_DCPROPERTIES351);


            pushFollow(FOLLOW_dcProperties_in_alterDataConnectorSuffixProperties4912);
            dcProperties352=gHiveParser.dcProperties();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_dcProperties.add(dcProperties352.getTree());

            // AST REWRITE
            // elements: dcProperties, name
            // token labels: 
            // rule labels: name, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 617:5: -> ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties )
            {
                // AlterClauseParser.g:617:8: ^( TOK_ALTERDATACONNECTOR_PROPERTIES $name dcProperties )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERDATACONNECTOR_PROPERTIES, "TOK_ALTERDATACONNECTOR_PROPERTIES")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                adaptor.addChild(root_1, stream_dcProperties.nextTree());

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
    // $ANTLR end "alterDataConnectorSuffixProperties"


    public static class alterDataConnectorSuffixSetOwner_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDataConnectorSuffixSetOwner"
    // AlterClauseParser.g:620:1: alterDataConnectorSuffixSetOwner : dcName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName ) ;
    public final HiveParser_AlterClauseParser.alterDataConnectorSuffixSetOwner_return alterDataConnectorSuffixSetOwner() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDataConnectorSuffixSetOwner_return retval = new HiveParser_AlterClauseParser.alterDataConnectorSuffixSetOwner_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_SET353=null;
        Token KW_OWNER354=null;
        HiveParser_IdentifiersParser.identifier_return dcName =null;

        HiveParser.principalName_return principalName355 =null;


        ASTNode KW_SET353_tree=null;
        ASTNode KW_OWNER354_tree=null;
        RewriteRuleTokenStream stream_KW_OWNER=new RewriteRuleTokenStream(adaptor,"token KW_OWNER");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_principalName=new RewriteRuleSubtreeStream(adaptor,"rule principalName");
         gParent.pushMsg("alter connector set owner", state); 
        try {
            // AlterClauseParser.g:623:5: (dcName= identifier KW_SET KW_OWNER principalName -> ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName ) )
            // AlterClauseParser.g:623:7: dcName= identifier KW_SET KW_OWNER principalName
            {
            pushFollow(FOLLOW_identifier_in_alterDataConnectorSuffixSetOwner4956);
            dcName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(dcName.getTree());

            KW_SET353=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDataConnectorSuffixSetOwner4958); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET353);


            KW_OWNER354=(Token)match(input,KW_OWNER,FOLLOW_KW_OWNER_in_alterDataConnectorSuffixSetOwner4960); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OWNER.add(KW_OWNER354);


            pushFollow(FOLLOW_principalName_in_alterDataConnectorSuffixSetOwner4962);
            principalName355=gHiveParser.principalName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_principalName.add(principalName355.getTree());

            // AST REWRITE
            // elements: dcName, principalName
            // token labels: 
            // rule labels: dcName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_dcName=new RewriteRuleSubtreeStream(adaptor,"rule dcName",dcName!=null?dcName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 624:5: -> ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName )
            {
                // AlterClauseParser.g:624:8: ^( TOK_ALTERDATACONNECTOR_OWNER $dcName principalName )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERDATACONNECTOR_OWNER, "TOK_ALTERDATACONNECTOR_OWNER")
                , root_1);

                adaptor.addChild(root_1, stream_dcName.nextTree());

                adaptor.addChild(root_1, stream_principalName.nextTree());

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
    // $ANTLR end "alterDataConnectorSuffixSetOwner"


    public static class alterDataConnectorSuffixSetUrl_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alterDataConnectorSuffixSetUrl"
    // AlterClauseParser.g:627:1: alterDataConnectorSuffixSetUrl : dcName= identifier KW_SET KW_URL newUri= StringLiteral -> ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri) ;
    public final HiveParser_AlterClauseParser.alterDataConnectorSuffixSetUrl_return alterDataConnectorSuffixSetUrl() throws RecognitionException {
        HiveParser_AlterClauseParser.alterDataConnectorSuffixSetUrl_return retval = new HiveParser_AlterClauseParser.alterDataConnectorSuffixSetUrl_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token newUri=null;
        Token KW_SET356=null;
        Token KW_URL357=null;
        HiveParser_IdentifiersParser.identifier_return dcName =null;


        ASTNode newUri_tree=null;
        ASTNode KW_SET356_tree=null;
        ASTNode KW_URL357_tree=null;
        RewriteRuleTokenStream stream_StringLiteral=new RewriteRuleTokenStream(adaptor,"token StringLiteral");
        RewriteRuleTokenStream stream_KW_URL=new RewriteRuleTokenStream(adaptor,"token KW_URL");
        RewriteRuleTokenStream stream_KW_SET=new RewriteRuleTokenStream(adaptor,"token KW_SET");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("alter connector set url", state); 
        try {
            // AlterClauseParser.g:630:5: (dcName= identifier KW_SET KW_URL newUri= StringLiteral -> ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri) )
            // AlterClauseParser.g:630:7: dcName= identifier KW_SET KW_URL newUri= StringLiteral
            {
            pushFollow(FOLLOW_identifier_in_alterDataConnectorSuffixSetUrl5006);
            dcName=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(dcName.getTree());

            KW_SET356=(Token)match(input,KW_SET,FOLLOW_KW_SET_in_alterDataConnectorSuffixSetUrl5008); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_SET.add(KW_SET356);


            KW_URL357=(Token)match(input,KW_URL,FOLLOW_KW_URL_in_alterDataConnectorSuffixSetUrl5010); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_URL.add(KW_URL357);


            newUri=(Token)match(input,StringLiteral,FOLLOW_StringLiteral_in_alterDataConnectorSuffixSetUrl5014); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_StringLiteral.add(newUri);


            // AST REWRITE
            // elements: dcName, newUri
            // token labels: newUri
            // rule labels: dcName, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_newUri=new RewriteRuleTokenStream(adaptor,"token newUri",newUri);
            RewriteRuleSubtreeStream stream_dcName=new RewriteRuleSubtreeStream(adaptor,"rule dcName",dcName!=null?dcName.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 631:5: -> ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri)
            {
                // AlterClauseParser.g:631:8: ^( TOK_ALTERDATACONNECTOR_URL $dcName $newUri)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALTERDATACONNECTOR_URL, "TOK_ALTERDATACONNECTOR_URL")
                , root_1);

                adaptor.addChild(root_1, stream_dcName.nextTree());

                adaptor.addChild(root_1, stream_newUri.nextNode());

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
    // $ANTLR end "alterDataConnectorSuffixSetUrl"

    // $ANTLR start synpred1_AlterClauseParser
    public final void synpred1_AlterClauseParser_fragment() throws RecognitionException {
        // AlterClauseParser.g:61:7: ( alterStatementSuffixRename[true] )
        // AlterClauseParser.g:61:8: alterStatementSuffixRename[true]
        {
        pushFollow(FOLLOW_alterStatementSuffixRename_in_synpred1_AlterClauseParser220);
        alterStatementSuffixRename(true);

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred1_AlterClauseParser

    // $ANTLR start synpred2_AlterClauseParser
    public final void synpred2_AlterClauseParser_fragment() throws RecognitionException {
        // AlterClauseParser.g:78:7: ( KW_CREATE KW_OR KW_REPLACE KW_TAG )
        // AlterClauseParser.g:78:8: KW_CREATE KW_OR KW_REPLACE KW_TAG
        {
        match(input,KW_CREATE,FOLLOW_KW_CREATE_in_synpred2_AlterClauseParser376); if (state.failed) return ;

        match(input,KW_OR,FOLLOW_KW_OR_in_synpred2_AlterClauseParser378); if (state.failed) return ;

        match(input,KW_REPLACE,FOLLOW_KW_REPLACE_in_synpred2_AlterClauseParser380); if (state.failed) return ;

        match(input,KW_TAG,FOLLOW_KW_TAG_in_synpred2_AlterClauseParser382); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_AlterClauseParser

    // Delegated rules

    public final boolean synpred2_AlterClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_AlterClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_AlterClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_AlterClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA4 dfa4 = new DFA4(this);
    static final String DFA4_eotS =
        "\75\uffff";
    static final String DFA4_eofS =
        "\75\uffff";
    static final String DFA4_minS =
        "\1\35\2\65\1\107\3\uffff\1\u0096\1\u013d\1\uffff\1\103\1\uffff\1"+
        "\106\6\uffff\1\65\1\uffff\1\65\1\uffff\1\30\35\uffff\1\u0124\5\uffff"+
        "\1\0\1\uffff";
    static final String DFA4_maxS =
        "\1\u017e\1\u0166\1\u015c\1\u00fd\3\uffff\2\u015d\1\uffff\1\u0151"+
        "\1\uffff\1\u019e\6\uffff\1\u015c\1\uffff\1\u015c\1\uffff\1\u02f1"+
        "\35\uffff\1\u0124\5\uffff\1\0\1\uffff";
    static final String DFA4_acceptS =
        "\4\uffff\1\4\1\5\1\6\2\uffff\1\10\1\uffff\1\11\1\uffff\1\15\6\uffff"+
        "\1\21\1\uffff\1\27\1\uffff\1\30\1\13\1\24\1\26\1\2\1\uffff\1\3\1"+
        "\uffff\1\14\1\uffff\1\7\5\uffff\1\17\1\20\6\uffff\1\12\1\16\1\31"+
        "\1\32\2\uffff\1\23\1\25\2\1\2\uffff\1\22";
    static final String DFA4_specialS =
        "\27\uffff\1\0\43\uffff\1\1\1\uffff}>";
    static final String[] DFA4_transitionS = {
            "\1\3\11\uffff\1\5\26\uffff\1\15\4\uffff\1\15\6\uffff\1\15\3"+
            "\uffff\1\15\3\uffff\1\26\1\uffff\1\25\46\uffff\1\2\11\uffff"+
            "\1\13\1\uffff\1\24\60\uffff\1\15\56\uffff\1\12\25\uffff\1\14"+
            "\42\uffff\1\1\3\uffff\1\23\32\uffff\1\7\5\uffff\1\11\41\uffff"+
            "\1\4\12\uffff\1\6\11\uffff\1\10\1\uffff\1\15",
            "\1\30\u0130\uffff\1\27",
            "\1\32\32\uffff\1\31\131\uffff\1\34\122\uffff\1\34\136\uffff"+
            "\1\33",
            "\1\15\10\uffff\1\40\131\uffff\1\36\122\uffff\1\36",
            "",
            "",
            "",
            "\1\15\67\uffff\1\15\55\uffff\1\50\1\51\76\uffff\2\15\7\uffff"+
            "\1\15\27\uffff\1\42",
            "\1\15\37\uffff\1\42",
            "",
            "\1\15\u0101\uffff\1\11\5\uffff\1\15\5\uffff\1\11",
            "",
            "\1\60\u0157\uffff\1\61",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\62\21\uffff\1\15\u0114\uffff\1\63",
            "",
            "\1\66\u00bd\uffff\1\65\150\uffff\1\67",
            "",
            "\1\70\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71\3\uffff\1\71\2"+
            "\uffff\3\71\1\uffff\2\71\5\uffff\3\71\1\uffff\2\71\2\uffff\2"+
            "\71\1\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\uffff\2\71\1\uffff"+
            "\2\71\2\uffff\1\71\1\uffff\1\71\1\uffff\1\71\6\uffff\1\71\1"+
            "\uffff\1\71\3\uffff\4\71\1\uffff\1\71\1\uffff\3\71\1\uffff\3"+
            "\71\1\uffff\4\71\1\uffff\3\71\1\uffff\1\71\1\uffff\2\71\1\uffff"+
            "\1\71\1\uffff\3\71\2\uffff\3\71\1\uffff\4\71\4\uffff\1\71\1"+
            "\uffff\4\71\6\uffff\2\71\3\uffff\1\71\4\uffff\2\71\1\uffff\1"+
            "\71\2\uffff\2\71\1\uffff\3\71\6\uffff\3\71\1\uffff\6\71\4\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\uffff\1"+
            "\71\1\uffff\1\71\1\uffff\1\71\3\uffff\3\71\5\uffff\2\71\1\uffff"+
            "\2\71\1\15\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\3\uffff\16\71\1\uffff\1\71\2"+
            "\uffff\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff\6\71\1\uffff\2"+
            "\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1\uffff\1\71\1\uffff"+
            "\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3\71\2\uffff\1\71\2"+
            "\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff\5\71\1\uffff\3"+
            "\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2\uffff\1\71\2\uffff"+
            "\6\71\77\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67\uffff\1\71"+
            "\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff\1\71",
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
            "\1\73",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            ""
    };

    static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
    static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
    static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
    static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
    static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
    static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
    static final short[][] DFA4_transition;

    static {
        int numStates = DFA4_transitionS.length;
        DFA4_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
        }
    }

    class DFA4 extends DFA {

        public DFA4(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 4;
            this.eot = DFA4_eot;
            this.eof = DFA4_eof;
            this.min = DFA4_min;
            this.max = DFA4_max;
            this.accept = DFA4_accept;
            this.special = DFA4_special;
            this.transition = DFA4_transition;
        }
        public String getDescription() {
            return "58:1: alterTableStatementSuffix : ( ( alterStatementSuffixRename[true] )=> alterStatementSuffixRename[true] | alterStatementSuffixDropPartitions[true] | alterStatementSuffixAddPartitions[true] | alterStatementSuffixTouch | alterStatementSuffixArchive | alterStatementSuffixUnArchive | alterStatementSuffixProperties | alterStatementSuffixSkewedby | alterStatementSuffixExchangePartition | alterStatementPartitionKeyType | alterStatementSuffixDropConstraint | alterStatementSuffixAddConstraint | alterTblPartitionStatementSuffix[false] | partitionSpec alterTblPartitionStatementSuffix[true] -> alterTblPartitionStatementSuffix partitionSpec | alterStatementSuffixSetOwner | alterStatementSuffixSetPartSpec | alterStatementSuffixExecute | ( KW_CREATE KW_OR KW_REPLACE KW_TAG )=> alterStatementSuffixCreateOrReplaceTag | alterStatementSuffixCreateBranch | alterStatementSuffixDropBranch | alterStatementSuffixCreateTag | alterStatementSuffixDropTag | alterStatementSuffixConvert | alterStatementSuffixRenameBranch | alterStatementSuffixReplaceBranch | alterStatementSuffixReplaceTag );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA4_23 = input.LA(1);

                         
                        int index4_23 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA4_23==Identifier) && (synpred1_AlterClauseParser())) {s = 56;}

                        else if ( ((LA4_23 >= KW_ABORT && LA4_23 <= KW_AFTER)||LA4_23==KW_ALLOC_FRACTION||LA4_23==KW_ANALYZE||LA4_23==KW_ARCHIVE||(LA4_23 >= KW_ASC && LA4_23 <= KW_AT)||(LA4_23 >= KW_AUTOCOMMIT && LA4_23 <= KW_BEFORE)||(LA4_23 >= KW_BRANCH && LA4_23 <= KW_BUCKETS)||(LA4_23 >= KW_CACHE && LA4_23 <= KW_CASCADE)||(LA4_23 >= KW_CBO && LA4_23 <= KW_CHANGE)||LA4_23==KW_CHECK||(LA4_23 >= KW_CLUSTER && LA4_23 <= KW_COLLECTION)||(LA4_23 >= KW_COLUMNS && LA4_23 <= KW_COMMENT)||(LA4_23 >= KW_COMPACT && LA4_23 <= KW_COMPACTIONS)||(LA4_23 >= KW_COMPUTE && LA4_23 <= KW_CONCATENATE)||LA4_23==KW_CONTINUE||LA4_23==KW_COST||LA4_23==KW_CRON||LA4_23==KW_DATA||LA4_23==KW_DATABASES||(LA4_23 >= KW_DATETIME && LA4_23 <= KW_DCPROPERTIES)||LA4_23==KW_DEBUG||(LA4_23 >= KW_DEFAULT && LA4_23 <= KW_DEFINED)||(LA4_23 >= KW_DELIMITED && LA4_23 <= KW_DESC)||(LA4_23 >= KW_DETAIL && LA4_23 <= KW_DISABLE)||(LA4_23 >= KW_DISTRIBUTE && LA4_23 <= KW_DO)||LA4_23==KW_DOW||(LA4_23 >= KW_DUMP && LA4_23 <= KW_ELEM_TYPE)||LA4_23==KW_ENABLE||(LA4_23 >= KW_ENFORCED && LA4_23 <= KW_EVERY)||(LA4_23 >= KW_EXCLUSIVE && LA4_23 <= KW_EXECUTED)||(LA4_23 >= KW_EXPIRE_SNAPSHOTS && LA4_23 <= KW_EXPRESSION)||LA4_23==KW_FAST_FORWARD||(LA4_23 >= KW_FIELDS && LA4_23 <= KW_FIRST)||(LA4_23 >= KW_FORMAT && LA4_23 <= KW_FORMATTED)||LA4_23==KW_FUNCTIONS||(LA4_23 >= KW_HOUR && LA4_23 <= KW_IDXPROPERTIES)||LA4_23==KW_IGNORE||(LA4_23 >= KW_INDEX && LA4_23 <= KW_INDEXES)||(LA4_23 >= KW_INPATH && LA4_23 <= KW_INPUTFORMAT)||(LA4_23 >= KW_ISOLATION && LA4_23 <= KW_JAR)||(LA4_23 >= KW_JOINCOST && LA4_23 <= KW_LAST)||LA4_23==KW_LEVEL||(LA4_23 >= KW_LIMIT && LA4_23 <= KW_LOAD)||(LA4_23 >= KW_LOCATION && LA4_23 <= KW_LONG)||(LA4_23 >= KW_MANAGED && LA4_23 <= KW_MANAGEMENT)||(LA4_23 >= KW_MAPJOIN && LA4_23 <= KW_MATERIALIZED)||LA4_23==KW_METADATA||(LA4_23 >= KW_MINUTE && LA4_23 <= KW_MONTH)||(LA4_23 >= KW_MOVE && LA4_23 <= KW_MSCK)||(LA4_23 >= KW_NORELY && LA4_23 <= KW_NOSCAN)||LA4_23==KW_NOVALIDATE||LA4_23==KW_NULLS||LA4_23==KW_OFFSET||(LA4_23 >= KW_OPERATOR && LA4_23 <= KW_OPTION)||(LA4_23 >= KW_OUTPUTDRIVER && LA4_23 <= KW_OUTPUTFORMAT)||(LA4_23 >= KW_OVERWRITE && LA4_23 <= KW_OWNER)||(LA4_23 >= KW_PARTITIONED && LA4_23 <= KW_PATH)||(LA4_23 >= KW_PLAN && LA4_23 <= KW_POOL)||LA4_23==KW_PRINCIPALS||LA4_23==KW_PURGE||(LA4_23 >= KW_QUARTER && LA4_23 <= KW_QUERY_PARALLELISM)||LA4_23==KW_READ||(LA4_23 >= KW_REBUILD && LA4_23 <= KW_RECORDWRITER)||(LA4_23 >= KW_RELOAD && LA4_23 <= KW_RETENTION)||LA4_23==KW_REWRITE||(LA4_23 >= KW_ROLE && LA4_23 <= KW_ROLES)||(LA4_23 >= KW_SCHEDULED && LA4_23 <= KW_SECOND)||(LA4_23 >= KW_SEMI && LA4_23 <= KW_SERVER)||(LA4_23 >= KW_SETS && LA4_23 <= KW_SKEWED)||(LA4_23 >= KW_SNAPSHOT && LA4_23 <= KW_SNAPSHOTS)||(LA4_23 >= KW_SORT && LA4_23 <= KW_SSL)||(LA4_23 >= KW_STATISTICS && LA4_23 <= KW_SUMMARY)||(LA4_23 >= KW_SYSTEM_TIME && LA4_23 <= KW_SYSTEM_VERSION)||LA4_23==KW_TABLES||(LA4_23 >= KW_TAG && LA4_23 <= KW_TERMINATED)||LA4_23==KW_TINYINT||LA4_23==KW_TOUCH||(LA4_23 >= KW_TRANSACTION && LA4_23 <= KW_TRANSACTIONS)||LA4_23==KW_TRIM||(LA4_23 >= KW_TYPE && LA4_23 <= KW_UNARCHIVE)||LA4_23==KW_UNDO||LA4_23==KW_UNIONTYPE||(LA4_23 >= KW_UNKNOWN && LA4_23 <= KW_UNSIGNED)||(LA4_23 >= KW_URI && LA4_23 <= KW_USE)||(LA4_23 >= KW_UTC && LA4_23 <= KW_VALIDATE)||LA4_23==KW_VALUE_TYPE||(LA4_23 >= KW_VECTORIZATION && LA4_23 <= KW_WEEK)||LA4_23==KW_WHILE||(LA4_23 >= KW_WITHIN && LA4_23 <= KW_ZONE)||LA4_23==KW_BATCH||LA4_23==KW_DAYOFWEEK||LA4_23==KW_HOLD_DDLTIME||LA4_23==KW_NO_DROP||LA4_23==KW_OFFLINE||LA4_23==KW_PROTECTION||LA4_23==KW_READONLY||LA4_23==KW_TIMESTAMPTZ) && (synpred1_AlterClauseParser())) {s = 57;}

                        else if ( (LA4_23==KW_PARTITION) ) {s = 13;}

                         
                        input.seek(index4_23);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA4_59 = input.LA(1);

                         
                        int index4_59 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred2_AlterClauseParser()) ) {s = 60;}

                        else if ( (true) ) {s = 54;}

                         
                        input.seek(index4_59);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 4, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_KW_ALTER_in_alterStatement66 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_TABLE_in_alterStatement68 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_alterStatement70 = new BitSet(new long[]{0x4000008020000000L,0x0800000000144408L,0x01000000000000A0L,0x2000008000000000L,0x8000001100000000L,0x5004008000000020L});
    public static final BitSet FOLLOW_alterTableStatementSuffix_in_alterStatement72 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterStatement90 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_VIEW_in_alterStatement92 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_alterStatement94 = new BitSet(new long[]{0x0000020020000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000800000L,0x8400000104000000L,0x1000000000000000L,0x0000000040080080L});
    public static final BitSet FOLLOW_KW_AS_in_alterStatement96 = new BitSet(new long[]{0x0000000020000000L,0x0800000000000000L,0x0000000000000000L,0x0000000000800000L,0x8400000104000000L,0x1000000000000000L,0x0000000040080080L});
    public static final BitSet FOLLOW_alterViewStatementSuffix_in_alterStatement99 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterStatement117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_MATERIALIZED_in_alterStatement119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_VIEW_in_alterStatement121 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_alterStatement125 = new BitSet(new long[]{0x0000000000000000L,0x8010000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_alterMaterializedViewStatementSuffix_in_alterStatement127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterStatement140 = new BitSet(new long[]{0x0000000000000000L,0x0000000020000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_DATABASE_in_alterStatement143 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_SCHEMA_in_alterStatement145 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_alterDatabaseStatementSuffix_in_alterStatement148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ALTER_in_alterStatement160 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_KW_DATACONNECTOR_in_alterStatement162 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_alterDataConnectorStatementSuffix_in_alterStatement164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_OPTIMIZE_in_alterStatement176 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_TABLE_in_alterStatement178 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_alterStatement180 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_optimizeTableStatementSuffix_in_alterStatement182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixRename_in_alterTableStatementSuffix226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixDropPartitions_in_alterTableStatementSuffix235 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixAddPartitions_in_alterTableStatementSuffix244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixTouch_in_alterTableStatementSuffix253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixArchive_in_alterTableStatementSuffix261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixUnArchive_in_alterTableStatementSuffix269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixProperties_in_alterTableStatementSuffix277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixSkewedby_in_alterTableStatementSuffix285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixExchangePartition_in_alterTableStatementSuffix293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementPartitionKeyType_in_alterTableStatementSuffix301 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixDropConstraint_in_alterTableStatementSuffix309 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixAddConstraint_in_alterTableStatementSuffix317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionSpec_in_alterTableStatementSuffix334 = new BitSet(new long[]{0x4000000020000000L,0x0000000000004408L,0x0100000000000000L,0x0000008000000000L,0x8000001100000000L,0x5000000000000000L});
    public static final BitSet FOLLOW_alterTblPartitionStatementSuffix_in_alterTableStatementSuffix336 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixSetOwner_in_alterTableStatementSuffix351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixSetPartSpec_in_alterTableStatementSuffix359 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixExecute_in_alterTableStatementSuffix367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixCreateOrReplaceTag_in_alterTableStatementSuffix387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixCreateBranch_in_alterTableStatementSuffix395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixDropBranch_in_alterTableStatementSuffix403 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixCreateTag_in_alterTableStatementSuffix411 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixDropTag_in_alterTableStatementSuffix419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixConvert_in_alterTableStatementSuffix427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixRenameBranch_in_alterTableStatementSuffix435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixReplaceBranch_in_alterTableStatementSuffix443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixReplaceTag_in_alterTableStatementSuffix451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixFileFormat_in_alterTblPartitionStatementSuffix477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixLocation_in_alterTblPartitionStatementSuffix484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixMergeFiles_in_alterTblPartitionStatementSuffix491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixSerdeProperties_in_alterTblPartitionStatementSuffix498 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixRenamePart_in_alterTblPartitionStatementSuffix505 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixBucketNum_in_alterTblPartitionStatementSuffix511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterTblPartitionStatementSuffixSkewedLocation_in_alterTblPartitionStatementSuffix518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixClusterbySortby_in_alterTblPartitionStatementSuffix524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixCompact_in_alterTblPartitionStatementSuffix530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixUpdateStatsCol_in_alterTblPartitionStatementSuffix536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixUpdateStats_in_alterTblPartitionStatementSuffix543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixRenameCol_in_alterTblPartitionStatementSuffix550 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixAddCol_in_alterTblPartitionStatementSuffix556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixUpdateColumns_in_alterTblPartitionStatementSuffix562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_optimizeTblRewriteDataSuffix_in_optimizeTableStatementSuffix587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_REWRITE_in_optimizeTblRewriteDataSuffix614 = new BitSet(new long[]{0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_DATA_in_optimizeTblRewriteDataSuffix616 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementPartitionKeyType655 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementPartitionKeyType657 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementPartitionKeyType659 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_columnNameType_in_alterStatementPartitionKeyType661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementPartitionKeyType663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterViewSuffixProperties_in_alterViewStatementSuffix696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixRename_in_alterViewStatementSuffix704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixAddPartitions_in_alterViewStatementSuffix713 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixDropPartitions_in_alterViewStatementSuffix722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_selectStatementWithCTE_in_alterViewStatementSuffix731 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterMaterializedViewSuffixRewrite_in_alterMaterializedViewStatementSuffix767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterMaterializedViewSuffixRebuild_in_alterMaterializedViewStatementSuffix776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewriteEnabled_in_alterMaterializedViewSuffixRewrite808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rewriteDisabled_in_alterMaterializedViewSuffixRewrite814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_REBUILD_in_alterMaterializedViewSuffixRebuild858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterDatabaseSuffixProperties_in_alterDatabaseStatementSuffix893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterDatabaseSuffixSetOwner_in_alterDatabaseStatementSuffix901 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterDatabaseSuffixSetLocation_in_alterDatabaseStatementSuffix909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixProperties938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixProperties940 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_DBPROPERTIES_in_alterDatabaseSuffixProperties942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dbProperties_in_alterDatabaseSuffixProperties944 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetOwner988 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetOwner990 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_OWNER_in_alterDatabaseSuffixSetOwner992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_principalName_in_alterDatabaseSuffixSetOwner994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetLocation1038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation1040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_LOCATION_in_alterDatabaseSuffixSetLocation1042 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation1046 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetLocation1072 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetLocation1074 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetLocation1076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterDatabaseSuffixSetLocation1080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDatabaseSuffixSetManagedLocation1125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDatabaseSuffixSetManagedLocation1127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_KW_MANAGEDLOCATION_in_alterDatabaseSuffixSetManagedLocation1129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterDatabaseSuffixSetManagedLocation1133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RENAME_in_alterStatementSuffixRename1177 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterStatementSuffixRename1179 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_alterStatementSuffixRename1181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddCol1248 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KW_REPLACE_in_alterStatementSuffixAddCol1254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KW_COLUMNS_in_alterStatementSuffixAddCol1257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixAddCol1259 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_columnNameTypeList_in_alterStatementSuffixAddCol1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixAddCol1263 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_restrictOrCascade_in_alterStatementSuffixAddCol1265 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddConstraint1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_alterForeignKeyWithName_in_alterStatementSuffixAddConstraint1346 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterConstraintWithName_in_alterStatementSuffixAddConstraint1350 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateColumns1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KW_COLUMNS_in_alterStatementSuffixUpdateColumns1417 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_restrictOrCascade_in_alterStatementSuffixUpdateColumns1419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_alterStatementSuffixDropConstraint1459 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_KW_CONSTRAINT_in_alterStatementSuffixDropConstraint1461 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixDropConstraint1465 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CHANGE_in_alterStatementSuffixRenameCol1502 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DFDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementSuffixRenameCol1504 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixRenameCol1509 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixRenameCol1513 = new BitSet(new long[]{0x800E010000000000L,0x0200010600000000L,0x0020000001000000L,0x0000000000800000L,0x0000000000400000L,0x0040003800180040L,0x0000000000000200L});
    public static final BitSet FOLLOW_colType_in_alterStatementSuffixRenameCol1515 = new BitSet(new long[]{0x0400000080000002L,0x0000020000010101L,0x0000000000800000L,0x0000008000000000L,0x0000010008000800L,0x0080000000000000L});
    public static final BitSet FOLLOW_alterColumnConstraint_in_alterStatementSuffixRenameCol1517 = new BitSet(new long[]{0x0400000080000002L,0x0000000000000100L,0x0000000000800000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_KW_COMMENT_in_alterStatementSuffixRenameCol1522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixRenameCol1526 = new BitSet(new long[]{0x0400000080000002L,0x0000000000000000L,0x0000000000800000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_alterStatementChangeColPosition_in_alterStatementSuffixRenameCol1530 = new BitSet(new long[]{0x0400000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000010000000000L});
    public static final BitSet FOLLOW_restrictOrCascade_in_alterStatementSuffixRenameCol1533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStatsCol1592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStatsCol1594 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_FOR_in_alterStatementSuffixUpdateStatsCol1596 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DFDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementSuffixUpdateStatsCol1598 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixUpdateStatsCol1603 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixUpdateStatsCol1605 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixUpdateStatsCol1607 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_KW_COMMENT_in_alterStatementSuffixUpdateStatsCol1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixUpdateStatsCol1614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixUpdateStats1697 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KW_STATISTICS_in_alterStatementSuffixUpdateStats1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixUpdateStats1701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixUpdateStats1703 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FIRST_in_alterStatementChangeColPosition1761 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AFTER_in_alterStatementChangeColPosition1763 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementChangeColPosition1767 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_ADD_in_alterStatementSuffixAddPartitions1820 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_ifNotExists_in_alterStatementSuffixAddPartitions1822 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_alterStatementSuffixAddPartitionsElement_in_alterStatementSuffixAddPartitions1825 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixAddPartitionsElement1888 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_partitionLocation_in_alterStatementSuffixAddPartitionsElement1890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TOUCH_in_alterStatementSuffixTouch1918 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixTouch1921 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_ARCHIVE_in_alterStatementSuffixArchive1965 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixArchive1968 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_UNARCHIVE_in_alterStatementSuffixUnArchive2012 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixUnArchive2015 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_LOCATION_in_partitionLocation2065 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_partitionLocation2069 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_alterStatementSuffixDropPartitions2106 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_ifExists_in_alterStatementSuffixDropPartitions2108 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions2111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions2113 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_COMMA_in_alterStatementSuffixDropPartitions2116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementSuffixDropPartitions2118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_partitionSelectorSpec_in_alterStatementSuffixDropPartitions2120 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_PURGE_in_alterStatementSuffixDropPartitions2124 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_replicationClause_in_alterStatementSuffixDropPartitions2127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixProperties2209 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2211 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixProperties2213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNSET_in_alterStatementSuffixProperties2233 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixProperties2235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ifExists_in_alterStatementSuffixProperties2237 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixProperties2240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterViewSuffixProperties2282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2284 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterViewSuffixProperties2286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNSET_in_alterViewSuffixProperties2306 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterViewSuffixProperties2308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000040000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_ifExists_in_alterViewSuffixProperties2310 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterViewSuffixProperties2313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2356 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_SERDE_in_alterStatementSuffixSerdeProperties2358 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixSerdeProperties2362 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_alterStatementSuffixSerdeProperties2365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSerdeProperties2426 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2430 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNSET_in_alterStatementSuffixSerdeProperties2477 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_SERDEPROPERTIES_in_alterStatementSuffixSerdeProperties2479 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixSerdeProperties2481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tablePartitionPrefix2545 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_tablePartitionPrefix2547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixFileFormat2584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_KW_FILEFORMAT_in_alterStatementSuffixFileFormat2586 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_fileFormat_in_alterStatementSuffixFileFormat2588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2646 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_CLUSTERED_in_alterStatementSuffixClusterbySortby2648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixClusterbySortby2662 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_SORTED_in_alterStatementSuffixClusterbySortby2664 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableBuckets_in_alterStatementSuffixClusterbySortby2678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterTblPartitionStatementSuffixSkewedLocation2709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KW_SKEWED_in_alterTblPartitionStatementSuffixSkewedLocation2711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_LOCATION_in_alterTblPartitionStatementSuffixSkewedLocation2713 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_skewedLocations_in_alterTblPartitionStatementSuffixSkewedLocation2715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_skewedLocations2756 = new BitSet(new long[]{0x0000000002001000L,0x0000000206000000L,0x0000000000020000L,0x0000020000000000L,0x0000000000000000L,0x0000801800000000L,0x0001013040000000L});
    public static final BitSet FOLLOW_skewedLocationsList_in_skewedLocations2758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_skewedLocations2760 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_skewedLocationMap_in_skewedLocationsList2801 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_skewedLocationsList2804 = new BitSet(new long[]{0x0000000002001000L,0x0000000206000000L,0x0000000000020000L,0x0000020000000000L,0x0000000000000000L,0x0000801800000000L,0x0001013040000000L});
    public static final BitSet FOLLOW_skewedLocationMap_in_skewedLocationsList2806 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_skewedValueLocationElement_in_skewedLocationMap2852 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_EQUAL_in_skewedLocationMap2854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_skewedLocationMap2858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixLocation2896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_KW_LOCATION_in_alterStatementSuffixLocation2898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixLocation2902 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSkewed_in_alterStatementSuffixSkewedby2961 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_KW_SKEWED_in_alterStatementSuffixSkewedby2978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_NOT_in_alterStatementSuffixSkewedby2991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_storedAsDirs_in_alterStatementSuffixSkewedby2993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXCHANGE_in_alterStatementSuffixExchangePartition3024 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixExchangePartition3026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_alterStatementSuffixExchangePartition3028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_TABLE_in_alterStatementSuffixExchangePartition3030 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableName_in_alterStatementSuffixExchangePartition3034 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RENAME_in_alterStatementSuffixRenamePart3076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterStatementSuffixRenamePart3078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_partitionSpec_in_alterStatementSuffixRenamePart3080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UPDATE_in_alterStatementSuffixStatsPart3118 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KW_STATISTICS_in_alterStatementSuffixStatsPart3120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000008000000L});
    public static final BitSet FOLLOW_KW_FOR_in_alterStatementSuffixStatsPart3122 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DFDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_COLUMN_in_alterStatementSuffixStatsPart3124 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixStatsPart3129 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixStatsPart3131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixStatsPart3133 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000100L});
    public static final BitSet FOLLOW_KW_COMMENT_in_alterStatementSuffixStatsPart3136 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixStatsPart3140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONCATENATE_in_alterStatementSuffixMergeFiles3188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INTO_in_alterStatementSuffixBucketNum3251 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_alterStatementSuffixBucketNum3255 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_KW_BUCKETS_in_alterStatementSuffixBucketNum3257 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_AND_in_blocking3313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_KW_WAIT_in_blocking3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_POOL_in_compactPool3334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_compactPool3338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_COMPACT_in_alterStatementSuffixCompact3374 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixCompact3378 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000008L,0x0000000000000000L,0x0010000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_tableImplBuckets_in_alterStatementSuffixCompact3380 = new BitSet(new long[]{0x0000001000000002L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_blocking_in_alterStatementSuffixCompact3383 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000040L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_compactPool_in_alterStatementSuffixCompact3386 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_WITH_in_alterStatementSuffixCompact3390 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_OVERWRITE_in_alterStatementSuffixCompact3392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_KW_TBLPROPERTIES_in_alterStatementSuffixCompact3394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_tableProperties_in_alterStatementSuffixCompact3396 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_alterStatementSuffixCompact3400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSetOwner3456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_OWNER_in_alterStatementSuffixSetOwner3458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_principalName_in_alterStatementSuffixSetOwner3460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_in_alterStatementSuffixSetPartSpec3499 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_PARTITION_in_alterStatementSuffixSetPartSpec3501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_KW_SPEC_in_alterStatementSuffixSetPartSpec3503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixSetPartSpec3505 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE574EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_partitionTransformSpec_in_alterStatementSuffixSetPartSpec3512 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixSetPartSpec3515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CONVERT_in_alterStatementSuffixConvert3555 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterStatementSuffixConvert3557 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixConvert3561 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000020000000L});
    public static final BitSet FOLLOW_tablePropertiesPrefixed_in_alterStatementSuffixConvert3563 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_ROLLBACK_in_alterStatementSuffixExecute3609 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixExecute3611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001001000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3617 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_Number_in_alterStatementSuffixExecute3621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixExecute3625 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3650 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixExecute3653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixExecute3661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SET_CURRENT_SNAPSHOT_in_alterStatementSuffixExecute3689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixExecute3691 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_alterStatementSuffixExecute3696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixExecute3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_KW_FAST_FORWARD_in_alterStatementSuffixExecute3724 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3733 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3762 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CHERRY_PICK_in_alterStatementSuffixExecute3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_alterStatementSuffixExecute3768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3793 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_KW_BETWEEN_in_alterStatementSuffixExecute3795 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3800 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_KW_AND_in_alterStatementSuffixExecute3803 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3808 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_KW_EXPIRE_SNAPSHOTS_in_alterStatementSuffixExecute3837 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_KW_RETAIN_in_alterStatementSuffixExecute3839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_LAST_in_alterStatementSuffixExecute3841 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_alterStatementSuffixExecute3845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_EXECUTE_in_alterStatementSuffixExecute3870 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
    public static final BitSet FOLLOW_KW_DELETE_in_alterStatementSuffixExecute3872 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_KW_ORPHAN_FILES_in_alterStatementSuffixExecute3874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_OLDER_in_alterStatementSuffixExecute3877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000100000000L});
    public static final BitSet FOLLOW_KW_THAN_in_alterStatementSuffixExecute3879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_alterStatementSuffixExecute3881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterStatementSuffixExecute3886 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_alterStatementSuffixExecute3889 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RENAME_in_alterStatementSuffixRenameBranch3934 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BRANCH_in_alterStatementSuffixRenameBranch3936 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixRenameBranch3940 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000004000000000L});
    public static final BitSet FOLLOW_KW_TO_in_alterStatementSuffixRenameBranch3942 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixRenameBranch3946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_REPLACE_in_alterStatementSuffixReplaceBranch3989 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BRANCH_in_alterStatementSuffixReplaceBranch3991 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixReplaceBranch3995 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KW_AS_in_alterStatementSuffixReplaceBranch3997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_alterStatementSuffixReplaceBranch3999 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_SYSTEM_VERSION_in_alterStatementSuffixReplaceBranch4003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_alterStatementSuffixReplaceBranch4007 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_KW_BRANCH_in_alterStatementSuffixReplaceBranch4013 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixReplaceBranch4017 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_refRetain_in_alterStatementSuffixReplaceBranch4021 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_retentionOfSnapshots_in_alterStatementSuffixReplaceBranch4024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_REPLACE_in_alterStatementSuffixReplaceTag4085 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_TAG_in_alterStatementSuffixReplaceTag4087 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Identifier_in_alterStatementSuffixReplaceTag4091 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KW_AS_in_alterStatementSuffixReplaceTag4093 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_alterStatementSuffixReplaceTag4095 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_SYSTEM_VERSION_in_alterStatementSuffixReplaceTag4097 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_alterStatementSuffixReplaceTag4101 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_refRetain_in_alterStatementSuffixReplaceTag4103 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_alterStatementSuffixDropBranch4152 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BRANCH_in_alterStatementSuffixDropBranch4154 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifExists_in_alterStatementSuffixDropBranch4156 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixDropBranch4161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_alterStatementSuffixCreateBranch4204 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BRANCH_in_alterStatementSuffixCreateBranch4206 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifNotExists_in_alterStatementSuffixCreateBranch4208 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixCreateBranch4213 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateBranch4215 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_refRetain_in_alterStatementSuffixCreateBranch4218 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_retentionOfSnapshots_in_alterStatementSuffixCreateBranch4221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_alterStatementSuffixCreateBranch4255 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_OR_in_alterStatementSuffixCreateBranch4257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_REPLACE_in_alterStatementSuffixCreateBranch4259 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_KW_BRANCH_in_alterStatementSuffixCreateBranch4261 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixCreateBranch4265 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateBranch4267 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_refRetain_in_alterStatementSuffixCreateBranch4270 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_retentionOfSnapshots_in_alterStatementSuffixCreateBranch4273 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_snapshotIdOfRef4325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_SYSTEM_VERSION_in_snapshotIdOfRef4327 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KW_AS_in_snapshotIdOfRef4329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_snapshotIdOfRef4331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_snapshotIdOfRef4335 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_snapshotIdOfRef4361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KW_SYSTEM_TIME_in_snapshotIdOfRef4363 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KW_AS_in_snapshotIdOfRef4365 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_snapshotIdOfRef4367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_snapshotIdOfRef4371 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_snapshotIdOfRef4398 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_TAG_in_snapshotIdOfRef4400 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KW_AS_in_snapshotIdOfRef4402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_snapshotIdOfRef4404 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_snapshotIdOfRef4408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RETAIN_in_refRetain4449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_refRetain4453 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000010000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_timeUnitQualifiers_in_refRetain4457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WITH_in_retentionOfSnapshots4501 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_KW_SNAPSHOT_in_retentionOfSnapshots4503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000040000000000L});
    public static final BitSet FOLLOW_KW_RETENTION_in_retentionOfSnapshots4505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_retentionOfSnapshots4509 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_KW_SNAPSHOTS_in_retentionOfSnapshots4511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_retentionOfSnapshots4516 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L,0x0000010000000000L,0x0000000080000000L});
    public static final BitSet FOLLOW_timeUnitQualifiers_in_retentionOfSnapshots4520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DROP_in_alterStatementSuffixDropTag4572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_TAG_in_alterStatementSuffixDropTag4574 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifExists_in_alterStatementSuffixDropTag4576 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixDropTag4581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_alterStatementSuffixCreateTag4624 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_TAG_in_alterStatementSuffixCreateTag4626 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECF08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_ifNotExists_in_alterStatementSuffixCreateTag4628 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixCreateTag4633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateTag4635 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_refRetain_in_alterStatementSuffixCreateTag4638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_alterStatementSuffixCreateOrReplaceTag4689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_OR_in_alterStatementSuffixCreateOrReplaceTag4691 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_REPLACE_in_alterStatementSuffixCreateOrReplaceTag4693 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_TAG_in_alterStatementSuffixCreateOrReplaceTag4695 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_alterStatementSuffixCreateOrReplaceTag4699 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000008000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_snapshotIdOfRef_in_alterStatementSuffixCreateOrReplaceTag4701 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000020000000000L});
    public static final BitSet FOLLOW_refRetain_in_alterStatementSuffixCreateOrReplaceTag4704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INPUTFORMAT_in_fileFormat4755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_fileFormat4759 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0200000000000000L});
    public static final BitSet FOLLOW_KW_OUTPUTFORMAT_in_fileFormat4761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_fileFormat4765 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_SERDE_in_fileFormat4767 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_fileFormat4771 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0004000000000000L});
    public static final BitSet FOLLOW_KW_INPUTDRIVER_in_fileFormat4774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_fileFormat4778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0100000000000000L});
    public static final BitSet FOLLOW_KW_OUTPUTDRIVER_in_fileFormat4780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_fileFormat4784 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_fileFormat4825 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterDataConnectorSuffixProperties_in_alterDataConnectorStatementSuffix4861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterDataConnectorSuffixSetOwner_in_alterDataConnectorStatementSuffix4869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterDataConnectorSuffixSetUrl_in_alterDataConnectorStatementSuffix4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDataConnectorSuffixProperties4906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDataConnectorSuffixProperties4908 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
    public static final BitSet FOLLOW_KW_DCPROPERTIES_in_alterDataConnectorSuffixProperties4910 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_dcProperties_in_alterDataConnectorSuffixProperties4912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDataConnectorSuffixSetOwner4956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDataConnectorSuffixSetOwner4958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x1000000000000000L});
    public static final BitSet FOLLOW_KW_OWNER_in_alterDataConnectorSuffixSetOwner4960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000002000000000L,0x0000000000000000L,0x0000800000000000L,0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_principalName_in_alterDataConnectorSuffixSetOwner4962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_alterDataConnectorSuffixSetUrl5006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x8000000000000000L});
    public static final BitSet FOLLOW_KW_SET_in_alterDataConnectorSuffixSetUrl5008 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_KW_URL_in_alterDataConnectorSuffixSetUrl5010 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0001000000000000L});
    public static final BitSet FOLLOW_StringLiteral_in_alterDataConnectorSuffixSetUrl5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_alterStatementSuffixRename_in_synpred1_AlterClauseParser220 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CREATE_in_synpred2_AlterClauseParser376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0008000000000000L});
    public static final BitSet FOLLOW_KW_OR_in_synpred2_AlterClauseParser378 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_KW_REPLACE_in_synpred2_AlterClauseParser380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000010000000L});
    public static final BitSet FOLLOW_KW_TAG_in_synpred2_AlterClauseParser382 = new BitSet(new long[]{0x0000000000000002L});

}