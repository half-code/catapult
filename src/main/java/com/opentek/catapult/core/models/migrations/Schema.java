package com.opentek.catapult.core.models.migrations;

import com.opentek.catapult.core.exceptions.InvalidSchemaException;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 *
 * Schema methods For DDL
 *  create
 *  rename
 *  drop
 *  dropIfExists
 *  alter
 *  hasTable
 *  table - to modify the table schema
 */
public class Schema {
    /**
     * Creates a table if is not exists in the database.
     * @param tableName - name of the table to be created
     * @param callback - a callback which will give the call to the get method.
     */
    public void create(String tableName, Future<BluePrint> callback) throws InvalidSchemaException, ExecutionException, InterruptedException {
        if(tableName == null || tableName.equals("")){
            throw new InvalidSchemaException("Table name not valid");
        }
        BluePrint bluePrint = callback.get();
        String query = "CREATE TABLE IF NOT EXISTS " + tableName + "(";
    }
}
