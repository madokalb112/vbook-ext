package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystemException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;

/* JADX INFO: compiled from: r8-map-id-6d4a6fea4a678d318bae670e8b98ae0a8798384e7d56dd89fbb5b2340ff4b0eb */
/* JADX INFO: loaded from: D:\Tool\vbook-ext\.tools\vbook-dex\classes3.dex */
public final class g67 extends oh5 {
    public static Long V0(FileTime fileTime) {
        long millis = fileTime.toMillis();
        Long lValueOf = Long.valueOf(millis);
        if (millis != 0) {
            return lValueOf;
        }
        return null;
    }

    @Override // defpackage.oh5, defpackage.gx3
    public final void q(zn7 zn7Var, zn7 zn7Var2) throws IOException {
        zn7Var.getClass();
        zn7Var2.getClass();
        try {
            Path path = Paths.get(zn7Var.a.s(), new String[0]);
            path.getClass();
            Path path2 = Paths.get(zn7Var2.a.s(), new String[0]);
            path2.getClass();
            Files.move(path, path2, StandardCopyOption.ATOMIC_MOVE, StandardCopyOption.REPLACE_EXISTING);
        } catch (UnsupportedOperationException unused) {
            sy3.m("atomic move not supported");
        } catch (NoSuchFileException e) {
            throw new FileNotFoundException(e.getMessage());
        }
    }

    @Override // defpackage.oh5
    public final String toString() {
        return "NioSystemFileSystem";
    }

    @Override // defpackage.oh5, defpackage.gx3
    public final ow3 x0(zn7 zn7Var) {
        zn7 zn7VarB;
        zn7Var.getClass();
        Path path = Paths.get(zn7Var.a.s(), new String[0]);
        path.getClass();
        try {
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, LinkOption.NOFOLLOW_LINKS);
            Path symbolicLink = attributes.isSymbolicLink() ? Files.readSymbolicLink(path) : null;
            boolean zIsRegularFile = attributes.isRegularFile();
            boolean zIsDirectory = attributes.isDirectory();
            if (symbolicLink != null) {
                String str = zn7.b;
                zn7VarB = xn7.b(symbolicLink.toString(), false);
            } else {
                zn7VarB = null;
            }
            Long lValueOf = Long.valueOf(attributes.size());
            FileTime fileTimeCreationTime = attributes.creationTime();
            Long lV0 = fileTimeCreationTime != null ? V0(fileTimeCreationTime) : null;
            FileTime fileTimeLastModifiedTime = attributes.lastModifiedTime();
            Long lV02 = fileTimeLastModifiedTime != null ? V0(fileTimeLastModifiedTime) : null;
            FileTime fileTimeLastAccessTime = attributes.lastAccessTime();
            return new ow3(zIsRegularFile, zIsDirectory, zn7VarB, lValueOf, lV0, lV02, fileTimeLastAccessTime != null ? V0(fileTimeLastAccessTime) : null);
        } catch (NoSuchFileException | FileSystemException unused) {
            return null;
        }
    }
}
