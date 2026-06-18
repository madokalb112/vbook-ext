package defpackage;

import android.content.Context;
import android.content.Intent;
import com.reader.data.AndroidActionReceiver;
import com.reader.data.server.AndroidTestServerService;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class z79 extends o1a implements yb4 {
    public final /* synthetic */ int a;
    public int b;
    public final /* synthetic */ b89 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z79(b89 b89Var, jt1 jt1Var, int i) {
        super(2, jt1Var);
        this.a = i;
        this.c = b89Var;
    }

    @Override // defpackage.vc0
    public final jt1 create(Object obj, jt1 jt1Var) {
        int i = this.a;
        b89 b89Var = this.c;
        switch (i) {
            case 0:
                return new z79(b89Var, jt1Var, 0);
            case 1:
                return new z79(b89Var, jt1Var, 1);
            case 2:
                return new z79(b89Var, jt1Var, 2);
            default:
                return new z79(b89Var, jt1Var, 3);
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
        return ((z79) create(vx1Var, jt1Var)).invokeSuspend(hebVar);
    }

    @Override // defpackage.vc0
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object value;
        int i = this.a;
        xx1 xx1Var = xx1.a;
        b89 b89Var = this.c;
        heb hebVar = heb.a;
        int i2 = 1;
        switch (i) {
            case 0:
                int i3 = this.b;
                if (i3 == 0) {
                    e11.e0(obj);
                    g79 g79Var = b89Var.c;
                    this.b = 1;
                    ((i79) g79Var).a.L.e(qt.T[37], Boolean.TRUE);
                    if (hebVar == xx1Var) {
                        return xx1Var;
                    }
                } else {
                    if (i3 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                fr9 fr9Var = b89Var.d;
                if (fr9Var != null) {
                    do {
                        value = fr9Var.getValue();
                    } while (!fr9Var.j(value, o79.a((o79) value, true, false, null, null, 30)));
                }
                b89Var.i(b89Var.e, w69.a);
                return hebVar;
            case 1:
                int i4 = this.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                fr9 fr9Var2 = ((i79) b89Var.c).c;
                a89 a89Var = new a89(b89Var, 0);
                this.b = 1;
                fr9Var2.a(a89Var, this);
                return xx1Var;
            case 2:
                g79 g79Var2 = b89Var.c;
                int i5 = this.b;
                if (i5 == 0) {
                    e11.e0(obj);
                    this.b = 1;
                    ((i79) g79Var2).getClass();
                    obj = cm5.a;
                    if (obj != xx1Var) {
                    }
                    return xx1Var;
                }
                if (i5 != 1) {
                    if (i5 == 2) {
                        e11.e0(obj);
                        return hebVar;
                    }
                    gp.j("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                e11.e0(obj);
                b07 b07Var = (b07) ((i79) g79Var2).d.getValue();
                a89 a89Var2 = new a89(b89Var, i2);
                this.b = 2;
                b07Var.a(new pw5(a89Var2, 12), this);
                return xx1Var;
            default:
                int i6 = this.b;
                if (i6 == 0) {
                    e11.e0(obj);
                    boolean z = ((o79) b89Var.d.getValue()).b;
                    g79 g79Var3 = b89Var.c;
                    if (z) {
                        this.b = 1;
                        qaa qaaVar = ((i79) g79Var3).b;
                        fr9 fr9Var3 = AndroidTestServerService.d;
                        Context context = qaaVar.a;
                        Intent intent = new Intent(context, (Class<?>) AndroidActionReceiver.class);
                        intent.setAction("com.reader.action.test_server.STOP");
                        context.sendBroadcast(intent);
                        if (hebVar == xx1Var) {
                            return xx1Var;
                        }
                    } else {
                        i79 i79Var = (i79) g79Var3;
                        i79Var.getClass();
                        qaa qaaVar2 = i79Var.b;
                        fr9 fr9Var4 = AndroidTestServerService.d;
                        Context context2 = qaaVar2.a;
                        Intent intent2 = new Intent(context2, (Class<?>) AndroidTestServerService.class);
                        intent2.setAction("com.reader.action.test_server.START");
                        intent2.putExtra("extra_port", "8080");
                        hs1.startForegroundService(context2, intent2);
                    }
                } else {
                    if (i6 != 1) {
                        gp.j("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    e11.e0(obj);
                }
                return hebVar;
        }
    }
}
