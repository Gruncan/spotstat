package com.spotify.objects.chapters;

import com.spotify.objects.SpotifyField;
import com.spotify.objects.SpotifyObject;
import com.spotify.objects.episodes.SimplifiedEpisode;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a spotify chapter resume point
 *
 * @see SimplifiedChapter
 * @see SimplifiedEpisode
 * @see SpotifyObject
 */
@Getter
@Setter
public class ChapterResumePoint implements SpotifyObject {


    /**
     * Whether or not the episode has been fully played by the user.
     */
    @SpotifyField("fully_played")
    private boolean fullyPlayed;

    /**
     * The user's most recent position in the episode in milliseconds.
     */
    @SpotifyField("resume_position_ms")
    private int resumePosition;

}
