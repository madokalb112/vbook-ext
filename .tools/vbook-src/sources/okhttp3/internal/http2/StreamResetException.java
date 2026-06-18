package okhttp3.internal.http2;

import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode a;

    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        this.a = errorCode;
    }
}
