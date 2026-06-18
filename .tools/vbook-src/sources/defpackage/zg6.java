package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zg6 extends kt1 {
    public /* synthetic */ Object A;
    public final /* synthetic */ ah6 B;
    public int C;
    public String a;
    public String b;
    public wa2 c;
    public lm9 d;
    public mm9 e;
    public List f;
    public ArrayList s;
    public Iterator t;
    public cn9 u;
    public List v;
    public boolean w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg6(ah6 ah6Var, kt1 kt1Var) {
        super(kt1Var);
        this.B = ah6Var;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.a(null, null, null, false, this);
    }
}
