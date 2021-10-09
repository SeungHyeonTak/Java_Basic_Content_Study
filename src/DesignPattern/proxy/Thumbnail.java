package DesignPattern.proxy;

interface Thumbnail {
    void showTitle();

    void showPreview();
}

class RealThumbnail implements Thumbnail {
    private String title;
    private String movieUrl;

    public RealThumbnail(String _title, String _movieUrl) {
        this.title = _title;
        this.movieUrl = _movieUrl;

        System.out.println(movieUrl + "로 부터" + title + "의 영상 데이터 다운");
    }

    @Override
    public void showTitle() {
        System.out.println("Real 제목 : " + title);
    }

    @Override
    public void showPreview() {
        System.out.println(title + "의 프리뷰 재생");
    }
}

class ProxyThumbnail implements Thumbnail {
    private String title;
    private String movieUrl;
    private RealThumbnail realThumbnail;

    public ProxyThumbnail(String _title, String _movieUrl) {
        this.title = _title;
        this.movieUrl = _movieUrl;
    }

    @Override
    public void showTitle() {
        System.out.println("Proxy 제목 : " + title);
    }

    @Override
    public void showPreview() {
        if (realThumbnail == null) {
            realThumbnail = new RealThumbnail(title, movieUrl);
        }
        realThumbnail.showPreview();
    }
}
