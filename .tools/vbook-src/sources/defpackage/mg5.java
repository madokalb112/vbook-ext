package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class mg5 implements a39 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Iterator b;

    public /* synthetic */ mg5(Iterator it, int i) {
        this.a = i;
        this.b = it;
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        int i = this.a;
        return this.b;
    }
}
