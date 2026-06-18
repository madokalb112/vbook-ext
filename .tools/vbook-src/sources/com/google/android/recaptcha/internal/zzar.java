package com.google.android.recaptcha.internal;

import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.heb;
import defpackage.kb4;
import defpackage.ml2;
import defpackage.rl5;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
final class zzar extends rl5 implements kb4 {
    final /* synthetic */ TaskCompletionSource zza;
    final /* synthetic */ ml2 zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzar(TaskCompletionSource taskCompletionSource, ml2 ml2Var) {
        super(1);
        this.zza = taskCompletionSource;
        this.zzb = ml2Var;
    }

    @Override // defpackage.kb4
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Throwable th = (Throwable) obj;
        if (th instanceof CancellationException) {
            this.zza.setException((Exception) th);
        } else {
            RuntimeExecutionException completionExceptionOrNull = this.zzb.getCompletionExceptionOrNull();
            TaskCompletionSource taskCompletionSource = this.zza;
            if (completionExceptionOrNull == null) {
                taskCompletionSource.setResult(this.zzb.getCompleted());
            } else {
                Exception runtimeExecutionException = completionExceptionOrNull instanceof Exception ? (Exception) completionExceptionOrNull : null;
                if (runtimeExecutionException == null) {
                    runtimeExecutionException = new RuntimeExecutionException(completionExceptionOrNull);
                }
                taskCompletionSource.setException(runtimeExecutionException);
            }
        }
        return heb.a;
    }
}
