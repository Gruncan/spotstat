package dev.gruncan.spotify.api.web.requests.playlists;

import dev.gruncan.spotify.SpotifyResponse;
import dev.gruncan.spotify.api.web.objects.SpotifySerialize;
import dev.gruncan.spotify.api.web.objects.wrappers.SpotifyBooleanArray;
import dev.gruncan.spotify.api.SpotifyRequest;
import dev.gruncan.spotify.api.SpotifyRequestField;
import dev.gruncan.spotify.api.SpotifyRequestVariant;
import dev.gruncan.spotify.api.SpotifySubRequest;

/**
 * Get Spotify catalog information for a single album.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/check-if-user-follows-playlist">Spotify Docs</a>
 * <p>Serializes into {@link SpotifyBooleanArray}</p>
 *
 * @see SpotifyBooleanArray
 * @see SpotifyRequestVariant
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@SpotifyRequest(value = "playlist", end = "followers/contains")
@SpotifySerialize(SpotifyBooleanArray.class)
public class PlaylistFollowingCheckGet implements SpotifyRequestVariant {

    /**
     * The Spotify ID of the playlist.
     */
    @SpotifySubRequest
    private final String id;

    /**
     * A comma-separated list of Spotify User IDs;<br>
     * the ids of the users that you want to check to see if they follow the playlist.
     */
    @SpotifyRequestField
    private final String[] ids;

    /**
     * Initializes the {@link PlaylistFollowingCheckGet} request
     * @param id The id of the playlist
     * @param ids The IDs of the users to check
     */
    public PlaylistFollowingCheckGet(String id, String... ids) {
        this.id = id;
        this.ids = ids;
    }

}
