package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ap8 {
    public final Context b;
    public final String c;
    public Executor f;
    public Executor g;
    public a09 h;
    public boolean i;
    public boolean q;
    public boolean r;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final bp8 j = bp8.a;
    public final long k = -1;
    public final cp8 l = new cp8(0);
    public final LinkedHashSet m = new LinkedHashSet();
    public final LinkedHashSet n = new LinkedHashSet();
    public final ArrayList o = new ArrayList();
    public boolean p = true;
    public final boolean s = true;
    public final a91 a = ug8.a(WorkDatabase.class);

    public ap8(Context context, String str) {
        this.b = context;
        this.c = str;
    }

    public final void a(bh6... bh6VarArr) {
        for (bh6 bh6Var : bh6VarArr) {
            Integer numValueOf = Integer.valueOf(bh6Var.a);
            LinkedHashSet linkedHashSet = this.n;
            linkedHashSet.add(numValueOf);
            linkedHashSet.add(Integer.valueOf(bh6Var.b));
        }
        bh6[] bh6VarArr2 = (bh6[]) Arrays.copyOf(bh6VarArr, bh6VarArr.length);
        cp8 cp8Var = this.l;
        cp8Var.getClass();
        for (bh6 bh6Var2 : bh6VarArr2) {
            cp8Var.a(bh6Var2);
        }
    }
}
