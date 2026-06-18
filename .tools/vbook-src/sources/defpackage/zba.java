package defpackage;

import java.nio.charset.Charset;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zba extends sh7 {
    public final String a;
    public final as1 b;
    public final byte[] c;

    public zba(String str, as1 as1Var) {
        str.getClass();
        as1Var.getClass();
        this.a = str;
        this.b = as1Var;
        Charset charsetA = ds1.a(as1Var);
        this.c = sg9.p(str, charsetA == null ? q31.a : charsetA);
    }

    @Override // defpackage.wh7
    public final Long a() {
        return Long.valueOf(this.c.length);
    }

    @Override // defpackage.wh7
    public final as1 b() {
        return this.b;
    }

    @Override // defpackage.wh7
    public final yv4 d() {
        return null;
    }

    @Override // defpackage.sh7
    public final byte[] e() {
        return this.c;
    }

    public final String toString() {
        return "TextContent[" + this.b + "] \"" + bw9.z0(30, this.a) + '\"';
    }
}
