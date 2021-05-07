# Why do we learn Java

## What is Java

- C言語の場合os別にcompileをしなければならない, -> depends on OS -> 早い
- JavaはJVMの上で動くのでどこでも動く -> 遅い -> JVMの性能が向上されている
- OOP志向言語 -> 拡張性が良い
- OpenSource

## データの表現

- bit: 2進数一個の値をセーブできるメモリの大きさ→コンピュータが表現するデータの最小単位
- byte: 8bit
- 16進数 → 16で桁が上がる -> 9 A B C D E F 10
- 一番前が
- 0B -> 2進数を表す -> 0B1010 -> 10(10進数)
- 0 -> 8進数 -> 012 -> 10(10進数)
- 0X -> 16進数 -> 0XA -> 10(10進数)

- integerを表現する時一番良く使われているビット数は32ビット

### 負の整数の表現方法

- 整数の一番左側に存在するビットは符号ビット
  - MSB(Most Significant Bit) 一番重要なビット
  - 0 -> +
  - 1 -> -
- 負の整数を作る方法
  - 2の補数を取る
    - 1の補数をとって１を足す
    - ex)
      `0 0 0 0  0 1 0 1` -> 5(2進数)   < ----- 1
      `1 1 1 1  1 0 1 0` -> 1の補数(お互い足して１になる数)
      `1 1 1 1  1 0 1 1` -> 1の補数(お互い足して１になる数)に1を足す → ２の補数 -5(2進数)  < ------- 2 一番前がtruncate(長さを減らす)される
      `0 0 0 0  0 0 0 0` -> 1 + 2 = 0;

## Variables

- Javaでの変数宣言し有意事項
  - 変数の名前はalphabet, numbers, _, $で構成される。
  - 大小文字を区別する。
  - 名前の間に空白があってはならない
  - 役割に相応しい名前にする事。
  - 変数の名前は数字で始められない -> 頭文字を数字にしてはならない

- ### 資料型(data type)
  - メモリを使うに当たって(変数を宣言する)使用するスペースの大きさと特性(型)に基づいて宣言する。

  - ### 整数型
    1. byte (1byte) : 動画や音楽などのファイルを処理する時使用する。
    2. short(2byte) : 主に C / C++ との互換のために使用する。
    3. int  (4byte) : javaでの基本資料型
    4. long (8byte) : 一番大きい資料型、数字の後ろに L or l -> 16L

  - ### 文字型
    1. char (2byte) : JavaはUnicode UTF-16を使用する。整数型intに変換して保存する

  - ### 実数型
    - 実数はConstant poolに基本doubleで保存される
    - 浮動小数店方式：実数を指数部と仮数部で表現 → 無限の実数を表現する為の方式

    1. float (4byte) : float型を使うときは後ろにF, fを 付ける。
    2. double (8byte) : javaの基本実数型

  - ### 論理型
    1. boolean (1byte) : true or false;

  - ### 資料型なしに変数使用(java 10)
    - `var`
    - 資料型が必要な利用としては変数を宣言する時使用するメモリの大きさとタイプを区別するために使用
    - 地域変数タイプ推論(Local Variable Type Inference) → 変数に体入する値を見てcompilerが推論して決める。


- ### 定数(constant)
  - 変化しない値
  - Javaでの定数の宣言 -> finalを使う -> goやjavascriptみたいにconst型がない
  - 定数の場合大文字で宣言するのがコンベンション(convention)

- ### 文字セット
  - JavaではUNICODE UTF-16でencoding使用
  - ASCIIは1byteで英文字、数字、特殊文字を表現

- ### リテラル(Literal)
  - Promgramで使われる全ての数字、値、論理値...
  - literalに当たる値は特定のメモリ空間に保存されている(constant string pool in Heap memory)
  - 必要な場合constant poolから持ってきて使う
  - constant poolに保存される時整数はint型(4byte)、実数はdouble(8byte)で保存されるのが基本ルール
  - よってlong,floatを使う場合識別子を明示しなければならない

- ### 型変換(type conversion)
  - 資料型は各々使うメモリ空間の大きさと方式が違う
  - 黙示的型変換(Implicit Conversion)
    - 小さい値から大きい値に、やや精密度が低いからもっと精密な値に体入される時
    - ex) `long num = 3; 3` <- literalとして基本int型
  - 明示的型変換(Explicit Conversion)
    - 黙示的型変換の反対
    - 変換される型を明示する必要がある、
    - 値の損失があり得る。(truncated)

## Operator(演算子)

- Operand(被演算子・항) : 演算に使用される値。
- Operator(演算子・연산자) : 被演算子を利用して演算する記号
  - 単項演算子 : ```++num```
  - 二項演算子 : ```num1 + num2;```
  - 三項演算子 : ```(5>3) ? 1 : 0;```

### 代入演算子

- 変数に値を代入する演算子
- 優先順位が一番低い演算子

### 算術演算子

- 四則演算に使われる
- `+ - * / % `

### 増加減少演算子

- `++`  被演算子の値に１を足す
  - `val = ++num;`
    - 先にnumの値が増加した後valに代入される。
    - -> ;(semi colon)が付けられる前に足せという意味;
  - `val = num++;`
    - valに既存のnumの値を代入した後numの値を増加させる
- `--`  被演算子の値から１を引く

### 関係演算子

- 二項演算し
  - 演算の結果がtrue、falseどちらかで変換される。
  - 左被演算子が基準
  - `int num = 5;`
  - `>` ->  `num>3` : true
  - `<` ->  `num<3` : false
  - `>=` ->  `num>=3` : true
  - `<=` ->  `num<=3` : false
  - `==` ->  `num==3` : false
  - `!=` ->  `num!=3` : true

### 論理演算子

- 関係演算子と交わってよく使われる
- 演算の結果がtrue or falseどちらかで変換される。
- `&&` 論理積：両被演算子がtrueの場合trueを返すそうでは無い場合false `bool bVal = (5 > 3) && (5 > 2)` : true;
- `||` 論理和：両被演算子の内一つだけtrueであればtrueを返す `bool bVal = (5 > 3) || (5 < 2)` : true;
- `!` 単行演算子である、否定 trueはfalse、falseはtrue `bool bVal = !(5 > 3)` : false;
- 短絡回廊評価(Short Circuit Evaluation)
  - 論理積(&&)は両被演算子が全てtrueの場合結果がtrueになる
    - &rarr; 前の被演算子がfalseであれば後ろの被演算子を評価しなくてもfalseである。
  - 論理和(||)は両被演算子が全てfalseの時結果がfalseになる
    - &rarr; 前の被演算子がtrueであれば後ろの被演算子を評価しなくてもtrueである。

### 複合代入演算子

- 代入演算子と他の演算子を一緒に使う。
- 実際のコーディングでよく使われる。

  - `+=`: 二つの被演算子の値を足して左の被演算子に代入 `num += 2;` == `num1 = num1 + 2;`
  - `-=`: 左の被演算子から右の被演算子の値を引いてそれを左の被演算子に足す `num -= 2;`
  - `*=`: 二つの値を掛けてその値を左被演算子に代入 `num *= 2;`
  - `/=`: ...
  - `%=`: ...

  ビット演算子との複合演算子
  - `<<=`:
  - `>>=`:
  - `>>>=`:
  - `&=`:
  - `!=`:
  - `^=`:

### 条件演算子

- 三項演算子
  - 条件式の結果がtrueの場合とfalseの場合によって他の式や結果が実行される。
    `(5 > 3) ? trueSomething() : falseSomething();`

### ビット演算子

- ビット演算子は整数のみ適用可能
  - `~`: ビットの反転（１の補数） `a = ~a`;
  - `&`: ビット単位AND 1&1 -> 1 その以外は0
  - `|`: ビット単位OR 0|0 -> 0 その以外は1
  - `^`: ビット単位XOR 二つのビットが違う場合1を返す一緒の時は0
  - `<<`: 左シフト `a << 2` 変数aを2ビット左にシフトさせる。 -> * 2のn乗 -> `num1 = 5, num1 << 1, print(num1) -> 10`
  - `>>`: 右シフト `a >> 2` 変数aを2ビット左にシフトさせる。 -> / 2のn乗
  - `>>>`: 右シフト `a >>> 2` 変数aを2ビット左にシフトさせる shiftして符号関係なしに０で埋める。

## 制御

### 条件分

- `if~else`
  - 与えられた条件に基づいて違うコードが実行されるようにプログラミングする事。
  - 条件がtrueであれば条件分の処理を終了して外のコードに移る。
    - `if ~ else`
    - `if ~ else if ~ else`
- `switch~case`
  - 条件式の結果が整数または文字列の値でその値によって実行文が決められる時switch-case文を使う
  - Java7からcaseの値に文字列を使用可能になりました。
    `String medal = "Gold" switch(medal) case "Gold": System.out.println("金メダルです。");`
  - 条件が同じ場合同一のラインでかける
    ```
        switch(month)
              case 1 : case 3: case 5: case 7:
                  day = 31;
                  break;
              case 2 :
                  day = 28;
                  break;
              default:
                  break;
    ```

### 反復文

- 与えられた条件が満足するまでに実行文が反復的に実行される。
  `while, do-while, for`文等がある。
  - `while`
    条件分がtrueの間反復的に実行される。
  - `do-while`
    do中の実行文を実行してから条件式をチェックする。 実行文が絶対一回は実行されるべきの場合使用される。
  - `for`
    主に条件が回数の時使われる。

### continue & break

- `continue`文
  - 反復文と一緒に使われる、反復文内部で`continue`を会うと以後反復されるコードは実行されずに条件式や増減式を実行する。
- `break`文
  - 反復文で`break`を会うと反復文を実行せずに反復文から抜ける、
  - 重ねている反復文の内部にある場合一番近い反復文一個だけを抜けられる。

## オブジェクト指向プログラミングとクラス

- オブジェクトとは？
  - 意思や行為の影響が当たる対象 ー 辞書的
  - 具体的、抽象的データの単位

- オブジェクト指向プログラミング(Object Oriented Programming, OOP)
  - オブジェクトを基盤とするプログラミング cf. 절차 프로그래밍(Procedural Programming, C言語)

  - クラスとは？
    - オブジェクトに対す属性と機能をコードで具現化した物
    - クラスを定義するという
    - オブジェクトに対すblueprint
    - クラスの頭文字は大文字
    - 一つのjavaファイルの中に一つのクラスを置くのが原則だがいくつかのクラスが一緒にある場合 publicクラスは一つであり、publicクラスとjavaファイルの名前は一緒でなけらばならない。
    - javaの全てのコードはclassのなかに存在する。

  - オブジェクトの属性
    - オブジェクトの特性、属性、メンバー変数
    - property, attribute, member variable
  - オブジェクトの機能
    - オブジェクトがする機能等をメソッドで実現
    - method, member function

  - メソッドとは？
    - 関数の一種
      - オブジェクトの機能を提供するためにクラスの内部に実現する関数
    - 関数とは？
      - 一つの機能を実行する一連のコードの集まり 重複する機能を関数で具現化して関数を呼び出して使う。
    - 関数とスタックメモリ(stack memory)
      - 関数が呼び出される時使用されるメモリ - Stack
      - 関数の機能の実行が終わると自動で変換されるメモリ

  - クラスとインスタンス(実例)
    - クラス(staticコード) - 生成(インスタンス化) -> インスタンス(dynamic memory)
    - クラスの生成
      - クラスを使用するためにはクラスを生成しなければならない
      - new予約後を使いクラスを生成
      - クラス型 変数名 = new 生成者;
      - `Student studentA = new Student();`
      - `studentA` <- 参照変数(reference variable)
      - `Student` <- 参照型データ変数(reference data type)
      - Student <- Object Type
    - インスタンスとヒップメモリ(heap memory)
      - クラスがインスタンスに生成された状態
      - 一つのクラスコードからいくつかのインスタンスを生成
      - インスタンスはheap memory上に生成される。(インスタンスは他の所に生成される)
      - Garbage Collectorが使用しないメモリを回収する
      - 個々のインスタンスは異なるメモリに異なる値を持つ。
      - 参照変数(reference variable)
      - 参照値(reference value)
    - コンストラクター(constructor)
      - コンストラクターの名前はそのクラスの名前と一緒
      - コンストラクターはメソッドでは無い、継承されない、return値は無い
      - コンストラクターは変換タイプが無い。
      - インスタンス生成時newキーワードと一緒に使われた生成者
      - javaクラス内にコンストラクターが一つもない場合はJVMが自動的に生成してくれる → default constructor
      - `public Student() {}` <- parameterがない、コードもない
      - constructorは呼び出されたインスタンス→オブジェクトが生成される時持って欲しいな物を書く
      - constructor overloading -> 名前が全く同じのコンストラクターでparameterが違う場合overloadingが起こる
      - ```
            public Student() {}
            public Student(int num, String name) {}
          ```

  ### 参照資料型(reference data type)
  - 変数の資料型 - 基本資料型 : `int, long, float, double...`
    | - 参照資料型 : `String, Date, Student...`
  - 情報隠匿(いんとく:은닉)（隠す）(information hiding)
    - ### private: 接近制御子(access modifier)
      - クラスの外部からクラスの内部のメンバ変数やメソッドに接近(access)出来ないようにする。
      - メンバ変数やメソッドを外部から使用できないようにしてエラーを減らすことが出来る
      - 変数に対しては必要の場合get(),set()メソッドを提供
    - 接近制御子に何も無い場合: defalut => 同じパッケージ内ではaccess可能。
    - 一個のファイルの中でpublic classは一つのみ

  ### this
  - 自分のメモリ(address)を指す
    - 生成されたインスタンスを自ら指す予約語
    - heapメモリ上に生成されたインスタンスを指す。
  - 生成者で他の生成者を呼び出す
    - parameterとtypeがあうconstructorを探して使う
    - ```
            public Person() {
            this("No name", 20);
            }

            public Person(String name, int age) {
                this.name = name;
                this.age = age;
            }
        ```
  - 自分のアドレスを返す
  - this前には他のstatementは来ることができない
    - thisで他の生成者を読んで初期化されてないのに他の変数が先にメモリ上に乗っかることがあり得るので禁止
  - ```
        class BirthDay {
          int year;

          public void setYear(int year //int y){
            this.year = year;
            //year = y;
            //parameterのyearの名前がmember変数の名前と違う時(y)はthisを使わなくても良い.
          }
        }
      ```

  ### static変数(予約語)
  - static変数の定義と使用方法
    - いくつかのインスタンスが同じメモリ値を共有する為に使用。
  - stackでも無いheapでも無い他のメモリを使用する。→ Class areaに保存する。
  - static変数はインスタンスが生成される度に違うメモリを持つのではなくプログラムがメモリに積載される時(load)データ領域のメモリに生成される。
  - インスタンスの生成と関係なしにクラスの名前で直接参照する。`student1.serialNum`ではなく`Student.serialNum`で参照する事
  - クラス変数とも呼ぶ
  - メンバー変数はインスタンス変数とも呼ぶ。

  ### staticメソッド
  - クラスメソッドとも呼ぶ
  - staticメソッド中ではインスタンス変数(メンバー変数)を使うことが出来ない
  - インスタンス変数の場合絶対にインスタンスが先に生成されなければならないのでstaticメソッドでは生成が不確実なインスタンス変数を使うことはいけない。

  ### Singletone pattern
  - javaにはc言語みたいにグローバル変数がない。 -> static変数を使用
  - staticの応用
  - システムの中に単一のインスタンスだけが存在するように実装する方式
  - androidでも使われている

## 配列と ArrayList

- Arrayとは
  - 同じ型のデータタイプをメモリに保存する線形的(一列みたい)資料構造
  - 論理的構造と物理的構造が同一
  - index演算が速い
- 基本資料型配列
- 整数２０個を利用するプログラムを作るとき整数タイプの変数を２０個宣言しなければならない。
- 非効率的で変数管理も難しい。
- 配列を使うと同一の資料型の変数を一期に順次的で管理できる。
- 配列はFixed lengthで始まる→作る時lengthを指定するから。
- 連続する資料型中間が抜いちゃ駄目(O(n))
- type[] arrayName = new type[length] -> `int[] arr = new int[10]`
- type arrayName[] = new type[length] -> `int arr[] = new int[10]`
- 配列の初期化 宣言と同時に初期化できる。 → 配列を初期化するときは配列の長さを明示しない。
- `int[] studentIds = new int[] {101, 102, 103}`
- 初期化しなかった場合 int 0, double 0.0, オブジェクト配列は nullになる。
  ### 配列複製
  - 既存の配列と同じ配列を作ったり配列がいっぱいになった場合もっと大きい配列を作りため使われる。
  - `System.arraycopy(src,srcPos,dest,destPos,length);`
    - `src` 複製する配列の名前
    - `srcPos` 複製する配列の初めの位置
    - `dest`  複製して入れる対象の配列名前
    - `destPos` 複製して入れる対象配列の初めの位置
    - `length` srcからdestに資料を複製する要素の個数
  ### オブジェクト配列
  - 参照資料型を宣言するオブジェクト配列
  - 配列だけ生成した場合要素はnullで初期化される。-> 各インスタンスは生成されてなくてmemory addressだけ確保した段階
  - 各要素をnewを活用して生成して保存しなければならない。
    #### オブジェクト型配列の複製
    - 浅い複製：配列要素のアドレスだけが複製されるので配列の要素が変更されると複製された配列の値も変更される。
    - オブジェクト型配列の深い複製

  ### 多次元配列
  - 2次元以上の配列
  - 地図、ゲーム、等平面や空間を実装するのに多く使われる
  - 行を基準で回る
  - 多次元配列の長さは行を基準で決められる
  - `arr.length` : 行を基準としたこの配列の長さ
  - `arr[0].length` : 0行の列の長さ

  ### ArrayListクラス
  - Listクラスが上位クラス
  - 既存の配列は長さを決めて宣言してから使うので足りない場合他の配列に複製したり面倒になる
  - ArrayListクラスはJavaから提供されるオブジェクト配列が実装されたクラスである
  - 色んなメソッドと属性を使用しオブジェクト型配列を便利に管理できる
  - ArrayListではindex演算子を提供しない
  - よく使われているArrayListのメソッド
    - `add(Type name) : boolean` : 要素一個を配列に追加
    - `size() : int` : 要素の全体個数を返す
    - `get(int index)` : 配列のindexの位置にある要素の値を返す
    - `remove(int index)` : 配列のindexの位置にある要素の値を消してその値を返す
    - `isEmpty()` : 配列の空きを確認する
    - `forEach()`
    - ....

## 継承と多形成

- ### 継承(inheritance:상속)
  - 継承とはクラスを定義する時既に具現されているクラスを継承して属性や機能が拡張されるクラスを具現する。
  - 継承するクラス：上位クラス,parent class, base class, super class
  - 継承されるクラス：下位クラス, child class, derived class, subclass
  - `class B extends A {}`
  - 上位クラスは下位クラスより一般的な意味を持つ(general)
  - 下位クラスは上位クラスより具体的な意味を持つ(specific)
  - extendsの後ろには単一のクラスだけ使用できる
  - Javaはsingle inheritanceだけを支援する。
  - is - a
    - 一般ー具体、一般的な継承の関係。
  - has - a
    - 単純に他のクラスを持ってきて使う事。
  - private < default < protected < public
  - 接近制御子protectedは継承関係ならクラスが違っても使える
  - 下位クラスが生成されるとき上位クラスが先に生成される。`super()`
  - `super()` 自分のすぐ上の上位クラスを指す
  - 継承している上位クラスが先に生成されるので上位クラスのメンバー変数がメモリ上に存在する→だから下位クラスから使える
  - Upcasting: 上位クラス型で変数を宣言しておいて下位クラスインスタンスを生成する事が出来る。 -> `Customer customer = new VIPCustomer();`
  ### Method Overriding
  - 上位クラスで定義されたメソッドの中下位クラスと機能が合わないとか追加機能が欲しい場合同じ名前とパーらメータで下位クラスで再定義する。
  - 参照変数が参照できる内容（メソッドやフィールドなど）はその参照変数のタイプの物しか参照できない。 -> `Customer customer = new VIPCustomer();`
    ### 仮想メソッド(virtual method)
    - Javaは全てのメソッドが仮想メソッド
    - プログラムであるオブジェクトの変数やメソッドの参照はそのタイプにより成り立つ。
    - 仮想メソッドの場合タイプとは関係なく実際に生成されたインスタンスのメソッドが呼び出される。
    - overridingされているメソッドがある場合動く
    - Method領域とコード（命令語Set）領域は別に存在
    - 再定義(Overriding)されると参照するメソッドのアドレスが変わる。なので再定義されたメソッドが呼び出される。
    ### 多形成(polymorphism)
    - 一つのコードがいくつかのデータ型に具現化されて実行される事。
    - 情報隠匿、継承とともにオブジェクト指向プログラミングの１番の特徴の一つである。
    - オブジェクト指向プログラミングの柔軟性、リサイクル性、維持補修性に基本となる特徴である。
  ### 継承はいつ使うの？
  - `IS-A関係`(is a relationship : inheritance)
    - 一般的な(general)概念と具体的な(specific)概念の関係
    - 上位クラス：一般的概念クラス(Transportation)
    - 下位クラス：具体的な概念クラス(Subway, Bus, Car, Bike, Motorbike...)
    - 単純にコードの再使用する目的では使わない。
  - `HAS-A関係`(composition)
    - 一つのクラスはもう一つのクラスを所有した関係
    - `class Student{Subject majorSubject;}`
    - コード再使用の一つの方法(StudentがSubjectを含めてる関係)
  ### Down Casting(instanceof)
  - 下位クラスが上位クラスに型変換されるのは黙示的に行われる。
  - 元に資料型の下位クラスに型変換しようとすると明示的にdown castingをしなければならない。
  - この時元のインスタンスのタイプをチェックする予約語がinstanceofである。
  - instanceofでタイプをチェックせずに使うと落ちる。
  - overrideで解決できるならdown castingせずにoverrideする方がいい。

## 抽象クラス(abstract class)

- 抽象メソッドを含めるクラス
- 抽象メソッドは具体的なコードなしにメソッドの言言だけがある。
- `abstract int add(int x, int y);` 宣言だけある抽象メソッド
- `abstract`予約語使用
- 抽象クラスはインスタンス化(new)できない(`concrete class`)
- 継承するために使う
- 抽象クラスは役割の責任がある。
- 抽象クラスを継承したクラスは抽象クラスのメソッドつまり機能を具現する義務がある
  - 具現しない場合abstract classにならなければならない
  - ### hook method
    - ```
          //抽象メソッドではないhook method
          public void washCar() {
          };
        ```
    - 必要に応じて具現する。
    - 具現部はあるが具現コードがない。
  - ### Template method
    - 抽象クラスや具体化されたメソッドを活用して全体機能の流れを定義するメソッド
    - finalで宣言すると下位クラスで再定義できない。
    - フレームワークでよく使われる設計パターン
    - 抽象クラスで宣言された上位クラスにTemplate Methodを活用し全体的な流れを定義し 下位クラスで異なるように具体化すべき部分は抽象クラスで宣言し下位クラスが具体化するようにする。
    - ```
          // template method
          public final void run() {
              startCar();
              drive();
              wiper();
              washCar();
              stop();
              stopCar();
          }
        ```
  ### final
  - final変数は値が変更されない定数(constant)である:`public static final double PI = 3.14;`
  - final変数は専ら一回だけ値をassign出来る
  - final methodは下位クラスで再定義(overriding)出来ない
  - finalクラスはこの上もっと継承されない ex) javaのStringクラス

## JavaでのInterface

- 具現コードが無く全てのメソッドが抽象メソッドで成り立つメソッドの集まりクラス -> interface中の全てのメソッドが抽象メソッドに見なされる
- interfaceの中に宣言されたメソッドたちは基本`public abstract`に自動設定されている → 抽象メソッド
- interfaceの中に宣言されたメンバー変数は基本`public static final`が自動的に付く → 定数(constant)
- Type-implements(type継承)と呼ばれる (interface - implements), 具体化継承(class - extends)
- interfaceは具体化コードがないため一期に沢山implements出来る
- interfaceはspec!
- default method: 基本具体化を持っているメソッド,具体化クラスで再定義できる、
- static method: インスタンスの生成とは関係なくinterfaceタイプで使用できるメソッド(ex:`Calc.total()`)
- private method: interfaceを具体化したクラスで使用したり再定義出来ない,interface内部で機能を提供する為に具体化するメソッド。
  ### interfaceと多形成
  - interfaceは"Client code"とサービスを提供するオブジェクト間の約束である。
  - どんなオブジェクトがどんなinterfaceタイプである事はそのinterfaceが提供するメソッドを具体化させたという意味です。
  - Clientはどういう風に具体化されたのか関係なくinterfaceの定義だけを見て使用できる。(ex:JDBC)
  - 色んな具体化が必要なinterfaceを設計するに当たってとっても重要な事です
  - 継承されたinterfaceたちが一緒のdefault methodを持っている場合Override出来る
  ### interface継承
  - interface間にも継承が可能
  - 具体化コードの軽症ではないので型継承(type-inheritance)と呼ぶ

## 基本クラス

- java内装の基本的のクラス
- `java.lang` package
  - プログラミング時importしなくても自動的にimportされる。
  - import java.lang.*; 文が追加される。
  - 多く使われる基本クラスたちが属されているpackage
  - `String, Integer, System等等`
  ### Object Class
  - 全てのクラスの最上位クラス
  - `java.lang.Object`クラス
  - 全てのクラスはObjectクラスから継承される
  - 全てのクラスはObjectクラスのメソッドを使える
  - 全てのクラスはObjectクラスのメソッドの中一部は再定義(overriding)出来る(finalになっているのはダメ)
  - Compilerが自動的にextends Objectを追加する
  ### Method
  - `toString()`
    - オブジェクトの情報をStringに変えて使用する時よく使われる。
    - StringやIntegerクラスには既にOverridingされている
    - Stringは文字列を返す
    - Integerは整数値を返す
  - `equals()`
    - 二つのインスタンスの住所値を比較して`true/false`を返す
    - 再定義し二つのインスタンスが論理的に一緒なのかを判断し返す → 二つのインスタンスの値が違っても論理的に一緒なのかを判断する
  - `hashCode()`
    - hash: 情報を保存、検索する為に使用する資料構造
    - 資料の特定値(key値)に対して保存位置を返すhash関数を使う
    - hash関数はどういう情報なのかによって違ってくる
    - hashCode()メソッドはインスタンスの保存アドレスを返す
    - heapメモリにインスタンスが保存される方式がhash
    - hashCode()の返還値：JVMが保存したインスタンスのアドレス値を10進数に表す。
    - お互い違うメモリのインスタンスが一緒だと？
      - 再定義されたequals()メソッドの値がtrue
      - 同じhashCode()返還値を持つべき
    - 論理的な同一製のためequals()メソッドを再定義したらhashCode()メソッドも再定義して同一の値が帰ってくるようにする
    - `hashCode()`が既に再定義されていて本当のアドレスを見たいときは`System.identityHashCode()`を使う
  - `clone()`
    - オブジェクトの原本を複製するのに使用するメソッド
    - 原本をおいといて複製本を使う時
    - 基本枠(prototype)をおいて複雑な生成過程を繰り返さずに複製
    - cloneable interfaceをimplementsしてから使用
  ### String Class
  - Stringを宣言する二つの方法
    - `String str1 = new String("abc");` : heapメモリに生成される
    - `String str2 = "test";` : constant poo領域に生成される
  - StringClassで文字列連結
    - 一度生成されたString値(文字列)は不変(immutable)
    - 二つの文字列を連結すると新しいインスタンスが生成される
    - 文字列連結を沢山やるとメモリにgarbageが沢山できる恐れがある。-> StringBuilder, StringBufferを使用
    - `String.format("著者は%sです、本の名前は%sです", author, name);`
  - StringBuilder, StringBuffer
    - 内部的に可変的なchar[]配列を持っているクラス
    - 文字列を頻繁に繋ぐとか変更する時使うといい
    - 毎度新しく生成しずに既存の配列を変更して使うのでgarabageが出でこない
    - StringBufferはmulti threadプログラミングで同期化(synchronization)を保障する
    - 単一threadを使うプログラムではStringBufferを使うのをお勧め
    - toString()メソッドでStringに返還
  ### Class Class
  - javaの全てのクラスとinterfaceはcompile後classファイルに生成される。
  - classファイルにはオブジェクトの情報(member variable, method, constructor...)が含まれている
  - Class classはcompileされたclassファイルからオブジェクトの情報を持ってくる事ができる。
  - `dynamic loading`
    - compile時データタイプが全てbindingされて資料型がLoadingされる事(static loading)ではなくて実行中にデータタイプをしりbindingされる方式
    - プログラミング時にはどういうクラスを使用するか分からない時変数で処理しておいて実行する時その変数に代入された値のクラスが実行されるようにClassクラスから提供するstatic method
    - 実行時にLoadingされるので場合により他のクラスが使用できるので有用
    - Compile Timeにチェックできないので該当文字列に対するクラスがない場合例外処理が起こり得る(ClassNotFoundException)
    - ```
          Class pClass3 = Class.forName("classclass.Person");
              System.out.println(pClass3.getName());
        ```
  - `static loading`
  - ```
        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());
      ```
  - reflection programming
    - Classクラスを利用してクラスの情報(constructor,method,variables....)を持ってきてこれを活用してインスタンスを生成してメソッドを呼び出す等のプログラミング方式
  - ロカルメモリにオブジェクトがなくてオブジェクトのタイプを直接分からない場合、オブジェクトの情報だけを利用してプログラミングできる
  - Constructor, Method, Field等java.lang.reflectパッケージにあるクラスたちを活用してプログラミング
  - 一般的に資料型(type)をわかる時は使用しない。

## Collection FrameWork

- collection frameworkのクラスたちは全部toString()の具体化がされている
- プログラムの実装に必要な資料構造(Data Structure)を具体化しておいたライブラリ
- java.utilパッケージに具体化されている
- `Collection` - 単一オブジェクトを管理,
  - `List` 線形的資料型,順番がある,重複オッケー,配列の機能を具体化するためのinterface
  - `Set` 集合、重複要素がない-> (具体化されてない物→直接作ったクラスなど)該当のクラスに直接Overridingしなければならない,Hash構造 ex) id, 車番号..., 順番がない
- `Map` - `T-Value pair`쌍으로된 객체를 관리:対オブジェクトを管理,key重複不可
  - `HashMap`
  - `TreeMap`
  - `Properties`

### Generic Programming

- 変数の宣言やメソッドのパラメーターを一つの参照資料型ではなく色んな資料型を返せるようにプログラミングする方式
- 実際に使用される参照資料型への返還はcompilerが検証するので安定的な方式
- Collection FrameWorkでよく使われている

### 資料型パラメータ変数 T

- typeの意味でTをよく使う
- `<T>`で`<>`はダイヤモンド演算子と呼ぶ
- static keywordにはTに使えない
- genericで資料型推論(java10から)
  `ArrayList<String> list = new ArrayList<String>();`
  &darr;
  `var list = new ArrayList<String>();`
- Genericに資料型を明示しなかった場合Objectにみなす
- `T extends class` : Tが使用されるクラスを制限するために使用.

### Generic Method

- Generic Classではなくても作れる
- `public class GenericMethod{public static<T,V> double makeRectangle(Point<T,V> p1, Point<T,V> p2){}}`

### LinkedList

- blockchainからhashが抜いた感じ
- 配列の短所がない
- insert/deleteにかかるコストが少ない
- 物理的位置/論理的位置異なる

### Stack

- LIFO(Last In First Out)
- 重なる
- 一番上、後ろ -> TOP
- push(), pop()
- remove(n-1)
- 線形的
- peek() : stackから削除しない、参照のみ

### Queue

- FIFO(First In First Out)
- 前：front <- 前から取り出す deque
- 後：rear <- 後ろから入れる enque
- remove(0)

### Tree

- binary tree(２進tree)
- left child < parent
- right child > parent
- 重複だめ
- search速度log2n
- JavaはRedblack Tree
- in-order(left - 私 - right) -> ascending sort(오름차순)

### Hashing

- 平均時間複雑度 = 資料がN個の時 O(1)
- `index = hash(key)`

### Thread

- 一つのprocessは必ず一つ以上のthread持つ
-

### Iterator

- collectionの개체를巡回するinterface
- `Iterator ir = memberArrayList.iterator();`
- `boolean hashNext()`
- `E next()`

### TreeSet Class

- オブジェクトの整列に使われるクラス
- 重複を許さない、descending, ascendingできる
- 内部的には2進Binary Search Treeで具体化されている
- BSTに資料が保存される時比較して保存する位置を決める
- オブジェクトの比較の為ComparableやComparator Interfaceを作らなければならない
  ### `Comparable`interfaceと`Comparator`interface
  - 整列対象がなるクラスが作るべきinterface
  - `Comparable`はcompareTo()メソッドを使いパラメーターとオブジェクト自分(this)を比較
  - `Coparator`はcompare()メソッドを使い二つのパラメーターを比較
  - `Coparator`は使う時treesetの生成者にtypeのdefault constructorを呼び出さなければならない -> `treeSet = new TreeSet<Member>(new Member());`
  - 既に`Comparable`が使われている場合`Comparator`を利用して他の整列方式を定義できる。

### Map interface

- key-value pariのオブジェクトを管理する時に必要なメソッドが定義される
- keyの重複は不可
- 検索の為の資料構造
- keyを使い値を保存したり検索、削除する時に使うと便利
- 内部的にhash方式で作られている -> `idnex = hash(key)`
- keyになるオブジェクトはオブジェクトの唯一性を判断する為にequals()とhashCode()メソッドを再定義する。
  
  ### HashMap Class
  - Map interfaceを具体化したクラスの中一番一般的に使うクラス
  - HashTableクラスはJava2から提供されたクラスでVectorみたいに同期化を提供する
  - いろんなメソッドを使いpair資料を早くて気軽に管理できる
  ### TreeMap Class
  - keyオブジェクトを整列してkey-value pariを管理するクラス
  - keyに使用されるクラスに`Comparable`,`Comparator`interfaceを具体化
  - javaにたくさんのクラス達は既にComparableで具体化されている
  - 具体化されたクラスをkeyで使う場合具体化する必要なし

### Inner Class

- Instance inner class
  - 外部クラスメンバー変数と同一
  - 使用出来る外部クラス変数：外部インスタンス変数、外部全域変数 -> static 使用不可
  - privateのinclassを呼び出す方法
  - ```
          OutClass outClass = new OutClass();
          OutClass.InClass inClass = outClass.new InClass(); 
          inClass.inTest();
        ```
    -> 一般的にはmethodもprivateでして使う

- Static inner class
  - 外部クラスメンバー変数と同一
  - 使用出来る外部クラス変数：外部全域変数
- Local inner class
  - メソッド内部に具体化
  - 使用出来る外部クラス変数：外部インスタンス変数、外部全域変数
- Annominus inner class
  - メソッド内部に具体化,変数に代入して直接具体化
  - 使用出来る外部クラス変数：外部インスタンス変数、外部全域変数

  ### Lambda expression
  - Javaで関数型プログラミングを具体化する方式
  - Java8から導入
  - クラスを生成しずに関数の呼び出しだけで機能を実行
  - #### lambda式を作る方法
    - 匿名の関数を作る
    - パラメーターとパラメーターを活用した実行文で具体化 :`(parameter) -> {excecution;}`
    - ```
            int add(int x, int y){return x + y;}
          ```
    - ```
            (int x, int y) -> {return x + y;}
          ```
    - 関数名、return typeをなくして &rarr;を使用
    - { }までが実行文を意味
    - parameterが一つしか無い時は()を省略出来る: `str -> {System.out.println(str);}`
    - curly basket中の実行文が一つの場合省略できる: `str -> System.out.println(str);`
    - curly basket中の実行文が一つだとしてもreturn文は省略不可: `str -> {return str.length();}`
    - curly basket中の実行文がreturn文だけなら省略できる: `str -> str.length();`, `(x,y) -> x + y;`
  - #### 関数型 interface
    - lambda式を宣言する為のinterface
    - 匿名関数とparameterだけで構成されるので単一のメソッドだけ持ってる
    - interfaceに宣言する時@FunctionalInterfaceを付ける、一つだけ宣言できる

## stream

- Arrays.stream()

## exceptions

- compile error: コード作成中発生する文法的エラー
- runtime error: 実行中のプログラムが意図してない動きをしたりプログラムが止まるエラー
- errorとexception class
  - error : system error: 仮想マシンから発生、プログラマーが処理できない、動的メモリが無い場合、stack over flow等
  - 例外(exception) : プログラムで制御できるエラー
  - Throwable <--- Error | -- Exception
  - ### 例外クラスの種類
    - 全ての例外クラスの最上位クラスはException
    - いろんな例外クラスが提供される
    - Exception <---- IOException - FileNotFoundException | | | - SocketException | - RunTimeException -
      ArithmeticException | - IndexOutofBoundException .... ... .. . 等等
  - `throws` : 例外を後にする事

## JAVA Input/Output

- JAVA Input/Outputでのstreamとは
  - networkで資料の流れが水と似ているということから由来
  - 多様なIOに独立的に一貫性あるIOを提供する方式
  - Byte Stream : 動画、音楽ファイルなどを読み取る、書き出す時に使用
  - String Stream : byte単位でデータを処理すると文字が化ける2byte単位で処理するようになったstream
  - base stream : 対象に直接データを読み取る、書き出す機能のstream
  - support stream : 追加的にサポートする機能をふかえるstream, 短徳に使用不可
- Input Stream
  - 対象からデータを読み取るstram
  - `System.in.read()`
  - `Scanner` class
    - `java.util`のパッケージにあるinput class
    - 文字だけではなく整数、実数、他のデータ型も読み取れる
    - いろんな対象からデータを読み取れる
- Output Stream
  - 対象からデータを出力するstream
- ### Support Stream
  - decorater pattern
  - FilterInputStream and FilterOutputStreamが最上位クラス
  - constructorのパラメータとして他のstreamを持つ
  - InputStreamReader and OutputStreamWriter
    - byte単位で読み取ったり書き出す資料を文字に返還してくれるサポートstream
    - `InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("output.txt"))`
  - Buffered Stream
    - 内部的に8192byte配列を持って読み取ったり書き出したりの機能を提供して速度が早くなる
  - ### Serialization
    - インスタンスの状態をそのまま保存(serialization)したり復元(deserialization)する方式
    - ファイルに書き出すかNetworkを通して転送
    - `ObjectInputStream, ObjectOutputStream`
    - `transient String title;` `transient` keywordを付けるとserializationできない
    - `Serializable`interface
      - Serializationはインスタンスの内容が外部に輸出される事なのでプログラマが直接意図を表示しなければならない
      - 具体化コードがない marker interface -> `implements Serializable`
    - ```
          try (FileOutputStream fileOutputStream = new FileOutputStream("serial.dat");
                  ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);)
        ```
  - Externalizable

### ETC

- `%s` : string, `%n` : line alignment
- Runnable interface : threadを生成する時使う
                                                                                