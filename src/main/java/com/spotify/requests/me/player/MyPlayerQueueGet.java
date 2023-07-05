package com.spotify.requests.me.player;

import com.spotify.SpotifyResponse;
import com.spotify.objects.SpotifySerialize;
import com.spotify.objects.player.PlayerQueue;
import com.spotify.requests.SpotifyRequest;
import com.spotify.requests.SpotifyRequestVariant;
import com.spotify.requests.util.Scope;

/**
 * Get the list of objects that make up the user's queue.
 * <a href="https://developer.spotify.com/documentation/web-api/reference/get-queue">Spotify Docs</a>
 * <p>Serializes into {@link PlayerQueue}</p>
 *
 * @see PlayerQueue
 * @see SpotifyRequestVariant
 * @see SpotifyRequest
 * @see SpotifySerialize
 * @see SpotifyResponse
 */
@SpotifyRequest(value = "me/player/queue", authorizations = Scope.USER_READ_PLAYBACK_STATE)
@SpotifySerialize(PlayerQueue.class)
public class MyPlayerQueueGet implements SpotifyRequestVariant {

}
