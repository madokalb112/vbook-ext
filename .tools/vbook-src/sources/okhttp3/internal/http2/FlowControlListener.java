package okhttp3.internal.http2;

import okhttp3.internal.http2.flowcontrol.WindowCounter;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface FlowControlListener {
    void a(WindowCounter windowCounter);

    void b(WindowCounter windowCounter);

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public static final class None implements FlowControlListener {
        public static final None a = new None();

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void b(WindowCounter windowCounter) {
            windowCounter.getClass();
        }

        @Override // okhttp3.internal.http2.FlowControlListener
        public final void a(WindowCounter windowCounter) {
        }
    }
}
