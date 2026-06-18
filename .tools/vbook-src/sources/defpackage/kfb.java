package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class kfb extends ea7 {
    public final Integer c;
    public final Integer d;
    public final y48 e;
    public final boolean f;

    /* JADX WARN: Illegal instructions before constructor call */
    public kfb(Integer num, Integer num2, y48 y48Var, String str, boolean z) {
        Integer num3 = num.equals(num2) ? num : null;
        super(num3, str);
        this.c = num;
        this.d = num2;
        this.e = y48Var;
        this.f = z;
        if (num3 != null) {
            ha5 ha5Var = new ha5(1, 9, 1);
            int iIntValue = num3.intValue();
            if (1 > iIntValue || iIntValue > ha5Var.b) {
                k27.j("Invalid length for field ", str, ": ", num3);
                throw null;
            }
        }
    }

    @Override // defpackage.ea7
    public final fa7 a(int i, String str, Object obj, int i2) {
        Integer numValueOf;
        Integer num = this.d;
        if (num != null && i2 - i > num.intValue()) {
            return new cp4(num.intValue(), 5);
        }
        Integer num2 = this.c;
        if (num2 != null && i2 - i < num2.intValue()) {
            return new cp4(num2.intValue(), 4);
        }
        int iCharAt = 0;
        while (true) {
            if (i >= i2) {
                numValueOf = Integer.valueOf(iCharAt);
                break;
            }
            iCharAt = (iCharAt * 10) + (str.charAt(i) - '0');
            if (iCharAt < 0) {
                numValueOf = null;
                break;
            }
            i++;
        }
        if (numValueOf == null) {
            return zk4.t;
        }
        boolean z = this.f;
        int iIntValue = numValueOf.intValue();
        if (z) {
            iIntValue = -iIntValue;
        }
        Object objB = this.e.b(obj, Integer.valueOf(iIntValue));
        if (objB == null) {
            return null;
        }
        return new qa0(objB);
    }
}
