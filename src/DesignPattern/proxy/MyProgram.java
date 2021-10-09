package DesignPattern.proxy;

import java.util.ArrayList;

public class MyProgram {
    public static void main(String[] args) {
        ArrayList<Thumbnail> thumbnails = new ArrayList<>();

        thumbnails.add(new ProxyThumbnail("A 영상", "/a.mp4"));
        thumbnails.add(new ProxyThumbnail("B 영상", "/b.mp4"));
        thumbnails.add(new ProxyThumbnail("C 영상", "/c.mp4"));
        thumbnails.add(new ProxyThumbnail("D 영상", "/d.mp4"));
        thumbnails.add(new ProxyThumbnail("E 영상", "/e.mp4"));

        for (Thumbnail thumbnail : thumbnails) {
            thumbnail.showTitle();
        }

        thumbnails.get(2).showPreview();
        thumbnails.get(2).showPreview();
        thumbnails.get(4).showPreview();
        thumbnails.get(1).showPreview();
    }
}
