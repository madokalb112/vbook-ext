package defpackage;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jb5 extends kt1 {
    public qk9 a;
    public ww b;
    public hu4 c;
    public String d;
    public String e;
    public List f;
    public LinkedHashMap s;
    public fv4 t;
    public int u;
    public /* synthetic */ Object v;
    public final /* synthetic */ ob5 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jb5(ob5 ob5Var, kt1 kt1Var) {
        super(kt1Var);
        this.w = ob5Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return ob5.a(this.w, null, this);
    }
}
