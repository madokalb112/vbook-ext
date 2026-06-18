package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class il extends o1a implements yb4 {
    public final /* synthetic */ int a = 1;
    public int b;
    public int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(AndroidTextToSpeechService androidTextToSpeechService, int i, int i2, int i3, jt1 jt1Var) {
        super(2, jt1Var);
        this.e = androidTextToSpeechService;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        Object obj2 = this.e;
        switch (i) {
            case 0:
                return new il((AndroidTextToSpeechService) obj2, this.b, this.c, this.d, jt1Var);
            default:
                return new il(this.d, jt1Var, (i45) obj2);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
            case 0:
                ((il) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
                return hebVar;
            default:
                return ((il) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6 A[LOOP:0: B:35:0x00d6->B:51:?, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public il(int i, jt1 jt1Var, i45 i45Var) {
        super(2, jt1Var);
        this.e = i45Var;
        this.d = i;
    }
}
