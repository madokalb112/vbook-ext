package defpackage;

import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class wh1 extends yh1 {
    public static yh1 f(int i) {
        return i < 0 ? yh1.b : i > 0 ? yh1.c : yh1.a;
    }

    @Override // defpackage.yh1
    public final yh1 a(int i, int i2) {
        return f(Integer.compare(i, i2));
    }

    @Override // defpackage.yh1
    public final yh1 b(Object obj, Object obj2, Comparator comparator) {
        return f(comparator.compare(obj, obj2));
    }

    @Override // defpackage.yh1
    public final yh1 c(boolean z, boolean z2) {
        return f(Boolean.compare(z, z2));
    }

    @Override // defpackage.yh1
    public final yh1 d(boolean z, boolean z2) {
        return f(Boolean.compare(z2, z));
    }

    @Override // defpackage.yh1
    public final int e() {
        return 0;
    }
}
