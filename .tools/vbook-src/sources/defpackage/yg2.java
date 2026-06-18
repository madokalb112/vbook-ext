package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class yg2 implements al4, bl4 {
    public final ep5 a;
    public final Context b;
    public final s58 c;
    public final Set d;
    public final Executor e;

    public yg2(Context context, String str, Set set, s58 s58Var, Executor executor) {
        this.a = new ep5(new nj1(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = s58Var;
        this.b = context;
    }

    public final void a() {
        if (this.d.size() <= 0) {
            Tasks.forResult((Object) null);
        } else if (!xg9.j(this.b)) {
            Tasks.forResult((Object) null);
        } else {
            Tasks.call(this.e, new xg2(this, 1));
        }
    }
}
