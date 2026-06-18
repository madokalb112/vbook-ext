package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class goa extends kt1 {
    public String a;
    public zv5 b;
    public mc3 c;
    public Serializable d;
    public xl7[] e;
    public Object f;
    public int s;
    public boolean t;
    public /* synthetic */ Object u;
    public final /* synthetic */ coa v;
    public int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public goa(coa coaVar, jt1 jt1Var) {
        super(jt1Var);
        this.v = coaVar;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.u = obj;
        this.w |= Integer.MIN_VALUE;
        return this.v.a(null, this);
    }
}
