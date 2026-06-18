package defpackage;

import android.content.ClipData;
import android.content.ClipboardManager;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class xn8 implements ga1 {
    public final fo8 a;
    public final ga1 b;

    public xn8(fo8 fo8Var, ga1 ga1Var) {
        fo8Var.getClass();
        ga1Var.getClass();
        this.a = fo8Var;
        this.b = ga1Var;
    }

    public final Object a(fga fgaVar) {
        return this.b.a(fgaVar);
    }

    public final ClipboardManager b() {
        return this.b.b();
    }

    public final Object c(fa1 fa1Var, o1a o1aVar) {
        fo8 fo8Var = this.a;
        wga wgaVarK = fo8Var.k();
        yn8 yn8Var = fo8Var.t;
        long j = wgaVarK.b;
        zo zoVar = new zo();
        hk9 hk9Var = fo8Var.a;
        int size = hk9Var.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            nn8 nn8Var = (nn8) hk9Var.get(i3);
            int iJ = zoVar.j(nn8Var.b.b(nn8Var.c.e(yn8Var)));
            try {
                if (!pja.d(j)) {
                    int iG = pja.g(j);
                    mm7 mm7Var = nn8Var.c;
                    mm7Var.getClass();
                    if (iG < mm7Var.a().e.length() + i2 && pja.f(j) > i2) {
                        mm7 mm7Var2 = nn8Var.c;
                        mm7Var2.getClass();
                        String str = mm7Var2.a().e;
                        int iMax = Math.max(i, pja.g(j) - i2);
                        int iF = pja.f(j) - i2;
                        mm7 mm7Var3 = nn8Var.c;
                        mm7Var3.getClass();
                        zoVar.f(str.substring(iMax, Math.min(iF, mm7Var3.a().e.length())));
                    }
                }
                mm7 mm7Var4 = nn8Var.c;
                mm7Var4.getClass();
                int length = i2 + mm7Var4.a().e.length();
                wn8.a.getClass();
                int iK = zoVar.k(qn8.b);
                try {
                    List list = nn8Var.a;
                    list.getClass();
                    yn8Var.getClass();
                    int size2 = list.size();
                    int iT = length;
                    for (int i4 = 0; i4 < size2; i4++) {
                        iT = md2.t(zoVar, (on8) list.get(i4), iT, j, yn8Var);
                    }
                    if (!fo8Var.j() && i3 != gc1.S(hk9Var)) {
                        if (!pja.d(j) && pja.g(j) < iT + 1 && pja.f(j) > iT) {
                            zoVar.append('\n');
                        }
                        iT++;
                    }
                    i2 = iT;
                    zoVar.h(iJ);
                    i3++;
                    i = 0;
                } finally {
                }
            } catch (Throwable th) {
                zoVar.h(iJ);
                throw th;
            }
        }
        ClipData clipDataNewPlainText = ClipData.newPlainText("plain text", zoVar.l().b);
        clipDataNewPlainText.getClass();
        Object objC = this.b.c(new fa1(clipDataNewPlainText), o1aVar);
        heb hebVar = heb.a;
        xx1 xx1Var = xx1.a;
        if (objC != xx1Var) {
            objC = hebVar;
        }
        return objC == xx1Var ? objC : hebVar;
    }
}
