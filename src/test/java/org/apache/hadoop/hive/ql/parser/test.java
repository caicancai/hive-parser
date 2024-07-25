package org.apache.hadoop.hive.ql.parser;

import org.apache.hadoop.hive.ql.parse.ParseDriver;
import org.apache.hadoop.hive.ql.parse.ParseException;

public class test {

    static ParseDriver parseDriver = new ParseDriver();

    public static void main(String[] args) throws ParseException {
        // this test method is here to do an initial call to parsedriver; and prevent any tests with timeouts to be the first.
        parseDriver.parse("select * from abs.a ---t1").getTables();
        System.out.println(parseDriver.parse("select * from abs.a").getTables());

    }
}
