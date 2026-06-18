package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sh1 extends AbstractSet {
    public final /* synthetic */ int a;
    public final /* synthetic */ uh1 b;

    public /* synthetic */ sh1(uh1 uh1Var, int i) {
        this.a = i;
        this.b = uh1Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.a;
        uh1 uh1Var = this.b;
        switch (i) {
            case 0:
                uh1Var.clear();
                break;
            default:
                uh1Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.a;
        uh1 uh1Var = this.b;
        switch (i) {
            case 0:
                Map mapC = uh1Var.c();
                if (mapC != null) {
                    return mapC.entrySet().contains(obj);
                }
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    int iE = uh1Var.e(entry.getKey());
                    if (iE != -1 && yn2.z(uh1Var.k()[iE], entry.getValue())) {
                        return true;
                    }
                }
                return false;
            default:
                return uh1Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.a;
        uh1 uh1Var = this.b;
        switch (i) {
            case 0:
                Map mapC = uh1Var.c();
                return mapC != null ? mapC.entrySet().iterator() : new rh1(uh1Var, 1);
            default:
                Map mapC2 = uh1Var.c();
                return mapC2 != null ? mapC2.keySet().iterator() : new rh1(uh1Var, 0);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.a;
        uh1 uh1Var = this.b;
        switch (i) {
            case 0:
                Map mapC = uh1Var.c();
                if (mapC != null) {
                    break;
                } else if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    if (!uh1Var.g()) {
                        int iD = uh1Var.d();
                        Object key = entry.getKey();
                        Object value = entry.getValue();
                        Object obj2 = uh1Var.a;
                        Objects.requireNonNull(obj2);
                        int iR0 = gjb.r0(key, value, iD, obj2, uh1Var.i(), uh1Var.j(), uh1Var.k());
                        if (iR0 != -1) {
                            uh1Var.f(iR0, iD);
                            uh1Var.f--;
                            uh1Var.e += 32;
                            break;
                        }
                    }
                }
                break;
            default:
                Map mapC2 = uh1Var.c();
                if (mapC2 == null) {
                    if (uh1Var.h(obj) != uh1.v) {
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        int i = this.a;
        uh1 uh1Var = this.b;
        switch (i) {
        }
        return uh1Var.size();
    }
}
