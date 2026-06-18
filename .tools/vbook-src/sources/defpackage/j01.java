package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class j01 extends kt1 {
    public String a;
    public Object b;
    public a82 c;
    public String d;
    public String e;
    public String f;
    public String s;
    public ArrayList t;
    public long u;
    public /* synthetic */ Object v;
    public final /* synthetic */ s16 w;
    public int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j01(s16 s16Var, kt1 kt1Var) {
        super(kt1Var);
        this.w = s16Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.x |= Integer.MIN_VALUE;
        return this.w.h(null, null, this);
    }
}
