package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class qk2 extends uh7 {
    public final /* synthetic */ int a = 0;
    public final Long b;
    public final as1 c;
    public final /* synthetic */ Object d;

    public qk2(ct7 ct7Var, as1 as1Var, Object obj) {
        this.d = obj;
        String strP = ((xu4) ct7Var.a).c.p("Content-Length");
        this.b = strP != null ? Long.valueOf(Long.parseLong(strP)) : null;
        if (as1Var == null) {
            as1 as1Var2 = wr1.a;
            as1Var = wr1.b;
        }
        this.c = as1Var;
    }

    @Override // defpackage.wh7
    public final Long a() {
        switch (this.a) {
        }
        return this.b;
    }

    @Override // defpackage.wh7
    public final as1 b() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.uh7
    public final ut0 e() {
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                return (ut0) obj;
            default:
                InputStream inputStream = (InputStream) obj;
                aj2 aj2Var = rw2.a;
                nh2 nh2Var = nh2.c;
                qs0 qs0Var = rs0.a;
                inputStream.getClass();
                nh2Var.getClass();
                qs0Var.getClass();
                int i2 = yg5.a;
                return new lc8(new k85(inputStream), nh2Var);
        }
    }

    public qk2(xu4 xu4Var, as1 as1Var, Object obj) {
        this.d = obj;
        String strP = xu4Var.c.p("Content-Length");
        this.b = strP != null ? Long.valueOf(Long.parseLong(strP)) : null;
        if (as1Var == null) {
            as1 as1Var2 = wr1.a;
            as1Var = wr1.b;
        }
        this.c = as1Var;
    }
}
