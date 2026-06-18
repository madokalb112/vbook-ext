package defpackage;

import android.content.res.Resources;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zt extends qtb {
    public final et c;
    public final aw5 d;
    public final g79 e;
    public final nra f;
    public final vfb s;
    public final fr9 t;
    public final fr9 u;

    public zt(et etVar, aw5 aw5Var, g79 g79Var, nra nraVar, vfb vfbVar) {
        this.c = etVar;
        this.d = aw5Var;
        this.e = g79Var;
        this.f = nraVar;
        this.s = vfbVar;
        i36 i36Var = i36.b;
        int i = 0;
        Locale localeB = i36.d(LocaleList.getAdjustedDefault()).b(0);
        if (localeB == null && (localeB = Resources.getSystem().getConfiguration().getLocales().get(0)) == null) {
            localeB = Locale.getDefault();
        }
        localeB.getClass();
        String languageTag = localeB.toLanguageTag();
        languageTag.getClass();
        this.t = gr9.a(new tt(languageTag, true));
        this.u = gr9.a(new dsa(lc1.i, xr.c, 0, false, false, false, 0, 0.0d, 1.0f, 1.0f, c64.a, 0, "", 0.35f));
        za1 za1VarA = vtb.a(this);
        aj2 aj2Var = rw2.a;
        nh2 nh2Var = nh2.c;
        jt1 jt1Var = null;
        g(za1VarA, nh2Var, new ut(this, null));
        g(vtb.a(this), nh2Var, new vt(this, jt1Var, i));
        g(vtb.a(this), nh2Var, new vt(this, jt1Var, 1));
    }
}
