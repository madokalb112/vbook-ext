package defpackage;

import com.reader.data.reader.text.core.tts.AndroidTextToSpeechService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class el extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el(Object obj, float f, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.d = obj;
        this.c = f;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        float f = this.c;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                return new el((AndroidTextToSpeechService) obj2, f, jt1Var, 0);
            case 1:
                return new el((pt1) obj2, f, jt1Var, 1);
            default:
                return new el((lmb) obj2, f, jt1Var, 2);
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
        return ((el) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        heb hebVar = heb.a;
        float f = this.c;
        Object obj2 = this.d;
        xx1 xx1Var = xx1.a;
        switch (i) {
            case 0:
                int i2 = this.b;
                if (i2 == 0) {
                    e11.e0(obj);
                    AndroidTextToSpeechService androidTextToSpeechService = (AndroidTextToSpeechService) obj2;
                    androidTextToSpeechService.C = false;
                    k9b k9bVar = androidTextToSpeechService.z;
                    if (k9bVar != null) {
                        this.b = 1;
                        if (k9bVar.n(f, this) == xx1Var) {
                        }
                    }
                } else if (i2 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            case 1:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    st5 st5Var = ((pt1) obj2).b;
                    this.b = 1;
                    if (yn2.Q(st5Var, f, this) == xx1Var) {
                    }
                } else if (i3 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
            default:
                int i4 = this.b;
                if (i4 == 0) {
                    e11.e0(obj);
                    st5 st5Var2 = ((lmb) obj2).b;
                    this.b = 1;
                    if (yn2.Q(st5Var2, f, this) == xx1Var) {
                    }
                } else if (i4 != 1) {
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                } else {
                    e11.e0(obj);
                }
                break;
        }
        return xx1Var;
    }
}
