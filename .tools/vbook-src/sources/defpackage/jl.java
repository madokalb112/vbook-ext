package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class jl extends o1a implements yb4 {
    public final /* synthetic */ int a = 0;
    public int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(AndroidTextToSpeechService androidTextToSpeechService, String str, int i, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = androidTextToSpeechService;
        this.f = str;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.f;
        switch (i) {
            case 0:
                return new jl((AndroidTextToSpeechService) this.e, (String) obj2, this.c, this.d, jt1Var);
            case 1:
                jl jlVar = new jl((st5) obj2, this.c, this.d, jt1Var);
                jlVar.e = obj;
                return jlVar;
            default:
                return new jl((ww8) this.e, this.c, this.d, (a07) obj2, jt1Var);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((jl) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((jl) create((tw8) obj, (jt1) obj2)).invokeSuspend(hebVar);
            default:
                return ((jl) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x0179, code lost:
    
        if (r0.r(r3, r2, r24) == r7) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0173  */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jl.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(ww8 ww8Var, int i, int i2, a07 a07Var, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = ww8Var;
        this.c = i;
        this.d = i2;
        this.f = a07Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jl(st5 st5Var, int i, int i2, jt1 jt1Var) {
        super(2, jt1Var);
        this.f = st5Var;
        this.c = i;
        this.d = i2;
    }
}
