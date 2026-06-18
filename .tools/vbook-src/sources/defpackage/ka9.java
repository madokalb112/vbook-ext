package defpackage;

import android.content.Context;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ka9 {
    public final if4 a;
    public final c7 b;
    public final Context c;
    public final String d;
    public final d6a e;
    public final Set f;

    public ka9(Context context, String str, Set set, if4 if4Var, c7 c7Var) {
        context.getClass();
        set.getClass();
        e67 e67Var = new e67(14, context, str);
        this.a = if4Var;
        this.b = c7Var;
        this.c = context;
        this.d = str;
        this.e = new d6a(e67Var);
        this.f = set == ma9.a ? null : fc1.d1(set);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r5, defpackage.kt1 r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.ja9
            if (r0 == 0) goto L13
            r0 = r6
            ja9 r0 = (defpackage.ja9) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ja9 r0 = new ja9
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.a
            int r1 = r0.c
            r2 = 1
            if (r1 == 0) goto L2c
            if (r1 != r2) goto L25
            defpackage.e11.e0(r6)
            goto L3c
        L25:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            gp.j(r4)
            r4 = 0
            return r4
        L2c:
            defpackage.e11.e0(r6)
            r0.c = r2
            if4 r6 = r4.a
            java.lang.Object r6 = r6.invoke(r5, r0)
            xx1 r5 = defpackage.xx1.a
            if (r6 != r5) goto L3c
            return r5
        L3c:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r5 = r6.booleanValue()
            if (r5 != 0) goto L47
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L47:
            d6a r5 = r4.e
            r6 = 0
            java.util.Set r4 = r4.f
            if (r4 != 0) goto L64
            java.lang.Object r4 = r5.getValue()
            android.content.SharedPreferences r4 = (android.content.SharedPreferences) r4
            java.util.Map r4 = r4.getAll()
            r4.getClass()
            boolean r4 = r4.isEmpty()
            if (r4 != 0) goto L62
            goto L90
        L62:
            r2 = r6
            goto L90
        L64:
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.lang.Object r5 = r5.getValue()
            android.content.SharedPreferences r5 = (android.content.SharedPreferences) r5
            boolean r0 = r4 instanceof java.util.Collection
            if (r0 == 0) goto L7a
            r0 = r4
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L7a
            goto L62
        L7a:
            java.util.Iterator r4 = r4.iterator()
        L7e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L62
            java.lang.Object r0 = r4.next()
            java.lang.String r0 = (java.lang.String) r0
            boolean r0 = r5.contains(r0)
            if (r0 == 0) goto L7e
        L90:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r2)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka9.a(java.lang.Object, kt1):java.lang.Object");
    }
}
