package com.spotify.requests.shows;

import com.spotify.SpotifyResponse;
import com.spotify.objects.SpotifySerialize;
import com.spotify.objects.shows.SimplifiedShow;
import com.spotify.objects.wrappers.Country;
import com.spotify.requests.SpotifyRequest;
import com.spotify.requests.SpotifyRequestField;
import com.spotify.requests.SpotifyRequestVariant;
import lombok.Setter;

/**
 * Get Spotify catalog information for several shows based on their Spotify IDs.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/get-multiple-shows">Spotify Docs</a>
 * <p>Serializes into {@link SimplifiedShow}</p>
 *
 * @see SimplifiedShow
 * @see SpotifyRequestVariant
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@Setter
@SpotifyRequest("shows")
@SpotifySerialize(value = SimplifiedShow.class, isArray = true)
public class ShowSeveralGet implements SpotifyRequestVariant {


    /**
     * A list of the Spotify IDs for the shows. Maximum: 50 IDs.
     */
    @SpotifyRequestField
    private final String[] ids;

    /**
     * An ISO 3166-1 alpha-2 country code. If a country code is specified, only content that is available in that market will be returned.
     */
    @SpotifyRequestField
    private Country market;

    /**
     * Initializes the {@link ShowSeveralGet} request
     * @param ids A list of the Spotify IDs for the shows. Maximum: 50 IDs.
     */
    public ShowSeveralGet(String... ids) {
        this.ids = ids;
    }

}
