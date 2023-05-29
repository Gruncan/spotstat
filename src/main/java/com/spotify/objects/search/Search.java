package com.spotify.objects.search;

import com.spotify.objects.SpotifyField;
import com.spotify.objects.SpotifyObject;
import com.spotify.objects.SpotifyOptional;
import com.spotify.objects.search.items.*;
import com.spotify.requests.search.SearchGet;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a spotify search result<br>
 * Serialized from <a href="https://developer.spotify.com/documentation/web-api/reference/search">SearchGet</a>
 *
 * @see SearchGet
 * @see AbstractSearchItems
 * @see SearchItemArtists
 * @see SearchItemsAlbums
 * @see SearchItemsAudiobooks
 * @see SearchItemsEpisodes
 * @see SearchItemsPlaylists
 * @see SearchItemsShows
 * @see SearchItemTracks
 * @see SpotifyObject
 */
@Getter
@Setter
@SpotifyOptional
public class Search implements SpotifyObject {

    /**
     * The track results from the search
     */
    @SpotifyField
    private SearchItemTracks tracks;

    /**
     * The artist results from the search
     */
    @SpotifyField
    private SearchItemArtists artists;

    /**
     * The album results from the search
     */
    @SpotifyField
    private SearchItemsAlbums albums;

    /**
     * The playlist results from the search
     */
    @SpotifyField
    private SearchItemsPlaylists playlists;

    /**
     * The show results from the search
     */
    @SpotifyField
    private SearchItemsShows shows;

    /**
     * The episode results from the search
     */
    @SpotifyField
    private SearchItemsEpisodes episodes;

    /**
     * The audiobook results from the search
     */
    @SpotifyField
    private SearchItemsAudiobooks audiobooks;

}
