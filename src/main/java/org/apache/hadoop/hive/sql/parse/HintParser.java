// $ANTLR 3.4 HintParser.g 2024-07-26 12:53:37

package org.apache.hadoop.hive.sql.parse;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hive.conf.HiveConf;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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
public class HintParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AMPERSAND", "BITWISEOR", "BITWISEXOR", "ByteLengthLiteral", "COLON", "COMMA", "CONCATENATE", "CharSetLiteral", "CharSetName", "DIV", "DIVIDE", "DOLLAR", "DOT", "Digit", "EQUAL", "EQUAL_NS", "Exponent", "GREATERTHAN", "GREATERTHANOREQUALTO", "HexDigit", "Identifier", "IntegralLiteral", "KW_ABORT", "KW_ACTIVATE", "KW_ACTIVE", "KW_ADD", "KW_ADMIN", "KW_AFTER", "KW_ALL", "KW_ALLOC_FRACTION", "KW_ALTER", "KW_ANALYZE", "KW_AND", "KW_ANY", "KW_APPLICATION", "KW_ARCHIVE", "KW_ARRAY", "KW_AS", "KW_ASC", "KW_AST", "KW_AT", "KW_AUTHORIZATION", "KW_AUTOCOMMIT", "KW_BEFORE", "KW_BETWEEN", "KW_BIGINT", "KW_BINARY", "KW_BOOLEAN", "KW_BOTH", "KW_BRANCH", "KW_BUCKET", "KW_BUCKETS", "KW_BY", "KW_CACHE", "KW_CASCADE", "KW_CASE", "KW_CAST", "KW_CBO", "KW_CHANGE", "KW_CHAR", "KW_CHECK", "KW_CHERRY_PICK", "KW_CLUSTER", "KW_CLUSTERED", "KW_CLUSTERSTATUS", "KW_COLLECTION", "KW_COLUMN", "KW_COLUMNS", "KW_COMMENT", "KW_COMMIT", "KW_COMPACT", "KW_COMPACTIONS", "KW_COMPACT_ID", "KW_COMPUTE", "KW_CONCATENATE", "KW_CONF", "KW_CONSTRAINT", "KW_CONTINUE", "KW_CONVERT", "KW_COST", "KW_CREATE", "KW_CRON", "KW_CROSS", "KW_CUBE", "KW_CURRENT", "KW_CURRENT_DATE", "KW_CURRENT_TIMESTAMP", "KW_CURSOR", "KW_DATA", "KW_DATABASE", "KW_DATABASES", "KW_DATACONNECTOR", "KW_DATACONNECTORS", "KW_DATE", "KW_DATETIME", "KW_DAY", "KW_DBPROPERTIES", "KW_DCPROPERTIES", "KW_DDL", "KW_DEBUG", "KW_DECIMAL", "KW_DEFAULT", "KW_DEFERRED", "KW_DEFINED", "KW_DELETE", "KW_DELIMITED", "KW_DEPENDENCY", "KW_DESC", "KW_DESCRIBE", "KW_DETAIL", "KW_DIRECTORIES", "KW_DIRECTORY", "KW_DISABLE", "KW_DISTINCT", "KW_DISTRIBUTE", "KW_DISTRIBUTED", "KW_DO", "KW_DOUBLE", "KW_DOW", "KW_DROP", "KW_DUMP", "KW_ELEM_TYPE", "KW_ELSE", "KW_ENABLE", "KW_END", "KW_ENFORCED", "KW_ESCAPED", "KW_EVERY", "KW_EXCEPT", "KW_EXCHANGE", "KW_EXCLUSIVE", "KW_EXECUTE", "KW_EXECUTED", "KW_EXISTS", "KW_EXPIRE_SNAPSHOTS", "KW_EXPLAIN", "KW_EXPORT", "KW_EXPRESSION", "KW_EXTENDED", "KW_EXTERNAL", "KW_EXTRACT", "KW_FALSE", "KW_FAST_FORWARD", "KW_FETCH", "KW_FIELDS", "KW_FILE", "KW_FILEFORMAT", "KW_FIRST", "KW_FLOAT", "KW_FLOOR", "KW_FOLLOWING", "KW_FOR", "KW_FORCE", "KW_FOREIGN", "KW_FORMAT", "KW_FORMATTED", "KW_FROM", "KW_FULL", "KW_FUNCTION", "KW_FUNCTIONS", "KW_GRANT", "KW_GROUP", "KW_GROUPING", "KW_HAVING", "KW_HOUR", "KW_IDXPROPERTIES", "KW_IF", "KW_IGNORE", "KW_IMPORT", "KW_IN", "KW_INDEX", "KW_INDEXES", "KW_INNER", "KW_INPATH", "KW_INPUTDRIVER", "KW_INPUTFORMAT", "KW_INSERT", "KW_INT", "KW_INTERSECT", "KW_INTERVAL", "KW_INTO", "KW_IS", "KW_ISOLATION", "KW_ITEMS", "KW_JAR", "KW_JOIN", "KW_JOINCOST", "KW_KEY", "KW_KEYS", "KW_KEY_TYPE", "KW_KILL", "KW_LAST", "KW_LATERAL", "KW_LEADING", "KW_LEFT", "KW_LESS", "KW_LEVEL", "KW_LIKE", "KW_LIMIT", "KW_LINES", "KW_LOAD", "KW_LOCAL", "KW_LOCATION", "KW_LOCK", "KW_LOCKS", "KW_LOGICAL", "KW_LONG", "KW_MACRO", "KW_MANAGED", "KW_MANAGEDLOCATION", "KW_MANAGEMENT", "KW_MAP", "KW_MAPJOIN", "KW_MAPPING", "KW_MATCHED", "KW_MATERIALIZED", "KW_MERGE", "KW_METADATA", "KW_MINUS", "KW_MINUTE", "KW_MONTH", "KW_MORE", "KW_MOVE", "KW_MSCK", "KW_NONE", "KW_NORELY", "KW_NOSCAN", "KW_NOT", "KW_NOVALIDATE", "KW_NULL", "KW_NULLS", "KW_OF", "KW_OFFSET", "KW_OLDER", "KW_ON", "KW_ONLY", "KW_OPERATOR", "KW_OPTIMIZE", "KW_OPTION", "KW_OR", "KW_ORDER", "KW_ORPHAN_FILES", "KW_OUT", "KW_OUTER", "KW_OUTPUTDRIVER", "KW_OUTPUTFORMAT", "KW_OVER", "KW_OVERWRITE", "KW_OWNER", "KW_PARTITION", "KW_PARTITIONED", "KW_PARTITIONS", "KW_PATH", "KW_PERCENT", "KW_PKFK_JOIN", "KW_PLAN", "KW_PLANS", "KW_PLUS", "KW_POOL", "KW_PRECEDING", "KW_PRECISION", "KW_PREPARE", "KW_PRESERVE", "KW_PRIMARY", "KW_PRINCIPALS", "KW_PROCEDURE", "KW_PURGE", "KW_QUALIFY", "KW_QUARTER", "KW_QUERY", "KW_QUERY_PARALLELISM", "KW_RANGE", "KW_READ", "KW_READS", "KW_REAL", "KW_REBUILD", "KW_RECORDREADER", "KW_RECORDWRITER", "KW_REDUCE", "KW_REFERENCES", "KW_REGEXP", "KW_RELOAD", "KW_RELY", "KW_REMOTE", "KW_RENAME", "KW_REOPTIMIZATION", "KW_REPAIR", "KW_REPL", "KW_REPLACE", "KW_REPLICATION", "KW_RESOURCE", "KW_RESPECT", "KW_RESTRICT", "KW_RETAIN", "KW_RETENTION", "KW_REVOKE", "KW_REWRITE", "KW_RIGHT", "KW_RLIKE", "KW_ROLE", "KW_ROLES", "KW_ROLLBACK", "KW_ROLLUP", "KW_ROW", "KW_ROWS", "KW_SCHEDULED", "KW_SCHEDULING_POLICY", "KW_SCHEMA", "KW_SCHEMAS", "KW_SECOND", "KW_SELECT", "KW_SEMI", "KW_SERDE", "KW_SERDEPROPERTIES", "KW_SERVER", "KW_SET", "KW_SETS", "KW_SET_CURRENT_SNAPSHOT", "KW_SHARED", "KW_SHOW", "KW_SHOW_DATABASE", "KW_SKEWED", "KW_SMALLINT", "KW_SNAPSHOT", "KW_SNAPSHOTS", "KW_SOME", "KW_SORT", "KW_SORTED", "KW_SPEC", "KW_SSL", "KW_START", "KW_STATISTICS", "KW_STATUS", "KW_STORED", "KW_STREAMTABLE", "KW_STRING", "KW_STRUCT", "KW_SUMMARY", "KW_SYNC", "KW_SYSTEM_TIME", "KW_SYSTEM_VERSION", "KW_TABLE", "KW_TABLES", "KW_TABLESAMPLE", "KW_TAG", "KW_TBLPROPERTIES", "KW_TEMPORARY", "KW_TERMINATED", "KW_THAN", "KW_THEN", "KW_TIME", "KW_TIMESTAMP", "KW_TIMESTAMPLOCALTZ", "KW_TINYINT", "KW_TO", "KW_TOUCH", "KW_TRAILING", "KW_TRANSACTION", "KW_TRANSACTIONAL", "KW_TRANSACTIONS", "KW_TRANSFORM", "KW_TRIGGER", "KW_TRIM", "KW_TRUE", "KW_TRUNCATE", "KW_TYPE", "KW_UNARCHIVE", "KW_UNBOUNDED", "KW_UNDO", "KW_UNION", "KW_UNIONTYPE", "KW_UNIQUE", "KW_UNIQUEJOIN", "KW_UNKNOWN", "KW_UNLOCK", "KW_UNMANAGED", "KW_UNSET", "KW_UNSIGNED", "KW_UPDATE", "KW_URI", "KW_URL", "KW_USE", "KW_USER", "KW_USING", "KW_UTC", "KW_UTCTIMESTAMP", "KW_VALIDATE", "KW_VALUES", "KW_VALUE_TYPE", "KW_VARCHAR", "KW_VECTORIZATION", "KW_VIEW", "KW_VIEWS", "KW_WAIT", "KW_WEEK", "KW_WHEN", "KW_WHERE", "KW_WHILE", "KW_WINDOW", "KW_WITH", "KW_WITHIN", "KW_WORK", "KW_WORKLOAD", "KW_WRITE", "KW_YEAR", "KW_ZONE", "LCURLY", "LESSTHAN", "LESSTHANOREQUALTO", "LINE_COMMENT", "LPAREN", "LSQUARE", "Letter", "MINUS", "MOD", "NOTEQUAL", "Number", "NumberLiteral", "PLUS", "QUERY_HINT", "QUESTION", "QuotedIdentifier", "RCURLY", "RPAREN", "RSQUARE", "RegexComponent", "SEMICOLON", "STAR", "StringLiteral", "TILDE", "Tokens", "WS", "TOK_HINT", "TOK_HINTARGLIST", "TOK_HINTLIST", "TOK_LEFTANTISEMIJOIN", "TOK_LEFTSEMIJOIN", "TOK_MAPJOIN", "TOK_PKFK_JOIN", "TOK_STREAMTABLE"
    };

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
    public static final int Tokens=434;
    public static final int WS=435;
    public static final int TOK_HINT=436;
    public static final int TOK_HINTARGLIST=437;
    public static final int TOK_HINTLIST=438;
    public static final int TOK_LEFTANTISEMIJOIN=439;
    public static final int TOK_LEFTSEMIJOIN=440;
    public static final int TOK_MAPJOIN=441;
    public static final int TOK_PKFK_JOIN=442;
    public static final int TOK_STREAMTABLE=443;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public HintParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public HintParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return HintParser.tokenNames; }
    public String getGrammarFileName() { return "HintParser.g"; }


      ArrayList<ParseError> errors = new ArrayList<ParseError>();

      @Override
      public void displayRecognitionError(String[] tokenNames,
                                          RecognitionException e) {
        errors.add(new ParseError(this, e, tokenNames));
      }


    public static class hint_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hint"
    // HintParser.g:58:1: hint : hintList EOF -> ^( TOK_HINTLIST hintList ) ;
    public final HintParser.hint_return hint() throws RecognitionException {
        HintParser.hint_return retval = new HintParser.hint_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token EOF2=null;
        HintParser.hintList_return hintList1 =null;


        ASTNode EOF2_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_hintList=new RewriteRuleSubtreeStream(adaptor,"rule hintList");
        try {
            // HintParser.g:59:5: ( hintList EOF -> ^( TOK_HINTLIST hintList ) )
            // HintParser.g:59:7: hintList EOF
            {
            pushFollow(FOLLOW_hintList_in_hint117);
            hintList1=hintList();

            state._fsp--;

            stream_hintList.add(hintList1.getTree());

            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_hint119);  
            stream_EOF.add(EOF2);


            // AST REWRITE
            // elements: hintList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 59:20: -> ^( TOK_HINTLIST hintList )
            {
                // HintParser.g:59:23: ^( TOK_HINTLIST hintList )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_HINTLIST, "TOK_HINTLIST")
                , root_1);

                adaptor.addChild(root_1, stream_hintList.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ASTNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hint"


    public static class hintList_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintList"
    // HintParser.g:62:1: hintList : hintItem ( COMMA hintItem )* -> ( hintItem )+ ;
    public final HintParser.hintList_return hintList() throws RecognitionException {
        HintParser.hintList_return retval = new HintParser.hintList_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA4=null;
        HintParser.hintItem_return hintItem3 =null;

        HintParser.hintItem_return hintItem5 =null;


        ASTNode COMMA4_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintItem=new RewriteRuleSubtreeStream(adaptor,"rule hintItem");
        try {
            // HintParser.g:63:5: ( hintItem ( COMMA hintItem )* -> ( hintItem )+ )
            // HintParser.g:64:5: hintItem ( COMMA hintItem )*
            {
            pushFollow(FOLLOW_hintItem_in_hintList148);
            hintItem3=hintItem();

            state._fsp--;

            stream_hintItem.add(hintItem3.getTree());

            // HintParser.g:64:14: ( COMMA hintItem )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==COMMA) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // HintParser.g:64:15: COMMA hintItem
            	    {
            	    COMMA4=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintList151);  
            	    stream_COMMA.add(COMMA4);


            	    pushFollow(FOLLOW_hintItem_in_hintList153);
            	    hintItem5=hintItem();

            	    state._fsp--;

            	    stream_hintItem.add(hintItem5.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: hintItem
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 64:32: -> ( hintItem )+
            {
                if ( !(stream_hintItem.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintItem.hasNext() ) {
                    adaptor.addChild(root_0, stream_hintItem.nextTree());

                }
                stream_hintItem.reset();

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ASTNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintList"


    public static class hintItem_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintItem"
    // HintParser.g:67:1: hintItem : hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) ;
    public final HintParser.hintItem_return hintItem() throws RecognitionException {
        HintParser.hintItem_return retval = new HintParser.hintItem_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token LPAREN7=null;
        Token RPAREN9=null;
        HintParser.hintName_return hintName6 =null;

        HintParser.hintArgs_return hintArgs8 =null;


        ASTNode LPAREN7_tree=null;
        ASTNode RPAREN9_tree=null;
        RewriteRuleTokenStream stream_LPAREN=new RewriteRuleTokenStream(adaptor,"token LPAREN");
        RewriteRuleTokenStream stream_RPAREN=new RewriteRuleTokenStream(adaptor,"token RPAREN");
        RewriteRuleSubtreeStream stream_hintName=new RewriteRuleSubtreeStream(adaptor,"rule hintName");
        RewriteRuleSubtreeStream stream_hintArgs=new RewriteRuleSubtreeStream(adaptor,"rule hintArgs");
        try {
            // HintParser.g:68:5: ( hintName ( LPAREN hintArgs RPAREN )? -> ^( TOK_HINT hintName ( hintArgs )? ) )
            // HintParser.g:69:5: hintName ( LPAREN hintArgs RPAREN )?
            {
            pushFollow(FOLLOW_hintName_in_hintItem181);
            hintName6=hintName();

            state._fsp--;

            stream_hintName.add(hintName6.getTree());

            // HintParser.g:69:14: ( LPAREN hintArgs RPAREN )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==LPAREN) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // HintParser.g:69:15: LPAREN hintArgs RPAREN
                    {
                    LPAREN7=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_hintItem184);  
                    stream_LPAREN.add(LPAREN7);


                    pushFollow(FOLLOW_hintArgs_in_hintItem186);
                    hintArgs8=hintArgs();

                    state._fsp--;

                    stream_hintArgs.add(hintArgs8.getTree());

                    RPAREN9=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_hintItem188);  
                    stream_RPAREN.add(RPAREN9);


                    }
                    break;

            }


            // AST REWRITE
            // elements: hintArgs, hintName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 69:40: -> ^( TOK_HINT hintName ( hintArgs )? )
            {
                // HintParser.g:69:43: ^( TOK_HINT hintName ( hintArgs )? )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_HINT, "TOK_HINT")
                , root_1);

                adaptor.addChild(root_1, stream_hintName.nextTree());

                // HintParser.g:69:63: ( hintArgs )?
                if ( stream_hintArgs.hasNext() ) {
                    adaptor.addChild(root_1, stream_hintArgs.nextTree());

                }
                stream_hintArgs.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ASTNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintItem"


    public static class hintName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintName"
    // HintParser.g:72:1: hintName : ( KW_MAPJOIN -> TOK_MAPJOIN | KW_SEMI -> TOK_LEFTSEMIJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_PKFK_JOIN -> TOK_PKFK_JOIN );
    public final HintParser.hintName_return hintName() throws RecognitionException {
        HintParser.hintName_return retval = new HintParser.hintName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token KW_MAPJOIN10=null;
        Token KW_SEMI11=null;
        Token KW_STREAMTABLE12=null;
        Token KW_PKFK_JOIN13=null;

        ASTNode KW_MAPJOIN10_tree=null;
        ASTNode KW_SEMI11_tree=null;
        ASTNode KW_STREAMTABLE12_tree=null;
        ASTNode KW_PKFK_JOIN13_tree=null;
        RewriteRuleTokenStream stream_KW_MAPJOIN=new RewriteRuleTokenStream(adaptor,"token KW_MAPJOIN");
        RewriteRuleTokenStream stream_KW_STREAMTABLE=new RewriteRuleTokenStream(adaptor,"token KW_STREAMTABLE");
        RewriteRuleTokenStream stream_KW_SEMI=new RewriteRuleTokenStream(adaptor,"token KW_SEMI");
        RewriteRuleTokenStream stream_KW_PKFK_JOIN=new RewriteRuleTokenStream(adaptor,"token KW_PKFK_JOIN");

        try {
            // HintParser.g:73:5: ( KW_MAPJOIN -> TOK_MAPJOIN | KW_SEMI -> TOK_LEFTSEMIJOIN | KW_STREAMTABLE -> TOK_STREAMTABLE | KW_PKFK_JOIN -> TOK_PKFK_JOIN )
            int alt3=4;
            switch ( input.LA(1) ) {
            case KW_MAPJOIN:
                {
                alt3=1;
                }
                break;
            case KW_SEMI:
                {
                alt3=2;
                }
                break;
            case KW_STREAMTABLE:
                {
                alt3=3;
                }
                break;
            case KW_PKFK_JOIN:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }

            switch (alt3) {
                case 1 :
                    // HintParser.g:74:5: KW_MAPJOIN
                    {
                    KW_MAPJOIN10=(Token)match(input,KW_MAPJOIN,FOLLOW_KW_MAPJOIN_in_hintName222);  
                    stream_KW_MAPJOIN.add(KW_MAPJOIN10);


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
                    // 74:16: -> TOK_MAPJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_MAPJOIN, "TOK_MAPJOIN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // HintParser.g:75:7: KW_SEMI
                    {
                    KW_SEMI11=(Token)match(input,KW_SEMI,FOLLOW_KW_SEMI_in_hintName234);  
                    stream_KW_SEMI.add(KW_SEMI11);


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
                    // 75:15: -> TOK_LEFTSEMIJOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_LEFTSEMIJOIN, "TOK_LEFTSEMIJOIN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // HintParser.g:76:7: KW_STREAMTABLE
                    {
                    KW_STREAMTABLE12=(Token)match(input,KW_STREAMTABLE,FOLLOW_KW_STREAMTABLE_in_hintName246);  
                    stream_KW_STREAMTABLE.add(KW_STREAMTABLE12);


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
                    // 76:22: -> TOK_STREAMTABLE
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_STREAMTABLE, "TOK_STREAMTABLE")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // HintParser.g:77:7: KW_PKFK_JOIN
                    {
                    KW_PKFK_JOIN13=(Token)match(input,KW_PKFK_JOIN,FOLLOW_KW_PKFK_JOIN_in_hintName258);  
                    stream_KW_PKFK_JOIN.add(KW_PKFK_JOIN13);


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
                    // 77:20: -> TOK_PKFK_JOIN
                    {
                        adaptor.addChild(root_0, 
                        (ASTNode)adaptor.create(TOK_PKFK_JOIN, "TOK_PKFK_JOIN")
                        );

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ASTNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintName"


    public static class hintArgs_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintArgs"
    // HintParser.g:80:1: hintArgs : hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) ;
    public final HintParser.hintArgs_return hintArgs() throws RecognitionException {
        HintParser.hintArgs_return retval = new HintParser.hintArgs_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token COMMA15=null;
        HintParser.hintArgName_return hintArgName14 =null;

        HintParser.hintArgName_return hintArgName16 =null;


        ASTNode COMMA15_tree=null;
        RewriteRuleTokenStream stream_COMMA=new RewriteRuleTokenStream(adaptor,"token COMMA");
        RewriteRuleSubtreeStream stream_hintArgName=new RewriteRuleSubtreeStream(adaptor,"rule hintArgName");
        try {
            // HintParser.g:81:5: ( hintArgName ( COMMA hintArgName )* -> ^( TOK_HINTARGLIST ( hintArgName )+ ) )
            // HintParser.g:82:5: hintArgName ( COMMA hintArgName )*
            {
            pushFollow(FOLLOW_hintArgName_in_hintArgs283);
            hintArgName14=hintArgName();

            state._fsp--;

            stream_hintArgName.add(hintArgName14.getTree());

            // HintParser.g:82:17: ( COMMA hintArgName )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==COMMA) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // HintParser.g:82:18: COMMA hintArgName
            	    {
            	    COMMA15=(Token)match(input,COMMA,FOLLOW_COMMA_in_hintArgs286);  
            	    stream_COMMA.add(COMMA15);


            	    pushFollow(FOLLOW_hintArgName_in_hintArgs288);
            	    hintArgName16=hintArgName();

            	    state._fsp--;

            	    stream_hintArgName.add(hintArgName16.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            // AST REWRITE
            // elements: hintArgName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (ASTNode)adaptor.nil();
            // 82:38: -> ^( TOK_HINTARGLIST ( hintArgName )+ )
            {
                // HintParser.g:82:41: ^( TOK_HINTARGLIST ( hintArgName )+ )
                {
                ASTNode root_1 = (ASTNode)adaptor.nil();
                root_1 = (ASTNode)adaptor.becomeRoot(
                (ASTNode)adaptor.create(TOK_HINTARGLIST, "TOK_HINTARGLIST")
                , root_1);

                if ( !(stream_hintArgName.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_hintArgName.hasNext() ) {
                    adaptor.addChild(root_1, stream_hintArgName.nextTree());

                }
                stream_hintArgName.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (ASTNode)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ASTNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintArgs"


    public static class hintArgName_return extends ParserRuleReturnScope {
        ASTNode tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "hintArgName"
    // HintParser.g:85:1: hintArgName : ( Identifier | Number | KW_NONE );
    public final HintParser.hintArgName_return hintArgName() throws RecognitionException {
        HintParser.hintArgName_return retval = new HintParser.hintArgName_return();
        retval.start = input.LT(1);


        ASTNode root_0 = null;

        Token set17=null;

        ASTNode set17_tree=null;

        try {
            // HintParser.g:86:5: ( Identifier | Number | KW_NONE )
            // HintParser.g:
            {
            root_0 = (ASTNode)adaptor.nil();


            set17=(Token)input.LT(1);

            if ( input.LA(1)==Identifier||input.LA(1)==KW_NONE||input.LA(1)==Number ) {
                input.consume();
                adaptor.addChild(root_0, 
                (ASTNode)adaptor.create(set17)
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (ASTNode)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "hintArgName"

    // Delegated rules


 

    public static final BitSet FOLLOW_hintList_in_hint117 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_hint119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintItem_in_hintList148 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_hintList151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000001000000L,0x0800000000000004L,0x0000000000040000L});
    public static final BitSet FOLLOW_hintItem_in_hintList153 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_hintName_in_hintItem181 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000040000000L});
    public static final BitSet FOLLOW_LPAREN_in_hintItem184 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_hintArgs_in_hintItem186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000000000000000L,0x0000080000000000L});
    public static final BitSet FOLLOW_RPAREN_in_hintItem188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_MAPJOIN_in_hintName222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_SEMI_in_hintName234 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_STREAMTABLE_in_hintName246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_KW_PKFK_JOIN_in_hintName258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs283 = new BitSet(new long[]{0x0000000000000202L});
    public static final BitSet FOLLOW_COMMA_in_hintArgs286 = new BitSet(new long[]{0x0000000001000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L,0x0000000000000000L,0x0000000000000000L,0x0000001000000000L});
    public static final BitSet FOLLOW_hintArgName_in_hintArgs288 = new BitSet(new long[]{0x0000000000000202L});

}