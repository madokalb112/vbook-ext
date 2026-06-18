package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j65 implements Iterable, fi5 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ j65(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new w53(vm7.Y((Object[]) ((ub) obj).b));
            case 1:
                return new mn2((nn2) obj);
            default:
                return new n1((je3) obj);
        }
    }
}
