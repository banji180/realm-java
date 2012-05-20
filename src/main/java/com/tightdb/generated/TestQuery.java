/* This file was automatically generated by TightDB. */

package com.tightdb.generated;


import com.tightdb.*;
import com.tightdb.lib.*;

/**
 * This class represents a TightDB query and was automatically generated.
 */
public class TestQuery extends AbstractQuery<TestQuery, Test, TestView> {

    public final LongQueryColumn<Test, TestQuery> first;
    public final StringQueryColumn<Test, TestQuery> second;
    public final LongQueryColumn<Test, TestQuery> third;
    public final LongQueryColumn<Test, TestQuery> fourth;

	public TestQuery(TableBase table, TableQuery query) {
		super(TestTable.TYPES, table, query);
        first = new LongQueryColumn<Test, TestQuery>(TestTable.TYPES, table, query, 0, "first");
        second = new StringQueryColumn<Test, TestQuery>(TestTable.TYPES, table, query, 1, "second");
        third = new LongQueryColumn<Test, TestQuery>(TestTable.TYPES, table, query, 2, "third");
        fourth = new LongQueryColumn<Test, TestQuery>(TestTable.TYPES, table, query, 3, "fourth");
	}

}