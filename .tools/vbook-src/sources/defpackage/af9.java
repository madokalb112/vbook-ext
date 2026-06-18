package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class af9 extends ra8 {
    public final int b;
    public final String[] c;
    public final qj d;
    public final String e;
    public final String f;
    public final String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af9(int i, String[] strArr, qj qjVar, String str, String str2, String str3, kb4 kb4Var) {
        super(kb4Var);
        qjVar.getClass();
        this.b = i;
        this.c = strArr;
        this.d = qjVar;
        this.e = str;
        this.f = str2;
        this.g = str3;
    }

    @Override // defpackage.ra8
    public final void a(v34 v34Var) {
        String[] strArr = this.c;
        this.d.p((String[]) Arrays.copyOf(strArr, strArr.length), v34Var);
    }

    @Override // defpackage.ra8
    public final va8 b(kb4 kb4Var) {
        return this.d.E(Integer.valueOf(this.b), this.g, kb4Var, 0, (kb4) null);
    }

    @Override // defpackage.ra8
    public final void f(v34 v34Var) {
        v34Var.getClass();
        String[] strArr = this.c;
        this.d.R((String[]) Arrays.copyOf(strArr, strArr.length), v34Var);
    }

    public final String toString() {
        return this.e + ':' + this.f;
    }
}
