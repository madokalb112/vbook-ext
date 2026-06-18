package defpackage;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public abstract class vc8 extends zi1 {
    public static final /* synthetic */ int K = 0;
    public final nc1 H = new nc1(ug8.a(zo9.class), new uc8(this, 1), new uc8(this, 0), new uc8(this, 2));
    public final wh2 I = new wh2();
    public final zc J = new zc(0);

    public static void l(Intent intent) {
        Uri data = intent.getData();
        String action = intent.getAction();
        ke2 ke2Var = ke2.a;
        if (action != null) {
            int iHashCode = action.hashCode();
            if (iHashCode != -1173264947) {
                if (iHashCode == -1173171990 && action.equals("android.intent.action.VIEW")) {
                    if (data != null) {
                        ir0 ir0Var = ye2.a;
                        String string = data.toString();
                        string.getClass();
                        ye2.a(ke2Var, string);
                        intent.setData(null);
                        return;
                    }
                    return;
                }
            } else if (action.equals("android.intent.action.SEND")) {
                String type = intent.getType();
                if (type != null && type.hashCode() == 817335912 && type.equals("text/plain")) {
                    ir0 ir0Var2 = ye2.a;
                    String stringExtra = intent.getStringExtra("android.intent.extra.TEXT");
                    if (stringExtra == null) {
                        stringExtra = "";
                    }
                    ye2.a(ke2.b, stringExtra);
                    return;
                }
                return;
            }
        }
        if (lc5.Q(data != null ? data.getScheme() : null, "vbookapp")) {
            ir0 ir0Var3 = ye2.a;
            String string2 = data.toString();
            string2.getClass();
            ye2.a(ke2Var, string2);
            intent.setData(null);
        }
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getClass();
        wh2 wh2Var = this.I;
        wh2Var.getClass();
        List<ej5> listR0 = fc1.R0(new k54(19), wh2Var.a);
        if (!listR0.isEmpty()) {
            for (ej5 ej5Var : listR0) {
                ej5Var.getClass();
                if (((Boolean) ej5Var.b.getValue()).booleanValue() ? ((Boolean) ((kb4) ej5Var.c.getValue()).invoke(new cj5(keyEvent))).booleanValue() : false) {
                    return true;
                }
            }
        }
        return super/*yi1*/.dispatchKeyEvent(keyEvent);
    }

    public final void m(Bundle bundle) {
        super.onCreate(bundle);
        WeakReference weakReference = vv3.a;
        xi1 xi1Var = ((zi1) this).u;
        xi1Var.getClass();
        vv3.a = new WeakReference(xi1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        vo9 vo9Var = Build.VERSION.SDK_INT >= 31 ? new vo9(this) : new wo9(this);
        vo9Var.s();
        m(bundle);
        zc zcVar = this.J;
        zcVar.getClass();
        ((yi1) this).a.a(new yc(0, zcVar, this));
        Context applicationContext = getApplicationContext();
        applicationContext.getClass();
        b52.a(applicationContext);
        vo9Var.B(new y5(this, 29));
        rj1 rj1Var = new rj1(new tc8(this, 0), true, 1121999615);
        ViewGroup.LayoutParams layoutParams = aj1.a;
        nl1 childAt = ((ViewGroup) getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        nl1 nl1Var = childAt instanceof nl1 ? childAt : null;
        if (nl1Var != null) {
            nl1Var.setParentCompositionContext((km1) null);
            nl1Var.setContent(rj1Var);
        } else {
            nl1 nl1Var2 = new nl1(this);
            nl1Var2.setParentCompositionContext((km1) null);
            nl1Var2.setContent(rj1Var);
            View decorView = getWindow().getDecorView();
            if (zk9.n(decorView) == null) {
                decorView.setTag(2131362476, this);
            }
            if (ql9.u(decorView) == null) {
                decorView.setTag(2131362480, this);
            }
            if (gl9.g(decorView) == null) {
                decorView.setTag(2131362479, this);
            }
            setContentView(nl1Var2, aj1.a);
        }
        Intent intent = getIntent();
        intent.getClass();
        l(intent);
    }

    public final void onNewIntent(Intent intent) {
        intent.getClass();
        super.onNewIntent(intent);
        l(intent);
    }
}
