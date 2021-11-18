## 幹事くん
支払額と男女の人数からそれぞれの支払金額を計算する

## 変数
| 変数名 | タイプ | 備考 |
| :---- | :---- | :---- |
| totalPrice | 数値	| 合計金額 |
| numberOfMale | 数値 | 男性の数 |
| numberOfFemale | 数値 | 女性の数 |

## 男女の区別なし
例：
| 変数名 | 値 |
| :---- | :---- |
| totalPrice | 12000 |
| numberOfMale | 3 |
| numberOfFemale | 3 |
``` console
男性：2000 円
女性：2000 円
```

## 男性は女性よりも 1000 円多く支払う
例：
| 変数名 | 値 |
| :---- | :---- |
| totalPrice | 12000 |
| numberOfMale | 3 |
| numberOfFemale | 3 |
``` console
男性：2500 円
女性：1500 円
```

## 余り
割り切れずに余りが出た場合には余りを表示する

例：女性は1000円安い
| 変数名 | 値 |
| :---- | :---- |
| totalPrice | 13000 |
| numberOfMale | 3 |
| numberOfFemale | 3 |
``` console
男性：2666 円
女性：1666 円
余り：4 円
```