package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class a94 extends ea7 {
    public final int c;
    public final int d;
    public final y48 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a94(int i, int i2, y48 y48Var, String str) {
        super(i == i2 ? Integer.valueOf(i) : null, str);
        y48Var.getClass();
        str.getClass();
        this.c = i;
        this.d = i2;
        this.e = y48Var;
        if (1 > i || i >= 10) {
            j31.e(i, "Invalid minimum length ", " for field ", str, ": expected 1..9");
            throw null;
        }
        if (i > i2 || i2 >= 10) {
            gp.k(tw2.q(j39.p("Invalid maximum length ", " for field ", str, ": expected ", i2), i, "..9"));
            throw null;
        }
    }

    @Override // defpackage.ea7
    public final fa7 a(int i, String str, Object obj, int i2) {
        int i3 = i2 - i;
        int i4 = this.c;
        if (i3 < i4) {
            return new cp4(i4, 4);
        }
        int i5 = this.d;
        if (i3 > i5) {
            return new cp4(i5, 5);
        }
        int iCharAt = 0;
        while (i < i2) {
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            i++;
        }
        Object objB = this.e.b(obj, new pd2(iCharAt, i3));
        if (objB == null) {
            return null;
        }
        return new qa0(objB);
    }
}
