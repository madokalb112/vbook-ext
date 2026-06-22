# VBook Plugin Encryption

## Tom tat

VBook plugin ma hoa tung file `src/*.js` bang AES-CBC/PKCS7, IV 16 byte `0x00`, key lay tu `metadata.source` va `metadata.author` trong `plugin.json`.

Van de da gap voi Yurineko: ban VBook thuong va VBook beta co cach tao chuoi MD5 khac nhau khi MD5 bat dau bang so `0`. Neu tool build dung mot cach, app con lai co the decrypt sai key va Rhino se crash khi parse script.

## Cong thuc ma hoa

Input metadata:

```text
source = plugin.metadata.source
author = plugin.metadata.author
```

Seed:

```text
seed = "com.vbook.app" + source + author
```

Key AES:

```text
md5_hex = MD5(seed).hex
key = SHA256(md5_hex as UTF-8)
iv = 00000000000000000000000000000000
```

Cipher text duoc base64 roi replace:

```text
+ -> x0P1Xx
/ -> x0P2Xx
= -> x0P3Xx
```

## Loi leading-zero MD5

Ban VBook thuong (`com.vbook.app`) co ham MD5 tuong duong:

```java
new BigInteger(1, md5Bytes).toString(16)
```

`BigInteger.toString(16)` se cat cac so `0` dau chuoi.

Vi du Yurineko cu:

```text
source = https://yurinekoz.com
author = madokalb112
seed   = com.vbook.apphttps://yurinekoz.commadokalb112

md5 padded      = 03d998f2c100ad3aa85085a7e8cdf5ee
md5 regular app = 3d998f2c100ad3aa85085a7e8cdf5ee
```

Tool build cu dung `03d...`, beta dung duoc, nhung ban thuong dung `3d...` nen decrypt sai key. Ket qua `E20.i(...)` tra `null`, Rhino nhan script rong/sai va bao:

```text
java.lang.IllegalStateException: FAILED ASSERTION
  at org.mozilla.javascript.TokenStream.<init>
  at org.mozilla.javascript.Parser.parse
  at org.mozilla.javascript.Context.evaluateString
```

## Vi sao khong the auto chon key

Neu build bang `md5_padded`:

```text
beta/new app OK
regular app loi khi MD5 bat dau bang 0
```

Neu build bang `md5_regular_app`:

```text
regular app OK
beta/new app co nguy co loi
```

Mot plugin zip chi co mot bo script da ma hoa, nen khong the dung dong thoi hai key khac nhau. Cach an toan la khong cho build khi `md5_padded != md5_regular_app`.

## Quy tac build an toan

Truoc khi build encrypted, tool phai kiem tra:

```text
md5_padded = MD5(seed).hex 32 ky tu
md5_regular_app = md5_padded.TrimStart("0")

neu md5_padded != md5_regular_app:
  dung build
  yeu cau doi metadata.source hoac metadata.author
```

Nen sua metadata sao cho MD5 khong bat dau bang `0`. Cach uu tien:

```text
1. Them hoac bo trailing slash trong metadata.source neu logic ext van chay dung.
2. Doi source sang canonical URL khac nhung cung domain.
3. Chi doi author khi that su chap nhan thay doi thong tin tac gia/plugin.
```

Voi Yurineko da chon:

```text
source cu  = https://yurinekoz.com
source moi = https://yurinekoz.com/

md5 moi = b3be0c97c2cf8717d3d75055b3136ca3
```

MD5 moi khong bat dau bang `0`, nen app thuong va beta cung decrypt bang mot key.

## Tool da cap nhat

`C:\Users\admin\.codex\skills\vbook-encrypt\scripts\vbook_encrypt.ps1`:

```text
- Tinh md5_padded va md5_regular_app.
- Neu lech nhau thi throw loi va khong tao zip.
- In them seed va md5 khi build thanh cong.
```

`vbook_maker.py`:

```text
- Build encrypted co preflight check tuong tu.
- GUI/CLI se fail som voi thong bao source, author, seed, md5_padded, md5_regular_app.
```

## Cach kiem tra nhanh

PowerShell/Python:

```powershell
python -c "import hashlib; source='https://yurinekoz.com/'; author='madokalb112'; seed='com.vbook.app'+source+author; md5=hashlib.md5(seed.encode()).hexdigest(); print(seed); print(md5, md5.lstrip('0') or '0')"
```

Ket qua an toan khi hai gia tri MD5 giong nhau.

Build encrypted:

```powershell
powershell -NoProfile -ExecutionPolicy Bypass -File C:\Users\admin\.codex\skills\vbook-encrypt\scripts\vbook_encrypt.ps1 -Project D:\Tool\vbook-ext\yurineko -Output D:\Tool\vbook-ext\.tools\gui-encrypt\yurineko -Force
```

Neu gap loi unsafe key, sua `metadata.source` hoac `metadata.author`, bump version, cap nhat root `plugin.json`, roi build lai.
