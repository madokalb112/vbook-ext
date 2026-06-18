package defpackage;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wg6 extends m95 {
    public final Method c;

    public wg6(Method method) {
        this.c = method;
    }

    @Override // defpackage.m95
    public final Member t0() {
        return this.c;
    }

    @Override // defpackage.m95
    public final m95 u0(Object obj) {
        s0(obj);
        return this;
    }
}
