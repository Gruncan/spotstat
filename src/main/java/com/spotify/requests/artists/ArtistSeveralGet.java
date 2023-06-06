package com.spotify.requests.artists;

import com.spotify.SpotifyResponse;
import com.spotify.objects.SpotifySerialize;
import com.spotify.objects.artists.Artist;
import com.spotify.requests.SpotifyRequest;
import com.spotify.requests.SpotifyRequestField;
import com.spotify.requests.SpotifyRequestVariant;
import lombok.Setter;

/**
 * Get Spotify catalog information for several artists based on their Spotify IDs.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/get-multiple-artists">Spotify Docs</a>
 * <p>Serializes into {@link Artist} array</p>
 *
 * @see Artist
 * @see SpotifyRequestVariant
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@Setter
@SpotifyRequest("artists")
@SpotifySerialize(value = Artist.class, isArray = true)
public class ArtistSeveralGet implements SpotifyRequestVariant {

    /**
     * A list of the Spotify IDs for the albums. Maximum: 20 IDs.
     */
    @SpotifyRequestField
    private final String[] ids;

    /**
     * Initializes the {@link ArtistSeveralGet} request
     * @param ids A list of the Spotify IDs for the artists. Maximum: 20 IDs.
     */
    public ArtistSeveralGet(String... ids) {
        this.ids = ids;
    }

}
