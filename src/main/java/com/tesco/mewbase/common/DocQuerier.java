package com.tesco.mewbase.common;

import com.tesco.mewbase.bson.BsonObject;
import com.tesco.mewbase.client.QueryResult;

import java.util.concurrent.CompletableFuture;

/**
 * Created by tim on 23/09/16.
 */
public interface DocQuerier {

    // TODO use RxJava for this too

    CompletableFuture<BsonObject> findByID(String binderName, String id);

    CompletableFuture<QueryResult> findMatching(String binderName, BsonObject matcher);

}
