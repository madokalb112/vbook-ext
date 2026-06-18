package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class cl extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ AndroidTextToSpeechService c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl(AndroidTextToSpeechService androidTextToSpeechService, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = androidTextToSpeechService;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        AndroidTextToSpeechService androidTextToSpeechService = this.c;
        switch (i) {
            case 0:
                return new cl(androidTextToSpeechService, jt1Var, 0);
            case 1:
                return new cl(androidTextToSpeechService, jt1Var, 1);
            case 2:
                return new cl(androidTextToSpeechService, jt1Var, 2);
            case 3:
                return new cl(androidTextToSpeechService, jt1Var, 3);
            case 4:
                return new cl(androidTextToSpeechService, jt1Var, 4);
            case 5:
                return new cl(androidTextToSpeechService, jt1Var, 5);
            case 6:
                return new cl(androidTextToSpeechService, jt1Var, 6);
            case 7:
                return new cl(androidTextToSpeechService, jt1Var, 7);
            case 8:
                return new cl(androidTextToSpeechService, jt1Var, 8);
            case 9:
                return new cl(androidTextToSpeechService, jt1Var, 9);
            default:
                return new cl(androidTextToSpeechService, jt1Var, 10);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        heb hebVar = heb.a;
        vx1 vx1Var = (vx1) obj;
        jt1 jt1Var = (jt1) obj2;
        switch (i) {
        }
        return ((cl) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0153, code lost:
    
        if (r10.j(r9) == r6) goto L87;
     */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 550
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cl.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
