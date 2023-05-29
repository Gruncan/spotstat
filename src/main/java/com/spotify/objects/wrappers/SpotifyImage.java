package com.spotify.objects.wrappers;

import com.spotify.objects.SpotifyField;
import com.spotify.objects.SpotifyObject;
import com.spotify.objects.SpotifyOptional;
import lombok.Getter;
import lombok.Setter;

/**
 * A single spotify image
 *
 * @see SpotifyObject
 */
@Getter
@Setter
public class SpotifyImage implements SpotifyObject {

    /**
     * The source URL of the image
     */
    @SpotifyField
    private String url;

    /**
     * The image height in pixels.
     */
    @SpotifyOptional
    @SpotifyField
    private int height;

    /**
     * The image width in pixels.
     */
    @SpotifyOptional
    @SpotifyField
    private int width;


}
