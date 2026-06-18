package okhttp3.internal.http2;

import defpackage.heb;
import defpackage.ib4;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.http2.PushObserver;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class b implements ib4 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Http2Connection b;
    public final /* synthetic */ int c;
    public final /* synthetic */ List d;

    public /* synthetic */ b(Http2Connection http2Connection, int i, List list) {
        this.b = http2Connection;
        this.c = i;
        this.d = list;
    }

    @Override // defpackage.ib4
    public final Object invoke() {
        switch (this.a) {
            case 0:
                Http2Connection http2Connection = this.b;
                int i = this.c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection.w).getClass();
                try {
                    http2Connection.I.R(i, ErrorCode.CANCEL);
                    synchronized (http2Connection) {
                        http2Connection.K.remove(Integer.valueOf(i));
                    }
                } catch (IOException unused) {
                }
                return heb.a;
            default:
                Http2Connection http2Connection2 = this.b;
                int i2 = this.c;
                ((PushObserver.Companion.PushObserverCancel) http2Connection2.w).getClass();
                try {
                    http2Connection2.I.R(i2, ErrorCode.CANCEL);
                    synchronized (http2Connection2) {
                        http2Connection2.K.remove(Integer.valueOf(i2));
                    }
                } catch (IOException unused2) {
                }
                return heb.a;
        }
    }

    public /* synthetic */ b(Http2Connection http2Connection, int i, List list, boolean z) {
        this.b = http2Connection;
        this.c = i;
        this.d = list;
    }
}
