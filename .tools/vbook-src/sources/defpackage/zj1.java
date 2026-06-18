package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final /* synthetic */ class zj1 implements bc4 {
    public final /* synthetic */ int a;

    @Override // defpackage.bc4
    public final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i = this.a;
        int i2 = Token.CASE;
        heb hebVar = heb.a;
        switch (i) {
            case 0:
                dda ddaVar = (dda) obj;
                rca rcaVar = (rca) obj2;
                ib4 ib4Var = (ib4) obj3;
                dd4 dd4Var = (dd4) obj4;
                int iIntValue = ((Integer) obj5).intValue();
                int i3 = (iIntValue & 6) == 0 ? iIntValue | ((iIntValue & 8) == 0 ? dd4Var.f(ddaVar) : dd4Var.h(ddaVar) ? 4 : 2) : iIntValue;
                if ((iIntValue & 48) == 0) {
                    i3 |= (iIntValue & 64) == 0 ? dd4Var.f(rcaVar) : dd4Var.h(rcaVar) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    if (dd4Var.h(ib4Var)) {
                        i2 = 256;
                    }
                    i3 |= i2;
                }
                if (!dd4Var.V(i3 & 1, (i3 & 1171) != 1170)) {
                    dd4Var.Y();
                } else {
                    ak2.c(ddaVar, rcaVar, ib4Var, dd4Var, i3 & 1022);
                }
                break;
            case 1:
                dda ddaVar2 = (dda) obj;
                rca rcaVar2 = (rca) obj2;
                ib4 ib4Var2 = (ib4) obj3;
                dd4 dd4Var2 = (dd4) obj4;
                int iIntValue2 = ((Integer) obj5).intValue();
                int i4 = (iIntValue2 & 6) == 0 ? iIntValue2 | ((iIntValue2 & 8) == 0 ? dd4Var2.f(ddaVar2) : dd4Var2.h(ddaVar2) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i4 |= (iIntValue2 & 64) == 0 ? dd4Var2.f(rcaVar2) : dd4Var2.h(rcaVar2) ? 32 : 16;
                }
                if ((iIntValue2 & 384) == 0) {
                    if (dd4Var2.h(ib4Var2)) {
                        i2 = 256;
                    }
                    i4 |= i2;
                }
                if (!dd4Var2.V(i4 & 1, (i4 & 1171) != 1170)) {
                    dd4Var2.Y();
                } else {
                    ak2.c(ddaVar2, rcaVar2, ib4Var2, dd4Var2, i4 & 1022);
                }
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                pja pjaVar = (pja) obj5;
                String string = ((CharSequence) obj4).subSequence(pja.g(pjaVar.a), pja.f(pjaVar.a)).toString();
                Intent intentPutExtra = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain").putExtra("android.intent.extra.PROCESS_TEXT_READONLY", zBooleanValue);
                ActivityInfo activityInfo = ((ResolveInfo) obj2).activityInfo;
                Intent className = intentPutExtra.setClassName(activityInfo.packageName, activityInfo.name);
                className.putExtra("android.intent.extra.PROCESS_TEXT", string);
                ((Context) obj).startActivity(className);
                break;
        }
        return hebVar;
    }
}
