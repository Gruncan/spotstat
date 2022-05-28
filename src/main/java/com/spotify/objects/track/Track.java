package com.spotify.objects.track;

import com.spotify.objects.ISerializable;
import com.spotify.requests.util.Market;

import java.util.Arrays;

public class Track implements ISerializable {


    private final Market[] availableMarkets;
    private final int discNumber;
    private final int durationMs;
    private final boolean explicit;
    private final Object externalIds;
    private final Object externalUrls;
    private final String href;
    private final String id;
    private final boolean isPlayable;
    private final Object linkedFrom;
    private final Object restrictions;
    private final String name;
    private final int popularity;
    private final String previewUrl;
    private final int trackNumber;
    private final String type;
    private final String url;
    private final boolean isLocal;


    private final TrackAlbum album;
    private final TrackArtist[] artists;

    private TrackAudioFeatures audioFeatures;
    private TrackAudioAnalysis audioAnalysis;


    public Track(TrackAlbum album, TrackArtist[] artists, Market[] availableMarkets, int discNumber, int durationMs,
                 boolean explicit, Object externalIds, Object externalUrls, String href, String id, boolean isPlayable,
                 Object linkedFrom, Object restrictions, String name, int popularity, String previewUrl, int trackNumber,
                 String type, String url, boolean isLocal) {
        this.album = album;
        this.artists = artists;
        this.availableMarkets = availableMarkets;
        this.discNumber = discNumber;
        this.durationMs = durationMs;
        this.explicit = explicit;
        this.externalIds = externalIds;
        this.externalUrls = externalUrls;
        this.href = href;
        this.id = id;
        this.isPlayable = isPlayable;
        this.linkedFrom = linkedFrom;
        this.restrictions = restrictions;
        this.name = name;
        this.popularity = popularity;
        this.previewUrl = previewUrl;
        this.trackNumber = trackNumber;
        this.type = type;
        this.url = url;
        this.isLocal = isLocal;

    }


    public void setAudioAnalysis(TrackAudioAnalysis audioAnalysis) {
        this.audioAnalysis = audioAnalysis;
    }

    public void setAudioFeatures(TrackAudioFeatures audioFeatures) {
        this.audioFeatures = audioFeatures;
    }

    @Override
    public String toString() {
        return "Track{" +
                "availableMarkets=" + Arrays.toString(availableMarkets) +
                ", discNumber=" + discNumber +
                ", durationMs=" + durationMs +
                ", explicit=" + explicit +
                ", externalIds=" + externalIds +
                ", externalUrls=" + externalUrls +
                ", href='" + href + '\'' +
                ", id='" + id + '\'' +
                ", isPlayable=" + isPlayable +
                ", linkedFrom=" + linkedFrom +
                ", restrictions=" + restrictions +
                ", name='" + name + '\'' +
                ", popularity=" + popularity +
                ", previewUrl='" + previewUrl + '\'' +
                ", trackNumber=" + trackNumber +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", isLocal=" + isLocal +
                ", album=" + album +
                ", artists=" + Arrays.toString(artists) +
                ", audioFeatures=" + audioFeatures +
                '}';
    }
}
