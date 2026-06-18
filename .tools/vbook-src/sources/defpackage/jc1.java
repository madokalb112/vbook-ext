package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jc1 implements a39 {
    public final /* synthetic */ int a;
    public final Object b;

    public jc1() {
        this.a = 3;
        this.b = new ArrayList();
    }

    public void c(Object obj, String str) {
        ((ArrayList) this.b).add(new tkb(obj, str));
    }

    @Override // defpackage.a39
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return ex1.Y((yb4) obj);
            case 2:
                return new qy5((CharSequence) obj);
            default:
                return ((ArrayList) obj).iterator();
        }
    }

    public /* synthetic */ jc1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }
}
