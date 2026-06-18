package org.mozilla.javascript;

import java.io.Serializable;
import java.util.function.Supplier;
import org.mozilla.javascript.NativeError;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class g implements Supplier {
    public final /* synthetic */ int a;
    public final /* synthetic */ Serializable b;

    public /* synthetic */ g(int i, Serializable serializable) {
        this.a = i;
        this.b = serializable;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        int i = this.a;
        Serializable serializable = this.b;
        switch (i) {
            case 0:
                return ((NativeError.ProtoProps) serializable).getStackTraceLimit();
            case 1:
                return ((NativeError.ProtoProps) serializable).getPrepareStackTrace();
            default:
                return ((NativeError) serializable).getStackDelegated();
        }
    }
}
