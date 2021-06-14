package com.spring.puzzle.others.transaction.example4;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

public class MyDataSource extends AbstractRoutingDataSource {
    private static final ThreadLocal<String> key = new ThreadLocal<String>();

    @Override
    protected Object determineCurrentLookupKey() {
        return key.get();
    }

    public static void setDataSource(String dataSource) {
        key.set(dataSource);
    }

    public static String getDatasource() {
        return key.get();
    }

    public static void clearDataSource() {
        key.remove();
    }
}
