package defpackage;

import android.content.Context;
import org.publicvalue.multiplatform.oidc.appsupport.HandleRedirectActivity;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class l64 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l64(lc8 lc8Var, int i, jt1 jt1Var) {
        super(2, jt1Var);
        this.a = 23;
        this.c = lc8Var;
        this.b = i;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = 2;
        switch (this.a) {
            case 0:
                return new l64((cx) this.c, jt1Var, 0);
            case 1:
                return new l64((r64) this.c, jt1Var, 1);
            case 2:
                return new l64((s74) this.c, jt1Var, i);
            case 3:
                return new l64((of4) this.c, jt1Var, 3);
            case 4:
                return new l64((HandleRedirectActivity) this.c, jt1Var, 4);
            case 5:
                return new l64((yl4) this.c, jt1Var, 5);
            case 6:
                return new l64((bp4) this.c, jt1Var, 6);
            case 7:
                return new l64((kp4) this.c, jt1Var, 7);
            case 8:
                return new l64((wm) this.c, jt1Var, 8);
            case 9:
                return new l64((bd5) this.c, jt1Var, 9);
            case 10:
                return new l64((pd5) this.c, jt1Var, 10);
            case 11:
                return new l64((wq5) this.c, jt1Var, 11);
            case 12:
                return new l64((rg2) this.c, jt1Var, 12);
            case 13:
                return new l64((p76) this.c, jt1Var, 13);
            case 14:
                return new l64((b96) this.c, jt1Var, 14);
            case 15:
                return new l64((pa6) this.c, jt1Var, 15);
            case 16:
                return new l64((cw6) this.c, jt1Var, 16);
            case 17:
                return new l64((Context) this.c, jt1Var, 17);
            case 18:
                return new l64((my1) this.c, jt1Var, 18);
            case 19:
                l64 l64Var = new l64(i, jt1Var);
                l64Var.c = obj;
                return l64Var;
            case 20:
                return new l64((dc7) this.c, jt1Var, 20);
            case 21:
                return new l64((g18) this.c, jt1Var, 21);
            case 22:
                return new l64((e68) this.c, jt1Var, 22);
            case 23:
                return new l64((lc8) this.c, this.b, jt1Var);
            case 24:
                return new l64((gj8) this.c, jt1Var, 24);
            case 25:
                return new l64((bi1) this.c, jt1Var, 25);
            case 26:
                return new l64((iz8) this.c, jt1Var, 26);
            case 27:
                l64 l64Var2 = new l64((o19) this.c, jt1Var, 27);
                long j = ((eb7) obj).a;
                return l64Var2;
            case 28:
                return new l64((yb9) this.c, jt1Var, 28);
            default:
                return new l64((ec9) this.c, jt1Var, 29);
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 13:
                ((l64) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 23:
                ((l64) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
                break;
            case 27:
                long j = ((eb7) obj).a;
                break;
        }
        return ((l64) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:222:0x045e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x046b  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x048a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:226:0x0469 -> B:220:0x045a). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:228:0x0483 -> B:230:0x0486). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.vc0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2112
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l64.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l64(int i, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = 19;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l64(Object obj, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = obj;
    }
}
