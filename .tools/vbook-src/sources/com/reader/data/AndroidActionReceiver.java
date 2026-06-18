package com.reader.data;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import defpackage.a13;
import defpackage.c13;
import defpackage.d13;
import defpackage.d6a;
import defpackage.hla;
import defpackage.ila;
import defpackage.jla;
import defpackage.kla;
import defpackage.lla;
import defpackage.nla;
import defpackage.ola;
import defpackage.paa;
import defpackage.pla;
import defpackage.q39;
import defpackage.rw1;
import defpackage.vg3;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class AndroidActionReceiver extends BroadcastReceiver {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String action;
        if (intent == null || (action = intent.getAction()) == null) {
            return;
        }
        switch (action.hashCode()) {
            case -1962111802:
                if (!action.equals("com.reader.action.download.CANCEL")) {
                    return;
                }
                break;
            case -1936488279:
                if (action.equals("com.reader.action.tts.FAST_REWIND")) {
                    d6a d6aVar = vg3.a;
                    vg3.a(jla.a);
                    return;
                }
                return;
            case -1679625097:
                if (action.equals("com.reader.action.tts.FAST_FORWARD")) {
                    d6a d6aVar2 = vg3.a;
                    vg3.a(ila.a);
                    return;
                }
                return;
            case -1528813959:
                if (!action.equals("com.reader.action.download.RESUME")) {
                    return;
                }
                break;
            case -1468722171:
                if (action.equals("com.reader.action.tts.DESTROY")) {
                    d6a d6aVar3 = vg3.a;
                    vg3.a(hla.a);
                    return;
                }
                return;
            case -634284500:
                if (action.equals("com.reader.action.tts.SKIP_TO_NEXT")) {
                    d6a d6aVar4 = vg3.a;
                    vg3.a(nla.a);
                    return;
                }
                return;
            case -634213012:
                if (action.equals("com.reader.action.tts.SKIP_TO_PREV")) {
                    d6a d6aVar5 = vg3.a;
                    vg3.a(ola.a);
                    return;
                }
                return;
            case -387481030:
                if (action.equals("com.reader.action.test_server.STOP")) {
                    d6a d6aVar6 = vg3.a;
                    vg3.a(paa.a);
                    return;
                }
                return;
            case 58598593:
                if (action.equals("com.reader.action.tts.PAUSE")) {
                    d6a d6aVar7 = vg3.a;
                    vg3.a(kla.a);
                    return;
                }
                return;
            case 1110376375:
                if (action.equals("com.reader.action.tts.STOP")) {
                    d6a d6aVar8 = vg3.a;
                    vg3.a(pla.a);
                    return;
                }
                return;
            case 1120656515:
                if (action.equals("com.reader.action.book_update.CANCEL") && context != null) {
                    r1c r1cVarB = r1c.b(context);
                    wfc wfcVar = r1cVarB.b.m;
                    String strConcat = "CancelWorkByName_".concat("book_update_work");
                    q39 q39Var = r1cVarB.d.a;
                    q39Var.getClass();
                    rw1.R(wfcVar, strConcat, q39Var, new yx0(r1cVarB, 0));
                    return;
                }
                return;
            case 1611287050:
                if (!action.equals("com.reader.action.download.PAUSE")) {
                    return;
                }
                break;
            case 1877451426:
                if (action.equals("com.reader.action.tts.RESUME")) {
                    d6a d6aVar9 = vg3.a;
                    vg3.a(lla.a);
                    return;
                }
                return;
            default:
                return;
        }
        String stringExtra = intent.getStringExtra("book_id");
        if (stringExtra == null) {
            return;
        }
        int iHashCode = action.hashCode();
        if (iHashCode == -1962111802) {
            if (action.equals("com.reader.action.download.CANCEL")) {
                d6a d6aVar10 = vg3.a;
                vg3.a(new a13(stringExtra));
                return;
            }
            return;
        }
        if (iHashCode == -1528813959) {
            if (action.equals("com.reader.action.download.RESUME")) {
                d6a d6aVar11 = vg3.a;
                vg3.a(new d13(stringExtra));
                return;
            }
            return;
        }
        if (iHashCode == 1611287050 && action.equals("com.reader.action.download.PAUSE")) {
            d6a d6aVar12 = vg3.a;
            vg3.a(new c13(stringExtra));
        }
    }
}
