package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public enum mx3 {
    PDF("application/pdf"),
    EPUB("application/epub+zip"),
    ZIP("application/zip"),
    CBZ("application/vnd.comicbook+zip"),
    RAR("application/vnd.rar"),
    SEVEN_Z("application/x-7z-compressed"),
    GZIP("application/gzip"),
    TEXT("text/plain"),
    JSON("application/json"),
    XML("application/xml"),
    HTML("text/html");

    public final String a;

    mx3(String str) {
        this.a = str;
    }
}
