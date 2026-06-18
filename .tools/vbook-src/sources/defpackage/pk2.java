package defpackage;

import java.nio.charset.Charset;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class pk2 extends sh7 {
    public final /* synthetic */ int a = 0;
    public final long b;
    public final as1 c;
    public final Object d;

    public pk2(pm7 pm7Var) {
        pm7Var.getClass();
        String strK = sw1.K(pm7Var);
        Charset charset = q31.a;
        this.d = sg9.p(strK, charset);
        this.b = r4.length;
        as1 as1Var = wr1.c;
        Set set = ds1.a;
        as1Var.getClass();
        charset.getClass();
        String strName = charset.name();
        strName.getClass();
        this.c = as1Var.c(strName);
    }

    @Override // defpackage.wh7
    public final Long a() {
        int i = this.a;
        long j = this.b;
        switch (i) {
        }
        return Long.valueOf(j);
    }

    @Override // defpackage.wh7
    public final as1 b() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // defpackage.sh7
    public final byte[] e() {
        switch (this.a) {
        }
        return (byte[]) this.d;
    }

    public pk2(as1 as1Var, Object obj) {
        this.d = obj;
        if (as1Var == null) {
            as1 as1Var2 = wr1.a;
            as1Var = wr1.b;
        }
        this.c = as1Var;
        this.b = ((byte[]) obj).length;
    }
}
