package defpackage;

import android.content.Context;
import android.os.Process;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class d38 {
    public final Context a;
    public final d6a b;
    public final int c;
    public final d6a d;
    public final d6a e;
    public boolean f;

    public d38(Context context, wjb wjbVar) {
        context.getClass();
        wjbVar.getClass();
        this.a = context;
        final int i = 0;
        this.b = new d6a(new ib4(this) { // from class: c38
            public final /* synthetic */ d38 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i2 = i;
                d38 d38Var = this.b;
                switch (i2) {
                    case 0:
                        return ((e38) d38Var.e.getValue()).a;
                    default:
                        return y3.e(d38Var.a);
                }
            }
        });
        this.c = Process.myPid();
        this.d = new d6a(new wn6(wjbVar, 13));
        final int i2 = 1;
        this.e = new d6a(new ib4(this) { // from class: c38
            public final /* synthetic */ d38 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i22 = i2;
                d38 d38Var = this.b;
                switch (i22) {
                    case 0:
                        return ((e38) d38Var.e.getValue()).a;
                    default:
                        return y3.e(d38Var.a);
                }
            }
        });
    }

    public final String a() {
        return (String) this.b.getValue();
    }

    public final Map b(Map map) {
        d6a d6aVar = this.d;
        if (map != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            linkedHashMap.put(a(), new b38(Process.myPid(), (String) d6aVar.getValue()));
            return y86.i0(linkedHashMap);
        }
        Map mapSingletonMap = Collections.singletonMap(a(), new b38(Process.myPid(), (String) d6aVar.getValue()));
        mapSingletonMap.getClass();
        return mapSingletonMap;
    }
}
