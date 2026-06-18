package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.firebase-auth-api.zzahv;
import com.google.firebase.auth.FirebaseAuth;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class ly3 implements idc, jic {
    public final /* synthetic */ int a;
    public final /* synthetic */ FirebaseAuth b;

    public ly3(FirebaseAuth firebaseAuth, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = firebaseAuth;
                break;
            default:
                Objects.requireNonNull(firebaseAuth);
                this.b = firebaseAuth;
                break;
        }
    }

    public final void a(zzahv zzahvVar, rz3 rz3Var) {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                ex1.C(zzahvVar);
                ex1.C(rz3Var);
                ((ccc) rz3Var).a = zzahvVar;
                firebaseAuth.getClass();
                FirebaseAuth.d(firebaseAuth, rz3Var, zzahvVar, true, true);
                break;
            default:
                firebaseAuth.getClass();
                FirebaseAuth.d(firebaseAuth, rz3Var, zzahvVar, true, true);
                break;
        }
    }

    public final void zza(Status status) {
        int i = this.a;
        FirebaseAuth firebaseAuth = this.b;
        switch (i) {
            case 0:
                int i2 = status.a;
                if (i2 == 17011 || i2 == 17021 || i2 == 17005 || i2 == 17091) {
                    firebaseAuth.a();
                }
                break;
            default:
                int i3 = status.a;
                if (i3 == 17011 || i3 == 17021 || i3 == 17005) {
                    firebaseAuth.a();
                }
                break;
        }
    }
}
