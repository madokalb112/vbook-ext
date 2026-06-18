package defpackage;

import com.reader.data.updates.impl.bookupdate.AndroidBookUpdateWorker;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class lc extends kt1 {
    public /* synthetic */ Object a;
    public final /* synthetic */ AndroidBookUpdateWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lc(AndroidBookUpdateWorker androidBookUpdateWorker, kt1 kt1Var) {
        super(kt1Var);
        this.b = androidBookUpdateWorker;
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.c(this);
    }
}
