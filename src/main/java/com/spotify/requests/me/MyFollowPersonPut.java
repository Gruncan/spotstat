package com.spotify.requests.me;

import com.http.HttpMethod;
import com.spotify.requests.SpotifyRequest;
import com.spotify.requests.SpotifyRequestContent;
import com.spotify.requests.SpotifyRequestField;
import com.spotify.requests.SpotifyRequestVariant;
import com.spotify.requests.util.Scope;
import lombok.Setter;

@Setter
@SpotifyRequest(value = "me/following", authorizations = Scope.USER_FOLLOW_MODIFY, method = HttpMethod.PUT)
public class MyFollowPersonPut implements SpotifyRequestVariant {


    private final String type;
    @SpotifyRequestContent("ids")
    private final String[] bodyIds;
    @SpotifyRequestField
    private String[] ids;


    public MyFollowPersonPut(String type, String... ids) {
        this.type = type;
        this.bodyIds = ids;
    }

}
