package com.spotify.requests.genres;

import com.spotify.SpotifyResponse;
import com.spotify.objects.SpotifySerialize;
import com.spotify.objects.albums.Album;
import com.spotify.requests.AbstractRequest;
import com.spotify.requests.SpotifyRequest;

/**
 * Retrieve a list of available genres seed parameter values for recommendations.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/get-recommendation-genres">Spotify Docs</a>
 * <p>Serializes into {@link String} array</p>
 *
 * @see AbstractRequest
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@SpotifyRequest("recommendations/available-genre-seeds")
//@SpotifySerialize(value = String.class, isArray = true)
public class GenreAvailableGet extends AbstractRequest {

}
