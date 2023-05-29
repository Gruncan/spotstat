package com.spotify.exceptions;

import com.spotify.requests.SpotifyRequestExecutor;

/**
 * Thrown when a URL for a request is fail to be built.
 *
 * @see SpotifyRequestExecutor
 */
public class SpotifyUrlParserException extends Exception {

    public SpotifyUrlParserException(String reason) {
        super(reason);
    }

}
