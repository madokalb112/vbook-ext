package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ip0 implements fp0 {
    public final m62 a;
    public final cp0 b;

    public ip0(m62 m62Var, cp0 cp0Var) {
        this.a = m62Var;
        this.b = cp0Var;
    }

    public final List a() {
        return gc1.Z(new hq0("google", "Google", "https://www.google.com/search?ie=UTF-8&oe=UTF-8&q=%s"), new hq0("bing", "Bing", "https://www.bing.com/search?q=%s"), new hq0("duckduckgo", "Duckduckgo", "https://duckduckgo.com/?q=%s"), new hq0("baidu", "Baidu", "https://www.baidu.com/s?wd=%s"), new hq0("yandex", "Yandex", "https://yandex.ru/yandsearch?lr=21411&text=%s"));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(defpackage.kt1 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.gp0
            if (r0 == 0) goto L13
            r0 = r8
            gp0 r0 = (defpackage.gp0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            gp0 r0 = new gp0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.b
            int r1 = r0.d
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L2e
            if (r1 != r3) goto L28
            java.lang.String r7 = r0.a
            defpackage.e11.e0(r8)
            goto L50
        L28:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r7)
            return r2
        L2e:
            defpackage.e11.e0(r8)
            cp0 r8 = r7.b
            da7 r1 = r8.c
            ni5[] r4 = defpackage.cp0.d
            r5 = 2
            r4 = r4[r5]
            java.lang.Object r8 = r1.c(r4, r8)
            java.lang.String r8 = (java.lang.String) r8
            r0.a = r8
            r0.d = r3
            java.util.List r7 = r7.a()
            xx1 r0 = defpackage.xx1.a
            if (r7 != r0) goto L4d
            return r0
        L4d:
            r6 = r8
            r8 = r7
            r7 = r6
        L50:
            java.util.List r8 = (java.util.List) r8
            java.util.Iterator r0 = r8.iterator()
        L56:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L6c
            java.lang.Object r1 = r0.next()
            r3 = r1
            hq0 r3 = (defpackage.hq0) r3
            java.lang.String r3 = r3.a
            boolean r3 = r3.equals(r7)
            if (r3 == 0) goto L56
            r2 = r1
        L6c:
            hq0 r2 = (defpackage.hq0) r2
            if (r2 != 0) goto L77
            java.lang.Object r7 = defpackage.fc1.x0(r8)
            hq0 r7 = (defpackage.hq0) r7
            return r7
        L77:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ip0.b(kt1):java.lang.Object");
    }
}
