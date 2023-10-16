package dev.gruncan.spotify.api.web.requests.me.audiobooks;

import dev.gruncan.http.HttpMethod;
import dev.gruncan.spotify.SpotifyResponse;
import dev.gruncan.spotify.api.web.objects.SpotifySerialize;
import dev.gruncan.spotify.api.SpotifyRequest;
import dev.gruncan.spotify.api.SpotifyRequestField;
import dev.gruncan.spotify.api.SpotifyRequestVariant;
import dev.gruncan.spotify.api.web.requests.util.Scope;

/**
 * Remove one or more audiobooks from the Spotify user's library.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/remove-audiobooks-user">Spotify Docs</a>
 *
 * @see SpotifyRequestVariant
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@SpotifyRequest(value = "me/audiobooks", authorizations = Scope.USER_LIBRARY_MODIFY, method = HttpMethod.DELETE)
public class MyAudiobooksDelete implements SpotifyRequestVariant {

    /**
     * A list of the Spotify IDs.
     */
    @SpotifyRequestField
    private final String[] ids;

    /**
     * Initializes the {@link MyAudiobooksDelete} request
     *
     * @param ids The Spotify IDS of the audiobooks.
     */
    public MyAudiobooksDelete(String... ids) {
        this.ids = ids;
    }
}
