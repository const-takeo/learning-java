# Why do we learn Java

## What is Java

- C言語の場合os別にcompileをしなければならない, -> depends on OS -> 早い
- JavaはJVMの上で動くのでどこでも動く -> 遅い -> JVMの性能が向上されている
- OOP志向言語 -> 拡張性が良い
- OpenSource

## データの表現

- bit: 2進数一個の値をセーブできるメモリの大きさ→コンピュータが表現するデータの最小単位
- byte: 8bit

一番前が
- 0B -> 2進数を表す　-> 0B1010
- 0 -> 8進数 -> 012
- 0X -> 16進数 -> 0XA

- integerを表現する時一番良く使われているビット数は32ビット

### 負の整数の表現方法

- 整数の一番左側に存在するビットは符号ビット
  - MSB(Most Significant Bit)　一番重要なビット
  - 0 -> +
  - 1 -> -
- 負の整数を作る方法
  - 2の補数を取る
    - 1の補数をとって１を足す

## Variables

- Javaでの変数宣言し有意事項
  - 変数の名前はalphabet, numbers, _, $で構成される。
  - 大小文字を区別する。
  - 名前の間に空白があってはならない
  - 役割に相応しい名前にする事。
  - 変数の名前は数字で始められない -> 頭文字を数字にしてはならない

- 資料型
  - メモリを使うに当たって(変数を宣言する)使用するスペースの大きさと特性(型)に基づいて宣言する。

  - 整数型
    1. byte (1byte) : 動画や音楽などのファイルを処理する時使用する。
    2. short(2byte) : 主に C / C++ との互換のために使用する。
    3. int  (4byte) : javaでの基本資料型
    4. long (8byte) : 一番大きい資料型、数字の後ろに L or l -> 16L

  - 文字型
    1. char (2byte) : JavaはUnicode UTF-16を使用する。整数型intに変換して保存する

  - 実数型
    1. float (4byte) : float型を使うときは後ろにF, fを　付ける。
    2. double (8byte) : javaの基本実数型

  - 論理型
    1. boolean (1byte) : true or false;

  - 資料型なしに変数使用(java 10)
    - 資料型が必要な利用としては変数を宣言する時使用するメモリの大きさとタイプを区別するために使用
    - 地域変数タイプ推論(Local Variable Type Inference)　→　変数に体入する値を見てcompilerが推論して決める。


- 定数(constant)
  - 変化しない値
  - Javaでの定数の宣言 -> finalを使う -> goやjavascriptみたいにconst型がない
  - 定数の場合大文字で宣言するのがコンベンション(convention)


- Literal
  - Promgramで使われる全ての数字、値、論理値...
  - literalに当たる値は特定のメモリ空間に保存されている(constant pool)
  - 必要な場合constant poolから持ってきて使う
  - constant poolに保存される時整数はint型、実数はdoubleで保存されるのが基本ルール
  - よってlong,floatを使う場合識別子を明示しなければならない

- 型変換(type conversion)
  - 資料型は各々使うメモリ空間の大きさと方式が違う
  - 黙示的型変換(Implicit Conversion)
    - 小さい値から大きい値に、やや精密度が低いからもっと精密な値に体入される時
    - ex) long num = 3; 3 <- literalとして基本int型
  - 明示的型変換(Explicit Conversion)
    - 黙示的型変換の反対
    - 変換される型を明示する必要がある、
    - 値の損失があり得る。