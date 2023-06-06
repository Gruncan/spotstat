package com.spotify.requests.me;

import com.http.HttpMethod;
import com.spotify.SpotifyResponse;
import com.spotify.objects.SpotifySerialize;
import com.spotify.requests.SpotifyRequest;
import com.spotify.requests.SpotifyRequestContent;
import com.spotify.requests.SpotifyRequestField;
import com.spotify.requests.SpotifyRequestVariant;
import com.spotify.requests.util.Scope;
import lombok.Setter;


/**
 * Remove the current user as a follower of one or more artists or other Spotify users.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/unfollow-artists-users">Spotify Docs</a>
 *
 * @see SpotifyRequestVariant
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@Setter
@SpotifyRequest(value = "me/following", authorizations = Scope.USER_FOLLOW_MODIFY, method = HttpMethod.DELETE)
public class MyUnfollowPersonDelete implements SpotifyRequestVariant {


    /**
     * The ID type: either artist or user
     */
    @SpotifyRequestField
    private final String type;

    /**
     * A list of the artist or the user Spotify IDs.
     */
    @SpotifyRequestField
    private String[] ids;

    /**
     * An array of the artist or user Spotify IDs.
     */
    @SpotifyRequestContent("ids")
    private final String[] bodyIds;

    /**
     * Initializes the {@link MyUnfollowPersonDelete} request
     * @param type The ID type
     * @param ids The Spotify IDs of the artist or user.
     */
    public MyUnfollowPersonDelete(String type, String... ids) {
        this.type = type;
        this.bodyIds = ids;
    }


}
