package defpackage;

import java.util.Map;
import org.mozilla.javascript.ES6Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class iy8 implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jy8 b;

    public /* synthetic */ iy8(jy8 jy8Var, int i) {
        this.a = i;
        this.b = jy8Var;
    }

    @Override // defpackage.kb4
    public final Object invoke(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        jy8 jy8Var = this.b;
        b91 b91Var = (b91) obj;
        switch (i) {
            case 0:
                b91Var.getClass();
                b91Var.a("type", tv9.b);
                b91Var.a(ES6Iterator.VALUE_PROPERTY, fx1.z("kotlinx.serialization.Sealed<" + jy8Var.a.g() + '>', r39.c, new m39[0], new iy8(jy8Var, 1)));
                b91Var.b = lc3.a;
                break;
            default:
                b91Var.getClass();
                for (Map.Entry entry : jy8Var.d.entrySet()) {
                    b91Var.a((String) entry.getKey(), ((oi5) entry.getValue()).e());
                }
                break;
        }
        return hebVar;
    }
}
