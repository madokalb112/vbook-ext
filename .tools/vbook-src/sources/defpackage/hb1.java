package defpackage;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class hb1 {
    public final cn7 b;
    public final fo2 d;
    public final fo2 e;
    public final cn7 a = dk9.x(false);
    public final is c = new is(this, new f0(this, 14));

    public hb1(int i) {
        final int i2 = 0;
        this.b = dk9.x(new wga("", zk9.h(i, i), 4));
        this.d = dk9.n(new ib4(this) { // from class: gb1
            public final /* synthetic */ hb1 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i3;
                int i4 = i2;
                int i5 = 0;
                hb1 hb1Var = this.b;
                switch (i4) {
                    case 0:
                        String strA = hb1Var.a();
                        i3 = 0;
                        while (i5 < strA.length()) {
                            if (strA.charAt(i5) == '\n') {
                                i3++;
                            }
                            i5++;
                        }
                        break;
                    default:
                        String strA2 = hb1Var.a();
                        int iB = hb1Var.b();
                        int length = hb1Var.a().length();
                        if (iB > length) {
                            iB = length;
                        }
                        String strSubstring = strA2.substring(0, iB);
                        i3 = 0;
                        while (i5 < strSubstring.length()) {
                            if (strSubstring.charAt(i5) == '\n') {
                                i3++;
                            }
                            i5++;
                        }
                        break;
                }
                return Integer.valueOf(i3 + 1);
            }
        });
        final int i3 = 1;
        this.e = dk9.n(new ib4(this) { // from class: gb1
            public final /* synthetic */ hb1 b;

            {
                this.b = this;
            }

            @Override // defpackage.ib4
            public final Object invoke() {
                int i32;
                int i4 = i3;
                int i5 = 0;
                hb1 hb1Var = this.b;
                switch (i4) {
                    case 0:
                        String strA = hb1Var.a();
                        i32 = 0;
                        while (i5 < strA.length()) {
                            if (strA.charAt(i5) == '\n') {
                                i32++;
                            }
                            i5++;
                        }
                        break;
                    default:
                        String strA2 = hb1Var.a();
                        int iB = hb1Var.b();
                        int length = hb1Var.a().length();
                        if (iB > length) {
                            iB = length;
                        }
                        String strSubstring = strA2.substring(0, iB);
                        i32 = 0;
                        while (i5 < strSubstring.length()) {
                            if (strSubstring.charAt(i5) == '\n') {
                                i32++;
                            }
                            i5++;
                        }
                        break;
                }
                return Integer.valueOf(i32 + 1);
            }
        });
    }

    public final String a() {
        return ((wga) this.b.getValue()).a.b;
    }

    public final int b() {
        long j = ((wga) this.b.getValue()).b;
        int i = pja.c;
        return (int) (j >> 32);
    }

    public final void c(String str) {
        str.getClass();
        int iB = b();
        String strA = a();
        char[] cArr = {' ', '\n', '\t', '(', ')', '{', '}', '[', ']', '.', ',', ';', ':', '\"', '\'', '<', '>', '='};
        int i = iB - 1;
        if (i < 0) {
            i = 0;
        }
        int iE0 = bw9.e0(strA, cArr, i) + 1;
        String strA2 = a();
        String strH = dx1.h(bw9.z0(iE0, strA2), str, strA2.substring(iB));
        int length = str.length() + iE0;
        this.c.f(new zx3(strA2.substring(iE0, iB), iE0, iB, str));
        this.b.setValue(new wga(strH, zk9.h(length, length), 4));
    }
}
