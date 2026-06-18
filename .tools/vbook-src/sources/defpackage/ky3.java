package defpackage;

import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ky3 implements jic {
    public final /* synthetic */ FirebaseAuth a;

    public ky3(FirebaseAuth firebaseAuth) {
        Objects.requireNonNull(firebaseAuth);
        this.a = firebaseAuth;
    }

    public final void a(zzahv zzahvVar, rz3 rz3Var) {
        ex1.C(zzahvVar);
        ex1.C(rz3Var);
        ((ccc) rz3Var).a = zzahvVar;
        FirebaseAuth firebaseAuth = this.a;
        firebaseAuth.getClass();
        FirebaseAuth.d(firebaseAuth, rz3Var, zzahvVar, true, false);
    }
}
