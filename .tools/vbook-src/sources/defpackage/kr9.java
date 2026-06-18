package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kr9 extends l1 implements Iterator, fi5 {
    public final /* synthetic */ int s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kr9(jk9 jk9Var, Iterator it, int i) {
        super(jk9Var, it);
        this.s = i;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.s) {
            case 0:
                a();
                if (((Map.Entry) this.c) == null) {
                    j31.d();
                }
                break;
            case 1:
                Map.Entry entry = (Map.Entry) this.f;
                if (entry == null) {
                    j31.d();
                } else {
                    a();
                }
                break;
            default:
                Map.Entry entry2 = (Map.Entry) this.f;
                if (entry2 == null) {
                    j31.d();
                } else {
                    a();
                }
                break;
        }
        return null;
    }
}
