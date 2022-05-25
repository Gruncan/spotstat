package com.spotify.requests.albums;

import com.spotify.json.JsonObject;
import com.spotify.requests.AbstractRequest;
import com.spotify.requests.RequestQuery;
import com.spotify.util.Util;


/**
 * Check if one or more albums is already saved in the current Spotify user's 'Your Music' library.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/#/operations/check-users-saved-albums">Spotify Docs</a>
 */
public class AlbumsCheckSavedGet extends AbstractRequest {


    private final static String URL = "me/albums/contains/";

    /**
     * @param token  The token of the related spotify api session
     * @param albums The array of albums to be checked
     */
    public AlbumsCheckSavedGet(String token, String... albums) {
        super(token, "ids");
        super.addQuery(new RequestQuery<>("ids", Util.join(albums, ",")));
    }

    @Override
    public JsonObject execute() {
        return super.requestGet(URL);
    }
}
