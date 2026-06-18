package okhttp3;

import defpackage.av0;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public interface WebSocket {

    /* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
    public interface Factory {
        RealWebSocket a(Request request, WebSocketListener webSocketListener);
    }

    boolean a(String str);

    boolean b(av0 av0Var);

    void cancel();

    boolean f(int i, String str);
}
