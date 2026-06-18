package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class th1 extends e2 {
    public final Object a;
    public int b;
    public final /* synthetic */ uh1 c;

    public th1(uh1 uh1Var, int i) {
        this.c = uh1Var;
        Object obj = uh1.v;
        this.a = uh1Var.j()[i];
        this.b = i;
    }

    public final void a() {
        int i = this.b;
        Object obj = this.a;
        uh1 uh1Var = this.c;
        if (i != -1 && i < uh1Var.size()) {
            if (yn2.z(obj, uh1Var.j()[this.b])) {
                return;
            }
        }
        Object obj2 = uh1.v;
        this.b = uh1Var.e(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        uh1 uh1Var = this.c;
        Map mapC = uh1Var.c();
        if (mapC != null) {
            return mapC.get(this.a);
        }
        a();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return uh1Var.k()[i];
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        uh1 uh1Var = this.c;
        Map mapC = uh1Var.c();
        Object obj2 = this.a;
        if (mapC != null) {
            return mapC.put(obj2, obj);
        }
        a();
        int i = this.b;
        if (i == -1) {
            uh1Var.put(obj2, obj);
            return null;
        }
        Object obj3 = uh1Var.k()[i];
        uh1Var.k()[this.b] = obj;
        return obj3;
    }
}
