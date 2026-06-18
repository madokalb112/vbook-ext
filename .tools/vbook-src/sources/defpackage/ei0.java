package defpackage;

import android.util.Log;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ei0 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei0(jt1 jt1Var, Object obj) {
        super(2, jt1Var);
        this.a = 1;
        this.b = obj;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = 2;
        switch (this.a) {
            case 0:
                ei0 ei0Var = new ei0(i, 0, jt1Var);
                ei0Var.b = obj;
                return ei0Var;
            case 1:
                return new ei0(jt1Var, this.b);
            case 2:
                ei0 ei0Var2 = new ei0(i, i, jt1Var);
                ei0Var2.b = obj;
                return ei0Var2;
            case 3:
                ei0 ei0Var3 = new ei0(i, 3, jt1Var);
                ei0Var3.b = obj;
                return ei0Var3;
            case 4:
                ei0 ei0Var4 = new ei0(i, 4, jt1Var);
                ei0Var4.b = obj;
                return ei0Var4;
            case 5:
                ei0 ei0Var5 = new ei0(i, 5, jt1Var);
                ei0Var5.b = obj;
                return ei0Var5;
            case 6:
                ei0 ei0Var6 = new ei0(i, 6, jt1Var);
                ei0Var6.b = obj;
                return ei0Var6;
            case 7:
                ei0 ei0Var7 = new ei0(i, 7, jt1Var);
                ei0Var7.b = obj;
                return ei0Var7;
            default:
                ei0 ei0Var8 = new ei0(i, 8, jt1Var);
                ei0Var8.b = obj;
                return ei0Var8;
        }
    }

    @Override // defpackage.yb4
    public final Object invoke(Object obj, Object obj2) throws IOException {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                return ((ei0) create((gv4) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 1:
                return ((ei0) create((vx1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 2:
                ((ei0) create((kb5) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            case 3:
                return ((ei0) create((ar9) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 4:
                return ((ei0) create((wh7) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 5:
                return ((ei0) create((oo1) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 6:
                return ((ei0) create((cf8) obj, (jt1) obj2)).invokeSuspend(hebVar);
            case 7:
                ((ei0) create((String) obj, (jt1) obj2)).invokeSuspend(hebVar);
                return hebVar;
            default:
                return ((ei0) create((gb9) obj, (jt1) obj2)).invokeSuspend(hebVar);
        }
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws IOException {
        int i = this.a;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                gv4 gv4Var = (gv4) this.b;
                e11.e0(obj);
                h88 h88Var = (h88) gv4Var.p0().c().getAttributes().e(fi0.b);
                if (h88Var == null) {
                    return null;
                }
                return bx1.Q(gv4Var.p0(), new f0(h88Var, 8)).d();
            case 1:
                e11.e0(obj);
                ie8 ie8Var = new ie8(new us0(1, (ByteBuffer) this.b));
                try {
                    byte[] bArrI = ie8Var.I();
                    ie8Var.close();
                    return bArrI;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        kl8.S(ie8Var, th);
                        throw th2;
                    }
                }
            case 2:
                kb5 kb5Var = (kb5) this.b;
                e11.e0(obj);
                lw1.Q(kb5Var, xf5.b(y86.P(new xl7("code", new Integer(Context.VERSION_ES6)), new xl7("data", kr2.c()))).toString());
                return hebVar;
            case 3:
                e11.e0(obj);
                return Boolean.valueOf(!(((ar9) this.b) instanceof wx3));
            case 4:
                wh7 wh7Var = (wh7) this.b;
                e11.e0(obj);
                return Boolean.valueOf(wh7Var != null);
            case 5:
                e11.e0(obj);
                return Boolean.valueOf(((oo1) this.b) instanceof zn1);
            case 6:
                e11.e0(obj);
                return Boolean.valueOf(((cf8) this.b) == cf8.a);
            case 7:
                e11.e0(obj);
                Log.e("FirebaseSessions", "Error failed to fetch the remote configs: " + ((String) this.b));
                return hebVar;
            default:
                e11.e0(obj);
                return Boolean.valueOf(((gb9) this.b) != gb9.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ei0(int i, int i2, jt1 jt1Var) {
        super(i, jt1Var);
        this.a = i2;
    }
}
