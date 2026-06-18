package defpackage;

import android.content.Context;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z08 {
    public final String a;
    public final q43 b;
    public final kb4 c;
    public final vx1 d;
    public final Object e = new Object();
    public volatile x08 f;

    public z08(String str, q43 q43Var, kb4 kb4Var, vx1 vx1Var) {
        this.a = str;
        this.b = q43Var;
        this.c = kb4Var;
        this.d = vx1Var;
    }

    public final Object a(ni5 ni5Var, Object obj) {
        x08 x08Var;
        Context context = (Context) obj;
        context.getClass();
        ni5Var.getClass();
        x08 x08Var2 = this.f;
        if (x08Var2 != null) {
            return x08Var2;
        }
        synchronized (this.e) {
            try {
                if (this.f == null) {
                    Context applicationContext = context.getApplicationContext();
                    q43 q43Var = this.b;
                    kb4 kb4Var = this.c;
                    applicationContext.getClass();
                    this.f = wx1.b0(q43Var, (List) kb4Var.invoke(applicationContext), this.d, new e67(5, applicationContext, this));
                }
                x08Var = this.f;
                x08Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return x08Var;
    }
}
