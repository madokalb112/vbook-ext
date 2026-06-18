package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class um implements kb4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ um(ArrayList arrayList, pg8 pg8Var, List list, int i, jq5 jq5Var) {
        this.a = 13;
        this.c = arrayList;
        this.d = pg8Var;
        this.b = list;
        this.e = jq5Var;
    }

    private final Object a(Object obj) throws Exception {
        Set setX0;
        se8 se8Var;
        lm8 lm8Var = (lm8) this.c;
        rd7 rd7Var = (rd7) this.d;
        uf5 uf5Var = rd7Var.b;
        m62 m62Var = rd7Var.a;
        yn7 yn7Var = (yn7) this.b;
        yn7 yn7Var2 = (yn7) this.e;
        ((u2b) obj).getClass();
        Throwable th = null;
        if (lm8Var == lm8.a) {
            b92 b92Var = m62Var.c;
            ((qj) ((yf1) b92Var).a).q(1647723763, "DELETE FROM DbBookmark", (kb4) null);
            b92Var.w(1647723763, new hu1(19));
        }
        lm8 lm8Var2 = lm8.c;
        if (lm8Var == lm8Var2) {
            b92 b92Var2 = m62Var.c;
            b92Var2.getClass();
            e92 e92Var = e92.a;
            qj qjVar = (qj) ((yf1) b92Var2).a;
            d92 d92Var = new d92(b92Var2, 0);
            qjVar.getClass();
            List listC = new af9(-1870240114, new String[]{"DbBookmark"}, qjVar, "DbBookmark.sq", "getAll", "SELECT DbBookmark.id, DbBookmark.bookId, DbBookmark.chapterIndex, DbBookmark.chapterName, DbBookmark.type, DbBookmark.content, DbBookmark.description, DbBookmark.color, DbBookmark.startPosition, DbBookmark.endPosition, DbBookmark.createAt\nFROM DbBookmark\nORDER BY createAt DESC", d92Var).c();
            ArrayList arrayList = new ArrayList(gc1.M(listC, 10));
            Iterator it = listC.iterator();
            while (it.hasNext()) {
                arrayList.add(rd7.a((c92) it.next()));
            }
            setX0 = fc1.X0(arrayList);
        } else {
            setX0 = sc3.a;
        }
        lr3 lr3Var = hx3.a;
        lr3Var.getClass();
        if (yn7Var.a.exists()) {
            se8Var = new se8(lr3Var.y(yn7Var));
            try {
                uf5Var.getClass();
                for (xc7 xc7Var : (hp1) fx1.W(uf5Var, se8Var, xc7.Companion.serializer())) {
                    xc7Var.getClass();
                    String strP = wm9.p();
                    String str = xc7Var.b;
                    int i = xc7Var.e;
                    String str2 = xc7Var.d;
                    String str3 = xc7Var.c;
                    long j = (long) xc7Var.f;
                    c92 c92Var = new c92(strP, str, i, str2, 0, str3, "", "", j, j, xc7Var.g);
                    if (lm8Var != lm8Var2 || !setX0.contains(rd7.a(c92Var))) {
                        m62Var.c.g0(c92Var);
                    }
                    th = null;
                }
                lc5.U(se8Var, th);
            } finally {
            }
        }
        lr3 lr3Var2 = hx3.a;
        lr3Var2.getClass();
        if (yn7Var2.a.exists()) {
            se8Var = new se8(lr3Var2.y(yn7Var2));
            try {
                uf5Var.getClass();
                for (xd7 xd7Var : (hp1) fx1.W(uf5Var, se8Var, xd7.Companion.serializer())) {
                    xd7Var.getClass();
                    String strP2 = wm9.p();
                    String str4 = xd7Var.b;
                    int i2 = xd7Var.e;
                    String str5 = xd7Var.d;
                    String str6 = xd7Var.c;
                    long j2 = (long) xd7Var.f;
                    c92 c92Var2 = new c92(strP2, str4, i2, str5, 1, str6, str5, "", j2, j2, xd7Var.g);
                    if (lm8Var != lm8Var2 || !setX0.contains(rd7.a(c92Var2))) {
                        m62Var.c.g0(c92Var2);
                    }
                }
                lc5.U(se8Var, null);
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
        return heb.a;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01a5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Object b(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.b(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03f3  */
    @Override // defpackage.kb4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invoke(java.lang.Object r37) {
        /*
            Method dump skipped, instruction units count: 3022
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um.invoke(java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ um(Object obj, kb4 kb4Var, ub4 ub4Var, ub4 ub4Var2, int i) {
        this.a = i;
        this.c = obj;
        this.b = kb4Var;
        this.d = ub4Var;
        this.e = ub4Var2;
    }

    public /* synthetic */ um(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
        this.e = obj4;
    }

    public /* synthetic */ um(a07 a07Var, pj8 pj8Var, ub4 ub4Var, kb4 kb4Var, int i) {
        this.a = i;
        this.c = a07Var;
        this.d = pj8Var;
        this.e = ub4Var;
        this.b = kb4Var;
    }
}
