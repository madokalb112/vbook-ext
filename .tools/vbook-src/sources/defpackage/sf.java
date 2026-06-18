package defpackage;

import com.reader.data.download.impl.AndroidDownloadService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class sf extends o1a implements yb4 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ AndroidDownloadService c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ int f;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sf(AndroidDownloadService androidDownloadService, String str, int i, int i2, boolean z, jt1 jt1Var) {
        super(2, jt1Var);
        this.c = androidDownloadService;
        this.d = str;
        this.e = i;
        this.f = i2;
        this.s = z;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        sf sfVar = new sf(this.c, this.d, this.e, this.f, this.s, jt1Var);
        sfVar.b = obj;
        return sfVar;
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) {
        return ((sf) create((vx1) obj, (jt1) obj2)).invokeSuspend(heb.a);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) {
        sf sfVar;
        Throwable th;
        h13 h13VarB;
        Object pm8Var;
        xx1 xx1Var = xx1.a;
        int i = this.a;
        if (i == 0) {
            e11.e0(obj);
            AndroidDownloadService androidDownloadService = this.c;
            String str = this.d;
            int i2 = this.e;
            int i3 = this.f;
            boolean z = this.s;
            try {
                boolean z2 = AndroidDownloadService.s;
                h13VarB = androidDownloadService.b();
                try {
                    this.b = null;
                    this.a = 1;
                    sfVar = this;
                } catch (Throwable th2) {
                    th = th2;
                    sfVar = this;
                    th = th;
                    pm8Var = new pm8(th);
                }
            } catch (Throwable th3) {
                sfVar = this;
                th = th3;
                pm8Var = new pm8(th);
            }
            try {
                if (h13VarB.h(str, i2, i3, z, sfVar) == xx1Var) {
                    return xx1Var;
                }
                pm8Var = heb.a;
            } catch (Throwable th4) {
                th = th4;
                th = th;
                pm8Var = new pm8(th);
            }
        } else {
            if (i != 1) {
                gp.j("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            try {
                e11.e0(obj);
                sfVar = this;
                pm8Var = heb.a;
            } catch (Throwable th5) {
                th = th5;
                sfVar = this;
                pm8Var = new pm8(th);
            }
        }
        AndroidDownloadService androidDownloadService2 = sfVar.c;
        String str2 = sfVar.d;
        if (!(pm8Var instanceof pm8)) {
            synchronized (androidDownloadService2.e) {
                try {
                    yd5 yd5Var = (yd5) androidDownloadService2.f.get(str2);
                    if (yd5Var != null) {
                        yd5Var.cancel(null);
                    }
                    androidDownloadService2.f.put(str2, ah1.J(androidDownloadService2.c, null, null, new w(androidDownloadService2, str2, null, 9), 3));
                } catch (Throwable th6) {
                    throw th6;
                }
            }
        }
        return heb.a;
    }
}
