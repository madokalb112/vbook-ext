package org.mozilla.javascript;

import defpackage.j39;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public class Slot implements Serializable {
    private static final long serialVersionUID = -6090581677123995491L;
    private short attributes;
    int indexOrHash;
    Object name;
    transient Slot next;
    transient Slot orderedNext;
    Object value;

    public Slot(Slot slot) {
        this.name = slot.name;
        this.indexOrHash = slot.indexOrHash;
        this.attributes = slot.attributes;
        this.value = slot.value;
        this.next = slot.next;
        this.orderedNext = slot.orderedNext;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object obj = this.name;
        if (obj != null) {
            this.indexOrHash = obj.hashCode();
        }
    }

    public Slot copySlot() {
        Slot slot = new Slot(this);
        slot.next = null;
        slot.orderedNext = null;
        return slot;
    }

    public int getAttributes() {
        return this.attributes;
    }

    public Function getGetterFunction(String str, Scriptable scriptable) {
        return null;
    }

    public ScriptableObject getPropertyDescriptor(Context context, Scriptable scriptable) {
        return ScriptableObject.buildDataDescriptor(scriptable, this.value, this.attributes);
    }

    public Function getSetterFunction(String str, Scriptable scriptable) {
        return null;
    }

    public Object getValue(Scriptable scriptable) {
        return this.value;
    }

    public boolean isSameGetterFunction(Object obj) {
        return false;
    }

    public boolean isSameSetterFunction(Object obj) {
        return false;
    }

    public boolean isSetterSlot() {
        return false;
    }

    public boolean isValueSlot() {
        return true;
    }

    public void setAttributes(int i) {
        ScriptableObject.checkValidAttributes(i);
        this.attributes = (short) i;
    }

    public boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2, boolean z) {
        if ((this.attributes & 1) != 0) {
            if (z) {
                throw ScriptRuntime.typeErrorById("msg.modify.readonly", this.name);
            }
            return true;
        }
        if (scriptable != scriptable2) {
            return false;
        }
        this.value = obj;
        return true;
    }

    public void throwNoSetterException(Scriptable scriptable, Object obj) {
        Context context = Context.getContext();
        if (context.isStrictMode() || context.hasFeature(11)) {
            throw ScriptRuntime.typeErrorById("msg.set.prop.no.setter", this.name != null ? j39.m("[", scriptable.getClassName(), "].", String.valueOf(this.name)) : "", Context.toString(obj));
        }
    }

    public Slot(Object obj, int i, int i2) {
        this.name = obj;
        this.indexOrHash = obj != null ? obj.hashCode() : i;
        this.attributes = (short) i2;
    }

    public final boolean setValue(Object obj, Scriptable scriptable, Scriptable scriptable2) {
        return setValue(obj, scriptable, scriptable2, Context.isCurrentContextStrict());
    }
}
