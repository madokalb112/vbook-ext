package defpackage;

import com.google.android.gms.internal.base.zau;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a9c implements vb0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ a9c(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public final void a(boolean z) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                zau zauVar = ((qg4) obj).z;
                zauVar.sendMessage(zauVar.obtainMessage(1, Boolean.valueOf(z)));
                break;
            default:
                pq7 pq7Var = (pq7) obj;
                if (!z) {
                    pq7Var.getClass();
                    pq7Var.getClass();
                } else {
                    pq7Var.getClass();
                    ddc ddcVar = (ddc) pq7Var.a;
                    ddcVar.c.removeCallbacks(ddcVar.d);
                }
                break;
        }
    }
}
