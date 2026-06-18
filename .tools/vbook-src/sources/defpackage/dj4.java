package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class dj4 implements ax2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ dj4(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.ax2
    public final void a() {
        switch (this.a) {
            case 0:
                fj4 fj4Var = (fj4) this.b;
                fj4Var.c.removeCallbacks((Runnable) this.c);
                return;
            default:
                String str = (String) this.b;
                ej4 ej4Var = (ej4) this.c;
                synchronized (zx6.b) {
                    LinkedHashMap linkedHashMap = zx6.c;
                    zx6 zx6Var = (zx6) linkedHashMap.get(str);
                    if (zx6Var != null) {
                        zx6Var.a.remove(ej4Var);
                        if (zx6Var.a.isEmpty()) {
                            linkedHashMap.remove(str);
                            zx6Var.stopWatching();
                        }
                    }
                    break;
                }
                return;
        }
    }
}
