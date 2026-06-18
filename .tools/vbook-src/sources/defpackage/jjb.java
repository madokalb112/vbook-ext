package defpackage;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jjb {
    public static final Pattern b = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static jjb c;
    public final p38 a;

    public jjb(p38 p38Var) {
        this.a = p38Var;
    }

    public final boolean a(r80 r80Var) {
        if (TextUtils.isEmpty(r80Var.c)) {
            return true;
        }
        long j = r80Var.f + r80Var.e;
        this.a.getClass();
        return j < (System.currentTimeMillis() / 1000) + 3600;
    }
}
