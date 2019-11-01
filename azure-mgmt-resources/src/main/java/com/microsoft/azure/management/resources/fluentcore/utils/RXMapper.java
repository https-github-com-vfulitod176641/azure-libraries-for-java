/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.utils;

import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;
import reactor.core.scheduler.Schedulers;

import java.util.function.Function;

/**
 * An internal utility class representing an RX function returning the provided type instance
 * from a call with an arbitrary parameter.
 * @param <T> the type to emit as Observable
 */
public final class RXMapper<T> implements Function<Object, T> {
    private final T value;

    /**
     * Shortcut for mapping the output of an arbitrary observable to one returning an instance of a specific type, using the IO scheduler.
     * @param fromObservable the source observable
     * @param toValue the value to emit to the observer
     * @param <T> the type of the value to emit
     * @return an observable emitting the specified value
     */
    public static <T> Mono<T> map(Mono<?> fromObservable, final T toValue) {
        if (fromObservable != null) {
            return fromObservable.subscribeOn(Schedulers.boundedElastic())
                    .map(new RXMapper<T>(toValue));
        } else {
            return Mono.empty();
        }
    }

    /**
     * Shortcut for mapping an arbitrary observable to void, using the IO scheduler.
     * @param fromObservable the source observable
     * @return a void-emitting observable
     */
    public static Mono<Void> mapToVoid(Mono<?> fromObservable) {
        if (fromObservable != null) {
            return fromObservable.subscribeOn(Schedulers.boundedElastic())
                    .map(new RXMapper<Void>());
        } else {
            return Mono.empty();
        }
    }

    /**
     * @param value the value to emit
     */
    private RXMapper(T value) {
        this.value = value;
    }

    /**
     * Void emitting mapper.
     */
    private RXMapper() {
        this.value = null;
    }

    @Override
    public T apply(Object t) {
        return this.value;
    }
}
