package com.spotify.requests.playlists;

import com.spotify.objects.search.items.SearchItemsPlaylists;
import com.spotify.SpotifyResponse;
import com.spotify.objects.SpotifySerialize;
import com.spotify.objects.albums.Album;
import com.spotify.objects.wrappers.Country;
import com.spotify.requests.AbstractRequest;
import com.spotify.requests.SpotifyRequest;
import com.spotify.requests.SpotifyRequestField;
import com.spotify.requests.SpotifySubRequest;
import com.spotify.requests.albums.AlbumGet;
import lombok.Setter;

/**
 * Get a list of Spotify playlists tagged with a particular category.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/get-a-categories-playlists">Spotify Docs</a>
 * <p>Serializes into {@link ?}</p>
 *
 * @see ?
 * @see AbstractRequest
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@Setter
@SpotifyRequest(value = "browse/categories", end = "playlist")
public class CategoriesPlaylistsGet extends AbstractRequest {

    /**
     * The Spotify category ID for the category.
     */
    @SpotifySubRequest
    private final String id;

    /**
     * A country: an ISO 3166-1 alpha-2 country code. Provide this parameter to ensure that the category exists for a particular country.
     */
    @SpotifyRequestField
    private Country country;

    /**
     * The maximum number of items to return. Default: 20. Minimum: 1. Maximum: 50.
     */
    @SpotifyRequestField
    private int limit;

    /**
     * The index of the first item to return. Default: 0 (the first item). Use with limit to get the next set of items.
     */
    @SpotifyRequestField
    private int offset;

    /**
     * Initializes the {@link CategoriesPlaylistsGet} request
     * @param id The Spotify category ID for the category.
     */
    public CategoriesPlaylistsGet(String id) {
        this.id = id;
    }

}
