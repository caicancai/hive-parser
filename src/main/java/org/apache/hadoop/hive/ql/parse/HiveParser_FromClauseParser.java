// $ANTLR 3.4 FromClauseParser.g 2024-07-25 22:38:44

package org.apache.hadoop.hive.ql.parse;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;


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
public class HiveParser_FromClauseParser extends Parser {
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


    public HiveParser_FromClauseParser(TokenStream input, HiveParser gHiveParser) {
        this(input, new RecognizerSharedState(), gHiveParser);
    }
    public HiveParser_FromClauseParser(TokenStream input, RecognizerSharedState state, HiveParser gHiveParser) {
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
    public String getGrammarFileName() { return "FromClauseParser.g"; }


      public List<Pair<String, String>> tables = new ArrayList<Pair<String, String>>();

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


    public static class tableAllColumns_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableAllColumns"
    // FromClauseParser.g:50:1: tableAllColumns : ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) );
    public final HiveParser_FromClauseParser.tableAllColumns_return tableAllColumns() throws RecognitionException {
        HiveParser_FromClauseParser.tableAllColumns_return retval = new HiveParser_FromClauseParser.tableAllColumns_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token STAR1=null;
        Token DOT3=null;
        Token STAR4=null;
        HiveParser_FromClauseParser.tableName_return tableName2 =null;


        ASTNode STAR1_tree=null;
        ASTNode DOT3_tree=null;
        ASTNode STAR4_tree=null;
        RewriteRuleTokenStream stream_STAR=new RewriteRuleTokenStream(adaptor,"token STAR");
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
        try {
            // FromClauseParser.g:51:5: ( STAR -> ^( TOK_ALLCOLREF ) | tableName DOT STAR -> ^( TOK_ALLCOLREF tableName ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==STAR) ) {
                alt1=1;
            }
            else if ( (LA1_0==Identifier||(LA1_0 >= KW_ABORT && LA1_0 <= KW_AFTER)||LA1_0==KW_ALLOC_FRACTION||LA1_0==KW_ANALYZE||LA1_0==KW_ARCHIVE||(LA1_0 >= KW_ASC && LA1_0 <= KW_AT)||(LA1_0 >= KW_AUTOCOMMIT && LA1_0 <= KW_BEFORE)||(LA1_0 >= KW_BRANCH && LA1_0 <= KW_BUCKETS)||(LA1_0 >= KW_CACHE && LA1_0 <= KW_CASCADE)||(LA1_0 >= KW_CBO && LA1_0 <= KW_CHANGE)||LA1_0==KW_CHECK||(LA1_0 >= KW_CLUSTER && LA1_0 <= KW_COLLECTION)||(LA1_0 >= KW_COLUMNS && LA1_0 <= KW_COMMENT)||(LA1_0 >= KW_COMPACT && LA1_0 <= KW_COMPACTIONS)||(LA1_0 >= KW_COMPUTE && LA1_0 <= KW_CONCATENATE)||LA1_0==KW_CONTINUE||LA1_0==KW_COST||LA1_0==KW_CRON||LA1_0==KW_DATA||LA1_0==KW_DATABASES||(LA1_0 >= KW_DATETIME && LA1_0 <= KW_DCPROPERTIES)||LA1_0==KW_DEBUG||(LA1_0 >= KW_DEFAULT && LA1_0 <= KW_DEFINED)||(LA1_0 >= KW_DELIMITED && LA1_0 <= KW_DESC)||(LA1_0 >= KW_DETAIL && LA1_0 <= KW_DISABLE)||(LA1_0 >= KW_DISTRIBUTE && LA1_0 <= KW_DO)||LA1_0==KW_DOW||(LA1_0 >= KW_DUMP && LA1_0 <= KW_ELEM_TYPE)||LA1_0==KW_ENABLE||(LA1_0 >= KW_ENFORCED && LA1_0 <= KW_EVERY)||(LA1_0 >= KW_EXCLUSIVE && LA1_0 <= KW_EXECUTED)||(LA1_0 >= KW_EXPIRE_SNAPSHOTS && LA1_0 <= KW_EXPRESSION)||LA1_0==KW_FAST_FORWARD||(LA1_0 >= KW_FIELDS && LA1_0 <= KW_FIRST)||(LA1_0 >= KW_FORMAT && LA1_0 <= KW_FORMATTED)||LA1_0==KW_FUNCTIONS||(LA1_0 >= KW_HOUR && LA1_0 <= KW_IDXPROPERTIES)||LA1_0==KW_IGNORE||(LA1_0 >= KW_INDEX && LA1_0 <= KW_INDEXES)||(LA1_0 >= KW_INPATH && LA1_0 <= KW_INPUTFORMAT)||(LA1_0 >= KW_ISOLATION && LA1_0 <= KW_JAR)||(LA1_0 >= KW_JOINCOST && LA1_0 <= KW_LAST)||LA1_0==KW_LEVEL||(LA1_0 >= KW_LIMIT && LA1_0 <= KW_LOAD)||(LA1_0 >= KW_LOCATION && LA1_0 <= KW_LONG)||(LA1_0 >= KW_MANAGED && LA1_0 <= KW_MANAGEMENT)||(LA1_0 >= KW_MAPJOIN && LA1_0 <= KW_MATERIALIZED)||LA1_0==KW_METADATA||(LA1_0 >= KW_MINUTE && LA1_0 <= KW_MONTH)||(LA1_0 >= KW_MOVE && LA1_0 <= KW_MSCK)||(LA1_0 >= KW_NORELY && LA1_0 <= KW_NOSCAN)||LA1_0==KW_NOVALIDATE||LA1_0==KW_NULLS||LA1_0==KW_OFFSET||(LA1_0 >= KW_OPERATOR && LA1_0 <= KW_OPTION)||(LA1_0 >= KW_OUTPUTDRIVER && LA1_0 <= KW_OUTPUTFORMAT)||(LA1_0 >= KW_OVERWRITE && LA1_0 <= KW_OWNER)||(LA1_0 >= KW_PARTITIONED && LA1_0 <= KW_PATH)||(LA1_0 >= KW_PLAN && LA1_0 <= KW_POOL)||LA1_0==KW_PRINCIPALS||LA1_0==KW_PURGE||(LA1_0 >= KW_QUARTER && LA1_0 <= KW_QUERY_PARALLELISM)||LA1_0==KW_READ||(LA1_0 >= KW_REBUILD && LA1_0 <= KW_RECORDWRITER)||(LA1_0 >= KW_RELOAD && LA1_0 <= KW_RETENTION)||LA1_0==KW_REWRITE||(LA1_0 >= KW_ROLE && LA1_0 <= KW_ROLES)||(LA1_0 >= KW_SCHEDULED && LA1_0 <= KW_SECOND)||(LA1_0 >= KW_SEMI && LA1_0 <= KW_SERVER)||(LA1_0 >= KW_SETS && LA1_0 <= KW_SKEWED)||(LA1_0 >= KW_SNAPSHOT && LA1_0 <= KW_SNAPSHOTS)||(LA1_0 >= KW_SORT && LA1_0 <= KW_SSL)||(LA1_0 >= KW_STATISTICS && LA1_0 <= KW_SUMMARY)||(LA1_0 >= KW_SYSTEM_TIME && LA1_0 <= KW_SYSTEM_VERSION)||LA1_0==KW_TABLES||(LA1_0 >= KW_TAG && LA1_0 <= KW_TERMINATED)||LA1_0==KW_TINYINT||LA1_0==KW_TOUCH||(LA1_0 >= KW_TRANSACTION && LA1_0 <= KW_TRANSACTIONS)||LA1_0==KW_TRIM||(LA1_0 >= KW_TYPE && LA1_0 <= KW_UNARCHIVE)||LA1_0==KW_UNDO||LA1_0==KW_UNIONTYPE||(LA1_0 >= KW_UNKNOWN && LA1_0 <= KW_UNSIGNED)||(LA1_0 >= KW_URI && LA1_0 <= KW_USE)||(LA1_0 >= KW_UTC && LA1_0 <= KW_VALIDATE)||LA1_0==KW_VALUE_TYPE||(LA1_0 >= KW_VECTORIZATION && LA1_0 <= KW_WEEK)||LA1_0==KW_WHILE||(LA1_0 >= KW_WITHIN && LA1_0 <= KW_ZONE)||LA1_0==KW_BATCH||LA1_0==KW_DAYOFWEEK||LA1_0==KW_HOLD_DDLTIME||LA1_0==KW_NO_DROP||LA1_0==KW_OFFLINE||LA1_0==KW_PROTECTION||LA1_0==KW_READONLY||LA1_0==KW_TIMESTAMPTZ) ) {
                alt1=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // FromClauseParser.g:51:7: STAR
                    {
                    STAR1=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns57); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR1);


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
                    // 52:9: -> ^( TOK_ALLCOLREF )
                    {
                        // FromClauseParser.g:52:12: ^( TOK_ALLCOLREF )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF")
                        , root_1);

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:53:7: tableName DOT STAR
                    {
                    pushFollow(FOLLOW_tableName_in_tableAllColumns79);
                    tableName2=tableName();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableName.add(tableName2.getTree());

                    DOT3=(Token)match(input,DOT,FOLLOW_DOT_in_tableAllColumns81); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT3);


                    STAR4=(Token)match(input,STAR,FOLLOW_STAR_in_tableAllColumns83); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_STAR.add(STAR4);


                    // AST REWRITE
                    // elements: tableName
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 54:9: -> ^( TOK_ALLCOLREF tableName )
                    {
                        // FromClauseParser.g:54:12: ^( TOK_ALLCOLREF tableName )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_ALLCOLREF, "TOK_ALLCOLREF")
                        , root_1);

                        adaptor.addChild(root_1, stream_tableName.nextTree());

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
    // $ANTLR end "tableAllColumns"


    public static class tableOrColumn_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableOrColumn"
    // FromClauseParser.g:58:1: tableOrColumn : identifier -> ^( TOK_TABLE_OR_COL identifier ) ;
    public final HiveParser_FromClauseParser.tableOrColumn_return tableOrColumn() throws RecognitionException {
        HiveParser_FromClauseParser.tableOrColumn_return retval = new HiveParser_FromClauseParser.tableOrColumn_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier5 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("table or column identifier", state); 
        try {
            // FromClauseParser.g:61:5: ( identifier -> ^( TOK_TABLE_OR_COL identifier ) )
            // FromClauseParser.g:62:5: identifier
            {
            pushFollow(FOLLOW_identifier_in_tableOrColumn131);
            identifier5=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier5.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 62:16: -> ^( TOK_TABLE_OR_COL identifier )
            {
                // FromClauseParser.g:62:19: ^( TOK_TABLE_OR_COL identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

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
    // $ANTLR end "tableOrColumn"


    public static class defaultValue_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultValue"
    // FromClauseParser.g:65:1: defaultValue : KW_DEFAULT -> ^( TOK_TABLE_OR_COL TOK_DEFAULT_VALUE ) ;
    public final HiveParser_FromClauseParser.defaultValue_return defaultValue() throws RecognitionException {
        HiveParser_FromClauseParser.defaultValue_return retval = new HiveParser_FromClauseParser.defaultValue_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_DEFAULT6=null;

        ASTNode KW_DEFAULT6_tree=null;
        RewriteRuleTokenStream stream_KW_DEFAULT=new RewriteRuleTokenStream(adaptor,"token KW_DEFAULT");

         gParent.pushMsg("default value", state); 
        try {
            // FromClauseParser.g:68:5: ( KW_DEFAULT -> ^( TOK_TABLE_OR_COL TOK_DEFAULT_VALUE ) )
            // FromClauseParser.g:69:5: KW_DEFAULT
            {
            KW_DEFAULT6=(Token)match(input,KW_DEFAULT,FOLLOW_KW_DEFAULT_in_defaultValue170); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_DEFAULT.add(KW_DEFAULT6);


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
            // 69:16: -> ^( TOK_TABLE_OR_COL TOK_DEFAULT_VALUE )
            {
                // FromClauseParser.g:69:19: ^( TOK_TABLE_OR_COL TOK_DEFAULT_VALUE )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABLE_OR_COL, "TOK_TABLE_OR_COL")
                , root_1);

                adaptor.addChild(root_1, 
                (ASTNode)adaptor.create(TOK_DEFAULT_VALUE, "TOK_DEFAULT_VALUE")
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
    // $ANTLR end "defaultValue"


    public static class expressionList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // FromClauseParser.g:72:1: expressionList : expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) ;
    public final HiveParser_FromClauseParser.expressionList_return expressionList() throws RecognitionException {
        HiveParser_FromClauseParser.expressionList_return retval = new HiveParser_FromClauseParser.expressionList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA8=null;
        HiveParser_IdentifiersParser.expression_return expression7 =null;

        HiveParser_IdentifiersParser.expression_return expression9 =null;


        ASTNode COMMA8_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("expression list", state); 
        try {
            // FromClauseParser.g:75:5: ( expression ( COMMA expression )* -> ^( TOK_EXPLIST ( expression )+ ) )
            // FromClauseParser.g:76:5: expression ( COMMA expression )*
            {
            pushFollow(FOLLOW_expression_in_expressionList209);
            expression7=gHiveParser.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_expression.add(expression7.getTree());

            // FromClauseParser.g:76:16: ( COMMA expression )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==COMMA) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // FromClauseParser.g:76:17: COMMA expression
            	    {
            	    COMMA8=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList212); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA8);


            	    pushFollow(FOLLOW_expression_in_expressionList214);
            	    expression9=gHiveParser.expression();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_expression.add(expression9.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            // AST REWRITE
            // elements: expression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 76:36: -> ^( TOK_EXPLIST ( expression )+ )
            {
                // FromClauseParser.g:76:39: ^( TOK_EXPLIST ( expression )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_EXPLIST, "TOK_EXPLIST")
                , root_1);

                if ( !(stream_expression.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "expressionList"


    public static class aliasList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aliasList"
    // FromClauseParser.g:79:1: aliasList : identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) ;
    public final HiveParser_FromClauseParser.aliasList_return aliasList() throws RecognitionException {
        HiveParser_FromClauseParser.aliasList_return retval = new HiveParser_FromClauseParser.aliasList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA11=null;
        HiveParser_IdentifiersParser.identifier_return identifier10 =null;

        HiveParser_IdentifiersParser.identifier_return identifier12 =null;


        ASTNode COMMA11_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("alias list", state); 
        try {
            // FromClauseParser.g:82:5: ( identifier ( COMMA identifier )* -> ^( TOK_ALIASLIST ( identifier )+ ) )
            // FromClauseParser.g:83:5: identifier ( COMMA identifier )*
            {
            pushFollow(FOLLOW_identifier_in_aliasList256);
            identifier10=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier10.getTree());

            // FromClauseParser.g:83:16: ( COMMA identifier )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==COMMA) ) {
                    int LA3_21 = input.LA(2);

                    if ( (LA3_21==Identifier||(LA3_21 >= KW_ABORT && LA3_21 <= KW_AFTER)||LA3_21==KW_ALLOC_FRACTION||LA3_21==KW_ANALYZE||LA3_21==KW_ARCHIVE||(LA3_21 >= KW_ASC && LA3_21 <= KW_AT)||(LA3_21 >= KW_AUTOCOMMIT && LA3_21 <= KW_BEFORE)||(LA3_21 >= KW_BRANCH && LA3_21 <= KW_BUCKETS)||(LA3_21 >= KW_CACHE && LA3_21 <= KW_CASCADE)||(LA3_21 >= KW_CBO && LA3_21 <= KW_CHANGE)||LA3_21==KW_CHECK||(LA3_21 >= KW_CLUSTER && LA3_21 <= KW_COLLECTION)||(LA3_21 >= KW_COLUMNS && LA3_21 <= KW_COMMENT)||(LA3_21 >= KW_COMPACT && LA3_21 <= KW_COMPACTIONS)||(LA3_21 >= KW_COMPUTE && LA3_21 <= KW_CONCATENATE)||LA3_21==KW_CONTINUE||LA3_21==KW_COST||LA3_21==KW_CRON||LA3_21==KW_DATA||LA3_21==KW_DATABASES||(LA3_21 >= KW_DATETIME && LA3_21 <= KW_DCPROPERTIES)||LA3_21==KW_DEBUG||(LA3_21 >= KW_DEFAULT && LA3_21 <= KW_DEFINED)||(LA3_21 >= KW_DELIMITED && LA3_21 <= KW_DESC)||(LA3_21 >= KW_DETAIL && LA3_21 <= KW_DISABLE)||(LA3_21 >= KW_DISTRIBUTE && LA3_21 <= KW_DO)||LA3_21==KW_DOW||(LA3_21 >= KW_DUMP && LA3_21 <= KW_ELEM_TYPE)||LA3_21==KW_ENABLE||(LA3_21 >= KW_ENFORCED && LA3_21 <= KW_EVERY)||(LA3_21 >= KW_EXCLUSIVE && LA3_21 <= KW_EXECUTED)||(LA3_21 >= KW_EXPIRE_SNAPSHOTS && LA3_21 <= KW_EXPRESSION)||LA3_21==KW_FAST_FORWARD||(LA3_21 >= KW_FIELDS && LA3_21 <= KW_FIRST)||(LA3_21 >= KW_FORMAT && LA3_21 <= KW_FORMATTED)||LA3_21==KW_FUNCTIONS||(LA3_21 >= KW_HOUR && LA3_21 <= KW_IDXPROPERTIES)||LA3_21==KW_IGNORE||(LA3_21 >= KW_INDEX && LA3_21 <= KW_INDEXES)||(LA3_21 >= KW_INPATH && LA3_21 <= KW_INPUTFORMAT)||(LA3_21 >= KW_ISOLATION && LA3_21 <= KW_JAR)||(LA3_21 >= KW_JOINCOST && LA3_21 <= KW_LAST)||LA3_21==KW_LEVEL||(LA3_21 >= KW_LIMIT && LA3_21 <= KW_LOAD)||(LA3_21 >= KW_LOCATION && LA3_21 <= KW_LONG)||(LA3_21 >= KW_MANAGED && LA3_21 <= KW_MANAGEMENT)||(LA3_21 >= KW_MAPJOIN && LA3_21 <= KW_MATERIALIZED)||LA3_21==KW_METADATA||(LA3_21 >= KW_MINUTE && LA3_21 <= KW_MONTH)||(LA3_21 >= KW_MOVE && LA3_21 <= KW_MSCK)||(LA3_21 >= KW_NORELY && LA3_21 <= KW_NOSCAN)||LA3_21==KW_NOVALIDATE||LA3_21==KW_NULLS||LA3_21==KW_OFFSET||(LA3_21 >= KW_OPERATOR && LA3_21 <= KW_OPTION)||(LA3_21 >= KW_OUTPUTDRIVER && LA3_21 <= KW_OUTPUTFORMAT)||(LA3_21 >= KW_OVERWRITE && LA3_21 <= KW_OWNER)||(LA3_21 >= KW_PARTITIONED && LA3_21 <= KW_PATH)||(LA3_21 >= KW_PLAN && LA3_21 <= KW_POOL)||LA3_21==KW_PRINCIPALS||LA3_21==KW_PURGE||(LA3_21 >= KW_QUARTER && LA3_21 <= KW_QUERY_PARALLELISM)||LA3_21==KW_READ||(LA3_21 >= KW_REBUILD && LA3_21 <= KW_RECORDWRITER)||(LA3_21 >= KW_RELOAD && LA3_21 <= KW_RETENTION)||LA3_21==KW_REWRITE||(LA3_21 >= KW_ROLE && LA3_21 <= KW_ROLES)||(LA3_21 >= KW_SCHEDULED && LA3_21 <= KW_SECOND)||(LA3_21 >= KW_SEMI && LA3_21 <= KW_SERVER)||(LA3_21 >= KW_SETS && LA3_21 <= KW_SKEWED)||(LA3_21 >= KW_SNAPSHOT && LA3_21 <= KW_SNAPSHOTS)||(LA3_21 >= KW_SORT && LA3_21 <= KW_SSL)||(LA3_21 >= KW_STATISTICS && LA3_21 <= KW_SUMMARY)||(LA3_21 >= KW_SYSTEM_TIME && LA3_21 <= KW_SYSTEM_VERSION)||LA3_21==KW_TABLES||(LA3_21 >= KW_TAG && LA3_21 <= KW_TERMINATED)||LA3_21==KW_TINYINT||LA3_21==KW_TOUCH||(LA3_21 >= KW_TRANSACTION && LA3_21 <= KW_TRANSACTIONS)||LA3_21==KW_TRIM||(LA3_21 >= KW_TYPE && LA3_21 <= KW_UNARCHIVE)||LA3_21==KW_UNDO||LA3_21==KW_UNIONTYPE||(LA3_21 >= KW_UNKNOWN && LA3_21 <= KW_UNSIGNED)||(LA3_21 >= KW_URI && LA3_21 <= KW_USE)||(LA3_21 >= KW_UTC && LA3_21 <= KW_VALIDATE)||LA3_21==KW_VALUE_TYPE||(LA3_21 >= KW_VECTORIZATION && LA3_21 <= KW_WEEK)||LA3_21==KW_WHILE||(LA3_21 >= KW_WITHIN && LA3_21 <= KW_ZONE)||LA3_21==KW_BATCH||LA3_21==KW_DAYOFWEEK||LA3_21==KW_HOLD_DDLTIME||LA3_21==KW_NO_DROP||LA3_21==KW_OFFLINE||LA3_21==KW_PROTECTION||LA3_21==KW_READONLY||LA3_21==KW_TIMESTAMPTZ) ) {
                        alt3=1;
                    }


                }


                switch (alt3) {
            	case 1 :
            	    // FromClauseParser.g:83:17: COMMA identifier
            	    {
            	    COMMA11=(Token)match(input,COMMA,FOLLOW_COMMA_in_aliasList259); if (state.failed) return retval; 
            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA11);


            	    pushFollow(FOLLOW_identifier_in_aliasList261);
            	    identifier12=gHiveParser.identifier();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) stream_identifier.add(identifier12.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 83:36: -> ^( TOK_ALIASLIST ( identifier )+ )
            {
                // FromClauseParser.g:83:39: ^( TOK_ALIASLIST ( identifier )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_ALIASLIST, "TOK_ALIASLIST")
                , root_1);

                if ( !(stream_identifier.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_1, stream_identifier.nextTree());

                }
                stream_identifier.reset();

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
    // $ANTLR end "aliasList"


    public static class fromClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromClause"
    // FromClauseParser.g:88:1: fromClause : KW_FROM fromSource -> ^( TOK_FROM fromSource ) ;
    public final HiveParser_FromClauseParser.fromClause_return fromClause() throws RecognitionException {
        HiveParser_FromClauseParser.fromClause_return retval = new HiveParser_FromClauseParser.fromClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_FROM13=null;
        HiveParser_FromClauseParser.fromSource_return fromSource14 =null;


        ASTNode KW_FROM13_tree=null;
        RewriteRuleTokenStream stream_KW_FROM=new RewriteRuleTokenStream(adaptor,"token KW_FROM");
        RewriteRuleSubtreeStream stream_fromSource=new RewriteRuleSubtreeStream(adaptor,"rule fromSource");
         gParent.pushMsg("from clause", state); 
        try {
            // FromClauseParser.g:91:5: ( KW_FROM fromSource -> ^( TOK_FROM fromSource ) )
            // FromClauseParser.g:92:5: KW_FROM fromSource
            {
            KW_FROM13=(Token)match(input,KW_FROM,FOLLOW_KW_FROM_in_fromClause305); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_FROM.add(KW_FROM13);


            pushFollow(FOLLOW_fromSource_in_fromClause307);
            fromSource14=fromSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_fromSource.add(fromSource14.getTree());

            // AST REWRITE
            // elements: fromSource
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 92:24: -> ^( TOK_FROM fromSource )
            {
                // FromClauseParser.g:92:27: ^( TOK_FROM fromSource )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_FROM, "TOK_FROM")
                , root_1);

                adaptor.addChild(root_1, stream_fromSource.nextTree());

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
    // $ANTLR end "fromClause"


    public static class fromSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "fromSource"
    // FromClauseParser.g:95:1: fromSource : ( uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | joinSource );
    public final HiveParser_FromClauseParser.fromSource_return fromSource() throws RecognitionException {
        HiveParser_FromClauseParser.fromSource_return retval = new HiveParser_FromClauseParser.fromSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA17=null;
        HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken15 =null;

        HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource16 =null;

        HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource18 =null;

        HiveParser_FromClauseParser.joinSource_return joinSource19 =null;


        ASTNode COMMA17_tree=null;

         gParent.pushMsg("join source", state); 
        try {
            // FromClauseParser.g:98:5: ( uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+ | joinSource )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==KW_UNIQUEJOIN) ) {
                alt5=1;
            }
            else if ( (LA5_0==Identifier||(LA5_0 >= KW_ABORT && LA5_0 <= KW_AFTER)||LA5_0==KW_ALLOC_FRACTION||LA5_0==KW_ANALYZE||LA5_0==KW_ARCHIVE||(LA5_0 >= KW_ASC && LA5_0 <= KW_AT)||(LA5_0 >= KW_AUTOCOMMIT && LA5_0 <= KW_BEFORE)||(LA5_0 >= KW_BRANCH && LA5_0 <= KW_BUCKETS)||(LA5_0 >= KW_CACHE && LA5_0 <= KW_CASCADE)||(LA5_0 >= KW_CBO && LA5_0 <= KW_CHANGE)||LA5_0==KW_CHECK||(LA5_0 >= KW_CLUSTER && LA5_0 <= KW_COLLECTION)||(LA5_0 >= KW_COLUMNS && LA5_0 <= KW_COMMENT)||(LA5_0 >= KW_COMPACT && LA5_0 <= KW_COMPACTIONS)||(LA5_0 >= KW_COMPUTE && LA5_0 <= KW_CONCATENATE)||LA5_0==KW_CONTINUE||LA5_0==KW_COST||LA5_0==KW_CRON||LA5_0==KW_DATA||LA5_0==KW_DATABASES||(LA5_0 >= KW_DATETIME && LA5_0 <= KW_DCPROPERTIES)||LA5_0==KW_DEBUG||(LA5_0 >= KW_DEFAULT && LA5_0 <= KW_DEFINED)||(LA5_0 >= KW_DELIMITED && LA5_0 <= KW_DESC)||(LA5_0 >= KW_DETAIL && LA5_0 <= KW_DISABLE)||(LA5_0 >= KW_DISTRIBUTE && LA5_0 <= KW_DO)||LA5_0==KW_DOW||(LA5_0 >= KW_DUMP && LA5_0 <= KW_ELEM_TYPE)||LA5_0==KW_ENABLE||(LA5_0 >= KW_ENFORCED && LA5_0 <= KW_EVERY)||(LA5_0 >= KW_EXCLUSIVE && LA5_0 <= KW_EXECUTED)||(LA5_0 >= KW_EXPIRE_SNAPSHOTS && LA5_0 <= KW_EXPRESSION)||LA5_0==KW_FAST_FORWARD||(LA5_0 >= KW_FIELDS && LA5_0 <= KW_FIRST)||(LA5_0 >= KW_FORMAT && LA5_0 <= KW_FORMATTED)||LA5_0==KW_FUNCTIONS||(LA5_0 >= KW_HOUR && LA5_0 <= KW_IDXPROPERTIES)||LA5_0==KW_IGNORE||(LA5_0 >= KW_INDEX && LA5_0 <= KW_INDEXES)||(LA5_0 >= KW_INPATH && LA5_0 <= KW_INPUTFORMAT)||(LA5_0 >= KW_ISOLATION && LA5_0 <= KW_JAR)||(LA5_0 >= KW_JOINCOST && LA5_0 <= KW_LAST)||LA5_0==KW_LEVEL||(LA5_0 >= KW_LIMIT && LA5_0 <= KW_LOAD)||(LA5_0 >= KW_LOCATION && LA5_0 <= KW_LONG)||(LA5_0 >= KW_MANAGED && LA5_0 <= KW_MANAGEMENT)||(LA5_0 >= KW_MAPJOIN && LA5_0 <= KW_MATERIALIZED)||LA5_0==KW_METADATA||(LA5_0 >= KW_MINUTE && LA5_0 <= KW_MONTH)||(LA5_0 >= KW_MOVE && LA5_0 <= KW_MSCK)||(LA5_0 >= KW_NORELY && LA5_0 <= KW_NOSCAN)||LA5_0==KW_NOVALIDATE||LA5_0==KW_NULLS||LA5_0==KW_OFFSET||(LA5_0 >= KW_OPERATOR && LA5_0 <= KW_OPTION)||(LA5_0 >= KW_OUTPUTDRIVER && LA5_0 <= KW_OUTPUTFORMAT)||(LA5_0 >= KW_OVERWRITE && LA5_0 <= KW_OWNER)||(LA5_0 >= KW_PARTITIONED && LA5_0 <= KW_PATH)||(LA5_0 >= KW_PLAN && LA5_0 <= KW_POOL)||LA5_0==KW_PRINCIPALS||LA5_0==KW_PURGE||(LA5_0 >= KW_QUARTER && LA5_0 <= KW_QUERY_PARALLELISM)||LA5_0==KW_READ||(LA5_0 >= KW_REBUILD && LA5_0 <= KW_RECORDWRITER)||(LA5_0 >= KW_RELOAD && LA5_0 <= KW_RETENTION)||LA5_0==KW_REWRITE||(LA5_0 >= KW_ROLE && LA5_0 <= KW_ROLES)||(LA5_0 >= KW_SCHEDULED && LA5_0 <= KW_SECOND)||(LA5_0 >= KW_SEMI && LA5_0 <= KW_SERVER)||(LA5_0 >= KW_SETS && LA5_0 <= KW_SKEWED)||(LA5_0 >= KW_SNAPSHOT && LA5_0 <= KW_SNAPSHOTS)||(LA5_0 >= KW_SORT && LA5_0 <= KW_SSL)||(LA5_0 >= KW_STATISTICS && LA5_0 <= KW_SUMMARY)||(LA5_0 >= KW_SYSTEM_TIME && LA5_0 <= KW_TABLES)||(LA5_0 >= KW_TAG && LA5_0 <= KW_TERMINATED)||LA5_0==KW_TINYINT||LA5_0==KW_TOUCH||(LA5_0 >= KW_TRANSACTION && LA5_0 <= KW_TRANSACTIONS)||LA5_0==KW_TRIM||(LA5_0 >= KW_TYPE && LA5_0 <= KW_UNARCHIVE)||LA5_0==KW_UNDO||LA5_0==KW_UNIONTYPE||(LA5_0 >= KW_UNKNOWN && LA5_0 <= KW_UNSIGNED)||(LA5_0 >= KW_URI && LA5_0 <= KW_USE)||(LA5_0 >= KW_UTC && LA5_0 <= KW_VALIDATE)||LA5_0==KW_VALUE_TYPE||(LA5_0 >= KW_VECTORIZATION && LA5_0 <= KW_WEEK)||LA5_0==KW_WHILE||(LA5_0 >= KW_WITHIN && LA5_0 <= KW_ZONE)||LA5_0==LPAREN||LA5_0==KW_BATCH||LA5_0==KW_DAYOFWEEK||LA5_0==KW_HOLD_DDLTIME||LA5_0==KW_NO_DROP||LA5_0==KW_OFFLINE||LA5_0==KW_PROTECTION||LA5_0==KW_READONLY||LA5_0==KW_TIMESTAMPTZ) ) {
                alt5=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // FromClauseParser.g:99:5: uniqueJoinToken ^ uniqueJoinSource ( COMMA ! uniqueJoinSource )+
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_uniqueJoinToken_in_fromSource346);
                    uniqueJoinToken15=uniqueJoinToken();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(uniqueJoinToken15.getTree(), root_0);

                    pushFollow(FOLLOW_uniqueJoinSource_in_fromSource349);
                    uniqueJoinSource16=uniqueJoinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource16.getTree());

                    // FromClauseParser.g:99:39: ( COMMA ! uniqueJoinSource )+
                    int cnt4=0;
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==COMMA) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // FromClauseParser.g:99:40: COMMA ! uniqueJoinSource
                    	    {
                    	    COMMA17=(Token)match(input,COMMA,FOLLOW_COMMA_in_fromSource352); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_uniqueJoinSource_in_fromSource355);
                    	    uniqueJoinSource18=uniqueJoinSource();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinSource18.getTree());

                    	    }
                    	    break;

                    	default :
                    	    if ( cnt4 >= 1 ) break loop4;
                    	    if (state.backtracking>0) {state.failed=true; return retval;}
                                EarlyExitException eee =
                                    new EarlyExitException(4, input);
                                throw eee;
                        }
                        cnt4++;
                    } while (true);


                    }
                    break;
                case 2 :
                    // FromClauseParser.g:101:5: joinSource
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_joinSource_in_fromSource369);
                    joinSource19=joinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSource19.getTree());

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
    // $ANTLR end "fromSource"


    public static class atomjoinSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atomjoinSource"
    // FromClauseParser.g:105:1: atomjoinSource : ( tableSource ( lateralView ^)* | virtualTableSource ( lateralView ^)* | ( LPAREN ( KW_WITH | KW_SELECT | KW_MAP | KW_REDUCE | KW_FROM ) )=> subQuerySource ( lateralView ^)* | ( LPAREN LPAREN selectStatement RPAREN setOperator )=> subQuerySource ( lateralView ^)* | ( LPAREN valuesSource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !);
    public final HiveParser_FromClauseParser.atomjoinSource_return atomjoinSource() throws RecognitionException {
        HiveParser_FromClauseParser.atomjoinSource_return retval = new HiveParser_FromClauseParser.atomjoinSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN32=null;
        Token RPAREN34=null;
        HiveParser_FromClauseParser.tableSource_return tableSource20 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView21 =null;

        HiveParser_FromClauseParser.virtualTableSource_return virtualTableSource22 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView23 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource24 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView25 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource26 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView27 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource28 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView29 =null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction30 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView31 =null;

        HiveParser_FromClauseParser.joinSource_return joinSource33 =null;


        ASTNode LPAREN32_tree=null;
        ASTNode RPAREN34_tree=null;

         gParent.pushMsg("joinSource", state); 
        try {
            // FromClauseParser.g:108:5: ( tableSource ( lateralView ^)* | virtualTableSource ( lateralView ^)* | ( LPAREN ( KW_WITH | KW_SELECT | KW_MAP | KW_REDUCE | KW_FROM ) )=> subQuerySource ( lateralView ^)* | ( LPAREN LPAREN selectStatement RPAREN setOperator )=> subQuerySource ( lateralView ^)* | ( LPAREN valuesSource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !)
            int alt12=7;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // FromClauseParser.g:108:8: tableSource ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_tableSource_in_atomjoinSource398);
                    tableSource20=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource20.getTree());

                    // FromClauseParser.g:108:20: ( lateralView ^)*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==COMMA) ) {
                            int LA6_3 = input.LA(2);

                            if ( (LA6_3==KW_LATERAL) ) {
                                alt6=1;
                            }


                        }
                        else if ( (LA6_0==KW_LATERAL) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // FromClauseParser.g:108:21: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource401);
                    	    lateralView21=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView21.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    }
                    break;
                case 2 :
                    // FromClauseParser.g:109:8: virtualTableSource ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_virtualTableSource_in_atomjoinSource413);
                    virtualTableSource22=virtualTableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, virtualTableSource22.getTree());

                    // FromClauseParser.g:109:27: ( lateralView ^)*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==COMMA) ) {
                            int LA7_3 = input.LA(2);

                            if ( (LA7_3==KW_LATERAL) ) {
                                alt7=1;
                            }


                        }
                        else if ( (LA7_0==KW_LATERAL) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // FromClauseParser.g:109:28: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource416);
                    	    lateralView23=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView23.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;
                case 3 :
                    // FromClauseParser.g:110:8: ( LPAREN ( KW_WITH | KW_SELECT | KW_MAP | KW_REDUCE | KW_FROM ) )=> subQuerySource ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_atomjoinSource446);
                    subQuerySource24=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource24.getTree());

                    // FromClauseParser.g:110:80: ( lateralView ^)*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==COMMA) ) {
                            int LA8_3 = input.LA(2);

                            if ( (LA8_3==KW_LATERAL) ) {
                                alt8=1;
                            }


                        }
                        else if ( (LA8_0==KW_LATERAL) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // FromClauseParser.g:110:81: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource449);
                    	    lateralView25=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView25.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;
                case 4 :
                    // FromClauseParser.g:111:8: ( LPAREN LPAREN selectStatement RPAREN setOperator )=> subQuerySource ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_atomjoinSource476);
                    subQuerySource26=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource26.getTree());

                    // FromClauseParser.g:111:78: ( lateralView ^)*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==COMMA) ) {
                            int LA9_3 = input.LA(2);

                            if ( (LA9_3==KW_LATERAL) ) {
                                alt9=1;
                            }


                        }
                        else if ( (LA9_0==KW_LATERAL) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // FromClauseParser.g:111:79: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource479);
                    	    lateralView27=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView27.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;
                case 5 :
                    // FromClauseParser.g:112:8: ( LPAREN valuesSource )=> subQuerySource ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_atomjoinSource499);
                    subQuerySource28=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource28.getTree());

                    // FromClauseParser.g:112:48: ( lateralView ^)*
                    loop10:
                    do {
                        int alt10=2;
                        int LA10_0 = input.LA(1);

                        if ( (LA10_0==COMMA) ) {
                            int LA10_3 = input.LA(2);

                            if ( (LA10_3==KW_LATERAL) ) {
                                alt10=1;
                            }


                        }
                        else if ( (LA10_0==KW_LATERAL) ) {
                            alt10=1;
                        }


                        switch (alt10) {
                    	case 1 :
                    	    // FromClauseParser.g:112:49: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource502);
                    	    lateralView29=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView29.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop10;
                        }
                    } while (true);


                    }
                    break;
                case 6 :
                    // FromClauseParser.g:113:8: partitionedTableFunction ( lateralView ^)*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_partitionedTableFunction_in_atomjoinSource514);
                    partitionedTableFunction30=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction30.getTree());

                    // FromClauseParser.g:113:33: ( lateralView ^)*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==COMMA) ) {
                            int LA11_3 = input.LA(2);

                            if ( (LA11_3==KW_LATERAL) ) {
                                alt11=1;
                            }


                        }
                        else if ( (LA11_0==KW_LATERAL) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // FromClauseParser.g:113:34: lateralView ^
                    	    {
                    	    pushFollow(FOLLOW_lateralView_in_atomjoinSource517);
                    	    lateralView31=lateralView();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView31.getTree(), root_0);

                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;
                case 7 :
                    // FromClauseParser.g:114:8: LPAREN ! joinSource RPAREN !
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    LPAREN32=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_atomjoinSource529); if (state.failed) return retval;

                    pushFollow(FOLLOW_joinSource_in_atomjoinSource532);
                    joinSource33=joinSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSource33.getTree());

                    RPAREN34=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_atomjoinSource534); if (state.failed) return retval;

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
    // $ANTLR end "atomjoinSource"


    public static class joinSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinSource"
    // FromClauseParser.g:117:1: joinSource : atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )* ;
    public final HiveParser_FromClauseParser.joinSource_return joinSource() throws RecognitionException {
        HiveParser_FromClauseParser.joinSource_return retval = new HiveParser_FromClauseParser.joinSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_ON38=null;
        Token KW_USING40=null;
        HiveParser_FromClauseParser.atomjoinSource_return atomjoinSource35 =null;

        HiveParser_FromClauseParser.joinToken_return joinToken36 =null;

        HiveParser_FromClauseParser.joinSourcePart_return joinSourcePart37 =null;

        HiveParser_IdentifiersParser.expression_return expression39 =null;

        HiveParser.columnParenthesesList_return columnParenthesesList41 =null;


        ASTNode KW_ON38_tree=null;
        ASTNode KW_USING40_tree=null;

        try {
            // FromClauseParser.g:118:5: ( atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )* )
            // FromClauseParser.g:119:5: atomjoinSource ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )*
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_atomjoinSource_in_joinSource556);
            atomjoinSource35=atomjoinSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, atomjoinSource35.getTree());

            // FromClauseParser.g:119:20: ( joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)? )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==COMMA||LA14_0==KW_CROSS||LA14_0==KW_FULL||LA14_0==KW_INNER||LA14_0==KW_JOIN||LA14_0==KW_LEFT||LA14_0==KW_RIGHT) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // FromClauseParser.g:119:21: joinToken ^ joinSourcePart ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)?
            	    {
            	    pushFollow(FOLLOW_joinToken_in_joinSource559);
            	    joinToken36=joinToken();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(joinToken36.getTree(), root_0);

            	    pushFollow(FOLLOW_joinSourcePart_in_joinSource562);
            	    joinSourcePart37=joinSourcePart();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) adaptor.addChild(root_0, joinSourcePart37.getTree());

            	    // FromClauseParser.g:119:47: ( KW_ON ! expression {...}?| KW_USING ! columnParenthesesList {...}?)?
            	    int alt13=3;
            	    int LA13_0 = input.LA(1);

            	    if ( (LA13_0==KW_ON) ) {
            	        alt13=1;
            	    }
            	    else if ( (LA13_0==KW_USING) ) {
            	        alt13=2;
            	    }
            	    switch (alt13) {
            	        case 1 :
            	            // FromClauseParser.g:119:48: KW_ON ! expression {...}?
            	            {
            	            KW_ON38=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_joinSource565); if (state.failed) return retval;

            	            pushFollow(FOLLOW_expression_in_joinSource568);
            	            expression39=gHiveParser.expression();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression39.getTree());

            	            if ( !(((joinToken36!=null?((Token)joinToken36.start):null).getType() != COMMA)) ) {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                throw new FailedPredicateException(input, "joinSource", "$joinToken.start.getType() != COMMA");
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // FromClauseParser.g:119:107: KW_USING ! columnParenthesesList {...}?
            	            {
            	            KW_USING40=(Token)match(input,KW_USING,FOLLOW_KW_USING_in_joinSource574); if (state.failed) return retval;

            	            pushFollow(FOLLOW_columnParenthesesList_in_joinSource577);
            	            columnParenthesesList41=gHiveParser.columnParenthesesList();

            	            state._fsp--;
            	            if (state.failed) return retval;
            	            if ( state.backtracking==0 ) adaptor.addChild(root_0, columnParenthesesList41.getTree());

            	            if ( !(((joinToken36!=null?((Token)joinToken36.start):null).getType() != COMMA)) ) {
            	                if (state.backtracking>0) {state.failed=true; return retval;}
            	                throw new FailedPredicateException(input, "joinSource", "$joinToken.start.getType() != COMMA");
            	            }

            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);


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
    // $ANTLR end "joinSource"


    public static class joinSourcePart_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinSourcePart"
    // FromClauseParser.g:122:1: joinSourcePart : ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)* ;
    public final HiveParser_FromClauseParser.joinSourcePart_return joinSourcePart() throws RecognitionException {
        HiveParser_FromClauseParser.joinSourcePart_return retval = new HiveParser_FromClauseParser.joinSourcePart_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.tableSource_return tableSource42 =null;

        HiveParser_FromClauseParser.virtualTableSource_return virtualTableSource43 =null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource44 =null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction45 =null;

        HiveParser_FromClauseParser.lateralView_return lateralView46 =null;



         gParent.pushMsg("joinSourcePart", state); 
        try {
            // FromClauseParser.g:125:5: ( ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)* )
            // FromClauseParser.g:126:5: ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction ) ( lateralView ^)*
            {
            root_0 = (ASTNode)adaptor.nil();


            // FromClauseParser.g:126:5: ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction )
            int alt15=4;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // FromClauseParser.g:126:6: tableSource
                    {
                    pushFollow(FOLLOW_tableSource_in_joinSourcePart615);
                    tableSource42=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource42.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:126:20: virtualTableSource
                    {
                    pushFollow(FOLLOW_virtualTableSource_in_joinSourcePart619);
                    virtualTableSource43=virtualTableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, virtualTableSource43.getTree());

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:126:41: subQuerySource
                    {
                    pushFollow(FOLLOW_subQuerySource_in_joinSourcePart623);
                    subQuerySource44=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource44.getTree());

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:126:58: partitionedTableFunction
                    {
                    pushFollow(FOLLOW_partitionedTableFunction_in_joinSourcePart627);
                    partitionedTableFunction45=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction45.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:126:84: ( lateralView ^)*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==COMMA) ) {
                    int LA16_25 = input.LA(2);

                    if ( (LA16_25==KW_LATERAL) ) {
                        alt16=1;
                    }


                }
                else if ( (LA16_0==KW_LATERAL) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // FromClauseParser.g:126:85: lateralView ^
            	    {
            	    pushFollow(FOLLOW_lateralView_in_joinSourcePart631);
            	    lateralView46=lateralView();

            	    state._fsp--;
            	    if (state.failed) return retval;
            	    if ( state.backtracking==0 ) root_0 = (ASTNode)adaptor.becomeRoot(lateralView46.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


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
    // $ANTLR end "joinSourcePart"


    public static class uniqueJoinSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinSource"
    // FromClauseParser.g:129:1: uniqueJoinSource : ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr ;
    public final HiveParser_FromClauseParser.uniqueJoinSource_return uniqueJoinSource() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinSource_return retval = new HiveParser_FromClauseParser.uniqueJoinSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_PRESERVE47=null;
        HiveParser_FromClauseParser.uniqueJoinTableSource_return uniqueJoinTableSource48 =null;

        HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr49 =null;


        ASTNode KW_PRESERVE47_tree=null;

         gParent.pushMsg("unique join source", state); 
        try {
            // FromClauseParser.g:132:5: ( ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr )
            // FromClauseParser.g:132:7: ( KW_PRESERVE )? uniqueJoinTableSource uniqueJoinExpr
            {
            root_0 = (ASTNode)adaptor.nil();


            // FromClauseParser.g:132:7: ( KW_PRESERVE )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==KW_PRESERVE) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // FromClauseParser.g:132:7: KW_PRESERVE
                    {
                    KW_PRESERVE47=(Token)match(input,KW_PRESERVE,FOLLOW_KW_PRESERVE_in_uniqueJoinSource661); if (state.failed) return retval;
                    if ( state.backtracking==0 ) {
                    KW_PRESERVE47_tree = 
                    (ASTNode)adaptor.create(KW_PRESERVE47)
                    ;
                    adaptor.addChild(root_0, KW_PRESERVE47_tree);
                    }

                    }
                    break;

            }


            pushFollow(FOLLOW_uniqueJoinTableSource_in_uniqueJoinSource664);
            uniqueJoinTableSource48=uniqueJoinTableSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinTableSource48.getTree());

            pushFollow(FOLLOW_uniqueJoinExpr_in_uniqueJoinSource666);
            uniqueJoinExpr49=uniqueJoinExpr();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, uniqueJoinExpr49.getTree());

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
    // $ANTLR end "uniqueJoinSource"


    public static class uniqueJoinExpr_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinExpr"
    // FromClauseParser.g:135:1: uniqueJoinExpr : LPAREN ! expressionList RPAREN !;
    public final HiveParser_FromClauseParser.uniqueJoinExpr_return uniqueJoinExpr() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinExpr_return retval = new HiveParser_FromClauseParser.uniqueJoinExpr_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN50=null;
        Token RPAREN52=null;
        HiveParser_FromClauseParser.expressionList_return expressionList51 =null;


        ASTNode LPAREN50_tree=null;
        ASTNode RPAREN52_tree=null;

         gParent.pushMsg("unique join expression list", state); 
        try {
            // FromClauseParser.g:138:5: ( LPAREN ! expressionList RPAREN !)
            // FromClauseParser.g:138:7: LPAREN ! expressionList RPAREN !
            {
            root_0 = (ASTNode)adaptor.nil();


            LPAREN50=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_uniqueJoinExpr693); if (state.failed) return retval;

            pushFollow(FOLLOW_expressionList_in_uniqueJoinExpr696);
            expressionList51=expressionList();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList51.getTree());

            RPAREN52=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_uniqueJoinExpr698); if (state.failed) return retval;

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
    // $ANTLR end "uniqueJoinExpr"


    public static class uniqueJoinToken_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinToken"
    // FromClauseParser.g:141:1: uniqueJoinToken : KW_UNIQUEJOIN -> TOK_UNIQUEJOIN ;
    public final HiveParser_FromClauseParser.uniqueJoinToken_return uniqueJoinToken() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinToken_return retval = new HiveParser_FromClauseParser.uniqueJoinToken_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_UNIQUEJOIN53=null;

        ASTNode KW_UNIQUEJOIN53_tree=null;
        RewriteRuleTokenStream stream_KW_UNIQUEJOIN=new RewriteRuleTokenStream(adaptor,"token KW_UNIQUEJOIN");

         gParent.pushMsg("unique join", state); 
        try {
            // FromClauseParser.g:144:5: ( KW_UNIQUEJOIN -> TOK_UNIQUEJOIN )
            // FromClauseParser.g:144:7: KW_UNIQUEJOIN
            {
            KW_UNIQUEJOIN53=(Token)match(input,KW_UNIQUEJOIN,FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken726); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_UNIQUEJOIN.add(KW_UNIQUEJOIN53);


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
            // 144:21: -> TOK_UNIQUEJOIN
            {
                adaptor.addChild(root_0, 
                (ASTNode)adaptor.create(TOK_UNIQUEJOIN, "TOK_UNIQUEJOIN")
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
    // $ANTLR end "uniqueJoinToken"


    public static class joinToken_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "joinToken"
    // FromClauseParser.g:146:1: joinToken : ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN | KW_LEFT KW_ANTI KW_JOIN -> TOK_LEFTANTISEMIJOIN );
    public final HiveParser_FromClauseParser.joinToken_return joinToken() throws RecognitionException {
        HiveParser_FromClauseParser.joinToken_return retval = new HiveParser_FromClauseParser.joinToken_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_JOIN54=null;
        Token KW_INNER55=null;
        Token KW_JOIN56=null;
        Token COMMA57=null;
        Token KW_CROSS58=null;
        Token KW_JOIN59=null;
        Token KW_LEFT60=null;
        Token KW_OUTER61=null;
        Token KW_JOIN62=null;
        Token KW_RIGHT63=null;
        Token KW_OUTER64=null;
        Token KW_JOIN65=null;
        Token KW_FULL66=null;
        Token KW_OUTER67=null;
        Token KW_JOIN68=null;
        Token KW_LEFT69=null;
        Token KW_SEMI70=null;
        Token KW_JOIN71=null;
        Token KW_LEFT72=null;
        Token KW_ANTI73=null;
        Token KW_JOIN74=null;

        ASTNode KW_JOIN54_tree=null;
        ASTNode KW_INNER55_tree=null;
        ASTNode KW_JOIN56_tree=null;
        ASTNode COMMA57_tree=null;
        ASTNode KW_CROSS58_tree=null;
        ASTNode KW_JOIN59_tree=null;
        ASTNode KW_LEFT60_tree=null;
        ASTNode KW_OUTER61_tree=null;
        ASTNode KW_JOIN62_tree=null;
        ASTNode KW_RIGHT63_tree=null;
        ASTNode KW_OUTER64_tree=null;
        ASTNode KW_JOIN65_tree=null;
        ASTNode KW_FULL66_tree=null;
        ASTNode KW_OUTER67_tree=null;
        ASTNode KW_JOIN68_tree=null;
        ASTNode KW_LEFT69_tree=null;
        ASTNode KW_SEMI70_tree=null;
        ASTNode KW_JOIN71_tree=null;
        ASTNode KW_LEFT72_tree=null;
        ASTNode KW_ANTI73_tree=null;
        ASTNode KW_JOIN74_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_RIGHT=new RewriteRuleTokenStream(adaptor,"token KW_RIGHT");
        RewriteRuleTokenStream stream_KW_CROSS=new RewriteRuleTokenStream(adaptor,"token KW_CROSS");
        RewriteRuleTokenStream stream_KW_FULL=new RewriteRuleTokenStream(adaptor,"token KW_FULL");
        RewriteRuleTokenStream stream_KW_ANTI=new RewriteRuleTokenStream(adaptor,"token KW_ANTI");
        RewriteRuleTokenStream stream_KW_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_JOIN");
        RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
        RewriteRuleTokenStream stream_KW_SEMI=new RewriteRuleTokenStream(adaptor,"token KW_SEMI");
        RewriteRuleTokenStream stream_KW_LEFT=new RewriteRuleTokenStream(adaptor,"token KW_LEFT");
        RewriteRuleTokenStream stream_KW_INNER=new RewriteRuleTokenStream(adaptor,"token KW_INNER");

         gParent.pushMsg("join type specifier", state); 
        try {
            // FromClauseParser.g:149:5: ( KW_JOIN -> TOK_JOIN | KW_INNER KW_JOIN -> TOK_JOIN | COMMA -> TOK_JOIN | KW_CROSS KW_JOIN -> TOK_CROSSJOIN | KW_LEFT ( KW_OUTER )? KW_JOIN -> TOK_LEFTOUTERJOIN | KW_RIGHT ( KW_OUTER )? KW_JOIN -> TOK_RIGHTOUTERJOIN | KW_FULL ( KW_OUTER )? KW_JOIN -> TOK_FULLOUTERJOIN | KW_LEFT KW_SEMI KW_JOIN -> TOK_LEFTSEMIJOIN | KW_LEFT KW_ANTI KW_JOIN -> TOK_LEFTANTISEMIJOIN )
            int alt21=9;
            switch ( input.LA(1) ) {
            case KW_JOIN:
                {
                alt21=1;
                }
                break;
            case KW_INNER:
                {
                alt21=2;
                }
                break;
            case COMMA:
                {
                alt21=3;
                }
                break;
            case KW_CROSS:
                {
                alt21=4;
                }
                break;
            case KW_LEFT:
                {
                switch ( input.LA(2) ) {
                case KW_SEMI:
                    {
                    alt21=8;
                    }
                    break;
                case KW_ANTI:
                    {
                    alt21=9;
                    }
                    break;
                case KW_JOIN:
                case KW_OUTER:
                    {
                    alt21=5;
                    }
                    break;
                default:
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 5, input);

                    throw nvae;

                }

                }
                break;
            case KW_RIGHT:
                {
                alt21=6;
                }
                break;
            case KW_FULL:
                {
                alt21=7;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // FromClauseParser.g:150:7: KW_JOIN
                    {
                    KW_JOIN54=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken758); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN54);


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
                    // 150:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:151:7: KW_INNER KW_JOIN
                    {
                    KW_INNER55=(Token)match(input,KW_INNER,FOLLOW_KW_INNER_in_joinToken791); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_INNER.add(KW_INNER55);


                    KW_JOIN56=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken793); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN56);


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
                    // 151:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:152:7: COMMA
                    {
                    COMMA57=(Token)match(input,COMMA,FOLLOW_COMMA_in_joinToken817); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_COMMA.add(COMMA57);


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
                    // 152:36: -> TOK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_JOIN, "TOK_JOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:153:7: KW_CROSS KW_JOIN
                    {
                    KW_CROSS58=(Token)match(input,KW_CROSS,FOLLOW_KW_CROSS_in_joinToken852); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_CROSS.add(KW_CROSS58);


                    KW_JOIN59=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken854); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN59);


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
                    // 153:36: -> TOK_CROSSJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_CROSSJOIN, "TOK_CROSSJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // FromClauseParser.g:154:7: KW_LEFT ( KW_OUTER )? KW_JOIN
                    {
                    KW_LEFT60=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken878); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT60);


                    // FromClauseParser.g:154:16: ( KW_OUTER )?
                    int alt18=2;
                    int LA18_0 = input.LA(1);

                    if ( (LA18_0==KW_OUTER) ) {
                        alt18=1;
                    }
                    switch (alt18) {
                        case 1 :
                            // FromClauseParser.g:154:17: KW_OUTER
                            {
                            KW_OUTER61=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken882); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER61);


                            }
                            break;

                    }


                    KW_JOIN62=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken886); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN62);


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
                    // 154:36: -> TOK_LEFTOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_LEFTOUTERJOIN, "TOK_LEFTOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 6 :
                    // FromClauseParser.g:155:7: KW_RIGHT ( KW_OUTER )? KW_JOIN
                    {
                    KW_RIGHT63=(Token)match(input,KW_RIGHT,FOLLOW_KW_RIGHT_in_joinToken898); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_RIGHT.add(KW_RIGHT63);


                    // FromClauseParser.g:155:16: ( KW_OUTER )?
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==KW_OUTER) ) {
                        alt19=1;
                    }
                    switch (alt19) {
                        case 1 :
                            // FromClauseParser.g:155:17: KW_OUTER
                            {
                            KW_OUTER64=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken901); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER64);


                            }
                            break;

                    }


                    KW_JOIN65=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken905); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN65);


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
                    // 155:36: -> TOK_RIGHTOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_RIGHTOUTERJOIN, "TOK_RIGHTOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 7 :
                    // FromClauseParser.g:156:7: KW_FULL ( KW_OUTER )? KW_JOIN
                    {
                    KW_FULL66=(Token)match(input,KW_FULL,FOLLOW_KW_FULL_in_joinToken917); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FULL.add(KW_FULL66);


                    // FromClauseParser.g:156:16: ( KW_OUTER )?
                    int alt20=2;
                    int LA20_0 = input.LA(1);

                    if ( (LA20_0==KW_OUTER) ) {
                        alt20=1;
                    }
                    switch (alt20) {
                        case 1 :
                            // FromClauseParser.g:156:17: KW_OUTER
                            {
                            KW_OUTER67=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_joinToken921); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER67);


                            }
                            break;

                    }


                    KW_JOIN68=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken925); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN68);


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
                    // 156:36: -> TOK_FULLOUTERJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_FULLOUTERJOIN, "TOK_FULLOUTERJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 8 :
                    // FromClauseParser.g:157:7: KW_LEFT KW_SEMI KW_JOIN
                    {
                    KW_LEFT69=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken937); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT69);


                    KW_SEMI70=(Token)match(input,KW_SEMI,FOLLOW_KW_SEMI_in_joinToken939); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SEMI.add(KW_SEMI70);


                    KW_JOIN71=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken941); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN71);


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
                    // 157:36: -> TOK_LEFTSEMIJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_LEFTSEMIJOIN, "TOK_LEFTSEMIJOIN")
                        );

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 9 :
                    // FromClauseParser.g:158:7: KW_LEFT KW_ANTI KW_JOIN
                    {
                    KW_LEFT72=(Token)match(input,KW_LEFT,FOLLOW_KW_LEFT_in_joinToken958); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LEFT.add(KW_LEFT72);


                    KW_ANTI73=(Token)match(input,KW_ANTI,FOLLOW_KW_ANTI_in_joinToken960); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ANTI.add(KW_ANTI73);


                    KW_JOIN74=(Token)match(input,KW_JOIN,FOLLOW_KW_JOIN_in_joinToken962); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_JOIN.add(KW_JOIN74);


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
                    // 158:31: -> TOK_LEFTANTISEMIJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_LEFTANTISEMIJOIN, "TOK_LEFTANTISEMIJOIN")
                        );

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
    // $ANTLR end "joinToken"


    public static class lateralView_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "lateralView"
    // FromClauseParser.g:161:1: lateralView : ( ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tableAlias ( LPAREN identifier ( COMMA identifier )* RPAREN )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) ) );
    public final HiveParser_FromClauseParser.lateralView_return lateralView() throws RecognitionException {
        HiveParser_FromClauseParser.lateralView_return retval = new HiveParser_FromClauseParser.lateralView_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_LATERAL75=null;
        Token KW_VIEW76=null;
        Token KW_OUTER77=null;
        Token KW_AS80=null;
        Token COMMA82=null;
        Token COMMA84=null;
        Token KW_LATERAL85=null;
        Token KW_VIEW86=null;
        Token KW_AS89=null;
        Token COMMA91=null;
        Token COMMA93=null;
        Token KW_LATERAL94=null;
        Token KW_TABLE95=null;
        Token LPAREN96=null;
        Token RPAREN98=null;
        Token KW_AS99=null;
        Token LPAREN101=null;
        Token COMMA103=null;
        Token RPAREN105=null;
        HiveParser_IdentifiersParser.function_return function78 =null;

        HiveParser_FromClauseParser.tableAlias_return tableAlias79 =null;

        HiveParser_IdentifiersParser.identifier_return identifier81 =null;

        HiveParser_IdentifiersParser.identifier_return identifier83 =null;

        HiveParser_IdentifiersParser.function_return function87 =null;

        HiveParser_FromClauseParser.tableAlias_return tableAlias88 =null;

        HiveParser_IdentifiersParser.identifier_return identifier90 =null;

        HiveParser_IdentifiersParser.identifier_return identifier92 =null;

        HiveParser_FromClauseParser.valuesClause_return valuesClause97 =null;

        HiveParser_FromClauseParser.tableAlias_return tableAlias100 =null;

        HiveParser_IdentifiersParser.identifier_return identifier102 =null;

        HiveParser_IdentifiersParser.identifier_return identifier104 =null;


        ASTNode KW_LATERAL75_tree=null;
        ASTNode KW_VIEW76_tree=null;
        ASTNode KW_OUTER77_tree=null;
        ASTNode KW_AS80_tree=null;
        ASTNode COMMA82_tree=null;
        ASTNode COMMA84_tree=null;
        ASTNode KW_LATERAL85_tree=null;
        ASTNode KW_VIEW86_tree=null;
        ASTNode KW_AS89_tree=null;
        ASTNode COMMA91_tree=null;
        ASTNode COMMA93_tree=null;
        ASTNode KW_LATERAL94_tree=null;
        ASTNode KW_TABLE95_tree=null;
        ASTNode LPAREN96_tree=null;
        ASTNode RPAREN98_tree=null;
        ASTNode KW_AS99_tree=null;
        ASTNode LPAREN101_tree=null;
        ASTNode COMMA103_tree=null;
        ASTNode RPAREN105_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_VIEW=new RewriteRuleTokenStream(adaptor,"token KW_VIEW");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_OUTER=new RewriteRuleTokenStream(adaptor,"token KW_OUTER");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleTokenStream stream_KW_LATERAL=new RewriteRuleTokenStream(adaptor,"token KW_LATERAL");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_valuesClause=new RewriteRuleSubtreeStream(adaptor,"rule valuesClause");
        RewriteRuleSubtreeStream stream_function=new RewriteRuleSubtreeStream(adaptor,"rule function");
        RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");
        gParent.pushMsg("lateral view", state); 
        try {
            // FromClauseParser.g:164:2: ( ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) ) | ( COMMA )? KW_LATERAL KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tableAlias ( LPAREN identifier ( COMMA identifier )* RPAREN )? -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) ) )
            int alt31=3;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==KW_LATERAL) ) {
                int LA31_1 = input.LA(2);

                if ( (LA31_1==KW_VIEW) ) {
                    int LA31_3 = input.LA(3);

                    if ( (LA31_3==KW_OUTER) && (synpred4_FromClauseParser())) {
                        alt31=1;
                    }
                    else if ( (LA31_3==Identifier||(LA31_3 >= KW_ABORT && LA31_3 <= KW_AFTER)||LA31_3==KW_ALLOC_FRACTION||LA31_3==KW_ANALYZE||(LA31_3 >= KW_ARCHIVE && LA31_3 <= KW_ARRAY)||(LA31_3 >= KW_ASC && LA31_3 <= KW_AT)||(LA31_3 >= KW_AUTOCOMMIT && LA31_3 <= KW_BEFORE)||(LA31_3 >= KW_BIGINT && LA31_3 <= KW_BOOLEAN)||(LA31_3 >= KW_BRANCH && LA31_3 <= KW_BUCKETS)||(LA31_3 >= KW_CACHE && LA31_3 <= KW_CASCADE)||(LA31_3 >= KW_CBO && LA31_3 <= KW_CHANGE)||LA31_3==KW_CHECK||(LA31_3 >= KW_CLUSTER && LA31_3 <= KW_COLLECTION)||(LA31_3 >= KW_COLUMNS && LA31_3 <= KW_COMMENT)||(LA31_3 >= KW_COMPACT && LA31_3 <= KW_COMPACTIONS)||(LA31_3 >= KW_COMPUTE && LA31_3 <= KW_CONCATENATE)||LA31_3==KW_CONTINUE||LA31_3==KW_COST||LA31_3==KW_CRON||(LA31_3 >= KW_CURRENT_DATE && LA31_3 <= KW_CURRENT_TIMESTAMP)||LA31_3==KW_DATA||LA31_3==KW_DATABASES||(LA31_3 >= KW_DATE && LA31_3 <= KW_DCPROPERTIES)||LA31_3==KW_DEBUG||(LA31_3 >= KW_DEFAULT && LA31_3 <= KW_DEFINED)||(LA31_3 >= KW_DELIMITED && LA31_3 <= KW_DESC)||(LA31_3 >= KW_DETAIL && LA31_3 <= KW_DISABLE)||(LA31_3 >= KW_DISTRIBUTE && LA31_3 <= KW_DOW)||(LA31_3 >= KW_DUMP && LA31_3 <= KW_ELEM_TYPE)||LA31_3==KW_ENABLE||(LA31_3 >= KW_ENFORCED && LA31_3 <= KW_EVERY)||(LA31_3 >= KW_EXCLUSIVE && LA31_3 <= KW_EXECUTED)||(LA31_3 >= KW_EXPIRE_SNAPSHOTS && LA31_3 <= KW_EXPRESSION)||LA31_3==KW_FAST_FORWARD||(LA31_3 >= KW_FIELDS && LA31_3 <= KW_FLOAT)||(LA31_3 >= KW_FORMAT && LA31_3 <= KW_FORMATTED)||LA31_3==KW_FUNCTIONS||LA31_3==KW_GROUPING||(LA31_3 >= KW_HOUR && LA31_3 <= KW_IGNORE)||(LA31_3 >= KW_INDEX && LA31_3 <= KW_INDEXES)||(LA31_3 >= KW_INPATH && LA31_3 <= KW_INPUTFORMAT)||LA31_3==KW_INT||(LA31_3 >= KW_ISOLATION && LA31_3 <= KW_JAR)||(LA31_3 >= KW_JOINCOST && LA31_3 <= KW_LAST)||LA31_3==KW_LEVEL||(LA31_3 >= KW_LIMIT && LA31_3 <= KW_LOAD)||(LA31_3 >= KW_LOCATION && LA31_3 <= KW_LONG)||(LA31_3 >= KW_MANAGED && LA31_3 <= KW_MATERIALIZED)||LA31_3==KW_METADATA||(LA31_3 >= KW_MINUTE && LA31_3 <= KW_MONTH)||(LA31_3 >= KW_MOVE && LA31_3 <= KW_MSCK)||(LA31_3 >= KW_NORELY && LA31_3 <= KW_NOSCAN)||LA31_3==KW_NOVALIDATE||LA31_3==KW_NULLS||LA31_3==KW_OFFSET||(LA31_3 >= KW_OPERATOR && LA31_3 <= KW_OPTION)||(LA31_3 >= KW_OUTPUTDRIVER && LA31_3 <= KW_OUTPUTFORMAT)||(LA31_3 >= KW_OVERWRITE && LA31_3 <= KW_OWNER)||(LA31_3 >= KW_PARTITIONED && LA31_3 <= KW_PATH)||(LA31_3 >= KW_PLAN && LA31_3 <= KW_POOL)||LA31_3==KW_PRINCIPALS||LA31_3==KW_PURGE||(LA31_3 >= KW_QUARTER && LA31_3 <= KW_QUERY_PARALLELISM)||LA31_3==KW_READ||(LA31_3 >= KW_REAL && LA31_3 <= KW_RECORDWRITER)||(LA31_3 >= KW_RELOAD && LA31_3 <= KW_RETENTION)||LA31_3==KW_REWRITE||(LA31_3 >= KW_ROLE && LA31_3 <= KW_ROLES)||(LA31_3 >= KW_SCHEDULED && LA31_3 <= KW_SECOND)||(LA31_3 >= KW_SEMI && LA31_3 <= KW_SERVER)||(LA31_3 >= KW_SETS && LA31_3 <= KW_SNAPSHOTS)||(LA31_3 >= KW_SORT && LA31_3 <= KW_SSL)||(LA31_3 >= KW_STATISTICS && LA31_3 <= KW_SUMMARY)||(LA31_3 >= KW_SYSTEM_TIME && LA31_3 <= KW_SYSTEM_VERSION)||LA31_3==KW_TABLES||(LA31_3 >= KW_TAG && LA31_3 <= KW_TERMINATED)||LA31_3==KW_TIMESTAMP||LA31_3==KW_TINYINT||LA31_3==KW_TOUCH||(LA31_3 >= KW_TRANSACTION && LA31_3 <= KW_TRANSACTIONS)||LA31_3==KW_TRIM||(LA31_3 >= KW_TYPE && LA31_3 <= KW_UNARCHIVE)||LA31_3==KW_UNDO||LA31_3==KW_UNIONTYPE||(LA31_3 >= KW_UNKNOWN && LA31_3 <= KW_UNSIGNED)||(LA31_3 >= KW_URI && LA31_3 <= KW_USE)||(LA31_3 >= KW_UTC && LA31_3 <= KW_VALIDATE)||LA31_3==KW_VALUE_TYPE||(LA31_3 >= KW_VECTORIZATION && LA31_3 <= KW_WEEK)||LA31_3==KW_WHILE||(LA31_3 >= KW_WITHIN && LA31_3 <= KW_ZONE)||LA31_3==KW_BATCH||LA31_3==KW_DAYOFWEEK||LA31_3==KW_HOLD_DDLTIME||LA31_3==KW_NO_DROP||LA31_3==KW_OFFLINE||LA31_3==KW_PROTECTION||LA31_3==KW_READONLY||LA31_3==KW_TIMESTAMPTZ) ) {
                        alt31=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 3, input);

                        throw nvae;

                    }
                }
                else if ( (LA31_1==KW_TABLE) ) {
                    alt31=3;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA31_0==COMMA) ) {
                int LA31_2 = input.LA(2);

                if ( (LA31_2==KW_LATERAL) ) {
                    int LA31_5 = input.LA(3);

                    if ( (LA31_5==KW_VIEW) ) {
                        alt31=2;
                    }
                    else if ( (LA31_5==KW_TABLE) ) {
                        alt31=3;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 31, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 31, 2, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;

            }
            switch (alt31) {
                case 1 :
                    // FromClauseParser.g:165:2: ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )=> KW_LATERAL KW_VIEW KW_OUTER function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
                    {
                    KW_LATERAL75=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView1004); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL75);


                    KW_VIEW76=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView1006); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW76);


                    KW_OUTER77=(Token)match(input,KW_OUTER,FOLLOW_KW_OUTER_in_lateralView1008); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OUTER.add(KW_OUTER77);


                    pushFollow(FOLLOW_function_in_lateralView1010);
                    function78=gHiveParser.function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function.add(function78.getTree());

                    pushFollow(FOLLOW_tableAlias_in_lateralView1012);
                    tableAlias79=tableAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias79.getTree());

                    // FromClauseParser.g:165:90: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==KW_AS) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // FromClauseParser.g:165:91: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
                            {
                            KW_AS80=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView1015); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS80);


                            pushFollow(FOLLOW_identifier_in_lateralView1017);
                            identifier81=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier81.getTree());

                            // FromClauseParser.g:165:108: ( ( COMMA )=> COMMA identifier )*
                            loop22:
                            do {
                                int alt22=2;
                                alt22 = dfa22.predict(input);
                                switch (alt22) {
                            	case 1 :
                            	    // FromClauseParser.g:165:109: ( COMMA )=> COMMA identifier
                            	    {
                            	    COMMA82=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView1025); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA82);


                            	    pushFollow(FOLLOW_identifier_in_lateralView1027);
                            	    identifier83=gHiveParser.identifier();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_identifier.add(identifier83.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop22;
                                }
                            } while (true);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: identifier, tableAlias, function
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 166:2: -> ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                    {
                        // FromClauseParser.g:166:5: ^( TOK_LATERAL_VIEW_OUTER ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LATERAL_VIEW_OUTER, "TOK_LATERAL_VIEW_OUTER")
                        , root_1);

                        // FromClauseParser.g:166:30: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_2);

                        // FromClauseParser.g:166:43: ^( TOK_SELEXPR function ( identifier )* tableAlias )
                        {
                        ASTNode root_3 = (ASTNode)adaptor.nil();
                        root_3 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_3);

                        adaptor.addChild(root_3, stream_function.nextTree());

                        // FromClauseParser.g:166:66: ( identifier )*
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_3, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_3, stream_tableAlias.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

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
                    // FromClauseParser.g:168:2: ( COMMA )? KW_LATERAL KW_VIEW function tableAlias ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
                    {
                    // FromClauseParser.g:168:2: ( COMMA )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==COMMA) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // FromClauseParser.g:168:2: COMMA
                            {
                            COMMA84=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView1059); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA84);


                            }
                            break;

                    }


                    KW_LATERAL85=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView1062); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL85);


                    KW_VIEW86=(Token)match(input,KW_VIEW,FOLLOW_KW_VIEW_in_lateralView1064); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_VIEW.add(KW_VIEW86);


                    pushFollow(FOLLOW_function_in_lateralView1066);
                    function87=gHiveParser.function();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_function.add(function87.getTree());

                    pushFollow(FOLLOW_tableAlias_in_lateralView1068);
                    tableAlias88=tableAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias88.getTree());

                    // FromClauseParser.g:168:48: ( KW_AS identifier ( ( COMMA )=> COMMA identifier )* )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==KW_AS) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // FromClauseParser.g:168:49: KW_AS identifier ( ( COMMA )=> COMMA identifier )*
                            {
                            KW_AS89=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView1071); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS89);


                            pushFollow(FOLLOW_identifier_in_lateralView1073);
                            identifier90=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier90.getTree());

                            // FromClauseParser.g:168:66: ( ( COMMA )=> COMMA identifier )*
                            loop25:
                            do {
                                int alt25=2;
                                alt25 = dfa25.predict(input);
                                switch (alt25) {
                            	case 1 :
                            	    // FromClauseParser.g:168:67: ( COMMA )=> COMMA identifier
                            	    {
                            	    COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView1081); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA91);


                            	    pushFollow(FOLLOW_identifier_in_lateralView1083);
                            	    identifier92=gHiveParser.identifier();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_identifier.add(identifier92.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop25;
                                }
                            } while (true);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: function, identifier, tableAlias
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 169:2: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                    {
                        // FromClauseParser.g:169:5: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW")
                        , root_1);

                        // FromClauseParser.g:169:24: ^( TOK_SELECT ^( TOK_SELEXPR function ( identifier )* tableAlias ) )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_2);

                        // FromClauseParser.g:169:37: ^( TOK_SELEXPR function ( identifier )* tableAlias )
                        {
                        ASTNode root_3 = (ASTNode)adaptor.nil();
                        root_3 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_3);

                        adaptor.addChild(root_3, stream_function.nextTree());

                        // FromClauseParser.g:169:60: ( identifier )*
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_3, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_3, stream_tableAlias.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

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
                    // FromClauseParser.g:171:5: ( COMMA )? KW_LATERAL KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tableAlias ( LPAREN identifier ( COMMA identifier )* RPAREN )?
                    {
                    // FromClauseParser.g:171:5: ( COMMA )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==COMMA) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // FromClauseParser.g:171:5: COMMA
                            {
                            COMMA93=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView1121); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_COMMA.add(COMMA93);


                            }
                            break;

                    }


                    KW_LATERAL94=(Token)match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_lateralView1124); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_LATERAL.add(KW_LATERAL94);


                    KW_TABLE95=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_lateralView1126); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE95);


                    LPAREN96=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lateralView1128); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN96);


                    pushFollow(FOLLOW_valuesClause_in_lateralView1130);
                    valuesClause97=valuesClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_valuesClause.add(valuesClause97.getTree());

                    RPAREN98=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lateralView1132); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN98);


                    // FromClauseParser.g:171:59: ( KW_AS )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==KW_AS) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // FromClauseParser.g:171:59: KW_AS
                            {
                            KW_AS99=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_lateralView1134); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS99);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_tableAlias_in_lateralView1137);
                    tableAlias100=tableAlias();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableAlias.add(tableAlias100.getTree());

                    // FromClauseParser.g:171:77: ( LPAREN identifier ( COMMA identifier )* RPAREN )?
                    int alt30=2;
                    int LA30_0 = input.LA(1);

                    if ( (LA30_0==LPAREN) ) {
                        alt30=1;
                    }
                    switch (alt30) {
                        case 1 :
                            // FromClauseParser.g:171:78: LPAREN identifier ( COMMA identifier )* RPAREN
                            {
                            LPAREN101=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_lateralView1140); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN101);


                            pushFollow(FOLLOW_identifier_in_lateralView1142);
                            identifier102=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(identifier102.getTree());

                            // FromClauseParser.g:171:96: ( COMMA identifier )*
                            loop29:
                            do {
                                int alt29=2;
                                int LA29_0 = input.LA(1);

                                if ( (LA29_0==COMMA) ) {
                                    alt29=1;
                                }


                                switch (alt29) {
                            	case 1 :
                            	    // FromClauseParser.g:171:97: COMMA identifier
                            	    {
                            	    COMMA103=(Token)match(input,COMMA,FOLLOW_COMMA_in_lateralView1145); if (state.failed) return retval; 
                            	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA103);


                            	    pushFollow(FOLLOW_identifier_in_lateralView1147);
                            	    identifier104=gHiveParser.identifier();

                            	    state._fsp--;
                            	    if (state.failed) return retval;
                            	    if ( state.backtracking==0 ) stream_identifier.add(identifier104.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop29;
                                }
                            } while (true);


                            RPAREN105=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_lateralView1151); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN105);


                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: tableAlias, identifier, valuesClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 172:5: -> ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) )
                    {
                        // FromClauseParser.g:172:8: ^( TOK_LATERAL_VIEW ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) ) )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_LATERAL_VIEW, "TOK_LATERAL_VIEW")
                        , root_1);

                        // FromClauseParser.g:172:27: ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias ) )
                        {
                        ASTNode root_2 = (ASTNode)adaptor.nil();
                        root_2 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                        , root_2);

                        // FromClauseParser.g:172:40: ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* tableAlias )
                        {
                        ASTNode root_3 = (ASTNode)adaptor.nil();
                        root_3 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                        , root_3);

                        // FromClauseParser.g:172:54: ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause )
                        {
                        ASTNode root_4 = (ASTNode)adaptor.nil();
                        root_4 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                        , root_4);

                        adaptor.addChild(root_4, 
                        (ASTNode)adaptor.create(Identifier, "inline")
                        );

                        adaptor.addChild(root_4, stream_valuesClause.nextTree());

                        adaptor.addChild(root_3, root_4);
                        }

                        // FromClauseParser.g:172:104: ( identifier )*
                        while ( stream_identifier.hasNext() ) {
                            adaptor.addChild(root_3, stream_identifier.nextTree());

                        }
                        stream_identifier.reset();

                        adaptor.addChild(root_3, stream_tableAlias.nextTree());

                        adaptor.addChild(root_2, root_3);
                        }

                        adaptor.addChild(root_1, root_2);
                        }

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
            if ( state.backtracking==0 ) {gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "lateralView"


    public static class tableAlias_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableAlias"
    // FromClauseParser.g:175:1: tableAlias : identifier -> ^( TOK_TABALIAS identifier ) ;
    public final HiveParser_FromClauseParser.tableAlias_return tableAlias() throws RecognitionException {
        HiveParser_FromClauseParser.tableAlias_return retval = new HiveParser_FromClauseParser.tableAlias_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.identifier_return identifier106 =null;


        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        gParent.pushMsg("table alias", state); 
        try {
            // FromClauseParser.g:178:5: ( identifier -> ^( TOK_TABALIAS identifier ) )
            // FromClauseParser.g:179:5: identifier
            {
            pushFollow(FOLLOW_identifier_in_tableAlias1213);
            identifier106=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier106.getTree());

            // AST REWRITE
            // elements: identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 179:16: -> ^( TOK_TABALIAS identifier )
            {
                // FromClauseParser.g:179:19: ^( TOK_TABALIAS identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABALIAS, "TOK_TABALIAS")
                , root_1);

                adaptor.addChild(root_1, stream_identifier.nextTree());

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
            if ( state.backtracking==0 ) {gParent.popMsg(state); }
        }

        catch (RecognitionException e) {
          throw e;
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "tableAlias"


    public static class tableBucketSample_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableBucketSample"
    // FromClauseParser.g:182:1: tableBucketSample : KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) ;
    public final HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample() throws RecognitionException {
        HiveParser_FromClauseParser.tableBucketSample_return retval = new HiveParser_FromClauseParser.tableBucketSample_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token numerator=null;
        Token denominator=null;
        Token KW_TABLESAMPLE107=null;
        Token LPAREN108=null;
        Token KW_BUCKET109=null;
        Token KW_OUT110=null;
        Token KW_OF111=null;
        Token KW_ON112=null;
        Token COMMA113=null;
        Token RPAREN114=null;
        List list_expr=null;
        RuleReturnScope expr = null;
        ASTNode numerator_tree=null;
        ASTNode denominator_tree=null;
        ASTNode KW_TABLESAMPLE107_tree=null;
        ASTNode LPAREN108_tree=null;
        ASTNode KW_BUCKET109_tree=null;
        ASTNode KW_OUT110_tree=null;
        ASTNode KW_OF111_tree=null;
        ASTNode KW_ON112_tree=null;
        ASTNode COMMA113_tree=null;
        ASTNode RPAREN114_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_OUT=new RewriteRuleTokenStream(adaptor,"token KW_OUT");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_BUCKET=new RewriteRuleTokenStream(adaptor,"token KW_BUCKET");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("table bucket sample specification", state); 
        try {
            // FromClauseParser.g:185:5: ( KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* ) )
            // FromClauseParser.g:186:5: KW_TABLESAMPLE LPAREN KW_BUCKET (numerator= Number ) KW_OUT KW_OF (denominator= Number ) ( KW_ON expr+= expression ( COMMA expr+= expression )* )? RPAREN
            {
            KW_TABLESAMPLE107=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1252); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE107);


            LPAREN108=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_tableBucketSample1254); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN108);


            KW_BUCKET109=(Token)match(input,KW_BUCKET,FOLLOW_KW_BUCKET_in_tableBucketSample1256); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_BUCKET.add(KW_BUCKET109);


            // FromClauseParser.g:186:37: (numerator= Number )
            // FromClauseParser.g:186:38: numerator= Number
            {
            numerator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1261); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(numerator);


            }


            KW_OUT110=(Token)match(input,KW_OUT,FOLLOW_KW_OUT_in_tableBucketSample1264); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OUT.add(KW_OUT110);


            KW_OF111=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_tableBucketSample1266); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF111);


            // FromClauseParser.g:186:69: (denominator= Number )
            // FromClauseParser.g:186:70: denominator= Number
            {
            denominator=(Token)match(input,Number,FOLLOW_Number_in_tableBucketSample1271); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_Number.add(denominator);


            }


            // FromClauseParser.g:186:90: ( KW_ON expr+= expression ( COMMA expr+= expression )* )?
            int alt33=2;
            int LA33_0 = input.LA(1);

            if ( (LA33_0==KW_ON) ) {
                alt33=1;
            }
            switch (alt33) {
                case 1 :
                    // FromClauseParser.g:186:91: KW_ON expr+= expression ( COMMA expr+= expression )*
                    {
                    KW_ON112=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_tableBucketSample1275); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON112);


                    pushFollow(FOLLOW_expression_in_tableBucketSample1279);
                    expr=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
                    if (list_expr==null) list_expr=new ArrayList();
                    list_expr.add(expr.getTree());


                    // FromClauseParser.g:186:114: ( COMMA expr+= expression )*
                    loop32:
                    do {
                        int alt32=2;
                        int LA32_0 = input.LA(1);

                        if ( (LA32_0==COMMA) ) {
                            alt32=1;
                        }


                        switch (alt32) {
                    	case 1 :
                    	    // FromClauseParser.g:186:115: COMMA expr+= expression
                    	    {
                    	    COMMA113=(Token)match(input,COMMA,FOLLOW_COMMA_in_tableBucketSample1282); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA113);


                    	    pushFollow(FOLLOW_expression_in_tableBucketSample1286);
                    	    expr=gHiveParser.expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expr.getTree());
                    	    if (list_expr==null) list_expr=new ArrayList();
                    	    list_expr.add(expr.getTree());


                    	    }
                    	    break;

                    	default :
                    	    break loop32;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN114=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_tableBucketSample1292); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN114);


            // AST REWRITE
            // elements: expr, numerator, denominator
            // token labels: numerator, denominator
            // rule labels: retval
            // token list labels: 
            // rule list labels: expr
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
            RewriteRuleTokenStream stream_denominator=new RewriteRuleTokenStream(adaptor,"token denominator",denominator);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"token expr",list_expr);
            root_0 = (ASTNode)adaptor.nil();
            // 186:149: -> ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
            {
                // FromClauseParser.g:186:152: ^( TOK_TABLEBUCKETSAMPLE $numerator $denominator ( $expr)* )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABLEBUCKETSAMPLE, "TOK_TABLEBUCKETSAMPLE")
                , root_1);

                adaptor.addChild(root_1, stream_numerator.nextNode());

                adaptor.addChild(root_1, stream_denominator.nextNode());

                // FromClauseParser.g:186:201: ( $expr)*
                while ( stream_expr.hasNext() ) {
                    adaptor.addChild(root_1, stream_expr.nextTree());

                }
                stream_expr.reset();

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
    // $ANTLR end "tableBucketSample"


    public static class splitSample_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "splitSample"
    // FromClauseParser.g:189:1: splitSample : ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) );
    public final HiveParser_FromClauseParser.splitSample_return splitSample() throws RecognitionException {
        HiveParser_FromClauseParser.splitSample_return retval = new HiveParser_FromClauseParser.splitSample_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token numerator=null;
        Token percent=null;
        Token KW_TABLESAMPLE115=null;
        Token LPAREN116=null;
        Token KW_ROWS117=null;
        Token RPAREN118=null;
        Token KW_TABLESAMPLE119=null;
        Token LPAREN120=null;
        Token RPAREN121=null;

        ASTNode numerator_tree=null;
        ASTNode percent_tree=null;
        ASTNode KW_TABLESAMPLE115_tree=null;
        ASTNode LPAREN116_tree=null;
        ASTNode KW_ROWS117_tree=null;
        ASTNode RPAREN118_tree=null;
        ASTNode KW_TABLESAMPLE119_tree=null;
        ASTNode LPAREN120_tree=null;
        ASTNode RPAREN121_tree=null;
        RewriteRuleTokenStream stream_KW_TABLESAMPLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLESAMPLE");
        RewriteRuleTokenStream stream_Number=new RewriteRuleTokenStream(adaptor,"token Number");
        RewriteRuleTokenStream stream_KW_ROWS=new RewriteRuleTokenStream(adaptor,"token KW_ROWS");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_PERCENT=new RewriteRuleTokenStream(adaptor,"token KW_PERCENT");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_ByteLengthLiteral=new RewriteRuleTokenStream(adaptor,"token ByteLengthLiteral");

         gParent.pushMsg("table split sample specification", state); 
        try {
            // FromClauseParser.g:192:5: ( KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator) -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator) | KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator) )
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==KW_TABLESAMPLE) ) {
                int LA35_1 = input.LA(2);

                if ( (LA35_1==LPAREN) ) {
                    int LA35_2 = input.LA(3);

                    if ( (LA35_2==Number) ) {
                        alt35=1;
                    }
                    else if ( (LA35_2==ByteLengthLiteral) ) {
                        alt35=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 35, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 35, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 35, 0, input);

                throw nvae;

            }
            switch (alt35) {
                case 1 :
                    // FromClauseParser.g:193:5: KW_TABLESAMPLE LPAREN (numerator= Number ) (percent= KW_PERCENT | KW_ROWS ) RPAREN
                    {
                    KW_TABLESAMPLE115=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1339); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE115);


                    LPAREN116=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1341); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN116);


                    // FromClauseParser.g:193:28: (numerator= Number )
                    // FromClauseParser.g:193:29: numerator= Number
                    {
                    numerator=(Token)match(input,Number,FOLLOW_Number_in_splitSample1347); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Number.add(numerator);


                    }


                    // FromClauseParser.g:193:47: (percent= KW_PERCENT | KW_ROWS )
                    int alt34=2;
                    int LA34_0 = input.LA(1);

                    if ( (LA34_0==KW_PERCENT) ) {
                        alt34=1;
                    }
                    else if ( (LA34_0==KW_ROWS) ) {
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
                            // FromClauseParser.g:193:48: percent= KW_PERCENT
                            {
                            percent=(Token)match(input,KW_PERCENT,FOLLOW_KW_PERCENT_in_splitSample1353); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_PERCENT.add(percent);


                            }
                            break;
                        case 2 :
                            // FromClauseParser.g:193:67: KW_ROWS
                            {
                            KW_ROWS117=(Token)match(input,KW_ROWS,FOLLOW_KW_ROWS_in_splitSample1355); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_ROWS.add(KW_ROWS117);


                            }
                            break;

                    }


                    RPAREN118=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1358); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN118);


                    // AST REWRITE
                    // elements: numerator, numerator
                    // token labels: numerator
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 194:5: -> {percent != null}? ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
                    if (percent != null) {
                        // FromClauseParser.g:194:27: ^( TOK_TABLESPLITSAMPLE TOK_PERCENT $numerator)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_PERCENT, "TOK_PERCENT")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }

                    else // 195:5: -> ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
                    {
                        // FromClauseParser.g:195:8: ^( TOK_TABLESPLITSAMPLE TOK_ROWCOUNT $numerator)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_ROWCOUNT, "TOK_ROWCOUNT")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:197:5: KW_TABLESAMPLE LPAREN (numerator= ByteLengthLiteral ) RPAREN
                    {
                    KW_TABLESAMPLE119=(Token)match(input,KW_TABLESAMPLE,FOLLOW_KW_TABLESAMPLE_in_splitSample1402); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_TABLESAMPLE.add(KW_TABLESAMPLE119);


                    LPAREN120=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_splitSample1404); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN120);


                    // FromClauseParser.g:197:28: (numerator= ByteLengthLiteral )
                    // FromClauseParser.g:197:29: numerator= ByteLengthLiteral
                    {
                    numerator=(Token)match(input,ByteLengthLiteral,FOLLOW_ByteLengthLiteral_in_splitSample1410); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_ByteLengthLiteral.add(numerator);


                    }


                    RPAREN121=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_splitSample1413); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN121);


                    // AST REWRITE
                    // elements: numerator
                    // token labels: numerator
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleTokenStream stream_numerator=new RewriteRuleTokenStream(adaptor,"token numerator",numerator);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 198:5: -> ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
                    {
                        // FromClauseParser.g:198:8: ^( TOK_TABLESPLITSAMPLE TOK_LENGTH $numerator)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABLESPLITSAMPLE, "TOK_TABLESPLITSAMPLE")
                        , root_1);

                        adaptor.addChild(root_1, 
                        (ASTNode)adaptor.create(TOK_LENGTH, "TOK_LENGTH")
                        );

                        adaptor.addChild(root_1, stream_numerator.nextNode());

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
    // $ANTLR end "splitSample"


    public static class tableSample_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSample"
    // FromClauseParser.g:201:1: tableSample : ( tableBucketSample | splitSample );
    public final HiveParser_FromClauseParser.tableSample_return tableSample() throws RecognitionException {
        HiveParser_FromClauseParser.tableSample_return retval = new HiveParser_FromClauseParser.tableSample_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.tableBucketSample_return tableBucketSample122 =null;

        HiveParser_FromClauseParser.splitSample_return splitSample123 =null;



         gParent.pushMsg("table sample specification", state); 
        try {
            // FromClauseParser.g:204:5: ( tableBucketSample | splitSample )
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==KW_TABLESAMPLE) ) {
                int LA36_1 = input.LA(2);

                if ( (LA36_1==LPAREN) ) {
                    int LA36_2 = input.LA(3);

                    if ( (LA36_2==KW_BUCKET) ) {
                        alt36=1;
                    }
                    else if ( (LA36_2==ByteLengthLiteral||LA36_2==Number) ) {
                        alt36=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 36, 2, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 36, 1, input);

                    throw nvae;

                }
            }
            else {
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 36, 0, input);

                throw nvae;

            }
            switch (alt36) {
                case 1 :
                    // FromClauseParser.g:205:5: tableBucketSample
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_tableBucketSample_in_tableSample1459);
                    tableBucketSample122=tableBucketSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableBucketSample122.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:206:5: splitSample
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_splitSample_in_tableSample1467);
                    splitSample123=splitSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, splitSample123.getTree());

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
    // $ANTLR end "tableSample"


    public static class tableSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableSource"
    // FromClauseParser.g:209:1: tableSource : tabname= tableName (props= tableProperties )? (ts= tableSample )? (asOf= asOfClause )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ( $asOf)? ) ;
    public final HiveParser_FromClauseParser.tableSource_return tableSource() throws RecognitionException {
        HiveParser_FromClauseParser.tableSource_return retval = new HiveParser_FromClauseParser.tableSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AS124=null;
        HiveParser_FromClauseParser.tableName_return tabname =null;

        HiveParser.tableProperties_return props =null;

        HiveParser_FromClauseParser.tableSample_return ts =null;

        HiveParser_FromClauseParser.asOfClause_return asOf =null;

        HiveParser_IdentifiersParser.identifier_return alias =null;


        ASTNode KW_AS124_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_asOfClause=new RewriteRuleSubtreeStream(adaptor,"rule asOfClause");
        RewriteRuleSubtreeStream stream_tableProperties=new RewriteRuleSubtreeStream(adaptor,"rule tableProperties");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
         gParent.pushMsg("table source", state); 
        try {
            // FromClauseParser.g:212:5: (tabname= tableName (props= tableProperties )? (ts= tableSample )? (asOf= asOfClause )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ( $asOf)? ) )
            // FromClauseParser.g:212:7: tabname= tableName (props= tableProperties )? (ts= tableSample )? (asOf= asOfClause )? ( ( KW_AS )? alias= identifier )?
            {
            pushFollow(FOLLOW_tableName_in_tableSource1496);
            tabname=tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());

            // FromClauseParser.g:212:30: (props= tableProperties )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==LPAREN) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // FromClauseParser.g:212:30: props= tableProperties
                    {
                    pushFollow(FOLLOW_tableProperties_in_tableSource1500);
                    props=gHiveParser.tableProperties();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableProperties.add(props.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:212:50: (ts= tableSample )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==KW_TABLESAMPLE) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // FromClauseParser.g:212:50: ts= tableSample
                    {
                    pushFollow(FOLLOW_tableSample_in_tableSource1505);
                    ts=tableSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:212:64: (asOf= asOfClause )?
            int alt39=2;
            int LA39_0 = input.LA(1);

            if ( (LA39_0==KW_FOR) ) {
                alt39=1;
            }
            switch (alt39) {
                case 1 :
                    // FromClauseParser.g:212:65: asOf= asOfClause
                    {
                    pushFollow(FOLLOW_asOfClause_in_tableSource1511);
                    asOf=asOfClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_asOfClause.add(asOf.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:212:83: ( ( KW_AS )? alias= identifier )?
            int alt41=2;
            alt41 = dfa41.predict(input);
            switch (alt41) {
                case 1 :
                    // FromClauseParser.g:212:84: ( KW_AS )? alias= identifier
                    {
                    // FromClauseParser.g:212:84: ( KW_AS )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==KW_AS) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // FromClauseParser.g:212:84: KW_AS
                            {
                            KW_AS124=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_tableSource1516); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS124);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_tableSource1521);
                    alias=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: ts, props, tabname, asOf, alias
            // token labels: 
            // rule labels: tabname, asOf, alias, retval, ts, props
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.tree:null);
            RewriteRuleSubtreeStream stream_asOf=new RewriteRuleSubtreeStream(adaptor,"rule asOf",asOf!=null?asOf.tree:null);
            RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.tree:null);
            RewriteRuleSubtreeStream stream_props=new RewriteRuleSubtreeStream(adaptor,"rule props",props!=null?props.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 213:5: -> ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ( $asOf)? )
            {
                // FromClauseParser.g:213:8: ^( TOK_TABREF $tabname ( $props)? ( $ts)? ( $alias)? ( $asOf)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABREF, "TOK_TABREF")
                , root_1);

                adaptor.addChild(root_1, stream_tabname.nextTree());

                // FromClauseParser.g:213:31: ( $props)?
                if ( stream_props.hasNext() ) {
                    adaptor.addChild(root_1, stream_props.nextTree());

                }
                stream_props.reset();

                // FromClauseParser.g:213:39: ( $ts)?
                if ( stream_ts.hasNext() ) {
                    adaptor.addChild(root_1, stream_ts.nextTree());

                }
                stream_ts.reset();

                // FromClauseParser.g:213:44: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

                // FromClauseParser.g:213:52: ( $asOf)?
                if ( stream_asOf.hasNext() ) {
                    adaptor.addChild(root_1, stream_asOf.nextTree());

                }
                stream_asOf.reset();

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
    // $ANTLR end "tableSource"


    public static class asOfClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "asOfClause"
    // FromClauseParser.g:216:1: asOfClause : ( ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= expression ) -> ^( TOK_AS_OF_TIME $asOfTime) | ( KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF asOfVersion= expression ) -> ^( TOK_AS_OF_VERSION $asOfVersion) );
    public final HiveParser_FromClauseParser.asOfClause_return asOfClause() throws RecognitionException {
        HiveParser_FromClauseParser.asOfClause_return retval = new HiveParser_FromClauseParser.asOfClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_FOR125=null;
        Token KW_SYSTEM_TIME126=null;
        Token KW_AS127=null;
        Token KW_OF128=null;
        Token KW_FOR129=null;
        Token KW_SYSTEM_VERSION130=null;
        Token KW_AS131=null;
        Token KW_OF132=null;
        HiveParser_IdentifiersParser.expression_return asOfTime =null;

        HiveParser_IdentifiersParser.expression_return asOfVersion =null;


        ASTNode KW_FOR125_tree=null;
        ASTNode KW_SYSTEM_TIME126_tree=null;
        ASTNode KW_AS127_tree=null;
        ASTNode KW_OF128_tree=null;
        ASTNode KW_FOR129_tree=null;
        ASTNode KW_SYSTEM_VERSION130_tree=null;
        ASTNode KW_AS131_tree=null;
        ASTNode KW_OF132_tree=null;
        RewriteRuleTokenStream stream_KW_OF=new RewriteRuleTokenStream(adaptor,"token KW_OF");
        RewriteRuleTokenStream stream_KW_FOR=new RewriteRuleTokenStream(adaptor,"token KW_FOR");
        RewriteRuleTokenStream stream_KW_SYSTEM_VERSION=new RewriteRuleTokenStream(adaptor,"token KW_SYSTEM_VERSION");
        RewriteRuleTokenStream stream_KW_SYSTEM_TIME=new RewriteRuleTokenStream(adaptor,"token KW_SYSTEM_TIME");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
         gParent.pushMsg("as of system_time / system_version clause for table", state); 
        try {
            // FromClauseParser.g:219:5: ( ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= expression ) -> ^( TOK_AS_OF_TIME $asOfTime) | ( KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF asOfVersion= expression ) -> ^( TOK_AS_OF_VERSION $asOfVersion) )
            int alt42=2;
            int LA42_0 = input.LA(1);

            if ( (LA42_0==KW_FOR) ) {
                int LA42_1 = input.LA(2);

                if ( (LA42_1==KW_SYSTEM_TIME) ) {
                    alt42=1;
                }
                else if ( (LA42_1==KW_SYSTEM_VERSION) ) {
                    alt42=2;
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 42, 1, input);

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
                    // FromClauseParser.g:220:5: ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= expression )
                    {
                    // FromClauseParser.g:220:5: ( KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= expression )
                    // FromClauseParser.g:220:6: KW_FOR KW_SYSTEM_TIME KW_AS KW_OF asOfTime= expression
                    {
                    KW_FOR125=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_asOfClause1584); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR125);


                    KW_SYSTEM_TIME126=(Token)match(input,KW_SYSTEM_TIME,FOLLOW_KW_SYSTEM_TIME_in_asOfClause1586); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SYSTEM_TIME.add(KW_SYSTEM_TIME126);


                    KW_AS127=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_asOfClause1588); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS127);


                    KW_OF128=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_asOfClause1590); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF128);


                    pushFollow(FOLLOW_expression_in_asOfClause1594);
                    asOfTime=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(asOfTime.getTree());

                    }


                    // AST REWRITE
                    // elements: asOfTime
                    // token labels: 
                    // rule labels: asOfTime, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_asOfTime=new RewriteRuleSubtreeStream(adaptor,"rule asOfTime",asOfTime!=null?asOfTime.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 221:5: -> ^( TOK_AS_OF_TIME $asOfTime)
                    {
                        // FromClauseParser.g:221:8: ^( TOK_AS_OF_TIME $asOfTime)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_AS_OF_TIME, "TOK_AS_OF_TIME")
                        , root_1);

                        adaptor.addChild(root_1, stream_asOfTime.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:223:5: ( KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF asOfVersion= expression )
                    {
                    // FromClauseParser.g:223:5: ( KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF asOfVersion= expression )
                    // FromClauseParser.g:223:6: KW_FOR KW_SYSTEM_VERSION KW_AS KW_OF asOfVersion= expression
                    {
                    KW_FOR129=(Token)match(input,KW_FOR,FOLLOW_KW_FOR_in_asOfClause1621); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_FOR.add(KW_FOR129);


                    KW_SYSTEM_VERSION130=(Token)match(input,KW_SYSTEM_VERSION,FOLLOW_KW_SYSTEM_VERSION_in_asOfClause1623); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_SYSTEM_VERSION.add(KW_SYSTEM_VERSION130);


                    KW_AS131=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_asOfClause1625); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS131);


                    KW_OF132=(Token)match(input,KW_OF,FOLLOW_KW_OF_in_asOfClause1627); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_OF.add(KW_OF132);


                    pushFollow(FOLLOW_expression_in_asOfClause1631);
                    asOfVersion=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(asOfVersion.getTree());

                    }


                    // AST REWRITE
                    // elements: asOfVersion
                    // token labels: 
                    // rule labels: asOfVersion, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_asOfVersion=new RewriteRuleSubtreeStream(adaptor,"rule asOfVersion",asOfVersion!=null?asOfVersion.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 224:5: -> ^( TOK_AS_OF_VERSION $asOfVersion)
                    {
                        // FromClauseParser.g:224:8: ^( TOK_AS_OF_VERSION $asOfVersion)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_AS_OF_VERSION, "TOK_AS_OF_VERSION")
                        , root_1);

                        adaptor.addChild(root_1, stream_asOfVersion.nextTree());

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
    // $ANTLR end "asOfClause"


    public static class uniqueJoinTableSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "uniqueJoinTableSource"
    // FromClauseParser.g:227:1: uniqueJoinTableSource : tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) ;
    public final HiveParser_FromClauseParser.uniqueJoinTableSource_return uniqueJoinTableSource() throws RecognitionException {
        HiveParser_FromClauseParser.uniqueJoinTableSource_return retval = new HiveParser_FromClauseParser.uniqueJoinTableSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_AS133=null;
        HiveParser_FromClauseParser.tableName_return tabname =null;

        HiveParser_FromClauseParser.tableSample_return ts =null;

        HiveParser_IdentifiersParser.identifier_return alias =null;


        ASTNode KW_AS133_tree=null;
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_tableSample=new RewriteRuleSubtreeStream(adaptor,"rule tableSample");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_tableName=new RewriteRuleSubtreeStream(adaptor,"rule tableName");
         gParent.pushMsg("unique join table source", state); 
        try {
            // FromClauseParser.g:230:5: (tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )? -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? ) )
            // FromClauseParser.g:230:7: tabname= tableName (ts= tableSample )? ( ( KW_AS )? alias= identifier )?
            {
            pushFollow(FOLLOW_tableName_in_uniqueJoinTableSource1674);
            tabname=tableName();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableName.add(tabname.getTree());

            // FromClauseParser.g:230:27: (ts= tableSample )?
            int alt43=2;
            int LA43_0 = input.LA(1);

            if ( (LA43_0==KW_TABLESAMPLE) ) {
                alt43=1;
            }
            switch (alt43) {
                case 1 :
                    // FromClauseParser.g:230:27: ts= tableSample
                    {
                    pushFollow(FOLLOW_tableSample_in_uniqueJoinTableSource1678);
                    ts=tableSample();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_tableSample.add(ts.getTree());

                    }
                    break;

            }


            // FromClauseParser.g:230:41: ( ( KW_AS )? alias= identifier )?
            int alt45=2;
            int LA45_0 = input.LA(1);

            if ( (LA45_0==Identifier||(LA45_0 >= KW_ABORT && LA45_0 <= KW_AFTER)||LA45_0==KW_ALLOC_FRACTION||LA45_0==KW_ANALYZE||LA45_0==KW_ARCHIVE||(LA45_0 >= KW_AS && LA45_0 <= KW_AT)||(LA45_0 >= KW_AUTOCOMMIT && LA45_0 <= KW_BEFORE)||(LA45_0 >= KW_BRANCH && LA45_0 <= KW_BUCKETS)||(LA45_0 >= KW_CACHE && LA45_0 <= KW_CASCADE)||(LA45_0 >= KW_CBO && LA45_0 <= KW_CHANGE)||LA45_0==KW_CHECK||(LA45_0 >= KW_CLUSTER && LA45_0 <= KW_COLLECTION)||(LA45_0 >= KW_COLUMNS && LA45_0 <= KW_COMMENT)||(LA45_0 >= KW_COMPACT && LA45_0 <= KW_COMPACTIONS)||(LA45_0 >= KW_COMPUTE && LA45_0 <= KW_CONCATENATE)||LA45_0==KW_CONTINUE||LA45_0==KW_COST||LA45_0==KW_CRON||LA45_0==KW_DATA||LA45_0==KW_DATABASES||(LA45_0 >= KW_DATETIME && LA45_0 <= KW_DCPROPERTIES)||LA45_0==KW_DEBUG||(LA45_0 >= KW_DEFAULT && LA45_0 <= KW_DEFINED)||(LA45_0 >= KW_DELIMITED && LA45_0 <= KW_DESC)||(LA45_0 >= KW_DETAIL && LA45_0 <= KW_DISABLE)||(LA45_0 >= KW_DISTRIBUTE && LA45_0 <= KW_DO)||LA45_0==KW_DOW||(LA45_0 >= KW_DUMP && LA45_0 <= KW_ELEM_TYPE)||LA45_0==KW_ENABLE||(LA45_0 >= KW_ENFORCED && LA45_0 <= KW_EVERY)||(LA45_0 >= KW_EXCLUSIVE && LA45_0 <= KW_EXECUTED)||(LA45_0 >= KW_EXPIRE_SNAPSHOTS && LA45_0 <= KW_EXPRESSION)||LA45_0==KW_FAST_FORWARD||(LA45_0 >= KW_FIELDS && LA45_0 <= KW_FIRST)||(LA45_0 >= KW_FORMAT && LA45_0 <= KW_FORMATTED)||LA45_0==KW_FUNCTIONS||(LA45_0 >= KW_HOUR && LA45_0 <= KW_IDXPROPERTIES)||LA45_0==KW_IGNORE||(LA45_0 >= KW_INDEX && LA45_0 <= KW_INDEXES)||(LA45_0 >= KW_INPATH && LA45_0 <= KW_INPUTFORMAT)||(LA45_0 >= KW_ISOLATION && LA45_0 <= KW_JAR)||(LA45_0 >= KW_JOINCOST && LA45_0 <= KW_LAST)||LA45_0==KW_LEVEL||(LA45_0 >= KW_LIMIT && LA45_0 <= KW_LOAD)||(LA45_0 >= KW_LOCATION && LA45_0 <= KW_LONG)||(LA45_0 >= KW_MANAGED && LA45_0 <= KW_MANAGEMENT)||(LA45_0 >= KW_MAPJOIN && LA45_0 <= KW_MATERIALIZED)||LA45_0==KW_METADATA||(LA45_0 >= KW_MINUTE && LA45_0 <= KW_MONTH)||(LA45_0 >= KW_MOVE && LA45_0 <= KW_MSCK)||(LA45_0 >= KW_NORELY && LA45_0 <= KW_NOSCAN)||LA45_0==KW_NOVALIDATE||LA45_0==KW_NULLS||LA45_0==KW_OFFSET||(LA45_0 >= KW_OPERATOR && LA45_0 <= KW_OPTION)||(LA45_0 >= KW_OUTPUTDRIVER && LA45_0 <= KW_OUTPUTFORMAT)||(LA45_0 >= KW_OVERWRITE && LA45_0 <= KW_OWNER)||(LA45_0 >= KW_PARTITIONED && LA45_0 <= KW_PATH)||(LA45_0 >= KW_PLAN && LA45_0 <= KW_POOL)||LA45_0==KW_PRINCIPALS||LA45_0==KW_PURGE||(LA45_0 >= KW_QUARTER && LA45_0 <= KW_QUERY_PARALLELISM)||LA45_0==KW_READ||(LA45_0 >= KW_REBUILD && LA45_0 <= KW_RECORDWRITER)||(LA45_0 >= KW_RELOAD && LA45_0 <= KW_RETENTION)||LA45_0==KW_REWRITE||(LA45_0 >= KW_ROLE && LA45_0 <= KW_ROLES)||(LA45_0 >= KW_SCHEDULED && LA45_0 <= KW_SECOND)||(LA45_0 >= KW_SEMI && LA45_0 <= KW_SERVER)||(LA45_0 >= KW_SETS && LA45_0 <= KW_SKEWED)||(LA45_0 >= KW_SNAPSHOT && LA45_0 <= KW_SNAPSHOTS)||(LA45_0 >= KW_SORT && LA45_0 <= KW_SSL)||(LA45_0 >= KW_STATISTICS && LA45_0 <= KW_SUMMARY)||(LA45_0 >= KW_SYSTEM_TIME && LA45_0 <= KW_SYSTEM_VERSION)||LA45_0==KW_TABLES||(LA45_0 >= KW_TAG && LA45_0 <= KW_TERMINATED)||LA45_0==KW_TINYINT||LA45_0==KW_TOUCH||(LA45_0 >= KW_TRANSACTION && LA45_0 <= KW_TRANSACTIONS)||LA45_0==KW_TRIM||(LA45_0 >= KW_TYPE && LA45_0 <= KW_UNARCHIVE)||LA45_0==KW_UNDO||LA45_0==KW_UNIONTYPE||(LA45_0 >= KW_UNKNOWN && LA45_0 <= KW_UNSIGNED)||(LA45_0 >= KW_URI && LA45_0 <= KW_USE)||(LA45_0 >= KW_UTC && LA45_0 <= KW_VALIDATE)||LA45_0==KW_VALUE_TYPE||(LA45_0 >= KW_VECTORIZATION && LA45_0 <= KW_WEEK)||LA45_0==KW_WHILE||(LA45_0 >= KW_WITHIN && LA45_0 <= KW_ZONE)||LA45_0==KW_BATCH||LA45_0==KW_DAYOFWEEK||LA45_0==KW_HOLD_DDLTIME||LA45_0==KW_NO_DROP||LA45_0==KW_OFFLINE||LA45_0==KW_PROTECTION||LA45_0==KW_READONLY||LA45_0==KW_TIMESTAMPTZ) ) {
                alt45=1;
            }
            switch (alt45) {
                case 1 :
                    // FromClauseParser.g:230:42: ( KW_AS )? alias= identifier
                    {
                    // FromClauseParser.g:230:42: ( KW_AS )?
                    int alt44=2;
                    int LA44_0 = input.LA(1);

                    if ( (LA44_0==KW_AS) ) {
                        alt44=1;
                    }
                    switch (alt44) {
                        case 1 :
                            // FromClauseParser.g:230:42: KW_AS
                            {
                            KW_AS133=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_uniqueJoinTableSource1682); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS133);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_identifier_in_uniqueJoinTableSource1687);
                    alias=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: alias, tabname, ts
            // token labels: 
            // rule labels: tabname, alias, retval, ts
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_tabname=new RewriteRuleSubtreeStream(adaptor,"rule tabname",tabname!=null?tabname.tree:null);
            RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);
            RewriteRuleSubtreeStream stream_ts=new RewriteRuleSubtreeStream(adaptor,"rule ts",ts!=null?ts.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 231:5: -> ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
            {
                // FromClauseParser.g:231:8: ^( TOK_TABREF $tabname ( $ts)? ( $alias)? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABREF, "TOK_TABREF")
                , root_1);

                adaptor.addChild(root_1, stream_tabname.nextTree());

                // FromClauseParser.g:231:31: ( $ts)?
                if ( stream_ts.hasNext() ) {
                    adaptor.addChild(root_1, stream_ts.nextTree());

                }
                stream_ts.reset();

                // FromClauseParser.g:231:36: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

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
    // $ANTLR end "uniqueJoinTableSource"


    public static class tableName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "tableName"
    // FromClauseParser.g:234:1: tableName : (db= identifier DOT tab= identifier ( DOT meta= identifier )? -> ^( TOK_TABNAME $db $tab ( $meta)? ) |tab= identifier -> ^( TOK_TABNAME $tab) );
    public final HiveParser_FromClauseParser.tableName_return tableName() throws RecognitionException {
        HiveParser_FromClauseParser.tableName_return retval = new HiveParser_FromClauseParser.tableName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token DOT134=null;
        Token DOT135=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return tab =null;

        HiveParser_IdentifiersParser.identifier_return meta =null;


        ASTNode DOT134_tree=null;
        ASTNode DOT135_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("table name", state); 
        try {
            // FromClauseParser.g:237:5: (db= identifier DOT tab= identifier ( DOT meta= identifier )? -> ^( TOK_TABNAME $db $tab ( $meta)? ) |tab= identifier -> ^( TOK_TABNAME $tab) )
            int alt47=2;
            alt47 = dfa47.predict(input);
            switch (alt47) {
                case 1 :
                    // FromClauseParser.g:238:5: db= identifier DOT tab= identifier ( DOT meta= identifier )?
                    {
                    pushFollow(FOLLOW_identifier_in_tableName1743);
                    db=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT134=(Token)match(input,DOT,FOLLOW_DOT_in_tableName1745); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT134);


                    pushFollow(FOLLOW_identifier_in_tableName1749);
                    tab=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());

                    // FromClauseParser.g:238:38: ( DOT meta= identifier )?
                    int alt46=2;
                    alt46 = dfa46.predict(input);
                    switch (alt46) {
                        case 1 :
                            // FromClauseParser.g:238:39: DOT meta= identifier
                            {
                            DOT135=(Token)match(input,DOT,FOLLOW_DOT_in_tableName1752); if (state.failed) return retval; 
                            if ( state.backtracking==0 ) stream_DOT.add(DOT135);


                            pushFollow(FOLLOW_identifier_in_tableName1756);
                            meta=gHiveParser.identifier();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_identifier.add(meta.getTree());

                            }
                            break;

                    }


                    if ( state.backtracking==0 ) {tables.add(new ImmutablePair<>((db!=null?input.toString(db.start,db.stop):null), (tab!=null?input.toString(tab.start,tab.stop):null)));}

                    // AST REWRITE
                    // elements: tab, db, meta
                    // token labels: 
                    // rule labels: tab, meta, db, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.tree:null);
                    RewriteRuleSubtreeStream stream_meta=new RewriteRuleSubtreeStream(adaptor,"rule meta",meta!=null?meta.tree:null);
                    RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 240:5: -> ^( TOK_TABNAME $db $tab ( $meta)? )
                    {
                        // FromClauseParser.g:240:8: ^( TOK_TABNAME $db $tab ( $meta)? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_db.nextTree());

                        adaptor.addChild(root_1, stream_tab.nextTree());

                        // FromClauseParser.g:240:32: ( $meta)?
                        if ( stream_meta.hasNext() ) {
                            adaptor.addChild(root_1, stream_meta.nextTree());

                        }
                        stream_meta.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:242:5: tab= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_tableName1798);
                    tab=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(tab.getTree());

                    if ( state.backtracking==0 ) {tables.add(new ImmutablePair<>(null, (tab!=null?input.toString(tab.start,tab.stop):null)));}

                    // AST REWRITE
                    // elements: tab
                    // token labels: 
                    // rule labels: tab, retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_tab=new RewriteRuleSubtreeStream(adaptor,"rule tab",tab!=null?tab.tree:null);
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 244:5: -> ^( TOK_TABNAME $tab)
                    {
                        // FromClauseParser.g:244:8: ^( TOK_TABNAME $tab)
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                        , root_1);

                        adaptor.addChild(root_1, stream_tab.nextTree());

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
    // $ANTLR end "tableName"


    public static class viewName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "viewName"
    // FromClauseParser.g:247:1: viewName : (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) ;
    public final HiveParser_FromClauseParser.viewName_return viewName() throws RecognitionException {
        HiveParser_FromClauseParser.viewName_return retval = new HiveParser_FromClauseParser.viewName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token DOT136=null;
        HiveParser_IdentifiersParser.identifier_return db =null;

        HiveParser_IdentifiersParser.identifier_return view =null;


        ASTNode DOT136_tree=null;
        RewriteRuleTokenStream stream_DOT=new RewriteRuleTokenStream(adaptor,"token DOT");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
         gParent.pushMsg("view name", state); 
        try {
            // FromClauseParser.g:250:5: ( (db= identifier DOT )? view= identifier -> ^( TOK_TABNAME ( $db)? $view) )
            // FromClauseParser.g:251:5: (db= identifier DOT )? view= identifier
            {
            // FromClauseParser.g:251:5: (db= identifier DOT )?
            int alt48=2;
            int LA48_0 = input.LA(1);

            if ( (LA48_0==Identifier) ) {
                int LA48_1 = input.LA(2);

                if ( (LA48_1==DOT) ) {
                    alt48=1;
                }
            }
            else if ( ((LA48_0 >= KW_ABORT && LA48_0 <= KW_AFTER)||LA48_0==KW_ALLOC_FRACTION||LA48_0==KW_ANALYZE||LA48_0==KW_ARCHIVE||(LA48_0 >= KW_ASC && LA48_0 <= KW_AT)||(LA48_0 >= KW_AUTOCOMMIT && LA48_0 <= KW_BEFORE)||(LA48_0 >= KW_BRANCH && LA48_0 <= KW_BUCKETS)||(LA48_0 >= KW_CACHE && LA48_0 <= KW_CASCADE)||(LA48_0 >= KW_CBO && LA48_0 <= KW_CHANGE)||LA48_0==KW_CHECK||(LA48_0 >= KW_CLUSTER && LA48_0 <= KW_COLLECTION)||(LA48_0 >= KW_COLUMNS && LA48_0 <= KW_COMMENT)||(LA48_0 >= KW_COMPACT && LA48_0 <= KW_COMPACTIONS)||(LA48_0 >= KW_COMPUTE && LA48_0 <= KW_CONCATENATE)||LA48_0==KW_CONTINUE||LA48_0==KW_COST||LA48_0==KW_CRON||LA48_0==KW_DATA||LA48_0==KW_DATABASES||(LA48_0 >= KW_DATETIME && LA48_0 <= KW_DCPROPERTIES)||LA48_0==KW_DEBUG||(LA48_0 >= KW_DEFAULT && LA48_0 <= KW_DEFINED)||(LA48_0 >= KW_DELIMITED && LA48_0 <= KW_DESC)||(LA48_0 >= KW_DETAIL && LA48_0 <= KW_DISABLE)||(LA48_0 >= KW_DISTRIBUTE && LA48_0 <= KW_DO)||LA48_0==KW_DOW||(LA48_0 >= KW_DUMP && LA48_0 <= KW_ELEM_TYPE)||LA48_0==KW_ENABLE||(LA48_0 >= KW_ENFORCED && LA48_0 <= KW_EVERY)||(LA48_0 >= KW_EXCLUSIVE && LA48_0 <= KW_EXECUTED)||(LA48_0 >= KW_EXPIRE_SNAPSHOTS && LA48_0 <= KW_EXPRESSION)||LA48_0==KW_FAST_FORWARD||(LA48_0 >= KW_FIELDS && LA48_0 <= KW_FIRST)||(LA48_0 >= KW_FORMAT && LA48_0 <= KW_FORMATTED)||LA48_0==KW_FUNCTIONS||(LA48_0 >= KW_HOUR && LA48_0 <= KW_IDXPROPERTIES)||LA48_0==KW_IGNORE||(LA48_0 >= KW_INDEX && LA48_0 <= KW_INDEXES)||(LA48_0 >= KW_INPATH && LA48_0 <= KW_INPUTFORMAT)||(LA48_0 >= KW_ISOLATION && LA48_0 <= KW_JAR)||(LA48_0 >= KW_JOINCOST && LA48_0 <= KW_LAST)||LA48_0==KW_LEVEL||(LA48_0 >= KW_LIMIT && LA48_0 <= KW_LOAD)||(LA48_0 >= KW_LOCATION && LA48_0 <= KW_LONG)||(LA48_0 >= KW_MANAGED && LA48_0 <= KW_MANAGEMENT)||(LA48_0 >= KW_MAPJOIN && LA48_0 <= KW_MATERIALIZED)||LA48_0==KW_METADATA||(LA48_0 >= KW_MINUTE && LA48_0 <= KW_MONTH)||(LA48_0 >= KW_MOVE && LA48_0 <= KW_MSCK)||(LA48_0 >= KW_NORELY && LA48_0 <= KW_NOSCAN)||LA48_0==KW_NOVALIDATE||LA48_0==KW_NULLS||LA48_0==KW_OFFSET||(LA48_0 >= KW_OPERATOR && LA48_0 <= KW_OPTION)||(LA48_0 >= KW_OUTPUTDRIVER && LA48_0 <= KW_OUTPUTFORMAT)||(LA48_0 >= KW_OVERWRITE && LA48_0 <= KW_OWNER)||(LA48_0 >= KW_PARTITIONED && LA48_0 <= KW_PATH)||(LA48_0 >= KW_PLAN && LA48_0 <= KW_POOL)||LA48_0==KW_PRINCIPALS||LA48_0==KW_PURGE||(LA48_0 >= KW_QUARTER && LA48_0 <= KW_QUERY_PARALLELISM)||LA48_0==KW_READ||(LA48_0 >= KW_REBUILD && LA48_0 <= KW_RECORDWRITER)||(LA48_0 >= KW_RELOAD && LA48_0 <= KW_RETENTION)||LA48_0==KW_REWRITE||(LA48_0 >= KW_ROLE && LA48_0 <= KW_ROLES)||(LA48_0 >= KW_SCHEDULED && LA48_0 <= KW_SECOND)||(LA48_0 >= KW_SEMI && LA48_0 <= KW_SERVER)||(LA48_0 >= KW_SETS && LA48_0 <= KW_SKEWED)||(LA48_0 >= KW_SNAPSHOT && LA48_0 <= KW_SNAPSHOTS)||(LA48_0 >= KW_SORT && LA48_0 <= KW_SSL)||(LA48_0 >= KW_STATISTICS && LA48_0 <= KW_SUMMARY)||(LA48_0 >= KW_SYSTEM_TIME && LA48_0 <= KW_SYSTEM_VERSION)||LA48_0==KW_TABLES||(LA48_0 >= KW_TAG && LA48_0 <= KW_TERMINATED)||LA48_0==KW_TINYINT||LA48_0==KW_TOUCH||(LA48_0 >= KW_TRANSACTION && LA48_0 <= KW_TRANSACTIONS)||LA48_0==KW_TRIM||(LA48_0 >= KW_TYPE && LA48_0 <= KW_UNARCHIVE)||LA48_0==KW_UNDO||LA48_0==KW_UNIONTYPE||(LA48_0 >= KW_UNKNOWN && LA48_0 <= KW_UNSIGNED)||(LA48_0 >= KW_URI && LA48_0 <= KW_USE)||(LA48_0 >= KW_UTC && LA48_0 <= KW_VALIDATE)||LA48_0==KW_VALUE_TYPE||(LA48_0 >= KW_VECTORIZATION && LA48_0 <= KW_WEEK)||LA48_0==KW_WHILE||(LA48_0 >= KW_WITHIN && LA48_0 <= KW_ZONE)||LA48_0==KW_BATCH||LA48_0==KW_DAYOFWEEK||LA48_0==KW_HOLD_DDLTIME||LA48_0==KW_NO_DROP||LA48_0==KW_OFFLINE||LA48_0==KW_PROTECTION||LA48_0==KW_READONLY||LA48_0==KW_TIMESTAMPTZ) ) {
                int LA48_2 = input.LA(2);

                if ( (LA48_2==DOT) ) {
                    alt48=1;
                }
            }
            switch (alt48) {
                case 1 :
                    // FromClauseParser.g:251:6: db= identifier DOT
                    {
                    pushFollow(FOLLOW_identifier_in_viewName1851);
                    db=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(db.getTree());

                    DOT136=(Token)match(input,DOT,FOLLOW_DOT_in_viewName1853); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_DOT.add(DOT136);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_viewName1859);
            view=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(view.getTree());

            // AST REWRITE
            // elements: db, view
            // token labels: 
            // rule labels: view, db, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_view=new RewriteRuleSubtreeStream(adaptor,"rule view",view!=null?view.tree:null);
            RewriteRuleSubtreeStream stream_db=new RewriteRuleSubtreeStream(adaptor,"rule db",db!=null?db.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 252:5: -> ^( TOK_TABNAME ( $db)? $view)
            {
                // FromClauseParser.g:252:8: ^( TOK_TABNAME ( $db)? $view)
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_TABNAME, "TOK_TABNAME")
                , root_1);

                // FromClauseParser.g:252:23: ( $db)?
                if ( stream_db.hasNext() ) {
                    adaptor.addChild(root_1, stream_db.nextTree());

                }
                stream_db.reset();

                adaptor.addChild(root_1, stream_view.nextTree());

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
    // $ANTLR end "viewName"


    public static class subQuerySource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "subQuerySource"
    // FromClauseParser.g:255:1: subQuerySource : LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) ;
    public final HiveParser_FromClauseParser.subQuerySource_return subQuerySource() throws RecognitionException {
        HiveParser_FromClauseParser.subQuerySource_return retval = new HiveParser_FromClauseParser.subQuerySource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN137=null;
        Token RPAREN139=null;
        Token KW_AS140=null;
        HiveParser.queryStatementExpression_return queryStatementExpression138 =null;

        HiveParser_IdentifiersParser.identifier_return identifier141 =null;


        ASTNode LPAREN137_tree=null;
        ASTNode RPAREN139_tree=null;
        ASTNode KW_AS140_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_queryStatementExpression=new RewriteRuleSubtreeStream(adaptor,"rule queryStatementExpression");
         gParent.pushMsg("subquery source", state); 
        try {
            // FromClauseParser.g:258:5: ( LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier -> ^( TOK_SUBQUERY queryStatementExpression identifier ) )
            // FromClauseParser.g:259:5: LPAREN queryStatementExpression RPAREN ( KW_AS )? identifier
            {
            LPAREN137=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subQuerySource1907); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN137);


            pushFollow(FOLLOW_queryStatementExpression_in_subQuerySource1909);
            queryStatementExpression138=gHiveParser.queryStatementExpression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_queryStatementExpression.add(queryStatementExpression138.getTree());

            RPAREN139=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subQuerySource1911); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN139);


            // FromClauseParser.g:259:44: ( KW_AS )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==KW_AS) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // FromClauseParser.g:259:44: KW_AS
                    {
                    KW_AS140=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_subQuerySource1913); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS140);


                    }
                    break;

            }


            pushFollow(FOLLOW_identifier_in_subQuerySource1916);
            identifier141=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(identifier141.getTree());

            // AST REWRITE
            // elements: identifier, queryStatementExpression
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 259:62: -> ^( TOK_SUBQUERY queryStatementExpression identifier )
            {
                // FromClauseParser.g:259:65: ^( TOK_SUBQUERY queryStatementExpression identifier )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY")
                , root_1);

                adaptor.addChild(root_1, stream_queryStatementExpression.nextTree());

                adaptor.addChild(root_1, stream_identifier.nextTree());

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
    // $ANTLR end "subQuerySource"


    public static class partitioningSpec_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitioningSpec"
    // FromClauseParser.g:263:1: partitioningSpec : ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) );
    public final HiveParser_FromClauseParser.partitioningSpec_return partitioningSpec() throws RecognitionException {
        HiveParser_FromClauseParser.partitioningSpec_return retval = new HiveParser_FromClauseParser.partitioningSpec_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.partitionByClause_return partitionByClause142 =null;

        HiveParser_IdentifiersParser.orderByClause_return orderByClause143 =null;

        HiveParser_IdentifiersParser.orderByClause_return orderByClause144 =null;

        HiveParser_IdentifiersParser.distributeByClause_return distributeByClause145 =null;

        HiveParser_IdentifiersParser.sortByClause_return sortByClause146 =null;

        HiveParser_IdentifiersParser.sortByClause_return sortByClause147 =null;

        HiveParser_IdentifiersParser.clusterByClause_return clusterByClause148 =null;


        RewriteRuleSubtreeStream stream_clusterByClause=new RewriteRuleSubtreeStream(adaptor,"rule clusterByClause");
        RewriteRuleSubtreeStream stream_sortByClause=new RewriteRuleSubtreeStream(adaptor,"rule sortByClause");
        RewriteRuleSubtreeStream stream_partitionByClause=new RewriteRuleSubtreeStream(adaptor,"rule partitionByClause");
        RewriteRuleSubtreeStream stream_distributeByClause=new RewriteRuleSubtreeStream(adaptor,"rule distributeByClause");
        RewriteRuleSubtreeStream stream_orderByClause=new RewriteRuleSubtreeStream(adaptor,"rule orderByClause");
         gParent.pushMsg("partitioningSpec clause", state); 
        try {
            // FromClauseParser.g:266:4: ( partitionByClause ( orderByClause )? -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? ) | orderByClause -> ^( TOK_PARTITIONINGSPEC orderByClause ) | distributeByClause ( sortByClause )? -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? ) | sortByClause -> ^( TOK_PARTITIONINGSPEC sortByClause ) | clusterByClause -> ^( TOK_PARTITIONINGSPEC clusterByClause ) )
            int alt52=5;
            switch ( input.LA(1) ) {
            case KW_PARTITION:
                {
                alt52=1;
                }
                break;
            case KW_ORDER:
                {
                alt52=2;
                }
                break;
            case KW_DISTRIBUTE:
                {
                alt52=3;
                }
                break;
            case KW_SORT:
                {
                alt52=4;
                }
                break;
            case KW_CLUSTER:
                {
                alt52=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 52, 0, input);

                throw nvae;

            }

            switch (alt52) {
                case 1 :
                    // FromClauseParser.g:267:4: partitionByClause ( orderByClause )?
                    {
                    pushFollow(FOLLOW_partitionByClause_in_partitioningSpec1957);
                    partitionByClause142=gHiveParser.partitionByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitionByClause.add(partitionByClause142.getTree());

                    // FromClauseParser.g:267:22: ( orderByClause )?
                    int alt50=2;
                    int LA50_0 = input.LA(1);

                    if ( (LA50_0==KW_ORDER) ) {
                        alt50=1;
                    }
                    switch (alt50) {
                        case 1 :
                            // FromClauseParser.g:267:22: orderByClause
                            {
                            pushFollow(FOLLOW_orderByClause_in_partitioningSpec1959);
                            orderByClause143=gHiveParser.orderByClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause143.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: partitionByClause, orderByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 267:37: -> ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
                    {
                        // FromClauseParser.g:267:40: ^( TOK_PARTITIONINGSPEC partitionByClause ( orderByClause )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_partitionByClause.nextTree());

                        // FromClauseParser.g:267:81: ( orderByClause )?
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
                    break;
                case 2 :
                    // FromClauseParser.g:268:4: orderByClause
                    {
                    pushFollow(FOLLOW_orderByClause_in_partitioningSpec1978);
                    orderByClause144=gHiveParser.orderByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_orderByClause.add(orderByClause144.getTree());

                    // AST REWRITE
                    // elements: orderByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 268:18: -> ^( TOK_PARTITIONINGSPEC orderByClause )
                    {
                        // FromClauseParser.g:268:21: ^( TOK_PARTITIONINGSPEC orderByClause )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_orderByClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:269:4: distributeByClause ( sortByClause )?
                    {
                    pushFollow(FOLLOW_distributeByClause_in_partitioningSpec1993);
                    distributeByClause145=gHiveParser.distributeByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_distributeByClause.add(distributeByClause145.getTree());

                    // FromClauseParser.g:269:23: ( sortByClause )?
                    int alt51=2;
                    int LA51_0 = input.LA(1);

                    if ( (LA51_0==KW_SORT) ) {
                        alt51=1;
                    }
                    switch (alt51) {
                        case 1 :
                            // FromClauseParser.g:269:23: sortByClause
                            {
                            pushFollow(FOLLOW_sortByClause_in_partitioningSpec1995);
                            sortByClause146=gHiveParser.sortByClause();

                            state._fsp--;
                            if (state.failed) return retval;
                            if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause146.getTree());

                            }
                            break;

                    }


                    // AST REWRITE
                    // elements: distributeByClause, sortByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 269:37: -> ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
                    {
                        // FromClauseParser.g:269:40: ^( TOK_PARTITIONINGSPEC distributeByClause ( sortByClause )? )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_distributeByClause.nextTree());

                        // FromClauseParser.g:269:82: ( sortByClause )?
                        if ( stream_sortByClause.hasNext() ) {
                            adaptor.addChild(root_1, stream_sortByClause.nextTree());

                        }
                        stream_sortByClause.reset();

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 4 :
                    // FromClauseParser.g:270:4: sortByClause
                    {
                    pushFollow(FOLLOW_sortByClause_in_partitioningSpec2014);
                    sortByClause147=gHiveParser.sortByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_sortByClause.add(sortByClause147.getTree());

                    // AST REWRITE
                    // elements: sortByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 270:17: -> ^( TOK_PARTITIONINGSPEC sortByClause )
                    {
                        // FromClauseParser.g:270:20: ^( TOK_PARTITIONINGSPEC sortByClause )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_sortByClause.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;
                    }

                    }
                    break;
                case 5 :
                    // FromClauseParser.g:271:4: clusterByClause
                    {
                    pushFollow(FOLLOW_clusterByClause_in_partitioningSpec2029);
                    clusterByClause148=gHiveParser.clusterByClause();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_clusterByClause.add(clusterByClause148.getTree());

                    // AST REWRITE
                    // elements: clusterByClause
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    if ( state.backtracking==0 ) {

                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (ASTNode)adaptor.nil();
                    // 271:20: -> ^( TOK_PARTITIONINGSPEC clusterByClause )
                    {
                        // FromClauseParser.g:271:23: ^( TOK_PARTITIONINGSPEC clusterByClause )
                        {
                        ASTNode root_1 = (ASTNode)adaptor.nil();
                        root_1 = (ASTNode)adaptor.becomeRoot(
                        (ASTNode)adaptor.create(TOK_PARTITIONINGSPEC, "TOK_PARTITIONINGSPEC")
                        , root_1);

                        adaptor.addChild(root_1, stream_clusterByClause.nextTree());

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
    // $ANTLR end "partitioningSpec"


    public static class partitionTableFunctionSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionTableFunctionSource"
    // FromClauseParser.g:274:1: partitionTableFunctionSource : ( subQuerySource | tableSource | partitionedTableFunction );
    public final HiveParser_FromClauseParser.partitionTableFunctionSource_return partitionTableFunctionSource() throws RecognitionException {
        HiveParser_FromClauseParser.partitionTableFunctionSource_return retval = new HiveParser_FromClauseParser.partitionTableFunctionSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.subQuerySource_return subQuerySource149 =null;

        HiveParser_FromClauseParser.tableSource_return tableSource150 =null;

        HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction151 =null;



         gParent.pushMsg("partitionTableFunctionSource clause", state); 
        try {
            // FromClauseParser.g:277:4: ( subQuerySource | tableSource | partitionedTableFunction )
            int alt53=3;
            switch ( input.LA(1) ) {
            case LPAREN:
                {
                alt53=1;
                }
                break;
            case Identifier:
                {
                int LA53_2 = input.LA(2);

                if ( (LA53_2==EOF||LA53_2==DOT||LA53_2==Identifier||(LA53_2 >= KW_ABORT && LA53_2 <= KW_AFTER)||LA53_2==KW_ALLOC_FRACTION||LA53_2==KW_ANALYZE||LA53_2==KW_ARCHIVE||(LA53_2 >= KW_AS && LA53_2 <= KW_AT)||(LA53_2 >= KW_AUTOCOMMIT && LA53_2 <= KW_BEFORE)||(LA53_2 >= KW_BRANCH && LA53_2 <= KW_BUCKETS)||(LA53_2 >= KW_CACHE && LA53_2 <= KW_CASCADE)||(LA53_2 >= KW_CBO && LA53_2 <= KW_CHANGE)||LA53_2==KW_CHECK||(LA53_2 >= KW_CLUSTER && LA53_2 <= KW_COLLECTION)||(LA53_2 >= KW_COLUMNS && LA53_2 <= KW_COMMENT)||(LA53_2 >= KW_COMPACT && LA53_2 <= KW_COMPACTIONS)||(LA53_2 >= KW_COMPUTE && LA53_2 <= KW_CONCATENATE)||LA53_2==KW_CONTINUE||LA53_2==KW_COST||LA53_2==KW_CRON||LA53_2==KW_DATA||LA53_2==KW_DATABASES||(LA53_2 >= KW_DATETIME && LA53_2 <= KW_DCPROPERTIES)||LA53_2==KW_DEBUG||(LA53_2 >= KW_DEFAULT && LA53_2 <= KW_DEFINED)||(LA53_2 >= KW_DELIMITED && LA53_2 <= KW_DESC)||(LA53_2 >= KW_DETAIL && LA53_2 <= KW_DISABLE)||(LA53_2 >= KW_DISTRIBUTE && LA53_2 <= KW_DO)||LA53_2==KW_DOW||(LA53_2 >= KW_DUMP && LA53_2 <= KW_ELEM_TYPE)||LA53_2==KW_ENABLE||(LA53_2 >= KW_ENFORCED && LA53_2 <= KW_EVERY)||(LA53_2 >= KW_EXCLUSIVE && LA53_2 <= KW_EXECUTED)||(LA53_2 >= KW_EXPIRE_SNAPSHOTS && LA53_2 <= KW_EXPRESSION)||LA53_2==KW_FAST_FORWARD||(LA53_2 >= KW_FIELDS && LA53_2 <= KW_FIRST)||LA53_2==KW_FOR||(LA53_2 >= KW_FORMAT && LA53_2 <= KW_FORMATTED)||LA53_2==KW_FUNCTIONS||(LA53_2 >= KW_HOUR && LA53_2 <= KW_IDXPROPERTIES)||LA53_2==KW_IGNORE||(LA53_2 >= KW_INDEX && LA53_2 <= KW_INDEXES)||(LA53_2 >= KW_INPATH && LA53_2 <= KW_INPUTFORMAT)||(LA53_2 >= KW_ISOLATION && LA53_2 <= KW_JAR)||(LA53_2 >= KW_JOINCOST && LA53_2 <= KW_LAST)||LA53_2==KW_LEVEL||(LA53_2 >= KW_LIMIT && LA53_2 <= KW_LOAD)||(LA53_2 >= KW_LOCATION && LA53_2 <= KW_LONG)||(LA53_2 >= KW_MANAGED && LA53_2 <= KW_MANAGEMENT)||(LA53_2 >= KW_MAPJOIN && LA53_2 <= KW_MATERIALIZED)||LA53_2==KW_METADATA||(LA53_2 >= KW_MINUTE && LA53_2 <= KW_MONTH)||(LA53_2 >= KW_MOVE && LA53_2 <= KW_MSCK)||(LA53_2 >= KW_NORELY && LA53_2 <= KW_NOSCAN)||LA53_2==KW_NOVALIDATE||LA53_2==KW_NULLS||LA53_2==KW_OFFSET||(LA53_2 >= KW_OPERATOR && LA53_2 <= KW_OPTION)||LA53_2==KW_ORDER||(LA53_2 >= KW_OUTPUTDRIVER && LA53_2 <= KW_OUTPUTFORMAT)||(LA53_2 >= KW_OVERWRITE && LA53_2 <= KW_PATH)||(LA53_2 >= KW_PLAN && LA53_2 <= KW_POOL)||LA53_2==KW_PRINCIPALS||LA53_2==KW_PURGE||(LA53_2 >= KW_QUARTER && LA53_2 <= KW_QUERY_PARALLELISM)||LA53_2==KW_READ||(LA53_2 >= KW_REBUILD && LA53_2 <= KW_RECORDWRITER)||(LA53_2 >= KW_RELOAD && LA53_2 <= KW_RETENTION)||LA53_2==KW_REWRITE||(LA53_2 >= KW_ROLE && LA53_2 <= KW_ROLES)||(LA53_2 >= KW_SCHEDULED && LA53_2 <= KW_SECOND)||(LA53_2 >= KW_SEMI && LA53_2 <= KW_SERVER)||(LA53_2 >= KW_SETS && LA53_2 <= KW_SKEWED)||(LA53_2 >= KW_SNAPSHOT && LA53_2 <= KW_SNAPSHOTS)||(LA53_2 >= KW_SORT && LA53_2 <= KW_SSL)||(LA53_2 >= KW_STATISTICS && LA53_2 <= KW_SUMMARY)||(LA53_2 >= KW_SYSTEM_TIME && LA53_2 <= KW_SYSTEM_VERSION)||(LA53_2 >= KW_TABLES && LA53_2 <= KW_TERMINATED)||LA53_2==KW_TINYINT||LA53_2==KW_TOUCH||(LA53_2 >= KW_TRANSACTION && LA53_2 <= KW_TRANSACTIONS)||LA53_2==KW_TRIM||(LA53_2 >= KW_TYPE && LA53_2 <= KW_UNARCHIVE)||LA53_2==KW_UNDO||LA53_2==KW_UNIONTYPE||(LA53_2 >= KW_UNKNOWN && LA53_2 <= KW_UNSIGNED)||(LA53_2 >= KW_URI && LA53_2 <= KW_USE)||(LA53_2 >= KW_UTC && LA53_2 <= KW_VALIDATE)||LA53_2==KW_VALUE_TYPE||(LA53_2 >= KW_VECTORIZATION && LA53_2 <= KW_WEEK)||LA53_2==KW_WHILE||(LA53_2 >= KW_WITHIN && LA53_2 <= KW_ZONE)||LA53_2==RPAREN||LA53_2==KW_BATCH||LA53_2==KW_DAYOFWEEK||LA53_2==KW_HOLD_DDLTIME||LA53_2==KW_NO_DROP||LA53_2==KW_OFFLINE||LA53_2==KW_PROTECTION||LA53_2==KW_READONLY||LA53_2==KW_TIMESTAMPTZ) ) {
                    alt53=2;
                }
                else if ( (LA53_2==LPAREN) ) {
                    int LA53_5 = input.LA(3);

                    if ( (LA53_5==KW_ON) ) {
                        alt53=3;
                    }
                    else if ( (LA53_5==StringLiteral) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 5, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 2, input);

                    throw nvae;

                }
                }
                break;
            case KW_ABORT:
            case KW_ACTIVATE:
            case KW_ACTIVE:
            case KW_ADD:
            case KW_ADMIN:
            case KW_AFTER:
            case KW_ALLOC_FRACTION:
            case KW_ANALYZE:
            case KW_ARCHIVE:
            case KW_ASC:
            case KW_AST:
            case KW_AT:
            case KW_AUTOCOMMIT:
            case KW_BEFORE:
            case KW_BRANCH:
            case KW_BUCKET:
            case KW_BUCKETS:
            case KW_CACHE:
            case KW_CASCADE:
            case KW_CBO:
            case KW_CHANGE:
            case KW_CHECK:
            case KW_CLUSTER:
            case KW_CLUSTERED:
            case KW_CLUSTERSTATUS:
            case KW_COLLECTION:
            case KW_COLUMNS:
            case KW_COMMENT:
            case KW_COMPACT:
            case KW_COMPACTIONS:
            case KW_COMPUTE:
            case KW_CONCATENATE:
            case KW_CONTINUE:
            case KW_COST:
            case KW_CRON:
            case KW_DATA:
            case KW_DATABASES:
            case KW_DATETIME:
            case KW_DAY:
            case KW_DBPROPERTIES:
            case KW_DCPROPERTIES:
            case KW_DEBUG:
            case KW_DEFAULT:
            case KW_DEFERRED:
            case KW_DEFINED:
            case KW_DELIMITED:
            case KW_DEPENDENCY:
            case KW_DESC:
            case KW_DETAIL:
            case KW_DIRECTORIES:
            case KW_DIRECTORY:
            case KW_DISABLE:
            case KW_DISTRIBUTE:
            case KW_DISTRIBUTED:
            case KW_DO:
            case KW_DOW:
            case KW_DUMP:
            case KW_ELEM_TYPE:
            case KW_ENABLE:
            case KW_ENFORCED:
            case KW_ESCAPED:
            case KW_EVERY:
            case KW_EXCLUSIVE:
            case KW_EXECUTE:
            case KW_EXECUTED:
            case KW_EXPIRE_SNAPSHOTS:
            case KW_EXPLAIN:
            case KW_EXPORT:
            case KW_EXPRESSION:
            case KW_FAST_FORWARD:
            case KW_FIELDS:
            case KW_FILE:
            case KW_FILEFORMAT:
            case KW_FIRST:
            case KW_FORMAT:
            case KW_FORMATTED:
            case KW_FUNCTIONS:
            case KW_HOUR:
            case KW_IDXPROPERTIES:
            case KW_IGNORE:
            case KW_INDEX:
            case KW_INDEXES:
            case KW_INPATH:
            case KW_INPUTDRIVER:
            case KW_INPUTFORMAT:
            case KW_ISOLATION:
            case KW_ITEMS:
            case KW_JAR:
            case KW_JOINCOST:
            case KW_KEY:
            case KW_KEYS:
            case KW_KEY_TYPE:
            case KW_KILL:
            case KW_LAST:
            case KW_LEVEL:
            case KW_LIMIT:
            case KW_LINES:
            case KW_LOAD:
            case KW_LOCATION:
            case KW_LOCK:
            case KW_LOCKS:
            case KW_LOGICAL:
            case KW_LONG:
            case KW_MANAGED:
            case KW_MANAGEDLOCATION:
            case KW_MANAGEMENT:
            case KW_MAPJOIN:
            case KW_MAPPING:
            case KW_MATCHED:
            case KW_MATERIALIZED:
            case KW_METADATA:
            case KW_MINUTE:
            case KW_MONTH:
            case KW_MOVE:
            case KW_MSCK:
            case KW_NORELY:
            case KW_NOSCAN:
            case KW_NOVALIDATE:
            case KW_NULLS:
            case KW_OFFSET:
            case KW_OPERATOR:
            case KW_OPTIMIZE:
            case KW_OPTION:
            case KW_OUTPUTDRIVER:
            case KW_OUTPUTFORMAT:
            case KW_OVERWRITE:
            case KW_OWNER:
            case KW_PARTITIONED:
            case KW_PARTITIONS:
            case KW_PATH:
            case KW_PLAN:
            case KW_PLANS:
            case KW_PLUS:
            case KW_POOL:
            case KW_PRINCIPALS:
            case KW_PURGE:
            case KW_QUARTER:
            case KW_QUERY:
            case KW_QUERY_PARALLELISM:
            case KW_READ:
            case KW_REBUILD:
            case KW_RECORDREADER:
            case KW_RECORDWRITER:
            case KW_RELOAD:
            case KW_RELY:
            case KW_REMOTE:
            case KW_RENAME:
            case KW_REOPTIMIZATION:
            case KW_REPAIR:
            case KW_REPL:
            case KW_REPLACE:
            case KW_REPLICATION:
            case KW_RESOURCE:
            case KW_RESPECT:
            case KW_RESTRICT:
            case KW_RETAIN:
            case KW_RETENTION:
            case KW_REWRITE:
            case KW_ROLE:
            case KW_ROLES:
            case KW_SCHEDULED:
            case KW_SCHEDULING_POLICY:
            case KW_SCHEMA:
            case KW_SCHEMAS:
            case KW_SECOND:
            case KW_SEMI:
            case KW_SERDE:
            case KW_SERDEPROPERTIES:
            case KW_SERVER:
            case KW_SETS:
            case KW_SET_CURRENT_SNAPSHOT:
            case KW_SHARED:
            case KW_SHOW:
            case KW_SHOW_DATABASE:
            case KW_SKEWED:
            case KW_SNAPSHOT:
            case KW_SNAPSHOTS:
            case KW_SORT:
            case KW_SORTED:
            case KW_SPEC:
            case KW_SSL:
            case KW_STATISTICS:
            case KW_STATUS:
            case KW_STORED:
            case KW_STREAMTABLE:
            case KW_STRING:
            case KW_STRUCT:
            case KW_SUMMARY:
            case KW_SYSTEM_TIME:
            case KW_SYSTEM_VERSION:
            case KW_TABLES:
            case KW_TAG:
            case KW_TBLPROPERTIES:
            case KW_TEMPORARY:
            case KW_TERMINATED:
            case KW_TINYINT:
            case KW_TOUCH:
            case KW_TRANSACTION:
            case KW_TRANSACTIONAL:
            case KW_TRANSACTIONS:
            case KW_TRIM:
            case KW_TYPE:
            case KW_UNARCHIVE:
            case KW_UNDO:
            case KW_UNIONTYPE:
            case KW_UNKNOWN:
            case KW_UNLOCK:
            case KW_UNMANAGED:
            case KW_UNSET:
            case KW_UNSIGNED:
            case KW_URI:
            case KW_URL:
            case KW_USE:
            case KW_UTC:
            case KW_UTCTIMESTAMP:
            case KW_VALIDATE:
            case KW_VALUE_TYPE:
            case KW_VECTORIZATION:
            case KW_VIEW:
            case KW_VIEWS:
            case KW_WAIT:
            case KW_WEEK:
            case KW_WHILE:
            case KW_WITHIN:
            case KW_WORK:
            case KW_WORKLOAD:
            case KW_WRITE:
            case KW_YEAR:
            case KW_ZONE:
            case KW_BATCH:
            case KW_DAYOFWEEK:
            case KW_HOLD_DDLTIME:
            case KW_NO_DROP:
            case KW_OFFLINE:
            case KW_PROTECTION:
            case KW_READONLY:
            case KW_TIMESTAMPTZ:
                {
                int LA53_3 = input.LA(2);

                if ( (LA53_3==EOF||LA53_3==DOT||LA53_3==Identifier||(LA53_3 >= KW_ABORT && LA53_3 <= KW_AFTER)||LA53_3==KW_ALLOC_FRACTION||LA53_3==KW_ANALYZE||LA53_3==KW_ARCHIVE||(LA53_3 >= KW_AS && LA53_3 <= KW_AT)||(LA53_3 >= KW_AUTOCOMMIT && LA53_3 <= KW_BEFORE)||(LA53_3 >= KW_BRANCH && LA53_3 <= KW_BUCKETS)||(LA53_3 >= KW_CACHE && LA53_3 <= KW_CASCADE)||(LA53_3 >= KW_CBO && LA53_3 <= KW_CHANGE)||LA53_3==KW_CHECK||(LA53_3 >= KW_CLUSTER && LA53_3 <= KW_COLLECTION)||(LA53_3 >= KW_COLUMNS && LA53_3 <= KW_COMMENT)||(LA53_3 >= KW_COMPACT && LA53_3 <= KW_COMPACTIONS)||(LA53_3 >= KW_COMPUTE && LA53_3 <= KW_CONCATENATE)||LA53_3==KW_CONTINUE||LA53_3==KW_COST||LA53_3==KW_CRON||LA53_3==KW_DATA||LA53_3==KW_DATABASES||(LA53_3 >= KW_DATETIME && LA53_3 <= KW_DCPROPERTIES)||LA53_3==KW_DEBUG||(LA53_3 >= KW_DEFAULT && LA53_3 <= KW_DEFINED)||(LA53_3 >= KW_DELIMITED && LA53_3 <= KW_DESC)||(LA53_3 >= KW_DETAIL && LA53_3 <= KW_DISABLE)||(LA53_3 >= KW_DISTRIBUTE && LA53_3 <= KW_DO)||LA53_3==KW_DOW||(LA53_3 >= KW_DUMP && LA53_3 <= KW_ELEM_TYPE)||LA53_3==KW_ENABLE||(LA53_3 >= KW_ENFORCED && LA53_3 <= KW_EVERY)||(LA53_3 >= KW_EXCLUSIVE && LA53_3 <= KW_EXECUTED)||(LA53_3 >= KW_EXPIRE_SNAPSHOTS && LA53_3 <= KW_EXPRESSION)||LA53_3==KW_FAST_FORWARD||(LA53_3 >= KW_FIELDS && LA53_3 <= KW_FIRST)||LA53_3==KW_FOR||(LA53_3 >= KW_FORMAT && LA53_3 <= KW_FORMATTED)||LA53_3==KW_FUNCTIONS||(LA53_3 >= KW_HOUR && LA53_3 <= KW_IDXPROPERTIES)||LA53_3==KW_IGNORE||(LA53_3 >= KW_INDEX && LA53_3 <= KW_INDEXES)||(LA53_3 >= KW_INPATH && LA53_3 <= KW_INPUTFORMAT)||(LA53_3 >= KW_ISOLATION && LA53_3 <= KW_JAR)||(LA53_3 >= KW_JOINCOST && LA53_3 <= KW_LAST)||LA53_3==KW_LEVEL||(LA53_3 >= KW_LIMIT && LA53_3 <= KW_LOAD)||(LA53_3 >= KW_LOCATION && LA53_3 <= KW_LONG)||(LA53_3 >= KW_MANAGED && LA53_3 <= KW_MANAGEMENT)||(LA53_3 >= KW_MAPJOIN && LA53_3 <= KW_MATERIALIZED)||LA53_3==KW_METADATA||(LA53_3 >= KW_MINUTE && LA53_3 <= KW_MONTH)||(LA53_3 >= KW_MOVE && LA53_3 <= KW_MSCK)||(LA53_3 >= KW_NORELY && LA53_3 <= KW_NOSCAN)||LA53_3==KW_NOVALIDATE||LA53_3==KW_NULLS||LA53_3==KW_OFFSET||(LA53_3 >= KW_OPERATOR && LA53_3 <= KW_OPTION)||LA53_3==KW_ORDER||(LA53_3 >= KW_OUTPUTDRIVER && LA53_3 <= KW_OUTPUTFORMAT)||(LA53_3 >= KW_OVERWRITE && LA53_3 <= KW_PATH)||(LA53_3 >= KW_PLAN && LA53_3 <= KW_POOL)||LA53_3==KW_PRINCIPALS||LA53_3==KW_PURGE||(LA53_3 >= KW_QUARTER && LA53_3 <= KW_QUERY_PARALLELISM)||LA53_3==KW_READ||(LA53_3 >= KW_REBUILD && LA53_3 <= KW_RECORDWRITER)||(LA53_3 >= KW_RELOAD && LA53_3 <= KW_RETENTION)||LA53_3==KW_REWRITE||(LA53_3 >= KW_ROLE && LA53_3 <= KW_ROLES)||(LA53_3 >= KW_SCHEDULED && LA53_3 <= KW_SECOND)||(LA53_3 >= KW_SEMI && LA53_3 <= KW_SERVER)||(LA53_3 >= KW_SETS && LA53_3 <= KW_SKEWED)||(LA53_3 >= KW_SNAPSHOT && LA53_3 <= KW_SNAPSHOTS)||(LA53_3 >= KW_SORT && LA53_3 <= KW_SSL)||(LA53_3 >= KW_STATISTICS && LA53_3 <= KW_SUMMARY)||(LA53_3 >= KW_SYSTEM_TIME && LA53_3 <= KW_SYSTEM_VERSION)||(LA53_3 >= KW_TABLES && LA53_3 <= KW_TERMINATED)||LA53_3==KW_TINYINT||LA53_3==KW_TOUCH||(LA53_3 >= KW_TRANSACTION && LA53_3 <= KW_TRANSACTIONS)||LA53_3==KW_TRIM||(LA53_3 >= KW_TYPE && LA53_3 <= KW_UNARCHIVE)||LA53_3==KW_UNDO||LA53_3==KW_UNIONTYPE||(LA53_3 >= KW_UNKNOWN && LA53_3 <= KW_UNSIGNED)||(LA53_3 >= KW_URI && LA53_3 <= KW_USE)||(LA53_3 >= KW_UTC && LA53_3 <= KW_VALIDATE)||LA53_3==KW_VALUE_TYPE||(LA53_3 >= KW_VECTORIZATION && LA53_3 <= KW_WEEK)||LA53_3==KW_WHILE||(LA53_3 >= KW_WITHIN && LA53_3 <= KW_ZONE)||LA53_3==RPAREN||LA53_3==KW_BATCH||LA53_3==KW_DAYOFWEEK||LA53_3==KW_HOLD_DDLTIME||LA53_3==KW_NO_DROP||LA53_3==KW_OFFLINE||LA53_3==KW_PROTECTION||LA53_3==KW_READONLY||LA53_3==KW_TIMESTAMPTZ) ) {
                    alt53=2;
                }
                else if ( (LA53_3==LPAREN) ) {
                    int LA53_19 = input.LA(3);

                    if ( (LA53_19==KW_ON) ) {
                        alt53=3;
                    }
                    else if ( (LA53_19==StringLiteral) ) {
                        alt53=2;
                    }
                    else {
                        if (state.backtracking>0) {state.failed=true; return retval;}
                        NoViableAltException nvae =
                            new NoViableAltException("", 53, 19, input);

                        throw nvae;

                    }
                }
                else {
                    if (state.backtracking>0) {state.failed=true; return retval;}
                    NoViableAltException nvae =
                        new NoViableAltException("", 53, 3, input);

                    throw nvae;

                }
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return retval;}
                NoViableAltException nvae =
                    new NoViableAltException("", 53, 0, input);

                throw nvae;

            }

            switch (alt53) {
                case 1 :
                    // FromClauseParser.g:278:4: subQuerySource
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_subQuerySource_in_partitionTableFunctionSource2066);
                    subQuerySource149=subQuerySource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, subQuerySource149.getTree());

                    }
                    break;
                case 2 :
                    // FromClauseParser.g:279:4: tableSource
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_tableSource_in_partitionTableFunctionSource2073);
                    tableSource150=tableSource();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, tableSource150.getTree());

                    }
                    break;
                case 3 :
                    // FromClauseParser.g:280:4: partitionedTableFunction
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource2080);
                    partitionedTableFunction151=partitionedTableFunction();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, partitionedTableFunction151.getTree());

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
    // $ANTLR end "partitionTableFunctionSource"


    public static class partitionedTableFunction_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "partitionedTableFunction"
    // FromClauseParser.g:283:1: partitionedTableFunction : name= identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) ;
    public final HiveParser_FromClauseParser.partitionedTableFunction_return partitionedTableFunction() throws RecognitionException {
        HiveParser_FromClauseParser.partitionedTableFunction_return retval = new HiveParser_FromClauseParser.partitionedTableFunction_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN152=null;
        Token KW_ON153=null;
        Token Identifier154=null;
        Token LPAREN155=null;
        Token RPAREN157=null;
        Token COMMA158=null;
        Token Identifier159=null;
        Token LPAREN160=null;
        Token RPAREN162=null;
        Token RPAREN163=null;
        HiveParser_IdentifiersParser.identifier_return name =null;

        HiveParser_FromClauseParser.partitionTableFunctionSource_return ptfsrc =null;

        HiveParser_FromClauseParser.partitioningSpec_return spec =null;

        HiveParser_IdentifiersParser.identifier_return alias =null;

        HiveParser_IdentifiersParser.expression_return expression156 =null;

        HiveParser_IdentifiersParser.expression_return expression161 =null;


        ASTNode LPAREN152_tree=null;
        ASTNode KW_ON153_tree=null;
        ASTNode Identifier154_tree=null;
        ASTNode LPAREN155_tree=null;
        ASTNode RPAREN157_tree=null;
        ASTNode COMMA158_tree=null;
        ASTNode Identifier159_tree=null;
        ASTNode LPAREN160_tree=null;
        ASTNode RPAREN162_tree=null;
        ASTNode RPAREN163_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_Identifier=new RewriteRuleTokenStream(adaptor,"token Identifier");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_ON=new RewriteRuleTokenStream(adaptor,"token KW_ON");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        RewriteRuleSubtreeStream stream_partitionTableFunctionSource=new RewriteRuleSubtreeStream(adaptor,"rule partitionTableFunctionSource");
        RewriteRuleSubtreeStream stream_partitioningSpec=new RewriteRuleSubtreeStream(adaptor,"rule partitioningSpec");
         gParent.pushMsg("ptf clause", state); 
        try {
            // FromClauseParser.g:286:4: (name= identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= identifier )? -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* ) )
            // FromClauseParser.g:287:4: name= identifier LPAREN KW_ON ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) ) ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )? ( ( RPAREN )=> ( RPAREN ) ) ( ( Identifier )=>alias= identifier )?
            {
            pushFollow(FOLLOW_identifier_in_partitionedTableFunction2111);
            name=gHiveParser.identifier();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_identifier.add(name.getTree());

            LPAREN152=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction2113); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN152);


            KW_ON153=(Token)match(input,KW_ON,FOLLOW_KW_ON_in_partitionedTableFunction2115); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_ON.add(KW_ON153);


            // FromClauseParser.g:288:4: ( ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? ) )
            // FromClauseParser.g:288:5: ( partitionTableFunctionSource )=> (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
            {
            // FromClauseParser.g:288:39: (ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )? )
            // FromClauseParser.g:288:40: ptfsrc= partitionTableFunctionSource (spec= partitioningSpec )?
            {
            pushFollow(FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction2130);
            ptfsrc=partitionTableFunctionSource();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_partitionTableFunctionSource.add(ptfsrc.getTree());

            // FromClauseParser.g:288:80: (spec= partitioningSpec )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==KW_CLUSTER||LA54_0==KW_DISTRIBUTE||LA54_0==KW_ORDER||LA54_0==KW_PARTITION||LA54_0==KW_SORT) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // FromClauseParser.g:288:80: spec= partitioningSpec
                    {
                    pushFollow(FOLLOW_partitioningSpec_in_partitionedTableFunction2134);
                    spec=partitioningSpec();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_partitioningSpec.add(spec.getTree());

                    }
                    break;

            }


            }


            }


            // FromClauseParser.g:289:4: ( ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )* )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Identifier) && (synpred8_FromClauseParser())) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // FromClauseParser.g:289:5: ( Identifier LPAREN expression RPAREN )=> Identifier LPAREN expression RPAREN ( COMMA Identifier LPAREN expression RPAREN )*
                    {
                    Identifier154=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction2156); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_Identifier.add(Identifier154);


                    LPAREN155=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction2158); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN155);


                    pushFollow(FOLLOW_expression_in_partitionedTableFunction2160);
                    expression156=gHiveParser.expression();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_expression.add(expression156.getTree());

                    RPAREN157=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction2162); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN157);


                    // FromClauseParser.g:289:83: ( COMMA Identifier LPAREN expression RPAREN )*
                    loop55:
                    do {
                        int alt55=2;
                        int LA55_0 = input.LA(1);

                        if ( (LA55_0==COMMA) ) {
                            alt55=1;
                        }


                        switch (alt55) {
                    	case 1 :
                    	    // FromClauseParser.g:289:85: COMMA Identifier LPAREN expression RPAREN
                    	    {
                    	    COMMA158=(Token)match(input,COMMA,FOLLOW_COMMA_in_partitionedTableFunction2166); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA158);


                    	    Identifier159=(Token)match(input,Identifier,FOLLOW_Identifier_in_partitionedTableFunction2168); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_Identifier.add(Identifier159);


                    	    LPAREN160=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_partitionedTableFunction2170); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN160);


                    	    pushFollow(FOLLOW_expression_in_partitionedTableFunction2172);
                    	    expression161=gHiveParser.expression();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_expression.add(expression161.getTree());

                    	    RPAREN162=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction2174); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN162);


                    	    }
                    	    break;

                    	default :
                    	    break loop55;
                        }
                    } while (true);


                    }
                    break;

            }


            // FromClauseParser.g:290:4: ( ( RPAREN )=> ( RPAREN ) )
            // FromClauseParser.g:290:5: ( RPAREN )=> ( RPAREN )
            {
            // FromClauseParser.g:290:17: ( RPAREN )
            // FromClauseParser.g:290:18: RPAREN
            {
            RPAREN163=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_partitionedTableFunction2191); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN163);


            }


            }


            // FromClauseParser.g:290:27: ( ( Identifier )=>alias= identifier )?
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // FromClauseParser.g:290:28: ( Identifier )=>alias= identifier
                    {
                    pushFollow(FOLLOW_identifier_in_partitionedTableFunction2204);
                    alias=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(alias.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: alias, name, expression, spec, ptfsrc
            // token labels: 
            // rule labels: ptfsrc, name, alias, spec, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_ptfsrc=new RewriteRuleSubtreeStream(adaptor,"rule ptfsrc",ptfsrc!=null?ptfsrc.tree:null);
            RewriteRuleSubtreeStream stream_name=new RewriteRuleSubtreeStream(adaptor,"rule name",name!=null?name.tree:null);
            RewriteRuleSubtreeStream stream_alias=new RewriteRuleSubtreeStream(adaptor,"rule alias",alias!=null?alias.tree:null);
            RewriteRuleSubtreeStream stream_spec=new RewriteRuleSubtreeStream(adaptor,"rule spec",spec!=null?spec.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 291:4: -> ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
            {
                // FromClauseParser.g:291:9: ^( TOK_PTBLFUNCTION $name ( $alias)? $ptfsrc ( $spec)? ( expression )* )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_PTBLFUNCTION, "TOK_PTBLFUNCTION")
                , root_1);

                adaptor.addChild(root_1, stream_name.nextTree());

                // FromClauseParser.g:291:35: ( $alias)?
                if ( stream_alias.hasNext() ) {
                    adaptor.addChild(root_1, stream_alias.nextTree());

                }
                stream_alias.reset();

                adaptor.addChild(root_1, stream_ptfsrc.nextTree());

                // FromClauseParser.g:291:51: ( $spec)?
                if ( stream_spec.hasNext() ) {
                    adaptor.addChild(root_1, stream_spec.nextTree());

                }
                stream_spec.reset();

                // FromClauseParser.g:291:57: ( expression )*
                while ( stream_expression.hasNext() ) {
                    adaptor.addChild(root_1, stream_expression.nextTree());

                }
                stream_expression.reset();

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
    // $ANTLR end "partitionedTableFunction"


    public static class whereClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whereClause"
    // FromClauseParser.g:296:1: whereClause : KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) ;
    public final HiveParser_FromClauseParser.whereClause_return whereClause() throws RecognitionException {
        HiveParser_FromClauseParser.whereClause_return retval = new HiveParser_FromClauseParser.whereClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_WHERE164=null;
        HiveParser_FromClauseParser.searchCondition_return searchCondition165 =null;


        ASTNode KW_WHERE164_tree=null;
        RewriteRuleTokenStream stream_KW_WHERE=new RewriteRuleTokenStream(adaptor,"token KW_WHERE");
        RewriteRuleSubtreeStream stream_searchCondition=new RewriteRuleSubtreeStream(adaptor,"rule searchCondition");
         gParent.pushMsg("where clause", state); 
        try {
            // FromClauseParser.g:299:5: ( KW_WHERE searchCondition -> ^( TOK_WHERE searchCondition ) )
            // FromClauseParser.g:300:5: KW_WHERE searchCondition
            {
            KW_WHERE164=(Token)match(input,KW_WHERE,FOLLOW_KW_WHERE_in_whereClause2267); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_WHERE.add(KW_WHERE164);


            pushFollow(FOLLOW_searchCondition_in_whereClause2269);
            searchCondition165=searchCondition();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_searchCondition.add(searchCondition165.getTree());

            // AST REWRITE
            // elements: searchCondition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 300:30: -> ^( TOK_WHERE searchCondition )
            {
                // FromClauseParser.g:300:33: ^( TOK_WHERE searchCondition )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_WHERE, "TOK_WHERE")
                , root_1);

                adaptor.addChild(root_1, stream_searchCondition.nextTree());

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
    // $ANTLR end "whereClause"


    public static class searchCondition_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "searchCondition"
    // FromClauseParser.g:303:1: searchCondition : expression ;
    public final HiveParser_FromClauseParser.searchCondition_return searchCondition() throws RecognitionException {
        HiveParser_FromClauseParser.searchCondition_return retval = new HiveParser_FromClauseParser.searchCondition_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.expression_return expression166 =null;



         gParent.pushMsg("search condition", state); 
        try {
            // FromClauseParser.g:306:5: ( expression )
            // FromClauseParser.g:307:5: expression
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_expression_in_searchCondition2308);
            expression166=gHiveParser.expression();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expression166.getTree());

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
    // $ANTLR end "searchCondition"


    public static class valuesSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valuesSource"
    // FromClauseParser.g:313:1: valuesSource : valuesClause -> ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ) ) ) ) ;
    public final HiveParser_FromClauseParser.valuesSource_return valuesSource() throws RecognitionException {
        HiveParser_FromClauseParser.valuesSource_return retval = new HiveParser_FromClauseParser.valuesSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_FromClauseParser.valuesClause_return valuesClause167 =null;


        RewriteRuleSubtreeStream stream_valuesClause=new RewriteRuleSubtreeStream(adaptor,"rule valuesClause");
        try {
            // FromClauseParser.g:314:5: ( valuesClause -> ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ) ) ) ) )
            // FromClauseParser.g:315:5: valuesClause
            {
            pushFollow(FOLLOW_valuesClause_in_valuesSource2332);
            valuesClause167=valuesClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valuesClause.add(valuesClause167.getTree());

            // AST REWRITE
            // elements: valuesClause
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 316:8: -> ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ) ) ) )
            {
                // FromClauseParser.g:316:11: ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ) ) ) )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_QUERY, "TOK_QUERY")
                , root_1);

                // FromClauseParser.g:316:23: ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ) ) )
                {
                ASTNode root_2 = (ASTNode)adaptor.nil();
                root_2 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_INSERT, "TOK_INSERT")
                , root_2);

                // FromClauseParser.g:317:16: ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) )
                {
                ASTNode root_3 = (ASTNode)adaptor.nil();
                root_3 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DESTINATION, "TOK_DESTINATION")
                , root_3);

                // FromClauseParser.g:317:34: ^( TOK_DIR TOK_TMP_FILE )
                {
                ASTNode root_4 = (ASTNode)adaptor.nil();
                root_4 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DIR, "TOK_DIR")
                , root_4);

                adaptor.addChild(root_4, 
                (ASTNode)adaptor.create(TOK_TMP_FILE, "TOK_TMP_FILE")
                );

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }

                // FromClauseParser.g:318:16: ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ) )
                {
                ASTNode root_3 = (ASTNode)adaptor.nil();
                root_3 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                , root_3);

                // FromClauseParser.g:318:29: ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) )
                {
                ASTNode root_4 = (ASTNode)adaptor.nil();
                root_4 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                , root_4);

                // FromClauseParser.g:318:43: ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause )
                {
                ASTNode root_5 = (ASTNode)adaptor.nil();
                root_5 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_5);

                adaptor.addChild(root_5, 
                (ASTNode)adaptor.create(Identifier, "inline")
                );

                adaptor.addChild(root_5, stream_valuesClause.nextTree());

                adaptor.addChild(root_4, root_5);
                }

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

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
    // $ANTLR end "valuesSource"


    public static class valuesClause_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valuesClause"
    // FromClauseParser.g:330:1: valuesClause : KW_VALUES valuesTableConstructor -> ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor ) ;
    public final HiveParser_FromClauseParser.valuesClause_return valuesClause() throws RecognitionException {
        HiveParser_FromClauseParser.valuesClause_return retval = new HiveParser_FromClauseParser.valuesClause_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_VALUES168=null;
        HiveParser_FromClauseParser.valuesTableConstructor_return valuesTableConstructor169 =null;


        ASTNode KW_VALUES168_tree=null;
        RewriteRuleTokenStream stream_KW_VALUES=new RewriteRuleTokenStream(adaptor,"token KW_VALUES");
        RewriteRuleSubtreeStream stream_valuesTableConstructor=new RewriteRuleSubtreeStream(adaptor,"rule valuesTableConstructor");
         gParent.pushMsg("values clause", state); 
        try {
            // FromClauseParser.g:333:5: ( KW_VALUES valuesTableConstructor -> ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor ) )
            // FromClauseParser.g:334:5: KW_VALUES valuesTableConstructor
            {
            KW_VALUES168=(Token)match(input,KW_VALUES,FOLLOW_KW_VALUES_in_valuesClause2458); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_VALUES.add(KW_VALUES168);


            pushFollow(FOLLOW_valuesTableConstructor_in_valuesClause2460);
            valuesTableConstructor169=valuesTableConstructor();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valuesTableConstructor.add(valuesTableConstructor169.getTree());

            // AST REWRITE
            // elements: valuesTableConstructor
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 334:38: -> ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor )
            {
                // FromClauseParser.g:334:41: ^( TOK_FUNCTION Identifier[\"array\"] valuesTableConstructor )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_1);

                adaptor.addChild(root_1, 
                (ASTNode)adaptor.create(Identifier, "array")
                );

                adaptor.addChild(root_1, stream_valuesTableConstructor.nextTree());

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
    // $ANTLR end "valuesClause"


    public static class valuesTableConstructor_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valuesTableConstructor"
    // FromClauseParser.g:337:1: valuesTableConstructor : ( ( valueRowConstructor ( COMMA ! valueRowConstructor )* )=> ( valueRowConstructor ( COMMA ! valueRowConstructor )* ) | firstValueRowConstructor ( COMMA ! valueRowConstructor )* );
    public final HiveParser_FromClauseParser.valuesTableConstructor_return valuesTableConstructor() throws RecognitionException {
        HiveParser_FromClauseParser.valuesTableConstructor_return retval = new HiveParser_FromClauseParser.valuesTableConstructor_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA171=null;
        Token COMMA174=null;
        HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor170 =null;

        HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor172 =null;

        HiveParser_FromClauseParser.firstValueRowConstructor_return firstValueRowConstructor173 =null;

        HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor175 =null;


        ASTNode COMMA171_tree=null;
        ASTNode COMMA174_tree=null;

         gParent.pushMsg("values table constructor", state); 
        try {
            // FromClauseParser.g:340:5: ( ( valueRowConstructor ( COMMA ! valueRowConstructor )* )=> ( valueRowConstructor ( COMMA ! valueRowConstructor )* ) | firstValueRowConstructor ( COMMA ! valueRowConstructor )* )
            int alt60=2;
            alt60 = dfa60.predict(input);
            switch (alt60) {
                case 1 :
                    // FromClauseParser.g:341:5: ( valueRowConstructor ( COMMA ! valueRowConstructor )* )=> ( valueRowConstructor ( COMMA ! valueRowConstructor )* )
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    // FromClauseParser.g:341:60: ( valueRowConstructor ( COMMA ! valueRowConstructor )* )
                    // FromClauseParser.g:341:61: valueRowConstructor ( COMMA ! valueRowConstructor )*
                    {
                    pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2517);
                    valueRowConstructor170=valueRowConstructor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, valueRowConstructor170.getTree());

                    // FromClauseParser.g:341:81: ( COMMA ! valueRowConstructor )*
                    loop58:
                    do {
                        int alt58=2;
                        int LA58_0 = input.LA(1);

                        if ( (LA58_0==COMMA) ) {
                            alt58=1;
                        }


                        switch (alt58) {
                    	case 1 :
                    	    // FromClauseParser.g:341:82: COMMA ! valueRowConstructor
                    	    {
                    	    COMMA171=(Token)match(input,COMMA,FOLLOW_COMMA_in_valuesTableConstructor2520); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2523);
                    	    valueRowConstructor172=valueRowConstructor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, valueRowConstructor172.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop58;
                        }
                    } while (true);


                    }


                    }
                    break;
                case 2 :
                    // FromClauseParser.g:343:5: firstValueRowConstructor ( COMMA ! valueRowConstructor )*
                    {
                    root_0 = (ASTNode)adaptor.nil();


                    pushFollow(FOLLOW_firstValueRowConstructor_in_valuesTableConstructor2538);
                    firstValueRowConstructor173=firstValueRowConstructor();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) adaptor.addChild(root_0, firstValueRowConstructor173.getTree());

                    // FromClauseParser.g:343:30: ( COMMA ! valueRowConstructor )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==COMMA) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // FromClauseParser.g:343:31: COMMA ! valueRowConstructor
                    	    {
                    	    COMMA174=(Token)match(input,COMMA,FOLLOW_COMMA_in_valuesTableConstructor2541); if (state.failed) return retval;

                    	    pushFollow(FOLLOW_valueRowConstructor_in_valuesTableConstructor2544);
                    	    valueRowConstructor175=valueRowConstructor();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) adaptor.addChild(root_0, valueRowConstructor175.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


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
    // $ANTLR end "valuesTableConstructor"


    public static class valueRowConstructor_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "valueRowConstructor"
    // FromClauseParser.g:346:1: valueRowConstructor : expressionsInParenthesis[true, true] ;
    public final HiveParser_FromClauseParser.valueRowConstructor_return valueRowConstructor() throws RecognitionException {
        HiveParser_FromClauseParser.valueRowConstructor_return retval = new HiveParser_FromClauseParser.valueRowConstructor_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        HiveParser_IdentifiersParser.expressionsInParenthesis_return expressionsInParenthesis176 =null;



         gParent.pushMsg("value row constructor", state); 
        try {
            // FromClauseParser.g:349:5: ( expressionsInParenthesis[true, true] )
            // FromClauseParser.g:350:5: expressionsInParenthesis[true, true]
            {
            root_0 = (ASTNode)adaptor.nil();


            pushFollow(FOLLOW_expressionsInParenthesis_in_valueRowConstructor2577);
            expressionsInParenthesis176=gHiveParser.expressionsInParenthesis(true, true);

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionsInParenthesis176.getTree());

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
    // $ANTLR end "valueRowConstructor"


    public static class firstValueRowConstructor_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "firstValueRowConstructor"
    // FromClauseParser.g:353:1: firstValueRowConstructor : LPAREN ! firstExpressionsWithAlias RPAREN !;
    public final HiveParser_FromClauseParser.firstValueRowConstructor_return firstValueRowConstructor() throws RecognitionException {
        HiveParser_FromClauseParser.firstValueRowConstructor_return retval = new HiveParser_FromClauseParser.firstValueRowConstructor_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN177=null;
        Token RPAREN179=null;
        HiveParser_IdentifiersParser.firstExpressionsWithAlias_return firstExpressionsWithAlias178 =null;


        ASTNode LPAREN177_tree=null;
        ASTNode RPAREN179_tree=null;

         gParent.pushMsg("first value row constructor", state); 
        try {
            // FromClauseParser.g:356:5: ( LPAREN ! firstExpressionsWithAlias RPAREN !)
            // FromClauseParser.g:357:5: LPAREN ! firstExpressionsWithAlias RPAREN !
            {
            root_0 = (ASTNode)adaptor.nil();


            LPAREN177=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_firstValueRowConstructor2609); if (state.failed) return retval;

            pushFollow(FOLLOW_firstExpressionsWithAlias_in_firstValueRowConstructor2612);
            firstExpressionsWithAlias178=gHiveParser.firstExpressionsWithAlias();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) adaptor.addChild(root_0, firstExpressionsWithAlias178.getTree());

            RPAREN179=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_firstValueRowConstructor2614); if (state.failed) return retval;

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
    // $ANTLR end "firstValueRowConstructor"


    public static class virtualTableSource_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "virtualTableSource"
    // FromClauseParser.g:364:1: virtualTableSource : KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tabAlias= tableAlias ( LPAREN identifier ( COMMA identifier )* )? RPAREN -> ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) ) ;
    public final HiveParser_FromClauseParser.virtualTableSource_return virtualTableSource() throws RecognitionException {
        HiveParser_FromClauseParser.virtualTableSource_return retval = new HiveParser_FromClauseParser.virtualTableSource_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_TABLE180=null;
        Token LPAREN181=null;
        Token RPAREN183=null;
        Token KW_AS184=null;
        Token LPAREN185=null;
        Token COMMA187=null;
        Token RPAREN189=null;
        HiveParser_FromClauseParser.tableAlias_return tabAlias =null;

        HiveParser_FromClauseParser.valuesClause_return valuesClause182 =null;

        HiveParser_IdentifiersParser.identifier_return identifier186 =null;

        HiveParser_IdentifiersParser.identifier_return identifier188 =null;


        ASTNode KW_TABLE180_tree=null;
        ASTNode LPAREN181_tree=null;
        ASTNode RPAREN183_tree=null;
        ASTNode KW_AS184_tree=null;
        ASTNode LPAREN185_tree=null;
        ASTNode COMMA187_tree=null;
        ASTNode RPAREN189_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_KW_TABLE=new RewriteRuleTokenStream(adaptor,"token KW_TABLE");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleTokenStream stream_KW_AS=new RewriteRuleTokenStream(adaptor,"token KW_AS");
        RewriteRuleSubtreeStream stream_identifier=new RewriteRuleSubtreeStream(adaptor,"rule identifier");
        RewriteRuleSubtreeStream stream_valuesClause=new RewriteRuleSubtreeStream(adaptor,"rule valuesClause");
        RewriteRuleSubtreeStream stream_tableAlias=new RewriteRuleSubtreeStream(adaptor,"rule tableAlias");
         gParent.pushMsg("virtual table source", state); 
        try {
            // FromClauseParser.g:367:5: ( KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tabAlias= tableAlias ( LPAREN identifier ( COMMA identifier )* )? RPAREN -> ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) ) )
            // FromClauseParser.g:368:5: KW_TABLE LPAREN valuesClause RPAREN ( KW_AS )? tabAlias= tableAlias ( LPAREN identifier ( COMMA identifier )* )? RPAREN
            {
            KW_TABLE180=(Token)match(input,KW_TABLE,FOLLOW_KW_TABLE_in_virtualTableSource2648); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_KW_TABLE.add(KW_TABLE180);


            LPAREN181=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_virtualTableSource2650); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN181);


            pushFollow(FOLLOW_valuesClause_in_virtualTableSource2652);
            valuesClause182=valuesClause();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_valuesClause.add(valuesClause182.getTree());

            RPAREN183=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_virtualTableSource2654); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN183);


            // FromClauseParser.g:368:41: ( KW_AS )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==KW_AS) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // FromClauseParser.g:368:41: KW_AS
                    {
                    KW_AS184=(Token)match(input,KW_AS,FOLLOW_KW_AS_in_virtualTableSource2656); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_KW_AS.add(KW_AS184);


                    }
                    break;

            }


            pushFollow(FOLLOW_tableAlias_in_virtualTableSource2661);
            tabAlias=tableAlias();

            state._fsp--;
            if (state.failed) return retval;
            if ( state.backtracking==0 ) stream_tableAlias.add(tabAlias.getTree());

            // FromClauseParser.g:368:68: ( LPAREN identifier ( COMMA identifier )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==LPAREN) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // FromClauseParser.g:368:69: LPAREN identifier ( COMMA identifier )*
                    {
                    LPAREN185=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_virtualTableSource2664); if (state.failed) return retval; 
                    if ( state.backtracking==0 ) stream_LPAREN.add(LPAREN185);


                    pushFollow(FOLLOW_identifier_in_virtualTableSource2666);
                    identifier186=gHiveParser.identifier();

                    state._fsp--;
                    if (state.failed) return retval;
                    if ( state.backtracking==0 ) stream_identifier.add(identifier186.getTree());

                    // FromClauseParser.g:368:87: ( COMMA identifier )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==COMMA) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // FromClauseParser.g:368:88: COMMA identifier
                    	    {
                    	    COMMA187=(Token)match(input,COMMA,FOLLOW_COMMA_in_virtualTableSource2669); if (state.failed) return retval; 
                    	    if ( state.backtracking==0 ) stream_COMMA.add(COMMA187);


                    	    pushFollow(FOLLOW_identifier_in_virtualTableSource2671);
                    	    identifier188=gHiveParser.identifier();

                    	    state._fsp--;
                    	    if (state.failed) return retval;
                    	    if ( state.backtracking==0 ) stream_identifier.add(identifier188.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }


            RPAREN189=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_virtualTableSource2677); if (state.failed) return retval; 
            if ( state.backtracking==0 ) stream_RPAREN.add(RPAREN189);


            // AST REWRITE
            // elements: valuesClause, identifier
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            if ( state.backtracking==0 ) {

            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 369:5: -> ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) )
            {
                // FromClauseParser.g:369:8: ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) ) )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY")
                , root_1);

                // FromClauseParser.g:370:10: ^( TOK_QUERY ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) ) ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) ) )
                {
                ASTNode root_2 = (ASTNode)adaptor.nil();
                root_2 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_QUERY, "TOK_QUERY")
                , root_2);

                // FromClauseParser.g:371:12: ^( TOK_FROM ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) ) )
                {
                ASTNode root_3 = (ASTNode)adaptor.nil();
                root_3 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_FROM, "TOK_FROM")
                , root_3);

                // FromClauseParser.g:372:14: ^( TOK_SUBQUERY ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) ) )
                {
                ASTNode root_4 = (ASTNode)adaptor.nil();
                root_4 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SUBQUERY, "TOK_SUBQUERY")
                , root_4);

                // FromClauseParser.g:373:16: ^( TOK_QUERY ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) ) )
                {
                ASTNode root_5 = (ASTNode)adaptor.nil();
                root_5 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_QUERY, "TOK_QUERY")
                , root_5);

                // FromClauseParser.g:374:18: ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) ) )
                {
                ASTNode root_6 = (ASTNode)adaptor.nil();
                root_6 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_INSERT, "TOK_INSERT")
                , root_6);

                // FromClauseParser.g:375:20: ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) )
                {
                ASTNode root_7 = (ASTNode)adaptor.nil();
                root_7 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DESTINATION, "TOK_DESTINATION")
                , root_7);

                // FromClauseParser.g:375:38: ^( TOK_DIR TOK_TMP_FILE )
                {
                ASTNode root_8 = (ASTNode)adaptor.nil();
                root_8 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DIR, "TOK_DIR")
                , root_8);

                adaptor.addChild(root_8, 
                (ASTNode)adaptor.create(TOK_TMP_FILE, "TOK_TMP_FILE")
                );

                adaptor.addChild(root_7, root_8);
                }

                adaptor.addChild(root_6, root_7);
                }

                // FromClauseParser.g:376:20: ^( TOK_SELECT ^( TOK_SELEXPR IntegralLiteral[\"0\"] ) )
                {
                ASTNode root_7 = (ASTNode)adaptor.nil();
                root_7 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                , root_7);

                // FromClauseParser.g:376:33: ^( TOK_SELEXPR IntegralLiteral[\"0\"] )
                {
                ASTNode root_8 = (ASTNode)adaptor.nil();
                root_8 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                , root_8);

                adaptor.addChild(root_8, 
                (ASTNode)adaptor.create(IntegralLiteral, "0")
                );

                adaptor.addChild(root_7, root_8);
                }

                adaptor.addChild(root_6, root_7);
                }

                adaptor.addChild(root_5, root_6);
                }

                adaptor.addChild(root_4, root_5);
                }

                adaptor.addChild(root_4, adaptor.create(Identifier, (tabAlias!=null?((ASTNode)tabAlias.tree):null).getChild(0).getText()));

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }

                // FromClauseParser.g:378:12: ^( TOK_INSERT ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) ) ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) ) )
                {
                ASTNode root_3 = (ASTNode)adaptor.nil();
                root_3 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_INSERT, "TOK_INSERT")
                , root_3);

                // FromClauseParser.g:379:14: ^( TOK_DESTINATION ^( TOK_DIR TOK_TMP_FILE ) )
                {
                ASTNode root_4 = (ASTNode)adaptor.nil();
                root_4 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DESTINATION, "TOK_DESTINATION")
                , root_4);

                // FromClauseParser.g:379:32: ^( TOK_DIR TOK_TMP_FILE )
                {
                ASTNode root_5 = (ASTNode)adaptor.nil();
                root_5 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_DIR, "TOK_DIR")
                , root_5);

                adaptor.addChild(root_5, 
                (ASTNode)adaptor.create(TOK_TMP_FILE, "TOK_TMP_FILE")
                );

                adaptor.addChild(root_4, root_5);
                }

                adaptor.addChild(root_3, root_4);
                }

                // FromClauseParser.g:380:14: ^( TOK_SELECT ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* ) )
                {
                ASTNode root_4 = (ASTNode)adaptor.nil();
                root_4 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SELECT, "TOK_SELECT")
                , root_4);

                // FromClauseParser.g:380:27: ^( TOK_SELEXPR ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause ) ( identifier )* )
                {
                ASTNode root_5 = (ASTNode)adaptor.nil();
                root_5 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_SELEXPR, "TOK_SELEXPR")
                , root_5);

                // FromClauseParser.g:380:41: ^( TOK_FUNCTION Identifier[\"inline\"] valuesClause )
                {
                ASTNode root_6 = (ASTNode)adaptor.nil();
                root_6 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_FUNCTION, "TOK_FUNCTION")
                , root_6);

                adaptor.addChild(root_6, 
                (ASTNode)adaptor.create(Identifier, "inline")
                );

                adaptor.addChild(root_6, stream_valuesClause.nextTree());

                adaptor.addChild(root_5, root_6);
                }

                // FromClauseParser.g:380:91: ( identifier )*
                while ( stream_identifier.hasNext() ) {
                    adaptor.addChild(root_5, stream_identifier.nextTree());

                }
                stream_identifier.reset();

                adaptor.addChild(root_4, root_5);
                }

                adaptor.addChild(root_3, root_4);
                }

                adaptor.addChild(root_2, root_3);
                }

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_1, adaptor.create(Identifier, (tabAlias!=null?((ASTNode)tabAlias.tree):null).getChild(0).getText()));

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
    // $ANTLR end "virtualTableSource"

    // $ANTLR start synpred1_FromClauseParser
    public final void synpred1_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:110:8: ( LPAREN ( KW_WITH | KW_SELECT | KW_MAP | KW_REDUCE | KW_FROM ) )
        // FromClauseParser.g:110:9: LPAREN ( KW_WITH | KW_SELECT | KW_MAP | KW_REDUCE | KW_FROM )
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred1_FromClauseParser429); if (state.failed) return ;

        if ( input.LA(1)==KW_FROM||input.LA(1)==KW_MAP||input.LA(1)==KW_REDUCE||input.LA(1)==KW_SELECT||input.LA(1)==KW_WITH ) {
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
    // $ANTLR end synpred1_FromClauseParser

    // $ANTLR start synpred2_FromClauseParser
    public final void synpred2_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:111:8: ( LPAREN LPAREN selectStatement RPAREN setOperator )
        // FromClauseParser.g:111:9: LPAREN LPAREN selectStatement RPAREN setOperator
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_FromClauseParser462); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred2_FromClauseParser464); if (state.failed) return ;

        pushFollow(FOLLOW_selectStatement_in_synpred2_FromClauseParser466);
        gHiveParser.selectStatement();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred2_FromClauseParser468); if (state.failed) return ;

        pushFollow(FOLLOW_setOperator_in_synpred2_FromClauseParser470);
        gHiveParser.setOperator();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred2_FromClauseParser

    // $ANTLR start synpred3_FromClauseParser
    public final void synpred3_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:112:8: ( LPAREN valuesSource )
        // FromClauseParser.g:112:9: LPAREN valuesSource
        {
        match(input,LPAREN,FOLLOW_LPAREN_in_synpred3_FromClauseParser492); if (state.failed) return ;

        pushFollow(FOLLOW_valuesSource_in_synpred3_FromClauseParser494);
        valuesSource();

        state._fsp--;
        if (state.failed) return ;

        }

    }
    // $ANTLR end synpred3_FromClauseParser

    // $ANTLR start synpred4_FromClauseParser
    public final void synpred4_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:165:2: ( ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER )
        // FromClauseParser.g:165:3: ( COMMA )? KW_LATERAL KW_VIEW KW_OUTER
        {
        // FromClauseParser.g:165:3: ( COMMA )?
        int alt64=2;
        int LA64_0 = input.LA(1);

        if ( (LA64_0==COMMA) ) {
            alt64=1;
        }
        switch (alt64) {
            case 1 :
                // FromClauseParser.g:165:3: COMMA
                {
                match(input,COMMA,FOLLOW_COMMA_in_synpred4_FromClauseParser992); if (state.failed) return ;

                }
                break;

        }


        match(input,KW_LATERAL,FOLLOW_KW_LATERAL_in_synpred4_FromClauseParser995); if (state.failed) return ;

        match(input,KW_VIEW,FOLLOW_KW_VIEW_in_synpred4_FromClauseParser997); if (state.failed) return ;

        match(input,KW_OUTER,FOLLOW_KW_OUTER_in_synpred4_FromClauseParser999); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred4_FromClauseParser

    // $ANTLR start synpred5_FromClauseParser
    public final void synpred5_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:165:109: ( COMMA )
        // FromClauseParser.g:165:110: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred5_FromClauseParser1021); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred5_FromClauseParser

    // $ANTLR start synpred6_FromClauseParser
    public final void synpred6_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:168:67: ( COMMA )
        // FromClauseParser.g:168:68: COMMA
        {
        match(input,COMMA,FOLLOW_COMMA_in_synpred6_FromClauseParser1077); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred6_FromClauseParser

    // $ANTLR start synpred8_FromClauseParser
    public final void synpred8_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:289:5: ( Identifier LPAREN expression RPAREN )
        // FromClauseParser.g:289:6: Identifier LPAREN expression RPAREN
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred8_FromClauseParser2144); if (state.failed) return ;

        match(input,LPAREN,FOLLOW_LPAREN_in_synpred8_FromClauseParser2146); if (state.failed) return ;

        pushFollow(FOLLOW_expression_in_synpred8_FromClauseParser2148);
        gHiveParser.expression();

        state._fsp--;
        if (state.failed) return ;

        match(input,RPAREN,FOLLOW_RPAREN_in_synpred8_FromClauseParser2150); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred8_FromClauseParser

    // $ANTLR start synpred10_FromClauseParser
    public final void synpred10_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:290:28: ( Identifier )
        // FromClauseParser.g:290:29: Identifier
        {
        match(input,Identifier,FOLLOW_Identifier_in_synpred10_FromClauseParser2197); if (state.failed) return ;

        }

    }
    // $ANTLR end synpred10_FromClauseParser

    // $ANTLR start synpred11_FromClauseParser
    public final void synpred11_FromClauseParser_fragment() throws RecognitionException {
        // FromClauseParser.g:341:5: ( valueRowConstructor ( COMMA ! valueRowConstructor )* )
        // FromClauseParser.g:341:6: valueRowConstructor ( COMMA ! valueRowConstructor )*
        {
        pushFollow(FOLLOW_valueRowConstructor_in_synpred11_FromClauseParser2503);
        valueRowConstructor();

        state._fsp--;
        if (state.failed) return ;

        // FromClauseParser.g:341:26: ( COMMA ! valueRowConstructor )*
        loop65:
        do {
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==COMMA) ) {
                alt65=1;
            }


            switch (alt65) {
        	case 1 :
        	    // FromClauseParser.g:341:27: COMMA ! valueRowConstructor
        	    {
        	    match(input,COMMA,FOLLOW_COMMA_in_synpred11_FromClauseParser2506); if (state.failed) return ;

        	    pushFollow(FOLLOW_valueRowConstructor_in_synpred11_FromClauseParser2509);
        	    valueRowConstructor();

        	    state._fsp--;
        	    if (state.failed) return ;

        	    }
        	    break;

        	default :
        	    break loop65;
            }
        } while (true);


        }

    }
    // $ANTLR end synpred11_FromClauseParser

    // Delegated rules

    public final boolean synpred3_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred10_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred10_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred4_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred4_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred1_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred5_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred5_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred6_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred6_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred8_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred8_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred11_FromClauseParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred11_FromClauseParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA15 dfa15 = new DFA15(this);
    protected DFA22 dfa22 = new DFA22(this);
    protected DFA25 dfa25 = new DFA25(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA47 dfa47 = new DFA47(this);
    protected DFA46 dfa46 = new DFA46(this);
    protected DFA57 dfa57 = new DFA57(this);
    protected DFA60 dfa60 = new DFA60(this);
    static final String DFA12_eotS =
        "\u00ca\uffff";
    static final String DFA12_eofS =
        "\1\uffff\2\5\u00c7\uffff";
    static final String DFA12_minS =
        "\1\30\2\11\1\uffff\1\30\1\uffff\1\u00ee\42\uffff\1\u00ee\41\uffff"+
        "\2\30\1\u00b8\3\14\1\30\1\u019e\7\uffff\146\0\6\uffff\1\0\3\uffff";
    static final String DFA12_maxS =
        "\3\u02f1\1\uffff\1\u02f1\1\uffff\1\u01b0\42\uffff\1\u01b0\41\uffff"+
        "\2\u02f1\1\u00fb\4\u02f1\1\u019e\7\uffff\146\0\6\uffff\1\0\3\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\2\1\uffff\1\1\115\uffff\1\7\2\uffff\1\6\160\uffff\1\3"+
        "\1\4\1\5";
    static final String DFA12_specialS =
        "\132\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43\1\44\1\45"+
        "\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60\1\61\1\62"+
        "\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75\1\76\1\77"+
        "\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110\1\111\1\112"+
        "\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123\1\124\1\125"+
        "\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136\1\137\1\140"+
        "\1\141\1\142\1\143\1\144\1\145\6\uffff\1\146\3\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff"+
            "\3\2\1\uffff\2\2\5\uffff\3\2\1\uffff\2\2\2\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\6\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\3\2\1\uffff\4\2\4\uffff\1\2\1\uffff\4\2\6\uffff\2\2\3\uffff"+
            "\1\2\4\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\6\uffff"+
            "\3\2\1\uffff\6\2\4\uffff\1\2\1\uffff\3\2\1\uffff\5\2\1\uffff"+
            "\3\2\1\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2\5\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff\4\2\5\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\1\2\2\uffff\3\2\3\uffff\16\2\1\uffff"+
            "\1\2\2\uffff\2\2\4\uffff\5\2\1\uffff\4\2\1\uffff\6\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\7\2\1\uffff\2\2\1\3\1\2\1\uffff\4\2"+
            "\5\uffff\1\2\1\uffff\1\2\1\uffff\3\2\2\uffff\1\2\2\uffff\2\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\uffff\5\2\1\uffff\3\2\2\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\5\2\2\uffff\1\2\2\uffff\6\2\4\uffff\1\4"+
            "\72\uffff\1\2\57\uffff\1\2\72\uffff\1\2\67\uffff\1\2\3\uffff"+
            "\1\2\35\uffff\1\2\7\uffff\1\2\112\uffff\1\2",
            "\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\4\5\1\uffff\2\5\5\uffff\3\5\1\uffff"+
            "\2\5\2\uffff\2\5\1\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
            "\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\2\5\5\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\4\5\1\uffff\1\5\1\uffff\3\5\1\uffff"+
            "\3\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\2\5\1\uffff"+
            "\1\5\1\uffff\4\5\1\uffff\3\5\1\uffff\4\5\4\uffff\1\5\1\uffff"+
            "\4\5\3\uffff\1\5\2\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\3\5\1\uffff\1\5\2\uffff\7\5\1\uffff\1\5\3\uffff"+
            "\13\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff"+
            "\10\5\1\uffff\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\1\uffff\1\5\3\uffff\2\5\1\uffff"+
            "\2\5\1\uffff\3\5\2\uffff\4\5\5\uffff\1\5\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\4\5\2\uffff\16\5\1\uffff\2\5\1\uffff\2\5\4\uffff"+
            "\12\5\1\uffff\6\5\1\uffff\2\5\1\uffff\4\5\1\uffff\7\5\1\uffff"+
            "\2\5\1\uffff\6\5\5\uffff\1\5\1\uffff\1\5\1\uffff\3\5\2\uffff"+
            "\1\5\2\uffff\2\5\1\uffff\3\5\2\uffff\5\5\1\uffff\3\5\2\uffff"+
            "\3\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff\6\5\4\uffff"+
            "\1\6\14\uffff\1\5\55\uffff\1\5\57\uffff\1\5\72\uffff\1\5\67"+
            "\uffff\1\5\3\uffff\1\5\35\uffff\1\5\7\uffff\1\5\112\uffff\1"+
            "\5",
            "\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\4\5\1\uffff\2\5\5\uffff\3\5\1\uffff"+
            "\2\5\2\uffff\2\5\1\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
            "\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\2\5\5\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\4\5\1\uffff\1\5\1\uffff\3\5\1\uffff"+
            "\3\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\2\5\1\uffff"+
            "\1\5\1\uffff\4\5\1\uffff\3\5\1\uffff\4\5\4\uffff\1\5\1\uffff"+
            "\4\5\3\uffff\1\5\2\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\3\5\1\uffff\1\5\2\uffff\7\5\1\uffff\1\5\3\uffff"+
            "\13\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff"+
            "\10\5\1\uffff\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\3\5\1\uffff\1\5\3\uffff\2\5\1\uffff"+
            "\2\5\1\uffff\3\5\2\uffff\4\5\5\uffff\1\5\1\uffff\5\5\1\uffff"+
            "\1\5\2\uffff\4\5\2\uffff\16\5\1\uffff\2\5\1\uffff\2\5\4\uffff"+
            "\12\5\1\uffff\6\5\1\uffff\2\5\1\uffff\4\5\1\uffff\7\5\1\uffff"+
            "\2\5\1\uffff\6\5\5\uffff\1\5\1\uffff\1\5\1\uffff\3\5\2\uffff"+
            "\1\5\2\uffff\2\5\1\uffff\3\5\2\uffff\5\5\1\uffff\3\5\2\uffff"+
            "\3\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff\6\5\4\uffff"+
            "\1\51\14\uffff\1\5\55\uffff\1\5\57\uffff\1\5\72\uffff\1\5\67"+
            "\uffff\1\5\3\uffff\1\5\35\uffff\1\5\7\uffff\1\5\112\uffff\1"+
            "\5",
            "",
            "\1\123\1\uffff\6\123\1\uffff\1\123\1\uffff\1\123\3\uffff\1"+
            "\123\2\uffff\3\123\1\uffff\2\123\5\uffff\3\123\1\uffff\2\123"+
            "\2\uffff\2\123\1\uffff\1\123\1\uffff\4\123\1\uffff\2\123\1\uffff"+
            "\2\123\1\uffff\2\123\2\uffff\1\123\1\uffff\1\123\1\uffff\1\123"+
            "\6\uffff\1\123\1\uffff\1\123\3\uffff\4\123\1\uffff\1\123\1\uffff"+
            "\3\123\1\uffff\3\123\1\uffff\4\123\1\uffff\3\123\1\uffff\1\123"+
            "\1\uffff\2\123\1\uffff\1\123\1\uffff\3\123\2\uffff\3\123\1\uffff"+
            "\4\123\4\uffff\1\123\1\uffff\4\123\6\uffff\2\123\1\114\2\uffff"+
            "\1\123\4\uffff\2\123\1\uffff\1\123\2\uffff\2\123\1\uffff\3\123"+
            "\1\115\5\uffff\3\123\1\uffff\6\123\4\uffff\1\123\1\uffff\3\123"+
            "\1\uffff\5\123\1\uffff\3\123\1\117\4\123\1\uffff\1\123\1\uffff"+
            "\2\123\1\uffff\2\123\1\uffff\2\123\1\uffff\1\123\1\uffff\1\123"+
            "\1\uffff\1\123\3\uffff\3\123\5\uffff\2\123\1\uffff\2\123\1\uffff"+
            "\3\123\2\uffff\4\123\5\uffff\1\123\1\uffff\1\123\1\uffff\3\123"+
            "\1\uffff\1\123\2\uffff\3\123\1\120\2\uffff\16\123\1\uffff\1"+
            "\123\2\uffff\2\123\4\uffff\5\123\1\116\4\123\1\uffff\6\123\1"+
            "\uffff\2\123\1\uffff\4\123\1\uffff\7\123\1\uffff\4\123\1\uffff"+
            "\4\123\5\uffff\1\123\1\uffff\1\123\1\uffff\3\123\2\uffff\1\123"+
            "\2\uffff\2\123\1\uffff\1\123\1\uffff\1\123\2\uffff\5\123\1\uffff"+
            "\3\123\2\uffff\3\123\1\122\1\123\1\uffff\5\123\2\uffff\1\123"+
            "\1\uffff\1\113\6\123\4\uffff\1\121\72\uffff\1\123\57\uffff\1"+
            "\123\72\uffff\1\123\67\uffff\1\123\3\uffff\1\123\35\uffff\1"+
            "\123\7\uffff\1\123\112\uffff\1\123",
            "",
            "\1\126\u00c1\uffff\1\5",
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
            "\1\126\u00c1\uffff\1\5",
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
            "\1\132\1\uffff\6\133\1\uffff\1\133\1\uffff\1\133\3\uffff\1"+
            "\133\2\uffff\3\133\1\uffff\2\133\5\uffff\3\133\1\uffff\2\133"+
            "\2\uffff\2\133\1\uffff\1\133\1\uffff\4\133\1\uffff\2\133\1\uffff"+
            "\2\133\1\uffff\2\133\2\uffff\1\133\1\uffff\1\133\1\uffff\1\133"+
            "\6\uffff\1\133\1\uffff\1\133\3\uffff\4\133\1\uffff\1\133\1\uffff"+
            "\3\133\1\uffff\3\133\1\uffff\4\133\1\uffff\3\133\1\uffff\1\133"+
            "\1\uffff\2\133\1\uffff\1\133\1\uffff\3\133\2\uffff\3\133\1\uffff"+
            "\4\133\4\uffff\1\133\1\uffff\4\133\6\uffff\2\133\3\uffff\1\133"+
            "\4\uffff\2\133\1\uffff\1\133\2\uffff\2\133\1\uffff\3\133\6\uffff"+
            "\3\133\1\uffff\6\133\4\uffff\1\133\1\uffff\3\133\1\uffff\5\133"+
            "\1\uffff\3\133\1\uffff\4\133\1\uffff\1\133\1\uffff\2\133\1\uffff"+
            "\2\133\1\uffff\2\133\1\uffff\1\133\1\uffff\1\133\1\uffff\1\133"+
            "\3\uffff\3\133\5\uffff\2\133\1\uffff\2\133\1\uffff\3\133\2\uffff"+
            "\4\133\5\uffff\1\133\1\uffff\1\133\1\uffff\3\133\1\uffff\1\133"+
            "\2\uffff\3\133\3\uffff\16\133\1\uffff\1\133\2\uffff\2\133\4"+
            "\uffff\5\133\1\uffff\4\133\1\uffff\6\133\1\uffff\2\133\1\uffff"+
            "\4\133\1\uffff\7\133\1\uffff\2\133\1\uffff\1\133\1\uffff\4\133"+
            "\5\uffff\1\133\1\uffff\1\133\1\uffff\3\133\2\uffff\1\133\2\uffff"+
            "\2\133\1\uffff\1\133\1\uffff\1\133\2\uffff\5\133\1\uffff\3\133"+
            "\2\uffff\3\133\1\uffff\1\133\1\uffff\5\133\2\uffff\1\133\2\uffff"+
            "\6\133\77\uffff\1\133\57\uffff\1\133\72\uffff\1\133\67\uffff"+
            "\1\133\3\uffff\1\133\35\uffff\1\133\7\uffff\1\133\112\uffff"+
            "\1\133",
            "\1\135\1\uffff\6\136\1\uffff\1\136\1\uffff\1\136\3\uffff\1"+
            "\136\2\uffff\3\136\1\uffff\2\136\5\uffff\3\136\1\uffff\2\136"+
            "\2\uffff\2\136\1\uffff\1\136\1\uffff\4\136\1\uffff\2\136\1\uffff"+
            "\2\136\1\uffff\2\136\2\uffff\1\136\1\uffff\1\136\1\uffff\1\136"+
            "\6\uffff\1\136\1\uffff\1\136\3\uffff\4\136\1\uffff\1\136\1\uffff"+
            "\3\136\1\uffff\3\136\1\uffff\4\136\1\uffff\3\136\1\uffff\1\136"+
            "\1\uffff\2\136\1\uffff\1\136\1\uffff\3\136\2\uffff\3\136\1\uffff"+
            "\4\136\4\uffff\1\136\1\uffff\4\136\6\uffff\2\136\3\uffff\1\136"+
            "\4\uffff\2\136\1\uffff\1\136\2\uffff\2\136\1\uffff\3\136\6\uffff"+
            "\3\136\1\uffff\6\136\4\uffff\1\136\1\uffff\3\136\1\uffff\5\136"+
            "\1\uffff\3\136\1\uffff\4\136\1\uffff\1\136\1\uffff\2\136\1\uffff"+
            "\2\136\1\uffff\2\136\1\uffff\1\136\1\uffff\1\136\1\uffff\1\136"+
            "\3\uffff\3\136\5\uffff\2\136\1\uffff\2\136\1\uffff\3\136\2\uffff"+
            "\4\136\5\uffff\1\136\1\uffff\1\136\1\uffff\3\136\1\uffff\1\136"+
            "\2\uffff\3\136\3\uffff\16\136\1\uffff\1\136\2\uffff\2\136\4"+
            "\uffff\5\136\1\uffff\4\136\1\uffff\6\136\1\uffff\2\136\1\uffff"+
            "\4\136\1\uffff\7\136\1\uffff\2\136\1\137\1\136\1\uffff\4\136"+
            "\5\uffff\1\136\1\uffff\1\136\1\uffff\3\136\2\uffff\1\136\2\uffff"+
            "\2\136\1\uffff\1\136\1\uffff\1\136\1\uffff\1\134\5\136\1\uffff"+
            "\3\136\2\uffff\3\136\1\uffff\1\136\1\uffff\5\136\2\uffff\1\136"+
            "\2\uffff\6\136\4\uffff\1\140\72\uffff\1\136\57\uffff\1\136\72"+
            "\uffff\1\136\67\uffff\1\136\3\uffff\1\136\35\uffff\1\136\7\uffff"+
            "\1\136\112\uffff\1\136",
            "\1\142\102\uffff\1\141",
            "\1\164\13\uffff\1\147\1\162\6\177\1\144\1\177\1\uffff\1\177"+
            "\3\uffff\1\177\1\u0080\1\uffff\3\177\1\uffff\2\177\1\uffff\3"+
            "\u0080\1\uffff\3\177\1\uffff\2\177\1\176\1\173\2\177\1\uffff"+
            "\1\177\1\uffff\4\177\1\uffff\2\177\1\uffff\2\177\1\uffff\2\177"+
            "\2\uffff\1\177\1\uffff\1\177\1\uffff\1\177\3\uffff\1\156\1\160"+
            "\1\uffff\1\177\1\uffff\1\177\2\uffff\1\155\4\177\1\uffff\1\177"+
            "\1\uffff\3\177\1\uffff\3\177\1\uffff\4\177\1\145\3\177\1\u0080"+
            "\1\177\1\uffff\2\177\1\uffff\1\177\1\uffff\3\177\2\uffff\3\177"+
            "\1\u0081\4\177\2\uffff\1\174\1\166\1\177\1\uffff\4\177\1\u0080"+
            "\1\175\4\uffff\2\177\3\uffff\1\177\2\uffff\1\u0080\1\uffff\2"+
            "\177\1\u0080\1\177\2\uffff\2\177\1\uffff\3\177\1\uffff\1\u0080"+
            "\1\uffff\1\172\2\uffff\3\177\1\uffff\6\177\4\uffff\1\177\1\uffff"+
            "\3\177\1\uffff\5\177\1\uffff\3\177\1\u0080\4\177\1\uffff\1\177"+
            "\1\uffff\2\177\1\uffff\2\177\1\uffff\2\177\1\151\1\177\1\167"+
            "\1\177\1\uffff\1\177\3\uffff\3\177\5\uffff\2\177\1\uffff\2\177"+
            "\1\uffff\3\177\2\uffff\4\177\5\uffff\1\177\1\uffff\1\177\1\uffff"+
            "\3\177\1\uffff\1\177\1\uffff\1\u0080\3\177\3\uffff\16\177\1"+
            "\uffff\1\177\2\uffff\2\177\4\uffff\5\177\1\uffff\4\177\1\uffff"+
            "\6\177\1\u0080\2\177\1\uffff\4\177\1\uffff\7\177\1\uffff\2\177"+
            "\1\uffff\1\177\1\uffff\4\177\3\uffff\1\157\1\161\1\177\1\uffff"+
            "\1\177\1\uffff\3\177\1\u0082\1\uffff\1\150\1\165\1\uffff\2\177"+
            "\1\uffff\1\177\1\uffff\1\177\2\uffff\5\177\1\uffff\3\177\2\uffff"+
            "\3\177\1\uffff\1\177\1\uffff\5\177\2\uffff\1\177\2\uffff\6\177"+
            "\4\uffff\1\171\2\uffff\1\152\2\uffff\1\153\1\163\1\152\1\143"+
            "\1\170\6\uffff\1\146\1\154\1\152\47\uffff\1\177\57\uffff\1\177"+
            "\72\uffff\1\177\67\uffff\1\177\3\uffff\1\177\35\uffff\1\177"+
            "\7\uffff\1\177\112\uffff\1\177",
            "\1\u0091\13\uffff\1\u0084\1\u008f\6\u009c\1\uffff\1\u009c\1"+
            "\uffff\1\u009c\3\uffff\1\u009c\1\u009d\1\uffff\3\u009c\1\uffff"+
            "\2\u009c\1\uffff\3\u009d\1\uffff\3\u009c\1\uffff\2\u009c\1\u009b"+
            "\1\u0098\2\u009c\1\uffff\1\u009c\1\uffff\4\u009c\1\uffff\2\u009c"+
            "\1\uffff\2\u009c\1\uffff\2\u009c\2\uffff\1\u009c\1\uffff\1\u009c"+
            "\1\uffff\1\u009c\3\uffff\1\u008b\1\u008d\1\uffff\1\u009c\1\uffff"+
            "\1\u009c\2\uffff\1\u008a\4\u009c\1\uffff\1\u009c\1\uffff\3\u009c"+
            "\1\uffff\3\u009c\1\uffff\4\u009c\1\uffff\3\u009c\1\u009d\1\u009c"+
            "\1\uffff\2\u009c\1\uffff\1\u009c\1\uffff\3\u009c\2\uffff\3\u009c"+
            "\1\u009e\4\u009c\2\uffff\1\u0099\1\u0093\1\u009c\1\uffff\4\u009c"+
            "\1\u009d\1\u009a\4\uffff\2\u009c\3\uffff\1\u009c\2\uffff\1\u009d"+
            "\1\uffff\2\u009c\1\u009d\1\u009c\2\uffff\2\u009c\1\uffff\3\u009c"+
            "\1\uffff\1\u009d\1\uffff\1\u0097\2\uffff\3\u009c\1\uffff\6\u009c"+
            "\4\uffff\1\u009c\1\uffff\3\u009c\1\uffff\5\u009c\1\uffff\3\u009c"+
            "\1\u009d\4\u009c\1\uffff\1\u009c\1\uffff\2\u009c\1\uffff\2\u009c"+
            "\1\uffff\2\u009c\1\u0086\1\u009c\1\u0094\1\u009c\1\uffff\1\u009c"+
            "\3\uffff\3\u009c\5\uffff\2\u009c\1\uffff\2\u009c\1\uffff\3\u009c"+
            "\2\uffff\4\u009c\5\uffff\1\u009c\1\uffff\1\u009c\1\uffff\3\u009c"+
            "\1\uffff\1\u009c\1\uffff\1\u009d\3\u009c\3\uffff\16\u009c\1"+
            "\uffff\1\u009c\2\uffff\2\u009c\4\uffff\5\u009c\1\uffff\4\u009c"+
            "\1\uffff\6\u009c\1\u009d\2\u009c\1\uffff\4\u009c\1\uffff\7\u009c"+
            "\1\uffff\2\u009c\1\uffff\1\u009c\1\uffff\4\u009c\3\uffff\1\u008c"+
            "\1\u008e\1\u009c\1\uffff\1\u009c\1\uffff\3\u009c\2\uffff\1\u0085"+
            "\1\u0092\1\uffff\2\u009c\1\uffff\1\u009c\1\uffff\1\u009c\2\uffff"+
            "\5\u009c\1\uffff\3\u009c\2\uffff\3\u009c\1\uffff\1\u009c\1\uffff"+
            "\5\u009c\2\uffff\1\u009c\2\uffff\6\u009c\4\uffff\1\u0096\2\uffff"+
            "\1\u0087\2\uffff\1\u0088\1\u0090\1\u0087\1\uffff\1\u0095\6\uffff"+
            "\1\u0083\1\u0089\1\u0087\47\uffff\1\u009c\57\uffff\1\u009c\72"+
            "\uffff\1\u009c\67\uffff\1\u009c\3\uffff\1\u009c\35\uffff\1\u009c"+
            "\7\uffff\1\u009c\112\uffff\1\u009c",
            "\1\u00ad\13\uffff\1\u00a0\1\u00ab\6\u00b8\1\uffff\1\u00b8\1"+
            "\uffff\1\u00b8\3\uffff\1\u00b8\1\u00b9\1\uffff\3\u00b8\1\uffff"+
            "\2\u00b8\1\uffff\3\u00b9\1\uffff\3\u00b8\1\uffff\2\u00b8\1\u00b7"+
            "\1\u00b4\2\u00b8\1\uffff\1\u00b8\1\uffff\4\u00b8\1\uffff\2\u00b8"+
            "\1\uffff\2\u00b8\1\uffff\2\u00b8\2\uffff\1\u00b8\1\uffff\1\u00b8"+
            "\1\uffff\1\u00b8\3\uffff\1\u00a7\1\u00a9\1\uffff\1\u00b8\1\uffff"+
            "\1\u00b8\2\uffff\1\u00a6\4\u00b8\1\uffff\1\u00b8\1\uffff\3\u00b8"+
            "\1\uffff\3\u00b8\1\uffff\4\u00b8\1\uffff\3\u00b8\1\u00b9\1\u00b8"+
            "\1\uffff\2\u00b8\1\uffff\1\u00b8\1\uffff\3\u00b8\2\uffff\3\u00b8"+
            "\1\u00ba\4\u00b8\2\uffff\1\u00b5\1\u00af\1\u00b8\1\uffff\4\u00b8"+
            "\1\u00b9\1\u00b6\4\uffff\2\u00b8\3\uffff\1\u00b8\2\uffff\1\u00b9"+
            "\1\uffff\2\u00b8\1\u00b9\1\u00b8\2\uffff\2\u00b8\1\uffff\3\u00b8"+
            "\1\uffff\1\u00b9\1\uffff\1\u00b3\2\uffff\3\u00b8\1\uffff\6\u00b8"+
            "\4\uffff\1\u00b8\1\uffff\3\u00b8\1\uffff\5\u00b8\1\uffff\3\u00b8"+
            "\1\u00b9\4\u00b8\1\uffff\1\u00b8\1\uffff\2\u00b8\1\uffff\2\u00b8"+
            "\1\uffff\2\u00b8\1\u00a2\1\u00b8\1\u00b0\1\u00b8\1\uffff\1\u00b8"+
            "\3\uffff\3\u00b8\5\uffff\2\u00b8\1\uffff\2\u00b8\1\uffff\3\u00b8"+
            "\2\uffff\4\u00b8\5\uffff\1\u00b8\1\uffff\1\u00b8\1\uffff\3\u00b8"+
            "\1\uffff\1\u00b8\1\uffff\1\u00b9\3\u00b8\3\uffff\16\u00b8\1"+
            "\uffff\1\u00b8\2\uffff\2\u00b8\4\uffff\5\u00b8\1\uffff\4\u00b8"+
            "\1\uffff\6\u00b8\1\u00b9\2\u00b8\1\uffff\4\u00b8\1\uffff\7\u00b8"+
            "\1\uffff\2\u00b8\1\uffff\1\u00b8\1\uffff\4\u00b8\3\uffff\1\u00a8"+
            "\1\u00aa\1\u00b8\1\uffff\1\u00b8\1\uffff\3\u00b8\2\uffff\1\u00a1"+
            "\1\u00ae\1\uffff\2\u00b8\1\uffff\1\u00b8\1\uffff\1\u00b8\2\uffff"+
            "\5\u00b8\1\uffff\3\u00b8\2\uffff\3\u00b8\1\uffff\1\u00b8\1\uffff"+
            "\5\u00b8\2\uffff\1\u00b8\2\uffff\6\u00b8\4\uffff\1\u00b2\2\uffff"+
            "\1\u00a3\2\uffff\1\u00a4\1\u00ac\1\u00a3\1\uffff\1\u00b1\6\uffff"+
            "\1\u009f\1\u00a5\1\u00a3\47\uffff\1\u00b8\57\uffff\1\u00b8\72"+
            "\uffff\1\u00b8\67\uffff\1\u00b8\3\uffff\1\u00b8\35\uffff\1\u00b8"+
            "\7\uffff\1\u00b8\112\uffff\1\u00b8",
            "\1\123\1\uffff\6\123\1\uffff\1\123\1\uffff\1\123\3\uffff\1"+
            "\123\2\uffff\3\123\1\uffff\2\123\5\uffff\3\123\1\uffff\2\123"+
            "\2\uffff\2\123\1\uffff\1\123\1\uffff\4\123\1\uffff\2\123\1\uffff"+
            "\2\123\1\uffff\2\123\2\uffff\1\123\1\uffff\1\123\1\uffff\1\123"+
            "\6\uffff\1\123\1\uffff\1\123\3\uffff\4\123\1\uffff\1\123\1\uffff"+
            "\3\123\1\uffff\3\123\1\uffff\4\123\1\uffff\3\123\1\uffff\1\123"+
            "\1\uffff\2\123\1\uffff\1\123\1\uffff\3\123\2\uffff\3\123\1\uffff"+
            "\4\123\4\uffff\1\123\1\uffff\4\123\6\uffff\3\123\2\uffff\1\123"+
            "\4\uffff\2\123\1\uffff\1\123\2\uffff\2\123\1\uffff\4\123\5\uffff"+
            "\3\123\1\uffff\6\123\4\uffff\1\123\1\uffff\3\123\1\uffff\5\123"+
            "\1\uffff\3\123\1\u00bc\4\123\1\uffff\1\123\1\uffff\2\123\1\uffff"+
            "\2\123\1\uffff\2\123\1\uffff\1\123\1\uffff\1\123\1\uffff\1\123"+
            "\3\uffff\3\123\5\uffff\2\123\1\uffff\2\123\1\uffff\3\123\2\uffff"+
            "\4\123\5\uffff\1\123\1\uffff\1\123\1\uffff\3\123\1\uffff\1\123"+
            "\2\uffff\3\123\1\u00bd\2\uffff\16\123\1\uffff\1\123\2\uffff"+
            "\2\123\4\uffff\5\123\1\u00bb\4\123\1\uffff\6\123\1\uffff\2\123"+
            "\1\uffff\4\123\1\uffff\7\123\1\uffff\4\123\1\uffff\4\123\5\uffff"+
            "\1\123\1\uffff\1\123\1\uffff\3\123\2\uffff\1\123\2\uffff\2\123"+
            "\1\uffff\1\123\1\uffff\1\123\2\uffff\5\123\1\uffff\3\123\2\uffff"+
            "\3\123\1\u00bf\1\123\1\uffff\5\123\2\uffff\1\123\1\uffff\7\123"+
            "\4\uffff\1\u00be\72\uffff\1\123\57\uffff\1\123\72\uffff\1\123"+
            "\67\uffff\1\123\3\uffff\1\123\35\uffff\1\123\7\uffff\1\123\112"+
            "\uffff\1\123",
            "\1\u00c6",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
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

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "105:1: atomjoinSource : ( tableSource ( lateralView ^)* | virtualTableSource ( lateralView ^)* | ( LPAREN ( KW_WITH | KW_SELECT | KW_MAP | KW_REDUCE | KW_FROM ) )=> subQuerySource ( lateralView ^)* | ( LPAREN LPAREN selectStatement RPAREN setOperator )=> subQuerySource ( lateralView ^)* | ( LPAREN valuesSource )=> subQuerySource ( lateralView ^)* | partitionedTableFunction ( lateralView ^)* | LPAREN ! joinSource RPAREN !);";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_90 = input.LA(1);

                         
                        int index12_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_90);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA12_91 = input.LA(1);

                         
                        int index12_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_91);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA12_92 = input.LA(1);

                         
                        int index12_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_92);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA12_93 = input.LA(1);

                         
                        int index12_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_93);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA12_94 = input.LA(1);

                         
                        int index12_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_94);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA12_95 = input.LA(1);

                         
                        int index12_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_95);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA12_96 = input.LA(1);

                         
                        int index12_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_96);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA12_97 = input.LA(1);

                         
                        int index12_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_97);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA12_98 = input.LA(1);

                         
                        int index12_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_98);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA12_99 = input.LA(1);

                         
                        int index12_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_99);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA12_100 = input.LA(1);

                         
                        int index12_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_100);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA12_101 = input.LA(1);

                         
                        int index12_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_101);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA12_102 = input.LA(1);

                         
                        int index12_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_102);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA12_103 = input.LA(1);

                         
                        int index12_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_103);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA12_104 = input.LA(1);

                         
                        int index12_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_104);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA12_105 = input.LA(1);

                         
                        int index12_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_105);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA12_106 = input.LA(1);

                         
                        int index12_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_106);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA12_107 = input.LA(1);

                         
                        int index12_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_107);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA12_108 = input.LA(1);

                         
                        int index12_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_108);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA12_109 = input.LA(1);

                         
                        int index12_109 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_109);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA12_110 = input.LA(1);

                         
                        int index12_110 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_110);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA12_111 = input.LA(1);

                         
                        int index12_111 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_111);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA12_112 = input.LA(1);

                         
                        int index12_112 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_112);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA12_113 = input.LA(1);

                         
                        int index12_113 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_113);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA12_114 = input.LA(1);

                         
                        int index12_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_114);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA12_115 = input.LA(1);

                         
                        int index12_115 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_115);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA12_116 = input.LA(1);

                         
                        int index12_116 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_116);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA12_117 = input.LA(1);

                         
                        int index12_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_117);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA12_118 = input.LA(1);

                         
                        int index12_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_118);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA12_119 = input.LA(1);

                         
                        int index12_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_119);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA12_120 = input.LA(1);

                         
                        int index12_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_120);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA12_121 = input.LA(1);

                         
                        int index12_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_121);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA12_122 = input.LA(1);

                         
                        int index12_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_122);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA12_123 = input.LA(1);

                         
                        int index12_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_123);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA12_124 = input.LA(1);

                         
                        int index12_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_124);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA12_125 = input.LA(1);

                         
                        int index12_125 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_125);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA12_126 = input.LA(1);

                         
                        int index12_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_126);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA12_127 = input.LA(1);

                         
                        int index12_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_127);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA12_128 = input.LA(1);

                         
                        int index12_128 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_128);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA12_129 = input.LA(1);

                         
                        int index12_129 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_129);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA12_130 = input.LA(1);

                         
                        int index12_130 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_130);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA12_131 = input.LA(1);

                         
                        int index12_131 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_131);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA12_132 = input.LA(1);

                         
                        int index12_132 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_132);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA12_133 = input.LA(1);

                         
                        int index12_133 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_133);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA12_134 = input.LA(1);

                         
                        int index12_134 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_134);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA12_135 = input.LA(1);

                         
                        int index12_135 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_135);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA12_136 = input.LA(1);

                         
                        int index12_136 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_136);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA12_137 = input.LA(1);

                         
                        int index12_137 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_137);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA12_138 = input.LA(1);

                         
                        int index12_138 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_138);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA12_139 = input.LA(1);

                         
                        int index12_139 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_139);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA12_140 = input.LA(1);

                         
                        int index12_140 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_140);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA12_141 = input.LA(1);

                         
                        int index12_141 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_141);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA12_142 = input.LA(1);

                         
                        int index12_142 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_142);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA12_143 = input.LA(1);

                         
                        int index12_143 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_143);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA12_144 = input.LA(1);

                         
                        int index12_144 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_144);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA12_145 = input.LA(1);

                         
                        int index12_145 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_145);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA12_146 = input.LA(1);

                         
                        int index12_146 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_146);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA12_147 = input.LA(1);

                         
                        int index12_147 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_147);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA12_148 = input.LA(1);

                         
                        int index12_148 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_148);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA12_149 = input.LA(1);

                         
                        int index12_149 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_149);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA12_150 = input.LA(1);

                         
                        int index12_150 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_150);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA12_151 = input.LA(1);

                         
                        int index12_151 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_151);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA12_152 = input.LA(1);

                         
                        int index12_152 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_152);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA12_153 = input.LA(1);

                         
                        int index12_153 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_153);

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA12_154 = input.LA(1);

                         
                        int index12_154 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_154);

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA12_155 = input.LA(1);

                         
                        int index12_155 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_155);

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA12_156 = input.LA(1);

                         
                        int index12_156 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_156);

                        if ( s>=0 ) return s;
                        break;

                    case 67 : 
                        int LA12_157 = input.LA(1);

                         
                        int index12_157 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_157);

                        if ( s>=0 ) return s;
                        break;

                    case 68 : 
                        int LA12_158 = input.LA(1);

                         
                        int index12_158 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_158);

                        if ( s>=0 ) return s;
                        break;

                    case 69 : 
                        int LA12_159 = input.LA(1);

                         
                        int index12_159 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_159);

                        if ( s>=0 ) return s;
                        break;

                    case 70 : 
                        int LA12_160 = input.LA(1);

                         
                        int index12_160 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_160);

                        if ( s>=0 ) return s;
                        break;

                    case 71 : 
                        int LA12_161 = input.LA(1);

                         
                        int index12_161 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_161);

                        if ( s>=0 ) return s;
                        break;

                    case 72 : 
                        int LA12_162 = input.LA(1);

                         
                        int index12_162 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_162);

                        if ( s>=0 ) return s;
                        break;

                    case 73 : 
                        int LA12_163 = input.LA(1);

                         
                        int index12_163 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_163);

                        if ( s>=0 ) return s;
                        break;

                    case 74 : 
                        int LA12_164 = input.LA(1);

                         
                        int index12_164 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_164);

                        if ( s>=0 ) return s;
                        break;

                    case 75 : 
                        int LA12_165 = input.LA(1);

                         
                        int index12_165 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_165);

                        if ( s>=0 ) return s;
                        break;

                    case 76 : 
                        int LA12_166 = input.LA(1);

                         
                        int index12_166 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_166);

                        if ( s>=0 ) return s;
                        break;

                    case 77 : 
                        int LA12_167 = input.LA(1);

                         
                        int index12_167 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_167);

                        if ( s>=0 ) return s;
                        break;

                    case 78 : 
                        int LA12_168 = input.LA(1);

                         
                        int index12_168 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_168);

                        if ( s>=0 ) return s;
                        break;

                    case 79 : 
                        int LA12_169 = input.LA(1);

                         
                        int index12_169 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_169);

                        if ( s>=0 ) return s;
                        break;

                    case 80 : 
                        int LA12_170 = input.LA(1);

                         
                        int index12_170 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_170);

                        if ( s>=0 ) return s;
                        break;

                    case 81 : 
                        int LA12_171 = input.LA(1);

                         
                        int index12_171 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_171);

                        if ( s>=0 ) return s;
                        break;

                    case 82 : 
                        int LA12_172 = input.LA(1);

                         
                        int index12_172 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_172);

                        if ( s>=0 ) return s;
                        break;

                    case 83 : 
                        int LA12_173 = input.LA(1);

                         
                        int index12_173 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_173);

                        if ( s>=0 ) return s;
                        break;

                    case 84 : 
                        int LA12_174 = input.LA(1);

                         
                        int index12_174 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_174);

                        if ( s>=0 ) return s;
                        break;

                    case 85 : 
                        int LA12_175 = input.LA(1);

                         
                        int index12_175 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_175);

                        if ( s>=0 ) return s;
                        break;

                    case 86 : 
                        int LA12_176 = input.LA(1);

                         
                        int index12_176 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_176);

                        if ( s>=0 ) return s;
                        break;

                    case 87 : 
                        int LA12_177 = input.LA(1);

                         
                        int index12_177 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_177);

                        if ( s>=0 ) return s;
                        break;

                    case 88 : 
                        int LA12_178 = input.LA(1);

                         
                        int index12_178 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_178);

                        if ( s>=0 ) return s;
                        break;

                    case 89 : 
                        int LA12_179 = input.LA(1);

                         
                        int index12_179 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_179);

                        if ( s>=0 ) return s;
                        break;

                    case 90 : 
                        int LA12_180 = input.LA(1);

                         
                        int index12_180 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_180);

                        if ( s>=0 ) return s;
                        break;

                    case 91 : 
                        int LA12_181 = input.LA(1);

                         
                        int index12_181 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_181);

                        if ( s>=0 ) return s;
                        break;

                    case 92 : 
                        int LA12_182 = input.LA(1);

                         
                        int index12_182 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_182);

                        if ( s>=0 ) return s;
                        break;

                    case 93 : 
                        int LA12_183 = input.LA(1);

                         
                        int index12_183 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_183);

                        if ( s>=0 ) return s;
                        break;

                    case 94 : 
                        int LA12_184 = input.LA(1);

                         
                        int index12_184 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_184);

                        if ( s>=0 ) return s;
                        break;

                    case 95 : 
                        int LA12_185 = input.LA(1);

                         
                        int index12_185 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_185);

                        if ( s>=0 ) return s;
                        break;

                    case 96 : 
                        int LA12_186 = input.LA(1);

                         
                        int index12_186 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_186);

                        if ( s>=0 ) return s;
                        break;

                    case 97 : 
                        int LA12_187 = input.LA(1);

                         
                        int index12_187 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                        else if ( (true) ) {s = 83;}

                         
                        input.seek(index12_187);

                        if ( s>=0 ) return s;
                        break;

                    case 98 : 
                        int LA12_188 = input.LA(1);

                         
                        int index12_188 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                        else if ( (true) ) {s = 83;}

                         
                        input.seek(index12_188);

                        if ( s>=0 ) return s;
                        break;

                    case 99 : 
                        int LA12_189 = input.LA(1);

                         
                        int index12_189 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                        else if ( (true) ) {s = 83;}

                         
                        input.seek(index12_189);

                        if ( s>=0 ) return s;
                        break;

                    case 100 : 
                        int LA12_190 = input.LA(1);

                         
                        int index12_190 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                        else if ( (true) ) {s = 83;}

                         
                        input.seek(index12_190);

                        if ( s>=0 ) return s;
                        break;

                    case 101 : 
                        int LA12_191 = input.LA(1);

                         
                        int index12_191 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                        else if ( (true) ) {s = 83;}

                         
                        input.seek(index12_191);

                        if ( s>=0 ) return s;
                        break;

                    case 102 : 
                        int LA12_198 = input.LA(1);

                         
                        int index12_198 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred1_FromClauseParser()) ) {s = 199;}

                        else if ( (synpred2_FromClauseParser()) ) {s = 200;}

                        else if ( (synpred3_FromClauseParser()) ) {s = 201;}

                         
                        input.seek(index12_198);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA15_eotS =
        "\123\uffff";
    static final String DFA15_eofS =
        "\1\uffff\2\5\120\uffff";
    static final String DFA15_minS =
        "\1\30\2\11\3\uffff\1\u00ee\44\uffff\1\u00ee\47\uffff";
    static final String DFA15_maxS =
        "\3\u02f1\3\uffff\1\u01b0\44\uffff\1\u01b0\47\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\2\1\3\1\1\111\uffff\1\4\3\uffff";
    static final String DFA15_specialS =
        "\123\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\1\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff"+
            "\3\2\1\uffff\2\2\5\uffff\3\2\1\uffff\2\2\2\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\6\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\3\2\1\uffff\4\2\4\uffff\1\2\1\uffff\4\2\6\uffff\2\2\3\uffff"+
            "\1\2\4\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\6\uffff"+
            "\3\2\1\uffff\6\2\4\uffff\1\2\1\uffff\3\2\1\uffff\5\2\1\uffff"+
            "\3\2\1\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2\5\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff\4\2\5\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\1\2\2\uffff\3\2\3\uffff\16\2\1\uffff"+
            "\1\2\2\uffff\2\2\4\uffff\5\2\1\uffff\4\2\1\uffff\6\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\7\2\1\uffff\2\2\1\3\1\2\1\uffff\4\2"+
            "\5\uffff\1\2\1\uffff\1\2\1\uffff\3\2\2\uffff\1\2\2\uffff\2\2"+
            "\1\uffff\1\2\1\uffff\1\2\2\uffff\5\2\1\uffff\3\2\2\uffff\3\2"+
            "\1\uffff\1\2\1\uffff\5\2\2\uffff\1\2\2\uffff\6\2\4\uffff\1\4"+
            "\72\uffff\1\2\57\uffff\1\2\72\uffff\1\2\67\uffff\1\2\3\uffff"+
            "\1\2\35\uffff\1\2\7\uffff\1\2\112\uffff\1\2",
            "\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\4\5\1\uffff\2\5\5\uffff\3\5\1\uffff"+
            "\2\5\2\uffff\2\5\1\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
            "\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\2\5\5\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\4\5\1\uffff\1\5\1\uffff\3\5\1\uffff"+
            "\3\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\2\5\1\uffff"+
            "\1\5\1\uffff\4\5\1\uffff\3\5\1\uffff\4\5\4\uffff\1\5\1\uffff"+
            "\4\5\3\uffff\1\5\2\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\3\5\1\uffff\1\5\2\uffff\7\5\1\uffff\1\5\3\uffff"+
            "\13\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff"+
            "\10\5\1\uffff\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\1\uffff\1\5\3\uffff"+
            "\2\5\1\uffff\2\5\1\uffff\3\5\2\uffff\4\5\5\uffff\1\5\1\uffff"+
            "\5\5\1\uffff\1\5\2\uffff\4\5\2\uffff\16\5\1\uffff\2\5\1\uffff"+
            "\2\5\4\uffff\12\5\1\uffff\6\5\1\uffff\2\5\1\uffff\4\5\1\uffff"+
            "\7\5\1\uffff\2\5\1\uffff\6\5\5\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\3\5\2\uffff\1\5\2\uffff\2\5\1\uffff\3\5\2\uffff\5\5\1\uffff"+
            "\3\5\1\uffff\4\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff"+
            "\6\5\4\uffff\1\6\14\uffff\1\5\55\uffff\1\5\57\uffff\1\5\72\uffff"+
            "\1\5\67\uffff\1\5\3\uffff\1\5\35\uffff\1\5\7\uffff\1\5\112\uffff"+
            "\1\5",
            "\1\5\6\uffff\1\5\7\uffff\1\5\1\uffff\6\5\1\uffff\1\5\1\uffff"+
            "\1\5\3\uffff\1\5\1\uffff\4\5\1\uffff\2\5\5\uffff\3\5\1\uffff"+
            "\2\5\2\uffff\2\5\1\uffff\1\5\1\uffff\4\5\1\uffff\2\5\1\uffff"+
            "\2\5\1\uffff\2\5\2\uffff\1\5\1\uffff\1\5\1\uffff\2\5\5\uffff"+
            "\1\5\1\uffff\1\5\3\uffff\4\5\1\uffff\1\5\1\uffff\3\5\1\uffff"+
            "\3\5\1\uffff\4\5\1\uffff\3\5\1\uffff\1\5\1\uffff\2\5\1\uffff"+
            "\1\5\1\uffff\4\5\1\uffff\3\5\1\uffff\4\5\4\uffff\1\5\1\uffff"+
            "\4\5\3\uffff\1\5\2\uffff\2\5\1\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\3\5\1\uffff\1\5\2\uffff\7\5\1\uffff\1\5\3\uffff"+
            "\13\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\1\uffff\5\5\1\uffff"+
            "\10\5\1\uffff\4\5\1\uffff\2\5\1\uffff\2\5\1\uffff\1\5\1\uffff"+
            "\1\5\1\uffff\1\5\1\uffff\1\5\1\uffff\3\5\1\uffff\1\5\3\uffff"+
            "\2\5\1\uffff\2\5\1\uffff\3\5\2\uffff\4\5\5\uffff\1\5\1\uffff"+
            "\5\5\1\uffff\1\5\2\uffff\4\5\2\uffff\16\5\1\uffff\2\5\1\uffff"+
            "\2\5\4\uffff\12\5\1\uffff\6\5\1\uffff\2\5\1\uffff\4\5\1\uffff"+
            "\7\5\1\uffff\2\5\1\uffff\6\5\5\uffff\1\5\1\uffff\1\5\1\uffff"+
            "\3\5\2\uffff\1\5\2\uffff\2\5\1\uffff\3\5\2\uffff\5\5\1\uffff"+
            "\3\5\1\uffff\4\5\1\uffff\1\5\1\uffff\5\5\1\uffff\3\5\1\uffff"+
            "\6\5\4\uffff\1\53\14\uffff\1\5\55\uffff\1\5\57\uffff\1\5\72"+
            "\uffff\1\5\67\uffff\1\5\3\uffff\1\5\35\uffff\1\5\7\uffff\1\5"+
            "\112\uffff\1\5",
            "",
            "",
            "",
            "\1\117\u00c1\uffff\1\5",
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
            "\1\117\u00c1\uffff\1\5",
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

    static final short[] DFA15_eot = DFA.unpackEncodedString(DFA15_eotS);
    static final short[] DFA15_eof = DFA.unpackEncodedString(DFA15_eofS);
    static final char[] DFA15_min = DFA.unpackEncodedStringToUnsignedChars(DFA15_minS);
    static final char[] DFA15_max = DFA.unpackEncodedStringToUnsignedChars(DFA15_maxS);
    static final short[] DFA15_accept = DFA.unpackEncodedString(DFA15_acceptS);
    static final short[] DFA15_special = DFA.unpackEncodedString(DFA15_specialS);
    static final short[][] DFA15_transition;

    static {
        int numStates = DFA15_transitionS.length;
        DFA15_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA15_transition[i] = DFA.unpackEncodedString(DFA15_transitionS[i]);
        }
    }

    class DFA15 extends DFA {

        public DFA15(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 15;
            this.eot = DFA15_eot;
            this.eof = DFA15_eof;
            this.min = DFA15_min;
            this.max = DFA15_max;
            this.accept = DFA15_accept;
            this.special = DFA15_special;
            this.transition = DFA15_transition;
        }
        public String getDescription() {
            return "126:5: ( tableSource | virtualTableSource | subQuerySource | partitionedTableFunction )";
        }
    }
    static final String DFA22_eotS =
        "\157\uffff";
    static final String DFA22_eofS =
        "\1\1\156\uffff";
    static final String DFA22_minS =
        "\1\11\2\uffff\1\30\33\uffff\2\0\116\uffff";
    static final String DFA22_maxS =
        "\1\u01ab\2\uffff\1\u02f1\33\uffff\2\0\116\uffff";
    static final String DFA22_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\45\uffff";
    static final String DFA22_specialS =
        "\37\uffff\1\0\1\1\116\uffff}>";
    static final String[] DFA22_transitionS = {
            "\1\3\70\uffff\1\1\23\uffff\1\1\37\uffff\1\1\15\uffff\1\1\34"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\1\1\10\uffff\1\1\3\uffff\1\1"+
            "\1\uffff\1\1\6\uffff\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1"+
            "\14\uffff\1\1\6\uffff\1\1\17\uffff\1\1\5\uffff\1\1\32\uffff"+
            "\1\1\12\uffff\1\1\22\uffff\1\1\14\uffff\1\1\17\uffff\1\1\52"+
            "\uffff\1\1\15\uffff\1\1\14\uffff\1\1\1\uffff\1\1\30\uffff\1"+
            "\1",
            "",
            "",
            "\1\37\1\uffff\6\40\1\uffff\1\40\1\uffff\1\40\3\uffff\1\40\2"+
            "\uffff\3\40\1\uffff\2\40\5\uffff\3\40\1\uffff\2\40\2\uffff\2"+
            "\40\1\uffff\1\40\1\uffff\4\40\1\uffff\2\40\1\uffff\2\40\1\uffff"+
            "\2\40\2\uffff\1\40\1\uffff\1\40\1\uffff\1\40\6\uffff\1\40\1"+
            "\uffff\1\40\3\uffff\4\40\1\uffff\1\40\1\uffff\3\40\1\uffff\3"+
            "\40\1\uffff\4\40\1\uffff\3\40\1\uffff\1\40\1\uffff\2\40\1\uffff"+
            "\1\40\1\uffff\3\40\2\uffff\3\40\1\uffff\4\40\4\uffff\1\40\1"+
            "\uffff\4\40\6\uffff\2\40\3\uffff\1\40\4\uffff\2\40\1\uffff\1"+
            "\40\2\uffff\2\40\1\uffff\3\40\6\uffff\3\40\1\uffff\6\40\1\1"+
            "\3\uffff\1\40\1\uffff\3\40\1\uffff\5\40\1\uffff\3\40\1\uffff"+
            "\4\40\1\uffff\1\40\1\uffff\2\40\1\uffff\2\40\1\uffff\2\40\1"+
            "\uffff\1\40\1\uffff\1\40\1\uffff\1\40\3\uffff\3\40\5\uffff\2"+
            "\40\1\uffff\2\40\1\uffff\3\40\2\uffff\4\40\5\uffff\1\40\1\uffff"+
            "\1\40\1\uffff\3\40\1\uffff\1\40\2\uffff\3\40\3\uffff\16\40\1"+
            "\uffff\1\40\2\uffff\2\40\4\uffff\5\40\1\uffff\4\40\1\uffff\6"+
            "\40\1\uffff\2\40\1\uffff\4\40\1\uffff\7\40\1\uffff\2\40\1\1"+
            "\1\40\1\uffff\4\40\5\uffff\1\40\1\uffff\1\40\1\uffff\3\40\2"+
            "\uffff\1\40\2\uffff\2\40\1\uffff\1\40\1\uffff\1\40\2\uffff\5"+
            "\40\1\uffff\3\40\2\uffff\3\40\1\uffff\1\40\1\uffff\5\40\2\uffff"+
            "\1\40\2\uffff\6\40\4\uffff\1\1\72\uffff\1\40\57\uffff\1\40\72"+
            "\uffff\1\40\67\uffff\1\40\3\uffff\1\40\35\uffff\1\40\7\uffff"+
            "\1\40\112\uffff\1\40",
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
            "",
            ""
    };

    static final short[] DFA22_eot = DFA.unpackEncodedString(DFA22_eotS);
    static final short[] DFA22_eof = DFA.unpackEncodedString(DFA22_eofS);
    static final char[] DFA22_min = DFA.unpackEncodedStringToUnsignedChars(DFA22_minS);
    static final char[] DFA22_max = DFA.unpackEncodedStringToUnsignedChars(DFA22_maxS);
    static final short[] DFA22_accept = DFA.unpackEncodedString(DFA22_acceptS);
    static final short[] DFA22_special = DFA.unpackEncodedString(DFA22_specialS);
    static final short[][] DFA22_transition;

    static {
        int numStates = DFA22_transitionS.length;
        DFA22_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA22_transition[i] = DFA.unpackEncodedString(DFA22_transitionS[i]);
        }
    }

    class DFA22 extends DFA {

        public DFA22(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 22;
            this.eot = DFA22_eot;
            this.eof = DFA22_eof;
            this.min = DFA22_min;
            this.max = DFA22_max;
            this.accept = DFA22_accept;
            this.special = DFA22_special;
            this.transition = DFA22_transition;
        }
        public String getDescription() {
            return "()* loopback of 165:108: ( ( COMMA )=> COMMA identifier )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA22_31 = input.LA(1);

                         
                        int index22_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_FromClauseParser()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_31);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA22_32 = input.LA(1);

                         
                        int index22_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred5_FromClauseParser()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index22_32);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 22, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA25_eotS =
        "\157\uffff";
    static final String DFA25_eofS =
        "\1\1\156\uffff";
    static final String DFA25_minS =
        "\1\11\2\uffff\1\30\33\uffff\2\0\116\uffff";
    static final String DFA25_maxS =
        "\1\u01ab\2\uffff\1\u02f1\33\uffff\2\0\116\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\2\107\uffff\1\1\45\uffff";
    static final String DFA25_specialS =
        "\37\uffff\1\0\1\1\116\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\3\70\uffff\1\1\23\uffff\1\1\37\uffff\1\1\15\uffff\1\1\34"+
            "\uffff\1\1\3\uffff\1\1\1\uffff\1\1\10\uffff\1\1\3\uffff\1\1"+
            "\1\uffff\1\1\6\uffff\1\1\6\uffff\1\1\1\uffff\1\1\3\uffff\1\1"+
            "\14\uffff\1\1\6\uffff\1\1\17\uffff\1\1\5\uffff\1\1\32\uffff"+
            "\1\1\12\uffff\1\1\22\uffff\1\1\14\uffff\1\1\17\uffff\1\1\52"+
            "\uffff\1\1\15\uffff\1\1\14\uffff\1\1\1\uffff\1\1\30\uffff\1"+
            "\1",
            "",
            "",
            "\1\37\1\uffff\6\40\1\uffff\1\40\1\uffff\1\40\3\uffff\1\40\2"+
            "\uffff\3\40\1\uffff\2\40\5\uffff\3\40\1\uffff\2\40\2\uffff\2"+
            "\40\1\uffff\1\40\1\uffff\4\40\1\uffff\2\40\1\uffff\2\40\1\uffff"+
            "\2\40\2\uffff\1\40\1\uffff\1\40\1\uffff\1\40\6\uffff\1\40\1"+
            "\uffff\1\40\3\uffff\4\40\1\uffff\1\40\1\uffff\3\40\1\uffff\3"+
            "\40\1\uffff\4\40\1\uffff\3\40\1\uffff\1\40\1\uffff\2\40\1\uffff"+
            "\1\40\1\uffff\3\40\2\uffff\3\40\1\uffff\4\40\4\uffff\1\40\1"+
            "\uffff\4\40\6\uffff\2\40\3\uffff\1\40\4\uffff\2\40\1\uffff\1"+
            "\40\2\uffff\2\40\1\uffff\3\40\6\uffff\3\40\1\uffff\6\40\1\1"+
            "\3\uffff\1\40\1\uffff\3\40\1\uffff\5\40\1\uffff\3\40\1\uffff"+
            "\4\40\1\uffff\1\40\1\uffff\2\40\1\uffff\2\40\1\uffff\2\40\1"+
            "\uffff\1\40\1\uffff\1\40\1\uffff\1\40\3\uffff\3\40\5\uffff\2"+
            "\40\1\uffff\2\40\1\uffff\3\40\2\uffff\4\40\5\uffff\1\40\1\uffff"+
            "\1\40\1\uffff\3\40\1\uffff\1\40\2\uffff\3\40\3\uffff\16\40\1"+
            "\uffff\1\40\2\uffff\2\40\4\uffff\5\40\1\uffff\4\40\1\uffff\6"+
            "\40\1\uffff\2\40\1\uffff\4\40\1\uffff\7\40\1\uffff\2\40\1\1"+
            "\1\40\1\uffff\4\40\5\uffff\1\40\1\uffff\1\40\1\uffff\3\40\2"+
            "\uffff\1\40\2\uffff\2\40\1\uffff\1\40\1\uffff\1\40\2\uffff\5"+
            "\40\1\uffff\3\40\2\uffff\3\40\1\uffff\1\40\1\uffff\5\40\2\uffff"+
            "\1\40\2\uffff\6\40\4\uffff\1\1\72\uffff\1\40\57\uffff\1\40\72"+
            "\uffff\1\40\67\uffff\1\40\3\uffff\1\40\35\uffff\1\40\7\uffff"+
            "\1\40\112\uffff\1\40",
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
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 168:66: ( ( COMMA )=> COMMA identifier )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_31 = input.LA(1);

                         
                        int index25_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred6_FromClauseParser()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_31);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA25_32 = input.LA(1);

                         
                        int index25_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred6_FromClauseParser()) ) {s = 73;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index25_32);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA41_eotS =
        "\u00c8\uffff";
    static final String DFA41_eofS =
        "\1\4\1\uffff\2\1\27\uffff\3\1\u00aa\uffff";
    static final String DFA41_minS =
        "\1\11\1\uffff\2\11\27\uffff\3\11\u00aa\uffff";
    static final String DFA41_maxS =
        "\1\u02f1\1\uffff\2\u01ab\27\uffff\3\u01ab\u00aa\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\1\2\uffff\1\2\u00c3\uffff";
    static final String DFA41_specialS =
        "\u00c8\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\4\16\uffff\1\2\1\uffff\6\1\1\uffff\1\1\1\uffff\1\1\3\uffff"+
            "\1\1\1\uffff\4\1\1\uffff\2\1\5\uffff\3\1\1\uffff\2\1\2\uffff"+
            "\2\1\1\uffff\1\1\1\uffff\1\3\3\1\1\uffff\2\1\1\uffff\2\1\1\uffff"+
            "\2\1\2\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\4\5\uffff\1\1\1\uffff"+
            "\1\1\3\uffff\4\1\1\uffff\1\1\1\uffff\3\1\1\uffff\3\1\1\uffff"+
            "\4\1\1\uffff\1\33\2\1\1\uffff\1\1\1\uffff\2\1\1\uffff\1\1\1"+
            "\uffff\3\1\1\4\1\uffff\3\1\1\uffff\4\1\4\uffff\1\1\1\uffff\4"+
            "\1\6\uffff\2\1\1\uffff\1\4\1\uffff\1\1\1\uffff\1\4\1\uffff\1"+
            "\4\2\1\1\uffff\1\1\2\uffff\2\1\1\4\3\1\1\4\1\uffff\1\4\3\uffff"+
            "\3\1\1\4\6\1\1\4\1\uffff\1\4\1\uffff\1\1\1\uffff\1\35\2\1\1"+
            "\uffff\5\1\1\uffff\3\1\1\4\4\1\1\uffff\1\1\1\4\2\1\1\uffff\2"+
            "\1\1\uffff\2\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1\1\1\uffff\1"+
            "\4\1\uffff\3\1\1\uffff\1\4\3\uffff\2\1\1\uffff\2\1\1\4\3\1\2"+
            "\uffff\4\1\5\uffff\1\1\1\uffff\1\1\1\4\3\1\1\uffff\1\1\2\uffff"+
            "\3\1\1\4\2\uffff\16\1\1\uffff\1\1\1\4\1\uffff\2\1\4\uffff\5"+
            "\1\1\4\4\1\1\uffff\6\1\1\uffff\2\1\1\uffff\1\34\3\1\1\uffff"+
            "\7\1\1\uffff\2\1\1\uffff\1\1\1\uffff\4\1\5\uffff\1\1\1\uffff"+
            "\1\1\1\uffff\3\1\2\uffff\1\1\2\uffff\2\1\1\uffff\1\1\1\4\1\1"+
            "\2\uffff\5\1\1\uffff\3\1\1\uffff\1\4\3\1\1\uffff\1\1\1\uffff"+
            "\5\1\1\uffff\1\4\1\1\1\4\1\uffff\6\1\21\uffff\1\4\55\uffff\1"+
            "\1\57\uffff\1\1\72\uffff\1\1\67\uffff\1\1\3\uffff\1\1\35\uffff"+
            "\1\1\7\uffff\1\1\112\uffff\1\1",
            "",
            "\1\1\16\uffff\1\1\51\uffff\1\1\23\uffff\1\1\37\uffff\1\1\15"+
            "\uffff\1\1\34\uffff\1\1\3\uffff\1\1\1\uffff\1\1\10\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\6\uffff\1\1\1\uffff\1\1"+
            "\3\uffff\1\1\14\uffff\1\1\6\uffff\1\1\17\uffff\1\1\5\uffff\1"+
            "\1\10\uffff\1\1\21\uffff\1\1\12\uffff\1\1\22\uffff\1\1\14\uffff"+
            "\1\1\17\uffff\1\1\52\uffff\1\1\15\uffff\1\1\14\uffff\1\1\1\uffff"+
            "\1\1\13\uffff\1\4\14\uffff\1\1",
            "\1\1\16\uffff\1\1\37\uffff\1\4\11\uffff\1\1\23\uffff\1\1\37"+
            "\uffff\1\1\15\uffff\1\1\34\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\10\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\6\uffff\1"+
            "\1\1\uffff\1\1\3\uffff\1\1\14\uffff\1\1\6\uffff\1\1\17\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\21\uffff\1\1\12\uffff\1\1\22\uffff"+
            "\1\1\14\uffff\1\1\17\uffff\1\1\52\uffff\1\1\15\uffff\1\1\14"+
            "\uffff\1\1\1\uffff\1\1\30\uffff\1\1",
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
            "\1\1\16\uffff\1\1\37\uffff\1\4\11\uffff\1\1\23\uffff\1\1\37"+
            "\uffff\1\1\15\uffff\1\1\34\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\10\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\6\uffff\1"+
            "\1\1\uffff\1\1\3\uffff\1\1\14\uffff\1\1\6\uffff\1\1\17\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\21\uffff\1\1\12\uffff\1\1\22\uffff"+
            "\1\1\14\uffff\1\1\17\uffff\1\1\52\uffff\1\1\15\uffff\1\1\14"+
            "\uffff\1\1\1\uffff\1\1\30\uffff\1\1",
            "\1\1\16\uffff\1\1\37\uffff\1\4\11\uffff\1\1\23\uffff\1\1\37"+
            "\uffff\1\1\15\uffff\1\1\34\uffff\1\1\3\uffff\1\1\1\uffff\1\1"+
            "\10\uffff\1\1\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\6\uffff\1"+
            "\1\1\uffff\1\1\3\uffff\1\1\14\uffff\1\1\6\uffff\1\1\17\uffff"+
            "\1\1\5\uffff\1\1\10\uffff\1\1\21\uffff\1\1\12\uffff\1\1\22\uffff"+
            "\1\1\14\uffff\1\1\17\uffff\1\1\52\uffff\1\1\15\uffff\1\1\14"+
            "\uffff\1\1\1\uffff\1\1\30\uffff\1\1",
            "\1\1\16\uffff\1\1\51\uffff\1\1\23\uffff\1\1\37\uffff\1\1\15"+
            "\uffff\1\1\34\uffff\1\1\3\uffff\1\1\1\uffff\1\1\10\uffff\1\1"+
            "\3\uffff\1\1\1\uffff\1\1\6\uffff\1\1\6\uffff\1\1\1\uffff\1\1"+
            "\3\uffff\1\1\14\uffff\1\1\6\uffff\1\1\17\uffff\1\1\5\uffff\1"+
            "\1\10\uffff\1\1\21\uffff\1\1\12\uffff\1\1\22\uffff\1\1\14\uffff"+
            "\1\1\17\uffff\1\1\52\uffff\1\1\15\uffff\1\1\14\uffff\1\1\1\uffff"+
            "\1\1\21\uffff\1\4\6\uffff\1\1",
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

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "212:83: ( ( KW_AS )? alias= identifier )?";
        }
    }
    static final String DFA47_eotS =
        "\u00b5\uffff";
    static final String DFA47_eofS =
        "\1\uffff\2\4\u00b2\uffff";
    static final String DFA47_minS =
        "\1\30\2\11\1\30\125\uffff\1\30\133\uffff";
    static final String DFA47_maxS =
        "\4\u02f1\125\uffff\1\u02f1\133\uffff";
    static final String DFA47_acceptS =
        "\4\uffff\1\2\u00ab\uffff\1\1\4\uffff";
    static final String DFA47_specialS =
        "\u00b5\uffff}>";
    static final String[] DFA47_transitionS = {
            "\1\1\1\uffff\6\2\1\uffff\1\2\1\uffff\1\2\3\uffff\1\2\2\uffff"+
            "\3\2\1\uffff\2\2\5\uffff\3\2\1\uffff\2\2\2\uffff\2\2\1\uffff"+
            "\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff\2\2\1\uffff\2\2\2\uffff"+
            "\1\2\1\uffff\1\2\1\uffff\1\2\6\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\2\2\1\uffff\1\2\1\uffff\3\2\2\uffff"+
            "\3\2\1\uffff\4\2\4\uffff\1\2\1\uffff\4\2\6\uffff\2\2\3\uffff"+
            "\1\2\4\uffff\2\2\1\uffff\1\2\2\uffff\2\2\1\uffff\3\2\6\uffff"+
            "\3\2\1\uffff\6\2\4\uffff\1\2\1\uffff\3\2\1\uffff\5\2\1\uffff"+
            "\3\2\1\uffff\4\2\1\uffff\1\2\1\uffff\2\2\1\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\1\uffff\1\2\3\uffff\3\2\5\uffff"+
            "\2\2\1\uffff\2\2\1\uffff\3\2\2\uffff\4\2\5\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\1\2\2\uffff\3\2\3\uffff\16\2\1\uffff"+
            "\1\2\2\uffff\2\2\4\uffff\5\2\1\uffff\4\2\1\uffff\6\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\7\2\1\uffff\2\2\1\uffff\1\2\1\uffff"+
            "\4\2\5\uffff\1\2\1\uffff\1\2\1\uffff\3\2\2\uffff\1\2\2\uffff"+
            "\2\2\1\uffff\1\2\1\uffff\1\2\2\uffff\5\2\1\uffff\3\2\2\uffff"+
            "\3\2\1\uffff\1\2\1\uffff\5\2\2\uffff\1\2\2\uffff\6\2\77\uffff"+
            "\1\2\57\uffff\1\2\72\uffff\1\2\67\uffff\1\2\3\uffff\1\2\35\uffff"+
            "\1\2\7\uffff\1\2\112\uffff\1\2",
            "\1\4\6\uffff\1\3\7\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\4\4\1\uffff\2\4\5\uffff\3\4\1\uffff"+
            "\2\4\2\uffff\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
            "\2\4\1\uffff\2\4\2\uffff\6\4\5\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\4\4\1\uffff\1\4\1\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff"+
            "\3\4\1\uffff\4\4\1\uffff\1\4\1\uffff\10\4\1\uffff\4\4\4\uffff"+
            "\1\4\1\uffff\4\4\3\uffff\2\4\1\uffff\4\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\10\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\13\4\1\uffff\1\4\1\uffff\5\4\1\uffff\5\4\1\uffff\10\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\3\4\1\uffff\1\4\3\uffff\2\4\1\uffff\6\4\2\uffff"+
            "\4\4\5\uffff\1\4\1\uffff\5\4\1\uffff\1\4\2\uffff\4\4\2\uffff"+
            "\16\4\1\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\21\4\1\uffff"+
            "\2\4\1\uffff\4\4\1\uffff\12\4\1\uffff\6\4\5\uffff\3\4\1\uffff"+
            "\3\4\2\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\11\4\1\uffff"+
            "\6\4\1\uffff\5\4\1\uffff\12\4\4\uffff\1\4\14\uffff\1\4\4\uffff"+
            "\1\4\50\uffff\1\4\57\uffff\1\4\72\uffff\1\4\67\uffff\1\4\3\uffff"+
            "\1\4\35\uffff\1\4\7\uffff\1\4\112\uffff\1\4",
            "\1\4\6\uffff\1\131\7\uffff\1\4\1\uffff\6\4\1\uffff\1\4\1\uffff"+
            "\1\4\3\uffff\1\4\1\uffff\4\4\1\uffff\2\4\5\uffff\3\4\1\uffff"+
            "\2\4\2\uffff\2\4\1\uffff\1\4\1\uffff\4\4\1\uffff\2\4\1\uffff"+
            "\2\4\1\uffff\2\4\2\uffff\6\4\5\uffff\1\4\1\uffff\1\4\3\uffff"+
            "\4\4\1\uffff\1\4\1\uffff\3\4\1\uffff\3\4\1\uffff\4\4\1\uffff"+
            "\3\4\1\uffff\4\4\1\uffff\1\4\1\uffff\10\4\1\uffff\4\4\4\uffff"+
            "\1\4\1\uffff\4\4\3\uffff\2\4\1\uffff\4\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\5\4\1\uffff\10\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\13\4\1\uffff\1\4\1\uffff\5\4\1\uffff\5\4\1\uffff\10\4\1\uffff"+
            "\4\4\1\uffff\2\4\1\uffff\4\4\1\uffff\1\4\1\uffff\1\4\1\uffff"+
            "\1\4\1\uffff\3\4\1\uffff\1\4\3\uffff\2\4\1\uffff\6\4\2\uffff"+
            "\4\4\5\uffff\1\4\1\uffff\5\4\1\uffff\1\4\2\uffff\4\4\2\uffff"+
            "\16\4\1\uffff\2\4\1\uffff\2\4\2\uffff\1\4\1\uffff\21\4\1\uffff"+
            "\2\4\1\uffff\4\4\1\uffff\12\4\1\uffff\6\4\5\uffff\3\4\1\uffff"+
            "\3\4\2\uffff\1\4\2\uffff\2\4\1\uffff\3\4\2\uffff\11\4\1\uffff"+
            "\6\4\1\uffff\5\4\1\uffff\12\4\4\uffff\1\4\14\uffff\1\4\4\uffff"+
            "\1\4\50\uffff\1\4\57\uffff\1\4\72\uffff\1\4\67\uffff\1\4\3\uffff"+
            "\1\4\35\uffff\1\4\7\uffff\1\4\112\uffff\1\4",
            "\1\u00b0\1\uffff\6\u00b0\1\uffff\1\u00b0\1\uffff\1\u00b0\3"+
            "\uffff\1\u00b0\2\uffff\3\u00b0\1\uffff\2\u00b0\5\uffff\3\u00b0"+
            "\1\uffff\2\u00b0\2\uffff\2\u00b0\1\uffff\1\u00b0\1\uffff\4\u00b0"+
            "\1\uffff\2\u00b0\1\uffff\2\u00b0\1\uffff\2\u00b0\2\uffff\1\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\1\u00b0\6\uffff\1\u00b0\1\uffff\1\u00b0"+
            "\3\uffff\4\u00b0\1\uffff\1\u00b0\1\uffff\3\u00b0\1\uffff\3\u00b0"+
            "\1\uffff\4\u00b0\1\uffff\3\u00b0\1\uffff\1\u00b0\1\uffff\2\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\3\u00b0\2\uffff\3\u00b0\1\uffff\4\u00b0"+
            "\4\uffff\1\u00b0\1\uffff\4\u00b0\6\uffff\2\u00b0\3\uffff\1\u00b0"+
            "\4\uffff\2\u00b0\1\uffff\1\u00b0\2\uffff\2\u00b0\1\uffff\3\u00b0"+
            "\6\uffff\3\u00b0\1\uffff\6\u00b0\4\uffff\1\u00b0\1\uffff\3\u00b0"+
            "\1\uffff\5\u00b0\1\uffff\3\u00b0\1\uffff\4\u00b0\1\uffff\1\u00b0"+
            "\1\uffff\2\u00b0\1\uffff\2\u00b0\1\uffff\2\u00b0\1\uffff\1\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\1\u00b0\3\uffff\3\u00b0\5\uffff\2\u00b0"+
            "\1\uffff\2\u00b0\1\uffff\3\u00b0\2\uffff\4\u00b0\5\uffff\1\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\3\u00b0\1\uffff\1\u00b0\2\uffff\3\u00b0"+
            "\3\uffff\16\u00b0\1\uffff\1\u00b0\2\uffff\2\u00b0\4\uffff\5"+
            "\u00b0\1\uffff\4\u00b0\1\uffff\6\u00b0\1\uffff\2\u00b0\1\uffff"+
            "\4\u00b0\1\uffff\7\u00b0\1\uffff\2\u00b0\1\uffff\1\u00b0\1\uffff"+
            "\4\u00b0\5\uffff\1\u00b0\1\uffff\1\u00b0\1\uffff\3\u00b0\2\uffff"+
            "\1\u00b0\2\uffff\2\u00b0\1\uffff\1\u00b0\1\uffff\1\u00b0\2\uffff"+
            "\5\u00b0\1\uffff\3\u00b0\2\uffff\3\u00b0\1\uffff\1\u00b0\1\uffff"+
            "\5\u00b0\2\uffff\1\u00b0\2\uffff\6\u00b0\25\uffff\1\4\51\uffff"+
            "\1\u00b0\57\uffff\1\u00b0\72\uffff\1\u00b0\67\uffff\1\u00b0"+
            "\3\uffff\1\u00b0\35\uffff\1\u00b0\7\uffff\1\u00b0\112\uffff"+
            "\1\u00b0",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00b0\1\uffff\6\u00b0\1\uffff\1\u00b0\1\uffff\1\u00b0\3"+
            "\uffff\1\u00b0\2\uffff\3\u00b0\1\uffff\2\u00b0\5\uffff\3\u00b0"+
            "\1\uffff\2\u00b0\2\uffff\2\u00b0\1\uffff\1\u00b0\1\uffff\4\u00b0"+
            "\1\uffff\2\u00b0\1\uffff\2\u00b0\1\uffff\2\u00b0\2\uffff\1\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\1\u00b0\6\uffff\1\u00b0\1\uffff\1\u00b0"+
            "\3\uffff\4\u00b0\1\uffff\1\u00b0\1\uffff\3\u00b0\1\uffff\3\u00b0"+
            "\1\uffff\4\u00b0\1\uffff\3\u00b0\1\uffff\1\u00b0\1\uffff\2\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\3\u00b0\2\uffff\3\u00b0\1\uffff\4\u00b0"+
            "\4\uffff\1\u00b0\1\uffff\4\u00b0\6\uffff\2\u00b0\3\uffff\1\u00b0"+
            "\4\uffff\2\u00b0\1\uffff\1\u00b0\2\uffff\2\u00b0\1\uffff\3\u00b0"+
            "\6\uffff\3\u00b0\1\uffff\6\u00b0\4\uffff\1\u00b0\1\uffff\3\u00b0"+
            "\1\uffff\5\u00b0\1\uffff\3\u00b0\1\uffff\4\u00b0\1\uffff\1\u00b0"+
            "\1\uffff\2\u00b0\1\uffff\2\u00b0\1\uffff\2\u00b0\1\uffff\1\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\1\u00b0\3\uffff\3\u00b0\5\uffff\2\u00b0"+
            "\1\uffff\2\u00b0\1\uffff\3\u00b0\2\uffff\4\u00b0\5\uffff\1\u00b0"+
            "\1\uffff\1\u00b0\1\uffff\3\u00b0\1\uffff\1\u00b0\2\uffff\3\u00b0"+
            "\3\uffff\16\u00b0\1\uffff\1\u00b0\2\uffff\2\u00b0\4\uffff\5"+
            "\u00b0\1\uffff\4\u00b0\1\uffff\6\u00b0\1\uffff\2\u00b0\1\uffff"+
            "\4\u00b0\1\uffff\7\u00b0\1\uffff\2\u00b0\1\uffff\1\u00b0\1\uffff"+
            "\4\u00b0\5\uffff\1\u00b0\1\uffff\1\u00b0\1\uffff\3\u00b0\2\uffff"+
            "\1\u00b0\2\uffff\2\u00b0\1\uffff\1\u00b0\1\uffff\1\u00b0\2\uffff"+
            "\5\u00b0\1\uffff\3\u00b0\2\uffff\3\u00b0\1\uffff\1\u00b0\1\uffff"+
            "\5\u00b0\2\uffff\1\u00b0\2\uffff\6\u00b0\25\uffff\1\4\51\uffff"+
            "\1\u00b0\57\uffff\1\u00b0\72\uffff\1\u00b0\67\uffff\1\u00b0"+
            "\3\uffff\1\u00b0\35\uffff\1\u00b0\7\uffff\1\u00b0\112\uffff"+
            "\1\u00b0",
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

    static final short[] DFA47_eot = DFA.unpackEncodedString(DFA47_eotS);
    static final short[] DFA47_eof = DFA.unpackEncodedString(DFA47_eofS);
    static final char[] DFA47_min = DFA.unpackEncodedStringToUnsignedChars(DFA47_minS);
    static final char[] DFA47_max = DFA.unpackEncodedStringToUnsignedChars(DFA47_maxS);
    static final short[] DFA47_accept = DFA.unpackEncodedString(DFA47_acceptS);
    static final short[] DFA47_special = DFA.unpackEncodedString(DFA47_specialS);
    static final short[][] DFA47_transition;

    static {
        int numStates = DFA47_transitionS.length;
        DFA47_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA47_transition[i] = DFA.unpackEncodedString(DFA47_transitionS[i]);
        }
    }

    class DFA47 extends DFA {

        public DFA47(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 47;
            this.eot = DFA47_eot;
            this.eof = DFA47_eof;
            this.min = DFA47_min;
            this.max = DFA47_max;
            this.accept = DFA47_accept;
            this.special = DFA47_special;
            this.transition = DFA47_transition;
        }
        public String getDescription() {
            return "234:1: tableName : (db= identifier DOT tab= identifier ( DOT meta= identifier )? -> ^( TOK_TABNAME $db $tab ( $meta)? ) |tab= identifier -> ^( TOK_TABNAME $tab) );";
        }
    }
    static final String DFA46_eotS =
        "\132\uffff";
    static final String DFA46_eofS =
        "\1\2\131\uffff";
    static final String DFA46_minS =
        "\1\11\1\30\130\uffff";
    static final String DFA46_maxS =
        "\2\u02f1\130\uffff";
    static final String DFA46_acceptS =
        "\2\uffff\1\2\125\uffff\1\1\1\uffff";
    static final String DFA46_specialS =
        "\132\uffff}>";
    static final String[] DFA46_transitionS = {
            "\1\2\6\uffff\1\1\7\uffff\1\2\1\uffff\6\2\1\uffff\1\2\1\uffff"+
            "\1\2\3\uffff\1\2\1\uffff\4\2\1\uffff\2\2\5\uffff\3\2\1\uffff"+
            "\2\2\2\uffff\2\2\1\uffff\1\2\1\uffff\4\2\1\uffff\2\2\1\uffff"+
            "\2\2\1\uffff\2\2\2\uffff\6\2\5\uffff\1\2\1\uffff\1\2\3\uffff"+
            "\4\2\1\uffff\1\2\1\uffff\3\2\1\uffff\3\2\1\uffff\4\2\1\uffff"+
            "\3\2\1\uffff\4\2\1\uffff\1\2\1\uffff\10\2\1\uffff\4\2\4\uffff"+
            "\1\2\1\uffff\4\2\3\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\5\2\1\uffff\10\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\13\2\1\uffff\1\2\1\uffff\5\2\1\uffff\5\2\1\uffff\10\2\1\uffff"+
            "\4\2\1\uffff\2\2\1\uffff\4\2\1\uffff\1\2\1\uffff\1\2\1\uffff"+
            "\1\2\1\uffff\3\2\1\uffff\1\2\3\uffff\2\2\1\uffff\6\2\2\uffff"+
            "\4\2\5\uffff\1\2\1\uffff\5\2\1\uffff\1\2\2\uffff\4\2\2\uffff"+
            "\16\2\1\uffff\2\2\1\uffff\2\2\2\uffff\1\2\1\uffff\21\2\1\uffff"+
            "\2\2\1\uffff\4\2\1\uffff\12\2\1\uffff\6\2\5\uffff\3\2\1\uffff"+
            "\3\2\2\uffff\1\2\2\uffff\2\2\1\uffff\3\2\2\uffff\11\2\1\uffff"+
            "\6\2\1\uffff\5\2\1\uffff\12\2\4\uffff\1\2\14\uffff\1\2\4\uffff"+
            "\1\2\50\uffff\1\2\57\uffff\1\2\72\uffff\1\2\67\uffff\1\2\3\uffff"+
            "\1\2\35\uffff\1\2\7\uffff\1\2\112\uffff\1\2",
            "\1\130\1\uffff\6\130\1\uffff\1\130\1\uffff\1\130\3\uffff\1"+
            "\130\2\uffff\3\130\1\uffff\2\130\5\uffff\3\130\1\uffff\2\130"+
            "\2\uffff\2\130\1\uffff\1\130\1\uffff\4\130\1\uffff\2\130\1\uffff"+
            "\2\130\1\uffff\2\130\2\uffff\1\130\1\uffff\1\130\1\uffff\1\130"+
            "\6\uffff\1\130\1\uffff\1\130\3\uffff\4\130\1\uffff\1\130\1\uffff"+
            "\3\130\1\uffff\3\130\1\uffff\4\130\1\uffff\3\130\1\uffff\1\130"+
            "\1\uffff\2\130\1\uffff\1\130\1\uffff\3\130\2\uffff\3\130\1\uffff"+
            "\4\130\4\uffff\1\130\1\uffff\4\130\6\uffff\2\130\3\uffff\1\130"+
            "\4\uffff\2\130\1\uffff\1\130\2\uffff\2\130\1\uffff\3\130\6\uffff"+
            "\3\130\1\uffff\6\130\4\uffff\1\130\1\uffff\3\130\1\uffff\5\130"+
            "\1\uffff\3\130\1\uffff\4\130\1\uffff\1\130\1\uffff\2\130\1\uffff"+
            "\2\130\1\uffff\2\130\1\uffff\1\130\1\uffff\1\130\1\uffff\1\130"+
            "\3\uffff\3\130\5\uffff\2\130\1\uffff\2\130\1\uffff\3\130\2\uffff"+
            "\4\130\5\uffff\1\130\1\uffff\1\130\1\uffff\3\130\1\uffff\1\130"+
            "\2\uffff\3\130\3\uffff\16\130\1\uffff\1\130\2\uffff\2\130\4"+
            "\uffff\5\130\1\uffff\4\130\1\uffff\6\130\1\uffff\2\130\1\uffff"+
            "\4\130\1\uffff\7\130\1\uffff\2\130\1\uffff\1\130\1\uffff\4\130"+
            "\5\uffff\1\130\1\uffff\1\130\1\uffff\3\130\2\uffff\1\130\2\uffff"+
            "\2\130\1\uffff\1\130\1\uffff\1\130\2\uffff\5\130\1\uffff\3\130"+
            "\2\uffff\3\130\1\uffff\1\130\1\uffff\5\130\2\uffff\1\130\2\uffff"+
            "\6\130\25\uffff\1\2\51\uffff\1\130\57\uffff\1\130\72\uffff\1"+
            "\130\67\uffff\1\130\3\uffff\1\130\35\uffff\1\130\7\uffff\1\130"+
            "\112\uffff\1\130",
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

    static final short[] DFA46_eot = DFA.unpackEncodedString(DFA46_eotS);
    static final short[] DFA46_eof = DFA.unpackEncodedString(DFA46_eofS);
    static final char[] DFA46_min = DFA.unpackEncodedStringToUnsignedChars(DFA46_minS);
    static final char[] DFA46_max = DFA.unpackEncodedStringToUnsignedChars(DFA46_maxS);
    static final short[] DFA46_accept = DFA.unpackEncodedString(DFA46_acceptS);
    static final short[] DFA46_special = DFA.unpackEncodedString(DFA46_specialS);
    static final short[][] DFA46_transition;

    static {
        int numStates = DFA46_transitionS.length;
        DFA46_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA46_transition[i] = DFA.unpackEncodedString(DFA46_transitionS[i]);
        }
    }

    class DFA46 extends DFA {

        public DFA46(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 46;
            this.eot = DFA46_eot;
            this.eof = DFA46_eof;
            this.min = DFA46_min;
            this.max = DFA46_max;
            this.accept = DFA46_accept;
            this.special = DFA46_special;
            this.transition = DFA46_transition;
        }
        public String getDescription() {
            return "238:38: ( DOT meta= identifier )?";
        }
    }
    static final String DFA57_eotS =
        "\u00c7\uffff";
    static final String DFA57_eofS =
        "\1\3\1\53\1\114\27\uffff\1\155\1\u008e\1\u00af\u00aa\uffff";
    static final String DFA57_minS =
        "\3\11\27\uffff\3\11\u00aa\uffff";
    static final String DFA57_maxS =
        "\1\u02f1\2\u01ab\27\uffff\3\u01ab\u00aa\uffff";
    static final String DFA57_acceptS =
        "\3\uffff\1\2\31\uffff\1\1\5\uffff\40\1\1\uffff\40\1\1\uffff\40\1"+
        "\1\uffff\40\1\1\uffff\40\1";
    static final String DFA57_specialS =
        "\1\0\1\1\1\2\27\uffff\1\3\1\4\1\5\u00aa\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\3\16\uffff\1\1\1\uffff\6\35\1\uffff\1\35\1\uffff\1\35\3\uffff"+
            "\1\35\2\uffff\3\35\1\uffff\2\35\5\uffff\3\35\1\uffff\2\35\2"+
            "\uffff\2\35\1\uffff\1\35\1\uffff\1\2\3\35\1\uffff\2\35\1\uffff"+
            "\2\35\1\uffff\2\35\2\uffff\1\35\1\uffff\1\35\1\uffff\1\35\1"+
            "\3\5\uffff\1\35\1\uffff\1\35\3\uffff\4\35\1\uffff\1\35\1\uffff"+
            "\3\35\1\uffff\3\35\1\uffff\4\35\1\uffff\1\32\2\35\1\uffff\1"+
            "\35\1\uffff\2\35\1\uffff\1\35\1\uffff\3\35\1\3\1\uffff\3\35"+
            "\1\uffff\4\35\4\uffff\1\35\1\uffff\4\35\6\uffff\2\35\1\uffff"+
            "\1\3\1\uffff\1\35\1\uffff\1\3\1\uffff\1\3\2\35\1\uffff\1\35"+
            "\2\uffff\2\35\1\3\3\35\1\3\1\uffff\1\3\3\uffff\3\35\1\3\6\35"+
            "\1\3\1\uffff\1\3\1\uffff\1\35\1\uffff\1\34\2\35\1\uffff\5\35"+
            "\1\uffff\3\35\1\3\4\35\1\uffff\1\35\1\3\2\35\1\uffff\2\35\1"+
            "\uffff\2\35\1\uffff\1\35\1\uffff\1\35\1\uffff\1\35\1\uffff\1"+
            "\3\1\uffff\3\35\1\uffff\1\3\3\uffff\2\35\1\uffff\2\35\1\3\3"+
            "\35\2\uffff\4\35\5\uffff\1\35\1\uffff\1\35\1\3\3\35\1\uffff"+
            "\1\35\2\uffff\3\35\1\3\2\uffff\16\35\1\uffff\1\35\1\3\1\uffff"+
            "\2\35\4\uffff\5\35\1\3\4\35\1\uffff\6\35\1\uffff\2\35\1\uffff"+
            "\1\33\3\35\1\uffff\7\35\1\uffff\2\35\1\uffff\1\35\1\uffff\4"+
            "\35\5\uffff\1\35\1\uffff\1\35\1\uffff\3\35\2\uffff\1\35\2\uffff"+
            "\2\35\1\uffff\1\35\1\3\1\35\2\uffff\5\35\1\uffff\3\35\1\uffff"+
            "\1\3\3\35\1\uffff\1\35\1\uffff\5\35\1\uffff\1\3\1\35\1\3\1\uffff"+
            "\6\35\21\uffff\1\3\55\uffff\1\35\57\uffff\1\35\72\uffff\1\35"+
            "\67\uffff\1\35\3\uffff\1\35\35\uffff\1\35\7\uffff\1\35\112\uffff"+
            "\1\35",
            "\1\44\16\uffff\1\102\51\uffff\1\72\23\uffff\1\47\37\uffff\1"+
            "\73\15\uffff\1\67\34\uffff\1\52\3\uffff\1\61\1\uffff\1\62\10"+
            "\uffff\1\46\3\uffff\1\54\1\uffff\1\66\6\uffff\1\45\6\uffff\1"+
            "\43\1\uffff\1\50\3\uffff\1\75\14\uffff\1\56\6\uffff\1\70\17"+
            "\uffff\1\77\5\uffff\1\71\10\uffff\1\101\21\uffff\1\64\12\uffff"+
            "\1\57\22\uffff\1\51\14\uffff\1\55\17\uffff\1\74\52\uffff\1\65"+
            "\15\uffff\1\100\14\uffff\1\60\1\uffff\1\63\13\uffff\1\3\14\uffff"+
            "\1\76",
            "\1\105\16\uffff\1\143\37\uffff\1\3\11\uffff\1\133\23\uffff"+
            "\1\110\37\uffff\1\134\15\uffff\1\130\34\uffff\1\113\3\uffff"+
            "\1\122\1\uffff\1\123\10\uffff\1\107\3\uffff\1\115\1\uffff\1"+
            "\127\6\uffff\1\106\6\uffff\1\104\1\uffff\1\111\3\uffff\1\136"+
            "\14\uffff\1\117\6\uffff\1\131\17\uffff\1\140\5\uffff\1\132\10"+
            "\uffff\1\142\21\uffff\1\125\12\uffff\1\120\22\uffff\1\112\14"+
            "\uffff\1\116\17\uffff\1\135\52\uffff\1\126\15\uffff\1\141\14"+
            "\uffff\1\121\1\uffff\1\124\30\uffff\1\137",
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
            "\1\146\16\uffff\1\u0084\37\uffff\1\3\11\uffff\1\174\23\uffff"+
            "\1\151\37\uffff\1\175\15\uffff\1\171\34\uffff\1\154\3\uffff"+
            "\1\163\1\uffff\1\164\10\uffff\1\150\3\uffff\1\156\1\uffff\1"+
            "\170\6\uffff\1\147\6\uffff\1\145\1\uffff\1\152\3\uffff\1\177"+
            "\14\uffff\1\160\6\uffff\1\172\17\uffff\1\u0081\5\uffff\1\173"+
            "\10\uffff\1\u0083\21\uffff\1\166\12\uffff\1\161\22\uffff\1\153"+
            "\14\uffff\1\157\17\uffff\1\176\52\uffff\1\167\15\uffff\1\u0082"+
            "\14\uffff\1\162\1\uffff\1\165\30\uffff\1\u0080",
            "\1\u0087\16\uffff\1\u00a5\37\uffff\1\3\11\uffff\1\u009d\23"+
            "\uffff\1\u008a\37\uffff\1\u009e\15\uffff\1\u009a\34\uffff\1"+
            "\u008d\3\uffff\1\u0094\1\uffff\1\u0095\10\uffff\1\u0089\3\uffff"+
            "\1\u008f\1\uffff\1\u0099\6\uffff\1\u0088\6\uffff\1\u0086\1\uffff"+
            "\1\u008b\3\uffff\1\u00a0\14\uffff\1\u0091\6\uffff\1\u009b\17"+
            "\uffff\1\u00a2\5\uffff\1\u009c\10\uffff\1\u00a4\21\uffff\1\u0097"+
            "\12\uffff\1\u0092\22\uffff\1\u008c\14\uffff\1\u0090\17\uffff"+
            "\1\u009f\52\uffff\1\u0098\15\uffff\1\u00a3\14\uffff\1\u0093"+
            "\1\uffff\1\u0096\30\uffff\1\u00a1",
            "\1\u00a8\16\uffff\1\u00c6\51\uffff\1\u00be\23\uffff\1\u00ab"+
            "\37\uffff\1\u00bf\15\uffff\1\u00bb\34\uffff\1\u00ae\3\uffff"+
            "\1\u00b5\1\uffff\1\u00b6\10\uffff\1\u00aa\3\uffff\1\u00b0\1"+
            "\uffff\1\u00ba\6\uffff\1\u00a9\6\uffff\1\u00a7\1\uffff\1\u00ac"+
            "\3\uffff\1\u00c1\14\uffff\1\u00b2\6\uffff\1\u00bc\17\uffff\1"+
            "\u00c3\5\uffff\1\u00bd\10\uffff\1\u00c5\21\uffff\1\u00b8\12"+
            "\uffff\1\u00b3\22\uffff\1\u00ad\14\uffff\1\u00b1\17\uffff\1"+
            "\u00c0\52\uffff\1\u00b9\15\uffff\1\u00c4\14\uffff\1\u00b4\1"+
            "\uffff\1\u00b7\21\uffff\1\3\6\uffff\1\u00c2",
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

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "290:27: ( ( Identifier )=>alias= identifier )?";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA57_0 = input.LA(1);

                         
                        int index57_0 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA57_0==Identifier) ) {s = 1;}

                        else if ( (LA57_0==KW_CLUSTER) ) {s = 2;}

                        else if ( (LA57_0==EOF||LA57_0==COMMA||LA57_0==KW_CROSS||LA57_0==KW_EXCEPT||LA57_0==KW_FULL||LA57_0==KW_GROUP||LA57_0==KW_HAVING||LA57_0==KW_INNER||LA57_0==KW_INSERT||LA57_0==KW_INTERSECT||LA57_0==KW_JOIN||LA57_0==KW_LATERAL||LA57_0==KW_LEFT||LA57_0==KW_MAP||LA57_0==KW_MINUS||LA57_0==KW_ON||LA57_0==KW_ORDER||LA57_0==KW_PARTITION||LA57_0==KW_QUALIFY||LA57_0==KW_REDUCE||LA57_0==KW_RIGHT||LA57_0==KW_SELECT||LA57_0==KW_UNION||LA57_0==KW_USING||LA57_0==KW_WHERE||LA57_0==KW_WINDOW||LA57_0==RPAREN) ) {s = 3;}

                        else if ( (LA57_0==KW_DISTRIBUTE) ) {s = 26;}

                        else if ( (LA57_0==KW_SORT) ) {s = 27;}

                        else if ( (LA57_0==KW_LIMIT) ) {s = 28;}

                        else if ( ((LA57_0 >= KW_ABORT && LA57_0 <= KW_AFTER)||LA57_0==KW_ALLOC_FRACTION||LA57_0==KW_ANALYZE||LA57_0==KW_ARCHIVE||(LA57_0 >= KW_ASC && LA57_0 <= KW_AT)||(LA57_0 >= KW_AUTOCOMMIT && LA57_0 <= KW_BEFORE)||(LA57_0 >= KW_BRANCH && LA57_0 <= KW_BUCKETS)||(LA57_0 >= KW_CACHE && LA57_0 <= KW_CASCADE)||(LA57_0 >= KW_CBO && LA57_0 <= KW_CHANGE)||LA57_0==KW_CHECK||(LA57_0 >= KW_CLUSTERED && LA57_0 <= KW_COLLECTION)||(LA57_0 >= KW_COLUMNS && LA57_0 <= KW_COMMENT)||(LA57_0 >= KW_COMPACT && LA57_0 <= KW_COMPACTIONS)||(LA57_0 >= KW_COMPUTE && LA57_0 <= KW_CONCATENATE)||LA57_0==KW_CONTINUE||LA57_0==KW_COST||LA57_0==KW_CRON||LA57_0==KW_DATA||LA57_0==KW_DATABASES||(LA57_0 >= KW_DATETIME && LA57_0 <= KW_DCPROPERTIES)||LA57_0==KW_DEBUG||(LA57_0 >= KW_DEFAULT && LA57_0 <= KW_DEFINED)||(LA57_0 >= KW_DELIMITED && LA57_0 <= KW_DESC)||(LA57_0 >= KW_DETAIL && LA57_0 <= KW_DISABLE)||(LA57_0 >= KW_DISTRIBUTED && LA57_0 <= KW_DO)||LA57_0==KW_DOW||(LA57_0 >= KW_DUMP && LA57_0 <= KW_ELEM_TYPE)||LA57_0==KW_ENABLE||(LA57_0 >= KW_ENFORCED && LA57_0 <= KW_EVERY)||(LA57_0 >= KW_EXCLUSIVE && LA57_0 <= KW_EXECUTED)||(LA57_0 >= KW_EXPIRE_SNAPSHOTS && LA57_0 <= KW_EXPRESSION)||LA57_0==KW_FAST_FORWARD||(LA57_0 >= KW_FIELDS && LA57_0 <= KW_FIRST)||(LA57_0 >= KW_FORMAT && LA57_0 <= KW_FORMATTED)||LA57_0==KW_FUNCTIONS||(LA57_0 >= KW_HOUR && LA57_0 <= KW_IDXPROPERTIES)||LA57_0==KW_IGNORE||(LA57_0 >= KW_INDEX && LA57_0 <= KW_INDEXES)||(LA57_0 >= KW_INPATH && LA57_0 <= KW_INPUTFORMAT)||(LA57_0 >= KW_ISOLATION && LA57_0 <= KW_JAR)||(LA57_0 >= KW_JOINCOST && LA57_0 <= KW_LAST)||LA57_0==KW_LEVEL||(LA57_0 >= KW_LINES && LA57_0 <= KW_LOAD)||(LA57_0 >= KW_LOCATION && LA57_0 <= KW_LONG)||(LA57_0 >= KW_MANAGED && LA57_0 <= KW_MANAGEMENT)||(LA57_0 >= KW_MAPJOIN && LA57_0 <= KW_MATERIALIZED)||LA57_0==KW_METADATA||(LA57_0 >= KW_MINUTE && LA57_0 <= KW_MONTH)||(LA57_0 >= KW_MOVE && LA57_0 <= KW_MSCK)||(LA57_0 >= KW_NORELY && LA57_0 <= KW_NOSCAN)||LA57_0==KW_NOVALIDATE||LA57_0==KW_NULLS||LA57_0==KW_OFFSET||(LA57_0 >= KW_OPERATOR && LA57_0 <= KW_OPTION)||(LA57_0 >= KW_OUTPUTDRIVER && LA57_0 <= KW_OUTPUTFORMAT)||(LA57_0 >= KW_OVERWRITE && LA57_0 <= KW_OWNER)||(LA57_0 >= KW_PARTITIONED && LA57_0 <= KW_PATH)||(LA57_0 >= KW_PLAN && LA57_0 <= KW_POOL)||LA57_0==KW_PRINCIPALS||LA57_0==KW_PURGE||(LA57_0 >= KW_QUARTER && LA57_0 <= KW_QUERY_PARALLELISM)||LA57_0==KW_READ||(LA57_0 >= KW_REBUILD && LA57_0 <= KW_RECORDWRITER)||(LA57_0 >= KW_RELOAD && LA57_0 <= KW_RETENTION)||LA57_0==KW_REWRITE||(LA57_0 >= KW_ROLE && LA57_0 <= KW_ROLES)||(LA57_0 >= KW_SCHEDULED && LA57_0 <= KW_SECOND)||(LA57_0 >= KW_SEMI && LA57_0 <= KW_SERVER)||(LA57_0 >= KW_SETS && LA57_0 <= KW_SKEWED)||(LA57_0 >= KW_SNAPSHOT && LA57_0 <= KW_SNAPSHOTS)||(LA57_0 >= KW_SORTED && LA57_0 <= KW_SSL)||(LA57_0 >= KW_STATISTICS && LA57_0 <= KW_SUMMARY)||(LA57_0 >= KW_SYSTEM_TIME && LA57_0 <= KW_SYSTEM_VERSION)||LA57_0==KW_TABLES||(LA57_0 >= KW_TAG && LA57_0 <= KW_TERMINATED)||LA57_0==KW_TINYINT||LA57_0==KW_TOUCH||(LA57_0 >= KW_TRANSACTION && LA57_0 <= KW_TRANSACTIONS)||LA57_0==KW_TRIM||(LA57_0 >= KW_TYPE && LA57_0 <= KW_UNARCHIVE)||LA57_0==KW_UNDO||LA57_0==KW_UNIONTYPE||(LA57_0 >= KW_UNKNOWN && LA57_0 <= KW_UNSIGNED)||(LA57_0 >= KW_URI && LA57_0 <= KW_USE)||(LA57_0 >= KW_UTC && LA57_0 <= KW_VALIDATE)||LA57_0==KW_VALUE_TYPE||(LA57_0 >= KW_VECTORIZATION && LA57_0 <= KW_WEEK)||LA57_0==KW_WHILE||(LA57_0 >= KW_WITHIN && LA57_0 <= KW_ZONE)||LA57_0==KW_BATCH||LA57_0==KW_DAYOFWEEK||LA57_0==KW_HOLD_DDLTIME||LA57_0==KW_NO_DROP||LA57_0==KW_OFFLINE||LA57_0==KW_PROTECTION||LA57_0==KW_READONLY||LA57_0==KW_TIMESTAMPTZ) && (synpred10_FromClauseParser())) {s = 29;}

                         
                        input.seek(index57_0);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA57_1 = input.LA(1);

                         
                        int index57_1 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA57_1==LPAREN) ) {s = 3;}

                        else if ( (LA57_1==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 35;}

                        else if ( (LA57_1==COMMA) && (synpred10_FromClauseParser())) {s = 36;}

                        else if ( (LA57_1==KW_JOIN) && (synpred10_FromClauseParser())) {s = 37;}

                        else if ( (LA57_1==KW_INNER) && (synpred10_FromClauseParser())) {s = 38;}

                        else if ( (LA57_1==KW_CROSS) && (synpred10_FromClauseParser())) {s = 39;}

                        else if ( (LA57_1==KW_LEFT) && (synpred10_FromClauseParser())) {s = 40;}

                        else if ( (LA57_1==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 41;}

                        else if ( (LA57_1==KW_FULL) && (synpred10_FromClauseParser())) {s = 42;}

                        else if ( (LA57_1==EOF) && (synpred10_FromClauseParser())) {s = 43;}

                        else if ( (LA57_1==KW_INSERT) && (synpred10_FromClauseParser())) {s = 44;}

                        else if ( (LA57_1==KW_SELECT) && (synpred10_FromClauseParser())) {s = 45;}

                        else if ( (LA57_1==KW_MAP) && (synpred10_FromClauseParser())) {s = 46;}

                        else if ( (LA57_1==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 47;}

                        else if ( (LA57_1==KW_WHERE) && (synpred10_FromClauseParser())) {s = 48;}

                        else if ( (LA57_1==KW_GROUP) && (synpred10_FromClauseParser())) {s = 49;}

                        else if ( (LA57_1==KW_HAVING) && (synpred10_FromClauseParser())) {s = 50;}

                        else if ( (LA57_1==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 51;}

                        else if ( (LA57_1==KW_QUALIFY) && (synpred10_FromClauseParser())) {s = 52;}

                        else if ( (LA57_1==KW_UNION) && (synpred10_FromClauseParser())) {s = 53;}

                        else if ( (LA57_1==KW_INTERSECT) && (synpred10_FromClauseParser())) {s = 54;}

                        else if ( (LA57_1==KW_EXCEPT) && (synpred10_FromClauseParser())) {s = 55;}

                        else if ( (LA57_1==KW_MINUS) && (synpred10_FromClauseParser())) {s = 56;}

                        else if ( (LA57_1==KW_ORDER) && (synpred10_FromClauseParser())) {s = 57;}

                        else if ( (LA57_1==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 58;}

                        else if ( (LA57_1==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 59;}

                        else if ( (LA57_1==KW_SORT) && (synpred10_FromClauseParser())) {s = 60;}

                        else if ( (LA57_1==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 61;}

                        else if ( (LA57_1==RPAREN) && (synpred10_FromClauseParser())) {s = 62;}

                        else if ( (LA57_1==KW_ON) && (synpred10_FromClauseParser())) {s = 63;}

                        else if ( (LA57_1==KW_USING) && (synpred10_FromClauseParser())) {s = 64;}

                        else if ( (LA57_1==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 65;}

                        else if ( (LA57_1==Identifier) && (synpred10_FromClauseParser())) {s = 66;}

                         
                        input.seek(index57_1);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA57_2 = input.LA(1);

                         
                        int index57_2 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA57_2==KW_BY) ) {s = 3;}

                        else if ( (LA57_2==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 68;}

                        else if ( (LA57_2==COMMA) && (synpred10_FromClauseParser())) {s = 69;}

                        else if ( (LA57_2==KW_JOIN) && (synpred10_FromClauseParser())) {s = 70;}

                        else if ( (LA57_2==KW_INNER) && (synpred10_FromClauseParser())) {s = 71;}

                        else if ( (LA57_2==KW_CROSS) && (synpred10_FromClauseParser())) {s = 72;}

                        else if ( (LA57_2==KW_LEFT) && (synpred10_FromClauseParser())) {s = 73;}

                        else if ( (LA57_2==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 74;}

                        else if ( (LA57_2==KW_FULL) && (synpred10_FromClauseParser())) {s = 75;}

                        else if ( (LA57_2==EOF) && (synpred10_FromClauseParser())) {s = 76;}

                        else if ( (LA57_2==KW_INSERT) && (synpred10_FromClauseParser())) {s = 77;}

                        else if ( (LA57_2==KW_SELECT) && (synpred10_FromClauseParser())) {s = 78;}

                        else if ( (LA57_2==KW_MAP) && (synpred10_FromClauseParser())) {s = 79;}

                        else if ( (LA57_2==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 80;}

                        else if ( (LA57_2==KW_WHERE) && (synpred10_FromClauseParser())) {s = 81;}

                        else if ( (LA57_2==KW_GROUP) && (synpred10_FromClauseParser())) {s = 82;}

                        else if ( (LA57_2==KW_HAVING) && (synpred10_FromClauseParser())) {s = 83;}

                        else if ( (LA57_2==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 84;}

                        else if ( (LA57_2==KW_QUALIFY) && (synpred10_FromClauseParser())) {s = 85;}

                        else if ( (LA57_2==KW_UNION) && (synpred10_FromClauseParser())) {s = 86;}

                        else if ( (LA57_2==KW_INTERSECT) && (synpred10_FromClauseParser())) {s = 87;}

                        else if ( (LA57_2==KW_EXCEPT) && (synpred10_FromClauseParser())) {s = 88;}

                        else if ( (LA57_2==KW_MINUS) && (synpred10_FromClauseParser())) {s = 89;}

                        else if ( (LA57_2==KW_ORDER) && (synpred10_FromClauseParser())) {s = 90;}

                        else if ( (LA57_2==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 91;}

                        else if ( (LA57_2==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 92;}

                        else if ( (LA57_2==KW_SORT) && (synpred10_FromClauseParser())) {s = 93;}

                        else if ( (LA57_2==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 94;}

                        else if ( (LA57_2==RPAREN) && (synpred10_FromClauseParser())) {s = 95;}

                        else if ( (LA57_2==KW_ON) && (synpred10_FromClauseParser())) {s = 96;}

                        else if ( (LA57_2==KW_USING) && (synpred10_FromClauseParser())) {s = 97;}

                        else if ( (LA57_2==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 98;}

                        else if ( (LA57_2==Identifier) && (synpred10_FromClauseParser())) {s = 99;}

                         
                        input.seek(index57_2);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA57_26 = input.LA(1);

                         
                        int index57_26 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA57_26==KW_BY) ) {s = 3;}

                        else if ( (LA57_26==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 101;}

                        else if ( (LA57_26==COMMA) && (synpred10_FromClauseParser())) {s = 102;}

                        else if ( (LA57_26==KW_JOIN) && (synpred10_FromClauseParser())) {s = 103;}

                        else if ( (LA57_26==KW_INNER) && (synpred10_FromClauseParser())) {s = 104;}

                        else if ( (LA57_26==KW_CROSS) && (synpred10_FromClauseParser())) {s = 105;}

                        else if ( (LA57_26==KW_LEFT) && (synpred10_FromClauseParser())) {s = 106;}

                        else if ( (LA57_26==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 107;}

                        else if ( (LA57_26==KW_FULL) && (synpred10_FromClauseParser())) {s = 108;}

                        else if ( (LA57_26==EOF) && (synpred10_FromClauseParser())) {s = 109;}

                        else if ( (LA57_26==KW_INSERT) && (synpred10_FromClauseParser())) {s = 110;}

                        else if ( (LA57_26==KW_SELECT) && (synpred10_FromClauseParser())) {s = 111;}

                        else if ( (LA57_26==KW_MAP) && (synpred10_FromClauseParser())) {s = 112;}

                        else if ( (LA57_26==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 113;}

                        else if ( (LA57_26==KW_WHERE) && (synpred10_FromClauseParser())) {s = 114;}

                        else if ( (LA57_26==KW_GROUP) && (synpred10_FromClauseParser())) {s = 115;}

                        else if ( (LA57_26==KW_HAVING) && (synpred10_FromClauseParser())) {s = 116;}

                        else if ( (LA57_26==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 117;}

                        else if ( (LA57_26==KW_QUALIFY) && (synpred10_FromClauseParser())) {s = 118;}

                        else if ( (LA57_26==KW_UNION) && (synpred10_FromClauseParser())) {s = 119;}

                        else if ( (LA57_26==KW_INTERSECT) && (synpred10_FromClauseParser())) {s = 120;}

                        else if ( (LA57_26==KW_EXCEPT) && (synpred10_FromClauseParser())) {s = 121;}

                        else if ( (LA57_26==KW_MINUS) && (synpred10_FromClauseParser())) {s = 122;}

                        else if ( (LA57_26==KW_ORDER) && (synpred10_FromClauseParser())) {s = 123;}

                        else if ( (LA57_26==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 124;}

                        else if ( (LA57_26==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 125;}

                        else if ( (LA57_26==KW_SORT) && (synpred10_FromClauseParser())) {s = 126;}

                        else if ( (LA57_26==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 127;}

                        else if ( (LA57_26==RPAREN) && (synpred10_FromClauseParser())) {s = 128;}

                        else if ( (LA57_26==KW_ON) && (synpred10_FromClauseParser())) {s = 129;}

                        else if ( (LA57_26==KW_USING) && (synpred10_FromClauseParser())) {s = 130;}

                        else if ( (LA57_26==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 131;}

                        else if ( (LA57_26==Identifier) && (synpred10_FromClauseParser())) {s = 132;}

                         
                        input.seek(index57_26);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA57_27 = input.LA(1);

                         
                        int index57_27 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA57_27==KW_BY) ) {s = 3;}

                        else if ( (LA57_27==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 134;}

                        else if ( (LA57_27==COMMA) && (synpred10_FromClauseParser())) {s = 135;}

                        else if ( (LA57_27==KW_JOIN) && (synpred10_FromClauseParser())) {s = 136;}

                        else if ( (LA57_27==KW_INNER) && (synpred10_FromClauseParser())) {s = 137;}

                        else if ( (LA57_27==KW_CROSS) && (synpred10_FromClauseParser())) {s = 138;}

                        else if ( (LA57_27==KW_LEFT) && (synpred10_FromClauseParser())) {s = 139;}

                        else if ( (LA57_27==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 140;}

                        else if ( (LA57_27==KW_FULL) && (synpred10_FromClauseParser())) {s = 141;}

                        else if ( (LA57_27==EOF) && (synpred10_FromClauseParser())) {s = 142;}

                        else if ( (LA57_27==KW_INSERT) && (synpred10_FromClauseParser())) {s = 143;}

                        else if ( (LA57_27==KW_SELECT) && (synpred10_FromClauseParser())) {s = 144;}

                        else if ( (LA57_27==KW_MAP) && (synpred10_FromClauseParser())) {s = 145;}

                        else if ( (LA57_27==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 146;}

                        else if ( (LA57_27==KW_WHERE) && (synpred10_FromClauseParser())) {s = 147;}

                        else if ( (LA57_27==KW_GROUP) && (synpred10_FromClauseParser())) {s = 148;}

                        else if ( (LA57_27==KW_HAVING) && (synpred10_FromClauseParser())) {s = 149;}

                        else if ( (LA57_27==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 150;}

                        else if ( (LA57_27==KW_QUALIFY) && (synpred10_FromClauseParser())) {s = 151;}

                        else if ( (LA57_27==KW_UNION) && (synpred10_FromClauseParser())) {s = 152;}

                        else if ( (LA57_27==KW_INTERSECT) && (synpred10_FromClauseParser())) {s = 153;}

                        else if ( (LA57_27==KW_EXCEPT) && (synpred10_FromClauseParser())) {s = 154;}

                        else if ( (LA57_27==KW_MINUS) && (synpred10_FromClauseParser())) {s = 155;}

                        else if ( (LA57_27==KW_ORDER) && (synpred10_FromClauseParser())) {s = 156;}

                        else if ( (LA57_27==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 157;}

                        else if ( (LA57_27==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 158;}

                        else if ( (LA57_27==KW_SORT) && (synpred10_FromClauseParser())) {s = 159;}

                        else if ( (LA57_27==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 160;}

                        else if ( (LA57_27==RPAREN) && (synpred10_FromClauseParser())) {s = 161;}

                        else if ( (LA57_27==KW_ON) && (synpred10_FromClauseParser())) {s = 162;}

                        else if ( (LA57_27==KW_USING) && (synpred10_FromClauseParser())) {s = 163;}

                        else if ( (LA57_27==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 164;}

                        else if ( (LA57_27==Identifier) && (synpred10_FromClauseParser())) {s = 165;}

                         
                        input.seek(index57_27);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA57_28 = input.LA(1);

                         
                        int index57_28 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (LA57_28==Number) ) {s = 3;}

                        else if ( (LA57_28==KW_LATERAL) && (synpred10_FromClauseParser())) {s = 167;}

                        else if ( (LA57_28==COMMA) && (synpred10_FromClauseParser())) {s = 168;}

                        else if ( (LA57_28==KW_JOIN) && (synpred10_FromClauseParser())) {s = 169;}

                        else if ( (LA57_28==KW_INNER) && (synpred10_FromClauseParser())) {s = 170;}

                        else if ( (LA57_28==KW_CROSS) && (synpred10_FromClauseParser())) {s = 171;}

                        else if ( (LA57_28==KW_LEFT) && (synpred10_FromClauseParser())) {s = 172;}

                        else if ( (LA57_28==KW_RIGHT) && (synpred10_FromClauseParser())) {s = 173;}

                        else if ( (LA57_28==KW_FULL) && (synpred10_FromClauseParser())) {s = 174;}

                        else if ( (LA57_28==EOF) && (synpred10_FromClauseParser())) {s = 175;}

                        else if ( (LA57_28==KW_INSERT) && (synpred10_FromClauseParser())) {s = 176;}

                        else if ( (LA57_28==KW_SELECT) && (synpred10_FromClauseParser())) {s = 177;}

                        else if ( (LA57_28==KW_MAP) && (synpred10_FromClauseParser())) {s = 178;}

                        else if ( (LA57_28==KW_REDUCE) && (synpred10_FromClauseParser())) {s = 179;}

                        else if ( (LA57_28==KW_WHERE) && (synpred10_FromClauseParser())) {s = 180;}

                        else if ( (LA57_28==KW_GROUP) && (synpred10_FromClauseParser())) {s = 181;}

                        else if ( (LA57_28==KW_HAVING) && (synpred10_FromClauseParser())) {s = 182;}

                        else if ( (LA57_28==KW_WINDOW) && (synpred10_FromClauseParser())) {s = 183;}

                        else if ( (LA57_28==KW_QUALIFY) && (synpred10_FromClauseParser())) {s = 184;}

                        else if ( (LA57_28==KW_UNION) && (synpred10_FromClauseParser())) {s = 185;}

                        else if ( (LA57_28==KW_INTERSECT) && (synpred10_FromClauseParser())) {s = 186;}

                        else if ( (LA57_28==KW_EXCEPT) && (synpred10_FromClauseParser())) {s = 187;}

                        else if ( (LA57_28==KW_MINUS) && (synpred10_FromClauseParser())) {s = 188;}

                        else if ( (LA57_28==KW_ORDER) && (synpred10_FromClauseParser())) {s = 189;}

                        else if ( (LA57_28==KW_CLUSTER) && (synpred10_FromClauseParser())) {s = 190;}

                        else if ( (LA57_28==KW_DISTRIBUTE) && (synpred10_FromClauseParser())) {s = 191;}

                        else if ( (LA57_28==KW_SORT) && (synpred10_FromClauseParser())) {s = 192;}

                        else if ( (LA57_28==KW_LIMIT) && (synpred10_FromClauseParser())) {s = 193;}

                        else if ( (LA57_28==RPAREN) && (synpred10_FromClauseParser())) {s = 194;}

                        else if ( (LA57_28==KW_ON) && (synpred10_FromClauseParser())) {s = 195;}

                        else if ( (LA57_28==KW_USING) && (synpred10_FromClauseParser())) {s = 196;}

                        else if ( (LA57_28==KW_PARTITION) && (synpred10_FromClauseParser())) {s = 197;}

                        else if ( (LA57_28==Identifier) && (synpred10_FromClauseParser())) {s = 198;}

                         
                        input.seek(index57_28);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 57, _s, input);
            error(nvae);
            throw nvae;
        }

    }
    static final String DFA60_eotS =
        "\u023b\uffff";
    static final String DFA60_eofS =
        "\u023b\uffff";
    static final String DFA60_minS =
        "\1\u019e\1\14\1\4\2\14\2\4\1\u019e\1\4\1\u019e\1\4\1\u01b0\2\4\1"+
        "\13\4\4\1\14\4\u019e\1\14\3\4\2\u019e\1\uffff\32\0\3\uffff\123\0"+
        "\3\uffff\40\0\3\uffff\34\0\3\uffff\34\0\3\uffff\32\0\3\uffff\31"+
        "\0\3\uffff\32\0\3\uffff\31\0\3\uffff\31\0\3\uffff\31\0\3\uffff\103"+
        "\0\1\uffff\30\0\3\uffff\2\0\1\uffff\30\0\3\uffff\2\0\1\uffff\30"+
        "\0\3\uffff\2\0\1\uffff";
    static final String DFA60_maxS =
        "\1\u019e\6\u02f1\1\u01b0\1\u02f1\1\u01b0\1\u02f1\1\u01b0\2\u02f1"+
        "\1\13\5\u02f1\1\u01b0\3\u019e\4\u02f1\2\u019e\1\uffff\32\0\3\uffff"+
        "\123\0\3\uffff\40\0\3\uffff\34\0\3\uffff\34\0\3\uffff\32\0\3\uffff"+
        "\31\0\3\uffff\32\0\3\uffff\31\0\3\uffff\31\0\3\uffff\31\0\3\uffff"+
        "\103\0\1\uffff\30\0\3\uffff\2\0\1\uffff\30\0\3\uffff\2\0\1\uffff"+
        "\30\0\3\uffff\2\0\1\uffff";
    static final String DFA60_acceptS =
        "\71\uffff\1\2\u0200\uffff\1\1";
    static final String DFA60_specialS =
        "\37\uffff\1\0\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27\1\30"+
        "\1\31\3\uffff\1\32\1\33\1\34\1\35\1\36\1\37\1\40\1\41\1\42\1\43"+
        "\1\44\1\45\1\46\1\47\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
        "\1\61\1\62\1\63\1\64\1\65\1\66\1\67\1\70\1\71\1\72\1\73\1\74\1\75"+
        "\1\76\1\77\1\100\1\101\1\102\1\103\1\104\1\105\1\106\1\107\1\110"+
        "\1\111\1\112\1\113\1\114\1\115\1\116\1\117\1\120\1\121\1\122\1\123"+
        "\1\124\1\125\1\126\1\127\1\130\1\131\1\132\1\133\1\134\1\135\1\136"+
        "\1\137\1\140\1\141\1\142\1\143\1\144\1\145\1\146\1\147\1\150\1\151"+
        "\1\152\1\153\1\154\3\uffff\1\155\1\156\1\157\1\160\1\161\1\162\1"+
        "\163\1\164\1\165\1\166\1\167\1\170\1\171\1\172\1\173\1\174\1\175"+
        "\1\176\1\177\1\u0080\1\u0081\1\u0082\1\u0083\1\u0084\1\u0085\1\u0086"+
        "\1\u0087\1\u0088\1\u0089\1\u008a\1\u008b\1\u008c\3\uffff\1\u008d"+
        "\1\u008e\1\u008f\1\u0090\1\u0091\1\u0092\1\u0093\1\u0094\1\u0095"+
        "\1\u0096\1\u0097\1\u0098\1\u0099\1\u009a\1\u009b\1\u009c\1\u009d"+
        "\1\u009e\1\u009f\1\u00a0\1\u00a1\1\u00a2\1\u00a3\1\u00a4\1\u00a5"+
        "\1\u00a6\1\u00a7\1\u00a8\3\uffff\1\u00a9\1\u00aa\1\u00ab\1\u00ac"+
        "\1\u00ad\1\u00ae\1\u00af\1\u00b0\1\u00b1\1\u00b2\1\u00b3\1\u00b4"+
        "\1\u00b5\1\u00b6\1\u00b7\1\u00b8\1\u00b9\1\u00ba\1\u00bb\1\u00bc"+
        "\1\u00bd\1\u00be\1\u00bf\1\u00c0\1\u00c1\1\u00c2\1\u00c3\1\u00c4"+
        "\3\uffff\1\u00c5\1\u00c6\1\u00c7\1\u00c8\1\u00c9\1\u00ca\1\u00cb"+
        "\1\u00cc\1\u00cd\1\u00ce\1\u00cf\1\u00d0\1\u00d1\1\u00d2\1\u00d3"+
        "\1\u00d4\1\u00d5\1\u00d6\1\u00d7\1\u00d8\1\u00d9\1\u00da\1\u00db"+
        "\1\u00dc\1\u00dd\1\u00de\3\uffff\1\u00df\1\u00e0\1\u00e1\1\u00e2"+
        "\1\u00e3\1\u00e4\1\u00e5\1\u00e6\1\u00e7\1\u00e8\1\u00e9\1\u00ea"+
        "\1\u00eb\1\u00ec\1\u00ed\1\u00ee\1\u00ef\1\u00f0\1\u00f1\1\u00f2"+
        "\1\u00f3\1\u00f4\1\u00f5\1\u00f6\1\u00f7\3\uffff\1\u00f8\1\u00f9"+
        "\1\u00fa\1\u00fb\1\u00fc\1\u00fd\1\u00fe\1\u00ff\1\u0100\1\u0101"+
        "\1\u0102\1\u0103\1\u0104\1\u0105\1\u0106\1\u0107\1\u0108\1\u0109"+
        "\1\u010a\1\u010b\1\u010c\1\u010d\1\u010e\1\u010f\1\u0110\1\u0111"+
        "\3\uffff\1\u0112\1\u0113\1\u0114\1\u0115\1\u0116\1\u0117\1\u0118"+
        "\1\u0119\1\u011a\1\u011b\1\u011c\1\u011d\1\u011e\1\u011f\1\u0120"+
        "\1\u0121\1\u0122\1\u0123\1\u0124\1\u0125\1\u0126\1\u0127\1\u0128"+
        "\1\u0129\1\u012a\3\uffff\1\u012b\1\u012c\1\u012d\1\u012e\1\u012f"+
        "\1\u0130\1\u0131\1\u0132\1\u0133\1\u0134\1\u0135\1\u0136\1\u0137"+
        "\1\u0138\1\u0139\1\u013a\1\u013b\1\u013c\1\u013d\1\u013e\1\u013f"+
        "\1\u0140\1\u0141\1\u0142\1\u0143\3\uffff\1\u0144\1\u0145\1\u0146"+
        "\1\u0147\1\u0148\1\u0149\1\u014a\1\u014b\1\u014c\1\u014d\1\u014e"+
        "\1\u014f\1\u0150\1\u0151\1\u0152\1\u0153\1\u0154\1\u0155\1\u0156"+
        "\1\u0157\1\u0158\1\u0159\1\u015a\1\u015b\1\u015c\3\uffff\1\u015d"+
        "\1\u015e\1\u015f\1\u0160\1\u0161\1\u0162\1\u0163\1\u0164\1\u0165"+
        "\1\u0166\1\u0167\1\u0168\1\u0169\1\u016a\1\u016b\1\u016c\1\u016d"+
        "\1\u016e\1\u016f\1\u0170\1\u0171\1\u0172\1\u0173\1\u0174\1\u0175"+
        "\1\u0176\1\u0177\1\u0178\1\u0179\1\u017a\1\u017b\1\u017c\1\u017d"+
        "\1\u017e\1\u017f\1\u0180\1\u0181\1\u0182\1\u0183\1\u0184\1\u0185"+
        "\1\u0186\1\u0187\1\u0188\1\u0189\1\u018a\1\u018b\1\u018c\1\u018d"+
        "\1\u018e\1\u018f\1\u0190\1\u0191\1\u0192\1\u0193\1\u0194\1\u0195"+
        "\1\u0196\1\u0197\1\u0198\1\u0199\1\u019a\1\u019b\1\u019c\1\u019d"+
        "\1\u019e\1\u019f\1\uffff\1\u01a0\1\u01a1\1\u01a2\1\u01a3\1\u01a4"+
        "\1\u01a5\1\u01a6\1\u01a7\1\u01a8\1\u01a9\1\u01aa\1\u01ab\1\u01ac"+
        "\1\u01ad\1\u01ae\1\u01af\1\u01b0\1\u01b1\1\u01b2\1\u01b3\1\u01b4"+
        "\1\u01b5\1\u01b6\1\u01b7\3\uffff\1\u01b8\1\u01b9\1\uffff\1\u01ba"+
        "\1\u01bb\1\u01bc\1\u01bd\1\u01be\1\u01bf\1\u01c0\1\u01c1\1\u01c2"+
        "\1\u01c3\1\u01c4\1\u01c5\1\u01c6\1\u01c7\1\u01c8\1\u01c9\1\u01ca"+
        "\1\u01cb\1\u01cc\1\u01cd\1\u01ce\1\u01cf\1\u01d0\1\u01d1\3\uffff"+
        "\1\u01d2\1\u01d3\1\uffff\1\u01d4\1\u01d5\1\u01d6\1\u01d7\1\u01d8"+
        "\1\u01d9\1\u01da\1\u01db\1\u01dc\1\u01dd\1\u01de\1\u01df\1\u01e0"+
        "\1\u01e1\1\u01e2\1\u01e3\1\u01e4\1\u01e5\1\u01e6\1\u01e7\1\u01e8"+
        "\1\u01e9\1\u01ea\1\u01eb\3\uffff\1\u01ec\1\u01ed\1\uffff}>";
    static final String[] DFA60_transitionS = {
            "\1\1",
            "\1\16\13\uffff\1\32\1\14\6\33\1\uffff\1\33\1\uffff\1\33\3\uffff"+
            "\1\33\1\34\1\uffff\3\33\1\uffff\2\33\1\uffff\3\34\1\uffff\3"+
            "\33\1\uffff\2\33\1\30\1\25\2\33\1\uffff\1\33\1\uffff\4\33\1"+
            "\uffff\2\33\1\uffff\2\33\1\uffff\2\33\2\uffff\1\33\1\uffff\1"+
            "\33\1\uffff\1\33\3\uffff\1\10\1\12\1\uffff\1\33\1\uffff\1\33"+
            "\2\uffff\1\7\4\33\1\uffff\1\33\1\uffff\1\2\2\33\1\uffff\3\33"+
            "\1\uffff\4\33\1\uffff\3\33\1\34\1\33\1\uffff\2\33\1\uffff\1"+
            "\33\1\uffff\3\33\2\uffff\3\33\1\35\4\33\2\uffff\1\26\1\20\1"+
            "\33\1\uffff\4\33\1\34\1\27\4\uffff\2\33\3\uffff\1\33\2\uffff"+
            "\1\34\1\uffff\2\33\1\34\1\33\2\uffff\2\33\1\uffff\3\33\1\uffff"+
            "\1\34\1\uffff\1\24\2\uffff\3\33\1\uffff\6\33\4\uffff\1\33\1"+
            "\uffff\3\33\1\uffff\5\33\1\uffff\3\33\1\34\4\33\1\uffff\1\33"+
            "\1\uffff\2\33\1\uffff\2\33\1\uffff\2\33\1\3\1\33\1\21\1\33\1"+
            "\uffff\1\33\3\uffff\3\33\5\uffff\2\33\1\uffff\2\33\1\uffff\3"+
            "\33\2\uffff\4\33\5\uffff\1\33\1\uffff\1\33\1\uffff\3\33\1\uffff"+
            "\1\33\1\uffff\1\34\3\33\3\uffff\16\33\1\uffff\1\33\2\uffff\2"+
            "\33\4\uffff\5\33\1\uffff\4\33\1\uffff\6\33\1\34\2\33\1\uffff"+
            "\4\33\1\uffff\7\33\1\uffff\2\33\1\uffff\1\33\1\uffff\4\33\3"+
            "\uffff\1\11\1\13\1\33\1\uffff\1\33\1\uffff\3\33\2\uffff\1\31"+
            "\1\17\1\uffff\2\33\1\uffff\1\33\1\uffff\1\33\2\uffff\5\33\1"+
            "\uffff\3\33\2\uffff\3\33\1\uffff\1\33\1\uffff\5\33\2\uffff\1"+
            "\33\2\uffff\6\33\4\uffff\1\23\2\uffff\1\4\2\uffff\1\5\1\15\1"+
            "\4\1\uffff\1\22\7\uffff\1\6\1\4\47\uffff\1\33\57\uffff\1\33"+
            "\72\uffff\1\33\67\uffff\1\33\3\uffff\1\33\35\uffff\1\33\7\uffff"+
            "\1\33\112\uffff\1\33",
            "\1\50\1\51\1\44\2\uffff\1\37\1\47\2\uffff\2\45\1\uffff\1\41"+
            "\1\uffff\1\62\1\65\1\uffff\1\56\1\55\1\uffff\1\71\1\uffff\6"+
            "\71\1\uffff\1\71\1\uffff\1\71\1\67\2\uffff\1\71\1\uffff\4\71"+
            "\1\uffff\2\71\1\60\4\uffff\3\71\1\uffff\2\71\2\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\uffff\2\71\1\uffff\2"+
            "\71\2\uffff\1\71\1\uffff\1\71\1\uffff\1\71\6\uffff\1\71\1\uffff"+
            "\1\71\3\uffff\4\71\1\uffff\1\71\1\uffff\3\71\1\uffff\3\71\1"+
            "\uffff\4\71\1\uffff\3\71\1\uffff\1\71\1\uffff\2\71\1\uffff\1"+
            "\71\1\uffff\3\71\2\uffff\3\71\1\uffff\4\71\4\uffff\1\71\1\uffff"+
            "\4\71\6\uffff\2\71\3\uffff\1\71\4\uffff\2\71\1\uffff\1\71\1"+
            "\uffff\1\57\2\71\1\uffff\3\71\5\uffff\1\66\3\71\1\uffff\6\71"+
            "\4\uffff\1\71\1\52\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4"+
            "\71\1\uffff\1\71\1\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\63"+
            "\1\71\1\uffff\1\71\1\uffff\1\71\3\uffff\3\71\1\70\4\uffff\2"+
            "\71\1\uffff\2\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\61\16"+
            "\71\1\uffff\1\71\1\uffff\1\61\2\71\4\uffff\5\71\1\uffff\4\71"+
            "\1\uffff\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff"+
            "\2\71\1\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1"+
            "\uffff\3\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1"+
            "\71\2\uffff\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff"+
            "\5\71\2\uffff\1\71\2\uffff\6\71\1\uffff\1\54\1\53\1\uffff\1"+
            "\42\1\43\1\uffff\1\46\1\45\1\64\2\uffff\1\46\4\uffff\1\40\3"+
            "\uffff\1\45\51\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67\uffff"+
            "\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff\1\71",
            "\1\106\13\uffff\1\122\1\104\6\123\1\uffff\1\123\1\uffff\1\123"+
            "\3\uffff\1\123\1\124\1\uffff\3\123\1\uffff\2\123\1\uffff\3\124"+
            "\1\uffff\3\123\1\uffff\2\123\1\120\1\115\2\123\1\uffff\1\123"+
            "\1\uffff\4\123\1\uffff\2\123\1\uffff\2\123\1\uffff\2\123\2\uffff"+
            "\1\123\1\uffff\1\123\1\uffff\1\123\3\uffff\1\100\1\102\1\uffff"+
            "\1\123\1\uffff\1\123\2\uffff\1\77\4\123\1\uffff\1\123\1\uffff"+
            "\3\123\1\uffff\3\123\1\uffff\4\123\1\uffff\3\123\1\124\1\123"+
            "\1\uffff\2\123\1\uffff\1\123\1\uffff\3\123\2\uffff\3\123\1\125"+
            "\4\123\2\uffff\1\116\1\110\1\123\1\uffff\4\123\1\124\1\117\4"+
            "\uffff\2\123\3\uffff\1\123\2\uffff\1\124\1\uffff\2\123\1\124"+
            "\1\123\2\uffff\2\123\1\uffff\3\123\1\uffff\1\124\1\uffff\1\114"+
            "\2\uffff\3\123\1\uffff\6\123\4\uffff\1\123\1\uffff\3\123\1\uffff"+
            "\5\123\1\uffff\3\123\1\124\4\123\1\uffff\1\123\1\uffff\2\123"+
            "\1\uffff\2\123\1\uffff\2\123\1\126\1\123\1\111\1\123\1\uffff"+
            "\1\123\3\uffff\3\123\5\uffff\2\123\1\uffff\2\123\1\uffff\3\123"+
            "\2\uffff\4\123\5\uffff\1\123\1\uffff\1\123\1\uffff\3\123\1\uffff"+
            "\1\123\1\uffff\1\124\3\123\3\uffff\16\123\1\uffff\1\123\2\uffff"+
            "\2\123\4\uffff\5\123\1\uffff\4\123\1\uffff\6\123\1\124\2\123"+
            "\1\uffff\4\123\1\uffff\7\123\1\uffff\2\123\1\uffff\1\123\1\uffff"+
            "\4\123\3\uffff\1\101\1\103\1\123\1\uffff\1\123\1\uffff\3\123"+
            "\2\uffff\1\121\1\107\1\uffff\2\123\1\uffff\1\123\1\uffff\1\123"+
            "\2\uffff\5\123\1\uffff\3\123\2\uffff\3\123\1\uffff\1\123\1\uffff"+
            "\5\123\2\uffff\1\123\2\uffff\6\123\4\uffff\1\113\2\uffff\1\74"+
            "\2\uffff\1\75\1\105\1\74\1\uffff\1\112\7\uffff\1\76\1\74\47"+
            "\uffff\1\123\57\uffff\1\123\72\uffff\1\123\67\uffff\1\123\3"+
            "\uffff\1\123\35\uffff\1\123\7\uffff\1\123\112\uffff\1\123",
            "\1\140\13\uffff\1\154\1\136\6\155\1\uffff\1\155\1\uffff\1\155"+
            "\3\uffff\1\155\1\156\1\uffff\3\155\1\uffff\2\155\1\uffff\3\156"+
            "\1\uffff\3\155\1\uffff\2\155\1\152\1\147\2\155\1\uffff\1\155"+
            "\1\uffff\4\155\1\uffff\2\155\1\uffff\2\155\1\uffff\2\155\2\uffff"+
            "\1\155\1\uffff\1\155\1\uffff\1\155\3\uffff\1\132\1\134\1\uffff"+
            "\1\155\1\uffff\1\155\2\uffff\1\131\4\155\1\uffff\1\155\1\uffff"+
            "\3\155\1\uffff\3\155\1\uffff\4\155\1\uffff\3\155\1\156\1\155"+
            "\1\uffff\2\155\1\uffff\1\155\1\uffff\3\155\2\uffff\3\155\1\uffff"+
            "\4\155\2\uffff\1\150\1\142\1\155\1\uffff\4\155\1\156\1\151\4"+
            "\uffff\2\155\3\uffff\1\155\2\uffff\1\156\1\uffff\2\155\1\156"+
            "\1\155\2\uffff\2\155\1\uffff\3\155\1\uffff\1\156\1\uffff\1\146"+
            "\2\uffff\3\155\1\uffff\6\155\4\uffff\1\155\1\uffff\3\155\1\uffff"+
            "\5\155\1\uffff\3\155\1\156\4\155\1\uffff\1\155\1\uffff\2\155"+
            "\1\uffff\2\155\1\uffff\2\155\1\uffff\1\155\1\143\1\155\1\uffff"+
            "\1\155\3\uffff\3\155\5\uffff\2\155\1\uffff\2\155\1\uffff\3\155"+
            "\2\uffff\4\155\5\uffff\1\155\1\uffff\1\155\1\uffff\3\155\1\uffff"+
            "\1\155\1\uffff\1\156\3\155\3\uffff\16\155\1\uffff\1\155\2\uffff"+
            "\2\155\4\uffff\5\155\1\uffff\4\155\1\uffff\6\155\1\156\2\155"+
            "\1\uffff\4\155\1\uffff\7\155\1\uffff\2\155\1\uffff\1\155\1\uffff"+
            "\4\155\3\uffff\1\133\1\135\1\155\1\uffff\1\155\1\uffff\3\155"+
            "\2\uffff\1\153\1\141\1\uffff\2\155\1\uffff\1\155\1\uffff\1\155"+
            "\2\uffff\5\155\1\uffff\3\155\2\uffff\3\155\1\uffff\1\155\1\uffff"+
            "\5\155\2\uffff\1\155\2\uffff\6\155\4\uffff\1\145\2\uffff\1\157"+
            "\2\uffff\1\127\1\137\1\157\1\uffff\1\144\7\uffff\1\130\1\157"+
            "\47\uffff\1\155\57\uffff\1\155\72\uffff\1\155\67\uffff\1\155"+
            "\3\uffff\1\155\35\uffff\1\155\7\uffff\1\155\112\uffff\1\155",
            "\1\174\1\175\1\170\2\uffff\1\u008d\1\173\2\uffff\2\171\1\uffff"+
            "\1\167\1\uffff\1\u0086\1\u0089\1\uffff\1\u0082\1\u0081\1\uffff"+
            "\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71\1\u008b\2\uffff"+
            "\1\71\1\uffff\4\71\1\uffff\2\71\1\u0084\4\uffff\3\71\1\uffff"+
            "\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1"+
            "\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1\71\1\uffff\1"+
            "\71\6\uffff\1\71\1\uffff\1\71\3\uffff\1\71\1\161\2\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\1\163\1\71\1\uffff\1\71\1\uffff\1\u0083\2\71\1"+
            "\uffff\3\71\5\uffff\1\u008a\3\71\1\uffff\6\71\4\uffff\1\71\1"+
            "\176\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71"+
            "\1\uffff\1\164\1\162\1\uffff\2\71\1\uffff\2\71\1\u0087\1\71"+
            "\1\uffff\1\71\1\uffff\1\71\3\uffff\3\71\1\u008c\4\uffff\2\71"+
            "\1\uffff\2\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u0085"+
            "\16\71\1\uffff\1\71\1\uffff\1\u0085\2\71\4\uffff\4\71\1\165"+
            "\1\uffff\4\71\1\uffff\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff"+
            "\7\71\1\uffff\2\71\1\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1"+
            "\uffff\1\71\1\uffff\3\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1"+
            "\71\1\uffff\1\71\2\uffff\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff"+
            "\1\71\1\uffff\5\71\2\uffff\1\71\2\uffff\4\71\1\160\1\71\1\uffff"+
            "\1\u0080\1\177\2\uffff\1\166\1\uffff\1\172\1\171\1\u0088\2\uffff"+
            "\1\172\4\uffff\1\u008e\3\uffff\1\171\51\uffff\1\71\57\uffff"+
            "\1\71\72\uffff\1\71\67\uffff\1\71\3\uffff\1\71\35\uffff\1\71"+
            "\7\uffff\1\71\112\uffff\1\71",
            "\1\u009e\1\u009f\1\u009a\2\uffff\1\u00af\1\u009d\2\uffff\2"+
            "\u009b\1\uffff\1\u0099\1\uffff\1\u00a8\1\u00ab\1\uffff\1\u00a4"+
            "\1\u00a3\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u00ad\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u00a6\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\1\71\1\u0093"+
            "\2\71\1\uffff\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1"+
            "\uffff\3\71\1\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\3\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff"+
            "\2\71\3\uffff\1\71\4\uffff\1\u0095\1\71\1\uffff\1\71\1\uffff"+
            "\1\u00a5\2\71\1\uffff\3\71\5\uffff\1\u00ac\3\71\1\uffff\6\71"+
            "\4\uffff\1\71\1\u00a0\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff"+
            "\4\71\1\uffff\1\71\1\uffff\1\u0096\1\u0094\1\uffff\2\71\1\uffff"+
            "\2\71\1\u00a9\1\71\1\uffff\1\71\1\uffff\1\71\3\uffff\3\71\1"+
            "\u00ae\4\uffff\2\71\1\uffff\2\71\1\uffff\3\71\2\uffff\4\71\5"+
            "\uffff\1\71\1\uffff\1\71\1\uffff\3\71\1\uffff\1\71\2\uffff\3"+
            "\71\2\uffff\1\u00a7\16\71\1\uffff\1\71\1\uffff\1\u00a7\2\71"+
            "\4\uffff\4\71\1\u0097\1\uffff\4\71\1\uffff\6\71\1\uffff\2\71"+
            "\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1\uffff\1\71\1\uffff"+
            "\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3\71\2\uffff\1\71\2"+
            "\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff\5\71\1\uffff\3"+
            "\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2\uffff\1\71\2\uffff"+
            "\4\71\1\u0092\1\71\1\uffff\1\u00a2\1\u00a1\2\uffff\1\u0098\1"+
            "\uffff\1\u009c\1\u009b\1\u00aa\2\uffff\1\u009c\4\uffff\1\u00b0"+
            "\3\uffff\1\u009b\1\u00b1\50\uffff\1\71\57\uffff\1\71\72\uffff"+
            "\1\71\67\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71"+
            "\112\uffff\1\71",
            "\1\u00b6\21\uffff\1\u00b5",
            "\1\u00bd\1\u00be\1\u00b9\2\uffff\1\u00ce\1\u00bc\2\uffff\2"+
            "\u00ba\1\uffff\1\u00b8\1\uffff\1\u00c7\1\u00ca\1\uffff\1\u00c3"+
            "\1\u00c2\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u00cc\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u00c5\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u00c4\2\71\1\uffff"+
            "\3\71\5\uffff\1\u00cb\3\71\1\uffff\6\71\4\uffff\1\71\1\u00bf"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u00c8\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u00cd\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u00c6\16\71\1\uffff"+
            "\1\71\1\uffff\1\u00c6\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u00c1\1\u00c0\1\uffff\1\u00d0"+
            "\1\u00b7\1\uffff\1\u00bb\1\u00ba\1\u00c9\2\uffff\1\u00bb\4\uffff"+
            "\1\u00cf\3\uffff\1\u00ba\51\uffff\1\71\57\uffff\1\71\72\uffff"+
            "\1\71\67\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71"+
            "\112\uffff\1\71",
            "\1\u00d5\21\uffff\1\u00d4",
            "\1\u00dc\1\u00dd\1\u00d8\2\uffff\1\u00ed\1\u00db\2\uffff\2"+
            "\u00d9\1\uffff\1\u00d7\1\uffff\1\u00e6\1\u00e9\1\uffff\1\u00e2"+
            "\1\u00e1\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u00eb\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u00e4\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u00e3\2\71\1\uffff"+
            "\3\71\5\uffff\1\u00ea\3\71\1\uffff\6\71\4\uffff\1\71\1\u00de"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u00e7\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u00ec\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u00e5\16\71\1\uffff"+
            "\1\71\1\uffff\1\u00e5\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u00e0\1\u00df\1\uffff\1\u00ef"+
            "\1\u00d6\1\uffff\1\u00da\1\u00d9\1\u00e8\2\uffff\1\u00da\4\uffff"+
            "\1\u00ee\3\uffff\1\u00d9\51\uffff\1\71\57\uffff\1\71\72\uffff"+
            "\1\71\67\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71"+
            "\112\uffff\1\71",
            "\1\u00f3",
            "\1\u00fa\1\u00fb\1\u00f6\2\uffff\1\u010b\1\u00f9\2\uffff\2"+
            "\u00f7\1\uffff\1\u00f5\1\uffff\1\u0104\1\u0107\1\uffff\1\u0100"+
            "\1\u00ff\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u0109\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u0102\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u0101\2\71\1\uffff"+
            "\3\71\5\uffff\1\u0108\3\71\1\uffff\6\71\4\uffff\1\71\1\u00fc"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u0105\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u010a\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u0103\16\71\1\uffff"+
            "\1\71\1\uffff\1\u0103\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u00fe\1\u00fd\2\uffff\1\u00f4"+
            "\1\uffff\1\u00f8\1\u00f7\1\u0106\2\uffff\1\u00f8\4\uffff\1\u010c"+
            "\3\uffff\1\u00f7\51\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67"+
            "\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff"+
            "\1\71",
            "\1\u0116\1\u0117\1\u0112\2\uffff\1\u0127\1\u0115\2\uffff\2"+
            "\u0113\1\uffff\1\u0111\1\uffff\1\u0120\1\u0123\1\uffff\1\u011c"+
            "\1\u011b\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u0125\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u011e\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u011d\2\71\1\uffff"+
            "\3\71\5\uffff\1\u0124\3\71\1\uffff\6\71\4\uffff\1\71\1\u0118"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u0121\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u0126\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u011f\16\71\1\uffff"+
            "\1\71\1\uffff\1\u011f\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u011a\1\u0119\2\uffff\1\u0110"+
            "\1\uffff\1\u0114\1\u0113\1\u0122\2\uffff\1\u0114\4\uffff\1\u0128"+
            "\3\uffff\1\u0113\51\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67"+
            "\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff"+
            "\1\71",
            "\1\u012c",
            "\1\u0133\1\u0134\1\u012f\2\uffff\1\u0144\1\u0132\2\uffff\2"+
            "\u0130\1\uffff\1\u012e\1\uffff\1\u013d\1\u0140\1\uffff\1\u0139"+
            "\1\u0138\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u0142\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u013b\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u013a\2\71\1\uffff"+
            "\3\71\5\uffff\1\u0141\3\71\1\uffff\6\71\4\uffff\1\71\1\u0135"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u013e\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u0143\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u013c\16\71\1\uffff"+
            "\1\71\1\uffff\1\u013c\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u0137\1\u0136\2\uffff\1\u012d"+
            "\1\uffff\1\u0131\1\u0130\1\u013f\2\uffff\1\u0131\4\uffff\1\u0145"+
            "\3\uffff\1\u0130\51\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67"+
            "\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff"+
            "\1\71",
            "\1\u014f\1\u0150\1\u014b\2\uffff\1\u0160\1\u014e\2\uffff\2"+
            "\u014c\1\uffff\1\u014a\1\uffff\1\u0159\1\u015c\1\uffff\1\u0155"+
            "\1\u0154\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u015e\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u0157\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u0156\2\71\1\uffff"+
            "\3\71\5\uffff\1\u015d\3\71\1\uffff\6\71\4\uffff\1\71\1\u0151"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u015a\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u015f\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u0158\16\71\1\uffff"+
            "\1\71\1\uffff\1\u0158\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u0153\1\u0152\2\uffff\1\u0149"+
            "\1\uffff\1\u014d\1\u014c\1\u015b\2\uffff\1\u014d\4\uffff\1\u0161"+
            "\3\uffff\1\u014c\51\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67"+
            "\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff"+
            "\1\71",
            "\1\u016b\1\u016c\1\u0167\2\uffff\1\u017c\1\u016a\2\uffff\2"+
            "\u0168\1\uffff\1\u0166\1\uffff\1\u0175\1\u0178\1\uffff\1\u0171"+
            "\1\u0170\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u017a\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u0173\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u0172\2\71\1\uffff"+
            "\3\71\5\uffff\1\u0179\3\71\1\uffff\6\71\4\uffff\1\71\1\u016d"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u0176\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u017b\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u0174\16\71\1\uffff"+
            "\1\71\1\uffff\1\u0174\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u016f\1\u016e\2\uffff\1\u0165"+
            "\1\uffff\1\u0169\1\u0168\1\u0177\2\uffff\1\u0169\4\uffff\1\u017d"+
            "\3\uffff\1\u0168\51\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67"+
            "\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff"+
            "\1\71",
            "\1\u0187\1\u0188\1\u0183\2\uffff\1\u0198\1\u0186\2\uffff\2"+
            "\u0184\1\uffff\1\u0182\1\uffff\1\u0191\1\u0194\1\uffff\1\u018d"+
            "\1\u018c\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u0196\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u018f\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u018e\2\71\1\uffff"+
            "\3\71\5\uffff\1\u0195\3\71\1\uffff\6\71\4\uffff\1\71\1\u0189"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u0192\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u0197\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u0190\16\71\1\uffff"+
            "\1\71\1\uffff\1\u0190\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u018b\1\u018a\2\uffff\1\u0181"+
            "\1\uffff\1\u0185\1\u0184\1\u0193\2\uffff\1\u0185\4\uffff\1\u0199"+
            "\3\uffff\1\u0184\51\uffff\1\71\57\uffff\1\71\72\uffff\1\71\67"+
            "\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71\112\uffff"+
            "\1\71",
            "\1\u01ae\13\uffff\1\u01b9\1\u01ac\6\u01ba\1\uffff\1\u01ba\1"+
            "\uffff\1\u01ba\3\uffff\1\u01ba\1\u01bb\1\uffff\3\u01ba\1\uffff"+
            "\2\u01ba\1\uffff\3\u01bb\1\uffff\3\u01ba\1\uffff\2\u01ba\1\u01b7"+
            "\1\u01b4\2\u01ba\1\uffff\1\u01ba\1\uffff\4\u01ba\1\uffff\2\u01ba"+
            "\1\uffff\2\u01ba\1\uffff\2\u01ba\2\uffff\1\u01ba\1\uffff\1\u01ba"+
            "\1\uffff\1\u01ba\3\uffff\1\u01a8\1\u01aa\1\uffff\1\u01ba\1\uffff"+
            "\1\u01ba\2\uffff\1\u01a7\4\u01ba\1\uffff\1\u01ba\1\uffff\1\u01a3"+
            "\2\u01ba\1\uffff\3\u01ba\1\uffff\4\u01ba\1\uffff\3\u01ba\1\u01bb"+
            "\1\u01ba\1\uffff\2\u01ba\1\uffff\1\u01ba\1\uffff\3\u01ba\2\uffff"+
            "\3\u01ba\1\u01bc\4\u01ba\2\uffff\1\u01b5\1\u01b0\1\u01ba\1\uffff"+
            "\4\u01ba\1\u01bb\1\u01b6\4\uffff\2\u01ba\3\uffff\1\u01ba\2\uffff"+
            "\1\u01bb\1\uffff\2\u01ba\1\u01bb\1\u01ba\2\uffff\2\u01ba\1\uffff"+
            "\3\u01ba\1\uffff\1\u01bb\1\uffff\1\u01b3\2\uffff\3\u01ba\1\uffff"+
            "\6\u01ba\4\uffff\1\u01ba\1\uffff\3\u01ba\1\uffff\5\u01ba\1\uffff"+
            "\3\u01ba\1\u019f\4\u01ba\1\uffff\1\u01ba\1\uffff\2\u01ba\1\uffff"+
            "\2\u01ba\1\uffff\2\u01ba\1\u01a4\1\u01ba\1\u01b1\1\u01ba\1\uffff"+
            "\1\u01ba\3\uffff\3\u01ba\5\uffff\2\u01ba\1\uffff\2\u01ba\1\uffff"+
            "\3\u01ba\2\uffff\4\u01ba\5\uffff\1\u01ba\1\uffff\1\u01ba\1\uffff"+
            "\3\u01ba\1\uffff\1\u01ba\1\uffff\1\u01bb\3\u01ba\1\u01a0\2\uffff"+
            "\16\u01ba\1\uffff\1\u01ba\2\uffff\2\u01ba\4\uffff\5\u01ba\1"+
            "\u019e\4\u01ba\1\uffff\6\u01ba\1\u01bb\2\u01ba\1\uffff\4\u01ba"+
            "\1\uffff\7\u01ba\1\uffff\2\u01ba\1\uffff\1\u01ba\1\uffff\4\u01ba"+
            "\3\uffff\1\u01a9\1\u01ab\1\u01ba\1\uffff\1\u01ba\1\uffff\3\u01ba"+
            "\2\uffff\1\u01b8\1\u01af\1\uffff\2\u01ba\1\uffff\1\u01ba\1\uffff"+
            "\1\u01ba\2\uffff\5\u01ba\1\uffff\3\u01ba\2\uffff\3\u01ba\1\u01a2"+
            "\1\u01ba\1\uffff\5\u01ba\2\uffff\1\u01ba\2\uffff\6\u01ba\4\uffff"+
            "\1\u01a1\2\uffff\1\u01a5\2\uffff\1\u019d\1\u01ad\1\u01a5\1\uffff"+
            "\1\u01b2\7\uffff\1\u01a6\1\u01a5\47\uffff\1\u01ba\57\uffff\1"+
            "\u01ba\72\uffff\1\u01ba\67\uffff\1\u01ba\3\uffff\1\u01ba\35"+
            "\uffff\1\u01ba\7\uffff\1\u01ba\112\uffff\1\u01ba",
            "\1\u01bd\5\uffff\1\u01be\13\uffff\1\u01be",
            "\1\u01bf",
            "\1\u01c0",
            "\1\u01c1",
            "\1\u01cd\13\uffff\1\u01d9\1\u01cb\6\u01da\1\uffff\1\u01da\1"+
            "\uffff\1\u01da\3\uffff\1\u01da\1\u01db\1\uffff\3\u01da\1\uffff"+
            "\2\u01da\1\uffff\3\u01db\1\uffff\3\u01da\1\uffff\2\u01da\1\u01d7"+
            "\1\u01d4\2\u01da\1\uffff\1\u01da\1\uffff\4\u01da\1\uffff\2\u01da"+
            "\1\uffff\2\u01da\1\uffff\2\u01da\2\uffff\1\u01da\1\uffff\1\u01da"+
            "\1\uffff\1\u01da\3\uffff\1\u01c7\1\u01c9\1\uffff\1\u01da\1\uffff"+
            "\1\u01da\2\uffff\1\u01c6\4\u01da\1\uffff\1\u01da\1\uffff\3\u01da"+
            "\1\uffff\3\u01da\1\uffff\4\u01da\1\uffff\3\u01da\1\u01db\1\u01da"+
            "\1\uffff\2\u01da\1\uffff\1\u01da\1\uffff\3\u01da\2\uffff\3\u01da"+
            "\1\u01dc\4\u01da\2\uffff\1\u01d5\1\u01cf\1\u01da\1\uffff\4\u01da"+
            "\1\u01db\1\u01d6\4\uffff\2\u01da\3\uffff\1\u01da\2\uffff\1\u01db"+
            "\1\uffff\2\u01da\1\u01db\1\u01da\2\uffff\2\u01da\1\uffff\3\u01da"+
            "\1\uffff\1\u01db\1\uffff\1\u01d3\2\uffff\3\u01da\1\uffff\6\u01da"+
            "\4\uffff\1\u01da\1\uffff\3\u01da\1\uffff\5\u01da\1\uffff\3\u01da"+
            "\1\u01db\4\u01da\1\uffff\1\u01da\1\uffff\2\u01da\1\uffff\2\u01da"+
            "\1\uffff\2\u01da\1\u01c2\1\u01da\1\u01d0\1\u01da\1\uffff\1\u01da"+
            "\3\uffff\3\u01da\5\uffff\2\u01da\1\uffff\2\u01da\1\uffff\3\u01da"+
            "\2\uffff\4\u01da\5\uffff\1\u01da\1\uffff\1\u01da\1\uffff\3\u01da"+
            "\1\uffff\1\u01da\1\uffff\1\u01db\3\u01da\3\uffff\16\u01da\1"+
            "\uffff\1\u01da\2\uffff\2\u01da\4\uffff\5\u01da\1\uffff\4\u01da"+
            "\1\uffff\6\u01da\1\u01db\2\u01da\1\uffff\4\u01da\1\uffff\7\u01da"+
            "\1\uffff\2\u01da\1\uffff\1\u01da\1\uffff\4\u01da\3\uffff\1\u01c8"+
            "\1\u01ca\1\u01da\1\uffff\1\u01da\1\uffff\3\u01da\2\uffff\1\u01d8"+
            "\1\u01ce\1\uffff\2\u01da\1\uffff\1\u01da\1\uffff\1\u01da\2\uffff"+
            "\5\u01da\1\uffff\3\u01da\2\uffff\3\u01da\1\uffff\1\u01da\1\uffff"+
            "\5\u01da\1\u01dd\1\uffff\1\u01da\2\uffff\6\u01da\4\uffff\1\u01d2"+
            "\2\uffff\1\u01c3\2\uffff\1\u01c4\1\u01cc\1\u01c3\1\uffff\1\u01d1"+
            "\7\uffff\1\u01c5\1\u01c3\47\uffff\1\u01da\57\uffff\1\u01da\72"+
            "\uffff\1\u01da\67\uffff\1\u01da\3\uffff\1\u01da\35\uffff\1\u01da"+
            "\7\uffff\1\u01da\112\uffff\1\u01da",
            "\1\u01e6\1\u01e7\1\u01e2\2\uffff\1\u01f7\1\u01e5\2\uffff\2"+
            "\u01e3\1\uffff\1\u01df\1\uffff\1\u01f0\1\u01f3\1\uffff\1\u01ec"+
            "\1\u01eb\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u01f5\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u01ee\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u01ed\2\71\1\uffff"+
            "\3\71\5\uffff\1\u01f4\3\71\1\uffff\6\71\4\uffff\1\71\1\u01e8"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u01f1\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u01f6\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u01ef\16\71\1\uffff"+
            "\1\71\1\uffff\1\u01ef\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u01ea\1\u01e9\1\uffff\1\u01de"+
            "\1\u01e1\1\uffff\1\u01e4\1\u01e3\1\u01f2\2\uffff\1\u01e4\4\uffff"+
            "\1\u01f8\3\uffff\1\u01e3\51\uffff\1\71\57\uffff\1\71\72\uffff"+
            "\1\71\67\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71"+
            "\112\uffff\1\71",
            "\1\u0204\1\u0205\1\u0200\2\uffff\1\u0215\1\u0203\2\uffff\2"+
            "\u0201\1\uffff\1\u01fc\1\uffff\1\u020e\1\u0211\1\uffff\1\u020a"+
            "\1\u0209\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u0213\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u020c\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u020b\2\71\1\uffff"+
            "\3\71\5\uffff\1\u0212\3\71\1\uffff\6\71\4\uffff\1\71\1\u0206"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u020f\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u0214\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u020d\16\71\1\uffff"+
            "\1\71\1\uffff\1\u020d\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u0208\1\u0207\1\uffff\1\u01fd"+
            "\1\u01ff\1\uffff\1\u0202\1\u0201\1\u0210\2\uffff\1\u0202\4\uffff"+
            "\1\u0216\3\uffff\1\u0201\51\uffff\1\71\57\uffff\1\71\72\uffff"+
            "\1\71\67\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71"+
            "\112\uffff\1\71",
            "\1\u0222\1\u0223\1\u021e\2\uffff\1\u0233\1\u0221\2\uffff\2"+
            "\u021f\1\uffff\1\u021a\1\uffff\1\u022c\1\u022f\1\uffff\1\u0228"+
            "\1\u0227\1\uffff\1\71\1\uffff\6\71\1\uffff\1\71\1\uffff\1\71"+
            "\1\u0231\2\uffff\1\71\1\uffff\4\71\1\uffff\2\71\1\u022a\4\uffff"+
            "\3\71\1\uffff\2\71\2\uffff\2\71\1\uffff\1\71\1\uffff\4\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\2\uffff\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\6\uffff\1\71\1\uffff\1\71\3\uffff\4\71\1\uffff"+
            "\1\71\1\uffff\3\71\1\uffff\3\71\1\uffff\4\71\1\uffff\3\71\1"+
            "\uffff\1\71\1\uffff\2\71\1\uffff\1\71\1\uffff\3\71\2\uffff\3"+
            "\71\1\uffff\4\71\4\uffff\1\71\1\uffff\4\71\6\uffff\2\71\3\uffff"+
            "\1\71\4\uffff\2\71\1\uffff\1\71\1\uffff\1\u0229\2\71\1\uffff"+
            "\3\71\5\uffff\1\u0230\3\71\1\uffff\6\71\4\uffff\1\71\1\u0224"+
            "\3\71\1\uffff\5\71\1\uffff\3\71\1\uffff\4\71\1\uffff\1\71\1"+
            "\uffff\2\71\1\uffff\2\71\1\uffff\2\71\1\u022d\1\71\1\uffff\1"+
            "\71\1\uffff\1\71\3\uffff\3\71\1\u0232\4\uffff\2\71\1\uffff\2"+
            "\71\1\uffff\3\71\2\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff"+
            "\3\71\1\uffff\1\71\2\uffff\3\71\2\uffff\1\u022b\16\71\1\uffff"+
            "\1\71\1\uffff\1\u022b\2\71\4\uffff\5\71\1\uffff\4\71\1\uffff"+
            "\6\71\1\uffff\2\71\1\uffff\4\71\1\uffff\7\71\1\uffff\2\71\1"+
            "\uffff\1\71\1\uffff\4\71\5\uffff\1\71\1\uffff\1\71\1\uffff\3"+
            "\71\2\uffff\1\71\2\uffff\2\71\1\uffff\1\71\1\uffff\1\71\2\uffff"+
            "\5\71\1\uffff\3\71\2\uffff\3\71\1\uffff\1\71\1\uffff\5\71\2"+
            "\uffff\1\71\2\uffff\6\71\1\uffff\1\u0226\1\u0225\1\uffff\1\u021b"+
            "\1\u021d\1\uffff\1\u0220\1\u021f\1\u022e\2\uffff\1\u0220\4\uffff"+
            "\1\u0234\3\uffff\1\u021f\51\uffff\1\71\57\uffff\1\71\72\uffff"+
            "\1\71\67\uffff\1\71\3\uffff\1\71\35\uffff\1\71\7\uffff\1\71"+
            "\112\uffff\1\71",
            "\1\u0238",
            "\1\u0239",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            "",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            "",
            "\1\uffff",
            "\1\uffff",
            ""
    };

    static final short[] DFA60_eot = DFA.unpackEncodedString(DFA60_eotS);
    static final short[] DFA60_eof = DFA.unpackEncodedString(DFA60_eofS);
    static final char[] DFA60_min = DFA.unpackEncodedStringToUnsignedChars(DFA60_minS);
    static final char[] DFA60_max = DFA.unpackEncodedStringToUnsignedChars(DFA60_maxS);
    static final short[] DFA60_accept = DFA.unpackEncodedString(DFA60_acceptS);
    static final short[] DFA60_special = DFA.unpackEncodedString(DFA60_specialS);
    static final short[][] DFA60_transition;

    static {
        int numStates = DFA60_transitionS.length;
        DFA60_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA60_transition[i] = DFA.unpackEncodedString(DFA60_transitionS[i]);
        }
    }

    class DFA60 extends DFA {

        public DFA60(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 60;
            this.eot = DFA60_eot;
            this.eof = DFA60_eof;
            this.min = DFA60_min;
            this.max = DFA60_max;
            this.accept = DFA60_accept;
            this.special = DFA60_special;
            this.transition = DFA60_transition;
        }
        public String getDescription() {
            return "337:1: valuesTableConstructor : ( ( valueRowConstructor ( COMMA ! valueRowConstructor )* )=> ( valueRowConstructor ( COMMA ! valueRowConstructor )* ) | firstValueRowConstructor ( COMMA ! valueRowConstructor )* );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA60_31 = input.LA(1);

                         
                        int index60_31 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_31);

                        if ( s>=0 ) return s;
                        break;

                    case 1 : 
                        int LA60_32 = input.LA(1);

                         
                        int index60_32 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_32);

                        if ( s>=0 ) return s;
                        break;

                    case 2 : 
                        int LA60_33 = input.LA(1);

                         
                        int index60_33 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_33);

                        if ( s>=0 ) return s;
                        break;

                    case 3 : 
                        int LA60_34 = input.LA(1);

                         
                        int index60_34 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_34);

                        if ( s>=0 ) return s;
                        break;

                    case 4 : 
                        int LA60_35 = input.LA(1);

                         
                        int index60_35 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_35);

                        if ( s>=0 ) return s;
                        break;

                    case 5 : 
                        int LA60_36 = input.LA(1);

                         
                        int index60_36 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_36);

                        if ( s>=0 ) return s;
                        break;

                    case 6 : 
                        int LA60_37 = input.LA(1);

                         
                        int index60_37 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_37);

                        if ( s>=0 ) return s;
                        break;

                    case 7 : 
                        int LA60_38 = input.LA(1);

                         
                        int index60_38 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_38);

                        if ( s>=0 ) return s;
                        break;

                    case 8 : 
                        int LA60_39 = input.LA(1);

                         
                        int index60_39 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_39);

                        if ( s>=0 ) return s;
                        break;

                    case 9 : 
                        int LA60_40 = input.LA(1);

                         
                        int index60_40 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_40);

                        if ( s>=0 ) return s;
                        break;

                    case 10 : 
                        int LA60_41 = input.LA(1);

                         
                        int index60_41 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_41);

                        if ( s>=0 ) return s;
                        break;

                    case 11 : 
                        int LA60_42 = input.LA(1);

                         
                        int index60_42 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_42);

                        if ( s>=0 ) return s;
                        break;

                    case 12 : 
                        int LA60_43 = input.LA(1);

                         
                        int index60_43 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_43);

                        if ( s>=0 ) return s;
                        break;

                    case 13 : 
                        int LA60_44 = input.LA(1);

                         
                        int index60_44 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_44);

                        if ( s>=0 ) return s;
                        break;

                    case 14 : 
                        int LA60_45 = input.LA(1);

                         
                        int index60_45 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_45);

                        if ( s>=0 ) return s;
                        break;

                    case 15 : 
                        int LA60_46 = input.LA(1);

                         
                        int index60_46 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_46);

                        if ( s>=0 ) return s;
                        break;

                    case 16 : 
                        int LA60_47 = input.LA(1);

                         
                        int index60_47 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_47);

                        if ( s>=0 ) return s;
                        break;

                    case 17 : 
                        int LA60_48 = input.LA(1);

                         
                        int index60_48 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_48);

                        if ( s>=0 ) return s;
                        break;

                    case 18 : 
                        int LA60_49 = input.LA(1);

                         
                        int index60_49 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_49);

                        if ( s>=0 ) return s;
                        break;

                    case 19 : 
                        int LA60_50 = input.LA(1);

                         
                        int index60_50 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_50);

                        if ( s>=0 ) return s;
                        break;

                    case 20 : 
                        int LA60_51 = input.LA(1);

                         
                        int index60_51 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_51);

                        if ( s>=0 ) return s;
                        break;

                    case 21 : 
                        int LA60_52 = input.LA(1);

                         
                        int index60_52 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_52);

                        if ( s>=0 ) return s;
                        break;

                    case 22 : 
                        int LA60_53 = input.LA(1);

                         
                        int index60_53 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_53);

                        if ( s>=0 ) return s;
                        break;

                    case 23 : 
                        int LA60_54 = input.LA(1);

                         
                        int index60_54 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_54);

                        if ( s>=0 ) return s;
                        break;

                    case 24 : 
                        int LA60_55 = input.LA(1);

                         
                        int index60_55 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_55);

                        if ( s>=0 ) return s;
                        break;

                    case 25 : 
                        int LA60_56 = input.LA(1);

                         
                        int index60_56 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_56);

                        if ( s>=0 ) return s;
                        break;

                    case 26 : 
                        int LA60_60 = input.LA(1);

                         
                        int index60_60 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_60);

                        if ( s>=0 ) return s;
                        break;

                    case 27 : 
                        int LA60_61 = input.LA(1);

                         
                        int index60_61 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_61);

                        if ( s>=0 ) return s;
                        break;

                    case 28 : 
                        int LA60_62 = input.LA(1);

                         
                        int index60_62 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_62);

                        if ( s>=0 ) return s;
                        break;

                    case 29 : 
                        int LA60_63 = input.LA(1);

                         
                        int index60_63 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_63);

                        if ( s>=0 ) return s;
                        break;

                    case 30 : 
                        int LA60_64 = input.LA(1);

                         
                        int index60_64 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_64);

                        if ( s>=0 ) return s;
                        break;

                    case 31 : 
                        int LA60_65 = input.LA(1);

                         
                        int index60_65 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_65);

                        if ( s>=0 ) return s;
                        break;

                    case 32 : 
                        int LA60_66 = input.LA(1);

                         
                        int index60_66 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_66);

                        if ( s>=0 ) return s;
                        break;

                    case 33 : 
                        int LA60_67 = input.LA(1);

                         
                        int index60_67 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_67);

                        if ( s>=0 ) return s;
                        break;

                    case 34 : 
                        int LA60_68 = input.LA(1);

                         
                        int index60_68 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_68);

                        if ( s>=0 ) return s;
                        break;

                    case 35 : 
                        int LA60_69 = input.LA(1);

                         
                        int index60_69 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_69);

                        if ( s>=0 ) return s;
                        break;

                    case 36 : 
                        int LA60_70 = input.LA(1);

                         
                        int index60_70 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_70);

                        if ( s>=0 ) return s;
                        break;

                    case 37 : 
                        int LA60_71 = input.LA(1);

                         
                        int index60_71 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_71);

                        if ( s>=0 ) return s;
                        break;

                    case 38 : 
                        int LA60_72 = input.LA(1);

                         
                        int index60_72 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_72);

                        if ( s>=0 ) return s;
                        break;

                    case 39 : 
                        int LA60_73 = input.LA(1);

                         
                        int index60_73 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_73);

                        if ( s>=0 ) return s;
                        break;

                    case 40 : 
                        int LA60_74 = input.LA(1);

                         
                        int index60_74 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_74);

                        if ( s>=0 ) return s;
                        break;

                    case 41 : 
                        int LA60_75 = input.LA(1);

                         
                        int index60_75 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_75);

                        if ( s>=0 ) return s;
                        break;

                    case 42 : 
                        int LA60_76 = input.LA(1);

                         
                        int index60_76 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_76);

                        if ( s>=0 ) return s;
                        break;

                    case 43 : 
                        int LA60_77 = input.LA(1);

                         
                        int index60_77 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_77);

                        if ( s>=0 ) return s;
                        break;

                    case 44 : 
                        int LA60_78 = input.LA(1);

                         
                        int index60_78 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_78);

                        if ( s>=0 ) return s;
                        break;

                    case 45 : 
                        int LA60_79 = input.LA(1);

                         
                        int index60_79 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_79);

                        if ( s>=0 ) return s;
                        break;

                    case 46 : 
                        int LA60_80 = input.LA(1);

                         
                        int index60_80 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_80);

                        if ( s>=0 ) return s;
                        break;

                    case 47 : 
                        int LA60_81 = input.LA(1);

                         
                        int index60_81 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_81);

                        if ( s>=0 ) return s;
                        break;

                    case 48 : 
                        int LA60_82 = input.LA(1);

                         
                        int index60_82 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_82);

                        if ( s>=0 ) return s;
                        break;

                    case 49 : 
                        int LA60_83 = input.LA(1);

                         
                        int index60_83 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_83);

                        if ( s>=0 ) return s;
                        break;

                    case 50 : 
                        int LA60_84 = input.LA(1);

                         
                        int index60_84 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_84);

                        if ( s>=0 ) return s;
                        break;

                    case 51 : 
                        int LA60_85 = input.LA(1);

                         
                        int index60_85 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_85);

                        if ( s>=0 ) return s;
                        break;

                    case 52 : 
                        int LA60_86 = input.LA(1);

                         
                        int index60_86 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_86);

                        if ( s>=0 ) return s;
                        break;

                    case 53 : 
                        int LA60_87 = input.LA(1);

                         
                        int index60_87 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_87);

                        if ( s>=0 ) return s;
                        break;

                    case 54 : 
                        int LA60_88 = input.LA(1);

                         
                        int index60_88 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_88);

                        if ( s>=0 ) return s;
                        break;

                    case 55 : 
                        int LA60_89 = input.LA(1);

                         
                        int index60_89 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_89);

                        if ( s>=0 ) return s;
                        break;

                    case 56 : 
                        int LA60_90 = input.LA(1);

                         
                        int index60_90 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_90);

                        if ( s>=0 ) return s;
                        break;

                    case 57 : 
                        int LA60_91 = input.LA(1);

                         
                        int index60_91 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_91);

                        if ( s>=0 ) return s;
                        break;

                    case 58 : 
                        int LA60_92 = input.LA(1);

                         
                        int index60_92 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_92);

                        if ( s>=0 ) return s;
                        break;

                    case 59 : 
                        int LA60_93 = input.LA(1);

                         
                        int index60_93 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_93);

                        if ( s>=0 ) return s;
                        break;

                    case 60 : 
                        int LA60_94 = input.LA(1);

                         
                        int index60_94 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_94);

                        if ( s>=0 ) return s;
                        break;

                    case 61 : 
                        int LA60_95 = input.LA(1);

                         
                        int index60_95 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_95);

                        if ( s>=0 ) return s;
                        break;

                    case 62 : 
                        int LA60_96 = input.LA(1);

                         
                        int index60_96 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_96);

                        if ( s>=0 ) return s;
                        break;

                    case 63 : 
                        int LA60_97 = input.LA(1);

                         
                        int index60_97 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_97);

                        if ( s>=0 ) return s;
                        break;

                    case 64 : 
                        int LA60_98 = input.LA(1);

                         
                        int index60_98 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_98);

                        if ( s>=0 ) return s;
                        break;

                    case 65 : 
                        int LA60_99 = input.LA(1);

                         
                        int index60_99 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_99);

                        if ( s>=0 ) return s;
                        break;

                    case 66 : 
                        int LA60_100 = input.LA(1);

                         
                        int index60_100 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_100);

                        if ( s>=0 ) return s;
                        break;

                    case 67 : 
                        int LA60_101 = input.LA(1);

                         
                        int index60_101 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_101);

                        if ( s>=0 ) return s;
                        break;

                    case 68 : 
                        int LA60_102 = input.LA(1);

                         
                        int index60_102 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_102);

                        if ( s>=0 ) return s;
                        break;

                    case 69 : 
                        int LA60_103 = input.LA(1);

                         
                        int index60_103 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_103);

                        if ( s>=0 ) return s;
                        break;

                    case 70 : 
                        int LA60_104 = input.LA(1);

                         
                        int index60_104 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_104);

                        if ( s>=0 ) return s;
                        break;

                    case 71 : 
                        int LA60_105 = input.LA(1);

                         
                        int index60_105 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_105);

                        if ( s>=0 ) return s;
                        break;

                    case 72 : 
                        int LA60_106 = input.LA(1);

                         
                        int index60_106 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_106);

                        if ( s>=0 ) return s;
                        break;

                    case 73 : 
                        int LA60_107 = input.LA(1);

                         
                        int index60_107 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_107);

                        if ( s>=0 ) return s;
                        break;

                    case 74 : 
                        int LA60_108 = input.LA(1);

                         
                        int index60_108 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_108);

                        if ( s>=0 ) return s;
                        break;

                    case 75 : 
                        int LA60_109 = input.LA(1);

                         
                        int index60_109 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_109);

                        if ( s>=0 ) return s;
                        break;

                    case 76 : 
                        int LA60_110 = input.LA(1);

                         
                        int index60_110 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_110);

                        if ( s>=0 ) return s;
                        break;

                    case 77 : 
                        int LA60_111 = input.LA(1);

                         
                        int index60_111 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_111);

                        if ( s>=0 ) return s;
                        break;

                    case 78 : 
                        int LA60_112 = input.LA(1);

                         
                        int index60_112 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_112);

                        if ( s>=0 ) return s;
                        break;

                    case 79 : 
                        int LA60_113 = input.LA(1);

                         
                        int index60_113 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_113);

                        if ( s>=0 ) return s;
                        break;

                    case 80 : 
                        int LA60_114 = input.LA(1);

                         
                        int index60_114 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_114);

                        if ( s>=0 ) return s;
                        break;

                    case 81 : 
                        int LA60_115 = input.LA(1);

                         
                        int index60_115 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_115);

                        if ( s>=0 ) return s;
                        break;

                    case 82 : 
                        int LA60_116 = input.LA(1);

                         
                        int index60_116 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_116);

                        if ( s>=0 ) return s;
                        break;

                    case 83 : 
                        int LA60_117 = input.LA(1);

                         
                        int index60_117 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_117);

                        if ( s>=0 ) return s;
                        break;

                    case 84 : 
                        int LA60_118 = input.LA(1);

                         
                        int index60_118 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_118);

                        if ( s>=0 ) return s;
                        break;

                    case 85 : 
                        int LA60_119 = input.LA(1);

                         
                        int index60_119 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_119);

                        if ( s>=0 ) return s;
                        break;

                    case 86 : 
                        int LA60_120 = input.LA(1);

                         
                        int index60_120 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_120);

                        if ( s>=0 ) return s;
                        break;

                    case 87 : 
                        int LA60_121 = input.LA(1);

                         
                        int index60_121 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_121);

                        if ( s>=0 ) return s;
                        break;

                    case 88 : 
                        int LA60_122 = input.LA(1);

                         
                        int index60_122 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_122);

                        if ( s>=0 ) return s;
                        break;

                    case 89 : 
                        int LA60_123 = input.LA(1);

                         
                        int index60_123 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_123);

                        if ( s>=0 ) return s;
                        break;

                    case 90 : 
                        int LA60_124 = input.LA(1);

                         
                        int index60_124 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_124);

                        if ( s>=0 ) return s;
                        break;

                    case 91 : 
                        int LA60_125 = input.LA(1);

                         
                        int index60_125 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_125);

                        if ( s>=0 ) return s;
                        break;

                    case 92 : 
                        int LA60_126 = input.LA(1);

                         
                        int index60_126 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_126);

                        if ( s>=0 ) return s;
                        break;

                    case 93 : 
                        int LA60_127 = input.LA(1);

                         
                        int index60_127 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_127);

                        if ( s>=0 ) return s;
                        break;

                    case 94 : 
                        int LA60_128 = input.LA(1);

                         
                        int index60_128 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_128);

                        if ( s>=0 ) return s;
                        break;

                    case 95 : 
                        int LA60_129 = input.LA(1);

                         
                        int index60_129 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_129);

                        if ( s>=0 ) return s;
                        break;

                    case 96 : 
                        int LA60_130 = input.LA(1);

                         
                        int index60_130 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_130);

                        if ( s>=0 ) return s;
                        break;

                    case 97 : 
                        int LA60_131 = input.LA(1);

                         
                        int index60_131 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_131);

                        if ( s>=0 ) return s;
                        break;

                    case 98 : 
                        int LA60_132 = input.LA(1);

                         
                        int index60_132 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_132);

                        if ( s>=0 ) return s;
                        break;

                    case 99 : 
                        int LA60_133 = input.LA(1);

                         
                        int index60_133 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_133);

                        if ( s>=0 ) return s;
                        break;

                    case 100 : 
                        int LA60_134 = input.LA(1);

                         
                        int index60_134 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_134);

                        if ( s>=0 ) return s;
                        break;

                    case 101 : 
                        int LA60_135 = input.LA(1);

                         
                        int index60_135 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_135);

                        if ( s>=0 ) return s;
                        break;

                    case 102 : 
                        int LA60_136 = input.LA(1);

                         
                        int index60_136 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_136);

                        if ( s>=0 ) return s;
                        break;

                    case 103 : 
                        int LA60_137 = input.LA(1);

                         
                        int index60_137 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_137);

                        if ( s>=0 ) return s;
                        break;

                    case 104 : 
                        int LA60_138 = input.LA(1);

                         
                        int index60_138 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_138);

                        if ( s>=0 ) return s;
                        break;

                    case 105 : 
                        int LA60_139 = input.LA(1);

                         
                        int index60_139 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_139);

                        if ( s>=0 ) return s;
                        break;

                    case 106 : 
                        int LA60_140 = input.LA(1);

                         
                        int index60_140 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_140);

                        if ( s>=0 ) return s;
                        break;

                    case 107 : 
                        int LA60_141 = input.LA(1);

                         
                        int index60_141 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_141);

                        if ( s>=0 ) return s;
                        break;

                    case 108 : 
                        int LA60_142 = input.LA(1);

                         
                        int index60_142 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_142);

                        if ( s>=0 ) return s;
                        break;

                    case 109 : 
                        int LA60_146 = input.LA(1);

                         
                        int index60_146 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_146);

                        if ( s>=0 ) return s;
                        break;

                    case 110 : 
                        int LA60_147 = input.LA(1);

                         
                        int index60_147 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_147);

                        if ( s>=0 ) return s;
                        break;

                    case 111 : 
                        int LA60_148 = input.LA(1);

                         
                        int index60_148 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_148);

                        if ( s>=0 ) return s;
                        break;

                    case 112 : 
                        int LA60_149 = input.LA(1);

                         
                        int index60_149 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_149);

                        if ( s>=0 ) return s;
                        break;

                    case 113 : 
                        int LA60_150 = input.LA(1);

                         
                        int index60_150 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_150);

                        if ( s>=0 ) return s;
                        break;

                    case 114 : 
                        int LA60_151 = input.LA(1);

                         
                        int index60_151 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_151);

                        if ( s>=0 ) return s;
                        break;

                    case 115 : 
                        int LA60_152 = input.LA(1);

                         
                        int index60_152 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_152);

                        if ( s>=0 ) return s;
                        break;

                    case 116 : 
                        int LA60_153 = input.LA(1);

                         
                        int index60_153 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_153);

                        if ( s>=0 ) return s;
                        break;

                    case 117 : 
                        int LA60_154 = input.LA(1);

                         
                        int index60_154 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_154);

                        if ( s>=0 ) return s;
                        break;

                    case 118 : 
                        int LA60_155 = input.LA(1);

                         
                        int index60_155 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_155);

                        if ( s>=0 ) return s;
                        break;

                    case 119 : 
                        int LA60_156 = input.LA(1);

                         
                        int index60_156 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_156);

                        if ( s>=0 ) return s;
                        break;

                    case 120 : 
                        int LA60_157 = input.LA(1);

                         
                        int index60_157 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_157);

                        if ( s>=0 ) return s;
                        break;

                    case 121 : 
                        int LA60_158 = input.LA(1);

                         
                        int index60_158 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_158);

                        if ( s>=0 ) return s;
                        break;

                    case 122 : 
                        int LA60_159 = input.LA(1);

                         
                        int index60_159 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_159);

                        if ( s>=0 ) return s;
                        break;

                    case 123 : 
                        int LA60_160 = input.LA(1);

                         
                        int index60_160 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_160);

                        if ( s>=0 ) return s;
                        break;

                    case 124 : 
                        int LA60_161 = input.LA(1);

                         
                        int index60_161 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_161);

                        if ( s>=0 ) return s;
                        break;

                    case 125 : 
                        int LA60_162 = input.LA(1);

                         
                        int index60_162 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_162);

                        if ( s>=0 ) return s;
                        break;

                    case 126 : 
                        int LA60_163 = input.LA(1);

                         
                        int index60_163 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_163);

                        if ( s>=0 ) return s;
                        break;

                    case 127 : 
                        int LA60_164 = input.LA(1);

                         
                        int index60_164 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_164);

                        if ( s>=0 ) return s;
                        break;

                    case 128 : 
                        int LA60_165 = input.LA(1);

                         
                        int index60_165 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_165);

                        if ( s>=0 ) return s;
                        break;

                    case 129 : 
                        int LA60_166 = input.LA(1);

                         
                        int index60_166 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_166);

                        if ( s>=0 ) return s;
                        break;

                    case 130 : 
                        int LA60_167 = input.LA(1);

                         
                        int index60_167 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_167);

                        if ( s>=0 ) return s;
                        break;

                    case 131 : 
                        int LA60_168 = input.LA(1);

                         
                        int index60_168 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_168);

                        if ( s>=0 ) return s;
                        break;

                    case 132 : 
                        int LA60_169 = input.LA(1);

                         
                        int index60_169 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_169);

                        if ( s>=0 ) return s;
                        break;

                    case 133 : 
                        int LA60_170 = input.LA(1);

                         
                        int index60_170 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_170);

                        if ( s>=0 ) return s;
                        break;

                    case 134 : 
                        int LA60_171 = input.LA(1);

                         
                        int index60_171 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_171);

                        if ( s>=0 ) return s;
                        break;

                    case 135 : 
                        int LA60_172 = input.LA(1);

                         
                        int index60_172 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_172);

                        if ( s>=0 ) return s;
                        break;

                    case 136 : 
                        int LA60_173 = input.LA(1);

                         
                        int index60_173 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_173);

                        if ( s>=0 ) return s;
                        break;

                    case 137 : 
                        int LA60_174 = input.LA(1);

                         
                        int index60_174 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_174);

                        if ( s>=0 ) return s;
                        break;

                    case 138 : 
                        int LA60_175 = input.LA(1);

                         
                        int index60_175 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_175);

                        if ( s>=0 ) return s;
                        break;

                    case 139 : 
                        int LA60_176 = input.LA(1);

                         
                        int index60_176 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_176);

                        if ( s>=0 ) return s;
                        break;

                    case 140 : 
                        int LA60_177 = input.LA(1);

                         
                        int index60_177 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_177);

                        if ( s>=0 ) return s;
                        break;

                    case 141 : 
                        int LA60_181 = input.LA(1);

                         
                        int index60_181 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_181);

                        if ( s>=0 ) return s;
                        break;

                    case 142 : 
                        int LA60_182 = input.LA(1);

                         
                        int index60_182 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_182);

                        if ( s>=0 ) return s;
                        break;

                    case 143 : 
                        int LA60_183 = input.LA(1);

                         
                        int index60_183 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_183);

                        if ( s>=0 ) return s;
                        break;

                    case 144 : 
                        int LA60_184 = input.LA(1);

                         
                        int index60_184 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_184);

                        if ( s>=0 ) return s;
                        break;

                    case 145 : 
                        int LA60_185 = input.LA(1);

                         
                        int index60_185 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_185);

                        if ( s>=0 ) return s;
                        break;

                    case 146 : 
                        int LA60_186 = input.LA(1);

                         
                        int index60_186 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_186);

                        if ( s>=0 ) return s;
                        break;

                    case 147 : 
                        int LA60_187 = input.LA(1);

                         
                        int index60_187 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_187);

                        if ( s>=0 ) return s;
                        break;

                    case 148 : 
                        int LA60_188 = input.LA(1);

                         
                        int index60_188 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_188);

                        if ( s>=0 ) return s;
                        break;

                    case 149 : 
                        int LA60_189 = input.LA(1);

                         
                        int index60_189 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_189);

                        if ( s>=0 ) return s;
                        break;

                    case 150 : 
                        int LA60_190 = input.LA(1);

                         
                        int index60_190 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_190);

                        if ( s>=0 ) return s;
                        break;

                    case 151 : 
                        int LA60_191 = input.LA(1);

                         
                        int index60_191 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_191);

                        if ( s>=0 ) return s;
                        break;

                    case 152 : 
                        int LA60_192 = input.LA(1);

                         
                        int index60_192 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_192);

                        if ( s>=0 ) return s;
                        break;

                    case 153 : 
                        int LA60_193 = input.LA(1);

                         
                        int index60_193 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_193);

                        if ( s>=0 ) return s;
                        break;

                    case 154 : 
                        int LA60_194 = input.LA(1);

                         
                        int index60_194 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_194);

                        if ( s>=0 ) return s;
                        break;

                    case 155 : 
                        int LA60_195 = input.LA(1);

                         
                        int index60_195 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_195);

                        if ( s>=0 ) return s;
                        break;

                    case 156 : 
                        int LA60_196 = input.LA(1);

                         
                        int index60_196 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_196);

                        if ( s>=0 ) return s;
                        break;

                    case 157 : 
                        int LA60_197 = input.LA(1);

                         
                        int index60_197 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_197);

                        if ( s>=0 ) return s;
                        break;

                    case 158 : 
                        int LA60_198 = input.LA(1);

                         
                        int index60_198 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_198);

                        if ( s>=0 ) return s;
                        break;

                    case 159 : 
                        int LA60_199 = input.LA(1);

                         
                        int index60_199 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_199);

                        if ( s>=0 ) return s;
                        break;

                    case 160 : 
                        int LA60_200 = input.LA(1);

                         
                        int index60_200 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_200);

                        if ( s>=0 ) return s;
                        break;

                    case 161 : 
                        int LA60_201 = input.LA(1);

                         
                        int index60_201 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_201);

                        if ( s>=0 ) return s;
                        break;

                    case 162 : 
                        int LA60_202 = input.LA(1);

                         
                        int index60_202 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_202);

                        if ( s>=0 ) return s;
                        break;

                    case 163 : 
                        int LA60_203 = input.LA(1);

                         
                        int index60_203 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_203);

                        if ( s>=0 ) return s;
                        break;

                    case 164 : 
                        int LA60_204 = input.LA(1);

                         
                        int index60_204 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_204);

                        if ( s>=0 ) return s;
                        break;

                    case 165 : 
                        int LA60_205 = input.LA(1);

                         
                        int index60_205 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_205);

                        if ( s>=0 ) return s;
                        break;

                    case 166 : 
                        int LA60_206 = input.LA(1);

                         
                        int index60_206 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_206);

                        if ( s>=0 ) return s;
                        break;

                    case 167 : 
                        int LA60_207 = input.LA(1);

                         
                        int index60_207 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_207);

                        if ( s>=0 ) return s;
                        break;

                    case 168 : 
                        int LA60_208 = input.LA(1);

                         
                        int index60_208 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_208);

                        if ( s>=0 ) return s;
                        break;

                    case 169 : 
                        int LA60_212 = input.LA(1);

                         
                        int index60_212 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_212);

                        if ( s>=0 ) return s;
                        break;

                    case 170 : 
                        int LA60_213 = input.LA(1);

                         
                        int index60_213 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_213);

                        if ( s>=0 ) return s;
                        break;

                    case 171 : 
                        int LA60_214 = input.LA(1);

                         
                        int index60_214 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_214);

                        if ( s>=0 ) return s;
                        break;

                    case 172 : 
                        int LA60_215 = input.LA(1);

                         
                        int index60_215 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_215);

                        if ( s>=0 ) return s;
                        break;

                    case 173 : 
                        int LA60_216 = input.LA(1);

                         
                        int index60_216 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_216);

                        if ( s>=0 ) return s;
                        break;

                    case 174 : 
                        int LA60_217 = input.LA(1);

                         
                        int index60_217 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_217);

                        if ( s>=0 ) return s;
                        break;

                    case 175 : 
                        int LA60_218 = input.LA(1);

                         
                        int index60_218 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_218);

                        if ( s>=0 ) return s;
                        break;

                    case 176 : 
                        int LA60_219 = input.LA(1);

                         
                        int index60_219 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_219);

                        if ( s>=0 ) return s;
                        break;

                    case 177 : 
                        int LA60_220 = input.LA(1);

                         
                        int index60_220 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_220);

                        if ( s>=0 ) return s;
                        break;

                    case 178 : 
                        int LA60_221 = input.LA(1);

                         
                        int index60_221 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_221);

                        if ( s>=0 ) return s;
                        break;

                    case 179 : 
                        int LA60_222 = input.LA(1);

                         
                        int index60_222 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_222);

                        if ( s>=0 ) return s;
                        break;

                    case 180 : 
                        int LA60_223 = input.LA(1);

                         
                        int index60_223 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_223);

                        if ( s>=0 ) return s;
                        break;

                    case 181 : 
                        int LA60_224 = input.LA(1);

                         
                        int index60_224 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_224);

                        if ( s>=0 ) return s;
                        break;

                    case 182 : 
                        int LA60_225 = input.LA(1);

                         
                        int index60_225 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_225);

                        if ( s>=0 ) return s;
                        break;

                    case 183 : 
                        int LA60_226 = input.LA(1);

                         
                        int index60_226 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_226);

                        if ( s>=0 ) return s;
                        break;

                    case 184 : 
                        int LA60_227 = input.LA(1);

                         
                        int index60_227 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_227);

                        if ( s>=0 ) return s;
                        break;

                    case 185 : 
                        int LA60_228 = input.LA(1);

                         
                        int index60_228 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_228);

                        if ( s>=0 ) return s;
                        break;

                    case 186 : 
                        int LA60_229 = input.LA(1);

                         
                        int index60_229 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_229);

                        if ( s>=0 ) return s;
                        break;

                    case 187 : 
                        int LA60_230 = input.LA(1);

                         
                        int index60_230 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_230);

                        if ( s>=0 ) return s;
                        break;

                    case 188 : 
                        int LA60_231 = input.LA(1);

                         
                        int index60_231 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_231);

                        if ( s>=0 ) return s;
                        break;

                    case 189 : 
                        int LA60_232 = input.LA(1);

                         
                        int index60_232 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_232);

                        if ( s>=0 ) return s;
                        break;

                    case 190 : 
                        int LA60_233 = input.LA(1);

                         
                        int index60_233 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_233);

                        if ( s>=0 ) return s;
                        break;

                    case 191 : 
                        int LA60_234 = input.LA(1);

                         
                        int index60_234 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_234);

                        if ( s>=0 ) return s;
                        break;

                    case 192 : 
                        int LA60_235 = input.LA(1);

                         
                        int index60_235 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_235);

                        if ( s>=0 ) return s;
                        break;

                    case 193 : 
                        int LA60_236 = input.LA(1);

                         
                        int index60_236 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_236);

                        if ( s>=0 ) return s;
                        break;

                    case 194 : 
                        int LA60_237 = input.LA(1);

                         
                        int index60_237 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_237);

                        if ( s>=0 ) return s;
                        break;

                    case 195 : 
                        int LA60_238 = input.LA(1);

                         
                        int index60_238 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_238);

                        if ( s>=0 ) return s;
                        break;

                    case 196 : 
                        int LA60_239 = input.LA(1);

                         
                        int index60_239 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_239);

                        if ( s>=0 ) return s;
                        break;

                    case 197 : 
                        int LA60_243 = input.LA(1);

                         
                        int index60_243 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_243);

                        if ( s>=0 ) return s;
                        break;

                    case 198 : 
                        int LA60_244 = input.LA(1);

                         
                        int index60_244 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_244);

                        if ( s>=0 ) return s;
                        break;

                    case 199 : 
                        int LA60_245 = input.LA(1);

                         
                        int index60_245 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_245);

                        if ( s>=0 ) return s;
                        break;

                    case 200 : 
                        int LA60_246 = input.LA(1);

                         
                        int index60_246 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_246);

                        if ( s>=0 ) return s;
                        break;

                    case 201 : 
                        int LA60_247 = input.LA(1);

                         
                        int index60_247 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_247);

                        if ( s>=0 ) return s;
                        break;

                    case 202 : 
                        int LA60_248 = input.LA(1);

                         
                        int index60_248 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_248);

                        if ( s>=0 ) return s;
                        break;

                    case 203 : 
                        int LA60_249 = input.LA(1);

                         
                        int index60_249 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_249);

                        if ( s>=0 ) return s;
                        break;

                    case 204 : 
                        int LA60_250 = input.LA(1);

                         
                        int index60_250 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_250);

                        if ( s>=0 ) return s;
                        break;

                    case 205 : 
                        int LA60_251 = input.LA(1);

                         
                        int index60_251 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_251);

                        if ( s>=0 ) return s;
                        break;

                    case 206 : 
                        int LA60_252 = input.LA(1);

                         
                        int index60_252 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_252);

                        if ( s>=0 ) return s;
                        break;

                    case 207 : 
                        int LA60_253 = input.LA(1);

                         
                        int index60_253 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_253);

                        if ( s>=0 ) return s;
                        break;

                    case 208 : 
                        int LA60_254 = input.LA(1);

                         
                        int index60_254 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_254);

                        if ( s>=0 ) return s;
                        break;

                    case 209 : 
                        int LA60_255 = input.LA(1);

                         
                        int index60_255 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_255);

                        if ( s>=0 ) return s;
                        break;

                    case 210 : 
                        int LA60_256 = input.LA(1);

                         
                        int index60_256 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_256);

                        if ( s>=0 ) return s;
                        break;

                    case 211 : 
                        int LA60_257 = input.LA(1);

                         
                        int index60_257 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_257);

                        if ( s>=0 ) return s;
                        break;

                    case 212 : 
                        int LA60_258 = input.LA(1);

                         
                        int index60_258 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_258);

                        if ( s>=0 ) return s;
                        break;

                    case 213 : 
                        int LA60_259 = input.LA(1);

                         
                        int index60_259 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_259);

                        if ( s>=0 ) return s;
                        break;

                    case 214 : 
                        int LA60_260 = input.LA(1);

                         
                        int index60_260 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_260);

                        if ( s>=0 ) return s;
                        break;

                    case 215 : 
                        int LA60_261 = input.LA(1);

                         
                        int index60_261 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_261);

                        if ( s>=0 ) return s;
                        break;

                    case 216 : 
                        int LA60_262 = input.LA(1);

                         
                        int index60_262 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_262);

                        if ( s>=0 ) return s;
                        break;

                    case 217 : 
                        int LA60_263 = input.LA(1);

                         
                        int index60_263 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_263);

                        if ( s>=0 ) return s;
                        break;

                    case 218 : 
                        int LA60_264 = input.LA(1);

                         
                        int index60_264 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_264);

                        if ( s>=0 ) return s;
                        break;

                    case 219 : 
                        int LA60_265 = input.LA(1);

                         
                        int index60_265 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_265);

                        if ( s>=0 ) return s;
                        break;

                    case 220 : 
                        int LA60_266 = input.LA(1);

                         
                        int index60_266 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_266);

                        if ( s>=0 ) return s;
                        break;

                    case 221 : 
                        int LA60_267 = input.LA(1);

                         
                        int index60_267 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_267);

                        if ( s>=0 ) return s;
                        break;

                    case 222 : 
                        int LA60_268 = input.LA(1);

                         
                        int index60_268 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_268);

                        if ( s>=0 ) return s;
                        break;

                    case 223 : 
                        int LA60_272 = input.LA(1);

                         
                        int index60_272 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_272);

                        if ( s>=0 ) return s;
                        break;

                    case 224 : 
                        int LA60_273 = input.LA(1);

                         
                        int index60_273 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_273);

                        if ( s>=0 ) return s;
                        break;

                    case 225 : 
                        int LA60_274 = input.LA(1);

                         
                        int index60_274 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_274);

                        if ( s>=0 ) return s;
                        break;

                    case 226 : 
                        int LA60_275 = input.LA(1);

                         
                        int index60_275 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_275);

                        if ( s>=0 ) return s;
                        break;

                    case 227 : 
                        int LA60_276 = input.LA(1);

                         
                        int index60_276 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_276);

                        if ( s>=0 ) return s;
                        break;

                    case 228 : 
                        int LA60_277 = input.LA(1);

                         
                        int index60_277 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_277);

                        if ( s>=0 ) return s;
                        break;

                    case 229 : 
                        int LA60_278 = input.LA(1);

                         
                        int index60_278 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_278);

                        if ( s>=0 ) return s;
                        break;

                    case 230 : 
                        int LA60_279 = input.LA(1);

                         
                        int index60_279 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_279);

                        if ( s>=0 ) return s;
                        break;

                    case 231 : 
                        int LA60_280 = input.LA(1);

                         
                        int index60_280 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_280);

                        if ( s>=0 ) return s;
                        break;

                    case 232 : 
                        int LA60_281 = input.LA(1);

                         
                        int index60_281 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_281);

                        if ( s>=0 ) return s;
                        break;

                    case 233 : 
                        int LA60_282 = input.LA(1);

                         
                        int index60_282 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_282);

                        if ( s>=0 ) return s;
                        break;

                    case 234 : 
                        int LA60_283 = input.LA(1);

                         
                        int index60_283 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_283);

                        if ( s>=0 ) return s;
                        break;

                    case 235 : 
                        int LA60_284 = input.LA(1);

                         
                        int index60_284 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_284);

                        if ( s>=0 ) return s;
                        break;

                    case 236 : 
                        int LA60_285 = input.LA(1);

                         
                        int index60_285 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_285);

                        if ( s>=0 ) return s;
                        break;

                    case 237 : 
                        int LA60_286 = input.LA(1);

                         
                        int index60_286 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_286);

                        if ( s>=0 ) return s;
                        break;

                    case 238 : 
                        int LA60_287 = input.LA(1);

                         
                        int index60_287 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_287);

                        if ( s>=0 ) return s;
                        break;

                    case 239 : 
                        int LA60_288 = input.LA(1);

                         
                        int index60_288 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_288);

                        if ( s>=0 ) return s;
                        break;

                    case 240 : 
                        int LA60_289 = input.LA(1);

                         
                        int index60_289 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_289);

                        if ( s>=0 ) return s;
                        break;

                    case 241 : 
                        int LA60_290 = input.LA(1);

                         
                        int index60_290 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_290);

                        if ( s>=0 ) return s;
                        break;

                    case 242 : 
                        int LA60_291 = input.LA(1);

                         
                        int index60_291 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_291);

                        if ( s>=0 ) return s;
                        break;

                    case 243 : 
                        int LA60_292 = input.LA(1);

                         
                        int index60_292 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_292);

                        if ( s>=0 ) return s;
                        break;

                    case 244 : 
                        int LA60_293 = input.LA(1);

                         
                        int index60_293 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_293);

                        if ( s>=0 ) return s;
                        break;

                    case 245 : 
                        int LA60_294 = input.LA(1);

                         
                        int index60_294 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_294);

                        if ( s>=0 ) return s;
                        break;

                    case 246 : 
                        int LA60_295 = input.LA(1);

                         
                        int index60_295 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_295);

                        if ( s>=0 ) return s;
                        break;

                    case 247 : 
                        int LA60_296 = input.LA(1);

                         
                        int index60_296 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_296);

                        if ( s>=0 ) return s;
                        break;

                    case 248 : 
                        int LA60_300 = input.LA(1);

                         
                        int index60_300 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_300);

                        if ( s>=0 ) return s;
                        break;

                    case 249 : 
                        int LA60_301 = input.LA(1);

                         
                        int index60_301 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_301);

                        if ( s>=0 ) return s;
                        break;

                    case 250 : 
                        int LA60_302 = input.LA(1);

                         
                        int index60_302 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_302);

                        if ( s>=0 ) return s;
                        break;

                    case 251 : 
                        int LA60_303 = input.LA(1);

                         
                        int index60_303 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_303);

                        if ( s>=0 ) return s;
                        break;

                    case 252 : 
                        int LA60_304 = input.LA(1);

                         
                        int index60_304 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_304);

                        if ( s>=0 ) return s;
                        break;

                    case 253 : 
                        int LA60_305 = input.LA(1);

                         
                        int index60_305 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_305);

                        if ( s>=0 ) return s;
                        break;

                    case 254 : 
                        int LA60_306 = input.LA(1);

                         
                        int index60_306 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_306);

                        if ( s>=0 ) return s;
                        break;

                    case 255 : 
                        int LA60_307 = input.LA(1);

                         
                        int index60_307 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_307);

                        if ( s>=0 ) return s;
                        break;

                    case 256 : 
                        int LA60_308 = input.LA(1);

                         
                        int index60_308 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_308);

                        if ( s>=0 ) return s;
                        break;

                    case 257 : 
                        int LA60_309 = input.LA(1);

                         
                        int index60_309 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_309);

                        if ( s>=0 ) return s;
                        break;

                    case 258 : 
                        int LA60_310 = input.LA(1);

                         
                        int index60_310 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_310);

                        if ( s>=0 ) return s;
                        break;

                    case 259 : 
                        int LA60_311 = input.LA(1);

                         
                        int index60_311 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_311);

                        if ( s>=0 ) return s;
                        break;

                    case 260 : 
                        int LA60_312 = input.LA(1);

                         
                        int index60_312 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_312);

                        if ( s>=0 ) return s;
                        break;

                    case 261 : 
                        int LA60_313 = input.LA(1);

                         
                        int index60_313 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_313);

                        if ( s>=0 ) return s;
                        break;

                    case 262 : 
                        int LA60_314 = input.LA(1);

                         
                        int index60_314 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_314);

                        if ( s>=0 ) return s;
                        break;

                    case 263 : 
                        int LA60_315 = input.LA(1);

                         
                        int index60_315 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_315);

                        if ( s>=0 ) return s;
                        break;

                    case 264 : 
                        int LA60_316 = input.LA(1);

                         
                        int index60_316 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_316);

                        if ( s>=0 ) return s;
                        break;

                    case 265 : 
                        int LA60_317 = input.LA(1);

                         
                        int index60_317 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_317);

                        if ( s>=0 ) return s;
                        break;

                    case 266 : 
                        int LA60_318 = input.LA(1);

                         
                        int index60_318 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_318);

                        if ( s>=0 ) return s;
                        break;

                    case 267 : 
                        int LA60_319 = input.LA(1);

                         
                        int index60_319 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_319);

                        if ( s>=0 ) return s;
                        break;

                    case 268 : 
                        int LA60_320 = input.LA(1);

                         
                        int index60_320 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_320);

                        if ( s>=0 ) return s;
                        break;

                    case 269 : 
                        int LA60_321 = input.LA(1);

                         
                        int index60_321 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_321);

                        if ( s>=0 ) return s;
                        break;

                    case 270 : 
                        int LA60_322 = input.LA(1);

                         
                        int index60_322 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_322);

                        if ( s>=0 ) return s;
                        break;

                    case 271 : 
                        int LA60_323 = input.LA(1);

                         
                        int index60_323 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_323);

                        if ( s>=0 ) return s;
                        break;

                    case 272 : 
                        int LA60_324 = input.LA(1);

                         
                        int index60_324 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_324);

                        if ( s>=0 ) return s;
                        break;

                    case 273 : 
                        int LA60_325 = input.LA(1);

                         
                        int index60_325 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_325);

                        if ( s>=0 ) return s;
                        break;

                    case 274 : 
                        int LA60_329 = input.LA(1);

                         
                        int index60_329 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_329);

                        if ( s>=0 ) return s;
                        break;

                    case 275 : 
                        int LA60_330 = input.LA(1);

                         
                        int index60_330 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_330);

                        if ( s>=0 ) return s;
                        break;

                    case 276 : 
                        int LA60_331 = input.LA(1);

                         
                        int index60_331 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_331);

                        if ( s>=0 ) return s;
                        break;

                    case 277 : 
                        int LA60_332 = input.LA(1);

                         
                        int index60_332 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_332);

                        if ( s>=0 ) return s;
                        break;

                    case 278 : 
                        int LA60_333 = input.LA(1);

                         
                        int index60_333 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_333);

                        if ( s>=0 ) return s;
                        break;

                    case 279 : 
                        int LA60_334 = input.LA(1);

                         
                        int index60_334 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_334);

                        if ( s>=0 ) return s;
                        break;

                    case 280 : 
                        int LA60_335 = input.LA(1);

                         
                        int index60_335 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_335);

                        if ( s>=0 ) return s;
                        break;

                    case 281 : 
                        int LA60_336 = input.LA(1);

                         
                        int index60_336 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_336);

                        if ( s>=0 ) return s;
                        break;

                    case 282 : 
                        int LA60_337 = input.LA(1);

                         
                        int index60_337 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_337);

                        if ( s>=0 ) return s;
                        break;

                    case 283 : 
                        int LA60_338 = input.LA(1);

                         
                        int index60_338 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_338);

                        if ( s>=0 ) return s;
                        break;

                    case 284 : 
                        int LA60_339 = input.LA(1);

                         
                        int index60_339 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_339);

                        if ( s>=0 ) return s;
                        break;

                    case 285 : 
                        int LA60_340 = input.LA(1);

                         
                        int index60_340 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_340);

                        if ( s>=0 ) return s;
                        break;

                    case 286 : 
                        int LA60_341 = input.LA(1);

                         
                        int index60_341 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_341);

                        if ( s>=0 ) return s;
                        break;

                    case 287 : 
                        int LA60_342 = input.LA(1);

                         
                        int index60_342 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_342);

                        if ( s>=0 ) return s;
                        break;

                    case 288 : 
                        int LA60_343 = input.LA(1);

                         
                        int index60_343 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_343);

                        if ( s>=0 ) return s;
                        break;

                    case 289 : 
                        int LA60_344 = input.LA(1);

                         
                        int index60_344 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_344);

                        if ( s>=0 ) return s;
                        break;

                    case 290 : 
                        int LA60_345 = input.LA(1);

                         
                        int index60_345 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_345);

                        if ( s>=0 ) return s;
                        break;

                    case 291 : 
                        int LA60_346 = input.LA(1);

                         
                        int index60_346 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_346);

                        if ( s>=0 ) return s;
                        break;

                    case 292 : 
                        int LA60_347 = input.LA(1);

                         
                        int index60_347 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_347);

                        if ( s>=0 ) return s;
                        break;

                    case 293 : 
                        int LA60_348 = input.LA(1);

                         
                        int index60_348 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_348);

                        if ( s>=0 ) return s;
                        break;

                    case 294 : 
                        int LA60_349 = input.LA(1);

                         
                        int index60_349 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_349);

                        if ( s>=0 ) return s;
                        break;

                    case 295 : 
                        int LA60_350 = input.LA(1);

                         
                        int index60_350 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_350);

                        if ( s>=0 ) return s;
                        break;

                    case 296 : 
                        int LA60_351 = input.LA(1);

                         
                        int index60_351 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_351);

                        if ( s>=0 ) return s;
                        break;

                    case 297 : 
                        int LA60_352 = input.LA(1);

                         
                        int index60_352 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_352);

                        if ( s>=0 ) return s;
                        break;

                    case 298 : 
                        int LA60_353 = input.LA(1);

                         
                        int index60_353 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_353);

                        if ( s>=0 ) return s;
                        break;

                    case 299 : 
                        int LA60_357 = input.LA(1);

                         
                        int index60_357 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_357);

                        if ( s>=0 ) return s;
                        break;

                    case 300 : 
                        int LA60_358 = input.LA(1);

                         
                        int index60_358 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_358);

                        if ( s>=0 ) return s;
                        break;

                    case 301 : 
                        int LA60_359 = input.LA(1);

                         
                        int index60_359 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_359);

                        if ( s>=0 ) return s;
                        break;

                    case 302 : 
                        int LA60_360 = input.LA(1);

                         
                        int index60_360 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_360);

                        if ( s>=0 ) return s;
                        break;

                    case 303 : 
                        int LA60_361 = input.LA(1);

                         
                        int index60_361 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_361);

                        if ( s>=0 ) return s;
                        break;

                    case 304 : 
                        int LA60_362 = input.LA(1);

                         
                        int index60_362 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_362);

                        if ( s>=0 ) return s;
                        break;

                    case 305 : 
                        int LA60_363 = input.LA(1);

                         
                        int index60_363 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_363);

                        if ( s>=0 ) return s;
                        break;

                    case 306 : 
                        int LA60_364 = input.LA(1);

                         
                        int index60_364 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_364);

                        if ( s>=0 ) return s;
                        break;

                    case 307 : 
                        int LA60_365 = input.LA(1);

                         
                        int index60_365 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_365);

                        if ( s>=0 ) return s;
                        break;

                    case 308 : 
                        int LA60_366 = input.LA(1);

                         
                        int index60_366 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_366);

                        if ( s>=0 ) return s;
                        break;

                    case 309 : 
                        int LA60_367 = input.LA(1);

                         
                        int index60_367 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_367);

                        if ( s>=0 ) return s;
                        break;

                    case 310 : 
                        int LA60_368 = input.LA(1);

                         
                        int index60_368 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_368);

                        if ( s>=0 ) return s;
                        break;

                    case 311 : 
                        int LA60_369 = input.LA(1);

                         
                        int index60_369 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_369);

                        if ( s>=0 ) return s;
                        break;

                    case 312 : 
                        int LA60_370 = input.LA(1);

                         
                        int index60_370 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_370);

                        if ( s>=0 ) return s;
                        break;

                    case 313 : 
                        int LA60_371 = input.LA(1);

                         
                        int index60_371 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_371);

                        if ( s>=0 ) return s;
                        break;

                    case 314 : 
                        int LA60_372 = input.LA(1);

                         
                        int index60_372 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_372);

                        if ( s>=0 ) return s;
                        break;

                    case 315 : 
                        int LA60_373 = input.LA(1);

                         
                        int index60_373 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_373);

                        if ( s>=0 ) return s;
                        break;

                    case 316 : 
                        int LA60_374 = input.LA(1);

                         
                        int index60_374 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_374);

                        if ( s>=0 ) return s;
                        break;

                    case 317 : 
                        int LA60_375 = input.LA(1);

                         
                        int index60_375 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_375);

                        if ( s>=0 ) return s;
                        break;

                    case 318 : 
                        int LA60_376 = input.LA(1);

                         
                        int index60_376 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_376);

                        if ( s>=0 ) return s;
                        break;

                    case 319 : 
                        int LA60_377 = input.LA(1);

                         
                        int index60_377 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_377);

                        if ( s>=0 ) return s;
                        break;

                    case 320 : 
                        int LA60_378 = input.LA(1);

                         
                        int index60_378 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_378);

                        if ( s>=0 ) return s;
                        break;

                    case 321 : 
                        int LA60_379 = input.LA(1);

                         
                        int index60_379 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_379);

                        if ( s>=0 ) return s;
                        break;

                    case 322 : 
                        int LA60_380 = input.LA(1);

                         
                        int index60_380 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_380);

                        if ( s>=0 ) return s;
                        break;

                    case 323 : 
                        int LA60_381 = input.LA(1);

                         
                        int index60_381 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_381);

                        if ( s>=0 ) return s;
                        break;

                    case 324 : 
                        int LA60_385 = input.LA(1);

                         
                        int index60_385 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_385);

                        if ( s>=0 ) return s;
                        break;

                    case 325 : 
                        int LA60_386 = input.LA(1);

                         
                        int index60_386 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_386);

                        if ( s>=0 ) return s;
                        break;

                    case 326 : 
                        int LA60_387 = input.LA(1);

                         
                        int index60_387 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_387);

                        if ( s>=0 ) return s;
                        break;

                    case 327 : 
                        int LA60_388 = input.LA(1);

                         
                        int index60_388 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_388);

                        if ( s>=0 ) return s;
                        break;

                    case 328 : 
                        int LA60_389 = input.LA(1);

                         
                        int index60_389 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_389);

                        if ( s>=0 ) return s;
                        break;

                    case 329 : 
                        int LA60_390 = input.LA(1);

                         
                        int index60_390 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_390);

                        if ( s>=0 ) return s;
                        break;

                    case 330 : 
                        int LA60_391 = input.LA(1);

                         
                        int index60_391 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_391);

                        if ( s>=0 ) return s;
                        break;

                    case 331 : 
                        int LA60_392 = input.LA(1);

                         
                        int index60_392 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_392);

                        if ( s>=0 ) return s;
                        break;

                    case 332 : 
                        int LA60_393 = input.LA(1);

                         
                        int index60_393 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_393);

                        if ( s>=0 ) return s;
                        break;

                    case 333 : 
                        int LA60_394 = input.LA(1);

                         
                        int index60_394 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_394);

                        if ( s>=0 ) return s;
                        break;

                    case 334 : 
                        int LA60_395 = input.LA(1);

                         
                        int index60_395 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_395);

                        if ( s>=0 ) return s;
                        break;

                    case 335 : 
                        int LA60_396 = input.LA(1);

                         
                        int index60_396 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_396);

                        if ( s>=0 ) return s;
                        break;

                    case 336 : 
                        int LA60_397 = input.LA(1);

                         
                        int index60_397 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_397);

                        if ( s>=0 ) return s;
                        break;

                    case 337 : 
                        int LA60_398 = input.LA(1);

                         
                        int index60_398 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_398);

                        if ( s>=0 ) return s;
                        break;

                    case 338 : 
                        int LA60_399 = input.LA(1);

                         
                        int index60_399 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_399);

                        if ( s>=0 ) return s;
                        break;

                    case 339 : 
                        int LA60_400 = input.LA(1);

                         
                        int index60_400 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_400);

                        if ( s>=0 ) return s;
                        break;

                    case 340 : 
                        int LA60_401 = input.LA(1);

                         
                        int index60_401 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_401);

                        if ( s>=0 ) return s;
                        break;

                    case 341 : 
                        int LA60_402 = input.LA(1);

                         
                        int index60_402 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_402);

                        if ( s>=0 ) return s;
                        break;

                    case 342 : 
                        int LA60_403 = input.LA(1);

                         
                        int index60_403 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_403);

                        if ( s>=0 ) return s;
                        break;

                    case 343 : 
                        int LA60_404 = input.LA(1);

                         
                        int index60_404 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_404);

                        if ( s>=0 ) return s;
                        break;

                    case 344 : 
                        int LA60_405 = input.LA(1);

                         
                        int index60_405 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_405);

                        if ( s>=0 ) return s;
                        break;

                    case 345 : 
                        int LA60_406 = input.LA(1);

                         
                        int index60_406 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_406);

                        if ( s>=0 ) return s;
                        break;

                    case 346 : 
                        int LA60_407 = input.LA(1);

                         
                        int index60_407 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_407);

                        if ( s>=0 ) return s;
                        break;

                    case 347 : 
                        int LA60_408 = input.LA(1);

                         
                        int index60_408 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_408);

                        if ( s>=0 ) return s;
                        break;

                    case 348 : 
                        int LA60_409 = input.LA(1);

                         
                        int index60_409 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_409);

                        if ( s>=0 ) return s;
                        break;

                    case 349 : 
                        int LA60_413 = input.LA(1);

                         
                        int index60_413 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_413);

                        if ( s>=0 ) return s;
                        break;

                    case 350 : 
                        int LA60_414 = input.LA(1);

                         
                        int index60_414 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_414);

                        if ( s>=0 ) return s;
                        break;

                    case 351 : 
                        int LA60_415 = input.LA(1);

                         
                        int index60_415 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_415);

                        if ( s>=0 ) return s;
                        break;

                    case 352 : 
                        int LA60_416 = input.LA(1);

                         
                        int index60_416 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_416);

                        if ( s>=0 ) return s;
                        break;

                    case 353 : 
                        int LA60_417 = input.LA(1);

                         
                        int index60_417 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_417);

                        if ( s>=0 ) return s;
                        break;

                    case 354 : 
                        int LA60_418 = input.LA(1);

                         
                        int index60_418 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_418);

                        if ( s>=0 ) return s;
                        break;

                    case 355 : 
                        int LA60_419 = input.LA(1);

                         
                        int index60_419 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_419);

                        if ( s>=0 ) return s;
                        break;

                    case 356 : 
                        int LA60_420 = input.LA(1);

                         
                        int index60_420 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_420);

                        if ( s>=0 ) return s;
                        break;

                    case 357 : 
                        int LA60_421 = input.LA(1);

                         
                        int index60_421 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_421);

                        if ( s>=0 ) return s;
                        break;

                    case 358 : 
                        int LA60_422 = input.LA(1);

                         
                        int index60_422 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_422);

                        if ( s>=0 ) return s;
                        break;

                    case 359 : 
                        int LA60_423 = input.LA(1);

                         
                        int index60_423 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_423);

                        if ( s>=0 ) return s;
                        break;

                    case 360 : 
                        int LA60_424 = input.LA(1);

                         
                        int index60_424 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_424);

                        if ( s>=0 ) return s;
                        break;

                    case 361 : 
                        int LA60_425 = input.LA(1);

                         
                        int index60_425 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_425);

                        if ( s>=0 ) return s;
                        break;

                    case 362 : 
                        int LA60_426 = input.LA(1);

                         
                        int index60_426 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_426);

                        if ( s>=0 ) return s;
                        break;

                    case 363 : 
                        int LA60_427 = input.LA(1);

                         
                        int index60_427 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_427);

                        if ( s>=0 ) return s;
                        break;

                    case 364 : 
                        int LA60_428 = input.LA(1);

                         
                        int index60_428 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_428);

                        if ( s>=0 ) return s;
                        break;

                    case 365 : 
                        int LA60_429 = input.LA(1);

                         
                        int index60_429 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_429);

                        if ( s>=0 ) return s;
                        break;

                    case 366 : 
                        int LA60_430 = input.LA(1);

                         
                        int index60_430 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_430);

                        if ( s>=0 ) return s;
                        break;

                    case 367 : 
                        int LA60_431 = input.LA(1);

                         
                        int index60_431 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_431);

                        if ( s>=0 ) return s;
                        break;

                    case 368 : 
                        int LA60_432 = input.LA(1);

                         
                        int index60_432 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_432);

                        if ( s>=0 ) return s;
                        break;

                    case 369 : 
                        int LA60_433 = input.LA(1);

                         
                        int index60_433 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_433);

                        if ( s>=0 ) return s;
                        break;

                    case 370 : 
                        int LA60_434 = input.LA(1);

                         
                        int index60_434 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_434);

                        if ( s>=0 ) return s;
                        break;

                    case 371 : 
                        int LA60_435 = input.LA(1);

                         
                        int index60_435 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_435);

                        if ( s>=0 ) return s;
                        break;

                    case 372 : 
                        int LA60_436 = input.LA(1);

                         
                        int index60_436 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_436);

                        if ( s>=0 ) return s;
                        break;

                    case 373 : 
                        int LA60_437 = input.LA(1);

                         
                        int index60_437 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_437);

                        if ( s>=0 ) return s;
                        break;

                    case 374 : 
                        int LA60_438 = input.LA(1);

                         
                        int index60_438 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_438);

                        if ( s>=0 ) return s;
                        break;

                    case 375 : 
                        int LA60_439 = input.LA(1);

                         
                        int index60_439 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_439);

                        if ( s>=0 ) return s;
                        break;

                    case 376 : 
                        int LA60_440 = input.LA(1);

                         
                        int index60_440 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_440);

                        if ( s>=0 ) return s;
                        break;

                    case 377 : 
                        int LA60_441 = input.LA(1);

                         
                        int index60_441 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_441);

                        if ( s>=0 ) return s;
                        break;

                    case 378 : 
                        int LA60_442 = input.LA(1);

                         
                        int index60_442 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_442);

                        if ( s>=0 ) return s;
                        break;

                    case 379 : 
                        int LA60_443 = input.LA(1);

                         
                        int index60_443 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_443);

                        if ( s>=0 ) return s;
                        break;

                    case 380 : 
                        int LA60_444 = input.LA(1);

                         
                        int index60_444 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_444);

                        if ( s>=0 ) return s;
                        break;

                    case 381 : 
                        int LA60_445 = input.LA(1);

                         
                        int index60_445 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_445);

                        if ( s>=0 ) return s;
                        break;

                    case 382 : 
                        int LA60_446 = input.LA(1);

                         
                        int index60_446 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_446);

                        if ( s>=0 ) return s;
                        break;

                    case 383 : 
                        int LA60_447 = input.LA(1);

                         
                        int index60_447 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_447);

                        if ( s>=0 ) return s;
                        break;

                    case 384 : 
                        int LA60_448 = input.LA(1);

                         
                        int index60_448 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_448);

                        if ( s>=0 ) return s;
                        break;

                    case 385 : 
                        int LA60_449 = input.LA(1);

                         
                        int index60_449 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_449);

                        if ( s>=0 ) return s;
                        break;

                    case 386 : 
                        int LA60_450 = input.LA(1);

                         
                        int index60_450 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_450);

                        if ( s>=0 ) return s;
                        break;

                    case 387 : 
                        int LA60_451 = input.LA(1);

                         
                        int index60_451 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_451);

                        if ( s>=0 ) return s;
                        break;

                    case 388 : 
                        int LA60_452 = input.LA(1);

                         
                        int index60_452 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_452);

                        if ( s>=0 ) return s;
                        break;

                    case 389 : 
                        int LA60_453 = input.LA(1);

                         
                        int index60_453 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_453);

                        if ( s>=0 ) return s;
                        break;

                    case 390 : 
                        int LA60_454 = input.LA(1);

                         
                        int index60_454 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_454);

                        if ( s>=0 ) return s;
                        break;

                    case 391 : 
                        int LA60_455 = input.LA(1);

                         
                        int index60_455 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_455);

                        if ( s>=0 ) return s;
                        break;

                    case 392 : 
                        int LA60_456 = input.LA(1);

                         
                        int index60_456 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_456);

                        if ( s>=0 ) return s;
                        break;

                    case 393 : 
                        int LA60_457 = input.LA(1);

                         
                        int index60_457 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_457);

                        if ( s>=0 ) return s;
                        break;

                    case 394 : 
                        int LA60_458 = input.LA(1);

                         
                        int index60_458 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_458);

                        if ( s>=0 ) return s;
                        break;

                    case 395 : 
                        int LA60_459 = input.LA(1);

                         
                        int index60_459 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_459);

                        if ( s>=0 ) return s;
                        break;

                    case 396 : 
                        int LA60_460 = input.LA(1);

                         
                        int index60_460 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_460);

                        if ( s>=0 ) return s;
                        break;

                    case 397 : 
                        int LA60_461 = input.LA(1);

                         
                        int index60_461 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_461);

                        if ( s>=0 ) return s;
                        break;

                    case 398 : 
                        int LA60_462 = input.LA(1);

                         
                        int index60_462 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_462);

                        if ( s>=0 ) return s;
                        break;

                    case 399 : 
                        int LA60_463 = input.LA(1);

                         
                        int index60_463 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_463);

                        if ( s>=0 ) return s;
                        break;

                    case 400 : 
                        int LA60_464 = input.LA(1);

                         
                        int index60_464 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_464);

                        if ( s>=0 ) return s;
                        break;

                    case 401 : 
                        int LA60_465 = input.LA(1);

                         
                        int index60_465 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_465);

                        if ( s>=0 ) return s;
                        break;

                    case 402 : 
                        int LA60_466 = input.LA(1);

                         
                        int index60_466 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_466);

                        if ( s>=0 ) return s;
                        break;

                    case 403 : 
                        int LA60_467 = input.LA(1);

                         
                        int index60_467 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_467);

                        if ( s>=0 ) return s;
                        break;

                    case 404 : 
                        int LA60_468 = input.LA(1);

                         
                        int index60_468 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_468);

                        if ( s>=0 ) return s;
                        break;

                    case 405 : 
                        int LA60_469 = input.LA(1);

                         
                        int index60_469 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_469);

                        if ( s>=0 ) return s;
                        break;

                    case 406 : 
                        int LA60_470 = input.LA(1);

                         
                        int index60_470 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_470);

                        if ( s>=0 ) return s;
                        break;

                    case 407 : 
                        int LA60_471 = input.LA(1);

                         
                        int index60_471 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_471);

                        if ( s>=0 ) return s;
                        break;

                    case 408 : 
                        int LA60_472 = input.LA(1);

                         
                        int index60_472 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_472);

                        if ( s>=0 ) return s;
                        break;

                    case 409 : 
                        int LA60_473 = input.LA(1);

                         
                        int index60_473 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_473);

                        if ( s>=0 ) return s;
                        break;

                    case 410 : 
                        int LA60_474 = input.LA(1);

                         
                        int index60_474 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_474);

                        if ( s>=0 ) return s;
                        break;

                    case 411 : 
                        int LA60_475 = input.LA(1);

                         
                        int index60_475 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_475);

                        if ( s>=0 ) return s;
                        break;

                    case 412 : 
                        int LA60_476 = input.LA(1);

                         
                        int index60_476 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_476);

                        if ( s>=0 ) return s;
                        break;

                    case 413 : 
                        int LA60_477 = input.LA(1);

                         
                        int index60_477 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_477);

                        if ( s>=0 ) return s;
                        break;

                    case 414 : 
                        int LA60_478 = input.LA(1);

                         
                        int index60_478 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_478);

                        if ( s>=0 ) return s;
                        break;

                    case 415 : 
                        int LA60_479 = input.LA(1);

                         
                        int index60_479 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_479);

                        if ( s>=0 ) return s;
                        break;

                    case 416 : 
                        int LA60_481 = input.LA(1);

                         
                        int index60_481 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_481);

                        if ( s>=0 ) return s;
                        break;

                    case 417 : 
                        int LA60_482 = input.LA(1);

                         
                        int index60_482 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_482);

                        if ( s>=0 ) return s;
                        break;

                    case 418 : 
                        int LA60_483 = input.LA(1);

                         
                        int index60_483 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_483);

                        if ( s>=0 ) return s;
                        break;

                    case 419 : 
                        int LA60_484 = input.LA(1);

                         
                        int index60_484 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_484);

                        if ( s>=0 ) return s;
                        break;

                    case 420 : 
                        int LA60_485 = input.LA(1);

                         
                        int index60_485 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_485);

                        if ( s>=0 ) return s;
                        break;

                    case 421 : 
                        int LA60_486 = input.LA(1);

                         
                        int index60_486 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_486);

                        if ( s>=0 ) return s;
                        break;

                    case 422 : 
                        int LA60_487 = input.LA(1);

                         
                        int index60_487 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_487);

                        if ( s>=0 ) return s;
                        break;

                    case 423 : 
                        int LA60_488 = input.LA(1);

                         
                        int index60_488 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_488);

                        if ( s>=0 ) return s;
                        break;

                    case 424 : 
                        int LA60_489 = input.LA(1);

                         
                        int index60_489 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_489);

                        if ( s>=0 ) return s;
                        break;

                    case 425 : 
                        int LA60_490 = input.LA(1);

                         
                        int index60_490 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_490);

                        if ( s>=0 ) return s;
                        break;

                    case 426 : 
                        int LA60_491 = input.LA(1);

                         
                        int index60_491 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_491);

                        if ( s>=0 ) return s;
                        break;

                    case 427 : 
                        int LA60_492 = input.LA(1);

                         
                        int index60_492 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_492);

                        if ( s>=0 ) return s;
                        break;

                    case 428 : 
                        int LA60_493 = input.LA(1);

                         
                        int index60_493 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_493);

                        if ( s>=0 ) return s;
                        break;

                    case 429 : 
                        int LA60_494 = input.LA(1);

                         
                        int index60_494 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_494);

                        if ( s>=0 ) return s;
                        break;

                    case 430 : 
                        int LA60_495 = input.LA(1);

                         
                        int index60_495 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_495);

                        if ( s>=0 ) return s;
                        break;

                    case 431 : 
                        int LA60_496 = input.LA(1);

                         
                        int index60_496 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_496);

                        if ( s>=0 ) return s;
                        break;

                    case 432 : 
                        int LA60_497 = input.LA(1);

                         
                        int index60_497 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_497);

                        if ( s>=0 ) return s;
                        break;

                    case 433 : 
                        int LA60_498 = input.LA(1);

                         
                        int index60_498 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_498);

                        if ( s>=0 ) return s;
                        break;

                    case 434 : 
                        int LA60_499 = input.LA(1);

                         
                        int index60_499 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_499);

                        if ( s>=0 ) return s;
                        break;

                    case 435 : 
                        int LA60_500 = input.LA(1);

                         
                        int index60_500 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_500);

                        if ( s>=0 ) return s;
                        break;

                    case 436 : 
                        int LA60_501 = input.LA(1);

                         
                        int index60_501 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_501);

                        if ( s>=0 ) return s;
                        break;

                    case 437 : 
                        int LA60_502 = input.LA(1);

                         
                        int index60_502 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_502);

                        if ( s>=0 ) return s;
                        break;

                    case 438 : 
                        int LA60_503 = input.LA(1);

                         
                        int index60_503 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_503);

                        if ( s>=0 ) return s;
                        break;

                    case 439 : 
                        int LA60_504 = input.LA(1);

                         
                        int index60_504 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_504);

                        if ( s>=0 ) return s;
                        break;

                    case 440 : 
                        int LA60_508 = input.LA(1);

                         
                        int index60_508 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_508);

                        if ( s>=0 ) return s;
                        break;

                    case 441 : 
                        int LA60_509 = input.LA(1);

                         
                        int index60_509 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_509);

                        if ( s>=0 ) return s;
                        break;

                    case 442 : 
                        int LA60_511 = input.LA(1);

                         
                        int index60_511 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_511);

                        if ( s>=0 ) return s;
                        break;

                    case 443 : 
                        int LA60_512 = input.LA(1);

                         
                        int index60_512 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_512);

                        if ( s>=0 ) return s;
                        break;

                    case 444 : 
                        int LA60_513 = input.LA(1);

                         
                        int index60_513 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_513);

                        if ( s>=0 ) return s;
                        break;

                    case 445 : 
                        int LA60_514 = input.LA(1);

                         
                        int index60_514 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_514);

                        if ( s>=0 ) return s;
                        break;

                    case 446 : 
                        int LA60_515 = input.LA(1);

                         
                        int index60_515 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_515);

                        if ( s>=0 ) return s;
                        break;

                    case 447 : 
                        int LA60_516 = input.LA(1);

                         
                        int index60_516 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_516);

                        if ( s>=0 ) return s;
                        break;

                    case 448 : 
                        int LA60_517 = input.LA(1);

                         
                        int index60_517 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_517);

                        if ( s>=0 ) return s;
                        break;

                    case 449 : 
                        int LA60_518 = input.LA(1);

                         
                        int index60_518 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_518);

                        if ( s>=0 ) return s;
                        break;

                    case 450 : 
                        int LA60_519 = input.LA(1);

                         
                        int index60_519 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_519);

                        if ( s>=0 ) return s;
                        break;

                    case 451 : 
                        int LA60_520 = input.LA(1);

                         
                        int index60_520 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_520);

                        if ( s>=0 ) return s;
                        break;

                    case 452 : 
                        int LA60_521 = input.LA(1);

                         
                        int index60_521 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_521);

                        if ( s>=0 ) return s;
                        break;

                    case 453 : 
                        int LA60_522 = input.LA(1);

                         
                        int index60_522 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_522);

                        if ( s>=0 ) return s;
                        break;

                    case 454 : 
                        int LA60_523 = input.LA(1);

                         
                        int index60_523 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_523);

                        if ( s>=0 ) return s;
                        break;

                    case 455 : 
                        int LA60_524 = input.LA(1);

                         
                        int index60_524 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_524);

                        if ( s>=0 ) return s;
                        break;

                    case 456 : 
                        int LA60_525 = input.LA(1);

                         
                        int index60_525 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_525);

                        if ( s>=0 ) return s;
                        break;

                    case 457 : 
                        int LA60_526 = input.LA(1);

                         
                        int index60_526 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_526);

                        if ( s>=0 ) return s;
                        break;

                    case 458 : 
                        int LA60_527 = input.LA(1);

                         
                        int index60_527 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_527);

                        if ( s>=0 ) return s;
                        break;

                    case 459 : 
                        int LA60_528 = input.LA(1);

                         
                        int index60_528 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_528);

                        if ( s>=0 ) return s;
                        break;

                    case 460 : 
                        int LA60_529 = input.LA(1);

                         
                        int index60_529 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_529);

                        if ( s>=0 ) return s;
                        break;

                    case 461 : 
                        int LA60_530 = input.LA(1);

                         
                        int index60_530 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_530);

                        if ( s>=0 ) return s;
                        break;

                    case 462 : 
                        int LA60_531 = input.LA(1);

                         
                        int index60_531 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_531);

                        if ( s>=0 ) return s;
                        break;

                    case 463 : 
                        int LA60_532 = input.LA(1);

                         
                        int index60_532 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_532);

                        if ( s>=0 ) return s;
                        break;

                    case 464 : 
                        int LA60_533 = input.LA(1);

                         
                        int index60_533 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_533);

                        if ( s>=0 ) return s;
                        break;

                    case 465 : 
                        int LA60_534 = input.LA(1);

                         
                        int index60_534 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_534);

                        if ( s>=0 ) return s;
                        break;

                    case 466 : 
                        int LA60_538 = input.LA(1);

                         
                        int index60_538 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_538);

                        if ( s>=0 ) return s;
                        break;

                    case 467 : 
                        int LA60_539 = input.LA(1);

                         
                        int index60_539 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_539);

                        if ( s>=0 ) return s;
                        break;

                    case 468 : 
                        int LA60_541 = input.LA(1);

                         
                        int index60_541 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_541);

                        if ( s>=0 ) return s;
                        break;

                    case 469 : 
                        int LA60_542 = input.LA(1);

                         
                        int index60_542 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_542);

                        if ( s>=0 ) return s;
                        break;

                    case 470 : 
                        int LA60_543 = input.LA(1);

                         
                        int index60_543 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_543);

                        if ( s>=0 ) return s;
                        break;

                    case 471 : 
                        int LA60_544 = input.LA(1);

                         
                        int index60_544 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_544);

                        if ( s>=0 ) return s;
                        break;

                    case 472 : 
                        int LA60_545 = input.LA(1);

                         
                        int index60_545 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_545);

                        if ( s>=0 ) return s;
                        break;

                    case 473 : 
                        int LA60_546 = input.LA(1);

                         
                        int index60_546 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_546);

                        if ( s>=0 ) return s;
                        break;

                    case 474 : 
                        int LA60_547 = input.LA(1);

                         
                        int index60_547 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_547);

                        if ( s>=0 ) return s;
                        break;

                    case 475 : 
                        int LA60_548 = input.LA(1);

                         
                        int index60_548 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_548);

                        if ( s>=0 ) return s;
                        break;

                    case 476 : 
                        int LA60_549 = input.LA(1);

                         
                        int index60_549 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_549);

                        if ( s>=0 ) return s;
                        break;

                    case 477 : 
                        int LA60_550 = input.LA(1);

                         
                        int index60_550 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_550);

                        if ( s>=0 ) return s;
                        break;

                    case 478 : 
                        int LA60_551 = input.LA(1);

                         
                        int index60_551 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_551);

                        if ( s>=0 ) return s;
                        break;

                    case 479 : 
                        int LA60_552 = input.LA(1);

                         
                        int index60_552 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_552);

                        if ( s>=0 ) return s;
                        break;

                    case 480 : 
                        int LA60_553 = input.LA(1);

                         
                        int index60_553 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_553);

                        if ( s>=0 ) return s;
                        break;

                    case 481 : 
                        int LA60_554 = input.LA(1);

                         
                        int index60_554 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_554);

                        if ( s>=0 ) return s;
                        break;

                    case 482 : 
                        int LA60_555 = input.LA(1);

                         
                        int index60_555 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_555);

                        if ( s>=0 ) return s;
                        break;

                    case 483 : 
                        int LA60_556 = input.LA(1);

                         
                        int index60_556 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_556);

                        if ( s>=0 ) return s;
                        break;

                    case 484 : 
                        int LA60_557 = input.LA(1);

                         
                        int index60_557 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_557);

                        if ( s>=0 ) return s;
                        break;

                    case 485 : 
                        int LA60_558 = input.LA(1);

                         
                        int index60_558 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_558);

                        if ( s>=0 ) return s;
                        break;

                    case 486 : 
                        int LA60_559 = input.LA(1);

                         
                        int index60_559 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_559);

                        if ( s>=0 ) return s;
                        break;

                    case 487 : 
                        int LA60_560 = input.LA(1);

                         
                        int index60_560 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_560);

                        if ( s>=0 ) return s;
                        break;

                    case 488 : 
                        int LA60_561 = input.LA(1);

                         
                        int index60_561 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_561);

                        if ( s>=0 ) return s;
                        break;

                    case 489 : 
                        int LA60_562 = input.LA(1);

                         
                        int index60_562 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_562);

                        if ( s>=0 ) return s;
                        break;

                    case 490 : 
                        int LA60_563 = input.LA(1);

                         
                        int index60_563 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_563);

                        if ( s>=0 ) return s;
                        break;

                    case 491 : 
                        int LA60_564 = input.LA(1);

                         
                        int index60_564 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_564);

                        if ( s>=0 ) return s;
                        break;

                    case 492 : 
                        int LA60_568 = input.LA(1);

                         
                        int index60_568 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_568);

                        if ( s>=0 ) return s;
                        break;

                    case 493 : 
                        int LA60_569 = input.LA(1);

                         
                        int index60_569 = input.index();
                        input.rewind();

                        s = -1;
                        if ( (synpred11_FromClauseParser()) ) {s = 570;}

                        else if ( (true) ) {s = 57;}

                         
                        input.seek(index60_569);

                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}

            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 60, _s, input);
            error(nvae);
            throw nvae;
        }

    }
 

    public static final BitSet FOLLOW_STAR_in_tableAllColumns57 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableAllColumns79 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_tableAllColumns81 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000800000000000L});
    public static final BitSet FOLLOW_STAR_in_tableAllColumns83 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableOrColumn131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_DEFAULT_in_defaultValue170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList209 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_expressionList212 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_expressionList214 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_identifier_in_aliasList256 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_aliasList259 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_aliasList261 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_KW_FROM_in_fromClause305 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBF564EA0F7BFBDBFL,0x0000000043F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_fromSource_in_fromClause307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_uniqueJoinToken_in_fromSource346 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975479L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_uniqueJoinSource_in_fromSource349 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_COMMA_in_fromSource352 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975479L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_uniqueJoinSource_in_fromSource355 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_joinSource_in_fromSource369 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSource_in_atomjoinSource398 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource401 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_virtualTableSource_in_atomjoinSource413 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource416 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_subQuerySource_in_atomjoinSource446 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource449 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_subQuerySource_in_atomjoinSource476 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource479 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_subQuerySource_in_atomjoinSource499 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource502 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_atomjoinSource514 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_lateralView_in_atomjoinSource517 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_LPAREN_in_atomjoinSource529 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F7BFBDBFL,0x0000000043F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_joinSource_in_atomjoinSource532 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_atomjoinSource534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_atomjoinSource_in_joinSource556 = new BitSet(new long[]{0x0000000000000202L,0x0000000000400000L,0x2001000200000000L,0x0000000000000040L,0x0000200000000000L});
    public static final BitSet FOLLOW_joinToken_in_joinSource559 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F7BFBDBFL,0x0000000043F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_joinSourcePart_in_joinSource562 = new BitSet(new long[]{0x0000000000000202L,0x0000000000400000L,0x2001000200000000L,0x0000400000000040L,0x0000200000000000L,0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_KW_ON_in_joinSource565 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_joinSource568 = new BitSet(new long[]{0x0000000000000202L,0x0000000000400000L,0x2001000200000000L,0x0000000000000040L,0x0000200000000000L});
    public static final BitSet FOLLOW_KW_USING_in_joinSource574 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_columnParenthesesList_in_joinSource577 = new BitSet(new long[]{0x0000000000000202L,0x0000000000400000L,0x2001000200000000L,0x0000000000000040L,0x0000200000000000L});
    public static final BitSet FOLLOW_tableSource_in_joinSourcePart615 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_virtualTableSource_in_joinSourcePart619 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_subQuerySource_in_joinSourcePart623 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_joinSourcePart627 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_lateralView_in_joinSourcePart631 = new BitSet(new long[]{0x0000000000000202L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KW_PRESERVE_in_uniqueJoinSource661 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_uniqueJoinTableSource_in_uniqueJoinSource664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_uniqueJoinExpr_in_uniqueJoinSource666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_uniqueJoinExpr693 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expressionList_in_uniqueJoinExpr696 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_uniqueJoinExpr698 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_UNIQUEJOIN_in_uniqueJoinToken726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_INNER_in_joinToken791 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_joinToken817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_CROSS_in_joinToken852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken886 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_RIGHT_in_joinToken898 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken901 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FULL_in_joinToken917 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_joinToken921 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken925 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken937 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0800000000000000L});
    public static final BitSet FOLLOW_KW_SEMI_in_joinToken939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken941 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LEFT_in_joinToken958 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_KW_ANTI_in_joinToken960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x2000000000000000L});
    public static final BitSet FOLLOW_KW_JOIN_in_joinToken962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_LATERAL_in_lateralView1004 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_VIEW_in_lateralView1006 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_lateralView1008 = new BitSet(new long[]{0x66EEDD8AFD000000L,0xB7DEEEBE562A6DBDL,0xDC2ECF48C1F43DCEL,0xDB07156DAFF7DD0FL,0x7BE197FFE3D75079L,0xBE564EA8F5BFBDFFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_function_in_lateralView1010 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableAlias_in_lateralView1012 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_KW_AS_in_lateralView1015 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_lateralView1017 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_lateralView1025 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_lateralView1027 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_lateralView1059 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KW_LATERAL_in_lateralView1062 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_VIEW_in_lateralView1064 = new BitSet(new long[]{0x66EEDD8AFD000000L,0xB7DEEEBE562A6DBDL,0xDC2ECF48C1F43DCEL,0xDB07156DAFF7DD0FL,0x7BE197FFE3D75079L,0xBE564EA8F5BFBDFFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_function_in_lateralView1066 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableAlias_in_lateralView1068 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_KW_AS_in_lateralView1071 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_lateralView1073 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_lateralView1081 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_lateralView1083 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_lateralView1121 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KW_LATERAL_in_lateralView1124 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000002000000L});
    public static final BitSet FOLLOW_KW_TABLE_in_lateralView1126 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_lateralView1128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_valuesClause_in_lateralView1130 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lateralView1132 = new BitSet(new long[]{0x66E0DE8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_lateralView1134 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableAlias_in_lateralView1137 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_lateralView1140 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_lateralView1142 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_lateralView1145 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_lateralView1147 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_lateralView1151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableAlias1213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_tableBucketSample1252 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_tableBucketSample1254 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_KW_BUCKET_in_tableBucketSample1256 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_tableBucketSample1261 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0040000000000000L});
    public static final BitSet FOLLOW_KW_OUT_in_tableBucketSample1264 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_tableBucketSample1266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_tableBucketSample1271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_ON_in_tableBucketSample1275 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_tableBucketSample1279 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_tableBucketSample1282 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_tableBucketSample1286 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_tableBucketSample1292 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_splitSample1341 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_Number_in_splitSample1347 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0010000000000002L});
    public static final BitSet FOLLOW_KW_PERCENT_in_splitSample1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_ROWS_in_splitSample1355 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_splitSample1358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLESAMPLE_in_splitSample1402 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_splitSample1404 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_ByteLengthLiteral_in_splitSample1410 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_splitSample1413 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableBucketSample_in_tableSample1459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_splitSample_in_tableSample1467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_tableSource1496 = new BitSet(new long[]{0x66E0DE8AFD000002L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C8F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0FDBFBDBFL,0x0000000043F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableProperties_in_tableSource1500 = new BitSet(new long[]{0x66E0DE8AFD000002L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C8F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0FDBFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableSample_in_tableSource1505 = new BitSet(new long[]{0x66E0DE8AFD000002L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C8F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_asOfClause_in_tableSource1511 = new BitSet(new long[]{0x66E0DE8AFD000002L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_tableSource1516 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_tableSource1521 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_asOfClause1584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_KW_SYSTEM_TIME_in_asOfClause1586 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KW_AS_in_asOfClause1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_asOfClause1590 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_asOfClause1594 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_FOR_in_asOfClause1621 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_KW_SYSTEM_VERSION_in_asOfClause1623 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_KW_AS_in_asOfClause1625 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_KW_OF_in_asOfClause1627 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_asOfClause1631 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableName_in_uniqueJoinTableSource1674 = new BitSet(new long[]{0x66E0DE8AFD000002L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0FDBFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableSample_in_uniqueJoinTableSource1678 = new BitSet(new long[]{0x66E0DE8AFD000002L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_uniqueJoinTableSource1682 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_uniqueJoinTableSource1687 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableName1743 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_tableName1745 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_tableName1749 = new BitSet(new long[]{0x0000000000010002L});
    public static final BitSet FOLLOW_DOT_in_tableName1752 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_tableName1756 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_tableName1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_viewName1851 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOT_in_viewName1853 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_viewName1859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_subQuerySource1907 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0010000100000000L,0x0000000000800000L,0x0400000004000000L,0x0000000000000000L,0x0000000040080080L});
    public static final BitSet FOLLOW_queryStatementExpression_in_subQuerySource1909 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_subQuerySource1911 = new BitSet(new long[]{0x66E0DE8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_subQuerySource1913 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_subQuerySource1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionByClause_in_partitioningSpec1957 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0010000000000000L});
    public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1959 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_orderByClause_in_partitioningSpec1978 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_distributeByClause_in_partitioningSpec1993 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_sortByClause_in_partitioningSpec1995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sortByClause_in_partitioningSpec2014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_clusterByClause_in_partitioningSpec2029 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_subQuerySource_in_partitionTableFunctionSource2066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_tableSource_in_partitionTableFunctionSource2073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_partitionedTableFunction_in_partitionTableFunctionSource2080 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_identifier_in_partitionedTableFunction2111 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction2113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000400000000000L});
    public static final BitSet FOLLOW_KW_ON_in_partitionedTableFunction2115 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000043F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_partitionTableFunctionSource_in_partitionedTableFunction2130 = new BitSet(new long[]{0x0000000001000000L,0x0040000000000004L,0x0000000000000000L,0x2010000000000000L,0x0000000000000000L,0x0000000000000400L,0x0000080000000000L});
    public static final BitSet FOLLOW_partitioningSpec_in_partitionedTableFunction2134 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction2156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction2158 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_partitionedTableFunction2160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction2162 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_partitionedTableFunction2166 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_Identifier_in_partitionedTableFunction2168 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_partitionedTableFunction2170 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_partitionedTableFunction2172 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction2174 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_partitionedTableFunction2191 = new BitSet(new long[]{0x66E0DC8AFD000002L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_partitionedTableFunction2204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_WHERE_in_whereClause2267 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_searchCondition_in_whereClause2269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_searchCondition2308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valuesClause_in_valuesSource2332 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_VALUES_in_valuesClause2458 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_valuesTableConstructor_in_valuesClause2460 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2517 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_valuesTableConstructor2520 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2523 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_firstValueRowConstructor_in_valuesTableConstructor2538 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_valuesTableConstructor2541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_valueRowConstructor_in_valuesTableConstructor2544 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_expressionsInParenthesis_in_valueRowConstructor2577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_firstValueRowConstructor2609 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_firstExpressionsWithAlias_in_firstValueRowConstructor2612 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_firstValueRowConstructor2614 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_TABLE_in_virtualTableSource2648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_virtualTableSource2650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_valuesClause_in_virtualTableSource2652 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_virtualTableSource2654 = new BitSet(new long[]{0x66E0DE8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_KW_AS_in_virtualTableSource2656 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_tableAlias_in_virtualTableSource2661 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080040000000L});
    public static final BitSet FOLLOW_LPAREN_in_virtualTableSource2664 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_virtualTableSource2666 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_COMMA_in_virtualTableSource2669 = new BitSet(new long[]{0x66E0DC8AFD000000L,0xB5DEEEBC502A6DBDL,0xDC0ECB08C0F43DCEL,0xDB07156DAF77DD0FL,0x7BE197FFE3975079L,0xBE564EA0F5BFBDBFL,0x0000000003F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_identifier_in_virtualTableSource2671 = new BitSet(new long[]{0x0000000000000200L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_virtualTableSource2677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred1_FromClauseParser429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000100000000L,0x0000000000800000L,0x0400000004000000L,0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_set_in_synpred1_FromClauseParser431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred2_FromClauseParser462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred2_FromClauseParser464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000800000L,0x0400000004000000L,0x0000000000000000L,0x0000000040000080L});
    public static final BitSet FOLLOW_selectStatement_in_synpred2_FromClauseParser466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred2_FromClauseParser468 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0040000000000010L,0x0000000040000000L,0x0000000000000000L,0x0020000000000000L});
    public static final BitSet FOLLOW_setOperator_in_synpred2_FromClauseParser470 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LPAREN_in_synpred3_FromClauseParser492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_valuesSource_in_synpred3_FromClauseParser494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred4_FromClauseParser992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_KW_LATERAL_in_synpred4_FromClauseParser995 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_KW_VIEW_in_synpred4_FromClauseParser997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0080000000000000L});
    public static final BitSet FOLLOW_KW_OUTER_in_synpred4_FromClauseParser999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred5_FromClauseParser1021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COMMA_in_synpred6_FromClauseParser1077 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred8_FromClauseParser2144 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_synpred8_FromClauseParser2146 = new BitSet(new long[]{0x7EEEDD8AFF001000L,0xB7DEEEBE562A6DBDL,0xDCAECF48C3F73FCEL,0xDB0717EDAFF7DD0FL,0x7BE197FFE3D75079L,0xBE56CEB8F5BFBDFFL,0x0003017243F27D73L,0x0000000002000000L,0x0000000000000200L,0x1000000000000010L,0x0000004040000001L,0x0002000000000000L});
    public static final BitSet FOLLOW_expression_in_synpred8_FromClauseParser2148 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_synpred8_FromClauseParser2150 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Identifier_in_synpred10_FromClauseParser2197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_valueRowConstructor_in_synpred11_FromClauseParser2503 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_synpred11_FromClauseParser2506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_valueRowConstructor_in_synpred11_FromClauseParser2509 = new BitSet(new long[]{0x0000000000000202L});

}