package com.spotify.requests.playlists;

import com.spotify.SpotifyResponse;
import com.spotify.objects.SpotifySerialize;
import com.spotify.objects.wrappers.SpotifyImage;
import com.spotify.requests.AbstractRequest;
import com.spotify.requests.SpotifyRequest;
import com.spotify.requests.SpotifySubRequest;

/**
 * Get the current image associated with a specific playlist.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/get-playlist-cover">Spotify Docs</a>
 * <p>Serializes into {@link SpotifyImage}</p>
 *
 * @see SpotifyImage
 * @see AbstractRequest
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@SpotifySerialize(value = SpotifyImage.class, isArray = true)
@SpotifyRequest(value = "playlists", end = "images")
public class PlaylistImageGet extends AbstractRequest {

    /**
     * The Spotify ID of the playlist.
     */
    @SpotifySubRequest
    private final String id;

    /**
     * Initializes the {@link PlaylistImageGet} request
     * @param id The Spotify ID of the playlist.
     */
    public PlaylistImageGet(String id) {
        this.id = id;
    }
}
