package com.spotify.requests.artists;

import com.spotify.json.JsonObject;
import com.spotify.requests.AbstractRequest;


/**
 * Get Spotify catalog information about an artist's albums.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/#/operations/get-an-artists-albums">Spotify Docs</a>
 */
public class ArtistAlbumsGet extends AbstractRequest {


    private final static String URL = "artists/{id}/albums";

    private final String id;

    /**
     * @param token The token of the related spotify api session
     * @param id    The id of the artist to be queried
     */
    public ArtistAlbumsGet(String token, String id) {
        super(token, "include_groups", "limit", "market", "offset");
        this.id = id;
    }

    @Override
    public JsonObject execute() {
        return super.requestGet(URL.replace("{id}", this.id));
    }
}
