package com.spotify.objects.wrappers;

import com.spotify.objects.SpotifyField;
import com.spotify.objects.SpotifyObject;
import com.spotify.objects.SpotifyOptional;
import lombok.Getter;
import lombok.Setter;

/**
 * Represents a spotify ExternalID object
 */
@Getter
@Setter
public class SpotifyExternalID implements SpotifyObject {

    /**
     * <a href="http://en.wikipedia.org/wiki/International_Standard_Recording_Code">International Standard Recording Code</a>
     */
    @SpotifyOptional
    @SpotifyField
    private String isrc;

    /**
     * <a href="http://en.wikipedia.org/wiki/International_Article_Number_%28EAN%29">International Article Number</a>
     */
    @SpotifyOptional
    @SpotifyField
    private String ean;

    /**
     * <a href="http://en.wikipedia.org/wiki/Universal_Product_Code">Universal Product Code</a>
     */
    @SpotifyOptional
    @SpotifyField
    private String upc;

}
