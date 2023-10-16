package dev.gruncan.spotify.api.web.requests.me.albums;


import dev.gruncan.http.HttpMethod;
import dev.gruncan.spotify.SpotifyResponse;
import dev.gruncan.spotify.api.web.objects.SpotifySerialize;
import dev.gruncan.spotify.api.SpotifyRequest;
import dev.gruncan.spotify.api.SpotifyRequestContent;
import dev.gruncan.spotify.api.SpotifyRequestField;
import dev.gruncan.spotify.api.SpotifyRequestVariant;
import dev.gruncan.spotify.api.web.requests.util.Scope;
import lombok.Setter;

/**
 * Remove one or more albums from the current user's 'Your Music' library.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/remove-albums-user">Spotify Docs</a>
 *
 * @see SpotifyRequestVariant
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@Setter
@SpotifyRequest(value = "me/albums", authorizations = Scope.USER_LIBRARY_MODIFY, method = HttpMethod.DELETE)
public class MyAlbumsDelete implements SpotifyRequestVariant {


    /**
     * A list of the Spotify IDs for the albums. Maximum: 20 IDs.
     */
    @SpotifyRequestField
    private String[] ids;

    /**
     * A maximum of 50 items can be specified in one request.
     * Note: if the ids parameter is present in the query string, any IDs listed here in the body will be ignored.
     */
    @SpotifyRequestContent("ids")
    private final String[] bodyIds;

    /**
     * Initializes the {@link MyAlbumsDelete} request
     * @param ids The Spotify IDs of the albums.
     */
    public MyAlbumsDelete(String... ids) {
        this.bodyIds = ids;
    }

}
