package com.spotify.requests;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Indicates the request url for which the specific request is going to execute. <br>
 * 'final' indicating directly after the base url for the request
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface SpotifyRequest {

    /**
     * The value of the 'final' url to execute the request on
     * @return The 'final' url
     */
    String value();

    /**
     * The end part of the complete url, added to the end after {@link SpotifySubRequest} class fields are evaluated
     * @return The end part of the complete url, {@code default} is empty string
     */
    String end() default "";

}
