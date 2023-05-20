package com.spotify.objects.shows;

import com.spotify.objects.SpotifyField;
import com.spotify.objects.episodes.EpisodesSearch;
import com.spotify.objects.episodes.SimplifiedEpisode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Show extends SimplifiedEpisode {

    @SpotifyField
    private EpisodesSearch episodes;
}
