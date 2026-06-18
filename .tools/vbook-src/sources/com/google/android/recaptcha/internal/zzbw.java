package com.google.android.recaptcha.internal;

import defpackage.a39;
import defpackage.ai1;
import defpackage.ao2;
import defpackage.ax2;
import defpackage.bi1;
import defpackage.c09;
import defpackage.d09;
import defpackage.fw;
import defpackage.gx1;
import defpackage.hx1;
import defpackage.ix1;
import defpackage.jt1;
import defpackage.jx1;
import defpackage.kb4;
import defpackage.me5;
import defpackage.ml2;
import defpackage.ne5;
import defpackage.oe5;
import defpackage.p71;
import defpackage.pe5;
import defpackage.s00;
import defpackage.s16;
import defpackage.s71;
import defpackage.yb4;
import defpackage.yd5;
import defpackage.zd5;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class zzbw implements ml2 {
    private final /* synthetic */ ai1 zza;

    public zzbw(ai1 ai1Var) {
        this.zza = ai1Var;
    }

    @Override // defpackage.yd5
    public final p71 attachChild(s71 s71Var) {
        return this.zza.attachChild(s71Var);
    }

    @Override // defpackage.ml2
    public final Object await(jt1 jt1Var) {
        return ((bi1) this.zza).o(jt1Var);
    }

    @ao2
    public final /* synthetic */ boolean cancel(Throwable th) {
        CancellationException zd5Var;
        pe5 pe5Var = (pe5) this.zza;
        if (th != null) {
            pe5Var.getClass();
            zd5Var = pe5.h0(pe5Var, th);
        } else {
            zd5Var = new zd5(pe5Var, pe5Var.u(), null);
        }
        pe5Var.s(zd5Var);
        return true;
    }

    @Override // defpackage.jx1
    public final Object fold(Object obj, yb4 yb4Var) {
        pe5 pe5Var = (pe5) this.zza;
        pe5Var.getClass();
        yb4Var.getClass();
        return yb4Var.invoke(obj, pe5Var);
    }

    @Override // defpackage.jx1
    public final hx1 get(ix1 ix1Var) {
        pe5 pe5Var = (pe5) this.zza;
        pe5Var.getClass();
        return gx1.G(pe5Var, ix1Var);
    }

    @Override // defpackage.yd5
    public final CancellationException getCancellationException() {
        return this.zza.getCancellationException();
    }

    @Override // defpackage.yd5
    public final a39 getChildren() {
        return this.zza.getChildren();
    }

    @Override // defpackage.ml2
    public final Object getCompleted() {
        return ((bi1) this.zza).z();
    }

    @Override // defpackage.ml2
    public final Throwable getCompletionExceptionOrNull() {
        return ((pe5) this.zza).getCompletionExceptionOrNull();
    }

    @Override // defpackage.hx1
    public final ix1 getKey() {
        this.zza.getClass();
        return s00.s;
    }

    public final d09 getOnAwait() {
        bi1 bi1Var = (bi1) this.zza;
        bi1Var.getClass();
        me5 me5Var = me5.a;
        fw.F(3, me5Var);
        ne5 ne5Var = ne5.a;
        fw.F(3, ne5Var);
        return new s16(bi1Var, me5Var, ne5Var, null, 23);
    }

    public final c09 getOnJoin() {
        pe5 pe5Var = (pe5) this.zza;
        pe5Var.getClass();
        oe5 oe5Var = oe5.a;
        fw.F(3, oe5Var);
        return new iz7(pe5Var, oe5Var);
    }

    public final yd5 getParent() {
        p71 p71VarG = ((pe5) this.zza).G();
        if (p71VarG != null) {
            return p71VarG.getParent();
        }
        return null;
    }

    @Override // defpackage.yd5
    public final ax2 invokeOnCompletion(boolean z, boolean z2, kb4 kb4Var) {
        return ((pe5) this.zza).invokeOnCompletion(z, z2, kb4Var);
    }

    @Override // defpackage.yd5
    public final boolean isActive() {
        return this.zza.isActive();
    }

    @Override // defpackage.yd5
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    public final boolean isCompleted() {
        return ((pe5) this.zza).M();
    }

    @Override // defpackage.yd5
    public final Object join(jt1 jt1Var) {
        return this.zza.join(jt1Var);
    }

    @Override // defpackage.jx1
    public final jx1 minusKey(ix1 ix1Var) {
        pe5 pe5Var = (pe5) this.zza;
        pe5Var.getClass();
        return gx1.Q(pe5Var, ix1Var);
    }

    @Override // defpackage.jx1
    public final jx1 plus(jx1 jx1Var) {
        return this.zza.plus(jx1Var);
    }

    @Override // defpackage.yd5
    public final boolean start() {
        return this.zza.start();
    }

    @ao2
    public final yd5 plus(yd5 yd5Var) {
        this.zza.getClass();
        return yd5Var;
    }

    @Override // defpackage.yd5
    public final ax2 invokeOnCompletion(kb4 kb4Var) {
        return this.zza.invokeOnCompletion(kb4Var);
    }

    @Override // defpackage.yd5
    public final void cancel(CancellationException cancellationException) {
        this.zza.cancel(cancellationException);
    }

    @ao2
    public final /* synthetic */ void cancel() {
        ((pe5) this.zza).cancel(null);
    }
}
