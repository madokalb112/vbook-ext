package org.mozilla.javascript;

import java.io.Serializable;
import java.util.function.Consumer;
import org.mozilla.javascript.NativeError;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class h implements Consumer {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ h(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                ((NativeError.ProtoProps) serializable).setStackTraceLimit(obj);
                break;
            case 1:
                ((NativeError.ProtoProps) serializable).setPrepareStackTrace(obj);
                break;
            default:
                ((NativeError) serializable).setStackDelegated(obj);
                break;
        }
    }
}
