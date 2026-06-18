package defpackage;

import java.util.AbstractMap;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ih8 extends a55 {
    public final /* synthetic */ jh8 c;

    public ih8(jh8 jh8Var) {
        this.c = jh8Var;
    }

    @Override // defpackage.s45
    public final boolean f() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        jh8 jh8Var = this.c;
        fx1.K(i, jh8Var.f);
        Object[] objArr = jh8Var.e;
        int i2 = i * 2;
        Object obj = objArr[i2];
        Objects.requireNonNull(obj);
        Object obj2 = objArr[i2 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.f;
    }
}
