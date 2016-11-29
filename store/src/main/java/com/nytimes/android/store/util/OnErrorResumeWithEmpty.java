package com.nytimes.android.store.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import rx.Observable;
import rx.functions.Func1;

/**
 * Resume with empty observable on error
 */
public class OnErrorResumeWithEmpty<Parsed> implements Func1<Throwable, Observable<? extends Parsed>> {
    private static final Logger LOGGER = LoggerFactory.getLogger(OnErrorResumeWithEmpty.class);

    @Override
    public Observable<? extends Parsed> call(Throwable throwable) {
        LOGGER.error("Error occured, returning empty Observable", throwable);
        return Observable.empty();
    }
}
