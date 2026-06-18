package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class n1 implements Iterator, fi5 {
    public final /* synthetic */ int a;
    public int b;
    public final Object c;

    public n1(je3 je3Var) {
        this.a = 3;
        this.c = je3Var;
        this.b = je3Var.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (this.b < ((q1) obj).a()) {
                }
                break;
            case 1:
                if (this.b < ((Object[]) obj).length) {
                }
                break;
            case 2:
                if (this.b < ((u28) obj).b) {
                }
                break;
            case 3:
                if (this.b > 0) {
                }
                break;
            case 4:
                if (this.b < ((byte[]) obj).length) {
                }
                break;
            case 5:
                if (this.b < ((int[]) obj).length) {
                }
                break;
            case 6:
                if (this.b < ((long[]) obj).length) {
                }
                break;
            case 7:
                if (this.b < ((short[]) obj).length) {
                }
                break;
            default:
                if (this.b < ((ViewGroup) obj).getChildCount()) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.a;
        Object obj = this.c;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    mn5.m();
                } else {
                    int i2 = this.b;
                    this.b = i2 + 1;
                }
                break;
            case 1:
                try {
                    int i3 = this.b;
                    this.b = i3 + 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.b--;
                    so9.n(e.getMessage());
                    return null;
                }
                break;
            case 2:
                u28 u28Var = (u28) obj;
                Object[] objArr = u28Var.a;
                if (objArr != null) {
                    int i4 = this.b;
                    if (i4 >= u28Var.b) {
                        objArr = null;
                    }
                    if (objArr != null) {
                        this.b = i4 + 1;
                    }
                }
                mn5.m();
                break;
            case 3:
                je3 je3Var = (je3) obj;
                int i5 = je3Var.c;
                int i6 = this.b;
                this.b = i6 - 1;
                break;
            case 4:
                int i7 = this.b;
                byte[] bArr = (byte[]) obj;
                if (i7 >= bArr.length) {
                    so9.n(String.valueOf(i7));
                } else {
                    this.b = i7 + 1;
                }
                break;
            case 5:
                int i8 = this.b;
                int[] iArr = (int[]) obj;
                if (i8 >= iArr.length) {
                    so9.n(String.valueOf(i8));
                } else {
                    this.b = i8 + 1;
                }
                break;
            case 6:
                int i9 = this.b;
                long[] jArr = (long[]) obj;
                if (i9 >= jArr.length) {
                    so9.n(String.valueOf(i9));
                } else {
                    this.b = i9 + 1;
                }
                break;
            case 7:
                int i10 = this.b;
                short[] sArr = (short[]) obj;
                if (i10 >= sArr.length) {
                    so9.n(String.valueOf(i10));
                } else {
                    this.b = i10 + 1;
                }
                break;
            default:
                int i11 = this.b;
                this.b = i11 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i11);
                if (childAt == null) {
                    mn5.o();
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                ViewGroup viewGroup = (ViewGroup) this.c;
                int i = this.b - 1;
                this.b = i;
                viewGroup.removeViewAt(i);
                return;
        }
    }

    public n1(Object[] objArr) {
        this.a = 1;
        objArr.getClass();
        this.c = objArr;
    }

    public /* synthetic */ n1(Object obj, int i) {
        this.a = i;
        this.c = obj;
    }
}
